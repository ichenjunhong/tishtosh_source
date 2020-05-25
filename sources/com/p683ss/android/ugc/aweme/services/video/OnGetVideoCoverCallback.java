package com.p683ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.services.video.OnGetVideoCoverCallback */
public interface OnGetVideoCoverCallback {
    void onGetVideoCoverFailed(int i);

    void onGetVideoCoverSuccess(Bitmap bitmap);
}
