package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cj */
public class C33816cj extends C33805c<ShareUserContent> {

    /* renamed from: u */
    private RemoteImageView f87751u;

    /* renamed from: v */
    private DmtTextView f87752v;

    /* renamed from: w */
    private DmtTextView f87753w;

    /* renamed from: x */
    private DmtTextView f87754x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87751u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87752v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87753w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87754x = (DmtTextView) this.itemView.findViewById(R.id.cxk);
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

    public C33816cj(View view, int i) {
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
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareUserContent shareUserContent, int i) {
        super.mo71780a(pVar, pVar2, shareUserContent, i);
        this.f87752v.setText(shareUserContent.getName());
        this.f87753w.setVisibility(0);
        if (C35279p.m79763a()) {
            DmtTextView dmtTextView = this.f87753w;
            StringBuilder sb = new StringBuilder("@");
            sb.append(shareUserContent.getDesc());
            dmtTextView.setText(sb.toString());
        } else {
            DmtTextView dmtTextView2 = this.f87753w;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C11010c.m22280a().getString(R.string.bdn));
            sb2.append(shareUserContent.getDesc());
            dmtTextView2.setText(sb2.toString());
        }
        this.f87754x.setText(R.string.bpa);
        C13837e eVar = ((C13833a) this.f87751u.getHierarchy()).f36079a;
        eVar.mo25937a(true);
        ((C13833a) this.f87751u.getHierarchy()).mo25899a(eVar);
        C23515d.m57669a(this.f87751u, shareUserContent.getAvatar());
        this.f87708j.setTag(50331648, Integer.valueOf(21));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
