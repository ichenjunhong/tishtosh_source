package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.p683ss.android.newmedia.p1202ui.webview.SSWebView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView */
public class TryCatchWebView extends SSWebView {
    public void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    public TryCatchWebView(Context context) {
        super(context);
    }

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }

    public TryCatchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TryCatchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
