package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.view.View;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.al */
public final class C32728al extends C32774u implements C32763j {

    /* renamed from: a */
    private C32720aj f85257a;

    /* renamed from: a */
    public final User mo66319a() {
        if (this.f85257a == null) {
            return null;
        }
        return this.f85257a.getData();
    }

    public C32728al(View view) {
        super(view);
        this.f85257a = (C32720aj) view;
    }

    /* renamed from: a */
    public final void mo66320a(User user, int i, boolean z, int i2) {
        this.f85257a.setData(user);
        if (!z || i2 == 5 || i2 == 6) {
            this.f85257a.setNewFriendRecommendMask(false);
        } else {
            this.f85257a.setNewFriendRecommendMask(true);
        }
        this.f85257a.setPositionInApiList(i);
    }
}
