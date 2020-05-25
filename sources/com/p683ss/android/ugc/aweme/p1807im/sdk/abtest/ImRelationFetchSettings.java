package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImRelationFetchSettings */
public final class ImRelationFetchSettings {
    private static final RelationFetchFrequencyConfig DEFAULT;
    public static final ImRelationFetchSettings INSTANCE = new ImRelationFetchSettings();
    @C10179b
    private static final RelationFetchFrequencyConfig config = null;

    private ImRelationFetchSettings() {
    }

    public final RelationFetchFrequencyConfig getConfig() {
        return config;
    }

    public final RelationFetchFrequencyConfig getDEFAULT() {
        return DEFAULT;
    }

    static {
        RelationFetchFrequencyConfig relationFetchFrequencyConfig = new RelationFetchFrequencyConfig(259200, 0, 0, 0);
        DEFAULT = relationFetchFrequencyConfig;
    }

    public final RelationFetchFrequencyConfig getRelationFetchFreqConfig() {
        try {
            Object a = C10193n.m20607a().mo18202a(ImRelationFetchSettings.class, "im_contact_update_freq", C10181b.m20511a().mo18175c().getImContactUpdateFreq(), "com.ss.android.ugc.aweme.im.sdk.abtest.RelationFetchFrequencyConfig", RelationFetchFrequencyConfig.class);
            C52711k.m112236a(a, "SettingsManager.getInsta…etchSettings::class.java)");
            return (RelationFetchFrequencyConfig) a;
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
