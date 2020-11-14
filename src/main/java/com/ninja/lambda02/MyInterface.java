package com.ninja.lambda02;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public interface MyInterface {

    public void printIt(String string);

    default public void printUtf8To(String string, OutputStream outputStream) {
        try {
            outputStream.write(string.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException("Error writing String as UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printItToSystemOut(String string) {
        System.out.println(string);
    }
}
