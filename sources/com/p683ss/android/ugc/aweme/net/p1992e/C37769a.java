package com.p683ss.android.ugc.aweme.net.p1992e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.p566a.C9806a;
import com.bytedance.frameworks.baselib.network.p566a.C9812c;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.p883a.C13258a;
import com.bytedance.ttnet.p885c.C13297b;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.net.p1990c.C37750a;
import com.toutiao.proxyserver.net.C51878f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.e.a */
public final class C37769a extends C37750a {
    public C37769a(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m84359a(JSONObject jSONObject) {
        String optString = jSONObject.optString("url", "");
        if (!TextUtils.isEmpty(optString) && !optString.endsWith("jpeg")) {
            if (optString.contains("/aweme/v") || optString.contains("/tfe/api/") || optString.contains("/user/info/") || optString.contains("/passport/") || optString.contains("/ies/speed/")) {
                C23569o.m57779a("api_libra", jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo77245a(C13297b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            if (jSONObject != null) {
                try {
                    jSONObject.put("nt_band_width", C9812c.m19639b().mo17652c());
                    jSONObject.put("cdn_nt_band_width", C9806a.m19636a().mo17652c());
                    jSONObject.put("cronet_open", C13258a.m26660a(C13303d.m26799b().mo24896a()).mo24856h());
                    C13303d.m26799b();
                    jSONObject.put("cronet_plugin_install", true);
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.put("requestStart", bVar.f26755e);
                jSONObject.put("responseBack", bVar.f26756f);
                jSONObject.put("completeReadResponse", bVar.f26757g);
                jSONObject.put("appLevelRequestStart", bVar.f26753c);
                jSONObject.put("beforeAllInterceptors", bVar.f26754d);
                jSONObject.put("requestEnd", bVar.f26758h);
                jSONObject.put("recycleCount", bVar.f26759i);
                if (bVar.f26772v == 0) {
                    jSONObject.put("timing_dns", bVar.f26760j);
                    jSONObject.put("timing_connect", bVar.f26761k);
                    jSONObject.put("timing_ssl", bVar.f26762l);
                    jSONObject.put("timing_send", bVar.f26763m);
                    jSONObject.put("timing_waiting", bVar.f26767q);
                    jSONObject.put("timing_receive", bVar.f26765o);
                    jSONObject.put("timing_total", bVar.f26768r);
                    jSONObject.put("timing_isSocketReused", bVar.f26766p);
                    jSONObject.put("timing_totalSendBytes", bVar.f26769s);
                    jSONObject.put("timing_totalReceivedBytes", bVar.f26770t);
                    jSONObject.put("timing_remoteIP", bVar.f26751a);
                    jSONObject.put("request_log", bVar.f26774x);
                }
                if (bVar.f26775y != null) {
                    jSONObject.put("req_info", bVar.f26775y);
                }
                jSONObject.put("download", bVar.f26776z);
                if (bVar instanceof C51878f) {
                    jSONObject.put("player_id", ((C51878f) bVar).f129425E);
                    jSONObject.put("video_cache_use_ttnet", ((C51878f) bVar).f129426F);
                    jSONObject.put("video_cache_retry_count", ((C51878f) bVar).f129427G);
                }
            } catch (JSONException unused2) {
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77244a(long r12, long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.bytedance.ttnet.p885c.C13297b r19, org.json.JSONObject r20) {
        /*
            r11 = this;
            r9 = r16
            r0 = r19
            if (r20 != 0) goto L_0x000d
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r10 = r1
            goto L_0x000f
        L_0x000d:
            r10 = r20
        L_0x000f:
            boolean r1 = com.bytedance.ttnet.C13281b.m26758a()     // Catch:{  }
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "CronetClient"
            r10.put(r1, r2)     // Catch:{  }
            goto L_0x0024
        L_0x001d:
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "TTOkhttp3Client"
            r10.put(r1, r2)     // Catch:{  }
        L_0x0024:
            java.lang.String r1 = "networkQuality"
            com.bytedance.frameworks.baselib.network.a.c r2 = com.bytedance.frameworks.baselib.network.p566a.C9812c.m19639b()     // Catch:{  }
            com.bytedance.frameworks.baselib.network.a.d r2 = r2.mo17652c()     // Catch:{  }
            java.lang.String r2 = r2.toString()     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "downloadSpeed"
            com.bytedance.frameworks.baselib.network.a.c r2 = com.bytedance.frameworks.baselib.network.p566a.C9812c.m19639b()     // Catch:{  }
            double r2 = r2.mo17653d()     // Catch:{  }
            int r2 = (int) r2     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "/aweme/v2/feed"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "rid"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "is_feed_compound"
            java.lang.String r2 = "1"
            r10.put(r1, r2)     // Catch:{  }
        L_0x005a:
            java.lang.String r1 = "cronet_plugin_install"
            com.ss.android.ugc.aweme.network.INetwork r2 = com.p683ss.android.ugc.aweme.net.C37797o.m84398a()     // Catch:{  }
            com.ss.android.ugc.aweme.network.a r2 = r2.getConfig()     // Catch:{  }
            com.ss.android.ugc.aweme.network.d<java.lang.Boolean> r2 = r2.f96300p     // Catch:{  }
            java.lang.Object r2 = r2.mo77272a()     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "cronet_plugin_version"
            com.ss.android.ugc.aweme.network.INetwork r2 = com.p683ss.android.ugc.aweme.net.C37797o.m84398a()     // Catch:{  }
            com.ss.android.ugc.aweme.network.a r2 = r2.getConfig()     // Catch:{  }
            com.ss.android.ugc.aweme.network.d<java.lang.Integer> r2 = r2.f96301q     // Catch:{  }
            java.lang.Object r2 = r2.mo77272a()     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = "addExecutorToAllInterceptors"
            long r2 = r0.f26754d     // Catch:{  }
            long r4 = r0.f26753c     // Catch:{  }
            r6 = 0
            long r2 = r2 - r4
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "addExecutorTime"
            long r2 = r0.f26753c     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "allInterceptorsTime"
            long r2 = r0.f26754d     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "fallback"
            int r2 = r0.f26773w     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.net.C37775g     // Catch:{ JSONException -> 0x00d5 }
            if (r1 == 0) goto L_0x00d5
            r1 = r0
            com.ss.android.ugc.aweme.net.g r1 = (com.p683ss.android.ugc.aweme.net.C37775g) r1     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r1 = r1.f96240E     // Catch:{ JSONException -> 0x00d5 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00d5 }
            if (r2 != 0) goto L_0x00d5
            java.lang.String r2 = "errorCode"
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r2 = "0"
            boolean r1 = r2.equals(r1)     // Catch:{ JSONException -> 0x00d5 }
            if (r1 != 0) goto L_0x00d5
            java.lang.String r1 = "logid"
            com.ss.android.ugc.aweme.net.g r0 = (com.p683ss.android.ugc.aweme.net.C37775g) r0     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r0 = r0.f96241F     // Catch:{ JSONException -> 0x00d5 }
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x00d5 }
            r7 = 200(0xc8, float:2.8E-43)
            r0 = r12
            r2 = r14
            r4 = r16
            r5 = r18
            r6 = r17
            r8 = r10
            com.p683ss.android.ugc.aweme.base.C23569o.m57781b(r0, r2, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x00d5 }
        L_0x00d5:
            r7 = 200(0xc8, float:2.8E-43)
            r0 = r12
            r2 = r14
            r4 = r16
            r5 = r18
            r6 = r17
            r8 = r10
            com.p683ss.android.ugc.aweme.base.C23569o.m57773a(r0, r2, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.network.INetwork r0 = com.p683ss.android.ugc.aweme.net.C37797o.m84398a()     // Catch:{ Throwable -> 0x011b }
            com.ss.android.ugc.aweme.network.a r0 = r0.getConfig()     // Catch:{ Throwable -> 0x011b }
            com.ss.android.ugc.aweme.network.d<java.lang.Integer> r0 = r0.f96299o     // Catch:{ Throwable -> 0x011b }
            java.lang.Object r0 = r0.mo77272a()     // Catch:{ Throwable -> 0x011b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Throwable -> 0x011b }
            int r0 = r0.intValue()     // Catch:{ Throwable -> 0x011b }
            if (r0 <= 0) goto L_0x011a
            java.lang.String r1 = "libra_id"
            r10.put(r1, r0)     // Catch:{ Throwable -> 0x011b }
            java.lang.String r0 = "status"
            java.lang.String r1 = "200"
            r10.put(r0, r1)     // Catch:{ Throwable -> 0x011b }
            java.lang.String r0 = "duration"
            r1 = r12
            r10.put(r0, r12)     // Catch:{ Throwable -> 0x011b }
            java.lang.String r0 = "url"
            r10.put(r0, r9)     // Catch:{ Throwable -> 0x011b }
            java.lang.String r0 = "trace_code"
            r1 = r17
            r10.put(r0, r1)     // Catch:{ Throwable -> 0x011b }
            m84359a(r10)     // Catch:{ Throwable -> 0x011b }
        L_0x011a:
            return
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.net.p1992e.C37769a.mo77244a(long, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.c.b, org.json.JSONObject):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0478 A[Catch:{ Throwable -> 0x0498 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77243a(long r13, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.bytedance.ttnet.p885c.C13297b r20, java.lang.Throwable r21, org.json.JSONObject r22) {
        /*
            r12 = this;
            r9 = r17
            r0 = r20
            r1 = r21
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r19
            int r10 = com.bytedance.ies.p621b.p622a.C10201a.m20661a(r1, r2)
            r2 = -1
            if (r1 != 0) goto L_0x0016
        L_0x0013:
            r3 = -1
            goto L_0x0381
        L_0x0016:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r4 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x030e
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Bad Request"
            r6 = 101(0x65, float:1.42E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Connection timed out"
            r6 = 102(0x66, float:1.43E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Forbidden"
            r6 = 103(0x67, float:1.44E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Gateway Time-out"
            r6 = 104(0x68, float:1.46E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Internal Server Error"
            r6 = 105(0x69, float:1.47E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Not Found"
            r6 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Request Time-out"
            r6 = 107(0x6b, float:1.5E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Request-URI Too Large"
            r6 = 108(0x6c, float:1.51E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.a.c> r6 = com.bytedance.frameworks.baselib.network.http.p568a.C9836c.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "Content-Type: text/html"
            r6 = 201(0xc9, float:2.82E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "http/1.0 do not support range request"
            r6 = 202(0xca, float:2.83E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "response code: 403 Error extra"
            r6 = 203(0xcb, float:2.84E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "response code: 504 Error extra"
            r6 = 204(0xcc, float:2.86E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.String r6 = "RequestException"
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "ERR_ABORTED"
            r6 = 301(0x12d, float:4.22E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_ADDRESS_UNREACHABLE"
            r6 = 302(0x12e, float:4.23E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CERT_AUTHORITY_INVALID"
            r6 = 303(0x12f, float:4.25E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CERT_COMMON_NAME_INVALID"
            r6 = 304(0x130, float:4.26E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CERT_DATE_INVALID"
            r6 = 305(0x131, float:4.27E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CONNECTION_ABORTED"
            r6 = 306(0x132, float:4.29E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CONNECTION_CLOSED"
            r6 = 307(0x133, float:4.3E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CONNECTION_REFUSED"
            r6 = 308(0x134, float:4.32E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CONNECTION_RESET"
            r6 = 309(0x135, float:4.33E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_CONNECTION_TIMED_OUT"
            r6 = 310(0x136, float:4.34E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_EMPTY_RESPONSE"
            r6 = 311(0x137, float:4.36E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_HTTP2_PING_FAILED"
            r6 = 312(0x138, float:4.37E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_INCOMPLETE_CHUNKED_ENCODING"
            r6 = 313(0x139, float:4.39E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_INTERNET_DISCONNECTED"
            r6 = 314(0x13a, float:4.4E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_NAME_NOT_RESOLVED"
            r6 = 315(0x13b, float:4.41E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_NETWORK_ACCESS_DENIED"
            r6 = 316(0x13c, float:4.43E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_PROXY_CONNECTION_FAILED"
            r6 = 317(0x13d, float:4.44E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_SOCKET_NOT_CONNECTED"
            r6 = 318(0x13e, float:4.46E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_SSL_BAD_RECORD_MAC_ALERT"
            r6 = 319(0x13f, float:4.47E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_SSL_PROTOCOL_ERROR"
            r6 = 320(0x140, float:4.48E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_TIMED_OUT"
            r6 = 321(0x141, float:4.5E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_TTNET_APP_TIMED_OUT"
            r6 = 322(0x142, float:4.51E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_TTNET_APP_UPLOAD_EXCEPTION"
            r6 = 323(0x143, float:4.53E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = "ERR_TUNNEL_CONNECTION_FAILED"
            r6 = 324(0x144, float:4.54E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.String r6 = "NetworkExceptionImpl"
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "ERR_NETWORK_CHANGED"
            r6 = 401(0x191, float:5.62E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.String r6 = "QuicExceptionImpl"
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Unexpected end of ZLIB input stream"
            r6 = 501(0x1f5, float:7.02E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<java.io.EOFException> r6 = java.io.EOFException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " unexpected end of stream on Connection"
            r6 = 601(0x259, float:8.42E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Unexpected request usage"
            r6 = 602(0x25a, float:8.44E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<java.io.IOException> r6 = java.io.IOException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "Cronet internal request fail"
            r6 = 701(0x2bd, float:9.82E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<java.lang.Exception> r6 = java.lang.Exception.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Content received is less than Content-Length"
            r6 = 801(0x321, float:1.122E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " expected bytes but received"
            r6 = 802(0x322, float:1.124E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " unexpected end of stream"
            r6 = 803(0x323, float:1.125E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<java.net.ProtocolException> r6 = java.net.ProtocolException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Connection closed by peer"
            r6 = 901(0x385, float:1.263E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Read error"
            r6 = 902(0x386, float:1.264E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " SSL handshake aborted"
            r6 = 903(0x387, float:1.265E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<javax.net.ssl.SSLException> r6 = javax.net.ssl.SSLException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Connection closed by peer"
            r6 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " Handshake failed"
            r6 = 1002(0x3ea, float:1.404E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.lang.String r5 = " SSL handshake aborted"
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<javax.net.ssl.SSLHandshakeException> r6 = javax.net.ssl.SSLHandshakeException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Hostname not verified"
            r6 = 1101(0x44d, float:1.543E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<javax.net.ssl.SSLPeerUnverifiedException> r6 = javax.net.ssl.SSLPeerUnverifiedException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = " Read error"
            r6 = 1201(0x4b1, float:1.683E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r5 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class<javax.net.ssl.SSLProtocolException> r6 = javax.net.ssl.SSLProtocolException.class
            java.lang.String r6 = r6.getSimpleName()
            r5.put(r6, r4)
        L_0x030e:
            java.lang.String r4 = r21.getMessage()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x031a
            goto L_0x0013
        L_0x031a:
            r5 = 44
            int r5 = r4.indexOf(r5)
            if (r5 <= 0) goto L_0x0326
            java.lang.String r4 = r4.substring(r3, r5)
        L_0x0326:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r3 = com.bytedance.ies.p621b.p622a.C10201a.f27531a
            java.lang.Class r5 = r21.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.Object r3 = r3.get(r5)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x036a
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x036a
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0346:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x036a
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = r4.contains(r6)
            if (r6 == 0) goto L_0x0346
            java.lang.Object r3 = r5.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x036a
            int r2 = r3.intValue()
        L_0x036a:
            if (r2 >= 0) goto L_0x0380
            boolean r3 = r1 instanceof com.bytedance.frameworks.baselib.network.http.p568a.C9836c
            if (r3 == 0) goto L_0x0373
            r2 = 199(0xc7, float:2.79E-43)
            goto L_0x0380
        L_0x0373:
            boolean r3 = r1 instanceof java.io.EOFException
            if (r3 == 0) goto L_0x037a
            r2 = 599(0x257, float:8.4E-43)
            goto L_0x0380
        L_0x037a:
            boolean r3 = r1 instanceof java.io.IOException
            if (r3 == 0) goto L_0x0380
            r2 = 699(0x2bb, float:9.8E-43)
        L_0x0380:
            r3 = r2
        L_0x0381:
            if (r22 != 0) goto L_0x038a
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r11 = r2
            goto L_0x038c
        L_0x038a:
            r11 = r22
        L_0x038c:
            if (r1 == 0) goto L_0x0452
            java.lang.String r2 = "errorDesc"
            java.lang.String r1 = r21.toString()     // Catch:{  }
            r11.put(r2, r1)     // Catch:{  }
            java.lang.String r1 = "networkQuality"
            com.bytedance.frameworks.baselib.network.a.c r2 = com.bytedance.frameworks.baselib.network.p566a.C9812c.m19639b()     // Catch:{  }
            com.bytedance.frameworks.baselib.network.a.d r2 = r2.mo17652c()     // Catch:{  }
            java.lang.String r2 = r2.toString()     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "downloadSpeed"
            com.bytedance.frameworks.baselib.network.a.c r2 = com.bytedance.frameworks.baselib.network.p566a.C9812c.m19639b()     // Catch:{  }
            double r4 = r2.mo17653d()     // Catch:{  }
            int r2 = (int) r4     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "cronet_plugin_install"
            com.ss.android.ugc.aweme.network.INetwork r2 = com.p683ss.android.ugc.aweme.net.C37797o.m84398a()     // Catch:{  }
            com.ss.android.ugc.aweme.network.a r2 = r2.getConfig()     // Catch:{  }
            com.ss.android.ugc.aweme.network.d<java.lang.Boolean> r2 = r2.f96300p     // Catch:{  }
            java.lang.Object r2 = r2.mo77272a()     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "cronet_plugin_version"
            com.ss.android.ugc.aweme.network.INetwork r2 = com.p683ss.android.ugc.aweme.net.C37797o.m84398a()     // Catch:{  }
            com.ss.android.ugc.aweme.network.a r2 = r2.getConfig()     // Catch:{  }
            com.ss.android.ugc.aweme.network.d<java.lang.Integer> r2 = r2.f96301q     // Catch:{  }
            java.lang.Object r2 = r2.mo77272a()     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "substatus"
            r11.put(r1, r3)     // Catch:{  }
            boolean r1 = com.bytedance.ttnet.C13281b.m26758a()     // Catch:{  }
            if (r1 == 0) goto L_0x03ef
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "CronetClient"
            r11.put(r1, r2)     // Catch:{  }
            goto L_0x03f6
        L_0x03ef:
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "TTOkhttp3Client"
            r11.put(r1, r2)     // Catch:{  }
        L_0x03f6:
            java.lang.String r1 = "/aweme/v2/feed"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x040d
            java.lang.String r1 = "rid"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x040d
            java.lang.String r1 = "is_feed_compound"
            java.lang.String r2 = "1"
            r11.put(r1, r2)     // Catch:{  }
        L_0x040d:
            if (r0 == 0) goto L_0x0452
            java.lang.String r1 = "addExecutorToAllInterceptors"
            long r2 = r0.f26754d     // Catch:{  }
            long r4 = r0.f26753c     // Catch:{  }
            r6 = 0
            long r2 = r2 - r4
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "addExecutorTime"
            long r2 = r0.f26753c     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "allInterceptorsTime"
            long r2 = r0.f26754d     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "fallback"
            int r2 = r0.f26773w     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.net.C37775g     // Catch:{ JSONException -> 0x0452 }
            if (r1 == 0) goto L_0x0452
            r1 = r0
            com.ss.android.ugc.aweme.net.g r1 = (com.p683ss.android.ugc.aweme.net.C37775g) r1     // Catch:{ JSONException -> 0x0452 }
            java.lang.String r1 = r1.f96240E     // Catch:{ JSONException -> 0x0452 }
            com.ss.android.ugc.aweme.net.g r0 = (com.p683ss.android.ugc.aweme.net.C37775g) r0     // Catch:{ JSONException -> 0x0452 }
            java.lang.String r0 = r0.f96241F     // Catch:{ JSONException -> 0x0452 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0452 }
            if (r2 != 0) goto L_0x0447
            java.lang.String r2 = "errorCode"
            r11.put(r2, r1)     // Catch:{ JSONException -> 0x0452 }
        L_0x0447:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0452 }
            if (r1 != 0) goto L_0x0452
            java.lang.String r1 = "logid"
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x0452 }
        L_0x0452:
            r0 = r13
            r2 = r15
            r4 = r17
            r5 = r19
            r6 = r18
            r7 = r10
            r8 = r11
            com.p683ss.android.ugc.aweme.base.C23569o.m57781b(r0, r2, r4, r5, r6, r7, r8)
            com.p683ss.android.ugc.aweme.base.C23569o.m57773a(r0, r2, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.network.INetwork r0 = com.p683ss.android.ugc.aweme.net.C37797o.m84398a()     // Catch:{ Throwable -> 0x0498 }
            com.ss.android.ugc.aweme.network.a r0 = r0.getConfig()     // Catch:{ Throwable -> 0x0498 }
            com.ss.android.ugc.aweme.network.d<java.lang.Integer> r0 = r0.f96299o     // Catch:{ Throwable -> 0x0498 }
            java.lang.Object r0 = r0.mo77272a()     // Catch:{ Throwable -> 0x0498 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Throwable -> 0x0498 }
            int r0 = r0.intValue()     // Catch:{ Throwable -> 0x0498 }
            if (r0 <= 0) goto L_0x0497
            java.lang.String r1 = "libra_id"
            r11.put(r1, r0)     // Catch:{ Throwable -> 0x0498 }
            java.lang.String r0 = "status"
            r11.put(r0, r10)     // Catch:{ Throwable -> 0x0498 }
            java.lang.String r0 = "duration"
            r1 = r13
            r11.put(r0, r13)     // Catch:{ Throwable -> 0x0498 }
            java.lang.String r0 = "url"
            r11.put(r0, r9)     // Catch:{ Throwable -> 0x0498 }
            java.lang.String r0 = "trace_code"
            r1 = r18
            r11.put(r0, r1)     // Catch:{ Throwable -> 0x0498 }
            m84359a(r11)     // Catch:{ Throwable -> 0x0498 }
        L_0x0497:
            return
        L_0x0498:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.net.p1992e.C37769a.mo77243a(long, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.c.b, java.lang.Throwable, org.json.JSONObject):void");
    }
}
