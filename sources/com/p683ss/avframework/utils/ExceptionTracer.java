package com.p683ss.avframework.utils;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.ExceptionTracer */
public class ExceptionTracer extends Throwable {
    public static void onJniException(Object obj) {
        if (obj != null && (obj instanceof Throwable)) {
            AVLog.logKibana(7, "Exception", "Jni Exception", (Exception) obj);
            AVLog.ioe("Exception", "Jni Exception", (Throwable) obj);
        }
    }
}
