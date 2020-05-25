package com.p683ss.android.ugc.aweme.livewallpaper.p1929ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity_ViewBinding */
public class LocalLiveWallPaperActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocalLiveWallPaperActivity f92803a;

    /* renamed from: b */
    private View f92804b;

    public void unbind() {
        LocalLiveWallPaperActivity localLiveWallPaperActivity = this.f92803a;
        if (localLiveWallPaperActivity != null) {
            this.f92803a = null;
            localLiveWallPaperActivity.mTitle = null;
            localLiveWallPaperActivity.mWallPapersRecyclerView = null;
            localLiveWallPaperActivity.mLayoutEmpty = null;
            this.f92804b.setOnClickListener(null);
            this.f92804b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LocalLiveWallPaperActivity_ViewBinding(final LocalLiveWallPaperActivity localLiveWallPaperActivity, View view) {
        this.f92803a = localLiveWallPaperActivity;
        localLiveWallPaperActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        localLiveWallPaperActivity.mWallPapersRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.caf, "field 'mWallPapersRecyclerView'", RecyclerView.class);
        localLiveWallPaperActivity.mLayoutEmpty = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.b7k, "field 'mLayoutEmpty'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'exit'");
        this.f92804b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                localLiveWallPaperActivity.exit(view);
            }
        });
    }
}
