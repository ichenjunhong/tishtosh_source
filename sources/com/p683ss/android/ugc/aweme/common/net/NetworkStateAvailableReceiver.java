package com.p683ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47810dh;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetworkStateAvailableReceiver */
public final class NetworkStateAvailableReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (C52711k.m112239a((Object) "android.net.conn.CONNECTIVITY_CHANGE", (Object) intent.getAction())) {
                if (C47810dh.m103451a(context)) {
                    C47718bf.m103288a(new C26922e(true));
                    return;
                }
                C47718bf.m103288a(new C26922e(false));
            }
        }
    }
}
