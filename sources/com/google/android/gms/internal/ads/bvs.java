package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.C14963ax;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@C16299uq
public final class bvs implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    public static final long f44060a = ((Long) caf.m37099d().mo30717a(C15740bx.f44299bg)).longValue();

    /* renamed from: b */
    public aeh f44061b = new aeh(f44060a);

    /* renamed from: c */
    private final Context f44062c;

    /* renamed from: d */
    private Application f44063d;

    /* renamed from: e */
    private final WindowManager f44064e;

    /* renamed from: f */
    private final PowerManager f44065f;

    /* renamed from: g */
    private final KeyguardManager f44066g;

    /* renamed from: h */
    private BroadcastReceiver f44067h;

    /* renamed from: i */
    private WeakReference<ViewTreeObserver> f44068i;

    /* renamed from: j */
    private WeakReference<View> f44069j;

    /* renamed from: k */
    private bvy f44070k;

    /* renamed from: l */
    private boolean f44071l = false;

    /* renamed from: m */
    private int f44072m = -1;

    /* renamed from: n */
    private final HashSet<bvw> f44073n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f44074o;

    /* renamed from: p */
    private final Rect f44075p;

    public bvs(Context context, View view) {
        this.f44062c = context.getApplicationContext();
        this.f44064e = (WindowManager) context.getSystemService("window");
        this.f44065f = (PowerManager) this.f44062c.getSystemService("power");
        this.f44066g = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f44062c instanceof Application) {
            this.f44063d = (Application) this.f44062c;
            this.f44070k = new bvy((Application) this.f44062c, this);
        }
        this.f44074o = context.getResources().getDisplayMetrics();
        this.f44075p = new Rect();
        this.f44075p.right = this.f44064e.getDefaultDisplay().getWidth();
        this.f44075p.bottom = this.f44064e.getDefaultDisplay().getHeight();
        View view2 = this.f44069j != null ? (View) this.f44069j.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m36891c(view2);
        }
        this.f44069j = new WeakReference<>(view);
        if (view != null) {
            if (C14963ax.m30832b().mo28693a(view)) {
                m36890b(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo30776a(bvw bvw) {
        this.f44073n.add(bvw);
        mo30775a(3);
    }

    /* renamed from: b */
    public final void mo30777b(bvw bvw) {
        this.f44073n.remove(bvw);
    }

    /* renamed from: a */
    private final void m36886a() {
        acd.f40245a.post(new bvt(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f44072m = -1;
        m36890b(view);
        mo30775a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f44072m = -1;
        mo30775a(3);
        m36886a();
        m36891c(view);
    }

    /* renamed from: a */
    private final void m36887a(Activity activity, int i) {
        if (this.f44069j != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f44069j.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f44072m = i;
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m36887a(activity, 0);
        mo30775a(3);
        m36886a();
    }

    public final void onActivityStarted(Activity activity) {
        m36887a(activity, 0);
        mo30775a(3);
        m36886a();
    }

    public final void onActivityResumed(Activity activity) {
        m36887a(activity, 0);
        mo30775a(3);
        m36886a();
    }

    public final void onActivityPaused(Activity activity) {
        m36887a(activity, 4);
        mo30775a(3);
        m36886a();
    }

    public final void onActivityStopped(Activity activity) {
        mo30775a(3);
        m36886a();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo30775a(3);
        m36886a();
    }

    public final void onActivityDestroyed(Activity activity) {
        mo30775a(3);
        m36886a();
    }

    public final void onGlobalLayout() {
        mo30775a(2);
        m36886a();
    }

    public final void onScrollChanged() {
        mo30775a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30775a(int i) {
        boolean z;
        boolean z2;
        List list;
        int i2 = i;
        if (this.f44073n.size() != 0 && this.f44069j != null) {
            View view = (View) this.f44069j.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    abv.m32793b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44302bj)).booleanValue() || view == null) {
                list = Collections.emptyList();
            } else {
                list = m36885a(view);
            }
            List list2 = list;
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f44072m != -1) {
                windowVisibility = this.f44072m;
            }
            boolean z5 = !z4 && acd.m32591a(view, this.f44065f, this.f44066g) && z2 && z && windowVisibility == 0;
            if (z3 && !this.f44061b.mo28750a() && z5 == this.f44071l) {
                return;
            }
            if (z5 || this.f44071l || i2 != 1) {
                bvv bvv = new bvv(C14963ax.m30837g().mo28524b(), this.f44065f.isScreenOn(), view != null ? C14963ax.m30832b().mo28693a(view) : false, view != null ? view.getWindowVisibility() : 8, m36884a(this.f44075p), m36884a(rect), m36884a(rect2), z2, m36884a(rect3), z, m36884a(rect4), this.f44074o.density, z5, list2);
                Iterator it = this.f44073n.iterator();
                while (it.hasNext()) {
                    ((bvw) it.next()).mo28549a(bvv);
                }
                this.f44071l = z5;
            }
        }
    }

    /* renamed from: a */
    private final Rect m36884a(Rect rect) {
        return new Rect(m36889b(rect.left), m36889b(rect.top), m36889b(rect.right), m36889b(rect.bottom));
    }

    /* renamed from: b */
    private final int m36889b(int i) {
        return (int) (((float) i) / this.f44074o.density);
    }

    /* renamed from: a */
    private final List<Rect> m36885a(View view) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (VERSION.SDK_INT >= 16) {
                    z = view2.isScrollContainer();
                } else {
                    if (!(view2 instanceof ScrollView)) {
                        if (!(view2 instanceof ListView)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(m36884a(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    private final void m36890b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f44068i = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f44067h == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f44067h = new bvu(this);
            C14963ax.m30847q().mo28754a(this.f44062c, this.f44067h, intentFilter);
        }
        if (this.f44063d != null) {
            try {
                this.f44063d.registerActivityLifecycleCallbacks(this.f44070k);
            } catch (Exception e) {
                abv.m32793b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: c */
    private final void m36891c(View view) {
        try {
            if (this.f44068i != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f44068i.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f44068i = null;
            }
        } catch (Exception e) {
            abv.m32793b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            abv.m32793b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f44067h != null) {
            try {
                C14963ax.m30847q().mo28753a(this.f44062c, this.f44067h);
            } catch (IllegalStateException e3) {
                abv.m32793b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C14963ax.m30834d().mo28588a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f44067h = null;
        }
        if (this.f44063d != null) {
            try {
                this.f44063d.unregisterActivityLifecycleCallbacks(this.f44070k);
            } catch (Exception e5) {
                abv.m32793b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }
}
