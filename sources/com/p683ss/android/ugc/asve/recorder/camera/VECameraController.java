package com.p683ss.android.ugc.asve.recorder.camera;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ttvecamera.C20275l.C20277b;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.p1241e.C20379a;
import com.p683ss.android.ugc.asve.p1241e.C20397h;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20469d;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20476i;
import com.p683ss.android.vesdk.C50594ac;
import com.p683ss.android.vesdk.C50601ah;
import com.p683ss.android.vesdk.C50601ah.C50619g;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import com.p683ss.android.vesdk.C50704j;
import com.p683ss.android.vesdk.VECameraSettings;
import com.p683ss.android.vesdk.VECameraSettings.C50532a;
import com.p683ss.android.vesdk.VEListener.C50543g;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.p2531a.C50590b;
import com.p683ss.android.vesdk.utils.C50786b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController */
public final class VECameraController implements C0183j, C20457b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56014a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VECameraController.class), "wideCameraComponent", "getWideCameraComponent()Lcom/ss/android/ugc/asve/recorder/camera/widecamera/IWideCamera;"))};

    /* renamed from: A */
    private final int f56015A = 720;

    /* renamed from: B */
    private final int f56016B = 1280;

    /* renamed from: C */
    private boolean f56017C;

    /* renamed from: D */
    private final C52668f f56018D = C52732g.m112285a(new C20452g(this));

    /* renamed from: E */
    private boolean f56019E = true;

    /* renamed from: F */
    private final List<Integer> f56020F = new ArrayList();

    /* renamed from: G */
    private final SparseIntArray f56021G;

    /* renamed from: H */
    private boolean f56022H;

    /* renamed from: I */
    private final C20484e f56023I;

    /* renamed from: J */
    private final C20355c f56024J;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C19269a> f56025b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final CopyOnWriteArrayList<C19279a> f56026c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public final CopyOnWriteArrayList<C19263c> f56027d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    C19358a f56028e;

    /* renamed from: f */
    public boolean f56029f;

    /* renamed from: g */
    public int f56030g = -1;

    /* renamed from: h */
    public final Object f56031h = new Object();

    /* renamed from: i */
    public boolean f56032i;

    /* renamed from: j */
    public boolean f56033j;

    /* renamed from: k */
    public boolean f56034k;

    /* renamed from: l */
    public final C50704j f56035l = new C50704j();

    /* renamed from: m */
    public VECameraSettings f56036m = C20379a.m50557a(this.f56024J);

    /* renamed from: n */
    public float f56037n = -1.0f;

    /* renamed from: o */
    public float f56038o;

    /* renamed from: p */
    public float f56039p;

    /* renamed from: q */
    public final List<C20463c> f56040q = new ArrayList();

    /* renamed from: r */
    public C50625m f56041r;

    /* renamed from: s */
    public int f56042s;

    /* renamed from: t */
    public final Context f56043t;

    /* renamed from: u */
    public final C0184k f56044u;

    /* renamed from: v */
    public final C50601ah f56045v;

    /* renamed from: w */
    private final boolean f56046w = true;

    /* renamed from: x */
    private C19269a f56047x;

    /* renamed from: y */
    private C19279a f56048y;

    /* renamed from: z */
    private final int[] f56049z = {720, 1280};

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$a */
    static final class C20441a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f56051a;

        /* renamed from: b */
        final /* synthetic */ C20463c f56052b;

        C20441a(VECameraController vECameraController, C20463c cVar) {
            this.f56051a = vECameraController;
            this.f56052b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f56051a.f56040q.add(this.f56052b);
            if (this.f56051a.mo43370g() > 0.0f && this.f56051a.mo43361c() > 0 && this.f56051a.f56029f) {
                this.f56052b.mo43415a(this.f56051a.mo43361c(), true, this.f56051a.mo43371h(), this.f56051a.mo43370g(), this.f56051a.mo43373j());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$b */
    public static final class C20442b implements C19263c {

        /* renamed from: a */
        final /* synthetic */ VECameraController f56053a;

        /* renamed from: b */
        final /* synthetic */ C19263c f56054b;

        /* renamed from: a */
        public final void mo39670a(int i) {
            this.f56053a.mo43356b((C19263c) this);
            C19263c cVar = this.f56054b;
            if (cVar != null) {
                cVar.mo39670a(i);
            }
        }

        C20442b(VECameraController vECameraController, C19263c cVar) {
            this.f56053a = vECameraController;
            this.f56054b = cVar;
        }

        /* renamed from: a */
        public final void mo39671a(int i, int i2, String str) {
            this.f56053a.mo43356b((C19263c) this);
            C19263c cVar = this.f56054b;
            if (cVar != null) {
                cVar.mo39671a(i, i2, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$c */
    public static final class C20443c implements C19263c {

        /* renamed from: a */
        final /* synthetic */ VECameraController f56055a;

        /* renamed from: b */
        final /* synthetic */ C19263c f56056b;

        /* renamed from: a */
        public final void mo39670a(int i) {
            C19263c cVar = this.f56056b;
            if (cVar != null) {
                cVar.mo39670a(i);
            }
            this.f56055a.mo43356b((C19263c) this);
        }

        C20443c(VECameraController vECameraController, C19263c cVar) {
            this.f56055a = vECameraController;
            this.f56056b = cVar;
        }

        /* renamed from: a */
        public final void mo39671a(int i, int i2, String str) {
            C19263c cVar = this.f56056b;
            if (cVar != null) {
                cVar.mo39671a(i, i2, str);
            }
            this.f56055a.mo43356b((C19263c) this);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d */
    public static final class C20444d implements C50619g {

        /* renamed from: a */
        final /* synthetic */ VECameraController f56057a;

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d$a */
        static final class C20445a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20444d f56058a;

            /* renamed from: b */
            final /* synthetic */ int f56059b;

            /* renamed from: c */
            final /* synthetic */ float f56060c;

            /* renamed from: d */
            final /* synthetic */ boolean f56061d;

            C20445a(C20444d dVar, int i, float f, boolean z) {
                this.f56058a = dVar;
                this.f56059b = i;
                this.f56060c = f;
                this.f56061d = z;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                for (C20463c a : this.f56058a.f56057a.f56040q) {
                    a.mo43414a(this.f56059b, this.f56060c, this.f56061d);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d$b */
        static final class C20446b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20444d f56062a;

            /* renamed from: b */
            final /* synthetic */ float f56063b;

            /* renamed from: c */
            final /* synthetic */ List f56064c;

            /* renamed from: d */
            final /* synthetic */ int f56065d;

            /* renamed from: e */
            final /* synthetic */ boolean f56066e;

            /* renamed from: f */
            final /* synthetic */ boolean f56067f;

            C20446b(C20444d dVar, float f, List list, int i, boolean z, boolean z2) {
                this.f56062a = dVar;
                this.f56063b = f;
                this.f56064c = list;
                this.f56065d = i;
                this.f56066e = z;
                this.f56067f = z2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f56062a.f56057a.f56037n = this.f56063b;
                this.f56062a.f56057a.mo43373j().clear();
                List list = this.f56064c;
                if (list != null) {
                    this.f56062a.f56057a.mo43373j().addAll(list);
                }
                for (C20463c a : this.f56062a.f56057a.f56040q) {
                    a.mo43415a(this.f56065d, this.f56066e, this.f56067f, this.f56063b, this.f56064c);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final boolean mo43392a() {
            return this.f56057a.mo43371h();
        }

        C20444d(VECameraController vECameraController) {
            this.f56057a = vECameraController;
        }

        /* renamed from: a */
        public final void mo43390a(int i, float f, boolean z) {
            C20397h.m50605a(new C20445a(this, i, f, z));
        }

        /* renamed from: a */
        public final void mo43391a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            C20446b bVar = new C20446b(this, f, list, i, z, z2);
            C20397h.m50605a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e */
    public static final class C20447e implements C50543g {

        /* renamed from: a */
        public int f56068a = -9999;

        /* renamed from: b */
        public String f56069b = "";

        /* renamed from: c */
        final /* synthetic */ VECameraController f56070c;

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e$a */
        static final class C20448a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20447e f56071a;

            /* renamed from: b */
            final /* synthetic */ int f56072b;

            C20448a(C20447e eVar, int i) {
                this.f56071a = eVar;
                this.f56072b = i;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f56071a.f56070c.f56029f = false;
                this.f56071a.f56070c.f56030g = -1;
                this.f56071a.f56070c.f56038o = 0.0f;
                this.f56071a.f56070c.f56039p = 0.0f;
                for (C19263c a : this.f56071a.f56070c.f56027d) {
                    a.mo39671a(this.f56072b, this.f56071a.f56068a, this.f56071a.f56069b);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e$b */
        static final class C20449b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20447e f56073a;

            /* renamed from: b */
            final /* synthetic */ int f56074b;

            /* renamed from: c */
            final /* synthetic */ int f56075c;

            C20449b(C20447e eVar, int i, int i2) {
                this.f56073a = eVar;
                this.f56074b = i;
                this.f56075c = i2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                int i = this.f56074b;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            this.f56073a.f56070c.f56029f = true;
                            this.f56073a.f56070c.f56030g = this.f56075c;
                            this.f56073a.f56070c.f56038o = 0.0f;
                            this.f56073a.f56070c.f56039p = 0.0f;
                            this.f56073a.f56070c.f56035l.mo99228h();
                            this.f56073a.f56070c.mo43372i().mo43426a(this.f56073a.f56070c.mo43361c());
                            for (C19263c a : this.f56073a.f56070c.f56027d) {
                                a.mo39670a(this.f56073a.f56070c.mo43361c());
                            }
                            this.f56073a.f56070c.f56035l.mo99224a((C50625m) new C50625m(this) {

                                /* renamed from: a */
                                final /* synthetic */ C20449b f56076a;

                                {
                                    this.f56076a = r1;
                                }

                                /* renamed from: a */
                                public final void mo43397a(int i, float f) {
                                    C50625m mVar = this.f56076a.f56073a.f56070c.f56041r;
                                    if (mVar != null) {
                                        mVar.mo43397a(i, f);
                                    }
                                }
                            });
                            break;
                        case 3:
                            for (C19279a a2 : this.f56073a.f56070c.f56026c) {
                                a2.mo39748a();
                            }
                            break;
                    }
                } else {
                    for (C19269a a3 : this.f56073a.f56070c.f56025b) {
                        a3.mo39714a();
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo43393a() {
            VECameraController vECameraController = this.f56070c;
            C19358a aVar = vECameraController.f56028e;
            if (aVar != null) {
                aVar.mo40235b(vECameraController.mo43367e(), vECameraController.mo43369f());
            }
            synchronized (vECameraController.f56031h) {
                vECameraController.f56034k = true;
                if (vECameraController.f56032i) {
                    if (vECameraController.f56033j) {
                        vECameraController.f56035l.mo99226c();
                    } else {
                        vECameraController.f56033j = true;
                        vECameraController.f56045v.mo98797a((C50590b) vECameraController.f56035l);
                    }
                }
            }
        }

        C20447e(VECameraController vECameraController) {
            this.f56070c = vECameraController;
        }

        /* renamed from: a */
        public final void mo43394a(int i) {
            C20397h.m50605a(new C20448a(this, i));
        }

        /* renamed from: a */
        public final void mo43396a(int i, String str) {
            this.f56068a = i;
            if (str != null) {
                this.f56069b = str;
            }
        }

        /* renamed from: a */
        public final void mo43395a(int i, int i2, String str) {
            C20397h.m50605a(new C20449b(this, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$f */
    static final class C20451f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f56077a;

        /* renamed from: b */
        final /* synthetic */ C20463c f56078b;

        C20451f(VECameraController vECameraController, C20463c cVar) {
            this.f56077a = vECameraController;
            this.f56078b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f56077a.f56040q.remove(this.f56078b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$g */
    static final class C20452g extends C52712l implements C52670a<C20476i> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f56079a;

        C20452g(VECameraController vECameraController) {
            this.f56079a = vECameraController;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20476i(this.f56079a.f56043t, this.f56079a);
        }
    }

    /* renamed from: a */
    public final void mo43338a() {
        m50848w();
    }

    /* renamed from: b */
    public final boolean mo43359b() {
        return this.f56046w;
    }

    /* renamed from: c */
    public final int mo43361c() {
        return this.f56030g;
    }

    /* renamed from: e */
    public final int mo43367e() {
        return this.f56015A;
    }

    /* renamed from: f */
    public final int mo43369f() {
        return this.f56016B;
    }

    /* renamed from: g */
    public final float mo43370g() {
        return this.f56037n;
    }

    /* renamed from: h */
    public final boolean mo43371h() {
        return this.f56017C;
    }

    /* renamed from: i */
    public final C20469d mo43372i() {
        return (C20469d) this.f56018D.getValue();
    }

    /* renamed from: j */
    public final List<Integer> mo43373j() {
        return this.f56020F;
    }

    /* renamed from: m */
    public final void mo43376m() {
    }

    /* renamed from: n */
    public final boolean mo43377n() {
        return this.f56029f;
    }

    /* renamed from: o */
    public final int mo43378o() {
        return this.f56042s;
    }

    /* renamed from: s */
    public final void mo43386s() {
        m50848w();
    }

    /* renamed from: a */
    public final void mo43350a(boolean z) {
        this.f56017C = z;
    }

    /* renamed from: a */
    public final void mo43351a(float[] fArr, double d) {
        C52711k.m112240b(fArr, "quaternion");
        this.f56045v.mo98817a(fArr, d);
    }

    /* renamed from: a */
    public final void mo43348a(C50625m mVar) {
        this.f56041r = mVar;
        this.f56035l.mo99224a(mVar);
    }

    /* renamed from: a */
    public final boolean mo43353a(int i, int i2, float f, float[] fArr) {
        C52711k.m112240b(fArr, "points");
        if (fArr.length < 2) {
            return false;
        }
        if (this.f56035l.mo99216a(i, i2, f, (int) fArr[0], (int) fArr[1]) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo43349a(C52671b<? super float[], C52860x> bVar) {
        C52711k.m112240b(bVar, "action");
        this.f56035l.mo99225a((C20277b) new C20481e(bVar));
    }

    /* renamed from: a */
    public final boolean mo43352a(float f) {
        if (!mo43387t()) {
            return false;
        }
        C20317b bVar = C20317b.f55815a;
        StringBuilder sb = new StringBuilder("ZOOM startZoom newZoom = ");
        sb.append(f);
        sb.append(", currentZoom = ");
        sb.append(this.f56039p);
        bVar.mo42963d(sb.toString());
        float a = mo43372i().mo43424a(mo43370g(), mo43365d());
        float b = mo43372i().mo43429b(0.0f, mo43365d());
        float max = Math.max(Math.min(mo43370g(), f), 0.0f);
        if (max < b || max > a) {
            return false;
        }
        this.f56035l.mo99215a(max);
        this.f56039p = max;
        return true;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f56029f) {
            m50848w();
        }
    }

    /* renamed from: q */
    public final void mo43384q() {
        mo43354b(mo43383p());
    }

    /* renamed from: r */
    public final boolean mo43385r() {
        return this.f56035l.mo99227g();
    }

    /* renamed from: d */
    public final int mo43365d() {
        return this.f56036m.f126688j.ordinal();
    }

    /* renamed from: p */
    public final int mo43383p() {
        return this.f56021G.get(mo43378o());
    }

    /* renamed from: l */
    public final void mo43375l() {
        if (!this.f56024J.mo43114f()) {
            m50848w();
            return;
        }
        throw new IllegalAccessError("自动启停模式下无法手动关闭摄像头");
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        if (this.f56024J.mo43114f() && !this.f56022H) {
            this.f56022H = true;
            m50847c(this.f56036m.f126688j.ordinal(), null);
        }
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onResume() {
        if (this.f56024J.mo43114f() && !this.f56022H) {
            this.f56022H = true;
            m50847c(this.f56036m.f126688j.ordinal(), null);
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        if (this.f56024J.mo43114f() && this.f56022H) {
            this.f56022H = false;
            m50848w();
        }
    }

    /* renamed from: t */
    public final boolean mo43387t() {
        if (mo43370g() != -1.0f && !mo43373j().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void mo43389v() {
        C20317b bVar = C20317b.f55815a;
        StringBuilder sb = new StringBuilder("ZOOM [");
        sb.append(System.identityHashCode(this));
        sb.append("] scaleEnd");
        bVar.mo42962c(sb.toString());
        this.f56038o = 0.0f;
    }

    /* renamed from: w */
    private final void m50848w() {
        synchronized (this.f56031h) {
            this.f56034k = false;
            this.f56035l.mo98731d();
        }
        this.f56035l.mo98732e();
        this.f56035l.mo99222a((C50543g) null);
        this.f56035l.mo99223a((C50619g) null);
        this.f56027d.clear();
        this.f56029f = false;
        this.f56030g = -1;
    }

    /* renamed from: k */
    public final int mo43374k() {
        int i;
        boolean z = true;
        if (mo43365d() != 1) {
            z = false;
        }
        if (z) {
            i = mo43372i().mo43432c();
        } else {
            i = mo43372i().mo43434d();
        }
        mo43341a(i, (C19263c) null);
        return i;
    }

    /* renamed from: u */
    public final boolean mo43388u() {
        boolean z;
        if (!mo43387t()) {
            return false;
        }
        if (this.f56019E) {
            C20469d i = mo43372i();
            if (mo43365d() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i.mo43431b(z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo43366d(boolean z) {
        this.f56019E = z;
    }

    /* renamed from: e */
    public final void mo43368e(boolean z) {
        this.f56045v.mo98866h(z);
    }

    /* renamed from: a */
    public final void mo43340a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("body_beauty_level", i);
        this.f56035l.mo99221a(bundle);
    }

    /* renamed from: b */
    public final void mo43354b(int i) {
        this.f56035l.mo99218a(C20482f.m51068c(i));
        this.f56042s = i;
    }

    /* renamed from: a */
    public final void mo43342a(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        this.f56027d.add(cVar);
    }

    /* renamed from: c */
    public final void mo43362c(int i) {
        if (i == 0) {
            C50532a aVar = new C50532a(this.f56036m);
            aVar.mo98519a(0);
            aVar.mo98526b(2);
            VECameraSettings vECameraSettings = aVar.f126710a;
            C52711k.m112236a((Object) vECameraSettings, "VECameraSettings.Builder…                 .build()");
            this.f56036m = vECameraSettings;
        }
    }

    /* renamed from: b */
    public final void mo43356b(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        this.f56027d.remove(cVar);
    }

    /* renamed from: a */
    public final void mo43343a(C19269a aVar) {
        synchronized (this.f56025b) {
            C19269a aVar2 = this.f56047x;
            if (aVar2 != null) {
                this.f56025b.remove(aVar2);
            }
            if (aVar != null) {
                this.f56025b.add(aVar);
            }
            this.f56047x = aVar;
        }
    }

    /* renamed from: b */
    public final void mo43357b(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        C20397h.m50605a(new C20451f(this, cVar));
    }

    /* renamed from: c */
    public final void mo43363c(boolean z) {
        C50532a aVar = new C50532a(this.f56036m);
        aVar.mo98525a(z);
        aVar.mo98526b(2);
        VECameraSettings vECameraSettings = aVar.f126710a;
        C52711k.m112236a((Object) vECameraSettings, "VECameraSettings.Builder…\n                .build()");
        this.f56036m = vECameraSettings;
    }

    /* renamed from: a */
    public final void mo43344a(C19279a aVar) {
        synchronized (this.f56026c) {
            C19279a aVar2 = this.f56048y;
            if (aVar2 != null) {
                this.f56026c.remove(aVar2);
            }
            if (aVar != null) {
                this.f56026c.add(aVar);
            }
            this.f56048y = aVar;
        }
    }

    /* renamed from: b */
    public final void mo43358b(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_body_beauty", z);
        this.f56035l.mo99221a(bundle);
    }

    /* renamed from: c */
    public final boolean mo43364c(float f) {
        if (!mo43387t() || !mo43388u()) {
            return false;
        }
        C20317b bVar = C20317b.f55815a;
        StringBuilder sb = new StringBuilder("ZOOM [");
        sb.append(System.identityHashCode(this));
        sb.append("] scaleCameraByRatio ratio = ");
        sb.append(f);
        bVar.mo42962c(sb.toString());
        if (((double) f) <= 0.05d) {
            f /= 4.0f;
        }
        float max = Math.max(0.0f, ((f - this.f56038o) * mo43370g()) + this.f56039p);
        this.f56038o = f;
        return mo43352a(max);
    }

    /* renamed from: a */
    public final void mo43345a(C19358a aVar) {
        this.f56028e = aVar;
    }

    /* renamed from: b */
    public final boolean mo43360b(float f) {
        if (!mo43387t() || !mo43388u()) {
            return false;
        }
        C20317b bVar = C20317b.f55815a;
        StringBuilder sb = new StringBuilder("ZOOM scaleCamera distanceDelta = ");
        sb.append(f);
        bVar.mo42962c(sb.toString());
        return mo43352a(Math.max(0.0f, ((mo43370g() / 1000.0f) * f) + this.f56039p));
    }

    /* renamed from: a */
    public final void mo43346a(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        C20397h.m50605a(new C20441a(this, cVar));
    }

    /* renamed from: a */
    public final void mo43347a(C50594ac acVar) {
        boolean z;
        VESize vESize;
        C52711k.m112240b(acVar, "ratio");
        if (C50786b.m109900a(this.f56043t) >= 1080) {
            z = true;
        } else {
            z = false;
        }
        switch (C20480d.f56135a[acVar.ordinal()]) {
            case 1:
                if (!z) {
                    vESize = new VESize(720, 1280);
                    break;
                } else {
                    vESize = new VESize(1080, 1920);
                    break;
                }
            case 2:
            case 3:
            case 4:
                if (!z) {
                    vESize = new VESize(720, 960);
                    break;
                } else {
                    vESize = new VESize(1080, 1440);
                    break;
                }
            default:
                vESize = new VESize(720, 1280);
                break;
        }
        this.f56045v.mo98798a(acVar, vESize, null, null, 1, this.f56043t);
    }

    /* renamed from: b */
    public final void mo43355b(int i, C19263c cVar) {
        if (!this.f56024J.mo43114f()) {
            m50847c(i, cVar);
            return;
        }
        throw new IllegalAccessError("自动启停模式下无法手动开启摄像头");
    }

    /* renamed from: c */
    private final void m50847c(int i, C19263c cVar) {
        this.f56036m.f126688j = C20482f.m51066a(i);
        this.f56035l.mo99217a(this.f56043t.getApplicationContext(), this.f56036m);
        mo43342a((C19263c) new C20443c(this, cVar));
        this.f56035l.mo99223a((C50619g) new C20444d(this));
        this.f56035l.mo99222a((C50543g) new C20447e(this));
        this.f56035l.mo98730b();
    }

    /* renamed from: a */
    public final void mo43341a(int i, C19263c cVar) {
        mo43342a((C19263c) new C20442b(this, cVar));
        C50532a aVar = new C50532a(this.f56036m);
        aVar.mo98521a(C20482f.m51066a(i));
        aVar.mo98526b(2);
        VECameraSettings vECameraSettings = aVar.f126710a;
        C52711k.m112236a((Object) vECameraSettings, "VECameraSettings.Builder…\n                .build()");
        this.f56036m = vECameraSettings;
        this.f56035l.mo99219a(this.f56036m);
    }

    /* renamed from: a */
    public final void mo43339a(float f, float f2, float f3) {
        this.f56045v.mo98780a(f, f2, f3);
    }

    public VECameraController(Context context, C0184k kVar, C50601ah ahVar, C20484e eVar, C20355c cVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(ahVar, "veRecorder");
        C52711k.m112240b(eVar, "recorder");
        C52711k.m112240b(cVar, "cameraContext");
        this.f56043t = context;
        this.f56044u = kVar;
        this.f56045v = ahVar;
        this.f56023I = eVar;
        this.f56024J = cVar;
        C20397h.m50605a(new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ VECameraController f56050a;

            {
                this.f56050a = r1;
            }

            public final /* synthetic */ Object invoke() {
                C0184k kVar = this.f56050a.f56044u;
                if (kVar != null) {
                    C0176h lifecycle = kVar.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.mo324a(this.f56050a);
                    }
                }
                return C52860x.f131107a;
            }
        });
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.f56021G = sparseIntArray;
    }
}
