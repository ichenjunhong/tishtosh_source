package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.ao */
public final class C50634ao {

    /* renamed from: a */
    public int f126940a;

    /* renamed from: b */
    public C50635a f126941b;

    /* renamed from: c */
    public float f126942c;

    /* renamed from: d */
    public float f126943d;

    /* renamed from: e */
    public float f126944e;

    /* renamed from: f */
    public float f126945f;

    /* renamed from: com.ss.android.vesdk.ao$a */
    public enum C50635a {
        BEGAN,
        MOVED,
        STATIONARY,
        ENDED,
        CANCELED
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("pointerId: ");
        sb.append(this.f126940a);
        sb.append(", TouchEvent: ");
        sb.append(this.f126941b);
        sb.append(", x: ");
        sb.append(this.f126942c);
        sb.append(", y: ");
        sb.append(this.f126943d);
        sb.append(", force: ");
        sb.append(this.f126944e);
        sb.append(", majorRadius: ");
        sb.append(this.f126945f);
        return sb.toString();
    }
}
