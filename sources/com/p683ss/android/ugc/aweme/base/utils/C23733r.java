package com.p683ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.r */
final /* synthetic */ class C23733r implements OnTouchListener {

    /* renamed from: a */
    static final OnTouchListener f63265a = new C23733r();

    private C23733r() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Context context = view.getContext();
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.n);
                    loadAnimation.setFillAfter(true);
                    view.startAnimation(loadAnimation);
                    break;
                case 1:
                    break;
            }
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.o);
        loadAnimation2.setFillAfter(true);
        view.startAnimation(loadAnimation2);
        return false;
    }
}
