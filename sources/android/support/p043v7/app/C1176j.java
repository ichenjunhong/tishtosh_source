package android.support.p043v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p030v4.view.C1016aa;
import android.support.p030v4.view.C1017ab;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1063y;
import android.support.p030v4.view.C1067z;
import android.support.p043v7.view.C1217a;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.C1218b.C1219a;
import android.support.p043v7.view.C1225g;
import android.support.p043v7.view.C1228h;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.widget.ActionBarContainer;
import android.support.p043v7.widget.ActionBarContextView;
import android.support.p043v7.widget.ActionBarOverlayLayout;
import android.support.p043v7.widget.ActionBarOverlayLayout.C1278a;
import android.support.p043v7.widget.C1436at;
import android.support.p043v7.widget.C1505v;
import android.support.p043v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.j */
public class C1176j extends ActionBar implements C1278a {

    /* renamed from: s */
    static final /* synthetic */ boolean f3842s = (!C1176j.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f3843t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f3844u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f3845A;

    /* renamed from: B */
    private boolean f3846B;

    /* renamed from: C */
    private ArrayList<Object> f3847C = new ArrayList<>();

    /* renamed from: D */
    private boolean f3848D;

    /* renamed from: E */
    private int f3849E = 0;

    /* renamed from: F */
    private boolean f3850F;

    /* renamed from: G */
    private boolean f3851G = true;

    /* renamed from: H */
    private boolean f3852H;

    /* renamed from: a */
    Context f3853a;

    /* renamed from: b */
    ActionBarOverlayLayout f3854b;

    /* renamed from: c */
    ActionBarContainer f3855c;

    /* renamed from: d */
    C1505v f3856d;

    /* renamed from: e */
    ActionBarContextView f3857e;

    /* renamed from: f */
    View f3858f;

    /* renamed from: g */
    C1436at f3859g;

    /* renamed from: h */
    C1180a f3860h;

    /* renamed from: i */
    C1218b f3861i;

    /* renamed from: j */
    C1219a f3862j;

    /* renamed from: k */
    boolean f3863k = true;

    /* renamed from: l */
    boolean f3864l;

    /* renamed from: m */
    boolean f3865m;

    /* renamed from: n */
    C1228h f3866n;

    /* renamed from: o */
    boolean f3867o;

    /* renamed from: p */
    final C1067z f3868p = new C1016aa() {
        /* renamed from: b */
        public final void mo3181b(View view) {
            if (C1176j.this.f3863k && C1176j.this.f3858f != null) {
                C1176j.this.f3858f.setTranslationY(0.0f);
                C1176j.this.f3855c.setTranslationY(0.0f);
            }
            C1176j.this.f3855c.setVisibility(8);
            C1176j.this.f3855c.setTransitioning(false);
            C1176j.this.f3866n = null;
            C1176j jVar = C1176j.this;
            if (jVar.f3862j != null) {
                jVar.f3862j.mo3717a(jVar.f3861i);
                jVar.f3861i = null;
                jVar.f3862j = null;
            }
            if (C1176j.this.f3854b != null) {
                C1056u.m3072r(C1176j.this.f3854b);
            }
        }
    };

    /* renamed from: q */
    final C1067z f3869q = new C1016aa() {
        /* renamed from: b */
        public final void mo3181b(View view) {
            C1176j.this.f3866n = null;
            C1176j.this.f3855c.requestLayout();
        }
    };

    /* renamed from: r */
    final C1017ab f3870r = new C1017ab() {
        /* renamed from: a */
        public final void mo3183a(View view) {
            ((View) C1176j.this.f3855c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f3871v;

    /* renamed from: w */
    private Activity f3872w;

    /* renamed from: x */
    private Dialog f3873x;

    /* renamed from: y */
    private ArrayList<Object> f3874y = new ArrayList<>();

    /* renamed from: z */
    private int f3875z = -1;

    /* renamed from: android.support.v7.app.j$a */
    public class C1180a extends C1218b implements C1247a {

        /* renamed from: d */
        private final Context f3880d;

        /* renamed from: e */
        private final C1246h f3881e;

        /* renamed from: f */
        private C1219a f3882f;

        /* renamed from: g */
        private WeakReference<View> f3883g;

        /* renamed from: b */
        public final Menu mo3801b() {
            return this.f3881e;
        }

        /* renamed from: a */
        public final MenuInflater mo3796a() {
            return new C1225g(this.f3880d);
        }

        /* renamed from: h */
        public final boolean mo3809h() {
            return C1176j.this.f3857e.f4333g;
        }

        /* renamed from: f */
        public final CharSequence mo3807f() {
            return C1176j.this.f3857e.getTitle();
        }

        /* renamed from: g */
        public final CharSequence mo3808g() {
            return C1176j.this.f3857e.getSubtitle();
        }

        /* renamed from: i */
        public final View mo3810i() {
            if (this.f3883g != null) {
                return (View) this.f3883g.get();
            }
            return null;
        }

        /* renamed from: d */
        public final void mo3805d() {
            if (C1176j.this.f3860h == this) {
                this.f3881e.mo4137e();
                try {
                    this.f3882f.mo3720b(this, this.f3881e);
                } finally {
                    this.f3881e.mo4138f();
                }
            }
        }

        /* renamed from: e */
        public final boolean mo3806e() {
            this.f3881e.mo4137e();
            try {
                return this.f3882f.mo3718a((C1218b) this, (Menu) this.f3881e);
            } finally {
                this.f3881e.mo4138f();
            }
        }

        /* renamed from: c */
        public final void mo3804c() {
            if (C1176j.this.f3860h == this) {
                if (!C1176j.m3525a(C1176j.this.f3864l, C1176j.this.f3865m, false)) {
                    C1176j.this.f3861i = this;
                    C1176j.this.f3862j = this.f3882f;
                } else {
                    this.f3882f.mo3717a(this);
                }
                this.f3882f = null;
                C1176j.this.mo3793h(false);
                C1176j.this.f3857e.mo4349b();
                C1176j.this.f3856d.mo5667a().sendAccessibilityEvent(32);
                C1176j.this.f3854b.setHideOnContentScrollEnabled(C1176j.this.f3867o);
                C1176j.this.f3860h = null;
            }
        }

        /* renamed from: b */
        public final void mo3803b(CharSequence charSequence) {
            C1176j.this.f3857e.setTitle(charSequence);
        }

        /* renamed from: a */
        public final void mo3797a(int i) {
            mo3803b((CharSequence) C1176j.this.f3853a.getResources().getString(i));
        }

        /* renamed from: b */
        public final void mo3802b(int i) {
            mo3799a((CharSequence) C1176j.this.f3853a.getResources().getString(i));
        }

        /* renamed from: a */
        public final void mo1289a(C1246h hVar) {
            if (this.f3882f != null) {
                mo3805d();
                C1176j.this.f3857e.mo4348a();
            }
        }

        /* renamed from: a */
        public final void mo3798a(View view) {
            C1176j.this.f3857e.setCustomView(view);
            this.f3883g = new WeakReference<>(view);
        }

        /* renamed from: a */
        public final void mo3799a(CharSequence charSequence) {
            C1176j.this.f3857e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public final void mo3800a(boolean z) {
            super.mo3800a(z);
            C1176j.this.f3857e.setTitleOptional(z);
        }

        /* renamed from: a */
        public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
            if (this.f3882f != null) {
                return this.f3882f.mo3719a((C1218b) this, menuItem);
            }
            return false;
        }

        public C1180a(Context context, C1219a aVar) {
            this.f3880d = context;
            this.f3882f = aVar;
            this.f3881e = new C1246h(context).mo4104a(1);
            this.f3881e.mo4108a((C1247a) this);
        }
    }

    /* renamed from: a */
    static boolean m3525a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: a */
    public final void mo3589a(boolean z) {
        m3523a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public final boolean mo3590a(int i, KeyEvent keyEvent) {
        if (this.f3860h == null) {
            return false;
        }
        Menu b = this.f3860h.mo3801b();
        if (b == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: k */
    private int m3529k() {
        return this.f3856d.mo5692n();
    }

    /* renamed from: n */
    private boolean m3534n() {
        return C1056u.m3079y(this.f3855c);
    }

    /* renamed from: a */
    public final int mo3583a() {
        return this.f3856d.mo5691m();
    }

    /* renamed from: h */
    public final void mo3792h() {
        if (this.f3865m) {
            this.f3865m = false;
            m3528j(true);
        }
    }

    /* renamed from: i */
    public final void mo3794i() {
        if (!this.f3865m) {
            this.f3865m = true;
            m3528j(true);
        }
    }

    /* renamed from: j */
    public final void mo3795j() {
        if (this.f3866n != null) {
            this.f3866n.mo3978b();
            this.f3866n = null;
        }
    }

    /* renamed from: l */
    private void m3531l() {
        if (!this.f3850F) {
            this.f3850F = true;
            if (this.f3854b != null) {
                this.f3854b.setShowingForActionMode(true);
            }
            m3528j(false);
        }
    }

    /* renamed from: m */
    private void m3533m() {
        if (this.f3850F) {
            this.f3850F = false;
            if (this.f3854b != null) {
                this.f3854b.setShowingForActionMode(false);
            }
            m3528j(false);
        }
    }

    /* renamed from: f */
    public final boolean mo3601f() {
        if (this.f3856d == null || !this.f3856d.mo5679c()) {
            return false;
        }
        this.f3856d.mo5680d();
        return true;
    }

    /* renamed from: b */
    public final Context mo3592b() {
        if (this.f3871v == null) {
            TypedValue typedValue = new TypedValue();
            this.f3853a.getTheme().resolveAttribute(R.attr.k, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3871v = new ContextThemeWrapper(this.f3853a, i);
            } else {
                this.f3871v = this.f3853a;
            }
        }
        return this.f3871v;
    }

    /* renamed from: b */
    public final void mo3790b(int i) {
        this.f3849E = i;
    }

    /* renamed from: g */
    public final void mo3791g(boolean z) {
        this.f3863k = z;
    }

    /* renamed from: b */
    public final void mo3593b(boolean z) {
        m3523a(0, 8);
    }

    /* renamed from: d */
    public final void mo3596d(boolean z) {
        if (!this.f3845A) {
            mo3589a(z);
        }
    }

    /* renamed from: e */
    public final void mo3598e(boolean z) {
        this.f3852H = z;
        if (!z && this.f3866n != null) {
            this.f3866n.mo3978b();
        }
    }

    /* renamed from: c */
    public final void mo3594c(boolean z) {
        if (this.f3854b.f4350b) {
            this.f3867o = true;
            this.f3854b.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: f */
    public final void mo3600f(boolean z) {
        if (z != this.f3846B) {
            this.f3846B = z;
            int size = this.f3847C.size();
            for (int i = 0; i < size; i++) {
                this.f3847C.get(i);
            }
        }
    }

    public C1176j(Dialog dialog) {
        this.f3873x = dialog;
        m3524a(dialog.getWindow().getDecorView());
    }

    /* renamed from: b */
    private static C1505v m3526b(View view) {
        String str;
        if (view instanceof C1505v) {
            return (C1505v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    private void m3528j(boolean z) {
        if (m3525a(this.f3864l, this.f3865m, this.f3850F)) {
            if (!this.f3851G) {
                this.f3851G = true;
                m3530k(z);
            }
        } else if (this.f3851G) {
            this.f3851G = false;
            m3532l(z);
        }
    }

    /* renamed from: a */
    public final C1218b mo3584a(C1219a aVar) {
        if (this.f3860h != null) {
            this.f3860h.mo3804c();
        }
        this.f3854b.setHideOnContentScrollEnabled(false);
        this.f3857e.mo4350c();
        C1180a aVar2 = new C1180a(this.f3857e.getContext(), aVar);
        if (!aVar2.mo3806e()) {
            return null;
        }
        this.f3860h = aVar2;
        aVar2.mo3805d();
        this.f3857e.mo4347a(aVar2);
        mo3793h(true);
        this.f3857e.sendAccessibilityEvent(32);
        return aVar2;
    }

    /* renamed from: i */
    private void m3527i(boolean z) {
        boolean z2;
        boolean z3;
        this.f3848D = z;
        if (!this.f3848D) {
            this.f3856d.mo5671a((C1436at) null);
            this.f3855c.setTabContainer(this.f3859g);
        } else {
            this.f3855c.setTabContainer(null);
            this.f3856d.mo5671a(this.f3859g);
        }
        boolean z4 = true;
        if (m3529k() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3859g != null) {
            if (z2) {
                this.f3859g.setVisibility(0);
                if (this.f3854b != null) {
                    C1056u.m3072r(this.f3854b);
                }
            } else {
                this.f3859g.setVisibility(8);
            }
        }
        C1505v vVar = this.f3856d;
        if (this.f3848D || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        vVar.mo5675a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3854b;
        if (this.f3848D || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: a */
    public final void mo3585a(float f) {
        C1056u.m3048c((View) this.f3855c, f);
    }

    /* renamed from: h */
    public final void mo3793h(boolean z) {
        C1063y yVar;
        C1063y yVar2;
        if (z) {
            m3531l();
        } else {
            m3533m();
        }
        if (m3534n()) {
            if (z) {
                yVar = this.f3856d.mo5666a(4, 100);
                yVar2 = this.f3857e.mo4346a(0, 200);
            } else {
                yVar2 = this.f3856d.mo5666a(0, 200);
                yVar = this.f3857e.mo4346a(8, 100);
            }
            C1228h hVar = new C1228h();
            hVar.mo3974a(yVar, yVar2);
            hVar.mo3977a();
        } else if (z) {
            this.f3856d.mo5683e(4);
            this.f3857e.setVisibility(0);
        } else {
            this.f3856d.mo5683e(0);
            this.f3857e.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m3524a(View view) {
        boolean z;
        this.f3854b = (ActionBarOverlayLayout) view.findViewById(R.id.a3p);
        if (this.f3854b != null) {
            this.f3854b.setActionBarVisibilityCallback(this);
        }
        this.f3856d = m3526b(view.findViewById(R.id.a4));
        this.f3857e = (ActionBarContextView) view.findViewById(R.id.ad);
        this.f3855c = (ActionBarContainer) view.findViewById(R.id.a6);
        if (this.f3856d == null || this.f3857e == null || this.f3855c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f3853a = this.f3856d.mo5676b();
        if ((this.f3856d.mo5691m() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f3845A = true;
        }
        C1217a a = C1217a.m3676a(this.f3853a);
        a.mo3937c();
        m3527i(a.mo3936b());
        TypedArray obtainStyledAttributes = this.f3853a.obtainStyledAttributes(null, new int[]{R.attr.bt, R.attr.bw, R.attr.bx, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.i9, R.attr.i_, R.attr.j8, R.attr.js, R.attr.jt, R.attr.k_, R.attr.n0, R.attr.n7, R.attr.nh, R.attr.ni, R.attr.nl, R.attr.oc, R.attr.po, R.attr.t8, R.attr.un, R.attr.vs, R.attr.wa, R.attr.wb, R.attr.a3v, R.attr.a3y, R.attr.a6u, R.attr.a76}, R.attr.f, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            mo3594c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo3585a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m3530k(boolean z) {
        if (this.f3866n != null) {
            this.f3866n.mo3978b();
        }
        this.f3855c.setVisibility(0);
        if (this.f3849E != 0 || (!this.f3852H && !z)) {
            this.f3855c.setAlpha(1.0f);
            this.f3855c.setTranslationY(0.0f);
            if (this.f3863k && this.f3858f != null) {
                this.f3858f.setTranslationY(0.0f);
            }
            this.f3869q.mo3181b(null);
        } else {
            this.f3855c.setTranslationY(0.0f);
            float f = (float) (-this.f3855c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f3855c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f3855c.setTranslationY(f);
            C1228h hVar = new C1228h();
            C1063y b = C1056u.m3067m(this.f3855c).mo3249b(0.0f);
            b.mo3246a(this.f3870r);
            hVar.mo3973a(b);
            if (this.f3863k && this.f3858f != null) {
                this.f3858f.setTranslationY(f);
                hVar.mo3973a(C1056u.m3067m(this.f3858f).mo3249b(0.0f));
            }
            hVar.mo3976a(f3844u);
            hVar.mo3972a(250);
            hVar.mo3975a(this.f3869q);
            this.f3866n = hVar;
            hVar.mo3977a();
        }
        if (this.f3854b != null) {
            C1056u.m3072r(this.f3854b);
        }
    }

    /* renamed from: l */
    private void m3532l(boolean z) {
        if (this.f3866n != null) {
            this.f3866n.mo3978b();
        }
        if (this.f3849E != 0 || (!this.f3852H && !z)) {
            this.f3868p.mo3181b(null);
            return;
        }
        this.f3855c.setAlpha(1.0f);
        this.f3855c.setTransitioning(true);
        C1228h hVar = new C1228h();
        float f = (float) (-this.f3855c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f3855c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C1063y b = C1056u.m3067m(this.f3855c).mo3249b(f);
        b.mo3246a(this.f3870r);
        hVar.mo3973a(b);
        if (this.f3863k && this.f3858f != null) {
            hVar.mo3973a(C1056u.m3067m(this.f3858f).mo3249b(f));
        }
        hVar.mo3976a(f3843t);
        hVar.mo3972a(250);
        hVar.mo3975a(this.f3868p);
        this.f3866n = hVar;
        hVar.mo3977a();
    }

    /* renamed from: a */
    public final void mo3586a(int i) {
        this.f3856d.mo5681d(i);
    }

    /* renamed from: a */
    public final void mo3587a(Configuration configuration) {
        m3527i(C1217a.m3676a(this.f3853a).mo3936b());
    }

    /* renamed from: a */
    public final void mo3588a(CharSequence charSequence) {
        this.f3856d.mo5674a(charSequence);
    }

    /* renamed from: a */
    private void m3523a(int i, int i2) {
        int m = this.f3856d.mo5691m();
        if ((i2 & 4) != 0) {
            this.f3845A = true;
        }
        this.f3856d.mo5678c((i & i2) | ((i2 ^ -1) & m));
    }

    public C1176j(Activity activity, boolean z) {
        this.f3872w = activity;
        View decorView = activity.getWindow().getDecorView();
        m3524a(decorView);
        if (!z) {
            this.f3858f = decorView.findViewById(16908290);
        }
    }
}
