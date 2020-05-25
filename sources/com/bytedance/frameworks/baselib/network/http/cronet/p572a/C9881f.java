package com.bytedance.frameworks.baselib.network.http.cronet.p572a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f */
public final class C9881f {

    /* renamed from: a */
    public int f26890a;

    /* renamed from: b */
    public long f26891b;

    /* renamed from: c */
    public int f26892c;

    /* renamed from: d */
    public int f26893d;

    /* renamed from: e */
    public int f26894e;

    /* renamed from: f */
    public String f26895f;

    /* renamed from: g */
    public List<C9884c> f26896g = new ArrayList();

    /* renamed from: h */
    public String f26897h;

    /* renamed from: i */
    public String f26898i;

    /* renamed from: j */
    public String f26899j;

    /* renamed from: k */
    public int f26900k;

    /* renamed from: l */
    public String f26901l;

    /* renamed from: m */
    public int f26902m;

    /* renamed from: n */
    public String f26903n;

    /* renamed from: o */
    public int f26904o;

    /* renamed from: p */
    public int f26905p;

    /* renamed from: q */
    public String f26906q;

    /* renamed from: r */
    public String f26907r;

    /* renamed from: s */
    public String f26908s;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$a */
    public static class C9882a extends C9884c {

        /* renamed from: a */
        public String f26909a;

        /* renamed from: b */
        public int f26910b;

        /* renamed from: c */
        public int f26911c;

        /* renamed from: d */
        public List<String> f26912d = new ArrayList();

        /* renamed from: a */
        public static C9882a m19789a(JSONObject jSONObject) {
            try {
                C9882a aVar = new C9882a();
                aVar.f26909a = jSONObject.getString("host");
                aVar.f26910b = jSONObject.getInt("error");
                aVar.f26911c = jSONObject.getInt("cost");
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof String)) {
                            String str = (String) optJSONArray.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                aVar.f26912d.add(str);
                            }
                        }
                    }
                }
                return aVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$b */
    public static class C9883b extends C9884c {

        /* renamed from: a */
        public String f26913a;

        /* renamed from: b */
        public int f26914b;

        /* renamed from: c */
        public int f26915c;

        /* renamed from: d */
        public int f26916d;

        /* renamed from: e */
        public String f26917e;

        /* renamed from: f */
        public int f26918f;

        /* renamed from: g */
        public int f26919g;

        /* renamed from: h */
        public int f26920h;

        /* renamed from: i */
        public int f26921i;

        /* renamed from: j */
        public int f26922j;

        /* renamed from: k */
        public int f26923k;

        /* renamed from: l */
        public int f26924l;

        /* renamed from: m */
        public int f26925m;

        /* renamed from: n */
        public int f26926n;

        /* renamed from: o */
        public int f26927o;

        /* renamed from: p */
        public int f26928p;

        /* renamed from: a */
        public static C9883b m19790a(JSONObject jSONObject) {
            try {
                C9883b bVar = new C9883b();
                bVar.f26913a = jSONObject.getString("url");
                bVar.f26914b = jSONObject.getInt("httpcode");
                bVar.f26915c = jSONObject.getInt("error");
                bVar.f26916d = jSONObject.getInt("timeout");
                bVar.f26917e = jSONObject.getString("addr");
                bVar.f26918f = jSONObject.getInt("port");
                bVar.f26919g = jSONObject.getInt("cached");
                bVar.f26920h = jSONObject.getInt("sock_reused");
                bVar.f26921i = jSONObject.getInt("totalcost");
                bVar.f26922j = jSONObject.getInt("dnscost");
                bVar.f26923k = jSONObject.getInt("tcpcost");
                bVar.f26924l = jSONObject.getInt("sslcost");
                bVar.f26925m = jSONObject.getInt("sendcost");
                bVar.f26926n = jSONObject.getInt("waitcost");
                bVar.f26927o = jSONObject.getInt("recvcost");
                bVar.f26928p = jSONObject.getInt("recvd_bytes");
                return bVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$c */
    public static class C9884c {
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$d */
    public static class C9885d extends C9884c {

        /* renamed from: a */
        public String f26929a;

        /* renamed from: b */
        public int f26930b;

        /* renamed from: c */
        public int f26931c;

        /* renamed from: d */
        public List<String> f26932d = new ArrayList();

        /* renamed from: a */
        public static C9885d m19791a(JSONObject jSONObject) {
            try {
                C9885d dVar = new C9885d();
                dVar.f26929a = jSONObject.getString("host");
                dVar.f26930b = jSONObject.getInt("error");
                dVar.f26931c = jSONObject.getInt("cost");
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof String)) {
                            String str = (String) optJSONArray.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                dVar.f26932d.add(str);
                            }
                        }
                    }
                }
                return dVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$e */
    public static class C9886e extends C9884c {

        /* renamed from: a */
        public String f26933a;

        /* renamed from: b */
        public String f26934b;

        /* renamed from: c */
        public int f26935c;

        /* renamed from: d */
        public int f26936d;

        /* renamed from: e */
        public int f26937e;

        /* renamed from: f */
        public int f26938f;

        /* renamed from: a */
        public static C9886e m19792a(JSONObject jSONObject) {
            try {
                C9886e eVar = new C9886e();
                eVar.f26933a = jSONObject.getString("host");
                eVar.f26934b = jSONObject.getString("ip");
                eVar.f26935c = jSONObject.getInt("error");
                eVar.f26936d = jSONObject.getInt("ping_times");
                eVar.f26937e = jSONObject.getInt("succ_times");
                eVar.f26938f = jSONObject.getInt("avg_cost");
                return eVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$f */
    public static class C9887f extends C9884c {

        /* renamed from: a */
        public String f26939a;

        /* renamed from: b */
        public String f26940b;

        /* renamed from: c */
        public int f26941c;

        /* renamed from: d */
        public int f26942d;

        /* renamed from: e */
        public List<C9888g> f26943e = new ArrayList();

        /* renamed from: a */
        public static C9887f m19793a(JSONObject jSONObject) {
            try {
                C9887f fVar = new C9887f();
                fVar.f26939a = jSONObject.getString("host");
                fVar.f26940b = jSONObject.getString("ip");
                fVar.f26941c = jSONObject.getInt("error");
                fVar.f26942d = jSONObject.getInt("hops");
                JSONArray optJSONArray = jSONObject.optJSONArray(C22858c.f61208d);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        C9888g a = C9888g.m19794a((JSONObject) optJSONArray.get(i));
                        if (a != null) {
                            fVar.f26943e.add(a);
                        }
                    }
                }
                return fVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.f$g */
    public static class C9888g {

        /* renamed from: a */
        public int f26944a;

        /* renamed from: b */
        public int f26945b;

        /* renamed from: c */
        public String f26946c;

        /* renamed from: d */
        public int f26947d;

        /* renamed from: a */
        public static C9888g m19794a(JSONObject jSONObject) {
            try {
                C9888g gVar = new C9888g();
                gVar.f26946c = jSONObject.getString("ip");
                gVar.f26944a = jSONObject.getInt("sendhops");
                gVar.f26945b = jSONObject.getInt("replyhops");
                gVar.f26947d = jSONObject.getInt("cost");
                return gVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
