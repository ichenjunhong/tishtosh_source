package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.p020a.C0353f;
import android.support.constraint.p020a.p021a.C0333e;
import android.support.constraint.p020a.p021a.C0336f;
import android.support.constraint.p020a.p021a.C0337g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bef.effectsdk.message.MessageCenter;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f798a = new SparseArray<>();

    /* renamed from: b */
    C0336f f799b = new C0336f();

    /* renamed from: c */
    HashMap<String, Integer> f800c = new HashMap<>();

    /* renamed from: d */
    int f801d = -1;

    /* renamed from: e */
    int f802e = -1;

    /* renamed from: f */
    int f803f = 0;

    /* renamed from: g */
    int f804g = 0;

    /* renamed from: h */
    private ArrayList<ConstraintHelper> f805h = new ArrayList<>(4);

    /* renamed from: i */
    private final ArrayList<C0333e> f806i = new ArrayList<>(100);

    /* renamed from: j */
    private int f807j = 0;

    /* renamed from: k */
    private int f808k = 0;

    /* renamed from: l */
    private int f809l = Integer.MAX_VALUE;

    /* renamed from: m */
    private int f810m = Integer.MAX_VALUE;

    /* renamed from: n */
    private boolean f811n = true;

    /* renamed from: o */
    private int f812o = 3;

    /* renamed from: p */
    private C0359b f813p = null;

    /* renamed from: q */
    private int f814q = -1;

    /* renamed from: r */
    private int f815r = -1;

    /* renamed from: s */
    private int f816s = -1;

    /* renamed from: t */
    private C0353f f817t;

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: A */
        public float f818A = 0.5f;

        /* renamed from: B */
        public String f819B;

        /* renamed from: C */
        float f820C;

        /* renamed from: D */
        int f821D = 1;

        /* renamed from: E */
        public float f822E = -1.0f;

        /* renamed from: F */
        public float f823F = -1.0f;

        /* renamed from: G */
        public int f824G;

        /* renamed from: H */
        public int f825H;

        /* renamed from: I */
        public int f826I;

        /* renamed from: J */
        public int f827J;

        /* renamed from: K */
        public int f828K;

        /* renamed from: L */
        public int f829L;

        /* renamed from: M */
        public int f830M;

        /* renamed from: N */
        public int f831N;

        /* renamed from: O */
        public float f832O = 1.0f;

        /* renamed from: P */
        public float f833P = 1.0f;

        /* renamed from: Q */
        public int f834Q = -1;

        /* renamed from: R */
        public int f835R = -1;

        /* renamed from: S */
        public int f836S = -1;

        /* renamed from: T */
        public boolean f837T;

        /* renamed from: U */
        public boolean f838U;

        /* renamed from: V */
        boolean f839V = true;

        /* renamed from: W */
        boolean f840W = true;

        /* renamed from: X */
        boolean f841X;

        /* renamed from: Y */
        boolean f842Y;

        /* renamed from: Z */
        boolean f843Z;

        /* renamed from: a */
        public int f844a = -1;

        /* renamed from: aa */
        boolean f845aa;

        /* renamed from: ab */
        int f846ab = -1;

        /* renamed from: ac */
        int f847ac = -1;

        /* renamed from: ad */
        int f848ad = -1;

        /* renamed from: ae */
        int f849ae = -1;

        /* renamed from: af */
        int f850af = -1;

        /* renamed from: ag */
        int f851ag = -1;

        /* renamed from: ah */
        float f852ah = 0.5f;

        /* renamed from: ai */
        int f853ai;

        /* renamed from: aj */
        int f854aj;

        /* renamed from: ak */
        float f855ak;

        /* renamed from: al */
        C0333e f856al = new C0333e();

        /* renamed from: am */
        public boolean f857am = false;

        /* renamed from: b */
        public int f858b = -1;

        /* renamed from: c */
        public float f859c = -1.0f;

        /* renamed from: d */
        public int f860d = -1;

        /* renamed from: e */
        public int f861e = -1;

        /* renamed from: f */
        public int f862f = -1;

        /* renamed from: g */
        public int f863g = -1;

        /* renamed from: h */
        public int f864h = -1;

        /* renamed from: i */
        public int f865i = -1;

        /* renamed from: j */
        public int f866j = -1;

        /* renamed from: k */
        public int f867k = -1;

        /* renamed from: l */
        public int f868l = -1;

        /* renamed from: m */
        public int f869m = -1;

        /* renamed from: n */
        public int f870n;

        /* renamed from: o */
        public float f871o;

        /* renamed from: p */
        public int f872p = -1;

        /* renamed from: q */
        public int f873q = -1;

        /* renamed from: r */
        public int f874r = -1;

        /* renamed from: s */
        public int f875s = -1;

        /* renamed from: t */
        public int f876t = -1;

        /* renamed from: u */
        public int f877u = -1;

        /* renamed from: v */
        public int f878v = -1;

        /* renamed from: w */
        public int f879w = -1;

        /* renamed from: x */
        public int f880x = -1;

        /* renamed from: y */
        public int f881y = -1;

        /* renamed from: z */
        public float f882z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$LayoutParams$a */
        static class C0322a {

            /* renamed from: a */
            public static final SparseIntArray f883a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f883a = sparseIntArray;
                sparseIntArray.append(34, 8);
                f883a.append(35, 9);
                f883a.append(37, 10);
                f883a.append(38, 11);
                f883a.append(43, 12);
                f883a.append(42, 13);
                f883a.append(16, 14);
                f883a.append(15, 15);
                f883a.append(13, 16);
                f883a.append(17, 2);
                f883a.append(19, 3);
                f883a.append(18, 4);
                f883a.append(51, 49);
                f883a.append(52, 50);
                f883a.append(23, 5);
                f883a.append(24, 6);
                f883a.append(25, 7);
                f883a.append(0, 1);
                f883a.append(39, 17);
                f883a.append(40, 18);
                f883a.append(22, 19);
                f883a.append(21, 20);
                f883a.append(55, 21);
                f883a.append(58, 22);
                f883a.append(56, 23);
                f883a.append(53, 24);
                f883a.append(57, 25);
                f883a.append(54, 26);
                f883a.append(30, 29);
                f883a.append(44, 30);
                f883a.append(20, 44);
                f883a.append(32, 45);
                f883a.append(46, 46);
                f883a.append(31, 47);
                f883a.append(45, 48);
                f883a.append(11, 27);
                f883a.append(10, 28);
                f883a.append(47, 31);
                f883a.append(26, 32);
                f883a.append(49, 33);
                f883a.append(48, 34);
                f883a.append(50, 35);
                f883a.append(28, 36);
                f883a.append(27, 37);
                f883a.append(29, 38);
                f883a.append(33, 39);
                f883a.append(41, 40);
                f883a.append(36, 41);
                f883a.append(14, 42);
                f883a.append(12, 43);
            }
        }

        /* renamed from: a */
        public final void mo672a() {
            this.f842Y = false;
            this.f839V = true;
            this.f840W = true;
            if (this.width == -2 && this.f837T) {
                this.f839V = false;
                this.f826I = 1;
            }
            if (this.height == -2 && this.f838U) {
                this.f840W = false;
                this.f827J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f839V = false;
                if (this.width == 0 && this.f826I == 1) {
                    this.width = -2;
                    this.f837T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f840W = false;
                if (this.height == 0 && this.f827J == 1) {
                    this.height = -2;
                    this.f838U = true;
                }
            }
            if (this.f859c != -1.0f || this.f844a != -1 || this.f858b != -1) {
                this.f842Y = true;
                this.f839V = true;
                this.f840W = true;
                if (!(this.f856al instanceof C0337g)) {
                    this.f856al = new C0337g();
                }
                ((C0337g) this.f856al).mo751f(this.f836S);
            }
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r6) {
            /*
                r5 = this;
                int r0 = r5.leftMargin
                int r1 = r5.rightMargin
                super.resolveLayoutDirection(r6)
                r6 = -1
                r5.f848ad = r6
                r5.f849ae = r6
                r5.f846ab = r6
                r5.f847ac = r6
                r5.f850af = r6
                r5.f851ag = r6
                int r2 = r5.f876t
                r5.f850af = r2
                int r2 = r5.f878v
                r5.f851ag = r2
                float r2 = r5.f882z
                r5.f852ah = r2
                int r2 = r5.f844a
                r5.f853ai = r2
                int r2 = r5.f858b
                r5.f854aj = r2
                float r2 = r5.f859c
                r5.f855ak = r2
                int r2 = r5.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x00ac
                int r2 = r5.f872p
                if (r2 == r6) goto L_0x0043
                int r2 = r5.f872p
                r5.f848ad = r2
            L_0x0041:
                r3 = 1
                goto L_0x004c
            L_0x0043:
                int r2 = r5.f873q
                if (r2 == r6) goto L_0x004c
                int r2 = r5.f873q
                r5.f849ae = r2
                goto L_0x0041
            L_0x004c:
                int r2 = r5.f874r
                if (r2 == r6) goto L_0x0055
                int r2 = r5.f874r
                r5.f847ac = r2
                r3 = 1
            L_0x0055:
                int r2 = r5.f875s
                if (r2 == r6) goto L_0x005e
                int r2 = r5.f875s
                r5.f846ab = r2
                r3 = 1
            L_0x005e:
                int r2 = r5.f880x
                if (r2 == r6) goto L_0x0066
                int r2 = r5.f880x
                r5.f851ag = r2
            L_0x0066:
                int r2 = r5.f881y
                if (r2 == r6) goto L_0x006e
                int r2 = r5.f881y
                r5.f850af = r2
            L_0x006e:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0078
                float r3 = r5.f882z
                float r3 = r2 - r3
                r5.f852ah = r3
            L_0x0078:
                boolean r3 = r5.f842Y
                if (r3 == 0) goto L_0x00dc
                int r3 = r5.f836S
                if (r3 != r4) goto L_0x00dc
                float r3 = r5.f859c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x0092
                float r3 = r5.f859c
                float r2 = r2 - r3
                r5.f855ak = r2
                r5.f853ai = r6
                r5.f854aj = r6
                goto L_0x00dc
            L_0x0092:
                int r2 = r5.f844a
                if (r2 == r6) goto L_0x009f
                int r2 = r5.f844a
                r5.f854aj = r2
                r5.f853ai = r6
                r5.f855ak = r4
                goto L_0x00dc
            L_0x009f:
                int r2 = r5.f858b
                if (r2 == r6) goto L_0x00dc
                int r2 = r5.f858b
                r5.f853ai = r2
                r5.f854aj = r6
                r5.f855ak = r4
                goto L_0x00dc
            L_0x00ac:
                int r2 = r5.f872p
                if (r2 == r6) goto L_0x00b4
                int r2 = r5.f872p
                r5.f847ac = r2
            L_0x00b4:
                int r2 = r5.f873q
                if (r2 == r6) goto L_0x00bc
                int r2 = r5.f873q
                r5.f846ab = r2
            L_0x00bc:
                int r2 = r5.f874r
                if (r2 == r6) goto L_0x00c4
                int r2 = r5.f874r
                r5.f848ad = r2
            L_0x00c4:
                int r2 = r5.f875s
                if (r2 == r6) goto L_0x00cc
                int r2 = r5.f875s
                r5.f849ae = r2
            L_0x00cc:
                int r2 = r5.f880x
                if (r2 == r6) goto L_0x00d4
                int r2 = r5.f880x
                r5.f850af = r2
            L_0x00d4:
                int r2 = r5.f881y
                if (r2 == r6) goto L_0x00dc
                int r2 = r5.f881y
                r5.f851ag = r2
            L_0x00dc:
                int r2 = r5.f874r
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f875s
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f873q
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f872p
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f862f
                if (r2 == r6) goto L_0x00fd
                int r2 = r5.f862f
                r5.f848ad = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010d
                if (r1 <= 0) goto L_0x010d
                r5.rightMargin = r1
                goto L_0x010d
            L_0x00fd:
                int r2 = r5.f863g
                if (r2 == r6) goto L_0x010d
                int r2 = r5.f863g
                r5.f849ae = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010d
                if (r1 <= 0) goto L_0x010d
                r5.rightMargin = r1
            L_0x010d:
                int r1 = r5.f860d
                if (r1 == r6) goto L_0x011e
                int r6 = r5.f860d
                r5.f846ab = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012e
                if (r0 <= 0) goto L_0x012e
                r5.leftMargin = r0
                return
            L_0x011e:
                int r1 = r5.f861e
                if (r1 == r6) goto L_0x012e
                int r6 = r5.f861e
                r5.f847ac = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012e
                if (r0 <= 0) goto L_0x012e
                r5.leftMargin = r0
            L_0x012e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.c4, R.attr.c5, R.attr.e_, R.attr.hz, R.attr.i0, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql, R.attr.qm, R.attr.qn, R.attr.qo, R.attr.qp, R.attr.qq, R.attr.qr, R.attr.qs, R.attr.qt, R.attr.qu, R.attr.qv, R.attr.qw, R.attr.qx, R.attr.qy, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.r4, R.attr.r5, R.attr.r6, R.attr.r7, R.attr.r8, R.attr.r9, R.attr.r_, R.attr.ra, R.attr.rb, R.attr.rc, R.attr.rd, R.attr.re, R.attr.rf, R.attr.rg, R.attr.rh, R.attr.ri, R.attr.rj, R.attr.rk, R.attr.rl, R.attr.rn, R.attr.ro, R.attr.rp, R.attr.rq, R.attr.rr, R.attr.rs, R.attr.rt, R.attr.ru, R.attr.ry});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0322a.f883a.get(index);
                switch (i3) {
                    case 0:
                        break;
                    case 1:
                        this.f836S = obtainStyledAttributes.getInt(index, this.f836S);
                        break;
                    case 2:
                        this.f869m = obtainStyledAttributes.getResourceId(index, this.f869m);
                        if (this.f869m != -1) {
                            break;
                        } else {
                            this.f869m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f870n = obtainStyledAttributes.getDimensionPixelSize(index, this.f870n);
                        break;
                    case 4:
                        this.f871o = obtainStyledAttributes.getFloat(index, this.f871o) % 360.0f;
                        if (this.f871o >= 0.0f) {
                            break;
                        } else {
                            this.f871o = (360.0f - this.f871o) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f844a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f844a);
                        break;
                    case 6:
                        this.f858b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f858b);
                        break;
                    case 7:
                        this.f859c = obtainStyledAttributes.getFloat(index, this.f859c);
                        break;
                    case 8:
                        this.f860d = obtainStyledAttributes.getResourceId(index, this.f860d);
                        if (this.f860d != -1) {
                            break;
                        } else {
                            this.f860d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f861e = obtainStyledAttributes.getResourceId(index, this.f861e);
                        if (this.f861e != -1) {
                            break;
                        } else {
                            this.f861e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f862f = obtainStyledAttributes.getResourceId(index, this.f862f);
                        if (this.f862f != -1) {
                            break;
                        } else {
                            this.f862f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f863g = obtainStyledAttributes.getResourceId(index, this.f863g);
                        if (this.f863g != -1) {
                            break;
                        } else {
                            this.f863g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f864h = obtainStyledAttributes.getResourceId(index, this.f864h);
                        if (this.f864h != -1) {
                            break;
                        } else {
                            this.f864h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f865i = obtainStyledAttributes.getResourceId(index, this.f865i);
                        if (this.f865i != -1) {
                            break;
                        } else {
                            this.f865i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f866j = obtainStyledAttributes.getResourceId(index, this.f866j);
                        if (this.f866j != -1) {
                            break;
                        } else {
                            this.f866j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f867k = obtainStyledAttributes.getResourceId(index, this.f867k);
                        if (this.f867k != -1) {
                            break;
                        } else {
                            this.f867k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f868l = obtainStyledAttributes.getResourceId(index, this.f868l);
                        if (this.f868l != -1) {
                            break;
                        } else {
                            this.f868l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f872p = obtainStyledAttributes.getResourceId(index, this.f872p);
                        if (this.f872p != -1) {
                            break;
                        } else {
                            this.f872p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f873q = obtainStyledAttributes.getResourceId(index, this.f873q);
                        if (this.f873q != -1) {
                            break;
                        } else {
                            this.f873q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f874r = obtainStyledAttributes.getResourceId(index, this.f874r);
                        if (this.f874r != -1) {
                            break;
                        } else {
                            this.f874r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f875s = obtainStyledAttributes.getResourceId(index, this.f875s);
                        if (this.f875s != -1) {
                            break;
                        } else {
                            this.f875s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f876t = obtainStyledAttributes.getDimensionPixelSize(index, this.f876t);
                        break;
                    case 22:
                        this.f877u = obtainStyledAttributes.getDimensionPixelSize(index, this.f877u);
                        break;
                    case 23:
                        this.f878v = obtainStyledAttributes.getDimensionPixelSize(index, this.f878v);
                        break;
                    case 24:
                        this.f879w = obtainStyledAttributes.getDimensionPixelSize(index, this.f879w);
                        break;
                    case 25:
                        this.f880x = obtainStyledAttributes.getDimensionPixelSize(index, this.f880x);
                        break;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        this.f881y = obtainStyledAttributes.getDimensionPixelSize(index, this.f881y);
                        break;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        this.f837T = obtainStyledAttributes.getBoolean(index, this.f837T);
                        break;
                    case 28:
                        this.f838U = obtainStyledAttributes.getBoolean(index, this.f838U);
                        break;
                    case 29:
                        this.f882z = obtainStyledAttributes.getFloat(index, this.f882z);
                        break;
                    case 30:
                        this.f818A = obtainStyledAttributes.getFloat(index, this.f818A);
                        break;
                    case 31:
                        this.f826I = obtainStyledAttributes.getInt(index, 0);
                        int i4 = this.f826I;
                        break;
                    case 32:
                        this.f827J = obtainStyledAttributes.getInt(index, 0);
                        int i5 = this.f827J;
                        break;
                    case 33:
                        try {
                            this.f828K = obtainStyledAttributes.getDimensionPixelSize(index, this.f828K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f828K) != -2) {
                                break;
                            } else {
                                this.f828K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f830M = obtainStyledAttributes.getDimensionPixelSize(index, this.f830M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f830M) != -2) {
                                break;
                            } else {
                                this.f830M = -2;
                                break;
                            }
                        }
                    case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                        this.f832O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f832O));
                        break;
                    case 36:
                        try {
                            this.f829L = obtainStyledAttributes.getDimensionPixelSize(index, this.f829L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f829L) != -2) {
                                break;
                            } else {
                                this.f829L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f831N = obtainStyledAttributes.getDimensionPixelSize(index, this.f831N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f831N) != -2) {
                                break;
                            } else {
                                this.f831N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f833P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f833P));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                this.f819B = obtainStyledAttributes.getString(index);
                                this.f820C = Float.NaN;
                                this.f821D = -1;
                                if (this.f819B == null) {
                                    break;
                                } else {
                                    int length = this.f819B.length();
                                    int indexOf = this.f819B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f819B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f821D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f821D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f819B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f819B.substring(i, indexOf2);
                                        String substring3 = this.f819B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f821D != 1) {
                                                        this.f820C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.f820C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f819B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.f820C = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case BaseNotice.f96882AT /*45*/:
                                this.f822E = obtainStyledAttributes.getFloat(index, this.f822E);
                                break;
                            case 46:
                                this.f823F = obtainStyledAttributes.getFloat(index, this.f823F);
                                break;
                            case 47:
                                this.f824G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f825H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f834Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f834Q);
                                break;
                            case 50:
                                this.f835R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f835R);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo672a();
        }
    }

    public int getMaxHeight() {
        return this.f810m;
    }

    public int getMaxWidth() {
        return this.f809l;
    }

    public int getMinHeight() {
        return this.f808k;
    }

    public int getMinWidth() {
        return this.f807j;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0921, code lost:
        if (r8.f826I != 1) goto L_0x0925;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0830  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x085e  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0860  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0867  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x087a  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0882  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x088a  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0893  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x089d  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x09b1  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x09bd  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x09c1  */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x09c7  */
    /* JADX WARNING: Removed duplicated region for block: B:679:0x08ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x09d2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r58, int r59) {
        /*
            r57 = this;
            r0 = r57
            r1 = r58
            r2 = r59
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r58)
            int r4 = android.view.View.MeasureSpec.getSize(r58)
            int r5 = android.view.View.MeasureSpec.getMode(r59)
            int r6 = android.view.View.MeasureSpec.getSize(r59)
            r0.f803f = r3
            r0.f804g = r5
            r0.f801d = r4
            r0.f802e = r6
            int r3 = r57.getPaddingLeft()
            int r4 = r57.getPaddingTop()
            android.support.constraint.a.a.f r5 = r0.f799b
            r5.f958L = r3
            android.support.constraint.a.a.f r5 = r0.f799b
            r5.f959M = r4
            android.support.constraint.a.a.f r5 = r0.f799b
            int r6 = r0.f809l
            int[] r5 = r5.f1006t
            r7 = 0
            r5[r7] = r6
            android.support.constraint.a.a.f r5 = r0.f799b
            int r6 = r0.f810m
            int[] r5 = r5.f1006t
            r8 = 1
            r5[r8] = r6
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x0056
            android.support.constraint.a.a.f r5 = r0.f799b
            int r9 = r57.getLayoutDirection()
            if (r9 != r8) goto L_0x0053
            r9 = 1
            goto L_0x0054
        L_0x0053:
            r9 = 0
        L_0x0054:
            r5.f1016a = r9
        L_0x0056:
            int r5 = android.view.View.MeasureSpec.getMode(r58)
            int r9 = android.view.View.MeasureSpec.getSize(r58)
            int r10 = android.view.View.MeasureSpec.getMode(r59)
            int r11 = android.view.View.MeasureSpec.getSize(r59)
            int r12 = r57.getPaddingTop()
            int r13 = r57.getPaddingBottom()
            int r12 = r12 + r13
            int r13 = r57.getPaddingLeft()
            int r14 = r57.getPaddingRight()
            int r13 = r13 + r14
            android.support.constraint.a.a.e$a r14 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            android.support.constraint.a.a.e$a r15 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r57.getLayoutParams()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r6) goto L_0x0096
            if (r5 == 0) goto L_0x0093
            if (r5 == r8) goto L_0x008b
        L_0x0089:
            r5 = 0
            goto L_0x0099
        L_0x008b:
            int r5 = r0.f809l
            int r5 = java.lang.Math.min(r5, r9)
            int r5 = r5 - r13
            goto L_0x0099
        L_0x0093:
            android.support.constraint.a.a.e$a r14 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            goto L_0x0089
        L_0x0096:
            android.support.constraint.a.a.e$a r14 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            r5 = r9
        L_0x0099:
            if (r10 == r6) goto L_0x00ac
            if (r10 == 0) goto L_0x00a9
            if (r10 == r8) goto L_0x00a1
        L_0x009f:
            r6 = 0
            goto L_0x00af
        L_0x00a1:
            int r6 = r0.f810m
            int r6 = java.lang.Math.min(r6, r11)
            int r6 = r6 - r12
            goto L_0x00af
        L_0x00a9:
            android.support.constraint.a.a.e$a r15 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            goto L_0x009f
        L_0x00ac:
            android.support.constraint.a.a.e$a r15 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            r6 = r11
        L_0x00af:
            android.support.constraint.a.a.f r9 = r0.f799b
            r9.mo722d(r7)
            android.support.constraint.a.a.f r9 = r0.f799b
            r9.mo724e(r7)
            android.support.constraint.a.a.f r9 = r0.f799b
            r9.mo714a(r14)
            android.support.constraint.a.a.f r9 = r0.f799b
            r9.mo717b(r5)
            android.support.constraint.a.a.f r5 = r0.f799b
            r5.mo718b(r15)
            android.support.constraint.a.a.f r5 = r0.f799b
            r5.mo720c(r6)
            android.support.constraint.a.a.f r5 = r0.f799b
            int r6 = r0.f807j
            int r9 = r57.getPaddingLeft()
            int r6 = r6 - r9
            int r9 = r57.getPaddingRight()
            int r6 = r6 - r9
            r5.mo722d(r6)
            android.support.constraint.a.a.f r5 = r0.f799b
            int r6 = r0.f808k
            int r9 = r57.getPaddingTop()
            int r6 = r6 - r9
            int r9 = r57.getPaddingBottom()
            int r6 = r6 - r9
            r5.mo724e(r6)
            android.support.constraint.a.a.f r5 = r0.f799b
            int r5 = r5.mo730j()
            android.support.constraint.a.a.f r6 = r0.f799b
            int r6 = r6.mo731k()
            boolean r9 = r0.f811n
            r11 = -1
            if (r9 == 0) goto L_0x05fa
            r0.f811n = r7
            int r9 = r57.getChildCount()
            r12 = 0
        L_0x0107:
            if (r12 >= r9) goto L_0x0118
            android.view.View r13 = r0.getChildAt(r12)
            boolean r13 = r13.isLayoutRequested()
            if (r13 == 0) goto L_0x0115
            r9 = 1
            goto L_0x0119
        L_0x0115:
            int r12 = r12 + 1
            goto L_0x0107
        L_0x0118:
            r9 = 0
        L_0x0119:
            if (r9 == 0) goto L_0x05fa
            java.util.ArrayList<android.support.constraint.a.a.e> r9 = r0.f806i
            r9.clear()
            boolean r9 = r57.isInEditMode()
            int r12 = r57.getChildCount()
            if (r9 == 0) goto L_0x0165
            r13 = 0
        L_0x012b:
            if (r13 >= r12) goto L_0x0165
            android.view.View r14 = r0.getChildAt(r13)
            android.content.res.Resources r15 = r57.getResources()     // Catch:{ NotFoundException -> 0x0160 }
            int r8 = r14.getId()     // Catch:{ NotFoundException -> 0x0160 }
            java.lang.String r8 = r15.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0160 }
            int r15 = r14.getId()     // Catch:{ NotFoundException -> 0x0160 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NotFoundException -> 0x0160 }
            r0.m703a(r7, r8, r15)     // Catch:{ NotFoundException -> 0x0160 }
            r15 = 47
            int r15 = r8.indexOf(r15)     // Catch:{ NotFoundException -> 0x0160 }
            if (r15 == r11) goto L_0x0156
            int r15 = r15 + 1
            java.lang.String r8 = r8.substring(r15)     // Catch:{ NotFoundException -> 0x0160 }
        L_0x0156:
            int r14 = r14.getId()     // Catch:{ NotFoundException -> 0x0160 }
            android.support.constraint.a.a.e r14 = r0.m702a(r14)     // Catch:{ NotFoundException -> 0x0160 }
            r14.f976ae = r8     // Catch:{ NotFoundException -> 0x0160 }
        L_0x0160:
            int r13 = r13 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x012b
        L_0x0165:
            r8 = 0
        L_0x0166:
            if (r8 >= r12) goto L_0x0178
            android.view.View r13 = r0.getChildAt(r8)
            android.support.constraint.a.a.e r13 = r0.mo646a(r13)
            if (r13 == 0) goto L_0x0175
            r13.mo726f()
        L_0x0175:
            int r8 = r8 + 1
            goto L_0x0166
        L_0x0178:
            int r8 = r0.f814q
            if (r8 == r11) goto L_0x019a
            r8 = 0
        L_0x017d:
            if (r8 >= r12) goto L_0x019a
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getId()
            int r15 = r0.f814q
            if (r14 != r15) goto L_0x0197
            boolean r14 = r13 instanceof android.support.constraint.Constraints
            if (r14 == 0) goto L_0x0197
            android.support.constraint.Constraints r13 = (android.support.constraint.Constraints) r13
            android.support.constraint.b r13 = r13.getConstraintSet()
            r0.f813p = r13
        L_0x0197:
            int r8 = r8 + 1
            goto L_0x017d
        L_0x019a:
            android.support.constraint.b r8 = r0.f813p
            if (r8 == 0) goto L_0x01a3
            android.support.constraint.b r8 = r0.f813p
            r8.mo817c(r0)
        L_0x01a3:
            android.support.constraint.a.a.f r8 = r0.f799b
            java.util.ArrayList<android.support.constraint.a.a.e> r8 = r8.f1069aD
            r8.clear()
            java.util.ArrayList<android.support.constraint.ConstraintHelper> r8 = r0.f805h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x01c3
            r13 = 0
        L_0x01b3:
            if (r13 >= r8) goto L_0x01c3
            java.util.ArrayList<android.support.constraint.ConstraintHelper> r14 = r0.f805h
            java.lang.Object r14 = r14.get(r13)
            android.support.constraint.ConstraintHelper r14 = (android.support.constraint.ConstraintHelper) r14
            r14.mo638a(r0)
            int r13 = r13 + 1
            goto L_0x01b3
        L_0x01c3:
            r8 = 0
        L_0x01c4:
            if (r8 >= r12) goto L_0x0201
            android.view.View r13 = r0.getChildAt(r8)
            boolean r14 = r13 instanceof android.support.constraint.C0362c
            if (r14 == 0) goto L_0x01fe
            android.support.constraint.c r13 = (android.support.constraint.C0362c) r13
            int r14 = r13.f1219a
            if (r14 != r11) goto L_0x01df
            boolean r14 = r13.isInEditMode()
            if (r14 != 0) goto L_0x01df
            int r14 = r13.f1221c
            r13.setVisibility(r14)
        L_0x01df:
            int r14 = r13.f1219a
            android.view.View r14 = r0.findViewById(r14)
            r13.f1220b = r14
            android.view.View r14 = r13.f1220b
            if (r14 == 0) goto L_0x01fe
            android.view.View r14 = r13.f1220b
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r14 = (android.support.constraint.ConstraintLayout.LayoutParams) r14
            r15 = 1
            r14.f845aa = r15
            android.view.View r14 = r13.f1220b
            r14.setVisibility(r7)
            r13.setVisibility(r7)
        L_0x01fe:
            int r8 = r8 + 1
            goto L_0x01c4
        L_0x0201:
            r8 = 0
        L_0x0202:
            if (r8 >= r12) goto L_0x05fa
            android.view.View r13 = r0.getChildAt(r8)
            android.support.constraint.a.a.e r14 = r0.mo646a(r13)
            if (r14 == 0) goto L_0x05e8
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r15 = (android.support.constraint.ConstraintLayout.LayoutParams) r15
            r15.mo672a()
            boolean r11 = r15.f857am
            if (r11 == 0) goto L_0x021e
            r15.f857am = r7
            goto L_0x024f
        L_0x021e:
            if (r9 == 0) goto L_0x024f
            android.content.res.Resources r11 = r57.getResources()     // Catch:{ NotFoundException -> 0x024e }
            int r10 = r13.getId()     // Catch:{ NotFoundException -> 0x024e }
            java.lang.String r10 = r11.getResourceName(r10)     // Catch:{ NotFoundException -> 0x024e }
            int r11 = r13.getId()     // Catch:{ NotFoundException -> 0x024e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NotFoundException -> 0x024e }
            r0.m703a(r7, r10, r11)     // Catch:{ NotFoundException -> 0x024e }
            java.lang.String r11 = "id/"
            int r11 = r10.indexOf(r11)     // Catch:{ NotFoundException -> 0x024e }
            int r11 = r11 + 3
            java.lang.String r10 = r10.substring(r11)     // Catch:{ NotFoundException -> 0x024e }
            int r11 = r13.getId()     // Catch:{ NotFoundException -> 0x024e }
            android.support.constraint.a.a.e r11 = r0.m702a(r11)     // Catch:{ NotFoundException -> 0x024e }
            r11.f976ae = r10     // Catch:{ NotFoundException -> 0x024e }
            goto L_0x024f
        L_0x024e:
        L_0x024f:
            int r10 = r13.getVisibility()
            r14.f975ad = r10
            boolean r10 = r15.f845aa
            if (r10 == 0) goto L_0x025d
            r10 = 8
            r14.f975ad = r10
        L_0x025d:
            r14.f973ab = r13
            android.support.constraint.a.a.f r10 = r0.f799b
            java.util.ArrayList<android.support.constraint.a.a.e> r11 = r10.f1069aD
            r11.add(r14)
            android.support.constraint.a.a.e r11 = r14.f953G
            if (r11 == 0) goto L_0x0271
            android.support.constraint.a.a.e r11 = r14.f953G
            android.support.constraint.a.a.o r11 = (android.support.constraint.p020a.p021a.C0347o) r11
            r11.mo772a(r14)
        L_0x0271:
            r14.f953G = r10
            boolean r10 = r15.f840W
            if (r10 == 0) goto L_0x027b
            boolean r10 = r15.f839V
            if (r10 != 0) goto L_0x0280
        L_0x027b:
            java.util.ArrayList<android.support.constraint.a.a.e> r10 = r0.f806i
            r10.add(r14)
        L_0x0280:
            boolean r10 = r15.f842Y
            if (r10 == 0) goto L_0x02cc
            android.support.constraint.a.a.g r14 = (android.support.constraint.p020a.p021a.C0337g) r14
            int r10 = r15.f853ai
            int r11 = r15.f854aj
            float r13 = r15.f855ak
            int r7 = android.os.Build.VERSION.SDK_INT
            r24 = r10
            r10 = 17
            if (r7 >= r10) goto L_0x029b
            int r10 = r15.f844a
            int r11 = r15.f858b
            float r13 = r15.f859c
            goto L_0x029d
        L_0x029b:
            r10 = r24
        L_0x029d:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x02b3
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x02b0
            r14.f1031a = r13
            r13 = -1
            r14.f1038b = r13
            r14.f1032ar = r13
            goto L_0x05e8
        L_0x02b0:
            r13 = -1
            goto L_0x05e8
        L_0x02b3:
            r13 = -1
            if (r10 == r13) goto L_0x02c0
            if (r10 < 0) goto L_0x05e8
            r14.f1031a = r7
            r14.f1038b = r10
            r14.f1032ar = r13
            goto L_0x05e8
        L_0x02c0:
            if (r11 == r13) goto L_0x05e8
            if (r11 < 0) goto L_0x05e8
            r14.f1031a = r7
            r14.f1038b = r13
            r14.f1032ar = r11
            goto L_0x05e8
        L_0x02cc:
            r13 = -1
            int r7 = r15.f860d
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f861e
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f862f
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f863g
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f873q
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f872p
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f874r
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f875s
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f864h
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f865i
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f866j
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f867k
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f868l
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f834Q
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f835R
            if (r7 != r13) goto L_0x0315
            int r7 = r15.f869m
            if (r7 != r13) goto L_0x0315
            int r7 = r15.width
            if (r7 == r13) goto L_0x0315
            int r7 = r15.height
            if (r7 != r13) goto L_0x05e8
        L_0x0315:
            int r7 = r15.f846ab
            int r10 = r15.f847ac
            int r11 = r15.f848ad
            int r13 = r15.f849ae
            r25 = r7
            int r7 = r15.f850af
            r26 = r7
            int r7 = r15.f851ag
            r27 = r7
            float r7 = r15.f852ah
            r28 = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r29 = r10
            r10 = 17
            if (r7 >= r10) goto L_0x038e
            int r7 = r15.f860d
            int r11 = r15.f861e
            int r13 = r15.f862f
            int r10 = r15.f863g
            r30 = r12
            int r12 = r15.f876t
            r31 = r12
            int r12 = r15.f878v
            r32 = r12
            float r12 = r15.f882z
            r33 = r12
            r12 = -1
            if (r7 != r12) goto L_0x035f
            if (r11 != r12) goto L_0x035f
            r34 = r7
            int r7 = r15.f873q
            if (r7 == r12) goto L_0x0357
            int r7 = r15.f873q
            goto L_0x0363
        L_0x0357:
            int r7 = r15.f872p
            if (r7 == r12) goto L_0x0361
            int r7 = r15.f872p
            r11 = r7
            goto L_0x0361
        L_0x035f:
            r34 = r7
        L_0x0361:
            r7 = r34
        L_0x0363:
            if (r13 != r12) goto L_0x0381
            if (r10 != r12) goto L_0x0381
            r35 = r7
            int r7 = r15.f874r
            if (r7 == r12) goto L_0x0375
            int r7 = r15.f874r
            r36 = r3
            r37 = r4
            r13 = r7
            goto L_0x0387
        L_0x0375:
            int r7 = r15.f875s
            if (r7 == r12) goto L_0x0383
            int r7 = r15.f875s
            r36 = r3
            r37 = r4
            r10 = r7
            goto L_0x0387
        L_0x0381:
            r35 = r7
        L_0x0383:
            r36 = r3
            r37 = r4
        L_0x0387:
            r23 = r31
            r3 = r33
            r7 = r35
            goto L_0x03a1
        L_0x038e:
            r30 = r12
            r12 = -1
            r36 = r3
            r37 = r4
            r10 = r13
            r7 = r25
            r23 = r26
            r32 = r27
            r3 = r28
            r13 = r11
            r11 = r29
        L_0x03a1:
            int r4 = r15.f869m
            if (r4 == r12) goto L_0x03c2
            int r3 = r15.f869m
            android.support.constraint.a.a.e r20 = r0.m702a(r3)
            if (r20 == 0) goto L_0x050f
            float r3 = r15.f871o
            int r4 = r15.f870n
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.CENTER
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.CENTER
            r23 = 0
            r18 = r14
            r22 = r4
            r18.mo713a(r19, r20, r21, r22, r23)
            r14.f1007u = r3
            goto L_0x050f
        L_0x03c2:
            r4 = -1
            if (r7 == r4) goto L_0x03da
            android.support.constraint.a.a.e r20 = r0.m702a(r7)
            if (r20 == 0) goto L_0x03d8
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            int r4 = r15.leftMargin
            r18 = r14
            r22 = r4
            r18.mo713a(r19, r20, r21, r22, r23)
        L_0x03d8:
            r4 = -1
            goto L_0x03f0
        L_0x03da:
            if (r11 == r4) goto L_0x03f0
            android.support.constraint.a.a.e r20 = r0.m702a(r11)
            if (r20 == 0) goto L_0x03d8
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            int r4 = r15.leftMargin
            r18 = r14
            r22 = r4
            r18.mo713a(r19, r20, r21, r22, r23)
            goto L_0x03d8
        L_0x03f0:
            if (r13 == r4) goto L_0x0408
            android.support.constraint.a.a.e r20 = r0.m702a(r13)
            if (r20 == 0) goto L_0x041f
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            int r4 = r15.rightMargin
            r18 = r14
            r22 = r4
            r23 = r32
            r18.mo713a(r19, r20, r21, r22, r23)
            goto L_0x041f
        L_0x0408:
            if (r10 == r4) goto L_0x041f
            android.support.constraint.a.a.e r20 = r0.m702a(r10)
            if (r20 == 0) goto L_0x041f
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            int r4 = r15.rightMargin
            r18 = r14
            r22 = r4
            r23 = r32
            r18.mo713a(r19, r20, r21, r22, r23)
        L_0x041f:
            int r4 = r15.f864h
            r7 = -1
            if (r4 == r7) goto L_0x043e
            int r4 = r15.f864h
            android.support.constraint.a.a.e r20 = r0.m702a(r4)
            if (r20 == 0) goto L_0x045c
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            int r4 = r15.topMargin
            int r7 = r15.f877u
            r18 = r14
            r22 = r4
            r23 = r7
            r18.mo713a(r19, r20, r21, r22, r23)
            goto L_0x045c
        L_0x043e:
            int r4 = r15.f865i
            r7 = -1
            if (r4 == r7) goto L_0x045c
            int r4 = r15.f865i
            android.support.constraint.a.a.e r20 = r0.m702a(r4)
            if (r20 == 0) goto L_0x045c
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            int r4 = r15.topMargin
            int r7 = r15.f877u
            r18 = r14
            r22 = r4
            r23 = r7
            r18.mo713a(r19, r20, r21, r22, r23)
        L_0x045c:
            int r4 = r15.f866j
            r7 = -1
            if (r4 == r7) goto L_0x047b
            int r4 = r15.f866j
            android.support.constraint.a.a.e r20 = r0.m702a(r4)
            if (r20 == 0) goto L_0x0499
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            int r4 = r15.bottomMargin
            int r7 = r15.f879w
            r18 = r14
            r22 = r4
            r23 = r7
            r18.mo713a(r19, r20, r21, r22, r23)
            goto L_0x0499
        L_0x047b:
            int r4 = r15.f867k
            r7 = -1
            if (r4 == r7) goto L_0x0499
            int r4 = r15.f867k
            android.support.constraint.a.a.e r20 = r0.m702a(r4)
            if (r20 == 0) goto L_0x0499
            android.support.constraint.a.a.d$c r19 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d$c r21 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            int r4 = r15.bottomMargin
            int r7 = r15.f879w
            r18 = r14
            r22 = r4
            r23 = r7
            r18.mo713a(r19, r20, r21, r22, r23)
        L_0x0499:
            int r4 = r15.f868l
            r7 = -1
            if (r4 == r7) goto L_0x04f0
            android.util.SparseArray<android.view.View> r4 = r0.f798a
            int r7 = r15.f868l
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r7 = r15.f868l
            android.support.constraint.a.a.e r7 = r0.m702a(r7)
            if (r7 == 0) goto L_0x04f0
            if (r4 == 0) goto L_0x04f0
            android.view.ViewGroup$LayoutParams r10 = r4.getLayoutParams()
            boolean r10 = r10 instanceof android.support.constraint.ConstraintLayout.LayoutParams
            if (r10 == 0) goto L_0x04f0
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r4 = (android.support.constraint.ConstraintLayout.LayoutParams) r4
            r10 = 1
            r15.f841X = r10
            r4.f841X = r10
            android.support.constraint.a.a.d$c r4 = android.support.constraint.p020a.p021a.C0328d.C0332c.BASELINE
            android.support.constraint.a.a.d r38 = r14.mo711a(r4)
            android.support.constraint.a.a.d$c r4 = android.support.constraint.p020a.p021a.C0328d.C0332c.BASELINE
            android.support.constraint.a.a.d r39 = r7.mo711a(r4)
            r40 = 0
            r41 = -1
            android.support.constraint.a.a.d$b r42 = android.support.constraint.p020a.p021a.C0328d.C0331b.STRONG
            r43 = 0
            r44 = 1
            r38.mo707a(r39, r40, r41, r42, r43, r44)
            android.support.constraint.a.a.d$c r4 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r4 = r14.mo711a(r4)
            r4.mo708b()
            android.support.constraint.a.a.d$c r4 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r4 = r14.mo711a(r4)
            r4.mo708b()
        L_0x04f0:
            r4 = 0
            int r7 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x04fd
            r7 = 1056964608(0x3f000000, float:0.5)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x04fd
            r14.f971Z = r3
        L_0x04fd:
            float r3 = r15.f818A
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x050f
            float r3 = r15.f818A
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x050f
            float r3 = r15.f818A
            r14.f972aa = r3
        L_0x050f:
            if (r9 == 0) goto L_0x0522
            int r3 = r15.f834Q
            r4 = -1
            if (r3 != r4) goto L_0x051a
            int r3 = r15.f835R
            if (r3 == r4) goto L_0x0522
        L_0x051a:
            int r3 = r15.f834Q
            int r4 = r15.f835R
            r14.f958L = r3
            r14.f959M = r4
        L_0x0522:
            boolean r3 = r15.f839V
            if (r3 != 0) goto L_0x054f
            int r3 = r15.width
            r4 = -1
            if (r3 != r4) goto L_0x0545
            android.support.constraint.a.a.e$a r3 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_PARENT
            r14.mo714a(r3)
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d r3 = r14.mo711a(r3)
            int r4 = r15.leftMargin
            r3.f936e = r4
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r3 = r14.mo711a(r3)
            int r4 = r15.rightMargin
            r3.f936e = r4
            goto L_0x0559
        L_0x0545:
            android.support.constraint.a.a.e$a r3 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            r14.mo714a(r3)
            r3 = 0
            r14.mo717b(r3)
            goto L_0x0559
        L_0x054f:
            android.support.constraint.a.a.e$a r3 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r14.mo714a(r3)
            int r3 = r15.width
            r14.mo717b(r3)
        L_0x0559:
            boolean r3 = r15.f840W
            if (r3 != 0) goto L_0x0586
            int r3 = r15.height
            r4 = -1
            if (r3 != r4) goto L_0x057c
            android.support.constraint.a.a.e$a r3 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_PARENT
            r14.mo718b(r3)
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r3 = r14.mo711a(r3)
            int r4 = r15.topMargin
            r3.f936e = r4
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r3 = r14.mo711a(r3)
            int r4 = r15.bottomMargin
            r3.f936e = r4
            goto L_0x0590
        L_0x057c:
            android.support.constraint.a.a.e$a r3 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            r14.mo718b(r3)
            r3 = 0
            r14.mo720c(r3)
            goto L_0x0590
        L_0x0586:
            android.support.constraint.a.a.e$a r3 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r14.mo718b(r3)
            int r3 = r15.height
            r14.mo720c(r3)
        L_0x0590:
            java.lang.String r3 = r15.f819B
            if (r3 == 0) goto L_0x0599
            java.lang.String r3 = r15.f819B
            r14.mo716a(r3)
        L_0x0599:
            float r3 = r15.f822E
            float[] r4 = r14.f984am
            r7 = 0
            r4[r7] = r3
            float r3 = r15.f823F
            float[] r4 = r14.f984am
            r7 = 1
            r4[r7] = r3
            int r3 = r15.f824G
            r14.f980ai = r3
            int r3 = r15.f825H
            r14.f981aj = r3
            int r3 = r15.f826I
            int r4 = r15.f828K
            int r7 = r15.f830M
            float r10 = r15.f832O
            r14.f993g = r3
            r14.f996j = r4
            r14.f997k = r7
            r14.f998l = r10
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x05cc
            int r4 = r14.f993g
            if (r4 != 0) goto L_0x05cc
            r4 = 2
            r14.f993g = r4
        L_0x05cc:
            int r4 = r15.f827J
            int r7 = r15.f829L
            int r10 = r15.f831N
            float r11 = r15.f833P
            r14.f994h = r4
            r14.f999m = r7
            r14.f1000n = r10
            r14.f1001o = r11
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x05ee
            int r3 = r14.f994h
            if (r3 != 0) goto L_0x05ee
            r3 = 2
            r14.f994h = r3
            goto L_0x05ee
        L_0x05e8:
            r36 = r3
            r37 = r4
            r30 = r12
        L_0x05ee:
            int r8 = r8 + 1
            r12 = r30
            r3 = r36
            r4 = r37
            r7 = 0
            r11 = -1
            goto L_0x0202
        L_0x05fa:
            r36 = r3
            r37 = r4
            int r3 = r0.f812o
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0607
            r3 = 1
            goto L_0x0608
        L_0x0607:
            r3 = 0
        L_0x0608:
            r4 = -2
            if (r3 == 0) goto L_0x08cc
            android.support.constraint.a.a.f r9 = r0.f799b
            r9.mo750z()
            int r10 = r9.f1029az
            r9.mo699a(r10)
            android.support.constraint.a.a.f r9 = r0.f799b
            r9.mo746b(r5, r6)
            int r9 = r57.getPaddingTop()
            int r10 = r57.getPaddingBottom()
            int r9 = r9 + r10
            int r10 = r57.getPaddingLeft()
            int r11 = r57.getPaddingRight()
            int r10 = r10 + r11
            int r11 = r57.getChildCount()
            r12 = 0
        L_0x0631:
            if (r12 >= r11) goto L_0x06f8
            android.view.View r13 = r0.getChildAt(r12)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x06eb
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r14 = (android.support.constraint.ConstraintLayout.LayoutParams) r14
            android.support.constraint.a.a.e r15 = r14.f856al
            boolean r7 = r14.f842Y
            if (r7 != 0) goto L_0x06eb
            boolean r7 = r14.f843Z
            if (r7 != 0) goto L_0x06eb
            int r7 = r13.getVisibility()
            r15.f975ad = r7
            int r7 = r14.width
            int r8 = r14.height
            if (r7 == 0) goto L_0x06d8
            if (r8 != 0) goto L_0x065f
            goto L_0x06d8
        L_0x065f:
            if (r7 != r4) goto L_0x0666
            r45 = r6
            r16 = 1
            goto L_0x066a
        L_0x0666:
            r45 = r6
            r16 = 0
        L_0x066a:
            int r6 = getChildMeasureSpec(r1, r10, r7)
            if (r8 != r4) goto L_0x0673
            r18 = 1
            goto L_0x0675
        L_0x0673:
            r18 = 0
        L_0x0675:
            int r4 = getChildMeasureSpec(r2, r9, r8)
            r13.measure(r6, r4)
            android.support.constraint.a.f r4 = r0.f817t
            if (r4 == 0) goto L_0x068d
            android.support.constraint.a.f r4 = r0.f817t
            r46 = r5
            long r5 = r4.f1100a
            r19 = 1
            long r5 = r5 + r19
            r4.f1100a = r5
            goto L_0x068f
        L_0x068d:
            r46 = r5
        L_0x068f:
            r4 = -2
            if (r7 != r4) goto L_0x0694
            r5 = 1
            goto L_0x0695
        L_0x0694:
            r5 = 0
        L_0x0695:
            r15.f1002p = r5
            if (r8 != r4) goto L_0x069b
            r4 = 1
            goto L_0x069c
        L_0x069b:
            r4 = 0
        L_0x069c:
            r15.f1003q = r4
            int r4 = r13.getMeasuredWidth()
            int r5 = r13.getMeasuredHeight()
            r15.mo717b(r4)
            r15.mo720c(r5)
            if (r16 == 0) goto L_0x06b0
            r15.f969W = r4
        L_0x06b0:
            if (r18 == 0) goto L_0x06b4
            r15.f970X = r5
        L_0x06b4:
            boolean r6 = r14.f841X
            if (r6 == 0) goto L_0x06c1
            int r6 = r13.getBaseline()
            r7 = -1
            if (r6 == r7) goto L_0x06c1
            r15.f966T = r6
        L_0x06c1:
            boolean r6 = r14.f839V
            if (r6 == 0) goto L_0x06ef
            boolean r6 = r14.f840W
            if (r6 == 0) goto L_0x06ef
            android.support.constraint.a.a.l r6 = r15.mo728h()
            r6.mo764a(r4)
            android.support.constraint.a.a.l r4 = r15.mo729i()
            r4.mo764a(r5)
            goto L_0x06ef
        L_0x06d8:
            r46 = r5
            r45 = r6
            android.support.constraint.a.a.l r4 = r15.mo728h()
            r4.mo767d()
            android.support.constraint.a.a.l r4 = r15.mo729i()
            r4.mo767d()
            goto L_0x06ef
        L_0x06eb:
            r46 = r5
            r45 = r6
        L_0x06ef:
            int r12 = r12 + 1
            r6 = r45
            r5 = r46
            r4 = -2
            goto L_0x0631
        L_0x06f8:
            r46 = r5
            r45 = r6
            android.support.constraint.a.a.f r4 = r0.f799b
            r4.mo749y()
            r4 = 0
        L_0x0702:
            if (r4 >= r11) goto L_0x08c7
            android.view.View r5 = r0.getChildAt(r4)
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x08b3
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r6 = (android.support.constraint.ConstraintLayout.LayoutParams) r6
            android.support.constraint.a.a.e r7 = r6.f856al
            boolean r8 = r6.f842Y
            if (r8 != 0) goto L_0x08b3
            boolean r8 = r6.f843Z
            if (r8 != 0) goto L_0x08b3
            int r8 = r5.getVisibility()
            r7.f975ad = r8
            int r8 = r6.width
            int r12 = r6.height
            if (r8 == 0) goto L_0x072e
            if (r12 != 0) goto L_0x08b3
        L_0x072e:
            android.support.constraint.a.a.d$c r13 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d r13 = r7.mo711a(r13)
            android.support.constraint.a.a.k r13 = r13.f932a
            android.support.constraint.a.a.d$c r14 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r14 = r7.mo711a(r14)
            android.support.constraint.a.a.k r14 = r14.f932a
            android.support.constraint.a.a.d$c r15 = android.support.constraint.p020a.p021a.C0328d.C0332c.LEFT
            android.support.constraint.a.a.d r15 = r7.mo711a(r15)
            android.support.constraint.a.a.d r15 = r15.f935d
            if (r15 == 0) goto L_0x0756
            android.support.constraint.a.a.d$c r15 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r15 = r7.mo711a(r15)
            android.support.constraint.a.a.d r15 = r15.f935d
            if (r15 == 0) goto L_0x0756
            r47 = r11
            r15 = 1
            goto L_0x0759
        L_0x0756:
            r47 = r11
            r15 = 0
        L_0x0759:
            android.support.constraint.a.a.d$c r11 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r11 = r7.mo711a(r11)
            android.support.constraint.a.a.k r11 = r11.f932a
            r48 = r3
            android.support.constraint.a.a.d$c r3 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r3 = r7.mo711a(r3)
            android.support.constraint.a.a.k r3 = r3.f932a
            r49 = r4
            android.support.constraint.a.a.d$c r4 = android.support.constraint.p020a.p021a.C0328d.C0332c.TOP
            android.support.constraint.a.a.d r4 = r7.mo711a(r4)
            android.support.constraint.a.a.d r4 = r4.f935d
            if (r4 == 0) goto L_0x0783
            android.support.constraint.a.a.d$c r4 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r4 = r7.mo711a(r4)
            android.support.constraint.a.a.d r4 = r4.f935d
            if (r4 == 0) goto L_0x0783
            r4 = 1
            goto L_0x0784
        L_0x0783:
            r4 = 0
        L_0x0784:
            if (r8 != 0) goto L_0x078c
            if (r12 != 0) goto L_0x078c
            if (r15 == 0) goto L_0x078c
            if (r4 != 0) goto L_0x08b9
        L_0x078c:
            r50 = r6
            android.support.constraint.a.a.f r6 = r0.f799b
            android.support.constraint.a.a.e$a r6 = r6.mo743v()
            r51 = r5
            android.support.constraint.a.a.e$a r5 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r6 == r5) goto L_0x079c
            r5 = 1
            goto L_0x079d
        L_0x079c:
            r5 = 0
        L_0x079d:
            android.support.constraint.a.a.f r6 = r0.f799b
            android.support.constraint.a.a.e$a r6 = r6.mo744w()
            android.support.constraint.a.a.e$a r0 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r6 == r0) goto L_0x07a9
            r0 = 1
            goto L_0x07aa
        L_0x07a9:
            r0 = 0
        L_0x07aa:
            if (r5 != 0) goto L_0x07b3
            android.support.constraint.a.a.l r6 = r7.mo728h()
            r6.mo767d()
        L_0x07b3:
            if (r0 != 0) goto L_0x07bc
            android.support.constraint.a.a.l r6 = r7.mo729i()
            r6.mo767d()
        L_0x07bc:
            if (r8 != 0) goto L_0x07eb
            if (r5 == 0) goto L_0x07e2
            boolean r6 = r7.mo723d()
            if (r6 == 0) goto L_0x07e2
            if (r15 == 0) goto L_0x07e2
            boolean r6 = r13.mo769f()
            if (r6 == 0) goto L_0x07e2
            boolean r6 = r14.mo769f()
            if (r6 == 0) goto L_0x07e2
            float r6 = r14.f1048f
            float r8 = r13.f1048f
            float r6 = r6 - r8
            int r8 = (int) r6
            android.support.constraint.a.a.l r6 = r7.mo728h()
            r6.mo764a(r8)
            goto L_0x07fa
        L_0x07e2:
            r6 = -2
            int r5 = getChildMeasureSpec(r1, r10, r6)
            r13 = r5
            r5 = 0
            r6 = 1
            goto L_0x07ff
        L_0x07eb:
            r6 = -2
            r13 = -1
            if (r8 != r13) goto L_0x07f6
            int r14 = getChildMeasureSpec(r1, r10, r13)
            r13 = r14
            r6 = 0
            goto L_0x07ff
        L_0x07f6:
            if (r8 != r6) goto L_0x07fa
            r6 = 1
            goto L_0x07fb
        L_0x07fa:
            r6 = 0
        L_0x07fb:
            int r13 = getChildMeasureSpec(r1, r10, r8)
        L_0x07ff:
            if (r12 != 0) goto L_0x0830
            if (r0 == 0) goto L_0x0825
            boolean r14 = r7.mo725e()
            if (r14 == 0) goto L_0x0825
            if (r4 == 0) goto L_0x0825
            boolean r4 = r11.mo769f()
            if (r4 == 0) goto L_0x0825
            boolean r4 = r3.mo769f()
            if (r4 == 0) goto L_0x0825
            float r3 = r3.f1048f
            float r4 = r11.f1048f
            float r3 = r3 - r4
            int r12 = (int) r3
            android.support.constraint.a.a.l r3 = r7.mo729i()
            r3.mo764a(r12)
            goto L_0x0842
        L_0x0825:
            r3 = -2
            int r0 = getChildMeasureSpec(r2, r9, r3)
            r4 = r0
            r0 = r51
            r3 = 1
            r11 = 0
            goto L_0x0848
        L_0x0830:
            r3 = -2
            r4 = -1
            if (r12 != r4) goto L_0x083e
            int r11 = getChildMeasureSpec(r2, r9, r4)
            r4 = r11
            r3 = 0
        L_0x083a:
            r11 = r0
            r0 = r51
            goto L_0x0848
        L_0x083e:
            if (r12 != r3) goto L_0x0842
            r3 = 1
            goto L_0x0843
        L_0x0842:
            r3 = 0
        L_0x0843:
            int r4 = getChildMeasureSpec(r2, r9, r12)
            goto L_0x083a
        L_0x0848:
            r0.measure(r13, r4)
            r4 = r57
            android.support.constraint.a.f r13 = r4.f817t
            if (r13 == 0) goto L_0x085b
            android.support.constraint.a.f r13 = r4.f817t
            long r14 = r13.f1100a
            r18 = 1
            long r14 = r14 + r18
            r13.f1100a = r14
        L_0x085b:
            r13 = -2
            if (r8 != r13) goto L_0x0860
            r8 = 1
            goto L_0x0861
        L_0x0860:
            r8 = 0
        L_0x0861:
            r7.f1002p = r8
            if (r12 != r13) goto L_0x0867
            r8 = 1
            goto L_0x0868
        L_0x0867:
            r8 = 0
        L_0x0868:
            r7.f1003q = r8
            int r8 = r0.getMeasuredWidth()
            int r12 = r0.getMeasuredHeight()
            r7.mo717b(r8)
            r7.mo720c(r12)
            if (r6 == 0) goto L_0x087c
            r7.f969W = r8
        L_0x087c:
            if (r3 == 0) goto L_0x0880
            r7.f970X = r12
        L_0x0880:
            if (r5 == 0) goto L_0x088a
            android.support.constraint.a.a.l r3 = r7.mo728h()
            r3.mo764a(r8)
            goto L_0x0891
        L_0x088a:
            android.support.constraint.a.a.l r3 = r7.mo728h()
            r3.mo765c()
        L_0x0891:
            if (r11 == 0) goto L_0x089d
            android.support.constraint.a.a.l r3 = r7.mo729i()
            r3.mo764a(r12)
        L_0x089a:
            r6 = r50
            goto L_0x08a5
        L_0x089d:
            android.support.constraint.a.a.l r3 = r7.mo729i()
            r3.mo765c()
            goto L_0x089a
        L_0x08a5:
            boolean r3 = r6.f841X
            if (r3 == 0) goto L_0x08ba
            int r0 = r0.getBaseline()
            r3 = -1
            if (r0 == r3) goto L_0x08ba
            r7.f966T = r0
            goto L_0x08ba
        L_0x08b3:
            r48 = r3
            r49 = r4
            r47 = r11
        L_0x08b9:
            r4 = r0
        L_0x08ba:
            int r0 = r49 + 1
            r11 = r47
            r3 = r48
            r56 = r4
            r4 = r0
            r0 = r56
            goto L_0x0702
        L_0x08c7:
            r4 = r0
            r48 = r3
            goto L_0x09d6
        L_0x08cc:
            r4 = r0
            r48 = r3
            r46 = r5
            r45 = r6
            int r0 = r57.getPaddingTop()
            int r3 = r57.getPaddingBottom()
            int r0 = r0 + r3
            int r3 = r57.getPaddingLeft()
            int r5 = r57.getPaddingRight()
            int r3 = r3 + r5
            int r5 = r57.getChildCount()
            r6 = 0
        L_0x08ea:
            if (r6 >= r5) goto L_0x09d6
            android.view.View r7 = r4.getChildAt(r6)
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 == r9) goto L_0x09d1
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r8 = (android.support.constraint.ConstraintLayout.LayoutParams) r8
            android.support.constraint.a.a.e r9 = r8.f856al
            boolean r10 = r8.f842Y
            if (r10 != 0) goto L_0x09d1
            boolean r10 = r8.f843Z
            if (r10 != 0) goto L_0x09d1
            int r10 = r7.getVisibility()
            r9.f975ad = r10
            int r10 = r8.width
            int r11 = r8.height
            boolean r12 = r8.f839V
            if (r12 != 0) goto L_0x0939
            boolean r12 = r8.f840W
            if (r12 != 0) goto L_0x0939
            boolean r12 = r8.f839V
            if (r12 != 0) goto L_0x0924
            int r12 = r8.f826I
            r15 = 1
            if (r12 == r15) goto L_0x093a
            goto L_0x0925
        L_0x0924:
            r15 = 1
        L_0x0925:
            int r12 = r8.width
            r13 = -1
            if (r12 == r13) goto L_0x093a
            boolean r12 = r8.f840W
            if (r12 != 0) goto L_0x0937
            int r12 = r8.f827J
            if (r12 == r15) goto L_0x093a
            int r12 = r8.height
            if (r12 != r13) goto L_0x0937
            goto L_0x093a
        L_0x0937:
            r12 = 0
            goto L_0x093b
        L_0x0939:
            r15 = 1
        L_0x093a:
            r12 = 1
        L_0x093b:
            if (r12 == 0) goto L_0x09b1
            if (r10 != 0) goto L_0x0949
            r12 = -2
            int r13 = getChildMeasureSpec(r1, r3, r12)
            r14 = r13
            r13 = -1
            r16 = 1
            goto L_0x0963
        L_0x0949:
            r12 = -2
            r13 = -1
            if (r10 != r13) goto L_0x0954
            int r14 = getChildMeasureSpec(r1, r3, r13)
            r16 = 0
            goto L_0x0963
        L_0x0954:
            if (r10 != r12) goto L_0x0958
            r14 = 1
            goto L_0x0959
        L_0x0958:
            r14 = 0
        L_0x0959:
            int r16 = getChildMeasureSpec(r1, r3, r10)
            r56 = r16
            r16 = r14
            r14 = r56
        L_0x0963:
            if (r11 != 0) goto L_0x096d
            int r17 = getChildMeasureSpec(r2, r0, r12)
            r12 = r17
            r13 = 1
            goto L_0x0983
        L_0x096d:
            if (r11 != r13) goto L_0x0977
            int r17 = getChildMeasureSpec(r2, r0, r13)
            r12 = r17
            r13 = 0
            goto L_0x0983
        L_0x0977:
            if (r11 != r12) goto L_0x097b
            r12 = 1
            goto L_0x097c
        L_0x097b:
            r12 = 0
        L_0x097c:
            int r17 = getChildMeasureSpec(r2, r0, r11)
            r13 = r12
            r12 = r17
        L_0x0983:
            r7.measure(r14, r12)
            android.support.constraint.a.f r12 = r4.f817t
            if (r12 == 0) goto L_0x0997
            android.support.constraint.a.f r12 = r4.f817t
            r52 = r13
            long r13 = r12.f1100a
            r18 = 1
            long r13 = r13 + r18
            r12.f1100a = r13
            goto L_0x0999
        L_0x0997:
            r52 = r13
        L_0x0999:
            r12 = -2
            if (r10 != r12) goto L_0x099e
            r10 = 1
            goto L_0x099f
        L_0x099e:
            r10 = 0
        L_0x099f:
            r9.f1002p = r10
            if (r11 != r12) goto L_0x09a5
            r10 = 1
            goto L_0x09a6
        L_0x09a5:
            r10 = 0
        L_0x09a6:
            r9.f1003q = r10
            int r10 = r7.getMeasuredWidth()
            int r11 = r7.getMeasuredHeight()
            goto L_0x09b5
        L_0x09b1:
            r16 = 0
            r52 = 0
        L_0x09b5:
            r9.mo717b(r10)
            r9.mo720c(r11)
            if (r16 == 0) goto L_0x09bf
            r9.f969W = r10
        L_0x09bf:
            if (r52 == 0) goto L_0x09c3
            r9.f970X = r11
        L_0x09c3:
            boolean r8 = r8.f841X
            if (r8 == 0) goto L_0x09d2
            int r7 = r7.getBaseline()
            r8 = -1
            if (r7 == r8) goto L_0x09d2
            r9.f966T = r7
            goto L_0x09d2
        L_0x09d1:
            r15 = 1
        L_0x09d2:
            int r6 = r6 + 1
            goto L_0x08ea
        L_0x09d6:
            r15 = 1
            int r0 = r57.getChildCount()
            r3 = 0
        L_0x09dc:
            if (r3 >= r0) goto L_0x0a20
            android.view.View r5 = r4.getChildAt(r3)
            boolean r6 = r5 instanceof android.support.constraint.C0362c
            if (r6 == 0) goto L_0x0a1c
            android.support.constraint.c r5 = (android.support.constraint.C0362c) r5
            android.view.View r6 = r5.f1220b
            if (r6 == 0) goto L_0x0a1c
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r6 = (android.support.constraint.ConstraintLayout.LayoutParams) r6
            android.view.View r5 = r5.f1220b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r5 = (android.support.constraint.ConstraintLayout.LayoutParams) r5
            android.support.constraint.a.a.e r7 = r5.f856al
            r10 = 0
            r7.f975ad = r10
            android.support.constraint.a.a.e r7 = r6.f856al
            android.support.constraint.a.a.e r8 = r5.f856al
            int r8 = r8.mo730j()
            r7.mo717b(r8)
            android.support.constraint.a.a.e r6 = r6.f856al
            android.support.constraint.a.a.e r7 = r5.f856al
            int r7 = r7.mo731k()
            r6.mo720c(r7)
            android.support.constraint.a.a.e r5 = r5.f856al
            r6 = 8
            r5.f975ad = r6
            goto L_0x0a1d
        L_0x0a1c:
            r10 = 0
        L_0x0a1d:
            int r3 = r3 + 1
            goto L_0x09dc
        L_0x0a20:
            r10 = 0
            java.util.ArrayList<android.support.constraint.ConstraintHelper> r0 = r4.f805h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0a34
            r3 = 0
        L_0x0a2a:
            if (r3 >= r0) goto L_0x0a34
            java.util.ArrayList<android.support.constraint.ConstraintHelper> r5 = r4.f805h
            r5.get(r3)
            int r3 = r3 + 1
            goto L_0x0a2a
        L_0x0a34:
            int r0 = r57.getChildCount()
            if (r0 <= 0) goto L_0x0a3f
            java.lang.String r0 = "First pass"
            r4.mo91954a(r0)
        L_0x0a3f:
            java.util.ArrayList<android.support.constraint.a.a.e> r0 = r4.f806i
            int r0 = r0.size()
            int r3 = r57.getPaddingBottom()
            int r3 = r37 + r3
            int r5 = r57.getPaddingRight()
            int r5 = r36 + r5
            if (r0 <= 0) goto L_0x0c52
            android.support.constraint.a.a.f r7 = r4.f799b
            android.support.constraint.a.a.e$a r7 = r7.mo743v()
            android.support.constraint.a.a.e$a r8 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r7 != r8) goto L_0x0a5f
            r7 = 1
            goto L_0x0a60
        L_0x0a5f:
            r7 = 0
        L_0x0a60:
            android.support.constraint.a.a.f r8 = r4.f799b
            android.support.constraint.a.a.e$a r8 = r8.mo744w()
            android.support.constraint.a.a.e$a r9 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r8 != r9) goto L_0x0a6c
            r8 = 1
            goto L_0x0a6d
        L_0x0a6c:
            r8 = 0
        L_0x0a6d:
            android.support.constraint.a.a.f r9 = r4.f799b
            int r9 = r9.mo730j()
            int r11 = r4.f807j
            int r9 = java.lang.Math.max(r9, r11)
            android.support.constraint.a.a.f r11 = r4.f799b
            int r11 = r11.mo731k()
            int r12 = r4.f808k
            int r11 = java.lang.Math.max(r11, r12)
            r12 = r9
            r13 = r11
            r9 = 0
            r11 = 0
            r14 = 0
        L_0x0a8a:
            if (r9 >= r0) goto L_0x0bb0
            java.util.ArrayList<android.support.constraint.a.a.e> r10 = r4.f806i
            java.lang.Object r10 = r10.get(r9)
            android.support.constraint.a.a.e r10 = (android.support.constraint.p020a.p021a.C0333e) r10
            java.lang.Object r15 = r10.f973ab
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto L_0x0b9d
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            r6 = r16
            android.support.constraint.ConstraintLayout$LayoutParams r6 = (android.support.constraint.ConstraintLayout.LayoutParams) r6
            r54 = r0
            boolean r0 = r6.f843Z
            if (r0 != 0) goto L_0x0b9f
            boolean r0 = r6.f842Y
            if (r0 != 0) goto L_0x0b9f
            int r0 = r15.getVisibility()
            r55 = r11
            r11 = 8
            if (r0 == r11) goto L_0x0ba1
            if (r48 == 0) goto L_0x0acc
            android.support.constraint.a.a.l r0 = r10.mo728h()
            boolean r0 = r0.mo769f()
            if (r0 == 0) goto L_0x0acc
            android.support.constraint.a.a.l r0 = r10.mo729i()
            boolean r0 = r0.mo769f()
            if (r0 != 0) goto L_0x0ba1
        L_0x0acc:
            int r0 = r6.width
            r11 = -2
            if (r0 != r11) goto L_0x0adc
            boolean r0 = r6.f839V
            if (r0 == 0) goto L_0x0adc
            int r0 = r6.width
            int r0 = getChildMeasureSpec(r1, r5, r0)
            goto L_0x0ae6
        L_0x0adc:
            int r0 = r10.mo730j()
            r11 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r11)
        L_0x0ae6:
            int r11 = r6.height
            r1 = -2
            if (r11 != r1) goto L_0x0af6
            boolean r11 = r6.f840W
            if (r11 == 0) goto L_0x0af6
            int r11 = r6.height
            int r11 = getChildMeasureSpec(r2, r3, r11)
            goto L_0x0b00
        L_0x0af6:
            int r11 = r10.mo731k()
            r1 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
        L_0x0b00:
            r15.measure(r0, r11)
            android.support.constraint.a.f r0 = r4.f817t
            if (r0 == 0) goto L_0x0b11
            android.support.constraint.a.f r0 = r4.f817t
            long r1 = r0.f1101b
            r16 = 1
            long r1 = r1 + r16
            r0.f1101b = r1
        L_0x0b11:
            int r0 = r15.getMeasuredWidth()
            int r1 = r15.getMeasuredHeight()
            int r2 = r10.mo730j()
            if (r0 == r2) goto L_0x0b49
            r10.mo717b(r0)
            if (r48 == 0) goto L_0x0b2b
            android.support.constraint.a.a.l r2 = r10.mo728h()
            r2.mo764a(r0)
        L_0x0b2b:
            if (r7 == 0) goto L_0x0b47
            int r0 = r10.mo736p()
            if (r0 <= r12) goto L_0x0b47
            int r0 = r10.mo736p()
            android.support.constraint.a.a.d$c r2 = android.support.constraint.p020a.p021a.C0328d.C0332c.RIGHT
            android.support.constraint.a.a.d r2 = r10.mo711a(r2)
            int r2 = r2.mo705a()
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r12, r0)
            r12 = r0
        L_0x0b47:
            r55 = 1
        L_0x0b49:
            int r0 = r10.mo731k()
            if (r1 == r0) goto L_0x0b79
            r10.mo720c(r1)
            if (r48 == 0) goto L_0x0b5b
            android.support.constraint.a.a.l r0 = r10.mo729i()
            r0.mo764a(r1)
        L_0x0b5b:
            if (r8 == 0) goto L_0x0b77
            int r0 = r10.mo737q()
            if (r0 <= r13) goto L_0x0b77
            int r0 = r10.mo737q()
            android.support.constraint.a.a.d$c r1 = android.support.constraint.p020a.p021a.C0328d.C0332c.BOTTOM
            android.support.constraint.a.a.d r1 = r10.mo711a(r1)
            int r1 = r1.mo705a()
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r13, r0)
            r13 = r0
        L_0x0b77:
            r55 = 1
        L_0x0b79:
            boolean r0 = r6.f841X
            if (r0 == 0) goto L_0x0b8d
            int r0 = r15.getBaseline()
            r1 = -1
            if (r0 == r1) goto L_0x0b8e
            int r2 = r10.f966T
            if (r0 == r2) goto L_0x0b8e
            r10.f966T = r0
            r55 = 1
            goto L_0x0b8e
        L_0x0b8d:
            r1 = -1
        L_0x0b8e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            if (r0 < r2) goto L_0x0ba2
            int r0 = r15.getMeasuredState()
            int r14 = combineMeasuredStates(r14, r0)
            goto L_0x0ba2
        L_0x0b9d:
            r54 = r0
        L_0x0b9f:
            r55 = r11
        L_0x0ba1:
            r1 = -1
        L_0x0ba2:
            r11 = r55
            int r9 = r9 + 1
            r0 = r54
            r1 = r58
            r2 = r59
            r10 = 0
            r15 = 1
            goto L_0x0a8a
        L_0x0bb0:
            r54 = r0
            r55 = r11
            if (r55 == 0) goto L_0x0bf9
            android.support.constraint.a.a.f r0 = r4.f799b
            r1 = r46
            r0.mo717b(r1)
            android.support.constraint.a.a.f r0 = r4.f799b
            r1 = r45
            r0.mo720c(r1)
            if (r48 == 0) goto L_0x0bcb
            android.support.constraint.a.a.f r0 = r4.f799b
            r0.mo749y()
        L_0x0bcb:
            java.lang.String r0 = "2nd pass"
            r4.mo91954a(r0)
            android.support.constraint.a.a.f r0 = r4.f799b
            int r0 = r0.mo730j()
            if (r0 >= r12) goto L_0x0bdf
            android.support.constraint.a.a.f r0 = r4.f799b
            r0.mo717b(r12)
            r8 = 1
            goto L_0x0be0
        L_0x0bdf:
            r8 = 0
        L_0x0be0:
            android.support.constraint.a.a.f r0 = r4.f799b
            int r0 = r0.mo731k()
            if (r0 >= r13) goto L_0x0bf0
            android.support.constraint.a.a.f r0 = r4.f799b
            r0.mo720c(r13)
            r53 = 1
            goto L_0x0bf2
        L_0x0bf0:
            r53 = r8
        L_0x0bf2:
            if (r53 == 0) goto L_0x0bf9
            java.lang.String r0 = "3rd pass"
            r4.mo91954a(r0)
        L_0x0bf9:
            r0 = r54
            r1 = 0
        L_0x0bfc:
            if (r1 >= r0) goto L_0x0c53
            java.util.ArrayList<android.support.constraint.a.a.e> r2 = r4.f806i
            java.lang.Object r2 = r2.get(r1)
            android.support.constraint.a.a.e r2 = (android.support.constraint.p020a.p021a.C0333e) r2
            java.lang.Object r6 = r2.f973ab
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0c49
            int r7 = r6.getMeasuredWidth()
            int r8 = r2.mo730j()
            if (r7 != r8) goto L_0x0c20
            int r7 = r6.getMeasuredHeight()
            int r8 = r2.mo731k()
            if (r7 == r8) goto L_0x0c49
        L_0x0c20:
            int r7 = r2.f975ad
            r8 = 8
            if (r7 == r8) goto L_0x0c4b
            int r7 = r2.mo730j()
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            int r2 = r2.mo731k()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
            r6.measure(r7, r2)
            android.support.constraint.a.f r2 = r4.f817t
            if (r2 == 0) goto L_0x0c4d
            android.support.constraint.a.f r2 = r4.f817t
            long r6 = r2.f1101b
            r10 = 1
            long r6 = r6 + r10
            r2.f1101b = r6
            goto L_0x0c4f
        L_0x0c49:
            r8 = 8
        L_0x0c4b:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x0c4d:
            r10 = 1
        L_0x0c4f:
            int r1 = r1 + 1
            goto L_0x0bfc
        L_0x0c52:
            r14 = 0
        L_0x0c53:
            android.support.constraint.a.a.f r0 = r4.f799b
            int r0 = r0.mo730j()
            int r0 = r0 + r5
            android.support.constraint.a.a.f r1 = r4.f799b
            int r1 = r1.mo731k()
            int r1 = r1 + r3
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r2 < r3) goto L_0x0c9e
            r2 = r58
            int r0 = resolveSizeAndState(r0, r2, r14)
            int r2 = r14 << 16
            r3 = r59
            int r1 = resolveSizeAndState(r1, r3, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r2
            r1 = r1 & r2
            int r2 = r4.f809l
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = r4.f810m
            int r1 = java.lang.Math.min(r2, r1)
            android.support.constraint.a.a.f r2 = r4.f799b
            boolean r2 = r2.f1017aA
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r2 == 0) goto L_0x0c8f
            r0 = r0 | r3
        L_0x0c8f:
            android.support.constraint.a.a.f r2 = r4.f799b
            boolean r2 = r2.f1018aB
            if (r2 == 0) goto L_0x0c96
            r1 = r1 | r3
        L_0x0c96:
            r4.setMeasuredDimension(r0, r1)
            r4.f815r = r0
            r4.f816s = r1
            return
        L_0x0c9e:
            r4.setMeasuredDimension(r0, r1)
            r4.f815r = r0
            r4.f816s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    protected static LayoutParams m701a() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m701a();
    }

    public int getOptimizationLevel() {
        return this.f799b.f1029az;
    }

    public void requestLayout() {
        super.requestLayout();
        this.f811n = true;
        this.f815r = -1;
        this.f816s = -1;
        this.f801d = -1;
        this.f802e = -1;
        this.f803f = 0;
        this.f804g = 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(C0359b bVar) {
        this.f813p = bVar;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setOptimizationLevel(int i) {
        this.f799b.f1029az = i;
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.f810m) {
            this.f810m = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f809l) {
            this.f809l = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f808k) {
            this.f808k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f807j) {
            this.f807j = i;
            requestLayout();
        }
    }

    /* renamed from: a */
    private final C0333e m702a(int i) {
        if (i == 0) {
            return this.f799b;
        }
        View view = (View) this.f798a.get(i);
        if (view == this) {
            return this.f799b;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f856al;
    }

    public void setId(int i) {
        this.f798a.remove(getId());
        super.setId(i);
        this.f798a.put(getId(), this);
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f798a.remove(view.getId());
        C0333e a = mo646a(view);
        this.f799b.mo772a(a);
        this.f805h.remove(view);
        this.f806i.remove(a);
        this.f811n = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        m704a((AttributeSet) null);
    }

    /* renamed from: a */
    private void mo91954a(String str) {
        this.f799b.mo748x();
        if (this.f817t != null) {
            this.f817t.f1102c++;
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0333e a = mo646a(view);
        if ((view instanceof Guideline) && !(a instanceof C0337g)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f856al = new C0337g();
            layoutParams.f842Y = true;
            ((C0337g) layoutParams.f856al).mo751f(layoutParams.f836S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo637a();
            ((LayoutParams) view.getLayoutParams()).f843Z = true;
            if (!this.f805h.contains(constraintHelper)) {
                this.f805h.add(constraintHelper);
            }
        }
        this.f798a.put(view.getId(), view);
        this.f811n = true;
    }

    /* renamed from: a */
    public final C0333e mo646a(View view) {
        if (view == this) {
            return this.f799b;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f856al;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) i3;
                            float f3 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f4 = f2;
                            float f5 = f2;
                            float f6 = f3;
                            float f7 = f;
                            Paint paint2 = paint;
                            canvas2.drawLine(f, f4, f6, f5, paint);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f3;
                            float f10 = f8;
                            canvas2.drawLine(f9, f5, f6, f10, paint);
                            float f11 = f8;
                            float f12 = f7;
                            canvas2.drawLine(f9, f11, f12, f10, paint);
                            float f13 = f7;
                            canvas2.drawLine(f13, f11, f12, f5, paint);
                            paint.setColor(-16711936);
                            float f14 = f3;
                            Paint paint3 = paint;
                            canvas2.drawLine(f13, f5, f14, f8, paint);
                            canvas2.drawLine(f13, f8, f14, f5, paint);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.support.constraint.b] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.support.constraint.b$1] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v133 */
    /* JADX WARNING: type inference failed for: r2v134 */
    /* JADX WARNING: type inference failed for: r2v135 */
    /* JADX WARNING: type inference failed for: r2v136 */
    /* JADX WARNING: type inference failed for: r2v137 */
    /* JADX WARNING: type inference failed for: r2v138 */
    /* JADX WARNING: type inference failed for: r2v139 */
    /* JADX WARNING: type inference failed for: r2v140 */
    /* JADX WARNING: type inference failed for: r2v141 */
    /* JADX WARNING: type inference failed for: r2v142 */
    /* JADX WARNING: type inference failed for: r2v143 */
    /* JADX WARNING: type inference failed for: r2v144 */
    /* JADX WARNING: type inference failed for: r2v145 */
    /* JADX WARNING: type inference failed for: r2v146 */
    /* JADX WARNING: type inference failed for: r2v147 */
    /* JADX WARNING: type inference failed for: r2v148 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x032c, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x032e, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v4
      assigns: []
      uses: []
      mth insns count: 345
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[ExcHandler: IOException | XmlPullParserException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:24:0x0090] */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m704a(android.util.AttributeSet r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.support.constraint.a.a.f r2 = r0.f799b
            r2.f973ab = r0
            android.util.SparseArray<android.view.View> r2 = r0.f798a
            int r3 = r16.getId()
            r2.put(r3, r0)
            r2 = 0
            r0.f813p = r2
            if (r1 == 0) goto L_0x033c
            android.content.Context r3 = r16.getContext()
            r4 = 60
            int[] r4 = new int[r4]
            r4 = {16842948, 16843039, 16843040, 16843071, 16843072, 2131361921, 2131361922, 2131362008, 2131362106, 2131362107, 2131362454, 2131362455, 2131362456, 2131362457, 2131362458, 2131362459, 2131362460, 2131362461, 2131362462, 2131362463, 2131362464, 2131362465, 2131362466, 2131362467, 2131362468, 2131362469, 2131362470, 2131362471, 2131362472, 2131362473, 2131362474, 2131362475, 2131362476, 2131362477, 2131362478, 2131362479, 2131362480, 2131362481, 2131362482, 2131362483, 2131362484, 2131362485, 2131362486, 2131362487, 2131362488, 2131362489, 2131362490, 2131362491, 2131362492, 2131362493, 2131362494, 2131362496, 2131362497, 2131362498, 2131362499, 2131362500, 2131362501, 2131362502, 2131362503, 2131362507} // fill-array
            android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r1, r4)
            int r3 = r1.getIndexCount()
            r4 = 0
            r5 = 0
        L_0x002b:
            if (r5 >= r3) goto L_0x0339
            int r6 = r1.getIndex(r5)
            r7 = 3
            if (r6 != r7) goto L_0x003e
            int r7 = r0.f807j
            int r6 = r1.getDimensionPixelOffset(r6, r7)
            r0.f807j = r6
            goto L_0x0334
        L_0x003e:
            r7 = 4
            if (r6 != r7) goto L_0x004b
            int r7 = r0.f808k
            int r6 = r1.getDimensionPixelOffset(r6, r7)
            r0.f808k = r6
            goto L_0x0334
        L_0x004b:
            r7 = 1
            if (r6 != r7) goto L_0x0058
            int r7 = r0.f809l
            int r6 = r1.getDimensionPixelOffset(r6, r7)
            r0.f809l = r6
            goto L_0x0334
        L_0x0058:
            r8 = 2
            if (r6 != r8) goto L_0x0065
            int r7 = r0.f810m
            int r6 = r1.getDimensionPixelOffset(r6, r7)
            r0.f810m = r6
            goto L_0x0334
        L_0x0065:
            r9 = 59
            if (r6 != r9) goto L_0x0073
            int r7 = r0.f812o
            int r6 = r1.getInt(r6, r7)
            r0.f812o = r6
            goto L_0x0334
        L_0x0073:
            r9 = 8
            if (r6 != r9) goto L_0x0334
            int r6 = r1.getResourceId(r6, r4)
            android.support.constraint.b r9 = new android.support.constraint.b     // Catch:{ NotFoundException -> 0x0330 }
            r9.<init>()     // Catch:{ NotFoundException -> 0x0330 }
            r0.f813p = r9     // Catch:{ NotFoundException -> 0x0330 }
            android.support.constraint.b r9 = r0.f813p     // Catch:{ NotFoundException -> 0x0330 }
            android.content.Context r10 = r16.getContext()     // Catch:{ NotFoundException -> 0x0330 }
            android.content.res.Resources r11 = r10.getResources()     // Catch:{ NotFoundException -> 0x0330 }
            android.content.res.XmlResourceParser r11 = r11.getXml(r6)     // Catch:{ NotFoundException -> 0x0330 }
            int r12 = r11.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x032e }
        L_0x0094:
            if (r12 == r7) goto L_0x0332
            if (r12 == 0) goto L_0x0320
            if (r12 == r8) goto L_0x009c
            goto L_0x0323
        L_0x009c:
            java.lang.String r12 = r11.getName()     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            android.support.constraint.b$a r14 = new android.support.constraint.b$a     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            r14.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            r15 = 72
            int[] r15 = new int[r15]     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            r15 = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, 2131362454, 2131362455, 2131362456, 2131362457, 2131362458, 2131362459, 2131362460, 2131362461, 2131362462, 2131362463, 2131362464, 2131362465, 2131362466, 2131362467, 2131362468, 2131362469, 2131362470, 2131362471, 2131362472, 2131362473, 2131362474, 2131362475, 2131362476, 2131362477, 2131362478, 2131362479, 2131362480, 2131362481, 2131362482, 2131362483, 2131362484, 2131362485, 2131362486, 2131362487, 2131362488, 2131362489, 2131362490, 2131362491, 2131362492, 2131362493, 2131362494, 2131362496, 2131362497, 2131362498, 2131362499, 2131362500, 2131362501, 2131362502, 2131362503} // fill-array     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            android.content.res.TypedArray r13 = r10.obtainStyledAttributes(r13, r15)     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            int r15 = r13.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x032e }
        L_0x00b8:
            if (r4 >= r15) goto L_0x0307
            int r8 = r13.getIndex(r4)     // Catch:{ IOException | XmlPullParserException -> 0x032e }
            android.util.SparseIntArray r2 = android.support.constraint.C0359b.f1145c     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r2.get(r8)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            switch(r2) {
                case 1: goto L_0x02f9;
                case 2: goto L_0x02f0;
                case 3: goto L_0x02e7;
                case 4: goto L_0x02de;
                case 5: goto L_0x02d7;
                case 6: goto L_0x02ce;
                case 7: goto L_0x02c5;
                case 8: goto L_0x02bc;
                case 9: goto L_0x02b3;
                case 10: goto L_0x02aa;
                case 11: goto L_0x02a1;
                case 12: goto L_0x0298;
                case 13: goto L_0x028e;
                case 14: goto L_0x0284;
                case 15: goto L_0x027a;
                case 16: goto L_0x0270;
                case 17: goto L_0x0266;
                case 18: goto L_0x025c;
                case 19: goto L_0x0252;
                case 20: goto L_0x0248;
                case 21: goto L_0x023e;
                case 22: goto L_0x022c;
                case 23: goto L_0x0222;
                case 24: goto L_0x0218;
                case 25: goto L_0x020e;
                case 26: goto L_0x0204;
                case 27: goto L_0x01fa;
                case 28: goto L_0x01f0;
                case 29: goto L_0x01e6;
                case 30: goto L_0x01dc;
                case 31: goto L_0x01d2;
                case 32: goto L_0x01c8;
                case 33: goto L_0x01be;
                case 34: goto L_0x01b4;
                case 35: goto L_0x01aa;
                case 36: goto L_0x01a0;
                case 37: goto L_0x0196;
                case 38: goto L_0x018c;
                case 39: goto L_0x0182;
                case 40: goto L_0x0178;
                case 41: goto L_0x016e;
                case 42: goto L_0x0164;
                case 43: goto L_0x015a;
                case 44: goto L_0x014e;
                case 45: goto L_0x0144;
                case 46: goto L_0x013a;
                case 47: goto L_0x0130;
                case 48: goto L_0x0126;
                case 49: goto L_0x011c;
                case 50: goto L_0x0112;
                case 51: goto L_0x0108;
                case 52: goto L_0x00fe;
                case 53: goto L_0x00f4;
                default: goto L_0x00c7;
            }     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
        L_0x00c7:
            switch(r2) {
                case 60: goto L_0x00ea;
                case 61: goto L_0x00e0;
                case 62: goto L_0x00d6;
                case 63: goto L_0x00cc;
                default: goto L_0x00ca;
            }     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
        L_0x00ca:
            goto L_0x0301
        L_0x00cc:
            float r2 = r14.f1218z     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1218z = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x00d6:
            int r2 = r14.f1217y     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1217y = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x00e0:
            int r2 = r14.f1216x     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1216x = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x00ea:
            float r2 = r14.f1170X     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1170X = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x00f4:
            float r2 = r14.f1180ag     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getDimension(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1180ag = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x00fe:
            float r2 = r14.f1179af     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getDimension(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1179af = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0108:
            float r2 = r14.f1178ae     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getDimension(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1178ae = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0112:
            float r2 = r14.f1177ad     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1177ad = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x011c:
            float r2 = r14.f1176ac     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1176ac = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0126:
            float r2 = r14.f1175ab     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1175ab = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0130:
            float r2 = r14.f1174aa     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1174aa = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x013a:
            float r2 = r14.f1172Z     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1172Z = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0144:
            float r2 = r14.f1171Y     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1171Y = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x014e:
            r14.f1168V = r7     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r14.f1169W     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getDimension(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1169W = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x015a:
            float r2 = r14.f1167U     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1167U = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0164:
            int r2 = r14.f1166T     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getInt(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1166T = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x016e:
            int r2 = r14.f1165S     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getInt(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1165S = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0178:
            float r2 = r14.f1163Q     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1163Q = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0182:
            float r2 = r14.f1164R     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1164R = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x018c:
            int r2 = r14.f1196d     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getResourceId(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1196d = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0196:
            float r2 = r14.f1214v     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1214v = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01a0:
            int r2 = r14.f1204l     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1204l = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01aa:
            int r2 = r14.f1205m     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1205m = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01b4:
            int r2 = r14.f1152F     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1152F = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01be:
            int r2 = r14.f1210r     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1210r = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01c8:
            int r2 = r14.f1209q     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1209q = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01d2:
            int r2 = r14.f1155I     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1155I = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01dc:
            int r2 = r14.f1203k     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1203k = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01e6:
            int r2 = r14.f1202j     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1202j = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01f0:
            int r2 = r14.f1151E     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1151E = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x01fa:
            int r2 = r14.f1149C     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getInt(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1149C = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0204:
            int r2 = r14.f1201i     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1201i = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x020e:
            int r2 = r14.f1200h     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1200h = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0218:
            int r2 = r14.f1150D     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1150D = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0222:
            int r2 = r14.f1194b     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getLayoutDimension(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1194b = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x022c:
            int r2 = r14.f1156J     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getInt(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1156J = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int[] r2 = android.support.constraint.C0359b.f1144a     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r8 = r14.f1156J     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r2 = r2[r8]     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1156J = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x023e:
            int r2 = r14.f1195c     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getLayoutDimension(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1195c = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0248:
            float r2 = r14.f1213u     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1213u = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0252:
            float r2 = r14.f1199g     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            float r2 = r13.getFloat(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1199g = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x025c:
            int r2 = r14.f1198f     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelOffset(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1198f = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0266:
            int r2 = r14.f1197e     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelOffset(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1197e = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0270:
            int r2 = r14.f1158L     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1158L = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x027a:
            int r2 = r14.f1162P     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1162P = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0284:
            int r2 = r14.f1159M     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1159M = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x028e:
            int r2 = r14.f1157K     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1157K = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x0298:
            int r2 = r14.f1161O     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1161O = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02a1:
            int r2 = r14.f1160N     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1160N = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02aa:
            int r2 = r14.f1211s     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1211s = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02b3:
            int r2 = r14.f1212t     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1212t = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02bc:
            int r2 = r14.f1154H     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1154H = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02c5:
            int r2 = r14.f1148B     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelOffset(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1148B = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02ce:
            int r2 = r14.f1147A     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelOffset(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1147A = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02d7:
            java.lang.String r2 = r13.getString(r8)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1215w = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02de:
            int r2 = r14.f1206n     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1206n = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02e7:
            int r2 = r14.f1207o     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1207o = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02f0:
            int r2 = r14.f1153G     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = r13.getDimensionPixelSize(r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1153G = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0301
        L_0x02f9:
            int r2 = r14.f1208p     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r2 = android.support.constraint.C0359b.m882a(r13, r8, r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r14.f1208p = r2     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
        L_0x0301:
            int r4 = r4 + 1
            r2 = 0
            r8 = 2
            goto L_0x00b8
        L_0x0307:
            r13.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            java.lang.String r2 = "Guideline"
            boolean r2 = r12.equalsIgnoreCase(r2)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            if (r2 == 0) goto L_0x0314
            r14.f1173a = r7     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
        L_0x0314:
            java.util.HashMap<java.lang.Integer, android.support.constraint.b$a> r2 = r9.f1146b     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            int r4 = r14.f1196d     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r2.put(r4, r14)     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            goto L_0x0323
        L_0x0320:
            r11.getName()     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
        L_0x0323:
            int r12 = r11.next()     // Catch:{ IOException | XmlPullParserException -> 0x032e, NotFoundException -> 0x032c }
            r2 = 0
            r4 = 0
            r8 = 2
            goto L_0x0094
        L_0x032c:
            r2 = 0
            goto L_0x0330
        L_0x032e:
            r2 = 0
            goto L_0x0332
        L_0x0330:
            r0.f813p = r2
        L_0x0332:
            r0.f814q = r6
        L_0x0334:
            int r5 = r5 + 1
            r4 = 0
            goto L_0x002b
        L_0x0339:
            r1.recycle()
        L_0x033c:
            android.support.constraint.a.a.f r1 = r0.f799b
            int r2 = r0.f812o
            r1.f1029az = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m704a(android.util.AttributeSet):void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m704a(attributeSet);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* renamed from: a */
    private void m703a(int i, Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f800c == null) {
                this.f800c = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f800c.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m704a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C0333e eVar = layoutParams.f856al;
            if ((childAt.getVisibility() != 8 || layoutParams.f842Y || layoutParams.f843Z || isInEditMode) && !layoutParams.f845aa) {
                int l = eVar.mo732l();
                int m = eVar.mo733m();
                int j = eVar.mo730j() + l;
                int k = eVar.mo731k() + m;
                childAt.layout(l, m, j, k);
                if (childAt instanceof C0362c) {
                    View content = ((C0362c) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(l, m, j, k);
                    }
                }
            }
        }
        int size = this.f805h.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) this.f805h.get(i6)).mo640b(this);
            }
        }
    }
}
