package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bu */
public class C33799bu extends C33805c<ShareMusicContent> {

    /* renamed from: u */
    private RemoteImageView f87679u;

    /* renamed from: v */
    private DmtTextView f87680v;

    /* renamed from: w */
    private DmtTextView f87681w;

    /* renamed from: x */
    private DmtTextView f87682x;

    /* renamed from: y */
    private View f87683y;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87679u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87680v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87681w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87682x = (DmtTextView) this.itemView.findViewById(R.id.cxk);
        this.f87683y = this.itemView.findViewById(R.id.e1b);
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

    public C33799bu(View view, int i) {
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
        this.f87680v.setText(shareMusicContent.getMusicName());
        this.f87681w.setVisibility(0);
        this.f87681w.setText(C2240a.m6772a(this.itemView.getContext().getResources().getString(R.string.bl3), new Object[]{C35280q.m79766a((long) shareMusicContent.getUserCount())}));
        this.f87682x.setText(R.string.bl2);
        C35186ab.m79432a(this.f87679u, shareMusicContent.getCoverThumb(), (int) R.drawable.azg, (int) R.drawable.b02);
        this.f87708j.setTag(50331648, Integer.valueOf(17));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
