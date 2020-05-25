package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.AllowLongVideo */
public final class AllowLongVideo {
    private static final boolean ALLOW = true;
    @C10179b(mo18165a = true)
    private static final boolean DISALLOW = false;
    public static final AllowLongVideo INSTANCE = new AllowLongVideo();

    private AllowLongVideo() {
    }

    public static /* synthetic */ void ALLOW$annotations() {
    }

    public static /* synthetic */ void DISALLOW$annotations() {
    }

    public final boolean getALLOW() {
        return ALLOW;
    }

    public final boolean getDISALLOW() {
        return DISALLOW;
    }

    public final boolean allow() {
        return C10193n.m20607a().mo18204a(AllowLongVideo.class, "allow_long_video", C10181b.m20511a().mo18175c().getAllowLongVideo(), false);
    }
}
