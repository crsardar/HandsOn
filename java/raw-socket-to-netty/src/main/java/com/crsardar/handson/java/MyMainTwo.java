package com.crsardar.handson.java;

import com.silver.hdp5signals.mdcodegen.signals.HDP5Signals.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyMainTwo
{

    static int LENGTH_SIZE = 1;

    public static void main(String[] args)
    {
        Socket socket = null;
        DataInputStream input = null;

        try
        {
            socket = new Socket("10.74.34.154", 9191);
            System.out.println("Connected");
            input = new DataInputStream(socket.getInputStream());
            for (; ; )
            {
                System.out.println("---- Waiting for reading");

                readProtobuf(input);


                System.out.println("--------------- Read ---------------");

            }

        }

        catch (IOException i)
        {
            System.out.println(i);
        }

    }


    static void readProtobuf(DataInputStream input)
    {
        try
        {

            byte[] headerBuffer = new byte[LENGTH_SIZE];

            if (input.read(headerBuffer, 0, LENGTH_SIZE) == LENGTH_SIZE)
            {
                int totalBytesRead = 0;
                int streamBytesRead = 0;
                int payloadSize = byteArrayToInt(headerBuffer);
                byte[] payload = new byte[payloadSize];
                int numBytesLeft = payloadSize;

                while (totalBytesRead < payloadSize)
                {
                    streamBytesRead = input.read(payload, totalBytesRead, numBytesLeft);
                    // Detect end of stream and break the loop.
                    if (streamBytesRead == -1)
                    {
                        break;
                    }
                    totalBytesRead += streamBytesRead;
                    numBytesLeft -= streamBytesRead;
                    System.out.println(
                            "Number of bytes received:" + totalBytesRead + " Payloadsize:"
                                    + payloadSize);
                }
                if (totalBytesRead == payloadSize)
                {
                    System.out.println("Message from CE" + HDPMsg.parseFrom(payload).toString());
                }
                else
                {
                    System.out.println(
                            "Expected bytes:" + payloadSize + " Received bytes:" + totalBytesRead);
                }
            }
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }

    }

    public static int byteArrayToInt(byte[] b)
    {

        int value = 0;
        value += (b[0] & 0x0000007F);
        return value;
    }

}
