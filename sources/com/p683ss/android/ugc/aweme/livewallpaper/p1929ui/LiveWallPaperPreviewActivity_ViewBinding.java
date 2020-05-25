package com.p683ss.android.ugc.aweme.livewallpaper.p1929ui;

import android.view.SurfaceView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity_ViewBinding */
public class LiveWallPaperPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LiveWallPaperPreviewActivity f92790a;

    /* renamed from: b */
    private View f92791b;

    /* renamed from: c */
    private View f92792c;

    /* renamed from: d */
    private View f92793d;

    public void unbind() {
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f92790a;
        if (liveWallPaperPreviewActivity != null) {
            this.f92790a = null;
            liveWallPaperPreviewActivity.mPreviewSurface = null;
            this.f92791b.setOnClickListener(null);
            this.f92791b = null;
            this.f92792c.setOnClickListener(null);
            this.f92792c = null;
            this.f92793d.setOnClickListener(null);
            this.f92793d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LiveWallPaperPreviewActivity_ViewBinding(final LiveWallPaperPreviewActivity liveWallPaperPreviewActivity, View view) {
        this.f92790a = liveWallPaperPreviewActivity;
        liveWallPaperPreviewActivity.mPreviewSurface = (SurfaceView) Utils.findRequiredViewAsType(view, R.id.cm7, "field 'mPreviewSurface'", SurfaceView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'exit'");
        this.f92791b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                liveWallPaperPreviewActivity.exit(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dfr, "method 'setLiveWallPaper'");
        this.f92792c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                liveWallPaperPreviewActivity.setLiveWallPaper();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b2h, "method 'onClickMore'");
        this.f92793d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                liveWallPaperPreviewActivity.onClickMore();
            }
        });
    }
}
