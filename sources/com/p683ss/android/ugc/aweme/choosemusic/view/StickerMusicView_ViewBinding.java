package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StickerMusicView_ViewBinding */
public class StickerMusicView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerMusicView f66143a;

    public void unbind() {
        StickerMusicView stickerMusicView = this.f66143a;
        if (stickerMusicView != null) {
            this.f66143a = null;
            stickerMusicView.mVgContainer = null;
            stickerMusicView.mLlMusicContainer = null;
            stickerMusicView.mTvwContent = null;
            stickerMusicView.mVwDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerMusicView_ViewBinding(StickerMusicView stickerMusicView, View view) {
        this.f66143a = stickerMusicView;
        stickerMusicView.mVgContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ber, "field 'mVgContainer'", LinearLayout.class);
        stickerMusicView.mLlMusicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bes, "field 'mLlMusicContainer'", LinearLayout.class);
        stickerMusicView.mTvwContent = (TextView) Utils.findRequiredViewAsType(view, R.id.dip, "field 'mTvwContent'", TextView.class);
        stickerMusicView.mVwDivider = Utils.findRequiredView(view, R.id.dt_, "field 'mVwDivider'");
    }
}
