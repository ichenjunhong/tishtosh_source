package com.p683ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;
import com.p683ss.android.ugc.aweme.utils.C47810dh;
import com.p683ss.android.ugc.aweme.utils.C47810dh.C47811a;
import org.greenrobot.eventbus.C53755c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetworkReceiver */
public class NetworkReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C47811a b = C47810dh.m103452b(context);
        if (C32462a.f84536a != null) {
            C32462a.f84536a = b;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            boolean z = false;
            if (!C47810dh.m103451a(context)) {
                C53755c.m114319a().mo112960d(new C26923f(0));
            } else if (C47810dh.m103453c(context)) {
                C53755c.m114319a().mo112960d(new C26923f(2));
            } else {
                C52711k.m112240b(context, "context");
                C47811a b2 = C47810dh.m103452b(context);
                if (C47811a.MOBILE_2G == b2 || C47811a.MOBILE_3G == b2 || C47811a.MOBILE_4G == b2 || C47811a.MOBILE == b2) {
                    z = true;
                }
                if (z) {
                    C53755c.m114319a().mo112960d(new C26923f(1));
                }
            }
        }
    }
}
