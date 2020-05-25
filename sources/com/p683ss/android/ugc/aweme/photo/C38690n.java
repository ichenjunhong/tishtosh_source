package com.p683ss.android.ugc.aweme.photo;

import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.ttuploader.TTImageInfo;
import com.p683ss.ttuploader.TTImageUploader;
import com.p683ss.ttuploader.TTImageUploaderListener;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.n */
final /* synthetic */ class C38690n implements TTImageUploaderListener {

    /* renamed from: a */
    private final C386863 f98410a;

    /* renamed from: b */
    private final TTImageUploader f98411b;

    C38690n(C386863 r1, TTImageUploader tTImageUploader) {
        this.f98410a = r1;
        this.f98411b = tTImageUploader;
    }

    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        C386863 r0 = this.f98410a;
        TTImageUploader tTImageUploader = this.f98411b;
        if (i == 3) {
            tTImageUploader.close();
            r0.mo34624b(new VideoCreation().setMaterialId(tTImageInfo.mImageUri));
        } else if (i == 4) {
            tTImageUploader.close();
            if (tTImageInfo != null) {
                r0.mo34623a((Throwable) new C23459a((int) tTImageInfo.mErrcode).setErrorMsg(tTImageInfo.mErrcode == 30411 ? C39618d.f101160a.getResources().getString(R.string.f7x) : "upload failed."));
            } else {
                r0.mo34623a((Throwable) new IllegalArgumentException("upload failed."));
            }
        } else {
            if (i == 1) {
                r0.mo87842a((int) j);
            }
        }
    }
}
