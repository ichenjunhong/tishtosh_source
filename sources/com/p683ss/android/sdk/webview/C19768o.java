package com.p683ss.android.sdk.webview;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9377c;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.download.p1160a.C19084c;
import com.p683ss.android.download.p1160a.C19084c.C19085a;
import com.p683ss.android.sdk.webview.p1209a.C19737b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.o */
public class C19768o {

    /* renamed from: e */
    private static C19768o f54448e;

    /* renamed from: a */
    final C9377c<String, C19772q> f54449a = new C9377c<>(16, 16);

    /* renamed from: b */
    final C19772q f54450b = new C19772q("", null, null);

    /* renamed from: c */
    C19084c<String, String, String, Void, C19772q> f54451c = new C19084c<>(16, 2, this.f54453f);

    /* renamed from: d */
    List<C19770a> f54452d;

    /* renamed from: f */
    private C19085a<String, String, String, Void, C19772q> f54453f = new C19085a<String, String, String, Void, C19772q>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo38831a(Object obj, Object obj2, Object obj3) {
            return C19768o.this.mo41211a((String) obj, (String) obj2, (String) obj3);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo38832a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            Void voidR = (Void) obj4;
            C19772q qVar = (C19772q) obj5;
            C19768o oVar = C19768o.this;
            if (str != null) {
                if (qVar != null) {
                    qVar.f54458d = System.currentTimeMillis();
                    oVar.f54449a.put(str, qVar);
                }
                if (oVar.f54452d != null && !oVar.f54452d.isEmpty()) {
                    for (int i = 0; i < oVar.f54452d.size(); i++) {
                        C19770a aVar = (C19770a) oVar.f54452d.get(i);
                        if (aVar != null) {
                            aVar.mo41153a(str, qVar, str2);
                        }
                    }
                }
            }
        }
    };

    /* renamed from: com.ss.android.sdk.webview.o$a */
    public interface C19770a {
        /* renamed from: a */
        void mo41153a(String str, C19772q qVar, String str2);
    }

    /* renamed from: a */
    public static C19768o m48296a() {
        if (f54448e == null) {
            synchronized (C19768o.class) {
                if (f54448e == null) {
                    f54448e = new C19768o();
                }
            }
        }
        return f54448e;
    }

    private C19768o() {
    }

    /* renamed from: a */
    private static void m48297a(JSONArray jSONArray, List<String> list) {
        if (jSONArray != null && list != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C19772q mo41211a(String str, String str2, String str3) {
        C19772q qVar = null;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            C18922i iVar = new C18922i(C19737b.m48249a().getJSSDKConfigUrl());
            iVar.mo38778a("client_id", str3);
            iVar.mo38778a("partner_domain", str2);
            String executeGet = NetworkUtils.executeGet(-1, iVar.mo38774a());
            if (TextUtils.isEmpty(executeGet)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(executeGet);
            if (!C19737b.m48249a().isApiSuccess(jSONObject)) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                C19772q qVar2 = new C19772q(str, str2, str3);
                try {
                    m48297a(optJSONObject.optJSONArray("call"), qVar2.f54459e);
                    m48297a(optJSONObject.optJSONArray("info"), qVar2.f54460f);
                    m48297a(optJSONObject.optJSONArray("event"), qVar2.f54461g);
                } catch (Exception unused) {
                }
                qVar = qVar2;
            }
            return qVar;
        } catch (Exception unused2) {
        }
    }
}
