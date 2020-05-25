package com.p683ss.android.ugc.aweme.share;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.PhotoUploadSuccessPopView_ViewBinding */
public class PhotoUploadSuccessPopView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoUploadSuccessPopView f106103a;

    /* renamed from: b */
    private View f106104b;

    public void unbind() {
        PhotoUploadSuccessPopView photoUploadSuccessPopView = this.f106103a;
        if (photoUploadSuccessPopView != null) {
            this.f106103a = null;
            photoUploadSuccessPopView.mPullUpLayout = null;
            photoUploadSuccessPopView.mLayoutView = null;
            photoUploadSuccessPopView.mRootLayout = null;
            photoUploadSuccessPopView.mVideoCover = null;
            photoUploadSuccessPopView.mShareItemContainer = null;
            photoUploadSuccessPopView.commerceView = null;
            photoUploadSuccessPopView.commerceIconView = null;
            photoUploadSuccessPopView.commerceMsgView = null;
            photoUploadSuccessPopView.commerceLineView = null;
            this.f106104b.setOnClickListener(null);
            this.f106104b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoUploadSuccessPopView_ViewBinding(final PhotoUploadSuccessPopView photoUploadSuccessPopView, View view) {
        this.f106103a = photoUploadSuccessPopView;
        photoUploadSuccessPopView.mPullUpLayout = (PullUpLayout) Utils.findRequiredViewAsType(view, R.id.c70, "field 'mPullUpLayout'", PullUpLayout.class);
        photoUploadSuccessPopView.mLayoutView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.b7b, "field 'mLayoutView'", RelativeLayout.class);
        photoUploadSuccessPopView.mRootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b7a, "field 'mRootLayout'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.asf, "field 'mVideoCover' and method 'onClick'");
        photoUploadSuccessPopView.mVideoCover = (RemoteImageView) Utils.castView(findRequiredView, R.id.asf, "field 'mVideoCover'", RemoteImageView.class);
        this.f106104b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoUploadSuccessPopView.onClick(view);
            }
        });
        photoUploadSuccessPopView.mShareItemContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bxz, "field 'mShareItemContainer'", LinearLayout.class);
        photoUploadSuccessPopView.commerceView = Utils.findRequiredView(view, R.id.bey, "field 'commerceView'");
        photoUploadSuccessPopView.commerceIconView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.aze, "field 'commerceIconView'", RemoteImageView.class);
        photoUploadSuccessPopView.commerceMsgView = (TextView) Utils.findRequiredViewAsType(view, R.id.d8b, "field 'commerceMsgView'", TextView.class);
        photoUploadSuccessPopView.commerceLineView = Utils.findRequiredView(view, R.id.bax, "field 'commerceLineView'");
    }
}
