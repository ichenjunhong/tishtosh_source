package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PreviewBoxView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.SwitchModeFrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity_ViewBinding */
public class ProfileCoverCropActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverCropActivity f102338a;

    /* renamed from: b */
    private View f102339b;

    /* renamed from: c */
    private View f102340c;

    public void unbind() {
        ProfileCoverCropActivity profileCoverCropActivity = this.f102338a;
        if (profileCoverCropActivity != null) {
            this.f102338a = null;
            profileCoverCropActivity.mTitleBar = null;
            profileCoverCropActivity.mCropContainer = null;
            profileCoverCropActivity.mCoverImage = null;
            profileCoverCropActivity.mCoverWindow = null;
            profileCoverCropActivity.mFakeShelter = null;
            profileCoverCropActivity.mFakeShelterTop = null;
            profileCoverCropActivity.mCancel = null;
            profileCoverCropActivity.mConfirm = null;
            profileCoverCropActivity.mStatusView = null;
            this.f102339b.setOnClickListener(null);
            this.f102339b = null;
            this.f102340c.setOnClickListener(null);
            this.f102340c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverCropActivity_ViewBinding(final ProfileCoverCropActivity profileCoverCropActivity, View view) {
        this.f102338a = profileCoverCropActivity;
        profileCoverCropActivity.mTitleBar = Utils.findRequiredView(view, R.id.d10, "field 'mTitleBar'");
        profileCoverCropActivity.mCropContainer = (SwitchModeFrameLayout) Utils.findRequiredViewAsType(view, R.id.a2h, "field 'mCropContainer'", SwitchModeFrameLayout.class);
        profileCoverCropActivity.mCoverImage = (PinchImageView) Utils.findRequiredViewAsType(view, R.id.azj, "field 'mCoverImage'", PinchImageView.class);
        profileCoverCropActivity.mCoverWindow = (PreviewBoxView) Utils.findRequiredViewAsType(view, R.id.azq, "field 'mCoverWindow'", PreviewBoxView.class);
        profileCoverCropActivity.mFakeShelter = (ImageView) Utils.findRequiredViewAsType(view, R.id.b0j, "field 'mFakeShelter'", ImageView.class);
        profileCoverCropActivity.mFakeShelterTop = Utils.findRequiredView(view, R.id.b0k, "field 'mFakeShelterTop'");
        View findRequiredView = Utils.findRequiredView(view, R.id.d7e, "field 'mCancel' and method 'onViewClicked'");
        profileCoverCropActivity.mCancel = (DmtTextView) Utils.castView(findRequiredView, R.id.d7e, "field 'mCancel'", DmtTextView.class);
        this.f102339b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverCropActivity.onViewClicked(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.d8c, "field 'mConfirm' and method 'onViewClicked'");
        profileCoverCropActivity.mConfirm = (DmtTextView) Utils.castView(findRequiredView2, R.id.d8c, "field 'mConfirm'", DmtTextView.class);
        this.f102340c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverCropActivity.onViewClicked(view);
            }
        });
        profileCoverCropActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
