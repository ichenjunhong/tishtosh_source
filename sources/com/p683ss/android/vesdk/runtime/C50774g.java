package com.p683ss.android.vesdk.runtime;

import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.clipparam.VEClipParam;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p683ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p683ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.g */
public final class C50774g {

    /* renamed from: a */
    public static String f127572a = "VETimeEffectManager";

    /* renamed from: b */
    public static int f127573b = 0;

    /* renamed from: c */
    public static int f127574c = 1;

    /* renamed from: d */
    public static int f127575d = 2;

    /* renamed from: e */
    public C50776b f127576e = new C50776b();

    /* renamed from: com.ss.android.vesdk.runtime.g$a */
    public static class C50775a {

        /* renamed from: a */
        int f127577a;

        /* renamed from: b */
        int f127578b;

        /* renamed from: c */
        String f127579c;

        /* renamed from: d */
        int f127580d;

        /* renamed from: e */
        int f127581e;

        /* renamed from: f */
        int f127582f;

        /* renamed from: g */
        int f127583g;

        /* renamed from: h */
        int f127584h;

        /* renamed from: i */
        double f127585i;

        /* renamed from: j */
        int f127586j;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clip: clipType");
            sb.append(this.f127578b);
            sb.append(" path=");
            sb.append(this.f127579c);
            sb.append(" seqin=");
            sb.append(this.f127581e);
            sb.append(" seqout=");
            sb.append(this.f127582f);
            sb.append(" trimIn=");
            sb.append(this.f127583g);
            sb.append(" trimOut=");
            sb.append(this.f127584h);
            sb.append(" speed=");
            sb.append(this.f127585i);
            sb.append(" clipRotate=");
            sb.append(this.f127586j);
            return sb.toString();
        }

        public C50775a(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, double d, int i8) {
            this.f127577a = i;
            this.f127578b = i2;
            this.f127580d = i3;
            this.f127581e = i4;
            this.f127582f = i5;
            this.f127583g = i6;
            this.f127584h = i7;
            this.f127585i = d;
            this.f127579c = str;
            this.f127586j = i8;
        }
    }

    /* renamed from: com.ss.android.vesdk.runtime.g$b */
    public static class C50776b {

        /* renamed from: a */
        public List<C50775a> f127587a = new ArrayList();

        /* renamed from: b */
        public List<C50775a> f127588b = new ArrayList();

        /* renamed from: c */
        public List<C50775a> f127589c = new ArrayList();

        /* renamed from: d */
        public List<C50775a> f127590d = new ArrayList();

        /* renamed from: e */
        int f127591e = -1;

        /* renamed from: f */
        int f127592f = -1;

        /* renamed from: g */
        public VEBaseFilterParam f127593g = null;
    }

    /* renamed from: b */
    public final int mo99460b() {
        return this.f127576e.f127592f;
    }

    /* renamed from: a */
    public final void mo99458a() {
        this.f127576e.f127587a.clear();
        this.f127576e.f127588b.clear();
        this.f127576e.f127589c.clear();
        this.f127576e.f127590d.clear();
        this.f127576e.f127593g = null;
        this.f127576e.f127591e = -1;
        this.f127576e.f127592f = -1;
    }

    /* renamed from: c */
    public final int mo99461c() {
        if (this.f127576e.f127593g == null) {
            return f127573b;
        }
        if (this.f127576e.f127593g instanceof VERepeatFilterParam) {
            return f127574c;
        }
        if (this.f127576e.f127593g instanceof VESlowMotionFilterParam) {
            return f127575d;
        }
        return f127573b;
    }

    /* renamed from: a */
    private static List<C50775a> m109887a(VEBaseFilterParam vEBaseFilterParam, List<C50775a> list) {
        float f;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        ArrayList arrayList2;
        Iterator it2;
        int i9;
        int i10;
        int i11;
        C50775a aVar;
        VEBaseFilterParam vEBaseFilterParam2 = vEBaseFilterParam;
        ArrayList arrayList3 = new ArrayList();
        if (vEBaseFilterParam2 instanceof VERepeatFilterParam) {
            VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) vEBaseFilterParam2;
            int i12 = vERepeatFilterParam.seqIn;
            int i13 = vERepeatFilterParam.seqIn + vERepeatFilterParam.repeatDuration;
            float f4 = (float) vERepeatFilterParam.repeatTime;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = list.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                C50775a aVar2 = (C50775a) it3.next();
                if (aVar2.f127581e >= i13 || aVar2.f127582f <= i12) {
                    f3 = f4;
                    arrayList2 = arrayList3;
                    i9 = i12;
                    it2 = it3;
                    C50775a aVar3 = aVar2;
                    int i15 = i14;
                    C50775a aVar4 = new C50775a(f127573b, aVar3.f127578b, aVar3.f127579c, i15, aVar3.f127581e, aVar3.f127582f, aVar3.f127583g, aVar3.f127584h, aVar3.f127585i, aVar3.f127586j);
                    arrayList4.add(aVar4);
                } else if (aVar2.f127581e < i12 || aVar2.f127582f > i13) {
                    int i16 = i13;
                    it2 = it3;
                    if (aVar2.f127581e < i12) {
                        int i17 = i16;
                        if (aVar2.f127582f > i17) {
                            int i18 = aVar2.f127583g;
                            double d = (double) (i12 - aVar2.f127581e);
                            double d2 = aVar2.f127585i;
                            Double.isNaN(d);
                            int i19 = i18 + ((int) (d * d2));
                            int i20 = aVar2.f127583g;
                            double d3 = (double) (i17 - aVar2.f127581e);
                            double d4 = aVar2.f127585i;
                            Double.isNaN(d3);
                            int i21 = i20 + ((int) (d3 * d4));
                            int i22 = f127573b;
                            int i23 = aVar2.f127578b;
                            String str = aVar2.f127579c;
                            int i24 = aVar2.f127581e;
                            int i25 = aVar2.f127582f;
                            int i26 = aVar2.f127583g;
                            f3 = f4;
                            arrayList2 = arrayList3;
                            double d5 = aVar2.f127585i;
                            int i27 = i26;
                            int i28 = i14;
                            int i29 = i17;
                            C50775a aVar5 = r7;
                            int i30 = i12;
                            C50775a aVar6 = aVar2;
                            C50775a aVar7 = new C50775a(i22, i23, str, i28, i24, i25, i27, i19, d5, aVar2.f127586j);
                            arrayList4.add(aVar5);
                            C50775a aVar8 = new C50775a(f127574c, aVar6.f127578b, aVar6.f127579c, i28, aVar6.f127581e, aVar6.f127582f, i19, i21, aVar6.f127585i, aVar6.f127586j);
                            arrayList4.add(aVar8);
                            C50775a aVar9 = new C50775a(f127573b, aVar6.f127578b, aVar6.f127579c, i28, aVar6.f127581e, aVar6.f127582f, i21, aVar6.f127584h, aVar6.f127585i, aVar6.f127586j);
                            arrayList4.add(aVar9);
                            i13 = i29;
                            i9 = i30;
                        } else {
                            f3 = f4;
                            arrayList2 = arrayList3;
                            i10 = i12;
                            i11 = i17;
                            aVar = aVar2;
                        }
                    } else {
                        f3 = f4;
                        arrayList2 = arrayList3;
                        i10 = i12;
                        aVar = aVar2;
                        i11 = i16;
                    }
                    i9 = i10;
                    if (aVar.f127581e == i9) {
                        i13 = i11;
                        if (aVar.f127582f > i13) {
                            int i31 = aVar.f127583g;
                            double d6 = (double) (i13 - aVar.f127581e);
                            double d7 = aVar.f127585i;
                            Double.isNaN(d6);
                            int i32 = i31 + ((int) (d6 * d7));
                            int i33 = i14;
                            C50775a aVar10 = new C50775a(f127574c, aVar.f127578b, aVar.f127579c, i33, aVar.f127581e, aVar.f127582f, aVar.f127583g, i32, aVar.f127585i, aVar.f127586j);
                            arrayList4.add(aVar10);
                            int i34 = i32;
                            C50775a aVar11 = new C50775a(f127573b, aVar.f127578b, aVar.f127579c, i33, aVar.f127581e, aVar.f127582f, i34, aVar.f127584h, aVar.f127585i, aVar.f127586j);
                            arrayList4.add(aVar11);
                        }
                    } else {
                        i13 = i11;
                    }
                    if (aVar.f127581e < i9 && aVar.f127582f == i13) {
                        int i35 = aVar.f127583g;
                        double d8 = (double) (i9 - aVar.f127581e);
                        double d9 = aVar.f127585i;
                        Double.isNaN(d8);
                        int i36 = i35 + ((int) (d8 * d9));
                        int i37 = i14;
                        C50775a aVar12 = new C50775a(f127573b, aVar.f127578b, aVar.f127579c, i37, aVar.f127581e, aVar.f127582f, aVar.f127583g, i36, aVar.f127585i, aVar.f127586j);
                        arrayList4.add(aVar12);
                        int i38 = i36;
                        C50775a aVar13 = new C50775a(f127574c, aVar.f127578b, aVar.f127579c, i37, aVar.f127581e, aVar.f127582f, i38, aVar.f127584h, aVar.f127585i, aVar.f127586j);
                        arrayList4.add(aVar13);
                    } else if (aVar.f127581e < i9 && aVar.f127582f > i9 && aVar.f127582f < i13) {
                        int i39 = aVar.f127583g;
                        double d10 = (double) (i9 - aVar.f127581e);
                        double d11 = aVar.f127585i;
                        Double.isNaN(d10);
                        int i40 = i39 + ((int) (d10 * d11));
                        int i41 = i14;
                        C50775a aVar14 = new C50775a(f127573b, aVar.f127578b, aVar.f127579c, i41, aVar.f127581e, aVar.f127582f, aVar.f127583g, i40, aVar.f127585i, aVar.f127586j);
                        arrayList4.add(aVar14);
                        int i42 = i40;
                        C50775a aVar15 = new C50775a(f127574c, aVar.f127578b, aVar.f127579c, i41, aVar.f127581e, aVar.f127582f, i42, aVar.f127584h, aVar.f127585i, aVar.f127586j);
                        arrayList4.add(aVar15);
                    } else if (aVar.f127581e < i13 && aVar.f127582f > i13 && aVar.f127581e > i9) {
                        int i43 = aVar.f127583g;
                        double d12 = (double) (i13 - aVar.f127581e);
                        double d13 = aVar.f127585i;
                        Double.isNaN(d12);
                        int i44 = i43 + ((int) (d12 * d13));
                        int i45 = i14;
                        C50775a aVar16 = new C50775a(f127574c, aVar.f127578b, aVar.f127579c, i45, aVar.f127581e, aVar.f127582f, aVar.f127583g, i44, aVar.f127585i, aVar.f127586j);
                        arrayList4.add(aVar16);
                        int i46 = i44;
                        C50775a aVar17 = new C50775a(f127573b, aVar.f127578b, aVar.f127579c, i45, aVar.f127581e, aVar.f127582f, i46, aVar.f127584h, aVar.f127585i, aVar.f127586j);
                        arrayList4.add(aVar17);
                    }
                } else {
                    int i47 = f127574c;
                    int i48 = aVar2.f127578b;
                    String str2 = aVar2.f127579c;
                    int i49 = aVar2.f127581e;
                    int i50 = aVar2.f127582f;
                    int i51 = aVar2.f127583g;
                    int i52 = i13;
                    int i53 = i51;
                    it2 = it3;
                    C50775a aVar18 = r7;
                    C50775a aVar19 = new C50775a(i47, i48, str2, i14, i49, i50, i53, aVar2.f127584h, aVar2.f127585i, aVar2.f127586j);
                    arrayList4.add(aVar18);
                    f3 = f4;
                    arrayList2 = arrayList3;
                    i9 = i12;
                    i13 = i52;
                }
                i14++;
                i12 = i9;
                it3 = it2;
                arrayList3 = arrayList2;
                f4 = f3;
            }
            float f5 = f4;
            ArrayList arrayList5 = arrayList3;
            ArrayList arrayList6 = new ArrayList();
            boolean z = false;
            int i54 = 0;
            for (int i55 = 0; i55 < arrayList4.size(); i55++) {
                if (((C50775a) arrayList4.get(i55)).f127577a == f127574c) {
                    arrayList6.add(arrayList4.get(i55));
                    if (!z) {
                        z = true;
                        i54 = i55;
                    }
                }
            }
            for (int i56 = 0; ((float) i56) < f5 - 1.0f; i56++) {
                arrayList4.addAll(i54, arrayList6);
            }
            arrayList3 = arrayList5;
            arrayList3.addAll(arrayList4);
        } else if (vEBaseFilterParam2 instanceof VESlowMotionFilterParam) {
            VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) vEBaseFilterParam2;
            int i57 = vESlowMotionFilterParam.seqIn;
            int i58 = vESlowMotionFilterParam.seqIn + vESlowMotionFilterParam.slowMotionDuration;
            float f6 = vESlowMotionFilterParam.slowMotionSpeed;
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = list.iterator();
            int i59 = 0;
            while (it4.hasNext()) {
                C50775a aVar20 = (C50775a) it4.next();
                if (aVar20.f127581e >= i58 || aVar20.f127582f <= i57) {
                    f = f6;
                    arrayList = arrayList3;
                    i2 = i57;
                    i = i58;
                    it = it4;
                    C50775a aVar21 = aVar20;
                    C50775a aVar22 = new C50775a(f127573b, aVar21.f127578b, aVar21.f127579c, i59, aVar21.f127581e, aVar21.f127582f, aVar21.f127583g, aVar21.f127584h, aVar21.f127585i, aVar21.f127586j);
                    arrayList7.add(aVar22);
                } else if (aVar20.f127581e < i57 || aVar20.f127582f > i58) {
                    float f7 = f6;
                    arrayList = arrayList3;
                    it = it4;
                    int i60 = i57;
                    if (aVar20.f127581e >= i60 || aVar20.f127582f <= i58) {
                        int i61 = i58;
                        C50775a aVar23 = aVar20;
                        float f8 = f7;
                        int i62 = i60;
                        if (aVar23.f127581e == i62) {
                            int i63 = i61;
                            if (aVar23.f127582f > i63) {
                                int i64 = aVar23.f127583g;
                                double d14 = (double) (i63 - aVar23.f127581e);
                                double d15 = aVar23.f127585i;
                                Double.isNaN(d14);
                                int i65 = i64 + ((int) (d14 * d15));
                                int i66 = f127575d;
                                int i67 = aVar23.f127578b;
                                String str3 = aVar23.f127579c;
                                int i68 = aVar23.f127581e;
                                int i69 = aVar23.f127582f;
                                int i70 = aVar23.f127583g;
                                int i71 = i63;
                                double d16 = aVar23.f127585i;
                                int i72 = i65;
                                int i73 = i62;
                                double d17 = (double) f8;
                                Double.isNaN(d17);
                                int i74 = i59;
                                float f9 = f8;
                                C50775a aVar24 = r6;
                                C50775a aVar25 = new C50775a(i66, i67, str3, i74, i68, i69, i70, i72, d17 * d16, aVar23.f127586j);
                                arrayList7.add(aVar24);
                                C50775a aVar26 = new C50775a(f127573b, aVar23.f127578b, aVar23.f127579c, i74, aVar23.f127581e, aVar23.f127582f, i72, aVar23.f127584h, aVar23.f127585i, aVar23.f127586j);
                                arrayList7.add(aVar26);
                                i = i71;
                                i2 = i73;
                                f = f9;
                            } else {
                                i3 = i62;
                                f2 = f8;
                                i4 = i63;
                            }
                        } else {
                            i3 = i62;
                            f2 = f8;
                            i4 = i61;
                        }
                        int i75 = i3;
                        if (aVar23.f127581e < i75) {
                            int i76 = i4;
                            if (aVar23.f127582f == i76) {
                                int i77 = aVar23.f127583g;
                                double d18 = (double) (i75 - aVar23.f127581e);
                                double d19 = aVar23.f127585i;
                                Double.isNaN(d18);
                                int i78 = i77 + ((int) (d18 * d19));
                                int i79 = f127573b;
                                int i80 = aVar23.f127578b;
                                String str4 = aVar23.f127579c;
                                int i81 = aVar23.f127581e;
                                int i82 = aVar23.f127582f;
                                int i83 = aVar23.f127583g;
                                double d20 = aVar23.f127585i;
                                int i84 = i59;
                                double d21 = d20;
                                C50775a aVar27 = new C50775a(i79, i80, str4, i84, i81, i82, i83, i78, d21, aVar23.f127586j);
                                arrayList7.add(aVar27);
                                int i85 = f127575d;
                                int i86 = aVar23.f127578b;
                                String str5 = aVar23.f127579c;
                                int i87 = aVar23.f127581e;
                                int i88 = aVar23.f127582f;
                                int i89 = aVar23.f127584h;
                                int i90 = i75;
                                int i91 = i76;
                                double d22 = aVar23.f127585i;
                                int i92 = i89;
                                float f10 = f2;
                                double d23 = (double) f10;
                                Double.isNaN(d23);
                                float f11 = f10;
                                C50775a aVar28 = new C50775a(i85, i86, str5, i84, i87, i88, i78, i92, d22 * d23, aVar23.f127586j);
                                arrayList7.add(aVar28);
                                f = f11;
                                i2 = i90;
                                i = i91;
                            } else {
                                i6 = i75;
                                i5 = i76;
                            }
                        } else {
                            i6 = i75;
                            i5 = i4;
                        }
                        float f12 = f2;
                        int i93 = i6;
                        if (aVar23.f127581e >= i93 || aVar23.f127582f <= i93) {
                            i7 = i93;
                            i8 = i5;
                        } else {
                            int i94 = i5;
                            if (aVar23.f127582f < i94) {
                                int i95 = aVar23.f127583g;
                                double d24 = (double) (i93 - aVar23.f127581e);
                                double d25 = aVar23.f127585i;
                                Double.isNaN(d24);
                                int i96 = i95 + ((int) (d24 * d25));
                                ArrayList arrayList8 = arrayList7;
                                int i97 = i94;
                                int i98 = i59;
                                i7 = i93;
                                C50775a aVar29 = r6;
                                C50775a aVar30 = new C50775a(f127573b, aVar23.f127578b, aVar23.f127579c, i98, aVar23.f127581e, aVar23.f127582f, aVar23.f127583g, i96, aVar23.f127585i, aVar23.f127586j);
                                arrayList7 = arrayList8;
                                arrayList7.add(aVar29);
                                int i99 = f127575d;
                                int i100 = aVar23.f127578b;
                                String str6 = aVar23.f127579c;
                                int i101 = aVar23.f127581e;
                                int i102 = aVar23.f127582f;
                                int i103 = aVar23.f127584h;
                                double d26 = aVar23.f127585i;
                                int i104 = i103;
                                double d27 = (double) f12;
                                Double.isNaN(d27);
                                C50775a aVar31 = new C50775a(i99, i100, str6, i98, i101, i102, i96, i104, d26 * d27, aVar23.f127586j);
                                arrayList7.add(aVar31);
                                f = f12;
                                i = i97;
                                i2 = i7;
                            } else {
                                i7 = i93;
                                i8 = i94;
                            }
                        }
                        int i105 = i8;
                        if (aVar23.f127581e >= i105 || aVar23.f127582f <= i105) {
                            f = f12;
                            i = i105;
                            i2 = i7;
                        } else {
                            int i106 = i7;
                            if (aVar23.f127581e > i106) {
                                int i107 = aVar23.f127583g;
                                double d28 = (double) (i105 - aVar23.f127581e);
                                double d29 = aVar23.f127585i;
                                Double.isNaN(d28);
                                int i108 = i107 + ((int) (d28 * d29));
                                int i109 = f127575d;
                                int i110 = aVar23.f127578b;
                                String str7 = aVar23.f127579c;
                                int i111 = aVar23.f127581e;
                                int i112 = aVar23.f127582f;
                                int i113 = aVar23.f127583g;
                                i2 = i106;
                                double d30 = aVar23.f127585i;
                                int i114 = i108;
                                i = i105;
                                double d31 = (double) f12;
                                Double.isNaN(d31);
                                int i115 = i59;
                                f = f12;
                                C50775a aVar32 = r6;
                                C50775a aVar33 = new C50775a(i109, i110, str7, i115, i111, i112, i113, i114, d31 * d30, aVar23.f127586j);
                                arrayList7.add(aVar32);
                                C50775a aVar34 = new C50775a(f127573b, aVar23.f127578b, aVar23.f127579c, i115, aVar23.f127581e, aVar23.f127582f, i114, aVar23.f127584h, aVar23.f127585i, aVar23.f127586j);
                                arrayList7.add(aVar34);
                            } else {
                                f = f12;
                                i = i105;
                                i2 = i106;
                            }
                        }
                    } else {
                        int i116 = aVar20.f127583g;
                        double d32 = (double) (i60 - aVar20.f127581e);
                        double d33 = aVar20.f127585i;
                        Double.isNaN(d32);
                        int i117 = i116 + ((int) (d32 * d33));
                        int i118 = aVar20.f127583g;
                        double d34 = (double) (i58 - aVar20.f127581e);
                        double d35 = aVar20.f127585i;
                        Double.isNaN(d34);
                        int i119 = i118 + ((int) (d34 * d35));
                        int i120 = i60;
                        int i121 = i119;
                        int i122 = i59;
                        int i123 = i58;
                        C50775a aVar35 = aVar20;
                        C50775a aVar36 = new C50775a(f127573b, aVar20.f127578b, aVar20.f127579c, i122, aVar20.f127581e, aVar20.f127582f, aVar20.f127583g, i117, aVar20.f127585i, aVar20.f127586j);
                        arrayList7.add(aVar36);
                        int i124 = f127575d;
                        int i125 = aVar35.f127578b;
                        String str8 = aVar35.f127579c;
                        int i126 = aVar35.f127581e;
                        int i127 = aVar35.f127582f;
                        double d36 = aVar35.f127585i;
                        float f13 = f7;
                        double d37 = (double) f13;
                        Double.isNaN(d37);
                        C50775a aVar37 = new C50775a(i124, i125, str8, i122, i126, i127, i117, i121, d36 * d37, aVar35.f127586j);
                        arrayList7.add(aVar37);
                        int i128 = i121;
                        C50775a aVar38 = new C50775a(f127573b, aVar35.f127578b, aVar35.f127579c, i122, aVar35.f127581e, aVar35.f127582f, i128, aVar35.f127584h, aVar35.f127585i, aVar35.f127586j);
                        arrayList7.add(aVar38);
                        f = f13;
                        i2 = i120;
                        i = i123;
                    }
                } else {
                    int i129 = f127575d;
                    int i130 = aVar20.f127578b;
                    String str9 = aVar20.f127579c;
                    int i131 = aVar20.f127581e;
                    int i132 = aVar20.f127582f;
                    int i133 = aVar20.f127583g;
                    int i134 = aVar20.f127584h;
                    it = it4;
                    double d38 = aVar20.f127585i;
                    arrayList = arrayList3;
                    int i135 = i57;
                    double d39 = (double) f6;
                    Double.isNaN(d39);
                    double d40 = d39 * d38;
                    int i136 = aVar20.f127586j;
                    float f14 = f6;
                    C50775a aVar39 = r6;
                    C50775a aVar40 = new C50775a(i129, i130, str9, i59, i131, i132, i133, i134, d40, i136);
                    arrayList7.add(aVar39);
                    i = i58;
                    i2 = i135;
                    f = f14;
                }
                i59++;
                it4 = it;
                arrayList3 = arrayList;
                i57 = i2;
                i58 = i;
                f6 = f;
            }
            ArrayList arrayList9 = arrayList3;
            arrayList9.addAll(arrayList7);
            return arrayList9;
        }
        return arrayList3;
    }

    /* renamed from: b */
    private static void m109889b(List<C50775a> list, List<C50775a> list2, List<VEClipParam> list3, List<VEClipParam> list4) {
        if (list.size() > 0 && list2.size() > 0) {
            boolean[] zArr = new boolean[list.size()];
            for (int i = 0; i < list2.size(); i++) {
                C50775a aVar = (C50775a) list2.get(i);
                if (!zArr[aVar.f127580d]) {
                    zArr[aVar.f127580d] = true;
                } else {
                    VEClipParam vEClipParam = new VEClipParam();
                    vEClipParam.clipType = aVar.f127578b;
                    vEClipParam.path = aVar.f127579c;
                    vEClipParam.trimIn = aVar.f127583g;
                    vEClipParam.trimOut = aVar.f127584h;
                    vEClipParam.speed = aVar.f127585i;
                    vEClipParam.clipRotate = aVar.f127586j;
                    vEClipParam.clipIndex = i;
                    list3.add(vEClipParam);
                }
                VEClipParam vEClipParam2 = new VEClipParam();
                vEClipParam2.clipType = aVar.f127578b;
                vEClipParam2.path = aVar.f127579c;
                vEClipParam2.trimIn = aVar.f127583g;
                vEClipParam2.trimOut = aVar.f127584h;
                vEClipParam2.speed = aVar.f127585i;
                vEClipParam2.clipRotate = aVar.f127586j;
                vEClipParam2.clipIndex = i;
                list4.add(vEClipParam2);
            }
        }
    }

    /* renamed from: a */
    public static void m109888a(List<C50775a> list, List<C50775a> list2, List<VEClipParam> list3, List<VEClipParam> list4) {
        boolean[] zArr = new boolean[list.size()];
        int i = 0;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            C50775a aVar = (C50775a) list2.get(i2);
            if (!zArr[aVar.f127580d]) {
                zArr[aVar.f127580d] = true;
            } else {
                VEClipParam vEClipParam = new VEClipParam();
                vEClipParam.path = aVar.f127579c;
                vEClipParam.trimIn = aVar.f127583g;
                vEClipParam.trimOut = aVar.f127584h;
                vEClipParam.speed = aVar.f127585i;
                vEClipParam.clipRotate = aVar.f127586j;
                vEClipParam.clipIndex = i2 - i;
                i++;
                list3.add(vEClipParam);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            VEClipParam vEClipParam2 = new VEClipParam();
            vEClipParam2.path = ((C50775a) list.get(i3)).f127579c;
            vEClipParam2.trimIn = ((C50775a) list.get(i3)).f127583g;
            vEClipParam2.trimOut = ((C50775a) list.get(i3)).f127584h;
            vEClipParam2.speed = ((C50775a) list.get(i3)).f127585i;
            vEClipParam2.clipRotate = ((C50775a) list.get(i3)).f127586j;
            vEClipParam2.clipIndex = i3;
            list4.add(vEClipParam2);
        }
    }

    /* renamed from: a */
    public final void mo99459a(int i, int i2, List<VEClipParam> list, List<VEClipParam> list2, VEBaseFilterParam vEBaseFilterParam, List<VEClipParam> list3, List<VEClipParam> list4, List<VEClipParam> list5, List<VEClipParam> list6) {
        List<VEClipParam> list7 = list;
        VEBaseFilterParam vEBaseFilterParam2 = vEBaseFilterParam;
        mo99458a();
        if (list7 == null || list.size() == 0) {
            C50792y.m109914d(f127572a, "addTimeEffect init param error");
            return;
        }
        this.f127576e.f127591e = i;
        this.f127576e.f127592f = i2;
        int i3 = 0;
        while (i3 < list.size()) {
            VEClipParam vEClipParam = (VEClipParam) list7.get(i3);
            int i4 = f127573b;
            int i5 = vEClipParam.clipType;
            String str = vEClipParam.path;
            int i6 = vEClipParam.seqIn;
            int i7 = vEClipParam.seqOut;
            int i8 = vEClipParam.trimIn;
            int i9 = vEClipParam.trimOut;
            C50775a aVar = r4;
            double d = vEClipParam.speed;
            int i10 = i3;
            C50775a aVar2 = new C50775a(i4, i5, str, i3, i6, i7, i8, i9, d, vEClipParam.clipRotate);
            this.f127576e.f127587a.add(aVar);
            i3 = i10 + 1;
            list7 = list;
            VEBaseFilterParam vEBaseFilterParam3 = vEBaseFilterParam;
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            VEClipParam vEClipParam2 = (VEClipParam) list2.get(i11);
            C50775a aVar3 = new C50775a(f127573b, vEClipParam2.clipType, vEClipParam2.path, i11, vEClipParam2.seqIn, vEClipParam2.seqOut, vEClipParam2.trimIn, vEClipParam2.trimOut, vEClipParam2.speed, vEClipParam2.clipRotate);
            this.f127576e.f127588b.add(aVar3);
        }
        VEBaseFilterParam vEBaseFilterParam4 = vEBaseFilterParam;
        this.f127576e.f127593g = vEBaseFilterParam4;
        this.f127576e.f127589c.clear();
        this.f127576e.f127589c.addAll(m109887a(vEBaseFilterParam4, this.f127576e.f127587a));
        String str2 = f127572a;
        StringBuilder sb = new StringBuilder("addTimeEffect  mTrack.videoClips=");
        sb.append(this.f127576e.f127587a.size());
        sb.append(" mTrack.timeEffectClips=");
        sb.append(this.f127576e.f127589c.size());
        C50792y.m109914d(str2, sb.toString());
        m109889b(this.f127576e.f127587a, this.f127576e.f127589c, list3, list4);
        this.f127576e.f127590d.clear();
        if (this.f127576e.f127588b.size() > 0) {
            this.f127576e.f127590d.addAll(m109887a(vEBaseFilterParam4, this.f127576e.f127588b));
            String str3 = f127572a;
            StringBuilder sb2 = new StringBuilder("addTimeEffect  mTrack.audioClips=");
            sb2.append(this.f127576e.f127588b.size());
            sb2.append(" mTrack.audioTimeEffectClips=");
            sb2.append(this.f127576e.f127590d.size());
            C50792y.m109914d(str3, sb2.toString());
            m109889b(this.f127576e.f127588b, this.f127576e.f127590d, list5, list6);
        }
    }
}
