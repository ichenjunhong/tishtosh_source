package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class acl extends BroadcastReceiver {
    private acl(acd acd) {
    }

    /* synthetic */ acl(acd acd, aci aci) {
        this(acd);
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (aew.f40385a) {
            aew.f40386b = false;
            aew.f40387c = false;
            afc.m32798e("Ad debug logging enablement is out of date.");
        }
        abt.m32491a(context);
    }
}
