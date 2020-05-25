package com.tencent.wcdb.repair;

import com.tencent.wcdb.support.C51787a.C51788a;

public class RecoverKit implements C51788a {

    /* renamed from: a */
    private long f129177a;

    private static native void nativeCancel(long j);

    private static native int nativeFailureCount(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, boolean z);

    private static native int nativeSuccessCount(long j);

    /* renamed from: b */
    public final void mo107159b() {
        if (this.f129177a != 0) {
            nativeCancel(this.f129177a);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.f129177a != 0) {
            nativeFinish(this.f129177a);
            this.f129177a = 0;
        }
        super.finalize();
    }
}
