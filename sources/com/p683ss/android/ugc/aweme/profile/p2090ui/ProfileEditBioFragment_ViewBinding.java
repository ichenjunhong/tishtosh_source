package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment_ViewBinding */
public final class ProfileEditBioFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditBioFragment f102376a;

    /* renamed from: b */
    private View f102377b;

    public final void unbind() {
        ProfileEditBioFragment profileEditBioFragment = this.f102376a;
        if (profileEditBioFragment != null) {
            this.f102376a = null;
            profileEditBioFragment.mTvContentName = null;
            profileEditBioFragment.mEditContentInput = null;
            profileEditBioFragment.mClearAllBtn = null;
            profileEditBioFragment.mEditLengthHint = null;
            profileEditBioFragment.mIdEditHintText = null;
            this.f102377b.setOnClickListener(null);
            this.f102377b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditBioFragment_ViewBinding(final ProfileEditBioFragment profileEditBioFragment, View view) {
        this.f102376a = profileEditBioFragment;
        profileEditBioFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.d8m, "field 'mTvContentName'", TextView.class);
        profileEditBioFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.abs, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.az6, "field 'mClearAllBtn' and method 'onClear'");
        profileEditBioFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.az6, "field 'mClearAllBtn'", ImageView.class);
        this.f102377b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditBioFragment.onClear();
            }
        });
        profileEditBioFragment.mEditLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.d9q, "field 'mEditLengthHint'", TextView.class);
        profileEditBioFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.d9p, "field 'mIdEditHintText'", TextView.class);
    }
}
