package com.bytedance.opensdk.core.base.p809ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.opensdk.core.grant.web.C12523a;
import com.bytedance.opensdk.core.grant.web.C12526b;
import com.bytedance.opensdk.core.grant.web.WebPageStatusView;
import com.bytedance.opensdk.core.grant.web.p814a.C12524a;
import com.bytedance.opensdk.core.grant.web.p814a.C12524a.C12525a;
import com.bytedance.opensdk.p800b.C12461c;
import com.bytedance.opensdk.p800b.C12471i;
import com.bytedance.opensdk.p800b.C12473k;
import com.example.p906a.C13482c;
import com.facebook.p909a.C13594o;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity */
public abstract class HeloSdkBaseWebActivity extends Activity implements C12523a {

    /* renamed from: a */
    public C12509a f32843a;

    /* renamed from: b */
    public final String f32844b = getClass().getSimpleName();

    /* renamed from: c */
    private HashMap f32845c;

    /* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$a */
    public final class C12506a extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ HeloSdkBaseWebActivity f32846a;

        /* renamed from: b */
        private final C12523a f32847b;

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return this.f32847b.mo23541a(webView, webResourceRequest);
        }

        public C12506a(HeloSdkBaseWebActivity heloSdkBaseWebActivity, C12523a aVar) {
            C52711k.m112240b(aVar, "webViewHandler");
            this.f32846a = heloSdkBaseWebActivity;
            this.f32847b = aVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f32847b.mo23544b(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return this.f32847b.mo23542a(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f32847b.mo23538a(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f32847b.mo23536a(webView, webResourceRequest, webResourceError);
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            this.f32847b.mo23537a(webView, webResourceRequest, webResourceResponse);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f32847b.mo23535a(webView, sslErrorHandler, sslError);
        }
    }

    /* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$b */
    static final class C12507b extends C52712l implements C52671b<C12525a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ HeloSdkBaseWebActivity f32848a;

        C12507b(HeloSdkBaseWebActivity heloSdkBaseWebActivity) {
            this.f32848a = heloSdkBaseWebActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C12525a aVar = (C12525a) obj;
            C52711k.m112240b(aVar, "jsMsg");
            this.f32848a.mo23543a(aVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$c */
    static final class C12508c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HeloSdkBaseWebActivity f32849a;

        C12508c(HeloSdkBaseWebActivity heloSdkBaseWebActivity) {
            this.f32849a = heloSdkBaseWebActivity;
        }

        public final void onClick(View view) {
            this.f32849a.onBackPressed();
        }
    }

    /* renamed from: a */
    public View mo23532a(int i) {
        if (this.f32845c == null) {
            this.f32845c = new HashMap();
        }
        View view = (View) this.f32845c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f32845c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract String mo23533a();

    /* renamed from: a */
    public abstract void mo23534a(Intent intent);

    /* renamed from: a */
    public abstract boolean mo23540a(Uri uri);

    /* renamed from: a */
    public abstract boolean mo23543a(C12525a aVar);

    /* renamed from: a */
    public final boolean mo23542a(WebView webView, String str) {
        if (str == null || webView == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        return m25101b(parse);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            C12526b.m25137a(aVar.f32851a);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            WebView webView = aVar.f32851a;
            C52711k.m112240b(webView, C23060d.f61427a);
            webView.onPause();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            WebView webView = aVar.f32851a;
            C52711k.m112240b(webView, C23060d.f61427a);
            webView.onResume();
        }
    }

    public void onBackPressed() {
        WebView webView = (WebView) ((FrameLayout) mo23532a((int) R.id.du8)).findViewById(R.id.dun);
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            webView.goBack();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[Catch:{ Exception -> 0x0102 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9 A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fc A[Catch:{ Exception -> 0x0102 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd A[Catch:{ Exception -> 0x0102 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m25101b(android.net.Uri r13) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f32844b
            java.lang.String r1 = "TAG"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleUri, uri = "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.bytedance.opensdk.p800b.C12471i.m25066a(r0, r1)
            r0 = 0
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r1)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = "bytedance"
            java.lang.String r2 = r13.getScheme()     // Catch:{ Exception -> 0x0102 }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)     // Catch:{ Exception -> 0x0102 }
            r2 = 1
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = "sslocal"
            java.lang.String r3 = r13.getScheme()     // Catch:{ Exception -> 0x0102 }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ Exception -> 0x0102 }
            if (r1 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r1 = 0
            goto L_0x003b
        L_0x003a:
            r1 = 1
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            return r0
        L_0x003e:
            java.lang.String r1 = r13.toString()     // Catch:{ Exception -> 0x0102 }
            java.lang.String r3 = "uri.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)     // Catch:{ Exception -> 0x0102 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0102 }
            r3.<init>()     // Catch:{ Exception -> 0x0102 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "bytedance://"
            r5 = 0
            r6 = 2
            boolean r4 = p2628d.p2650m.C52830p.m112411b(r1, r4, r0, r6, r5)     // Catch:{ Exception -> 0x0102 }
            if (r4 != 0) goto L_0x005f
            r4 = 0
            goto L_0x0065
        L_0x005f:
            java.lang.String r4 = "bytedance://dispatch_message/"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)     // Catch:{ Exception -> 0x0102 }
        L_0x0065:
            if (r4 == 0) goto L_0x0088
            com.bytedance.opensdk.core.base.ui.a r1 = r12.f32843a     // Catch:{ Exception -> 0x0102 }
            if (r1 == 0) goto L_0x0085
            android.webkit.WebView r1 = r1.f32851a     // Catch:{ Exception -> 0x0102 }
            if (r1 == 0) goto L_0x0085
            java.lang.String r3 = "webview"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r3 = "javascript:ToutiaoJSBridge._fetchQueue()"
            java.lang.String r4 = "webView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.opensdk.b.f$a r4 = com.bytedance.opensdk.p800b.C12466f.f32772a     // Catch:{ Exception -> 0x0102 }
            r4.mo23506a(r1, r3)     // Catch:{ Exception -> 0x0102 }
        L_0x0085:
            r1 = 1
            goto L_0x00fa
        L_0x0088:
            java.lang.String r4 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "messageContainer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r4 = "bytedance://"
            boolean r4 = p2628d.p2650m.C52830p.m112411b(r1, r4, r0, r6, r5)     // Catch:{ Exception -> 0x0102 }
            if (r4 == 0) goto L_0x00e3
            java.lang.String r4 = "bytedance://private/setresult/"
            boolean r5 = p2628d.p2650m.C52830p.m112411b(r1, r4, r0, r6, r5)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00e3
            int r4 = r4.length()     // Catch:{ Exception -> 0x0102 }
            r6 = r1
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x0102 }
            r7 = 38
            r9 = 0
            r10 = 4
            r11 = 0
            r8 = r4
            int r5 = p2628d.p2650m.C52830p.m112415a(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0102 }
            if (r5 <= 0) goto L_0x00e3
            java.lang.String r4 = r1.substring(r4, r5)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)     // Catch:{ Exception -> 0x0102 }
            int r5 = r5 + r2
            java.lang.String r1 = r1.substring(r5)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r5 = "SCENE_FETCHQUEUE"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)     // Catch:{ Exception -> 0x0102 }
            if (r4 == 0) goto L_0x00e3
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x0102 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x0102 }
            if (r4 <= 0) goto L_0x00db
            r4 = 1
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e3
            r3.add(r1)     // Catch:{ Exception -> 0x0102 }
            r1 = 1
            goto L_0x00e4
        L_0x00e3:
            r1 = 0
        L_0x00e4:
            if (r1 == 0) goto L_0x00f9
            java.lang.Object r1 = p2628d.p2629a.C52575l.m112140f(r3)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0102 }
            if (r1 == 0) goto L_0x0085
            com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$b r3 = new com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$b     // Catch:{ Exception -> 0x0102 }
            r3.<init>(r12)     // Catch:{ Exception -> 0x0102 }
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3     // Catch:{ Exception -> 0x0102 }
            com.bytedance.opensdk.core.grant.web.p814a.C12524a.m25136a(r1, r3)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0085
        L_0x00f9:
            r1 = 0
        L_0x00fa:
            if (r1 == 0) goto L_0x00fd
            return r2
        L_0x00fd:
            boolean r13 = r12.mo23540a(r13)     // Catch:{ Exception -> 0x0102 }
            return r13
        L_0x0102:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.core.base.p809ui.HeloSdkBaseWebActivity.m25101b(android.net.Uri):boolean");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.r4);
        setRequestedOrientation(1);
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        mo23534a(intent);
        C12526b bVar = C12526b.f32891a;
        Context context = this;
        C52711k.m112240b(context, "context");
        WebView webView = new WebView(context.getApplicationContext());
        webView.setId(R.id.dun);
        WebSettings settings = webView.getSettings();
        C52711k.m112236a((Object) settings, "settings");
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (VERSION.SDK_INT >= 21) {
            webView.setNestedScrollingEnabled(true);
        }
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        ViewParent parent = webView.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        View findViewById = ((FrameLayout) mo23532a((int) R.id.du8)).findViewById(R.id.dun);
        if (findViewById != null) {
            ((FrameLayout) mo23532a((int) R.id.du8)).removeView(findViewById);
        }
        webView.setLayoutParams(new LayoutParams(-1, -1));
        webView.setWebViewClient(C13482c.m27232a(new C12506a(this, this)));
        ((FrameLayout) mo23532a((int) R.id.du8)).addView(webView);
        WebPageStatusView webPageStatusView = new WebPageStatusView(context, null, 0, 6, null);
        webPageStatusView.setId(R.id.duh);
        webPageStatusView.setLayoutParams(new LayoutParams(-1, -1));
        ((FrameLayout) mo23532a((int) R.id.du8)).addView(webPageStatusView);
        this.f32843a = new C12509a(webView, webPageStatusView);
        ((AppCompatImageView) mo23532a((int) R.id.d11)).setOnClickListener(new C12508c(this));
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            String a = mo23533a();
            C52711k.m112240b(a, "url");
            C12513b.m25120a(aVar.f32851a, a);
        }
    }

    /* renamed from: b */
    public final void mo23544b(WebView webView, String str) {
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            aVar.mo23559a(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23539a(String str, C18085o oVar) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(oVar, "params");
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            WebView webView = aVar.f32851a;
            if (webView != null) {
                C12524a aVar2 = C12524a.f32885b;
                C52711k.m112240b(webView, C23060d.f61427a);
                C52711k.m112240b(str, "eventName");
                C52711k.m112240b(oVar, C13594o.f35460a);
                String oVar2 = oVar.toString();
                C52711k.m112236a((Object) oVar2, "o.toString()");
                C52711k.m112240b(str, "eventName");
                C52711k.m112240b(oVar2, "jsonStr");
                if (TextUtils.isEmpty(str)) {
                    str = "RequestDidFinish";
                }
                StringBuilder sb = new StringBuilder("{ 'detail': ");
                sb.append(oVar2);
                sb.append('}');
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("javascript: (function(){ var event = new CustomEvent('");
                sb3.append(str);
                sb3.append("', ");
                sb3.append(sb2);
                sb3.append(");document.dispatchEvent(event);}());");
                String sb4 = sb3.toString();
                C12471i.m25066a(C12524a.f32884a, sb4);
                C52711k.m112240b(webView, "webView");
                C52711k.m112240b(sb4, "url");
                C12461c.f32770a.mo23505a(webView, sb4);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo23541a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webView == null) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        C52711k.m112236a((Object) url, "uri");
        return m25101b(url);
    }

    /* renamed from: a */
    public final void mo23535a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            aVar.mo23559a(4);
        }
    }

    /* renamed from: a */
    public final void mo23536a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (C12473k.f32778a.mo23507a((Context) this)) {
            C12509a aVar = this.f32843a;
            if (aVar != null) {
                aVar.mo23559a(1000);
            }
        } else {
            C12509a aVar2 = this.f32843a;
            if (aVar2 != null) {
                aVar2.mo23559a(2);
            }
        }
    }

    /* renamed from: a */
    public final void mo23537a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            aVar.mo23559a(3);
        }
    }

    /* renamed from: a */
    public final void mo23538a(WebView webView, String str, Bitmap bitmap) {
        C12509a aVar = this.f32843a;
        if (aVar != null) {
            aVar.mo23559a(0);
        }
    }
}
