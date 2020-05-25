package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.support.p043v7.widget.AppCompatImageView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder_ViewBinding */
public class StickerCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerCollectViewHolder f77750a;

    public void unbind() {
        StickerCollectViewHolder stickerCollectViewHolder = this.f77750a;
        if (stickerCollectViewHolder != null) {
            this.f77750a = null;
            stickerCollectViewHolder.ivCover = null;
            stickerCollectViewHolder.tvStickerName = null;
            stickerCollectViewHolder.tvDesigner = null;
            stickerCollectViewHolder.tvDesignerTag = null;
            stickerCollectViewHolder.tvUserCount = null;
            stickerCollectViewHolder.ivRecord = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerCollectViewHolder_ViewBinding(StickerCollectViewHolder stickerCollectViewHolder, View view) {
        this.f77750a = stickerCollectViewHolder;
        stickerCollectViewHolder.ivCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ci1, "field 'ivCover'", RemoteImageView.class);
        stickerCollectViewHolder.tvStickerName = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dgo, "field 'tvStickerName'", DmtTextView.class);
        stickerCollectViewHolder.tvDesigner = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d9a, "field 'tvDesigner'", DmtTextView.class);
        stickerCollectViewHolder.tvDesignerTag = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.f23, "field 'tvDesignerTag'", DmtTextView.class);
        stickerCollectViewHolder.tvUserCount = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.di_, "field 'tvUserCount'", DmtTextView.class);
        stickerCollectViewHolder.ivRecord = (AppCompatImageView) Utils.findRequiredViewAsType(view, R.id.b3h, "field 'ivRecord'", AppCompatImageView.class);
    }
}
