package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.p683ss.android.ugc.aweme.port.p2082in.C39645w.C39646a;
import dmt.p2652av.video.superentrance.C53002a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cz */
final /* synthetic */ class C45155cz implements C39646a {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f114269a;

    C45155cz(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f114269a = videoRecordPermissionActivity;
    }

    /* renamed from: a */
    public final void mo80715a(String[] strArr, int[] iArr) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f114269a;
        C53002a.m112726a(strArr, iArr);
        if (iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
            VideoRecordPermissionActivity.m98267c();
            return;
        }
        for (int i : iArr) {
            if (i == -1) {
                videoRecordPermissionActivity.f113808a.mo91703a(new C45164dg(videoRecordPermissionActivity));
                return;
            }
        }
        videoRecordPermissionActivity.mo91215d();
    }
}
