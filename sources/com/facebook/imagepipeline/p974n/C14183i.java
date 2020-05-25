package com.facebook.imagepipeline.p974n;

import android.graphics.Bitmap;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;

/* renamed from: com.facebook.imagepipeline.n.i */
public final class C14183i implements C14139am<C13715a<C14042c>> {

    /* renamed from: a */
    private final C14139am<C13715a<C14042c>> f37021a;

    /* renamed from: b */
    private final int f37022b;

    /* renamed from: c */
    private final int f37023c;

    /* renamed from: d */
    private final boolean f37024d;

    /* renamed from: com.facebook.imagepipeline.n.i$a */
    static class C14184a extends C14196n<C13715a<C14042c>, C13715a<C14042c>> {

        /* renamed from: a */
        private final int f37025a;

        /* renamed from: b */
        private final int f37026b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C13715a aVar = (C13715a) obj;
            if (aVar != null && aVar.mo25635d()) {
                C14042c cVar = (C14042c) aVar.mo25630a();
                if (cVar != null && !cVar.mo26250a() && (cVar instanceof C14043d)) {
                    Bitmap d = ((C14043d) cVar).mo26257d();
                    if (d != null) {
                        int rowBytes = d.getRowBytes() * d.getHeight();
                        if (rowBytes >= this.f37025a && rowBytes <= this.f37026b) {
                            d.prepareToDraw();
                        }
                    }
                }
            }
            this.f37059e.mo26404b(aVar, i);
        }

        C14184a(C14188k<C13715a<C14042c>> kVar, int i, int i2) {
            super(kVar);
            this.f37025a = i;
            this.f37026b = i2;
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C13715a<C14042c>> kVar, C14140an anVar) {
        if (!anVar.mo26390f() || this.f37024d) {
            this.f37021a.mo26346a(new C14184a(kVar, this.f37022b, this.f37023c), anVar);
        } else {
            this.f37021a.mo26346a(kVar, anVar);
        }
    }

    public C14183i(C14139am<C13715a<C14042c>> amVar, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27655a(z2);
        this.f37021a = (C14139am) C13689i.m27652a(amVar);
        this.f37022b = i;
        this.f37023c = i2;
        this.f37024d = z;
    }
}
