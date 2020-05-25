package android.support.p043v7.p051e;

import android.support.p043v7.widget.RecyclerView.C1322a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v7.e.c */
public final class C1208c {

    /* renamed from: a */
    private static final Comparator<C1215f> f3997a = new Comparator<C1215f>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C1215f fVar = (C1215f) obj;
            C1215f fVar2 = (C1215f) obj2;
            int i = fVar.f4012a - fVar2.f4012a;
            if (i == 0) {
                return fVar.f4013b - fVar2.f4013b;
            }
            return i;
        }
    };

    /* renamed from: android.support.v7.e.c$a */
    public static abstract class C1210a {
        /* renamed from: a */
        public abstract int mo159a();

        /* renamed from: a */
        public Object mo160a(int i, int i2) {
            return null;
        }

        /* renamed from: b */
        public abstract int mo161b();

        /* renamed from: b */
        public abstract boolean mo162b(int i, int i2);

        /* renamed from: c */
        public abstract boolean mo163c(int i, int i2);
    }

    /* renamed from: android.support.v7.e.c$b */
    public static class C1211b {

        /* renamed from: a */
        public final List<C1215f> f3998a;

        /* renamed from: b */
        private final int[] f3999b;

        /* renamed from: c */
        private final int[] f4000c;

        /* renamed from: d */
        private final C1210a f4001d;

        /* renamed from: e */
        private final int f4002e;

        /* renamed from: f */
        private final int f4003f;

        /* renamed from: g */
        private final boolean f4004g;

        /* renamed from: a */
        private void m3663a() {
            int i;
            int i2 = this.f4002e;
            int i3 = this.f4003f;
            for (int size = this.f3998a.size() - 1; size >= 0; size--) {
                C1215f fVar = (C1215f) this.f3998a.get(size);
                int i4 = fVar.f4012a + fVar.f4014c;
                int i5 = fVar.f4013b + fVar.f4014c;
                if (this.f4004g) {
                    while (i2 > i4) {
                        if (this.f3999b[i2 - 1] == 0) {
                            m3665a(i2, i3, size, false);
                        }
                        i2--;
                    }
                    while (i3 > i5) {
                        if (this.f4000c[i3 - 1] == 0) {
                            m3665a(i2, i3, size, true);
                        }
                        i3--;
                    }
                }
                for (int i6 = 0; i6 < fVar.f4014c; i6++) {
                    int i7 = fVar.f4012a + i6;
                    int i8 = fVar.f4013b + i6;
                    if (this.f4001d.mo163c(i7, i8)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f3999b[i7] = (i8 << 5) | i;
                    this.f4000c[i8] = (i7 << 5) | i;
                }
                i2 = fVar.f4012a;
                i3 = fVar.f4013b;
            }
        }

        /* renamed from: a */
        public final void mo3931a(C1322a aVar) {
            mo3930a((C1216d) new C1206a(aVar));
        }

        /* renamed from: a */
        public final void mo3930a(C1216d dVar) {
            C1207b bVar;
            if (dVar instanceof C1207b) {
                bVar = (C1207b) dVar;
            } else {
                bVar = new C1207b(dVar);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f4002e;
            int i2 = this.f4003f;
            for (int size = this.f3998a.size() - 1; size >= 0; size--) {
                C1215f fVar = (C1215f) this.f3998a.get(size);
                int i3 = fVar.f4014c;
                int i4 = fVar.f4012a + i3;
                int i5 = fVar.f4013b + i3;
                if (i4 < i) {
                    m3666b(arrayList, bVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m3664a(arrayList, bVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.f3999b[fVar.f4012a + i6] & 31) == 2) {
                        bVar.mo165a(fVar.f4012a + i6, 1, this.f4001d.mo160a(fVar.f4012a + i6, fVar.f4013b + i6));
                    }
                }
                i = fVar.f4012a;
                i2 = fVar.f4013b;
            }
            bVar.mo3928a();
        }

        /* renamed from: a */
        private static C1213d m3662a(List<C1213d> list, int i, boolean z) {
            int i2;
            int size = list.size() - 1;
            while (size >= 0) {
                C1213d dVar = (C1213d) list.get(size);
                if (dVar.f4005a == i && dVar.f4007c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C1213d dVar2 = (C1213d) list.get(size);
                        int i3 = dVar2.f4006b;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        dVar2.f4006b = i3 + i2;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private boolean m3665a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C1215f fVar = (C1215f) this.f3998a.get(i3);
                int i6 = fVar.f4012a + fVar.f4014c;
                int i7 = fVar.f4013b + fVar.f4014c;
                int i8 = 4;
                if (z) {
                    for (int i9 = i5 - 1; i9 >= i6; i9--) {
                        if (this.f4001d.mo162b(i9, i4)) {
                            if (this.f4001d.mo163c(i9, i4)) {
                                i8 = 8;
                            }
                            this.f4000c[i4] = (i9 << 5) | 16;
                            this.f3999b[i9] = (i4 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i7; i10--) {
                        if (this.f4001d.mo162b(i4, i10)) {
                            if (this.f4001d.mo163c(i4, i10)) {
                                i8 = 8;
                            }
                            int i11 = i - 1;
                            this.f3999b[i11] = (i10 << 5) | 16;
                            this.f4000c[i10] = (i11 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = fVar.f4012a;
                i2 = fVar.f4013b;
                i3--;
            }
            return false;
        }

        C1211b(C1210a aVar, List<C1215f> list, int[] iArr, int[] iArr2, boolean z) {
            C1215f fVar;
            this.f3998a = list;
            this.f3999b = iArr;
            this.f4000c = iArr2;
            Arrays.fill(this.f3999b, 0);
            Arrays.fill(this.f4000c, 0);
            this.f4001d = aVar;
            this.f4002e = aVar.mo159a();
            this.f4003f = aVar.mo161b();
            this.f4004g = z;
            if (this.f3998a.isEmpty()) {
                fVar = null;
            } else {
                fVar = (C1215f) this.f3998a.get(0);
            }
            if (!(fVar != null && fVar.f4012a == 0 && fVar.f4013b == 0)) {
                C1215f fVar2 = new C1215f();
                fVar2.f4012a = 0;
                fVar2.f4013b = 0;
                fVar2.f4015d = false;
                fVar2.f4014c = 0;
                fVar2.f4016e = false;
                this.f3998a.add(0, fVar2);
            }
            m3663a();
        }

        /* renamed from: a */
        private void m3664a(List<C1213d> list, C1216d dVar, int i, int i2, int i3) {
            if (!this.f4004g) {
                dVar.mo164a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4000c[i5] & 31;
                if (i6 == 0) {
                    dVar.mo164a(i, 1);
                    for (C1213d dVar2 : list) {
                        dVar2.f4006b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4000c[i5] >> 5;
                    dVar.mo167c(m3662a(list, i7, true).f4006b, i);
                    if (i6 == 4) {
                        dVar.mo165a(i, 1, this.f4001d.mo160a(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1213d(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: b */
        private void m3666b(List<C1213d> list, C1216d dVar, int i, int i2, int i3) {
            if (!this.f4004g) {
                dVar.mo166b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f3999b[i5] & 31;
                if (i6 == 0) {
                    dVar.mo166b(i + i4, 1);
                    for (C1213d dVar2 : list) {
                        dVar2.f4006b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f3999b[i5] >> 5;
                    C1213d a = m3662a(list, i7, false);
                    dVar.mo167c(i + i4, a.f4006b - 1);
                    if (i6 == 4) {
                        dVar.mo165a(a.f4006b - 1, 1, this.f4001d.mo160a(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1213d(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: android.support.v7.e.c$c */
    public static abstract class C1212c<T> {
        /* renamed from: a */
        public abstract boolean mo3932a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo3933b(T t, T t2);

        /* renamed from: c */
        public Object mo3934c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: android.support.v7.e.c$d */
    static class C1213d {

        /* renamed from: a */
        int f4005a;

        /* renamed from: b */
        int f4006b;

        /* renamed from: c */
        boolean f4007c;

        public C1213d(int i, int i2, boolean z) {
            this.f4005a = i;
            this.f4006b = i2;
            this.f4007c = z;
        }
    }

    /* renamed from: android.support.v7.e.c$e */
    static class C1214e {

        /* renamed from: a */
        int f4008a;

        /* renamed from: b */
        int f4009b;

        /* renamed from: c */
        int f4010c;

        /* renamed from: d */
        int f4011d;

        public C1214e() {
        }

        public C1214e(int i, int i2, int i3, int i4) {
            this.f4008a = 0;
            this.f4009b = i2;
            this.f4010c = 0;
            this.f4011d = i4;
        }
    }

    /* renamed from: android.support.v7.e.c$f */
    static class C1215f {

        /* renamed from: a */
        int f4012a;

        /* renamed from: b */
        int f4013b;

        /* renamed from: c */
        int f4014c;

        /* renamed from: d */
        boolean f4015d;

        /* renamed from: e */
        boolean f4016e;

        C1215f() {
        }
    }

    /* renamed from: a */
    public static C1211b m3654a(C1210a aVar) {
        return m3655a(aVar, true);
    }

    /* renamed from: a */
    public static C1211b m3655a(C1210a aVar, boolean z) {
        C1214e eVar;
        int a = aVar.mo159a();
        int b = aVar.mo161b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1214e(0, a, 0, b));
        int abs = Math.abs(a - b) + a + b;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1214e eVar2 = (C1214e) arrayList2.remove(arrayList2.size() - 1);
            C1215f a2 = m3656a(aVar, eVar2.f4008a, eVar2.f4009b, eVar2.f4010c, eVar2.f4011d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.f4014c > 0) {
                    arrayList.add(a2);
                }
                a2.f4012a += eVar2.f4008a;
                a2.f4013b += eVar2.f4010c;
                if (arrayList3.isEmpty()) {
                    eVar = new C1214e();
                } else {
                    eVar = (C1214e) arrayList3.remove(arrayList3.size() - 1);
                }
                eVar.f4008a = eVar2.f4008a;
                eVar.f4010c = eVar2.f4010c;
                if (a2.f4016e) {
                    eVar.f4009b = a2.f4012a;
                    eVar.f4011d = a2.f4013b;
                } else if (a2.f4015d) {
                    eVar.f4009b = a2.f4012a - 1;
                    eVar.f4011d = a2.f4013b;
                } else {
                    eVar.f4009b = a2.f4012a;
                    eVar.f4011d = a2.f4013b - 1;
                }
                arrayList2.add(eVar);
                if (!a2.f4016e) {
                    eVar2.f4008a = a2.f4012a + a2.f4014c;
                    eVar2.f4010c = a2.f4013b + a2.f4014c;
                } else if (a2.f4015d) {
                    eVar2.f4008a = a2.f4012a + a2.f4014c + 1;
                    eVar2.f4010c = a2.f4013b + a2.f4014c;
                } else {
                    eVar2.f4008a = a2.f4012a + a2.f4014c;
                    eVar2.f4010c = a2.f4013b + a2.f4014c + 1;
                }
                arrayList2.add(eVar2);
            } else {
                arrayList3.add(eVar2);
            }
        }
        Collections.sort(arrayList, f3997a);
        C1211b bVar = new C1211b(aVar, arrayList, iArr, iArr2, true);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r3[r15 - 1] < r3[r15 + r9]) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        if (r4[r9 - 1] < r4[r9 + 1]) goto L_0x00ee;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p043v7.p051e.C1208c.C1215f m3656a(android.support.p043v7.p051e.C1208c.C1210a r21, int r22, int r23, int r24, int r25, int[] r26, int[] r27, int r28) {
        /*
            r0 = r21
            r3 = r26
            r4 = r27
            int r5 = r23 - r22
            int r6 = r25 - r24
            if (r5 <= 0) goto L_0x0156
            if (r6 > 0) goto L_0x0010
            goto L_0x0156
        L_0x0010:
            int r7 = r5 - r6
            int r8 = r5 + r6
            r9 = 1
            int r8 = r8 + r9
            int r8 = r8 / 2
            int r10 = r28 - r8
            int r10 = r10 - r9
            int r11 = r28 + r8
            int r11 = r11 + r9
            r12 = 0
            java.util.Arrays.fill(r3, r10, r11, r12)
            int r10 = r10 + r7
            int r11 = r11 + r7
            java.util.Arrays.fill(r4, r10, r11, r5)
            int r10 = r7 % 2
            if (r10 == 0) goto L_0x002d
            r10 = 1
            goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            r11 = 0
        L_0x002f:
            if (r11 > r8) goto L_0x014e
            int r13 = -r11
            r14 = r13
        L_0x0033:
            if (r14 > r11) goto L_0x00bd
            if (r14 == r13) goto L_0x0051
            if (r14 == r11) goto L_0x0045
            int r15 = r28 + r14
            int r16 = r15 + -1
            r12 = r3[r16]
            int r15 = r15 + r9
            r9 = r3[r15]
            if (r12 >= r9) goto L_0x0045
            goto L_0x0051
        L_0x0045:
            int r9 = r28 + r14
            r17 = 1
            int r9 = r9 + -1
            r9 = r3[r9]
            int r9 = r9 + 1
            r12 = 1
            goto L_0x005a
        L_0x0051:
            r17 = 1
            int r9 = r28 + r14
            int r9 = r9 + 1
            r9 = r3[r9]
            r12 = 0
        L_0x005a:
            int r15 = r9 - r14
            r18 = r8
            r8 = r15
        L_0x005f:
            if (r9 >= r5) goto L_0x007a
            if (r8 >= r6) goto L_0x007a
            r19 = r5
            int r5 = r22 + r9
            r20 = r6
            int r6 = r24 + r8
            boolean r5 = r0.mo162b(r5, r6)
            if (r5 == 0) goto L_0x007e
            int r9 = r9 + 1
            int r8 = r8 + 1
            r5 = r19
            r6 = r20
            goto L_0x005f
        L_0x007a:
            r19 = r5
            r20 = r6
        L_0x007e:
            int r5 = r28 + r14
            r3[r5] = r9
            if (r10 == 0) goto L_0x00b0
            int r6 = r7 - r11
            r8 = 1
            int r6 = r6 + r8
            if (r14 < r6) goto L_0x00b0
            int r6 = r7 + r11
            int r6 = r6 - r8
            if (r14 > r6) goto L_0x00b0
            r6 = r3[r5]
            r8 = r4[r5]
            if (r6 < r8) goto L_0x00b0
            android.support.v7.e.c$f r0 = new android.support.v7.e.c$f
            r0.<init>()
            r1 = r4[r5]
            r0.f4012a = r1
            int r1 = r0.f4012a
            int r1 = r1 - r14
            r0.f4013b = r1
            r1 = r3[r5]
            r2 = r4[r5]
            int r1 = r1 - r2
            r0.f4014c = r1
            r0.f4015d = r12
            r5 = 0
            r0.f4016e = r5
            return r0
        L_0x00b0:
            r5 = 0
            int r14 = r14 + 2
            r8 = r18
            r5 = r19
            r6 = r20
            r9 = 1
            r12 = 0
            goto L_0x0033
        L_0x00bd:
            r19 = r5
            r20 = r6
            r18 = r8
            r5 = 0
            r6 = r13
        L_0x00c5:
            if (r6 > r11) goto L_0x0141
            int r8 = r6 + r7
            int r9 = r11 + r7
            if (r8 == r9) goto L_0x00ec
            int r9 = r13 + r7
            if (r8 == r9) goto L_0x00e0
            int r9 = r28 + r8
            int r12 = r9 + -1
            r12 = r4[r12]
            r17 = 1
            int r9 = r9 + 1
            r9 = r4[r9]
            if (r12 >= r9) goto L_0x00e2
            goto L_0x00ee
        L_0x00e0:
            r17 = 1
        L_0x00e2:
            int r9 = r28 + r8
            int r9 = r9 + 1
            r9 = r4[r9]
            int r9 = r9 + -1
            r12 = 1
            goto L_0x00f5
        L_0x00ec:
            r17 = 1
        L_0x00ee:
            int r9 = r28 + r8
            int r9 = r9 + -1
            r9 = r4[r9]
            r12 = 0
        L_0x00f5:
            int r14 = r9 - r8
        L_0x00f7:
            if (r9 <= 0) goto L_0x0111
            if (r14 <= 0) goto L_0x0111
            int r15 = r22 + r9
            int r5 = r15 + -1
            int r15 = r24 + r14
            int r1 = r15 + -1
            boolean r1 = r0.mo162b(r5, r1)
            if (r1 == 0) goto L_0x0111
            int r9 = r9 + -1
            int r14 = r14 + -1
            r5 = 0
            r17 = 1
            goto L_0x00f7
        L_0x0111:
            int r1 = r28 + r8
            r4[r1] = r9
            if (r10 != 0) goto L_0x013c
            if (r8 < r13) goto L_0x013c
            if (r8 > r11) goto L_0x013c
            r5 = r3[r1]
            r9 = r4[r1]
            if (r5 < r9) goto L_0x013c
            android.support.v7.e.c$f r0 = new android.support.v7.e.c$f
            r0.<init>()
            r2 = r4[r1]
            r0.f4012a = r2
            int r2 = r0.f4012a
            int r2 = r2 - r8
            r0.f4013b = r2
            r2 = r3[r1]
            r1 = r4[r1]
            int r2 = r2 - r1
            r0.f4014c = r2
            r0.f4015d = r12
            r1 = 1
            r0.f4016e = r1
            return r0
        L_0x013c:
            r1 = 1
            int r6 = r6 + 2
            r5 = 0
            goto L_0x00c5
        L_0x0141:
            r1 = 1
            int r11 = r11 + 1
            r8 = r18
            r5 = r19
            r6 = r20
            r9 = 1
            r12 = 0
            goto L_0x002f
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0156:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.p051e.C1208c.m3656a(android.support.v7.e.c$a, int, int, int, int, int[], int[], int):android.support.v7.e.c$f");
    }
}
