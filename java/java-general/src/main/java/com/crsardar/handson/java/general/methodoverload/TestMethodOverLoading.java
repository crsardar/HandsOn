package com.crsardar.handson.java.general.methodoverload;

public class TestMethodOverLoading {

    public void method(final SubClassOne subClassOne){

        System.out.println("in > public void method(final SubClassOne subClassOne) ");
    }

    public void method(final SubClassTwo subClassTwo){

        System.out.println("in > public void method(final SubClassTwo subClassTwo)");
    }

    public static void main(String... arg){

        SuperClass superClass = new SubClassOne();

        TestMethodOverLoading testMethodOverLoading = new TestMethodOverLoading();
        testMethodOverLoading.method(superClass);

    }
}
