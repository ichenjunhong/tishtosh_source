package dmt.p2652av.video;

/* renamed from: dmt.av.video.x */
public final class C53029x {

    /* renamed from: a */
    public int f131505a;

    /* renamed from: b */
    public int f131506b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEMusicStartChangeOp{mStartMillis=");
        sb.append(this.f131505a);
        sb.append(", mDuration=");
        sb.append(this.f131506b);
        sb.append('}');
        return sb.toString();
    }

    private C53029x(int i, int i2) {
        this.f131505a = i;
        this.f131506b = i2;
    }

    /* renamed from: a */
    public static C53029x m112771a(int i, int i2) {
        return new C53029x(i, i2);
    }
}
