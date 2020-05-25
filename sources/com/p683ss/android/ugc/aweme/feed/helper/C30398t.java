package com.p683ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p683ss.android.ugc.aweme.video.C48021h;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.t */
public final class C30398t {
    /* renamed from: a */
    public static C48021h m71321a(Activity activity) {
        if (activity instanceof FragmentActivity) {
            return FeedSharePlayerViewModel.getPlayerManager((FragmentActivity) activity);
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m71322b(Activity activity) {
        if (m71321a(activity) != null) {
            return true;
        }
        return false;
    }
}
