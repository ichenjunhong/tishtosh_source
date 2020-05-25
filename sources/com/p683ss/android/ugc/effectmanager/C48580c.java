package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.effectmanager.C48566b.C48569b;
import com.p683ss.android.ugc.effectmanager.C48691e.C48692a;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.C48639e;
import com.p683ss.android.ugc.effectmanager.common.C48659h;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48591a;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48600g;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48678n;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import com.p683ss.android.ugc.effectmanager.model.DownloadableModelResponse;
import com.p683ss.android.ugc.effectmanager.model.DownloadableModelResponse.Data;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.effectmanager.c */
public final class C48580c {

    /* renamed from: a */
    static C48691e f122130a = new C48692a();

    /* renamed from: j */
    private static C48580c f122131j;

    /* renamed from: b */
    public final C48644a f122132b;

    /* renamed from: c */
    public final List<Host> f122133c;

    /* renamed from: d */
    public final C48641b f122134d;

    /* renamed from: e */
    final Executor f122135e;

    /* renamed from: f */
    public final String f122136f;

    /* renamed from: g */
    public final String f122137g;

    /* renamed from: h */
    public final C48569b f122138h;

    /* renamed from: i */
    public final C48566b f122139i;

    /* renamed from: k */
    private final C48564a f122140k;

    /* renamed from: l */
    private final String f122141l;

    /* renamed from: m */
    private final C48586a f122142m;

    /* renamed from: n */
    private C48688d f122143n;

    /* renamed from: o */
    private DownloadableModelSupportResourceFinder f122144o;

    /* renamed from: p */
    private C48906m f122145p;

    /* renamed from: q */
    private C48600g f122146q;

    /* renamed from: com.ss.android.ugc.effectmanager.c$a */
    public interface C48586a {
        /* renamed from: a */
        void mo80688a(Effect effect, ModelInfo modelInfo);

        /* renamed from: a */
        void mo80689a(Effect effect, ModelInfo modelInfo, long j);

        /* renamed from: a */
        void mo80690a(Effect effect, ModelInfo modelInfo, Exception exc);

        /* renamed from: a */
        void mo80691a(Effect effect, Exception exc);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.c$b */
    public interface C48587b extends C48586a {
    }

    /* renamed from: a */
    public static boolean m105108a() {
        if (f122131j != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static C48688d m105111c() {
        return f122131j.mo96135d();
    }

    /* renamed from: e */
    public final DownloadableModelSupportResourceFinder mo96136e() {
        return m105113g();
    }

    /* renamed from: b */
    public static C48580c m105110b() {
        if (f122131j != null) {
            return f122131j;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    /* renamed from: f */
    private void m105112f() {
        this.f122145p = new C48906m(new C48659h<C0013i<C48909o>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo96137a() {
                C48580c cVar = C48580c.this;
                return C0013i.m18a((Callable<TResult>) new Callable<C48909o>() {
                    public final /* synthetic */ Object call() throws Exception {
                        HashMap hashMap = new HashMap();
                        hashMap.put("sdk_version", C48580c.this.f122137g);
                        hashMap.put("device_type", C48580c.this.f122136f);
                        hashMap.put("status", String.valueOf(C48580c.this.f122138h.ordinal()));
                        new C48656j(null, null, hashMap) {

                            /* renamed from: a */
                            final /* synthetic */ Map f122149a;

                            /* renamed from: a */
                            public final void mo96139a() {
                                C48890g gVar = C48580c.this.f122139i.f122058k;
                                if (gVar != null) {
                                    this.f122149a.putAll(C48668f.f122308a.mo96252a(gVar));
                                }
                            }

                            {
                                this.f122149a = r4;
                            }
                        }.mo96139a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(((Host) C48580c.this.f122133c.get(0)).getItemName());
                        sb.append("/model/api/arithmetics");
                        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) C48580c.this.f122134d.mo59189a(C48580c.this.f122132b.mo96221a(new C48605b("GET", C48676l.m105346a(hashMap, sb.toString()))), DownloadableModelResponse.class);
                        C48639e eVar = new C48639e();
                        if (downloadableModelResponse != null) {
                            int i = downloadableModelResponse.status_code;
                            if (i == 0) {
                                Data data = downloadableModelResponse.getData();
                                if (data == null || data.getArithmetics() == null) {
                                    throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
                                }
                                Map arithmetics = data.getArithmetics();
                                for (String str : arithmetics.keySet()) {
                                    for (ModelInfo a : (List) arithmetics.get(str)) {
                                        eVar.mo96218a(str, a);
                                    }
                                }
                                return new C48909o(eVar);
                            }
                            StringBuilder sb2 = new StringBuilder("status code == ");
                            sb2.append(i);
                            sb2.append(" , indicates there is no model config from server, sdk version is ");
                            sb2.append(C48580c.this.f122137g);
                            throw new IllegalStateException(sb2.toString());
                        }
                        throw new IllegalStateException("response == null, indicates there may be an internal server error");
                    }
                }, cVar.f122135e);
            }
        });
    }

    /* renamed from: g */
    private DownloadableModelSupportResourceFinder m105113g() {
        if (this.f122144o == null) {
            this.f122144o = new DownloadableModelSupportResourceFinder(this.f122145p, this.f122146q, this.f122140k, this.f122142m);
        }
        return this.f122144o;
    }

    /* renamed from: d */
    public final C48688d mo96135d() {
        if (this.f122143n == null) {
            C48688d dVar = new C48688d(this.f122139i, this.f122140k, this.f122146q, this.f122132b, this.f122145p, this.f122142m);
            this.f122143n = dVar;
        }
        return this.f122143n;
    }

    /* renamed from: a */
    public static void m105106a(C48691e eVar) {
        f122130a = (C48691e) C48678n.m105349a(eVar);
    }

    /* renamed from: a */
    public static void m105105a(C48566b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        } else if (f122131j == null) {
            C48580c cVar = new C48580c(bVar);
            f122131j = cVar;
            cVar.m105112f();
        } else {
            throw new IllegalStateException("Duplicate initialization");
        }
    }

    private C48580c(C48566b bVar) {
        this.f122140k = new C48564a(bVar.f122048a, bVar.f122056i);
        this.f122141l = bVar.f122049b;
        this.f122132b = new C48644a(bVar.f122050c, bVar.f122065r);
        this.f122133c = bVar.f122051d;
        this.f122134d = bVar.f122052e;
        this.f122135e = bVar.f122053f;
        this.f122136f = bVar.f122054g;
        this.f122137g = bVar.f122055h;
        this.f122142m = bVar.f122057j;
        this.f122138h = bVar.f122059l;
        this.f122139i = bVar;
        if (bVar.f122058k.f122954G) {
            this.f122146q = new C48591a(this.f122141l, this.f122137g);
        } else {
            this.f122146q = new C48887f(this.f122141l, this.f122137g);
        }
    }

    /* renamed from: a */
    private void m105107a(final List<String> list, final C48902j jVar) {
        C0013i.m18a((Callable<TResult>) new Callable<Void>() {
            public final /* synthetic */ Object call() throws Exception {
                C48688d d = C48580c.this.mo96135d();
                List list = list;
                d.f122343a.mo96717a();
                Effect effect = new Effect();
                effect.setName("Stub");
                effect.setRequirements(list);
                d.mo96287b(new C48694b(effect, null, null));
                return null;
            }
        }, (Executor) C0013i.f24a).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Void, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar.mo33d()) {
                    if (jVar != null) {
                        jVar.mo59198a(iVar.mo35f());
                    }
                } else if (jVar != null) {
                    jVar.mo59199a((String[]) list.toArray(new String[0]));
                }
                return null;
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3.isEmpty() == false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m105109a(com.p683ss.android.ugc.effectmanager.C48893h r8, java.util.List<java.lang.String> r9) {
        /*
            r7 = this;
            boolean r8 = r9.isEmpty()
            r0 = 1
            if (r8 == 0) goto L_0x0008
            return r0
        L_0x0008:
            r8 = 0
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.String[] r9 = com.bef.effectsdk.RequirementResourceMapper.m7540a(r9)
            int r1 = r9.length
            r2 = 0
        L_0x0017:
            if (r2 >= r1) goto L_0x0048
            r3 = r9[r2]
            com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder r4 = r7.m105113g()
            boolean r4 = r4.isResourceAvailable(r3)
            com.ss.android.ugc.effectmanager.d r5 = m105111c()     // Catch:{ Exception -> 0x0041 }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0041 }
            r6[r8] = r3     // Catch:{ Exception -> 0x0041 }
            com.ss.android.ugc.effectmanager.m r3 = r5.f122343a     // Catch:{ Exception -> 0x0041 }
            com.ss.android.ugc.effectmanager.l r3 = r3.f123055b     // Catch:{ Exception -> 0x0041 }
            if (r3 != 0) goto L_0x0037
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0041 }
            r3.<init>()     // Catch:{ Exception -> 0x0041 }
            goto L_0x003b
        L_0x0037:
            java.util.Collection r3 = r5.mo96286a(r6, r3)     // Catch:{ Exception -> 0x0041 }
        L_0x003b:
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x0041 }
            if (r3 != 0) goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r4 != 0) goto L_0x0045
            return r8
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48580c.m105109a(com.ss.android.ugc.effectmanager.h, java.util.List):boolean");
    }

    /* renamed from: a */
    public final void mo96133a(String[] strArr, C48902j jVar) {
        m105107a(Arrays.asList(strArr), jVar);
    }

    /* renamed from: a */
    public final boolean mo96134a(C48893h hVar, Effect effect) {
        if (!hVar.mo96687a(effect)) {
            return false;
        }
        List requirements = effect.getRequirements();
        if (requirements == null) {
            requirements = Collections.emptyList();
        }
        return m105109a(hVar, requirements);
    }
}
