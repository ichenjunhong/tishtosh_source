package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.core.widget.CustomFontTextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.ss.android.ugc.trill.R;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.o */
public final class C8191o extends C53035c<C8219f, C8192a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.o$a */
    static class C8192a extends C1352v {

        /* renamed from: a */
        ImageView f22356a;

        /* renamed from: b */
        ImageView f22357b;

        /* renamed from: c */
        TextView f22358c;

        /* renamed from: d */
        HSImageView f22359d;

        /* renamed from: e */
        CustomFontTextView f22360e;

        public C8192a(View view) {
            super(view);
            this.f22356a = (ImageView) view.findViewById(R.id.c8c);
            this.f22357b = (ImageView) view.findViewById(R.id.dm3);
            this.f22358c = (TextView) view.findViewById(R.id.dn1);
            this.f22359d = (HSImageView) view.findViewById(R.id.bdh);
            this.f22360e = (CustomFontTextView) view.findViewById(R.id.ady);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8192a(layoutInflater.inflate(R.layout.amg, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        FansClubData fansClubData;
        C8192a aVar = (C8192a) vVar;
        C8219f fVar = (C8219f) obj;
        C5213c.m11824b(aVar.f22357b, fVar.f22442a.getAvatarThumb());
        aVar.f22358c.setText(fVar.f22442a.getNickName());
        if (fVar.f22442a.getNobleLevelInfo() != null) {
            C5213c.m11814a(aVar.f22356a, fVar.f22442a.getNobleLevelInfo().getNobleIcon());
        }
        if (!(fVar.f22442a == null || fVar.f22442a.getFansClub() == null)) {
            if (FansClubData.isValid(fVar.f22442a.getFansClub().getData())) {
                fansClubData = fVar.f22442a.getFansClub().getData();
            } else {
                fansClubData = null;
            }
            if (!FansClubData.isValid(fansClubData) || fansClubData.badge == null || fansClubData.badge.icons == null) {
                aVar.f22359d.setVisibility(8);
                aVar.f22360e.setVisibility(8);
            } else {
                ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                if (imageModel != null) {
                    aVar.f22359d.setVisibility(0);
                    aVar.f22360e.setVisibility(0);
                    C5213c.m11820a(aVar.f22359d, imageModel);
                    aVar.f22360e.setText(fansClubData.clubName);
                }
            }
        }
        aVar.itemView.setOnClickListener(new C8193p(fVar));
    }
}
