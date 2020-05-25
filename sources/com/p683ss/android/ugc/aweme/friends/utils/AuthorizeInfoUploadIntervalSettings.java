package com.p683ss.android.ugc.aweme.friends.utils;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.friends.utils.AuthorizeInfoUploadIntervalSettings */
public final class AuthorizeInfoUploadIntervalSettings {
    @C10179b
    private static final long AUTHORIZE_INFO_UPLOAD_INTERVAL = AUTHORIZE_INFO_UPLOAD_INTERVAL;
    public static final AuthorizeInfoUploadIntervalSettings INSTANCE = new AuthorizeInfoUploadIntervalSettings();

    private AuthorizeInfoUploadIntervalSettings() {
    }

    public final long getAUTHORIZE_INFO_UPLOAD_INTERVAL() {
        return AUTHORIZE_INFO_UPLOAD_INTERVAL;
    }
}
