package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseRedEnvelopeContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.a */
public abstract class C33729a<CONTENT extends BaseRedEnvelopeContent> extends C33805c<CONTENT> {

    /* renamed from: u */
    private RemoteImageView f87501u;

    /* renamed from: v */
    private DmtTextView f87502v;

    /* renamed from: w */
    private DmtTextView f87503w;

    /* renamed from: x */
    private DmtTextView f87504x;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71782b() {
        super.mo71782b();
        this.f87713o.mo73331a(this.f87708j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87501u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87502v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87503w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87504x = (DmtTextView) this.itemView.findViewById(R.id.cxk);
    }

    public C33729a(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, CONTENT content, int i) {
        super.mo71780a(pVar, pVar2, content, i);
        this.f87502v.setText(content.getRedEnvelopeTitle());
        this.f87503w.setVisibility(0);
        this.f87503w.setMaxLines(Integer.MAX_VALUE);
        this.f87503w.setText(R.string.bqf);
        this.f87504x.setText(R.string.bpj);
        C23515d.m57668a(this.f87501u, (int) R.drawable.az8);
        this.f87708j.setTag(50331648, Integer.valueOf(30));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
