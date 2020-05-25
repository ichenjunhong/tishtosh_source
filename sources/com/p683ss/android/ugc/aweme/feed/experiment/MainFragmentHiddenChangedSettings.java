package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.MainFragmentHiddenChangedSettings */
public final class MainFragmentHiddenChangedSettings {
    @C10179b
    public static final boolean DEFAULT = false;
    public static final MainFragmentHiddenChangedSettings INSTANCE = new MainFragmentHiddenChangedSettings();

    private MainFragmentHiddenChangedSettings() {
    }

    public final boolean isEnable() {
        return C10193n.m20607a().mo18204a(MainFragmentHiddenChangedSettings.class, "mainfragment_hidden_changed_switch", C10181b.m20511a().mo18175c().getMainfragmentHiddenChangedSwitch(), false);
    }
}
