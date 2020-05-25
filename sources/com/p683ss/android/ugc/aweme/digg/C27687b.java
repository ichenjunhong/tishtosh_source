package com.p683ss.android.ugc.aweme.digg;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26842h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.digg.b */
public final class C27687b extends C26842h<User> {

    /* renamed from: b */
    String f72681b = "";

    /* renamed from: c */
    String f72682c = "";

    /* renamed from: d */
    public final C0184k f72683d;

    /* renamed from: c */
    public final int mo48636c() {
        List list = this.f70670n;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C27687b(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        this.f72683d = kVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C0184k kVar = this.f72683d;
        String str = this.f72681b;
        String str2 = this.f72682c;
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(str, "previousPage");
        C52711k.m112240b(str2, "enterFrom");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b3u, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        C27705f fVar = new C27705f(kVar, inflate, null);
        fVar.f72729h = str;
        fVar.f72730i = str2;
        return fVar;
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String nickname;
        boolean z;
        if (vVar instanceof C27705f) {
            C27705f fVar = (C27705f) vVar;
            Object obj = this.f70670n.get(i);
            C52711k.m112236a(obj, "mItems[position]");
            User user = (User) obj;
            C52711k.m112240b(user, "user");
            C23515d.m57669a((RemoteImageView) fVar.f72723b, user.getAvatarLarger());
            fVar.itemView.setOnClickListener(new C27708b(user, fVar, user));
            TextView textView = fVar.f72724c;
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                nickname = user.getRemarkName();
            } else {
                nickname = user.getNickname();
            }
            textView.setText(nickname);
            CharSequence recommendReason = user.getRecommendReason();
            if (recommendReason == null || recommendReason.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fVar.f72725d.setVisibility(8);
                fVar.f72725d.setText("");
            } else {
                fVar.f72725d.setVisibility(0);
                fVar.f72725d.setText(user.getRecommendReason());
            }
            fVar.f72727f.mo65173a(user);
            TextUtils.equals(fVar.f72730i, "video_like_list");
            fVar.f72731j.setVisibility(8);
        }
    }
}
