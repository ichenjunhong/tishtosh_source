package com.facebook.drawee.p941g;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: com.facebook.drawee.g.a */
public final class C13840a {

    /* renamed from: a */
    public C13841a f36118a;

    /* renamed from: b */
    public final float f36119b;

    /* renamed from: c */
    public boolean f36120c;

    /* renamed from: d */
    public boolean f36121d;

    /* renamed from: e */
    public long f36122e;

    /* renamed from: f */
    public float f36123f;

    /* renamed from: g */
    public float f36124g;

    /* renamed from: com.facebook.drawee.g.a$a */
    public interface C13841a {
        /* renamed from: h */
        boolean mo25748h();
    }

    /* renamed from: a */
    public final void mo25943a() {
        this.f36118a = null;
        mo25944b();
    }

    /* renamed from: b */
    public final void mo25944b() {
        this.f36120c = false;
        this.f36121d = false;
    }

    public C13840a(Context context) {
        this.f36119b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo25943a();
    }
}
