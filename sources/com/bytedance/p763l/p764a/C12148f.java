package com.bytedance.p763l.p764a;

import android.content.SharedPreferences;
import com.bytedance.p763l.C12152c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.l.a.f */
public class C12148f {

    /* renamed from: a */
    private static volatile C12148f f32067a;

    /* renamed from: b */
    private SharedPreferences f32068b = C35807d.m80935a(C12152c.m24592a(), "app_bundle_session_ids", 0);

    /* renamed from: a */
    public static C12148f m24584a() {
        if (f32067a == null) {
            synchronized (C12148f.class) {
                if (f32067a == null) {
                    f32067a = new C12148f();
                }
            }
        }
        return f32067a;
    }

    private C12148f() {
        if (C12152c.m24596b().mo23049b() != this.f32068b.getInt("app_version_code", -1)) {
            this.f32068b.edit().clear().apply();
        }
    }

    /* renamed from: a */
    public final int mo23061a(String str) {
        return this.f32068b.getInt(str, -1);
    }

    /* renamed from: a */
    public final void mo23062a(String str, int i) {
        this.f32068b.edit().putInt(str, i).apply();
    }
}
