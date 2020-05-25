package com.p683ss.android.pushmanager.setting;

import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C19707a;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C19708b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.setting.b */
public class C19710b {

    /* renamed from: a */
    public static final String f54260a = "b";

    /* renamed from: c */
    private static C19710b f54261c;

    /* renamed from: b */
    public C19708b f54262b = PushMultiProcessSharedProvider.m48146a(C19408a.m47500a());

    private C19710b() {
    }

    /* renamed from: m */
    public static String m48175m() {
        return C19709a.m48167a().mo41085b();
    }

    /* renamed from: u */
    private boolean m48176u() {
        return this.f54262b.mo41082a("key_is_miui_close_daemon", true);
    }

    /* renamed from: d */
    public final String mo41095d() {
        return this.f54262b.mo41081a("loc", "");
    }

    /* renamed from: f */
    public final String mo41097f() {
        return this.f54262b.mo41081a("uninstall_question_url", "");
    }

    /* renamed from: g */
    public final boolean mo41098g() {
        return this.f54262b.mo41082a("allow_push_job_service", true);
    }

    /* renamed from: i */
    public final boolean mo41100i() {
        return this.f54262b.mo41082a("allow_close_boot_receiver", true);
    }

    /* renamed from: j */
    public final boolean mo41101j() {
        if (mo41094c() || !mo41093b()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final String mo41103l() {
        return this.f54262b.mo41081a("push_channels_json_array", "");
    }

    /* renamed from: n */
    public final boolean mo41104n() {
        return this.f54262b.mo41082a("allow_off_alive", true);
    }

    /* renamed from: o */
    public final boolean mo41105o() {
        return this.f54262b.mo41082a("allow_settings_notify_enable", true);
    }

    /* renamed from: p */
    public final boolean mo41106p() {
        return this.f54262b.mo41082a("is_receiver_message_wakeup_screen", false);
    }

    /* renamed from: q */
    public final int mo41107q() {
        return this.f54262b.mo41078a("receiver_message_wakeup_screen_time", 5000);
    }

    /* renamed from: r */
    public final boolean mo41108r() {
        return this.f54262b.mo41082a("is_use_start_foreground_notification", true);
    }

    /* renamed from: s */
    public final int mo41109s() {
        return this.f54262b.mo41078a("job_schedule_wake_up_interval_second", 3600);
    }

    /* renamed from: t */
    public final boolean mo41110t() {
        return this.f54262b.mo41082a("is_use_c_native_process_keep_alive", true);
    }

    /* renamed from: a */
    public static C19710b m48173a() {
        if (f54261c == null) {
            synchronized (C19710b.class) {
                if (f54261c == null) {
                    f54261c = new C19710b();
                }
            }
        }
        return f54261c;
    }

    /* renamed from: b */
    public final boolean mo41093b() {
        return this.f54262b.mo41082a("shut_push_on_stop_service", false);
    }

    /* renamed from: c */
    public final boolean mo41094c() {
        if (!this.f54262b.mo41082a("push_notify_enable", true) || !mo41105o()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo41099h() {
        if (!C18920g.m46054c() || !m48176u()) {
            return this.f54262b.mo41082a("allow_push_daemon_monitor", true);
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo41102k() {
        if (!this.f54262b.mo41082a("allow_self_push_enable", false) || !mo41094c()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Pair<Double, Double> mo41096e() {
        try {
            String d = mo41095d();
            if (C9431p.m18664a(d)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d);
            Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            return new Pair<>(Double.valueOf(jSONObject.optDouble("lon")), Double.valueOf(jSONObject.optDouble("lat")));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m48174a(Map<String, String> map) {
        C19709a.m48167a().mo41086b(map);
    }

    /* renamed from: b */
    public final void mo41092b(boolean z) {
        this.f54262b.mo41080a().mo41075a("last_send_notify_enable_is_succ", z).mo41076a();
    }

    /* renamed from: a */
    public final void mo41089a(String str) {
        this.f54262b.mo41080a().mo41074a("push_daemon_monitor_result", str).mo41076a();
    }

    /* renamed from: a */
    public final void mo41090a(boolean z) {
        this.f54262b.mo41080a().mo41075a("allow_off_alive", z).mo41076a();
    }

    /* renamed from: b */
    public final void mo41091b(Map<String, ?> map) {
        try {
            C19707a a = this.f54262b.mo41080a();
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        a.mo41072a((String) entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a.mo41073a((String) entry.getKey(), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        a.f54253b.put((String) entry.getKey(), Float.valueOf(((Float) value).floatValue()));
                    } else if (value instanceof Boolean) {
                        a.mo41075a((String) entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        a.mo41074a((String) entry.getKey(), (String) value);
                    }
                }
                a.mo41077b();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final String mo41088a(String str, String str2) {
        return this.f54262b.mo41081a(str, str2);
    }
}
