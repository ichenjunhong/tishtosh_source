package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C16995ao;
import com.google.android.gms.measurement.internal.C16998ar;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C16998ar {

    /* renamed from: a */
    private C16995ao f47849a;

    /* renamed from: a */
    public final void mo32816a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f47849a == null) {
            this.f47849a = new C16995ao(this);
        }
        this.f47849a.mo32892a(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo32815a() {
        return goAsync();
    }
}
