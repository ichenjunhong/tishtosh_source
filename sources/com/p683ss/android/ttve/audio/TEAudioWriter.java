package com.p683ss.android.ttve.audio;

/* renamed from: com.ss.android.ttve.audio.TEAudioWriter */
public class TEAudioWriter implements C20068a {

    /* renamed from: a */
    long f55154a = nativeCreate();

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d);

    /* renamed from: b */
    public final void mo42142b() {
        if (this.f55154a != 0) {
            nativeDestroy(this.f55154a);
        }
    }

    /* renamed from: a */
    public final int mo42139a() {
        if (this.f55154a == 0) {
            return -112;
        }
        return nativeCloseWavFile(this.f55154a);
    }

    /* renamed from: a */
    public final int mo42141a(byte[] bArr, int i) {
        if (this.f55154a == 0) {
            return -112;
        }
        return nativeAddPCMData(this.f55154a, bArr, i);
    }

    /* renamed from: a */
    public final int mo42140a(String str, int i, int i2, double d, int i3, int i4) {
        if (this.f55154a == 0) {
            return -112;
        }
        return nativeInitWavFile(this.f55154a, str, i, 2, d);
    }
}
