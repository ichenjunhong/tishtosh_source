package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.GoogleMultiLoginExperiment */
public final class GoogleMultiLoginExperiment {
    @C10179b
    private static final boolean ENABLED = false;
    public static final GoogleMultiLoginExperiment INSTANCE = new GoogleMultiLoginExperiment();

    private GoogleMultiLoginExperiment() {
    }

    public final boolean getENABLED() {
        return ENABLED;
    }

    public final boolean isEnabled() {
        try {
            return C10193n.m20607a().mo18204a(GoogleMultiLoginExperiment.class, "google_multi_login", C10181b.m20511a().mo18175c().getGoogleMultiLogin(), false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
