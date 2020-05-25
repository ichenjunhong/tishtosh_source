package com.p683ss.android.p1103ad.splash.core.p1115d;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.C18773t;
import com.p683ss.android.p1103ad.splash.core.C18563a;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.C18654k;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.d.a */
public final class C18621a {

    /* renamed from: a */
    private static ExecutorService f51414a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: a */
    public static void m45104a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                C18642g.m45175C().submit(new Runnable() {
                    public final void run() {
                        C18563a.m44939a();
                        C18563a.m44940b();
                    }
                });
            }
        }, C18642g.m45198Z());
    }

    /* renamed from: a */
    public static void m45105a(final C18602b bVar) {
        final Future submit = C18642g.m45247t().submit(new Runnable() {
            public final void run() {
                boolean z;
                if (C18642g.m45250w() != null && C18654k.m45259a().f51561h) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    String e = C18744j.m45734e();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ad_id", bVar.mo37863p());
                        jSONObject2.put("timestamp", currentTimeMillis);
                        jSONObject2.put("position", 0);
                        jSONObject2.put("log_extra", bVar.mo37864r());
                        jSONArray.put(jSONObject2);
                        jSONObject.put("ads", jSONArray);
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(e)) {
                        int i = 0;
                        while (i < 4) {
                            C18773t a = C18642g.m45250w().mo38378a(e, 3, null, jSONObject);
                            if (a != null && a.f51910b) {
                                JSONObject jSONObject3 = a.f51909a;
                                if (jSONObject3 == null || jSONObject3.optInt("code", -1) != 30001) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    i++;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        });
        f51414a.execute(new Runnable() {
            public final void run() {
                try {
                    submit.get(5, TimeUnit.SECONDS);
                } catch (Exception unused) {
                } finally {
                    C18621a.m45104a();
                }
            }
        });
    }
}
