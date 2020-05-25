package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.a */
final /* synthetic */ class C33136a implements AsyncServiceLoader {

    /* renamed from: a */
    private final AvatarChooseActivity f86030a;

    /* renamed from: b */
    private final Fragment f86031b;

    C33136a(AvatarChooseActivity avatarChooseActivity, Fragment fragment) {
        this.f86030a = avatarChooseActivity;
        this.f86031b = fragment;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        AvatarChooseActivity avatarChooseActivity = this.f86030a;
        avatarChooseActivity.f85965a = asyncAVService.uiService().abilityUiService().toMusVideoChooseFragment(avatarChooseActivity, this.f86031b, avatarChooseActivity, Integer.valueOf(R.id.eom));
    }
}
