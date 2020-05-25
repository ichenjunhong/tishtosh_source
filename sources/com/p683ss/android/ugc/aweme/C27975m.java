package com.p683ss.android.ugc.aweme;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.login.depenimpl.AccountDepeImpl;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.m */
public final class C27975m {

    /* renamed from: com.ss.android.ugc.aweme.m$a */
    public interface C27976a {
        /* renamed from: a */
        C0013i<Bundle> mo56372a(Bundle bundle);

        /* renamed from: b */
        C0013i<Bundle> mo56373b(Bundle bundle);

        /* renamed from: c */
        C0013i<Bundle> mo56374c(Bundle bundle);
    }

    /* renamed from: a */
    public static C0013i<Bundle> m66736a(Bundle bundle) {
        int i;
        C0013i iVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        C27976a afterLoginUtilsActions = AccountDepeImpl.createAccountDepeServicebyMonsterPlugin().getAfterLoginUtilsActions(bundle);
        String string = bundle.getString("previous_uid");
        String curUserId = C20854a.m53167g().getCurUserId();
        boolean isNullUid = C20854a.m53167g().isNullUid(string);
        boolean isNullUid2 = C20854a.m53167g().isNullUid(curUserId);
        if (isNullUid && !isNullUid2) {
            i = 0;
        } else if (isNullUid || isNullUid2) {
            i = 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            iVar = afterLoginUtilsActions.mo56372a(bundle);
        } else if (i == 1) {
            iVar = afterLoginUtilsActions.mo56373b(bundle);
        } else {
            iVar = afterLoginUtilsActions.mo56374c(bundle);
        }
        C47718bf.m103288a(new C23488g(i));
        return iVar.mo29c(C27977n.f73406a);
    }
}
