package com.bytedance.apm.p498p;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p498p.p500b.C9172a;
import com.bytedance.services.apm.api.C13220c;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.apm.p.c */
public final class C9173c implements C13220c {

    /* renamed from: a */
    public long f25123a = -1;

    /* renamed from: b */
    public String f25124b;

    /* renamed from: c */
    public OnGlobalLayoutListener f25125c;

    /* renamed from: d */
    public Runnable f25126d;

    /* renamed from: e */
    public Handler f25127e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public long f25128f;

    /* renamed from: g */
    private boolean f25129g;

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
    }

    /* renamed from: a */
    public final void mo16544a() {
        this.f25128f = ApmDelegate.m17947a().mo16436d().f24492c;
        this.f25129g = ApmDelegate.m17947a().mo16436d().f24491b;
        ActivityLifeObserver.getInstance().register(this);
    }

    /* renamed from: c */
    public final void mo16273c(Activity activity) {
        if (!(activity instanceof MainActivity)) {
            mo16545e(activity);
        }
    }

    /* renamed from: d */
    public final void mo16274d(Activity activity) {
        this.f25123a = 0;
        try {
            if (this.f25125c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f25125c);
                this.f25125c = null;
            }
            if (this.f25126d != null) {
                this.f25127e.removeCallbacks(this.f25126d);
                this.f25126d = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void mo16545e(Activity activity) {
        if (VERSION.SDK_INT >= 16 && this.f25129g) {
            try {
                this.f25123a = System.currentTimeMillis();
                this.f25124b = activity.getClass().getCanonicalName();
                final Integer a = C9172a.m18196a(this.f25124b);
                if (a != null) {
                    final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
                    this.f25125c = new OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            if (weakReference.get() != null) {
                                View findViewById = ((View) weakReference.get()).findViewById(a.intValue());
                                if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                    ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                                    if (viewTreeObserver.isAlive() && C9173c.this.f25125c != null) {
                                        viewTreeObserver.removeOnGlobalLayoutListener(C9173c.this.f25125c);
                                    }
                                    if (C9173c.this.f25126d != null) {
                                        C9173c.this.f25127e.removeCallbacks(C9173c.this.f25126d);
                                        C9173c.this.f25126d = null;
                                    }
                                    C9173c.this.f25125c = null;
                                    if (C9173c.this.f25123a > 0) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long j = currentTimeMillis - C9173c.this.f25123a;
                                        C9173c.this.f25123a = 0;
                                        if (j < C9173c.this.f25128f && j > 0) {
                                            AutoPageTraceHelper.reportViewIdStats(currentTimeMillis, C9173c.this.f25124b);
                                            MonitorTool.reportTraceTime(C9173c.this.f25124b, "activityOnCreateToViewShow", j);
                                        }
                                    }
                                }
                            }
                        }
                    };
                    ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f25125c);
                    this.f25126d = new Runnable() {
                        public final void run() {
                            if (C9173c.this.f25125c != null && weakReference.get() != null) {
                                ((View) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(C9173c.this.f25125c);
                            }
                        }
                    };
                    this.f25127e.postDelayed(this.f25126d, this.f25128f);
                }
            } catch (Exception unused) {
            }
        }
    }
}
