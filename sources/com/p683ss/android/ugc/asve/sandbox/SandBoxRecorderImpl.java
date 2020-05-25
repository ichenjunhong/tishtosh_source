package com.p683ss.android.ugc.asve.sandbox;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1240d.C20371a;
import com.p683ss.android.ugc.asve.p1240d.C20372b;
import com.p683ss.android.ugc.asve.p1241e.C20397h;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1244a.C20418b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20628f;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20638m;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20643r;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20644s;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20682h;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20694l;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20697m;
import com.p683ss.android.ugc.asve.sandbox.p1252c.C20745a;
import com.p683ss.android.ugc.asve.sandbox.p1252c.C20747b;
import com.p683ss.android.ugc.asve.sandbox.p1252c.C20749c;
import com.p683ss.android.ugc.asve.sandbox.p1252c.C20750d;
import com.p683ss.android.ugc.asve.sandbox.p1252c.C20751e;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20825d.C20826a;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.runtime.C50771d;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
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

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl */
public final class SandBoxRecorderImpl implements C0183j, C20484e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56375a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SandBoxRecorderImpl.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SandBoxRecorderImpl.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SandBoxRecorderImpl.class), "reactionController", "getReactionController()Lcom/ss/android/ugc/asve/recorder/reaction/IReactionController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SandBoxRecorderImpl.class), "duetController", "getDuetController()Lcom/ss/android/ugc/asve/recorder/duet/IDuetController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SandBoxRecorderImpl.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;"))};

    /* renamed from: b */
    public final C20797l f56376b;

    /* renamed from: c */
    public final C20363h f56377c;

    /* renamed from: d */
    public final C0184k f56378d;

    /* renamed from: e */
    private C52686q<? super Integer, ? super Integer, ? super String, C52860x> f56379e;

    /* renamed from: f */
    private final C52668f f56380f;

    /* renamed from: g */
    private final C52668f f56381g;

    /* renamed from: h */
    private final C52668f f56382h;

    /* renamed from: i */
    private final C52668f f56383i;

    /* renamed from: j */
    private final C52668f f56384j;

    /* renamed from: k */
    private C52671b<? super Integer, C52860x> f56385k;

    /* renamed from: l */
    private final Map<C19233b, C20638m> f56386l;

    /* renamed from: m */
    private C50616e f56387m;

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$a */
    static final class C20573a extends C52712l implements C52670a<C20745a> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56389a;

        C20573a(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56389a = sandBoxRecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20745a(this.f56389a.f56376b.mo44094d(), this.f56389a.f56377c.mo43129m());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$b */
    static final class C20574b extends C52712l implements C52670a<C20747b> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56390a;

        C20574b(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56390a = sandBoxRecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20747b(this.f56390a.f56376b.mo44096f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$c */
    static final class C20575c extends C52712l implements C52670a<C20749c> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56391a;

        C20575c(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56391a = sandBoxRecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20749c(this.f56391a.f56376b.mo44093c());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$d */
    static final class C20576d extends C52712l implements C52670a<C20750d> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56392a;

        C20576d(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56392a = sandBoxRecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C20791j e = this.f56392a.f56376b.mo44095e();
            String absolutePath = this.f56392a.f56377c.mo43120d().mo43192e().getAbsolutePath();
            C52711k.m112236a((Object) absolutePath, "recoderContext.workspace…er.photoPath.absolutePath");
            return new C20750d(e, absolutePath);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$e */
    static final class C20577e extends C52712l implements C52670a<C20751e> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56393a;

        C20577e(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56393a = sandBoxRecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20751e(this.f56393a.f56376b.mo44097g(), this.f56393a.f56377c.mo43127k());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$f */
    public static final class C20578f extends C20826a {

        /* renamed from: a */
        final /* synthetic */ C50771d f56394a;

        /* renamed from: a */
        public final String mo43709a() {
            String a = this.f56394a.mo43564a();
            C52711k.m112236a((Object) a, "resManager.segmentDirPath");
            return a;
        }

        /* renamed from: b */
        public final String mo43711b() {
            String b = this.f56394a.mo43566b();
            C52711k.m112236a((Object) b, "resManager.concatSegmentVideoPath");
            return b;
        }

        /* renamed from: c */
        public final String mo43713c() {
            String c = this.f56394a.mo43568c();
            C52711k.m112236a((Object) c, "resManager.concatSegmentAudioPath");
            return c;
        }

        C20578f(C50771d dVar) {
            this.f56394a = dVar;
        }

        /* renamed from: a */
        public final String mo43710a(int i) {
            String a = this.f56394a.mo43565a(i);
            C52711k.m112236a((Object) a, "resManager.genSegmentVideoPath(segmentIndex)");
            return a;
        }

        /* renamed from: b */
        public final String mo43712b(int i) {
            String b = this.f56394a.mo43567b(i);
            C52711k.m112236a((Object) b, "resManager.genSegmentAudioPath(segmentIndex)");
            return b;
        }
    }

    /* renamed from: a */
    public final void mo43247a(Context context) {
        C52711k.m112240b(context, "context");
    }

    /* renamed from: b */
    public final C20457b mo43253b() {
        return (C20457b) this.f56381g.getValue();
    }

    /* renamed from: c */
    public final C20418b mo43255c() {
        return (C20418b) this.f56383i.getValue();
    }

    /* renamed from: d */
    public final C20489b mo43256d() {
        return (C20489b) this.f56380f.getValue();
    }

    /* renamed from: e */
    public final C20426a mo43257e() {
        return (C20426a) this.f56384j.getValue();
    }

    /* renamed from: f */
    public final C20531a mo43258f() {
        return (C20531a) this.f56382h.getValue();
    }

    /* renamed from: g */
    public final C20372b mo43259g() {
        return new C20371a();
    }

    /* renamed from: h */
    public final void mo43260h() {
        this.f56376b.mo44085a();
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        C20317b.f55815a.mo42962c("camera ON_CREATE ");
        this.f56376b.mo44098h();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C20317b.f55815a.mo42962c("camera ON_DESTROY ");
        this.f56376b.mo44103m();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        C20317b.f55815a.mo42962c("camera ON_PAUSE ");
        this.f56376b.mo44101k();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        C20317b.f55815a.mo42962c("camera ON_RESUME ");
        this.f56376b.mo44100j();
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        C20317b.f55815a.mo42962c("camera ON_START ");
        this.f56376b.mo44099i();
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        C20317b.f55815a.mo42962c("camera ON_STOP ");
        this.f56376b.mo44102l();
    }

    public final void release() {
        this.f56387m = null;
        this.f56385k = null;
        this.f56386l.clear();
        mo43253b().mo43338a();
        mo43257e().mo43320j();
        C20489b d = mo43256d();
        if (d != null) {
            C20749c cVar = (C20749c) d;
            cVar.f56622j.clear();
            cVar.f56614a.clear();
            cVar.f56617e = null;
            cVar.f56619g = null;
            cVar.f56615b = null;
            cVar.f56620h = null;
            cVar.f56621i = null;
            cVar.f56616d = null;
            cVar.f56618f = null;
            this.f56376b.mo44091b();
            this.f56376b.mo44086a((C20670d) null);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.proxy.SandBoxEffectServiceProxy");
    }

    /* renamed from: a */
    public final void mo43249a(C50616e eVar) {
        this.f56387m = eVar;
        if (this.f56387m == null) {
            this.f56376b.mo44086a((C20670d) null);
            return;
        }
        C20797l lVar = this.f56376b;
        C50616e eVar2 = this.f56387m;
        if (eVar2 == null) {
            C52711k.m112234a();
        }
        lVar.mo44086a((C20670d) C20628f.m51963a(eVar2));
    }

    /* renamed from: b */
    public final void mo43254b(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        C20638m mVar = (C20638m) this.f56386l.get(bVar);
        if (mVar != null) {
            this.f56376b.mo44092b(mVar);
            this.f56386l.remove(bVar);
        }
    }

    /* renamed from: a */
    public final void mo43248a(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        if (this.f56386l.get(bVar) != null) {
            this.f56376b.mo44088a((C20694l) this.f56386l.get(bVar));
            return;
        }
        C20638m mVar = new C20638m(bVar);
        this.f56386l.put(bVar, mVar);
        this.f56376b.mo44088a((C20694l) mVar);
    }

    /* renamed from: a */
    public final void mo43251a(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        this.f56385k = bVar;
        this.f56376b.mo44089a((C20697m) new C20644s(bVar));
    }

    /* renamed from: a */
    public final void mo43252a(C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar) {
        C20643r rVar;
        C52711k.m112240b(qVar, "callback");
        this.f56379e = qVar;
        C20797l lVar = this.f56376b;
        C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar2 = this.f56379e;
        if (qVar2 != null) {
            C52711k.m112240b(qVar2, "$this$stub");
            rVar = new C20643r(qVar2);
        } else {
            rVar = null;
        }
        lVar.mo44087a((C20682h) rVar);
    }

    /* renamed from: a */
    public final void mo43250a(C50771d dVar, String str) {
        C52711k.m112240b(dVar, "resManager");
        C52711k.m112240b(str, "workSpacePath");
        this.f56376b.mo44090a(new C20578f(dVar), str);
    }

    public SandBoxRecorderImpl(C20797l lVar, C20363h hVar, C0184k kVar) {
        C52711k.m112240b(lVar, "remoteRecoder");
        C52711k.m112240b(hVar, "recoderContext");
        this.f56377c = hVar;
        this.f56378d = kVar;
        C20397h.m50605a(new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ SandBoxRecorderImpl f56388a;

            {
                this.f56388a = r1;
            }

            public final /* synthetic */ Object invoke() {
                C0184k kVar = this.f56388a.f56378d;
                if (kVar != null) {
                    C0176h lifecycle = kVar.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.mo324a(this.f56388a);
                    }
                }
                return C52860x.f131107a;
            }
        });
        Object newProxyInstance = Proxy.newProxyInstance(C20797l.class.getClassLoader(), new Class[]{C20797l.class}, new C20752d(lVar));
        if (newProxyInstance != null) {
            this.f56376b = (C20797l) newProxyInstance;
            this.f56380f = C52732g.m112285a(new C20575c(this));
            this.f56381g = C52732g.m112285a(new C20573a(this));
            this.f56382h = C52732g.m112285a(new C20577e(this));
            this.f56383i = C52732g.m112285a(new C20574b(this));
            this.f56384j = C52732g.m112285a(new C20576d(this));
            this.f56386l = new LinkedHashMap();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
    }
}
