package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.DataPrefetchWhiteList */
public final class DataPrefetchWhiteList {
    public static final DataPrefetchWhiteList INSTANCE = new DataPrefetchWhiteList();
    @C10179b
    private static final String[] prefetchWhiteList = null;

    private DataPrefetchWhiteList() {
    }

    public final String[] getPrefetchWhiteList() {
        return prefetchWhiteList;
    }
}
