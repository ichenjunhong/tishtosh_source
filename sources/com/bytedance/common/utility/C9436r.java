package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p668d.C10699e;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.GlobalTips;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.bytedance.common.utility.r */
final class C9436r {
    /* renamed from: a */
    static void m18697a(Context context, int i) {
        if (context != null) {
            String str = null;
            if (C41549aq.m91378a().f105250d != null) {
                str = (String) GlobalTips.buildGlobalTipsMap(C41549aq.m91378a().f105250d).get(i);
            }
            if (TextUtils.isEmpty(str)) {
                str = context.getString(i);
            }
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                C10691a.m21551c(context, str).mo19066a();
            } else {
                C10699e.m21568b().mo19074a(context, str, 1).mo19075a();
            }
        }
    }

    /* renamed from: a */
    static void m18698a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}
