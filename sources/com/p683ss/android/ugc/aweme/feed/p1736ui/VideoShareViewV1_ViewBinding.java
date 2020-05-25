package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoShareViewV1_ViewBinding */
public class VideoShareViewV1_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoShareViewV1 f80553a;

    /* renamed from: b */
    private View f80554b;

    /* renamed from: c */
    private View f80555c;

    /* renamed from: d */
    private View f80556d;

    public void unbind() {
        VideoShareViewV1 videoShareViewV1 = this.f80553a;
        if (videoShareViewV1 != null) {
            this.f80553a = null;
            videoShareViewV1.shareIv = null;
            videoShareViewV1.mShareCount = null;
            videoShareViewV1.mShareContainerView = null;
            this.f80554b.setOnClickListener(null);
            this.f80554b = null;
            this.f80555c.setOnClickListener(null);
            this.f80555c = null;
            this.f80556d.setOnClickListener(null);
            this.f80556d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoShareViewV1_ViewBinding(final VideoShareViewV1 videoShareViewV1, View view) {
        this.f80553a = videoShareViewV1;
        View findRequiredView = Utils.findRequiredView(view, R.id.cn8, "field 'shareIv' and method 'onClick'");
        videoShareViewV1.shareIv = (RemoteImageView) Utils.castView(findRequiredView, R.id.cn8, "field 'shareIv'", RemoteImageView.class);
        this.f80554b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShareViewV1.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cn1, "field 'mShareCount' and method 'onClick'");
        videoShareViewV1.mShareCount = (TextView) Utils.castView(findRequiredView2, R.id.cn1, "field 'mShareCount'", TextView.class);
        this.f80555c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShareViewV1.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.cmz, "field 'mShareContainerView' and method 'onClick'");
        videoShareViewV1.mShareContainerView = findRequiredView3;
        this.f80556d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShareViewV1.onClick(view);
            }
        });
    }
}
