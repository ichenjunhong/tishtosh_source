package com.p683ss.android.p1103ad.splash.core;

import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.C18773t;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18610h;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1110b.C18557b;
import com.p683ss.android.p1103ad.splash.p1123g.C18735a;
import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18742h;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.a */
public class C18563a {

    /* renamed from: a */
    private static volatile C18563a f51157a;

    /* renamed from: a */
    public static C18563a m44939a() {
        if (f51157a == null) {
            synchronized (C18563a.class) {
                if (f51157a == null) {
                    f51157a = new C18563a();
                }
            }
        }
        return f51157a;
    }

    /* renamed from: c */
    static void m44941c() {
        if (C18642g.m45195W()) {
            C18661q a = C18661q.m45313a();
            if (!C18642g.m45245r()) {
                C18642g.m45246s();
                C186621 r1 = new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x010d A[Catch:{ Exception -> 0x0121 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:21:0x0110 A[Catch:{ Exception -> 0x0121 }] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r24 = this;
                            long r0 = java.lang.System.currentTimeMillis()
                            r2 = r24
                            com.ss.android.ad.splash.core.q r3 = com.p683ss.android.p1103ad.splash.core.C18661q.this     // Catch:{ Exception -> 0x0121 }
                            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.core.u r5 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Exception -> 0x0121 }
                            boolean r6 = com.p683ss.android.p1103ad.splash.core.C18642g.m45214ad()     // Catch:{ Exception -> 0x0121 }
                            if (r6 == 0) goto L_0x002e
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
                            r5.<init>()     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r6 = com.p683ss.android.p1103ad.splash.core.C18673u.f51605a     // Catch:{ Exception -> 0x0121 }
                            r5.append(r6)     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r6 = "splash_ad_ordered_data"
                            r5.append(r6)     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r5 = com.p683ss.android.p1103ad.splash.p1123g.C18738d.m45690b(r5)     // Catch:{ Exception -> 0x0121 }
                            goto L_0x0038
                        L_0x002e:
                            android.content.SharedPreferences r5 = r5.f51608b     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r6 = "splash_ad_data"
                            java.lang.String r7 = ""
                            java.lang.String r5 = r5.getString(r6, r7)     // Catch:{ Exception -> 0x0121 }
                        L_0x0038:
                            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r7 = "load splashAdData from local time : "
                            r6.<init>(r7)     // Catch:{ Exception -> 0x0121 }
                            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0121 }
                            r9 = 0
                            long r7 = r7 - r3
                            r6.append(r7)     // Catch:{ Exception -> 0x0121 }
                            java.util.List r3 = com.p683ss.android.p1103ad.splash.core.C18661q.m45314a(r5)     // Catch:{ Exception -> 0x0121 }
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r5 = "wait for load local:"
                            r4.<init>(r5)     // Catch:{ Exception -> 0x0121 }
                            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0121 }
                            r7 = 0
                            long r5 = r5 - r0
                            r4.append(r5)     // Catch:{ Exception -> 0x0121 }
                            boolean r4 = com.p683ss.android.p1103ad.splash.core.C18642g.m45236i()     // Catch:{ Exception -> 0x0121 }
                            if (r4 == 0) goto L_0x0063
                            return
                        L_0x0063:
                            com.ss.android.ad.splash.core.k r4 = com.p683ss.android.p1103ad.splash.core.C18654k.m45259a()     // Catch:{ Exception -> 0x0121 }
                            boolean r5 = com.p683ss.android.p1103ad.splash.core.C18642g.m45212ab()     // Catch:{ Exception -> 0x0121 }
                            if (r5 == 0) goto L_0x0073
                            java.util.List r5 = com.p683ss.android.p1103ad.splash.core.C18661q.m45315b()     // Catch:{ Exception -> 0x0121 }
                            r4.f51555b = r5     // Catch:{ Exception -> 0x0121 }
                        L_0x0073:
                            com.ss.android.ad.splash.core.u r5 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Exception -> 0x0121 }
                            long r5 = r5.mo38167j()     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.core.u r7 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Exception -> 0x0121 }
                            long r7 = r7.mo38168k()     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.core.u r9 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r9 = r9.mo38175r()     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.core.u r10 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r10 = r10.mo38176s()     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.core.u r11 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Exception -> 0x0121 }
                            boolean r11 = r11.mo38170m()     // Catch:{ Exception -> 0x0121 }
                            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r13 = "wait for load sp:"
                            r12.<init>(r13)     // Catch:{ Exception -> 0x0121 }
                            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0121 }
                            r15 = 0
                            long r13 = r13 - r0
                            r12.append(r13)     // Catch:{ Exception -> 0x0121 }
                            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0121 }
                            r13 = 0
                            if (r12 != 0) goto L_0x00e2
                            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x0121 }
                            r12.<init>(r9)     // Catch:{ Exception -> 0x0121 }
                            int r9 = r12.length()     // Catch:{ Exception -> 0x0121 }
                            r14 = 2
                            if (r9 != r14) goto L_0x00e2
                            long r14 = r12.getLong(r13)     // Catch:{ Exception -> 0x0121 }
                            r16 = 1000(0x3e8, double:4.94E-321)
                            long r14 = r14 * r16
                            r9 = 1
                            long r18 = r12.getLong(r9)     // Catch:{ Exception -> 0x0121 }
                            r20 = r14
                            long r13 = r18 * r16
                            com.ss.android.ad.splash.core.k r9 = com.p683ss.android.p1103ad.splash.core.C18654k.m45259a()     // Catch:{ Exception -> 0x0121 }
                            r22 = r0
                            r0 = r20
                            r9.mo38071a(r0)     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.core.k r0 = com.p683ss.android.p1103ad.splash.core.C18654k.m45259a()     // Catch:{ Exception -> 0x0121 }
                            r0.mo38072b(r13)     // Catch:{ Exception -> 0x0121 }
                            goto L_0x00e4
                        L_0x00e2:
                            r22 = r0
                        L_0x00e4:
                            r4.f51554a = r3     // Catch:{ Exception -> 0x0121 }
                            r4.f51558e = r5     // Catch:{ Exception -> 0x0121 }
                            r4.f51557d = r7     // Catch:{ Exception -> 0x0121 }
                            r4.f51563j = r10     // Catch:{ Exception -> 0x0121 }
                            r4.f51561h = r11     // Catch:{ Exception -> 0x0121 }
                            com.p683ss.android.p1103ad.splash.core.C18642g.m45237j()     // Catch:{ Exception -> 0x0121 }
                            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0121 }
                            r3 = 0
                            long r0 = r0 - r22
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r4 = "load local and init time:"
                            r3.<init>(r4)     // Catch:{ Exception -> 0x0121 }
                            r3.append(r0)     // Catch:{ Exception -> 0x0121 }
                            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0121 }
                            r3.<init>()     // Catch:{ Exception -> 0x0121 }
                            boolean r4 = com.p683ss.android.p1103ad.splash.core.C18642g.m45214ad()     // Catch:{ Exception -> 0x0121 }
                            if (r4 == 0) goto L_0x0110
                            java.lang.String r4 = "dur_use_file"
                            goto L_0x0112
                        L_0x0110:
                            java.lang.String r4 = "dur_use_sp"
                        L_0x0112:
                            r3.put(r4, r0)     // Catch:{ Exception -> 0x0121 }
                            com.ss.android.ad.splash.b.a r0 = com.p683ss.android.p1103ad.splash.p1110b.C18550a.m44899a()     // Catch:{ Exception -> 0x0121 }
                            java.lang.String r1 = "service_load_local_data"
                            r4 = 0
                            r5 = 0
                            r0.mo37844a(r1, r5, r3, r4)     // Catch:{ Exception -> 0x0121 }
                            return
                        L_0x0121:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.C18661q.C186621.run():void");
                    }
                };
                if (C18642g.f51472J) {
                    C18642g.m45175C().execute(r1);
                } else {
                    r1.run();
                }
            }
            return;
        }
        C18661q a2 = C18661q.m45313a();
        if (!C18642g.m45245r()) {
            long currentTimeMillis = System.currentTimeMillis();
            C18642g.m45246s();
            try {
                C18610h c = a2.mo38085c();
                if (!C18642g.m45236i()) {
                    C18654k a3 = C18654k.m45259a();
                    a3.f51556c = c;
                    long j = C18673u.m45399a().mo38167j();
                    long k = C18673u.m45399a().mo38168k();
                    String r = C18673u.m45399a().mo38175r();
                    String s = C18673u.m45399a().mo38176s();
                    boolean m = C18673u.m45399a().mo38170m();
                    if (!TextUtils.isEmpty(r)) {
                        JSONArray jSONArray = new JSONArray(r);
                        if (jSONArray.length() == 2) {
                            long j2 = jSONArray.getLong(1) * 1000;
                            C18654k.m45259a().mo38071a(jSONArray.getLong(0) * 1000);
                            C18654k.m45259a().mo38072b(j2);
                        }
                    }
                    a3.f51558e = j;
                    a3.f51557d = k;
                    a3.f51556c = c;
                    a3.f51563j = s;
                    a3.f51561h = m;
                    C18642g.m45237j();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration_load_local_data_time", currentTimeMillis2 - currentTimeMillis);
                    C18550a.m44899a().mo37844a("service_ad_load_local_sync_data", 0, jSONObject, null);
                }
            } catch (Exception e) {
                C18550a.m44899a().mo37842a(e, "key_exception_local_data");
            }
        }
    }

    /* renamed from: b */
    public static void m44940b() {
        JSONObject jSONObject;
        long j;
        long j2;
        JSONArray jSONArray;
        List list;
        if (C18642g.m45195W()) {
            C18665t a = C18665t.m45364a();
            C18735a.m45667b("没有打开实时开关，准备预加载请求");
            if (!C18674v.m45443a().f51621h) {
                if (!C18742h.m45697b(C18642g.m45184L())) {
                    C18735a.m45667b("没有网络，不进行预加载");
                } else if (a.mo38134c()) {
                    a.mo38130b();
                } else {
                    C18735a.m45667b("间隔时间太短，不进行预加载");
                }
            }
            return;
        }
        C18665t a2 = C18665t.m45364a();
        C18735a.m45667b("打开了实时开关，准备预加载请求");
        if (!C18674v.m45443a().f51621h) {
            if (!C18742h.m45697b(C18642g.m45184L())) {
                C18735a.m45667b("没有网络，不能预加载");
            } else if (a2.mo38134c()) {
                long currentTimeMillis = System.currentTimeMillis();
                C18557b.m44917a().f51149a = false;
                Future submit = C18642g.m45247t().submit(new Callable<C18773t>() {
                    public final /* synthetic */ Object call() throws Exception {
                        if (C18642g.m45250w() != null) {
                            String b = C18744j.m45723b();
                            String c = C18744j.m45729c();
                            if (!C18747l.m45742a(b)) {
                                C18735a.m45667b("发送预加载网络请求");
                                return C18642g.m45250w().mo38379a(b, c);
                            }
                        }
                        return null;
                    }
                });
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    C18773t tVar = (C18773t) submit.get(30, TimeUnit.SECONDS);
                    a2.f51586a = System.currentTimeMillis();
                    if (tVar == null || !tVar.f51910b || tVar.f51909a == null) {
                        jSONObject = jSONObject2;
                        C18735a.m45667b("请求失败，或者请求成功了，但是返回的数据为空");
                    } else {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject optJSONObject = tVar.f51909a.optJSONObject("data");
                        if (optJSONObject != null) {
                            long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                            long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                            a2.f51587b = optJSONObject.optLong("splash_load_interval", 20) * 1000;
                            String optString = optJSONObject.optString("log_extra", "{}");
                            boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                            int min = Math.min(optJSONObject.optInt("concurrent_downloads", 0), Runtime.getRuntime().availableProcessors());
                            new StringBuilder("concurrent_downloads : ").append(min);
                            long optLong3 = optJSONObject.optLong("server_time", 0);
                            C18665t.m45368a(optLong3);
                            JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                            if (optJSONArray == null || optJSONArray.length() != 2) {
                                j = currentTimeMillis;
                            } else {
                                j = currentTimeMillis;
                                long j3 = 1000 * optJSONArray.getLong(1);
                                C18654k.m45259a().mo38071a(optJSONArray.getLong(0) * 1000);
                                C18654k.m45259a().mo38072b(j3);
                            }
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                            }
                            int optInt = optJSONObject.optInt("show_limit", 0);
                            long currentTimeMillis3 = System.currentTimeMillis();
                            if (C18642g.m45216af() && optLong3 != 0) {
                                currentTimeMillis3 = optLong3;
                            }
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("show_queue");
                            if (optJSONArray2 == null) {
                                optJSONArray2 = new JSONArray();
                            }
                            C18735a.m45667b("预加载数据解析成功");
                            C18654k a3 = C18654k.m45259a();
                            JSONObject jSONObject3 = jSONObject2;
                            String i = C18673u.m45399a().mo38166i();
                            if (TextUtils.isEmpty(i)) {
                                jSONArray = new JSONArray();
                                j2 = currentTimeMillis2;
                            } else {
                                j2 = currentTimeMillis2;
                                jSONArray = new JSONArray(i);
                            }
                            C18610h a4 = C18744j.m45704a(jSONArray, optJSONArray2, currentTimeMillis3);
                            List a5 = C18744j.m45712a(optJSONArray3);
                            List<C18602b> a6 = C18744j.m45711a(a4.f51382c, a5);
                            a4.f51381b = a6;
                            List<C18602b> list2 = a4.f51380a;
                            JSONArray b = C18744j.m45727b(list2);
                            JSONArray b2 = C18744j.m45727b(a6);
                            if (C18642g.m45182J() != null) {
                                list = a5;
                                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                                    Thread.sleep(2500);
                                }
                            } else {
                                list = a5;
                            }
                            a3.f51558e = optLong;
                            JSONArray jSONArray2 = b2;
                            long j4 = optLong2;
                            a3.f51557d = j4;
                            a3.f51556c = a4;
                            a3.f51563j = optString;
                            a3.f51561h = optBoolean;
                            a3.f51562i = min;
                            if (!C18740f.m45691a(a6)) {
                                a4.f51384e = C18610h.m45089a(a6);
                            } else {
                                a4.f51384e = C18610h.m45089a(list2);
                            }
                            C18642g.m45246s();
                            C18673u b3 = C18673u.m45399a().mo38142a(optLong).mo38141a(optInt).mo38148b(j4).mo38149b(b.toString());
                            b3.mo38177t().putString("splash_ad_data", jSONArray2.toString());
                            b3.mo38144a(C18740f.m45691a(list2)).mo38163h(optJSONArray.toString()).mo38165i(optString).mo38154c(optBoolean).mo38164h();
                            C18642g.m45237j();
                            a2.mo38132b(a4.f51383d);
                            jSONObject = jSONObject3;
                            jSONObject.put("durarion_ad_request_total_times", j2 - j);
                            a2.mo38133c(a4.f51383d);
                            C18665t.m45377d(a4.f51383d);
                            C18665t.m45373a(list);
                            C18656m.m45265a();
                            String E = C18642g.m45177E();
                            if (!C18747l.m45742a(E)) {
                                C18656m.m45267a(E, false);
                            }
                            String F = C18642g.m45178F();
                            if (!TextUtils.isEmpty(F)) {
                                C18656m.m45267a(F, true);
                            }
                        } else {
                            return;
                        }
                    }
                    C18550a.m44899a().mo37846b("service_ad_request_status", 0, jSONObject, null);
                } catch (Exception e) {
                    C18735a.m45662a(0, "请求数据失败，原因未知，可能出现了 Exception", e, null);
                    C18550a.m44899a().mo37842a(e, "key_exception_request");
                }
            } else {
                C18735a.m45667b("间隔时间太短，不进行预加载");
            }
        }
    }
}
