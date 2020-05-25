package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2233a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2240h.C44638a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2240h.C44638a.C44639a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2240h.C44638a.C44640b;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a */
public final class C44582a extends C23751c<User> {
    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C52711k.m112234a();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aw4, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…user_item, parent, false)");
        return new C44638a(inflate);
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        if (vVar != null) {
            C44638a aVar = (C44638a) vVar;
            Object obj = mo50673a().get(i);
            C52711k.m112236a(obj, "data[position]");
            User user = (User) obj;
            C52711k.m112240b(user, "user");
            C23515d.m57669a((RemoteImageView) aVar.f112921a, user.getAvatarMedium());
            aVar.f112922b.setText(C47915gg.m103643a(user, true));
            aVar.f112921a.setOnClickListener(new C44639a(aVar, user));
            aVar.f112922b.setOnClickListener(new C44640b(aVar, user));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder");
    }
}
