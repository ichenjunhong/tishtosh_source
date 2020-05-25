package com.p683ss.android.p1103ad.splash.core;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1123g.C18738d;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.io.File;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.m */
class C18656m {

    /* renamed from: b */
    private static volatile C18656m f51564b;

    /* renamed from: a */
    ConcurrentHashMap<String, String> f51565a = new ConcurrentHashMap<>();

    private C18656m() {
    }

    /* renamed from: a */
    public static C18656m m45265a() {
        if (f51564b == null) {
            synchronized (C18656m.class) {
                if (f51564b == null) {
                    f51564b = new C18656m();
                }
            }
        }
        return f51564b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo38073b() {
        if (C18642g.f51528x) {
            if (Math.abs(System.currentTimeMillis() - C18673u.m45399a().f51608b.getLong("clear_local_cache_time", 0)) >= Math.min(C18642g.m45179G(), 3600000)) {
                C18642g.m45175C().execute(new Runnable() {
                    public final void run() {
                        C18656m.this.mo38074c();
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public final void mo38075d() {
        if (this.f51565a != null && !this.f51565a.isEmpty()) {
            for (Entry entry : this.f51565a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.exists() && !C18673u.m45399a().mo38160f(str2)) {
                        file.delete();
                    }
                }
            }
            this.f51565a.clear();
        }
    }

    /* renamed from: c */
    public final void mo38074c() {
        String E = C18642g.m45177E();
        if (!C18747l.m45742a(E)) {
            m45266a(E);
        }
        String F = C18642g.m45178F();
        if (!TextUtils.isEmpty(F)) {
            m45266a(F);
        }
        try {
            JSONArray jSONArray = new JSONArray(C18673u.m45399a().mo38162g());
            JSONArray jSONArray2 = new JSONArray();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("local_url");
                    long optLong = optJSONObject.optLong("local_data_expire_time");
                    if (!C18747l.m45742a(optString)) {
                        File file = new File(optString);
                        if (file.exists()) {
                            if (currentTimeMillis <= optLong) {
                                jSONArray2.put(optJSONObject);
                            } else {
                                file.delete();
                                StringBuilder sb = new StringBuilder("文件 ");
                                sb.append(optString);
                                sb.append("已过期，被系统删除");
                            }
                        }
                    }
                }
            }
            C18673u.m45399a().mo38161g(jSONArray2.toString()).mo38164h();
        } catch (Exception unused) {
        }
        C18673u a = C18673u.m45399a();
        a.mo38177t().putLong("clear_local_cache_time", System.currentTimeMillis());
        a.mo38164h();
    }

    /* renamed from: a */
    private static void m45266a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (listFiles.length > 0) {
                        for (File file2 : listFiles) {
                            if (C18738d.m45689a(file2, C18642g.m45179G())) {
                                if (file2 != null && file2.exists()) {
                                    file2.delete();
                                }
                                StringBuilder sb = new StringBuilder("文件 ");
                                sb.append(str);
                                sb.append("已过期，被系统删除");
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m45267a(String str, boolean z) {
        String str2;
        try {
            long a = C18738d.m45684a(new File(str)) / 1024;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_splash_cache_size", a);
            if (z) {
                str2 = "service_ad_extra_res_disk_cache_size_in_mb";
            } else {
                str2 = "service_ad_res_disk_cache_size_in_mb";
            }
            C18550a.m44899a().mo37845a(str2, jSONObject, (JSONObject) null);
        } catch (Exception unused) {
        }
    }
}
