package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0348b;
import android.support.constraint.p020a.C0351e;
import android.support.constraint.p020a.C0357h;
import android.support.constraint.p020a.p021a.C0328d.C0332c;
import android.support.constraint.p020a.p021a.C0333e.C0335a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.g */
public final class C0337g extends C0333e {

    /* renamed from: a */
    public float f1031a = -1.0f;

    /* renamed from: ar */
    public int f1032ar = -1;

    /* renamed from: as */
    public C0328d f1033as = this.f1009w;

    /* renamed from: at */
    public int f1034at;

    /* renamed from: au */
    private boolean f1035au;

    /* renamed from: av */
    private C0341j f1036av = new C0341j();

    /* renamed from: aw */
    private int f1037aw = 8;

    /* renamed from: b */
    public int f1038b = -1;

    /* renamed from: a */
    public final boolean mo701a() {
        return true;
    }

    /* renamed from: s */
    public final ArrayList<C0328d> mo739s() {
        return this.f951E;
    }

    public C0337g() {
        this.f951E.clear();
        this.f951E.add(this.f1033as);
        int length = this.f950D.length;
        for (int i = 0; i < length; i++) {
            this.f950D[i] = this.f1033as;
        }
    }

    /* renamed from: a */
    public final C0328d mo711a(C0332c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.f1034at == 1) {
                    return this.f1033as;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f1034at == 0) {
                    return this.f1033as;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    /* renamed from: c */
    public final void mo721c(C0351e eVar) {
        if (this.f953G != null) {
            int b = C0351e.m846b((Object) this.f1033as);
            if (this.f1034at == 1) {
                this.f958L = b;
                this.f959M = 0;
                mo720c(this.f953G.mo731k());
                mo717b(0);
                return;
            }
            this.f958L = 0;
            this.f959M = b;
            mo717b(this.f953G.mo730j());
            mo720c(0);
        }
    }

    /* renamed from: f */
    public final void mo751f(int i) {
        if (this.f1034at != i) {
            this.f1034at = i;
            this.f951E.clear();
            if (this.f1034at == 1) {
                this.f1033as = this.f1008v;
            } else {
                this.f1033as = this.f1009w;
            }
            this.f951E.add(this.f1033as);
            int length = this.f950D.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f950D[i2] = this.f1033as;
            }
        }
    }

    /* renamed from: a */
    public final void mo700a(C0351e eVar) {
        boolean z;
        C0336f fVar = (C0336f) this.f953G;
        if (fVar != null) {
            C0328d a = fVar.mo711a(C0332c.LEFT);
            C0328d a2 = fVar.mo711a(C0332c.RIGHT);
            if (this.f953G == null || this.f953G.f952F[0] != C0335a.WRAP_CONTENT) {
                z = false;
            } else {
                z = true;
            }
            if (this.f1034at == 0) {
                a = fVar.mo711a(C0332c.TOP);
                a2 = fVar.mo711a(C0332c.BOTTOM);
                if (this.f953G == null || this.f953G.f952F[1] != C0335a.WRAP_CONTENT) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (this.f1038b != -1) {
                C0357h a3 = eVar.mo788a((Object) this.f1033as);
                eVar.mo799c(a3, eVar.mo788a((Object) a), this.f1038b, 6);
                if (z) {
                    eVar.mo794a(eVar.mo788a((Object) a2), a3, 0, 5);
                }
            } else if (this.f1032ar != -1) {
                C0357h a4 = eVar.mo788a((Object) this.f1033as);
                C0357h a5 = eVar.mo788a((Object) a2);
                eVar.mo799c(a4, a5, -this.f1032ar, 6);
                if (z) {
                    eVar.mo794a(a4, eVar.mo788a((Object) a), 0, 5);
                    eVar.mo794a(a5, a4, 0, 5);
                }
            } else {
                if (this.f1031a != -1.0f) {
                    C0357h a6 = eVar.mo788a((Object) this.f1033as);
                    C0357h a7 = eVar.mo788a((Object) a);
                    C0357h a8 = eVar.mo788a((Object) a2);
                    float f = this.f1031a;
                    boolean z2 = this.f1035au;
                    C0348b c = eVar.mo798c();
                    if (z2) {
                        c.mo774a(eVar, 0);
                    }
                    c.f1073d.mo695a(a6, -1.0f);
                    c.f1073d.mo695a(a7, 1.0f - f);
                    c.f1073d.mo695a(a8, f);
                    eVar.mo789a(c);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo699a(int i) {
        C0333e eVar = this.f953G;
        if (eVar != null) {
            if (this.f1034at == 1) {
                this.f1009w.f932a.mo755a(1, eVar.f1009w.f932a, 0);
                this.f1011y.f932a.mo755a(1, eVar.f1009w.f932a, 0);
                if (this.f1038b != -1) {
                    this.f1008v.f932a.mo755a(1, eVar.f1008v.f932a, this.f1038b);
                    this.f1010x.f932a.mo755a(1, eVar.f1008v.f932a, this.f1038b);
                } else if (this.f1032ar != -1) {
                    this.f1008v.f932a.mo755a(1, eVar.f1010x.f932a, -this.f1032ar);
                    this.f1010x.f932a.mo755a(1, eVar.f1010x.f932a, -this.f1032ar);
                } else if (this.f1031a != -1.0f && eVar.mo743v() == C0335a.FIXED) {
                    int i2 = (int) (((float) eVar.f954H) * this.f1031a);
                    this.f1008v.f932a.mo755a(1, eVar.f1008v.f932a, i2);
                    this.f1010x.f932a.mo755a(1, eVar.f1008v.f932a, i2);
                }
            } else {
                this.f1008v.f932a.mo755a(1, eVar.f1008v.f932a, 0);
                this.f1010x.f932a.mo755a(1, eVar.f1008v.f932a, 0);
                if (this.f1038b != -1) {
                    this.f1009w.f932a.mo755a(1, eVar.f1009w.f932a, this.f1038b);
                    this.f1011y.f932a.mo755a(1, eVar.f1009w.f932a, this.f1038b);
                } else if (this.f1032ar != -1) {
                    this.f1009w.f932a.mo755a(1, eVar.f1011y.f932a, -this.f1032ar);
                    this.f1011y.f932a.mo755a(1, eVar.f1011y.f932a, -this.f1032ar);
                } else if (this.f1031a != -1.0f && eVar.mo744w() == C0335a.FIXED) {
                    int i3 = (int) (((float) eVar.f955I) * this.f1031a);
                    this.f1009w.f932a.mo755a(1, eVar.f1009w.f932a, i3);
                    this.f1011y.f932a.mo755a(1, eVar.f1009w.f932a, i3);
                }
            }
        }
    }
}
