package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;

public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    /* renamed from: a */
    public final void mo27818a(Context context, String str) {
        synchronized (C17228x.class) {
            C17228x.f48683a = str;
        }
        C17188az.m42124a(context, "gtm_install_referrer", "referrer", str);
        C17228x.m42190a(context, str);
    }
}
