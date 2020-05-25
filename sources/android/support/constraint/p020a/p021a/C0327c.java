package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.p021a.C0333e.C0335a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.c */
public final class C0327c {

    /* renamed from: a */
    public C0333e f915a;

    /* renamed from: b */
    public C0333e f916b;

    /* renamed from: c */
    public C0333e f917c;

    /* renamed from: d */
    public C0333e f918d;

    /* renamed from: e */
    public C0333e f919e;

    /* renamed from: f */
    public C0333e f920f;

    /* renamed from: g */
    public C0333e f921g;

    /* renamed from: h */
    protected ArrayList<C0333e> f922h;

    /* renamed from: i */
    protected int f923i;

    /* renamed from: j */
    protected int f924j;

    /* renamed from: k */
    public float f925k;

    /* renamed from: l */
    protected boolean f926l;

    /* renamed from: m */
    protected boolean f927m;

    /* renamed from: n */
    protected boolean f928n;

    /* renamed from: o */
    boolean f929o;

    /* renamed from: p */
    private int f930p;

    /* renamed from: q */
    private boolean f931q;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo704a() {
        boolean z;
        int i = this.f930p * 2;
        boolean z2 = false;
        C0333e eVar = this.f915a;
        boolean z3 = false;
        while (!z3) {
            this.f923i++;
            C0333e eVar2 = null;
            eVar.f986ao[this.f930p] = null;
            eVar.f985an[this.f930p] = null;
            if (eVar.f975ad != 8) {
                if (this.f916b == null) {
                    this.f916b = eVar;
                }
                if (this.f918d != null) {
                    this.f918d.f986ao[this.f930p] = eVar;
                }
                this.f918d = eVar;
                if (eVar.f952F[this.f930p] == C0335a.MATCH_CONSTRAINT && (eVar.f995i[this.f930p] == 0 || eVar.f995i[this.f930p] == 3 || eVar.f995i[this.f930p] == 2)) {
                    this.f924j++;
                    float f = eVar.f984am[this.f930p];
                    if (f > 0.0f) {
                        this.f925k += eVar.f984am[this.f930p];
                    }
                    int i2 = this.f930p;
                    if (eVar.f975ad != 8 && eVar.f952F[i2] == C0335a.MATCH_CONSTRAINT && (eVar.f995i[i2] == 0 || eVar.f995i[i2] == 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (f < 0.0f) {
                            this.f926l = true;
                        } else {
                            this.f927m = true;
                        }
                        if (this.f922h == null) {
                            this.f922h = new ArrayList<>();
                        }
                        this.f922h.add(eVar);
                    }
                    if (this.f920f == null) {
                        this.f920f = eVar;
                    }
                    if (this.f921g != null) {
                        this.f921g.f985an[this.f930p] = eVar;
                    }
                    this.f921g = eVar;
                }
            }
            C0328d dVar = eVar.f950D[i + 1].f935d;
            if (dVar != null) {
                C0333e eVar3 = dVar.f933b;
                if (eVar3.f950D[i].f935d != null && eVar3.f950D[i].f935d.f933b == eVar) {
                    eVar2 = eVar3;
                }
            }
            if (eVar2 != null) {
                eVar = eVar2;
            } else {
                z3 = true;
            }
        }
        this.f917c = eVar;
        if (this.f930p != 0 || !this.f931q) {
            this.f919e = this.f915a;
        } else {
            this.f919e = this.f917c;
        }
        if (this.f927m && this.f926l) {
            z2 = true;
        }
        this.f928n = z2;
    }

    public C0327c(C0333e eVar, int i, boolean z) {
        this.f915a = eVar;
        this.f930p = i;
        this.f931q = z;
    }
}
