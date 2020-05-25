package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    public Context f39645a;

    /* renamed from: b */
    private final C15279bh f39646b;

    public zabq(C15279bh bhVar) {
        this.f39646b = bhVar;
    }

    /* renamed from: a */
    public final synchronized void mo28298a() {
        if (this.f39645a != null) {
            this.f39645a.unregisterReceiver(this);
        }
        this.f39645a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f39646b.mo28181a();
            mo28298a();
        }
    }
}
