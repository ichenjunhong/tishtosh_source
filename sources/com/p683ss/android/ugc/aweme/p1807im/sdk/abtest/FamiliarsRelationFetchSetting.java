package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.RelationTypeParameters;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.FamiliarsRelationFetchSetting */
public final class FamiliarsRelationFetchSetting {
    @C10179b
    private static final FamiliarsRelationFetchConfig CONFIG = null;
    private static final FamiliarsRelationFetchConfig DEFAULT;
    public static final FamiliarsRelationFetchSetting INSTANCE = new FamiliarsRelationFetchSetting();

    private FamiliarsRelationFetchSetting() {
    }

    public final FamiliarsRelationFetchConfig getCONFIG() {
        return CONFIG;
    }

    public final FamiliarsRelationFetchConfig getDEFAULT() {
        return DEFAULT;
    }

    static {
        FamiliarsRelationFetchConfig familiarsRelationFetchConfig = new FamiliarsRelationFetchConfig(21600, new RelationTypeParameters[]{new RelationTypeParameters(19, "1-1"), new RelationTypeParameters(21, "1-2"), new RelationTypeParameters(23, "1-3")}, 3);
        DEFAULT = familiarsRelationFetchConfig;
    }

    public final FamiliarsRelationFetchConfig getFamiliarsRelationConfig() {
        try {
            Object a = C10193n.m20607a().mo18202a(FamiliarsRelationFetchSetting.class, "im_friend_relation_update_settings", C10181b.m20511a().mo18175c().getImFriendRelationUpdateSettings(), "com.ss.android.ugc.aweme.im.sdk.abtest.FamiliarsRelationFetchConfig", FamiliarsRelationFetchConfig.class);
            C52711k.m112236a(a, "SettingsManager.getInsta…FetchSetting::class.java)");
            return (FamiliarsRelationFetchConfig) a;
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
