package android.support.constraint.p020a;

import android.support.constraint.p020a.C0357h.C0358a;
import android.support.constraint.p020a.p021a.C0328d;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.a.e */
public final class C0351e {

    /* renamed from: h */
    public static C0353f f1078h = null;

    /* renamed from: i */
    private static int f1079i = 1000;

    /* renamed from: a */
    public int f1080a;

    /* renamed from: b */
    public C0352a f1081b;

    /* renamed from: c */
    public C0348b[] f1082c = new C0348b[this.f1088k];

    /* renamed from: d */
    public boolean f1083d;

    /* renamed from: e */
    int f1084e = 1;

    /* renamed from: f */
    public int f1085f;

    /* renamed from: g */
    public final C0349c f1086g;

    /* renamed from: j */
    private HashMap<String, C0357h> f1087j;

    /* renamed from: k */
    private int f1088k = 32;

    /* renamed from: l */
    private int f1089l = this.f1088k;

    /* renamed from: m */
    private boolean[] f1090m = new boolean[this.f1088k];

    /* renamed from: n */
    private int f1091n = this.f1088k;

    /* renamed from: o */
    private C0357h[] f1092o = new C0357h[f1079i];

    /* renamed from: p */
    private int f1093p;

    /* renamed from: q */
    private C0348b[] f1094q = new C0348b[this.f1088k];

    /* renamed from: r */
    private final C0352a f1095r;

    /* renamed from: android.support.constraint.a.e$a */
    interface C0352a {
        /* renamed from: a */
        C0357h mo777a(C0351e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo778a();

        /* renamed from: a */
        void mo779a(C0352a aVar);

        /* renamed from: b */
        C0357h mo783b();

        /* renamed from: c */
        void mo785c(C0357h hVar);
    }

    /* renamed from: a */
    public static C0353f m843a() {
        return f1078h;
    }

    /* renamed from: a */
    public final void mo794a(C0357h hVar, C0357h hVar2, int i, int i2) {
        C0348b c = mo798c();
        C0357h d = mo800d();
        d.f1136e = 0;
        c.mo775a(hVar, hVar2, d, i);
        if (i2 != 6) {
            mo790a(c, (int) (c.f1073d.mo687a(d) * -1.0f), i2);
        }
        mo789a(c);
    }

    /* renamed from: a */
    public final void mo793a(C0357h hVar, C0357h hVar2, int i, float f, C0357h hVar3, C0357h hVar4, int i2, int i3) {
        C0348b c = mo798c();
        if (hVar2 == hVar3) {
            c.f1073d.mo695a(hVar, 1.0f);
            c.f1073d.mo695a(hVar4, 1.0f);
            c.f1073d.mo695a(hVar2, -2.0f);
        } else if (f == 0.5f) {
            c.f1073d.mo695a(hVar, 1.0f);
            c.f1073d.mo695a(hVar2, -1.0f);
            c.f1073d.mo695a(hVar3, -1.0f);
            c.f1073d.mo695a(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                c.f1071b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            c.f1073d.mo695a(hVar, -1.0f);
            c.f1073d.mo695a(hVar2, 1.0f);
            c.f1071b = (float) i;
        } else if (f >= 1.0f) {
            c.f1073d.mo695a(hVar3, -1.0f);
            c.f1073d.mo695a(hVar4, 1.0f);
            c.f1071b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            c.f1073d.mo695a(hVar, f2 * 1.0f);
            c.f1073d.mo695a(hVar2, f2 * -1.0f);
            c.f1073d.mo695a(hVar3, -1.0f * f);
            c.f1073d.mo695a(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c.f1071b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        if (i3 != 6) {
            c.mo774a(this, i3);
        }
        mo789a(c);
    }

    /* renamed from: a */
    public final void mo792a(C0357h hVar, int i) {
        int i2 = hVar.f1135d;
        if (hVar.f1135d != -1) {
            C0348b bVar = this.f1082c[i2];
            if (bVar.f1074e) {
                bVar.f1071b = (float) i;
            } else if (bVar.f1073d.f901a == 0) {
                bVar.f1074e = true;
                bVar.f1071b = (float) i;
            } else {
                C0348b c = mo798c();
                if (i < 0) {
                    c.f1071b = (float) (i * -1);
                    c.f1073d.mo695a(hVar, 1.0f);
                } else {
                    c.f1071b = (float) i;
                    c.f1073d.mo695a(hVar, -1.0f);
                }
                mo789a(c);
            }
        } else {
            C0348b c2 = mo798c();
            c2.f1070a = hVar;
            float f = (float) i;
            hVar.f1137f = f;
            c2.f1071b = f;
            c2.f1074e = true;
            mo789a(c2);
        }
    }

    /* renamed from: g */
    private void m850g() {
        for (int i = 0; i < this.f1082c.length; i++) {
            C0348b bVar = this.f1082c[i];
            if (bVar != null) {
                this.f1086g.f1075a.mo805a(bVar);
            }
            this.f1082c[i] = null;
        }
    }

    /* renamed from: e */
    public void mo801e() {
        for (int i = 0; i < this.f1085f; i++) {
            C0348b bVar = this.f1082c[i];
            bVar.f1070a.f1137f = bVar.f1071b;
        }
    }

    /* renamed from: d */
    public final C0357h mo800d() {
        if (f1078h != null) {
            C0353f fVar = f1078h;
            fVar.f1113n++;
        }
        if (this.f1084e + 1 >= this.f1089l) {
            m849f();
        }
        C0357h a = m844a(C0358a.SLACK, (String) null);
        this.f1080a++;
        this.f1084e++;
        a.f1134c = this.f1080a;
        this.f1086g.f1077c[this.f1080a] = a;
        return a;
    }

    public C0351e() {
        m850g();
        this.f1086g = new C0349c();
        this.f1081b = new C0350d(this.f1086g);
        this.f1095r = new C0348b(this.f1086g);
    }

    /* renamed from: f */
    private void m849f() {
        this.f1088k *= 2;
        this.f1082c = (C0348b[]) Arrays.copyOf(this.f1082c, this.f1088k);
        this.f1086g.f1077c = (C0357h[]) Arrays.copyOf(this.f1086g.f1077c, this.f1088k);
        this.f1090m = new boolean[this.f1088k];
        this.f1089l = this.f1088k;
        this.f1091n = this.f1088k;
        if (f1078h != null) {
            C0353f fVar = f1078h;
            fVar.f1103d++;
            C0353f fVar2 = f1078h;
            fVar2.f1115p = Math.max(fVar2.f1115p, (long) this.f1088k);
            C0353f fVar3 = f1078h;
            fVar3.f1099D = fVar3.f1115p;
        }
    }

    /* renamed from: b */
    public final void mo796b() {
        for (C0357h hVar : this.f1086g.f1077c) {
            if (hVar != null) {
                hVar.mo806a();
            }
        }
        this.f1086g.f1076b.mo804a(this.f1092o, this.f1093p);
        this.f1093p = 0;
        Arrays.fill(this.f1086g.f1077c, null);
        if (this.f1087j != null) {
            this.f1087j.clear();
        }
        this.f1080a = 0;
        this.f1081b.mo778a();
        this.f1084e = 1;
        for (int i = 0; i < this.f1085f; i++) {
            this.f1082c[i].f1072c = false;
        }
        m850g();
        this.f1085f = 0;
    }

    /* renamed from: c */
    public final C0348b mo798c() {
        C0348b bVar = (C0348b) this.f1086g.f1075a.mo803a();
        if (bVar == null) {
            bVar = new C0348b(this.f1086g);
        } else {
            bVar.f1070a = null;
            bVar.f1073d.mo691a();
            bVar.f1071b = 0.0f;
            bVar.f1074e = false;
        }
        C0357h.f1128a++;
        return bVar;
    }

    /* renamed from: b */
    public static int m846b(Object obj) {
        C0357h hVar = ((C0328d) obj).f941j;
        if (hVar != null) {
            return (int) (hVar.f1137f + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private final void m847b(C0348b bVar) {
        if (this.f1085f > 0) {
            bVar.f1073d.mo694a(bVar, this.f1082c);
            if (bVar.f1073d.f901a == 0) {
                bVar.f1074e = true;
            }
        }
    }

    /* renamed from: c */
    private final void m848c(C0348b bVar) {
        if (this.f1082c[this.f1085f] != null) {
            this.f1086g.f1075a.mo805a(this.f1082c[this.f1085f]);
        }
        this.f1082c[this.f1085f] = bVar;
        bVar.f1070a.f1135d = this.f1085f;
        this.f1085f++;
        bVar.f1070a.mo810c(bVar);
    }

    /* renamed from: b */
    private int m845b(C0352a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i < this.f1085f) {
                if (this.f1082c[i].f1070a.f1139h != C0358a.UNRESTRICTED && this.f1082c[i].f1071b < 0.0f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            if (f1078h != null) {
                C0353f fVar = f1078h;
                fVar.f1110k++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f1085f) {
                C0348b bVar = this.f1082c[i3];
                if (bVar.f1070a.f1139h != C0358a.UNRESTRICTED && !bVar.f1074e && bVar.f1071b < f) {
                    int i7 = 1;
                    while (i7 < this.f1084e) {
                        C0357h hVar = this.f1086g.f1077c[i7];
                        float a = bVar.f1073d.mo687a(hVar);
                        if (a > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = hVar.f1138g[i11] / a;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0348b bVar2 = this.f1082c[i4];
                bVar2.f1070a.f1135d = -1;
                if (f1078h != null) {
                    C0353f fVar2 = f1078h;
                    fVar2.f1109j++;
                }
                bVar2.mo784b(this.f1086g.f1077c[i5]);
                bVar2.f1070a.f1135d = i4;
                bVar2.f1070a.mo810c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f1084e / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: a */
    public final C0357h mo788a(Object obj) {
        C0357h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1084e + 1 >= this.f1089l) {
            m849f();
        }
        if (obj instanceof C0328d) {
            C0328d dVar = (C0328d) obj;
            hVar = dVar.f941j;
            if (hVar == null) {
                dVar.mo706a(this.f1086g);
                hVar = dVar.f941j;
            }
            if (hVar.f1134c == -1 || hVar.f1134c > this.f1080a || this.f1086g.f1077c[hVar.f1134c] == null) {
                if (hVar.f1134c != -1) {
                    hVar.mo806a();
                }
                this.f1080a++;
                this.f1084e++;
                hVar.f1134c = this.f1080a;
                hVar.f1139h = C0358a.UNRESTRICTED;
                this.f1086g.f1077c[this.f1080a] = hVar;
            }
        }
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0111 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo789a(android.support.constraint.p020a.C0348b r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            android.support.constraint.a.f r2 = f1078h
            r3 = 1
            if (r2 == 0) goto L_0x001f
            android.support.constraint.a.f r2 = f1078h
            long r5 = r2.f1105f
            long r5 = r5 + r3
            r2.f1105f = r5
            boolean r2 = r1.f1074e
            if (r2 == 0) goto L_0x001f
            android.support.constraint.a.f r2 = f1078h
            long r5 = r2.f1106g
            long r5 = r5 + r3
            r2.f1106g = r5
        L_0x001f:
            int r2 = r0.f1085f
            r5 = 1
            int r2 = r2 + r5
            int r6 = r0.f1091n
            if (r2 >= r6) goto L_0x002e
            int r2 = r0.f1084e
            int r2 = r2 + r5
            int r6 = r0.f1089l
            if (r2 < r6) goto L_0x0031
        L_0x002e:
            r19.m849f()
        L_0x0031:
            boolean r2 = r1.f1074e
            if (r2 != 0) goto L_0x01c5
            r19.m847b(r20)
            android.support.constraint.a.h r2 = r1.f1070a
            r7 = 0
            if (r2 != 0) goto L_0x004b
            float r2 = r1.f1071b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x004b
            android.support.constraint.a.a r2 = r1.f1073d
            int r2 = r2.f901a
            if (r2 != 0) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x004f
            return
        L_0x004f:
            float r2 = r1.f1071b
            r8 = -1
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0078
            float r2 = r1.f1071b
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r9
            r1.f1071b = r2
            android.support.constraint.a.a r2 = r1.f1073d
            int r10 = r2.f907g
            r11 = 0
        L_0x0063:
            if (r10 == r8) goto L_0x0078
            int r12 = r2.f901a
            if (r11 >= r12) goto L_0x0078
            float[] r12 = r2.f906f
            r13 = r12[r10]
            float r13 = r13 * r9
            r12[r10] = r13
            int[] r12 = r2.f905e
            r10 = r12[r10]
            int r11 = r11 + 1
            goto L_0x0063
        L_0x0078:
            android.support.constraint.a.a r2 = r1.f1073d
            int r9 = r2.f907g
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0085:
            if (r9 == r8) goto L_0x011c
            int r6 = r2.f901a
            if (r11 >= r6) goto L_0x011c
            float[] r6 = r2.f906f
            r6 = r6[r9]
            android.support.constraint.a.c r8 = r2.f903c
            android.support.constraint.a.h[] r8 = r8.f1077c
            int[] r10 = r2.f904d
            r10 = r10[r9]
            r8 = r8[r10]
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x00af
            r10 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c0
            float[] r6 = r2.f906f
            r6[r9] = r7
            android.support.constraint.a.b r6 = r2.f902b
            r8.mo809b(r6)
        L_0x00ad:
            r6 = 0
            goto L_0x00c0
        L_0x00af:
            r10 = 981668463(0x3a83126f, float:0.001)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c0
            float[] r6 = r2.f906f
            r6[r9] = r7
            android.support.constraint.a.b r6 = r2.f902b
            r8.mo809b(r6)
            goto L_0x00ad
        L_0x00c0:
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0111
            android.support.constraint.a.h$a r10 = r8.f1139h
            android.support.constraint.a.h$a r3 = android.support.constraint.p020a.C0357h.C0358a.UNRESTRICTED
            if (r10 != r3) goto L_0x00e9
            if (r12 != 0) goto L_0x00d4
            boolean r3 = android.support.constraint.p020a.C0324a.m712a(r8, r0)
        L_0x00d0:
            r15 = r3
            r14 = r6
            r12 = r8
            goto L_0x0111
        L_0x00d4:
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00dd
            boolean r3 = android.support.constraint.p020a.C0324a.m712a(r8, r0)
            goto L_0x00d0
        L_0x00dd:
            if (r15 != 0) goto L_0x0111
            boolean r3 = android.support.constraint.p020a.C0324a.m712a(r8, r0)
            if (r3 == 0) goto L_0x0111
            r14 = r6
            r12 = r8
            r15 = 1
            goto L_0x0111
        L_0x00e9:
            if (r12 != 0) goto L_0x0111
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0111
            if (r13 != 0) goto L_0x00fb
            boolean r3 = android.support.constraint.p020a.C0324a.m712a(r8, r0)
        L_0x00f5:
            r17 = r3
            r16 = r6
            r13 = r8
            goto L_0x0111
        L_0x00fb:
            int r3 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0104
            boolean r3 = android.support.constraint.p020a.C0324a.m712a(r8, r0)
            goto L_0x00f5
        L_0x0104:
            if (r17 != 0) goto L_0x0111
            boolean r3 = android.support.constraint.p020a.C0324a.m712a(r8, r0)
            if (r3 == 0) goto L_0x0111
            r16 = r6
            r13 = r8
            r17 = 1
        L_0x0111:
            int[] r3 = r2.f905e
            r9 = r3[r9]
            int r11 = r11 + 1
            r3 = 1
            r8 = -1
            goto L_0x0085
        L_0x011c:
            if (r12 == 0) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r12 = r13
        L_0x0120:
            if (r12 != 0) goto L_0x0124
            r2 = 1
            goto L_0x0128
        L_0x0124:
            r1.mo784b(r12)
            r2 = 0
        L_0x0128:
            android.support.constraint.a.a r3 = r1.f1073d
            int r3 = r3.f901a
            if (r3 != 0) goto L_0x0130
            r1.f1074e = r5
        L_0x0130:
            if (r2 == 0) goto L_0x01a7
            android.support.constraint.a.f r2 = f1078h
            if (r2 == 0) goto L_0x013f
            android.support.constraint.a.f r2 = f1078h
            long r3 = r2.f1114o
            r8 = 1
            long r3 = r3 + r8
            r2.f1114o = r3
        L_0x013f:
            int r2 = r0.f1084e
            int r2 = r2 + r5
            int r3 = r0.f1089l
            if (r2 < r3) goto L_0x0149
            r19.m849f()
        L_0x0149:
            android.support.constraint.a.h$a r2 = android.support.constraint.p020a.C0357h.C0358a.SLACK
            r3 = 0
            android.support.constraint.a.h r2 = r0.m844a(r2, r3)
            int r3 = r0.f1080a
            int r3 = r3 + r5
            r0.f1080a = r3
            int r3 = r0.f1084e
            int r3 = r3 + r5
            r0.f1084e = r3
            int r3 = r0.f1080a
            r2.f1134c = r3
            android.support.constraint.a.c r3 = r0.f1086g
            android.support.constraint.a.h[] r3 = r3.f1077c
            int r4 = r0.f1080a
            r3[r4] = r2
            r1.f1070a = r2
            r19.m848c(r20)
            android.support.constraint.a.e$a r3 = r0.f1095r
            r3.mo779a(r1)
            android.support.constraint.a.e$a r3 = r0.f1095r
            r0.m842a(r3, r5)
            int r3 = r2.f1135d
            r4 = -1
            if (r3 != r4) goto L_0x01a5
            android.support.constraint.a.h r3 = r1.f1070a
            if (r3 != r2) goto L_0x0197
            android.support.constraint.a.a r3 = r1.f1073d
            r4 = 0
            android.support.constraint.a.h r2 = r3.mo690a(r4, r2)
            if (r2 == 0) goto L_0x0197
            android.support.constraint.a.f r3 = f1078h
            if (r3 == 0) goto L_0x0194
            android.support.constraint.a.f r3 = f1078h
            long r8 = r3.f1109j
            r10 = 1
            long r8 = r8 + r10
            r3.f1109j = r8
        L_0x0194:
            r1.mo784b(r2)
        L_0x0197:
            boolean r2 = r1.f1074e
            if (r2 != 0) goto L_0x01a0
            android.support.constraint.a.h r2 = r1.f1070a
            r2.mo810c(r1)
        L_0x01a0:
            int r2 = r0.f1085f
            int r2 = r2 - r5
            r0.f1085f = r2
        L_0x01a5:
            r6 = 1
            goto L_0x01a8
        L_0x01a7:
            r6 = 0
        L_0x01a8:
            android.support.constraint.a.h r2 = r1.f1070a
            if (r2 == 0) goto L_0x01bd
            android.support.constraint.a.h r2 = r1.f1070a
            android.support.constraint.a.h$a r2 = r2.f1139h
            android.support.constraint.a.h$a r3 = android.support.constraint.p020a.C0357h.C0358a.UNRESTRICTED
            if (r2 == r3) goto L_0x01ba
            float r2 = r1.f1071b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01bd
        L_0x01ba:
            r18 = 1
            goto L_0x01bf
        L_0x01bd:
            r18 = 0
        L_0x01bf:
            if (r18 != 0) goto L_0x01c2
            return
        L_0x01c2:
            r18 = r6
            goto L_0x01c7
        L_0x01c5:
            r18 = 0
        L_0x01c7:
            if (r18 != 0) goto L_0x01cc
            r19.m848c(r20)
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.C0351e.mo789a(android.support.constraint.a.b):void");
    }

    /* renamed from: a */
    public final void mo791a(C0352a aVar) throws Exception {
        if (f1078h != null) {
            C0353f fVar = f1078h;
            fVar.f1119t++;
            C0353f fVar2 = f1078h;
            fVar2.f1120u = Math.max(fVar2.f1120u, (long) this.f1084e);
            C0353f fVar3 = f1078h;
            fVar3.f1121v = Math.max(fVar3.f1121v, (long) this.f1085f);
        }
        m847b((C0348b) aVar);
        m845b(aVar);
        m842a(aVar, false);
        mo801e();
    }

    /* renamed from: a */
    private C0357h m844a(C0358a aVar, String str) {
        C0357h hVar = (C0357h) this.f1086g.f1076b.mo803a();
        if (hVar == null) {
            hVar = new C0357h(aVar, str);
            hVar.mo808a(aVar, str);
        } else {
            hVar.mo806a();
            hVar.mo808a(aVar, str);
        }
        if (this.f1093p >= f1079i) {
            f1079i *= 2;
            this.f1092o = (C0357h[]) Arrays.copyOf(this.f1092o, f1079i);
        }
        C0357h[] hVarArr = this.f1092o;
        int i = this.f1093p;
        this.f1093p = i + 1;
        hVarArr[i] = hVar;
        return hVar;
    }

    /* renamed from: a */
    public final C0357h mo787a(int i, String str) {
        if (f1078h != null) {
            C0353f fVar = f1078h;
            fVar.f1112m++;
        }
        if (this.f1084e + 1 >= this.f1089l) {
            m849f();
        }
        C0357h a = m844a(C0358a.ERROR, str);
        this.f1080a++;
        this.f1084e++;
        a.f1134c = this.f1080a;
        a.f1136e = i;
        this.f1086g.f1077c[this.f1080a] = a;
        this.f1081b.mo785c(a);
        return a;
    }

    /* renamed from: a */
    private final int m842a(C0352a aVar, boolean z) {
        if (f1078h != null) {
            C0353f fVar = f1078h;
            fVar.f1107h++;
        }
        for (int i = 0; i < this.f1084e; i++) {
            this.f1090m[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            if (f1078h != null) {
                C0353f fVar2 = f1078h;
                fVar2.f1108i++;
            }
            i2++;
            if (i2 >= this.f1084e * 2) {
                return i2;
            }
            if (aVar.mo783b() != null) {
                this.f1090m[aVar.mo783b().f1134c] = true;
            }
            C0357h a = aVar.mo777a(this, this.f1090m);
            if (a != null) {
                if (this.f1090m[a.f1134c]) {
                    return i2;
                }
                this.f1090m[a.f1134c] = true;
            }
            if (a != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.f1085f; i4++) {
                    C0348b bVar = this.f1082c[i4];
                    if (bVar.f1070a.f1139h != C0358a.UNRESTRICTED && !bVar.f1074e && bVar.mo780a(a)) {
                        float a2 = bVar.f1073d.mo687a(a);
                        if (a2 < 0.0f) {
                            float f2 = (-bVar.f1071b) / a2;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    C0348b bVar2 = this.f1082c[i3];
                    bVar2.f1070a.f1135d = -1;
                    if (f1078h != null) {
                        C0353f fVar3 = f1078h;
                        fVar3.f1109j++;
                    }
                    bVar2.mo784b(a);
                    bVar2.f1070a.f1135d = i3;
                    bVar2.f1070a.mo810c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo790a(C0348b bVar, int i, int i2) {
        bVar.f1073d.mo695a(mo787a(i2, (String) null), (float) i);
    }

    /* renamed from: b */
    public final void mo797b(C0357h hVar, C0357h hVar2, int i, int i2) {
        C0348b c = mo798c();
        C0357h d = mo800d();
        d.f1136e = 0;
        c.mo781b(hVar, hVar2, d, i);
        if (i2 != 6) {
            mo790a(c, (int) (c.f1073d.mo687a(d) * -1.0f), i2);
        }
        mo789a(c);
    }

    /* renamed from: c */
    public final C0348b mo799c(C0357h hVar, C0357h hVar2, int i, int i2) {
        C0348b c = mo798c();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c.f1071b = (float) i;
        }
        if (!z) {
            c.f1073d.mo695a(hVar, -1.0f);
            c.f1073d.mo695a(hVar2, 1.0f);
        } else {
            c.f1073d.mo695a(hVar, 1.0f);
            c.f1073d.mo695a(hVar2, -1.0f);
        }
        if (i2 != 6) {
            c.mo774a(this, i2);
        }
        mo789a(c);
        return c;
    }

    /* renamed from: a */
    public final void mo795a(C0357h hVar, C0357h hVar2, C0357h hVar3, C0357h hVar4, float f, int i) {
        C0348b c = mo798c();
        c.mo776a(hVar, hVar2, hVar3, hVar4, f);
        mo789a(c);
    }
}
