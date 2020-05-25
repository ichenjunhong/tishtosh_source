package com.p683ss.android.ugc.aweme.video.p2392a;

import com.p683ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p683ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48523a;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48534c.C48536a;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48538d.C48540a;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48542e;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.session.C50123b;
import com.p683ss.android.ugc.playerkit.videoview.p2496b.C50136b;

/* renamed from: com.ss.android.ugc.aweme.video.a.a */
public final class C47977a implements C50136b {

    /* renamed from: a */
    private C48542e f120605a;

    /* renamed from: a */
    public final C48542e mo95135a(C50123b bVar) {
        if (this.f120605a == null && VideoBitRateABManager.m103801c().f120600b) {
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.m103801c().f120599a;
            if (rateSettingsResponse != null) {
                if (C50109a.m108068s().mo95426g() != -1.0d) {
                    this.f120605a = new C48536a(rateSettingsResponse.getAdaptiveGearGroup()).mo96022a(rateSettingsResponse.getGearSet()).mo96024b(rateSettingsResponse.getBandwidthSet()).mo96021a((C48523a) rateSettingsResponse.getAutoBitrateSet()).mo96023a();
                } else {
                    this.f120605a = new C48540a(rateSettingsResponse.getAdaptiveGearGroup()).mo96022a(rateSettingsResponse.getGearSet()).mo96024b(rateSettingsResponse.getBandwidthSet()).mo96021a((C48523a) rateSettingsResponse.getAutoBitrateSet()).mo96023a();
                }
            }
        }
        return this.f120605a;
    }
}
