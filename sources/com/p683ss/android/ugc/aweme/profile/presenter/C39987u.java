package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.api.C39792e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.u */
public final class C39987u extends C39992y {

    /* renamed from: a */
    public String f101922a;

    public C39987u() {
        mo54799a(new C26832a<UserResponse>() {
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                C39792e.m88511a().mo80874a(this.mHandler, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), null, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        User user;
        String str;
        if (this.f70700f == null || this.f70700f.getData() == null) {
            user = null;
        } else {
            user = ((UserResponse) this.f70700f.getData()).getUser();
        }
        if (user == null || C20854a.m53167g().isUserEmpty(user)) {
            String str2 = "profile_request_response";
            C23089d dVar = new C23089d();
            String str3 = "to_user_id";
            if (user != null) {
                str = user.getUid();
            } else {
                str = "";
            }
            C26890h.m65011a(str2, dVar.mo47829a(str3, str).mo47829a("enter_from", "personal_homepage").mo47826a("is_success", 0).mo47829a("fail_info", "user_is_empty").f61491a);
            return;
        }
        C20854a.m53167g().updateCurUser(user);
        if (this.f70701g != null) {
            ((C39980n) this.f70701g).mo81890a(user);
            mo81911a(user);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        C23089d a = new C23089d().mo47829a("to_user_id", C20854a.m53167g().getCurUserId()).mo47829a("enter_from", "personal_homepage").mo47826a("is_success", 0).mo47829a("fail_info", exc.getMessage());
        if (exc instanceof C23459a) {
            a.mo47829a("response", ((C23459a) exc).getResponse());
        }
        Map<String, String> map = a.f61491a;
        C26890h.m65011a("profile_request_response", map);
        C32458a.m75141a(4, "aweme/v1/user", map.toString());
        super.mo44840c_(exc);
    }
}
