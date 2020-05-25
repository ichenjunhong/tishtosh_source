package com.facebook.imagepipeline.p974n;

import android.os.SystemClock;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13713k;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13949a;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14123ai.C14124a;
import com.facebook.imagepipeline.p976p.C14237b;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.ah */
public final class C14121ah implements C14139am<C14044e> {

    /* renamed from: a */
    final C14123ai f36871a;

    /* renamed from: b */
    private final C13711i f36872b;

    /* renamed from: c */
    private final C13702a f36873c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, String> mo26369a(C14207t tVar, int i) {
        if (!tVar.mo26419b().requiresExtraMap(tVar.mo26418a())) {
            return null;
        }
        return this.f36871a.getExtraMap(tVar, i);
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        anVar.mo26387c().onProducerStart(anVar.mo26386b(), "NetworkFetchProducer");
        final C14207t createFetchState = this.f36871a.createFetchState(kVar, anVar);
        this.f36871a.fetch(createFetchState, new C14124a() {
            /* renamed from: a */
            public final void mo26371a() {
                C14121ah ahVar = C14121ah.this;
                C14207t tVar = createFetchState;
                tVar.mo26419b().onProducerFinishWithCancellation(tVar.mo26418a(), "NetworkFetchProducer", ahVar.mo26369a(tVar, -1));
                tVar.f37086d.mo26402b();
            }

            /* renamed from: a */
            public final void mo26373a(Throwable th) {
                String str;
                C14121ah ahVar = C14121ah.this;
                C14207t tVar = createFetchState;
                Map a = ahVar.mo26369a(tVar, -1);
                if (a == null) {
                    a = new HashMap(1);
                }
                String str2 = "NetworkFetcher";
                if (ahVar.f36871a == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ahVar.f36871a.getClass().getName());
                    sb.append(", ");
                    sb.append(ahVar.f36871a.toString());
                    str = sb.toString();
                }
                a.put(str2, str);
                tVar.mo26419b().onProducerFinishWithFailure(tVar.mo26418a(), "NetworkFetchProducer", th, a);
                tVar.mo26419b().onUltimateProducerReached(tVar.mo26418a(), "NetworkFetchProducer", false);
                tVar.f37086d.mo26405b(th);
            }

            /* renamed from: a */
            public final void mo26372a(InputStream inputStream, int i) throws IOException {
                if (C14237b.m29187b()) {
                    C14237b.m29186a("NetworkFetcher->onResponse");
                }
                C14121ah.this.mo26370a(createFetchState, inputStream, i);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            }
        });
    }

    public C14121ah(C13711i iVar, C13702a aVar, C14123ai aiVar) {
        this.f36872b = iVar;
        this.f36873c = aVar;
        this.f36871a = aiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26370a(C14207t tVar, InputStream inputStream, int i) throws IOException {
        C13713k kVar;
        float f;
        if (i > 0) {
            kVar = this.f36872b.mo25617a(i);
        } else {
            kVar = this.f36872b.mo25616a();
        }
        byte[] bArr = (byte[]) this.f36873c.mo25599a(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f36871a.onFetchCompletion(tVar, kVar.mo25627b());
                    Map a = mo26369a(tVar, kVar.mo25627b());
                    C14142ap b = tVar.mo26419b();
                    b.onProducerFinishWithSuccess(tVar.mo26418a(), "NetworkFetchProducer", a);
                    b.onUltimateProducerReached(tVar.mo26418a(), "NetworkFetchProducer", true);
                    m28934a(kVar, tVar.f37089g | 1, tVar.f37090h, tVar.f37086d);
                    return;
                } else if (read > 0) {
                    boolean z = false;
                    kVar.write(bArr, 0, read);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (tVar.f37087e.mo26392h()) {
                        z = this.f36871a.shouldPropagate(tVar);
                    }
                    if (z && uptimeMillis - tVar.f37088f >= 100) {
                        tVar.f37088f = uptimeMillis;
                        tVar.mo26419b().onProducerEvent(tVar.mo26418a(), "NetworkFetchProducer", "intermediate_result");
                        m28934a(kVar, tVar.f37089g, tVar.f37090h, tVar.f37086d);
                    }
                    int b2 = kVar.mo25627b();
                    if (i > 0) {
                        f = ((float) b2) / ((float) i);
                    } else {
                        double d = (double) (-b2);
                        Double.isNaN(d);
                        f = 1.0f - ((float) Math.exp(d / 50000.0d));
                    }
                    tVar.f37086d.mo26403b(f);
                }
            } finally {
                this.f36873c.mo25600a(bArr);
                kVar.close();
            }
        }
    }

    /* renamed from: a */
    private static void m28934a(C13713k kVar, int i, C13949a aVar, C14188k<C14044e> kVar2) {
        C14044e eVar;
        C13715a a = C13715a.m27746a(kVar.mo25626a());
        try {
            eVar = new C14044e(a);
            try {
                eVar.f36709j = aVar;
                eVar.mo26273j();
                kVar2.mo26404b(eVar, i);
                C14044e.m28705d(eVar);
                C13715a.m27752c(a);
            } catch (Throwable th) {
                th = th;
                C14044e.m28705d(eVar);
                C13715a.m27752c(a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            C14044e.m28705d(eVar);
            C13715a.m27752c(a);
            throw th;
        }
    }
}
