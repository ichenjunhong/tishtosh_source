package com.bytedance.android.livesdk.browser.p289c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.C4672a;
import com.bytedance.android.livesdk.browser.C4690b;
import com.bytedance.android.livesdk.browser.C4695c;
import com.bytedance.android.livesdk.browser.jsbridge.C4762a;
import com.bytedance.android.livesdk.browser.jsbridge.C4769b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4699a;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4701c;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.browser.p290d.C4712a;
import com.bytedance.android.livesdk.browser.p290d.C4712a.C4713a;
import com.bytedance.android.livesdk.browser.p290d.C4715c;
import com.bytedance.android.livesdk.browser.p290d.C4742w;
import com.bytedance.android.livesdk.browser.p291e.C4746a;
import com.bytedance.android.livesdk.browser.p293g.C4754a;
import com.bytedance.android.livesdk.browser.p293g.C4755b;
import com.bytedance.android.livesdk.browser.view.C4957b;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4581b;
import com.bytedance.android.livesdkapi.depend.live.C8669s;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;
import com.bytedance.android.monitor.webview.C8902j;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.p675g.p676a.C10761c;
import com.ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.e */
public final class C4707e implements C4697b {

    /* renamed from: a */
    private List<C4762a> f12818a;

    /* renamed from: b */
    private List<C0649f> f12819b;

    /* renamed from: c */
    private Set<C4754a> f12820c;

    /* renamed from: d */
    private C4701c f12821d;

    /* renamed from: com.bytedance.android.livesdk.browser.c.e$a */
    static class C4709a extends WebChromeClient {

        /* renamed from: a */
        public C4769b f12822a;

        C4709a() {
        }

        public final void onConsoleMessage(String str, int i, String str2) {
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        }

        public final void onGeolocationPermissionsHidePrompt() {
            if (this.f12822a != null) {
                this.f12822a.mo10594d();
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            if (this.f12822a != null) {
                this.f12822a.mo10592a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            C8902j.m17571b().mo15896a(webView, i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.e$b */
    static class C4710b extends C10761c {

        /* renamed from: a */
        private C4702d f12823a;

        C4710b(C4702d dVar) {
            this.f12823a = dVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f12823a != null) {
                this.f12823a.mo8983a(webView, str);
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && ((Boolean) LiveConfigSettingKeys.WEB_OFFLINE_ENABLED.mo9431a()).booleanValue()) {
                WebResourceResponse c = TTLiveSDKContext.getHostService().mo10316i().mo15573c(str);
                if (c != null) {
                    return c;
                }
            }
            WebResourceResponse a = C4514j.m10883j().mo10323d().mo10332d().mo10587a(str, webView);
            if (a != null) {
                return a;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            if (super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    str2 = "";
                } else {
                    str2 = parse.getScheme().toLowerCase();
                }
                if (!TextUtils.isEmpty(str2) && !"about".equals(str2) && !str2.equals(WebKitApi.SCHEME_HTTPS)) {
                    if (!str2.equals(WebKitApi.SCHEME_HTTP)) {
                        return C4514j.m10883j().mo10328i().handle(webView.getContext(), str);
                    }
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C8902j.m17571b().mo15898a(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.e$c */
    public static final class C4711c implements C4510b<C4697b> {
        /* renamed from: a */
        public final C4511a<C4697b> mo10307a(C4511a<C4697b> aVar) {
            return aVar.mo10337a(new C4707e()).mo10336a();
        }
    }

    /* renamed from: a */
    public final void mo10494a(C4703e eVar) {
        if (eVar != null) {
            mo10504b((C4762a) eVar);
            C4695c.m11181a(eVar.f12813a);
            if (eVar.f12814b != null) {
                eVar.f12814b.mo10484b();
            }
            C8902j.m17571b().mo15904b((WebView) eVar.f12813a);
            eVar.f12814b = null;
            eVar.f12813a = null;
            eVar.f12815c = null;
            eVar.f12816d = null;
        }
    }

    /* renamed from: a */
    public final void mo10496a(C4703e eVar, String str, JSONObject jSONObject) {
        if (eVar != null && eVar.f12814b != null) {
            eVar.mo10525a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo10495a(C4703e eVar, String str) {
        Map map;
        if (eVar != null && eVar.f12813a != null) {
            if (m11230a(str)) {
                map = TTLiveSDKContext.getHostService().mo10316i().mo15572b(str);
            } else {
                map = Collections.emptyMap();
            }
            C4581b.m11006a(str, (WebView) eVar.f12813a, map);
        }
    }

    /* renamed from: a */
    public final boolean mo10500a(WebView webView, String str) {
        if (this.f12820c != null && this.f12820c.size() > 0) {
            for (C4754a a : this.f12820c) {
                if (a.mo10588a(webView, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10497a(C4762a aVar) {
        this.f12818a.add(aVar);
    }

    /* renamed from: a */
    public final void mo10498a(String str, JSONObject jSONObject) {
        for (C4762a a : this.f12818a) {
            a.mo10525a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final boolean mo10499a() {
        return this.f12821d == null || this.f12821d.mo10522a();
    }

    /* renamed from: b */
    public final void mo10501b() {
        for (C0649f dismissAllowingStateLoss : this.f12819b) {
            dismissAllowingStateLoss.dismissAllowingStateLoss();
        }
        this.f12819b.clear();
    }

    private C4707e() {
        this.f12818a = new CopyOnWriteArrayList();
        this.f12819b = new CopyOnWriteArrayList();
        this.f12820c = new HashSet();
        this.f12820c.add(new C4755b());
        C4705d.m11228a();
    }

    /* renamed from: a */
    public final void mo10493a(C4701c cVar) {
        this.f12821d = cVar;
    }

    /* renamed from: a */
    public final void mo10491a(C0649f fVar) {
        this.f12819b.add(fVar);
    }

    /* renamed from: b */
    public final void mo10502b(C0649f fVar) {
        this.f12819b.remove(fVar);
    }

    /* renamed from: a */
    private static boolean m11230a(String str) {
        try {
            return ((C8669s) C4116c.m10249a(C8669s.class)).mo15066a(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo10503b(C4701c cVar) {
        if (this.f12821d == cVar) {
            this.f12821d = null;
        }
    }

    /* renamed from: a */
    public final C4104a mo10487a(C4700b bVar) {
        C4672a.m11155a(bVar.f12793a);
        return C4742w.m11292a(bVar);
    }

    /* renamed from: a */
    public final WebView mo10485a(Context context) {
        C4703e eVar;
        String str;
        if (this.f12821d == null) {
            eVar = null;
        } else {
            eVar = this.f12821d.mo10524b();
        }
        if (eVar != null) {
            return eVar.f12813a;
        }
        C4746a.m11309a();
        RoundRectWebView roundRectWebView = new RoundRectWebView(context);
        if (context != null) {
            str = context.getClass().getName();
        } else {
            str = "other";
        }
        C4746a.m11310a(str);
        C4514j.m10883j().mo10323d().mo10329a().mo10482a(roundRectWebView);
        return roundRectWebView;
    }

    /* renamed from: b */
    public final void mo10504b(C4762a aVar) {
        this.f12818a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo10492a(WebView webView) {
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        if (this.f12821d == null || !this.f12821d.mo10523a(webView)) {
            C4695c.m11181a(webView);
        }
        C8902j.m17571b().mo15904b(webView);
    }

    /* renamed from: a */
    public final C4104a mo10488a(C4700b bVar, C8719s sVar) {
        C4672a.m11155a(bVar.f12793a);
        return C4715c.m11258a(bVar, sVar);
    }

    /* renamed from: a */
    public final C4703e mo10489a(Activity activity, C4702d dVar) {
        String str;
        C4746a.m11309a();
        RoundRectWebView roundRectWebView = new RoundRectWebView(activity);
        if (activity != null) {
            str = activity.getClass().getName();
        } else {
            str = "other";
        }
        C4746a.m11310a(str);
        roundRectWebView.setHorizontalScrollBarEnabled(false);
        roundRectWebView.setVerticalScrollBarEnabled(false);
        if (VERSION.SDK_INT >= 21) {
            roundRectWebView.getSettings().setMixedContentMode(2);
        }
        C4514j.m10883j().mo10323d().mo10329a().mo10482a(roundRectWebView);
        C4710b bVar = new C4710b(dVar);
        C4709a aVar = new C4709a();
        C4769b a = C4769b.m11328a(activity, roundRectWebView, bVar, aVar);
        aVar.f12822a = a;
        bVar.f28943b = a.mo10593c().f29036a;
        C4957b.m11447a((Context) activity).mo10692a(true).mo10693a((WebView) roundRectWebView);
        if (VERSION.SDK_INT >= 19 && ((Boolean) C4690b.f12776i.mo9431a()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C4703e eVar = new C4703e(roundRectWebView, a, aVar, bVar);
        mo10497a((C4762a) eVar);
        return eVar;
    }

    /* renamed from: a */
    public final void mo10490a(Context context, C4699a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", aVar.f12788c);
        bundle.putBoolean("hide_status_bar", aVar.f12789d);
        bundle.putString("title", aVar.f12787b);
        bundle.putBoolean("show_progress", aVar.f12790e);
        bundle.putBoolean("bundle_user_webview_title", true);
        bundle.putString("status_bar_color", aVar.f12791f);
        bundle.putString("status_bar_bg_color", aVar.f12792g);
        bundle.putInt("bundle_web_view_background_color", C3922z.m9909b((int) R.color.a9i));
        TTLiveSDKContext.getHostService().mo10313f().mo14427a(aVar.f12786a, bundle, context);
    }

    /* renamed from: a */
    public final C4104a mo10486a(Context context, String str, String str2) {
        C4672a.m11155a(str);
        C4713a aVar = new C4713a(str);
        aVar.f12836d = false;
        aVar.f12835c = str2;
        Bundle bundle = new Bundle();
        bundle.putString("key_url", aVar.f12833a);
        bundle.putString("key_from_type", aVar.f12835c);
        bundle.putString("key_title", aVar.f12834b);
        bundle.putBoolean("key_with_title_bar", aVar.f12836d);
        C4712a aVar2 = new C4712a();
        aVar2.setArguments(bundle);
        return aVar2;
    }
}
