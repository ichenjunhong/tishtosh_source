package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import com.bytedance.android.livesdk.p279af.C4581b;

/* renamed from: com.bytedance.android.livesdk.browser.view.c */
final /* synthetic */ class C4958c implements OnLongClickListener {

    /* renamed from: a */
    static final OnLongClickListener f13299a = new C4958c();

    private C4958c() {
    }

    public final boolean onLongClick(View view) {
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            HitTestResult hitTestResult = webView.getHitTestResult();
            if (hitTestResult == null || webView.getSettings() == null) {
                return false;
            }
            if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                String extra = hitTestResult.getExtra();
                Context context = webView.getContext();
                if (!(extra == null || context == null || !C4581b.m11009a(extra))) {
                    return true;
                }
            }
        }
        return false;
    }
}
