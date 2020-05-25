package com.p683ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.util.p2386a.C47613b;
import java.util.Calendar;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.util.v */
public final /* synthetic */ class C47643v implements Callable {

    /* renamed from: a */
    public static final Callable f120115a = new C47643v();

    private C47643v() {
    }

    public final Object call() {
        if (!C47613b.m103089c()) {
            int i = C47613b.m103086a().getInt("many_days_viewed_count", 0) + 1;
            if (i == 1) {
                C47611a.m103066a("F1", null, null);
                C47611a.m103070b("F1", null, null);
            } else if (i == 10) {
                C47611a.m103066a("F10", null, null);
                C47611a.m103070b("F10", null, null);
            }
            C47613b.m103088b().putInt("many_days_viewed_count", i).apply();
            if (i >= 30 && !C47613b.m103086a().getBoolean("has_reported_viewed_30_many_days", false)) {
                if (C35837h.m80982g()) {
                    C47611a.m103064a("af_vvfinish_allday30");
                }
                C47613b.m103088b().putBoolean("has_reported_viewed_30_many_days", true).apply();
                C47611a.m103066a("F30", null, null);
                C47611a.m103070b("F30", null, null);
            }
            if (i >= 50 && !C47613b.m103089c()) {
                if (C35837h.m80982g()) {
                    C47611a.m103064a("af_vvfinish_allday50");
                }
                C47613b.m103088b().putBoolean("has_reported_viewed_50_many_days", true).apply();
                C47611a.m103066a("F50", null, null);
                C47611a.m103070b("F50", null, null);
            }
        }
        if (C35837h.m80982g()) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(instance.getTimeInMillis());
            String sb2 = sb.toString();
            String string = C47613b.m103086a().getString("current_data", "");
            int i2 = C47613b.m103086a().getInt("one_day_viewed_count", 0);
            if (!TextUtils.equals(sb2, string)) {
                C47613b.m103087a(0);
                C47613b.m103088b().putString("current_data", sb2).apply();
                i2 = 0;
            }
            int i3 = i2 + 1;
            C47613b.m103087a(i3);
            if (i3 >= 30 && !C47613b.m103086a().getBoolean("has_reported_viewed_30_one_day", false)) {
                C47611a.m103064a("af_vvfinish_aday30");
                C47613b.m103088b().putBoolean("has_reported_viewed_30_one_day", true).apply();
            }
            if (i3 >= 50 && !C47613b.m103086a().getBoolean("has_reported_viewed_50_one_day", false)) {
                C47611a.m103064a("af_vvfinish_aday50");
                C47613b.m103088b().putBoolean("has_reported_viewed_50_one_day", true).apply();
            }
        }
        return null;
    }
}
