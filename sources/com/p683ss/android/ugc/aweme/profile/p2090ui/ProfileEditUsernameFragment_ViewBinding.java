package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment_ViewBinding */
public final class ProfileEditUsernameFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditUsernameFragment f102504a;

    public final void unbind() {
        ProfileEditUsernameFragment profileEditUsernameFragment = this.f102504a;
        if (profileEditUsernameFragment != null) {
            this.f102504a = null;
            profileEditUsernameFragment.mUserLinkHint = null;
            profileEditUsernameFragment.mIdEditHintText = null;
            profileEditUsernameFragment.setUsernameInclude = null;
            profileEditUsernameFragment.setUsernameRv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditUsernameFragment_ViewBinding(ProfileEditUsernameFragment profileEditUsernameFragment, View view) {
        this.f102504a = profileEditUsernameFragment;
        profileEditUsernameFragment.mUserLinkHint = (TextView) Utils.findRequiredViewAsType(view, R.id.f5y, "field 'mUserLinkHint'", TextView.class);
        profileEditUsernameFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.d9p, "field 'mIdEditHintText'", TextView.class);
        profileEditUsernameFragment.setUsernameInclude = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ev6, "field 'setUsernameInclude'", LinearLayout.class);
        profileEditUsernameFragment.setUsernameRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ev8, "field 'setUsernameRv'", RecyclerView.class);
    }
}
