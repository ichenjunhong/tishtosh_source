package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;

/* renamed from: com.facebook.imagepipeline.n.j */
public final class C14185j implements C14139am<C14044e> {

    /* renamed from: a */
    public final C14139am<C14044e> f37027a;

    /* renamed from: b */
    private final C14139am<C14044e> f37028b;

    /* renamed from: com.facebook.imagepipeline.n.j$a */
    class C14187a extends C14196n<C14044e, C14044e> {

        /* renamed from: b */
        private C14140an f37030b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26242a(Throwable th) {
            C14185j.this.f37027a.mo26346a(this.f37059e, this.f37030b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            C14229b a = this.f37030b.mo26384a();
            boolean a2 = m29025a(i);
            boolean a3 = C14172bc.m29045a(eVar, a.mResizeOptions);
            if (eVar != null && (a3 || a.mLocalThumbnailPreviewsEnabled)) {
                if (!a2 || !a3) {
                    this.f37059e.mo26404b(eVar, i & -2);
                } else {
                    this.f37059e.mo26404b(eVar, i);
                }
            }
            if (a2 && !a3) {
                C14044e.m28705d(eVar);
                C14185j.this.f37027a.mo26346a(this.f37059e, this.f37030b);
            }
        }

        private C14187a(C14188k<C14044e> kVar, C14140an anVar) {
            super(kVar);
            this.f37030b = anVar;
        }
    }

    public C14185j(C14139am<C14044e> amVar, C14139am<C14044e> amVar2) {
        this.f37028b = amVar;
        this.f37027a = amVar2;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        this.f37028b.mo26346a(new C14187a(kVar, anVar), anVar);
    }
}
