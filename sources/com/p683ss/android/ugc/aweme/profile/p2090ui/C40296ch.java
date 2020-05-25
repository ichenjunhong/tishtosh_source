package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.adapter.C39782u.C39783a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ch */
final /* synthetic */ class C40296ch implements C39783a {

    /* renamed from: a */
    private final ProfileCoverLibActivity f102893a;

    C40296ch(ProfileCoverLibActivity profileCoverLibActivity) {
        this.f102893a = profileCoverLibActivity;
    }

    /* renamed from: a */
    public final void mo80853a(UrlModel urlModel) {
        ProfileCoverLibActivity profileCoverLibActivity = this.f102893a;
        if (!TextUtils.isEmpty(urlModel.getUri())) {
            profileCoverLibActivity.mStatusView.mo19212f();
            profileCoverLibActivity.f102345a.mo81852a(urlModel.getUri(), 3);
        }
    }
}
