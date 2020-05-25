package com.p683ss.android.ugc.aweme.policy;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.util.DisplayMetrics;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyDialog */
public class PolicyDialog extends C1164e {

    /* renamed from: a */
    C39495b f101041a;

    /* renamed from: b */
    OnClickListener f101042b;
    DmtStatusView mStatusView;
    TextView mTvAccept;
    WebView mWebView;

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.b4e);
        ButterKnife.bind((Dialog) this);
        Window window = getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels - C23728o.m58241a(291.5d);
                i2 = displayMetrics.widthPixels - C23728o.m58241a(105.0d);
            } else {
                i2 = 0;
                i = 0;
            }
            window.setLayout(Math.max(C23728o.m58241a(270.0d), i2), Math.max(C23728o.m58241a(375.5d), i));
        }
        this.mTvAccept.setOnClickListener(new C39497a(this));
        this.mStatusView.setBuilder(C10719a.m21676a(getContext()));
        this.mStatusView.setBackgroundColor(0);
        this.mStatusView.setVisibility(8);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.setWebViewClient(C13482c.m27232a(new WebViewClient() {
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C13482c.m27234a(webView, renderProcessGoneDetail);
            }

            public final void onPageFinished(WebView webView, String str) {
                PolicyDialog.this.mStatusView.mo19209d();
            }

            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                PolicyDialog.this.mStatusView.mo19212f();
            }

            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                PolicyDialog.this.mStatusView.mo19214h();
            }
        }));
        WebView webView = this.mWebView;
        String str = this.f101041a.f101036a;
        C18984e.m46161a(str);
        webView.loadUrl(str);
    }

    public PolicyDialog(Context context, C39495b bVar, OnClickListener onClickListener) {
        super(context);
        this.f101041a = bVar;
        this.f101042b = onClickListener;
        requestWindowFeature(1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
