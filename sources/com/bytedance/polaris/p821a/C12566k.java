package com.bytedance.polaris.p821a;

import android.app.Application;

/* renamed from: com.bytedance.polaris.a.k */
public final class C12566k {

    /* renamed from: a */
    public final C12557c f32953a;

    /* renamed from: b */
    public final C12561g f32954b;

    /* renamed from: c */
    public final C12560f f32955c;

    /* renamed from: d */
    public final C12559e f32956d;

    /* renamed from: e */
    public final Application f32957e;

    /* renamed from: f */
    public final C12569l f32958f;

    /* renamed from: g */
    public final boolean f32959g;

    /* renamed from: com.bytedance.polaris.a.k$a */
    public static class C12568a {

        /* renamed from: a */
        public Application f32960a;

        /* renamed from: b */
        public C12559e f32961b;

        /* renamed from: c */
        public C12557c f32962c;

        /* renamed from: d */
        public C12561g f32963d;

        /* renamed from: e */
        public C12560f f32964e;

        /* renamed from: f */
        public C12569l f32965f;

        /* renamed from: g */
        public boolean f32966g;

        public C12568a(Application application) {
            this.f32960a = application;
        }
    }

    /* renamed from: a */
    public static void m25234a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("can not be null");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private C12566k(Application application, C12559e eVar, C12557c cVar, C12561g gVar, C12560f fVar, boolean z, C12569l lVar) {
        this.f32957e = application;
        this.f32956d = eVar;
        this.f32953a = cVar;
        this.f32954b = gVar;
        this.f32955c = fVar;
        this.f32959g = z;
        this.f32958f = lVar;
    }
}
