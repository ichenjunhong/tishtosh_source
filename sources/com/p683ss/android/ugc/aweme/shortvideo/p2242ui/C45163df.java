package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.df */
final /* synthetic */ class C45163df implements OnCancelListener {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f114278a;

    C45163df(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f114278a = videoRecordPermissionActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f114278a;
        VideoRecordPermissionActivity.m98267c();
        videoRecordPermissionActivity.finish();
    }
}
