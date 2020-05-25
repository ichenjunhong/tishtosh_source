package com.p683ss.android.ugc.aweme.util.p2386a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.util.a.b */
public final class C47613b {
    /* renamed from: a */
    public static SharedPreferences m103086a() {
        return C35807d.m80935a(AwemeApplication.m56199a(), "video_view_count_sp", 0);
    }

    /* renamed from: b */
    public static Editor m103088b() {
        return m103086a().edit();
    }

    /* renamed from: c */
    public static boolean m103089c() {
        return m103086a().getBoolean("has_reported_viewed_50_many_days", false);
    }

    /* renamed from: a */
    public static void m103087a(int i) {
        m103088b().putInt("one_day_viewed_count", i).apply();
    }
}
