package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && C14533n.m29764a()) {
            C13607b a = C13607b.m27474a();
            a.mo25461a(a.f35508b, a.f35508b);
        }
    }
}
