package com.p683ss.android.ugc.aweme.checkprofile;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.C2240a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.b */
public final class C24790b extends C26840g<User> {

    /* renamed from: a */
    private C24791a f65617a;

    /* renamed from: com.ss.android.ugc.aweme.checkprofile.b$a */
    public interface C24791a {
        /* renamed from: a */
        void mo50665a(User user);
    }

    /* renamed from: a */
    public final List<User> mo50673a() {
        if (super.mo50673a() == null) {
            return new ArrayList();
        }
        return super.mo50673a();
    }

    C24790b(C24791a aVar) {
        this.f65617a = aVar;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C24792c) {
            m60328a(vVar.getAdapterPosition(), "show");
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new C24792c(viewGroup);
    }

    /* renamed from: a */
    static void m60328a(int i, String str) {
        C26890h.m65011a("notification_message_folded_message", C23089d.m56640a().mo47829a("action_type", str).mo47829a("account_type", "check_profile").mo47826a("client_order", i).f61491a);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C24792c) {
            C24792c cVar = (C24792c) vVar;
            User user = (User) this.f70670n.get(i);
            cVar.f65622e = this.f65617a;
            cVar.f65623f = user;
            cVar.f65618a.setText(user.getNickname());
            cVar.f65619b.setText(C2240a.m6772a(cVar.f65619b.getResources().getString(R.string.baa), new Object[]{C47915gg.m103656e(user)}));
            cVar.f65620c.setText(C2240a.m6772a(cVar.f65620c.getResources().getString(R.string.b0l), new Object[]{Integer.valueOf(user.getFollowerCount()), Integer.valueOf(user.getAwemeCount())}));
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            cVar.f65621d.setUserData(userVerify);
            cVar.itemView.setOnClickListener(cVar);
            cVar.f65621d.mo48964b();
            C47916gh.m103675a(cVar.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), cVar.f65618a);
        }
    }
}
