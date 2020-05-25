package com.p683ss.android.ugc.aweme.photomovie.edit;

import com.p683ss.android.ugc.aweme.p1484bx.C24455e;
import com.p683ss.android.ugc.aweme.p1484bx.C24457g;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.c */
public final class C38753c implements C38752b {

    /* renamed from: a */
    private boolean f98584a;

    /* renamed from: b */
    private C24455e f98585b;

    /* renamed from: c */
    private C38748a f98586c;

    /* renamed from: a */
    public final boolean mo78707a() {
        return this.f98584a;
    }

    /* renamed from: a */
    public final void mo78706a(C24457g gVar) {
        if (this.f98586c.mo78655a()) {
            this.f98584a = true;
            gVar.mo50232a().mo50219a(this.f98585b.mo50231b());
        }
    }

    /* renamed from: b */
    public final void mo78708b(C24457g gVar) {
        this.f98584a = false;
        gVar.mo50232a().mo50223b(this.f98585b.mo50231b());
    }

    public C38753c(C24455e eVar, C38748a aVar) {
        this.f98585b = eVar;
        this.f98586c = aVar;
    }
}
