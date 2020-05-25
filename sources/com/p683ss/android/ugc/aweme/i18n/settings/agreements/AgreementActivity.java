package com.p683ss.android.ugc.aweme.i18n.settings.agreements;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.example.p906a.C13482c;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.web.C48376o;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity */
public class AgreementActivity extends AmeActivity implements OnClickListener {

    /* renamed from: a */
    private ImmersionBar f86122a;
    ImageView mBackBtn;
    TextView mBtn;
    View mLoadingView;
    View mStatusBarView;
    TextView mTextView;
    View mTitleBar;
    WebView mWebView;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f86122a != null) {
            this.f86122a.destroy();
        }
    }

    public void onPause() {
        super.onPause();
        this.mWebView.onPause();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onResume", true);
        super.onResume();
        this.mWebView.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        this.f86122a = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f86122a.init();
        }
        C23729p.m58269c((Activity) this);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        finish();
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.btr);
        if (getIntent().getExtras() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onCreate", false);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        Bundle extras = getIntent().getExtras();
        boolean z = extras.getBoolean("FIELD_SHOW_AGREE_BUTTON", false);
        String string = extras.getString("FIELD_TITLE");
        String string2 = extras.getString("URL_FIELD");
        TextView textView = this.mBtn;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (!TextUtils.isEmpty(string2)) {
            WebView webView = this.mWebView;
            C18984e.m46161a(string2);
            webView.loadUrl(string2);
            this.mWebView.setWebViewClient(C13482c.m27232a(new C48376o() {
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    AgreementActivity.this.mLoadingView.setVisibility(8);
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Uri parse = Uri.parse(str);
                    String lowerCase = parse.getScheme().toLowerCase();
                    if (parse == null || !"market".equals(lowerCase)) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    webView.getContext().startActivity(intent);
                    return true;
                }
            }));
            this.mWebView.getSettings().setJavaScriptEnabled(true);
        }
        if (!TextUtils.isEmpty(string)) {
            this.mTextView.setText(string);
            this.mTextView.getPaint().setFakeBoldText(true);
        } else {
            this.mTextView.setVisibility(8);
        }
        this.mBackBtn.setOnClickListener(this);
        this.mBtn.setOnClickListener(this);
        if (extras.getBoolean("HIDE_TITLE_BAR", false)) {
            this.mTitleBar.setVisibility(8);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onCreate", false);
    }
}
