package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.graphics.Paint;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.p520c.C9349a;
import com.bytedance.common.p520c.C9351b;
import com.bytedance.common.p520c.C9363e;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.browser.view.b */
public final class C4957b {

    /* renamed from: a */
    private WeakReference<Context> f13290a;

    /* renamed from: b */
    private boolean f13291b = true;

    /* renamed from: c */
    private boolean f13292c = true;

    /* renamed from: d */
    private boolean f13293d = true;

    /* renamed from: e */
    private boolean f13294e = true;

    /* renamed from: f */
    private boolean f13295f = true;

    /* renamed from: g */
    private boolean f13296g = true;

    /* renamed from: h */
    private boolean f13297h = true;

    /* renamed from: i */
    private boolean f13298i = true;

    /* renamed from: a */
    public final C4957b mo10692a(boolean z) {
        this.f13298i = z;
        return this;
    }

    /* renamed from: a */
    public static C4957b m11447a(Context context) {
        return new C4957b(context);
    }

    private C4957b(Context context) {
        this.f13290a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo10693a(WebView webView) {
        if (webView != null && this.f13290a.get() != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(this.f13291b);
                } catch (Exception unused) {
                }
                try {
                    if (this.f13292c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                        C9349a.m18524a(settings, false);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable unused2) {
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f13293d);
                settings.setDomStorageEnabled(this.f13295f);
                if (!((Boolean) LiveSettingKeys.LIVE_DISABLE_WEBVIEW_FILE_URI_MT.mo9431a()).booleanValue()) {
                    settings.setAllowFileAccess(this.f13296g);
                } else {
                    settings.setAllowFileAccess(false);
                }
                settings.setBlockNetworkImage(!this.f13297h);
                if (!this.f13298i) {
                    try {
                        C1056u.m3025a((View) webView, 1, (Paint) null);
                    } catch (Throwable unused3) {
                    }
                }
                C9351b.m18531a(settings, false);
                m11448a(webView, this.f13294e);
                C9363e.m18543a(settings, 2);
                C9363e.m18544a(webView, true);
            }
        }
    }

    /* renamed from: a */
    private static void m11448a(WebView webView, boolean z) {
        if (!z) {
            webView.setOnLongClickListener(null);
            webView.setLongClickable(false);
            return;
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(C4958c.f13299a);
    }
}
