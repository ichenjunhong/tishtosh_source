package com.p683ss.android.ugc.aweme.recommend;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p683ss.android.ugc.aweme.profile.util.C40535ai;
import com.p683ss.android.ugc.aweme.recommend.C41116k.C41117a;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserDialogTask.C41078a;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.m */
public final class C41125m {

    /* renamed from: a */
    static C41126n f104507a;

    /* renamed from: b */
    public static volatile boolean f104508b;

    /* renamed from: c */
    public static final C41125m f104509c = new C41125m();

    private C41125m() {
    }

    /* renamed from: a */
    public static final void m90813a(C41126n nVar) {
        boolean z;
        C52711k.m112240b(nVar, "params");
        if (!C40535ai.m103651b()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (!g.isLogin() || !RecommendUserDialogShowStrategy.m90741a()) {
                return;
            }
            if (!C41078a.m90750b()) {
                f104507a = nVar;
                return;
            }
            RecommendUserDialogList a = C41078a.m90749a();
            if (a != null) {
                Collection recommendUsers = a.getRecommendUsers();
                if (recommendUsers == null || recommendUsers.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && C41127o.m90814a()) {
                    Object obj = nVar.f104510a.get();
                    if (!(obj instanceof FragmentActivity)) {
                        obj = null;
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) obj;
                    if (fragmentActivity != null) {
                        C41117a aVar = C41116k.f104492e;
                        C0654k supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
                        aVar.mo83630a(supportFragmentManager, a, nVar.f104511b, nVar.f104512c);
                    }
                }
            }
        }
    }
}
