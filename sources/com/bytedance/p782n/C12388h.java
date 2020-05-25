package com.bytedance.p782n;

import com.bytedance.p782n.p784b.C12379a;

/* renamed from: com.bytedance.n.h */
public final class C12388h {

    /* renamed from: a */
    public Class<? extends C12382d> f32626a;

    /* renamed from: b */
    public C12379a f32627b;

    /* renamed from: c */
    public Object[] f32628c;

    /* renamed from: com.bytedance.n.h$a */
    public static final class C12390a {

        /* renamed from: a */
        public Class<? extends C12382d> f32629a;

        /* renamed from: b */
        public C12379a f32630b;

        /* renamed from: c */
        public Object[] f32631c;

        private C12390a() {
        }

        /* renamed from: a */
        public static C12390a m24949a() {
            return new C12390a();
        }

        /* renamed from: b */
        public final C12388h mo23402b() {
            return new C12388h(this);
        }

        /* renamed from: a */
        public final C12390a mo23399a(C12379a aVar) {
            this.f32630b = aVar;
            return this;
        }

        /* renamed from: a */
        public final C12390a mo23400a(Class<? extends C12382d> cls) {
            if (cls != null) {
                this.f32629a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        /* renamed from: a */
        public final C12390a mo23401a(Object... objArr) {
            this.f32631c = objArr;
            return this;
        }
    }

    private C12388h(C12390a aVar) {
        this.f32626a = aVar.f32629a;
        this.f32627b = aVar.f32630b;
        this.f32628c = aVar.f32631c;
        if (this.f32626a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
