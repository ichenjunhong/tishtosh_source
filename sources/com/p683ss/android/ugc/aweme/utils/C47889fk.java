package com.p683ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.utils.fk */
public final class C47889fk {
    /* renamed from: a */
    public static OnTouchListener m103591a(float f, float f2) {
        return m103592a(0.5f, 1.0f, null);
    }

    /* renamed from: a */
    private static OnTouchListener m103592a(final float f, final float f2, View view) {
        return new OnTouchListener(null) {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            view.setAlpha(f);
                            if (null != null) {
                                null.setAlpha(f);
                                break;
                            }
                            break;
                        case 1:
                            break;
                    }
                }
                view.setAlpha(f2);
                if (null != null) {
                    null.setAlpha(f2);
                }
                return false;
            }
        };
    }
}
