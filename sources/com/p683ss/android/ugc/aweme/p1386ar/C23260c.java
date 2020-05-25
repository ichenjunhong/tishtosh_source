package com.p683ss.android.ugc.aweme.p1386ar;

import android.net.Uri;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import java.util.Map.Entry;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ar.c */
public final class C23260c {

    /* renamed from: a */
    public static final C23260c f62201a = new C23260c();

    private C23260c() {
    }

    /* renamed from: a */
    public static void m57203a(String str, C9831a<?> aVar, C23259b bVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(aVar, "info");
        C52711k.m112240b(bVar, "apiRetrofitMetrics");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wait_duration", aVar.f26754d - aVar.f26753c);
            jSONObject.put("interceptors_pre_duration", aVar.f26755e - aVar.f26754d);
            jSONObject.put("request_duration", aVar.f26756f - aVar.f26755e);
            jSONObject.put("read_response_duration", aVar.f26758h - aVar.f26756f);
            jSONObject.put("parse_response_duration", bVar.f62197I);
            jSONObject.put("interceptors_after_duration", bVar.f62199K);
            jSONObject.put("api_duration", bVar.f62198J - bVar.f33470c);
            if (aVar.f26772v == 0) {
                if (aVar.f26760j > 0) {
                    jSONObject.put("timing_dns", aVar.f26760j);
                }
                if (aVar.f26761k > 0) {
                    jSONObject.put("timing_connect", aVar.f26761k);
                }
                if (aVar.f26762l > 0) {
                    jSONObject.put("timing_ssl", aVar.f26762l);
                }
                if (aVar.f26763m > 0) {
                    jSONObject.put("timing_send", aVar.f26763m);
                }
                if (aVar.f26767q > 0) {
                    jSONObject.put("timing_waiting", aVar.f26767q);
                }
                if (aVar.f26765o > 0) {
                    jSONObject.put("timing_receive", aVar.f26765o);
                }
                if (aVar.f26768r > 0) {
                    jSONObject.put("timing_total", aVar.f26768r);
                }
            }
            Uri parse = Uri.parse(str);
            JSONObject jSONObject2 = new JSONObject();
            String str2 = LeakCanaryFileProvider.f132050j;
            C52711k.m112236a((Object) parse, "uri");
            jSONObject2.put(str2, parse.getPath());
            jSONObject2.put("host", parse.getHost());
            if (bVar.f62191C != null) {
                for (Entry entry : bVar.f62191C.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) entry.getKey());
                    sb.append("_duration");
                    String sb2 = sb.toString();
                    Object value = entry.getValue();
                    C52711k.m112236a(value, "entry.value");
                    jSONObject.put(sb2, ((Number) value).longValue());
                }
            }
            C9951d.m19999a("api_time_log", null, jSONObject, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
