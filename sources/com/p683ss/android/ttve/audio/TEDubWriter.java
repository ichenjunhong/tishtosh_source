package com.p683ss.android.ttve.audio;

/* renamed from: com.ss.android.ttve.audio.TEDubWriter */
public class TEDubWriter implements C20068a {

    /* renamed from: a */
    long f55155a = nativeCreate();

    /* renamed from: b */
    public long f55156b;

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);

    /* renamed from: b */
    public final void mo42142b() {
        if (this.f55155a != 0) {
            nativeDestroy(this.f55155a);
        }
    }

    /* renamed from: a */
    public final int mo42139a() {
        if (this.f55155a == 0) {
            return -112;
        }
        return nativeCloseWavFile(this.f55155a);
    }

    /* renamed from: a */
    public final int mo42141a(byte[] bArr, int i) {
        if (this.f55155a == 0) {
            return -112;
        }
        int nativeAddPCMData = nativeAddPCMData(this.f55155a, bArr, i);
        this.f55156b = nativeGetCurrentTime(this.f55155a);
        return nativeAddPCMData;
    }

    /* renamed from: a */
    public final int mo42140a(String str, int i, int i2, double d, int i3, int i4) {
        if (this.f55155a == 0) {
            return -112;
        }
        return nativeInitWavFile(this.f55155a, str, i, 2, d, i3, i4);
    }
}
