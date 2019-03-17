package client;

import com.silver.hdp5signals.mdcodegen.signals.HDP5Signals;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler<HDP5Signals.HDPMsg> {

    @Override
    public void channelActive(final ChannelHandlerContext ctx) throws Exception {

        System.out.println("Client : channelActive() : Thread = " + Thread.currentThread().getId());

    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, HDP5Signals.HDPMsg serverResponse) throws Exception {

        System.out.println("Client : channelRead0() : Thread = " + Thread.currentThread().getId());

        System.out.println("===> Client Receives : " + serverResponse.toString());
    }
}
