package dmt.p2652av.video;

/* renamed from: dmt.av.video.ab */
public final class C52906ab implements Cloneable {

    /* renamed from: a */
    public final String f131241a;

    /* renamed from: b */
    public final long f131242b;

    /* renamed from: c */
    public final long f131243c;

    /* renamed from: d */
    public final int f131244d;

    /* renamed from: e */
    public int f131245e;

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: a */
    public static C52906ab m112590a() {
        return new C52906ab("0", 0);
    }

    /* renamed from: b */
    public static C52906ab m112593b() {
        return new C52906ab("1", 0);
    }

    /* renamed from: c */
    public final C52906ab clone() {
        try {
            return (C52906ab) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VETimeEffectOp{mType='");
        sb.append(this.f131241a);
        sb.append('\'');
        sb.append(", mStartTimePoint=");
        sb.append(this.f131242b);
        sb.append(", mEndTimePoint=");
        sb.append(this.f131243c);
        sb.append(", mIndex=");
        sb.append(this.f131245e);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52906ab)) {
            return false;
        }
        C52906ab abVar = (C52906ab) obj;
        if (this.f131241a.equals(abVar.f131241a) && this.f131242b == abVar.f131242b && this.f131243c == abVar.f131243c && this.f131245e == abVar.f131245e) {
            return true;
        }
        return false;
    }

    private C52906ab(String str, long j) {
        this.f131241a = str;
        this.f131242b = 0;
        this.f131243c = 0;
        this.f131244d = 3;
    }

    /* renamed from: a */
    public static C52906ab m112591a(long j, long j2) {
        C52906ab abVar = new C52906ab("2", j, j2);
        return abVar;
    }

    /* renamed from: b */
    public static C52906ab m112594b(long j, long j2) {
        C52906ab abVar = new C52906ab("3", j, j2);
        return abVar;
    }

    private C52906ab(String str, long j, long j2) {
        this.f131241a = str;
        this.f131242b = j;
        this.f131243c = j2;
        this.f131244d = 3;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static dmt.p2652av.video.C52906ab m112592a(java.lang.String r1, long r2, long r4) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case 48: goto L_0x0026;
                case 49: goto L_0x001c;
                case 50: goto L_0x0012;
                case 51: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0030
        L_0x0008:
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 3
            goto L_0x0031
        L_0x0012:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 2
            goto L_0x0031
        L_0x001c:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0026:
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = -1
        L_0x0031:
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0057;
                case 2: goto L_0x0052;
                case 3: goto L_0x004d;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "op key "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " is not supported, plz check again."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x004d:
            dmt.av.video.ab r1 = m112594b(r2, r4)
            return r1
        L_0x0052:
            dmt.av.video.ab r1 = m112591a(r2, r4)
            return r1
        L_0x0057:
            dmt.av.video.ab r1 = m112593b()
            return r1
        L_0x005c:
            dmt.av.video.ab r1 = m112590a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p2652av.video.C52906ab.m112592a(java.lang.String, long, long):dmt.av.video.ab");
    }
}
