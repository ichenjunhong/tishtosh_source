package com.p683ss.android.ugc.aweme.app.p1363a;

import android.os.Bundle;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.app.a.e */
final class C22909e {
    /* renamed from: a */
    static void m56367a(User user) {
        Bundle bundle = new Bundle();
        bundle.putInt("user_mode", user.getUserMode());
        bundle.putInt("user_period", user.getUserPeriod());
        AppLog.setCustomerHeader(bundle);
    }
}
