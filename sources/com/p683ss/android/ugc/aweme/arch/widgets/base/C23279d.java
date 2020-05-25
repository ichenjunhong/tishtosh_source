package com.p683ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1028c;
import android.support.p030v4.view.C1028c.C1033d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.d */
public class C23279d extends Fragment {

    /* renamed from: d */
    private static final String f62253d = C23279d.class.getCanonicalName();

    /* renamed from: a */
    public Fragment f62254a;

    /* renamed from: b */
    public DataCenter f62255b;

    /* renamed from: c */
    C0655a f62256c = new C0655a() {
        public final void onFragmentViewDestroyed(C0654k kVar, Fragment fragment) {
            if (fragment == C23279d.this.f62254a) {
                kVar.mo2228a(C23279d.this.f62256c);
                fragment.getChildFragmentManager().mo2225a().mo2177a((Fragment) C23279d.this).mo2200e();
            }
        }
    };

    /* renamed from: e */
    private Thread f62257e;

    /* renamed from: f */
    private Handler f62258f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private C23273a f62259g = new C23273a() {
        /* renamed from: a */
        public final Activity mo48244a() {
            return C23279d.this.getActivity();
        }

        /* renamed from: a */
        public final void mo48245a(Intent intent, int i) {
            C23279d.this.startActivityForResult(intent, i);
        }
    };

    /* renamed from: h */
    private View f62260h;

    /* renamed from: i */
    private Context f62261i;

    /* renamed from: j */
    private C1028c f62262j;

    /* renamed from: k */
    private LayoutInflater f62263k;

    /* renamed from: l */
    private List<Widget> f62264l = new CopyOnWriteArrayList();

    /* renamed from: a */
    private boolean m57259a() {
        if (this.f62257e == null) {
            this.f62257e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f62257e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C23279d mo48256b(Widget widget) {
        if (widget == null) {
            return this;
        }
        getLifecycle().mo325b(widget);
        switch (getLifecycle().mo323a()) {
            case CREATED:
                widget.onDestroy();
                break;
            case STARTED:
                widget.onStop();
                widget.onDestroy();
                break;
            case RESUMED:
                widget.onPause();
                widget.onStop();
                widget.onDestroy();
                break;
        }
        widget.f62239f = null;
        widget.f62238e = null;
        this.f62264l.remove(widget);
        if (widget.f62236c != widget.f62237d && (widget.f62236c instanceof ViewGroup)) {
            ((ViewGroup) widget.f62236c).removeAllViews();
        }
        return this;
    }

    /* renamed from: a */
    public final C23279d mo48252a(DataCenter dataCenter) {
        this.f62255b = dataCenter;
        for (Widget widget : this.f62264l) {
            widget.f62238e = dataCenter;
        }
        return this;
    }

    /* renamed from: a */
    public final C23279d mo48253a(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f62239f = this.f62259g;
        widget.f62235b = this.f62261i;
        widget.f62238e = this.f62255b;
        this.f62264l.add(widget);
        getLifecycle().mo324a(widget);
        return this;
    }

    /* renamed from: a */
    public static C23279d m57258a(FragmentActivity fragmentActivity, View view) {
        return m57257a(fragmentActivity, null, view, fragmentActivity);
    }

    /* renamed from: a */
    public static C23279d m57256a(Fragment fragment, View view) {
        return m57257a(null, fragment, view, fragment.getContext());
    }

    /* renamed from: b */
    public final C23279d mo48255b(int i, Widget widget) {
        if (widget == null) {
            return this;
        }
        return mo48251a(this.f62260h.findViewById(i), widget);
    }

    /* renamed from: a */
    public final C23279d mo48250a(int i, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f62239f = this.f62259g;
        widget.f62235b = this.f62261i;
        widget.f62238e = this.f62255b;
        final ViewGroup viewGroup = (ViewGroup) this.f62260h.findViewById(i);
        widget.f62236c = viewGroup;
        if (widget.mo48238a() == 0) {
            mo48254a(widget, viewGroup, null);
            return this;
        }
        this.f62262j.mo3205a(widget.mo48238a(), viewGroup, new C1033d() {
            public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                if (!C23279d.this.isRemoving() && !C23279d.this.isDetached() && C23279d.this.getLifecycle().mo323a() != C0178b.DESTROYED) {
                    C23279d.this.mo48254a(widget, viewGroup, view);
                }
            }
        });
        return this;
    }

    /* renamed from: a */
    public final C23279d mo48251a(View view, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f62239f = this.f62259g;
        widget.f62235b = this.f62261i;
        widget.f62238e = this.f62255b;
        widget.f62237d = view;
        this.f62264l.add(widget);
        if (!m57259a()) {
            this.f62258f.post(new Runnable() {
                public final void run() {
                    C23279d.this.getLifecycle().mo324a(widget);
                }
            });
            return this;
        }
        getLifecycle().mo324a(widget);
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Widget a : this.f62264l) {
            a.mo48239a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo48254a(Widget widget, View view, View view2) {
        widget.f62237d = view2;
        if ((view instanceof ViewGroup) && view2 != null) {
            ((ViewGroup) view).addView(view2);
        }
        this.f62264l.add(widget);
        getLifecycle().mo324a(widget);
    }

    /* renamed from: a */
    private static C23279d m57257a(FragmentActivity fragmentActivity, Fragment fragment, View view, Context context) {
        C0654k kVar;
        if (fragmentActivity != null) {
            kVar = fragmentActivity.getSupportFragmentManager();
        } else if (fragment == null) {
            return null;
        } else {
            kVar = fragment.getChildFragmentManager();
        }
        C23279d dVar = new C23279d();
        dVar.f62254a = fragment;
        dVar.f62260h = view;
        dVar.f62261i = context;
        dVar.f62262j = new C1028c(dVar.f62261i);
        dVar.f62263k = LayoutInflater.from(dVar.f62261i);
        if (!(fragment == null || fragment.getFragmentManager() == null)) {
            fragment.getFragmentManager().mo2229a(dVar.f62256c, false);
        }
        kVar.mo2225a().mo2178a((Fragment) dVar, f62253d).mo2200e();
        return dVar;
    }
}
