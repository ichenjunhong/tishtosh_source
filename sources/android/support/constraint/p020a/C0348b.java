package android.support.constraint.p020a;

/* renamed from: android.support.constraint.a.b */
public class C0348b implements C0352a {

    /* renamed from: a */
    C0357h f1070a;

    /* renamed from: b */
    float f1071b;

    /* renamed from: c */
    boolean f1072c;

    /* renamed from: d */
    public final C0324a f1073d;

    /* renamed from: e */
    public boolean f1074e;

    /* renamed from: b */
    public final C0357h mo783b() {
        return this.f1070a;
    }

    /* renamed from: a */
    public final void mo778a() {
        this.f1073d.mo691a();
        this.f1070a = null;
        this.f1071b = 0.0f;
    }

    public String toString() {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4 = "";
        if (this.f1070a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append("0");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(this.f1070a);
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" = ");
        String sb4 = sb3.toString();
        if (this.f1071b != 0.0f) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f1071b);
            str2 = sb5.toString();
            z = true;
        } else {
            str2 = sb4;
            z = false;
        }
        int i = this.f1073d.f901a;
        for (int i2 = 0; i2 < i; i2++) {
            C0357h a = this.f1073d.mo689a(i2);
            if (a != null) {
                float b = this.f1073d.mo697b(i2);
                if (b != 0.0f) {
                    String hVar = a.toString();
                    if (!z) {
                        if (b < 0.0f) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str2);
                            sb6.append("- ");
                            str2 = sb6.toString();
                            b *= -1.0f;
                        }
                    } else if (b > 0.0f) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str2);
                        sb7.append(" + ");
                        str2 = sb7.toString();
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str2);
                        sb8.append(" - ");
                        str2 = sb8.toString();
                        b *= -1.0f;
                    }
                    if (b == 1.0f) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str2);
                        sb9.append(hVar);
                        str3 = sb9.toString();
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(str2);
                        sb10.append(b);
                        sb10.append(" ");
                        sb10.append(hVar);
                        str3 = sb10.toString();
                    }
                    str2 = str3;
                    z = true;
                }
            }
        }
        if (z) {
            return str2;
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(str2);
        sb11.append("0.0");
        return sb11.toString();
    }

    public C0348b(C0349c cVar) {
        this.f1073d = new C0324a(this, cVar);
    }

    /* renamed from: c */
    public void mo785c(C0357h hVar) {
        float f = 1.0f;
        if (hVar.f1136e != 1) {
            if (hVar.f1136e == 2) {
                f = 1000.0f;
            } else if (hVar.f1136e == 3) {
                f = 1000000.0f;
            } else if (hVar.f1136e == 4) {
                f = 1.0E9f;
            } else if (hVar.f1136e == 5) {
                f = 1.0E12f;
            }
        }
        this.f1073d.mo695a(hVar, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo784b(C0357h hVar) {
        if (this.f1070a != null) {
            this.f1073d.mo695a(this.f1070a, -1.0f);
            this.f1070a = null;
        }
        float a = this.f1073d.mo688a(hVar, true) * -1.0f;
        this.f1070a = hVar;
        if (a != 1.0f) {
            this.f1071b /= a;
            this.f1073d.mo692a(a);
        }
    }

    /* renamed from: a */
    public final void mo779a(C0352a aVar) {
        if (aVar instanceof C0348b) {
            C0348b bVar = (C0348b) aVar;
            this.f1070a = null;
            this.f1073d.mo691a();
            for (int i = 0; i < bVar.f1073d.f901a; i++) {
                this.f1073d.mo696a(bVar.f1073d.mo689a(i), bVar.f1073d.mo697b(i), true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo780a(C0357h hVar) {
        C0324a aVar = this.f1073d;
        if (aVar.f907g != -1) {
            int i = aVar.f907g;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f901a) {
                if (aVar.f904d[i] == hVar.f1134c) {
                    return true;
                }
                i = aVar.f905e[i];
                i2++;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C0357h mo777a(C0351e eVar, boolean[] zArr) {
        return this.f1073d.mo690a(zArr, (C0357h) null);
    }

    /* renamed from: a */
    public final C0348b mo774a(C0351e eVar, int i) {
        this.f1073d.mo695a(eVar.mo787a(i, "ep"), 1.0f);
        this.f1073d.mo695a(eVar.mo787a(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: a */
    public final C0348b mo775a(C0357h hVar, C0357h hVar2, C0357h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1071b = (float) i;
        }
        if (!z) {
            this.f1073d.mo695a(hVar, -1.0f);
            this.f1073d.mo695a(hVar2, 1.0f);
            this.f1073d.mo695a(hVar3, 1.0f);
        } else {
            this.f1073d.mo695a(hVar, 1.0f);
            this.f1073d.mo695a(hVar2, -1.0f);
            this.f1073d.mo695a(hVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0348b mo781b(C0357h hVar, C0357h hVar2, C0357h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1071b = (float) i;
        }
        if (!z) {
            this.f1073d.mo695a(hVar, -1.0f);
            this.f1073d.mo695a(hVar2, 1.0f);
            this.f1073d.mo695a(hVar3, -1.0f);
        } else {
            this.f1073d.mo695a(hVar, 1.0f);
            this.f1073d.mo695a(hVar2, -1.0f);
            this.f1073d.mo695a(hVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0348b mo782b(C0357h hVar, C0357h hVar2, C0357h hVar3, C0357h hVar4, float f) {
        this.f1073d.mo695a(hVar3, 0.5f);
        this.f1073d.mo695a(hVar4, 0.5f);
        this.f1073d.mo695a(hVar, -0.5f);
        this.f1073d.mo695a(hVar2, -0.5f);
        this.f1071b = -f;
        return this;
    }

    /* renamed from: a */
    public final C0348b mo776a(C0357h hVar, C0357h hVar2, C0357h hVar3, C0357h hVar4, float f) {
        this.f1073d.mo695a(hVar, -1.0f);
        this.f1073d.mo695a(hVar2, 1.0f);
        this.f1073d.mo695a(hVar3, f);
        this.f1073d.mo695a(hVar4, -f);
        return this;
    }

    /* renamed from: a */
    public final C0348b mo773a(float f, float f2, float f3, C0357h hVar, C0357h hVar2, C0357h hVar3, C0357h hVar4) {
        this.f1071b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f1073d.mo695a(hVar, 1.0f);
            this.f1073d.mo695a(hVar2, -1.0f);
            this.f1073d.mo695a(hVar4, 1.0f);
            this.f1073d.mo695a(hVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f1073d.mo695a(hVar, 1.0f);
            this.f1073d.mo695a(hVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f1073d.mo695a(hVar3, 1.0f);
            this.f1073d.mo695a(hVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f1073d.mo695a(hVar, 1.0f);
            this.f1073d.mo695a(hVar2, -1.0f);
            this.f1073d.mo695a(hVar4, f4);
            this.f1073d.mo695a(hVar3, -f4);
        }
        return this;
    }
}
