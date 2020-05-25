package com.facebook.imagepipeline.p970j;

import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.p956a.p957a.C13913g;

/* renamed from: com.facebook.imagepipeline.j.a */
public final class C14040a extends C14042c {

    /* renamed from: a */
    public final C13950b f36693a;

    /* renamed from: b */
    private C13913g f36694b;

    /* renamed from: c */
    public final boolean mo26252c() {
        return true;
    }

    /* renamed from: d */
    public final synchronized C13913g mo26254d() {
        return this.f36694b;
    }

    /* renamed from: a */
    public final synchronized boolean mo26250a() {
        boolean z;
        if (this.f36694b == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized int mo26251b() {
        if (mo26250a()) {
            return 0;
        }
        return this.f36694b.f36300a.getSizeInBytes();
    }

    public final void close() {
        synchronized (this) {
            if (this.f36694b != null) {
                C13913g gVar = this.f36694b;
                this.f36694b = null;
                gVar.mo26085b();
            }
        }
    }

    public final synchronized int getHeight() {
        if (mo26250a()) {
            return 0;
        }
        return this.f36694b.f36300a.getHeight();
    }

    public final synchronized int getWidth() {
        if (mo26250a()) {
            return 0;
        }
        return this.f36694b.f36300a.getWidth();
    }

    public C14040a(C13913g gVar, C13950b bVar) {
        this.f36694b = gVar;
        this.f36693a = bVar;
    }
}
