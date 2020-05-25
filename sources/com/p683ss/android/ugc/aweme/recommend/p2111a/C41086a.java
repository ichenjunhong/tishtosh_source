package com.p683ss.android.ugc.aweme.recommend.p2111a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.recommend.p2112b.C41088a;
import com.p683ss.android.ugc.aweme.recommend.p2112b.C41089b;
import com.p683ss.android.ugc.aweme.recommend.p2112b.C41104d;
import com.p683ss.android.ugc.aweme.recommend.p2112b.C41105e;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.a.a */
public final class C41086a extends C26840g<User> {

    /* renamed from: a */
    private final int f104430a;

    public C41086a(int i) {
        this.f104430a = i;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        switch (this.f104430a) {
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C41088a) {
            ((C41088a) vVar).mo83611e();
        }
    }

    /* renamed from: a */
    public final int mo83602a(String str) {
        List<User> a = mo50673a();
        if (a == null) {
            return -1;
        }
        int i = 0;
        for (User user : a) {
            CharSequence charSequence = str;
            C52711k.m112236a((Object) user, "it");
            if (TextUtils.equals(charSequence, user.getUid())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 3:
                return new C41104d(viewGroup);
            case 4:
                return new C41105e(viewGroup);
            default:
                return new C41089b(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        C41088a aVar = (C41088a) vVar;
        List a = mo50673a();
        User user = null;
        if (a != null && i >= 0 && i < a.size()) {
            user = (User) mo50673a().get(i);
        }
        aVar.mo83613a(user);
        if (!(vVar instanceof C41104d) || i >= mo48636c() - 1) {
            aVar.mo83610d();
        } else {
            aVar.mo83608c();
        }
    }
}
