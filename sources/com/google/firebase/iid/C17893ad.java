package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.firebase.iid.ad */
final class C17893ad extends BroadcastReceiver {

    /* renamed from: a */
    C17891ab f49723a;

    public C17893ad(C17891ab abVar) {
        this.f49723a = abVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f49723a != null && this.f49723a.mo34731b()) {
            FirebaseInstanceId.m43846f();
            FirebaseInstanceId.m43842a((Runnable) this.f49723a, 0);
            this.f49723a.mo34730a().unregisterReceiver(this);
            this.f49723a = null;
        }
    }
}
