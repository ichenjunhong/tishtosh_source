package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bg */
public class C33785bg extends C33805c<ShareCompilationContent> {

    /* renamed from: u */
    private RemoteImageView f87648u;

    /* renamed from: v */
    private DmtTextView f87649v;

    /* renamed from: w */
    private DmtTextView f87650w;

    /* renamed from: x */
    private DmtTextView f87651x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = (View) mo71845a((int) R.id.ze);
        Object a = mo71845a((int) R.id.aqo);
        C52711k.m112236a(a, "bindView(R.id.icon_iv)");
        this.f87648u = (RemoteImageView) a;
        Object a2 = mo71845a((int) R.id.d1l);
        C52711k.m112236a(a2, "bindView(R.id.title_tv)");
        this.f87649v = (DmtTextView) a2;
        Object a3 = mo71845a((int) R.id.a4k);
        C52711k.m112236a(a3, "bindView(R.id.desc_tv)");
        this.f87650w = (DmtTextView) a3;
        Object a4 = mo71845a((int) R.id.cxk);
        C52711k.m112236a(a4, "bindView(R.id.tag_tv)");
        this.f87651x = (DmtTextView) a4;
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "onClickListener");
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo71840a(OnLongClickListener onLongClickListener) {
        C52711k.m112240b(onLongClickListener, "onLongClickListener");
        this.f87708j.setOnLongClickListener(onLongClickListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
        }
    }

    public C33785bg(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareCompilationContent shareCompilationContent, int i) {
        long j;
        super.mo71780a(pVar, pVar2, shareCompilationContent, i);
        if (shareCompilationContent != null) {
            DmtTextView dmtTextView = this.f87649v;
            if (dmtTextView == null) {
                C52711k.m112237a("titleView");
            }
            dmtTextView.setText(shareCompilationContent.getTitle());
            DmtTextView dmtTextView2 = this.f87650w;
            if (dmtTextView2 == null) {
                C52711k.m112237a("descView");
            }
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = this.f87650w;
            if (dmtTextView3 == null) {
                C52711k.m112237a("descView");
            }
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            Long viewCount = shareCompilationContent.getViewCount();
            if (viewCount != null) {
                j = viewCount.longValue();
            } else {
                j = 0;
            }
            objArr[0] = C35280q.m79766a(j);
            dmtTextView3.setText(resources.getString(R.string.agf, objArr));
            RemoteImageView remoteImageView = this.f87648u;
            if (remoteImageView == null) {
                C52711k.m112237a("iconView");
            }
            C35186ab.m79432a(remoteImageView, shareCompilationContent.getCover(), (int) R.drawable.dby, (int) R.drawable.dby);
        }
        DmtTextView dmtTextView4 = this.f87651x;
        if (dmtTextView4 == null) {
            C52711k.m112237a("tagView");
        }
        dmtTextView4.setText(R.string.ago);
        this.f87708j.setTag(50331648, Integer.valueOf(38));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
