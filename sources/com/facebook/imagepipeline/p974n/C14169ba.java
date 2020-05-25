package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14044e;

/* renamed from: com.facebook.imagepipeline.n.ba */
public final class C14169ba implements C14139am<C14044e> {

    /* renamed from: a */
    private final C14171bb<C14044e>[] f36991a;

    /* renamed from: com.facebook.imagepipeline.n.ba$a */
    class C14170a extends C14196n<C14044e, C14044e> {

        /* renamed from: b */
        private final C14140an f36993b;

        /* renamed from: c */
        private final int f36994c;

        /* renamed from: d */
        private final C13952d f36995d = this.f36993b.mo26384a().mResizeOptions;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26242a(Throwable th) {
            if (!C14169ba.this.mo26406a(this.f36994c + 1, this.f37059e, this.f36993b)) {
                this.f37059e.mo26405b(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            if (eVar == null || (!m29027b(i) && !C14172bc.m29045a(eVar, this.f36995d))) {
                if (m29025a(i)) {
                    C14044e.m28705d(eVar);
                    if (!C14169ba.this.mo26406a(this.f36994c + 1, this.f37059e, this.f36993b)) {
                        this.f37059e.mo26404b(null, 1);
                    }
                }
                return;
            }
            this.f37059e.mo26404b(eVar, i);
        }

        public C14170a(C14188k<C14044e> kVar, C14140an anVar, int i) {
            super(kVar);
            this.f36993b = anVar;
            this.f36994c = i;
        }
    }

    public C14169ba(C14171bb<C14044e>... bbVarArr) {
        this.f36991a = (C14171bb[]) C13689i.m27652a(bbVarArr);
        C13689i.m27651a(0, this.f36991a.length);
    }

    /* renamed from: a */
    private int m29037a(int i, C13952d dVar) {
        while (i < this.f36991a.length) {
            if (this.f36991a[i].mo26349a(dVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        if (anVar.mo26384a().mResizeOptions == null) {
            kVar.mo26404b(null, 1);
            return;
        }
        if (!mo26406a(0, kVar, anVar)) {
            kVar.mo26404b(null, 1);
        }
    }

    /* renamed from: a */
    public final boolean mo26406a(int i, C14188k<C14044e> kVar, C14140an anVar) {
        int a = m29037a(i, anVar.mo26384a().mResizeOptions);
        if (a == -1) {
            return false;
        }
        this.f36991a[a].mo26346a(new C14170a(kVar, anVar, a), anVar);
        return true;
    }
}
