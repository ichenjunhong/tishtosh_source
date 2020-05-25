package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cc */
public class C33809cc extends C33805c<BaseContent> {

    /* renamed from: v */
    RemoteImageView f87726v;

    /* renamed from: w */
    DmtTextView f87727w;

    /* renamed from: x */
    DmtTextView f87728x;

    /* renamed from: y */
    DmtTextView f87729y;

    /* renamed from: z */
    View f87730z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87726v = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87727w = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87728x = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87729y = (DmtTextView) this.itemView.findViewById(R.id.cxk);
        this.f87730z = this.itemView.findViewById(R.id.e1b);
    }

    public C33809cc(View view, int i) {
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
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
    }
}
