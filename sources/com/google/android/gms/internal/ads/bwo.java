package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.util.C15524o;
import java.util.Iterator;
import java.util.List;

@C16299uq
public final class bwo extends Thread {

    /* renamed from: a */
    boolean f44149a;

    /* renamed from: b */
    public boolean f44150b;

    /* renamed from: c */
    final Object f44151c;

    /* renamed from: d */
    public final bwj f44152d;

    /* renamed from: e */
    final int f44153e;

    /* renamed from: f */
    final int f44154f;

    /* renamed from: g */
    final int f44155g;

    /* renamed from: h */
    final int f44156h;

    /* renamed from: i */
    final int f44157i;

    /* renamed from: j */
    final int f44158j;

    /* renamed from: k */
    final int f44159k;

    /* renamed from: l */
    final String f44160l;

    /* renamed from: m */
    final boolean f44161m;

    /* renamed from: n */
    private final int f44162n;

    public bwo() {
        this(new bwj());
    }

    private bwo(bwj bwj) {
        this.f44152d = bwj;
        this.f44151c = new Object();
        this.f44153e = ((Integer) caf.m37099d().mo30717a(C15740bx.f44204R)).intValue();
        this.f44154f = ((Integer) caf.m37099d().mo30717a(C15740bx.f44205S)).intValue();
        this.f44155g = ((Integer) caf.m37099d().mo30717a(C15740bx.f44206T)).intValue();
        this.f44156h = ((Integer) caf.m37099d().mo30717a(C15740bx.f44207U)).intValue();
        this.f44157i = ((Integer) caf.m37099d().mo30717a(C15740bx.f44209W)).intValue();
        this.f44158j = ((Integer) caf.m37099d().mo30717a(C15740bx.f44210X)).intValue();
        this.f44159k = ((Integer) caf.m37099d().mo30717a(C15740bx.f44211Y)).intValue();
        this.f44162n = ((Integer) caf.m37099d().mo30717a(C15740bx.f44208V)).intValue();
        this.f44160l = (String) caf.m37099d().mo30717a(C15740bx.f44240aa);
        this.f44161m = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44241ab)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.google.android.gms.ads.internal.C14963ax.m30834d().mo28588a((java.lang.Throwable) r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.abv.m32792b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        com.google.android.gms.internal.ads.abv.m32793b("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[LOOP:1: B:29:0x0083->B:41:0x0083, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m36928b()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.bwk r0 = com.google.android.gms.ads.internal.C14963ax.m30833c()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            android.app.Activity r0 = r0.mo30815a()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.abv.m32792b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m36929c()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0019:
            if (r0 == 0) goto L_0x0061
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.abh r2 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo28588a(r0, r3)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.abv.m32792b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x004c:
            if (r1 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.bwp r0 = new com.google.android.gms.internal.ads.bwp     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.abv.m32792b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m36929c()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x0061:
            int r0 = r4.f44162n     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0080
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.abv.m32793b(r1, r0)
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo28588a(r0, r2)
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.abv.m32793b(r1, r0)
        L_0x0080:
            java.lang.Object r0 = r4.f44151c
            monitor-enter(r0)
        L_0x0083:
            boolean r1 = r4.f44150b     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.abv.m32792b(r1)     // Catch:{ InterruptedException -> 0x0083 }
            java.lang.Object r1 = r4.f44151c     // Catch:{ InterruptedException -> 0x0083 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0083 }
            goto L_0x0083
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0000
        L_0x0095:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bwo.run():void");
    }

    /* renamed from: b */
    private static boolean m36928b() {
        boolean z;
        try {
            Context b = C14963ax.m30833c().mo30817b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                PowerManager powerManager = (PowerManager) b.getSystemService("power");
                                if (powerManager == null) {
                                    z = false;
                                } else {
                                    z = powerManager.isScreenOn();
                                }
                                if (z) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            C14963ax.m30834d().mo28588a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final bws mo30828a(View view, bwi bwi) {
        boolean z;
        if (view == null) {
            return new bws(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new bws(this, 0, 0);
            }
            bwi.mo30806b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new bws(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof ama)) {
            bwi.mo30805b();
            WebView webView = (WebView) view;
            if (!C15524o.m32297e()) {
                z = false;
            } else {
                bwi.mo30805b();
                webView.post(new bwq(this, bwi, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new bws(this, 0, 1);
            }
            return new bws(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new bws(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                bws a = mo30828a(viewGroup.getChildAt(i3), bwi);
                i += a.f44171a;
                i2 += a.f44172b;
            }
            return new bws(this, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo30829a() {
        synchronized (this.f44151c) {
            this.f44150b = false;
            this.f44151c.notifyAll();
            abv.m32792b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: c */
    private final void m36929c() {
        synchronized (this.f44151c) {
            this.f44150b = true;
            boolean z = this.f44150b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            abv.m32792b(sb.toString());
        }
    }
}
