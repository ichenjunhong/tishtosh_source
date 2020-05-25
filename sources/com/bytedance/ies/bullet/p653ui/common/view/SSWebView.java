package com.bytedance.ies.bullet.p653ui.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.SSWebView */
public final class SSWebView extends WebView {

    /* renamed from: a */
    public boolean f28135a;

    /* renamed from: b */
    private final String f28136b;

    /* renamed from: c */
    private final int f28137c;

    /* renamed from: d */
    private final int f28138d;

    /* renamed from: e */
    private int f28139e;

    /* renamed from: f */
    private long f28140f;

    /* renamed from: g */
    private long f28141g;

    /* renamed from: h */
    private C10611a f28142h;

    /* renamed from: i */
    private C10612b f28143i;

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.SSWebView$a */
    public interface C10611a {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.view.SSWebView$b */
    public interface C10612b {

        /* renamed from: com.bytedance.ies.bullet.ui.common.view.SSWebView$b$a */
        public static final class C10613a {
            /* renamed from: a */
            public static boolean m21398a(C10612b bVar, MotionEvent motionEvent) {
                C52711k.m112240b(motionEvent, "event");
                throw new C10241d("An operation is not implemented");
            }
        }

        /* renamed from: a */
        boolean mo18832a();

        /* renamed from: a */
        boolean mo18833a(int i, boolean z);

        /* renamed from: a */
        boolean mo18834a(MotionEvent motionEvent);
    }

    /* renamed from: a */
    private static String m21390a(String str) {
        return str;
    }

    public final boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public final void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public final int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public final String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public final String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public final void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    public final void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public final int getTimeInterval() {
        if (this.f28139e > 0) {
            return this.f28139e;
        }
        return this.f28138d;
    }

    /* renamed from: a */
    public final boolean mo18792a() {
        C10612b bVar = this.f28143i;
        if (bVar != null) {
            try {
                return bVar.mo18832a();
            } catch (C10241d unused) {
            }
        }
        if (System.currentTimeMillis() - this.f28141g < ((long) getTimeInterval())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo18793b() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        C52711k.m112236a((Object) copyBackForwardList, "copyBackForwardList()");
        if (copyBackForwardList.getCurrentIndex() >= 2) {
            return true;
        }
        return false;
    }

    public final void setCanTouch(boolean z) {
        this.f28135a = z;
    }

    public final void setTimeInterval(int i) {
        this.f28139e = i;
    }

    public final void setWebScrollListener(C10611a aVar) {
        this.f28142h = aVar;
    }

    public final boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public final void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public final void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public final void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public final void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public final void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public final void setWebViewEventDelegate(C10612b bVar) {
        C52711k.m112240b(bVar, "delegate");
        this.f28143i = bVar;
    }

    public final void loadUrl(String str) {
        C52711k.m112240b(str, "url");
        try {
            C10615b.m21401a(this, m21390a(str));
        } catch (Exception unused) {
        }
    }

    public final boolean canScrollVertically(int i) {
        C10612b bVar = this.f28143i;
        if (bVar != null) {
            try {
                return bVar.mo18833a(i, super.canScrollVertically(i));
            } catch (C10241d unused) {
            }
        }
        return super.canScrollVertically(i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(motionEvent, "event");
        C10612b bVar = this.f28143i;
        if (bVar != null) {
            try {
                return bVar.mo18834a(motionEvent);
            } catch (C10241d unused) {
            }
        }
        if (!this.f28135a) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f28140f = System.currentTimeMillis();
                break;
            case 1:
                if (System.currentTimeMillis() - this.f28140f < ((long) this.f28137c)) {
                    this.f28141g = System.currentTimeMillis();
                    break;
                }
                break;
        }
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (Throwable unused2) {
            z = false;
        }
        return z;
    }

    public final void loadUrl(String str, Map<String, String> map) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "additionalHttpHeaders");
        try {
            C10615b.m21402a(this, m21390a(str), map);
        } catch (Exception unused) {
        }
    }

    public final void postUrl(String str, byte[] bArr) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(bArr, "postData");
        try {
            super.postUrl(m21390a(str), bArr);
        } catch (Exception unused) {
        }
    }

    public final void loadData(String str, String str2, String str3) {
        C52711k.m112240b(str, "data");
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f28136b = SSWebView.class.getSimpleName();
        this.f28137c = 100;
        this.f28138d = 500;
        this.f28139e = 500;
        this.f28135a = true;
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C10611a aVar = this.f28142h;
        if (aVar != null) {
            aVar.onScrollChanged(i, i2, i3, i4);
        }
    }

    public /* synthetic */ SSWebView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(str2, "data");
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
