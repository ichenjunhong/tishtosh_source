package com.p683ss.android.ugc.aweme.login.depenimpl;

import android.os.Bundle;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C27975m.C27976a;
import com.p683ss.android.ugc.aweme.account.AccountDepeService;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.login.C27968i;
import com.p683ss.android.ugc.aweme.login.C27969j;
import com.p683ss.android.ugc.aweme.login.C27970k;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.login.depenimpl.AccountDepeImpl */
public class AccountDepeImpl implements AccountDepeService {
    private C27976a mAfterLoginActions = new C27976a() {
        /* renamed from: a */
        public final C0013i<Bundle> mo56372a(Bundle bundle) {
            return C0013i.m18a((Callable<TResult>) new C27968i<TResult>(bundle), C0013i.f25b);
        }

        /* renamed from: b */
        public final C0013i<Bundle> mo56373b(Bundle bundle) {
            return C0013i.m18a((Callable<TResult>) new C27969j<TResult>(bundle), C0013i.f25b);
        }

        /* renamed from: c */
        public final C0013i<Bundle> mo56374c(Bundle bundle) {
            return C0013i.m22b((Callable<TResult>) new C27970k<TResult>(bundle));
        }
    };

    public static AccountDepeService createAccountDepeServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(AccountDepeService.class);
        if (a != null) {
            return (AccountDepeService) a;
        }
        if (C27991b.f73458aO == null) {
            synchronized (AccountDepeService.class) {
                if (C27991b.f73458aO == null) {
                    C27991b.f73458aO = new AccountDepeImpl();
                }
            }
        }
        return (AccountDepeImpl) C27991b.f73458aO;
    }

    public C27976a getAfterLoginUtilsActions(Bundle bundle) {
        return this.mAfterLoginActions;
    }

    public List<C22254a> getAfterLoginActions(Bundle bundle) {
        return I18nBridgeService.getBridgeService_Monster().getAfterLoginActions(bundle);
    }

    public List<C22254a> getAfterSwitchAccountActions(Bundle bundle) {
        return I18nBridgeService.getBridgeService_Monster().getAfterSwitchAccountActions(bundle);
    }
}
