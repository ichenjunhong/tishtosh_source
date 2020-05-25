package com.p683ss.android.ugc.trill.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.trill.settings.ContentLangLimitSettings */
public final class ContentLangLimitSettings {
    public static final ContentLangLimitSettings INSTANCE = new ContentLangLimitSettings();
    @C10179b
    private static final int contentLangLimit = 5;

    private ContentLangLimitSettings() {
    }

    public final int getContentLangLimit() {
        return contentLangLimit;
    }

    public static final int getContentLangLimitSetting() {
        try {
            return C10193n.m20607a().mo18200a(ContentLangLimitSettings.class, "content_lang_limit", C10181b.m20511a().mo18175c().getContentLangLimit(), 5);
        } catch (Throwable unused) {
            return 5;
        }
    }
}
