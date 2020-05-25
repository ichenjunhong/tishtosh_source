package com.p683ss.android.ugc.asve.recorder.reaction;

import android.content.Context;
import com.p683ss.android.medialib.C19318f;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20362g;
import com.p683ss.android.ugc.asve.p1241e.C20395f;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.recorder.reaction.model.C20547d;
import com.p683ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p683ss.android.ugc.asve.recorder.reaction.p1249a.C20538c;
import com.p683ss.android.vesdk.C50599af;
import com.p683ss.android.vesdk.C50601ah;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52744c;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.c */
public final class C20541c implements C20531a {

    /* renamed from: a */
    final String f56283a = "ReactionController";

    /* renamed from: b */
    int f56284b;

    /* renamed from: c */
    int f56285c;

    /* renamed from: d */
    float f56286d;

    /* renamed from: e */
    int f56287e;

    /* renamed from: f */
    int f56288f;

    /* renamed from: g */
    int f56289g;

    /* renamed from: h */
    int f56290h;

    /* renamed from: i */
    final Context f56291i;

    /* renamed from: j */
    private final int f56292j = 360;

    /* renamed from: k */
    private C20538c f56293k;

    /* renamed from: l */
    private C20547d f56294l;

    /* renamed from: m */
    private int f56295m;

    /* renamed from: n */
    private int f56296n;

    /* renamed from: o */
    private int f56297o;

    /* renamed from: p */
    private final C20542a f56298p = new C20542a(this);

    /* renamed from: q */
    private final C50601ah f56299q;

    /* renamed from: r */
    private final C20484e f56300r;

    /* renamed from: s */
    private final C52847n<Integer, Integer> f56301s;

    /* renamed from: t */
    private final C20362g f56302t;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.c$a */
    public static final class C20542a implements C19233b {

        /* renamed from: a */
        final /* synthetic */ C20541c f56303a;

        /* renamed from: a */
        public final void mo39625a(int i, int i2) {
        }

        C20542a(C20541c cVar) {
            this.f56303a = cVar;
        }

        /* renamed from: a */
        public final void mo39624a(int i) {
            int[] iArr;
            int i2;
            if (i < 0) {
                C20317b bVar = C20317b.f55815a;
                StringBuilder sb = new StringBuilder("onNativeInitCallBack error: ");
                sb.append(i);
                bVar.mo42961b(sb.toString());
                return;
            }
            C20541c cVar = this.f56303a;
            C20317b bVar2 = C20317b.f55815a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVar.f56283a);
            sb2.append(" onSurfaceViewInitDone");
            bVar2.mo42962c(sb2.toString());
            if (cVar.f56284b > 0 || cVar.f56285c > 0) {
                iArr = cVar.mo43591a(cVar.f56284b, cVar.f56285c, cVar.f56289g, cVar.f56290h, cVar.f56286d);
            } else if (C20395f.m50601a(cVar.f56291i)) {
                int[] c = cVar.mo43574c();
                if (c == null) {
                    i2 = 0;
                } else {
                    i2 = c[0];
                }
                iArr = cVar.mo43591a(C20395f.m50602b(cVar.f56291i) - i2, cVar.f56288f, cVar.f56289g, cVar.f56290h, cVar.f56286d);
            } else {
                iArr = cVar.mo43591a(cVar.f56287e, cVar.f56288f, cVar.f56289g, cVar.f56290h, cVar.f56286d);
            }
            if (iArr != null) {
                C20317b bVar3 = C20317b.f55815a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cVar.f56283a);
                sb3.append(" => update pos: ");
                sb3.append(cVar.f56284b);
                sb3.append(' ');
                sb3.append(cVar.f56285c);
                sb3.append(" curWindowSurfaceWidth and curWindowSurfaceHeight :");
                sb3.append(cVar.f56289g);
                sb3.append(' ');
                sb3.append(cVar.f56290h);
                bVar3.mo42962c(sb3.toString());
                cVar.f56284b = iArr[0];
                cVar.f56285c = iArr[1];
            }
        }
    }

    /* renamed from: a */
    public final C20362g mo43569a() {
        return this.f56302t;
    }

    /* renamed from: b */
    public final float mo43572b() {
        return this.f56299q.mo98849d();
    }

    /* renamed from: c */
    public final int[] mo43574c() {
        return this.f56299q.mo98840b();
    }

    /* renamed from: d */
    public final int[] mo43575d() {
        return this.f56299q.mo98847c();
    }

    /* renamed from: g */
    public final void mo43578g() {
        this.f56300r.mo43254b(this.f56298p);
    }

    /* renamed from: e */
    public final void mo43576e() {
        this.f56299q.mo98799a(new C50599af(mo43569a().mo43180b(), mo43569a().mo43179a(), new float[]{0.096f, 0.1f, 0.09f, 0.09f}));
        this.f56299q.mo98853d(true);
        this.f56299q.mo98785a(this.f56288f, this.f56297o, this.f56287e, this.f56287e);
        this.f56299q.mo98784a((int) (((Number) this.f56301s.getFirst()).floatValue() * 0.0053333333f), -1);
        C19318f.m47183a().mo39812a(mo43569a().mo43181c());
    }

    /* renamed from: f */
    public final ReactionWindowInfo mo43577f() {
        this.f56286d = mo43572b();
        double degrees = Math.toDegrees((double) this.f56286d);
        double d = (double) this.f56292j;
        Double.isNaN(d);
        float f = (float) (degrees % d);
        C20547d dVar = this.f56294l;
        if (dVar == null) {
            C52711k.m112237a("curWindowShape");
        }
        int convertWidthToDp = dVar.convertWidthToDp(this.f56289g);
        C20547d dVar2 = this.f56294l;
        if (dVar2 == null) {
            C52711k.m112237a("curWindowShape");
        }
        int convertHeightToDp = dVar2.convertHeightToDp(this.f56290h);
        C20547d dVar3 = this.f56294l;
        if (dVar3 == null) {
            C52711k.m112237a("curWindowShape");
        }
        return new ReactionWindowInfo(convertWidthToDp, convertHeightToDp, f, dVar3.getMIsCircle() ? 1 : 0);
    }

    /* renamed from: a */
    public final void mo43570a(float f) {
        C19318f.m47183a().mo39812a(f);
    }

    /* renamed from: b */
    public final boolean mo43573b(int i, int i2) {
        return this.f56299q.mo98839b(i, i2);
    }

    /* renamed from: a */
    public final void mo43571a(int i, int i2) {
        this.f56284b += i;
        this.f56285c += i2;
        int[] a = this.f56299q.mo98820a(this.f56284b, this.f56285c, -1, -1, 0.0f);
        if (a != null) {
            this.f56284b = a[0];
            this.f56285c = a[1];
            this.f56295m = a[2];
            this.f56296n = a[3];
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int[] mo43591a(int i, int i2, int i3, int i4, float f) {
        return this.f56299q.mo98820a(i, i2, i3, i4, f);
    }

    public C20541c(C50601ah ahVar, Context context, C20484e eVar, C52847n<Integer, Integer> nVar, C20362g gVar) {
        C52711k.m112240b(ahVar, "recoder");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "recorder");
        C52711k.m112240b(nVar, "outputSize");
        C52711k.m112240b(gVar, "reactionContext");
        this.f56299q = ahVar;
        this.f56291i = context;
        this.f56300r = eVar;
        this.f56301s = nVar;
        this.f56302t = gVar;
        Context context2 = this.f56291i;
        int intValue = ((Number) this.f56301s.getFirst()).intValue();
        int intValue2 = ((Number) this.f56301s.getSecond()).intValue();
        boolean d = mo43569a().mo43182d();
        double d2 = (double) intValue;
        Double.isNaN(d2);
        this.f56287e = (int) (0.09d * d2);
        double d3 = (double) intValue2;
        Double.isNaN(d3);
        this.f56288f = (int) (0.096d * d3);
        Double.isNaN(d3);
        this.f56297o = (int) (0.1d * d3);
        Double.isNaN(d2);
        int i = (int) (d2 * 0.82d);
        Double.isNaN(d3);
        int i2 = (int) (d3 * 0.804d);
        if (d) {
            double c = (C52744c.f130992c.mo110339c() * 1.0d) / 4.0d;
            double d4 = (double) i;
            Double.isNaN(d4);
            this.f56284b = (((int) (c * d4)) * C20395f.m50602b(context2)) / intValue;
            double c2 = (C52744c.f130992c.mo110339c() * 1.0d) / 4.0d;
            double d5 = (double) i2;
            Double.isNaN(d5);
            this.f56285c = (((int) (c2 * d5)) * C20395f.m50603c(context2)) / intValue2;
        }
        Context context3 = this.f56291i;
        C20362g a = mo43569a();
        C52847n<Integer, Integer> nVar2 = this.f56301s;
        C20538c cVar = new C20538c(context3, ((Number) nVar2.getFirst()).intValue(), ((Number) nVar2.getSecond()).intValue(), a.mo43183e(), a.mo43184f());
        this.f56293k = cVar;
        C20538c cVar2 = this.f56293k;
        if (cVar2 == null) {
            C52711k.m112237a("windowShapeFactory");
        }
        this.f56294l = cVar2.mo43589a();
        C20547d dVar = this.f56294l;
        if (dVar == null) {
            C52711k.m112237a("curWindowShape");
        }
        this.f56289g = dVar.getDefaultWidth();
        C20547d dVar2 = this.f56294l;
        if (dVar2 == null) {
            C52711k.m112237a("curWindowShape");
        }
        this.f56290h = dVar2.getDefaultHeight();
        this.f56300r.mo43248a((C19233b) this.f56298p);
    }
}
