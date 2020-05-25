package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.d */
final /* synthetic */ class C27174d implements ValueCallback {

    /* renamed from: a */
    private final DouPlusMonitorBusiness f71694a;

    /* renamed from: b */
    private final int f71695b;

    /* renamed from: c */
    private final String f71696c;

    /* renamed from: d */
    private final WebView f71697d;

    C27174d(DouPlusMonitorBusiness douPlusMonitorBusiness, int i, String str, WebView webView) {
        this.f71694a = douPlusMonitorBusiness;
        this.f71695b = i;
        this.f71696c = str;
        this.f71697d = webView;
    }

    public final void onReceiveValue(Object obj) {
        this.f71694a.mo55485a(this.f71695b, this.f71696c, this.f71697d, (String) obj);
    }
}
