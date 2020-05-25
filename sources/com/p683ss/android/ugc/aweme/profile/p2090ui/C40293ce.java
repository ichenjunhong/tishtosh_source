package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ce */
final /* synthetic */ class C40293ce implements OnLayoutChangeListener {

    /* renamed from: a */
    private final ProfileCoverCropActivity f102890a;

    C40293ce(ProfileCoverCropActivity profileCoverCropActivity) {
        this.f102890a = profileCoverCropActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ProfileCoverCropActivity profileCoverCropActivity = this.f102890a;
        if (profileCoverCropActivity.f102326b == null) {
            profileCoverCropActivity.f102326b = profileCoverCropActivity.mCoverWindow.getVisibleRect();
            profileCoverCropActivity.mCoverImage.setDisplayWindowRect(profileCoverCropActivity.f102326b);
        }
    }
}
