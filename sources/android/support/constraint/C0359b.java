package android.support.constraint;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.SparseIntArray;
import android.view.View;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.b */
public final class C0359b {

    /* renamed from: a */
    static final int[] f1144a = {0, 4, 8};

    /* renamed from: c */
    static SparseIntArray f1145c;

    /* renamed from: b */
    HashMap<Integer, C0361a> f1146b = new HashMap<>();

    /* renamed from: android.support.constraint.b$a */
    static class C0361a {

        /* renamed from: A */
        public int f1147A;

        /* renamed from: B */
        public int f1148B;

        /* renamed from: C */
        public int f1149C;

        /* renamed from: D */
        public int f1150D;

        /* renamed from: E */
        public int f1151E;

        /* renamed from: F */
        public int f1152F;

        /* renamed from: G */
        public int f1153G;

        /* renamed from: H */
        public int f1154H;

        /* renamed from: I */
        public int f1155I;

        /* renamed from: J */
        public int f1156J;

        /* renamed from: K */
        public int f1157K;

        /* renamed from: L */
        public int f1158L;

        /* renamed from: M */
        public int f1159M;

        /* renamed from: N */
        public int f1160N;

        /* renamed from: O */
        public int f1161O;

        /* renamed from: P */
        public int f1162P;

        /* renamed from: Q */
        public float f1163Q;

        /* renamed from: R */
        public float f1164R;

        /* renamed from: S */
        public int f1165S;

        /* renamed from: T */
        public int f1166T;

        /* renamed from: U */
        public float f1167U;

        /* renamed from: V */
        public boolean f1168V;

        /* renamed from: W */
        public float f1169W;

        /* renamed from: X */
        public float f1170X;

        /* renamed from: Y */
        public float f1171Y;

        /* renamed from: Z */
        public float f1172Z;

        /* renamed from: a */
        boolean f1173a;

        /* renamed from: aa */
        public float f1174aa;

        /* renamed from: ab */
        public float f1175ab;

        /* renamed from: ac */
        public float f1176ac;

        /* renamed from: ad */
        public float f1177ad;

        /* renamed from: ae */
        public float f1178ae;

        /* renamed from: af */
        public float f1179af;

        /* renamed from: ag */
        public float f1180ag;

        /* renamed from: ah */
        public boolean f1181ah;

        /* renamed from: ai */
        public boolean f1182ai;

        /* renamed from: aj */
        public int f1183aj;

        /* renamed from: ak */
        public int f1184ak;

        /* renamed from: al */
        public int f1185al;

        /* renamed from: am */
        public int f1186am;

        /* renamed from: an */
        public int f1187an;

        /* renamed from: ao */
        public int f1188ao;

        /* renamed from: ap */
        public float f1189ap;

        /* renamed from: aq */
        public float f1190aq;

        /* renamed from: ar */
        public int f1191ar;

        /* renamed from: as */
        public int f1192as;

        /* renamed from: at */
        public int[] f1193at;

        /* renamed from: b */
        public int f1194b;

        /* renamed from: c */
        public int f1195c;

        /* renamed from: d */
        int f1196d;

        /* renamed from: e */
        public int f1197e;

        /* renamed from: f */
        public int f1198f;

        /* renamed from: g */
        public float f1199g;

        /* renamed from: h */
        public int f1200h;

        /* renamed from: i */
        public int f1201i;

        /* renamed from: j */
        public int f1202j;

        /* renamed from: k */
        public int f1203k;

        /* renamed from: l */
        public int f1204l;

        /* renamed from: m */
        public int f1205m;

        /* renamed from: n */
        public int f1206n;

        /* renamed from: o */
        public int f1207o;

        /* renamed from: p */
        public int f1208p;

        /* renamed from: q */
        public int f1209q;

        /* renamed from: r */
        public int f1210r;

        /* renamed from: s */
        public int f1211s;

        /* renamed from: t */
        public int f1212t;

        /* renamed from: u */
        public float f1213u;

        /* renamed from: v */
        public float f1214v;

        /* renamed from: w */
        public String f1215w;

        /* renamed from: x */
        public int f1216x;

        /* renamed from: y */
        public int f1217y;

        /* renamed from: z */
        public float f1218z;

        private C0361a() {
            this.f1197e = -1;
            this.f1198f = -1;
            this.f1199g = -1.0f;
            this.f1200h = -1;
            this.f1201i = -1;
            this.f1202j = -1;
            this.f1203k = -1;
            this.f1204l = -1;
            this.f1205m = -1;
            this.f1206n = -1;
            this.f1207o = -1;
            this.f1208p = -1;
            this.f1209q = -1;
            this.f1210r = -1;
            this.f1211s = -1;
            this.f1212t = -1;
            this.f1213u = 0.5f;
            this.f1214v = 0.5f;
            this.f1216x = -1;
            this.f1147A = -1;
            this.f1148B = -1;
            this.f1149C = -1;
            this.f1150D = -1;
            this.f1151E = -1;
            this.f1152F = -1;
            this.f1153G = -1;
            this.f1154H = -1;
            this.f1155I = -1;
            this.f1157K = -1;
            this.f1158L = -1;
            this.f1159M = -1;
            this.f1160N = -1;
            this.f1161O = -1;
            this.f1162P = -1;
            this.f1167U = 1.0f;
            this.f1174aa = 1.0f;
            this.f1175ab = 1.0f;
            this.f1176ac = Float.NaN;
            this.f1177ad = Float.NaN;
            this.f1185al = -1;
            this.f1186am = -1;
            this.f1187an = -1;
            this.f1188ao = -1;
            this.f1189ap = 1.0f;
            this.f1190aq = 1.0f;
            this.f1191ar = -1;
            this.f1192as = -1;
        }

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            C0361a aVar = new C0361a();
            aVar.f1173a = this.f1173a;
            aVar.f1194b = this.f1194b;
            aVar.f1195c = this.f1195c;
            aVar.f1197e = this.f1197e;
            aVar.f1198f = this.f1198f;
            aVar.f1199g = this.f1199g;
            aVar.f1200h = this.f1200h;
            aVar.f1201i = this.f1201i;
            aVar.f1202j = this.f1202j;
            aVar.f1203k = this.f1203k;
            aVar.f1204l = this.f1204l;
            aVar.f1205m = this.f1205m;
            aVar.f1206n = this.f1206n;
            aVar.f1207o = this.f1207o;
            aVar.f1208p = this.f1208p;
            aVar.f1209q = this.f1209q;
            aVar.f1210r = this.f1210r;
            aVar.f1211s = this.f1211s;
            aVar.f1212t = this.f1212t;
            aVar.f1213u = this.f1213u;
            aVar.f1214v = this.f1214v;
            aVar.f1215w = this.f1215w;
            aVar.f1147A = this.f1147A;
            aVar.f1148B = this.f1148B;
            aVar.f1213u = this.f1213u;
            aVar.f1213u = this.f1213u;
            aVar.f1213u = this.f1213u;
            aVar.f1213u = this.f1213u;
            aVar.f1213u = this.f1213u;
            aVar.f1149C = this.f1149C;
            aVar.f1150D = this.f1150D;
            aVar.f1151E = this.f1151E;
            aVar.f1152F = this.f1152F;
            aVar.f1153G = this.f1153G;
            aVar.f1154H = this.f1154H;
            aVar.f1155I = this.f1155I;
            aVar.f1156J = this.f1156J;
            aVar.f1157K = this.f1157K;
            aVar.f1158L = this.f1158L;
            aVar.f1159M = this.f1159M;
            aVar.f1160N = this.f1160N;
            aVar.f1161O = this.f1161O;
            aVar.f1162P = this.f1162P;
            aVar.f1163Q = this.f1163Q;
            aVar.f1164R = this.f1164R;
            aVar.f1165S = this.f1165S;
            aVar.f1166T = this.f1166T;
            aVar.f1167U = this.f1167U;
            aVar.f1168V = this.f1168V;
            aVar.f1169W = this.f1169W;
            aVar.f1170X = this.f1170X;
            aVar.f1171Y = this.f1171Y;
            aVar.f1172Z = this.f1172Z;
            aVar.f1174aa = this.f1174aa;
            aVar.f1175ab = this.f1175ab;
            aVar.f1176ac = this.f1176ac;
            aVar.f1177ad = this.f1177ad;
            aVar.f1178ae = this.f1178ae;
            aVar.f1179af = this.f1179af;
            aVar.f1180ag = this.f1180ag;
            aVar.f1181ah = this.f1181ah;
            aVar.f1182ai = this.f1182ai;
            aVar.f1183aj = this.f1183aj;
            aVar.f1184ak = this.f1184ak;
            aVar.f1185al = this.f1185al;
            aVar.f1186am = this.f1186am;
            aVar.f1187an = this.f1187an;
            aVar.f1188ao = this.f1188ao;
            aVar.f1189ap = this.f1189ap;
            aVar.f1190aq = this.f1190aq;
            aVar.f1191ar = this.f1191ar;
            aVar.f1192as = this.f1192as;
            if (this.f1193at != null) {
                aVar.f1193at = Arrays.copyOf(this.f1193at, this.f1193at.length);
            }
            aVar.f1216x = this.f1216x;
            aVar.f1217y = this.f1217y;
            aVar.f1218z = this.f1218z;
            return aVar;
        }

        /* renamed from: a */
        public final void mo820a(LayoutParams layoutParams) {
            layoutParams.f860d = this.f1200h;
            layoutParams.f861e = this.f1201i;
            layoutParams.f862f = this.f1202j;
            layoutParams.f863g = this.f1203k;
            layoutParams.f864h = this.f1204l;
            layoutParams.f865i = this.f1205m;
            layoutParams.f866j = this.f1206n;
            layoutParams.f867k = this.f1207o;
            layoutParams.f868l = this.f1208p;
            layoutParams.f872p = this.f1209q;
            layoutParams.f873q = this.f1210r;
            layoutParams.f874r = this.f1211s;
            layoutParams.f875s = this.f1212t;
            layoutParams.leftMargin = this.f1150D;
            layoutParams.rightMargin = this.f1151E;
            layoutParams.topMargin = this.f1152F;
            layoutParams.bottomMargin = this.f1153G;
            layoutParams.f880x = this.f1162P;
            layoutParams.f881y = this.f1161O;
            layoutParams.f882z = this.f1213u;
            layoutParams.f818A = this.f1214v;
            layoutParams.f869m = this.f1216x;
            layoutParams.f870n = this.f1217y;
            layoutParams.f871o = this.f1218z;
            layoutParams.f819B = this.f1215w;
            layoutParams.f834Q = this.f1147A;
            layoutParams.f835R = this.f1148B;
            layoutParams.f823F = this.f1163Q;
            layoutParams.f822E = this.f1164R;
            layoutParams.f825H = this.f1166T;
            layoutParams.f824G = this.f1165S;
            layoutParams.f837T = this.f1181ah;
            layoutParams.f838U = this.f1182ai;
            layoutParams.f826I = this.f1183aj;
            layoutParams.f827J = this.f1184ak;
            layoutParams.f830M = this.f1185al;
            layoutParams.f831N = this.f1186am;
            layoutParams.f828K = this.f1187an;
            layoutParams.f829L = this.f1188ao;
            layoutParams.f832O = this.f1189ap;
            layoutParams.f833P = this.f1190aq;
            layoutParams.f836S = this.f1149C;
            layoutParams.f859c = this.f1199g;
            layoutParams.f844a = this.f1197e;
            layoutParams.f858b = this.f1198f;
            layoutParams.width = this.f1194b;
            layoutParams.height = this.f1195c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f1155I);
                layoutParams.setMarginEnd(this.f1154H);
            }
            layoutParams.mo672a();
        }

        /* renamed from: a */
        public final void mo819a(int i, Constraints.LayoutParams layoutParams) {
            mo818a(i, (LayoutParams) layoutParams);
            this.f1167U = layoutParams.f885an;
            this.f1170X = layoutParams.f888aq;
            this.f1171Y = layoutParams.f889ar;
            this.f1172Z = layoutParams.f890as;
            this.f1174aa = layoutParams.f891at;
            this.f1175ab = layoutParams.f892au;
            this.f1176ac = layoutParams.f893av;
            this.f1177ad = layoutParams.f894aw;
            this.f1178ae = layoutParams.f895ax;
            this.f1179af = layoutParams.f896ay;
            this.f1180ag = layoutParams.f897az;
            this.f1169W = layoutParams.f887ap;
            this.f1168V = layoutParams.f886ao;
        }

        /* renamed from: a */
        public final void mo818a(int i, LayoutParams layoutParams) {
            this.f1196d = i;
            this.f1200h = layoutParams.f860d;
            this.f1201i = layoutParams.f861e;
            this.f1202j = layoutParams.f862f;
            this.f1203k = layoutParams.f863g;
            this.f1204l = layoutParams.f864h;
            this.f1205m = layoutParams.f865i;
            this.f1206n = layoutParams.f866j;
            this.f1207o = layoutParams.f867k;
            this.f1208p = layoutParams.f868l;
            this.f1209q = layoutParams.f872p;
            this.f1210r = layoutParams.f873q;
            this.f1211s = layoutParams.f874r;
            this.f1212t = layoutParams.f875s;
            this.f1213u = layoutParams.f882z;
            this.f1214v = layoutParams.f818A;
            this.f1215w = layoutParams.f819B;
            this.f1216x = layoutParams.f869m;
            this.f1217y = layoutParams.f870n;
            this.f1218z = layoutParams.f871o;
            this.f1147A = layoutParams.f834Q;
            this.f1148B = layoutParams.f835R;
            this.f1149C = layoutParams.f836S;
            this.f1199g = layoutParams.f859c;
            this.f1197e = layoutParams.f844a;
            this.f1198f = layoutParams.f858b;
            this.f1194b = layoutParams.width;
            this.f1195c = layoutParams.height;
            this.f1150D = layoutParams.leftMargin;
            this.f1151E = layoutParams.rightMargin;
            this.f1152F = layoutParams.topMargin;
            this.f1153G = layoutParams.bottomMargin;
            this.f1163Q = layoutParams.f823F;
            this.f1164R = layoutParams.f822E;
            this.f1166T = layoutParams.f825H;
            this.f1165S = layoutParams.f824G;
            this.f1181ah = layoutParams.f837T;
            this.f1182ai = layoutParams.f838U;
            this.f1183aj = layoutParams.f826I;
            this.f1184ak = layoutParams.f827J;
            this.f1181ah = layoutParams.f837T;
            this.f1185al = layoutParams.f830M;
            this.f1186am = layoutParams.f831N;
            this.f1187an = layoutParams.f828K;
            this.f1188ao = layoutParams.f829L;
            this.f1189ap = layoutParams.f832O;
            this.f1190aq = layoutParams.f833P;
            if (VERSION.SDK_INT >= 17) {
                this.f1154H = layoutParams.getMarginEnd();
                this.f1155I = layoutParams.getMarginStart();
            }
        }
    }

    /* renamed from: a */
    private static String m883a(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1145c = sparseIntArray;
        sparseIntArray.append(47, 25);
        f1145c.append(48, 26);
        f1145c.append(50, 29);
        f1145c.append(51, 30);
        f1145c.append(56, 36);
        f1145c.append(55, 35);
        f1145c.append(29, 4);
        f1145c.append(28, 3);
        f1145c.append(26, 1);
        f1145c.append(64, 6);
        f1145c.append(65, 7);
        f1145c.append(36, 17);
        f1145c.append(37, 18);
        f1145c.append(38, 19);
        f1145c.append(0, 27);
        f1145c.append(52, 32);
        f1145c.append(53, 33);
        f1145c.append(35, 10);
        f1145c.append(34, 9);
        f1145c.append(68, 13);
        f1145c.append(71, 16);
        f1145c.append(69, 14);
        f1145c.append(66, 11);
        f1145c.append(70, 15);
        f1145c.append(67, 12);
        f1145c.append(59, 40);
        f1145c.append(45, 39);
        f1145c.append(44, 41);
        f1145c.append(58, 42);
        f1145c.append(43, 20);
        f1145c.append(57, 37);
        f1145c.append(33, 5);
        f1145c.append(46, 64);
        f1145c.append(54, 64);
        f1145c.append(49, 64);
        f1145c.append(27, 64);
        f1145c.append(25, 64);
        f1145c.append(5, 24);
        f1145c.append(7, 28);
        f1145c.append(19, 31);
        f1145c.append(20, 8);
        f1145c.append(6, 34);
        f1145c.append(8, 2);
        f1145c.append(3, 23);
        f1145c.append(4, 21);
        f1145c.append(2, 22);
        f1145c.append(9, 43);
        f1145c.append(22, 44);
        f1145c.append(17, 45);
        f1145c.append(18, 46);
        f1145c.append(16, 60);
        f1145c.append(14, 47);
        f1145c.append(15, 48);
        f1145c.append(10, 49);
        f1145c.append(11, 50);
        f1145c.append(12, 51);
        f1145c.append(13, 52);
        f1145c.append(21, 53);
        f1145c.append(60, 54);
        f1145c.append(39, 55);
        f1145c.append(61, 56);
        f1145c.append(40, 57);
        f1145c.append(62, 58);
        f1145c.append(41, 59);
        f1145c.append(30, 61);
        f1145c.append(32, 62);
        f1145c.append(31, 63);
        f1145c.append(1, 38);
    }

    /* renamed from: b */
    public final void mo816b(ConstraintLayout constraintLayout) {
        mo817c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo817c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1146b.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f1146b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0361a aVar = (C0361a) this.f1146b.get(Integer.valueOf(id));
                    if (aVar.f1192as != -1 && aVar.f1192as == 1) {
                        C0323a aVar2 = (C0323a) childAt;
                        aVar2.setId(id);
                        aVar2.setReferencedIds(aVar.f1193at);
                        aVar2.setType(aVar.f1191ar);
                        aVar.mo820a(ConstraintLayout.m701a());
                    }
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    aVar.mo820a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(aVar.f1156J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f1167U);
                        childAt.setRotation(aVar.f1170X);
                        childAt.setRotationX(aVar.f1171Y);
                        childAt.setRotationY(aVar.f1172Z);
                        childAt.setScaleX(aVar.f1174aa);
                        childAt.setScaleY(aVar.f1175ab);
                        if (!Float.isNaN(aVar.f1176ac)) {
                            childAt.setPivotX(aVar.f1176ac);
                        }
                        if (!Float.isNaN(aVar.f1177ad)) {
                            childAt.setPivotY(aVar.f1177ad);
                        }
                        childAt.setTranslationX(aVar.f1178ae);
                        childAt.setTranslationY(aVar.f1179af);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f1180ag);
                            if (aVar.f1168V) {
                                childAt.setElevation(aVar.f1169W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0361a aVar3 = (C0361a) this.f1146b.get(num);
            if (aVar3.f1192as != -1 && aVar3.f1192as == 1) {
                C0323a aVar4 = new C0323a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                aVar4.setReferencedIds(aVar3.f1193at);
                aVar4.setType(aVar3.f1191ar);
                LayoutParams a = ConstraintLayout.m701a();
                aVar3.mo820a(a);
                constraintLayout.addView(aVar4, a);
            }
            if (aVar3.f1173a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                LayoutParams a2 = ConstraintLayout.m701a();
                aVar3.mo820a(a2);
                constraintLayout.addView(guideline, a2);
            }
        }
    }

    /* renamed from: a */
    public final void mo815a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1146b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f1146b.containsKey(Integer.valueOf(id))) {
                    this.f1146b.put(Integer.valueOf(id), new C0361a());
                }
                C0361a aVar = (C0361a) this.f1146b.get(Integer.valueOf(id));
                aVar.mo818a(id, layoutParams);
                aVar.f1156J = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    aVar.f1167U = childAt.getAlpha();
                    aVar.f1170X = childAt.getRotation();
                    aVar.f1171Y = childAt.getRotationX();
                    aVar.f1172Z = childAt.getRotationY();
                    aVar.f1174aa = childAt.getScaleX();
                    aVar.f1175ab = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == ProfileUiInitOptimizeEnterThreshold.DEFAULT && ((double) pivotY) == ProfileUiInitOptimizeEnterThreshold.DEFAULT)) {
                        aVar.f1176ac = pivotX;
                        aVar.f1177ad = pivotY;
                    }
                    aVar.f1178ae = childAt.getTranslationX();
                    aVar.f1179af = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        aVar.f1180ag = childAt.getTranslationZ();
                        if (aVar.f1168V) {
                            aVar.f1169W = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public final void mo812a(int i, int i2) {
        if (this.f1146b.containsKey(Integer.valueOf(i))) {
            C0361a aVar = (C0361a) this.f1146b.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    aVar.f1201i = -1;
                    aVar.f1200h = -1;
                    aVar.f1150D = -1;
                    aVar.f1157K = -1;
                    return;
                case 2:
                    aVar.f1203k = -1;
                    aVar.f1202j = -1;
                    aVar.f1151E = -1;
                    aVar.f1159M = -1;
                    return;
                case 3:
                    aVar.f1205m = -1;
                    aVar.f1204l = -1;
                    aVar.f1152F = -1;
                    aVar.f1158L = -1;
                    return;
                case 4:
                    aVar.f1206n = -1;
                    aVar.f1207o = -1;
                    aVar.f1153G = -1;
                    aVar.f1160N = -1;
                    return;
                case 5:
                    aVar.f1208p = -1;
                    return;
                case 6:
                    aVar.f1209q = -1;
                    aVar.f1210r = -1;
                    aVar.f1155I = -1;
                    aVar.f1162P = -1;
                    return;
                case 7:
                    aVar.f1211s = -1;
                    aVar.f1212t = -1;
                    aVar.f1154H = -1;
                    aVar.f1161O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: a */
    static int m882a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: a */
    public final void mo813a(int i, int i2, int i3) {
        if (!this.f1146b.containsKey(Integer.valueOf(i))) {
            this.f1146b.put(Integer.valueOf(i), new C0361a());
        }
        ((C0361a) this.f1146b.get(Integer.valueOf(i))).f1154H = i3;
    }

    /* renamed from: a */
    public final void mo814a(int i, int i2, int i3, int i4) {
        if (!this.f1146b.containsKey(Integer.valueOf(i))) {
            this.f1146b.put(Integer.valueOf(i), new C0361a());
        }
        C0361a aVar = (C0361a) this.f1146b.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f1200h = i3;
                    aVar.f1201i = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f1201i = i3;
                    aVar.f1200h = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("left to ");
                    sb.append(m883a(i4));
                    sb.append(" undefined");
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    aVar.f1202j = i3;
                    aVar.f1203k = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f1203k = i3;
                    aVar.f1202j = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("right to ");
                    sb2.append(m883a(i4));
                    sb2.append(" undefined");
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    aVar.f1204l = i3;
                    aVar.f1205m = -1;
                    aVar.f1208p = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.f1205m = i3;
                    aVar.f1204l = -1;
                    aVar.f1208p = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder("right to ");
                    sb3.append(m883a(i4));
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i4 == 4) {
                    aVar.f1207o = i3;
                    aVar.f1206n = -1;
                    aVar.f1208p = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.f1206n = i3;
                    aVar.f1207o = -1;
                    aVar.f1208p = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder("right to ");
                    sb4.append(m883a(i4));
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i4 == 5) {
                    aVar.f1208p = i3;
                    aVar.f1207o = -1;
                    aVar.f1206n = -1;
                    aVar.f1204l = -1;
                    aVar.f1205m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder("right to ");
                sb5.append(m883a(i4));
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    aVar.f1210r = i3;
                    aVar.f1209q = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.f1209q = i3;
                    aVar.f1210r = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder("right to ");
                    sb6.append(m883a(i4));
                    sb6.append(" undefined");
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    aVar.f1212t = i3;
                    aVar.f1211s = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.f1211s = i3;
                    aVar.f1212t = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder("right to ");
                    sb7.append(m883a(i4));
                    sb7.append(" undefined");
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m883a(i2));
                sb8.append(" to ");
                sb8.append(m883a(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }
}
