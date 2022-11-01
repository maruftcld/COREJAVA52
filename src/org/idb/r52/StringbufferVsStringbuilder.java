package org.idb.r52;

public class StringbufferVsStringbuilder {

    public static void main(String[] args) {

        long sStartTime = System.currentTimeMillis();
        String s = new String("hello");
        for (int i = 0; i < 1000000; i++) {
            s.concat("world");
        }
        long sEndTime = System.currentTimeMillis();
        System.out.println("String : " + (sEndTime-sStartTime));
        
        long bufferStartTime = System.currentTimeMillis();
        StringBuffer sbuffer = new StringBuffer("hello");
        for (int i = 0; i < 1000000; i++) {
            sbuffer.append("world");
        }
        long bufferEndTime = System.currentTimeMillis();
        System.out.println("StringBuffer : " + (bufferEndTime-bufferStartTime));
        
        long builderStartTime = System.currentTimeMillis();
        StringBuilder sbuild = new StringBuilder("hello");
         for (int i = 0; i < 1000000; i++) {
            sbuild.append("world");
        }
        long builderEndTime = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (builderEndTime-builderStartTime));

    }
}