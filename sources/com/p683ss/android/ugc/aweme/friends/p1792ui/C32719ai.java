package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecomendFriendItemView.C32661a;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ai */
public final class C32719ai extends C26840g<User> {

    /* renamed from: a */
    public C32661a f85222a;

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        User user = (User) this.f70670n.get(i);
        ((C32729am) vVar).f85258a.setData(user);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        RecomendFriendItemView recomendFriendItemView = new RecomendFriendItemView(viewGroup.getContext());
        recomendFriendItemView.setListener(this.f85222a);
        recomendFriendItemView.setLayoutParams(new LayoutParams(-1, (int) C9432q.m18687b(viewGroup.getContext(), 84.0f)));
        return new C32729am(recomendFriendItemView);
    }
}
