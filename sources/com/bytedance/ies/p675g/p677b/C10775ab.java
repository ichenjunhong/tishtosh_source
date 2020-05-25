package com.bytedance.ies.p675g.p677b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.lancet.C18984e;

/* renamed from: com.bytedance.ies.g.b.ab */
public class C10775ab extends C10771a {

    /* renamed from: i */
    static final /* synthetic */ boolean f28966i = (!C10775ab.class.desiredAssertionStatus());

    /* renamed from: h */
    public WebView f28967h;

    /* renamed from: j */
    private String f28968j;

    C10775ab() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19502a() {
        return this.f28967h.getUrl();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19508b() {
        super.mo19508b();
        this.f28967h.removeJavascriptInterface(this.f28968j);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo19500a(C10790j jVar) {
        if (jVar.f28998e != null) {
            return jVar.f28998e;
        }
        if (jVar.f28994a != null) {
            return jVar.f28994a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19509b(C10790j jVar) {
        this.f28967h = jVar.f28994a;
        this.f28968j = jVar.f28996c;
        if (VERSION.SDK_INT >= 17 && !jVar.f29007n) {
            if (f28966i || this.f28967h != null) {
                this.f28967h.addJavascriptInterface(this, this.f28968j);
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19505a(String str) {
        StringBuilder sb = new StringBuilder("javascript:");
        sb.append(this.f28968j);
        sb.append("._handleMessageFromToutiao(");
        sb.append(str);
        sb.append(")");
        m21847a(str, sb.toString());
    }

    /* renamed from: a */
    private void m21847a(String str, final String str2) {
        if (!this.f28958f && !TextUtils.isEmpty(str2)) {
            C107761 r3 = new Runnable() {
                public final void run() {
                    if (!C10775ab.this.f28958f) {
                        if (VERSION.SDK_INT >= 19) {
                            new StringBuilder("Invoking Jsb using evaluateJavascript: ").append(str2);
                            C10775ab.this.f28967h.evaluateJavascript(str2, null);
                            return;
                        }
                        new StringBuilder("Invoking Jsb using loadUrl: ").append(str2);
                        WebView webView = C10775ab.this.f28967h;
                        String str = str2;
                        C18984e.m46161a(str);
                        webView.loadUrl(str);
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new StringBuilder("Received call on sub-thread, posting to main thread: ").append(str2);
                this.f28956d.post(r3);
                return;
            }
            r3.run();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19506a(String str, C10802q qVar) {
        if (qVar == null || TextUtils.isEmpty(qVar.f29021h)) {
            super.mo19506a(str, qVar);
            return;
        }
        String str2 = qVar.f29021h;
        m21847a(str, C2240a.m6772a("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", new Object[]{str2, str, str2}));
    }
}
