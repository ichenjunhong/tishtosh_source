package com.p683ss.android.ugc.asve.sandbox.p1253d;

import android.os.IBinder;
import android.view.Surface;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.recorder.VERecorderImpl;
import com.p683ss.android.ugc.asve.sandbox.C20739c;
import com.p683ss.android.ugc.asve.sandbox.C20785h;
import com.p683ss.android.ugc.asve.sandbox.C20788i;
import com.p683ss.android.ugc.asve.sandbox.C20794k;
import com.p683ss.android.ugc.asve.sandbox.C20797l.C20798a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20626e.C20627a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20628f;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20682h;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20694l;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20697m;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20825d;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.runtime.C50771d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.f */
public final class C20763f extends C20798a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56656a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20763f.class), "recorder", "getRecorder()Lcom/ss/android/ugc/asve/recorder/IRecorder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20763f.class), "effectService", "getEffectService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteEffectService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20763f.class), "cameraService", "getCameraService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteCameraService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20763f.class), "mediaService", "getMediaService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteMediaService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20763f.class), "duetService", "getDuetService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteDuetService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20763f.class), "reactionService", "getReactionService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteReactionService;"))};

    /* renamed from: b */
    public final Future<C20764a> f56657b;

    /* renamed from: c */
    private final Map<IBinder, C19233b> f56658c = new LinkedHashMap();

    /* renamed from: d */
    private final C52668f f56659d;

    /* renamed from: e */
    private final C52668f f56660e;

    /* renamed from: f */
    private final C52668f f56661f;

    /* renamed from: g */
    private final C52668f f56662g;

    /* renamed from: h */
    private final C52668f f56663h;

    /* renamed from: i */
    private final C52668f f56664i;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$a */
    static final class C20764a {

        /* renamed from: a */
        public final C20484e f56665a;

        /* renamed from: b */
        public final C20757c f56666b;

        /* renamed from: c */
        public final C20753a f56667c;

        /* renamed from: d */
        public final C20758d f56668d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f56668d, (java.lang.Object) r3.f56668d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.p683ss.android.ugc.asve.sandbox.p1253d.C20763f.C20764a
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.f$a r3 = (com.p683ss.android.ugc.asve.sandbox.p1253d.C20763f.C20764a) r3
                com.ss.android.ugc.asve.recorder.e r0 = r2.f56665a
                com.ss.android.ugc.asve.recorder.e r1 = r3.f56665a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.c r0 = r2.f56666b
                com.ss.android.ugc.asve.sandbox.d.c r1 = r3.f56666b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.a r0 = r2.f56667c
                com.ss.android.ugc.asve.sandbox.d.a r1 = r3.f56667c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.d r0 = r2.f56668d
                com.ss.android.ugc.asve.sandbox.d.d r3 = r3.f56668d
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.sandbox.p1253d.C20763f.C20764a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C20484e eVar = this.f56665a;
            int i = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            C20757c cVar = this.f56666b;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
            C20753a aVar = this.f56667c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C20758d dVar = this.f56668d;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Components(recorder=");
            sb.append(this.f56665a);
            sb.append(", effectService=");
            sb.append(this.f56666b);
            sb.append(", cameraService=");
            sb.append(this.f56667c);
            sb.append(", mediaService=");
            sb.append(this.f56668d);
            sb.append(")");
            return sb.toString();
        }

        public C20764a(C20484e eVar, C20757c cVar, C20753a aVar, C20758d dVar) {
            C52711k.m112240b(eVar, "recorder");
            C52711k.m112240b(cVar, "effectService");
            C52711k.m112240b(aVar, "cameraService");
            C52711k.m112240b(dVar, "mediaService");
            this.f56665a = eVar;
            this.f56666b = cVar;
            this.f56667c = aVar;
            this.f56668d = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$b */
    static final class C20765b extends C52712l implements C52670a<C20753a> {

        /* renamed from: a */
        final /* synthetic */ C20763f f56669a;

        C20765b(C20763f fVar) {
            this.f56669a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C20764a) this.f56669a.f56657b.get()).f56667c;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$c */
    static final class C20766c<V> implements Callable<C20764a> {

        /* renamed from: a */
        final /* synthetic */ ASSandBoxRecorderContextWrapper f56670a;

        C20766c(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
            this.f56670a = aSSandBoxRecorderContextWrapper;
        }

        public final /* synthetic */ Object call() {
            VERecorderImpl vERecorderImpl = new VERecorderImpl(C20315a.m50093b(), new C20739c(this.f56670a), null);
            return new C20764a(vERecorderImpl, new C20757c(vERecorderImpl.mo43256d()), new C20753a(vERecorderImpl.mo43253b()), new C20758d(vERecorderImpl.mo43257e()));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$d */
    static final class C20767d extends C52712l implements C52670a<C20755b> {

        /* renamed from: a */
        final /* synthetic */ C20763f f56671a;

        C20767d(C20763f fVar) {
            this.f56671a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20755b(this.f56671a.mo44104n().mo43255c());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$e */
    static final class C20768e extends C52712l implements C52670a<C20757c> {

        /* renamed from: a */
        final /* synthetic */ C20763f f56672a;

        C20768e(C20763f fVar) {
            this.f56672a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C20764a) this.f56672a.f56657b.get()).f56666b;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$f */
    static final class C20769f extends C52712l implements C52670a<C20758d> {

        /* renamed from: a */
        final /* synthetic */ C20763f f56673a;

        C20769f(C20763f fVar) {
            this.f56673a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C20764a) this.f56673a.f56657b.get()).f56668d;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$g */
    static final class C20770g extends C52712l implements C52670a<C20762e> {

        /* renamed from: a */
        final /* synthetic */ C20763f f56674a;

        C20770g(C20763f fVar) {
            this.f56674a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20762e(this.f56674a.mo44104n().mo43258f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$h */
    static final class C20771h extends C52712l implements C52670a<C20484e> {

        /* renamed from: a */
        final /* synthetic */ C20763f f56675a;

        C20771h(C20763f fVar) {
            this.f56675a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C20764a) this.f56675a.f56657b.get()).f56665a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$i */
    static final class C20772i extends C52712l implements C52686q<Integer, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20682h f56676a;

        C20772i(C20682h hVar) {
            this.f56676a = hVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            String str = (String) obj3;
            C20682h hVar = this.f56676a;
            if (hVar != null) {
                hVar.mo43777a(intValue, intValue2, str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$j */
    static final class C20773j extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20697m f56677a;

        C20773j(C20697m mVar) {
            this.f56677a = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C20697m mVar = this.f56677a;
            if (mVar != null) {
                mVar.mo43778a(intValue);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$k */
    public static final class C20774k extends C50771d {

        /* renamed from: a */
        final /* synthetic */ C20825d f56678a;

        /* renamed from: b */
        final /* synthetic */ String f56679b;

        /* renamed from: a */
        public final String mo43564a() {
            String a = this.f56678a.mo43709a();
            C52711k.m112236a((Object) a, "resManager.segmentDirPath");
            return a;
        }

        /* renamed from: b */
        public final String mo43566b() {
            String b = this.f56678a.mo43711b();
            C52711k.m112236a((Object) b, "resManager.concatSegmentVideoPath");
            return b;
        }

        /* renamed from: c */
        public final String mo43568c() {
            String c = this.f56678a.mo43713c();
            C52711k.m112236a((Object) c, "resManager.concatSegmentAudioPath");
            return c;
        }

        /* renamed from: a */
        public final String mo43565a(int i) {
            String a = this.f56678a.mo43710a(i);
            C52711k.m112236a((Object) a, "resManager.genSegmentVideoPath(segmentIndex)");
            return a;
        }

        /* renamed from: b */
        public final String mo43567b(int i) {
            String b = this.f56678a.mo43712b(i);
            C52711k.m112236a((Object) b, "resManager.genSegmentAudioPath(segmentIndex)");
            return b;
        }

        C20774k(C20825d dVar, String str, String str2) {
            this.f56678a = dVar;
            this.f56679b = str;
            super(str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final C20753a mo44094d() {
        return (C20753a) this.f56661f.getValue();
    }

    /* renamed from: p */
    private final C20758d m52552p() {
        return (C20758d) this.f56662g.getValue();
    }

    /* renamed from: i */
    public final void mo44099i() {
        mo44094d();
    }

    /* renamed from: k */
    public final void mo44101k() {
        mo44094d();
    }

    /* renamed from: n */
    public final C20484e mo44104n() {
        return (C20484e) this.f56659d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public C20758d mo44095e() {
        return m52552p();
    }

    /* renamed from: a */
    public final void mo44085a() {
        mo44104n().mo43260h();
    }

    /* renamed from: b */
    public final void mo44091b() {
        mo44104n().release();
    }

    /* renamed from: c */
    public final /* synthetic */ C20788i mo44093c() {
        return (C20757c) this.f56660e.getValue();
    }

    /* renamed from: f */
    public final /* synthetic */ C20785h mo44096f() {
        return (C20755b) this.f56663h.getValue();
    }

    /* renamed from: g */
    public final /* synthetic */ C20794k mo44097g() {
        return (C20762e) this.f56664i.getValue();
    }

    /* renamed from: h */
    public final void mo44098h() {
        mo44094d().f56641d.onCreate();
    }

    /* renamed from: j */
    public final void mo44100j() {
        mo44094d().f56641d.onResume();
    }

    /* renamed from: l */
    public final void mo44102l() {
        mo44094d().f56641d.onStop();
    }

    /* renamed from: m */
    public final void mo44103m() {
        C20753a o = mo44094d();
        o.f56640c.clear();
        o.f56639b.clear();
        o.f56641d.onDestroy();
        Surface surface = mo44095e().f56650a;
        if (surface != null) {
            surface.release();
        }
        mo44091b();
    }

    /* renamed from: a */
    public final void mo44086a(C20670d dVar) {
        C50616e eVar;
        C20484e n = mo44104n();
        if (dVar != null) {
            eVar = C20628f.m51964a(dVar);
        } else {
            eVar = null;
        }
        n.mo43249a(eVar);
    }

    /* renamed from: a */
    public final void mo44087a(C20682h hVar) {
        mo44104n().mo43252a((C52686q<? super Integer, ? super Integer, ? super String, C52860x>) new C20772i<Object,Object,Object,C52860x>(hVar));
    }

    /* renamed from: a */
    public final void mo44089a(C20697m mVar) {
        mo44104n().mo43251a((C52671b<? super Integer, C52860x>) new C20773j<Object,C52860x>(mVar));
    }

    /* renamed from: b */
    public final void mo44092b(C20694l lVar) {
        C52711k.m112240b(lVar, "listener");
        C19233b bVar = (C19233b) this.f56658c.get(lVar.asBinder());
        if (bVar != null) {
            mo44104n().mo43254b(bVar);
            this.f56658c.remove(lVar.asBinder());
        }
    }

    public C20763f(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
        C52711k.m112240b(aSSandBoxRecorderContextWrapper, "context");
        this.f56657b = C20315a.m50092a().mo43147a().submit(new C20766c(aSSandBoxRecorderContextWrapper));
        this.f56659d = C52732g.m112285a(new C20771h(this));
        this.f56660e = C52732g.m112285a(new C20768e(this));
        this.f56661f = C52732g.m112285a(new C20765b(this));
        this.f56662g = C52732g.m112285a(new C20769f(this));
        this.f56663h = C52732g.m112285a(new C20767d(this));
        this.f56664i = C52732g.m112285a(new C20770g(this));
    }

    /* renamed from: a */
    public final void mo44088a(C20694l lVar) {
        C52711k.m112240b(lVar, "listener");
        if (this.f56658c.get(lVar.asBinder()) != null) {
            C20484e n = mo44104n();
            Object obj = this.f56658c.get(lVar.asBinder());
            if (obj == null) {
                C52711k.m112234a();
            }
            n.mo43248a((C19233b) obj);
            return;
        }
        C52711k.m112240b(lVar, "$this$toNativeInitListener");
        C19233b aVar = new C20627a(lVar);
        Map<IBinder, C19233b> map = this.f56658c;
        IBinder asBinder = lVar.asBinder();
        C52711k.m112236a((Object) asBinder, "listener.asBinder()");
        map.put(asBinder, aVar);
        mo44104n().mo43248a(aVar);
    }

    /* renamed from: a */
    public final void mo44090a(C20825d dVar, String str) {
        C52711k.m112240b(dVar, "resManager");
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        mo44104n().mo43250a(new C20774k(dVar, str, str), str);
    }
}
