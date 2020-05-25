package com.p683ss.android.ugc.aweme.shortvideo.record;

import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.d */
final /* synthetic */ class C44454d implements C19279a {

    /* renamed from: a */
    private final CameraModule f112455a;

    C44454d(CameraModule cameraModule) {
        this.f112455a = cameraModule;
    }

    /* renamed from: a */
    public final void mo39748a() {
        CameraModule cameraModule = this.f112455a;
        C45412b.m98979a().end("av_video_record_change_camera", "changeCamera#onFirstFrame");
        cameraModule.f112405f.setOnFirstFrameRefreshListener(null);
    }
}
