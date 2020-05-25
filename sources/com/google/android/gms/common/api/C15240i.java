package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;

/* renamed from: com.google.android.gms.common.api.i */
public final class C15240i extends C15227b {
    public C15240i(Status status) {
        super(status);
    }

    public final void startResolutionForResult(Activity activity, int i) throws SendIntentException {
        Status status = this.f39281a;
        if (status.mo28059b()) {
            activity.startIntentSenderForResult(status.f39274i.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final PendingIntent getResolution() {
        return this.f39281a.f39274i;
    }
}
