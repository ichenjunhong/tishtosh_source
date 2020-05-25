package com.google.firebase.iid;

import android.content.Intent;

public class FirebaseInstanceIdService extends zzb {
    public void onTokenRefresh() {
    }

    /* access modifiers changed from: protected */
    public final Intent zzb(Intent intent) {
        return (Intent) C17941y.m43971a().f49821a.poll();
    }

    public final void zzd(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            onTokenRefresh();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m43841a().mo34722g();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId a = FirebaseInstanceId.m43841a();
                FirebaseInstanceId.f49695a.mo34798c("");
                a.mo34720c();
            }
        }
    }
}
