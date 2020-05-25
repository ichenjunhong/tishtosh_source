package org.tensorflow.lite;

import java.io.PrintStream;

public final class TensorFlowLite {
    static {
        m114461a();
    }

    private TensorFlowLite() {
    }

    static native void initTensorFlow();

    public static native String runtimeVersion();

    public static native String schemaVersion();

    /* renamed from: a */
    static boolean m114461a() {
        try {
            C53808d.m114467a("tensorflowlite_jni");
            return true;
        } catch (UnsatisfiedLinkError e) {
            try {
                C53808d.m114467a("tensorflowlite_flex_jni");
                return true;
            } catch (UnsatisfiedLinkError unused) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("TensorFlowLite: failed to load native library: ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
                return false;
            }
        }
    }
}
