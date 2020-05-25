package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.m */
final /* synthetic */ class C33662m implements Runnable {

    /* renamed from: a */
    private final PhotoSelectActivity f87288a;

    C33662m(PhotoSelectActivity photoSelectActivity) {
        this.f87288a = photoSelectActivity;
    }

    public final void run() {
        PhotoSelectActivity photoSelectActivity = this.f87288a;
        if (photoSelectActivity.mo71101a()) {
            photoSelectActivity.f87223n.mo71114a(C33648b.m77088a(photoSelectActivity, 0, 0, Integer.MAX_VALUE, true));
            return;
        }
        photoSelectActivity.f87223n.mo71114a(C33648b.m77088a(photoSelectActivity, 360, 360, Integer.MAX_VALUE, false));
    }
}
