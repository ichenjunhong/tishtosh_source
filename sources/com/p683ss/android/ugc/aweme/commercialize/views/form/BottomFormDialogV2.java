package com.p683ss.android.ugc.aweme.commercialize.views.form;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25715e;
import com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2 */
public final class BottomFormDialogV2 extends AmeSSActivity {

    /* renamed from: a */
    public Aweme f70419a;

    /* renamed from: b */
    public int f70420b;

    /* renamed from: c */
    public boolean f70421c;

    /* renamed from: d */
    private CrossPlatformWebView f70422d;

    /* renamed from: e */
    private ImageView f70423e;

    /* renamed from: f */
    private String f70424f = "";

    /* renamed from: g */
    private boolean f70425g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$a */
    static final class C26729a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomFormDialogV2 f70426a;

        C26729a(BottomFormDialogV2 bottomFormDialogV2) {
            this.f70426a = bottomFormDialogV2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f70426a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$b */
    public static final class C26730b implements C27235d {

        /* renamed from: a */
        final /* synthetic */ BottomFormDialogV2 f70427a;

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            return false;
        }

        C26730b(BottomFormDialogV2 bottomFormDialogV2) {
            this.f70427a = bottomFormDialogV2;
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (this.f70427a.f70420b == 8) {
                C26088l.m63387x(this.f70427a, this.f70427a.f70419a);
                return;
            }
            if (this.f70427a.f70420b == 2 || this.f70427a.f70420b == 10) {
                C26088l.m63254A(this.f70427a, this.f70427a.f70419a);
            }
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (!this.f70427a.f70421c) {
                if (this.f70427a.f70420b == 8) {
                    C26088l.m63387x(this.f70427a, this.f70427a.f70419a);
                    this.f70427a.f70421c = true;
                    return;
                }
                if (this.f70427a.f70420b == 2 || this.f70427a.f70420b == 10) {
                    C26088l.m63254A(this.f70427a, this.f70427a.f70419a);
                    this.f70427a.f70421c = true;
                }
            }
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            if (this.f70427a.f70420b == 8) {
                C26088l.m63387x(this.f70427a, this.f70427a.f70419a);
                return;
            }
            if (this.f70427a.f70420b == 2 || this.f70427a.f70420b == 10) {
                C26088l.m63254A(this.f70427a, this.f70427a.f70419a);
            }
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        View currentFocus = getCurrentFocus();
        C26894c.m65021a(this, currentFocus);
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        super.finish();
        overridePendingTransition(R.anim.aa, R.anim.ab);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (!this.f70425g) {
            if (this.f70420b == 8) {
                Context context = this;
                Aweme aweme = this.f70419a;
                C26088l.m63343d(context, "click_cancel", aweme, C26088l.m63373m(context, aweme, "raw homepage form click cancel"));
            } else if (this.f70420b == 2 || this.f70420b == 10) {
                C26088l.m63389z(this, this.f70419a);
            }
        }
        C47718bf.m103291d(this);
    }

    public final void dismiss(View view) {
        C52711k.m112240b(view, "view");
        finish();
    }

    @C53771m
    public final void onEvent(C25715e eVar) {
        C52711k.m112240b(eVar, "event");
        C10691a.m21537a((Context) AwemeApplication.m56199a(), getString(R.string.du8)).mo19066a();
        this.f70425g = true;
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Aweme aweme;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ah);
        getWindow().setSoftInputMode(19);
        C47718bf.m103290c(this);
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("url", "");
            C52711k.m112236a((Object) string, "getString(CrossPlatformParams.BUNDLE_URL, \"\")");
            if (string != null) {
                this.f70424f = C52830p.m112447b(string).toString();
                this.f70420b = extras.getInt("click_from");
                String string2 = extras.getString("aweme_id", "");
                if (C23324d.m57378a().getRawAdAwemeById(string2) != null) {
                    aweme = C23324d.m57378a().getRawAdAwemeById(string2);
                } else {
                    aweme = C23324d.m57378a().getAwemeById(string2);
                }
                this.f70419a = aweme;
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        View findViewById = findViewById(R.id.duj);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.webview)");
        this.f70422d = (CrossPlatformWebView) findViewById;
        View findViewById2 = findViewById(R.id.ue);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.close)");
        this.f70423e = (ImageView) findViewById2;
        ImageView imageView = this.f70423e;
        if (imageView == null) {
            C52711k.m112237a("mCloseBtn");
        }
        imageView.setOnClickListener(new C26729a(this));
        C26730b bVar = new C26730b(this);
        CrossPlatformWebView crossPlatformWebView = this.f70422d;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("mWebView");
        }
        C27298a aVar = crossPlatformWebView;
        C27235d dVar = bVar;
        C0184k kVar = this;
        Activity activity = this;
        Intent intent2 = getIntent();
        C52711k.m112236a((Object) intent2, "intent");
        CommercializeWebViewHelper.m63705a(aVar, dVar, kVar, activity, intent2.getExtras());
        CrossPlatformWebView crossPlatformWebView2 = this.f70422d;
        if (crossPlatformWebView2 == null) {
            C52711k.m112237a("mWebView");
        }
        SingleWebView a = ((C27309j) crossPlatformWebView2.mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "getViewWrap(WebViewWrap::class.java).webView");
        WebSettings settings = a.getSettings();
        C52711k.m112236a((Object) settings, "settings");
        String userAgentString = settings.getUserAgentString();
        StringBuilder sb = new StringBuilder();
        sb.append(userAgentString);
        sb.append("/RevealType/Dialog");
        settings.setUserAgentString(sb.toString());
        a.setLayerType(1, null);
        CrossPlatformWebView crossPlatformWebView3 = this.f70422d;
        if (crossPlatformWebView3 == null) {
            C52711k.m112237a("mWebView");
        }
        CrossPlatformWebView.m65745a(crossPlatformWebView3, this.f70424f, false, null, 6, null);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", false);
    }
}
