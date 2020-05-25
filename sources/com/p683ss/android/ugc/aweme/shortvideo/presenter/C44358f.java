package com.p683ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.medialib.model.CoverInfo;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.services.video.OnGetVideoCoverCallback;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.f */
public final class C44358f {
    /* renamed from: a */
    public static void m97151a(final String str, final int i, final OnGetVideoCoverCallback onGetVideoCoverCallback) {
        if (!TextUtils.isEmpty(str)) {
            if (i < 0) {
                i = 0;
            }
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    FFMpegManager a = FFMpegManager.m46826a();
                    CoverInfo frameCover = a.f52944a.getFrameCover(str, UnReadVideoExperiment.BROWSE_RECORD_LIST, UnReadVideoExperiment.BROWSE_RECORD_LIST, i, 1);
                    if (frameCover != null && frameCover.getData() != null) {
                        final Bitmap createBitmap = Bitmap.createBitmap(frameCover.getData(), frameCover.getWidth(), frameCover.getHeight(), Config.ARGB_8888);
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                if (onGetVideoCoverCallback != null) {
                                    if (createBitmap != null) {
                                        onGetVideoCoverCallback.onGetVideoCoverSuccess(createBitmap);
                                        return;
                                    }
                                    onGetVideoCoverCallback.onGetVideoCoverFailed(-1);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
