package com.bytedance.apm.impl;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.C8990c;
import com.bytedance.apm.p479e.C9011a;
import com.bytedance.apm.p497o.C9149b.C9153b;
import com.bytedance.apm.p501q.C9185g;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.apm.p501q.C9193j;
import com.bytedance.apm.p501q.C9202r;
import com.bytedance.p582g.p583a.p584a.C9946b;
import com.bytedance.services.apm.api.C13219b;
import com.bytedance.services.slardar.config.C13226a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.impl.b */
public final class C9055b implements C9153b {

    /* renamed from: a */
    public volatile boolean f24723a;

    /* renamed from: b */
    volatile boolean f24724b;

    /* renamed from: c */
    volatile JSONObject f24725c;

    /* renamed from: d */
    volatile JSONObject f24726d;

    /* renamed from: e */
    volatile JSONObject f24727e;

    /* renamed from: f */
    List<String> f24728f = C9011a.f24568a;

    /* renamed from: g */
    SharedPreferences f24729g;

    /* renamed from: h */
    C8990c f24730h;

    /* renamed from: i */
    public JSONObject f24731i;

    /* renamed from: j */
    boolean f24732j;

    /* renamed from: k */
    long f24733k = -1;

    /* renamed from: l */
    List<C13226a> f24734l;

    /* renamed from: m */
    private volatile long f24735m = 1200;

    /* renamed from: n */
    private long f24736n = 15000;

    /* renamed from: o */
    private long f24737o = -1;

    /* renamed from: com.bytedance.apm.impl.b$a */
    static class C9056a {

        /* renamed from: a */
        private String f24738a;

        /* renamed from: b */
        private Map<String, String> f24739b = new HashMap();

        /* renamed from: a */
        private void m17943a() {
            this.f24738a = C9946b.m19986a(this.f24738a, null);
        }

        /* renamed from: b */
        private void m17944b() {
            this.f24739b.put("Content-Type", "application/json; charset=utf-8");
        }

        C9056a(String str) {
            this.f24738a = str;
        }

        /* renamed from: b */
        private void m17945b(Map<String, String> map) {
            this.f24738a = C9202r.m18286a(this.f24738a, map);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C9054a mo16426a(Map<String, String> map) throws Exception {
            m17945b(map);
            m17943a();
            m17944b();
            return new C9054a(this.f24738a, this.f24739b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo16420a() {
        return this.f24729g.getString("monitor_net_config", "");
    }

    C9055b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16425b() {
        if (!this.f24723a) {
            this.f24723a = true;
            if (this.f24734l != null) {
                for (C13226a e : this.f24734l) {
                    e.mo16224e();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo16358a(long j) {
        mo16424a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final JSONObject mo16421a(String str) {
        if (TextUtils.isEmpty(str) || this.f24731i == null) {
            return new JSONObject();
        }
        return this.f24731i.optJSONObject(str);
    }

    /* renamed from: a */
    private boolean m17933a(C13219b bVar) throws JSONException {
        if (bVar != null && bVar.f34489a == 200) {
            byte[] bArr = bVar.f34490b;
            if (bArr != null) {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                JSONObject optJSONObject = jSONObject.optJSONObject("ret");
                this.f24732j = false;
                mo16422a(optJSONObject);
                mo16423a(optJSONObject, false);
                mo16425b();
                m17934b(jSONObject);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m17934b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("ret");
            String optString = jSONObject.optString(LeakCanaryFileProvider.f132049i);
            Editor edit = this.f24729g.edit();
            edit.putString("monitor_net_config", optJSONObject.toString());
            edit.putInt("setting_version", 3);
            edit.putString("monitor_net_config_name", optString);
            edit.putLong("monitor_configure_refresh_time", this.f24733k);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static List<String> m17932a(List<String> list) {
        try {
            if (!C9190h.m18253a(list)) {
                ArrayList arrayList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL((String) list.get(i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(host);
                        sb.append("/monitor/appmonitor/v3/settings");
                        arrayList.add(sb.toString());
                    }
                }
                return arrayList;
            }
        } catch (MalformedURLException unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    private boolean m17935b(long j) {
        if (this.f24736n > 15000) {
            if (j - this.f24737o > this.f24736n) {
                return true;
            }
            return false;
        } else if (j - this.f24733k > this.f24735m * 1000) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16422a(JSONObject jSONObject) {
        if (!C9185g.m18238c(jSONObject)) {
            JSONObject a = C9185g.m18234a(jSONObject, "general", "slardar_api_settings");
            if (a != null) {
                JSONObject optJSONObject = a.optJSONObject("fetch_setting");
                if (optJSONObject != null) {
                    this.f24735m = optJSONObject.optLong("fetch_setting_interval", 1200);
                }
                if (this.f24735m < 600) {
                    this.f24735m = 600;
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("custom_event_settings");
            if (optJSONObject2 != null) {
                this.f24725c = optJSONObject2.optJSONObject("allow_log_type");
                this.f24726d = optJSONObject2.optJSONObject("allow_metric_type");
                this.f24727e = optJSONObject2.optJSONObject("allow_service_name");
            }
            this.f24731i = jSONObject;
            JSONObject a2 = mo16421a("exception_modules");
            if (a2 != null) {
                JSONObject optJSONObject3 = a2.optJSONObject("exception");
                if (optJSONObject3 != null) {
                    boolean z = true;
                    if (optJSONObject3.optInt("enable_upload") != 1) {
                        z = false;
                    }
                    this.f24724b = z;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24733k);
            C8976c.m17744a("config_time", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16424a(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z || m17935b(System.currentTimeMillis())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C9193j.m18259b(C8976c.m17736a()) && this.f24730h != null && this.f24730h.mo16304a() != null && !this.f24730h.mo16304a().isEmpty()) {
            this.f24737o = System.currentTimeMillis();
            Iterator it = this.f24728f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    C9054a a = new C9056a((String) it.next()).mo16426a(this.f24730h.mo16304a());
                    boolean a2 = m17933a(C8976c.m17737a(a.f24720a, a.f24721b));
                    if (a2) {
                        z3 = a2;
                        break;
                    }
                    z3 = a2;
                } catch (Throwable unused) {
                }
            }
            if (!z3) {
                this.f24736n = Math.min(this.f24736n * 2, 300000);
                return;
            }
            this.f24733k = System.currentTimeMillis();
            this.f24736n = 15000;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16423a(JSONObject jSONObject, boolean z) {
        if (this.f24734l != null) {
            for (C13226a a : this.f24734l) {
                a.mo16270a(jSONObject, z);
            }
        }
    }
}
