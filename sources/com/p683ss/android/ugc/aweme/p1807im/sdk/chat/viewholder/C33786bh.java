package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bh */
public class C33786bh extends C33805c<ShareCompilationContent> {

    /* renamed from: u */
    private RemoteImageView f87652u;

    /* renamed from: v */
    private DmtTextView f87653v;

    /* renamed from: w */
    private DmtTextView f87654w;

    /* renamed from: x */
    private RemoteImageView f87655x;

    /* renamed from: y */
    private RemoteImageView f87656y;

    /* renamed from: z */
    private RemoteImageView f87657z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = (View) mo71845a((int) R.id.ze);
        Object a = mo71845a((int) R.id.aqo);
        C52711k.m112236a(a, "bindView(R.id.icon_iv)");
        this.f87652u = (RemoteImageView) a;
        Object a2 = mo71845a((int) R.id.d1l);
        C52711k.m112236a(a2, "bindView(R.id.title_tv)");
        this.f87653v = (DmtTextView) a2;
        Object a3 = mo71845a((int) R.id.a4k);
        C52711k.m112236a(a3, "bindView(R.id.desc_tv)");
        this.f87654w = (DmtTextView) a3;
        Object a4 = mo71845a((int) R.id.arp);
        C52711k.m112236a(a4, "bindView(R.id.img1)");
        this.f87655x = (RemoteImageView) a4;
        Object a5 = mo71845a((int) R.id.arq);
        C52711k.m112236a(a5, "bindView(R.id.img2)");
        this.f87656y = (RemoteImageView) a5;
        Object a6 = mo71845a((int) R.id.arr);
        C52711k.m112236a(a6, "bindView(R.id.img3)");
        this.f87657z = (RemoteImageView) a6;
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo71840a(OnLongClickListener onLongClickListener) {
        super.mo71840a(onLongClickListener);
        this.f87708j.setOnLongClickListener(onLongClickListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
        }
    }

    public C33786bh(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareCompilationContent shareCompilationContent, int i) {
        long j;
        boolean z;
        boolean z2;
        super.mo71780a(pVar, pVar2, shareCompilationContent, i);
        if (shareCompilationContent != null) {
            DmtTextView dmtTextView = this.f87653v;
            if (dmtTextView == null) {
                C52711k.m112237a("titleView");
            }
            dmtTextView.setText(shareCompilationContent.getTitle());
            DmtTextView dmtTextView2 = this.f87654w;
            if (dmtTextView2 == null) {
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
            dmtTextView2.setText(resources.getString(R.string.agf, objArr));
            DmtTextView dmtTextView3 = this.f87654w;
            if (dmtTextView3 == null) {
                C52711k.m112237a("descView");
            }
            dmtTextView3.setVisibility(0);
            List awemeCoverList = shareCompilationContent.getAwemeCoverList();
            if (awemeCoverList != null) {
                Collection collection = awemeCoverList;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || awemeCoverList.size() < 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    awemeCoverList = null;
                }
                if (awemeCoverList != null) {
                    RemoteImageView remoteImageView = this.f87655x;
                    if (remoteImageView == null) {
                        C52711k.m112237a("coverFirstView");
                    }
                    C23515d.m57669a(remoteImageView, (UrlModel) awemeCoverList.get(0));
                    RemoteImageView remoteImageView2 = this.f87656y;
                    if (remoteImageView2 == null) {
                        C52711k.m112237a("coverSecondView");
                    }
                    C23515d.m57669a(remoteImageView2, (UrlModel) awemeCoverList.get(1));
                    RemoteImageView remoteImageView3 = this.f87657z;
                    if (remoteImageView3 == null) {
                        C52711k.m112237a("coverThirdView");
                    }
                    C23515d.m57669a(remoteImageView3, (UrlModel) awemeCoverList.get(2));
                }
            }
            RemoteImageView remoteImageView4 = this.f87652u;
            if (remoteImageView4 == null) {
                C52711k.m112237a("iconView");
            }
            C23515d.m57668a(remoteImageView4, (int) R.drawable.b00);
        }
        this.f87708j.setTag(50331648, Integer.valueOf(38));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
