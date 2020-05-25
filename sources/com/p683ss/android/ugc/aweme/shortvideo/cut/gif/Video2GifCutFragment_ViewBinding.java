package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment_ViewBinding */
public class Video2GifCutFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private Video2GifCutFragment f107863a;

    /* renamed from: b */
    private View f107864b;

    public void unbind() {
        Video2GifCutFragment video2GifCutFragment = this.f107863a;
        if (video2GifCutFragment != null) {
            this.f107863a = null;
            video2GifCutFragment.textureVideoView = null;
            video2GifCutFragment.ivPlay = null;
            video2GifCutFragment.flVideoContainer = null;
            video2GifCutFragment.videoEditView = null;
            video2GifCutFragment.tvSelectedTime = null;
            this.f107864b.setOnClickListener(null);
            this.f107864b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public Video2GifCutFragment_ViewBinding(final Video2GifCutFragment video2GifCutFragment, View view) {
        this.f107863a = video2GifCutFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.czh, "field 'textureVideoView' and method 'resolveUiClick'");
        video2GifCutFragment.textureVideoView = (TextureView) Utils.castView(findRequiredView, R.id.czh, "field 'textureVideoView'", TextureView.class);
        this.f107864b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                video2GifCutFragment.resolveUiClick(view);
            }
        });
        video2GifCutFragment.ivPlay = (ImageView) Utils.findRequiredViewAsType(view, R.id.by_, "field 'ivPlay'", ImageView.class);
        video2GifCutFragment.flVideoContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.aho, "field 'flVideoContainer'", FrameLayout.class);
        video2GifCutFragment.videoEditView = (VideoEditView) Utils.findRequiredViewAsType(view, R.id.dp7, "field 'videoEditView'", VideoEditView.class);
        video2GifCutFragment.tvSelectedTime = (TextView) Utils.findRequiredViewAsType(view, R.id.dh7, "field 'tvSelectedTime'", TextView.class);
    }
}
