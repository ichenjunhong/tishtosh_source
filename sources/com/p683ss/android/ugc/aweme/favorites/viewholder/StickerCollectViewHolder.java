package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.support.p043v7.widget.AppCompatImageView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a.C29693a;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder */
public class StickerCollectViewHolder extends C1352v implements C29693a {

    /* renamed from: a */
    public View f77743a;

    /* renamed from: b */
    public C41941ab f77744b;

    /* renamed from: c */
    public C46069d f77745c;
    public RemoteImageView ivCover;
    public AppCompatImageView ivRecord;
    public DmtTextView tvDesigner;
    public DmtTextView tvDesignerTag;
    public DmtTextView tvStickerName;
    public DmtTextView tvUserCount;

    /* renamed from: a */
    public final void mo59961a() {
        if (this.f77745c != null) {
            C29692a.m69742c(1, this.f77745c.f116246id);
        }
    }

    public StickerCollectViewHolder(View view) {
        super(view);
        this.f77743a = view;
        ButterKnife.bind((Object) this, view);
        this.tvStickerName.setFontType(C10751d.f28903b);
    }
}
