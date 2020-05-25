package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.c */
public final /* synthetic */ class C24982c implements OnTouchListener {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66146a;

    public C24982c(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f66146a = chooseMusicFragmentView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66146a;
        if (motionEvent.getAction() == 1 && chooseMusicFragmentView.mSearchEditView != null) {
            String obj = chooseMusicFragmentView.mSearchEditView.getText().toString();
            if (chooseMusicFragmentView.f66106a != null) {
                if (!TextUtils.isEmpty(obj)) {
                    chooseMusicFragmentView.f66106a.mo50887g();
                } else {
                    chooseMusicFragmentView.f66106a.mo50886f();
                }
            }
        }
        return false;
    }
}
