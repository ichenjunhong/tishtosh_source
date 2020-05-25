package com.p683ss.android.vesdk;

import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.an */
public final class C50633an {

    /* renamed from: a */
    public String[] f126928a;

    /* renamed from: b */
    public int[] f126929b;

    /* renamed from: c */
    public String[] f126930c = null;

    /* renamed from: d */
    public String[] f126931d = null;

    /* renamed from: e */
    public int[] f126932e;

    /* renamed from: f */
    public int[] f126933f;

    /* renamed from: g */
    public int[] f126934g;

    /* renamed from: h */
    public int[] f126935h;

    /* renamed from: i */
    public double[] f126936i;

    /* renamed from: j */
    public boolean[] f126937j;

    /* renamed from: k */
    public C50657c[] f126938k;

    /* renamed from: l */
    private int[] f126939l;

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            if (this.f126928a == null) {
                i = 0;
            } else {
                i = this.f126928a.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f126929b != null && this.f126929b.length > i2) {
                    sb.append(" videoFileIndex: ");
                    sb.append(this.f126929b[i2]);
                }
                if (this.f126928a != null && this.f126928a.length > i2) {
                    sb.append(" videoFilePath: ");
                    sb.append(this.f126928a[i2]);
                }
                if (this.f126932e != null && this.f126932e.length > i2) {
                    sb.append(" vTrimIn: ");
                    sb.append(this.f126932e[i2]);
                }
                if (this.f126933f != null && this.f126933f.length > i2) {
                    sb.append(" vTrimOut: ");
                    sb.append(this.f126933f[i2]);
                }
                if (this.f126934g != null && this.f126934g.length > i2) {
                    sb.append(" aTrimIn: ");
                    sb.append(this.f126934g[i2]);
                }
                if (this.f126935h != null && this.f126935h.length > i2) {
                    sb.append(" aTrimOut: ");
                    sb.append(this.f126935h[i2]);
                }
                if (this.f126936i != null && this.f126936i.length > i2) {
                    sb.append(" speed: ");
                    sb.append(this.f126936i[i2]);
                }
                if (this.f126937j != null && this.f126937j.length > i2) {
                    sb.append(" enable: ");
                    sb.append(this.f126937j[i2]);
                }
                if (this.f126938k != null && this.f126938k.length > i2) {
                    sb.append(" rotate: ");
                    sb.append(this.f126938k[i2]);
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    public C50633an(String[] strArr) {
        int length = strArr.length;
        this.f126928a = (String[]) strArr.clone();
        this.f126932e = new int[length];
        Arrays.fill(this.f126932e, 0);
        this.f126933f = new int[length];
        Arrays.fill(this.f126933f, -1);
        this.f126934g = new int[length];
        Arrays.fill(this.f126934g, 0);
        this.f126935h = new int[length];
        Arrays.fill(this.f126935h, -1);
        this.f126936i = new double[length];
        Arrays.fill(this.f126936i, 1.0d);
        this.f126929b = new int[length];
        this.f126939l = new int[length];
        this.f126937j = new boolean[length];
        Arrays.fill(this.f126937j, true);
        this.f126938k = new C50657c[length];
        Arrays.fill(this.f126938k, C50657c.ROTATE_NONE);
        for (int i = 0; i < length; i++) {
            this.f126929b[i] = i;
            this.f126939l[i] = i;
        }
    }
}
