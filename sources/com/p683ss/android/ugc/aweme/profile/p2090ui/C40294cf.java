package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.bytedance.common.utility.BitmapUtils;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cf */
final /* synthetic */ class C40294cf implements Callable {

    /* renamed from: a */
    private final ProfileCoverCropActivity f102891a;

    C40294cf(ProfileCoverCropActivity profileCoverCropActivity) {
        this.f102891a = profileCoverCropActivity;
    }

    public final Object call() {
        ProfileCoverCropActivity profileCoverCropActivity = this.f102891a;
        File file = new File(C48016e.m103934a("profileCover"), "profileCoverCrop.png");
        PinchImageView pinchImageView = profileCoverCropActivity.mCoverImage;
        Bitmap bitmap = profileCoverCropActivity.f102325a;
        RectF a = pinchImageView.mo82659a((RectF) null);
        if (profileCoverCropActivity.f102326b != null) {
            int width = (int) (((((float) profileCoverCropActivity.f102326b.left) - a.left) / a.width()) * ((float) bitmap.getWidth()));
            int height = (int) (((((float) profileCoverCropActivity.f102326b.top) - a.top) / a.height()) * ((float) bitmap.getHeight()));
            int width2 = (int) ((((float) profileCoverCropActivity.f102326b.width()) / a.width()) * ((float) bitmap.getWidth()));
            int height2 = (int) ((((float) profileCoverCropActivity.f102326b.height()) / a.height()) * ((float) bitmap.getHeight()));
            int i = 0;
            if (width < 0) {
                width = 0;
            }
            if (height >= 0) {
                i = height;
            }
            if (width2 > bitmap.getWidth()) {
                width2 = bitmap.getWidth();
            }
            if (height2 > bitmap.getHeight()) {
                height2 = bitmap.getHeight();
            }
            bitmap = Bitmap.createBitmap(bitmap, width, i, width2, height2);
        }
        if (BitmapUtils.saveBitmapToSD(bitmap, file.getParent(), file.getName())) {
            return file.getAbsolutePath();
        }
        return null;
    }
}
