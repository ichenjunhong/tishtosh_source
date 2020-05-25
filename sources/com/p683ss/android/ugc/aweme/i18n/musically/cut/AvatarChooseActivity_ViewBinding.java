package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity_ViewBinding */
public class AvatarChooseActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarChooseActivity f85969a;

    public void unbind() {
        AvatarChooseActivity avatarChooseActivity = this.f85969a;
        if (avatarChooseActivity != null) {
            this.f85969a = null;
            avatarChooseActivity.mStatusBarView = null;
            avatarChooseActivity.mTitleView = null;
            avatarChooseActivity.mBackBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarChooseActivity_ViewBinding(AvatarChooseActivity avatarChooseActivity, View view) {
        this.f85969a = avatarChooseActivity;
        avatarChooseActivity.mStatusBarView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBarView'");
        avatarChooseActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        avatarChooseActivity.mBackBtn = Utils.findRequiredView(view, R.id.ik, "field 'mBackBtn'");
    }
}
