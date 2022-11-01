package org.idb.r52;


//trycatch
//throw throws
public class ExceptionHandlingBasic {
    public static void main(String[] args) throws Exception{
        //System.out.println(1/0);
        int arr[] = new int[2];
        try {
            throw new ClassCastException();
        } catch (Exception e) {
            System.err.println(e);
            //System.exit(0);
        }finally{
            System.out.println("finally");
        }

        System.out.println("end");
    }
}