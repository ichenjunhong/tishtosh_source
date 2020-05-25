package com.p683ss.avframework.utils;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.TTClassLoad */
public class TTClassLoad {
    static Object getClassLoader() {
        return TTClassLoad.class.getClassLoader();
    }
}
