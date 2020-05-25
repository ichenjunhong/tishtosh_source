package android.support.p043v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.C0701y;
import android.support.p030v4.view.C1016aa;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1042g;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1063y;
import android.support.p030v4.view.C1067z;
import android.support.p043v7.app.C1158a.C1159a;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.C1218b.C1219a;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.view.C1223f.C1224a;
import android.support.p043v7.view.C1225g;
import android.support.p043v7.view.C1230i;
import android.support.p043v7.view.menu.C1243f;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1264p;
import android.support.p043v7.widget.ActionBarContextView;
import android.support.p043v7.widget.C1405ab;
import android.support.p043v7.widget.C1405ab.C1406a;
import android.support.p043v7.widget.C1451bb;
import android.support.p043v7.widget.C1467bj;
import android.support.p043v7.widget.C1480g;
import android.support.p043v7.widget.C1504u;
import android.support.p043v7.widget.ContentFrameLayout;
import android.support.p043v7.widget.ContentFrameLayout.C1300a;
import android.support.p043v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;

/* renamed from: android.support.v7.app.AppCompatDelegateImpl */
final class AppCompatDelegateImpl extends C1163d implements C1247a, Factory2 {

    /* renamed from: w */
    private static final boolean f3707w;

    /* renamed from: x */
    private static final int[] f3708x = {16842836};

    /* renamed from: y */
    private static boolean f3709y = true;

    /* renamed from: A */
    private C1504u f3710A;

    /* renamed from: B */
    private C1149b f3711B;

    /* renamed from: C */
    private C1156g f3712C;

    /* renamed from: D */
    private boolean f3713D = true;

    /* renamed from: E */
    private boolean f3714E;

    /* renamed from: F */
    private TextView f3715F;

    /* renamed from: G */
    private View f3716G;

    /* renamed from: H */
    private boolean f3717H;

    /* renamed from: I */
    private boolean f3718I;

    /* renamed from: J */
    private boolean f3719J;

    /* renamed from: K */
    private PanelFeatureState[] f3720K;

    /* renamed from: L */
    private PanelFeatureState f3721L;

    /* renamed from: M */
    private boolean f3722M;

    /* renamed from: N */
    private int f3723N = -100;

    /* renamed from: O */
    private boolean f3724O;

    /* renamed from: P */
    private C1153e f3725P;

    /* renamed from: Q */
    private final Runnable f3726Q = new Runnable() {
        public final void run() {
            if ((AppCompatDelegateImpl.this.f3751v & 1) != 0) {
                AppCompatDelegateImpl.this.mo3687f(0);
            }
            if ((AppCompatDelegateImpl.this.f3751v & 4096) != 0) {
                AppCompatDelegateImpl.this.mo3687f(108);
            }
            AppCompatDelegateImpl.this.f3750u = false;
            AppCompatDelegateImpl.this.f3751v = 0;
        }
    };

    /* renamed from: R */
    private boolean f3727R;

    /* renamed from: S */
    private Rect f3728S;

    /* renamed from: T */
    private Rect f3729T;

    /* renamed from: U */
    private AppCompatViewInflater f3730U;

    /* renamed from: b */
    final Context f3731b;

    /* renamed from: c */
    final Window f3732c;

    /* renamed from: d */
    final Callback f3733d;

    /* renamed from: e */
    final Callback f3734e;

    /* renamed from: f */
    final C1162c f3735f;

    /* renamed from: g */
    public ActionBar f3736g;

    /* renamed from: h */
    MenuInflater f3737h;

    /* renamed from: i */
    C1218b f3738i;

    /* renamed from: j */
    ActionBarContextView f3739j;

    /* renamed from: k */
    PopupWindow f3740k;

    /* renamed from: l */
    Runnable f3741l;

    /* renamed from: m */
    C1063y f3742m;

    /* renamed from: n */
    public ViewGroup f3743n;

    /* renamed from: o */
    boolean f3744o;

    /* renamed from: p */
    boolean f3745p;

    /* renamed from: q */
    boolean f3746q;

    /* renamed from: r */
    boolean f3747r;

    /* renamed from: s */
    boolean f3748s;

    /* renamed from: t */
    boolean f3749t;

    /* renamed from: u */
    boolean f3750u;

    /* renamed from: v */
    int f3751v;

    /* renamed from: z */
    private CharSequence f3752z;

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState */
    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f3761a;

        /* renamed from: b */
        int f3762b;

        /* renamed from: c */
        int f3763c;

        /* renamed from: d */
        int f3764d;

        /* renamed from: e */
        int f3765e;

        /* renamed from: f */
        int f3766f;

        /* renamed from: g */
        ViewGroup f3767g;

        /* renamed from: h */
        View f3768h;

        /* renamed from: i */
        View f3769i;

        /* renamed from: j */
        C1246h f3770j;

        /* renamed from: k */
        C1243f f3771k;

        /* renamed from: l */
        Context f3772l;

        /* renamed from: m */
        boolean f3773m;

        /* renamed from: n */
        boolean f3774n;

        /* renamed from: o */
        boolean f3775o;

        /* renamed from: p */
        public boolean f3776p;

        /* renamed from: q */
        boolean f3777q;

        /* renamed from: r */
        boolean f3778r;

        /* renamed from: s */
        Bundle f3779s;

        /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState$SavedState */
        static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return SavedState.m3424a(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m3424a(parcel, classLoader);
                }
            };

            /* renamed from: a */
            int f3780a;

            /* renamed from: b */
            boolean f3781b;

            /* renamed from: c */
            Bundle f3782c;

            SavedState() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3780a);
                parcel.writeInt(this.f3781b ? 1 : 0);
                if (this.f3781b) {
                    parcel.writeBundle(this.f3782c);
                }
            }

            /* renamed from: a */
            static SavedState m3424a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f3780a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f3781b = z;
                if (savedState.f3781b) {
                    savedState.f3782c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }

        /* renamed from: a */
        public final boolean mo3708a() {
            if (this.f3768h == null) {
                return false;
            }
            if (this.f3769i == null && this.f3771k.mo4090d().getCount() <= 0) {
                return false;
            }
            return true;
        }

        PanelFeatureState(int i) {
            this.f3761a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3707a(C1246h hVar) {
            if (hVar != this.f3770j) {
                if (this.f3770j != null) {
                    this.f3770j.mo4125b((C1262o) this.f3771k);
                }
                this.f3770j = hVar;
                if (!(hVar == null || this.f3771k == null)) {
                    hVar.mo4110a((C1262o) this.f3771k);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C1264p mo3705a(C1263a aVar) {
            if (this.f3770j == null) {
                return null;
            }
            if (this.f3771k == null) {
                this.f3771k = new C1243f(this.f3772l, (int) R.layout.q);
                this.f3771k.mo1085a(aVar);
                this.f3770j.mo4110a((C1262o) this.f3771k);
            }
            return this.f3771k.mo4089a(this.f3767g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3706a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.c, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.v_, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(R.style.ma, true);
            }
            C1221d dVar = new C1221d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f3772l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.a, R.attr.b, R.attr.c, R.attr.d, R.attr.e, R.attr.f, R.attr.g, R.attr.h, R.attr.i, R.attr.j, R.attr.k, R.attr.l, R.attr.m, R.attr.o, R.attr.p, R.attr.q, R.attr.r, R.attr.s, R.attr.t, R.attr.u, R.attr.v, R.attr.w, R.attr.x, R.attr.y, R.attr.z, R.attr.a0, R.attr.a1, R.attr.a2, R.attr.a3, R.attr.a4, R.attr.a7, R.attr.aj, R.attr.ak, R.attr.al, R.attr.am, R.attr.bm, R.attr.cn, R.attr.df, R.attr.dg, R.attr.dh, R.attr.di, R.attr.dj, R.attr.dr, R.attr.ds, R.attr.ea, R.attr.ef, R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.g1, R.attr.ig, R.attr.jn, R.attr.jo, R.attr.jp, R.attr.jv, R.attr.jz, R.attr.k3, R.attr.k4, R.attr.k6, R.attr.k7, R.attr.k8, R.attr.nh, R.attr.oa, R.attr.sm, R.attr.sp, R.attr.ss, R.attr.st, R.attr.su, R.attr.sv, R.attr.sw, R.attr.sx, R.attr.sy, R.attr.v9, R.attr.v_, R.attr.va, R.attr.vr, R.attr.vt, R.attr.xp, R.attr.xw, R.attr.xx, R.attr.xy, R.attr.a1a, R.attr.a1c, R.attr.a1f, R.attr.a1g, R.attr.a2p, R.attr.a2q, R.attr.a45, R.attr.a5u, R.attr.a5v, R.attr.a5w, R.attr.a5x, R.attr.a5z, R.attr.a60, R.attr.a61, R.attr.a62, R.attr.a68, R.attr.a69, R.attr.a7_, R.attr.a7a, R.attr.a7b, R.attr.a7c, R.attr.a_n, R.attr.aad, R.attr.aae, R.attr.aaf, R.attr.aag, R.attr.aah, R.attr.aai, R.attr.aaj, R.attr.aak, R.attr.aal, R.attr.aam});
            this.f3762b = obtainStyledAttributes.getResourceId(80, 0);
            this.f3766f = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$a */
    class C1148a implements C1159a {
        C1148a() {
        }

        /* renamed from: a */
        public final void mo3714a(int i) {
            ActionBar a = AppCompatDelegateImpl.this.mo3659a();
            if (a != null) {
                a.mo3586a(i);
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$b */
    final class C1149b implements C1263a {
        C1149b() {
        }

        /* renamed from: a */
        public final boolean mo3716a(C1246h hVar) {
            Callback l = AppCompatDelegateImpl.this.mo3693l();
            if (l != null) {
                l.onMenuOpened(108, hVar);
            }
            return true;
        }

        /* renamed from: a */
        public final void mo3715a(C1246h hVar, boolean z) {
            AppCompatDelegateImpl.this.mo3677b(hVar);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$c */
    class C1150c implements C1219a {

        /* renamed from: b */
        private C1219a f3786b;

        /* renamed from: a */
        public final void mo3717a(C1218b bVar) {
            this.f3786b.mo3717a(bVar);
            if (AppCompatDelegateImpl.this.f3740k != null) {
                AppCompatDelegateImpl.this.f3732c.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f3741l);
            }
            if (AppCompatDelegateImpl.this.f3739j != null) {
                AppCompatDelegateImpl.this.mo3696o();
                AppCompatDelegateImpl.this.f3742m = C1056u.m3067m(AppCompatDelegateImpl.this.f3739j).mo3244a(0.0f);
                AppCompatDelegateImpl.this.f3742m.mo3247a((C1067z) new C1016aa() {
                    /* renamed from: b */
                    public final void mo3181b(View view) {
                        AppCompatDelegateImpl.this.f3739j.setVisibility(8);
                        if (AppCompatDelegateImpl.this.f3740k != null) {
                            AppCompatDelegateImpl.this.f3740k.dismiss();
                        } else if (AppCompatDelegateImpl.this.f3739j.getParent() instanceof View) {
                            C1056u.m3072r((View) AppCompatDelegateImpl.this.f3739j.getParent());
                        }
                        AppCompatDelegateImpl.this.f3739j.removeAllViews();
                        AppCompatDelegateImpl.this.f3742m.mo3247a((C1067z) null);
                        AppCompatDelegateImpl.this.f3742m = null;
                    }
                });
            }
            if (AppCompatDelegateImpl.this.f3735f != null) {
                AppCompatDelegateImpl.this.f3735f.onSupportActionModeFinished(AppCompatDelegateImpl.this.f3738i);
            }
            AppCompatDelegateImpl.this.f3738i = null;
        }

        public C1150c(C1219a aVar) {
            this.f3786b = aVar;
        }

        /* renamed from: a */
        public final boolean mo3718a(C1218b bVar, Menu menu) {
            return this.f3786b.mo3718a(bVar, menu);
        }

        /* renamed from: b */
        public final boolean mo3720b(C1218b bVar, Menu menu) {
            return this.f3786b.mo3720b(bVar, menu);
        }

        /* renamed from: a */
        public final boolean mo3719a(C1218b bVar, MenuItem menuItem) {
            return this.f3786b.mo3719a(bVar, menuItem);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$d */
    class C1152d extends C1230i {
        public final void onContentChanged() {
        }

        /* renamed from: a */
        private ActionMode m3433a(ActionMode.Callback callback) {
            C1224a aVar = new C1224a(AppCompatDelegateImpl.this.f3731b, callback);
            C1218b a = AppCompatDelegateImpl.this.mo3662a((C1219a) aVar);
            if (a != null) {
                return aVar.mo3963b(a);
            }
            return null;
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo3673a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo3672a(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo3695n()) {
                return m3433a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        C1152d(Callback callback) {
            super(callback);
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1246h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo3683d(i);
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                ActionBar a = appCompatDelegateImpl.mo3659a();
                if (a != null) {
                    a.mo3600f(true);
                }
            }
            return true;
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo3695n() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return m3433a(callback);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            C1246h hVar;
            if (menu instanceof C1246h) {
                hVar = (C1246h) menu;
            } else {
                hVar = null;
            }
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.f4226l = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.f4226l = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = AppCompatDelegateImpl.this.mo3660a(0, true);
            if (a == null || a.f3770j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f3770j, i);
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$e */
    final class C1153e {

        /* renamed from: a */
        C1174i f3789a;

        /* renamed from: b */
        boolean f3790b;

        /* renamed from: d */
        private BroadcastReceiver f3792d;

        /* renamed from: e */
        private IntentFilter f3793e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3731a() {
            this.f3790b = this.f3789a.mo3789a();
            if (this.f3790b) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo3733c() {
            if (this.f3792d != null) {
                AppCompatDelegateImpl.this.f3731b.unregisterReceiver(this.f3792d);
                this.f3792d = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3732b() {
            mo3733c();
            if (this.f3792d == null) {
                this.f3792d = new BroadcastReceiver() {
                    public final void onReceive(Context context, Intent intent) {
                        C1153e eVar = C1153e.this;
                        boolean a = eVar.f3789a.mo3789a();
                        if (a != eVar.f3790b) {
                            eVar.f3790b = a;
                            AppCompatDelegateImpl.this.mo3692j();
                        }
                    }
                };
            }
            if (this.f3793e == null) {
                this.f3793e = new IntentFilter();
                this.f3793e.addAction("android.intent.action.TIME_SET");
                this.f3793e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f3793e.addAction("android.intent.action.TIME_TICK");
            }
            AppCompatDelegateImpl.this.f3731b.registerReceiver(this.f3792d, this.f3793e);
        }

        C1153e(C1174i iVar) {
            this.f3789a = iVar;
            this.f3790b = iVar.mo3789a();
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$f */
    class C1155f extends ContentFrameLayout {
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C1124a.m3315b(getContext(), i));
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo3673a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AppCompatDelegateImpl.this.mo3685e(0);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public C1155f(Context context) {
            super(context);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$g */
    final class C1156g implements C1263a {
        C1156g() {
        }

        /* renamed from: a */
        public final boolean mo3716a(C1246h hVar) {
            if (hVar == null && AppCompatDelegateImpl.this.f3744o) {
                Callback l = AppCompatDelegateImpl.this.mo3693l();
                if (l != null && !AppCompatDelegateImpl.this.f3749t) {
                    l.onMenuOpened(108, hVar);
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo3715a(C1246h hVar, boolean z) {
            boolean z2;
            C1246h j = hVar.mo4146j();
            if (j != hVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                hVar = j;
            }
            PanelFeatureState a = appCompatDelegateImpl.mo3661a((Menu) hVar);
            if (a != null) {
                if (z2) {
                    AppCompatDelegateImpl.this.mo3664a(a.f3761a, a, j);
                    AppCompatDelegateImpl.this.mo3667a(a, true);
                    return;
                }
                AppCompatDelegateImpl.this.mo3667a(a, z);
            }
        }
    }

    /* renamed from: i */
    private static int m3359i(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo3679c() {
        mo3692j();
    }

    /* renamed from: n */
    public final boolean mo3695n() {
        return this.f3713D;
    }

    /* renamed from: a */
    public final void mo3666a(Bundle bundle) {
        if (this.f3733d instanceof Activity) {
            String str = null;
            try {
                str = C0701y.m2031b((Activity) this.f3733d);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f3736g;
                if (actionBar == null) {
                    this.f3727R = true;
                } else {
                    actionBar.mo3596d(true);
                }
            }
        }
        if (bundle != null && this.f3723N == -100) {
            this.f3723N = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: a */
    public final void mo3668a(Toolbar toolbar) {
        if (this.f3733d instanceof Activity) {
            ActionBar a = mo3659a();
            if (!(a instanceof C1176j)) {
                this.f3737h = null;
                if (a != null) {
                    a.mo3602g();
                }
                if (toolbar != null) {
                    C1167g gVar = new C1167g(toolbar, ((Activity) this.f3733d).getTitle(), this.f3734e);
                    this.f3736g = gVar;
                    this.f3732c.setCallback(gVar.f3816c);
                } else {
                    this.f3736g = null;
                    this.f3732c.setCallback(this.f3734e);
                }
                mo3686f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public final void mo3665a(Configuration configuration) {
        if (this.f3744o && this.f3714E) {
            ActionBar a = mo3659a();
            if (a != null) {
                a.mo3587a(configuration);
            }
        }
        C1480g.m5205a().mo5773a(this.f3731b);
        mo3692j();
    }

    /* renamed from: a */
    public final void mo3669a(View view) {
        m3364s();
        ViewGroup viewGroup = (ViewGroup) this.f3743n.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3733d.onContentChanged();
    }

    /* renamed from: a */
    public final void mo3670a(View view, LayoutParams layoutParams) {
        m3364s();
        ViewGroup viewGroup = (ViewGroup) this.f3743n.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3733d.onContentChanged();
    }

    /* renamed from: a */
    public final void mo3671a(CharSequence charSequence) {
        this.f3752z = charSequence;
        if (this.f3710A != null) {
            this.f3710A.setWindowTitle(charSequence);
        } else if (this.f3736g != null) {
            this.f3736g.mo3588a(charSequence);
        } else {
            if (this.f3715F != null) {
                this.f3715F.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
        Callback l = mo3693l();
        if (l != null && !this.f3749t) {
            PanelFeatureState a = mo3661a((Menu) hVar.mo4146j());
            if (a != null) {
                return l.onMenuItemSelected(a.f3761a, menuItem);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3672a(int i, KeyEvent keyEvent) {
        ActionBar a = mo3659a();
        if (a != null && a.mo3590a(i, keyEvent)) {
            return true;
        }
        if (this.f3721L == null || !m3353a(this.f3721L, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f3721L == null) {
                PanelFeatureState a2 = mo3660a(0, true);
                m3356b(a2, keyEvent);
                boolean a3 = m3353a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f3773m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        if (this.f3721L != null) {
            this.f3721L.f3774n = true;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0113 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3673a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f3733d
            boolean r0 = r0 instanceof android.support.p030v4.view.C1040f.C1041a
            r1 = 1
            if (r0 != 0) goto L_0x000d
            android.view.Window$Callback r0 = r6.f3733d
            boolean r0 = r0 instanceof android.support.p043v7.app.C1164e
            if (r0 == 0) goto L_0x001c
        L_0x000d:
            android.view.Window r0 = r6.f3732c
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001c
            boolean r0 = android.support.p030v4.view.C1040f.m2975a(r0, r7)
            if (r0 == 0) goto L_0x001c
            return r1
        L_0x001c:
            int r0 = r7.getKeyCode()
            r2 = 82
            if (r0 != r2) goto L_0x002d
            android.view.Window$Callback r0 = r6.f3733d
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r1
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0063
            if (r0 == r5) goto L_0x0056
            if (r0 == r2) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0115
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo3660a(r4, r1)
            boolean r2 = r0.f3775o
            if (r2 != 0) goto L_0x0115
            r6.m3356b(r0, r7)
            goto L_0x0115
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            r6.f3722M = r1
        L_0x0062:
            return r4
        L_0x0063:
            if (r0 == r5) goto L_0x00e4
            if (r0 == r2) goto L_0x0069
            goto L_0x0114
        L_0x0069:
            android.support.v7.view.b r0 = r6.f3738i
            if (r0 == 0) goto L_0x006f
            goto L_0x00e3
        L_0x006f:
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo3660a(r4, r1)
            android.support.v7.widget.u r2 = r6.f3710A
            if (r2 == 0) goto L_0x00ab
            android.support.v7.widget.u r2 = r6.f3710A
            boolean r2 = r2.mo4374b()
            if (r2 == 0) goto L_0x00ab
            android.content.Context r2 = r6.f3731b
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto L_0x00ab
            android.support.v7.widget.u r2 = r6.f3710A
            boolean r2 = r2.mo4375c()
            if (r2 != 0) goto L_0x00a4
            boolean r2 = r6.f3749t
            if (r2 != 0) goto L_0x00cb
            boolean r7 = r6.m3356b(r0, r7)
            if (r7 == 0) goto L_0x00cb
            android.support.v7.widget.u r7 = r6.f3710A
            boolean r7 = r7.mo4379e()
            goto L_0x00d2
        L_0x00a4:
            android.support.v7.widget.u r7 = r6.f3710A
            boolean r7 = r7.mo4380f()
            goto L_0x00d2
        L_0x00ab:
            boolean r2 = r0.f3775o
            if (r2 != 0) goto L_0x00cd
            boolean r2 = r0.f3774n
            if (r2 == 0) goto L_0x00b4
            goto L_0x00cd
        L_0x00b4:
            boolean r2 = r0.f3773m
            if (r2 == 0) goto L_0x00cb
            boolean r2 = r0.f3778r
            if (r2 == 0) goto L_0x00c3
            r0.f3773m = r4
            boolean r2 = r6.m3356b(r0, r7)
            goto L_0x00c4
        L_0x00c3:
            r2 = 1
        L_0x00c4:
            if (r2 == 0) goto L_0x00cb
            r6.m3351a(r0, r7)
            r7 = 1
            goto L_0x00d2
        L_0x00cb:
            r7 = 0
            goto L_0x00d2
        L_0x00cd:
            boolean r7 = r0.f3775o
            r6.mo3667a(r0, r1)
        L_0x00d2:
            if (r7 == 0) goto L_0x00e3
            android.content.Context r7 = r6.f3731b
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e3
            r7.playSoundEffect(r4)
        L_0x00e3:
            return r1
        L_0x00e4:
            boolean r7 = r6.f3722M
            r6.f3722M = r4
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo3660a(r4, r4)
            if (r0 == 0) goto L_0x00f8
            boolean r2 = r0.f3775o
            if (r2 == 0) goto L_0x00f8
            if (r7 != 0) goto L_0x00f7
            r6.mo3667a(r0, r1)
        L_0x00f7:
            return r1
        L_0x00f8:
            android.support.v7.view.b r7 = r6.f3738i
            if (r7 == 0) goto L_0x0103
            android.support.v7.view.b r7 = r6.f3738i
            r7.mo3804c()
        L_0x0101:
            r7 = 1
            goto L_0x0111
        L_0x0103:
            android.support.v7.app.ActionBar r7 = r6.mo3659a()
            if (r7 == 0) goto L_0x0110
            boolean r7 = r7.mo3601f()
            if (r7 == 0) goto L_0x0110
            goto L_0x0101
        L_0x0110:
            r7 = 0
        L_0x0111:
            if (r7 == 0) goto L_0x0114
            return r1
        L_0x0114:
            r1 = 0
        L_0x0115:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.app.AppCompatDelegateImpl.mo3673a(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3667a(PanelFeatureState panelFeatureState, boolean z) {
        if (!z || panelFeatureState.f3761a != 0 || this.f3710A == null || !this.f3710A.mo4375c()) {
            WindowManager windowManager = (WindowManager) this.f3731b.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f3775o || panelFeatureState.f3767g == null)) {
                windowManager.removeView(panelFeatureState.f3767g);
                if (z) {
                    mo3664a(panelFeatureState.f3761a, panelFeatureState, null);
                }
            }
            panelFeatureState.f3773m = false;
            panelFeatureState.f3774n = false;
            panelFeatureState.f3775o = false;
            panelFeatureState.f3768h = null;
            panelFeatureState.f3777q = true;
            if (this.f3721L == panelFeatureState) {
                this.f3721L = null;
            }
            return;
        }
        mo3677b(panelFeatureState.f3770j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3664a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f3720K.length) {
                panelFeatureState = this.f3720K[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f3770j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f3775o) && !this.f3749t) {
            this.f3733d.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public final void mo1289a(C1246h hVar) {
        if (this.f3710A == null || !this.f3710A.mo4374b() || (ViewConfiguration.get(this.f3731b).hasPermanentMenuKey() && !this.f3710A.mo4377d())) {
            PanelFeatureState a = mo3660a(0, true);
            a.f3777q = true;
            mo3667a(a, false);
            m3351a(a, (KeyEvent) null);
        } else {
            Callback l = mo3693l();
            if (this.f3710A.mo4375c()) {
                this.f3710A.mo4380f();
                if (!this.f3749t) {
                    l.onPanelClosed(108, mo3660a(0, true).f3770j);
                }
            } else if (l != null && !this.f3749t) {
                if (this.f3750u && (this.f3751v & 1) != 0) {
                    this.f3732c.getDecorView().removeCallbacks(this.f3726Q);
                    this.f3726Q.run();
                }
                PanelFeatureState a2 = mo3660a(0, true);
                if (a2.f3770j != null && !a2.f3778r && l.onPreparePanel(0, a2.f3769i, a2.f3770j)) {
                    l.onMenuOpened(108, a2.f3770j);
                    this.f3710A.mo4379e();
                }
            }
        }
    }

    /* renamed from: a */
    public final ActionBar mo3659a() {
        m3362q();
        return this.f3736g;
    }

    /* renamed from: h */
    public final C1159a mo3690h() {
        return new C1148a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final Callback mo3693l() {
        return this.f3732c.getCallback();
    }

    /* renamed from: w */
    private void m3368w() {
        if (this.f3714E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: x */
    private int m3369x() {
        if (this.f3723N != -100) {
            return this.f3723N;
        }
        return m3464k();
    }

    /* renamed from: e */
    public final void mo3684e() {
        ActionBar a = mo3659a();
        if (a != null) {
            a.mo3598e(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo3696o() {
        if (this.f3742m != null) {
            this.f3742m.mo3251b();
        }
    }

    /* renamed from: r */
    private Context m3363r() {
        Context context;
        ActionBar a = mo3659a();
        if (a != null) {
            context = a.mo3592b();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f3731b;
        }
        return context;
    }

    /* renamed from: v */
    private CharSequence m3367v() {
        if (this.f3733d instanceof Activity) {
            return ((Activity) this.f3733d).getTitle();
        }
        return this.f3752z;
    }

    /* renamed from: y */
    private void m3370y() {
        if (this.f3725P == null) {
            this.f3725P = new C1153e(C1174i.m3518a(this.f3731b));
        }
    }

    /* renamed from: b */
    public final MenuInflater mo3674b() {
        Context context;
        if (this.f3737h == null) {
            m3362q();
            if (this.f3736g != null) {
                context = this.f3736g.mo3592b();
            } else {
                context = this.f3731b;
            }
            this.f3737h = new C1225g(context);
        }
        return this.f3737h;
    }

    /* renamed from: d */
    public final void mo3682d() {
        ActionBar a = mo3659a();
        if (a != null) {
            a.mo3598e(false);
        }
        if (this.f3725P != null) {
            this.f3725P.mo3733c();
        }
    }

    /* renamed from: f */
    public final void mo3686f() {
        ActionBar a = mo3659a();
        if (a == null || !a.mo3599e()) {
            m3358h(0);
        }
    }

    /* renamed from: i */
    public final void mo3691i() {
        LayoutInflater from = LayoutInflater.from(this.f3731b);
        if (from.getFactory() == null) {
            C1042g.m2976a(from, this);
        } else {
            from.getFactory2();
        }
    }

    /* renamed from: j */
    public final boolean mo3692j() {
        boolean z;
        int x = m3369x();
        int j = m3360j(x);
        if (j != -1) {
            z = m3361k(j);
        } else {
            z = false;
        }
        if (x == 0) {
            m3370y();
            this.f3725P.mo3732b();
        }
        this.f3724O = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo3694m() {
        if (!this.f3714E || this.f3743n == null || !C1056u.m3079y(this.f3743n)) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f3707w = z;
        if (f3707w && !f3709y) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    boolean z = false;
                    if (th instanceof NotFoundException) {
                        String message = th.getMessage();
                        if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                            z = true;
                        }
                    }
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        NotFoundException notFoundException = new NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    /* renamed from: q */
    private void m3362q() {
        m3364s();
        if (this.f3744o && this.f3736g == null) {
            if (this.f3733d instanceof Activity) {
                this.f3736g = new C1176j((Activity) this.f3733d, this.f3745p);
            } else if (this.f3733d instanceof Dialog) {
                this.f3736g = new C1176j((Dialog) this.f3733d);
            }
            if (this.f3736g != null) {
                this.f3736g.mo3596d(this.f3727R);
            }
        }
    }

    /* renamed from: z */
    private boolean m3371z() {
        if (!this.f3724O || !(this.f3731b instanceof Activity)) {
            return false;
        }
        try {
            if ((this.f3731b.getPackageManager().getActivityInfo(new ComponentName(this.f3731b, this.f3731b.getClass()), 0).configChanges & UnReadVideoExperiment.LIKE_USER_LIST) == 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final void mo3689g() {
        if (this.f3750u) {
            this.f3732c.getDecorView().removeCallbacks(this.f3726Q);
        }
        this.f3749t = true;
        if (this.f3736g != null) {
            this.f3736g.mo3602g();
        }
        if (this.f3725P != null) {
            this.f3725P.mo3733c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo3699p() {
        if (this.f3710A != null) {
            this.f3710A.mo4388h();
        }
        if (this.f3740k != null) {
            this.f3732c.getDecorView().removeCallbacks(this.f3741l);
            if (this.f3740k.isShowing()) {
                try {
                    this.f3740k.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f3740k = null;
        }
        mo3696o();
        PanelFeatureState a = mo3660a(0, false);
        if (a != null && a.f3770j != null) {
            a.f3770j.close();
        }
    }

    /* renamed from: s */
    private void m3364s() {
        if (!this.f3714E) {
            this.f3743n = m3365t();
            CharSequence v = m3367v();
            if (!TextUtils.isEmpty(v)) {
                if (this.f3710A != null) {
                    this.f3710A.setWindowTitle(v);
                } else if (this.f3736g != null) {
                    this.f3736g.mo3588a(v);
                } else if (this.f3715F != null) {
                    this.f3715F.setText(v);
                }
            }
            m3366u();
            this.f3714E = true;
            PanelFeatureState a = mo3660a(0, false);
            if (this.f3749t) {
                return;
            }
            if (a == null || a.f3770j == null) {
                m3358h(108);
            }
        }
    }

    /* renamed from: u */
    private void m3366u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f3743n.findViewById(16908290);
        View decorView = this.f3732c.getDecorView();
        contentFrameLayout.mo4648a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f3731b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.a, R.attr.b, R.attr.c, R.attr.d, R.attr.e, R.attr.f, R.attr.g, R.attr.h, R.attr.i, R.attr.j, R.attr.k, R.attr.l, R.attr.m, R.attr.o, R.attr.p, R.attr.q, R.attr.r, R.attr.s, R.attr.t, R.attr.u, R.attr.v, R.attr.w, R.attr.x, R.attr.y, R.attr.z, R.attr.a0, R.attr.a1, R.attr.a2, R.attr.a3, R.attr.a4, R.attr.a7, R.attr.aj, R.attr.ak, R.attr.al, R.attr.am, R.attr.bm, R.attr.cn, R.attr.df, R.attr.dg, R.attr.dh, R.attr.di, R.attr.dj, R.attr.dr, R.attr.ds, R.attr.ea, R.attr.ef, R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.g1, R.attr.ig, R.attr.jn, R.attr.jo, R.attr.jp, R.attr.jv, R.attr.jz, R.attr.k3, R.attr.k4, R.attr.k6, R.attr.k7, R.attr.k8, R.attr.nh, R.attr.oa, R.attr.sm, R.attr.sp, R.attr.ss, R.attr.st, R.attr.su, R.attr.sv, R.attr.sw, R.attr.sx, R.attr.sy, R.attr.v9, R.attr.v_, R.attr.va, R.attr.vr, R.attr.vt, R.attr.xp, R.attr.xw, R.attr.xx, R.attr.xy, R.attr.a1a, R.attr.a1c, R.attr.a1f, R.attr.a1g, R.attr.a2p, R.attr.a2q, R.attr.a45, R.attr.a5u, R.attr.a5v, R.attr.a5w, R.attr.a5x, R.attr.a5z, R.attr.a60, R.attr.a61, R.attr.a62, R.attr.a68, R.attr.a69, R.attr.a7_, R.attr.a7a, R.attr.a7b, R.attr.a7c, R.attr.a_n, R.attr.aad, R.attr.aae, R.attr.aaf, R.attr.aag, R.attr.aah, R.attr.aai, R.attr.aaj, R.attr.aak, R.attr.aal, R.attr.aam});
        obtainStyledAttributes.getValue(118, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(119, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(116)) {
            obtainStyledAttributes.getValue(116, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.getValue(117, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(114)) {
            obtainStyledAttributes.getValue(114, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.getValue(115, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: t */
    private ViewGroup m3365t() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f3731b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.a, R.attr.b, R.attr.c, R.attr.d, R.attr.e, R.attr.f, R.attr.g, R.attr.h, R.attr.i, R.attr.j, R.attr.k, R.attr.l, R.attr.m, R.attr.o, R.attr.p, R.attr.q, R.attr.r, R.attr.s, R.attr.t, R.attr.u, R.attr.v, R.attr.w, R.attr.x, R.attr.y, R.attr.z, R.attr.a0, R.attr.a1, R.attr.a2, R.attr.a3, R.attr.a4, R.attr.a7, R.attr.aj, R.attr.ak, R.attr.al, R.attr.am, R.attr.bm, R.attr.cn, R.attr.df, R.attr.dg, R.attr.dh, R.attr.di, R.attr.dj, R.attr.dr, R.attr.ds, R.attr.ea, R.attr.ef, R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.g1, R.attr.ig, R.attr.jn, R.attr.jo, R.attr.jp, R.attr.jv, R.attr.jz, R.attr.k3, R.attr.k4, R.attr.k6, R.attr.k7, R.attr.k8, R.attr.nh, R.attr.oa, R.attr.sm, R.attr.sp, R.attr.ss, R.attr.st, R.attr.su, R.attr.sv, R.attr.sw, R.attr.sx, R.attr.sy, R.attr.v9, R.attr.v_, R.attr.va, R.attr.vr, R.attr.vt, R.attr.xp, R.attr.xw, R.attr.xx, R.attr.xy, R.attr.a1a, R.attr.a1c, R.attr.a1f, R.attr.a1g, R.attr.a2p, R.attr.a2q, R.attr.a45, R.attr.a5u, R.attr.a5v, R.attr.a5w, R.attr.a5x, R.attr.a5z, R.attr.a60, R.attr.a61, R.attr.a62, R.attr.a68, R.attr.a69, R.attr.a7_, R.attr.a7a, R.attr.a7b, R.attr.a7c, R.attr.a_n, R.attr.aad, R.attr.aae, R.attr.aaf, R.attr.aag, R.attr.aah, R.attr.aai, R.attr.aaj, R.attr.aak, R.attr.aal, R.attr.aam});
        if (obtainStyledAttributes.hasValue(111)) {
            if (obtainStyledAttributes.getBoolean(120, false)) {
                mo3681c(1);
            } else if (obtainStyledAttributes.getBoolean(111, false)) {
                mo3681c(108);
            }
            if (obtainStyledAttributes.getBoolean(112, false)) {
                mo3681c(109);
            }
            if (obtainStyledAttributes.getBoolean(113, false)) {
                mo3681c(10);
            }
            this.f3747r = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.f3732c.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f3731b);
            if (this.f3748s) {
                if (this.f3746q) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.w, null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(R.layout.v, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    C1056u.m3032a((View) viewGroup, (C1051p) new C1051p() {
                        /* renamed from: a */
                        public final C1018ac mo1130a(View view, C1018ac acVar) {
                            int b = acVar.mo3186b();
                            int g = AppCompatDelegateImpl.this.mo3688g(b);
                            if (b != g) {
                                acVar = acVar.mo3185a(acVar.mo3184a(), g, acVar.mo3187c(), acVar.mo3188d());
                            }
                            return C1056u.m3022a(view, acVar);
                        }
                    });
                } else {
                    ((C1405ab) viewGroup).setOnFitSystemWindowsListener(new C1406a() {
                        /* renamed from: a */
                        public final void mo3702a(Rect rect) {
                            rect.top = AppCompatDelegateImpl.this.mo3688g(rect.top);
                        }
                    });
                }
            } else if (this.f3747r) {
                viewGroup = (ViewGroup) from.inflate(R.layout.m, null);
                this.f3745p = false;
                this.f3744o = false;
            } else if (this.f3744o) {
                TypedValue typedValue = new TypedValue();
                this.f3731b.getTheme().resolveAttribute(R.attr.j, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C1221d(this.f3731b, typedValue.resourceId);
                } else {
                    context = this.f3731b;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.x, null);
                this.f3710A = (C1504u) viewGroup.findViewById(R.id.a3p);
                this.f3710A.setWindowCallback(mo3693l());
                if (this.f3745p) {
                    this.f3710A.mo4372a(109);
                }
                if (this.f3717H) {
                    this.f3710A.mo4372a(2);
                }
                if (this.f3718I) {
                    this.f3710A.mo4372a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f3710A == null) {
                    this.f3715F = (TextView) viewGroup.findViewById(R.id.title);
                }
                C1467bj.m5139b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.a5);
                ViewGroup viewGroup2 = (ViewGroup) this.f3732c.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f3732c.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C1300a() {
                    /* renamed from: a */
                    public final void mo3703a() {
                        AppCompatDelegateImpl.this.mo3699p();
                    }
                });
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f3744o);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f3745p);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f3747r);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f3746q);
            sb.append(", windowNoTitle: ");
            sb.append(this.f3748s);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: b */
    public final void mo3676b(Bundle bundle) {
        m3364s();
    }

    /* renamed from: a */
    public final <T extends View> T mo3663a(int i) {
        m3364s();
        return this.f3732c.findViewById(i);
    }

    /* renamed from: c */
    public final void mo3680c(Bundle bundle) {
        if (this.f3723N != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f3723N);
        }
    }

    /* renamed from: a */
    private boolean m3352a(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo3706a(m3363r());
        panelFeatureState.f3767g = new C1155f(panelFeatureState.f3772l);
        panelFeatureState.f3763c = 81;
        return true;
    }

    /* renamed from: h */
    private void m3358h(int i) {
        this.f3751v = (1 << i) | this.f3751v;
        if (!this.f3750u) {
            C1056u.m3034a(this.f3732c.getDecorView(), this.f3726Q);
            this.f3750u = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo3685e(int i) {
        mo3667a(mo3660a(0, true), true);
    }

    /* renamed from: c */
    private boolean m3357c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.f3769i != null) {
            panelFeatureState.f3768h = panelFeatureState.f3769i;
            return true;
        } else if (panelFeatureState.f3770j == null) {
            return false;
        } else {
            if (this.f3712C == null) {
                this.f3712C = new C1156g();
            }
            panelFeatureState.f3768h = (View) panelFeatureState.mo3705a((C1263a) this.f3712C);
            if (panelFeatureState.f3768h != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: j */
    private int m3360j(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f3731b.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m3370y();
        return this.f3725P.mo3731a();
    }

    /* renamed from: b */
    public final void mo3675b(int i) {
        m3364s();
        ViewGroup viewGroup = (ViewGroup) this.f3743n.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3731b).inflate(i, viewGroup);
        this.f3733d.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo3683d(int i) {
        if (i == 108) {
            ActionBar a = mo3659a();
            if (a != null) {
                a.mo3600f(false);
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState a2 = mo3660a(i, true);
            if (a2.f3775o) {
                mo3667a(a2, false);
            }
        }
    }

    /* renamed from: b */
    private boolean m3355b(PanelFeatureState panelFeatureState) {
        Context context = this.f3731b;
        if ((panelFeatureState.f3761a == 0 || panelFeatureState.f3761a == 108) && this.f3710A != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.j, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.k, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.k, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context dVar = new C1221d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C1246h hVar = new C1246h(context);
        hVar.mo4108a((C1247a) this);
        panelFeatureState.mo3707a(hVar);
        return true;
    }

    /* renamed from: k */
    private boolean m3361k(int i) {
        int i2;
        Resources resources = this.f3731b.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        if (i == 2) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        if (i3 == i2) {
            return false;
        }
        if (m3371z()) {
            ((Activity) this.f3731b).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i2 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                ResourcesFlusher.flush(resources);
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo3681c(int i) {
        int i2 = m3359i(i);
        if (this.f3748s && i2 == 108) {
            return false;
        }
        if (this.f3744o && i2 == 1) {
            this.f3744o = false;
        }
        switch (i2) {
            case 1:
                m3368w();
                this.f3748s = true;
                return true;
            case 2:
                m3368w();
                this.f3717H = true;
                return true;
            case 5:
                m3368w();
                this.f3718I = true;
                return true;
            case 10:
                m3368w();
                this.f3746q = true;
                return true;
            case 108:
                m3368w();
                this.f3744o = true;
                return true;
            case 109:
                m3368w();
                this.f3745p = true;
                return true;
            default:
                return this.f3732c.requestFeature(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo3687f(int i) {
        PanelFeatureState a = mo3660a(i, true);
        if (a.f3770j != null) {
            Bundle bundle = new Bundle();
            a.f3770j.mo4128c(bundle);
            if (bundle.size() > 0) {
                a.f3779s = bundle;
            }
            a.f3770j.mo4137e();
            a.f3770j.clear();
        }
        a.f3778r = true;
        a.f3777q = true;
        if ((i == 108 || i == 0) && this.f3710A != null) {
            PanelFeatureState a2 = mo3660a(0, false);
            if (a2 != null) {
                a2.f3773m = false;
                m3356b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo3688g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = 0;
        if (this.f3739j == null || !(this.f3739j.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f3739j.getLayoutParams();
            z = true;
            if (this.f3739j.isShown()) {
                if (this.f3728S == null) {
                    this.f3728S = new Rect();
                    this.f3729T = new Rect();
                }
                Rect rect = this.f3728S;
                Rect rect2 = this.f3729T;
                rect.set(0, i, 0, 0);
                C1467bj.m5137a(this.f3743n, rect, rect2);
                if (rect2.top == 0) {
                    i2 = i;
                } else {
                    i2 = 0;
                }
                if (marginLayoutParams.topMargin != i2) {
                    marginLayoutParams.topMargin = i;
                    if (this.f3716G == null) {
                        this.f3716G = new View(this.f3731b);
                        this.f3716G.setBackgroundColor(this.f3731b.getResources().getColor(R.color.a5));
                        this.f3743n.addView(this.f3716G, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f3716G.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f3716G.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f3716G == null) {
                    z = false;
                }
                if (!this.f3746q && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f3739j.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f3716G != null) {
            View view = this.f3716G;
            if (!z) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p043v7.view.C1218b m3354b(android.support.p043v7.view.C1218b.C1219a r8) {
        /*
            r7 = this;
            r7.mo3696o()
            android.support.v7.view.b r0 = r7.f3738i
            if (r0 == 0) goto L_0x000c
            android.support.v7.view.b r0 = r7.f3738i
            r0.mo3804c()
        L_0x000c:
            android.support.v7.app.c r0 = r7.f3735f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r7.f3749t
            if (r0 != 0) goto L_0x001c
            android.support.v7.app.c r0 = r7.f3735f     // Catch:{ AbstractMethodError -> 0x001c }
            android.support.v7.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0023
            r7.f3738i = r0
            goto L_0x0164
        L_0x0023:
            android.support.v7.widget.ActionBarContextView r0 = r7.f3739j
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f3747r
            if (r0 == 0) goto L_0x00b4
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f3731b
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2131361810(0x7f0a0012, float:1.8343383E38)
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0063
            android.content.Context r5 = r7.f3731b
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.d r4 = new android.support.v7.view.d
            android.content.Context r6 = r7.f3731b
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x0065
        L_0x0063:
            android.content.Context r4 = r7.f3731b
        L_0x0065:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f3739j = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 2131361824(0x7f0a0020, float:1.8343411E38)
            r5.<init>(r4, r1, r6)
            r7.f3740k = r5
            android.widget.PopupWindow r5 = r7.f3740k
            r6 = 2
            android.support.p030v4.widget.C1112l.m3246a(r5, r6)
            android.widget.PopupWindow r5 = r7.f3740k
            android.support.v7.widget.ActionBarContextView r6 = r7.f3739j
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f3740k
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            r6 = 2131361804(0x7f0a000c, float:1.834337E38)
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f3739j
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f3740k
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.AppCompatDelegateImpl$6 r0 = new android.support.v7.app.AppCompatDelegateImpl$6
            r0.<init>()
            r7.f3741l = r0
            goto L_0x00d4
        L_0x00b4:
            android.view.ViewGroup r0 = r7.f3743n
            r4 = 2132017200(0x7f140030, float:1.9672672E38)
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p043v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.m3363r()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo5425a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p043v7.widget.ActionBarContextView) r0
            r7.f3739j = r0
        L_0x00d4:
            android.support.v7.widget.ActionBarContextView r0 = r7.f3739j
            if (r0 == 0) goto L_0x0164
            r7.mo3696o()
            android.support.v7.widget.ActionBarContextView r0 = r7.f3739j
            r0.mo4350c()
            android.support.v7.view.e r0 = new android.support.v7.view.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f3739j
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f3739j
            android.widget.PopupWindow r6 = r7.f3740k
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo3801b()
            boolean r8 = r8.mo3718a(r0, r3)
            if (r8 == 0) goto L_0x0162
            r0.mo3805d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            r8.mo4347a(r0)
            r7.f3738i = r0
            boolean r8 = r7.mo3694m()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012c
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            android.support.v4.view.y r8 = android.support.p030v4.view.C1056u.m3067m(r8)
            android.support.v4.view.y r8 = r8.mo3244a(r0)
            r7.f3742m = r8
            android.support.v4.view.y r8 = r7.f3742m
            android.support.v7.app.AppCompatDelegateImpl$7 r0 = new android.support.v7.app.AppCompatDelegateImpl$7
            r0.<init>()
            r8.mo3247a(r0)
            goto L_0x0152
        L_0x012c:
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0152
            android.support.v7.widget.ActionBarContextView r8 = r7.f3739j
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p030v4.view.C1056u.m3072r(r8)
        L_0x0152:
            android.widget.PopupWindow r8 = r7.f3740k
            if (r8 == 0) goto L_0x0164
            android.view.Window r8 = r7.f3732c
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f3741l
            r8.post(r0)
            goto L_0x0164
        L_0x0162:
            r7.f3738i = r1
        L_0x0164:
            android.support.v7.view.b r8 = r7.f3738i
            if (r8 == 0) goto L_0x0173
            android.support.v7.app.c r8 = r7.f3735f
            if (r8 == 0) goto L_0x0173
            android.support.v7.app.c r8 = r7.f3735f
            android.support.v7.view.b r0 = r7.f3738i
            r8.onSupportActionModeStarted(r0)
        L_0x0173:
            android.support.v7.view.b r8 = r7.f3738i
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.app.AppCompatDelegateImpl.m3354b(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PanelFeatureState mo3661a(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f3720K;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f3770j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo3677b(C1246h hVar) {
        if (!this.f3719J) {
            this.f3719J = true;
            this.f3710A.mo4388h();
            Callback l = mo3693l();
            if (l != null && !this.f3749t) {
                l.onPanelClosed(108, hVar);
            }
            this.f3719J = false;
        }
    }

    /* renamed from: a */
    public final C1218b mo3662a(C1219a aVar) {
        if (aVar != null) {
            if (this.f3738i != null) {
                this.f3738i.mo3804c();
            }
            C1150c cVar = new C1150c(aVar);
            ActionBar a = mo3659a();
            if (a != null) {
                this.f3738i = a.mo3584a((C1219a) cVar);
                if (!(this.f3738i == null || this.f3735f == null)) {
                    this.f3735f.onSupportActionModeStarted(this.f3738i);
                }
            }
            if (this.f3738i == null) {
                this.f3738i = m3354b((C1219a) cVar);
            }
            return this.f3738i;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PanelFeatureState mo3660a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f3720K;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f3720K = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    private void m3351a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        boolean z;
        if (!panelFeatureState.f3775o && !this.f3749t) {
            if (panelFeatureState.f3761a == 0) {
                if ((this.f3731b.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Callback l = mo3693l();
            if (l == null || l.onMenuOpened(panelFeatureState.f3761a, panelFeatureState.f3770j)) {
                WindowManager windowManager = (WindowManager) this.f3731b.getSystemService("window");
                if (windowManager != null && m3356b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f3767g == null || panelFeatureState.f3777q) {
                        if (panelFeatureState.f3767g == null) {
                            m3352a(panelFeatureState);
                            if (panelFeatureState.f3767g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f3777q && panelFeatureState.f3767g.getChildCount() > 0) {
                            panelFeatureState.f3767g.removeAllViews();
                        }
                        if (m3357c(panelFeatureState) && panelFeatureState.mo3708a()) {
                            LayoutParams layoutParams = panelFeatureState.f3768h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            panelFeatureState.f3767g.setBackgroundResource(panelFeatureState.f3762b);
                            ViewParent parent = panelFeatureState.f3768h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f3768h);
                            }
                            panelFeatureState.f3767g.addView(panelFeatureState.f3768h, layoutParams);
                            if (!panelFeatureState.f3768h.hasFocus()) {
                                panelFeatureState.f3768h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (panelFeatureState.f3769i != null) {
                        LayoutParams layoutParams2 = panelFeatureState.f3769i.getLayoutParams();
                        if (layoutParams2 != null && layoutParams2.width == -1) {
                            i = -1;
                            panelFeatureState.f3774n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f3764d, panelFeatureState.f3765e, BaseNotice.CHECK_PROFILE, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f3763c;
                            layoutParams3.windowAnimations = panelFeatureState.f3766f;
                            windowManager.addView(panelFeatureState.f3767g, layoutParams3);
                            panelFeatureState.f3775o = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f3774n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f3764d, panelFeatureState.f3765e, BaseNotice.CHECK_PROFILE, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f3763c;
                    layoutParams32.windowAnimations = panelFeatureState.f3766f;
                    windowManager.addView(panelFeatureState.f3767g, layoutParams32);
                    panelFeatureState.f3775o = true;
                    return;
                }
                return;
            }
            mo3667a(panelFeatureState, true);
        }
    }

    /* renamed from: b */
    private boolean m3356b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        if (this.f3749t) {
            return false;
        }
        if (panelFeatureState.f3773m) {
            return true;
        }
        if (!(this.f3721L == null || this.f3721L == panelFeatureState)) {
            mo3667a(this.f3721L, false);
        }
        Callback l = mo3693l();
        if (l != null) {
            panelFeatureState.f3769i = l.onCreatePanelView(panelFeatureState.f3761a);
        }
        if (panelFeatureState.f3761a == 0 || panelFeatureState.f3761a == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f3710A != null) {
            this.f3710A.mo4382g();
        }
        if (panelFeatureState.f3769i == null && (!z || !(this.f3736g instanceof C1167g))) {
            if (panelFeatureState.f3770j == null || panelFeatureState.f3778r) {
                if (panelFeatureState.f3770j == null) {
                    m3355b(panelFeatureState);
                    if (panelFeatureState.f3770j == null) {
                        return false;
                    }
                }
                if (z && this.f3710A != null) {
                    if (this.f3711B == null) {
                        this.f3711B = new C1149b();
                    }
                    this.f3710A.mo4373a(panelFeatureState.f3770j, this.f3711B);
                }
                panelFeatureState.f3770j.mo4137e();
                if (!l.onCreatePanelMenu(panelFeatureState.f3761a, panelFeatureState.f3770j)) {
                    panelFeatureState.mo3707a((C1246h) null);
                    if (z && this.f3710A != null) {
                        this.f3710A.mo4373a(null, this.f3711B);
                    }
                    return false;
                }
                panelFeatureState.f3778r = false;
            }
            panelFeatureState.f3770j.mo4137e();
            if (panelFeatureState.f3779s != null) {
                panelFeatureState.f3770j.mo4134d(panelFeatureState.f3779s);
                panelFeatureState.f3779s = null;
            }
            if (!l.onPreparePanel(0, panelFeatureState.f3769i, panelFeatureState.f3770j)) {
                if (z && this.f3710A != null) {
                    this.f3710A.mo4373a(null, this.f3711B);
                }
                panelFeatureState.f3770j.mo4138f();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f3776p = z2;
            panelFeatureState.f3770j.setQwertyMode(panelFeatureState.f3776p);
            panelFeatureState.f3770j.mo4138f();
        }
        panelFeatureState.f3773m = true;
        panelFeatureState.f3774n = false;
        this.f3721L = panelFeatureState;
        return true;
    }

    /* renamed from: b */
    public final void mo3678b(View view, LayoutParams layoutParams) {
        m3364s();
        ((ViewGroup) this.f3743n.findViewById(16908290)).addView(view, layoutParams);
        this.f3733d.onContentChanged();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, C1162c cVar) {
        this.f3731b = context;
        this.f3732c = window;
        this.f3735f = cVar;
        this.f3733d = this.f3732c.getCallback();
        if (!(this.f3733d instanceof C1152d)) {
            this.f3734e = new C1152d(this.f3733d);
            this.f3732c.setCallback(this.f3734e);
            C1451bb a = C1451bb.m5031a(context, (AttributeSet) null, f3708x);
            Drawable b = a.mo5656b(0);
            if (b != null) {
                this.f3732c.setBackgroundDrawable(b);
            }
            a.mo5653a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m3350a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    private boolean m3353a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f3773m || m3356b(panelFeatureState, keyEvent)) && panelFeatureState.f3770j != null) {
            z = panelFeatureState.f3770j.performShortcut(i, keyEvent, 1);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x005d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m3350a(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            android.support.v7.app.AppCompatViewInflater r0 = r11.f3730U
            r1 = 0
            if (r0 != 0) goto L_0x004b
            android.content.Context r0 = r11.f3731b
            r2 = 121(0x79, float:1.7E-43)
            int[] r2 = new int[r2]
            r2 = {16842839, 16842926, 2131361801, 2131361802, 2131361803, 2131361804, 2131361805, 2131361806, 2131361807, 2131361808, 2131361809, 2131361810, 2131361811, 2131361812, 2131361813, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361823, 2131361824, 2131361825, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361834, 2131361849, 2131361850, 2131361851, 2131361852, 2131361889, 2131361942, 2131361971, 2131361972, 2131361973, 2131361974, 2131361975, 2131361981, 2131361982, 2131362009, 2131362014, 2131362068, 2131362069, 2131362070, 2131362071, 2131362072, 2131362073, 2131362074, 2131362075, 2131362076, 2131362079, 2131362125, 2131362173, 2131362174, 2131362175, 2131362181, 2131362188, 2131362197, 2131362198, 2131362202, 2131362203, 2131362204, 2131362326, 2131362357, 2131362532, 2131362535, 2131362538, 2131362539, 2131362540, 2131362541, 2131362542, 2131362543, 2131362544, 2131362643, 2131362644, 2131362645, 2131362663, 2131362665, 2131362731, 2131362738, 2131362739, 2131362740, 2131362868, 2131362870, 2131362874, 2131362875, 2131362923, 2131362924, 2131362973, 2131363037, 2131363038, 2131363039, 2131363040, 2131363042, 2131363043, 2131363044, 2131363045, 2131363051, 2131363052, 2131363091, 2131363092, 2131363093, 2131363094, 2131363217, 2131363245, 2131363246, 2131363247, 2131363248, 2131363249, 2131363250, 2131363251, 2131363252, 2131363253, 2131363254} // fill-array
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            r2 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x0044
            java.lang.Class<android.support.v7.app.AppCompatViewInflater> r2 = android.support.p043v7.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0027
            goto L_0x0044
        L_0x0027:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x003c }
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x003c }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch:{ Throwable -> 0x003c }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x003c }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ Throwable -> 0x003c }
            android.support.v7.app.AppCompatViewInflater r0 = (android.support.p043v7.app.AppCompatViewInflater) r0     // Catch:{ Throwable -> 0x003c }
            r11.f3730U = r0     // Catch:{ Throwable -> 0x003c }
            goto L_0x004b
        L_0x003c:
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            r11.f3730U = r0
            goto L_0x004b
        L_0x0044:
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            r11.f3730U = r0
        L_0x004b:
            boolean r0 = f3707w
            if (r0 == 0) goto L_0x0085
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            r2 = 1
            if (r0 == 0) goto L_0x005f
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x0083
        L_0x005d:
            r1 = 1
            goto L_0x0083
        L_0x005f:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x0065
            goto L_0x0083
        L_0x0065:
            android.view.Window r3 = r11.f3732c
            android.view.View r3 = r3.getDecorView()
        L_0x006b:
            if (r0 != 0) goto L_0x006e
            goto L_0x005d
        L_0x006e:
            if (r0 == r3) goto L_0x0083
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L_0x0083
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = android.support.p030v4.view.C1056u.m3018B(r4)
            if (r4 == 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x006b
        L_0x0083:
            r7 = r1
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            android.support.v7.app.AppCompatViewInflater r2 = r11.f3730U
            boolean r8 = f3707w
            r9 = 1
            boolean r10 = android.support.p043v7.widget.C1460bg.m5100a()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.app.AppCompatDelegateImpl.m3350a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
