package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public final class bdg {

    /* renamed from: a */
    public static final bdg f41924a;

    /* renamed from: k */
    private static final bdg f41925k;

    /* renamed from: l */
    private static final bdg f41926l;

    /* renamed from: m */
    private static final bdg f41927m;

    /* renamed from: b */
    private final double f41928b;

    /* renamed from: c */
    private final double f41929c;

    /* renamed from: d */
    private final double f41930d;

    /* renamed from: e */
    private final double f41931e;

    /* renamed from: f */
    private final double f41932f;

    /* renamed from: g */
    private final double f41933g;

    /* renamed from: h */
    private final double f41934h;

    /* renamed from: i */
    private final double f41935i;

    /* renamed from: j */
    private final double f41936j;

    bdg(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f41928b = d5;
        this.f41929c = d6;
        this.f41930d = d7;
        this.f41931e = d;
        this.f41932f = d2;
        this.f41933g = d3;
        this.f41934h = d4;
        this.f41935i = d8;
        this.f41936j = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bdg bdg = (bdg) obj;
        return Double.compare(bdg.f41931e, this.f41931e) == 0 && Double.compare(bdg.f41932f, this.f41932f) == 0 && Double.compare(bdg.f41933g, this.f41933g) == 0 && Double.compare(bdg.f41934h, this.f41934h) == 0 && Double.compare(bdg.f41935i, this.f41935i) == 0 && Double.compare(bdg.f41936j, this.f41936j) == 0 && Double.compare(bdg.f41928b, this.f41928b) == 0 && Double.compare(bdg.f41929c, this.f41929c) == 0 && Double.compare(bdg.f41930d, this.f41930d) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41928b);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41929c);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41930d);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f41931e);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.f41932f);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41933g);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41934h);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.f41935i);
        int i8 = (i7 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41936j);
        return (i8 * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f41924a)) {
            return "Rotate 0°";
        }
        if (equals(f41925k)) {
            return "Rotate 90°";
        }
        if (equals(f41926l)) {
            return "Rotate 180°";
        }
        if (equals(f41927m)) {
            return "Rotate 270°";
        }
        double d = this.f41928b;
        double d2 = this.f41929c;
        double d3 = this.f41930d;
        double d4 = this.f41931e;
        double d5 = this.f41932f;
        double d6 = this.f41933g;
        double d7 = this.f41934h;
        double d8 = this.f41935i;
        double d9 = this.f41936j;
        double d10 = d7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d10);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    static {
        bdg bdg = new bdg(1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        f41924a = bdg;
        bdg bdg2 = new bdg(ProfileUiInitOptimizeEnterThreshold.DEFAULT, 1.0d, -1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        f41925k = bdg2;
        bdg bdg3 = new bdg(-1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, -1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        f41926l = bdg3;
        bdg bdg4 = new bdg(ProfileUiInitOptimizeEnterThreshold.DEFAULT, -1.0d, 1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, 1.0d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        f41927m = bdg4;
    }
}
