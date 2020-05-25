package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45435f;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dc */
final /* synthetic */ class C45160dc implements C52671b {

    /* renamed from: a */
    private final VideoRecordPermissionActivity f114274a;

    C45160dc(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f114274a = videoRecordPermissionActivity;
    }

    public final Object invoke(Object obj) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f114274a;
        C45435f.m99015a((Activity) videoRecordPermissionActivity, videoRecordPermissionActivity.getIntent(), (List) obj);
        videoRecordPermissionActivity.finish();
        return C52860x.f131107a;
    }
}
