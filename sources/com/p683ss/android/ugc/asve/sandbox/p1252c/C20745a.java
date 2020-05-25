package com.p683ss.android.ugc.asve.sandbox.p1252c;

import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.p1241e.C20379a;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20469d;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20470e;
import com.p683ss.android.ugc.asve.sandbox.C20752d;
import com.p683ss.android.ugc.asve.sandbox.C20782g;
import com.p683ss.android.ugc.asve.sandbox.C20806o;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20595ab;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20597ad;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20630g;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20634i;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20642q;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa.C20662a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f.C20677a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n.C20701a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o.C20704a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r.C20713a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t.C20719a;
import com.p683ss.android.vesdk.C50594ac;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import com.p683ss.android.vesdk.VECameraSettings;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.a */
public final class C20745a implements C20457b {

    /* renamed from: a */
    private C50625m f56597a;

    /* renamed from: b */
    private final boolean f56598b = true;

    /* renamed from: c */
    private final C20782g f56599c;

    /* renamed from: d */
    private final C20469d f56600d;

    /* renamed from: e */
    private final int[] f56601e;

    /* renamed from: f */
    private final int f56602f;

    /* renamed from: g */
    private final int f56603g;

    /* renamed from: h */
    private VECameraSettings f56604h;

    /* renamed from: i */
    private C19263c f56605i;

    /* renamed from: j */
    private final Map<C19263c, C20667c> f56606j;

    /* renamed from: k */
    private C19358a f56607k;

    /* renamed from: l */
    private C19279a f56608l;

    /* renamed from: m */
    private C19269a f56609m;

    /* renamed from: n */
    private final Map<C20463c, C20703o> f56610n;

    /* renamed from: com.ss.android.ugc.asve.sandbox.c.a$a */
    public static final class C20746a extends C20713a {

        /* renamed from: a */
        final /* synthetic */ C52671b f56611a;

        C20746a(C52671b bVar) {
            this.f56611a = bVar;
        }

        /* renamed from: a */
        public final void mo43849a(float[] fArr) {
            C52711k.m112240b(fArr, "fovArray");
            this.f56611a.invoke(fArr);
        }
    }

    /* renamed from: a */
    public final void mo43350a(boolean z) {
    }

    /* renamed from: b */
    public final boolean mo43359b() {
        return this.f56598b;
    }

    /* renamed from: e */
    public final int mo43367e() {
        return this.f56602f;
    }

    /* renamed from: f */
    public final int mo43369f() {
        return this.f56603g;
    }

    /* renamed from: i */
    public final C20469d mo43372i() {
        return this.f56600d;
    }

    /* renamed from: a */
    public final void mo43348a(C50625m mVar) {
        C20662a aVar;
        this.f56597a = mVar;
        C20782g gVar = this.f56599c;
        if (mVar != null) {
            C52711k.m112240b(mVar, "$this$stub");
            aVar = new C20595ab(mVar);
        } else {
            aVar = null;
        }
        gVar.mo43883a((C20661aa) aVar);
    }

    /* renamed from: a */
    public final void mo43347a(C50594ac acVar) {
        C52711k.m112240b(acVar, "ratio");
        this.f56599c.mo43895b(acVar.ordinal());
    }

    /* renamed from: a */
    public final boolean mo43353a(int i, int i2, float f, float[] fArr) {
        C52711k.m112240b(fArr, "points");
        return this.f56599c.mo43892a(i, i2, f, fArr);
    }

    /* renamed from: a */
    public final boolean mo43352a(float f) {
        this.f56599c.mo43879a(f);
        return true;
    }

    /* renamed from: a */
    public final void mo43351a(float[] fArr, double d) {
        C52711k.m112240b(fArr, "quaternion");
        this.f56599c.mo43891a(fArr, d);
    }

    /* renamed from: a */
    public final void mo43349a(C52671b<? super float[], C52860x> bVar) {
        C52711k.m112240b(bVar, "action");
        this.f56599c.mo43888a((C20712r) new C20746a(bVar));
    }

    /* renamed from: c */
    public final int mo43361c() {
        return this.f56599c.mo43922r();
    }

    /* renamed from: g */
    public final float mo43370g() {
        return this.f56599c.mo43915k();
    }

    /* renamed from: h */
    public final boolean mo43371h() {
        return this.f56599c.mo43914j();
    }

    /* renamed from: k */
    public final int mo43374k() {
        return this.f56599c.mo43878a();
    }

    /* renamed from: l */
    public final void mo43375l() {
        this.f56599c.mo43910f();
    }

    /* renamed from: m */
    public final void mo43376m() {
        this.f56599c.mo43911g();
    }

    /* renamed from: n */
    public final boolean mo43377n() {
        return this.f56599c.mo43921q();
    }

    /* renamed from: o */
    public final int mo43378o() {
        return this.f56599c.mo43893b();
    }

    /* renamed from: p */
    public final int mo43383p() {
        return this.f56599c.mo43900c();
    }

    /* renamed from: q */
    public final void mo43384q() {
        this.f56599c.mo43878a();
    }

    /* renamed from: r */
    public final boolean mo43385r() {
        return this.f56599c.mo43913i();
    }

    /* renamed from: s */
    public final void mo43386s() {
        this.f56599c.mo43912h();
    }

    /* renamed from: t */
    public final boolean mo43387t() {
        return this.f56599c.mo43918n();
    }

    /* renamed from: u */
    public final boolean mo43388u() {
        return this.f56599c.mo43919o();
    }

    /* renamed from: v */
    public final void mo43389v() {
        this.f56599c.mo43917m();
    }

    /* renamed from: d */
    public final int mo43365d() {
        return this.f56604h.f126688j.ordinal();
    }

    /* renamed from: a */
    public final void mo43338a() {
        this.f56610n.clear();
        this.f56606j.clear();
        this.f56605i = null;
        this.f56607k = null;
        this.f56608l = null;
        this.f56609m = null;
        this.f56599c.mo43920p();
    }

    /* renamed from: j */
    public final List<Integer> mo43373j() {
        List l = this.f56599c.mo43916l();
        if (l == null) {
            l = C52575l.m112097a();
        }
        if (l != null) {
            return C52731z.m112268d(l);
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Int>");
    }

    /* renamed from: b */
    public final void mo43354b(int i) {
        this.f56599c.mo43902c(i);
    }

    /* renamed from: d */
    public final void mo43366d(boolean z) {
        this.f56599c.mo43903c(z);
    }

    /* renamed from: e */
    public final void mo43368e(boolean z) {
        this.f56599c.mo43909e(z);
    }

    /* renamed from: a */
    public final void mo43340a(int i) {
        this.f56599c.mo43908e(i);
    }

    /* renamed from: b */
    public final void mo43358b(boolean z) {
        this.f56599c.mo43906d(z);
    }

    /* renamed from: c */
    public final void mo43362c(int i) {
        this.f56599c.mo43905d(i);
    }

    /* renamed from: c */
    public final void mo43363c(boolean z) {
        this.f56599c.mo43890a(z);
    }

    /* renamed from: b */
    public final void mo43356b(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        C20667c cVar2 = (C20667c) this.f56606j.get(cVar);
        if (cVar2 != null) {
            this.f56599c.mo43897b(cVar2);
            this.f56606j.remove(cVar);
        }
    }

    /* renamed from: c */
    public final boolean mo43364c(float f) {
        this.f56599c.mo43901c(f);
        return true;
    }

    /* renamed from: a */
    public final void mo43342a(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        if (this.f56606j.get(cVar) != null) {
            this.f56599c.mo43884a((C20667c) this.f56606j.get(cVar));
            return;
        }
        C20668a a = C20600b.m51919a(cVar);
        this.f56606j.put(cVar, a);
        this.f56599c.mo43884a((C20667c) a);
    }

    /* renamed from: b */
    public final void mo43357b(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        C20703o oVar = (C20703o) this.f56610n.get(cVar);
        if (oVar != null) {
            this.f56599c.mo43898b(oVar);
            this.f56610n.remove(cVar);
        }
    }

    /* renamed from: a */
    public final void mo43343a(C19269a aVar) {
        C20701a aVar2;
        this.f56609m = aVar;
        C20782g gVar = this.f56599c;
        if (aVar != null) {
            C52711k.m112240b(aVar, "$this$stub");
            aVar2 = new C20630g(aVar);
        } else {
            aVar2 = null;
        }
        gVar.mo43886a((C20700n) aVar2);
    }

    /* renamed from: b */
    public final boolean mo43360b(float f) {
        this.f56599c.mo43894b(f);
        return true;
    }

    /* renamed from: a */
    public final void mo43344a(C19279a aVar) {
        C20719a aVar2;
        this.f56608l = aVar;
        C20782g gVar = this.f56599c;
        if (aVar != null) {
            C52711k.m112240b(aVar, "$this$stub");
            aVar2 = new C20642q(aVar);
        } else {
            aVar2 = null;
        }
        gVar.mo43889a((C20718t) aVar2);
    }

    /* renamed from: a */
    public final void mo43345a(C19358a aVar) {
        C20677a aVar2;
        this.f56607k = aVar;
        C20782g gVar = this.f56599c;
        if (aVar != null) {
            C52711k.m112240b(aVar, "$this$stub");
            aVar2 = new C20634i(aVar);
        } else {
            aVar2 = null;
        }
        gVar.mo43885a((C20676f) aVar2);
    }

    /* renamed from: a */
    public final void mo43346a(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        if (this.f56610n.get(cVar) != null) {
            this.f56599c.mo43898b((C20703o) this.f56610n.get(cVar));
            return;
        }
        C52711k.m112240b(cVar, "$this$stub");
        C20704a adVar = new C20597ad(cVar);
        this.f56610n.put(cVar, adVar);
        this.f56599c.mo43887a((C20703o) adVar);
    }

    /* renamed from: b */
    public final void mo43355b(int i, C19263c cVar) {
        C20668a aVar;
        this.f56605i = cVar;
        C20782g gVar = this.f56599c;
        if (cVar != null) {
            aVar = C20600b.m51919a(cVar);
        } else {
            aVar = null;
        }
        gVar.mo43882a(i, (C20667c) aVar);
    }

    /* renamed from: a */
    public final void mo43341a(int i, C19263c cVar) {
        C20668a aVar;
        C20782g gVar = this.f56599c;
        if (cVar != null) {
            aVar = C20600b.m51919a(cVar);
        } else {
            aVar = null;
        }
        gVar.mo43896b(i, aVar);
    }

    public C20745a(C20782g gVar, C20355c cVar) {
        C52711k.m112240b(cVar, "cameraContext");
        Object newProxyInstance = Proxy.newProxyInstance(C20782g.class.getClassLoader(), new Class[]{C20782g.class}, new C20752d(gVar));
        if (newProxyInstance != null) {
            this.f56599c = (C20782g) newProxyInstance;
            C20806o e = this.f56599c.mo43907e();
            C52711k.m112236a((Object) e, "safeRemoteCameraController.wideCameraComponent");
            this.f56600d = new C20470e(e);
            this.f56601e = new int[]{720, 1280};
            this.f56602f = 720;
            this.f56603g = 1280;
            this.f56604h = C20379a.m50557a(cVar);
            this.f56606j = new LinkedHashMap();
            this.f56610n = new LinkedHashMap();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
    }

    /* renamed from: a */
    public final void mo43339a(float f, float f2, float f3) {
        this.f56599c.mo43880a(f, f2, f3);
    }
}
