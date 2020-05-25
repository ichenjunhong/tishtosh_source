package com.facebook.p982j.p986c;

import com.C2240a;
import com.facebook.p982j.C14369a;
import java.util.Locale;

/* renamed from: com.facebook.j.c.f */
public abstract class C14442f {

    /* renamed from: a */
    final C14444a f37515a;

    /* renamed from: b */
    final float[] f37516b;

    /* renamed from: c */
    private float[] f37517c;

    /* renamed from: com.facebook.j.c.f$a */
    enum C14444a {
        RELATIVE,
        ABSOLUTE
    }

    /* renamed from: com.facebook.j.c.f$b */
    public static class C14445b extends C14442f {
        /* renamed from: a */
        public final void mo26608a(C14369a aVar) {
            mo26609a(aVar, this.f37515a, this.f37516b);
        }

        public C14445b(C14444a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26609a(C14369a aVar, C14444a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo26573b(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                case ABSOLUTE:
                    aVar.mo26569a(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                default:
                    throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.j.c.f$c */
    public static class C14446c extends C14442f {
        /* renamed from: a */
        public final void mo26608a(C14369a aVar) {
            mo26609a(aVar, this.f37515a, this.f37516b);
        }

        public C14446c(C14444a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26609a(C14369a aVar, C14444a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo26575d(fArr[0], fArr[1]);
                    return;
                case ABSOLUTE:
                    aVar.mo26574c(fArr[0], fArr[1]);
                    return;
                default:
                    throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.j.c.f$d */
    public static class C14447d extends C14442f {
        /* renamed from: a */
        public final void mo26608a(C14369a aVar) {
            mo26609a(aVar, this.f37515a, this.f37516b);
        }

        public C14447d(C14444a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* renamed from: a */
        public final void mo26610a(C14442f fVar, float f, C14369a aVar) {
            if (fVar instanceof C14447d) {
                C14442f.super.mo26610a(fVar, f, aVar);
                return;
            }
            throw new IllegalArgumentException("MoveToCommand should only be interpolated with other instances of MoveToCommand");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26609a(C14369a aVar, C14444a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo26571b(fArr[0], fArr[1]);
                    return;
                case ABSOLUTE:
                    aVar.mo26567a(fArr[0], fArr[1]);
                    return;
                default:
                    throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.j.c.f$e */
    public static class C14448e extends C14442f {
        /* renamed from: a */
        public final void mo26608a(C14369a aVar) {
            mo26609a(aVar, this.f37515a, this.f37516b);
        }

        public C14448e(C14444a aVar, float[] fArr) {
            super(aVar, fArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26609a(C14369a aVar, C14444a aVar2, float[] fArr) {
            switch (aVar2) {
                case RELATIVE:
                    aVar.mo26572b(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                case ABSOLUTE:
                    aVar.mo26568a(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                default:
                    throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "No such argument format %s", new Object[]{aVar2}));
            }
        }
    }

    /* renamed from: com.facebook.j.c.f$f */
    enum C14449f {
        m(C14444a.RELATIVE, 2),
        M(C14444a.ABSOLUTE, 2),
        q(C14444a.RELATIVE, 4),
        Q(C14444a.ABSOLUTE, 4),
        c(C14444a.RELATIVE, 6),
        C(C14444a.ABSOLUTE, 6),
        l(C14444a.RELATIVE, 2),
        L(C14444a.ABSOLUTE, 2);
        

        /* renamed from: i */
        public final C14444a f37532i;

        /* renamed from: j */
        public final int f37533j;

        private C14449f(C14444a aVar, int i) {
            this.f37532i = aVar;
            this.f37533j = i;
        }
    }

    /* renamed from: a */
    private int m29548a() {
        return this.f37516b.length;
    }

    /* renamed from: a */
    public abstract void mo26608a(C14369a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26609a(C14369a aVar, C14444a aVar2, float[] fArr);

    /* renamed from: b */
    private float[] m29552b() {
        if (this.f37517c == null) {
            this.f37517c = new float[this.f37516b.length];
        }
        return this.f37517c;
    }

    /* renamed from: a */
    public static C14442f m29549a(String str) {
        C14449f valueOf = C14449f.valueOf(str.substring(0, 1));
        String[] split = str.substring(1).split(",");
        float[] fArr = new float[split.length];
        int length = split.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            fArr[i2] = Float.parseFloat(split[i]);
            i++;
            i2 = i3;
        }
        switch (valueOf) {
            case m:
            case M:
                if (m29550a(valueOf, fArr)) {
                    return new C14447d(valueOf.f37532i, fArr);
                }
                throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "VectorCommand MoveTo requires two arguments, but got %s", new Object[]{fArr.toString()}));
            case q:
            case Q:
                if (m29550a(valueOf, fArr)) {
                    return new C14448e(valueOf.f37532i, fArr);
                }
                throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "VectorCommand QuadraticTo requires four arguments, but got %s", new Object[]{fArr.toString()}));
            case c:
            case C:
                if (m29550a(valueOf, fArr)) {
                    return new C14445b(valueOf.f37532i, fArr);
                }
                throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "VectorCommand CubicTo requires six arguments, but got %s", new Object[]{fArr.toString()}));
            case l:
            case L:
                if (m29550a(valueOf, fArr)) {
                    return new C14446c(valueOf.f37532i, fArr);
                }
                throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "VectorCommand LineTo requires two arguments, but got %s", new Object[]{fArr.toString()}));
            default:
                throw new IllegalArgumentException(C2240a.m6773a(Locale.US, "Unhandled vector command: %s", new Object[]{str}));
        }
    }

    public C14442f(C14444a aVar, float[] fArr) {
        this.f37515a = aVar;
        this.f37516b = fArr;
    }

    /* renamed from: a */
    private static boolean m29550a(C14449f fVar, float[] fArr) {
        if (fVar.f37533j == fArr.length) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26610a(com.facebook.p982j.p986c.C14442f r9, float r10, com.facebook.p982j.C14369a r11) {
        /*
            r8 = this;
            com.facebook.j.c.f$a r0 = r8.f37515a
            com.facebook.j.c.f$a r1 = r9.f37515a
            if (r0 != r1) goto L_0x0065
            int r0 = r8.m29548a()
            int r1 = r9.m29548a()
            if (r0 <= r1) goto L_0x0024
            float[] r0 = r8.f37516b
            float[] r1 = r11.f37373b
            float[] r9 = r9.f37516b
            float[] r2 = r8.m29552b()
            float[] r9 = m29551a(r1, r9, r2)
            float[] r1 = r8.m29552b()
        L_0x0022:
            r2 = r8
            goto L_0x004e
        L_0x0024:
            int r0 = r8.m29548a()
            int r1 = r9.m29548a()
            if (r0 >= r1) goto L_0x0045
            float[] r0 = r11.f37373b
            float[] r1 = r8.f37516b
            float[] r2 = r9.m29552b()
            float[] r0 = m29551a(r0, r1, r2)
            float[] r1 = r9.f37516b
            float[] r2 = r9.m29552b()
            r7 = r2
            r2 = r9
            r9 = r1
            r1 = r7
            goto L_0x004e
        L_0x0045:
            float[] r0 = r8.f37516b
            float[] r9 = r9.f37516b
            float[] r1 = r8.m29552b()
            goto L_0x0022
        L_0x004e:
            r3 = 0
            int r4 = r1.length
        L_0x0050:
            if (r3 >= r4) goto L_0x005f
            r5 = r0[r3]
            r6 = r9[r3]
            float r6 = r6 - r5
            float r6 = r6 * r10
            float r5 = r5 + r6
            r1[r3] = r5
            int r3 = r3 + 1
            goto L_0x0050
        L_0x005f:
            com.facebook.j.c.f$a r9 = r8.f37515a
            r2.mo26609a(r11, r9, r1)
            return
        L_0x0065:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Argument format must match between interpolated commands. RELATIVE and ABSOLUTE coordinates should stay consistent"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p982j.p986c.C14442f.mo26610a(com.facebook.j.c.f, float, com.facebook.j.a):void");
    }

    /* renamed from: a */
    private static float[] m29551a(float[] fArr, float[] fArr2, float[] fArr3) {
        if (fArr2.length < fArr3.length) {
            if (fArr2.length == 2) {
                if (fArr3.length == 4) {
                    fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                    fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    fArr3[2] = fArr2[0];
                    fArr3[3] = fArr2[1];
                } else if (fArr3.length == 6) {
                    fArr3[0] = fArr[0] + ((fArr2[0] - fArr[0]) / 3.0f);
                    fArr3[1] = fArr[1] + ((fArr2[1] - fArr[1]) / 3.0f);
                    fArr3[2] = fArr2[0] + ((fArr[0] - fArr2[0]) / 3.0f);
                    fArr3[3] = fArr2[1] + ((fArr[1] - fArr2[1]) / 3.0f);
                    fArr3[4] = fArr2[0];
                    fArr3[5] = fArr2[1];
                } else {
                    throw new IllegalArgumentException(C2240a.m6772a("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
                }
            } else if (fArr2.length != 4) {
                throw new IllegalArgumentException(C2240a.m6772a("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
            } else if (fArr3.length == 6) {
                fArr3[0] = fArr[0] + ((fArr2[0] - fArr[0]) * 0.6666667f);
                fArr3[1] = fArr[1] + ((fArr2[1] - fArr[1]) * 0.6666667f);
                fArr3[2] = fArr2[2] + ((fArr2[0] - fArr2[2]) * 0.6666667f);
                fArr3[3] = fArr2[3] + ((fArr2[1] - fArr2[3]) * 0.6666667f);
                fArr3[4] = fArr2[2];
                fArr3[5] = fArr2[3];
            } else {
                throw new IllegalArgumentException(C2240a.m6772a("Unknown conversion from %d args to %d", new Object[]{Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)}));
            }
            return fArr3;
        }
        throw new IllegalArgumentException("convertUp should only be called to convert a lower order argument array to a higher one.");
    }
}
