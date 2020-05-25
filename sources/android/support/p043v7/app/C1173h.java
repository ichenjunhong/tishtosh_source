package android.support.p043v7.app;

/* renamed from: android.support.v7.app.h */
final class C1173h {

    /* renamed from: d */
    private static C1173h f3828d;

    /* renamed from: a */
    public long f3829a;

    /* renamed from: b */
    public long f3830b;

    /* renamed from: c */
    public int f3831c;

    C1173h() {
    }

    /* renamed from: a */
    static C1173h m3515a() {
        if (f3828d == null) {
            f3828d = new C1173h();
        }
        return f3828d;
    }

    /* renamed from: a */
    public final void mo3788a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = sin + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - 9.0E-4f);
        Double.isNaN(d5);
        double round = (double) (((float) Math.round(d5 - d4)) + 9.0E-4f);
        Double.isNaN(round);
        double sin3 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin2) * -0.0069d);
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f3831c = 1;
            this.f3829a = -1;
            this.f3830b = -1;
        } else if (sin4 <= -1.0d) {
            this.f3831c = 0;
            this.f3829a = -1;
            this.f3830b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin4) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f3829a = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            this.f3830b = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
            if (this.f3830b >= j || this.f3829a <= j) {
                this.f3831c = 1;
            } else {
                this.f3831c = 0;
            }
        }
    }
}
