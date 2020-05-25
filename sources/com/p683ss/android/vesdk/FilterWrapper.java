package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.FilterWrapper */
public class FilterWrapper {

    /* renamed from: a */
    public boolean f126645a;

    /* renamed from: b */
    public Long f126646b = new Long(0);

    /* renamed from: c */
    public int f126647c = 1;

    /* renamed from: d */
    private long f126648d;

    /* renamed from: e */
    private boolean f126649e;

    private native int nativeComposerSetNodes(long j, String[] strArr, int i);

    private native int nativeComposerUpdateNode(long j, String str, String str2, float f);

    private native void nativeConfigEffect(long j, int i, int i2, String str, String str2, boolean z);

    private native long nativeFilterCreate();

    private native int nativeFilterProcess(long j, int i, int i2, int i3, int i4, long j2, Long l, boolean z, int i5);

    private native void nativeFilterRelease(long j);

    public static native String nativeGetVersion();

    private native String nativeName(long j);

    private native int nativeSetBeautify(long j, String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(long j, String str, float f, float f2, float f3);

    private native void nativeSetEffect(long j, String str, float f);

    private native void nativeSetFaceAttribute(long j, boolean z);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetFilter(long j, String str, String str2, float f);

    private native int nativeSetParameter(long j, String str, Object obj);

    private native int nativeSetReshape(long j, String str, float f, float f2);

    public FilterWrapper() {
        if (m108859a()) {
            this.f126648d = nativeFilterCreate();
        }
        this.f126649e = true;
    }

    /* renamed from: a */
    private boolean m108859a() {
        try {
            this.f126645a = "com.bytedance:effectsdk:6.7.0_rel_13_MT_202005061117_907c653ac2".contains(nativeGetVersion());
        } catch (Throwable unused) {
            this.f126645a = false;
        }
        return this.f126645a;
    }
}
