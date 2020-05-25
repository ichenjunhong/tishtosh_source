package com.p683ss.android.ugc.aweme.photo.publish;

import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.a */
final /* synthetic */ class C38702a implements C52670a {

    /* renamed from: a */
    private final PhotoPreviewActivity f98449a;

    /* renamed from: b */
    private final PhotoContext f98450b;

    C38702a(PhotoPreviewActivity photoPreviewActivity, PhotoContext photoContext) {
        this.f98449a = photoPreviewActivity;
        this.f98450b = photoContext;
    }

    public final Object invoke() {
        PhotoPreviewActivity photoPreviewActivity = this.f98449a;
        PhotoContext photoContext = this.f98450b;
        C43302dx.m94965a(photoPreviewActivity.mImageView, photoContext.mWidth, photoContext.mHeight);
        return null;
    }
}
