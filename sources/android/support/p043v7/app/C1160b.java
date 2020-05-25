package android.support.p043v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.widget.NestedScrollView;
import android.support.p030v4.widget.NestedScrollView.C1078b;
import android.support.p043v7.app.AlertController.C1132a;
import android.support.p043v7.app.AlertController.RecycleListView;
import android.support.p043v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.app.b */
public class C1160b extends C1164e implements DialogInterface {

    /* renamed from: a */
    final AlertController f3807a;

    /* renamed from: android.support.v7.app.b$a */
    public static class C1161a {

        /* renamed from: a */
        public final C1132a f3808a;

        /* renamed from: b */
        private final int f3809b;

        /* renamed from: a */
        public final C1161a mo3766a(boolean z) {
            this.f3808a.f3685r = z;
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3767a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            this.f3808a.f3689v = charSequenceArr;
            this.f3808a.f3691x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final Context mo3757a() {
            return this.f3808a.f3668a;
        }

        /* renamed from: c */
        public final C1160b mo3775c() {
            C1160b b = mo3772b();
            b.show();
            return b;
        }

        /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r14v1, types: [android.support.v7.app.AlertController$c] */
        /* JADX WARNING: type inference failed for: r14v2, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r4v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r14v3 */
        /* JADX WARNING: type inference failed for: r3v22, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r3v23, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: type inference failed for: r14v6 */
        /* JADX WARNING: type inference failed for: r14v7 */
        /* JADX WARNING: type inference failed for: r3v34, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r3v35, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v3
          assigns: [?[OBJECT, ARRAY], android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          uses: [android.widget.ListAdapter, android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          mth insns count: 196
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
        /* JADX WARNING: Unknown variable types count: 6 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.support.p043v7.app.C1160b mo3772b() {
            /*
                r15 = this;
                android.support.v7.app.b r0 = new android.support.v7.app.b
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                android.content.Context r1 = r1.f3668a
                int r2 = r15.f3809b
                r0.<init>(r1, r2)
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                android.support.v7.app.AlertController r10 = r0.f3807a
                android.view.View r2 = r1.f3674g
                r11 = 1
                r12 = 0
                if (r2 == 0) goto L_0x001a
                android.view.View r2 = r1.f3674g
                r10.f3599G = r2
                goto L_0x0067
            L_0x001a:
                java.lang.CharSequence r2 = r1.f3673f
                if (r2 == 0) goto L_0x0023
                java.lang.CharSequence r2 = r1.f3673f
                r10.mo3609a(r2)
            L_0x0023:
                android.graphics.drawable.Drawable r2 = r1.f3671d
                if (r2 == 0) goto L_0x0045
                android.graphics.drawable.Drawable r2 = r1.f3671d
                r10.f3595C = r2
                r10.f3594B = r12
                android.widget.ImageView r3 = r10.f3596D
                if (r3 == 0) goto L_0x0045
                if (r2 == 0) goto L_0x003e
                android.widget.ImageView r3 = r10.f3596D
                r3.setVisibility(r12)
                android.widget.ImageView r3 = r10.f3596D
                r3.setImageDrawable(r2)
                goto L_0x0045
            L_0x003e:
                android.widget.ImageView r2 = r10.f3596D
                r3 = 8
                r2.setVisibility(r3)
            L_0x0045:
                int r2 = r1.f3670c
                if (r2 == 0) goto L_0x004e
                int r2 = r1.f3670c
                r10.mo3607a(r2)
            L_0x004e:
                int r2 = r1.f3672e
                if (r2 == 0) goto L_0x0067
                int r2 = r1.f3672e
                android.util.TypedValue r3 = new android.util.TypedValue
                r3.<init>()
                android.content.Context r4 = r10.f3612a
                android.content.res.Resources$Theme r4 = r4.getTheme()
                r4.resolveAttribute(r2, r3, r11)
                int r2 = r3.resourceId
                r10.mo3607a(r2)
            L_0x0067:
                java.lang.CharSequence r2 = r1.f3675h
                if (r2 == 0) goto L_0x0078
                java.lang.CharSequence r2 = r1.f3675h
                r10.f3617f = r2
                android.widget.TextView r3 = r10.f3598F
                if (r3 == 0) goto L_0x0078
                android.widget.TextView r3 = r10.f3598F
                r3.setText(r2)
            L_0x0078:
                java.lang.CharSequence r2 = r1.f3676i
                if (r2 != 0) goto L_0x0080
                android.graphics.drawable.Drawable r2 = r1.f3677j
                if (r2 == 0) goto L_0x008c
            L_0x0080:
                r3 = -1
                java.lang.CharSequence r4 = r1.f3676i
                android.content.DialogInterface$OnClickListener r5 = r1.f3678k
                r6 = 0
                android.graphics.drawable.Drawable r7 = r1.f3677j
                r2 = r10
                r2.mo3608a(r3, r4, r5, r6, r7)
            L_0x008c:
                java.lang.CharSequence r2 = r1.f3679l
                if (r2 != 0) goto L_0x0094
                android.graphics.drawable.Drawable r2 = r1.f3680m
                if (r2 == 0) goto L_0x00a0
            L_0x0094:
                r3 = -2
                java.lang.CharSequence r4 = r1.f3679l
                android.content.DialogInterface$OnClickListener r5 = r1.f3681n
                r6 = 0
                android.graphics.drawable.Drawable r7 = r1.f3680m
                r2 = r10
                r2.mo3608a(r3, r4, r5, r6, r7)
            L_0x00a0:
                java.lang.CharSequence r2 = r1.f3682o
                if (r2 != 0) goto L_0x00a8
                android.graphics.drawable.Drawable r2 = r1.f3683p
                if (r2 == 0) goto L_0x00b4
            L_0x00a8:
                r3 = -3
                java.lang.CharSequence r4 = r1.f3682o
                android.content.DialogInterface$OnClickListener r5 = r1.f3684q
                r6 = 0
                android.graphics.drawable.Drawable r7 = r1.f3683p
                r2 = r10
                r2.mo3608a(r3, r4, r5, r6, r7)
            L_0x00b4:
                java.lang.CharSequence[] r2 = r1.f3689v
                r13 = 0
                if (r2 != 0) goto L_0x00c1
                android.database.Cursor r2 = r1.f3663K
                if (r2 != 0) goto L_0x00c1
                android.widget.ListAdapter r2 = r1.f3690w
                if (r2 == 0) goto L_0x0166
            L_0x00c1:
                android.view.LayoutInflater r2 = r1.f3669b
                int r3 = r10.f3604L
                android.view.View r2 = r2.inflate(r3, r13)
                android.support.v7.app.AlertController$RecycleListView r2 = (android.support.p043v7.app.AlertController.RecycleListView) r2
                boolean r3 = r1.f3659G
                if (r3 == 0) goto L_0x00f4
                android.database.Cursor r3 = r1.f3663K
                if (r3 != 0) goto L_0x00e5
                android.support.v7.app.AlertController$a$1 r14 = new android.support.v7.app.AlertController$a$1
                android.content.Context r5 = r1.f3668a
                int r6 = r10.f3605M
                r7 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r8 = r1.f3689v
                r3 = r14
                r4 = r1
                r9 = r2
                r3.<init>(r5, r6, r7, r8, r9)
                goto L_0x012c
            L_0x00e5:
                android.support.v7.app.AlertController$a$2 r14 = new android.support.v7.app.AlertController$a$2
                android.content.Context r5 = r1.f3668a
                android.database.Cursor r6 = r1.f3663K
                r7 = 0
                r3 = r14
                r4 = r1
                r8 = r2
                r9 = r10
                r3.<init>(r5, r6, r7, r8, r9)
                goto L_0x012c
            L_0x00f4:
                boolean r3 = r1.f3660H
                if (r3 == 0) goto L_0x00fc
                int r3 = r10.f3606N
            L_0x00fa:
                r6 = r3
                goto L_0x00ff
            L_0x00fc:
                int r3 = r10.f3607O
                goto L_0x00fa
            L_0x00ff:
                android.database.Cursor r3 = r1.f3663K
                r4 = 16908308(0x1020014, float:2.3877285E-38)
                if (r3 == 0) goto L_0x011c
                android.widget.SimpleCursorAdapter r3 = new android.widget.SimpleCursorAdapter
                android.content.Context r5 = r1.f3668a
                android.database.Cursor r7 = r1.f3663K
                java.lang.String[] r8 = new java.lang.String[r11]
                java.lang.String r9 = r1.f3664L
                r8[r12] = r9
                int[] r9 = new int[r11]
                r9[r12] = r4
                r4 = r3
                r4.<init>(r5, r6, r7, r8, r9)
                r14 = r3
                goto L_0x012c
            L_0x011c:
                android.widget.ListAdapter r3 = r1.f3690w
                if (r3 == 0) goto L_0x0123
                android.widget.ListAdapter r14 = r1.f3690w
                goto L_0x012c
            L_0x0123:
                android.support.v7.app.AlertController$c r14 = new android.support.v7.app.AlertController$c
                android.content.Context r3 = r1.f3668a
                java.lang.CharSequence[] r5 = r1.f3689v
                r14.<init>(r3, r6, r4, r5)
            L_0x012c:
                r10.f3600H = r14
                int r3 = r1.f3661I
                r10.f3601I = r3
                android.content.DialogInterface$OnClickListener r3 = r1.f3691x
                if (r3 == 0) goto L_0x013f
                android.support.v7.app.AlertController$a$3 r3 = new android.support.v7.app.AlertController$a$3
                r3.<init>(r10)
                r2.setOnItemClickListener(r3)
                goto L_0x014b
            L_0x013f:
                android.content.DialogInterface$OnMultiChoiceClickListener r3 = r1.f3662J
                if (r3 == 0) goto L_0x014b
                android.support.v7.app.AlertController$a$4 r3 = new android.support.v7.app.AlertController$a$4
                r3.<init>(r2, r10)
                r2.setOnItemClickListener(r3)
            L_0x014b:
                android.widget.AdapterView$OnItemSelectedListener r3 = r1.f3666N
                if (r3 == 0) goto L_0x0154
                android.widget.AdapterView$OnItemSelectedListener r3 = r1.f3666N
                r2.setOnItemSelectedListener(r3)
            L_0x0154:
                boolean r3 = r1.f3660H
                if (r3 == 0) goto L_0x015c
                r2.setChoiceMode(r11)
                goto L_0x0164
            L_0x015c:
                boolean r3 = r1.f3659G
                if (r3 == 0) goto L_0x0164
                r3 = 2
                r2.setChoiceMode(r3)
            L_0x0164:
                r10.f3618g = r2
            L_0x0166:
                android.view.View r2 = r1.f3693z
                if (r2 == 0) goto L_0x0190
                boolean r2 = r1.f3657E
                if (r2 == 0) goto L_0x0187
                android.view.View r2 = r1.f3693z
                int r3 = r1.f3653A
                int r4 = r1.f3654B
                int r5 = r1.f3655C
                int r1 = r1.f3656D
                r10.f3619h = r2
                r10.f3620i = r12
                r10.f3625n = r11
                r10.f3621j = r3
                r10.f3622k = r4
                r10.f3623l = r5
                r10.f3624m = r1
                goto L_0x019c
            L_0x0187:
                android.view.View r1 = r1.f3693z
                r10.f3619h = r1
                r10.f3620i = r12
                r10.f3625n = r12
                goto L_0x019c
            L_0x0190:
                int r2 = r1.f3692y
                if (r2 == 0) goto L_0x019c
                int r1 = r1.f3692y
                r10.f3619h = r13
                r10.f3620i = r1
                r10.f3625n = r12
            L_0x019c:
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                boolean r1 = r1.f3685r
                r0.setCancelable(r1)
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                boolean r1 = r1.f3685r
                if (r1 == 0) goto L_0x01ac
                r0.setCanceledOnTouchOutside(r11)
            L_0x01ac:
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                android.content.DialogInterface$OnCancelListener r1 = r1.f3686s
                r0.setOnCancelListener(r1)
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                android.content.DialogInterface$OnDismissListener r1 = r1.f3687t
                r0.setOnDismissListener(r1)
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                android.content.DialogInterface$OnKeyListener r1 = r1.f3688u
                if (r1 == 0) goto L_0x01c7
                android.support.v7.app.AlertController$a r1 = r15.f3808a
                android.content.DialogInterface$OnKeyListener r1 = r1.f3688u
                r0.setOnKeyListener(r1)
            L_0x01c7:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.app.C1160b.C1161a.mo3772b():android.support.v7.app.b");
        }

        /* renamed from: b */
        public final C1161a mo3770b(CharSequence charSequence) {
            this.f3808a.f3675h = charSequence;
            return this;
        }

        public C1161a(Context context) {
            this(context, C1160b.m3442a(context, 0));
        }

        /* renamed from: a */
        public final C1161a mo3758a(int i) {
            this.f3808a.f3673f = this.f3808a.f3668a.getText(i);
            return this;
        }

        /* renamed from: b */
        public final C1161a mo3768b(int i) {
            this.f3808a.f3675h = this.f3808a.f3668a.getText(i);
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3760a(OnCancelListener onCancelListener) {
            this.f3808a.f3686s = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3761a(OnDismissListener onDismissListener) {
            this.f3808a.f3687t = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3762a(View view) {
            this.f3808a.f3693z = view;
            this.f3808a.f3692y = 0;
            this.f3808a.f3657E = false;
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3764a(CharSequence charSequence) {
            this.f3808a.f3673f = charSequence;
            return this;
        }

        /* renamed from: c */
        public final C1161a mo3774c(CharSequence charSequence, OnClickListener onClickListener) {
            this.f3808a.f3682o = charSequence;
            this.f3808a.f3684q = onClickListener;
            return this;
        }

        public C1161a(Context context, int i) {
            this.f3808a = new C1132a(new ContextThemeWrapper(context, C1160b.m3442a(context, i)));
            this.f3809b = i;
        }

        /* renamed from: a */
        public final C1161a mo3759a(int i, OnClickListener onClickListener) {
            this.f3808a.f3676i = this.f3808a.f3668a.getText(i);
            this.f3808a.f3678k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C1161a mo3769b(int i, OnClickListener onClickListener) {
            this.f3808a.f3679l = this.f3808a.f3668a.getText(i);
            this.f3808a.f3681n = onClickListener;
            return this;
        }

        /* renamed from: c */
        public final C1161a mo3773c(int i, OnClickListener onClickListener) {
            this.f3808a.f3682o = this.f3808a.f3668a.getText(i);
            this.f3808a.f3684q = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C1161a mo3771b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f3808a.f3679l = charSequence;
            this.f3808a.f3681n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3763a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f3808a.f3690w = listAdapter;
            this.f3808a.f3691x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C1161a mo3765a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f3808a.f3676i = charSequence;
            this.f3808a.f3678k = onClickListener;
            return this;
        }
    }

    protected C1160b(Context context) {
        this(context, 0);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f3807a.mo3609a(charSequence);
    }

    /* renamed from: a */
    public final Button mo3753a(int i) {
        AlertController alertController = this.f3807a;
        switch (-1) {
            case ImageFrame.NV21 /*-3*/:
                return alertController.f3634w;
            case -2:
                return alertController.f3630s;
            case -1:
                return alertController.f3626o;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        boolean z;
        boolean z2;
        View view2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        View view3;
        int i3;
        int i4;
        View view4;
        super.onCreate(bundle);
        AlertController alertController = this.f3807a;
        if (alertController.f3603K == 0 || alertController.f3609Q != 1) {
            i = alertController.f3602J;
        } else {
            i = alertController.f3603K;
        }
        alertController.f3613b.setContentView(i);
        View findViewById = alertController.f3614c.findViewById(R.id.bw7);
        View findViewById2 = findViewById.findViewById(R.id.d2d);
        View findViewById3 = findViewById.findViewById(R.id.zi);
        View findViewById4 = findViewById.findViewById(R.id.pw);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.a2v);
        int i5 = 0;
        if (alertController.f3619h != null) {
            view = alertController.f3619h;
        } else if (alertController.f3620i != 0) {
            view = LayoutInflater.from(alertController.f3612a).inflate(alertController.f3620i, viewGroup, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !AlertController.m3345a(view)) {
            alertController.f3614c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f3614c.findViewById(R.id.a2u);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (alertController.f3625n) {
                frameLayout.setPadding(alertController.f3621j, alertController.f3622k, alertController.f3623l, alertController.f3624m);
            }
            if (alertController.f3618g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f4547g = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(R.id.d2d);
        View findViewById6 = viewGroup.findViewById(R.id.zi);
        View findViewById7 = viewGroup.findViewById(R.id.pw);
        ViewGroup a = AlertController.m3342a(findViewById5, findViewById2);
        ViewGroup a2 = AlertController.m3342a(findViewById6, findViewById3);
        ViewGroup a3 = AlertController.m3342a(findViewById7, findViewById4);
        alertController.f3593A = (NestedScrollView) alertController.f3614c.findViewById(R.id.cht);
        alertController.f3593A.setFocusable(false);
        alertController.f3593A.setNestedScrollingEnabled(false);
        alertController.f3598F = (TextView) a2.findViewById(16908299);
        if (alertController.f3598F != null) {
            if (alertController.f3617f != null) {
                alertController.f3598F.setText(alertController.f3617f);
            } else {
                alertController.f3598F.setVisibility(8);
                alertController.f3593A.removeView(alertController.f3598F);
                if (alertController.f3618g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f3593A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f3593A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f3618g, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        alertController.f3626o = (Button) a3.findViewById(16908313);
        alertController.f3626o.setOnClickListener(alertController.f3611S);
        if (!TextUtils.isEmpty(alertController.f3627p) || alertController.f3629r != null) {
            alertController.f3626o.setText(alertController.f3627p);
            if (alertController.f3629r != null) {
                alertController.f3629r.setBounds(0, 0, alertController.f3615d, alertController.f3615d);
                alertController.f3626o.setCompoundDrawables(alertController.f3629r, null, null, null);
            }
            alertController.f3626o.setVisibility(0);
            z2 = true;
        } else {
            alertController.f3626o.setVisibility(8);
            z2 = false;
        }
        alertController.f3630s = (Button) a3.findViewById(16908314);
        alertController.f3630s.setOnClickListener(alertController.f3611S);
        if (!TextUtils.isEmpty(alertController.f3631t) || alertController.f3633v != null) {
            alertController.f3630s.setText(alertController.f3631t);
            if (alertController.f3633v != null) {
                alertController.f3633v.setBounds(0, 0, alertController.f3615d, alertController.f3615d);
                alertController.f3630s.setCompoundDrawables(alertController.f3633v, null, null, null);
            }
            alertController.f3630s.setVisibility(0);
            z2 |= true;
        } else {
            alertController.f3630s.setVisibility(8);
        }
        alertController.f3634w = (Button) a3.findViewById(16908315);
        alertController.f3634w.setOnClickListener(alertController.f3611S);
        if (!TextUtils.isEmpty(alertController.f3635x) || alertController.f3637z != null) {
            alertController.f3634w.setText(alertController.f3635x);
            if (alertController.f3629r != null) {
                alertController.f3629r.setBounds(0, 0, alertController.f3615d, alertController.f3615d);
                view2 = null;
                alertController.f3626o.setCompoundDrawables(alertController.f3629r, null, null, null);
            } else {
                view2 = null;
            }
            alertController.f3634w.setVisibility(0);
            z2 |= true;
        } else {
            alertController.f3634w.setVisibility(8);
            view2 = null;
        }
        Context context = alertController.f3612a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ak, typedValue, true);
        if (typedValue.data != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                AlertController.m3344a(alertController.f3626o);
            } else if (z2) {
                AlertController.m3344a(alertController.f3630s);
            } else if (z2) {
                AlertController.m3344a(alertController.f3634w);
            }
        }
        if (z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            a3.setVisibility(8);
        }
        if (alertController.f3599G != null) {
            a.addView(alertController.f3599G, 0, new LayoutParams(-1, -2));
            alertController.f3614c.findViewById(R.id.d1j).setVisibility(8);
        } else {
            alertController.f3596D = (ImageView) alertController.f3614c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f3616e)) || !alertController.f3608P) {
                alertController.f3614c.findViewById(R.id.d1j).setVisibility(8);
                alertController.f3596D.setVisibility(8);
                a.setVisibility(8);
            } else {
                alertController.f3597E = (TextView) alertController.f3614c.findViewById(R.id.eb);
                alertController.f3597E.setText(alertController.f3616e);
                if (alertController.f3594B != 0) {
                    alertController.f3596D.setImageResource(alertController.f3594B);
                } else if (alertController.f3595C != null) {
                    alertController.f3596D.setImageDrawable(alertController.f3595C);
                } else {
                    alertController.f3597E.setPadding(alertController.f3596D.getPaddingLeft(), alertController.f3596D.getPaddingTop(), alertController.f3596D.getPaddingRight(), alertController.f3596D.getPaddingBottom());
                    alertController.f3596D.setVisibility(8);
                }
            }
        }
        if (viewGroup == null || viewGroup.getVisibility() == 8) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (a == null || a.getVisibility() == 8) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (a3 == null || a3.getVisibility() == 8) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6 && a2 != null) {
            View findViewById8 = a2.findViewById(R.id.cyc);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (i2 != 0) {
            if (alertController.f3593A != null) {
                alertController.f3593A.setClipToPadding(true);
            }
            if (alertController.f3617f == null && alertController.f3618g == null) {
                view4 = view2;
            } else {
                view4 = a.findViewById(R.id.d0u);
            }
            if (view4 != null) {
                view4.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(R.id.cyd);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        if (alertController.f3618g instanceof RecycleListView) {
            RecycleListView recycleListView = (RecycleListView) alertController.f3618g;
            if (!z6 || i2 == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i2 != 0) {
                    i3 = recycleListView.getPaddingTop();
                } else {
                    i3 = recycleListView.f3651a;
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (z6) {
                    i4 = recycleListView.getPaddingBottom();
                } else {
                    i4 = recycleListView.f3652b;
                }
                recycleListView.setPadding(paddingLeft, i3, paddingRight, i4);
            }
        }
        if (!z5) {
            if (alertController.f3618g != null) {
                view3 = alertController.f3618g;
            } else {
                view3 = alertController.f3593A;
            }
            if (view3 != null) {
                if (z6) {
                    i5 = 2;
                }
                int i6 = i2 | i5;
                View findViewById10 = alertController.f3614c.findViewById(R.id.chs);
                View findViewById11 = alertController.f3614c.findViewById(R.id.chr);
                if (VERSION.SDK_INT >= 23) {
                    if (VERSION.SDK_INT >= 23) {
                        view3.setScrollIndicators(i6, 3);
                    }
                    if (findViewById10 != null) {
                        a2.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        a2.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i6 & 1) == 0) {
                        a2.removeView(findViewById10);
                        findViewById10 = view2;
                    }
                    if (findViewById11 != null && (i6 & 2) == 0) {
                        a2.removeView(findViewById11);
                        findViewById11 = view2;
                    }
                    if (!(findViewById10 == null && findViewById11 == null)) {
                        if (alertController.f3617f != null) {
                            alertController.f3593A.setOnScrollChangeListener(new C1078b(findViewById10, findViewById11) {

                                /* renamed from: a */
                                final /* synthetic */ View f3639a;

                                /* renamed from: b */
                                final /* synthetic */ View f3640b;

                                {
                                    this.f3639a = r2;
                                    this.f3640b = r3;
                                }

                                /* renamed from: a */
                                public final void mo3394a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                                    AlertController.m3343a(nestedScrollView, this.f3639a, this.f3640b);
                                }
                            });
                            alertController.f3593A.post(new Runnable(findViewById10, findViewById11) {

                                /* renamed from: a */
                                final /* synthetic */ View f3642a;

                                /* renamed from: b */
                                final /* synthetic */ View f3643b;

                                public final void run() {
                                    AlertController.m3343a(AlertController.this.f3593A, this.f3642a, this.f3643b);
                                }

                                {
                                    this.f3642a = r2;
                                    this.f3643b = r3;
                                }
                            });
                        } else if (alertController.f3618g != null) {
                            alertController.f3618g.setOnScrollListener(new OnScrollListener(findViewById10, findViewById11) {

                                /* renamed from: a */
                                final /* synthetic */ View f3645a;

                                /* renamed from: b */
                                final /* synthetic */ View f3646b;

                                public final void onScrollStateChanged(AbsListView absListView, int i) {
                                }

                                {
                                    this.f3645a = r2;
                                    this.f3646b = r3;
                                }

                                public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                                    AlertController.m3343a(absListView, this.f3645a, this.f3646b);
                                }
                            });
                            alertController.f3618g.post(new Runnable(findViewById10, findViewById11) {

                                /* renamed from: a */
                                final /* synthetic */ View f3648a;

                                /* renamed from: b */
                                final /* synthetic */ View f3649b;

                                public final void run() {
                                    AlertController.m3343a(AlertController.this.f3618g, this.f3648a, this.f3649b);
                                }

                                {
                                    this.f3648a = r2;
                                    this.f3649b = r3;
                                }
                            });
                        } else {
                            if (findViewById10 != null) {
                                a2.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                a2.removeView(findViewById11);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.f3618g;
        if (listView != null && alertController.f3600H != null) {
            listView.setAdapter(alertController.f3600H);
            int i7 = alertController.f3601I;
            if (i7 >= 0) {
                listView.setItemChecked(i7, true);
                listView.setSelection(i7);
            }
        }
    }

    protected C1160b(Context context, int i) {
        super(context, m3442a(context, i));
        this.f3807a = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: a */
    static int m3442a(Context context, int i) {
        if (((i >>> 24) & NormalGiftView.ALPHA_255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.am, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        AlertController alertController = this.f3807a;
        if (alertController.f3593A == null || !alertController.f3593A.mo3343a(keyEvent)) {
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
        AlertController alertController = this.f3807a;
        if (alertController.f3593A == null || !alertController.f3593A.mo3343a(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
