package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment_ViewBinding */
public class FriendTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FriendTabFragment f96512a;

    public void unbind() {
        FriendTabFragment friendTabFragment = this.f96512a;
        if (friendTabFragment != null) {
            this.f96512a = null;
            friendTabFragment.mViewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FriendTabFragment_ViewBinding(FriendTabFragment friendTabFragment, View view) {
        this.f96512a = friendTabFragment;
        friendTabFragment.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.ds2, "field 'mViewPager'", ViewPager.class);
    }
}
