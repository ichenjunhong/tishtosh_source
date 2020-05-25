package com.tencent.wcdb.database;

public class ChunkedCursorWindow extends C51756c {

    /* renamed from: a */
    long f129009a;

    private static native void nativeClear(long j);

    private static native long nativeCreate(int i);

    private static native void nativeDispose(long j);

    private static native void nativeEndRow(long j, long j2);

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native int nativeGetNumChunks(long j);

    private static native long nativeGetRow(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native long nativeRemoveChunk(long j, int i);

    private static native boolean nativeSetNumColumns(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo107088c() {
        m110892a();
    }

    /* renamed from: a */
    private void m110892a() {
        if (this.f129009a != 0) {
            nativeDispose(this.f129009a);
            this.f129009a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m110892a();
        } finally {
            super.finalize();
        }
    }
}
