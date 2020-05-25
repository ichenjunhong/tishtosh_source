package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ttnet.hostmonitor.ConnectivityReceiver;
import com.p683ss.android.ugc.aweme.C27985v;
import com.p683ss.android.ugc.aweme.common.net.NetworkReceiver;
import com.p683ss.android.ugc.aweme.earplugin.EarPhonePluginBroadcastReceiver;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.app.BaseInitAllService$2 */
class BaseInitAllService$2 implements LegoTask {
    final /* synthetic */ C23139s this$0;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    BaseInitAllService$2(C23139s sVar) {
        this.this$0 = sVar;
    }

    public void run(Context context) {
        C27985v vVar = new C27985v();
        if (context != null && VERSION.SDK_INT >= 26) {
            vVar.mo56384a(context, new NetworkReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
            vVar.mo56384a(context, new ConnectivityReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
            vVar.mo56384a(context, new EarPhonePluginBroadcastReceiver(), new String[]{"android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.intent.action.HEADSET_PLUG"});
        }
    }
}
