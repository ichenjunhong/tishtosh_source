package com.p683ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1911j.C35708a;
import com.p683ss.android.ugc.aweme.player.p2050a.C38828b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.api.m */
public final class C30155m {

    /* renamed from: a */
    public static final ConcurrentHashMap<Long, C30154l> f78706a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C30155m f78707b = new C30155m();

    private C30155m() {
    }

    /* renamed from: a */
    public static void m70762a(Exception exc, JSONObject jSONObject) {
        C52711k.m112240b(exc, "exception");
        C52711k.m112240b(jSONObject, "netInfo");
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = "";
            int a = C52830p.m112419a((CharSequence) message, "https://", 0, false, 6, (Object) null);
            if (a > 0) {
                int i = a + 8;
                int a2 = C52830p.m112419a((CharSequence) message, "/", i, false, 4, (Object) null);
                if (a2 > 0 && a2 - a < 30) {
                    if (message != null) {
                        str = message.substring(i, a2);
                        C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else {
                int a3 = C52830p.m112419a((CharSequence) message, "http://", 0, false, 6, (Object) null);
                if (a3 > 0) {
                    int i2 = a3 + 7;
                    int a4 = C52830p.m112419a((CharSequence) message, "/", i2, false, 4, (Object) null);
                    if (a4 > 0 && a4 - a3 < 30) {
                        if (message != null) {
                            str = message.substring(i2, a4);
                            C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            }
            jSONObject.put("host", str);
            if (exc instanceof C9872a) {
                JSONObject jSONObject2 = new JSONObject(((C9872a) exc).getRequestLog());
                jSONObject.put("flag", 3);
                int optInt = jSONObject2.optJSONObject("base").optInt("net_error");
                String str2 = "status_code";
                if (optInt >= 0) {
                    optInt = jSONObject2.optJSONObject("response").optInt("code");
                }
                jSONObject.put(str2, optInt);
                jSONObject.put("load_state", jSONObject2.optJSONObject("base").optInt("load_state"));
                jSONObject.put("redirect_times", jSONObject2.optJSONObject("base").optInt("redirect_times"));
                int optInt2 = jSONObject.optInt("redirect_times", 0);
                if (optInt2 > 0) {
                    String optString = jSONObject2.optJSONObject("base").optJSONArray("redirecting_list").optString(optInt2 - 1);
                    if (!TextUtils.isEmpty(optString)) {
                        C52711k.m112236a((Object) optString, "newHost");
                        jSONObject.put("host", new C52820l("https?://").replace((CharSequence) optString, ""));
                    }
                }
                jSONObject.put("conn_info", jSONObject2.optJSONObject("response").optInt("connection_info"));
                jSONObject.put("rip", jSONObject2.optJSONObject("socket").optString("remote"));
                jSONObject.put(C38828b.f98806x, jSONObject2.optJSONObject("socket").getBoolean("socket_reused"));
                jSONObject.put("handshake", jSONObject2.optJSONObject("ssl").optInt("handshake_type"));
                jSONObject.put("conn_status", jSONObject2.optJSONObject("ssl").optInt("connection_status"));
                jSONObject.put("conn_info", jSONObject2.optJSONObject("response").optInt("connection_info"));
                jSONObject.put(C38828b.f98805w, jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt(C38828b.f98805w));
                jSONObject.put("dns", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("dns"));
                jSONObject.put("inner", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("inner"));
                jSONObject.put("origin", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("origin"));
                jSONObject.put("proxy", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("proxy"));
                jSONObject.put("tcp", jSONObject2.optJSONObject("timing").optJSONObject("detailed_duration").optInt("tcp"));
                jSONObject.put("dur", jSONObject2.optJSONObject("timing").optJSONObject("request").optInt("duration"));
                return;
            }
            jSONObject.put("flag", 4);
            jSONObject.put("exception_type", simpleName);
            if (exc instanceof IllegalStateException) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("error_stack", Log.getStackTraceString(exc));
                jSONObject3.put("errorType", "feed_parse_protobuf_error");
                C35708a.m80693a(jSONObject3);
            }
            if (TextUtils.isEmpty(message) || message.length() <= 100) {
                jSONObject.put("err_msg", message);
                return;
            }
            String str3 = "err_msg";
            if (message != null) {
                String substring = message.substring(0, 100);
                C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                jSONObject.put(str3, substring);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }
}
