package com.facebook.drawee.p937d.p938a;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.p936c.C13790c;

/* renamed from: com.facebook.drawee.d.a.a */
public final class C13795a extends C13790c {

    /* renamed from: a */
    private long f35950a = -1;

    /* renamed from: b */
    private long f35951b = -1;

    /* renamed from: c */
    private C13796b f35952c;

    public C13795a(C13796b bVar) {
        this.f35952c = bVar;
    }

    public final void onSubmit(String str, Object obj) {
        this.f35950a = System.currentTimeMillis();
    }

    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        this.f35951b = System.currentTimeMillis();
        if (this.f35952c != null) {
            this.f35952c.mo25770a(this.f35951b - this.f35950a);
        }
    }
}
