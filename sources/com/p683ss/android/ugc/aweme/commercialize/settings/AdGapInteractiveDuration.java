package com.p683ss.android.ugc.aweme.commercialize.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.settings.AdGapInteractiveDuration */
public final class AdGapInteractiveDuration {
    @C10179b
    private static final int DEFAULT = 0;
    public static final AdGapInteractiveDuration INSTANCE = new AdGapInteractiveDuration();

    private AdGapInteractiveDuration() {
    }

    public static /* synthetic */ void duration$annotations() {
    }

    public static /* synthetic */ void isEnable$annotations() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isEnable() {
        if (getDuration() > DEFAULT) {
            return true;
        }
        return false;
    }

    public static final int getDuration() {
        try {
            return C10193n.m20607a().mo18200a(AdGapInteractiveDuration.class, "ad_gap_interactive_duration", C10181b.m20511a().mo18175c().getAdGapInteractiveDuration(), 0);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
