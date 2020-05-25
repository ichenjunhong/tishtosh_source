package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity_ViewBinding */
public class VideoShare2GifPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoShare2GifPreviewActivity f106410a;

    /* renamed from: b */
    private View f106411b;

    public void unbind() {
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = this.f106410a;
        if (videoShare2GifPreviewActivity != null) {
            this.f106410a = null;
            videoShare2GifPreviewActivity.gifImageView = null;
            videoShare2GifPreviewActivity.llShareContainer = null;
            videoShare2GifPreviewActivity.tvShareTitle = null;
            this.f106411b.setOnClickListener(null);
            this.f106411b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoShare2GifPreviewActivity_ViewBinding(final VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, View view) {
        this.f106410a = videoShare2GifPreviewActivity;
        videoShare2GifPreviewActivity.gifImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b0w, "field 'gifImageView'", RemoteImageView.class);
        videoShare2GifPreviewActivity.llShareContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bgb, "field 'llShareContainer'", LinearLayout.class);
        videoShare2GifPreviewActivity.tvShareTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dfw, "field 'tvShareTitle'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.d70, "method 'handleUiClickEvent'");
        this.f106411b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShare2GifPreviewActivity.handleUiClickEvent(view);
            }
        });
    }
}
