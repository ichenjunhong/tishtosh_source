package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.al */
public class C50631al {

    /* renamed from: j */
    private static volatile C50631al f126916j;

    /* renamed from: k */
    private static float[] f126917k = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: l */
    private static float[] f126918l = {-2.0f, -2.0f};

    /* renamed from: a */
    public float f126919a;

    /* renamed from: b */
    public float f126920b;

    /* renamed from: c */
    public float f126921c;

    /* renamed from: d */
    public double f126922d;

    /* renamed from: e */
    public double f126923e;

    /* renamed from: f */
    public float f126924f;

    /* renamed from: g */
    public float[] f126925g = f126917k;

    /* renamed from: h */
    public float[] f126926h = f126918l;

    /* renamed from: i */
    public boolean f126927i;

    private C50631al() {
    }

    /* renamed from: a */
    public static C50631al m109175a() {
        if (f126916j == null) {
            synchronized (C50631al.class) {
                if (f126916j == null) {
                    f126916j = new C50631al();
                }
            }
        }
        return f126916j;
    }

    /* renamed from: a */
    public final void mo98908a(float[] fArr, double d) {
        if (fArr == null || fArr.length != 4) {
            this.f126925g = f126917k;
        } else {
            this.f126925g = fArr;
        }
        this.f126923e = d;
    }

    /* renamed from: a */
    public final void mo98907a(float f, float f2, float f3, double d) {
        this.f126919a = f;
        this.f126920b = f2;
        this.f126921c = f3;
        this.f126922d = d;
    }
}
