package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment_ViewBinding */
public final class ProfileEditContentFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditContentFragment f102412a;

    /* renamed from: b */
    private View f102413b;

    public final void unbind() {
        ProfileEditContentFragment profileEditContentFragment = this.f102412a;
        if (profileEditContentFragment != null) {
            this.f102412a = null;
            profileEditContentFragment.mTvContentName = null;
            profileEditContentFragment.mEditContentInput = null;
            profileEditContentFragment.mClearAllBtn = null;
            profileEditContentFragment.mEditLengthHint = null;
            profileEditContentFragment.mIdEditHintText = null;
            this.f102413b.setOnClickListener(null);
            this.f102413b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditContentFragment_ViewBinding(final ProfileEditContentFragment profileEditContentFragment, View view) {
        this.f102412a = profileEditContentFragment;
        profileEditContentFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.d8m, "field 'mTvContentName'", TextView.class);
        profileEditContentFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.abs, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.az6, "field 'mClearAllBtn' and method 'onClear'");
        profileEditContentFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.az6, "field 'mClearAllBtn'", ImageView.class);
        this.f102413b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditContentFragment.onClear();
            }
        });
        profileEditContentFragment.mEditLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.d9q, "field 'mEditLengthHint'", TextView.class);
        profileEditContentFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.d9p, "field 'mIdEditHintText'", TextView.class);
    }
}
