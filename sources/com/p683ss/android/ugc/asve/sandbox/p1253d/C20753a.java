package com.p683ss.android.ugc.asve.sandbox.p1253d;

import android.os.IBinder;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.recorder.camera.VECameraController;
import com.p683ss.android.ugc.asve.sandbox.C20782g.C20783a;
import com.p683ss.android.ugc.asve.sandbox.C20806o;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b.C20602b;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b.C20603c;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b.C20604d;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b.C20605e;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b.C20606f;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b.C20607g;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t;
import com.p683ss.android.vesdk.C50594ac;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.a */
public final class C20753a extends C20783a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56638a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20753a.class), "wideCamera", "getWideCamera()Lcom/ss/android/ugc/asve/sandbox/IWideCameraComponent;"))};

    /* renamed from: b */
    final Map<IBinder, C19263c> f56639b = new LinkedHashMap();

    /* renamed from: c */
    final Map<IBinder, C20463c> f56640c = new LinkedHashMap();

    /* renamed from: d */
    final VECameraController f56641d;

    /* renamed from: e */
    public final C20457b f56642e;

    /* renamed from: f */
    private final C52668f f56643f = C52732g.m112285a(new C20754a(this));

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.a$a */
    static final class C20754a extends C52712l implements C52670a<C20775g> {

        /* renamed from: a */
        final /* synthetic */ C20753a f56644a;

        C20754a(C20753a aVar) {
            this.f56644a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20775g(this.f56644a.f56642e.mo43372i());
        }
    }

    /* renamed from: a */
    public final void mo43881a(int i) {
    }

    /* renamed from: a */
    public final void mo43889a(C20718t tVar) {
        C19279a aVar;
        C20457b bVar = this.f56642e;
        if (tVar != null) {
            C52711k.m112240b(tVar, "$this$proxy");
            aVar = new C20605e(tVar);
        } else {
            aVar = null;
        }
        bVar.mo43344a(aVar);
    }

    /* renamed from: a */
    public final boolean mo43892a(int i, int i2, float f, float[] fArr) {
        C52711k.m112240b(fArr, "points");
        return this.f56642e.mo43353a(i, i2, f, fArr);
    }

    /* renamed from: a */
    public final void mo43890a(boolean z) {
        this.f56642e.mo43363c(z);
    }

    /* renamed from: a */
    public final void mo43891a(float[] fArr, double d) {
        C52711k.m112240b(fArr, "quaternion");
        this.f56642e.mo43351a(fArr, d);
    }

    /* renamed from: a */
    public final void mo43888a(C20712r rVar) {
        C52711k.m112240b(rVar, "callback");
        C20457b bVar = this.f56642e;
        C52711k.m112240b(rVar, "$this$proxy");
        bVar.mo43349a((C52671b<? super float[], C52860x>) new C20604d<Object,C52860x>(rVar));
    }

    /* renamed from: a */
    public final int mo43878a() {
        return this.f56642e.mo43374k();
    }

    /* renamed from: b */
    public final int mo43893b() {
        return this.f56642e.mo43378o();
    }

    /* renamed from: c */
    public final int mo43900c() {
        return this.f56642e.mo43383p();
    }

    /* renamed from: d */
    public final void mo43904d() {
        this.f56642e.mo43384q();
    }

    /* renamed from: f */
    public final void mo43910f() {
        this.f56642e.mo43375l();
    }

    /* renamed from: g */
    public final void mo43911g() {
        this.f56642e.mo43376m();
    }

    /* renamed from: h */
    public final void mo43912h() {
        this.f56642e.mo43386s();
    }

    /* renamed from: i */
    public final boolean mo43913i() {
        return this.f56642e.mo43385r();
    }

    /* renamed from: j */
    public final boolean mo43914j() {
        return this.f56642e.mo43371h();
    }

    /* renamed from: k */
    public final float mo43915k() {
        return this.f56642e.mo43370g();
    }

    /* renamed from: l */
    public final List<Integer> mo43916l() {
        return this.f56642e.mo43373j();
    }

    /* renamed from: m */
    public final void mo43917m() {
        this.f56642e.mo43389v();
    }

    /* renamed from: n */
    public final boolean mo43918n() {
        return this.f56642e.mo43387t();
    }

    /* renamed from: o */
    public final boolean mo43919o() {
        return this.f56642e.mo43388u();
    }

    /* renamed from: p */
    public final void mo43920p() {
        this.f56642e.mo43338a();
    }

    /* renamed from: q */
    public final boolean mo43921q() {
        return this.f56642e.mo43377n();
    }

    /* renamed from: r */
    public final int mo43922r() {
        return this.f56642e.mo43361c();
    }

    /* renamed from: e */
    public final C20806o mo43907e() {
        return (C20806o) this.f56643f.getValue();
    }

    /* renamed from: e */
    public final void mo43908e(int i) {
        this.f56642e.mo43340a(i);
    }

    /* renamed from: a */
    public final void mo43879a(float f) {
        this.f56642e.mo43352a(f);
    }

    /* renamed from: b */
    public final void mo43894b(float f) {
        this.f56642e.mo43360b(f);
    }

    /* renamed from: c */
    public final void mo43901c(float f) {
        this.f56642e.mo43364c(f);
    }

    /* renamed from: d */
    public final void mo43905d(int i) {
        this.f56642e.mo43362c(i);
    }

    /* renamed from: b */
    public final void mo43895b(int i) {
        this.f56642e.mo43347a(C50594ac.values()[i]);
    }

    /* renamed from: c */
    public final void mo43902c(int i) {
        this.f56642e.mo43354b(i);
    }

    /* renamed from: d */
    public final void mo43906d(boolean z) {
        this.f56642e.mo43358b(z);
    }

    /* renamed from: e */
    public final void mo43909e(boolean z) {
        this.f56642e.mo43368e(z);
    }

    public C20753a(C20457b bVar) {
        C52711k.m112240b(bVar, "cameraController");
        this.f56642e = bVar;
        C20457b bVar2 = this.f56642e;
        if (bVar2 != null) {
            this.f56641d = (VECameraController) bVar2;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
    }

    /* renamed from: c */
    public final void mo43903c(boolean z) {
        this.f56642e.mo43366d(z);
    }

    /* renamed from: a */
    public final void mo43883a(C20661aa aaVar) {
        C50625m mVar;
        C20457b bVar = this.f56642e;
        if (aaVar != null) {
            C52711k.m112240b(aaVar, "$this$proxy");
            mVar = new C20607g(aaVar);
        } else {
            mVar = null;
        }
        bVar.mo43348a(mVar);
    }

    /* renamed from: b */
    public final void mo43897b(C20667c cVar) {
        C52711k.m112240b(cVar, "callback");
        C19263c cVar2 = (C19263c) this.f56639b.get(cVar.asBinder());
        if (cVar2 != null) {
            this.f56642e.mo43356b(cVar2);
            this.f56639b.remove(cVar.asBinder());
        }
    }

    /* renamed from: a */
    public final void mo43884a(C20667c cVar) {
        C52711k.m112240b(cVar, "callback");
        C19263c a = C20600b.m51918a(cVar);
        Map<IBinder, C19263c> map = this.f56639b;
        IBinder asBinder = cVar.asBinder();
        C52711k.m112236a((Object) asBinder, "callback.asBinder()");
        map.put(asBinder, a);
        this.f56642e.mo43342a(a);
    }

    /* renamed from: b */
    public final void mo43898b(C20703o oVar) {
        C52711k.m112240b(oVar, "listener");
        C20463c cVar = (C20463c) this.f56640c.get(oVar.asBinder());
        if (cVar != null) {
            this.f56642e.mo43357b(cVar);
            this.f56640c.remove(oVar.asBinder());
        }
    }

    /* renamed from: a */
    public final void mo43885a(C20676f fVar) {
        C19358a aVar;
        C20457b bVar = this.f56642e;
        if (fVar != null) {
            C52711k.m112240b(fVar, "$this$proxy");
            aVar = new C20602b(fVar);
        } else {
            aVar = null;
        }
        bVar.mo43345a(aVar);
    }

    /* renamed from: b */
    public final void mo43899b(boolean z) {
        this.f56642e.mo43350a(z);
    }

    /* renamed from: a */
    public final void mo43886a(C20700n nVar) {
        C19269a aVar;
        C20457b bVar = this.f56642e;
        if (nVar != null) {
            C52711k.m112240b(nVar, "$this$proxy");
            aVar = new C20606f(nVar);
        } else {
            aVar = null;
        }
        bVar.mo43343a(aVar);
    }

    /* renamed from: a */
    public final void mo43887a(C20703o oVar) {
        C52711k.m112240b(oVar, "listener");
        C52711k.m112240b(oVar, "$this$proxy");
        C20463c cVar = new C20603c(oVar);
        Map<IBinder, C20463c> map = this.f56640c;
        IBinder asBinder = oVar.asBinder();
        C52711k.m112236a((Object) asBinder, "listener.asBinder()");
        map.put(asBinder, cVar);
        this.f56642e.mo43346a(cVar);
    }

    /* renamed from: a */
    public final void mo43882a(int i, C20667c cVar) {
        C19263c cVar2;
        C20457b bVar = this.f56642e;
        if (cVar != null) {
            cVar2 = C20600b.m51918a(cVar);
        } else {
            cVar2 = null;
        }
        bVar.mo43355b(i, cVar2);
    }

    /* renamed from: b */
    public final void mo43896b(int i, C20667c cVar) {
        C19263c cVar2;
        C20457b bVar = this.f56642e;
        if (cVar != null) {
            cVar2 = C20600b.m51918a(cVar);
        } else {
            cVar2 = null;
        }
        bVar.mo43341a(i, cVar2);
    }

    /* renamed from: a */
    public final void mo43880a(float f, float f2, float f3) {
        this.f56642e.mo43339a(f, f2, f3);
    }
}
