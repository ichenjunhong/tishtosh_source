package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class zzbee extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ acd f46236a;

    private zzbee(acd acd) {
        this.f46236a = acd;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f46236a.f40250f = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f46236a.f40250f = false;
        }
    }

    public /* synthetic */ zzbee(acd acd, aci aci) {
        this(acd);
    }
}
