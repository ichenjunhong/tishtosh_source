package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRouter;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.e */
public final class C29675e extends C26840g<C46069d> {
    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new StickerCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sh, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C46069d dVar = (C46069d) mo50673a().get(i);
        StickerCollectViewHolder stickerCollectViewHolder = (StickerCollectViewHolder) vVar;
        stickerCollectViewHolder.f77745c = dVar;
        stickerCollectViewHolder.tvStickerName.setText(dVar.name);
        stickerCollectViewHolder.tvDesigner.setText(dVar.ownerName);
        C23729p.m58265b(false, stickerCollectViewHolder.tvDesignerTag);
        stickerCollectViewHolder.tvUserCount.setText(stickerCollectViewHolder.tvUserCount.getContext().getString(R.string.cev, new Object[]{C33095b.m76068a(dVar.userCount)}));
        if (dVar.iconUrl == null || dVar.iconUrl.getUrlList() == null || dVar.iconUrl.getUrlList().isEmpty()) {
            C23515d.m57668a(stickerCollectViewHolder.ivCover, (int) R.drawable.b2g);
        } else {
            C23515d.m57677a(stickerCollectViewHolder.ivCover, (String) dVar.iconUrl.getUrlList().get(0));
        }
        stickerCollectViewHolder.f77743a.setOnClickListener(new C47687av(dVar) {

            /* renamed from: a */
            final /* synthetic */ C46069d f77746a;

            /* renamed from: a */
            public final void mo59929a(View view) {
                Context context = StickerCollectViewHolder.this.f77743a.getContext();
                C46069d dVar = this.f77746a;
                String str = "collection_prop";
                String str2 = "";
                String str3 = dVar.f116246id;
                C23089d a = C23089d.m56640a();
                if (!TextUtils.isEmpty(str2)) {
                    a.mo47829a("tab_name", str2);
                }
                C26890h.m65011a("click_personal_collection", a.mo47829a("enter_from", str).mo47829a(C42311c.f106865i, "prop").mo47829a("prop_id", str3).f61491a);
                String str4 = dVar.f116246id;
                C23089d a2 = C23089d.m56640a();
                if (!TextUtils.isEmpty(str2)) {
                    a2.mo47829a("tab_name", str2);
                }
                C26890h.m65011a("enter_prop_detail", a2.mo47829a("enter_from", str).mo47829a("enter_method", "click_collection_prop").mo47829a("prop_id", str4).f61491a);
                SmartRouter.buildRoute(context, "aweme://stickers/detail").withParam("extra_stickers", (Serializable) C17593ar.m43277a((E[]) new String[]{dVar.f116246id})).open();
            }

            {
                this.f77746a = r2;
            }
        });
        stickerCollectViewHolder.ivRecord.setOnClickListener(new C47687av(dVar) {

            /* renamed from: a */
            final /* synthetic */ C46069d f77748a;

            /* renamed from: a */
            public final void mo59929a(View view) {
                FaceStickerBean.sCurPropSource = "favorite_prop";
                if (StickerCollectViewHolder.this.f77744b == null) {
                    StickerCollectViewHolder.this.f77744b = new C41941ab(StickerCollectViewHolder.this.ivRecord.getContext(), "prop_page");
                    C41941ab abVar = StickerCollectViewHolder.this.f77744b;
                    abVar.f106169i = "prop_collection";
                    abVar.f106171k = C29768d.f77765a;
                }
                if (this.f77748a.children == null || this.f77748a.children.isEmpty()) {
                    StickerCollectViewHolder.this.f77744b.mo86051a(C17593ar.m43277a((E[]) new String[]{this.f77748a.f116246id}));
                } else {
                    StickerCollectViewHolder.this.f77744b.mo86051a((ArrayList) this.f77748a.children);
                }
                C29692a.m69742c(2, this.f77748a.f116246id);
            }

            {
                this.f77748a = r2;
            }
        });
        stickerCollectViewHolder.mo59961a();
    }
}
