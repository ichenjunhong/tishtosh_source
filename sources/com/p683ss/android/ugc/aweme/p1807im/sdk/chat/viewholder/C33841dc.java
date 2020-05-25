package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoUpdateTipsContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.dc */
public final class C33841dc extends C33805c<VideoUpdateTipsContent> {

    /* renamed from: u */
    private RemoteImageView f87790u;

    /* renamed from: v */
    private TextView f87791v;

    /* renamed from: w */
    private TextView f87792w;

    /* renamed from: x */
    private View f87793x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87790u = (RemoteImageView) this.itemView.findViewById(R.id.a27);
        this.f87791v = (TextView) this.itemView.findViewById(R.id.d1l);
        this.f87792w = (TextView) this.itemView.findViewById(R.id.a02);
        this.f87708j = this.itemView.findViewById(R.id.zd);
        this.f87793x = this.itemView.findViewById(R.id.a2a);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        this.f87708j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo71840a(OnLongClickListener onLongClickListener) {
        this.f87708j.setOnLongClickListener(onLongClickListener);
    }

    public C33841dc(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) baseContent;
        super.mo71780a(pVar, pVar2, videoUpdateTipsContent, i);
        if (videoUpdateTipsContent != null) {
            C23515d.m57669a(this.f87790u, videoUpdateTipsContent.getCover());
            this.f87791v.setText(videoUpdateTipsContent.getTitle());
            this.f87792w.setText(videoUpdateTipsContent.getContent());
            if (videoUpdateTipsContent.isPhoto()) {
                this.f87793x.setVisibility(0);
            } else {
                this.f87793x.setVisibility(8);
            }
        }
        this.f87708j.setTag(50331648, Integer.valueOf(11));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
