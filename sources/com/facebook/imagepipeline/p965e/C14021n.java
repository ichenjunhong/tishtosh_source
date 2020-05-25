package com.facebook.imagepipeline.p965e;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p928l.C13735c;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14104aa;
import com.facebook.imagepipeline.p974n.C14112ae;
import com.facebook.imagepipeline.p974n.C14113af;
import com.facebook.imagepipeline.p974n.C14121ah;
import com.facebook.imagepipeline.p974n.C14123ai;
import com.facebook.imagepipeline.p974n.C14129ak;
import com.facebook.imagepipeline.p974n.C14131al;
import com.facebook.imagepipeline.p974n.C14139am;
import com.facebook.imagepipeline.p974n.C14143aq;
import com.facebook.imagepipeline.p974n.C14144ar;
import com.facebook.imagepipeline.p974n.C14163ay;
import com.facebook.imagepipeline.p974n.C14171bb;
import com.facebook.imagepipeline.p974n.C14183i;
import com.facebook.imagepipeline.p974n.C14189l;
import com.facebook.imagepipeline.p974n.C14197o;
import com.facebook.imagepipeline.p974n.C14200p;
import com.facebook.imagepipeline.p974n.C14220y;
import com.facebook.imagepipeline.p974n.C14221z;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.imagepipeline.p977q.C14244c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.e.n */
public final class C14021n {

    /* renamed from: A */
    private final boolean f36642A;

    /* renamed from: B */
    private final C14244c f36643B;

    /* renamed from: C */
    private C14139am<C14044e> f36644C;

    /* renamed from: a */
    final boolean f36645a;

    /* renamed from: b */
    C14139am<C13715a<C14042c>> f36646b;

    /* renamed from: c */
    C14139am<C14044e> f36647c;

    /* renamed from: d */
    C14139am<C14044e> f36648d;

    /* renamed from: e */
    C14139am<C13715a<C13709h>> f36649e;

    /* renamed from: f */
    C14139am<C13715a<C13709h>> f36650f;

    /* renamed from: g */
    C14139am<Void> f36651g;

    /* renamed from: h */
    C14139am<Void> f36652h;

    /* renamed from: i */
    C14139am<C13715a<C14042c>> f36653i;

    /* renamed from: j */
    C14139am<C13715a<C14042c>> f36654j;

    /* renamed from: k */
    C14139am<C13715a<C14042c>> f36655k;

    /* renamed from: l */
    C14139am<C13715a<C14042c>> f36656l;

    /* renamed from: m */
    C14139am<C13715a<C14042c>> f36657m;

    /* renamed from: n */
    C14139am<C13715a<C14042c>> f36658n;

    /* renamed from: o */
    C14139am<C13715a<C14042c>> f36659o;

    /* renamed from: p */
    Map<C14139am<C13715a<C14042c>>, C14139am<C13715a<C14042c>>> f36660p = new HashMap();

    /* renamed from: q */
    Map<C14139am<C13715a<C14042c>>, C14139am<Void>> f36661q = new HashMap();

    /* renamed from: r */
    Map<C14139am<C13715a<C14042c>>, C14139am<C13715a<C14042c>>> f36662r = new HashMap();

    /* renamed from: s */
    private final ContentResolver f36663s;

    /* renamed from: t */
    private final C14020m f36664t;

    /* renamed from: u */
    private final C14123ai f36665u;

    /* renamed from: v */
    private final boolean f36666v;

    /* renamed from: w */
    private final boolean f36667w;

    /* renamed from: x */
    private final boolean f36668x;

    /* renamed from: y */
    private final C14163ay f36669y;

    /* renamed from: z */
    private final boolean f36670z;

    /* renamed from: i */
    private synchronized C14139am<C13715a<C14042c>> m28643i() {
        if (this.f36653i == null) {
            this.f36653i = m28633d((C14139am<C14044e>) this.f36664t.mo26218b());
        }
        return this.f36653i;
    }

    /* renamed from: a */
    private C14139am<C13715a<C13709h>> m28625a() {
        synchronized (this) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence");
            }
            if (this.f36650f == null) {
                if (C14237b.m29187b()) {
                    C14237b.m29186a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                }
                this.f36650f = new C14144ar(m28632d());
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        return this.f36650f;
    }

    /* renamed from: b */
    private C14139am<C13715a<C13709h>> m28629b() {
        synchronized (this) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence");
            }
            if (this.f36649e == null) {
                if (C14237b.m29187b()) {
                    C14237b.m29186a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                }
                this.f36649e = new C14144ar(m28641h());
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        return this.f36649e;
    }

    /* renamed from: c */
    private synchronized C14139am<C13715a<C14042c>> m28631c() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f36646b == null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f36646b = m28636e(m28637f());
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return this.f36646b;
    }

    /* renamed from: d */
    private synchronized C14139am<C14044e> m28632d() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f36648d == null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f36648d = C14020m.m28607a(m28637f(), this.f36669y);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return this.f36648d;
    }

    /* renamed from: e */
    private synchronized C14139am<Void> m28635e() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f36652h == null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f36652h = C14020m.m28610k(m28632d());
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return this.f36652h;
    }

    /* renamed from: g */
    private synchronized C14139am<Void> m28639g() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f36651g == null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f36651g = C14020m.m28610k(m28641h());
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return this.f36651g;
    }

    /* renamed from: j */
    private synchronized C14139am<C13715a<C14042c>> m28644j() {
        if (this.f36654j == null) {
            C14020m mVar = this.f36664t;
            this.f36654j = m28642h(new C14113af(mVar.f36625e.mo26174a(), mVar.f36621a));
        }
        return this.f36654j;
    }

    /* renamed from: l */
    private synchronized C14139am<C13715a<C14042c>> m28646l() {
        if (this.f36659o == null) {
            C14020m mVar = this.f36664t;
            this.f36659o = m28633d((C14139am<C14044e>) new C14143aq<C14044e>(mVar.f36625e.mo26174a(), mVar.f36626f, mVar.f36621a));
        }
        return this.f36659o;
    }

    /* renamed from: m */
    private synchronized C14139am<C13715a<C14042c>> m28647m() {
        if (this.f36656l == null) {
            C14020m mVar = this.f36664t;
            this.f36656l = m28633d((C14139am<C14044e>) new C14112ae<C14044e>(mVar.f36625e.mo26174a(), mVar.f36626f, mVar.f36622b));
        }
        return this.f36656l;
    }

    /* renamed from: n */
    private synchronized C14139am<C13715a<C14042c>> m28648n() {
        if (this.f36657m == null) {
            C14020m mVar = this.f36664t;
            this.f36657m = m28633d((C14139am<C14044e>) new C14220y<C14044e>(mVar.f36625e.mo26174a(), mVar.f36626f, mVar.f36623c));
        }
        return this.f36657m;
    }

    /* renamed from: o */
    private synchronized C14139am<C13715a<C14042c>> m28649o() {
        if (this.f36658n == null) {
            C14139am lVar = new C14189l(this.f36664t.f36626f);
            if (C13735c.f35722a && (!this.f36667w || C13735c.f35725d == null)) {
                lVar = this.f36664t.mo26229m(lVar);
            }
            this.f36658n = m28636e(this.f36664t.mo26217a(C14020m.m28606a(lVar), true, this.f36643B));
        }
        return this.f36658n;
    }

    /* renamed from: f */
    private synchronized C14139am<C14044e> m28637f() {
        boolean z;
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f36644C == null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            C14020m mVar = this.f36664t;
            this.f36644C = C14020m.m28606a(m28638f(new C14121ah(mVar.f36626f, mVar.f36624d, this.f36665u)));
            C14020m mVar2 = this.f36664t;
            C14139am<C14044e> amVar = this.f36644C;
            if (!this.f36666v || this.f36670z) {
                z = false;
            } else {
                z = true;
            }
            this.f36644C = mVar2.mo26217a(amVar, z, this.f36643B);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return this.f36644C;
    }

    /* renamed from: h */
    private synchronized C14139am<C14044e> m28641h() {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f36647c == null) {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f36647c = C14020m.m28607a(m28638f(this.f36664t.mo26218b()), this.f36669y);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return this.f36647c;
    }

    /* renamed from: k */
    private synchronized C14139am<C13715a<C14042c>> m28645k() {
        if (this.f36655k == null) {
            C14020m mVar = this.f36664t;
            C14221z zVar = new C14221z(mVar.f36625e.mo26174a(), mVar.f36626f, mVar.f36621a);
            C14020m mVar2 = this.f36664t;
            this.f36655k = m28626a(zVar, new C14171bb[]{new C14104aa(mVar2.f36625e.mo26174a(), mVar2.f36626f, mVar2.f36621a), this.f36664t.mo26216a()});
        }
        return this.f36655k;
    }

    /* renamed from: a */
    private C14139am<C14044e> m28627a(C14171bb<C14044e>[] bbVarArr) {
        return this.f36664t.mo26217a(C14020m.m28608a(bbVarArr), true, this.f36643B);
    }

    /* renamed from: d */
    private C14139am<C13715a<C14042c>> m28633d(C14139am<C14044e> amVar) {
        return m28626a(amVar, new C14171bb[]{this.f36664t.mo26216a()});
    }

    /* renamed from: e */
    private C14139am<C13715a<C14042c>> m28636e(C14139am<C14044e> amVar) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        C14139am<C13715a<C14042c>> h = m28642h(this.f36664t.mo26222e(amVar));
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return h;
    }

    /* renamed from: h */
    private C14139am<C13715a<C14042c>> m28642h(C14139am<C13715a<C14042c>> amVar) {
        return this.f36664t.mo26219b(C14020m.m28607a((C14139am<T>) this.f36664t.mo26220c(this.f36664t.mo26221d(amVar)), this.f36669y));
    }

    /* renamed from: f */
    private C14139am<C14044e> m28638f(C14139am<C14044e> amVar) {
        if (C13735c.f35722a && (!this.f36667w || C13735c.f35725d == null)) {
            amVar = this.f36664t.mo26229m(amVar);
        }
        if (this.f36642A) {
            amVar = m28640g(amVar);
        }
        return this.f36664t.mo26226i(this.f36664t.mo26227j(amVar));
    }

    /* renamed from: a */
    private static String m28628a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf.substring(0, 30));
        sb.append("...");
        return sb.toString();
    }

    /* renamed from: d */
    private static void m28634d(C14229b bVar) {
        boolean z;
        C13689i.m27652a(bVar);
        if (bVar.mLowestPermittedRequestLevel.getValue() <= C14231b.ENCODED_MEMORY_CACHE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
    }

    /* renamed from: g */
    private C14139am<C14044e> m28640g(C14139am<C14044e> amVar) {
        C14200p pVar;
        if (C14237b.m29187b()) {
            C14237b.m29186a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f36668x) {
            pVar = this.f36664t.mo26224g(this.f36664t.mo26225h(amVar));
        } else {
            pVar = this.f36664t.mo26224g(amVar);
        }
        C14197o f = this.f36664t.mo26223f(pVar);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized C14139am<Void> mo26232b(C14139am<C13715a<C14042c>> amVar) {
        if (!this.f36661q.containsKey(amVar)) {
            this.f36661q.put(amVar, C14020m.m28610k(amVar));
        }
        return (C14139am) this.f36661q.get(amVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized C14139am<C13715a<C14042c>> mo26234c(C14139am<C13715a<C14042c>> amVar) {
        C14139am<C13715a<C14042c>> amVar2;
        amVar2 = (C14139am) this.f36662r.get(amVar);
        if (amVar2 == null) {
            C14020m mVar = this.f36664t;
            C14139am<C13715a<C14042c>> iVar = new C14183i<>(amVar, mVar.f36630j, mVar.f36631k, mVar.f36632l);
            this.f36662r.put(amVar, iVar);
            amVar2 = iVar;
        }
        return amVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C14139am<C13715a<C14042c>> mo26230a(C14139am<C13715a<C14042c>> amVar) {
        if (!this.f36660p.containsKey(amVar)) {
            C14020m mVar = this.f36664t;
            C14131al alVar = new C14131al(amVar, mVar.f36629i, mVar.f36625e.mo26177d());
            C14020m mVar2 = this.f36664t;
            this.f36660p.put(amVar, new C14129ak(mVar2.f36627g, mVar2.f36628h, alVar));
        }
        return (C14139am) this.f36660p.get(amVar);
    }

    /* renamed from: b */
    public final C14139am<Void> mo26233b(C14229b bVar) {
        m28634d(bVar);
        int i = bVar.mSourceUriType;
        if (i == 0) {
            return m28635e();
        }
        switch (i) {
            case 2:
            case 3:
                return m28639g();
            default:
                Uri uri = bVar.mSourceUri;
                StringBuilder sb = new StringBuilder("Unsupported uri scheme for encoded image fetch! Uri is: ");
                sb.append(m28628a(uri));
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5 A[FINALLY_INSNS] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.imagepipeline.p974n.C14139am<com.facebook.common.p924h.C13715a<com.facebook.imagepipeline.p970j.C14042c>> mo26235c(com.facebook.imagepipeline.p975o.C14229b r4) {
        /*
            r3 = this;
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            com.facebook.imagepipeline.p976p.C14237b.m29186a(r0)     // Catch:{ all -> 0x00be }
        L_0x000b:
            com.facebook.common.p920d.C13689i.m27652a(r4)     // Catch:{ all -> 0x00be }
            android.net.Uri r0 = r4.mSourceUri     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "Uri is null."
            com.facebook.common.p920d.C13689i.m27653a(r0, r1)     // Catch:{ all -> 0x00be }
            int r4 = r4.mSourceUriType     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x00b0
            switch(r4) {
                case 2: goto L_0x00a2;
                case 3: goto L_0x0094;
                case 4: goto L_0x006c;
                case 5: goto L_0x005e;
                case 6: goto L_0x0050;
                case 7: goto L_0x0042;
                case 8: goto L_0x0034;
                default: goto L_0x001c;
            }     // Catch:{ all -> 0x00be }
        L_0x001c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Unsupported uri scheme! Uri is: "
            r1.<init>(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = m28628a(r0)     // Catch:{ all -> 0x00be }
            r1.append(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00be }
            r4.<init>(r0)     // Catch:{ all -> 0x00be }
            throw r4     // Catch:{ all -> 0x00be }
        L_0x0034:
            com.facebook.imagepipeline.n.am r4 = r3.m28646l()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x0041
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x0041:
            return r4
        L_0x0042:
            com.facebook.imagepipeline.n.am r4 = r3.m28649o()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x004f
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x004f:
            return r4
        L_0x0050:
            com.facebook.imagepipeline.n.am r4 = r3.m28647m()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x005d
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x005d:
            return r4
        L_0x005e:
            com.facebook.imagepipeline.n.am r4 = r3.m28648n()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x006b
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x006b:
            return r4
        L_0x006c:
            android.content.ContentResolver r4 = r3.f36663s     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.getType(r0)     // Catch:{ all -> 0x00be }
            boolean r4 = com.facebook.common.p922f.C13700a.m27723a(r4)     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x0086
            com.facebook.imagepipeline.n.am r4 = r3.m28644j()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x0085
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x0085:
            return r4
        L_0x0086:
            com.facebook.imagepipeline.n.am r4 = r3.m28645k()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x0093
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x0093:
            return r4
        L_0x0094:
            com.facebook.imagepipeline.n.am r4 = r3.m28643i()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x00a1
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x00a1:
            return r4
        L_0x00a2:
            com.facebook.imagepipeline.n.am r4 = r3.m28644j()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x00af
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x00af:
            return r4
        L_0x00b0:
            com.facebook.imagepipeline.n.am r4 = r3.m28631c()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x00bd
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x00bd:
            return r4
        L_0x00be:
            r4 = move-exception
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x00c8
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x00c8:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p965e.C14021n.mo26235c(com.facebook.imagepipeline.o.b):com.facebook.imagepipeline.n.am");
    }

    /* renamed from: a */
    public final C14139am<C13715a<C13709h>> mo26231a(C14229b bVar) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getEncodedImageProducerSequence");
            }
            m28634d(bVar);
            Uri uri = bVar.mSourceUri;
            int i = bVar.mSourceUriType;
            if (i != 0) {
                switch (i) {
                    case 2:
                    case 3:
                        return m28629b();
                    default:
                        StringBuilder sb = new StringBuilder("Unsupported uri scheme for encoded image fetch! Uri is: ");
                        sb.append(m28628a(uri));
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                C14139am<C13715a<C13709h>> a = m28625a();
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return a;
            }
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: a */
    private C14139am<C13715a<C14042c>> m28626a(C14139am<C14044e> amVar, C14171bb<C14044e>[] bbVarArr) {
        return m28636e(m28630b(m28638f(amVar), bbVarArr));
    }

    /* renamed from: b */
    private C14139am<C14044e> m28630b(C14139am<C14044e> amVar, C14171bb<C14044e>[] bbVarArr) {
        return C14020m.m28609a(m28627a(bbVarArr), (C14139am<C14044e>) this.f36664t.mo26228l(this.f36664t.mo26217a(C14020m.m28606a(amVar), true, this.f36643B)));
    }

    public C14021n(ContentResolver contentResolver, C14020m mVar, C14123ai aiVar, boolean z, boolean z2, C14163ay ayVar, boolean z3, boolean z4, boolean z5, boolean z6, C14244c cVar) {
        this.f36663s = contentResolver;
        this.f36664t = mVar;
        this.f36665u = aiVar;
        this.f36666v = z;
        this.f36667w = z2;
        this.f36669y = ayVar;
        this.f36670z = z3;
        this.f36645a = z4;
        this.f36668x = z5;
        this.f36642A = z6;
        this.f36643B = cVar;
    }
}
