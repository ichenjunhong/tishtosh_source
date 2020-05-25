package com.p683ss.android.ugc.aweme.profile.util;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.profile.util.ProfileFavoriteUndiggOptimizeSetting */
public final class ProfileFavoriteUndiggOptimizeSetting {
    @C10179b
    public static final boolean ENABLE = true;
    public static final ProfileFavoriteUndiggOptimizeSetting INSTANCE = new ProfileFavoriteUndiggOptimizeSetting();

    private ProfileFavoriteUndiggOptimizeSetting() {
    }

    public static final boolean enabled() {
        return C10193n.m20607a().mo18204a(ProfileFavoriteUndiggOptimizeSetting.class, "profile_favorite_undigg_optimize_setting", C10181b.m20511a().mo18175c().getProfileFavoriteUndiggOptimizeSetting(), true);
    }
}
