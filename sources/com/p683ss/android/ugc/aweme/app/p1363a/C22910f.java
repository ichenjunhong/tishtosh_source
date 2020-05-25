package com.p683ss.android.ugc.aweme.app.p1363a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.C24477c;
import com.p683ss.android.ugc.aweme.IAccountUserService.C20841a;
import com.p683ss.android.ugc.aweme.account.util.C22267i;
import com.p683ss.android.ugc.aweme.base.p1411c.C23483b;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32489b;
import com.p683ss.android.ugc.aweme.optimize.PerformanceAB;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.p2383d.C47572a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.p683ss.android.ugc.aweme.web.C48278h;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.app.a.f */
public class C22910f implements C20841a {
    /* renamed from: a */
    private static String m56369a(User user) {
        if (user == null || user.getAvatarThumb() == null || C23715d.m58202a((Collection<T>) user.getAvatarThumb().getUrlList())) {
            return "";
        }
        return (String) user.getAvatarThumb().getUrlList().get(0);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m56368a(User user, User user2) throws Exception {
        synchronized (C22910f.class) {
            C47572a aVar = new C47572a();
            if (user.getUserMode() == 0) {
                int a = aVar.mo94886a(user.getUid());
                if (a == 2 || a == 1) {
                    user.setUserMode(a);
                }
            }
            boolean isFlowcardMember = user.isFlowcardMember();
            if (isFlowcardMember != user2.isFlowcardMember()) {
                C32489b b = C32474a.m75189a().mo65792b();
                b.isOpen = isFlowcardMember;
                b.changeType = 0;
                C32474a.m75189a().mo65791a(b);
            }
            C22267i.m55117a();
            C22909e.m56367a(user);
            C33194e.m76279d().updateIMUser(C33194e.m76261a(user));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo44389a(int i, User user, User user2, Bundle bundle) {
        boolean z;
        boolean z2 = false;
        if (i != 10) {
            switch (i) {
                case 4:
                    if (C10181b.m20511a().mo18172a(PerformanceAB.class, true, "is_performance_poor", 31744, true)) {
                        C0013i.m18a((Callable<TResult>) new C22911g<TResult>(user2, user), (Executor) C24076h.m58902c());
                        break;
                    } else {
                        C47572a aVar = new C47572a();
                        if (user2.getUserMode() == 0) {
                            int a = aVar.mo94886a(user2.getUid());
                            if (a == 2 || a == 1) {
                                user2.setUserMode(a);
                            }
                        }
                        boolean isFlowcardMember = user2.isFlowcardMember();
                        if (isFlowcardMember != user.isFlowcardMember()) {
                            C32489b b = C32474a.m75189a().mo65792b();
                            b.isOpen = isFlowcardMember;
                            b.changeType = 0;
                            C32474a.m75189a().mo65791a(b);
                        }
                        C22909e.m56367a(user2);
                        C22267i.m55117a();
                        C33194e.m76279d().updateIMUser(C33194e.m76261a(user2));
                        break;
                    }
                case 5:
                    C47718bf.m103288a(new C23484c(user2));
                    break;
                case 6:
                    C33194e.m76279d().updateIMUser(C33194e.m76261a(user2));
                    break;
            }
        } else {
            C47718bf.m103289b(new C23483b(user2));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("user_id", user2.getUid());
            } catch (JSONException unused) {
            }
            C47718bf.m103289b(new C48278h("userLogin", jSONObject));
        }
        List asList = Arrays.asList(new Integer[]{Integer.valueOf(6), Integer.valueOf(7)});
        if (user == null || user2 == null) {
            z = false;
        } else {
            z2 = !TextUtils.equals(user.getNickname(), user2.getNickname());
            z = !TextUtils.equals(m56369a(user), m56369a(user2));
        }
        if (asList.contains(Integer.valueOf(i)) || z2 || z) {
            C24477c cVar = new C24477c();
            if (z2) {
                cVar.f64859b = user2.getNickname();
            }
            if (z) {
                cVar.f64860c = m56369a(user2);
            }
            C47957v.m103771b(new C22912h(cVar));
        }
    }
}
