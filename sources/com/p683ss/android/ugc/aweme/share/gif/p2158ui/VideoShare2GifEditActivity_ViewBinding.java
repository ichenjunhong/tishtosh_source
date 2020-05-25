package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity_ViewBinding */
public class VideoShare2GifEditActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoShare2GifEditActivity f106404a;

    /* renamed from: b */
    private View f106405b;

    public void unbind() {
        if (this.f106404a != null) {
            this.f106404a = null;
            this.f106405b.setOnClickListener(null);
            this.f106405b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoShare2GifEditActivity_ViewBinding(final VideoShare2GifEditActivity videoShare2GifEditActivity, View view) {
        this.f106404a = videoShare2GifEditActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.ij, "method 'resolveUiClickEvent'");
        this.f106405b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoShare2GifEditActivity.resolveUiClickEvent(view);
            }
        });
    }
}
