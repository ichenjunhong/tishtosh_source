package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragment_ViewBinding */
public class ProfileMoreFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileMoreFragment f102517a;

    /* renamed from: b */
    private View f102518b;

    /* renamed from: c */
    private View f102519c;

    /* renamed from: d */
    private View f102520d;

    /* renamed from: e */
    private View f102521e;

    /* renamed from: f */
    private View f102522f;

    /* renamed from: g */
    private View f102523g;

    /* renamed from: h */
    private View f102524h;

    public void unbind() {
        ProfileMoreFragment profileMoreFragment = this.f102517a;
        if (profileMoreFragment != null) {
            this.f102517a = null;
            profileMoreFragment.mTitleBar = null;
            profileMoreFragment.mSendMsgImage = null;
            profileMoreFragment.mBlock = null;
            profileMoreFragment.mRemarkName = null;
            profileMoreFragment.mRemarkNameUnderline = null;
            profileMoreFragment.mRemoveFollower = null;
            profileMoreFragment.mRemoveFollowerUnderline = null;
            profileMoreFragment.shareView = null;
            profileMoreFragment.mBackBtn = null;
            profileMoreFragment.mAvatarIv = null;
            this.f102518b.setOnClickListener(null);
            this.f102518b = null;
            this.f102519c.setOnClickListener(null);
            this.f102519c = null;
            this.f102520d.setOnClickListener(null);
            this.f102520d = null;
            this.f102521e.setOnClickListener(null);
            this.f102521e = null;
            this.f102522f.setOnClickListener(null);
            this.f102522f = null;
            this.f102523g.setOnClickListener(null);
            this.f102523g = null;
            this.f102524h.setOnClickListener(null);
            this.f102524h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileMoreFragment_ViewBinding(final ProfileMoreFragment profileMoreFragment, View view) {
        this.f102517a = profileMoreFragment;
        profileMoreFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.d1b, "field 'mTitleBar'", ButtonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.clb, "field 'mSendMsgImage' and method 'onClick'");
        profileMoreFragment.mSendMsgImage = (RemoteImageView) Utils.castView(findRequiredView, R.id.clb, "field 'mSendMsgImage'", RemoteImageView.class);
        this.f102518b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.l9, "field 'mBlock' and method 'onClick'");
        profileMoreFragment.mBlock = (CommonItemView) Utils.castView(findRequiredView2, R.id.l9, "field 'mBlock'", CommonItemView.class);
        this.f102519c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.cb8, "field 'mRemarkName' and method 'onClick'");
        profileMoreFragment.mRemarkName = (CommonItemView) Utils.castView(findRequiredView3, R.id.cb8, "field 'mRemarkName'", CommonItemView.class);
        this.f102520d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        profileMoreFragment.mRemarkNameUnderline = Utils.findRequiredView(view, R.id.cb9, "field 'mRemarkNameUnderline'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.cba, "field 'mRemoveFollower' and method 'onClick'");
        profileMoreFragment.mRemoveFollower = (CommonItemView) Utils.castView(findRequiredView4, R.id.cba, "field 'mRemoveFollower'", CommonItemView.class);
        this.f102521e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        profileMoreFragment.mRemoveFollowerUnderline = Utils.findRequiredView(view, R.id.cbb, "field 'mRemoveFollowerUnderline'");
        View findRequiredView5 = Utils.findRequiredView(view, R.id.cmg, "field 'shareView' and method 'onClick'");
        profileMoreFragment.shareView = findRequiredView5;
        this.f102522f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.ik, "field 'mBackBtn' and method 'onClick'");
        profileMoreFragment.mBackBtn = findRequiredView6;
        this.f102523g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        profileMoreFragment.mAvatarIv = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'mAvatarIv'", AvatarImageView.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.cbk, "method 'onClick'");
        this.f102524h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
    }
}
