package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bp */
public abstract class C26431bp implements C23422a {

    /* renamed from: a */
    public final Activity f69683a;

    public C26431bp(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f69683a = activity;
    }

    /* renamed from: a */
    public final void mo54157a(boolean z) {
        if (z) {
            Activity activity = this.f69683a;
            if (activity instanceof MainActivity) {
                ((MainActivity) this.f69683a).registerActivityOnKeyDownListener(this);
            } else if (activity instanceof UserProfileActivity) {
                UserProfileActivity userProfileActivity = (UserProfileActivity) this.f69683a;
                C23422a aVar = this;
                if (!userProfileActivity.f102601b.contains(aVar)) {
                    userProfileActivity.f102601b.add(aVar);
                }
            } else {
                if (activity instanceof DetailActivity) {
                    ((DetailActivity) this.f69683a).registerActivityOnKeyDownListener(this);
                }
            }
        } else {
            Activity activity2 = this.f69683a;
            if (activity2 instanceof MainActivity) {
                ((MainActivity) this.f69683a).unRegisterActivityOnKeyDownListener(this);
            } else if (activity2 instanceof UserProfileActivity) {
                UserProfileActivity userProfileActivity2 = (UserProfileActivity) this.f69683a;
                C23422a aVar2 = this;
                if (userProfileActivity2.f102601b != null) {
                    userProfileActivity2.f102601b.remove(aVar2);
                }
            } else if (activity2 instanceof DetailActivity) {
                ((DetailActivity) this.f69683a).unRegisterActivityOnKeyDownListener(this);
            }
        }
    }
}
