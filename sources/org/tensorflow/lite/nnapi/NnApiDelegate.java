package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.C53805b;

public class NnApiDelegate implements AutoCloseable, C53805b {

    /* renamed from: a */
    private long f133440a = createDelegate();

    private static native long createDelegate();

    /* renamed from: a */
    public final long mo113439a() {
        return this.f133440a;
    }

    public void close() {
        if (this.f133440a != 0) {
            this.f133440a = 0;
        }
    }
}
