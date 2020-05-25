package com.p683ss.android.ugc.aweme.account.network;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.google.gson.C17971f;
import com.p683ss.android.C18962e;
import com.p683ss.android.C18963f;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount */
public final class NetworkProxyAccount implements C22077a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59577a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NetworkProxyAccount.class), "RETROFIT_API", "getRETROFIT_API()Lcom/ss/android/ugc/aweme/account/network/IAccountNetworkApi;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(NetworkProxyAccount.class), "paramProvider", "getParamProvider()Lcom/ss/android/ugc/aweme/account/network/IParamProvider;"))};

    /* renamed from: b */
    static final String f59578b;

    /* renamed from: c */
    public static final NetworkProxyAccount f59579c = new NetworkProxyAccount();

    /* renamed from: d */
    private static final boolean f59580d = false;

    /* renamed from: e */
    private static final C52668f f59581e = C52732g.m112285a(C22071a.f59583a);

    /* renamed from: f */
    private static final C52668f f59582f = C52732g.m112285a(C22076d.f59589a);

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$a */
    static final class C22071a extends C52712l implements C52670a<IAccountNetworkApi> {

        /* renamed from: a */
        public static final C22071a f59583a = new C22071a();

        C22071a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IRetrofitService iRetrofitService = (IRetrofitService) C20842a.m53148a(IRetrofitService.class);
            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f59579c;
            return (IAccountNetworkApi) iRetrofitService.createNewRetrofit(NetworkProxyAccount.f59578b).create(IAccountNetworkApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$b */
    static final class C22072b<T, R> implements C1711f<String, C53694b<String>> {

        /* renamed from: a */
        public static final C22072b f59584a = new C22072b();

        C22072b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C52711k.m112240b(str, "url");
            return new C53694b<String>() {
                /* renamed from: a */
                public final void mo336a(C53695c<? super String> cVar) {
                    try {
                        NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f59579c;
                        String str = str;
                        C52711k.m112236a((Object) str, "url");
                        cVar.onNext(networkProxyAccount.mo46187a(Integer.MAX_VALUE, str));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$c */
    public static final class C22074c<T, R> implements C1711f<String, C53694b<String>> {

        /* renamed from: a */
        final /* synthetic */ Map f59586a;

        public C22074c(Map map) {
            this.f59586a = map;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C52711k.m112240b(str, "url");
            return new C53694b<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C22074c f59587a;

                {
                    this.f59587a = r1;
                }

                /* renamed from: a */
                public final void mo336a(C53695c<? super String> cVar) {
                    try {
                        NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f59579c;
                        String str = str;
                        C52711k.m112236a((Object) str, "url");
                        cVar.onNext(networkProxyAccount.mo46188a(Integer.MAX_VALUE, str, this.f59587a.f59586a));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$d */
    static final class C22076d extends C52712l implements C52670a<C22084e> {

        /* renamed from: a */
        public static final C22076d f59589a = new C22076d();

        C22076d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C22084e();
        }
    }

    private NetworkProxyAccount() {
    }

    /* renamed from: b */
    private final IAccountNetworkApi m54827b() {
        return (IAccountNetworkApi) f59581e.getValue();
    }

    /* renamed from: c */
    private final C22081b m54829c() {
        return (C22081b) f59582f.getValue();
    }

    /* renamed from: a */
    public final String mo46187a(int i, String str) throws Exception {
        C52711k.m112240b(str, "url");
        String str2 = mo46184a(Integer.MAX_VALUE, str, (List<C18962e>) new ArrayList<C18962e>()).f52260d;
        C52711k.m112236a((Object) str2, "executeGet(maxLength, url, arrayListOf()).body");
        return str2;
    }

    /* renamed from: a */
    public final String mo46188a(int i, String str, Map<String, String> map) throws Exception {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "postParams");
        String str2 = mo46185a(Integer.MAX_VALUE, str, map, new ArrayList()).f52260d;
        C52711k.m112236a((Object) str2, "executePost(maxLength, u…rams, arrayListOf()).body");
        return str2;
    }

    /* renamed from: a */
    public final C17971f mo46183a() {
        return C20842a.m53147a().mo47686a();
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        f59578b = sb.toString();
    }

    /* renamed from: a */
    private static int m54824a(String str) {
        try {
            return new JSONObject(str).getJSONObject("data").optInt("error_code");
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static List<C12685b> m54826a(List<C18962e> list) {
        Iterable<C18962e> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C18962e eVar : iterable) {
            arrayList.add(new C12685b(eVar.f52255a, eVar.f52256b));
        }
        return C52575l.m112139e((Collection<? extends T>) (List) arrayList);
    }

    /* renamed from: b */
    public final String mo46189b(int i, String str) throws Exception {
        C52711k.m112240b(str, "url");
        try {
            String str2 = sendGetRequest(str, Integer.MAX_VALUE, null).f52260d;
            C52711k.m112236a((Object) str2, "response.body");
            return str2;
        } catch (C23459a e) {
            String response = e.getResponse();
            C52711k.m112236a((Object) response, "e.response");
            return response;
        }
    }

    /* renamed from: a */
    private final C0777a<String, String> m54825a(String str, String str2) {
        C0777a<String, String> aVar = new C0777a<>();
        if (C22082c.m54857a(str)) {
            aVar.putAll(C22082c.m54856a(m54824a(str2), str, str2));
        }
        return aVar;
    }

    /* renamed from: b */
    private static String m54828b(String str, Map<String, String> map) {
        boolean z;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        for (Entry entry : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri build = clearQuery.build();
        C52711k.m112236a((Object) parse, "requestUri");
        for (String str2 : parse.getQueryParameterNames()) {
            if (TextUtils.isEmpty(build.getQueryParameter(str2))) {
                clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        String uri = clearQuery.build().toString();
        C52711k.m112236a((Object) uri, "newUriBuilder.build().toString()");
        return uri;
    }

    /* renamed from: a */
    public final C2149h<String> mo46182a(String str, Map<String, String> map) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        sb.append(str);
        C2149h<String> b = C2149h.m6451a(C22085f.m54859a(new C18922i(sb.toString()), map)).mo6446a((C1711f<? super T, ? extends C53694b<? extends R>>) C22072b.f59584a).mo6452b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Flowable.just(UrlBuilder…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: b */
    public final String mo46190b(int i, String str, Map<String, String> map) throws Exception {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "postParams");
        try {
            String str2 = sendPostRequest(str, map, Integer.MAX_VALUE, null).f52260d;
            C52711k.m112236a((Object) str2, "sendPostRequest(url, postParams, maxLength).body");
            return str2;
        } catch (C23459a e) {
            String response = e.getResponse();
            C52711k.m112236a((Object) response, "e.response");
            return response;
        }
    }

    private final C18963f sendGetRequest(@C12699af String str, @C12713o int i, @C12710l List<C18962e> list) {
        List list2;
        List list3;
        Object obj;
        if (f59580d) {
            StringBuilder sb = new StringBuilder("sendGetRequest, url: ");
            sb.append(str);
            sb.append(", maxLength: ");
            sb.append(i);
            sb.append(", header size: ");
            if (list != null) {
                obj = Integer.valueOf(list.size());
            } else {
                obj = null;
            }
            sb.append(obj);
        }
        m54828b(str, m54829c().mo46191a());
        boolean z = true;
        if (list == null || !(!list.isEmpty())) {
            list2 = new ArrayList();
        } else {
            list2 = m54826a(list);
        }
        C12799u execute = m54827b().getResponse(str, i, list2).execute();
        List b = execute.mo23959b();
        if (b == null || b.size() <= 0) {
            z = false;
        }
        if (!z) {
            b = null;
        }
        if (b != null) {
            List b2 = C52575l.m112128b((Iterable<? extends T>) b);
            if (b2 != null) {
                Iterable<C12685b> iterable = b2;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C12685b bVar : iterable) {
                    arrayList.add(new C18962e(bVar.f33318a, bVar.f33319b));
                }
                list3 = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                C12688d dVar = execute.f33551a;
                C52711k.m112236a((Object) dVar, "response.raw()");
                String str2 = dVar.f33346a;
                C12688d dVar2 = execute.f33551a;
                C52711k.m112236a((Object) dVar2, "response.raw()");
                return new C18963f(str2, dVar2.f33347b, list3, (String) execute.f33552b);
            }
        }
        list3 = C52575l.m112097a();
        C12688d dVar3 = execute.f33551a;
        C52711k.m112236a((Object) dVar3, "response.raw()");
        String str22 = dVar3.f33346a;
        C12688d dVar22 = execute.f33551a;
        C52711k.m112236a((Object) dVar22, "response.raw()");
        return new C18963f(str22, dVar22.f33347b, list3, (String) execute.f33552b);
    }

    /* renamed from: a */
    public final C18963f mo46184a(int i, String str, List<C18962e> list) throws Exception {
        C52711k.m112240b(str, "url");
        try {
            C18963f sendGetRequest = sendGetRequest(str, i, list);
            String str2 = sendGetRequest.f52260d;
            C52711k.m112236a((Object) str2, "response.body");
            C0777a a = m54825a(str, str2);
            if (!a.isEmpty()) {
                return mo46184a(i, m54828b(str, (Map<String, String>) a), list);
            }
            return sendGetRequest;
        } catch (C23459a e) {
            return new C18963f(str, -1, list, e.getResponse());
        }
    }

    private final C18963f sendPostRequest(@C12699af String str, @C12704f Map<String, String> map, @C12713o int i, @C12710l List<C18962e> list) {
        List list2;
        List list3;
        Object obj;
        if (f59580d) {
            StringBuilder sb = new StringBuilder("sendPostRequest, url: ");
            sb.append(str);
            sb.append(", map size: ");
            sb.append(map.size());
            sb.append(" maxLength: ");
            sb.append(i);
            sb.append(", header: ");
            if (list != null) {
                obj = Integer.valueOf(list.size());
            } else {
                obj = null;
            }
            sb.append(obj);
        }
        Map a = m54829c().mo46191a();
        a.putAll(map);
        boolean z = true;
        if (list == null || !(!list.isEmpty())) {
            list2 = new ArrayList();
        } else {
            list2 = m54826a(list);
        }
        C12799u execute = m54827b().getResponse(str, a, i, list2).execute();
        List b = execute.mo23959b();
        if (b == null || b.size() <= 0) {
            z = false;
        }
        if (!z) {
            b = null;
        }
        if (b != null) {
            List b2 = C52575l.m112128b((Iterable<? extends T>) b);
            if (b2 != null) {
                Iterable<C12685b> iterable = b2;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C12685b bVar : iterable) {
                    arrayList.add(new C18962e(bVar.f33318a, bVar.f33319b));
                }
                list3 = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                C12688d dVar = execute.f33551a;
                C52711k.m112236a((Object) dVar, "response.raw()");
                String str2 = dVar.f33346a;
                C12688d dVar2 = execute.f33551a;
                C52711k.m112236a((Object) dVar2, "response.raw()");
                return new C18963f(str2, dVar2.f33347b, list3, (String) execute.f33552b);
            }
        }
        list3 = C52575l.m112097a();
        C12688d dVar3 = execute.f33551a;
        C52711k.m112236a((Object) dVar3, "response.raw()");
        String str22 = dVar3.f33346a;
        C12688d dVar22 = execute.f33551a;
        C52711k.m112236a((Object) dVar22, "response.raw()");
        return new C18963f(str22, dVar22.f33347b, list3, (String) execute.f33552b);
    }

    /* renamed from: a */
    public final C18963f mo46185a(int i, String str, Map<String, String> map, List<C18962e> list) throws Exception {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "postParams");
        C52711k.m112240b(list, "headerList");
        try {
            C18963f sendPostRequest = sendPostRequest(str, map, i, list);
            String str2 = sendPostRequest.f52260d;
            C52711k.m112236a((Object) str2, "response.body");
            C0777a a = m54825a(str, str2);
            if (a.isEmpty()) {
                return sendPostRequest;
            }
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(a);
            return mo46185a(i, str, hashMap, list);
        } catch (C23459a e) {
            return new C18963f(str, -1, list, e.getResponse());
        }
    }

    /* renamed from: a */
    public final <T> T mo46186a(String str, int i, String str2, Class<T> cls, String str3, List<? extends C19180e> list) throws Exception {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(cls, "cls");
        C52711k.m112240b(str3, "key");
        return C20842a.m53147a().mo47687a(str, i, str2, cls, str3, list);
    }
}
