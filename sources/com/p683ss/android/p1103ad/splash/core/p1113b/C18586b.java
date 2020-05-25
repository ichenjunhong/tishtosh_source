package com.p683ss.android.p1103ad.splash.core.p1113b;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.p1123g.C18741g;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.b.b */
public class C18586b {

    /* renamed from: b */
    private static volatile C18586b f51233b;

    /* renamed from: a */
    public List<C18584a> f51234a = new ArrayList();

    private C18586b() {
    }

    /* renamed from: b */
    public final void mo37941b() {
        if (this.f51234a != null) {
            this.f51234a.clear();
        }
    }

    /* renamed from: a */
    public static C18586b m44982a() {
        if (f51233b == null) {
            synchronized (C18586b.class) {
                if (f51233b == null) {
                    f51233b = new C18586b();
                }
            }
        }
        return f51233b;
    }

    /* renamed from: a */
    public final void mo37939a(C18584a aVar) {
        if (aVar != null && this.f51234a != null) {
            this.f51234a.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m44988b(C18584a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f51224b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f51224b);
                }
                if (!TextUtils.isEmpty(aVar.f51226d)) {
                    jSONObject.put("log_extra", aVar.f51226d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C18642g.m45201a(aVar.f51223a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: c */
    public static void m44993c(C18602b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(bVar.mo37864r())) {
                    jSONObject.put("log_extra", bVar.mo37864r());
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: b */
    public static void m44989b(C18602b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo37864r())) {
                    jSONObject.put("log_extra", bVar.mo37864r());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo37862f());
                jSONObject2.putOpt("is_topview", Integer.valueOf(C18744j.m45718a(bVar) ? 1 : 0));
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C18741g.m45694a("error in putting log_extra into json");
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "ad_no_selected", jSONObject);
        }
    }

    /* renamed from: c */
    public static void m44992c(C18584a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (aVar.f51224b > 0 && aVar.f51225c > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f51224b);
                    jSONObject2.put("ad_error_code", aVar.f51225c);
                }
                if (!TextUtils.isEmpty(aVar.f51227e)) {
                    jSONObject2.put("is_topview", aVar.f51227e);
                }
                if (!TextUtils.isEmpty(aVar.f51226d)) {
                    jSONObject.put("log_extra", aVar.f51226d);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C18642g.m45201a(aVar.f51223a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: d */
    public static void m44995d(C18584a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.f51224b > 0) {
                    jSONObject2.put("ad_show_fail_type", aVar.f51224b);
                }
                if (aVar.f51225c > 0) {
                    jSONObject2.put("ad_error_code", aVar.f51225c);
                }
                if (!TextUtils.isEmpty(aVar.f51226d)) {
                    jSONObject.put("log_extra", aVar.f51226d);
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
            C18642g.m45201a(aVar.f51223a, "splash_ad", "open_splash", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m44984a(C18602b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo37864r())) {
                    jSONObject.put("log_extra", bVar.mo37864r());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo37862f());
                jSONObject2.putOpt("is_topview", Integer.valueOf(C18744j.m45718a(bVar) ? 1 : 0));
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C18741g.m45694a("error in putting log_extra into json");
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "ad_selected", jSONObject);
        }
    }

    /* renamed from: c */
    public static void m44994c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("status", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", "");
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        C18642g.m45201a(84378473382L, "splash_ad", "response", jSONObject);
    }

    /* renamed from: b */
    public static void m44991b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("is_empty_data", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", "");
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        C18642g.m45201a(84378473382L, "splash_ad", "parse_finished", jSONObject);
    }

    /* renamed from: a */
    public final void mo37940a(boolean z) {
        if (this.f51234a != null) {
            try {
                if (this.f51234a.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    for (C18584a aVar : this.f51234a) {
                        if (aVar != null && aVar.f51225c > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.f51223a);
                            jSONObject.put(sb.toString(), aVar.f51225c);
                        }
                    }
                    jSONObject3.put("ad_show_fail_list", jSONObject);
                    jSONObject3.put("ad_show_fail_type", 3);
                    jSONObject2.put("log_extra", "{}");
                    jSONObject2.putOpt("is_ad_event", "1");
                    jSONObject2.put("ad_extra_data", jSONObject3);
                    C18642g.m45201a(84378473382L, "splash_ad", "open_splash", jSONObject2);
                }
                mo37941b();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m44987a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.putOpt("uri", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.putOpt(LeakCanaryFileProvider.f132050j, str2);
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
        } catch (JSONException unused) {
        }
        C18642g.m45201a(84378473382L, "splash_ad", "error_save_sp", jSONObject);
    }

    /* renamed from: a */
    public static void m44983a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("is_time_valid", Integer.valueOf(i));
            jSONObject2.putOpt("invalid_reason", Integer.valueOf(i2));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("log_extra", "");
        } catch (Exception unused) {
            C18741g.m45694a("error in putting data into json");
        }
        C18642g.m45201a(84378473382L, "splash_ad", "valid_time", jSONObject);
    }

    /* renamed from: b */
    public static void m44990b(C18602b bVar, String str) {
        int i;
        if (bVar != null && !C18747l.m45742a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo37864r())) {
                    jSONObject.put("log_extra", bVar.mo37864r());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo37862f());
                if (bVar.mo37990l()) {
                    String str2 = "ad_extra_data";
                    JSONObject jSONObject2 = new JSONObject();
                    String str3 = "topview_type";
                    if (bVar.mo37992n()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    jSONObject.put(str2, jSONObject2.put(str3, i));
                }
            } catch (Exception unused) {
                C18741g.m45694a("error in putting log_extra into json");
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m44985a(C18602b bVar, C18602b bVar2) {
        if (bVar != null && bVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar2.mo37864r())) {
                    jSONObject.put("log_extra", bVar2.mo37864r());
                }
                if (!TextUtils.isEmpty(bVar.mo37857C())) {
                    jSONObject2.put("topview_ad_id", bVar.mo37857C());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", bVar2.mo37862f());
            } catch (Exception unused) {
            }
            C18642g.m45201a(bVar2.mo37863p(), "splash_ad", "topview_other_show", jSONObject);
        }
    }

    /* renamed from: a */
    public static void m44986a(C18602b bVar, String str) {
        if (bVar != null && !C18747l.m45742a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(bVar.mo37864r())) {
                    jSONObject.put("log_extra", bVar.mo37864r());
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo37862f());
            } catch (Exception unused) {
                C18741g.m45694a("error in putting log_extra into json");
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", str, jSONObject);
        }
    }
}
