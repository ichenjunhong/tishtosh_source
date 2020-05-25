package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bs */
public class C33797bs extends C33805c<ShareMusicContent> {

    /* renamed from: u */
    private RemoteImageView f87672u;

    /* renamed from: v */
    private DmtTextView f87673v;

    /* renamed from: w */
    private DmtTextView f87674w;

    /* renamed from: x */
    private RemoteImageView f87675x;

    /* renamed from: y */
    private RemoteImageView f87676y;

    /* renamed from: z */
    private RemoteImageView f87677z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87672u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87673v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87674w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87675x = (RemoteImageView) this.itemView.findViewById(R.id.arp);
        this.f87676y = (RemoteImageView) this.itemView.findViewById(R.id.arq);
        this.f87677z = (RemoteImageView) this.itemView.findViewById(R.id.arr);
    }

    /* renamed from: a */
    public final void mo71840a(OnLongClickListener onLongClickListener) {
        this.f87708j.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
    }

    public C33797bs(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
        }
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareMusicContent shareMusicContent, int i) {
        super.mo71780a(pVar, pVar2, shareMusicContent, i);
        this.f87673v.setText(shareMusicContent.getMusicName());
        this.f87674w.setVisibility(0);
        this.f87674w.setText(C2240a.m6772a(this.itemView.getContext().getResources().getString(R.string.bl3), new Object[]{C35280q.m79766a((long) shareMusicContent.getUserCount())}));
        C23515d.m57668a(this.f87672u, (int) R.drawable.azf);
        C23515d.m57669a(this.f87675x, (UrlModel) shareMusicContent.getAwemeCoverList().get(0));
        C23515d.m57669a(this.f87676y, (UrlModel) shareMusicContent.getAwemeCoverList().get(1));
        C23515d.m57669a(this.f87677z, (UrlModel) shareMusicContent.getAwemeCoverList().get(2));
        this.f87708j.setTag(50331648, Integer.valueOf(17));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
