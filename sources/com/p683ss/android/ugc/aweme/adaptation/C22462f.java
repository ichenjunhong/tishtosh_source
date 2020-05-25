package com.p683ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.adaptation.C22453b.C22458d;

/* renamed from: com.ss.android.ugc.aweme.adaptation.f */
final /* synthetic */ class C22462f implements Runnable {

    /* renamed from: a */
    private final Activity f60505a;

    /* renamed from: b */
    private final ViewGroup f60506b;

    /* renamed from: c */
    private final View f60507c;

    /* renamed from: d */
    private final View f60508d;

    /* renamed from: e */
    private final DisplayMetrics f60509e;

    /* renamed from: f */
    private final boolean f60510f;

    /* renamed from: g */
    private final int f60511g;

    /* renamed from: h */
    private final int f60512h;

    /* renamed from: i */
    private final int f60513i;

    /* renamed from: j */
    private final int f60514j;

    /* renamed from: k */
    private final C22458d f60515k;

    C22462f(Activity activity, ViewGroup viewGroup, View view, View view2, DisplayMetrics displayMetrics, boolean z, int i, int i2, int i3, int i4, C22458d dVar) {
        this.f60505a = activity;
        this.f60506b = viewGroup;
        this.f60507c = view;
        this.f60508d = view2;
        this.f60509e = displayMetrics;
        this.f60510f = z;
        this.f60511g = i;
        this.f60512h = i2;
        this.f60513i = i3;
        this.f60514j = i4;
        this.f60515k = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r0 = r28
            android.app.Activity r1 = r0.f60505a
            android.view.ViewGroup r2 = r0.f60506b
            android.view.View r3 = r0.f60507c
            android.view.View r4 = r0.f60508d
            android.util.DisplayMetrics r5 = r0.f60509e
            boolean r6 = r0.f60510f
            int r7 = r0.f60511g
            int r8 = r0.f60512h
            int r9 = r0.f60513i
            int r10 = r0.f60514j
            com.ss.android.ugc.aweme.adaptation.b$d r11 = r0.f60515k
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x02b8
            if (r2 == 0) goto L_0x02b8
            if (r3 == 0) goto L_0x02b8
            if (r4 != 0) goto L_0x0026
            goto L_0x02b8
        L_0x0026:
            int r1 = android.os.Build.VERSION.SDK_INT
            r12 = 23
            if (r1 < r12) goto L_0x0031
            android.view.WindowInsets r1 = r2.getRootWindowInsets()
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r12 = 1
            r14 = 0
            if (r1 == 0) goto L_0x0058
            int r15 = android.os.Build.VERSION.SDK_INT
            r13 = 20
            if (r15 < r13) goto L_0x004b
            java.lang.Class<android.view.WindowInsets> r13 = android.view.WindowInsets.class
            java.lang.String r15 = "getDisplayCutout"
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r14] = r1
            java.lang.Object r13 = com.bytedance.common.utility.p526f.C9412d.m18627a(r13, r15, r0)
            r16 = r13
            goto L_0x004d
        L_0x004b:
            r16 = 0
        L_0x004d:
            com.ss.android.ugc.aweme.adaptation.b r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            if (r16 == 0) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            r0.f60474l = r1
        L_0x0058:
            int r0 = r5.heightPixels
            com.ss.android.ugc.aweme.adaptation.b r1 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            boolean r1 = r1.f60474l
            if (r1 == 0) goto L_0x0073
            boolean r1 = com.p683ss.android.common.util.C18920g.m46054c()
            if (r1 != 0) goto L_0x0073
            boolean r1 = com.p683ss.android.common.util.C18920g.m46047a()
            if (r1 != 0) goto L_0x0073
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58225c()
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r0 = r0 + r1
            int r1 = r5.widthPixels
            com.ss.android.ugc.aweme.adaptation.b r13 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            int r15 = r2.getHeight()
            r13.f60470f = r15
            com.ss.android.ugc.aweme.adaptation.b r13 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            r13.f60471g = r6
            com.ss.android.ugc.aweme.adaptation.b r6 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            r6.f60467c = r7
            int r6 = r0 - r7
            double r14 = (double) r6
            double r12 = (double) r8
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r12)
            double r12 = r14 - r12
            r17 = r5
            double r5 = (double) r9
            java.lang.Double.isNaN(r5)
            double r18 = r12 - r5
            r20 = r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            r21 = r8
            r22 = r9
            double r8 = r18 / r1
            java.lang.Double.isNaN(r1)
            double r12 = r12 / r1
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r5)
            double r5 = r14 - r5
            java.lang.Double.isNaN(r1)
            double r5 = r5 / r1
            r23 = r11
            com.ss.android.ugc.aweme.adaptation.b r11 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            r11.f60468d = r10
            r10 = 0
            r18 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            if (r7 <= 0) goto L_0x010a
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r1)
            double r1 = r14 / r1
            int r16 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x00e1
            java.lang.String r1 = "G"
        L_0x00dc:
            r10 = r1
            r1 = 0
        L_0x00de:
            r2 = 0
            goto L_0x013f
        L_0x00e1:
            int r1 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e8
            java.lang.String r1 = "D"
            goto L_0x0110
        L_0x00e8:
            int r1 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            java.lang.String r1 = "G"
            goto L_0x00dc
        L_0x00f3:
            r1 = 0
            double r1 = r5 - r18
            int r16 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x0107
            double r18 = r12 - r18
            int r16 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r16 < 0) goto L_0x0104
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 >= 0) goto L_0x0107
        L_0x0104:
            java.lang.String r1 = "E"
            goto L_0x0134
        L_0x0107:
            java.lang.String r1 = "F"
            goto L_0x013b
        L_0x010a:
            int r1 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x0116
            java.lang.String r1 = "A"
        L_0x0110:
            r10 = r1
            r1 = r21
            r2 = r22
            goto L_0x013f
        L_0x0116:
            int r1 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x0121
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 >= 0) goto L_0x0121
            java.lang.String r1 = "默认"
            goto L_0x00dc
        L_0x0121:
            r1 = 0
            double r1 = r5 - r18
            int r16 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x0139
            double r18 = r12 - r18
            int r16 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r16 < 0) goto L_0x0132
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 >= 0) goto L_0x0139
        L_0x0132:
            java.lang.String r1 = "B"
        L_0x0134:
            r10 = r1
            r2 = r22
            r1 = 0
            goto L_0x013f
        L_0x0139:
            java.lang.String r1 = "C"
        L_0x013b:
            r10 = r1
            r1 = r21
            goto L_0x00de
        L_0x013f:
            com.p683ss.android.ugc.aweme.adaptation.C22453b.f60463i = r1
            com.p683ss.android.ugc.aweme.adaptation.C22453b.f60464j = r2
            int r11 = r4.getVisibility()
            r24 = r1
            r1 = 8
            if (r11 != r1) goto L_0x0151
            r25 = r2
            r11 = 0
            goto L_0x0155
        L_0x0151:
            r25 = r2
            r11 = r24
        L_0x0155:
            int r2 = r3.getVisibility()
            if (r2 != r1) goto L_0x015d
            r1 = 0
            goto L_0x015f
        L_0x015d:
            r1 = r25
        L_0x015f:
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            if (r11 == 0) goto L_0x0169
            r26 = r5
            r5 = 1
            goto L_0x016c
        L_0x0169:
            r26 = r5
            r5 = 0
        L_0x016c:
            r2.f60475m = r5
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            if (r1 == 0) goto L_0x0176
            r5 = 1
            goto L_0x0177
        L_0x0176:
            r5 = 0
        L_0x0177:
            r2.f60476n = r5
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            if (r1 == 0) goto L_0x0181
            r5 = 1
            goto L_0x0182
        L_0x0181:
            r5 = 0
        L_0x0182:
            r2.f60473k = r5
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            int r5 = (int) r14
            int r5 = r5 - r11
            int r5 = r5 - r1
            r2.f60470f = r5
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            com.ss.android.ugc.aweme.story.api.model.a r2 = r2.f60472h
            r5 = 1
            r2.f117627a = r5
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            com.ss.android.ugc.aweme.story.api.model.a r2 = r2.f60472h
            r5 = r21
            r2.f117628b = r5
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            com.ss.android.ugc.aweme.story.api.model.a r2 = r2.f60472h
            r2.f117629c = r1
            com.ss.android.ugc.aweme.adaptation.b r2 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            com.ss.android.ugc.aweme.story.api.model.a r2 = r2.f60472h
            r2.f117630d = r7
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r6 = r2.height
            if (r6 == r11) goto L_0x01bf
            r2.height = r11
            r4.setLayoutParams(r2)
        L_0x01bf:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r4 = r2.height
            if (r4 == r1) goto L_0x01ce
            r2.height = r1
            r3.setLayoutParams(r2)
        L_0x01ce:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "doAdaptationV2: , realDisplayMetrics.heightPixels:"
            r2.<init>(r3)
            r3 = r17
            int r3 = r3.heightPixels
            r2.append(r3)
            java.lang.String r3 = ", isAndroidPHasNotch():"
            r2.append(r3)
            com.ss.android.ugc.aweme.adaptation.b r3 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            boolean r3 = r3.f60474l
            r2.append(r3)
            java.lang.String r3 = ", statusBarHeight:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", realScreenHeight:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", virtualBarHeight:"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = ", appNavHeight:"
            r2.append(r0)
            r0 = r22
            r2.append(r0)
            java.lang.String r0 = ", screenHeightWithoutVirtualBar:"
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = ", ViewPagerHeight:"
            r2.append(r0)
            com.ss.android.ugc.aweme.adaptation.b r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            int r0 = r0.f60470f
            r2.append(r0)
            java.lang.String r0 = ", topSpaceHeight:"
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = ", bottomSpaceHeight:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", desiredTopSpaceHeight:"
            r2.append(r0)
            int r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.f60463i
            r2.append(r0)
            java.lang.String r0 = ", desiredBottomSpaceHeight:"
            r2.append(r0)
            int r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.f60464j
            r2.append(r0)
            java.lang.String r0 = ", showTopCorner:"
            r2.append(r0)
            com.ss.android.ugc.aweme.adaptation.b r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            boolean r0 = r0.f60475m
            r2.append(r0)
            java.lang.String r0 = ", showBottomCorner:"
            r2.append(r0)
            com.ss.android.ugc.aweme.adaptation.b r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            boolean r0 = r0.f60476n
            r2.append(r0)
            java.lang.String r0 = ", 方案"
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ", 减去两个栏的比例:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", 只减状态栏的比例:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", 只减DMT菜单栏的比例:"
            r1.append(r0)
            r5 = r26
            r1.append(r5)
            r0 = 0
        L_0x0291:
            int r1 = r20.getChildCount()
            if (r0 >= r1) goto L_0x02b2
            r1 = r20
            android.view.View r2 = r1.getChildAt(r0)
            r3 = 2132019007(0x7f14073f, float:1.9676337E38)
            java.lang.Object r2 = r2.getTag(r3)
            boolean r3 = r2 instanceof com.p683ss.android.ugc.aweme.adaptation.C22453b.C22456b
            if (r3 == 0) goto L_0x02ad
            com.ss.android.ugc.aweme.adaptation.b$b r2 = (com.p683ss.android.ugc.aweme.adaptation.C22453b.C22456b) r2
            r2.mo46747a()
        L_0x02ad:
            int r0 = r0 + 1
            r20 = r1
            goto L_0x0291
        L_0x02b2:
            if (r23 == 0) goto L_0x02b7
            r23.aA_()
        L_0x02b7:
            return
        L_0x02b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.adaptation.C22462f.run():void");
    }
}
