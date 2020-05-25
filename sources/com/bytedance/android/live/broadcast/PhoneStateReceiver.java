package com.bytedance.android.live.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PhoneStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C3021a f8897a;

    /* renamed from: com.bytedance.android.live.broadcast.PhoneStateReceiver$a */
    public interface C3021a {
        /* renamed from: a */
        void mo8209a(String str);
    }

    public PhoneStateReceiver(C3021a aVar) {
        this.f8897a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            this.f8897a.mo8209a(intent.getStringExtra("state"));
        }
    }
}
