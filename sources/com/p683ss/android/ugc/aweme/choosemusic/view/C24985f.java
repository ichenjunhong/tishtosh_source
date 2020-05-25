package com.p683ss.android.ugc.aweme.choosemusic.view;

import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.music.p1975c.C37349b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.f */
final /* synthetic */ class C24985f implements Runnable {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66150a;

    C24985f(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f66150a = chooseMusicFragmentView;
    }

    public final void run() {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66150a;
        if (chooseMusicFragmentView.mSearchEditView != null) {
            chooseMusicFragmentView.mSearchEditView.requestFocus();
            KeyboardUtils.m58183b(chooseMusicFragmentView.mSearchEditView);
            C47718bf.m103288a(new C37349b(false));
        }
    }
}
