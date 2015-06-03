package com.example.administrator.jnitest.ndk;

/**
 * Created by Administrator on 2015/5/29 0029.
 */
public class NDKTest {
    static {
        System.loadLibrary("hello-jni");
    }
    public native String getStringFromNative();
}

