package com.p683ss.android.ugc.aweme.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.C22927af;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.util.n */
public final class C47631n {

    /* renamed from: a */
    private static final boolean f120098a = false;

    /* renamed from: a */
    public static void m103118a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C22927af.m56377a().mo47702a(str);
            C35807d.m80935a(context, "test_data", 0).edit().putString("host", str).apply();
            C10691a.m21548c(context.getApplicationContext(), (int) R.string.azs).mo19066a();
            return;
        }
        C22927af.m56377a().mo47702a("");
        C35807d.m80935a(context, "test_data", 0).edit().putString("host", "").apply();
        C10691a.m21548c(context.getApplicationContext(), (int) R.string.azp).mo19066a();
    }
}
