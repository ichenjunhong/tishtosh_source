package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0351e;
import android.support.constraint.p020a.C0353f;
import android.support.constraint.p020a.C0357h;
import android.support.constraint.p020a.p021a.C0328d.C0332c;

/* renamed from: android.support.constraint.a.a.k */
public final class C0342k extends C0344m {

    /* renamed from: a */
    C0328d f1043a;

    /* renamed from: b */
    float f1044b;

    /* renamed from: c */
    C0342k f1045c;

    /* renamed from: d */
    float f1046d;

    /* renamed from: e */
    C0342k f1047e;

    /* renamed from: f */
    public float f1048f;

    /* renamed from: g */
    public int f1049g;

    /* renamed from: j */
    private C0342k f1050j;

    /* renamed from: k */
    private float f1051k;

    /* renamed from: l */
    private C0343l f1052l;

    /* renamed from: m */
    private int f1053m = 1;

    /* renamed from: n */
    private C0343l f1054n;

    /* renamed from: o */
    private int f1055o = 1;

    /* renamed from: a */
    private static String m801a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: b */
    public final void mo760b() {
        super.mo760b();
        this.f1045c = null;
        this.f1046d = 0.0f;
        this.f1052l = null;
        this.f1053m = 1;
        this.f1054n = null;
        this.f1055o = 1;
        this.f1047e = null;
        this.f1048f = 0.0f;
        this.f1044b = 0.0f;
        this.f1050j = null;
        this.f1051k = 0.0f;
        this.f1049g = 0;
    }

    public final String toString() {
        if (this.f1058i != 1) {
            StringBuilder sb = new StringBuilder("{ ");
            sb.append(this.f1043a);
            sb.append(" UNRESOLVED} type: ");
            sb.append(m801a(this.f1049g));
            return sb.toString();
        } else if (this.f1047e == this) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f1043a);
            sb2.append(", RESOLVED: ");
            sb2.append(this.f1048f);
            sb2.append("]  type: ");
            sb2.append(m801a(this.f1049g));
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(this.f1043a);
            sb3.append(", RESOLVED: ");
            sb3.append(this.f1047e);
            sb3.append(":");
            sb3.append(this.f1048f);
            sb3.append("] type: ");
            sb3.append(m801a(this.f1049g));
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public final void mo754a() {
        float f;
        float f2;
        float f3;
        boolean z = true;
        if (this.f1058i != 1 && this.f1049g != 4) {
            if (this.f1052l != null) {
                if (this.f1052l.f1058i == 1) {
                    this.f1046d = ((float) this.f1053m) * this.f1052l.f1056a;
                } else {
                    return;
                }
            }
            if (this.f1054n != null) {
                if (this.f1054n.f1058i == 1) {
                    this.f1051k = ((float) this.f1055o) * this.f1054n.f1056a;
                } else {
                    return;
                }
            }
            if (this.f1049g == 1 && (this.f1045c == null || this.f1045c.f1058i == 1)) {
                if (this.f1045c == null) {
                    this.f1047e = this;
                    this.f1048f = this.f1046d;
                } else {
                    this.f1047e = this.f1045c.f1047e;
                    this.f1048f = this.f1045c.f1048f + this.f1046d;
                }
                mo768e();
            } else if (this.f1049g == 2 && this.f1045c != null && this.f1045c.f1058i == 1 && this.f1050j != null && this.f1050j.f1045c != null && this.f1050j.f1045c.f1058i == 1) {
                if (C0351e.m843a() != null) {
                    C0353f a = C0351e.m843a();
                    a.f1122w++;
                }
                this.f1047e = this.f1045c.f1047e;
                this.f1050j.f1047e = this.f1050j.f1045c.f1047e;
                int i = 0;
                if (!(this.f1043a.f934c == C0332c.RIGHT || this.f1043a.f934c == C0332c.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f = this.f1045c.f1048f - this.f1050j.f1045c.f1048f;
                } else {
                    f = this.f1050j.f1045c.f1048f - this.f1045c.f1048f;
                }
                if (this.f1043a.f934c == C0332c.LEFT || this.f1043a.f934c == C0332c.RIGHT) {
                    f3 = f - ((float) this.f1043a.f933b.mo730j());
                    f2 = this.f1043a.f933b.f971Z;
                } else {
                    f3 = f - ((float) this.f1043a.f933b.mo731k());
                    f2 = this.f1043a.f933b.f972aa;
                }
                int a2 = this.f1043a.mo705a();
                int a3 = this.f1050j.f1043a.mo705a();
                if (this.f1043a.f935d == this.f1050j.f1043a.f935d) {
                    f2 = 0.5f;
                    a3 = 0;
                } else {
                    i = a2;
                }
                float f4 = (float) i;
                float f5 = (float) a3;
                float f6 = (f3 - f4) - f5;
                if (z) {
                    this.f1050j.f1048f = this.f1050j.f1045c.f1048f + f5 + (f6 * f2);
                    this.f1048f = (this.f1045c.f1048f - f4) - (f6 * (1.0f - f2));
                } else {
                    this.f1048f = this.f1045c.f1048f + f4 + (f6 * f2);
                    this.f1050j.f1048f = (this.f1050j.f1045c.f1048f - f5) - (f6 * (1.0f - f2));
                }
                mo768e();
                this.f1050j.mo768e();
            } else if (this.f1049g != 3 || this.f1045c == null || this.f1045c.f1058i != 1 || this.f1050j == null || this.f1050j.f1045c == null || this.f1050j.f1045c.f1058i != 1) {
                if (this.f1049g == 5) {
                    this.f1043a.f933b.mo703c();
                }
            } else {
                if (C0351e.m843a() != null) {
                    C0353f a4 = C0351e.m843a();
                    a4.f1123x++;
                }
                this.f1047e = this.f1045c.f1047e;
                this.f1050j.f1047e = this.f1050j.f1045c.f1047e;
                this.f1048f = this.f1045c.f1048f + this.f1046d;
                this.f1050j.f1048f = this.f1050j.f1045c.f1048f + this.f1050j.f1046d;
                mo768e();
                this.f1050j.mo768e();
            }
        }
    }

    public C0342k(C0328d dVar) {
        this.f1043a = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo759a(C0351e eVar) {
        C0357h hVar = this.f1043a.f941j;
        if (this.f1047e == null) {
            eVar.mo792a(hVar, (int) this.f1048f);
        } else {
            eVar.mo799c(hVar, eVar.mo788a((Object) this.f1047e.f1043a), (int) this.f1048f, 6);
        }
    }

    /* renamed from: b */
    public final void mo761b(C0342k kVar, float f) {
        this.f1050j = kVar;
        this.f1051k = f;
    }

    /* renamed from: a */
    public final void mo756a(C0342k kVar, float f) {
        if (this.f1058i == 0 || !(this.f1047e == kVar || this.f1048f == f)) {
            this.f1047e = kVar;
            this.f1048f = f;
            if (this.f1058i == 1) {
                mo767d();
            }
            mo768e();
        }
    }

    /* renamed from: a */
    public final void mo757a(C0342k kVar, int i) {
        this.f1045c = kVar;
        this.f1046d = (float) i;
        this.f1045c.mo766a(this);
    }

    /* renamed from: a */
    public final void mo755a(int i, C0342k kVar, int i2) {
        this.f1049g = 1;
        this.f1045c = kVar;
        this.f1046d = (float) i2;
        this.f1045c.mo766a(this);
    }

    /* renamed from: b */
    public final void mo762b(C0342k kVar, int i, C0343l lVar) {
        this.f1050j = kVar;
        this.f1054n = lVar;
        this.f1055o = i;
    }

    /* renamed from: a */
    public final void mo758a(C0342k kVar, int i, C0343l lVar) {
        this.f1045c = kVar;
        this.f1045c.mo766a(this);
        this.f1052l = lVar;
        this.f1053m = i;
        this.f1052l.mo766a(this);
    }
}
