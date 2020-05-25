package com.bytedance.router.route;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

public class ServiceRoute extends SysComponentRoute {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_push_downgrade_StartServiceLancet_startService */
        static ComponentName m25712x297a088e(Context context, Intent intent) {
            if (context == null || !(context instanceof Context)) {
                return context.startService(intent);
            }
            if (C40895d.m90464a(context, intent)) {
                return null;
            }
            return context.startService(intent);
        }
    }

    public void openComponent(Context context, Intent intent) {
        _lancet.m25712x297a088e(context, intent);
    }
}
