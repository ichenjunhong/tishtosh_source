package com.p683ss.android.ugc.aweme.account.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.common.util.C18920g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.util.n */
public final class C22274n {
    /* renamed from: a */
    public static void m55129a(Activity activity, boolean z, boolean z2) {
        if (!activity.isFinishing()) {
            Intent intent = null;
            if (activity.isTaskRoot()) {
                intent = C18920g.m46046a((Context) activity, activity.getPackageName());
            }
            activity.finish();
            if (intent != null) {
                activity.startActivity(intent);
                return;
            }
            if (z) {
                activity.overridePendingTransition(R.anim.bk, R.anim.dq);
            }
        }
    }
}
