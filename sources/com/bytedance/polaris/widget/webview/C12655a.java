package com.bytedance.polaris.widget.webview;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.polaris.browser.p823a.C12590a;
import com.bytedance.polaris.p821a.C12557c;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12644j;
import com.bytedance.polaris.p826d.C12650p;
import com.example.p906a.C13482c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.polaris.widget.webview.a */
public final class C12655a extends WebViewClient {

    /* renamed from: a */
    TextView f33238a;

    /* renamed from: b */
    int f33239b;

    /* renamed from: c */
    private final C12590a f33240c;

    /* renamed from: d */
    private View f33241d;

    /* renamed from: e */
    private boolean f33242e;

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C13482c.m27234a(webView, renderProcessGoneDetail);
    }

    /* renamed from: a */
    private void m25438a() {
        if (this.f33241d != null && this.f33241d.getParent() != null && this.f33238a != null) {
            try {
                Application a = C12563i.m25215a();
                this.f33241d.setBackgroundColor(a.getResources().getColor(R.color.yq));
                this.f33238a.setTextColor(a.getResources().getColor(R.color.yu));
                this.f33238a.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.b6u, 0, 0);
                C9432q.m18680a((View) this.f33238a, -3, -3, -3, (int) (((float) this.f33241d.getLayoutParams().height) * 0.57f));
            } catch (Throwable unused) {
            }
        }
    }

    public C12655a(C12590a aVar) {
        this.f33240c = aVar;
    }

    /* renamed from: a */
    private static void m25439a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f33242e = false;
        if (this.f33241d != null && this.f33239b == 0) {
            m25439a(this.f33241d);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C12557c c = C12563i.m25221c();
        if (c == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebResourceResponse a = c.mo23599a(webView, webResourceRequest);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C12644j.m25402a() && !C12650p.m25425c(str)) {
            new StringBuilder("onLoadResource ").append(str);
        }
        C12590a aVar = this.f33240c;
        if (aVar != null) {
            try {
                aVar.mo23672c(str);
            } catch (Exception unused) {
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C12557c c = C12563i.m25221c();
        if (c == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        WebResourceResponse a = c.mo23600a(webView, str);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            Uri parse = Uri.parse(str);
            String lowerCase = parse.getScheme().toLowerCase();
            if (TextUtils.isEmpty(lowerCase) || "about".equals(lowerCase)) {
                return false;
            }
            if ("bytedance".equals(lowerCase)) {
                if (this.f33240c != null && this.f33240c.mo23667a(parse)) {
                    try {
                        this.f33240c.mo23669b(parse);
                    } catch (Exception e) {
                        new StringBuilder("TTAndroidObj handleUri exception: ").append(e);
                    }
                }
                return true;
            }
            if (!WebKitApi.SCHEME_HTTP.equals(lowerCase) && !WebKitApi.SCHEME_HTTPS.equals(lowerCase)) {
                C12557c c = C12563i.m25221c();
                if (c == null || !c.mo23603a(webView.getContext(), str)) {
                    return false;
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("view url ");
            sb.append(str);
            sb.append(" exception: ");
            sb.append(e2);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!this.f33242e) {
            this.f33239b = 0;
            this.f33242e = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (webView != null && webView.getContext() != null && (i != this.f33239b || this.f33241d == null || this.f33241d.getParent() == null)) {
            Context context = webView.getContext();
            if (this.f33241d == null) {
                this.f33241d = LayoutInflater.from(context).inflate(R.layout.aco, null, false);
                this.f33238a = (TextView) this.f33241d.findViewById(R.id.d0n);
                this.f33241d.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        if (view.getParent() instanceof WebView) {
                            C12655a.this.f33239b = 0;
                            C9432q.m18691b((View) C12655a.this.f33238a, 8);
                            ((WebView) view.getParent()).reload();
                        }
                    }
                });
            } else {
                m25439a(this.f33241d);
            }
            this.f33239b = i;
            webView.addView(this.f33241d, webView.getWidth(), webView.getHeight());
            m25438a();
            C9432q.m18691b((View) this.f33238a, 0);
        }
    }
}
