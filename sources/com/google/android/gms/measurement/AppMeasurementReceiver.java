package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C16995ao;
import com.google.android.gms.measurement.internal.C16998ar;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C16998ar {

    /* renamed from: a */
    private C16995ao f47851a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f47851a == null) {
            this.f47851a = new C16995ao(this);
        }
        this.f47851a.mo32892a(context, intent);
    }

    /* renamed from: a */
    public final void mo32816a(Context context, Intent intent) {
        m2042a_(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo32815a() {
        return goAsync();
    }
}
