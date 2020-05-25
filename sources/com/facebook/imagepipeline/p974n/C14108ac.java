package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13679b;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ac */
public abstract class C14108ac implements C14139am<C14044e> {

    /* renamed from: a */
    private final Executor f36841a;

    /* renamed from: b */
    private final C13711i f36842b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C14044e mo26347a(C14229b bVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo26348a();

    protected C14108ac(Executor executor, C13711i iVar) {
        this.f36841a = executor;
        this.f36842b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C14044e mo26354b(InputStream inputStream, int i) throws IOException {
        return mo26353a(inputStream, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26353a(InputStream inputStream, int i) throws IOException {
        C13715a a;
        if (i <= 0) {
            try {
                a = C13715a.m27746a(this.f36842b.mo25613a(inputStream));
            } catch (Throwable th) {
                C13679b.m27634a(inputStream);
                C13715a.m27752c(null);
                throw th;
            }
        } else {
            a = C13715a.m27746a(this.f36842b.mo25614a(inputStream, i));
        }
        C13715a aVar = a;
        C14044e eVar = new C14044e(aVar);
        C13679b.m27634a(inputStream);
        C13715a.m27752c(aVar);
        return eVar;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        final C14142ap c = anVar.mo26387c();
        final String b = anVar.mo26386b();
        final C14229b a = anVar.mo26384a();
        final C141091 r0 = new C14152au<C14044e>(kVar, c, mo26348a(), b) {
            /* renamed from: c */
            public final /* synthetic */ Object mo25575c() throws Exception {
                C14044e a = C14108ac.this.mo26347a(a);
                if (a == null) {
                    c.onUltimateProducerReached(b, C14108ac.this.mo26348a(), false);
                    return null;
                }
                a.mo26273j();
                c.onUltimateProducerReached(b, C14108ac.this.mo26348a(), true);
                return a;
            }

            /* renamed from: b */
            public final /* synthetic */ void mo25574b(Object obj) {
                C14044e.m28705d((C14044e) obj);
            }
        };
        anVar.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                r0.mo25570a();
            }
        });
        this.f36841a.execute(r0);
    }
}
