package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52220o;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C52136q;
import com.twitter.sdk.android.core.internal.oauth.C52131b;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

public class OAuthActivity extends Activity implements C52087a {

    /* renamed from: a */
    C52084c f129668a;

    /* renamed from: b */
    private ProgressBar f129669b;

    /* renamed from: c */
    private WebView f129670c;

    public void onBackPressed() {
        this.f129668a.mo108788a(0, new C52220o("Authorization failed, request was canceled."));
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f129669b.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.asp);
        this.f129669b = (ProgressBar) findViewById(R.id.djj);
        this.f129670c = (WebView) findViewById(R.id.djy);
        int i = 0;
        if (bundle != null) {
            z = bundle.getBoolean("progress", false);
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f129669b;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
        C52084c cVar = new C52084c(this.f129669b, this.f129670c, (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config"), new OAuth1aService(C52225r.m111638a(), new C52136q()), this);
        this.f129668a = cVar;
        C52084c cVar2 = this.f129668a;
        OAuth1aService oAuth1aService = cVar2.f129691e;
        C520851 r1 = new C52068b<OAuthResponse>() {
            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                C52084c.this.mo108788a(1, new C52220o("Failed to get request token"));
            }

            /* renamed from: a */
            public final void mo23366a(C52077i<OAuthResponse> iVar) {
                C52084c.this.f129688b = ((OAuthResponse) iVar.f129666a).f129760a;
                OAuth1aService oAuth1aService = C52084c.this.f129691e;
                TwitterAuthToken twitterAuthToken = C52084c.this.f129688b;
                String[] strArr = {"oauth", "authorize"};
                Builder buildUpon = Uri.parse(oAuth1aService.f129772c.f129776a).buildUpon();
                for (int i = 0; i < 2; i++) {
                    buildUpon.appendPath(strArr[i]);
                }
                String uri = buildUpon.appendQueryParameter("oauth_token", twitterAuthToken.f129649b).build().toString();
                WebView webView = C52084c.this.f129689c;
                C52090f fVar = new C52090f(C52084c.this.f129691e.mo108831a(C52084c.this.f129690d), C52084c.this);
                C52089e eVar = new C52089e();
                WebSettings settings = webView.getSettings();
                settings.setAllowFileAccess(false);
                settings.setJavaScriptEnabled(false);
                settings.setSaveFormData(false);
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.setWebViewClient(C13482c.m27232a(fVar));
                C18984e.m46161a(uri);
                webView.loadUrl(uri);
                webView.setVisibility(4);
                webView.setWebChromeClient(eVar);
            }
        };
        TwitterAuthConfig twitterAuthConfig = oAuth1aService.f129771b.f130052e;
        StringBuilder sb = new StringBuilder();
        sb.append(oAuth1aService.f129772c.f129776a);
        sb.append("/oauth/request_token");
        oAuth1aService.f129750a.getTempToken(new C52131b().mo108846a(twitterAuthConfig, null, oAuth1aService.mo108831a(twitterAuthConfig), "POST", sb.toString(), null)).mo110595a(oAuth1aService.mo108830a((C52068b<OAuthResponse>) r1));
    }

    /* renamed from: a */
    public final void mo108773a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }
}
