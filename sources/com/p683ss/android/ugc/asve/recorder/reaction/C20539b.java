package com.p683ss.android.ugc.asve.recorder.reaction;

import android.content.Context;
import com.p683ss.android.medialib.C19318f;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.context.C20362g;
import com.p683ss.android.ugc.asve.p1241e.C20395f;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.recorder.reaction.model.C20547d;
import com.p683ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p683ss.android.ugc.asve.recorder.reaction.p1249a.C20538c;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52744c;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.b */
public final class C20539b implements C20531a {

    /* renamed from: a */
    final String f56262a = "ReactionController";

    /* renamed from: b */
    int f56263b;

    /* renamed from: c */
    int f56264c;

    /* renamed from: d */
    float f56265d;

    /* renamed from: e */
    int f56266e;

    /* renamed from: f */
    int f56267f;

    /* renamed from: g */
    int f56268g;

    /* renamed from: h */
    int f56269h;

    /* renamed from: i */
    final Context f56270i;

    /* renamed from: j */
    private final int f56271j = 360;

    /* renamed from: k */
    private C20538c f56272k;

    /* renamed from: l */
    private C20547d f56273l;

    /* renamed from: m */
    private int f56274m;

    /* renamed from: n */
    private int f56275n;

    /* renamed from: o */
    private int f56276o;

    /* renamed from: p */
    private final C20540a f56277p = new C20540a(this);

    /* renamed from: q */
    private final C19361d f56278q;

    /* renamed from: r */
    private final C20484e f56279r;

    /* renamed from: s */
    private final C52847n<Integer, Integer> f56280s;

    /* renamed from: t */
    private final C20362g f56281t;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.b$a */
    public static final class C20540a implements C19233b {

        /* renamed from: a */
        final /* synthetic */ C20539b f56282a;

        /* renamed from: a */
        public final void mo39625a(int i, int i2) {
        }

        C20540a(C20539b bVar) {
            this.f56282a = bVar;
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
            C20539b bVar2 = this.f56282a;
            C20317b bVar3 = C20317b.f55815a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bVar2.f56262a);
            sb2.append(" onSurfaceViewInitDone");
            bVar3.mo42962c(sb2.toString());
            if (bVar2.f56263b > 0 || bVar2.f56264c > 0) {
                iArr = bVar2.mo43590a(bVar2.f56263b, bVar2.f56264c, bVar2.f56268g, bVar2.f56269h, bVar2.f56265d);
            } else if (C20395f.m50601a(bVar2.f56270i)) {
                int[] c = bVar2.mo43574c();
                if (c == null) {
                    i2 = 0;
                } else {
                    i2 = c[0];
                }
                iArr = bVar2.mo43590a(C20395f.m50602b(bVar2.f56270i) - i2, bVar2.f56267f, bVar2.f56268g, bVar2.f56269h, bVar2.f56265d);
            } else {
                iArr = bVar2.mo43590a(bVar2.f56266e, bVar2.f56267f, bVar2.f56268g, bVar2.f56269h, bVar2.f56265d);
            }
            if (iArr != null) {
                C20317b bVar4 = C20317b.f55815a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(bVar2.f56262a);
                sb3.append(" => update pos: ");
                sb3.append(bVar2.f56263b);
                sb3.append(' ');
                sb3.append(bVar2.f56264c);
                sb3.append(" curWindowSurfaceWidth and curWindowSurfaceHeight :");
                sb3.append(bVar2.f56268g);
                sb3.append(' ');
                sb3.append(bVar2.f56269h);
                bVar4.mo42962c(sb3.toString());
                bVar2.f56263b = iArr[0];
                bVar2.f56264c = iArr[1];
            }
        }
    }

    /* renamed from: a */
    public final C20362g mo43569a() {
        return this.f56281t;
    }

    /* renamed from: b */
    public final float mo43572b() {
        return this.f56278q.mo40315b();
    }

    /* renamed from: c */
    public final int[] mo43574c() {
        return this.f56278q.mo40355d();
    }

    /* renamed from: d */
    public final int[] mo43575d() {
        return this.f56278q.mo40345c();
    }

    /* renamed from: g */
    public final void mo43578g() {
        this.f56279r.mo43254b(this.f56277p);
    }

    /* renamed from: e */
    public final void mo43576e() {
        this.f56278q.mo40288a(this.f56270i, mo43569a().mo43180b(), mo43569a().mo43179a());
        this.f56278q.mo40354d(true);
        this.f56278q.mo40332b(this.f56267f, this.f56276o, this.f56266e, this.f56266e);
        this.f56278q.mo40353d((int) (((Number) this.f56280s.getFirst()).floatValue() * 0.0053333333f), -1);
        C19318f.m47183a().mo39812a(mo43569a().mo43181c());
    }

    /* renamed from: f */
    public final ReactionWindowInfo mo43577f() {
        this.f56265d = mo43572b();
        double degrees = Math.toDegrees((double) this.f56265d);
        double d = (double) this.f56271j;
        Double.isNaN(d);
        float f = (float) (degrees % d);
        C20547d dVar = this.f56273l;
        if (dVar == null) {
            C52711k.m112237a("curWindowShape");
        }
        int convertWidthToDp = dVar.convertWidthToDp(this.f56268g);
        C20547d dVar2 = this.f56273l;
        if (dVar2 == null) {
            C52711k.m112237a("curWindowShape");
        }
        int convertHeightToDp = dVar2.convertHeightToDp(this.f56269h);
        C20547d dVar3 = this.f56273l;
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
        return this.f56278q.mo40362e(i, i2);
    }

    /* renamed from: a */
    public final void mo43571a(int i, int i2) {
        this.f56263b += i;
        this.f56264c += i2;
        int[] a = this.f56278q.mo40312a(this.f56263b, this.f56264c, -1, -1);
        if (a != null) {
            this.f56263b = a[0];
            this.f56264c = a[1];
            this.f56274m = a[2];
            this.f56275n = a[3];
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int[] mo43590a(int i, int i2, int i3, int i4, float f) {
        return this.f56278q.mo40313a(i, i2, i3, i4, f);
    }

    public C20539b(C19361d dVar, Context context, C20484e eVar, C52847n<Integer, Integer> nVar, C20362g gVar) {
        C52711k.m112240b(dVar, "presenter");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "recorder");
        C52711k.m112240b(nVar, "outputSize");
        C52711k.m112240b(gVar, "reactionContext");
        this.f56278q = dVar;
        this.f56270i = context;
        this.f56279r = eVar;
        this.f56280s = nVar;
        this.f56281t = gVar;
        Context context2 = this.f56270i;
        int intValue = ((Number) this.f56280s.getFirst()).intValue();
        int intValue2 = ((Number) this.f56280s.getSecond()).intValue();
        boolean d = mo43569a().mo43182d();
        double d2 = (double) intValue;
        Double.isNaN(d2);
        this.f56266e = (int) (0.09d * d2);
        double d3 = (double) intValue2;
        Double.isNaN(d3);
        this.f56267f = (int) (0.096d * d3);
        Double.isNaN(d3);
        this.f56276o = (int) (0.1d * d3);
        Double.isNaN(d2);
        int i = (int) (d2 * 0.82d);
        Double.isNaN(d3);
        int i2 = (int) (d3 * 0.804d);
        if (d) {
            double c = (C52744c.f130992c.mo110339c() * 1.0d) / 4.0d;
            double d4 = (double) i;
            Double.isNaN(d4);
            this.f56263b = (((int) (c * d4)) * C20395f.m50602b(context2)) / intValue;
            double c2 = (C52744c.f130992c.mo110339c() * 1.0d) / 4.0d;
            double d5 = (double) i2;
            Double.isNaN(d5);
            this.f56264c = (((int) (c2 * d5)) * C20395f.m50603c(context2)) / intValue2;
        }
        Context context3 = this.f56270i;
        C20362g a = mo43569a();
        C52847n<Integer, Integer> nVar2 = this.f56280s;
        C20538c cVar = new C20538c(context3, ((Number) nVar2.getFirst()).intValue(), ((Number) nVar2.getSecond()).intValue(), a.mo43183e(), a.mo43184f());
        this.f56272k = cVar;
        C20538c cVar2 = this.f56272k;
        if (cVar2 == null) {
            C52711k.m112237a("windowShapeFactory");
        }
        this.f56273l = cVar2.mo43589a();
        C20547d dVar2 = this.f56273l;
        if (dVar2 == null) {
            C52711k.m112237a("curWindowShape");
        }
        this.f56268g = dVar2.getDefaultWidth();
        C20547d dVar3 = this.f56273l;
        if (dVar3 == null) {
            C52711k.m112237a("curWindowShape");
        }
        this.f56269h = dVar3.getDefaultHeight();
        this.f56279r.mo43248a((C19233b) this.f56277p);
    }
}
