package com.facebook.imagepipeline.p965e;

import android.net.Uri;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13690j;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p964d.C13986p;
import com.facebook.imagepipeline.p966f.C14026d;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p971k.C14049b;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p974n.C14139am;
import com.facebook.imagepipeline.p974n.C14151at;
import com.facebook.imagepipeline.p974n.C14163ay;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14230a;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13746d;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.imagepipeline.e.h */
public final class C14001h {

    /* renamed from: f */
    private static final CancellationException f36479f = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    public final C13986p<C13619c, C14042c> f36480a;

    /* renamed from: b */
    public final C13962e f36481b;

    /* renamed from: c */
    public final C13962e f36482c;

    /* renamed from: d */
    public final C13969f f36483d;

    /* renamed from: e */
    public final C13691k<Boolean> f36484e;

    /* renamed from: g */
    private final C14021n f36485g;

    /* renamed from: h */
    private final C14050c f36486h;

    /* renamed from: i */
    private final C13691k<Boolean> f36487i;

    /* renamed from: j */
    private final C13986p<C13619c, C13709h> f36488j;

    /* renamed from: k */
    private final C14163ay f36489k;

    /* renamed from: l */
    private final C13691k<Boolean> f36490l;

    /* renamed from: m */
    private AtomicLong f36491m = new AtomicLong();

    /* renamed from: a */
    public final void mo26186a(Uri uri) {
        C13690j e = m28550e(uri);
        this.f36480a.mo26158a(e);
        this.f36488j.mo26158a(e);
    }

    /* renamed from: a */
    public final void mo26185a() {
        C140032 r0 = new C13690j<C13619c>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo25584a(Object obj) {
                return true;
            }
        };
        this.f36480a.mo26158a((C13690j<K>) r0);
        this.f36488j.mo26158a((C13690j<K>) r0);
    }

    /* renamed from: a */
    public final boolean mo26187a(C14229b bVar) {
        if (bVar == null) {
            return false;
        }
        C13715a a = this.f36480a.mo26159a(this.f36483d.mo26145a(bVar, null));
        try {
            return C13715a.m27750a(a);
        } finally {
            C13715a.m27752c(a);
        }
    }

    /* renamed from: d */
    public final boolean mo26195d() {
        return this.f36489k.mo26399c();
    }

    /* renamed from: e */
    private String m28551e() {
        return String.valueOf(this.f36491m.getAndIncrement());
    }

    /* renamed from: b */
    public final void mo26190b() {
        this.f36489k.mo26395a();
    }

    /* renamed from: c */
    public final void mo26193c() {
        this.f36489k.mo26397b();
    }

    /* renamed from: e */
    private C13690j<C13619c> m28550e(final Uri uri) {
        return new C13690j<C13619c>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo25584a(Object obj) {
                return ((C13619c) obj).mo25471a(uri);
            }
        };
    }

    /* renamed from: b */
    public final void mo26191b(Uri uri) {
        mo26186a(uri);
        C13619c c = this.f36483d.mo26147c(C14229b.fromUri(uri), null);
        this.f36481b.mo26138g(c);
        this.f36482c.mo26138g(c);
    }

    /* renamed from: c */
    public final boolean mo26194c(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f36480a.mo26166c(m28550e(uri));
    }

    /* renamed from: d */
    public final boolean mo26196d(Uri uri) {
        if (m28548a(uri, C14230a.SMALL) || m28548a(uri, C14230a.DEFAULT)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m28549b(C14229b bVar) {
        C13619c c = this.f36483d.mo26147c(bVar, null);
        switch (bVar.mCacheChoice) {
            case DEFAULT:
                return this.f36481b.mo26136e(c);
            case SMALL:
                return this.f36482c.mo26136e(c);
            default:
                return false;
        }
    }

    /* renamed from: c */
    public final C13745c<Void> mo26192c(C14229b bVar, Object obj) {
        return m28546a(bVar, obj, C13951c.MEDIUM);
    }

    /* renamed from: a */
    public final C13745c<C13715a<C14042c>> mo26182a(C14229b bVar, Object obj) {
        return mo26189b(bVar, obj, C14231b.FULL_FETCH);
    }

    /* renamed from: a */
    private boolean m28548a(Uri uri, C14230a aVar) {
        return m28549b(C14232c.m29169a(uri).mo26456a(aVar).mo26449a());
    }

    /* renamed from: b */
    public final C13745c<Void> mo26188b(C14229b bVar, Object obj) {
        C14139am b;
        if (!((Boolean) this.f36487i.mo23157b()).booleanValue()) {
            return C13746d.m27819a(f36479f);
        }
        try {
            if (((Boolean) this.f36490l.mo23157b()).booleanValue()) {
                b = this.f36485g.mo26233b(bVar);
            } else {
                C14021n nVar = this.f36485g;
                C14139am c = nVar.mo26235c(bVar);
                if (nVar.f36645a) {
                    c = nVar.mo26234c(c);
                }
                b = nVar.mo26232b(c);
            }
            return m28544a(b, bVar, C14231b.FULL_FETCH, obj, C13951c.MEDIUM);
        } catch (Exception e) {
            return C13746d.m27819a(e);
        }
    }

    /* renamed from: a */
    private C14050c m28547a(C14229b bVar, C14050c cVar) {
        if (cVar == null) {
            if (bVar.mRequestListener == null) {
                return this.f36486h;
            }
            return new C14049b(this.f36486h, bVar.mRequestListener);
        } else if (bVar.mRequestListener == null) {
            return new C14049b(this.f36486h, cVar);
        } else {
            return new C14049b(this.f36486h, cVar, bVar.mRequestListener);
        }
    }

    /* renamed from: a */
    public final C13691k<C13745c<C13715a<C14042c>>> mo26181a(final C14229b bVar, final Object obj, final C14231b bVar2) {
        return new C13691k<C13745c<C13715a<C14042c>>>() {
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo23157b() {
                return C14001h.this.mo26189b(bVar, obj, bVar2);
            }

            public final String toString() {
                return C13685h.m27644a(this).mo25581a("uri", (Object) bVar.mSourceUri).toString();
            }
        };
    }

    /* renamed from: b */
    public final C13745c<C13715a<C14042c>> mo26189b(C14229b bVar, Object obj, C14231b bVar2) {
        return mo26184a(bVar, obj, bVar2, null);
    }

    /* renamed from: a */
    private C13745c<Void> m28546a(C14229b bVar, Object obj, C13951c cVar) {
        if (!((Boolean) this.f36487i.mo23157b()).booleanValue()) {
            return C13746d.m27819a(f36479f);
        }
        try {
            return m28544a(this.f36485g.mo26233b(bVar), bVar, C14231b.FULL_FETCH, obj, cVar);
        } catch (Exception e) {
            return C13746d.m27819a(e);
        }
    }

    /* renamed from: a */
    public final C13745c<C13715a<C13709h>> mo26183a(C14229b bVar, Object obj, C14050c cVar) {
        C13689i.m27652a(bVar.mSourceUri);
        try {
            C14139am a = this.f36485g.mo26231a(bVar);
            if (bVar.mResizeOptions != null) {
                bVar = C14232c.m29170a(bVar).mo26453a((C13952d) null).mo26449a();
            }
            return m28545a(a, bVar, C14231b.FULL_FETCH, obj, (C14050c) null);
        } catch (Exception e) {
            return C13746d.m27819a(e);
        }
    }

    /* renamed from: a */
    public final C13745c<C13715a<C14042c>> mo26184a(C14229b bVar, Object obj, C14231b bVar2, C14050c cVar) {
        try {
            C14021n nVar = this.f36485g;
            if (C14237b.m29187b()) {
                C14237b.m29186a("ProducerSequenceFactory#getDecodedImageProducerSequence");
            }
            C14139am c = nVar.mo26235c(bVar);
            if (bVar.mPostprocessor != null) {
                c = nVar.mo26230a(c);
            }
            if (nVar.f36645a) {
                c = nVar.mo26234c(c);
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return m28545a(c, bVar, bVar2, obj, cVar);
        } catch (Exception e) {
            return C13746d.m27819a(e);
        }
    }

    /* renamed from: a */
    private C13745c<Void> m28544a(C14139am<Void> amVar, C14229b bVar, C14231b bVar2, Object obj, C13951c cVar) {
        C14050c a = m28547a(bVar, (C14050c) null);
        try {
            C14229b bVar3 = bVar;
            C14151at atVar = new C14151at(bVar3, m28551e(), a, obj, C14231b.getMax(bVar.mLowestPermittedRequestLevel, bVar2), true, false, cVar);
            return new C14026d(amVar, atVar, a);
        } catch (Exception e) {
            return C13746d.m27819a(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ Exception -> 0x005c, all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[Catch:{ Exception -> 0x005c, all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> com.facebook.p929d.C13745c<com.facebook.common.p924h.C13715a<T>> m28545a(com.facebook.imagepipeline.p974n.C14139am<com.facebook.common.p924h.C13715a<T>> r11, com.facebook.imagepipeline.p975o.C14229b r12, com.facebook.imagepipeline.p975o.C14229b.C14231b r13, java.lang.Object r14, com.facebook.imagepipeline.p971k.C14050c r15) {
        /*
            r10 = this;
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            com.facebook.imagepipeline.p976p.C14237b.m29186a(r0)
        L_0x000b:
            com.facebook.imagepipeline.k.c r15 = r10.m28547a(r12, r15)
            com.facebook.imagepipeline.o.b$b r0 = r12.mLowestPermittedRequestLevel     // Catch:{ Exception -> 0x005c }
            com.facebook.imagepipeline.o.b$b r6 = com.facebook.imagepipeline.p975o.C14229b.C14231b.getMax(r0, r13)     // Catch:{ Exception -> 0x005c }
            com.facebook.imagepipeline.n.at r13 = new com.facebook.imagepipeline.n.at     // Catch:{ Exception -> 0x005c }
            java.lang.String r3 = r10.m28551e()     // Catch:{ Exception -> 0x005c }
            r7 = 0
            boolean r0 = r12.mProgressiveRenderingEnabled     // Catch:{ Exception -> 0x005c }
            if (r0 != 0) goto L_0x002c
            android.net.Uri r0 = r12.mSourceUri     // Catch:{ Exception -> 0x005c }
            boolean r0 = com.facebook.common.p927k.C13731f.m27778b(r0)     // Catch:{ Exception -> 0x005c }
            if (r0 != 0) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r0 = 0
            r8 = 0
            goto L_0x002e
        L_0x002c:
            r0 = 1
            r8 = 1
        L_0x002e:
            com.facebook.imagepipeline.common.c r9 = r12.mRequestPriority     // Catch:{ Exception -> 0x005c }
            r1 = r13
            r2 = r12
            r4 = r15
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x005c }
            boolean r12 = com.facebook.imagepipeline.p976p.C14237b.m29187b()     // Catch:{ Exception -> 0x005c }
            if (r12 == 0) goto L_0x0042
            java.lang.String r12 = "CloseableProducerToDataSourceAdapter#create"
            com.facebook.imagepipeline.p976p.C14237b.m29186a(r12)     // Catch:{ Exception -> 0x005c }
        L_0x0042:
            com.facebook.imagepipeline.f.c r12 = new com.facebook.imagepipeline.f.c     // Catch:{ Exception -> 0x005c }
            r12.<init>(r11, r13, r15)     // Catch:{ Exception -> 0x005c }
            boolean r11 = com.facebook.imagepipeline.p976p.C14237b.m29187b()     // Catch:{ Exception -> 0x005c }
            if (r11 == 0) goto L_0x0050
            com.facebook.imagepipeline.p976p.C14237b.m29185a()     // Catch:{ Exception -> 0x005c }
        L_0x0050:
            boolean r11 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r11 == 0) goto L_0x0059
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x0059:
            return r12
        L_0x005a:
            r11 = move-exception
            goto L_0x006b
        L_0x005c:
            r11 = move-exception
            com.facebook.d.c r11 = com.facebook.p929d.C13746d.m27819a(r11)     // Catch:{ all -> 0x005a }
            boolean r12 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r12 == 0) goto L_0x006a
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x006a:
            return r11
        L_0x006b:
            boolean r12 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r12 == 0) goto L_0x0074
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x0074:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p965e.C14001h.m28545a(com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.o.b, com.facebook.imagepipeline.o.b$b, java.lang.Object, com.facebook.imagepipeline.k.c):com.facebook.d.c");
    }

    public C14001h(C14021n nVar, Set<C14050c> set, C13691k<Boolean> kVar, C13986p<C13619c, C14042c> pVar, C13986p<C13619c, C13709h> pVar2, C13962e eVar, C13962e eVar2, C13969f fVar, C14163ay ayVar, C13691k<Boolean> kVar2, C13691k<Boolean> kVar3) {
        this.f36485g = nVar;
        this.f36486h = new C14049b(set);
        this.f36487i = kVar;
        this.f36480a = pVar;
        this.f36488j = pVar2;
        this.f36481b = eVar;
        this.f36482c = eVar2;
        this.f36483d = fVar;
        this.f36489k = ayVar;
        this.f36490l = kVar2;
        this.f36484e = kVar3;
    }
}
