package com.bytedance.android.live.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.live.uikit.dialog.C4207a.C4213a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.uikit.dialog.b */
public final class C4220b extends Dialog implements DialogInterface {

    /* renamed from: b */
    public static C4222b f11523b;

    /* renamed from: a */
    public C4207a f11524a = new C4207a(getContext(), this, getWindow());

    /* renamed from: com.bytedance.android.live.uikit.dialog.b$a */
    public static class C4221a {

        /* renamed from: a */
        public final C4213a f11525a;

        /* renamed from: b */
        private int f11526b;

        /* renamed from: b */
        public final C4220b mo9696b() {
            C4220b a = mo9692a();
            a.show();
            return a;
        }

        /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r3v29 */
        /* JADX WARNING: type inference failed for: r14v1 */
        /* JADX WARNING: type inference failed for: r4v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r3v32, types: [com.bytedance.android.live.uikit.dialog.a$c] */
        /* JADX WARNING: type inference failed for: r3v33, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r3v36, types: [com.bytedance.android.live.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r3v37, types: [com.bytedance.android.live.uikit.dialog.a$a$1] */
        /* JADX WARNING: type inference failed for: r4v15, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r3v55 */
        /* JADX WARNING: type inference failed for: r3v56 */
        /* JADX WARNING: type inference failed for: r3v57, types: [com.bytedance.android.live.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r3v58, types: [com.bytedance.android.live.uikit.dialog.a$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v1
          assigns: [?[OBJECT, ARRAY], com.bytedance.android.live.uikit.dialog.a$a$2, com.bytedance.android.live.uikit.dialog.a$a$1]
          uses: [android.widget.ListAdapter, com.bytedance.android.live.uikit.dialog.a$a$2, com.bytedance.android.live.uikit.dialog.a$a$1]
          mth insns count: 189
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.android.live.uikit.dialog.C4220b mo9692a() {
            /*
                r15 = this;
                com.bytedance.android.live.uikit.dialog.b r0 = new com.bytedance.android.live.uikit.dialog.b
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                android.content.Context r1 = r1.f11484a
                int r2 = r15.f11526b
                r0.<init>(r1, r2)
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                com.bytedance.android.live.uikit.dialog.a r2 = r0.f11524a
                android.view.View r3 = r1.f11490g
                r10 = 1
                r11 = 0
                if (r3 == 0) goto L_0x001a
                android.view.View r3 = r1.f11490g
                r2.f11420C = r3
                goto L_0x0062
            L_0x001a:
                java.lang.CharSequence r3 = r1.f11489f
                if (r3 == 0) goto L_0x0023
                java.lang.CharSequence r3 = r1.f11489f
                r2.mo9665a(r3)
            L_0x0023:
                android.graphics.drawable.Drawable r3 = r1.f11487d
                if (r3 == 0) goto L_0x0040
                android.graphics.drawable.Drawable r3 = r1.f11487d
                r2.f11457y = r3
                r2.f11456x = r11
                android.widget.ImageView r4 = r2.f11458z
                if (r4 == 0) goto L_0x0040
                if (r3 == 0) goto L_0x0039
                android.widget.ImageView r4 = r2.f11458z
                r4.setImageDrawable(r3)
                goto L_0x0040
            L_0x0039:
                android.widget.ImageView r3 = r2.f11458z
                r4 = 8
                r3.setVisibility(r4)
            L_0x0040:
                int r3 = r1.f11486c
                if (r3 == 0) goto L_0x0049
                int r3 = r1.f11486c
                r2.mo9663a(r3)
            L_0x0049:
                int r3 = r1.f11488e
                if (r3 == 0) goto L_0x0062
                int r3 = r1.f11488e
                android.util.TypedValue r4 = new android.util.TypedValue
                r4.<init>()
                android.content.Context r5 = r2.f11433a
                android.content.res.Resources$Theme r5 = r5.getTheme()
                r5.resolveAttribute(r3, r4, r10)
                int r3 = r4.resourceId
                r2.mo9663a(r3)
            L_0x0062:
                java.lang.CharSequence r3 = r1.f11491h
                if (r3 == 0) goto L_0x0073
                java.lang.CharSequence r3 = r1.f11491h
                r2.f11437e = r3
                android.widget.TextView r4 = r2.f11419B
                if (r4 == 0) goto L_0x0073
                android.widget.TextView r4 = r2.f11419B
                r4.setText(r3)
            L_0x0073:
                java.lang.CharSequence r3 = r1.f11492i
                r12 = 0
                if (r3 == 0) goto L_0x0080
                r3 = -1
                java.lang.CharSequence r4 = r1.f11492i
                android.content.DialogInterface$OnClickListener r5 = r1.f11493j
                r2.mo9664a(r3, r4, r5, r12)
            L_0x0080:
                java.lang.CharSequence r3 = r1.f11494k
                if (r3 == 0) goto L_0x008c
                r3 = -2
                java.lang.CharSequence r4 = r1.f11494k
                android.content.DialogInterface$OnClickListener r5 = r1.f11495l
                r2.mo9664a(r3, r4, r5, r12)
            L_0x008c:
                java.lang.CharSequence r3 = r1.f11496m
                if (r3 == 0) goto L_0x0098
                r3 = -3
                java.lang.CharSequence r4 = r1.f11496m
                android.content.DialogInterface$OnClickListener r5 = r1.f11497n
                r2.mo9664a(r3, r4, r5, r12)
            L_0x0098:
                boolean r3 = r1.f11481K
                if (r3 == 0) goto L_0x009e
                r2.f11421D = r10
            L_0x009e:
                java.lang.CharSequence[] r3 = r1.f11502s
                if (r3 != 0) goto L_0x00aa
                android.database.Cursor r3 = r1.f11478H
                if (r3 != 0) goto L_0x00aa
                android.widget.ListAdapter r3 = r1.f11503t
                if (r3 == 0) goto L_0x0154
            L_0x00aa:
                android.view.LayoutInflater r3 = r1.f11485b
                int r4 = r2.f11426I
                android.view.View r3 = r3.inflate(r4, r12)
                r13 = r3
                com.bytedance.android.live.uikit.dialog.RecycleListView r13 = (com.bytedance.android.live.uikit.dialog.RecycleListView) r13
                boolean r3 = r1.f11474D
                if (r3 == 0) goto L_0x00de
                android.database.Cursor r3 = r1.f11478H
                if (r3 != 0) goto L_0x00cf
                com.bytedance.android.live.uikit.dialog.a$a$1 r14 = new com.bytedance.android.live.uikit.dialog.a$a$1
                android.content.Context r5 = r1.f11484a
                int r6 = r2.f11427J
                r7 = 2132023287(0x7f1417f7, float:1.9685018E38)
                java.lang.CharSequence[] r8 = r1.f11502s
                r3 = r14
                r4 = r1
                r9 = r13
                r3.<init>(r5, r6, r7, r8, r9)
                goto L_0x0116
            L_0x00cf:
                com.bytedance.android.live.uikit.dialog.a$a$2 r14 = new com.bytedance.android.live.uikit.dialog.a$a$2
                android.content.Context r5 = r1.f11484a
                android.database.Cursor r6 = r1.f11478H
                r7 = 0
                r3 = r14
                r4 = r1
                r8 = r13
                r9 = r2
                r3.<init>(r5, r6, r7, r8, r9)
                goto L_0x0116
            L_0x00de:
                boolean r3 = r1.f11475E
                if (r3 == 0) goto L_0x00e6
                int r3 = r2.f11428K
            L_0x00e4:
                r6 = r3
                goto L_0x00e9
            L_0x00e6:
                int r3 = r2.f11429L
                goto L_0x00e4
            L_0x00e9:
                android.database.Cursor r3 = r1.f11478H
                r4 = 2132023287(0x7f1417f7, float:1.9685018E38)
                if (r3 != 0) goto L_0x0101
                android.widget.ListAdapter r3 = r1.f11503t
                if (r3 == 0) goto L_0x00f7
                android.widget.ListAdapter r3 = r1.f11503t
                goto L_0x0115
            L_0x00f7:
                com.bytedance.android.live.uikit.dialog.a$c r3 = new com.bytedance.android.live.uikit.dialog.a$c
                android.content.Context r5 = r1.f11484a
                java.lang.CharSequence[] r7 = r1.f11502s
                r3.<init>(r5, r6, r4, r7)
                goto L_0x0115
            L_0x0101:
                android.widget.SimpleCursorAdapter r3 = new android.widget.SimpleCursorAdapter
                android.content.Context r5 = r1.f11484a
                android.database.Cursor r7 = r1.f11478H
                java.lang.String[] r8 = new java.lang.String[r10]
                java.lang.String r9 = r1.f11479I
                r8[r11] = r9
                int[] r9 = new int[r10]
                r9[r11] = r4
                r4 = r3
                r4.<init>(r5, r6, r7, r8, r9)
            L_0x0115:
                r14 = r3
            L_0x0116:
                r2.f11422E = r14
                int r3 = r1.f11476F
                r2.f11423F = r3
                android.content.DialogInterface$OnClickListener r3 = r1.f11504u
                if (r3 == 0) goto L_0x0129
                com.bytedance.android.live.uikit.dialog.a$a$3 r3 = new com.bytedance.android.live.uikit.dialog.a$a$3
                r3.<init>(r2)
                r13.setOnItemClickListener(r3)
                goto L_0x0135
            L_0x0129:
                android.content.DialogInterface$OnMultiChoiceClickListener r3 = r1.f11477G
                if (r3 == 0) goto L_0x0135
                com.bytedance.android.live.uikit.dialog.a$a$4 r3 = new com.bytedance.android.live.uikit.dialog.a$a$4
                r3.<init>(r13, r2)
                r13.setOnItemClickListener(r3)
            L_0x0135:
                android.widget.AdapterView$OnItemSelectedListener r3 = r1.f11482L
                if (r3 == 0) goto L_0x013e
                android.widget.AdapterView$OnItemSelectedListener r3 = r1.f11482L
                r13.setOnItemSelectedListener(r3)
            L_0x013e:
                boolean r3 = r1.f11475E
                if (r3 == 0) goto L_0x0146
                r13.setChoiceMode(r10)
                goto L_0x014e
            L_0x0146:
                boolean r3 = r1.f11474D
                if (r3 == 0) goto L_0x014e
                r3 = 2
                r13.setChoiceMode(r3)
            L_0x014e:
                boolean r3 = r1.f11483M
                r13.f11417a = r3
                r2.f11438f = r13
            L_0x0154:
                android.view.View r3 = r1.f11506w
                if (r3 == 0) goto L_0x017e
                boolean r3 = r1.f11472B
                if (r3 == 0) goto L_0x0175
                android.view.View r3 = r1.f11506w
                int r4 = r1.f11507x
                int r5 = r1.f11508y
                int r6 = r1.f11509z
                int r1 = r1.f11471A
                r2.f11439g = r3
                r2.f11440h = r11
                r2.f11445m = r10
                r2.f11441i = r4
                r2.f11442j = r5
                r2.f11443k = r6
                r2.f11444l = r1
                goto L_0x018a
            L_0x0175:
                android.view.View r1 = r1.f11506w
                r2.f11439g = r1
                r2.f11440h = r11
                r2.f11445m = r11
                goto L_0x018a
            L_0x017e:
                int r3 = r1.f11505v
                if (r3 == 0) goto L_0x018a
                int r1 = r1.f11505v
                r2.f11439g = r12
                r2.f11440h = r1
                r2.f11445m = r11
            L_0x018a:
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                boolean r1 = r1.f11498o
                r0.setCancelable(r1)
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                boolean r1 = r1.f11498o
                if (r1 == 0) goto L_0x019a
                r0.setCanceledOnTouchOutside(r10)
            L_0x019a:
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                android.content.DialogInterface$OnCancelListener r1 = r1.f11499p
                r0.setOnCancelListener(r1)
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                android.content.DialogInterface$OnDismissListener r1 = r1.f11500q
                r0.setOnDismissListener(r1)
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                android.content.DialogInterface$OnKeyListener r1 = r1.f11501r
                if (r1 == 0) goto L_0x01b5
                com.bytedance.android.live.uikit.dialog.a$a r1 = r15.f11525a
                android.content.DialogInterface$OnKeyListener r1 = r1.f11501r
                r0.setOnKeyListener(r1)
            L_0x01b5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.dialog.C4220b.C4221a.mo9692a():com.bytedance.android.live.uikit.dialog.b");
        }

        public C4221a(Context context) {
            this(context, 0);
        }

        /* renamed from: a */
        public final C4221a mo9686a(OnCancelListener onCancelListener) {
            this.f11525a.f11499p = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C4221a mo9695b(CharSequence charSequence) {
            this.f11525a.f11491h = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C4221a mo9684a(int i) {
            this.f11525a.f11489f = this.f11525a.f11484a.getText(i);
            return this;
        }

        /* renamed from: b */
        public final C4221a mo9693b(int i) {
            this.f11525a.f11491h = this.f11525a.f11484a.getText(i);
            return this;
        }

        /* renamed from: a */
        public final C4221a mo9687a(OnDismissListener onDismissListener) {
            this.f11525a.f11500q = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C4221a mo9688a(View view) {
            this.f11525a.f11490g = view;
            return this;
        }

        /* renamed from: a */
        public final C4221a mo9689a(CharSequence charSequence) {
            this.f11525a.f11489f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C4221a mo9691a(boolean z) {
            this.f11525a.f11498o = z;
            return this;
        }

        public C4221a(Context context, int i) {
            this.f11525a = new C4213a(new ContextThemeWrapper(context, C4220b.m10432a(context, i)));
            this.f11526b = i;
        }

        /* renamed from: a */
        public final C4221a mo9685a(int i, OnClickListener onClickListener) {
            this.f11525a.f11492i = this.f11525a.f11484a.getText(i);
            this.f11525a.f11493j = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C4221a mo9694b(int i, OnClickListener onClickListener) {
            this.f11525a.f11494k = this.f11525a.f11484a.getText(i);
            this.f11525a.f11495l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C4221a mo9690a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f11525a.f11492i = charSequence;
            this.f11525a.f11493j = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.b$b */
    public interface C4222b {
        /* renamed from: a */
        boolean mo9697a();
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f11524a.mo9665a(charSequence);
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
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            com.bytedance.android.live.uikit.dialog.a r15 = r14.f11524a
            android.view.Window r0 = r15.f11435c
            r1 = 1
            r0.requestFeature(r1)
            int r0 = r15.f11425H
            if (r0 == 0) goto L_0x0016
            int r0 = r15.f11430M
            if (r0 != r1) goto L_0x0016
            int r0 = r15.f11425H
            goto L_0x0018
        L_0x0016:
            int r0 = r15.f11424G
        L_0x0018:
            android.view.Window r2 = r15.f11435c
            r2.setContentView(r0)
            android.view.Window r0 = r15.f11435c
            r2 = 2132018281(0x7f140469, float:1.9674864E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.Window r2 = r15.f11435c
            r3 = 2132022507(0x7f1414eb, float:1.9683436E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r15.f11455w = r2
            android.widget.ScrollView r2 = r15.f11455w
            r3 = 0
            r2.setFocusable(r3)
            android.view.Window r2 = r15.f11435c
            r4 = 2132021030(0x7f140f26, float:1.968044E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r15.f11419B = r2
            android.widget.TextView r2 = r15.f11419B
            r4 = -1
            r5 = 8
            if (r2 == 0) goto L_0x00d2
            java.lang.CharSequence r2 = r15.f11437e
            if (r2 == 0) goto L_0x005b
            android.widget.TextView r2 = r15.f11419B
            java.lang.CharSequence r6 = r15.f11437e
            r2.setText(r6)
            goto L_0x008a
        L_0x005b:
            android.widget.TextView r2 = r15.f11419B
            r2.setVisibility(r5)
            android.widget.ScrollView r2 = r15.f11455w
            android.widget.TextView r6 = r15.f11419B
            r2.removeView(r6)
            android.widget.ListView r2 = r15.f11438f
            if (r2 == 0) goto L_0x0087
            android.widget.ScrollView r2 = r15.f11455w
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.ScrollView r6 = r15.f11455w
            int r6 = r2.indexOfChild(r6)
            r2.removeViewAt(r6)
            android.widget.ListView r7 = r15.f11438f
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r8.<init>(r4, r4)
            r2.addView(r7, r6, r8)
            goto L_0x008a
        L_0x0087:
            r0.setVisibility(r5)
        L_0x008a:
            android.view.Window r2 = r15.f11435c
            r6 = 2132022506(0x7f1414ea, float:1.9683434E38)
            android.view.View r2 = r2.findViewById(r6)
            android.view.Window r6 = r15.f11435c
            r7 = 2132022505(0x7f1414e9, float:1.9683432E38)
            android.view.View r6 = r6.findViewById(r7)
            if (r2 != 0) goto L_0x00a0
            if (r6 == 0) goto L_0x00d2
        L_0x00a0:
            java.lang.CharSequence r7 = r15.f11437e
            if (r7 == 0) goto L_0x00af
            android.widget.ScrollView r7 = r15.f11455w
            com.bytedance.android.live.uikit.dialog.a$3 r8 = new com.bytedance.android.live.uikit.dialog.a$3
            r8.<init>(r2, r6)
            r7.post(r8)
            goto L_0x00d2
        L_0x00af:
            android.widget.ListView r7 = r15.f11438f
            if (r7 == 0) goto L_0x00c8
            android.widget.ListView r7 = r15.f11438f
            com.bytedance.android.live.uikit.dialog.a$4 r8 = new com.bytedance.android.live.uikit.dialog.a$4
            r8.<init>(r2, r6)
            r7.setOnScrollListener(r8)
            android.widget.ListView r7 = r15.f11438f
            com.bytedance.android.live.uikit.dialog.a$5 r8 = new com.bytedance.android.live.uikit.dialog.a$5
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
            android.view.Window r2 = r15.f11435c
            r6 = 2132017897(0x7f1402e9, float:1.9674085E38)
            android.view.View r2 = r2.findViewById(r6)
            android.widget.Button r2 = (android.widget.Button) r2
            r15.f11446n = r2
            android.widget.Button r2 = r15.f11446n
            android.view.View$OnClickListener r6 = r15.f11432O
            r2.setOnClickListener(r6)
            java.lang.CharSequence r2 = r15.f11447o
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00f5
            android.widget.Button r2 = r15.f11446n
            r2.setVisibility(r5)
            r2 = 0
            goto L_0x0102
        L_0x00f5:
            android.widget.Button r2 = r15.f11446n
            java.lang.CharSequence r6 = r15.f11447o
            r2.setText(r6)
            android.widget.Button r2 = r15.f11446n
            r2.setVisibility(r3)
            r2 = 1
        L_0x0102:
            android.view.Window r6 = r15.f11435c
            r7 = 2132017898(0x7f1402ea, float:1.9674087E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.Button r6 = (android.widget.Button) r6
            r15.f11449q = r6
            android.widget.Button r6 = r15.f11449q
            android.view.View$OnClickListener r7 = r15.f11432O
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r15.f11450r
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0124
            android.widget.Button r6 = r15.f11449q
            r6.setVisibility(r5)
            goto L_0x0132
        L_0x0124:
            android.widget.Button r6 = r15.f11449q
            java.lang.CharSequence r7 = r15.f11450r
            r6.setText(r7)
            android.widget.Button r6 = r15.f11449q
            r6.setVisibility(r3)
            r2 = r2 | 2
        L_0x0132:
            android.view.Window r6 = r15.f11435c
            r7 = 2132017899(0x7f1402eb, float:1.967409E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.Button r6 = (android.widget.Button) r6
            r15.f11452t = r6
            android.widget.Button r6 = r15.f11452t
            android.view.View$OnClickListener r7 = r15.f11432O
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r15.f11453u
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0154
            android.widget.Button r6 = r15.f11452t
            r6.setVisibility(r5)
            goto L_0x0162
        L_0x0154:
            android.widget.Button r6 = r15.f11452t
            java.lang.CharSequence r7 = r15.f11453u
            r6.setText(r7)
            android.widget.Button r6 = r15.f11452t
            r6.setVisibility(r3)
            r2 = r2 | 4
        L_0x0162:
            if (r2 == 0) goto L_0x0166
            r2 = 1
            goto L_0x0167
        L_0x0166:
            r2 = 0
        L_0x0167:
            android.view.Window r6 = r15.f11435c
            r7 = 2132023461(0x7f1418a5, float:1.968537E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r7 = r15.f11420C
            r8 = 2132023427(0x7f141883, float:1.9685302E38)
            if (r7 == 0) goto L_0x018e
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r7.<init>(r4, r9)
            android.view.View r9 = r15.f11420C
            r6.addView(r9, r3, r7)
            android.view.Window r7 = r15.f11435c
            android.view.View r7 = r7.findViewById(r8)
            r7.setVisibility(r5)
            goto L_0x01f2
        L_0x018e:
            android.view.Window r7 = r15.f11435c
            r9 = 2132019564(0x7f14096c, float:1.9677466E38)
            android.view.View r7 = r7.findViewById(r9)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r15.f11458z = r7
            java.lang.CharSequence r7 = r15.f11436d
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x01f4
            android.view.Window r7 = r15.f11435c
            r8 = 2132017384(0x7f1400e8, float:1.9673045E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r15.f11418A = r7
            android.widget.TextView r7 = r15.f11418A
            java.lang.CharSequence r8 = r15.f11436d
            r7.setText(r8)
            int r7 = r15.f11456x
            if (r7 == 0) goto L_0x01c4
            android.widget.ImageView r7 = r15.f11458z
            int r8 = r15.f11456x
            r7.setImageResource(r8)
            goto L_0x01f2
        L_0x01c4:
            android.graphics.drawable.Drawable r7 = r15.f11457y
            if (r7 == 0) goto L_0x01d0
            android.widget.ImageView r7 = r15.f11458z
            android.graphics.drawable.Drawable r8 = r15.f11457y
            r7.setImageDrawable(r8)
            goto L_0x01f2
        L_0x01d0:
            android.widget.TextView r7 = r15.f11418A
            android.widget.ImageView r8 = r15.f11458z
            int r8 = r8.getPaddingLeft()
            android.widget.ImageView r9 = r15.f11458z
            int r9 = r9.getPaddingTop()
            android.widget.ImageView r10 = r15.f11458z
            int r10 = r10.getPaddingRight()
            android.widget.ImageView r11 = r15.f11458z
            int r11 = r11.getPaddingBottom()
            r7.setPadding(r8, r9, r10, r11)
            android.widget.ImageView r7 = r15.f11458z
            r7.setVisibility(r5)
        L_0x01f2:
            r7 = 1
            goto L_0x0206
        L_0x01f4:
            android.view.Window r7 = r15.f11435c
            android.view.View r7 = r7.findViewById(r8)
            r7.setVisibility(r5)
            android.widget.ImageView r7 = r15.f11458z
            r7.setVisibility(r5)
            r6.setVisibility(r5)
            r7 = 0
        L_0x0206:
            android.view.Window r8 = r15.f11435c
            r9 = 2132017902(0x7f1402ee, float:1.9674096E38)
            android.view.View r8 = r8.findViewById(r9)
            if (r2 != 0) goto L_0x0241
            r8.setVisibility(r5)
            java.lang.CharSequence r8 = r15.f11437e
            if (r8 != 0) goto L_0x0241
            android.widget.ListView r8 = r15.f11438f
            if (r8 == 0) goto L_0x0241
            android.widget.ListView r8 = r15.f11438f
            android.view.ViewParent r8 = r8.getParent()
            if (r8 == 0) goto L_0x0241
            android.widget.ListView r8 = r15.f11438f
            android.widget.ListView r9 = r15.f11438f
            int r9 = r9.getPaddingLeft()
            android.widget.ListView r10 = r15.f11438f
            int r10 = r10.getPaddingTop()
            android.widget.ListView r11 = r15.f11438f
            int r11 = r11.getPaddingRight()
            android.widget.ListView r12 = r15.f11438f
            int r12 = r12.getPaddingTop()
            r8.setPadding(r9, r10, r11, r12)
        L_0x0241:
            android.view.Window r8 = r15.f11435c
            r9 = 2132018423(0x7f1404f7, float:1.9675152E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            android.view.View r9 = r15.f11439g
            if (r9 == 0) goto L_0x0253
            android.view.View r9 = r15.f11439g
            goto L_0x0265
        L_0x0253:
            int r9 = r15.f11440h
            if (r9 == 0) goto L_0x0264
            android.content.Context r9 = r15.f11433a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r10 = r15.f11440h
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
            boolean r11 = com.bytedance.android.live.uikit.dialog.C4207a.m10428a(r9)
            if (r11 != 0) goto L_0x0279
        L_0x0272:
            android.view.Window r11 = r15.f11435c
            r12 = 131072(0x20000, float:1.83671E-40)
            r11.setFlags(r12, r12)
        L_0x0279:
            if (r10 == 0) goto L_0x02ab
            android.view.Window r5 = r15.f11435c
            r11 = 2132018422(0x7f1404f6, float:1.967515E38)
            android.view.View r5 = r5.findViewById(r11)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r4, r4)
            r5.addView(r9, r11)
            boolean r4 = r15.f11445m
            if (r4 == 0) goto L_0x029d
            int r4 = r15.f11441i
            int r11 = r15.f11442j
            int r12 = r15.f11443k
            int r13 = r15.f11444l
            r5.setPadding(r4, r11, r12, r13)
        L_0x029d:
            android.widget.ListView r4 = r15.f11438f
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
            java.lang.CharSequence r4 = r15.f11437e
            if (r4 != 0) goto L_0x02c5
            if (r9 != 0) goto L_0x02c5
            android.widget.ListView r4 = r15.f11438f
            if (r4 == 0) goto L_0x02bb
            goto L_0x02c5
        L_0x02bb:
            android.view.Window r4 = r15.f11435c
            r5 = 2132023398(0x7f141866, float:1.9685243E38)
            android.view.View r4 = r4.findViewById(r5)
            goto L_0x02ce
        L_0x02c5:
            android.view.Window r4 = r15.f11435c
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
            android.content.Context r0 = r15.f11433a
            r2 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r2)
            int r0 = (int) r0
            r2 = -3
            com.bytedance.common.utility.C9432q.m18680a(r6, r2, r2, r2, r0)
        L_0x02ef:
            android.widget.ListView r0 = r15.f11438f
            if (r0 == 0) goto L_0x0306
            android.widget.ListAdapter r2 = r15.f11422E
            if (r2 == 0) goto L_0x0306
            android.widget.ListAdapter r2 = r15.f11422E
            r0.setAdapter(r2)
            int r2 = r15.f11423F
            if (r2 < 0) goto L_0x0306
            r0.setItemChecked(r2, r1)
            r0.setSelection(r2)
        L_0x0306:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 20
            if (r0 < r2) goto L_0x032d
            android.view.Window r0 = r15.f11435c
            android.view.View r0 = r0.getDecorView()
            android.view.Window r2 = r15.f11435c
            r3 = 2132021499(0x7f1410fb, float:1.9681391E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x032d
            if (r0 == 0) goto L_0x032d
            com.bytedance.android.live.uikit.dialog.a$2 r3 = new com.bytedance.android.live.uikit.dialog.a$2
            r3.<init>(r2)
            r0.setOnApplyWindowInsetsListener(r3)
            r0.setFitsSystemWindows(r1)
            r0.requestApplyInsets()
        L_0x032d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.dialog.C4220b.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        C4207a aVar = this.f11524a;
        if (aVar.f11455w == null || !aVar.f11455w.executeKeyEvent(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        C4207a aVar = this.f11524a;
        if (aVar.f11455w == null || !aVar.f11455w.executeKeyEvent(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected C4220b(Context context, int i) {
        super(context, m10432a(context, i));
        if (f11523b == null) {
            throw new IllegalArgumentException("NightMode is NUll");
        }
    }

    /* renamed from: a */
    static int m10432a(Context context, int i) {
        if (i == 1) {
            return R.style.je;
        }
        if (i == 2) {
            return R.style.jf;
        }
        if (i >= 16777216) {
            return i;
        }
        if (f11523b == null || !f11523b.mo9697a()) {
            return R.style.je;
        }
        return R.style.jf;
    }
}
