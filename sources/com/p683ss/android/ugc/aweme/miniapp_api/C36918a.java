package com.p683ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.a */
public final class C36918a {
    /* renamed from: a */
    public static void m83054a(Activity activity) {
        if (activity.getIntent() != null && activity.getIntent().getData() != null) {
            Uri data = activity.getIntent().getData();
            String queryParameter = data.getQueryParameter("from");
            if (queryParameter != null && queryParameter.contains("com.tt.miniapp") && "1".equals(data.getQueryParameter("isNeedRTLAnim")) && C47842ed.m103485a(activity)) {
                activity.overridePendingTransition(0, R.anim.bv);
            }
        }
    }
}
