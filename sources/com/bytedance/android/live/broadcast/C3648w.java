package com.bytedance.android.live.broadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.live.broadcast.w */
final /* synthetic */ class C3648w implements OnDismissListener {

    /* renamed from: a */
    private final StartLiveActivityProxy f10381a;

    C3648w(StartLiveActivityProxy startLiveActivityProxy) {
        this.f10381a = startLiveActivityProxy;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        StartLiveActivityProxy startLiveActivityProxy = this.f10381a;
        if (!C3617q.INST.isLoadedRes()) {
            startLiveActivityProxy.f23571d.finish();
        }
    }
}
