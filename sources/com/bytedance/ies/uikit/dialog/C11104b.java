package com.bytedance.ies.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.bytedance.ies.uikit.dialog.C11091a.C11097a;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.uikit.dialog.b */
public class C11104b extends Dialog implements DialogInterface {

    /* renamed from: b */
    public static C11106b f29897b;

    /* renamed from: a */
    public C11091a f29898a;

    /* renamed from: com.bytedance.ies.uikit.dialog.b$a */
    public static class C11105a {

        /* renamed from: a */
        public final C11097a f29899a;

        /* renamed from: b */
        private int f29900b;

        /* renamed from: b */
        public final C11104b mo20148b() {
            C11104b a = mo20143a();
            a.show();
            return a;
        }

        /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r3v29 */
        /* JADX WARNING: type inference failed for: r14v1 */
        /* JADX WARNING: type inference failed for: r4v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r3v32, types: [com.bytedance.ies.uikit.dialog.a$c] */
        /* JADX WARNING: type inference failed for: r3v33, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r3v36, types: [com.bytedance.ies.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r3v37, types: [com.bytedance.ies.uikit.dialog.a$a$1] */
        /* JADX WARNING: type inference failed for: r4v13, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r3v55 */
        /* JADX WARNING: type inference failed for: r3v56 */
        /* JADX WARNING: type inference failed for: r3v57, types: [com.bytedance.ies.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r3v58, types: [com.bytedance.ies.uikit.dialog.a$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v1
          assigns: [?[OBJECT, ARRAY], com.bytedance.ies.uikit.dialog.a$a$2, com.bytedance.ies.uikit.dialog.a$a$1]
          uses: [android.widget.ListAdapter, com.bytedance.ies.uikit.dialog.a$a$2, com.bytedance.ies.uikit.dialog.a$a$1]
          mth insns count: 185
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.ies.uikit.dialog.C11104b mo20143a() {
            /*
                r15 = this;
                com.bytedance.ies.uikit.dialog.b r0 = new com.bytedance.ies.uikit.dialog.b
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                android.content.Context r1 = r1.f29858a
                int r2 = r15.f29900b
                r0.<init>(r1, r2)
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                com.bytedance.ies.uikit.dialog.a r2 = r0.f29898a
                android.view.View r3 = r1.f29864g
                r10 = 1
                r11 = 0
                if (r3 == 0) goto L_0x001a
                android.view.View r3 = r1.f29864g
                r2.f29794C = r3
                goto L_0x0062
            L_0x001a:
                java.lang.CharSequence r3 = r1.f29863f
                if (r3 == 0) goto L_0x0023
                java.lang.CharSequence r3 = r1.f29863f
                r2.mo20113a(r3)
            L_0x0023:
                android.graphics.drawable.Drawable r3 = r1.f29861d
                if (r3 == 0) goto L_0x0040
                android.graphics.drawable.Drawable r3 = r1.f29861d
                r2.f29831y = r3
                r2.f29830x = r11
                android.widget.ImageView r4 = r2.f29832z
                if (r4 == 0) goto L_0x0040
                if (r3 == 0) goto L_0x0039
                android.widget.ImageView r4 = r2.f29832z
                r4.setImageDrawable(r3)
                goto L_0x0040
            L_0x0039:
                android.widget.ImageView r3 = r2.f29832z
                r4 = 8
                r3.setVisibility(r4)
            L_0x0040:
                int r3 = r1.f29860c
                if (r3 == 0) goto L_0x0049
                int r3 = r1.f29860c
                r2.mo20111a(r3)
            L_0x0049:
                int r3 = r1.f29862e
                if (r3 == 0) goto L_0x0062
                int r3 = r1.f29862e
                android.util.TypedValue r4 = new android.util.TypedValue
                r4.<init>()
                android.content.Context r5 = r2.f29807a
                android.content.res.Resources$Theme r5 = r5.getTheme()
                r5.resolveAttribute(r3, r4, r10)
                int r3 = r4.resourceId
                r2.mo20111a(r3)
            L_0x0062:
                java.lang.CharSequence r3 = r1.f29865h
                if (r3 == 0) goto L_0x006b
                java.lang.CharSequence r3 = r1.f29865h
                r2.mo20114b(r3)
            L_0x006b:
                java.lang.CharSequence r3 = r1.f29866i
                r12 = 0
                if (r3 == 0) goto L_0x0078
                r3 = -1
                java.lang.CharSequence r4 = r1.f29866i
                android.content.DialogInterface$OnClickListener r5 = r1.f29867j
                r2.mo20112a(r3, r4, r5, r12)
            L_0x0078:
                java.lang.CharSequence r3 = r1.f29868k
                if (r3 == 0) goto L_0x0084
                r3 = -2
                java.lang.CharSequence r4 = r1.f29868k
                android.content.DialogInterface$OnClickListener r5 = r1.f29869l
                r2.mo20112a(r3, r4, r5, r12)
            L_0x0084:
                java.lang.CharSequence r3 = r1.f29870m
                if (r3 == 0) goto L_0x0090
                r3 = -3
                java.lang.CharSequence r4 = r1.f29870m
                android.content.DialogInterface$OnClickListener r5 = r1.f29871n
                r2.mo20112a(r3, r4, r5, r12)
            L_0x0090:
                boolean r3 = r1.f29855K
                if (r3 == 0) goto L_0x0096
                r2.f29795D = r10
            L_0x0096:
                java.lang.CharSequence[] r3 = r1.f29876s
                if (r3 != 0) goto L_0x00a2
                android.database.Cursor r3 = r1.f29852H
                if (r3 != 0) goto L_0x00a2
                android.widget.ListAdapter r3 = r1.f29877t
                if (r3 == 0) goto L_0x014c
            L_0x00a2:
                android.view.LayoutInflater r3 = r1.f29859b
                int r4 = r2.f29800I
                android.view.View r3 = r3.inflate(r4, r12)
                r13 = r3
                com.bytedance.ies.uikit.dialog.RecycleListView r13 = (com.bytedance.ies.uikit.dialog.RecycleListView) r13
                boolean r3 = r1.f29848D
                if (r3 == 0) goto L_0x00d6
                android.database.Cursor r3 = r1.f29852H
                if (r3 != 0) goto L_0x00c7
                com.bytedance.ies.uikit.dialog.a$a$1 r14 = new com.bytedance.ies.uikit.dialog.a$a$1
                android.content.Context r5 = r1.f29858a
                int r6 = r2.f29801J
                r7 = 2132023287(0x7f1417f7, float:1.9685018E38)
                java.lang.CharSequence[] r8 = r1.f29876s
                r3 = r14
                r4 = r1
                r9 = r13
                r3.<init>(r5, r6, r7, r8, r9)
                goto L_0x010e
            L_0x00c7:
                com.bytedance.ies.uikit.dialog.a$a$2 r14 = new com.bytedance.ies.uikit.dialog.a$a$2
                android.content.Context r5 = r1.f29858a
                android.database.Cursor r6 = r1.f29852H
                r7 = 0
                r3 = r14
                r4 = r1
                r8 = r13
                r9 = r2
                r3.<init>(r5, r6, r7, r8, r9)
                goto L_0x010e
            L_0x00d6:
                boolean r3 = r1.f29849E
                if (r3 == 0) goto L_0x00de
                int r3 = r2.f29802K
            L_0x00dc:
                r6 = r3
                goto L_0x00e1
            L_0x00de:
                int r3 = r2.f29803L
                goto L_0x00dc
            L_0x00e1:
                android.database.Cursor r3 = r1.f29852H
                r4 = 2132023287(0x7f1417f7, float:1.9685018E38)
                if (r3 != 0) goto L_0x00f9
                android.widget.ListAdapter r3 = r1.f29877t
                if (r3 == 0) goto L_0x00ef
                android.widget.ListAdapter r3 = r1.f29877t
                goto L_0x010d
            L_0x00ef:
                com.bytedance.ies.uikit.dialog.a$c r3 = new com.bytedance.ies.uikit.dialog.a$c
                android.content.Context r5 = r1.f29858a
                java.lang.CharSequence[] r7 = r1.f29876s
                r3.<init>(r5, r6, r4, r7)
                goto L_0x010d
            L_0x00f9:
                android.widget.SimpleCursorAdapter r3 = new android.widget.SimpleCursorAdapter
                android.content.Context r5 = r1.f29858a
                android.database.Cursor r7 = r1.f29852H
                java.lang.String[] r8 = new java.lang.String[r10]
                java.lang.String r9 = r1.f29853I
                r8[r11] = r9
                int[] r9 = new int[r10]
                r9[r11] = r4
                r4 = r3
                r4.<init>(r5, r6, r7, r8, r9)
            L_0x010d:
                r14 = r3
            L_0x010e:
                r2.f29796E = r14
                int r3 = r1.f29850F
                r2.f29797F = r3
                android.content.DialogInterface$OnClickListener r3 = r1.f29878u
                if (r3 == 0) goto L_0x0121
                com.bytedance.ies.uikit.dialog.a$a$3 r3 = new com.bytedance.ies.uikit.dialog.a$a$3
                r3.<init>(r2)
                r13.setOnItemClickListener(r3)
                goto L_0x012d
            L_0x0121:
                android.content.DialogInterface$OnMultiChoiceClickListener r3 = r1.f29851G
                if (r3 == 0) goto L_0x012d
                com.bytedance.ies.uikit.dialog.a$a$4 r3 = new com.bytedance.ies.uikit.dialog.a$a$4
                r3.<init>(r13, r2)
                r13.setOnItemClickListener(r3)
            L_0x012d:
                android.widget.AdapterView$OnItemSelectedListener r3 = r1.f29856L
                if (r3 == 0) goto L_0x0136
                android.widget.AdapterView$OnItemSelectedListener r3 = r1.f29856L
                r13.setOnItemSelectedListener(r3)
            L_0x0136:
                boolean r3 = r1.f29849E
                if (r3 == 0) goto L_0x013e
                r13.setChoiceMode(r10)
                goto L_0x0146
            L_0x013e:
                boolean r3 = r1.f29848D
                if (r3 == 0) goto L_0x0146
                r3 = 2
                r13.setChoiceMode(r3)
            L_0x0146:
                boolean r3 = r1.f29857M
                r13.f29791a = r3
                r2.f29812f = r13
            L_0x014c:
                android.view.View r3 = r1.f29880w
                if (r3 == 0) goto L_0x0176
                boolean r3 = r1.f29846B
                if (r3 == 0) goto L_0x016d
                android.view.View r3 = r1.f29880w
                int r4 = r1.f29881x
                int r5 = r1.f29882y
                int r6 = r1.f29883z
                int r1 = r1.f29845A
                r2.f29813g = r3
                r2.f29814h = r11
                r2.f29819m = r10
                r2.f29815i = r4
                r2.f29816j = r5
                r2.f29817k = r6
                r2.f29818l = r1
                goto L_0x0182
            L_0x016d:
                android.view.View r1 = r1.f29880w
                r2.f29813g = r1
                r2.f29814h = r11
                r2.f29819m = r11
                goto L_0x0182
            L_0x0176:
                int r3 = r1.f29879v
                if (r3 == 0) goto L_0x0182
                int r1 = r1.f29879v
                r2.f29813g = r12
                r2.f29814h = r1
                r2.f29819m = r11
            L_0x0182:
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                boolean r1 = r1.f29872o
                r0.setCancelable(r1)
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                boolean r1 = r1.f29872o
                if (r1 == 0) goto L_0x0192
                r0.setCanceledOnTouchOutside(r10)
            L_0x0192:
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                android.content.DialogInterface$OnCancelListener r1 = r1.f29873p
                r0.setOnCancelListener(r1)
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                android.content.DialogInterface$OnDismissListener r1 = r1.f29874q
                r0.setOnDismissListener(r1)
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                android.content.DialogInterface$OnKeyListener r1 = r1.f29875r
                if (r1 == 0) goto L_0x01ad
                com.bytedance.ies.uikit.dialog.a$a r1 = r15.f29899a
                android.content.DialogInterface$OnKeyListener r1 = r1.f29875r
                r0.setOnKeyListener(r1)
            L_0x01ad:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.C11104b.C11105a.mo20143a():com.bytedance.ies.uikit.dialog.b");
        }

        public C11105a(Context context) {
            this(context, 0);
        }

        /* renamed from: a */
        public final C11105a mo20137a(OnCancelListener onCancelListener) {
            this.f29899a.f29873p = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C11105a mo20146b(CharSequence charSequence) {
            this.f29899a.f29865h = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C11105a mo20135a(int i) {
            this.f29899a.f29863f = this.f29899a.f29858a.getText(i);
            return this;
        }

        /* renamed from: b */
        public final C11105a mo20144b(int i) {
            this.f29899a.f29865h = this.f29899a.f29858a.getText(i);
            return this;
        }

        /* renamed from: a */
        public final C11105a mo20138a(View view) {
            this.f29899a.f29880w = view;
            this.f29899a.f29879v = 0;
            this.f29899a.f29846B = false;
            return this;
        }

        /* renamed from: a */
        public final C11105a mo20139a(CharSequence charSequence) {
            this.f29899a.f29863f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C11105a mo20141a(boolean z) {
            this.f29899a.f29872o = z;
            return this;
        }

        private C11105a(Context context, int i) {
            this.f29899a = new C11097a(new ContextThemeWrapper(context, C11104b.m22449a(context, 0)));
            this.f29900b = 0;
        }

        /* renamed from: a */
        public final C11105a mo20136a(int i, OnClickListener onClickListener) {
            this.f29899a.f29866i = this.f29899a.f29858a.getText(i);
            this.f29899a.f29867j = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C11105a mo20145b(int i, OnClickListener onClickListener) {
            this.f29899a.f29868k = this.f29899a.f29858a.getText(i);
            this.f29899a.f29869l = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C11105a mo20147b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f29899a.f29868k = charSequence;
            this.f29899a.f29869l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C11105a mo20140a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f29899a.f29866i = charSequence;
            this.f29899a.f29867j = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C11105a mo20142a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            this.f29899a.f29876s = charSequenceArr;
            this.f29899a.f29878u = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.b$b */
    public interface C11106b {
    }

    /* renamed from: a */
    static int m22449a(Context context, int i) {
        return i == 1 ? R.style.je : i == 2 ? R.style.jf : i >= 16777216 ? i : R.style.je;
    }

    protected C11104b(Context context) {
        this(context, 0);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f29898a.mo20113a(charSequence);
    }

    /* renamed from: a */
    public final Button mo20129a(int i) {
        C11091a aVar = this.f29898a;
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                return aVar.f29826t;
            case -2:
                return aVar.f29823q;
            case -1:
                return aVar.f29820n;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            com.bytedance.ies.uikit.dialog.a r15 = r14.f29898a
            android.view.Window r0 = r15.f29809c
            r1 = 1
            r0.requestFeature(r1)
            int r0 = r15.f29799H
            if (r0 == 0) goto L_0x0016
            int r0 = r15.f29804M
            if (r0 != r1) goto L_0x0016
            int r0 = r15.f29799H
            goto L_0x0018
        L_0x0016:
            int r0 = r15.f29798G
        L_0x0018:
            android.view.Window r2 = r15.f29809c
            r2.setContentView(r0)
            android.view.Window r0 = r15.f29809c
            r2 = 2132018281(0x7f140469, float:1.9674864E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.Window r2 = r15.f29809c
            r3 = 2132022507(0x7f1414eb, float:1.9683436E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r15.f29829w = r2
            android.widget.ScrollView r2 = r15.f29829w
            r3 = 0
            r2.setFocusable(r3)
            android.view.Window r2 = r15.f29809c
            r4 = 2132021030(0x7f140f26, float:1.968044E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r15.f29793B = r2
            android.widget.TextView r2 = r15.f29793B
            r4 = -1
            r5 = 8
            if (r2 == 0) goto L_0x00d2
            java.lang.CharSequence r2 = r15.f29811e
            if (r2 == 0) goto L_0x005b
            android.widget.TextView r2 = r15.f29793B
            java.lang.CharSequence r6 = r15.f29811e
            r2.setText(r6)
            goto L_0x008a
        L_0x005b:
            android.widget.TextView r2 = r15.f29793B
            r2.setVisibility(r5)
            android.widget.ScrollView r2 = r15.f29829w
            android.widget.TextView r6 = r15.f29793B
            r2.removeView(r6)
            android.widget.ListView r2 = r15.f29812f
            if (r2 == 0) goto L_0x0087
            android.widget.ScrollView r2 = r15.f29829w
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.ScrollView r6 = r15.f29829w
            int r6 = r2.indexOfChild(r6)
            r2.removeViewAt(r6)
            android.widget.ListView r7 = r15.f29812f
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r8.<init>(r4, r4)
            r2.addView(r7, r6, r8)
            goto L_0x008a
        L_0x0087:
            r0.setVisibility(r5)
        L_0x008a:
            android.view.Window r2 = r15.f29809c
            r6 = 2132022506(0x7f1414ea, float:1.9683434E38)
            android.view.View r2 = r2.findViewById(r6)
            android.view.Window r6 = r15.f29809c
            r7 = 2132022505(0x7f1414e9, float:1.9683432E38)
            android.view.View r6 = r6.findViewById(r7)
            if (r2 != 0) goto L_0x00a0
            if (r6 == 0) goto L_0x00d2
        L_0x00a0:
            java.lang.CharSequence r7 = r15.f29811e
            if (r7 == 0) goto L_0x00af
            android.widget.ScrollView r7 = r15.f29829w
            com.bytedance.ies.uikit.dialog.a$3 r8 = new com.bytedance.ies.uikit.dialog.a$3
            r8.<init>(r2, r6)
            r7.post(r8)
            goto L_0x00d2
        L_0x00af:
            android.widget.ListView r7 = r15.f29812f
            if (r7 == 0) goto L_0x00c8
            android.widget.ListView r7 = r15.f29812f
            com.bytedance.ies.uikit.dialog.a$4 r8 = new com.bytedance.ies.uikit.dialog.a$4
            r8.<init>(r2, r6)
            r7.setOnScrollListener(r8)
            android.widget.ListView r7 = r15.f29812f
            com.bytedance.ies.uikit.dialog.a$5 r8 = new com.bytedance.ies.uikit.dialog.a$5
            r8.<init>(r2, r6)
            r7.post(r8)
            goto L_0x00d2
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            r0.removeView(r2)
        L_0x00cd:
            if (r6 == 0) goto L_0x00d2
            r0.removeView(r6)
        L_0x00d2:
            android.view.Window r2 = r15.f29809c
            r6 = 2132017897(0x7f1402e9, float:1.9674085E38)
            android.view.View r2 = r2.findViewById(r6)
            android.widget.Button r2 = (android.widget.Button) r2
            r15.f29820n = r2
            android.widget.Button r2 = r15.f29820n
            android.view.View$OnClickListener r6 = r15.f29806O
            r2.setOnClickListener(r6)
            java.lang.CharSequence r2 = r15.f29821o
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00f5
            android.widget.Button r2 = r15.f29820n
            r2.setVisibility(r5)
            r2 = 0
            goto L_0x0102
        L_0x00f5:
            android.widget.Button r2 = r15.f29820n
            java.lang.CharSequence r6 = r15.f29821o
            r2.setText(r6)
            android.widget.Button r2 = r15.f29820n
            r2.setVisibility(r3)
            r2 = 1
        L_0x0102:
            android.view.Window r6 = r15.f29809c
            r7 = 2132017898(0x7f1402ea, float:1.9674087E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.Button r6 = (android.widget.Button) r6
            r15.f29823q = r6
            android.widget.Button r6 = r15.f29823q
            android.view.View$OnClickListener r7 = r15.f29806O
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r15.f29824r
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0124
            android.widget.Button r6 = r15.f29823q
            r6.setVisibility(r5)
            goto L_0x0132
        L_0x0124:
            android.widget.Button r6 = r15.f29823q
            java.lang.CharSequence r7 = r15.f29824r
            r6.setText(r7)
            android.widget.Button r6 = r15.f29823q
            r6.setVisibility(r3)
            r2 = r2 | 2
        L_0x0132:
            android.view.Window r6 = r15.f29809c
            r7 = 2132017899(0x7f1402eb, float:1.967409E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.Button r6 = (android.widget.Button) r6
            r15.f29826t = r6
            android.widget.Button r6 = r15.f29826t
            android.view.View$OnClickListener r7 = r15.f29806O
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r15.f29827u
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0154
            android.widget.Button r6 = r15.f29826t
            r6.setVisibility(r5)
            goto L_0x0162
        L_0x0154:
            android.widget.Button r6 = r15.f29826t
            java.lang.CharSequence r7 = r15.f29827u
            r6.setText(r7)
            android.widget.Button r6 = r15.f29826t
            r6.setVisibility(r3)
            r2 = r2 | 4
        L_0x0162:
            if (r2 == 0) goto L_0x0166
            r2 = 1
            goto L_0x0167
        L_0x0166:
            r2 = 0
        L_0x0167:
            android.view.Window r6 = r15.f29809c
            r7 = 2132023461(0x7f1418a5, float:1.968537E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r7 = r15.f29794C
            r8 = 2132023427(0x7f141883, float:1.9685302E38)
            if (r7 == 0) goto L_0x018e
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r7.<init>(r4, r9)
            android.view.View r9 = r15.f29794C
            r6.addView(r9, r3, r7)
            android.view.Window r7 = r15.f29809c
            android.view.View r7 = r7.findViewById(r8)
            r7.setVisibility(r5)
            goto L_0x01f2
        L_0x018e:
            android.view.Window r7 = r15.f29809c
            r9 = 2132019564(0x7f14096c, float:1.9677466E38)
            android.view.View r7 = r7.findViewById(r9)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r15.f29832z = r7
            java.lang.CharSequence r7 = r15.f29810d
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x01f4
            android.view.Window r7 = r15.f29809c
            r8 = 2132017384(0x7f1400e8, float:1.9673045E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r15.f29792A = r7
            android.widget.TextView r7 = r15.f29792A
            java.lang.CharSequence r8 = r15.f29810d
            r7.setText(r8)
            int r7 = r15.f29830x
            if (r7 == 0) goto L_0x01c4
            android.widget.ImageView r7 = r15.f29832z
            int r8 = r15.f29830x
            r7.setImageResource(r8)
            goto L_0x01f2
        L_0x01c4:
            android.graphics.drawable.Drawable r7 = r15.f29831y
            if (r7 == 0) goto L_0x01d0
            android.widget.ImageView r7 = r15.f29832z
            android.graphics.drawable.Drawable r8 = r15.f29831y
            r7.setImageDrawable(r8)
            goto L_0x01f2
        L_0x01d0:
            android.widget.TextView r7 = r15.f29792A
            android.widget.ImageView r8 = r15.f29832z
            int r8 = r8.getPaddingLeft()
            android.widget.ImageView r9 = r15.f29832z
            int r9 = r9.getPaddingTop()
            android.widget.ImageView r10 = r15.f29832z
            int r10 = r10.getPaddingRight()
            android.widget.ImageView r11 = r15.f29832z
            int r11 = r11.getPaddingBottom()
            r7.setPadding(r8, r9, r10, r11)
            android.widget.ImageView r7 = r15.f29832z
            r7.setVisibility(r5)
        L_0x01f2:
            r7 = 1
            goto L_0x0206
        L_0x01f4:
            android.view.Window r7 = r15.f29809c
            android.view.View r7 = r7.findViewById(r8)
            r7.setVisibility(r5)
            android.widget.ImageView r7 = r15.f29832z
            r7.setVisibility(r5)
            r6.setVisibility(r5)
            r7 = 0
        L_0x0206:
            android.view.Window r8 = r15.f29809c
            r9 = 2132017902(0x7f1402ee, float:1.9674096E38)
            android.view.View r8 = r8.findViewById(r9)
            if (r2 != 0) goto L_0x0241
            r8.setVisibility(r5)
            java.lang.CharSequence r8 = r15.f29811e
            if (r8 != 0) goto L_0x0241
            android.widget.ListView r8 = r15.f29812f
            if (r8 == 0) goto L_0x0241
            android.widget.ListView r8 = r15.f29812f
            android.view.ViewParent r8 = r8.getParent()
            if (r8 == 0) goto L_0x0241
            android.widget.ListView r8 = r15.f29812f
            android.widget.ListView r9 = r15.f29812f
            int r9 = r9.getPaddingLeft()
            android.widget.ListView r10 = r15.f29812f
            int r10 = r10.getPaddingTop()
            android.widget.ListView r11 = r15.f29812f
            int r11 = r11.getPaddingRight()
            android.widget.ListView r12 = r15.f29812f
            int r12 = r12.getPaddingTop()
            r8.setPadding(r9, r10, r11, r12)
        L_0x0241:
            android.view.Window r8 = r15.f29809c
            r9 = 2132018423(0x7f1404f7, float:1.9675152E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            android.view.View r9 = r15.f29813g
            if (r9 == 0) goto L_0x0253
            android.view.View r9 = r15.f29813g
            goto L_0x0265
        L_0x0253:
            int r9 = r15.f29814h
            if (r9 == 0) goto L_0x0264
            android.content.Context r9 = r15.f29807a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r10 = r15.f29814h
            android.view.View r9 = r9.inflate(r10, r8, r3)
            goto L_0x0265
        L_0x0264:
            r9 = 0
        L_0x0265:
            if (r9 == 0) goto L_0x0269
            r10 = 1
            goto L_0x026a
        L_0x0269:
            r10 = 0
        L_0x026a:
            if (r10 == 0) goto L_0x0272
            boolean r11 = com.bytedance.ies.uikit.dialog.C11091a.m22444a(r9)
            if (r11 != 0) goto L_0x0279
        L_0x0272:
            android.view.Window r11 = r15.f29809c
            r12 = 131072(0x20000, float:1.83671E-40)
            r11.setFlags(r12, r12)
        L_0x0279:
            if (r10 == 0) goto L_0x02ab
            android.view.Window r5 = r15.f29809c
            r11 = 2132018422(0x7f1404f6, float:1.967515E38)
            android.view.View r5 = r5.findViewById(r11)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r4, r4)
            r5.addView(r9, r11)
            boolean r4 = r15.f29819m
            if (r4 == 0) goto L_0x029d
            int r4 = r15.f29815i
            int r11 = r15.f29816j
            int r12 = r15.f29817k
            int r13 = r15.f29818l
            r5.setPadding(r4, r11, r12, r13)
        L_0x029d:
            android.widget.ListView r4 = r15.f29812f
            if (r4 == 0) goto L_0x02ae
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r5 = 0
            r4.weight = r5
            goto L_0x02ae
        L_0x02ab:
            r8.setVisibility(r5)
        L_0x02ae:
            if (r7 == 0) goto L_0x02d3
            java.lang.CharSequence r4 = r15.f29811e
            if (r4 != 0) goto L_0x02c5
            if (r9 != 0) goto L_0x02c5
            android.widget.ListView r4 = r15.f29812f
            if (r4 == 0) goto L_0x02bb
            goto L_0x02c5
        L_0x02bb:
            android.view.Window r4 = r15.f29809c
            r5 = 2132023398(0x7f141866, float:1.9685243E38)
            android.view.View r4 = r4.findViewById(r5)
            goto L_0x02ce
        L_0x02c5:
            android.view.Window r4 = r15.f29809c
            r5 = 2132023396(0x7f141864, float:1.9685239E38)
            android.view.View r4 = r4.findViewById(r5)
        L_0x02ce:
            if (r4 == 0) goto L_0x02d3
            r4.setVisibility(r3)
        L_0x02d3:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02da
            r3 = 1
        L_0x02da:
            if (r2 == 0) goto L_0x02ef
            if (r7 == 0) goto L_0x02ef
            if (r10 != 0) goto L_0x02ef
            if (r3 != 0) goto L_0x02ef
            android.content.Context r0 = r15.f29807a
            r2 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r2)
            int r0 = (int) r0
            r2 = -3
            com.bytedance.common.utility.C9432q.m18680a(r6, r2, r2, r2, r0)
        L_0x02ef:
            android.widget.ListView r0 = r15.f29812f
            if (r0 == 0) goto L_0x0306
            android.widget.ListAdapter r2 = r15.f29796E
            if (r2 == 0) goto L_0x0306
            android.widget.ListAdapter r2 = r15.f29796E
            r0.setAdapter(r2)
            int r2 = r15.f29797F
            if (r2 < 0) goto L_0x0306
            r0.setItemChecked(r2, r1)
            r0.setSelection(r2)
        L_0x0306:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 20
            if (r0 < r2) goto L_0x032d
            android.view.Window r0 = r15.f29809c
            android.view.View r0 = r0.getDecorView()
            android.view.Window r2 = r15.f29809c
            r3 = 2132021499(0x7f1410fb, float:1.9681391E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x032d
            if (r0 == 0) goto L_0x032d
            com.bytedance.ies.uikit.dialog.a$2 r3 = new com.bytedance.ies.uikit.dialog.a$2
            r3.<init>(r2)
            r0.setOnApplyWindowInsetsListener(r3)
            r0.setFitsSystemWindows(r1)
            r0.requestApplyInsets()
        L_0x032d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.C11104b.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        C11091a aVar = this.f29898a;
        if (aVar.f29829w == null || !aVar.f29829w.executeKeyEvent(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        C11091a aVar = this.f29898a;
        if (aVar.f29829w == null || !aVar.f29829w.executeKeyEvent(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected C11104b(Context context, int i) {
        super(context, m22449a(context, i));
        this.f29898a = new C11091a(getContext(), this, getWindow());
        if (f29897b == null) {
            throw new IllegalArgumentException("NightMode is NUll");
        }
    }

    /* renamed from: a */
    public final void mo20130a(int i, CharSequence charSequence, OnClickListener onClickListener) {
        this.f29898a.mo20112a(i, charSequence, null, null);
    }
}
