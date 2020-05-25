package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.ag */
final /* synthetic */ class C24915ag implements C10736b {

    /* renamed from: a */
    private final NewMusicTabFragment f65974a;

    C24915ag(NewMusicTabFragment newMusicTabFragment) {
        this.f65974a = newMusicTabFragment;
    }

    /* renamed from: a */
    public final void mo19399a(C10742f fVar) {
        NewMusicTabFragment newMusicTabFragment = this.f65974a;
        if (fVar.f28860e == 1) {
            newMusicTabFragment.getString(R.string.b17);
            if (!AccountService.createIAccountServicebyMonsterPlugin().userService().isLogin()) {
                C27965f.m66724a((Fragment) newMusicTabFragment, "", "click_my_music", (Bundle) null);
                return;
            }
        }
        fVar.mo19417a();
    }
}
