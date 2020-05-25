package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImMTInputGifSettings */
public final class ImMTInputGifSettings {
    @C10179b
    private static final boolean DEFAULT = true;
    public static final ImMTInputGifSettings INSTANCE = new ImMTInputGifSettings();

    private ImMTInputGifSettings() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getValue() {
        return C10193n.m20607a().mo18204a(ImMTInputGifSettings.class, "im_mt_new_input_board_enable_giphy", C10181b.m20511a().mo18175c().getImMtNewInputBoardEnableGiphy(), true);
    }
}
