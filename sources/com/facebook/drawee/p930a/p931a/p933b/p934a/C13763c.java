package com.facebook.drawee.p930a.p931a.p933b.p934a;

import com.facebook.common.time.C13737b;
import com.facebook.drawee.p930a.p931a.p933b.C13770h;
import com.facebook.imagepipeline.p971k.C14048a;
import com.facebook.imagepipeline.p975o.C14229b;

/* renamed from: com.facebook.drawee.a.a.b.a.c */
public final class C13763c extends C14048a {

    /* renamed from: a */
    private final C13737b f35779a;

    /* renamed from: b */
    private final C13770h f35780b;

    public final void onRequestCancellation(String str) {
        this.f35780b.f35823l = this.f35779a.now();
        this.f35780b.f35813b = str;
    }

    public C13763c(C13737b bVar, C13770h hVar) {
        this.f35779a = bVar;
        this.f35780b = hVar;
    }

    public final void onRequestSuccess(C14229b bVar, String str, boolean z) {
        this.f35780b.f35823l = this.f35779a.now();
        this.f35780b.f35814c = bVar;
        this.f35780b.f35813b = str;
        this.f35780b.f35825n = z;
    }

    public final void onRequestFailure(C14229b bVar, String str, Throwable th, boolean z) {
        this.f35780b.f35823l = this.f35779a.now();
        this.f35780b.f35814c = bVar;
        this.f35780b.f35813b = str;
        this.f35780b.f35825n = z;
    }

    public final void onRequestStart(C14229b bVar, Object obj, String str, boolean z) {
        this.f35780b.f35822k = this.f35779a.now();
        this.f35780b.f35814c = bVar;
        this.f35780b.f35815d = obj;
        this.f35780b.f35813b = str;
        this.f35780b.f35825n = z;
    }
}
