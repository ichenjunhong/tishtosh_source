package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52220o;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.C52131b;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

/* renamed from: com.twitter.sdk.android.core.identity.c */
final class C52084c implements C52091a {

    /* renamed from: a */
    final C52087a f129687a;

    /* renamed from: b */
    TwitterAuthToken f129688b;

    /* renamed from: c */
    public final WebView f129689c;

    /* renamed from: d */
    public final TwitterAuthConfig f129690d;

    /* renamed from: e */
    public final OAuth1aService f129691e;

    /* renamed from: f */
    private final ProgressBar f129692f;

    /* renamed from: com.twitter.sdk.android.core.identity.c$a */
    interface C52087a {
        /* renamed from: a */
        void mo108773a(int i, Intent intent);
    }

    /* renamed from: b */
    private void m111415b() {
        this.f129692f.setVisibility(8);
    }

    /* renamed from: a */
    private void m111414a() {
        this.f129689c.stopLoading();
        m111415b();
    }

    /* renamed from: a */
    public final void mo108791a(C52093h hVar) {
        mo108788a(1, new C52220o("OAuth web view completed with an error"));
        m111414a();
    }

    /* renamed from: a */
    public final void mo108789a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("oauth_verifier");
            if (string != null) {
                OAuth1aService oAuth1aService = this.f129691e;
                C520862 r1 = new C52068b<OAuthResponse>() {
                    /* renamed from: a */
                    public final void mo23367a(C52229t tVar) {
                        C52084c.this.mo108788a(1, new C52220o("Failed to get access token"));
                    }

                    /* renamed from: a */
                    public final void mo23366a(C52077i<OAuthResponse> iVar) {
                        Intent intent = new Intent();
                        OAuthResponse oAuthResponse = (OAuthResponse) iVar.f129666a;
                        intent.putExtra("screen_name", oAuthResponse.f129761b);
                        intent.putExtra("user_id", oAuthResponse.f129762c);
                        intent.putExtra("tk", oAuthResponse.f129760a.f129649b);
                        intent.putExtra("ts", oAuthResponse.f129760a.f129650c);
                        C52084c.this.f129687a.mo108773a(-1, intent);
                    }
                };
                TwitterAuthToken twitterAuthToken = this.f129688b;
                StringBuilder sb = new StringBuilder();
                sb.append(oAuth1aService.f129772c.f129776a);
                sb.append("/oauth/access_token");
                oAuth1aService.f129750a.getAccessToken(new C52131b().mo108846a(oAuth1aService.f129771b.f130052e, twitterAuthToken, null, "POST", sb.toString(), null), string).mo110595a(oAuth1aService.mo108830a((C52068b<OAuthResponse>) r1));
                m111414a();
            }
        }
        new StringBuilder("Failed to get authorization, bundle incomplete ").append(bundle);
        mo108788a(1, new C52220o("Failed to get authorization, bundle incomplete"));
        m111414a();
    }

    /* renamed from: a */
    public final void mo108790a(WebView webView, String str) {
        m111415b();
        webView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo108788a(int i, C52220o oVar) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", oVar);
        this.f129687a.mo108773a(i, intent);
    }

    C52084c(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, C52087a aVar) {
        this.f129692f = progressBar;
        this.f129689c = webView;
        this.f129690d = twitterAuthConfig;
        this.f129691e = oAuth1aService;
        this.f129687a = aVar;
    }
}
