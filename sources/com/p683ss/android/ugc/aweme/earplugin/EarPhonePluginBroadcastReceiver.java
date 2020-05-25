package com.p683ss.android.ugc.aweme.earplugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.p2033o.p2034a.C38464a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.earplugin.EarPhonePluginBroadcastReceiver */
public final class EarPhonePluginBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        if (C52711k.m112239a((Object) intent.getAction(), (Object) "android.intent.action.HEADSET_PLUG")) {
            switch (intent.getIntExtra("state", 0)) {
                case 0:
                    C47718bf.m103288a(new C38464a(false));
                    return;
                case 1:
                    C47718bf.m103288a(new C38464a(true));
                    break;
            }
            return;
        }
        if (C52711k.m112239a((Object) intent.getAction(), (Object) "android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            if (intExtra == 0) {
                C47718bf.m103288a(new C38464a(false));
            } else if (intExtra == 2) {
                C47718bf.m103288a(new C38464a(true));
            }
        }
    }
}
