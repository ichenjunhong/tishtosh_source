package com.p683ss.android.ugc.aweme.friends.utils;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.friends.utils.AddressbookUploadIntervalSettings */
public final class AddressbookUploadIntervalSettings {
    @C10179b
    private static final long ADDRESSBOOK_UPLOAD_INTERVAL = ADDRESSBOOK_UPLOAD_INTERVAL;
    public static final AddressbookUploadIntervalSettings INSTANCE = new AddressbookUploadIntervalSettings();

    private AddressbookUploadIntervalSettings() {
    }

    public final long getADDRESSBOOK_UPLOAD_INTERVAL() {
        return ADDRESSBOOK_UPLOAD_INTERVAL;
    }
}
