package com.p683ss.android.ugc.trill.facebook;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.trill.facebook.FBAppLinksSetting */
public final class FBAppLinksSetting {
    public static final FBAppLinksSetting INSTANCE = new FBAppLinksSetting();
    @C10179b
    private static final boolean VALUE = true;

    private FBAppLinksSetting() {
    }

    public final boolean getVALUE() {
        return VALUE;
    }

    public static final boolean isAppLinksEnable() {
        return C10193n.m20607a().mo18204a(FBAppLinksSetting.class, "fb_ddl_switch", C10181b.m20511a().mo18175c().getFbDdlSwitch(), true);
    }
}
