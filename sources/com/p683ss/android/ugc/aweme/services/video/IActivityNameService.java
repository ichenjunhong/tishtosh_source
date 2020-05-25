package com.p683ss.android.ugc.aweme.services.video;

import android.app.Activity;

/* renamed from: com.ss.android.ugc.aweme.services.video.IActivityNameService */
public interface IActivityNameService {
    Class<? extends Activity> getDraftBoxActivity();

    Class<? extends Activity> getVideoPublishActivityClass();

    Class<? extends Activity> getVideoPublishPreviewActivityClass();

    Class<? extends Activity> getVideoRecordActivityClass();

    Class<? extends Activity> getVideoRecordPermissionActivityClass();
}
