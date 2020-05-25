package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareChallengeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bc */
public class C33781bc extends C33805c<ShareChallengeContent> {

    /* renamed from: u */
    private RemoteImageView f87636u;

    /* renamed from: v */
    private DmtTextView f87637v;

    /* renamed from: w */
    private DmtTextView f87638w;

    /* renamed from: x */
    private DmtTextView f87639x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87636u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87637v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87638w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87639x = (DmtTextView) this.itemView.findViewById(R.id.cxk);
        this.f87636u.setImageResource(R.drawable.aze);
    }

    public C33781bc(View view, int i) {
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
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareChallengeContent shareChallengeContent, int i) {
        super.mo71780a(pVar, pVar2, shareChallengeContent, i);
        this.f87637v.setText(shareChallengeContent.getTitle());
        this.f87638w.setVisibility(0);
        this.f87638w.setText(C2240a.m6772a(this.itemView.getContext().getResources().getString(R.string.bfh), new Object[]{C35280q.m79766a(shareChallengeContent.getUserCount())}));
        this.f87639x.setText(R.string.bfg);
        this.f87708j.setTag(50331648, Integer.valueOf(18));
        this.f87708j.setTag(67108864, shareChallengeContent.getChallengeId());
        this.f87708j.setTag(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
