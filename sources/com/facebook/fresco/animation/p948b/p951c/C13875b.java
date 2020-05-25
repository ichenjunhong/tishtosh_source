package com.facebook.fresco.animation.p948b.p951c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13715a;
import com.facebook.fresco.animation.p948b.C13867b;
import com.facebook.fresco.animation.p948b.C13873c;
import com.facebook.imagepipeline.p956a.p957a.C13905a;
import com.facebook.imagepipeline.p956a.p959c.C13930d;
import com.facebook.imagepipeline.p956a.p959c.C13930d.C13932a;

/* renamed from: com.facebook.fresco.animation.b.c.b */
public class C13875b implements C13873c {

    /* renamed from: b */
    private static final Class<?> f36191b = C13875b.class;

    /* renamed from: a */
    public final C13867b f36192a;

    /* renamed from: c */
    private C13905a f36193c;

    /* renamed from: d */
    private C13930d f36194d;

    /* renamed from: e */
    private final C13932a f36195e = new C13932a() {
        /* renamed from: a */
        public final C13715a<Bitmap> mo26023a(int i) {
            return C13875b.this.f36192a.mo26010a(i);
        }
    };

    /* renamed from: a */
    public final int mo26019a() {
        return this.f36193c.mo26078c();
    }

    /* renamed from: b */
    public final int mo26022b() {
        return this.f36193c.mo26079d();
    }

    /* renamed from: a */
    public final void mo26020a(Rect rect) {
        C13905a a = this.f36193c.mo26073a(rect);
        if (a != this.f36193c) {
            this.f36193c = a;
            this.f36194d = new C13930d(this.f36193c, this.f36195e);
        }
    }

    public C13875b(C13867b bVar, C13905a aVar) {
        this.f36192a = bVar;
        this.f36193c = aVar;
        this.f36194d = new C13930d(this.f36193c, this.f36195e);
    }

    /* renamed from: a */
    public final boolean mo26021a(int i, Bitmap bitmap) {
        try {
            this.f36194d.mo26099a(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C13697a.m27688b(f36191b, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }
}
