package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.de */
final /* synthetic */ class C45162de implements OnClickListener {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f114276a;

    /* renamed from: b */
    private final boolean f114277b;

    C45162de(VideoRecordPermissionActivity videoRecordPermissionActivity, boolean z) {
        this.f114276a = videoRecordPermissionActivity;
        this.f114277b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f114276a;
        if (this.f114277b) {
            C39618d.f101145I.mo58605c().mo49441d(videoRecordPermissionActivity);
            videoRecordPermissionActivity.finish();
            return;
        }
        videoRecordPermissionActivity.mo91214b();
    }
}
