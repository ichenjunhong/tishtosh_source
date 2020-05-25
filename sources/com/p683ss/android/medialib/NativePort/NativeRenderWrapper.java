package com.p683ss.android.medialib.NativePort;

import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.NativePort.NativeRenderWrapper */
public class NativeRenderWrapper {

    /* renamed from: a */
    public long f52969a;

    static {
        C20129b.m49687d();
    }

    private native int nativeSetDoubleFilterNew(long j, String str, String str2, float f, float f2, float f3);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetFilter2(long j, String str, String str2, float f, float f2);

    private native int nativeSetFilterNew(long j, String str, float f);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native float nativeGetFilterIntensity(long j, String str);

    public native int nativeInit(long j, int i, int i2, String str);

    public native int nativeProcessTexture(long j, int i, int i2, double d);

    /* renamed from: a */
    public final boolean mo39577a() {
        if (this.f52969a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo39574a(String str, float f) {
        if (this.f52969a != 0) {
            nativeSetFilterNew(this.f52969a, str, f);
        }
    }

    /* renamed from: a */
    public final void mo39575a(String str, String str2, float f, float f2) {
        if (this.f52969a != 0) {
            nativeSetFilter2(this.f52969a, str, str2, f, f2);
        }
    }

    /* renamed from: a */
    public final void mo39576a(String str, String str2, float f, float f2, float f3) {
        if (this.f52969a != 0) {
            nativeSetDoubleFilterNew(this.f52969a, str, str2, f, f2, f3);
        }
    }
}
