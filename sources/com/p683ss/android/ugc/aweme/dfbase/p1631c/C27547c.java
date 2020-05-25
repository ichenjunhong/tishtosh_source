package com.p683ss.android.ugc.aweme.dfbase.p1631c;

import com.bytedance.p763l.p765b.C12150a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27560o;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.dfbase.c.c */
public final class C27547c {
    static {
        C27560o.m66233c();
    }

    /* renamed from: a */
    public static int m66212a(int i) {
        if (i == 8) {
            return 2;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
                return 3;
            case 5:
                return 1;
            default:
                return 4;
        }
    }

    /* renamed from: a */
    public static void m66213a(C27538a aVar, int i) {
        int i2;
        if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (C27558m.m66230d(aVar.f72398b)) {
                    jSONObject.put(LeakCanaryFileProvider.f132049i, "df_language");
                    Locale locale = aVar.f72410n;
                    if (locale != null) {
                        jSONObject.put("language", locale.getLanguage());
                    }
                } else {
                    jSONObject.put(LeakCanaryFileProvider.f132049i, aVar.f72397a);
                    jSONObject.put("dependent_modules", aVar.mo55984b());
                    jSONObject.put("is_all_dependent_modules_installed", aVar.mo55985c());
                }
                jSONObject.put("result_code", i);
                jSONObject.put("task_type", aVar.f72405i);
                C26890h.m65014b("df_click_permission_dialog", jSONObject);
                String str = "df_click_permission_dialog";
                if (i == 0) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                C23569o.m57776a(str, i2, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m66216a(C27538a aVar, C12150a aVar2) {
        String str;
        if (aVar2 != null && aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (C27558m.m66230d(aVar.f72398b)) {
                    jSONObject.put(LeakCanaryFileProvider.f132049i, "df_language");
                    Locale locale = aVar.f72410n;
                    if (locale != null) {
                        jSONObject.put("language", locale.getLanguage());
                    }
                } else {
                    jSONObject.put(LeakCanaryFileProvider.f132049i, aVar.f72397a);
                    jSONObject.put("dependent_modules", aVar.mo55984b());
                    jSONObject.put("is_all_dependent_modules_installed", aVar.mo55985c());
                }
                jSONObject.put("status", aVar2.f32071c);
                jSONObject.put("task_type", aVar.f72405i);
                jSONObject.put("is_silent_install", aVar.f72403g);
                if (aVar2.f32071c == 2) {
                    long j = aVar2.f32073e;
                    long j2 = aVar2.f32072d;
                    jSONObject.put("bytes_downloaded", j);
                    jSONObject.put("bytes_to_download", j2);
                    if (j == j2) {
                        jSONObject.put("download_time", aVar2.f32074f);
                    }
                } else if (aVar2.f32071c == 6 || aVar2.f32071c == 0) {
                    jSONObject.put("error_code", aVar2.f32075g);
                    String str2 = "error_msg";
                    if (aVar2.f32077i != null) {
                        str = aVar2.f32077i.getMessage();
                    } else {
                        str = "";
                    }
                    jSONObject.put(str2, str);
                    jSONObject.put("internal_size", C27543a.m66207b());
                    jSONObject.put("external_size", C27543a.m66208c());
                    jSONObject.put("is_external_storage", C27543a.m66204a());
                }
                C26890h.m65014b("df_state_change", jSONObject);
                C23569o.m57776a("df_state_change", aVar2.f32071c, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m66214a(C27538a aVar, int i, String str) {
        if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LeakCanaryFileProvider.f132049i, aVar.f72397a);
                jSONObject.put("dependent_modules", aVar.mo55984b());
                jSONObject.put("is_all_dependent_modules_installed", aVar.mo55985c());
                jSONObject.put("operation", i);
                jSONObject.put("task_type", aVar.f72405i);
                jSONObject.put("is_silent_install", aVar.f72403g);
                jSONObject.put("extra_info", str);
                C26890h.m65014b("df_downloader_op", jSONObject);
                C23569o.m57776a("df_downloader_op", i, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m66215a(C27538a aVar, int i, boolean z) {
        if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (C27558m.m66230d(aVar.f72398b)) {
                    jSONObject.put(LeakCanaryFileProvider.f132049i, "df_language");
                    Locale locale = aVar.f72410n;
                    if (locale != null) {
                        jSONObject.put("language", locale.getLanguage());
                    }
                } else {
                    jSONObject.put(LeakCanaryFileProvider.f132049i, aVar.f72397a);
                    jSONObject.put("dependent_modules", aVar.mo55984b());
                    jSONObject.put("is_all_dependent_modules_installed", aVar.mo55985c());
                }
                jSONObject.put("status", i);
                jSONObject.put("task_type", aVar.f72405i);
                jSONObject.put("is_silent_install", aVar.f72403g);
                jSONObject.put("is_regain_install", z);
                C26890h.m65014b("df_install", jSONObject);
                C23569o.m57776a("df_install", m66212a(i), jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
