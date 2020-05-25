package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.b.b */
public final class C35386b {

    /* renamed from: a */
    final int f90921a;

    /* renamed from: b */
    int f90922b;

    /* renamed from: c */
    public int f90923c;

    /* renamed from: d */
    public int f90924d;

    /* renamed from: e */
    public boolean f90925e;

    /* renamed from: f */
    public final View f90926f;

    /* renamed from: g */
    final View f90927g;

    /* renamed from: h */
    public final ViewGroup f90928h;

    /* renamed from: i */
    public final C35393d f90929i;

    /* renamed from: j */
    public long f90930j;

    /* renamed from: k */
    public boolean f90931k;

    /* renamed from: l */
    public View f90932l;

    /* renamed from: m */
    public C35385a f90933m;

    /* renamed from: n */
    public boolean f90934n;

    /* renamed from: o */
    public boolean f90935o;

    /* renamed from: p */
    public OnHierarchyChangeListener f90936p;

    /* renamed from: q */
    private final Handler f90937q;

    /* renamed from: r */
    private Runnable f90938r;

    /* renamed from: s */
    private Runnable f90939s;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.b.b$a */
    public static class C35391a {

        /* renamed from: a */
        private int f90944a;

        /* renamed from: b */
        private int f90945b;

        /* renamed from: c */
        private int f90946c;

        /* renamed from: d */
        private int f90947d;

        /* renamed from: e */
        private View f90948e;

        /* renamed from: f */
        private View f90949f;

        /* renamed from: g */
        private ViewGroup f90950g;

        /* renamed from: h */
        private C35393d f90951h;

        /* renamed from: i */
        private long f90952i = -1;

        /* renamed from: j */
        private boolean f90953j;

        /* renamed from: k */
        private C35385a f90954k;

        /* renamed from: a */
        public final C35386b mo73662a() {
            if (this.f90948e == null) {
                throw new RuntimeException("BubbleView cannot be null!!!");
            } else if (this.f90949f != null) {
                C35386b bVar = new C35386b(this.f90948e, this.f90949f, this.f90950g, this.f90951h, this.f90944a, this.f90945b, this.f90946c, this.f90947d);
                bVar.f90930j = this.f90952i;
                bVar.f90931k = this.f90953j;
                if (bVar.f90931k && bVar.f90932l == null) {
                    bVar.f90932l = new FrameLayout(bVar.f90928h.getContext());
                    bVar.f90932l.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C35386b.this.mo73654b();
                        }
                    });
                }
                C35385a aVar = this.f90954k;
                if (aVar != null) {
                    bVar.f90933m = aVar;
                } else {
                    bVar.f90933m = new C35385a();
                }
                return bVar;
            } else {
                throw new RuntimeException("AnchorView cannot be null!!!");
            }
        }

        /* renamed from: a */
        public final C35391a mo73660a(int i) {
            this.f90944a = 2;
            return this;
        }

        /* renamed from: b */
        public final C35391a mo73663b(int i) {
            this.f90945b = 0;
            return this;
        }

        /* renamed from: c */
        public final C35391a mo73665c(int i) {
            this.f90946c = i;
            return this;
        }

        /* renamed from: d */
        public final C35391a mo73666d(int i) {
            this.f90947d = i;
            return this;
        }

        /* renamed from: a */
        public final C35391a mo73661a(View view) {
            this.f90948e = view;
            return this;
        }

        /* renamed from: b */
        public final C35391a mo73664b(View view) {
            this.f90949f = view;
            return this;
        }
    }

    /* renamed from: b */
    public final void mo73654b() {
        mo73653a(0);
    }

    /* renamed from: a */
    public final void mo73652a() {
        this.f90937q.postDelayed(this.f90938r, 0);
    }

    /* renamed from: a */
    public final void mo73653a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f90937q.postDelayed(this.f90939s, j);
    }

    private C35386b(View view, View view2, View view3, C35393d dVar, int i, int i2, int i3, int i4) {
        String str;
        this.f90938r = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:102:0x01eb, code lost:
                r16 = r11;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:112:0x0239, code lost:
                if (r16 != false) goto L_0x023f;
             */
            /* JADX WARNING: Removed duplicated region for block: B:117:0x024a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r17 = this;
                    r0 = r17
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    boolean r1 = r1.f90935o
                    if (r1 == 0) goto L_0x0009
                    return
                L_0x0009:
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    android.view.ViewGroup r1 = r1.f90928h
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    android.view.ViewGroup$OnHierarchyChangeListener r2 = r2.f90936p
                    r1.setOnHierarchyChangeListener(r2)
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    android.view.View r2 = r1.f90927g
                    r3 = 1
                    if (r2 == 0) goto L_0x0246
                    android.view.ViewGroup r2 = r1.f90928h
                    if (r2 == 0) goto L_0x0246
                    android.view.View r2 = r1.f90927g
                    int r2 = r2.getWidth()
                    android.view.View r4 = r1.f90927g
                    int r4 = r4.getHeight()
                    android.view.ViewGroup r5 = r1.f90928h
                    int r5 = r5.getWidth()
                    android.view.ViewGroup r6 = r1.f90928h
                    int r6 = r6.getHeight()
                    if (r2 <= 0) goto L_0x0246
                    if (r4 <= 0) goto L_0x0246
                    if (r5 <= 0) goto L_0x0246
                    if (r6 <= 0) goto L_0x0246
                    android.view.View r7 = r1.f90932l
                    if (r7 == 0) goto L_0x0054
                    android.view.View r7 = r1.f90932l
                    android.view.ViewParent r7 = r7.getParent()
                    boolean r8 = r7 instanceof android.view.ViewGroup
                    if (r8 == 0) goto L_0x0054
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    android.view.View r8 = r1.f90932l
                    r7.removeView(r8)
                L_0x0054:
                    boolean r7 = r1.f90931k
                    r8 = -1
                    if (r7 == 0) goto L_0x0060
                    android.view.ViewGroup r7 = r1.f90928h
                    android.view.View r9 = r1.f90932l
                    r7.addView(r9, r8, r8)
                L_0x0060:
                    r7 = 2
                    int[] r9 = new int[r7]
                    android.view.View r10 = r1.f90927g
                    r10.getLocationOnScreen(r9)
                    int[] r7 = new int[r7]
                    android.view.ViewGroup r10 = r1.f90928h
                    r10.getLocationOnScreen(r7)
                    int r10 = r1.f90921a
                    r11 = 0
                    switch(r10) {
                        case 0: goto L_0x0091;
                        case 1: goto L_0x008a;
                        case 2: goto L_0x0084;
                        case 3: goto L_0x007d;
                        default: goto L_0x0075;
                    }
                L_0x0075:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    java.lang.String r2 = "Invalid align base point !!"
                    r1.<init>(r2)
                    throw r1
                L_0x007d:
                    r10 = r9[r11]
                    int r10 = r10 + r2
                    r2 = r9[r3]
                    int r2 = r2 + r4
                    goto L_0x0095
                L_0x0084:
                    r10 = r9[r11]
                    r2 = r9[r3]
                    int r2 = r2 + r4
                    goto L_0x0095
                L_0x008a:
                    r4 = r9[r11]
                    int r10 = r4 + r2
                    r2 = r9[r3]
                    goto L_0x0095
                L_0x0091:
                    r10 = r9[r11]
                    r2 = r9[r3]
                L_0x0095:
                    r4 = r7[r11]
                    int r4 = r10 - r4
                    int r9 = r1.f90922b
                    int r12 = r1.f90923c
                    int r12 = -r12
                    switch(r9) {
                        case 0: goto L_0x00ab;
                        case 1: goto L_0x00a9;
                        case 2: goto L_0x00a9;
                        case 3: goto L_0x00ab;
                        default: goto L_0x00a1;
                    }
                L_0x00a1:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    java.lang.String r2 = "Invalid align quadrant !!"
                    r1.<init>(r2)
                    throw r1
                L_0x00a9:
                    int r12 = r12 + r4
                    goto L_0x00ae
                L_0x00ab:
                    int r4 = r5 - r4
                    int r12 = r12 + r4
                L_0x00ae:
                    r4 = r7[r3]
                    int r4 = r2 - r4
                    int r9 = r1.f90922b
                    int r13 = r1.f90924d
                    int r13 = -r13
                    switch(r9) {
                        case 0: goto L_0x00c6;
                        case 1: goto L_0x00c6;
                        case 2: goto L_0x00c2;
                        case 3: goto L_0x00c2;
                        default: goto L_0x00ba;
                    }
                L_0x00ba:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    java.lang.String r2 = "Invalid align quadrant !!"
                    r1.<init>(r2)
                    throw r1
                L_0x00c2:
                    int r4 = r6 - r4
                    int r13 = r13 + r4
                    goto L_0x00c7
                L_0x00c6:
                    int r13 = r13 + r4
                L_0x00c7:
                    android.view.View r4 = r1.f90926f
                    android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                    if (r4 != 0) goto L_0x00d8
                    int r9 = android.os.Build.VERSION.SDK_INT
                    r14 = 18
                    if (r9 > r14) goto L_0x00d8
                    r1 = 1
                    goto L_0x0248
                L_0x00d8:
                    r14 = -2
                    if (r4 == 0) goto L_0x00fb
                    int r9 = r4.width
                    if (r9 != r14) goto L_0x00e2
                    r9 = -2147483648(0xffffffff80000000, float:-0.0)
                    goto L_0x00eb
                L_0x00e2:
                    int r9 = r4.width
                    if (r9 == r8) goto L_0x00e9
                    int r9 = r4.width
                    r12 = r9
                L_0x00e9:
                    r9 = 1073741824(0x40000000, float:2.0)
                L_0x00eb:
                    int r15 = r4.height
                    if (r15 != r14) goto L_0x00f2
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    goto L_0x00ff
                L_0x00f2:
                    int r15 = r4.height
                    if (r15 == r8) goto L_0x00f8
                    int r13 = r4.height
                L_0x00f8:
                    r4 = 1073741824(0x40000000, float:2.0)
                    goto L_0x00ff
                L_0x00fb:
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r9 = -2147483648(0xffffffff80000000, float:-0.0)
                L_0x00ff:
                    int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
                    int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r4)
                    android.view.View r13 = r1.f90926f
                    r13.measure(r8, r12)
                    int r8 = r1.f90922b
                    int r12 = r1.f90924d
                    android.view.View r13 = r1.f90926f
                    int r13 = r13.getMeasuredHeight()
                    switch(r8) {
                        case 0: goto L_0x0123;
                        case 1: goto L_0x0123;
                        case 2: goto L_0x0121;
                        case 3: goto L_0x0121;
                        default: goto L_0x0119;
                    }
                L_0x0119:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    java.lang.String r2 = "Invalid align quadrant !!"
                    r1.<init>(r2)
                    throw r1
                L_0x0121:
                    int r2 = r2 + r12
                    goto L_0x0125
                L_0x0123:
                    int r12 = r12 + r13
                    int r2 = r2 - r12
                L_0x0125:
                    r8 = r7[r3]
                    int r2 = r2 - r8
                    int r8 = r1.f90922b
                    int r12 = r1.f90923c
                    android.view.View r13 = r1.f90926f
                    int r13 = r13.getMeasuredWidth()
                    switch(r8) {
                        case 0: goto L_0x0140;
                        case 1: goto L_0x013d;
                        case 2: goto L_0x013d;
                        case 3: goto L_0x0140;
                        default: goto L_0x0135;
                    }
                L_0x0135:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    java.lang.String r2 = "Invalid align quadrant !!"
                    r1.<init>(r2)
                    throw r1
                L_0x013d:
                    int r12 = r12 + r13
                    int r10 = r10 - r12
                    goto L_0x0141
                L_0x0140:
                    int r10 = r10 + r12
                L_0x0141:
                    r7 = r7[r11]
                    int r10 = r10 - r7
                    r7 = -2147483648(0xffffffff80000000, float:-0.0)
                    if (r9 != r7) goto L_0x014b
                    r8 = -2
                    r9 = 1
                    goto L_0x0152
                L_0x014b:
                    android.view.View r8 = r1.f90926f
                    int r8 = r8.getMeasuredWidth()
                    r9 = 0
                L_0x0152:
                    if (r4 != r7) goto L_0x0157
                    r4 = -2
                    r9 = 1
                    goto L_0x015d
                L_0x0157:
                    android.view.View r4 = r1.f90926f
                    int r4 = r4.getMeasuredHeight()
                L_0x015d:
                    android.view.ViewGroup$MarginLayoutParams r7 = new android.view.ViewGroup$MarginLayoutParams
                    r7.<init>(r8, r4)
                    android.view.View r4 = r1.f90926f
                    r8 = 4
                    r4.setVisibility(r8)
                    android.view.View r4 = r1.f90926f
                    android.view.ViewParent r4 = r4.getParent()
                    boolean r8 = r4 instanceof android.view.ViewGroup
                    if (r8 == 0) goto L_0x0179
                    android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                    android.view.View r8 = r1.f90926f
                    r4.removeView(r8)
                L_0x0179:
                    android.view.ViewGroup r4 = r1.f90928h
                    android.view.View r8 = r1.f90926f
                    r4.addView(r8, r7)
                    android.view.View r4 = r1.f90926f
                    android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                    android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
                    if (r9 == 0) goto L_0x023b
                    android.view.View r7 = r1.f90926f
                    int r7 = r7.getMeasuredWidth()
                    android.view.View r8 = r1.f90926f
                    int r8 = r8.getMeasuredHeight()
                    android.view.ViewGroup r9 = r1.f90928h
                    android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                    int r9 = r9.width
                    if (r9 == r14) goto L_0x01ac
                    android.view.ViewGroup r9 = r1.f90928h
                    android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                    int r9 = r9.height
                    if (r9 == r14) goto L_0x01ac
                    r9 = 1
                    goto L_0x01ad
                L_0x01ac:
                    r9 = 0
                L_0x01ad:
                    if (r9 == 0) goto L_0x0237
                    boolean r9 = r4 instanceof android.widget.FrameLayout.LayoutParams
                    if (r9 == 0) goto L_0x01ee
                    r9 = r4
                    android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9
                    int r12 = r1.f90922b
                    switch(r12) {
                        case 0: goto L_0x01de;
                        case 1: goto L_0x01d1;
                        case 2: goto L_0x01c6;
                        case 3: goto L_0x01bc;
                        default: goto L_0x01bb;
                    }
                L_0x01bb:
                    goto L_0x01eb
                L_0x01bc:
                    r5 = 51
                    r9.gravity = r5
                    r9.leftMargin = r10
                    r9.topMargin = r2
                    r11 = 1
                    goto L_0x01eb
                L_0x01c6:
                    r6 = 53
                    r9.gravity = r6
                    int r5 = r5 - r10
                    int r5 = r5 - r7
                    r9.rightMargin = r5
                    r9.topMargin = r2
                    goto L_0x01e8
                L_0x01d1:
                    r11 = 85
                    r9.gravity = r11
                    int r5 = r5 - r10
                    int r5 = r5 - r7
                    r9.rightMargin = r5
                    int r6 = r6 - r2
                    int r6 = r6 - r8
                    r9.bottomMargin = r6
                    goto L_0x01e8
                L_0x01de:
                    r5 = 83
                    r9.gravity = r5
                    r9.leftMargin = r10
                    int r6 = r6 - r2
                    int r6 = r6 - r8
                    r9.bottomMargin = r6
                L_0x01e8:
                    r16 = 1
                    goto L_0x0239
                L_0x01eb:
                    r16 = r11
                    goto L_0x0239
                L_0x01ee:
                    boolean r9 = r4 instanceof android.widget.RelativeLayout.LayoutParams
                    if (r9 == 0) goto L_0x0237
                    r9 = r4
                    android.widget.RelativeLayout$LayoutParams r9 = (android.widget.RelativeLayout.LayoutParams) r9
                    int r12 = r1.f90922b
                    r13 = 10
                    r14 = 11
                    r15 = 12
                    r11 = 9
                    switch(r12) {
                        case 0: goto L_0x022a;
                        case 1: goto L_0x021b;
                        case 2: goto L_0x020e;
                        case 3: goto L_0x0203;
                        default: goto L_0x0202;
                    }
                L_0x0202:
                    goto L_0x0237
                L_0x0203:
                    r9.addRule(r11)
                    r9.addRule(r13)
                    r9.leftMargin = r10
                    r9.topMargin = r2
                    goto L_0x01e8
                L_0x020e:
                    r9.addRule(r14)
                    r9.addRule(r13)
                    int r5 = r5 - r10
                    int r5 = r5 - r7
                    r9.rightMargin = r5
                    r9.topMargin = r2
                    goto L_0x01e8
                L_0x021b:
                    r9.addRule(r14)
                    r9.addRule(r15)
                    int r5 = r5 - r10
                    int r5 = r5 - r7
                    r9.rightMargin = r5
                    int r6 = r6 - r2
                    int r6 = r6 - r8
                    r9.bottomMargin = r6
                    goto L_0x01e8
                L_0x022a:
                    r9.addRule(r11)
                    r9.addRule(r15)
                    r9.leftMargin = r10
                    int r6 = r6 - r2
                    int r6 = r6 - r8
                    r9.bottomMargin = r6
                    goto L_0x01e8
                L_0x0237:
                    r16 = 0
                L_0x0239:
                    if (r16 != 0) goto L_0x023f
                L_0x023b:
                    r4.leftMargin = r10
                    r4.topMargin = r2
                L_0x023f:
                    android.view.View r2 = r1.f90926f
                    r2.setLayoutParams(r4)
                    r1.f90925e = r3
                L_0x0246:
                    boolean r1 = r1.f90925e
                L_0x0248:
                    if (r1 == 0) goto L_0x026a
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    com.ss.android.ugc.aweme.im.sdk.widget.b.d r1 = r1.f90929i
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    r1.mo73668a(r2)
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    long r1 = r1.f90930j
                    r4 = 0
                    int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r6 <= 0) goto L_0x0266
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    long r4 = r2.f90930j
                    r1.mo73653a(r4)
                L_0x0266:
                    com.ss.android.ugc.aweme.im.sdk.widget.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.this
                    r1.f90934n = r3
                L_0x026a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b.C353871.run():void");
            }
        };
        this.f90939s = new Runnable() {
            public final void run() {
                if (!C35386b.this.f90935o && C35386b.this.f90925e) {
                    C35386b.this.f90929i.mo73667a(C35386b.this.f90928h, C35386b.this);
                    if (C35386b.this.f90931k) {
                        C35386b.this.f90928h.removeView(C35386b.this.f90932l);
                    }
                    C35386b.this.f90925e = false;
                    C35386b.this.f90934n = false;
                }
            }
        };
        this.f90936p = new OnHierarchyChangeListener() {
            public final void onChildViewAdded(View view, View view2) {
            }

            public final void onChildViewRemoved(View view, View view2) {
                if (view == C35386b.this.f90928h && view2 == C35386b.this.f90926f) {
                    C35386b.this.f90928h.setOnHierarchyChangeListener(null);
                    C35386b.this.f90934n = false;
                }
            }
        };
        this.f90926f = view;
        this.f90927g = view2;
        if (dVar == null) {
            dVar = C35392c.f90955a;
        }
        this.f90929i = dVar;
        if (view2 != null) {
            if (view3 == null) {
                view3 = view2.getRootView();
            }
            if ((view3 instanceof FrameLayout) || (view3 instanceof RelativeLayout)) {
                this.f90928h = (ViewGroup) view3;
                this.f90930j = -1;
                this.f90921a = i;
                this.f90922b = i2;
                this.f90923c = i3;
                this.f90924d = i4;
                this.f90925e = false;
                this.f90931k = false;
                this.f90934n = false;
                this.f90935o = false;
                this.f90937q = new Handler(Looper.getMainLooper());
                return;
            }
            str = "canvasView is not a FrameLayout nor a RelativeLayout!!";
        } else {
            str = "anchorView is null!!";
        }
        StringBuilder sb = new StringBuilder("Invalid bubble args : ");
        sb.append(str);
        throw new RuntimeException(sb.toString());
    }
}
