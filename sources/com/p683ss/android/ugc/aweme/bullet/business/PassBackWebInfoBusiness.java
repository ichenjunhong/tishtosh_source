package com.p683ss.android.ugc.aweme.bullet.business;

import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.sdk.account.p849b.p853d.C13032a;
import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18911h;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27179h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness */
public final class PassBackWebInfoBusiness extends Business {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64326a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "handler", "getHandler()Landroid/os/Handler;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "dataMap", "getDataMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "headerMap", "getHeaderMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "passBackApi", "getPassBackApi()Lcom/ss/android/ugc/aweme/bullet/business/PassBackApi;"))};

    /* renamed from: b */
    public AdLandingPageConfig f64327b;

    /* renamed from: c */
    public boolean f64328c = true;

    /* renamed from: d */
    public int f64329d;

    /* renamed from: e */
    public int f64330e;

    /* renamed from: f */
    public String f64331f = "https://i.isnssdk.com/inspect/aegis/client/page/";

    /* renamed from: g */
    private final C52668f f64332g = C52732g.m112285a(C24242c.f64338a);

    /* renamed from: h */
    private final C52668f f64333h = C52732g.m112285a(C24241b.f64337a);

    /* renamed from: i */
    private final C52668f f64334i = C52732g.m112285a(C24243d.f64339a);

    /* renamed from: j */
    private final C52668f f64335j = C52732g.m112285a(C24247g.f64346a);

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$a */
    static final class C24240a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f64336a;

        C24240a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f64336a = passBackWebInfoBusiness;
        }

        public final /* synthetic */ Object call() {
            this.f64336a.mo49992c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$b */
    static final class C24241b extends C52712l implements C52670a<ConcurrentHashMap<String, String>> {

        /* renamed from: a */
        public static final C24241b f64337a = new C24241b();

        C24241b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$c */
    static final class C24242c extends C52712l implements C52670a<Handler> {

        /* renamed from: a */
        public static final C24242c f64338a = new C24242c();

        C24242c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$d */
    static final class C24243d extends C52712l implements C52670a<ConcurrentHashMap<String, Map<String, ? extends String>>> {

        /* renamed from: a */
        public static final C24243d f64339a = new C24243d();

        C24243d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$e */
    static final class C24244e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f64340a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f64341b;

        C24244e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f64340a = passBackWebInfoBusiness;
            this.f64341b = weakReference;
        }

        public final void run() {
            WebView webView = (WebView) this.f64341b.get();
            if (webView != null) {
                C52711k.m112236a((Object) webView, "webViewRef.get() ?: return@postDelayed");
                final String url = webView.getUrl();
                if (TextUtils.isEmpty(url)) {
                    this.f64340a.mo49991b();
                } else if (VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new ValueCallback<String>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C24244e f64342a;

                        {
                            this.f64342a = r1;
                        }

                        public final /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f64342a.f64340a;
                            String str2 = url;
                            C52711k.m112236a((Object) str2, "url");
                            passBackWebInfoBusiness.mo49989a(PassBackWebInfoBusiness.m59338a(str2), str);
                        }
                    });
                } else {
                    PassBackWebInfoBusiness passBackWebInfoBusiness = this.f64340a;
                    C52711k.m112236a((Object) url, "url");
                    StringBuilder sb = new StringBuilder("javascript:window.location.href='bytedance://adPageHtmlContent?html=' + encodeURIComponent(document.documentElement.outerHTML) + '&url=");
                    sb.append(PassBackWebInfoBusiness.m59338a(url));
                    sb.append("'");
                    String sb2 = sb.toString();
                    C18984e.m46161a(sb2);
                    webView.loadUrl(sb2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$f */
    static final class C24246f<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f64344a;

        /* renamed from: b */
        final /* synthetic */ C24310h f64345b;

        C24246f(PassBackWebInfoBusiness passBackWebInfoBusiness, C24310h hVar) {
            this.f64344a = passBackWebInfoBusiness;
            this.f64345b = hVar;
        }

        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            try {
                String str = (String) this.f64345b.f64485V.mo18457b();
                if (str != null) {
                    Long d = C52830p.m112396d(str);
                    if (d != null) {
                        j = d.longValue();
                    }
                }
            } catch (Exception unused) {
            }
            try {
                jSONObject.put("cid", j);
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f64344a.mo49986a().keySet();
                if (keySet != null) {
                    for (String b : keySet) {
                        jSONArray.put(PassBackWebInfoBusiness.m59339b(b));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            C23131p.m57779a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$g */
    static final class C24247g extends C52712l implements C52670a<PassBackApi> {

        /* renamed from: a */
        public static final C24247g f64346a = new C24247g();

        C24247g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (PassBackApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder("https://i.isnssdk.com").mo19925a().mo19930a(PassBackApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$h */
    public static final class C24248h implements C12743e<String> {
        C24248h() {
        }

        /* renamed from: a */
        public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
        }

        /* renamed from: a */
        public final void mo19943a(C12690b<String> bVar, Throwable th) {
        }
    }

    /* renamed from: e */
    private final Handler m59340e() {
        return (Handler) this.f64332g.getValue();
    }

    /* renamed from: f */
    private final Map<String, Map<String, String>> m59341f() {
        return (Map) this.f64334i.getValue();
    }

    /* renamed from: a */
    public final Map<String, String> mo49986a() {
        return (Map) this.f64333h.getValue();
    }

    /* renamed from: d */
    public final void mo49993d() {
        if (m59342g()) {
            C0013i.m16a((Callable<TResult>) new C24240a<TResult>(this));
        }
        m59340e().removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo49991b() {
        C10578a b = this.f64316k.mo50019b();
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if (hVar instanceof C24310h) {
            C0013i.m18a((Callable<TResult>) new C24246f<TResult>(this, hVar), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: g */
    private final boolean m59342g() {
        if (this.f64327b == null) {
            return false;
        }
        C10578a b = this.f64316k.mo50019b();
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if (!(hVar instanceof C24310h) || (!C52711k.m112239a((Object) (Boolean) hVar.f64476M.mo18457b(), (Object) Boolean.valueOf(true)))) {
            return false;
        }
        if (this.f64328c && NetworkUtils.getNetworkType(C11010c.m22280a()) != C18911h.WIFI) {
            return false;
        }
        if (this.f64330e <= 0 || C27179h.m65599b().get() < this.f64330e) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo49992c() {
        C10578a b = this.f64316k.mo50019b();
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if ((hVar instanceof C24310h) && !mo49986a().isEmpty()) {
            C18085o oVar = new C18085o();
            C17980i iVar = new C17980i();
            Iterator it = mo49986a().entrySet().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C18085o oVar2 = new C18085o();
                String b2 = m59339b(str);
                oVar2.mo35020a("url", b2);
                oVar2.mo35020a("html", m59339b(str2));
                Map map = (Map) m59341f().get(C13032a.m26205a(b2));
                if (map != null && !map.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    C18085o oVar3 = new C18085o();
                    for (Entry entry2 : map.entrySet()) {
                        oVar3.mo35020a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    oVar2.mo35017a("headers", (C18082l) oVar3);
                }
                iVar.mo34903a((C18082l) oVar2);
            }
            oVar.mo35017a("pages", (C18082l) iVar);
            oVar.mo35019a("ad_id", (Number) hVar.f64502e.mo18457b());
            long j = 0;
            try {
                String str3 = (String) hVar.f64485V.mo18457b();
                if (str3 != null) {
                    Long d = C52830p.m112396d(str3);
                    if (d != null) {
                        j = d.longValue();
                    }
                }
            } catch (Exception unused) {
            }
            oVar.mo35019a("cid", (Number) Long.valueOf(j));
            oVar.mo35020a("log_extra", (String) hVar.f64482S.mo18457b());
            oVar.mo35019a("timestamp", (Number) Long.valueOf(new Date().getTime()));
            C18911h networkType = NetworkUtils.getNetworkType(C11010c.m22280a());
            C52711k.m112236a((Object) networkType, "NetworkUtils.getNetworkT….getApplicationContext())");
            oVar.mo35019a("network_type", (Number) Integer.valueOf(networkType.getValue()));
            C36282r a = C36286a.m81925a().mo75118a();
            if (a == null) {
                oVar.mo35017a("location", (C18082l) null);
            } else {
                C18085o oVar4 = new C18085o();
                oVar4.mo35019a("longitude", (Number) Double.valueOf(a.getLongitude()));
                oVar4.mo35019a("latitude", (Number) Double.valueOf(a.getLatitude()));
                oVar.mo35017a("location", (C18082l) oVar4);
            }
            String a2 = C27179h.f71702a.mo55529a(oVar);
            if (!TextUtils.isEmpty(a2)) {
                C18085o oVar5 = new C18085o();
                oVar5.mo35020a(C42311c.f106865i, a2);
                ((PassBackApi) this.f64335j.getValue()).executePost(this.f64331f, oVar5).enqueue(new C24248h());
                mo49986a().clear();
                m59341f().clear();
                C27179h.m65599b().addAndGet(1);
            }
        }
    }

    /* renamed from: a */
    public static String m59338a(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        C52711k.m112236a((Object) encode, "URLEncoder.encode(str, \"UTF-8\")");
        return encode;
    }

    /* renamed from: b */
    public static String m59339b(String str) {
        String decode = URLDecoder.decode(str, "UTF-8");
        C52711k.m112236a((Object) decode, "URLDecoder.decode(str, \"UTF-8\")");
        return decode;
    }

    public PassBackWebInfoBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49987a(Uri uri) {
        if (m59342g() && uri != null) {
            String queryParameter = uri.getQueryParameter("url");
            String queryParameter2 = uri.getQueryParameter("html");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                if (queryParameter == null) {
                    C52711k.m112234a();
                }
                if (queryParameter2 == null) {
                    C52711k.m112234a();
                }
                mo49989a(queryParameter, queryParameter2);
            }
        }
    }

    /* renamed from: a */
    public final void mo49988a(WebView webView) {
        boolean z;
        if (m59342g() && mo49986a().size() < this.f64329d && webView != null) {
            CharSequence url = webView.getUrl();
            if (url == null || C52830p.m112402a(url)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C52711k.m112239a((Object) QuickShopBusiness.f64351b, (Object) webView.getUrl())) {
                m59340e().postDelayed(new C24244e(this, new WeakReference(webView)), 200);
            }
        }
    }

    /* renamed from: a */
    public final void mo49989a(String str, String str2) {
        if (str2 != null) {
            mo49986a().put(str, C52830p.m112448b(str2, "\""));
        }
    }

    /* renamed from: a */
    public final void mo49990a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "headers");
        if (m59342g() && mo49986a().size() < this.f64329d && !C52830p.m112402a(str) && !C52711k.m112239a((Object) QuickShopBusiness.f64351b, (Object) str) && !C52830p.m112413c(str, ".js", false, 2, null) && !C52830p.m112413c(str, ".css", false, 2, null)) {
            String str2 = (String) map.get("Accept");
            if (str2 != null && C52830p.m112456b((CharSequence) str2, (CharSequence) "html", false, 2, (Object) null)) {
                Map f = m59341f();
                String a = C13032a.m26205a(str);
                C52711k.m112236a((Object) a, "Md5Utils.hexDigest(url)");
                f.put(a, map);
            }
        }
    }
}
