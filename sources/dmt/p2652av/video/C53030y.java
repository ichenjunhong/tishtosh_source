package dmt.p2652av.video;

/* renamed from: dmt.av.video.y */
public final class C53030y {

    /* renamed from: a */
    public final int f131507a;

    /* renamed from: b */
    public final long f131508b;

    /* renamed from: a */
    public static C53030y m112772a() {
        return new C53030y(0);
    }

    /* renamed from: b */
    public static C53030y m112774b() {
        return new C53030y(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEPreviewControlOp{mType=");
        sb.append(this.f131507a);
        sb.append(", mSeekTo=");
        sb.append(this.f131508b);
        sb.append('}');
        return sb.toString();
    }

    private C53030y(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    public static C53030y m112773a(long j) {
        return new C53030y(2, j);
    }

    /* renamed from: b */
    public static C53030y m112775b(long j) {
        return new C53030y(3, j);
    }

    private C53030y(int i, long j) {
        this.f131507a = i;
        this.f131508b = j;
    }
}
