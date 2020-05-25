package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment_ViewBinding */
public class MusProfileEditFragment_ViewBinding extends ProfileEditFragment_ViewBinding {

    /* renamed from: a */
    private MusProfileEditFragment f102312a;

    /* renamed from: b */
    private View f102313b;

    public void unbind() {
        MusProfileEditFragment musProfileEditFragment = this.f102312a;
        if (musProfileEditFragment != null) {
            this.f102312a = null;
            musProfileEditFragment.mRlAvatarChangeByVideo = null;
            musProfileEditFragment.mAvatarVideoImageView = null;
            musProfileEditFragment.mHeaderImageVideoIcon = null;
            this.f102313b.setOnClickListener(null);
            this.f102313b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusProfileEditFragment_ViewBinding(final MusProfileEditFragment musProfileEditFragment, View view) {
        super(musProfileEditFragment, view);
        this.f102312a = musProfileEditFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.esn, "field 'mRlAvatarChangeByVideo' and method 'editHeaderImageVideo'");
        musProfileEditFragment.mRlAvatarChangeByVideo = (RelativeLayout) Utils.castView(findRequiredView, R.id.esn, "field 'mRlAvatarChangeByVideo'", RelativeLayout.class);
        this.f102313b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musProfileEditFragment.editHeaderImageVideo();
            }
        });
        musProfileEditFragment.mAvatarVideoImageView = (MusAvatarImageView) Utils.findRequiredViewAsType(view, R.id.eak, "field 'mAvatarVideoImageView'", MusAvatarImageView.class);
        musProfileEditFragment.mHeaderImageVideoIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.eal, "field 'mHeaderImageVideoIcon'", ImageView.class);
    }
}
