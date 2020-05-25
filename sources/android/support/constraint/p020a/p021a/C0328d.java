package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0349c;
import android.support.constraint.p020a.C0357h;
import android.support.constraint.p020a.C0357h.C0358a;

/* renamed from: android.support.constraint.a.a.d */
public final class C0328d {

    /* renamed from: a */
    public C0342k f932a = new C0342k(this);

    /* renamed from: b */
    public final C0333e f933b;

    /* renamed from: c */
    public final C0332c f934c;

    /* renamed from: d */
    public C0328d f935d;

    /* renamed from: e */
    public int f936e = 0;

    /* renamed from: f */
    int f937f = -1;

    /* renamed from: g */
    public C0331b f938g = C0331b.NONE;

    /* renamed from: h */
    public C0330a f939h = C0330a.RELAXED;

    /* renamed from: i */
    public int f940i = 0;

    /* renamed from: j */
    public C0357h f941j;

    /* renamed from: android.support.constraint.a.a.d$a */
    public enum C0330a {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.a.a.d$b */
    public enum C0331b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.a.a.d$c */
    public enum C0332c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: c */
    public final boolean mo709c() {
        if (this.f935d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo705a() {
        if (this.f933b.f975ad == 8) {
            return 0;
        }
        if (this.f937f < 0 || this.f935d == null || this.f935d.f933b.f975ad != 8) {
            return this.f936e;
        }
        return this.f937f;
    }

    /* renamed from: b */
    public final void mo708b() {
        this.f935d = null;
        this.f936e = 0;
        this.f937f = -1;
        this.f938g = C0331b.STRONG;
        this.f940i = 0;
        this.f939h = C0330a.RELAXED;
        this.f932a.mo760b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f933b.f976ae);
        sb.append(":");
        sb.append(this.f934c.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo706a(C0349c cVar) {
        if (this.f941j == null) {
            this.f941j = new C0357h(C0358a.UNRESTRICTED, null);
        } else {
            this.f941j.mo806a();
        }
    }

    /* renamed from: a */
    private boolean m732a(C0328d dVar) {
        boolean z;
        boolean z2;
        if (dVar == null) {
            return false;
        }
        C0332c cVar = dVar.f934c;
        if (cVar != this.f934c) {
            switch (this.f934c) {
                case CENTER:
                    if (cVar == C0332c.BASELINE || cVar == C0332c.CENTER_X || cVar == C0332c.CENTER_Y) {
                        return false;
                    }
                    return true;
                case LEFT:
                case RIGHT:
                    if (cVar == C0332c.LEFT || cVar == C0332c.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVar.f933b instanceof C0337g) {
                        if (z || cVar == C0332c.CENTER_X) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    return z;
                case TOP:
                case BOTTOM:
                    if (cVar == C0332c.TOP || cVar == C0332c.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVar.f933b instanceof C0337g) {
                        if (z2 || cVar == C0332c.CENTER_Y) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    return z2;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.f934c.name());
            }
        } else if (this.f934c != C0332c.BASELINE || (dVar.f933b.mo738r() && this.f933b.mo738r())) {
            return true;
        } else {
            return false;
        }
    }

    public C0328d(C0333e eVar, C0332c cVar) {
        this.f933b = eVar;
        this.f934c = cVar;
    }

    /* renamed from: a */
    public final boolean mo707a(C0328d dVar, int i, int i2, C0331b bVar, int i3, boolean z) {
        if (dVar == null) {
            this.f935d = null;
            this.f936e = 0;
            this.f937f = -1;
            this.f938g = C0331b.NONE;
            this.f940i = 2;
            return true;
        } else if (!z && !m732a(dVar)) {
            return false;
        } else {
            this.f935d = dVar;
            if (i > 0) {
                this.f936e = i;
            } else {
                this.f936e = 0;
            }
            this.f937f = i2;
            this.f938g = bVar;
            this.f940i = i3;
            return true;
        }
    }
}
