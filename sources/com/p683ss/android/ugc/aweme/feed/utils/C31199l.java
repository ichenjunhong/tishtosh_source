package com.p683ss.android.ugc.aweme.feed.utils;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.l */
public final class C31199l {
    /* renamed from: a */
    public static void m72855a(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }
}
