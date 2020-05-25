package com.google.android.gms.analytics;

import android.content.BroadcastReceiver.PendingResult;

/* renamed from: com.google.android.gms.analytics.e */
final class C15091e implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ PendingResult f38954a;

    C15091e(CampaignTrackingReceiver campaignTrackingReceiver, PendingResult pendingResult) {
        this.f38954a = pendingResult;
    }

    public final void run() {
        if (this.f38954a != null) {
            this.f38954a.finish();
        }
    }
}
