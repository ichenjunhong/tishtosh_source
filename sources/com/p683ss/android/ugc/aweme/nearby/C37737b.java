package com.p683ss.android.ugc.aweme.nearby;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31214w;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;

/* renamed from: com.ss.android.ugc.aweme.nearby.b */
public final class C37737b implements C37736a {
    /* renamed from: a */
    public final boolean mo77207a() {
        return C31214w.m72900a();
    }

    /* renamed from: b */
    public final boolean mo77209b(Activity activity) {
        if (activity instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity.isUnderMainTab() || mainActivity.isUnderNearbyTab()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo77208a(Activity activity) {
        if (!(activity instanceof MainActivity) || !((MainActivity) activity).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo77206a(Context context, User user) {
        UserProfileActivity.m89401a(context, user);
    }

    /* renamed from: a */
    public final void mo77205a(Context context, Aweme aweme, TextView textView) {
        C31214w.m72897a(context, aweme, textView);
    }

    /* renamed from: a */
    public final void mo77204a(Context context, Aweme aweme, ImageView imageView, String str, int i) {
        if (!C31214w.m72900a() || aweme == null || !aweme.isMixAweme()) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
    }
}
