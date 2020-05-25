package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.graphics.Rect;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper */
public final class AccountKeyBoardHelper implements C0183j, OnGlobalLayoutListener {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59144a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AccountKeyBoardHelper.class), "screenHeight", "getScreenHeight()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AccountKeyBoardHelper.class), "keyBoardHeight", "getKeyBoardHeight()I"))};

    /* renamed from: d */
    public static final C52668f f59145d = C52732g.m112286a(C52757k.NONE, C21855b.f59156a);

    /* renamed from: e */
    public static final C21854a f59146e = new C21854a(null);

    /* renamed from: b */
    public C22015m f59147b;

    /* renamed from: c */
    public final Fragment f59148c;

    /* renamed from: f */
    private final C52668f f59149f = C52732g.m112285a(new C21857d(this));

    /* renamed from: g */
    private final C52668f f59150g = C52732g.m112285a(new C21856c(this));

    /* renamed from: h */
    private final Rect f59151h = new Rect();

    /* renamed from: i */
    private Boolean f59152i;

    /* renamed from: j */
    private boolean f59153j = true;

    /* renamed from: k */
    private final View f59154k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$a */
    public static final class C21854a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f59155a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21854a.class), "needAutoShowKeyboard", "getNeedAutoShowKeyboard()Z"))};

        private C21854a() {
        }

        /* renamed from: a */
        public static boolean m54534a() {
            return ((Boolean) AccountKeyBoardHelper.f59145d.getValue()).booleanValue();
        }

        public /* synthetic */ C21854a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$b */
    static final class C21855b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C21855b f59156a = new C21855b();

        C21855b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (C9432q.m18688b(C11010c.m22280a()) >= 1183) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$c */
    static final class C21856c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AccountKeyBoardHelper f59157a;

        C21856c(AccountKeyBoardHelper accountKeyBoardHelper) {
            this.f59157a = accountKeyBoardHelper;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f59157a.mo45982a() / 3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper$d */
    static final class C21857d extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AccountKeyBoardHelper f59158a;

        C21857d(AccountKeyBoardHelper accountKeyBoardHelper) {
            this.f59158a = accountKeyBoardHelper;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            FragmentActivity activity = this.f59158a.f59148c.getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        View rootView = decorView.getRootView();
                        if (rootView != null) {
                            i = rootView.getHeight();
                            return Integer.valueOf(i);
                        }
                    }
                }
            }
            i = 0;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public final int mo45982a() {
        return ((Number) this.f59149f.getValue()).intValue();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void startListen() {
        this.f59154k.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void stopListen() {
        this.f59154k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        boolean z = false;
        if (this.f59153j) {
            this.f59153j = false;
            return;
        }
        this.f59151h.setEmpty();
        FragmentActivity activity = this.f59148c.getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.getWindowVisibleDisplayFrame(this.f59151h);
                }
            }
        }
        if (mo45982a() - this.f59151h.bottom > ((Number) this.f59150g.getValue()).intValue()) {
            z = true;
        }
        if (!C52711k.m112239a((Object) Boolean.valueOf(z), (Object) this.f59152i)) {
            this.f59152i = Boolean.valueOf(z);
            if (z) {
                C22015m mVar = this.f59147b;
                if (mVar != null) {
                    mVar.mo45996X_();
                }
            } else {
                C22015m mVar2 = this.f59147b;
                if (mVar2 != null) {
                    mVar2.mo45995W_();
                }
            }
        }
    }

    public AccountKeyBoardHelper(View view, Fragment fragment) {
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(fragment, "fragment");
        this.f59154k = view;
        this.f59148c = fragment;
        this.f59148c.getLifecycle().mo324a(this);
    }
}
