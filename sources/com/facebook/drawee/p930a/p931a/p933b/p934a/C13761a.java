package com.facebook.drawee.p930a.p931a.p933b.p934a;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.C13737b;
import com.facebook.drawee.p930a.p931a.p933b.C13769g;
import com.facebook.drawee.p930a.p931a.p933b.C13770h;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14045f;

/* renamed from: com.facebook.drawee.a.a.b.a.a */
public final class C13761a extends C13790c<C14045f> {

    /* renamed from: a */
    private final C13737b f35774a;

    /* renamed from: b */
    private final C13770h f35775b;

    /* renamed from: c */
    private final C13769g f35776c;

    /* renamed from: a */
    private void m27860a(long j) {
        this.f35775b.mo25703a(false);
        this.f35775b.f35831t = j;
        this.f35776c.mo25701b(this.f35775b, 2);
    }

    public final void onRelease(String str) {
        super.onRelease(str);
        long now = this.f35774a.now();
        int i = this.f35775b.f35828q;
        if (!(i == 3 || i == 5)) {
            this.f35775b.f35821j = now;
            this.f35775b.f35812a = str;
            this.f35776c.mo25699a(this.f35775b, 4);
        }
        m27860a(now);
    }

    public final void onFailure(String str, Throwable th) {
        long now = this.f35774a.now();
        this.f35775b.f35820i = now;
        this.f35775b.f35812a = str;
        this.f35776c.mo25699a(this.f35775b, 5);
        m27860a(now);
    }

    public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        C14045f fVar = (C14045f) obj;
        this.f35775b.f35818g = this.f35774a.now();
        this.f35775b.f35812a = str;
        this.f35775b.f35816e = fVar;
        this.f35776c.mo25699a(this.f35775b, 2);
    }

    public final void onSubmit(String str, Object obj) {
        long now = this.f35774a.now();
        this.f35775b.f35817f = now;
        this.f35775b.f35812a = str;
        this.f35775b.f35815d = obj;
        this.f35776c.mo25699a(this.f35775b, 0);
        this.f35775b.mo25703a(true);
        this.f35775b.f35830s = now;
        this.f35776c.mo25701b(this.f35775b, 1);
    }

    public C13761a(C13737b bVar, C13770h hVar, C13769g gVar) {
        this.f35774a = bVar;
        this.f35775b = hVar;
        this.f35776c = gVar;
    }

    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        C14045f fVar = (C14045f) obj;
        long now = this.f35774a.now();
        this.f35775b.f35819h = now;
        this.f35775b.f35823l = now;
        this.f35775b.f35812a = str;
        this.f35775b.f35816e = fVar;
        this.f35776c.mo25699a(this.f35775b, 3);
    }
}
