package com.p683ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.location.Address;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.ttnet.C13295c;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.MultiProcessSharedProvider;
import com.p683ss.android.common.util.MultiProcessSharedProvider.C18901a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.net.p1989b.C37748a;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.IESNetDepend */
public class IESNetDepend implements C13295c {

    /* renamed from: a */
    public static StringBuilder f96207a = new StringBuilder("0");

    /* renamed from: b */
    private static volatile IESNetDepend f96208b;

    /* renamed from: c */
    private static Map<String, String> f96209c;

    /* renamed from: d */
    private volatile IESNetDependApi f96210d;

    /* renamed from: com.ss.android.ugc.aweme.net.corenet.IESNetDepend$IESNetDependApi */
    interface IESNetDependApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);
    }

    /* renamed from: c */
    public final String mo24905c() {
        return ".tiktokv.com";
    }

    /* renamed from: d */
    public final String mo24906d() {
        return "ib";
    }

    /* renamed from: e */
    public final Map<String, String> mo24907e() {
        return f96209c;
    }

    /* renamed from: f */
    public final String mo24908f() {
        return "";
    }

    /* renamed from: b */
    public final String[] mo24904b() {
        if (C37748a.f96188a == null) {
            C37748a.f96188a = C37748a.f96191d;
        }
        return C37748a.f96188a;
    }

    /* renamed from: g */
    public static IESNetDepend m84280g() {
        if (f96208b == null) {
            synchronized (IESNetDepend.class) {
                if (f96208b == null) {
                    f96208b = new IESNetDepend();
                }
            }
        }
        return f96208b;
    }

    /* renamed from: a */
    public final Context mo24896a() {
        return C11010c.m22280a();
    }

    static {
        HashMap hashMap = new HashMap();
        f96209c = hashMap;
        hashMap.put("ib.snssdk.com", "ib");
        f96209c.put("security.snssdk.com", "si");
        f96209c.put("isub.snssdk.com", "isub");
        f96209c.put("ichannel.snssdk.com", "ichannel");
        f96209c.put("log.snssdk.com", "log");
        f96209c.put("mon.snssdk.com", "mon");
    }

    /* renamed from: a */
    public final Address mo24897a(Context context) {
        C39054d a = C36272l.m81897a(context).mo75072a();
        if (a == null) {
            return null;
        }
        Address address = new Address(C47789cu.m103419b());
        address.setLatitude(a.latitude);
        address.setLongitude(a.longitude);
        address.setLocality(a.city);
        return address;
    }

    /* renamed from: a */
    public final void mo24903a(String str, JSONObject jSONObject) {
        C23131p.m57779a(str, jSONObject);
    }

    /* renamed from: a */
    public final int mo24895a(Throwable th, String[] strArr) {
        return NetUtil.checkHttpRequestException(th, null);
    }

    /* renamed from: a */
    public final String mo24898a(int i, String str) throws Exception {
        try {
            if (this.f96210d == null) {
                this.f96210d = (IESNetDependApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(IESNetDependApi.class);
            }
            return (String) this.f96210d.doGet(str).get();
        } catch (ExecutionException e) {
            throw ((Exception) e.getCause());
        }
    }

    /* renamed from: a */
    public final void mo24901a(Context context, Map<String, ?> map) {
        try {
            C18901a a = MultiProcessSharedProvider.m46016a(context);
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        a.mo38754a((String) entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a.mo38755a((String) entry.getKey(), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        a.mo38753a((String) entry.getKey(), ((Float) value).floatValue());
                    } else if (value instanceof Boolean) {
                        a.mo38757a((String) entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        a.mo38756a((String) entry.getKey(), (String) value);
                    }
                }
                a.mo38758a();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24902a(Context context, JSONObject jSONObject) {
        try {
            f96207a.append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final int mo24894a(Context context, String str, int i) {
        return MultiProcessSharedProvider.m46020b(context).mo38759a(str, i);
    }

    /* renamed from: a */
    public final String mo24899a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.m46020b(context).mo38760a(str, str2);
    }

    /* renamed from: a */
    public final void mo24900a(Context context, String str, String str2, JSONObject jSONObject) {
        if (context != null) {
            if (jSONObject == null) {
                C26883g.m64991a(context, str, str2);
            } else {
                C26883g.m64994a(context, "umeng", str, str2, 0, 0, jSONObject);
            }
        }
    }
}
