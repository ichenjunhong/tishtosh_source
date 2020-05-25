package com.p683ss.android.ugc.aweme.follow.widet;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.b */
final /* synthetic */ class C31989b implements Runnable {

    /* renamed from: a */
    private final C31980a f83499a;

    /* renamed from: b */
    private final User f83500b;

    C31989b(C31980a aVar, User user) {
        this.f83499a = aVar;
        this.f83500b = user;
    }

    public final void run() {
        C31980a aVar = this.f83499a;
        User user = this.f83500b;
        int followStatus = user.getFollowStatus();
        int i = 0;
        if (followStatus != 4) {
            switch (followStatus) {
                case 0:
                    if (!user.isSecret()) {
                        if (user.getFollowerStatus() != 1) {
                            i = 1;
                            break;
                        } else {
                            i = 2;
                            break;
                        }
                    } else {
                        i = 4;
                        break;
                    }
            }
        }
        if (user.getFollowStatus() != 4 && i == 4) {
            FragmentActivity fragmentActivity = aVar.f83486a;
            C23051bf privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
            int intValue = ((Integer) privacyAccountFollowCount.mo47782d()).intValue();
            if (intValue == 0) {
                new C10643a(fragmentActivity).mo18899b((int) R.string.cxb).mo18886a((int) R.string.bdf, (OnClickListener) null).mo18897a().mo18882b();
            } else if (intValue > 0 && intValue < 4) {
                C10691a.m21548c((Context) fragmentActivity, (int) R.string.cxc).mo19066a();
            }
            privacyAccountFollowCount.mo47776a(Integer.valueOf(intValue + 1));
        }
        aVar.mo65172a(i, user);
    }
}
