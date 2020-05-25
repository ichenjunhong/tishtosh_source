package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14963ax;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;

@C16299uq
public class aod extends aoa implements aog {

    /* renamed from: a */
    private final aob f41159a;

    /* renamed from: b */
    private boolean f41160b;

    /* renamed from: c */
    private boolean f41161c;

    public aod(Context context, aob aob) {
        super(context);
        C14963ax.m30834d().mo28593d();
        this.f41159a = aob;
        super.setWebViewClient(aob);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo29387g(boolean z) {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    /* renamed from: C */
    public final synchronized boolean mo29408C() {
        return this.f41160b;
    }

    public synchronized void destroy() {
        if (!this.f41160b) {
            this.f41160b = true;
            this.f41159a.f41154s = this;
            mo29387g(false);
            abv.m32494a("Initiating WebView self destruct sequence in 3...");
            abv.m32494a("Loading blank page in WebView, 2...");
            try {
                super.loadUrl(QuickShopBusiness.f64351b);
            } catch (UnsatisfiedLinkError e) {
                C14963ax.m30834d().mo28588a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo29410a(aoc aoc) {
        abv.m32494a("Blank page loaded, 1...");
        mo29140D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo29140D() {
        abv.m32494a("Destroying WebView!");
        mo28930a();
        agf.f40430a.execute(new aoe(this));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!mo29408C()) {
                    mo29387g(true);
                }
                mo28930a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: a */
    private final synchronized void mo28930a() {
        if (!this.f41161c) {
            this.f41161c = true;
            C14963ax.m30834d().mo28594e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo29408C()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.abv.m32798e(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aod.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (!mo29408C()) {
            super.loadUrl(str);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!mo29408C()) {
            super.loadData(str, str2, str3);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo29408C()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            abv.m32798e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo29408C() && super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!mo29408C()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo29408C()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo29408C()) {
            super.onResume();
        }
    }

    public void stopLoading() {
        if (!mo29408C()) {
            super.stopLoading();
        }
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo29248d(String str) {
        super.mo29248d(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public final /* synthetic */ void mo29409M() {
        super.destroy();
    }
}
