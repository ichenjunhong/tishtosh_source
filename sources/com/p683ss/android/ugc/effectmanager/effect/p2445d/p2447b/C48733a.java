package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48903k;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48713r;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48717a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48746b;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48747c;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48751g;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48754j;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48756l;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48759o;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48856a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48876q;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48880u;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a */
public final class C48733a implements C48686a, C48717a {

    /* renamed from: a */
    public C48734a f122391a;

    /* renamed from: b */
    private C48565a f122392b;

    /* renamed from: c */
    private C48890g f122393c = this.f122392b.f122047a;

    /* renamed from: d */
    private Handler f122394d = new C48685j(this);

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a$a */
    public interface C48734a {
        /* renamed from: a */
        void mo96318a(String str, EffectChannelResponse effectChannelResponse, int i, C48649d dVar);
    }

    public C48733a(C48565a aVar) {
        this.f122392b = aVar;
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        C48708m mVar;
        C48707l lVar;
        if (this.f122391a != null) {
            C48701f fVar = null;
            if (message.what == 14 && (message.obj instanceof C48746b)) {
                C48746b bVar = (C48746b) message.obj;
                C48649d dVar = bVar.f122425c;
                if (dVar == null) {
                    this.f122391a.mo96318a(bVar.f122278a, bVar.f122424b, 23, null);
                } else {
                    this.f122391a.mo96318a(bVar.f122278a, bVar.f122424b, 27, dVar);
                }
            }
            if (message.what == 22 && (message.obj instanceof C48754j)) {
                C48754j jVar = (C48754j) message.obj;
                C48903k kVar = this.f122393c.f122948A;
                String str = jVar.f122278a;
                if (kVar.f123048l == null) {
                    lVar = null;
                } else {
                    lVar = (C48707l) kVar.f123048l.get(str);
                }
                C48649d dVar2 = jVar.f122444c;
                if (dVar2 == null) {
                    lVar.mo8638a(jVar.f122443b);
                } else {
                    lVar.mo59192a(dVar2);
                }
                C48903k kVar2 = this.f122393c.f122948A;
                String str2 = jVar.f122278a;
                if (kVar2.f123048l != null) {
                    kVar2.f123048l.remove(str2);
                }
            }
            if (message.what == 18 && (message.obj instanceof C48756l)) {
                C48756l lVar2 = (C48756l) message.obj;
                C48649d dVar3 = lVar2.f122448c;
                C48903k kVar3 = this.f122393c.f122948A;
                String str3 = lVar2.f122278a;
                if (kVar3.f123045i == null) {
                    mVar = null;
                } else {
                    mVar = (C48708m) kVar3.f123045i.get(str3);
                }
                if (mVar != null) {
                    if (dVar3 == null) {
                        mVar.mo8638a(lVar2.f122447b);
                    } else {
                        mVar.mo73920a(lVar2.f122448c);
                    }
                    C48903k kVar4 = this.f122393c.f122948A;
                    String str4 = lVar2.f122278a;
                    if (kVar4.f123045i != null) {
                        kVar4.f123045i.remove(str4);
                    }
                }
            }
            if (message.what == 21 && (message.obj instanceof C48751g)) {
                C48751g gVar = (C48751g) message.obj;
                C48649d dVar4 = gVar.f122438c;
                C48903k kVar5 = this.f122393c.f122948A;
                String str5 = gVar.f122278a;
                if (kVar5.f123047k != null) {
                    fVar = (C48701f) kVar5.f123047k.get(str5);
                }
                if (fVar != null) {
                    if (dVar4 == null) {
                        fVar.mo8638a(gVar.f122437b);
                    } else {
                        fVar.mo59186a(dVar4);
                    }
                    C48903k kVar6 = this.f122393c.f122948A;
                    String str6 = gVar.f122278a;
                    if (kVar6.f123047k != null) {
                        kVar6.f123047k.remove(str6);
                    }
                }
            }
            if (message.what == 13 && (message.obj instanceof C48747c)) {
                C48747c cVar = (C48747c) message.obj;
                C48649d dVar5 = cVar.f122427c;
                C48903k kVar7 = this.f122393c.f122948A;
                String str7 = cVar.f122278a;
                if (kVar7.f123038b == null) {
                    kVar7.f123038b = new HashMap();
                }
                C48696a aVar = (C48696a) kVar7.f123038b.get(str7);
                if (aVar != null) {
                    if (dVar5 == null) {
                        aVar.mo8640a(cVar.f122426b);
                    } else {
                        aVar.mo8639a(dVar5);
                    }
                    C48903k kVar8 = this.f122393c.f122948A;
                    String str8 = cVar.f122278a;
                    if (kVar8.f123038b != null) {
                        kVar8.f123038b.remove(str8);
                    }
                }
            }
            if (message.what == 25 && (message.obj instanceof C48759o)) {
                C48759o oVar = (C48759o) message.obj;
                C48649d dVar6 = oVar.f122456c;
                C48903k kVar9 = this.f122393c.f122948A;
                String str9 = oVar.f122278a;
                if (kVar9.f123049m == null) {
                    kVar9.f123049m = new HashMap();
                }
                C48713r rVar = (C48713r) kVar9.f123049m.get(str9);
                if (rVar != null) {
                    if (dVar6 == null) {
                        rVar.mo8638a(oVar.f122455b);
                    }
                    C48903k kVar10 = this.f122393c.f122948A;
                    String str10 = oVar.f122278a;
                    if (kVar10.f123049m != null) {
                        kVar10.f123049m.remove(str10);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.ss.android.ugc.effectmanager.common.g.f] */
    /* JADX WARNING: type inference failed for: r9v2, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96294a(java.lang.String r8, boolean r9, com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g r10) {
        /*
            r7 = this;
            java.lang.String r6 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o.m105350a()
            com.ss.android.ugc.effectmanager.a.a r0 = r7.f122392b
            com.ss.android.ugc.effectmanager.g r0 = r0.f122047a
            com.ss.android.ugc.effectmanager.k r0 = r0.f122948A
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.c.g> r1 = r0.f123037a
            if (r1 != 0) goto L_0x0015
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f123037a = r1
        L_0x0015:
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.c.g> r0 = r0.f123037a
            r0.put(r6, r10)
            if (r9 == 0) goto L_0x002a
            com.ss.android.ugc.effectmanager.effect.e.b.b.j r9 = new com.ss.android.ugc.effectmanager.effect.e.b.b.j
            com.ss.android.ugc.effectmanager.a.a r1 = r7.f122392b
            android.os.Handler r4 = r7.f122394d
            r5 = 0
            r0 = r9
            r2 = r8
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0033
        L_0x002a:
            com.ss.android.ugc.effectmanager.effect.e.b.b.k r9 = new com.ss.android.ugc.effectmanager.effect.e.b.b.k
            com.ss.android.ugc.effectmanager.a.a r10 = r7.f122392b
            android.os.Handler r0 = r7.f122394d
            r9.<init>(r10, r8, r6, r0)
        L_0x0033:
            com.ss.android.ugc.effectmanager.g r8 = r7.f122393c
            com.ss.android.ugc.effectmanager.common.i r8 = r8.f122971q
            r8.mo96269a(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48733a.mo96294a(java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.c.g):java.lang.String");
    }

    /* renamed from: a */
    public final String mo96290a(String str, int i, int i2, C48708m mVar) {
        String a = C48679o.m105350a();
        this.f122392b.f122047a.f122948A.mo96701a(a, mVar);
        C48876q qVar = new C48876q(this.f122392b, a, str, i, i2, this.f122394d);
        this.f122393c.f122971q.mo96269a(qVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96292a(String str, String str2, int i, int i2, C48708m mVar) {
        String a = C48679o.m105350a();
        this.f122392b.f122047a.f122948A.mo96701a(a, mVar);
        C48880u uVar = new C48880u(this.f122392b, a, str, str2, i, i2, this.f122394d);
        this.f122393c.f122971q.mo96269a(uVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96293a(String str, String str2, int i, Map<String, String> map, C48696a aVar) {
        String a = C48679o.m105350a();
        C48903k kVar = this.f122392b.f122047a.f122948A;
        if (kVar.f123038b == null) {
            kVar.f123038b = new HashMap();
        }
        kVar.f123038b.put(a, aVar);
        C48856a aVar2 = new C48856a(this.f122392b, a, this.f122394d, str, str2, i, map);
        this.f122393c.f122971q.mo96269a(aVar2);
        return a;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96295a(java.lang.String r13, boolean r14, java.lang.String r15, int r16, int r17, boolean r18, com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l r19) {
        /*
            r12 = this;
            r0 = r12
            java.lang.String r10 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o.m105350a()
            com.ss.android.ugc.effectmanager.a.a r1 = r0.f122392b
            com.ss.android.ugc.effectmanager.g r1 = r1.f122047a
            com.ss.android.ugc.effectmanager.k r1 = r1.f122948A
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.c.l> r2 = r1.f123048l
            if (r2 != 0) goto L_0x0016
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f123048l = r2
        L_0x0016:
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.c.l> r1 = r1.f123048l
            r2 = r19
            r1.put(r10, r2)
            if (r18 == 0) goto L_0x002b
            com.ss.android.ugc.effectmanager.effect.e.b.b.o r1 = new com.ss.android.ugc.effectmanager.effect.e.b.b.o
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f122392b
            android.os.Handler r3 = r0.f122394d
            r4 = r13
            r1.<init>(r2, r13, r10, r3)
            r11 = r1
            goto L_0x003e
        L_0x002b:
            r4 = r13
            com.ss.android.ugc.effectmanager.effect.e.b.b.p r11 = new com.ss.android.ugc.effectmanager.effect.e.b.b.p
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f122392b
            android.os.Handler r9 = r0.f122394d
            r1 = r11
            r3 = r13
            r4 = r10
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x003e:
            com.ss.android.ugc.effectmanager.g r1 = r0.f122393c
            com.ss.android.ugc.effectmanager.common.i r1 = r1.f122971q
            r1.mo96269a(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48733a.mo96295a(java.lang.String, boolean, java.lang.String, int, int, boolean, com.ss.android.ugc.effectmanager.effect.c.l):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.ss.android.ugc.effectmanager.common.g.f] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.h] */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.g] */
    /* JADX WARNING: type inference failed for: r1v8, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.h] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.g] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v8, types: [com.ss.android.ugc.effectmanager.effect.e.b.b.h]
      assigns: [com.ss.android.ugc.effectmanager.effect.e.b.b.h, com.ss.android.ugc.effectmanager.effect.e.b.b.g]
      uses: [com.ss.android.ugc.effectmanager.effect.e.b.b.h, com.ss.android.ugc.effectmanager.common.g.f, com.ss.android.ugc.effectmanager.effect.e.b.b.g]
      mth insns count: 39
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96291a(java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, java.lang.String r19, boolean r20, com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f r21) {
        /*
            r13 = this;
            r0 = r13
            java.lang.String r11 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o.m105350a()
            com.ss.android.ugc.effectmanager.a.a r1 = r0.f122392b
            com.ss.android.ugc.effectmanager.g r1 = r1.f122047a
            com.ss.android.ugc.effectmanager.k r1 = r1.f122948A
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.c.f> r2 = r1.f123047k
            if (r2 != 0) goto L_0x0016
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f123047k = r2
        L_0x0016:
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.effect.c.f> r1 = r1.f123047k
            r2 = r21
            r1.put(r11, r2)
            if (r20 == 0) goto L_0x0035
            com.ss.android.ugc.effectmanager.effect.e.b.b.g r12 = new com.ss.android.ugc.effectmanager.effect.e.b.b.g
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f122392b
            android.os.Handler r10 = r0.f122394d
            r1 = r12
            r3 = r14
            r4 = r11
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x004a
        L_0x0035:
            com.ss.android.ugc.effectmanager.effect.e.b.b.h r12 = new com.ss.android.ugc.effectmanager.effect.e.b.b.h
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f122392b
            android.os.Handler r10 = r0.f122394d
            r1 = r12
            r3 = r14
            r4 = r11
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x004a:
            com.ss.android.ugc.effectmanager.g r1 = r0.f122393c
            com.ss.android.ugc.effectmanager.common.i r1 = r1.f122971q
            r1.mo96269a(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b.C48733a.mo96291a(java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean, com.ss.android.ugc.effectmanager.effect.c.f):java.lang.String");
    }
}
