package com.bytedance.android.livesdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18911h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class LiveNetworkBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    C18911h f21965a = C18911h.NONE;

    /* renamed from: b */
    private List<WeakReference<C8026a>> f21966b = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver$a */
    public interface C8026a {
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            C18911h hVar = this.f21965a;
            this.f21965a = NetworkUtils.getNetworkType(context);
            if (this.f21966b != null && hVar != this.f21965a) {
                for (WeakReference weakReference : this.f21966b) {
                    if (weakReference != null) {
                        weakReference.get();
                    }
                }
            }
        }
    }
}
