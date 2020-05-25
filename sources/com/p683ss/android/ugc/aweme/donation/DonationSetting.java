package com.p683ss.android.ugc.aweme.donation;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.donation.DonationSetting */
public final class DonationSetting {
    public static final DonationSetting INSTANCE = new DonationSetting();
    @C10179b
    private static final Donation value = null;

    private DonationSetting() {
    }

    public final Donation getValue() {
        return value;
    }

    public final Donation get() {
        Donation donation;
        try {
            donation = (Donation) C10193n.m20607a().mo18202a(DonationSetting.class, "donation_urls", C10181b.m20511a().mo18175c().getDonationUrls(), "com.ss.android.ugc.aweme.donation.Donation", Donation.class);
        } catch (Throwable unused) {
            donation = new Donation();
        }
        if (donation == null) {
            return new Donation();
        }
        return donation;
    }
}
