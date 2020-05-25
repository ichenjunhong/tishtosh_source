package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.settings.IDmtAVSettingsService;

/* renamed from: com.ss.android.ugc.aweme.services.IInternalAVService */
public interface IInternalAVService extends IFoundationAVService {
    IDmtAVSettingsService dmtSettingsService();

    boolean isPublishServiceRunning(Context context);
}
