package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder_ViewBinding */
public class MusicBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicBannerViewHolder f66190a;

    /* renamed from: b */
    private View f66191b;

    public void unbind() {
        MusicBannerViewHolder musicBannerViewHolder = this.f66190a;
        if (musicBannerViewHolder != null) {
            this.f66190a = null;
            musicBannerViewHolder.mSdCover = null;
            this.f66191b.setOnClickListener(null);
            this.f66191b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicBannerViewHolder_ViewBinding(final MusicBannerViewHolder musicBannerViewHolder, View view) {
        this.f66190a = musicBannerViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.ci1, "field 'mSdCover' and method 'clickCover'");
        musicBannerViewHolder.mSdCover = (SmartImageView) Utils.castView(findRequiredView, R.id.ci1, "field 'mSdCover'", SmartImageView.class);
        this.f66191b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicBannerViewHolder.clickCover();
            }
        });
    }
}
