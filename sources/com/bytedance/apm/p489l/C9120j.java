package com.bytedance.apm.p489l;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9180b;
import com.bytedance.apm.p501q.C9193j;
import com.bytedance.apm.p501q.C9201q;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.lynx.webview.extension.URLRequestFlowCount;
import com.bytedance.lynx.webview.extension.URLRequestFlowCount.URLRequestFlowCountListener;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.j */
public final class C9120j extends C9081a {

    /* renamed from: a */
    boolean f24973a;

    /* renamed from: b */
    String f24974b;

    /* renamed from: g */
    long f24975g;

    /* renamed from: h */
    long f24976h;

    /* renamed from: i */
    long f24977i;

    /* renamed from: j */
    private Context f24978j = C8976c.m17736a();

    /* renamed from: k */
    private boolean f24979k;

    /* renamed from: l */
    private BroadcastReceiver f24980l = new BroadcastReceiver() {
        public final void onReceive(final Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                    public final void run() {
                        try {
                            String a = C9120j.m18096a(context);
                            if (!TextUtils.isEmpty(a)) {
                                C9120j jVar = C9120j.this;
                                Context context = context;
                                if (TextUtils.isEmpty(jVar.f24974b)) {
                                    jVar.f24974b = a;
                                    jVar.f24975g = 0;
                                    jVar.f24976h = 0;
                                    jVar.f24977i = C9180b.m18209a(context);
                                    C9120j.m18097a(context, jVar.f24974b, jVar.f24975g, jVar.f24976h, jVar.f24977i, 1);
                                    return;
                                }
                                if (!a.equals(jVar.f24974b)) {
                                    if ("WIFI".equals(jVar.f24974b)) {
                                        jVar.f24976h += C9180b.m18209a(context) - jVar.f24977i;
                                    } else {
                                        jVar.f24975g += C9180b.m18209a(context) - jVar.f24977i;
                                    }
                                    jVar.f24974b = a;
                                    jVar.f24977i = C9180b.m18209a(context);
                                    C9120j.m18097a(context, jVar.f24974b, jVar.f24975g, jVar.f24976h, jVar.f24977i, 1);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16220b() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C9120j jVar = C9120j.this;
                if (jVar.f24973a) {
                    URLRequestFlowCount.setURLRequestFlowCountListener(new URLRequestFlowCountListener() {
                    });
                }
            }
        });
        Context context = this.f24978j;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.f24980l, intentFilter);
        } catch (Exception unused) {
        }
        if (C9201q.m18282a()) {
            try {
                Calendar instance = Calendar.getInstance();
                instance.set(11, 0);
                instance.set(13, 0);
                instance.set(12, 0);
                instance.set(14, 0);
                long timeInMillis = instance.getTimeInMillis();
                long j = timeInMillis - FbUploadTokenTime.group0;
                long a = C9201q.m18279a(C8976c.m17736a(), j, timeInMillis, 1);
                long a2 = C9201q.m18279a(C8976c.m17736a(), j, timeInMillis, 0);
                long j2 = a + a2;
                if (j2 > 0) {
                    m18098a("net_stats_wifi_day", a);
                    m18098a("net_stats_mobile_day", a2);
                    m18098a("net_stats_total_day", j2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        super.mo16218a(activity);
        m18099b(true);
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        super.mo16221b(activity);
        m18099b(false);
    }

    /* renamed from: b */
    private void m18099b(final boolean z) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9120j.this.mo16486a(z);
            }
        });
    }

    public C9120j(boolean z) {
        this.f24973a = z;
        this.f24812e = "traffic";
    }

    /* renamed from: a */
    public static String m18096a(Context context) {
        C9426a c = C9193j.m18260c(context);
        if (c == C9426a.WIFI) {
            return "WIFI";
        }
        if (c == C9426a.MOBILE || c == C9426a.MOBILE_2G || c == C9426a.MOBILE_3G || c == C9426a.MOBILE_4G) {
            return "MOBILE";
        }
        return "";
    }

    /* renamed from: a */
    public final void mo16486a(boolean z) {
        try {
            SharedPreferences a = C35807d.m80935a(this.f24978j, "traffic_monitor_info", 0);
            String string = a.getString("net_type", null);
            a.getLong("timestamp", -1);
            long j = a.getLong("last_total_traffic", -1);
            long j2 = a.getLong("mobile_traffic", -1);
            long j3 = a.getLong("wifi_traffic", -1);
            int i = a.getInt("traffic_upload_switch", 0);
            if (string != null && i == 1) {
                if ("WIFI".equals(string)) {
                    j3 = (j3 + C9180b.m18209a(this.f24978j)) - j;
                } else if ("MOBILE".equals(string)) {
                    j2 = (j2 + C9180b.m18209a(this.f24978j)) - j;
                }
                if (z) {
                    if (j3 > 0) {
                        m18098a("wifi_traffic_foreground", j3);
                    }
                    if (j2 > 0) {
                        m18098a("mobile_traffic_foreground", j2);
                    }
                    this.f24979k = false;
                } else if (!this.f24979k) {
                    if (j3 > 0) {
                        m18098a("wifi_traffic_background", j3);
                    }
                    if (j2 > 0) {
                        m18098a("mobile_traffic_background", j2);
                    }
                    this.f24979k = true;
                }
            }
            this.f24977i = C9180b.m18209a(this.f24978j);
            this.f24974b = m18096a(this.f24978j);
            this.f24975g = 0;
            this.f24976h = 0;
            m18097a(this.f24978j, this.f24974b, this.f24975g, this.f24976h, this.f24977i, 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m18098a(String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, j);
            C9024f fVar = new C9024f("traffic", "traffic_monitor", false, jSONObject, null, null);
            m17983a(fVar);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static void m18097a(Context context, String str, long j, long j2, long j3, int i) {
        if (context != null) {
            try {
                Editor edit = C35807d.m80935a(context, "traffic_monitor_info", 0).edit();
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("net_type", str);
                }
                edit.putLong("mobile_traffic", j);
                edit.putLong("wifi_traffic", j2);
                edit.putLong("last_total_traffic", j3);
                edit.putLong("collect_traffic_time", System.currentTimeMillis());
                edit.putInt("traffic_upload_switch", 1);
                edit.putLong("timestamp", System.currentTimeMillis());
                edit.apply();
            } catch (Throwable unused) {
            }
        }
    }
}
