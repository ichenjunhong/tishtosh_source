package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.b */
public final class C33858b extends C1322a<C33868g> {

    /* renamed from: a */
    final List<C33859c> f87832a = new ArrayList();

    /* renamed from: b */
    public final Context f87833b;

    public final int getItemCount() {
        return this.f87832a.size();
    }

    /* renamed from: a */
    public final void mo71888a() {
        this.f87832a.clear();
        notifyDataSetChanged();
    }

    public C33858b(Context context) {
        C52711k.m112240b(context, "context");
        this.f87833b = context;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        Context context = this.f87833b;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(context).inflate(R.layout.bcw, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…m_dm_like, parent, false)");
        return new C33868g(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C33868g gVar = (C33868g) vVar;
        C52711k.m112240b(gVar, "holder");
        C33859c cVar = (C33859c) this.f87832a.get(i);
        C52711k.m112240b(cVar, "item");
        UrlModel avatarThumb = cVar.f87835b.getAvatarThumb();
        if (avatarThumb == null) {
            C32458a.m75141a(5, "DmHelper", "avatarThumb is null");
            View view = gVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            view.setVisibility(8);
            return;
        }
        View view2 = gVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        AvatarImageView avatarImageView = (AvatarImageView) view2.findViewById(R.id.i0);
        C52711k.m112236a((Object) avatarImageView, "itemView.avatar_iv");
        avatarImageView.setVisibility(0);
        View view3 = gVar.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        C23515d.m57669a((RemoteImageView) (AvatarImageView) view3.findViewById(R.id.i0), avatarThumb);
    }
}
