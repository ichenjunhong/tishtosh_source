package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class bfi implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: c */
    private static final Handler f42262c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    WeakReference<View> f42263a;

    /* renamed from: b */
    long f42264b = -3;

    /* renamed from: d */
    private final Context f42265d;

    /* renamed from: e */
    private Application f42266e;

    /* renamed from: f */
    private final PowerManager f42267f;

    /* renamed from: g */
    private final KeyguardManager f42268g;

    /* renamed from: h */
    private final bey f42269h;

    /* renamed from: i */
    private BroadcastReceiver f42270i;

    /* renamed from: j */
    private WeakReference<ViewTreeObserver> f42271j;

    /* renamed from: k */
    private bem f42272k;

    /* renamed from: l */
    private byte f42273l = -1;

    /* renamed from: m */
    private int f42274m = -1;

    public bfi(bey bey, View view) {
        this.f42269h = bey;
        this.f42265d = bey.f42216a;
        this.f42267f = (PowerManager) this.f42265d.getSystemService("power");
        this.f42268g = (KeyguardManager) this.f42265d.getSystemService("keyguard");
        if (this.f42265d instanceof Application) {
            this.f42266e = (Application) this.f42265d;
            this.f42272k = new bem((Application) this.f42265d, this);
        }
        mo30105a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30105a(View view) {
        View view2 = this.f42263a != null ? (View) this.f42263a.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m35553c(view2);
        }
        this.f42263a = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m35552b(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.f42264b = -2;
            return;
        }
        this.f42264b = -3;
    }

    /* renamed from: a */
    private final void m35548a() {
        f42262c.post(new bfj(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f42274m = -1;
        m35552b(view);
        m35551b();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f42274m = -1;
        m35551b();
        m35548a();
        m35553c(view);
    }

    /* renamed from: a */
    private final void m35549a(Activity activity, int i) {
        if (this.f42263a != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f42263a.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f42274m = i;
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m35549a(activity, 0);
        m35551b();
    }

    public final void onActivityStarted(Activity activity) {
        m35549a(activity, 0);
        m35551b();
    }

    public final void onActivityResumed(Activity activity) {
        m35549a(activity, 0);
        m35551b();
        m35548a();
    }

    public final void onActivityPaused(Activity activity) {
        m35549a(activity, 4);
        m35551b();
    }

    public final void onActivityStopped(Activity activity) {
        m35551b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m35551b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m35551b();
    }

    public final void onGlobalLayout() {
        m35551b();
    }

    public final void onScrollChanged() {
        m35551b();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r7 == false) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m35551b() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f42263a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f42263a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0017
            r9.f42264b = r2
            r9.f42273l = r1
            return
        L_0x0017:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x002b
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x002b:
            android.os.PowerManager r7 = r9.f42267f
            if (r7 == 0) goto L_0x003a
            android.os.PowerManager r7 = r9.f42267f
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x003a
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x003a:
            com.google.android.gms.internal.ads.bey r7 = r9.f42269h
            boolean r7 = r7.f42229n
            if (r7 != 0) goto L_0x006e
            android.app.KeyguardManager r7 = r9.f42268g
            if (r7 == 0) goto L_0x006d
            android.app.KeyguardManager r7 = r9.f42268g
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x006d
            android.app.Activity r7 = com.google.android.gms.internal.ads.bfg.m35541a(r0)
            if (r7 == 0) goto L_0x0069
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x005a
            r7 = 0
            goto L_0x005e
        L_0x005a:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x005e:
            if (r7 == 0) goto L_0x0069
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0069
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            if (r7 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 != 0) goto L_0x0073
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x0073:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x0081
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x0081:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x008f
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x008f:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f42274m
            if (r5 == r1) goto L_0x0099
            int r0 = r9.f42274m
        L_0x0099:
            if (r0 == 0) goto L_0x009e
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x009e:
            byte r0 = r9.f42273l
            if (r0 == r4) goto L_0x00b4
            r9.f42273l = r4
            byte r0 = r9.f42273l
            if (r0 != 0) goto L_0x00ad
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00b2
        L_0x00ad:
            byte r0 = r9.f42273l
            long r0 = (long) r0
            long r0 = r2 - r0
        L_0x00b2:
            r9.f42264b = r0
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfi.m35551b():void");
    }

    /* renamed from: b */
    private final void m35552b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f42271j = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f42270i == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f42270i = new bfk(this);
            this.f42265d.registerReceiver(this.f42270i, intentFilter);
        }
        if (this.f42266e != null) {
            try {
                this.f42266e.registerActivityLifecycleCallbacks(this.f42272k);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m35553c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f42271j     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f42271j     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f42271j = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f42270i
            if (r4 == 0) goto L_0x003a
            android.content.Context r4 = r3.f42265d     // Catch:{ Exception -> 0x0038 }
            android.content.BroadcastReceiver r1 = r3.f42270i     // Catch:{ Exception -> 0x0038 }
            r4.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f42270i = r0
        L_0x003a:
            android.app.Application r4 = r3.f42266e
            if (r4 == 0) goto L_0x0046
            android.app.Application r4 = r3.f42266e     // Catch:{ Exception -> 0x0046 }
            com.google.android.gms.internal.ads.bem r0 = r3.f42272k     // Catch:{ Exception -> 0x0046 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfi.m35553c(android.view.View):void");
    }
}
