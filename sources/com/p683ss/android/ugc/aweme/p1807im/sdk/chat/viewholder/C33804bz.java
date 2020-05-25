package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bz */
public class C33804bz extends C33805c<SharePoiContent> {

    /* renamed from: u */
    private RemoteImageView f87687u;

    /* renamed from: v */
    private DmtTextView f87688v;

    /* renamed from: w */
    private DmtTextView f87689w;

    /* renamed from: x */
    private RemoteImageView f87690x;

    /* renamed from: y */
    private RemoteImageView f87691y;

    /* renamed from: z */
    private RemoteImageView f87692z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87687u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87688v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87689w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87690x = (RemoteImageView) this.itemView.findViewById(R.id.arp);
        this.f87691y = (RemoteImageView) this.itemView.findViewById(R.id.arq);
        this.f87692z = (RemoteImageView) this.itemView.findViewById(R.id.arr);
    }

    public C33804bz(View view, int i) {
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
    public void mo71780a(C11207p pVar, C11207p pVar2, SharePoiContent sharePoiContent, int i) {
        super.mo71780a(pVar, pVar2, sharePoiContent, i);
        this.f87688v.setText(sharePoiContent.getTitle());
        this.f87689w.setVisibility(0);
        if (TextUtils.isEmpty(sharePoiContent.getSubtitle())) {
            this.f87689w.setText(C2240a.m6772a(this.itemView.getContext().getResources().getString(R.string.bm1), new Object[]{C35280q.m79766a((long) sharePoiContent.getUserCount())}));
        } else {
            this.f87689w.setText(sharePoiContent.getSubtitle());
        }
        ((C13833a) this.f87687u.getHierarchy()).mo25902b((int) R.drawable.azq);
        ((C13833a) this.f87687u.getHierarchy()).mo25907c((int) R.drawable.azq);
        C23515d.m57668a(this.f87687u, (int) R.drawable.azp);
        C23515d.m57669a(this.f87690x, (UrlModel) sharePoiContent.getCoverUrl().get(0));
        C23515d.m57669a(this.f87691y, (UrlModel) sharePoiContent.getCoverUrl().get(1));
        C23515d.m57669a(this.f87692z, (UrlModel) sharePoiContent.getCoverUrl().get(2));
        this.f87708j.setTag(50331648, Integer.valueOf(16));
        this.f87708j.setTag(67108864, sharePoiContent.getPoiId());
        this.f87708j.setTag(50331649, this.f87707i);
    }
}
