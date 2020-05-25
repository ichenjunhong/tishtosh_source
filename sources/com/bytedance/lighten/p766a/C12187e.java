package com.bytedance.lighten.p766a;

/* renamed from: com.bytedance.lighten.a.e */
public final class C12187e {

    /* renamed from: a */
    public float f32100a;

    /* renamed from: b */
    public int f32101b;

    /* renamed from: c */
    public int f32102c;

    /* renamed from: d */
    public boolean f32103d;

    /* renamed from: e */
    public float f32104e;

    /* renamed from: f */
    public float f32105f;

    /* renamed from: g */
    public C12190b f32106g;

    /* renamed from: h */
    public C12191c f32107h;

    /* renamed from: com.bytedance.lighten.a.e$a */
    public static class C12189a {

        /* renamed from: a */
        public boolean f32108a;

        /* renamed from: b */
        public float f32109b;

        /* renamed from: c */
        public int f32110c;

        /* renamed from: d */
        public int f32111d;

        /* renamed from: e */
        public float f32112e;

        /* renamed from: f */
        public float f32113f;

        /* renamed from: g */
        public C12190b f32114g;

        /* renamed from: h */
        public C12191c f32115h = C12191c.BITMAP_ONLY;

        /* renamed from: a */
        public final C12187e mo23106a() {
            return new C12187e(this);
        }

        /* renamed from: a */
        public final C12189a mo23103a(float f) {
            this.f32109b = f;
            return this;
        }

        /* renamed from: b */
        public final C12189a mo23107b(float f) {
            this.f32112e = f;
            return this;
        }

        /* renamed from: a */
        public final C12189a mo23105a(boolean z) {
            this.f32108a = true;
            return this;
        }

        /* renamed from: a */
        public final C12189a mo23104a(int i, float f) {
            this.f32110c = i;
            this.f32109b = 0.5f;
            return this;
        }
    }

    /* renamed from: com.bytedance.lighten.a.e$b */
    public static class C12190b {

        /* renamed from: a */
        public float f32116a;

        /* renamed from: b */
        public float f32117b;

        /* renamed from: c */
        public float f32118c;

        /* renamed from: d */
        public float f32119d;
    }

    /* renamed from: com.bytedance.lighten.a.e$c */
    public enum C12191c {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public static C12189a m24632a() {
        return new C12189a();
    }

    private C12187e(C12189a aVar) {
        this.f32103d = aVar.f32108a;
        this.f32100a = aVar.f32109b;
        this.f32101b = aVar.f32110c;
        this.f32102c = aVar.f32111d;
        this.f32104e = aVar.f32112e;
        this.f32105f = aVar.f32113f;
        this.f32106g = aVar.f32114g;
        this.f32107h = aVar.f32115h;
    }
}
