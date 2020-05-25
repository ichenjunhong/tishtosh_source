package com.p683ss.android.ugc.aweme.p2377ug.poloris;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.p688h.C10979b;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.polaris.p821a.C12555a;
import com.bytedance.polaris.p821a.C12557c;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12562h;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18908e;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.newmedia.p1202ui.webview.C19621d;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.sdk.webview.C19761i;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.C27947k;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52803m;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl */
public final class PolarisDependImpl implements C12557c, C12559e {

    /* renamed from: a */
    public static final C52668f f119741a = C52732g.m112286a(C52757k.SYNCHRONIZED, C47475b.f119746a);

    /* renamed from: b */
    public static final C47474a f119742b = new C47474a(null);

    /* renamed from: c */
    private C19761i f119743c;

    /* renamed from: d */
    private PolarisDependApi f119744d;

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$PolarisDependApi */
    public interface PolarisDependApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);

        @C12718t
        @C12705g
        C17832m<String> doPost(@C12713o Integer num, @C12699af String str, @C12704f Map<String, String> map);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$a */
    public static final class C47474a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f119745a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47474a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/ug/poloris/PolarisDependImpl;"))};

        private C47474a() {
        }

        /* renamed from: a */
        public static PolarisDependImpl m102871a() {
            return (PolarisDependImpl) PolarisDependImpl.f119741a.getValue();
        }

        public /* synthetic */ C47474a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$b */
    static final class C47475b extends C52712l implements C52670a<PolarisDependImpl> {

        /* renamed from: a */
        public static final C47475b f119746a = new C47475b();

        C47475b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PolarisDependImpl(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$c */
    static final class C47476c implements C10979b {

        /* renamed from: a */
        public static final C47476c f119747a = new C47476c();

        C47476c() {
        }

        /* renamed from: a */
        public final boolean mo18674a(String str) {
            return C10885e.m22080c(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$d */
    public static final class C47477d implements C12562h {

        /* renamed from: a */
        final /* synthetic */ C12562h f119748a;

        C47477d(C12562h hVar) {
            this.f119748a = hVar;
        }
    }

    /* renamed from: a */
    public final int mo23606a() {
        return C23018b.f61359a;
    }

    /* renamed from: b */
    public final String mo23617b() {
        return "16.0.41";
    }

    /* renamed from: b */
    public final String mo23604b(Context context, String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public final boolean mo23603a(Context context, String str) {
        return C23060d.f61431e.mo47789a(context, str, context != null ? context.getPackageName() : null);
    }

    /* renamed from: a */
    public final void mo23602a(WebView webView) {
        C19621d.f54053a.mo40908a(webView);
    }

    /* renamed from: a */
    public final void mo23613a(String str, JSONObject jSONObject) {
        C26890h.m65012a(str, jSONObject);
    }

    /* renamed from: a */
    public final boolean mo23616a(String str, int i, String str2, String str3) {
        return C47478a.m102873a(str, i, str2, str3);
    }

    /* renamed from: a */
    public final void mo23615a(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new C52803m(sb.toString());
    }

    /* renamed from: a */
    public final void mo23614a(Map<String, String> map, boolean z) {
        NetUtil.putCommonParams(map, z);
    }

    /* renamed from: f */
    public final String mo23621f() {
        String str = Api.f61282b;
        C52711k.m112236a((Object) str, "Api.API_URL_PREFIX_SI");
        return str;
    }

    /* renamed from: c */
    public final boolean mo23618c() {
        C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
        return C47549c.m102978c();
    }

    /* renamed from: d */
    public final String mo23619d() {
        String c = C19034d.m46323c();
        C52711k.m112236a((Object) c, "DeviceRegisterManager.getDeviceId()");
        return c;
    }

    private PolarisDependImpl() {
        this.f119744d = (PolarisDependApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(PolarisDependApi.class);
    }

    /* renamed from: e */
    public final boolean mo23620e() {
        Activity activity;
        WeakReference b = C27947k.m66703b();
        if (b != null) {
            activity = (Activity) b.get();
        } else {
            activity = null;
        }
        return activity instanceof MainActivity;
    }

    /* renamed from: g */
    public final void mo94753g() {
        if (this.f119743c == null) {
            PolarisDependImpl polarisDependImpl = this;
            AwemeAppData a = C19555f.m47851a();
            C52711k.m112236a((Object) a, "BaseAppData.inst()");
            C19767n f = a.mo40808f();
            if (f != null && f.mo41207a()) {
                polarisDependImpl.f119743c = new C19761i(f.mo41208b()).mo41191a((C10979b) C47476c.f119747a).mo41193a(C48380q.m104673f()).mo41192a(f.mo41209c());
            }
        }
    }

    public /* synthetic */ PolarisDependImpl(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final int mo23598a(Context context, Exception exc) {
        return C10201a.m20660a(context, (Throwable) exc);
    }

    /* renamed from: a */
    public final String mo23607a(int i, String str) {
        String executeGet = NetworkUtils.executeGet(20480, str);
        C52711k.m112236a((Object) executeGet, "NetworkUtils.executeGet(maxLength, url)");
        return executeGet;
    }

    /* renamed from: a */
    public final WebResourceResponse mo23600a(WebView webView, String str) {
        WebResourceResponse webResourceResponse;
        if (this.f119743c != null) {
            C19761i iVar = this.f119743c;
            if (iVar != null) {
                webResourceResponse = iVar.mo41190a(webView, str);
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo23605c(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        return C47485d.m102882a(context, str, "");
    }

    /* renamed from: a */
    public final WebResourceResponse mo23599a(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        String str;
        if (this.f119743c != null && VERSION.SDK_INT >= 21) {
            C19761i iVar = this.f119743c;
            if (iVar != null) {
                if (webResourceRequest != null) {
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        str = url.toString();
                        webResourceResponse = iVar.mo41190a(webView, str);
                    }
                }
                str = null;
                webResourceResponse = iVar.mo41190a(webView, str);
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23601a(Context context, int i) {
        String str;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C41302w a = C41302w.m91042a();
            C52711k.m112236a((Object) b, "it");
            FeedbackConf feedbackConf = b.getFeedbackConf();
            if (feedbackConf != null) {
                str = feedbackConf.getNormalEntry();
            } else {
                str = null;
            }
            a.mo83861a(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final String mo23608a(int i, String str, List<Pair<String, String>> list) {
        Iterable<Pair> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (Pair pair : iterable) {
            arrayList.add(new C19180e((String) pair.first, (String) pair.second));
        }
        String executePost = NetworkUtils.executePost(20480, str, (List) arrayList);
        C52711k.m112236a((Object) executePost, "NetworkUtils.executePost(maxLength, url, params)");
        return executePost;
    }

    /* renamed from: a */
    public final void mo23611a(Activity activity, String[] strArr, C12562h hVar) {
        C12563i.m25225g().mo23611a(activity, strArr, (C12562h) new C47477d(hVar));
    }

    /* renamed from: a */
    public final void mo23612a(Context context, String str, Drawable drawable) {
        C10691a.m21545b(context, str).mo19066a();
    }

    /* renamed from: a */
    public final String mo23609a(int i, String str, byte[] bArr, String str2) {
        String executePost = NetworkUtils.executePost(20480, str, bArr, C18908e.GZIP, str2);
        C52711k.m112236a((Object) executePost, "NetworkUtils.executePost…pe.GZIP, contentTypeJson)");
        return executePost;
    }

    /* renamed from: a */
    public final void mo23610a(Activity activity, String str, String str2, String str3, JSONObject jSONObject, C12555a aVar) {
        C23291au b = C20854a.m53162b();
        C20837d dVar = new C20837d();
        if (activity == null) {
            C52711k.m112234a();
        }
        b.showLoginAndRegisterView(dVar.mo44381a(activity).mo44385a(str3).mo44386b("polaris").mo44380a());
    }
}
