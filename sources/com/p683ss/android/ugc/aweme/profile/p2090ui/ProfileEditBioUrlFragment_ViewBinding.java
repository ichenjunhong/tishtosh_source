package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment_ViewBinding */
public final class ProfileEditBioUrlFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditBioUrlFragment f102395a;

    /* renamed from: b */
    private View f102396b;

    public final void unbind() {
        ProfileEditBioUrlFragment profileEditBioUrlFragment = this.f102395a;
        if (profileEditBioUrlFragment != null) {
            this.f102395a = null;
            profileEditBioUrlFragment.mDmtStatusView = null;
            profileEditBioUrlFragment.mTvContentName = null;
            profileEditBioUrlFragment.mEditContentInput = null;
            profileEditBioUrlFragment.mClearAllBtn = null;
            profileEditBioUrlFragment.mEditLengthHint = null;
            profileEditBioUrlFragment.mIdEditHintText = null;
            this.f102396b.setOnClickListener(null);
            this.f102396b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditBioUrlFragment_ViewBinding(final ProfileEditBioUrlFragment profileEditBioUrlFragment, View view) {
        this.f102395a = profileEditBioUrlFragment;
        profileEditBioUrlFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
        profileEditBioUrlFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.d8m, "field 'mTvContentName'", TextView.class);
        profileEditBioUrlFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.abs, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.az6, "field 'mClearAllBtn' and method 'onClear'");
        profileEditBioUrlFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.az6, "field 'mClearAllBtn'", ImageView.class);
        this.f102396b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditBioUrlFragment.onClear();
            }
        });
        profileEditBioUrlFragment.mEditLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.d9q, "field 'mEditLengthHint'", TextView.class);
        profileEditBioUrlFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.d9p, "field 'mIdEditHintText'", TextView.class);
    }
}
