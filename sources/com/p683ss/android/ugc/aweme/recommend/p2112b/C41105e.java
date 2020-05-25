package com.p683ss.android.ugc.aweme.recommend.p2112b;

import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.p1382aq.C23205al;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.b.e */
public final class C41105e extends C41096c {
    /* renamed from: b */
    public final int mo83606b() {
        return R.layout.biv;
    }

    /* renamed from: f */
    public final boolean mo83619f() {
        return false;
    }

    public C41105e(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
    }

    /* renamed from: a */
    public final void mo83605a(User user, String str, int i) {
        C52711k.m112240b(str, "eventType");
        if (user != null) {
            C23205al a = new C23205al(null, 1, null).mo47981c(str).mo47979a(user.getUid()).mo47983e(user.getRecommendReason()).mo47978a(Integer.valueOf(i));
            DataCenter dataCenter = this.f104431a;
            if (dataCenter != null) {
                dataCenter.mo48228a("key_recommend_user_event", (Object) a);
            }
        }
    }
}
