package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.frameworks.baselib.network.http.p568a.C9836c;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p830a.C12689e;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.feed.api.C30146d;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1386ar.C23258a;
import java.io.IOException;
import java.util.ArrayList;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.retrofit2.d */
final class C12730d {
    /* renamed from: a */
    static C12688d m25569a(CallServerInterceptor callServerInterceptor, C12689e eVar, C12796s sVar) throws IOException {
        String str;
        C12686c cVar = callServerInterceptor.f33271b;
        if (C22574a.m55738f().f60703d && C30146d.m70748a(cVar)) {
            C22574a.m55738f().mo46921b("feed_request_to_network", true);
            if (!C22574a.m55738f().mo46918a("feed_network_duration")) {
                C22574a.m55738f().mo46917a("feed_network_duration", true);
            }
        }
        if (sVar != null) {
            try {
                sVar.f33481n = SystemClock.uptimeMillis();
            } catch (Exception e) {
                if (cVar != null) {
                    C23258a aVar = C23258a.f62187c;
                    C52711k.m112240b(cVar, "request");
                    C52711k.m112240b(e, "ex");
                    ArrayList a = C23258a.m57198a();
                    int hashCode = cVar.mo23860c().hashCode();
                    if (a != null && a.contains(Integer.valueOf(hashCode))) {
                        try {
                            if (e instanceof C9836c) {
                                StringBuilder sb = new StringBuilder("status_code=");
                                sb.append(((C9836c) e).getStatusCode());
                                sb.append(",message=");
                                sb.append(e.getMessage());
                                str = sb.toString();
                            } else if (e instanceof C9872a) {
                                StringBuilder sb2 = new StringBuilder("status_code=");
                                sb2.append(((C9872a) e).getStatusCode());
                                sb2.append(",message=");
                                sb2.append(e.getMessage());
                                sb2.append(",traceCode=");
                                sb2.append(((C9872a) e).getTraceCode());
                                sb2.append(",requestLog=");
                                sb2.append(((C9872a) e).getRequestLog());
                                sb2.append(",requestInfo=");
                                sb2.append(C23258a.f62185a.mo34889b(((C9872a) e).getRequestInfo()));
                                str = sb2.toString();
                            } else {
                                str = e.getMessage();
                            }
                            if (str == null) {
                                str = "";
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(LeakCanaryFileProvider.f132050j, cVar.mo23860c());
                            jSONObject.put("response", str);
                            jSONObject.put("request", C23258a.f62185a.mo34889b(cVar));
                            C23569o.m57783b(C23258a.f62186b, "", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
                throw e;
            }
        }
        return eVar.mo9559a();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0133 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d A[Catch:{ Throwable -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bc A[Catch:{ Throwable -> 0x013f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.bytedance.retrofit2.C12799u m25570a(com.bytedance.retrofit2.CallServerInterceptor r10, com.bytedance.retrofit2.p830a.C12688d r11, com.bytedance.retrofit2.C12796s r12) throws java.io.IOException {
        /*
            com.bytedance.retrofit2.a.c r0 = r10.f33271b
            com.bytedance.retrofit2.a.c r0 = (com.bytedance.retrofit2.p830a.C12686c) r0
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            boolean r1 = r1.f60703d
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L_0x0033
            int r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18981f.m46159a(r0)
            if (r4 == r2) goto L_0x0034
            com.ss.android.ugc.aweme.an.a r5 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r6 = "feed_network_duration"
            r5.mo46921b(r6, r3)
            com.ss.android.ugc.aweme.an.a r5 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r6 = "feed_parse_duration"
            boolean r5 = r5.mo46918a(r6)
            if (r5 != 0) goto L_0x0034
            com.ss.android.ugc.aweme.an.a r5 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r6 = "feed_parse_duration"
            r5.mo46917a(r6, r3)
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            java.lang.Object r5 = r11.f33351f     // Catch:{ Throwable -> 0x013f }
            boolean r5 = r5 instanceof com.bytedance.frameworks.baselib.network.http.C9831a     // Catch:{ Throwable -> 0x013f }
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r11.f33351f     // Catch:{ Throwable -> 0x013f }
            com.bytedance.frameworks.baselib.network.http.a r5 = (com.bytedance.frameworks.baselib.network.http.C9831a) r5     // Catch:{ Throwable -> 0x013f }
            long r5 = r5.f26758h     // Catch:{ Throwable -> 0x013f }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0068
            com.bytedance.retrofit2.a.c r5 = r10.f33271b     // Catch:{ Throwable -> 0x013f }
            com.bytedance.retrofit2.a.c r5 = (com.bytedance.retrofit2.p830a.C12686c) r5     // Catch:{ Throwable -> 0x013f }
            com.bytedance.retrofit2.s r6 = r5.f33332m     // Catch:{ Throwable -> 0x013f }
            boolean r6 = r6 instanceof com.p683ss.android.ugc.aweme.p1386ar.C23259b     // Catch:{ Throwable -> 0x013f }
            if (r6 == 0) goto L_0x0068
            com.bytedance.retrofit2.s r5 = r5.f33332m     // Catch:{ Throwable -> 0x013f }
            com.ss.android.ugc.aweme.ar.b r5 = (com.p683ss.android.ugc.aweme.p1386ar.C23259b) r5     // Catch:{ Throwable -> 0x013f }
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x013f }
            com.bytedance.retrofit2.u r10 = r10.mo23816a(r11, r12)     // Catch:{ Throwable -> 0x013f }
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x013f }
            r12 = 0
            long r6 = r8 - r6
            r5.f62197I = r6     // Catch:{ Throwable -> 0x013f }
            r5.f62200L = r8     // Catch:{ Throwable -> 0x013f }
            goto L_0x006c
        L_0x0068:
            com.bytedance.retrofit2.u r10 = r10.mo23816a(r11, r12)     // Catch:{ Throwable -> 0x013f }
        L_0x006c:
            if (r1 == 0) goto L_0x00ba
            if (r4 == r2) goto L_0x00ba
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "feed_parse_duration"
            boolean r12 = r12.mo46918a(r1)     // Catch:{ Throwable -> 0x013f }
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r2 = "feed_parse_duration"
            boolean r1 = r1.mo46922b(r2)     // Catch:{ Throwable -> 0x013f }
            if (r12 == 0) goto L_0x0091
            if (r1 != 0) goto L_0x0091
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "feed_parse_duration"
            r12.mo46921b(r1, r3)     // Catch:{ Throwable -> 0x013f }
        L_0x0091:
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "feed_parse_to_ui"
            boolean r12 = r12.mo46918a(r1)     // Catch:{ Throwable -> 0x013f }
            if (r12 != 0) goto L_0x00a6
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "feed_parse_to_ui"
            r12.mo46917a(r1, r3)     // Catch:{ Throwable -> 0x013f }
        L_0x00a6:
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "feed_net_api_to_feed_api"
            r2 = 0
            r12.mo46917a(r1, r2)     // Catch:{ Throwable -> 0x013f }
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "feed_api_type"
            long r3 = (long) r4     // Catch:{ Throwable -> 0x013f }
            r12.mo46924c(r1, r3, r2)     // Catch:{ Throwable -> 0x013f }
        L_0x00ba:
            if (r0 == 0) goto L_0x013e
            java.lang.String r12 = r0.f33321b     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r1)     // Catch:{ Throwable -> 0x013f }
            java.lang.String r1 = "res"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r1)     // Catch:{ Throwable -> 0x013f }
            T r1 = r10.f33552b     // Catch:{ Throwable -> 0x013f }
            boolean r2 = r10.mo23960c()     // Catch:{ Throwable -> 0x013f }
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = "body"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Throwable -> 0x013f }
            boolean r2 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18975a.m46147a(r12, r1)     // Catch:{ Throwable -> 0x013f }
            if (r2 != 0) goto L_0x0133
            java.lang.String r2 = ""
            boolean r3 = r1 instanceof com.p683ss.android.ugc.aweme.app.api.C22982e     // Catch:{ Throwable -> 0x013f }
            if (r3 == 0) goto L_0x00e8
            r2 = r1
            com.ss.android.ugc.aweme.app.api.e r2 = (com.p683ss.android.ugc.aweme.app.api.C22982e) r2     // Catch:{ Throwable -> 0x013f }
            java.lang.String r2 = r2.getRequestId()     // Catch:{ Throwable -> 0x013f }
        L_0x00e8:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x013f }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x013f }
            if (r3 == 0) goto L_0x011f
            com.bytedance.retrofit2.a.d r3 = r10.f33551a     // Catch:{ Throwable -> 0x013f }
            if (r3 == 0) goto L_0x00fc
            java.lang.String r4 = "X-TT-LOGID"
            java.util.List r3 = r3.mo23867b(r4)     // Catch:{ Throwable -> 0x013f }
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            if (r3 == 0) goto L_0x011f
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ Throwable -> 0x013f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x013f }
        L_0x0105:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x013f }
            if (r4 == 0) goto L_0x011f
            java.lang.Object r2 = r3.next()     // Catch:{ Throwable -> 0x013f }
            com.bytedance.retrofit2.a.b r2 = (com.bytedance.retrofit2.p830a.C12685b) r2     // Catch:{ Throwable -> 0x013f }
            java.lang.String r4 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ Throwable -> 0x013f }
            java.lang.String r2 = r2.f33319b     // Catch:{ Throwable -> 0x013f }
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x013f }
            android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x013f }
            goto L_0x0105
        L_0x011f:
            com.ss.android.ugc.aweme.services.ApiMonitorService$Companion r3 = com.p683ss.android.ugc.aweme.services.ApiMonitorService.Companion     // Catch:{ NoSuchMethodError -> 0x0133 }
            com.ss.android.ugc.aweme.services.ApiMonitorService r3 = r3.getInstance()     // Catch:{ NoSuchMethodError -> 0x0133 }
            com.google.gson.f r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18975a.f52277a     // Catch:{ NoSuchMethodError -> 0x0133 }
            java.lang.String r1 = r4.mo34889b(r1)     // Catch:{ NoSuchMethodError -> 0x0133 }
            java.lang.String r4 = "GSON.toJson(body)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)     // Catch:{ NoSuchMethodError -> 0x0133 }
            r3.apiMonitor(r12, r2, r1)     // Catch:{ NoSuchMethodError -> 0x0133 }
        L_0x0133:
            com.ss.android.ugc.aweme.services.ApiMonitorService$Companion r12 = com.p683ss.android.ugc.aweme.services.ApiMonitorService.Companion     // Catch:{ Throwable -> 0x013f }
            com.ss.android.ugc.aweme.services.ApiMonitorService r12 = r12.getInstance()     // Catch:{ Throwable -> 0x013f }
            java.lang.String r0 = r0.f33321b     // Catch:{ Throwable -> 0x013f }
            r12.addALog(r0, r10)     // Catch:{ Throwable -> 0x013f }
        L_0x013e:
            return r10
        L_0x013f:
            r10 = move-exception
            boolean r12 = r10 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            if (r12 == 0) goto L_0x0160
            if (r11 == 0) goto L_0x0160
            r12 = r10
            com.ss.android.ugc.aweme.base.api.a.b.a r12 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r12
            int r12 = r12.getErrorCode()
            r0 = 8
            if (r12 != r0) goto L_0x0160
            java.lang.String r12 = r11.f33346a
            java.util.List<com.bytedance.retrofit2.a.b> r11 = r11.f33349d
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r0 = r0.isLogin()
            com.p683ss.android.account.token.C18507e.m44795a(r12, r11, r0)
        L_0x0160:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.C12730d.m25570a(com.bytedance.retrofit2.CallServerInterceptor, com.bytedance.retrofit2.a.d, com.bytedance.retrofit2.s):com.bytedance.retrofit2.u");
    }
}
