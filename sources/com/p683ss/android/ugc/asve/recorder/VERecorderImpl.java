package com.p683ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1237a.C20316a;
import com.p683ss.android.ugc.asve.p1238b.C20337p;
import com.p683ss.android.ugc.asve.p1238b.C20340r;
import com.p683ss.android.ugc.asve.p1240d.C20372b;
import com.p683ss.android.ugc.asve.p1240d.C20375c;
import com.p683ss.android.ugc.asve.p1241e.C20397h;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.VECameraController;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.C20490c;
import com.p683ss.android.ugc.asve.recorder.p1244a.C20418b;
import com.p683ss.android.ugc.asve.recorder.p1244a.C20419c;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20431d;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import com.p683ss.android.ugc.asve.recorder.reaction.C20541c;
import com.p683ss.android.vesdk.C50595ad;
import com.p683ss.android.vesdk.C50595ad.C50596a;
import com.p683ss.android.vesdk.C50601ah;
import com.p683ss.android.vesdk.C50601ah.C50614c;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.C50636ap;
import com.p683ss.android.vesdk.VEAudioEncodeSettings;
import com.p683ss.android.vesdk.VEAudioEncodeSettings.C50523a;
import com.p683ss.android.vesdk.VEListener.C50559w;
import com.p683ss.android.vesdk.VEListener.C50560x;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p683ss.android.vesdk.p2531a.C50589a;
import com.p683ss.android.vesdk.p2531a.C50590b;
import com.p683ss.android.vesdk.runtime.C50771d;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52775l;
import p2628d.C52847n;
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

/* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl */
public final class VERecorderImpl implements C0183j, C20484e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f55950a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "realCameraController", "getRealCameraController()Lcom/ss/android/ugc/asve/recorder/camera/VECameraController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "duetController", "getDuetController()Lcom/ss/android/ugc/asve/recorder/duet/IDuetController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "recorder", "getRecorder()Lcom/ss/android/vesdk/VERecorder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "nativeInitListeners", "getNativeInitListeners()Ljava/util/concurrent/CopyOnWriteArrayList;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VERecorderImpl.class), "reactionController", "getReactionController()Lcom/ss/android/ugc/asve/recorder/reaction/IReactionController;"))};

    /* renamed from: b */
    public C52671b<? super Integer, C52860x> f55951b;

    /* renamed from: c */
    public C52686q<? super Integer, ? super Integer, ? super String, C52860x> f55952c;

    /* renamed from: d */
    public final Context f55953d;

    /* renamed from: e */
    public final C20363h f55954e;

    /* renamed from: f */
    public final C0184k f55955f;

    /* renamed from: g */
    private final C52668f f55956g = C52732g.m112285a(new C20414g(this));

    /* renamed from: h */
    private final C52668f f55957h = C52732g.m112285a(new C20409b(this));

    /* renamed from: i */
    private final C52668f f55958i = C52732g.m112285a(new C20410c(this));

    /* renamed from: j */
    private final C52668f f55959j = C52732g.m112285a(new C20408a(this));

    /* renamed from: k */
    private final C52668f f55960k = C52732g.m112285a(new C20415h(this));

    /* renamed from: l */
    private final C20375c f55961l = new C20375c(mo43261i());

    /* renamed from: m */
    private final C52668f f55962m = C52732g.m112285a(C20412e.f55971a);

    /* renamed from: n */
    private final C52668f f55963n;

    /* renamed from: o */
    private final C52668f f55964o;

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$a */
    static final class C20408a extends C52712l implements C52670a<VECameraController> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55967a;

        C20408a(VERecorderImpl vERecorderImpl) {
            this.f55967a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f55967a.mo43246a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$b */
    static final class C20409b extends C52712l implements C52670a<C20419c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55968a;

        C20409b(VERecorderImpl vERecorderImpl) {
            this.f55968a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20419c(this.f55968a.mo43261i());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$c */
    static final class C20410c extends C52712l implements C52670a<C20490c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55969a;

        C20410c(VERecorderImpl vERecorderImpl) {
            this.f55969a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20490c(this.f55969a.mo43261i());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$d */
    static final class C20411d extends C52712l implements C52670a<C20431d> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55970a;

        C20411d(VERecorderImpl vERecorderImpl) {
            this.f55970a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20431d(this.f55970a.mo43261i(), this.f55970a.f55954e, this.f55970a.mo43246a().f56036m);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$e */
    static final class C20412e extends C52712l implements C52670a<CopyOnWriteArrayList<C19233b>> {

        /* renamed from: a */
        public static final C20412e f55971a = new C20412e();

        C20412e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$f */
    static final class C20413f extends C52712l implements C52670a<C20541c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55972a;

        C20413f(VERecorderImpl vERecorderImpl) {
            this.f55972a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C20541c cVar = new C20541c(this.f55972a.mo43261i(), this.f55972a.f55953d, this.f55972a, this.f55972a.f55954e.mo43121e(), this.f55972a.f55954e.mo43127k());
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$g */
    static final class C20414g extends C52712l implements C52670a<VECameraController> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55973a;

        C20414g(VERecorderImpl vERecorderImpl) {
            this.f55973a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            VECameraController vECameraController = new VECameraController(this.f55973a.f55953d, this.f55973a.f55955f, this.f55973a.mo43261i(), this.f55973a, this.f55973a.f55954e.mo43129m());
            return vECameraController;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$h */
    static final class C20415h extends C52712l implements C52670a<C50601ah> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55974a;

        C20415h(VERecorderImpl vERecorderImpl) {
            this.f55974a = vERecorderImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C50601ah(new C20530m(this.f55974a.f55954e.mo43120d()), this.f55974a.f55953d.getApplicationContext());
        }
    }

    /* renamed from: a */
    public final VECameraController mo43246a() {
        return (VECameraController) this.f55956g.getValue();
    }

    /* renamed from: a */
    public final void mo43247a(Context context) {
        C52711k.m112240b(context, "context");
    }

    /* renamed from: b */
    public final C20457b mo43253b() {
        return (C20457b) this.f55959j.getValue();
    }

    /* renamed from: c */
    public final C20418b mo43255c() {
        return (C20418b) this.f55957h.getValue();
    }

    /* renamed from: d */
    public final C20489b mo43256d() {
        return (C20489b) this.f55958i.getValue();
    }

    /* renamed from: e */
    public final C20426a mo43257e() {
        return (C20426a) this.f55963n.getValue();
    }

    /* renamed from: f */
    public final C20531a mo43258f() {
        return (C20531a) this.f55964o.getValue();
    }

    /* renamed from: h */
    public final void mo43260h() {
    }

    /* renamed from: i */
    public final C50601ah mo43261i() {
        return (C50601ah) this.f55960k.getValue();
    }

    /* renamed from: j */
    public final CopyOnWriteArrayList<C19233b> mo43262j() {
        return (CopyOnWriteArrayList) this.f55962m.getValue();
    }

    /* renamed from: g */
    public final C20372b mo43259g() {
        return this.f55961l;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void release() {
        C20317b.f55815a.mo42962c("camera ON_DESTROY ");
        mo43261i().mo98877n();
    }

    /* renamed from: a */
    public final void mo43248a(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo43262j().add(bVar);
    }

    /* renamed from: b */
    public final void mo43254b(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo43262j().remove(bVar);
    }

    /* renamed from: a */
    public final void mo43249a(C50616e eVar) {
        mo43261i().mo98800a(eVar);
    }

    /* renamed from: a */
    public final void mo43251a(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        this.f55951b = bVar;
    }

    /* renamed from: a */
    public final void mo43252a(C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar) {
        C52711k.m112240b(qVar, "callback");
        this.f55952c = qVar;
    }

    /* renamed from: a */
    public final void mo43250a(C50771d dVar, String str) {
        C52711k.m112240b(dVar, "resManager");
        C52711k.m112240b(str, "workSpacePath");
        mo43261i().mo98762a(dVar);
    }

    public VERecorderImpl(Context context, C20363h hVar, C0184k kVar) {
        boolean z;
        ENCODE_PROFILE encode_profile;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hVar, "recorderContext");
        this.f55953d = context;
        this.f55954e = hVar;
        this.f55955f = kVar;
        if (this.f55954e.mo43129m().mo43114f()) {
            C20529l lVar = new C20529l(this);
            C52711k.m112240b(lVar, "$this$initRightNow");
            lVar.get();
        }
        C20397h.m50605a(new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ VERecorderImpl f55965a;

            {
                this.f55965a = r1;
            }

            public final /* synthetic */ Object invoke() {
                C0184k kVar = this.f55965a.f55955f;
                if (kVar != null) {
                    C0176h lifecycle = kVar.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.mo324a(this.f55965a);
                    }
                }
                return C52860x.f131107a;
            }
        });
        C50636ap apVar = new C50636ap();
        apVar.f126947a = this.f55954e.mo43128l().mo43136a();
        apVar.f126948b = this.f55954e.mo43128l().mo43137b();
        mo43261i().mo98805a(apVar);
        mo43261i().mo98815a(this.f55954e.mo43122f());
        mo43261i().mo98796a((C50560x) new C50559w(this) {

            /* renamed from: a */
            final /* synthetic */ VERecorderImpl f55966a;

            {
                this.f55966a = r1;
            }

            /* renamed from: a */
            public final void mo43266a(boolean z) {
                for (C19233b a : this.f55966a.mo43262j()) {
                    a.mo39625a(z ? 1 : 0, 1);
                }
            }

            /* renamed from: b */
            public final void mo43267b(int i, String str) {
                C52711k.m112240b(str, "msg");
                C52671b<? super Integer, C52860x> bVar = this.f55966a.f55951b;
                if (bVar == null) {
                    C52711k.m112237a("runningErrorCallback");
                }
                bVar.invoke(Integer.valueOf(i));
            }

            /* renamed from: a */
            public final void mo43265a(int i, String str) {
                for (C19233b a : this.f55966a.mo43262j()) {
                    a.mo39624a(i);
                }
                if (i == 0) {
                    this.f55966a.mo43261i().mo98760a((C50614c) new C20316a());
                }
            }

            /* renamed from: a */
            public final void mo43264a(int i, int i2, String str) {
                boolean z = false;
                if (i == 1000) {
                    C20457b b = this.f55966a.mo43253b();
                    if (b != null) {
                        VECameraController vECameraController = (VECameraController) b;
                        synchronized (vECameraController.f56031h) {
                            vECameraController.f56032i = true;
                            if (vECameraController.f56034k) {
                                vECameraController.f56045v.mo98797a((C50590b) vECameraController.f56035l);
                                z = true;
                            }
                            vECameraController.f56033j = z;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                    }
                } else if (i == 1001) {
                    C20457b b2 = this.f55966a.mo43253b();
                    if (b2 != null) {
                        VECameraController vECameraController2 = (VECameraController) b2;
                        synchronized (vECameraController2.f56031h) {
                            vECameraController2.f56032i = false;
                            if (vECameraController2.f56033j) {
                                vECameraController2.f56045v.mo98873l();
                                vECameraController2.f56033j = false;
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                    }
                } else if (i == 1040) {
                    C20526i.f56237a = Integer.valueOf(i2);
                } else if (i == 1041) {
                    C20526i.f56238b = Integer.valueOf(i2);
                }
                C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar = this.f55966a.f55952c;
                if (qVar != null) {
                    qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), str);
                }
            }
        });
        C50601ah i = mo43261i();
        C20363h hVar2 = this.f55954e;
        C52711k.m112240b(hVar2, "recorderContext");
        C50585a aVar = new C50585a(1);
        String c = hVar2.mo43126j().mo43175c();
        String b = hVar2.mo43126j().mo43174b();
        if (c.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b.length();
        }
        aVar.mo98710b(hVar2.mo43128l().mo43139d());
        C52847n e = hVar2.mo43121e();
        aVar.mo98707b((int) (hVar2.mo43128l().mo43138c() * 1024.0f * 1024.0f));
        C20337p f = hVar2.mo43128l().mo43141f();
        C52711k.m112240b(f, "$this$toVEEncodeProfile");
        switch (C20340r.f55832a[f.ordinal()]) {
            case 1:
                encode_profile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
                break;
            case 2:
                encode_profile = ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
                break;
            case 3:
                encode_profile = ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
                break;
            case 4:
                encode_profile = ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
                break;
            default:
                throw new C52775l();
        }
        aVar.mo98698a(encode_profile);
        aVar.mo98713d(hVar2.mo43128l().mo43140e());
        int intValue = ((Number) e.getFirst()).intValue();
        int intValue2 = ((Number) e.getSecond()).intValue();
        C20317b bVar = C20317b.f55815a;
        StringBuilder sb = new StringBuilder("setVideoRes:  width = ");
        sb.append(intValue);
        sb.append("  height = ");
        sb.append(intValue2);
        sb.append(' ');
        bVar.mo42963d(sb.toString());
        aVar.mo98692a(intValue, intValue2);
        aVar.mo98712c(hVar2.mo43128l().mo43142g());
        aVar.mo98709b(hVar2.mo43128l().mo43143h());
        VEVideoEncodeSettings a = aVar.mo98705a();
        C52711k.m112236a((Object) a, "VEVideoEncodeSettings\n  …iption)\n        }.build()");
        VEAudioEncodeSettings a2 = new C50523a().mo98461a();
        C52711k.m112236a((Object) a2, "VEAudioEncodeSettings\n  …pply {\n\n        }.Build()");
        C20363h hVar3 = this.f55954e;
        C52711k.m112240b(hVar3, "recorderContext");
        C50596a aVar2 = new C50596a();
        aVar2.mo98741a(hVar3.mo43133q());
        aVar2.mo98743c(true);
        if (!hVar3.mo43134r() || hVar3.mo43135s() == 0) {
            aVar2.mo98744d(true);
        } else {
            aVar2.mo98747g(true);
            aVar2.mo98744d(false);
            aVar2.mo98739a(hVar3.mo43135s());
        }
        aVar2.mo98745e(true);
        aVar2.mo98742b(hVar3.mo43124h());
        if (hVar3.mo43129m().mo43116h().length == 2) {
            aVar2.mo98740a(new VESize(hVar3.mo43129m().mo43116h()[0], hVar3.mo43129m().mo43116h()[1]));
        }
        aVar2.mo98746f(hVar3.mo43132p());
        aVar2.mo98743c(true ^ hVar3.mo43126j().mo43178f());
        C50595ad adVar = aVar2.f126867a;
        C52711k.m112236a((Object) adVar, "VEPreviewSettings\n      …Layout)\n        }.build()");
        i.mo98759a((C50589a) null, a, a2, adVar);
        this.f55963n = C52732g.m112285a(new C20411d(this));
        this.f55964o = C52732g.m112285a(new C20413f(this));
    }
}
