package com.p683ss.android.ugc.asve.recorder;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19264d;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.medialib.presenter.C19359b;
import com.p683ss.android.medialib.presenter.C19360c;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.p1241e.C20397h;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20469d;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20476i;
import com.p683ss.android.vesdk.C50594ac;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52803m;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.g */
public final class C20505g implements C20457b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56171a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20505g.class), "wideCameraComponent", "getWideCameraComponent()Lcom/ss/android/ugc/asve/recorder/camera/widecamera/IWideCamera;"))};

    /* renamed from: b */
    public final C19274g f56172b = C19274g.m47034b();

    /* renamed from: c */
    public int f56173c = -1;

    /* renamed from: d */
    public int f56174d;

    /* renamed from: e */
    public final CopyOnWriteArrayList<C19263c> f56175e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public float f56176f = -1.0f;

    /* renamed from: g */
    public final List<C20463c> f56177g = new ArrayList();

    /* renamed from: h */
    public int f56178h;

    /* renamed from: i */
    public final Context f56179i;

    /* renamed from: j */
    private final boolean f56180j;

    /* renamed from: k */
    private boolean f56181k;

    /* renamed from: l */
    private final C52668f f56182l = C52732g.m112285a(new C20515f(this));

    /* renamed from: m */
    private boolean f56183m = true;

    /* renamed from: n */
    private final List<Integer> f56184n = new ArrayList();

    /* renamed from: o */
    private float f56185o;

    /* renamed from: p */
    private float f56186p;

    /* renamed from: q */
    private final SparseIntArray f56187q;

    /* renamed from: r */
    private final C20484e f56188r;

    /* renamed from: s */
    private final C20355c f56189s;

    /* renamed from: t */
    private final C19361d f56190t;

    /* renamed from: com.ss.android.ugc.asve.recorder.g$a */
    public final class C20506a implements C19263c {

        /* renamed from: a */
        public final C19263c f56191a;

        /* renamed from: com.ss.android.ugc.asve.recorder.g$a$a */
        static final class C20507a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20506a f56193a;

            /* renamed from: b */
            final /* synthetic */ int f56194b;

            /* renamed from: c */
            final /* synthetic */ int f56195c;

            /* renamed from: d */
            final /* synthetic */ String f56196d;

            C20507a(C20506a aVar, int i, int i2, String str) {
                this.f56193a = aVar;
                this.f56194b = i;
                this.f56195c = i2;
                this.f56196d = str;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C20505g.this.f56173c = -1;
                C20505g.this.f56176f = -1.0f;
                for (C19263c a : C20505g.this.f56175e) {
                    a.mo39671a(this.f56194b, this.f56195c, this.f56196d);
                }
                C19263c cVar = this.f56193a.f56191a;
                if (cVar != null) {
                    cVar.mo39671a(this.f56194b, this.f56195c, this.f56196d);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.g$a$b */
        static final class C20508b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20506a f56197a;

            /* renamed from: b */
            final /* synthetic */ int f56198b;

            C20508b(C20506a aVar, int i) {
                this.f56197a = aVar;
                this.f56198b = i;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C20505g.this.f56173c = this.f56198b;
                C20505g gVar = C20505g.this;
                C19274g gVar2 = C20505g.this.f56172b;
                C52711k.m112236a((Object) gVar2, "iesCameraManager");
                gVar.f56176f = gVar2.mo39742f();
                C20505g.this.f56172b.mo39722a((Context) C20315a.m50093b());
                for (C19263c a : C20505g.this.f56175e) {
                    a.mo39670a(this.f56198b);
                }
                C19263c cVar = this.f56197a.f56191a;
                if (cVar != null) {
                    cVar.mo39670a(this.f56198b);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo39670a(int i) {
            C20505g.this.mo43372i().mo43426a(i);
            C20397h.m50605a(new C20508b(this, i));
        }

        public C20506a(C19263c cVar) {
            this.f56191a = cVar;
        }

        /* renamed from: a */
        public final void mo39671a(int i, int i2, String str) {
            C20397h.m50605a(new C20507a(this, i, i2, str));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.g$b */
    static final class C20509b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20505g f56199a;

        /* renamed from: b */
        final /* synthetic */ C20463c f56200b;

        C20509b(C20505g gVar, C20463c cVar) {
            this.f56199a = gVar;
            this.f56200b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f56199a.f56177g.add(this.f56200b);
            if (this.f56199a.mo43370g() > 0.0f && this.f56199a.mo43361c() > 0) {
                this.f56200b.mo43415a(this.f56199a.mo43361c(), true, this.f56199a.mo43371h(), this.f56199a.mo43370g(), this.f56199a.mo43373j());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.g$c */
    static final class C20510c implements C19359b {

        /* renamed from: a */
        final /* synthetic */ C20505g f56201a;

        C20510c(C20505g gVar) {
            this.f56201a = gVar;
        }

        /* renamed from: k_ */
        public final void mo40236k_(int i) {
            this.f56201a.f56174d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.g$d */
    public static final class C20511d implements C19273e {

        /* renamed from: a */
        final /* synthetic */ C20505g f56202a;

        /* renamed from: com.ss.android.ugc.asve.recorder.g$d$a */
        static final class C20512a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20511d f56203a;

            /* renamed from: b */
            final /* synthetic */ int f56204b;

            /* renamed from: c */
            final /* synthetic */ float f56205c;

            /* renamed from: d */
            final /* synthetic */ boolean f56206d;

            C20512a(C20511d dVar, int i, float f, boolean z) {
                this.f56203a = dVar;
                this.f56204b = i;
                this.f56205c = f;
                this.f56206d = z;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                for (C20463c a : this.f56203a.f56202a.f56177g) {
                    a.mo43414a(this.f56204b, this.f56205c, this.f56206d);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.g$d$b */
        static final class C20513b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20511d f56207a;

            /* renamed from: b */
            final /* synthetic */ List f56208b;

            /* renamed from: c */
            final /* synthetic */ int f56209c;

            /* renamed from: d */
            final /* synthetic */ boolean f56210d;

            /* renamed from: e */
            final /* synthetic */ boolean f56211e;

            /* renamed from: f */
            final /* synthetic */ float f56212f;

            C20513b(C20511d dVar, List list, int i, boolean z, boolean z2, float f) {
                this.f56207a = dVar;
                this.f56208b = list;
                this.f56209c = i;
                this.f56210d = z;
                this.f56211e = z2;
                this.f56212f = f;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f56207a.f56202a.mo43373j().clear();
                List list = this.f56208b;
                if (list != null) {
                    this.f56207a.f56202a.mo43373j().addAll(list);
                }
                for (C20463c a : this.f56207a.f56202a.f56177g) {
                    a.mo43415a(this.f56209c, this.f56210d, this.f56211e, this.f56212f, this.f56208b);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final boolean mo39718a() {
            return this.f56202a.mo43371h();
        }

        C20511d(C20505g gVar) {
            this.f56202a = gVar;
        }

        /* renamed from: a */
        public final void mo39716a(int i, float f, boolean z) {
            C20397h.m50605a(new C20512a(this, i, f, z));
        }

        /* renamed from: a */
        public final void mo39717a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            C20513b bVar = new C20513b(this, list, i, z, z2, f);
            C20397h.m50605a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.g$e */
    static final class C20514e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20505g f56213a;

        /* renamed from: b */
        final /* synthetic */ C20463c f56214b;

        C20514e(C20505g gVar, C20463c cVar) {
            this.f56213a = gVar;
            this.f56214b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f56213a.f56177g.remove(this.f56214b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.g$f */
    static final class C20515f extends C52712l implements C52670a<C20476i> {

        /* renamed from: a */
        final /* synthetic */ C20505g f56215a;

        C20515f(C20505g gVar) {
            this.f56215a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20476i(this.f56215a.f56179i, this.f56215a);
        }
    }

    /* renamed from: a */
    public final void mo43338a() {
        mo43375l();
    }

    /* renamed from: a */
    public final void mo43347a(C50594ac acVar) {
        C52711k.m112240b(acVar, "ratio");
    }

    /* renamed from: a */
    public final void mo43348a(C50625m mVar) {
    }

    /* renamed from: b */
    public final boolean mo43359b() {
        return this.f56180j;
    }

    /* renamed from: c */
    public final int mo43361c() {
        return this.f56173c;
    }

    /* renamed from: g */
    public final float mo43370g() {
        return this.f56176f;
    }

    /* renamed from: h */
    public final boolean mo43371h() {
        return this.f56181k;
    }

    /* renamed from: i */
    public final C20469d mo43372i() {
        return (C20469d) this.f56182l.getValue();
    }

    /* renamed from: j */
    public final List<Integer> mo43373j() {
        return this.f56184n;
    }

    /* renamed from: o */
    public final int mo43378o() {
        return this.f56178h;
    }

    /* renamed from: a */
    public final void mo43351a(float[] fArr, double d) {
        C52711k.m112240b(fArr, "quaternion");
        this.f56190t.mo40308a(fArr, d);
    }

    /* renamed from: a */
    public final void mo43350a(boolean z) {
        this.f56181k = z;
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
        sb.append(this.f56186p);
        bVar.mo42963d(sb.toString());
        float a = mo43372i().mo43424a(mo43370g(), mo43365d());
        float b = mo43372i().mo43429b(0.0f, mo43365d());
        float max = Math.max(Math.min(mo43370g(), f), 0.0f);
        if (max < b || max > a) {
            return false;
        }
        this.f56172b.mo39733b(max);
        this.f56186p = max;
        return true;
    }

    /* renamed from: a */
    public final void mo43349a(C52671b<? super float[], C52860x> bVar) {
        C52711k.m112240b(bVar, "action");
        bVar.invoke(new float[0]);
    }

    /* renamed from: a */
    public final boolean mo43353a(int i, int i2, float f, float[] fArr) {
        C52711k.m112240b(fArr, "ponits");
        C19274g gVar = this.f56172b;
        C52711k.m112236a((Object) gVar, "iesCameraManager");
        if (gVar.mo39745i() == null) {
            return false;
        }
        return this.f56172b.mo39731a(i, i2, f, fArr, this.f56174d);
    }

    /* renamed from: e */
    public final int mo43367e() {
        return this.f56172b.mo39737c();
    }

    /* renamed from: f */
    public final int mo43369f() {
        return this.f56172b.mo39739d();
    }

    /* renamed from: n */
    public final boolean mo43377n() {
        return this.f56172b.mo39744h();
    }

    /* renamed from: q */
    public final void mo43384q() {
        mo43354b(mo43383p());
    }

    /* renamed from: d */
    public final int mo43365d() {
        C19274g gVar = this.f56172b;
        C52711k.m112236a((Object) gVar, "iesCameraManager");
        return gVar.mo39747k();
    }

    /* renamed from: l */
    public final void mo43375l() {
        this.f56172b.mo39741e();
        this.f56172b.mo39727a((C19273e) null);
    }

    /* renamed from: p */
    public final int mo43383p() {
        return this.f56187q.get(mo43378o());
    }

    /* renamed from: r */
    public final boolean mo43385r() {
        C19274g gVar = this.f56172b;
        C52711k.m112236a((Object) gVar, "iesCameraManager");
        return gVar.mo39743g();
    }

    /* renamed from: s */
    public final void mo43386s() {
        C19274g.m47034b().f53192c = null;
        C19274g.m47034b().mo39746j();
    }

    /* renamed from: m */
    public final void mo43376m() {
        this.f56172b.mo39728a((C19360c) this.f56190t);
        this.f56172b.f53192c = new C20510c(this);
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
        this.f56185o = 0.0f;
    }

    /* renamed from: k */
    public final int mo43374k() {
        int i;
        boolean z = true;
        if (mo43365d() != 1) {
            z = false;
        }
        if (z) {
            i = mo43372i().mo43434d();
        } else {
            i = mo43372i().mo43432c();
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
        if (this.f56183m) {
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
        this.f56183m = z;
    }

    /* renamed from: b */
    public final void mo43354b(int i) {
        this.f56172b.mo39730a(i);
        this.f56178h = i;
    }

    /* renamed from: a */
    public final void mo43340a(int i) {
        if (VERSION.SDK_INT >= 23) {
            this.f56172b.mo39734b(i);
        }
    }

    /* renamed from: b */
    public final void mo43356b(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        this.f56175e.remove(cVar);
    }

    /* renamed from: c */
    public final void mo43363c(boolean z) {
        if (VERSION.SDK_INT >= 23) {
            C19274g.m47034b().mo39740d(z);
        }
    }

    /* renamed from: e */
    public final void mo43368e(boolean z) {
        this.f56172b.mo39736b(z);
    }

    /* renamed from: b */
    public final void mo43357b(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        C20397h.m50605a(new C20514e(this, cVar));
    }

    /* renamed from: c */
    public final void mo43362c(int i) {
        if (VERSION.SDK_INT < 23) {
            StringBuilder sb = new StringBuilder("An operation is not implemented: ");
            sb.append("VERSION.SDK_INT < M");
            throw new C52803m(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo43342a(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        this.f56175e.addIfAbsent(cVar);
    }

    /* renamed from: b */
    public final void mo43358b(boolean z) {
        if (VERSION.SDK_INT >= 23) {
            this.f56172b.mo39738c(z);
        }
    }

    /* renamed from: a */
    public final void mo43343a(C19269a aVar) {
        this.f56172b.mo39725a(aVar);
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
        float max = Math.max(0.0f, ((f - this.f56185o) * mo43370g()) + this.f56186p);
        this.f56185o = f;
        return mo43352a(max);
    }

    /* renamed from: a */
    public final void mo43344a(C19279a aVar) {
        this.f56172b.f53199j = aVar;
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
        return mo43352a(Math.max(0.0f, ((mo43370g() / 1000.0f) * f) + this.f56186p));
    }

    /* renamed from: a */
    public final void mo43345a(C19358a aVar) {
        this.f56172b.f53193d = aVar;
    }

    /* renamed from: a */
    public final void mo43346a(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        C20397h.m50605a(new C20509b(this, cVar));
    }

    /* renamed from: a */
    public final void mo43341a(int i, C19263c cVar) {
        this.f56172b.mo39723a(this.f56179i, i, (C19263c) new C20506a(cVar));
    }

    /* renamed from: b */
    public final void mo43355b(int i, C19263c cVar) {
        C19274g gVar = this.f56172b;
        C52711k.m112236a((Object) gVar, "iesCameraManager");
        if (!gVar.f53198i) {
            C19274g gVar2 = this.f56172b;
            C20355c cVar2 = this.f56189s;
            C52711k.m112240b(cVar2, "$this$toCameraParams");
            C19264d dVar = new C19264d(C20315a.m50093b(), cVar2.mo43110b().ordinal());
            dVar.f53181s = cVar2.mo43112d();
            dVar.f53179q = cVar2.mo43113e();
            dVar.f53178p = cVar2.mo43111c().ordinal();
            int i2 = 1;
            switch (C20315a.m50092a().mo43168v()) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 4;
                    break;
            }
            dVar.f53177o = i2;
            gVar2.mo39724a(dVar);
        }
        this.f56172b.mo39727a((C19273e) new C20511d(this));
        this.f56172b.mo39732a(i, (C19263c) new C20506a(cVar));
    }

    /* renamed from: a */
    public final void mo43339a(float f, float f2, float f3) {
        this.f56190t.mo40282a(f, f2, f3);
    }

    public C20505g(Context context, C20484e eVar, C20355c cVar, C19361d dVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "recorder");
        C52711k.m112240b(cVar, "cameraContext");
        C52711k.m112240b(dVar, "mediaRecordPresenter");
        this.f56179i = context;
        this.f56188r = eVar;
        this.f56189s = cVar;
        this.f56190t = dVar;
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.f56187q = sparseIntArray;
    }
}
