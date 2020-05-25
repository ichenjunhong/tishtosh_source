package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18911h;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47803da;
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

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness */
public final class PassBackWebInfoBusiness extends Business {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71642a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "handler", "getHandler()Landroid/os/Handler;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "dataMap", "getDataMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "headerMap", "getHeaderMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PassBackWebInfoBusiness.class), "passBackApi", "getPassBackApi()Lcom/ss/android/ugc/aweme/crossplatform/business/PassBackApi;"))};

    /* renamed from: b */
    public int f71643b;

    /* renamed from: c */
    public C27192b f71644c;

    /* renamed from: d */
    private final C52668f f71645d = C52732g.m112285a(C27160c.f71655a);

    /* renamed from: e */
    private final C52668f f71646e = C52732g.m112285a(C27159b.f71654a);

    /* renamed from: f */
    private final C52668f f71647f = C52732g.m112285a(C27161d.f71656a);

    /* renamed from: g */
    private AdLandingPageConfig f71648g;

    /* renamed from: l */
    private boolean f71649l = true;

    /* renamed from: m */
    private int f71650m;

    /* renamed from: n */
    private String f71651n = "https://i.isnssdk.com/inspect/aegis/client/page/";

    /* renamed from: o */
    private final C52668f f71652o = C52732g.m112285a(C27165g.f71662a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$a */
    public static final class C27158a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f71653a;

        public C27158a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f71653a = passBackWebInfoBusiness;
        }

        public final /* synthetic */ Object call() {
            this.f71653a.mo55501d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$b */
    static final class C27159b extends C52712l implements C52670a<ConcurrentHashMap<String, String>> {

        /* renamed from: a */
        public static final C27159b f71654a = new C27159b();

        C27159b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$c */
    static final class C27160c extends C52712l implements C52670a<Handler> {

        /* renamed from: a */
        public static final C27160c f71655a = new C27160c();

        C27160c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$d */
    static final class C27161d extends C52712l implements C52670a<ConcurrentHashMap<String, Map<String, ? extends String>>> {

        /* renamed from: a */
        public static final C27161d f71656a = new C27161d();

        C27161d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$e */
    public static final class C27162e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f71657a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f71658b;

        public C27162e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f71657a = passBackWebInfoBusiness;
            this.f71658b = weakReference;
        }

        public final void run() {
            WebView webView = (WebView) this.f71658b.get();
            if (webView != null) {
                C52711k.m112236a((Object) webView, "webViewRef.get() ?: return@postDelayed");
                final String url = webView.getUrl();
                if (TextUtils.isEmpty(url)) {
                    C0013i.m18a((Callable<TResult>) new C27164f<TResult>(this.f71657a), (Executor) C26890h.m65003a());
                } else if (VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new ValueCallback<String>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C27162e f71659a;

                        {
                            this.f71659a = r1;
                        }

                        public final /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f71659a.f71657a;
                            String str2 = url;
                            C52711k.m112236a((Object) str2, "url");
                            passBackWebInfoBusiness.mo55498a(PassBackWebInfoBusiness.m65550a(str2), str);
                        }
                    });
                } else {
                    PassBackWebInfoBusiness passBackWebInfoBusiness = this.f71657a;
                    C52711k.m112236a((Object) url, "url");
                    StringBuilder sb = new StringBuilder("javascript:window.location.href='bytedance://adPageHtmlContent?html=' + encodeURIComponent(document.documentElement.outerHTML) + '&url=");
                    sb.append(PassBackWebInfoBusiness.m65550a(url));
                    sb.append("'");
                    String sb2 = sb.toString();
                    C18984e.m46161a(sb2);
                    webView.loadUrl(sb2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$f */
    static final class C27164f<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f71661a;

        C27164f(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f71661a = passBackWebInfoBusiness;
        }

        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                C27192b bVar = this.f71661a.f71644c;
                if (bVar != null) {
                    long j = 0;
                    try {
                        String str = bVar.f71758m;
                        if (str != null) {
                            j = Long.parseLong(str);
                        }
                    } catch (Exception unused) {
                    }
                    jSONObject.put("cid", j);
                }
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f71661a.mo55499b().keySet();
                if (keySet != null) {
                    for (String b : keySet) {
                        jSONArray.put(PassBackWebInfoBusiness.m65551b(b));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            C23131p.m57779a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$g */
    static final class C27165g extends C52712l implements C52670a<PassBackApi> {

        /* renamed from: a */
        public static final C27165g f71662a = new C27165g();

        C27165g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (PassBackApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder("https://i.isnssdk.com").mo19925a().mo19930a(PassBackApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$h */
    public static final class C27166h implements C12743e<String> {
        C27166h() {
        }

        /* renamed from: a */
        public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
        }

        /* renamed from: a */
        public final void mo19943a(C12690b<String> bVar, Throwable th) {
        }
    }

    /* renamed from: a */
    public final Handler mo55496a() {
        return (Handler) this.f71645d.getValue();
    }

    /* renamed from: b */
    public final Map<String, String> mo55499b() {
        return (Map) this.f71646e.getValue();
    }

    /* renamed from: c */
    public final Map<String, Map<String, String>> mo55500c() {
        return (Map) this.f71647f.getValue();
    }

    /* renamed from: e */
    public final boolean mo55502e() {
        if (this.f71648g == null || this.f71644c == null) {
            return false;
        }
        C27192b bVar = this.f71644c;
        if (bVar == null) {
            C52711k.m112234a();
        }
        if (!bVar.f71738B) {
            return false;
        }
        if (this.f71649l && NetworkUtils.getNetworkType(C11010c.m22280a()) != C18911h.WIFI) {
            return false;
        }
        if (this.f71650m <= 0 || C27179h.m65597a().get() < this.f71650m) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo55501d() {
        C27192b bVar = this.f71644c;
        if (bVar != null && !mo55499b().isEmpty()) {
            C18085o oVar = new C18085o();
            C17980i iVar = new C17980i();
            Iterator it = mo55499b().entrySet().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C18085o oVar2 = new C18085o();
                String b = m65551b(str);
                oVar2.mo35020a("url", b);
                oVar2.mo35020a("html", m65551b(str2));
                Map map = (Map) mo55500c().get(C47803da.m103437a(b));
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
            oVar.mo35019a("ad_id", (Number) Long.valueOf(bVar.f71746a));
            long j = 0;
            try {
                String str3 = bVar.f71758m;
                if (str3 != null) {
                    j = Long.parseLong(str3);
                }
            } catch (Exception unused) {
            }
            oVar.mo35019a("cid", (Number) Long.valueOf(j));
            oVar.mo35020a("log_extra", bVar.f71754i);
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
                ((PassBackApi) this.f71652o.getValue()).executePost(this.f71651n, oVar5).enqueue(new C27166h());
                mo55499b().clear();
                mo55500c().clear();
                C27179h.m65597a().addAndGet(1);
            }
        }
    }

    /* renamed from: a */
    public static String m65550a(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        C52711k.m112236a((Object) encode, "URLEncoder.encode(str, \"UTF-8\")");
        return encode;
    }

    /* renamed from: b */
    public static String m65551b(String str) {
        String decode = URLDecoder.decode(str, "UTF-8");
        C52711k.m112236a((Object) decode, "URLDecoder.decode(str, \"UTF-8\")");
        return decode;
    }

    public PassBackWebInfoBusiness(C27173c cVar) {
        C52711k.m112240b(cVar, "crossPlatformBusiness");
        super(cVar);
    }

    /* renamed from: a */
    public final void mo55497a(C27192b bVar) {
        this.f71644c = bVar;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            this.f71648g = b.getAdLandingPageConfig();
            AdLandingPageConfig adLandingPageConfig = this.f71648g;
            if (adLandingPageConfig != null) {
                Boolean adLandingPageReportWifiOnlyEnable = adLandingPageConfig.getAdLandingPageReportWifiOnlyEnable();
                C52711k.m112236a((Object) adLandingPageReportWifiOnlyEnable, "it.adLandingPageReportWifiOnlyEnable");
                this.f71649l = adLandingPageReportWifiOnlyEnable.booleanValue();
                Integer adLandingPageReportPageCount = adLandingPageConfig.getAdLandingPageReportPageCount();
                C52711k.m112236a((Object) adLandingPageReportPageCount, "it.adLandingPageReportPageCount");
                this.f71643b = adLandingPageReportPageCount.intValue();
                Integer adLandingPageReportLimitTimes = adLandingPageConfig.getAdLandingPageReportLimitTimes();
                C52711k.m112236a((Object) adLandingPageReportLimitTimes, "it.adLandingPageReportLimitTimes");
                this.f71650m = adLandingPageReportLimitTimes.intValue();
                String adLandingPageReportUrl = adLandingPageConfig.getAdLandingPageReportUrl();
                if (adLandingPageReportUrl != null) {
                    this.f71651n = adLandingPageReportUrl;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo55498a(String str, String str2) {
        if (str2 != null) {
            mo55499b().put(str, C52830p.m112448b(str2, "\""));
        }
    }
}
