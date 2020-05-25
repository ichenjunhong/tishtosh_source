package com.p683ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45435f;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 implements C39598a {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;

    public final void onCancel() {
    }

    public final void onSuccess() {
        C45435f.m99022b(this.$context, this.$intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(Activity activity, Intent intent) {
        this.$context = activity;
        this.$intent = intent;
    }
}
