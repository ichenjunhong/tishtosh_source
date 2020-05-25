package com.p683ss.android.ugc.asve.recorder;

import android.content.Context;
import android.opengl.EGLContext;
import com.p683ss.android.medialib.FaceBeautyInvoker;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.medialib.log.IMonitor;
import com.p683ss.android.medialib.model.C19350a;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.medialib.presenter.C19361d.C19375b;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1240d.C20371a;
import com.p683ss.android.ugc.asve.p1240d.C20372b;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.effect.C20485a;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1244a.C20417a;
import com.p683ss.android.ugc.asve.recorder.p1244a.C20418b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20427b;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import com.p683ss.android.ugc.asve.recorder.reaction.C20539b;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.runtime.C50771d;
import java.util.concurrent.CopyOnWriteArrayList;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.h */
public final class C20516h implements C20484e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56216a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20516h.class), "nativeInitListeners", "getNativeInitListeners()Ljava/util/concurrent/CopyOnWriteArrayList;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20516h.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20516h.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20516h.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20516h.class), "reactionController", "getReactionController()Lcom/ss/android/ugc/asve/recorder/reaction/IReactionController;"))};

    /* renamed from: b */
    public final Context f56217b;

    /* renamed from: c */
    public final C19361d f56218c;

    /* renamed from: d */
    private final C52668f f56219d;

    /* renamed from: e */
    private final C20521d f56220e;

    /* renamed from: f */
    private final C52668f f56221f;

    /* renamed from: g */
    private final C52668f f56222g;

    /* renamed from: h */
    private final C52668f f56223h;

    /* renamed from: i */
    private final C52668f f56224i;

    /* renamed from: com.ss.android.ugc.asve.recorder.h$a */
    static final class C20518a extends C52712l implements C52670a<C20505g> {

        /* renamed from: a */
        final /* synthetic */ C20516h f56226a;

        /* renamed from: b */
        final /* synthetic */ C20363h f56227b;

        C20518a(C20516h hVar, C20363h hVar2) {
            this.f56226a = hVar;
            this.f56227b = hVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20505g(this.f56226a.f56217b, this.f56226a, this.f56227b.mo43129m(), this.f56226a.f56218c);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$b */
    static final class C20519b extends C52712l implements C52670a<C20485a> {

        /* renamed from: a */
        final /* synthetic */ C20516h f56228a;

        C20519b(C20516h hVar) {
            this.f56228a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20485a(this.f56228a.f56218c);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$c */
    static final class C20520c extends C52712l implements C52670a<C20427b> {

        /* renamed from: a */
        final /* synthetic */ C20516h f56229a;

        /* renamed from: b */
        final /* synthetic */ C20363h f56230b;

        C20520c(C20516h hVar, C20363h hVar2) {
            this.f56229a = hVar;
            this.f56230b = hVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20427b(this.f56229a.f56218c, this.f56230b);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$d */
    public static final class C20521d implements C19233b {

        /* renamed from: a */
        final /* synthetic */ C20516h f56231a;

        C20521d(C20516h hVar) {
            this.f56231a = hVar;
        }

        /* renamed from: a */
        public final void mo39624a(int i) {
            for (C19233b a : this.f56231a.mo43562a()) {
                a.mo39624a(i);
            }
        }

        /* renamed from: a */
        public final void mo39625a(int i, int i2) {
            for (C19233b a : this.f56231a.mo43562a()) {
                a.mo39625a(i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$e */
    static final class C20522e extends C52712l implements C52670a<CopyOnWriteArrayList<C19233b>> {

        /* renamed from: a */
        public static final C20522e f56232a = new C20522e();

        C20522e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$f */
    static final class C20523f extends C52712l implements C52670a<C20539b> {

        /* renamed from: a */
        final /* synthetic */ C20516h f56233a;

        /* renamed from: b */
        final /* synthetic */ C20363h f56234b;

        C20523f(C20516h hVar, C20363h hVar2) {
            this.f56233a = hVar;
            this.f56234b = hVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C20539b bVar = new C20539b(this.f56233a.f56218c, this.f56233a.f56217b, this.f56233a, this.f56234b.mo43121e(), this.f56234b.mo43127k());
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$g */
    public static final class C20524g implements OnRunningErrorCallback {

        /* renamed from: a */
        final /* synthetic */ C52671b f56235a;

        public final void onInfo(int i, int i2) {
        }

        C20524g(C52671b bVar) {
            this.f56235a = bVar;
        }

        public final void onError(int i) {
            this.f56235a.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.h$h */
    public static final class C20525h implements C19375b {

        /* renamed from: a */
        final /* synthetic */ C50616e f56236a;

        public final boolean cx_() {
            return this.f56236a.mo43762a();
        }

        C20525h(C50616e eVar) {
            this.f56236a = eVar;
        }

        /* renamed from: a */
        public final void mo40419a(C19350a aVar) {
            EGLContext eGLContext;
            int i;
            int i2;
            int i3;
            int i4;
            long j;
            C50616e eVar = this.f56236a;
            if (aVar != null) {
                eGLContext = aVar.f53491a;
            } else {
                eGLContext = null;
            }
            if (aVar != null) {
                i = aVar.f53492b;
            } else {
                i = 0;
            }
            if (aVar != null) {
                i2 = aVar.f53493c;
            } else {
                i2 = 0;
            }
            if (aVar != null) {
                i3 = aVar.f53494d;
            } else {
                i3 = 0;
            }
            if (aVar != null) {
                i4 = aVar.f53495e;
            } else {
                i4 = 0;
            }
            if (aVar != null) {
                j = aVar.f53496f;
            } else {
                j = 0;
            }
            eVar.mo43761a(eGLContext, i, i2, i3, i4, j);
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C19233b> mo43562a() {
        return (CopyOnWriteArrayList) this.f56219d.getValue();
    }

    /* renamed from: a */
    public final void mo43250a(C50771d dVar, String str) {
        C52711k.m112240b(dVar, "resManager");
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
    }

    /* renamed from: a */
    public final void mo43252a(C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar) {
        C52711k.m112240b(qVar, "callback");
    }

    /* renamed from: b */
    public final C20457b mo43253b() {
        return (C20457b) this.f56222g.getValue();
    }

    /* renamed from: d */
    public final C20489b mo43256d() {
        return (C20489b) this.f56223h.getValue();
    }

    /* renamed from: e */
    public final C20426a mo43257e() {
        return (C20426a) this.f56221f.getValue();
    }

    /* renamed from: f */
    public final C20531a mo43258f() {
        return (C20531a) this.f56224i.getValue();
    }

    public final void release() {
    }

    /* renamed from: g */
    public final C20372b mo43259g() {
        return new C20371a();
    }

    /* renamed from: h */
    public final void mo43260h() {
        this.f56218c.mo40367f();
    }

    /* renamed from: c */
    public final C20418b mo43255c() {
        return new C20417a(this.f56218c);
    }

    /* renamed from: a */
    public final void mo43247a(Context context) {
        C52711k.m112240b(context, "context");
        this.f56218c.mo40287a(context);
    }

    /* renamed from: b */
    public final void mo43254b(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo43562a().remove(bVar);
        if (mo43562a().isEmpty()) {
            FaceBeautyInvoker.setNativeInitListener(null);
        }
    }

    /* renamed from: a */
    public final void mo43248a(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo43562a().add(bVar);
        FaceBeautyInvoker.setNativeInitListener(this.f56220e);
    }

    /* renamed from: a */
    public final void mo43249a(C50616e eVar) {
        if (eVar == null) {
            this.f56218c.mo40297a((C19375b) null);
        } else {
            this.f56218c.mo40297a((C19375b) new C20525h(eVar));
        }
    }

    /* renamed from: a */
    public final void mo43251a(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        this.f56218c.mo40293a((OnRunningErrorCallback) new C20524g(bVar));
    }

    private C20516h(Context context, C19361d dVar, C20363h hVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(dVar, "mediaRecordPresenter");
        C52711k.m112240b(hVar, "recorderContext");
        this.f56217b = context;
        this.f56218c = dVar;
        this.f56219d = C52732g.m112285a(C20522e.f56232a);
        this.f56220e = new C20521d(this);
        this.f56218c.mo40328b(hVar.mo43128l().mo43137b());
        this.f56218c.mo40295a((IMonitor) C205171.f56225a);
        this.f56221f = C52732g.m112285a(new C20520c(this, hVar));
        this.f56222g = C52732g.m112285a(new C20518a(this, hVar));
        this.f56223h = C52732g.m112285a(new C20519b(this));
        this.f56224i = C52732g.m112285a(new C20523f(this, hVar));
    }

    public /* synthetic */ C20516h(Context context, C19361d dVar, C20363h hVar, int i, C52707g gVar) {
        this(context, new C19361d(), hVar);
    }
}
