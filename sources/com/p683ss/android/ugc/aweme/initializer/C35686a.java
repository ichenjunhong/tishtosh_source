package com.p683ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.profile.api.C39791d;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.initializer.a */
public final class C35686a implements C39527aa {
    /* renamed from: g */
    private static IUserService m80631g() {
        return BaseUserService.getBaseUserService_Monster();
    }

    /* renamed from: a */
    public final boolean mo74280a() {
        return C47915gg.m103651b();
    }

    /* renamed from: f */
    public final boolean mo74286f() {
        return TimeLockRuler.isTeenModeON();
    }

    /* renamed from: c */
    public final String mo74283c() {
        return m80631g().getCurrentUserID();
    }

    /* renamed from: b */
    public final boolean mo74282b() {
        return m80631g().isLogin();
    }

    /* renamed from: d */
    public final String mo74284d() {
        User currentUser = m80631g().getCurrentUser();
        if (currentUser != null) {
            return currentUser.getSecUid();
        }
        return "";
    }

    /* renamed from: e */
    public final C22055c mo74285e() {
        User currentUser = m80631g().getCurrentUser();
        if (currentUser != null) {
            return new C35698k(currentUser);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo74281b(C20834a aVar) {
        AccountService.createIAccountServicebyMonsterPlugin().removeLoginOrLogoutListener(aVar);
    }

    /* renamed from: a */
    public final void mo74278a(C20834a aVar) {
        AccountService.createIAccountServicebyMonsterPlugin().addLoginOrLogoutListener(aVar);
    }

    /* renamed from: a */
    public final void mo74279a(boolean z) {
        m80631g().setIsOldUser(true);
    }

    /* renamed from: a */
    public final C22055c mo74275a(String str, String str2) throws Exception {
        if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
            return new C35698k(C39791d.m88502a(C39791d.m88508b(str2, str, 0), false, (String) null));
        }
        return new C35698k(C39791d.m88502a(C39791d.m88505a(str, str2, "", 0), false, (String) null));
    }

    /* renamed from: a */
    public final void mo74276a(Activity activity, String str, String str2, Bundle bundle, final C39528a aVar) {
        C27965f.m66721a(activity, str, str2, bundle, (C23505g) new C23505g() {
            /* renamed from: a */
            public final void mo46279a() {
                if (aVar != null) {
                    aVar.mo64371a();
                }
            }

            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
                if (aVar != null) {
                    aVar.mo64372b();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo74277a(Fragment fragment, String str, String str2, Bundle bundle, final C39528a aVar) {
        C27965f.m66725a(fragment, str, str2, bundle, (C23505g) new C23505g() {
            /* renamed from: a */
            public final void mo46279a() {
                if (aVar != null) {
                    aVar.mo64371a();
                }
            }

            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
                if (aVar != null) {
                    aVar.mo64372b();
                }
            }
        });
    }
}
