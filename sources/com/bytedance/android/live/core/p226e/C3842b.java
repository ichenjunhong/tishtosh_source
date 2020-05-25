package com.bytedance.android.live.core.p226e;

/* renamed from: com.bytedance.android.live.core.e.b */
public final class C3842b {

    /* renamed from: c */
    public static final C3842b f10821c = new C3842b(C3843a.RUNNING, null);

    /* renamed from: d */
    public static final C3842b f10822d = new C3842b(C3843a.SUCCESS, null);

    /* renamed from: a */
    public C3843a f10823a;

    /* renamed from: b */
    public Throwable f10824b;

    /* renamed from: com.bytedance.android.live.core.e.b$a */
    public enum C3843a {
        RUNNING(0),
        SUCCESS(1),
        FAILED(-1);
        
        public final int mStatus;

        private C3843a(int i) {
            this.mStatus = i;
        }
    }

    /* renamed from: a */
    public final boolean mo9203a() {
        if (this.f10823a == C3843a.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo9204b() {
        if (this.f10823a == C3843a.FAILED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C3842b m9751a(Throwable th) {
        return new C3842b(C3843a.FAILED, th);
    }

    private C3842b(C3843a aVar, Throwable th) {
        this.f10823a = aVar;
        this.f10824b = th;
    }
}
