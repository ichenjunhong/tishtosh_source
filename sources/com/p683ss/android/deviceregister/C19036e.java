package com.p683ss.android.deviceregister;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lancet.C18972b;
import com.p683ss.android.ugc.aweme.lancet.C18983d;
import java.util.Map;

/* renamed from: com.ss.android.deviceregister.e */
final class C19036e {
    /* renamed from: a */
    static String m46328a() {
        if (!C18983d.f52289a) {
            AwemeApplication a = AwemeApplication.m56199a();
            if (a != null) {
                return C35807d.m80935a(a, C19002a.m46175a(), 0).getString("install_id", "");
            }
        }
        return C19034d.m46320b();
    }

    /* renamed from: a */
    static void m46329a(Map map) {
        if (!C18972b.f52275c) {
            AwemeApplication a = AwemeApplication.m56199a();
            if (a != null) {
                SharedPreferences a2 = C35807d.m80935a(a, C19002a.m46175a(), 0);
                String string = a2.getString("device_id", "");
                if (!TextUtils.isEmpty(string)) {
                    map.put("device_id", string);
                }
                String string2 = a2.getString("install_id", "");
                if (!TextUtils.isEmpty(string2)) {
                    map.put("install_id", string2);
                }
                String string3 = C35807d.m80935a(a, C19002a.m46177c(), 0).getString("openudid", null);
                if (!TextUtils.isEmpty(string3)) {
                    map.put("openudid", string3);
                }
            }
        }
        C19034d.m46322b(map);
    }

    /* renamed from: b */
    static String m46330b() {
        if (!C18972b.f52275c) {
            AwemeApplication a = AwemeApplication.m56199a();
            if (a != null) {
                return C35807d.m80935a(a, C19002a.m46175a(), 0).getString("device_id", "");
            }
        }
        return C19034d.m46325d();
    }
}
