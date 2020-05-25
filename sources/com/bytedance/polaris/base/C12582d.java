package com.bytedance.polaris.base;

import android.content.SharedPreferences;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12648n;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.base.d */
public class C12582d {

    /* renamed from: b */
    private static volatile C12582d f33024b;

    /* renamed from: a */
    public JSONObject f33025a;

    /* renamed from: c */
    private final SharedPreferences f33026c = C35807d.m80935a(C12563i.m25215a(), "polaris_setting", 0);

    /* renamed from: d */
    private int f33027d;

    /* renamed from: a */
    public static C12582d m25254a() {
        if (f33024b == null) {
            synchronized (C12582d.class) {
                if (f33024b == null) {
                    f33024b = new C12582d();
                }
            }
        }
        return f33024b;
    }

    private C12582d() {
        try {
            this.f33027d = this.f33026c.getInt("tweak_webview_drawing_cache", -1);
            C12648n.f33227c = this.f33027d;
            try {
                this.f33025a = new JSONObject(this.f33026c.getString("polaris_app_settings", ""));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
