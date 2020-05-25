package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import com.p683ss.android.sdk.webview.C19766m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f */
public final class C27237f implements C19766m {

    /* renamed from: a */
    public static final C27238a f71880a = new C27238a(null);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$a */
    public static final class C27238a {
        private C27238a() {
        }

        public /* synthetic */ C27238a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$b */
    static final class C27239b<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f71881a;

        /* renamed from: b */
        final /* synthetic */ C52686q f71882b;

        C27239b(JSONObject jSONObject, C52686q qVar) {
            this.f71881a = jSONObject;
            this.f71882b = qVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            try {
                HashMap hashMap = new HashMap();
                String optString = this.f71881a.optString("config_json");
                C52711k.m112236a((Object) optString, "data");
                hashMap.put("config_json", optString);
                JSONObject jSONObject = new JSONObject((String) ((JsbNetworkApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(JsbNetworkApi.class)).doPost(-1, "/aweme/v1/open/jsb/list/", new LinkedHashMap(), hashMap, null, null, true).execute().f33552b);
                if (Api.m56470a(jSONObject)) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("jsb_list");
                    if (optJSONArray != null) {
                        HashMap hashMap2 = new HashMap();
                        int length = optJSONArray.length();
                        int i = 0;
                        while (i < length) {
                            Object obj2 = optJSONArray.get(i);
                            if (obj2 != null) {
                                String str2 = (String) obj2;
                                hashMap2.put(str2, str2);
                                i++;
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                        this.f71882b.invoke(hashMap2, Boolean.valueOf(true), null);
                        return;
                    }
                }
                this.f71882b.invoke(null, Boolean.valueOf(false), jSONObject);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                this.f71882b.invoke(null, Boolean.valueOf(false), null);
            }
        }
    }

    /* renamed from: a */
    public final void mo41205a(JSONObject jSONObject, C52686q<? super HashMap<String, String>, ? super Boolean, ? super JSONObject, C52860x> qVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(qVar, "callback");
        C2201v.m6614b("").mo6529b(C2168a.m6521b()).mo6545f((C1710e<? super T>) new C27239b<Object>(jSONObject, qVar));
    }
}
