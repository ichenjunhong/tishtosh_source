package com.p683ss.android.ugc.aweme.commercialize.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.p683ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.settings.AwemeAdRankSettings */
public final class AwemeAdRankSettings {
    @C10179b(mo18165a = true)
    private static final AwemeAdRankSettingsModel DISABLE = AwemeAdRankSettingsModel.DEFAULT_DISABLE_VERSION;
    public static final AwemeAdRankSettings INSTANCE = new AwemeAdRankSettings();

    private AwemeAdRankSettings() {
    }

    public final AwemeAdRankSettingsModel getDISABLE() {
        return DISABLE;
    }

    public static final AwemeAdRankSettingsModel get() {
        try {
            Object a = C10193n.m20607a().mo18202a(AwemeAdRankSettings.class, "aweme_ad_rank", C10181b.m20511a().mo18175c().getAwemeAdRank(), "com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel", AwemeAdRankSettingsModel.class);
            C52711k.m112236a(a, "SettingsManager.getInsta…RankSettings::class.java)");
            return (AwemeAdRankSettingsModel) a;
        } catch (Throwable unused) {
            return DISABLE;
        }
    }
}
