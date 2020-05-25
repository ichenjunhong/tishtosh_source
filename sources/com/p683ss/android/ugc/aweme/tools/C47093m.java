package com.p683ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.m */
public final class C47093m {

    /* renamed from: a */
    public boolean f118902a;

    /* renamed from: b */
    public boolean f118903b = true;

    /* renamed from: a */
    public static C47093m m102238a() {
        return new C47093m(true);
    }

    /* renamed from: b */
    public static C47093m m102239b() {
        return new C47093m(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrontRearChangeEvent{toFront=");
        sb.append(this.f118902a);
        sb.append('}');
        return sb.toString();
    }

    private C47093m(boolean z) {
        this.f118902a = z;
    }
}
