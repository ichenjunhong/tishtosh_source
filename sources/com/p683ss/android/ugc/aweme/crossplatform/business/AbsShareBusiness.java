package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t;
import com.p683ss.android.ugc.aweme.setting.model.WebShareMode;
import com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C42198a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness */
abstract class AbsShareBusiness extends Business {

    /* renamed from: a */
    WebSharePackage f71614a;

    /* renamed from: b */
    List<String> f71615b = C17593ar.m43277a((E[]) new String[]{"copylink", "qrcode", "browser", "refresh"});

    /* renamed from: c */
    List<WebShareMode> f71616c;

    /* renamed from: d */
    String f71617d = this.f71633j.f71718a.f71706c;

    /* renamed from: e */
    String f71618e;

    /* renamed from: f */
    String f71619f;

    /* renamed from: g */
    public WebView f71620g;

    /* renamed from: l */
    private C27156a f71621l;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$a */
    final class C27156a {
        private C27156a() {
        }

        @JavascriptInterface
        public final void showSource(String str, String str2) {
            C22530t tVar;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("title", str);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = null;
            if (AbsShareBusiness.this.f71620g != null && (AbsShareBusiness.this.f71620g instanceof SingleWebView)) {
                C22521l monitorSession = ((SingleWebView) AbsShareBusiness.this.f71620g).getMonitorSession();
                if (monitorSession != null) {
                    tVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                } else {
                    tVar = null;
                }
                C27131c.m65449a(C27132a.m65458a(), tVar, "webview_safe_log", "abs_share_business_jsb", jSONObject, null, null, 48, null);
                AbsShareBusiness.this.f71620g = null;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2 = new JSONObject(str2);
                }
            } catch (JSONException unused2) {
            }
            AbsShareBusiness.this.mo55466a(str, jSONObject2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo55468b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo55467a() {
        return this.f71631h.mo54151g();
    }

    /* renamed from: c */
    public void mo55471c() {
        C1667a.m5940a().mo6139a(new C27169a(this));
    }

    /* renamed from: a */
    public void mo55465a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f71614a = null;
            this.f71617d = str;
        }
    }

    /* renamed from: b */
    public void mo55469b(WebView webView) {
        if (webView != null) {
            this.f71620g = webView;
            WebView webView2 = this.f71620g;
            String str = "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());";
            C18984e.m46161a(str);
            webView2.loadUrl(str);
        }
    }

    AbsShareBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo55464a(WebView webView) {
        if (webView != null) {
            if (this.f71621l == null) {
                this.f71621l = new C27156a();
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(this.f71621l, "local_obj");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo55470b(String str) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        hashMap.put("previous_page", this.f71633j.f71718a.f71709f);
        String str5 = "group_id";
        if (TextUtils.isEmpty(this.f71633j.f71718a.f71708e)) {
            str2 = "";
        } else {
            str2 = this.f71633j.f71718a.f71708e;
        }
        hashMap.put(str5, str2);
        String str6 = "webview_type";
        if (TextUtils.isEmpty(this.f71633j.f71718a.f71708e)) {
            str3 = "";
        } else {
            str3 = "article";
        }
        hashMap.put(str6, str3);
        String str7 = "url";
        if (this.f71614a == null || TextUtils.isEmpty(this.f71614a.f106899h)) {
            str4 = this.f71617d;
        } else {
            str4 = this.f71614a.f106899h;
        }
        hashMap.put(str7, str4);
        C26890h.m65011a("h5_share", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static String m65510a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString == null || TextUtils.equals(optString, TEVideoRecorder.FACE_BEAUTY_NULL)) {
            return null;
        }
        return optString;
    }

    /* renamed from: a */
    public final void mo55466a(String str, JSONObject jSONObject) {
        String str2 = "";
        if (this.f71631h instanceof C27114h) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f71614a = C42198a.m92604a(this.f71634k, str, jSONObject, this.f71617d, str2);
        String a = m65510a(jSONObject, "qrcode");
        this.f71619f = m65510a(jSONObject, "sharetips");
        this.f71616c = (List) new C17971f().mo34885a(m65510a(jSONObject, "aweme:shareChannels"), new C17956a<List<WebShareMode>>() {
        }.f49843c);
        if (TextUtils.isEmpty(a) || (!TextUtils.equals("1", a) && !TextUtils.equals(a, "true"))) {
            this.f71615b.remove("qrcode");
        }
        this.f71618e = m65510a(jSONObject, "innerUrl");
        String str3 = this.f71614a.f106899h;
        if (!TextUtils.isEmpty(this.f71618e)) {
            str3 = this.f71618e;
        } else if (!TextUtils.isEmpty(this.f71617d)) {
            str3 = this.f71617d;
        }
        if (!TextUtils.equals(str3, this.f71614a.f106899h)) {
            this.f71614a.f106900i.putString("url_for_im_share", str3);
        }
        String a2 = m65510a(jSONObject, "shareitems");
        if (a2 != null) {
            List list = (List) new C17971f().mo34885a(a2, new C17956a<List<String>>() {
            }.f49843c);
            if (list != null) {
                this.f71615b.clear();
                this.f71615b.addAll(list);
            }
        }
        mo55471c();
    }
}
