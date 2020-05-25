package com.p683ss.android.ugc.aweme.services.video;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45435f;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 implements C39598a {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;

    public final void onCancel() {
    }

    public final void onSuccess() {
        C45435f.m99017a(this.$context, this.$intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(Context context, Intent intent) {
        this.$context = context;
        this.$intent = intent;
    }
}
