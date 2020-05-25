package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareStickerContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cf */
public class C33812cf extends C33805c<ShareStickerContent> {

    /* renamed from: u */
    private RemoteImageView f87733u;

    /* renamed from: v */
    private DmtTextView f87734v;

    /* renamed from: w */
    private DmtTextView f87735w;

    /* renamed from: x */
    private DmtTextView f87736x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = (View) mo71845a((int) R.id.ze);
        Object a = mo71845a((int) R.id.aqo);
        C52711k.m112236a(a, "bindView(R.id.icon_iv)");
        this.f87733u = (RemoteImageView) a;
        Object a2 = mo71845a((int) R.id.d1l);
        C52711k.m112236a(a2, "bindView(R.id.title_tv)");
        this.f87734v = (DmtTextView) a2;
        Object a3 = mo71845a((int) R.id.a4k);
        C52711k.m112236a(a3, "bindView(R.id.desc_tv)");
        this.f87735w = (DmtTextView) a3;
        Object a4 = mo71845a((int) R.id.cxk);
        C52711k.m112236a(a4, "bindView(R.id.tag_tv)");
        this.f87736x = (DmtTextView) a4;
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

    public C33812cf(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareStickerContent shareStickerContent, int i) {
        long j;
        super.mo71780a(pVar, pVar2, shareStickerContent, i);
        if (shareStickerContent != null) {
            DmtTextView dmtTextView = this.f87734v;
            if (dmtTextView == null) {
                C52711k.m112237a("titleView");
            }
            dmtTextView.setText(shareStickerContent.getTitle());
            DmtTextView dmtTextView2 = this.f87735w;
            if (dmtTextView2 == null) {
                C52711k.m112237a("descView");
            }
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = this.f87735w;
            if (dmtTextView3 == null) {
                C52711k.m112237a("descView");
            }
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            Long userCount = shareStickerContent.getUserCount();
            if (userCount != null) {
                j = userCount.longValue();
            } else {
                j = 0;
            }
            objArr[0] = C35280q.m79766a(j);
            dmtTextView3.setText(resources.getString(R.string.ag2, objArr));
            RemoteImageView remoteImageView = this.f87733u;
            if (remoteImageView == null) {
                C52711k.m112237a("iconView");
            }
            C35186ab.m79432a(remoteImageView, shareStickerContent.getCover(), (int) R.drawable.b04, (int) R.drawable.b04);
            RemoteImageView remoteImageView2 = this.f87733u;
            if (remoteImageView2 == null) {
                C52711k.m112237a("iconView");
            }
            C23515d.m57669a(remoteImageView2, shareStickerContent.getCover());
        }
        DmtTextView dmtTextView4 = this.f87736x;
        if (dmtTextView4 == null) {
            C52711k.m112237a("tagView");
        }
        dmtTextView4.setText(R.string.drf);
        this.f87708j.setTag(50331648, Integer.valueOf(39));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
