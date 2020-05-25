package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.choosemusic.view.SearchResultView.C24976a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.e */
public final /* synthetic */ class C24984e implements C24976a {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66148a;

    /* renamed from: b */
    private final boolean f66149b;

    public C24984e(ChooseMusicFragmentView chooseMusicFragmentView, boolean z) {
        this.f66148a = chooseMusicFragmentView;
        this.f66149b = z;
    }

    /* renamed from: a */
    public final void mo50956a(MotionEvent motionEvent) {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66148a;
        boolean z = this.f66149b;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 0 && chooseMusicFragmentView.f66109d != null) {
                    Boolean bool = (Boolean) chooseMusicFragmentView.f66109d.mo50681e().getValue();
                    if (bool != null ? bool.booleanValue() : true) {
                        KeyboardUtils.m58184c(chooseMusicFragmentView.mSearchEditView);
                    }
                }
            } else if (actionMasked == 0) {
                KeyboardUtils.m58184c(chooseMusicFragmentView.mSearchEditView);
            }
        }
    }
}
