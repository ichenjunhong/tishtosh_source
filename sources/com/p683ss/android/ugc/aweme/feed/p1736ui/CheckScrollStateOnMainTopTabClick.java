package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.ui.CheckScrollStateOnMainTopTabClick */
public final class CheckScrollStateOnMainTopTabClick {
    @C10179b(mo18165a = true)
    private static final int ENABLE = 1;
    public static final CheckScrollStateOnMainTopTabClick INSTANCE = new CheckScrollStateOnMainTopTabClick();

    private CheckScrollStateOnMainTopTabClick() {
    }

    public final int getENABLE() {
        return ENABLE;
    }

    public static final boolean enabled() {
        if (C10193n.m20607a().mo18200a(CheckScrollStateOnMainTopTabClick.class, "check_scroll_state_on_main_top_tab_click", C10181b.m20511a().mo18175c().getCheckScrollStateOnMainTopTabClick(), 1) == ENABLE) {
            return true;
        }
        return false;
    }
}
