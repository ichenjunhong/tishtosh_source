package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.StatedButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity_ViewBinding */
public class ProfileCoverPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverPreviewActivity f102356a;

    /* renamed from: b */
    private View f102357b;

    /* renamed from: c */
    private View f102358c;

    /* renamed from: d */
    private View f102359d;

    public void unbind() {
        ProfileCoverPreviewActivity profileCoverPreviewActivity = this.f102356a;
        if (profileCoverPreviewActivity != null) {
            this.f102356a = null;
            profileCoverPreviewActivity.mCoverImage = null;
            profileCoverPreviewActivity.mChangeBtn = null;
            profileCoverPreviewActivity.mDownloadBtn = null;
            this.f102357b.setOnClickListener(null);
            this.f102357b = null;
            this.f102358c.setOnClickListener(null);
            this.f102358c = null;
            this.f102359d.setOnClickListener(null);
            this.f102359d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverPreviewActivity_ViewBinding(final ProfileCoverPreviewActivity profileCoverPreviewActivity, View view) {
        this.f102356a = profileCoverPreviewActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.azj, "field 'mCoverImage' and method 'onViewClicked'");
        profileCoverPreviewActivity.mCoverImage = (RemoteImageView) Utils.castView(findRequiredView, R.id.azj, "field 'mCoverImage'", RemoteImageView.class);
        this.f102357b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverPreviewActivity.onViewClicked(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.d7p, "field 'mChangeBtn' and method 'onViewClicked'");
        profileCoverPreviewActivity.mChangeBtn = (TextView) Utils.castView(findRequiredView2, R.id.d7p, "field 'mChangeBtn'", TextView.class);
        this.f102358c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverPreviewActivity.onViewClicked(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b05, "field 'mDownloadBtn' and method 'onViewClicked'");
        profileCoverPreviewActivity.mDownloadBtn = (StatedButton) Utils.castView(findRequiredView3, R.id.b05, "field 'mDownloadBtn'", StatedButton.class);
        this.f102359d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverPreviewActivity.onViewClicked(view);
            }
        });
    }
}
