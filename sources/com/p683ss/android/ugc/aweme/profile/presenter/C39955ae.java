package com.p683ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.api.C39791d;
import com.p683ss.android.ugc.aweme.profile.api.C39792e;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p683ss.android.ugc.aweme.profile.experiment.HideProfileMessageButton;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ae */
public class C39955ae extends C39992y {

    /* renamed from: c */
    String f101852c;

    /* renamed from: d */
    String f101853d;

    /* renamed from: e */
    public String f101854e;

    /* renamed from: h */
    public int f101855h;

    /* renamed from: i */
    public boolean f101856i;

    public C39955ae() {
        mo81856e();
    }

    /* renamed from: e */
    public final void mo81856e() {
        mo54799a(new C26832a<UserResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length < 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                String str;
                String str2;
                String str3;
                Object[] objArr2 = objArr;
                if (!super.sendRequest(objArr)) {
                    C23089d a = new C23089d().mo47829a("enter_from", C39955ae.this.f101854e);
                    if (objArr2 != null) {
                        a.mo47829a("params", TextUtils.join(",", objArr2));
                    }
                    C26890h.m65011a("profile_request_request", a.f61491a);
                    return false;
                }
                C39955ae.this.f101852c = (String) objArr2[0];
                C39955ae.this.f101853d = (String) objArr2[1];
                if (objArr2.length > 2) {
                    str = (String) objArr2[2];
                } else {
                    str = null;
                }
                if (C32816h.m75716b().getSecIdSwitch().intValue() == 0) {
                    C39792e.m88511a().mo80874a(this.mHandler, C39955ae.this.f101852c, C39955ae.this.f101853d, str, C39955ae.this.mo81857f());
                } else if (!TextUtils.isEmpty(C39955ae.this.f101853d)) {
                    C39792e.m88511a();
                    C9381g gVar = this.mHandler;
                    String str4 = C39955ae.this.f101853d;
                    int f = C39955ae.this.mo81857f();
                    if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
                        str3 = C39791d.m88508b(str4, (String) null, f);
                    } else {
                        str3 = C39791d.m88501a().appendQueryParameter("sec_user_id", str4).appendQueryParameter("address_book_access", String.valueOf(C47945d.m103731a())).appendQueryParameter("from", String.valueOf(f)).toString();
                    }
                    C39792e.m88512a(gVar, str3);
                } else {
                    C39792e.m88511a();
                    C9381g gVar2 = this.mHandler;
                    String str5 = C39955ae.this.f101852c;
                    int f2 = C39955ae.this.mo81857f();
                    if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
                        str2 = C39791d.m88509b(null, str5, str, f2);
                    } else {
                        str2 = C39791d.m88504a(str5, str, f2);
                    }
                    C39792e.m88512a(gVar2, str2);
                }
                C26890h.m65011a("profile_request_request", new C23089d().mo47829a("enter_from", C39955ae.this.f101854e).mo47829a(C22835a.f61196a, C39955ae.this.f101853d).mo47829a("uid", C39955ae.this.f101852c).f61491a);
                return true;
            }
        });
    }

    /* renamed from: f */
    public final int mo81857f() {
        if (TextUtils.equals(this.f101854e, "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(this.f101854e, "prop_page")) {
            return 3;
        }
        if (TextUtils.equals(this.f101854e, "general_search") && this.f101855h == 2) {
            return 2;
        }
        if (TextUtils.equals(this.f101854e, "general_search") && this.f101855h == 3) {
            return 4;
        }
        if (!TextUtils.equals(this.f101854e, "general_search") || this.f101855h != 1) {
            return 0;
        }
        return 6;
    }

    /* renamed from: b */
    public void mo44838b() {
        User user;
        String str;
        if (this.f101856i) {
            C2667b.m7667b("profile", "info", 0);
        }
        IMUser iMUser = null;
        if (this.f70700f == null || this.f70700f.getData() == null) {
            user = null;
        } else {
            user = ((UserResponse) this.f70700f.getData()).getUser();
        }
        if (!(this.f70700f == null || this.f70700f.getData() == null)) {
            C0013i.m18a((Callable<TResult>) new C39957af<TResult>((UserResponse) this.f70700f.getData()), (Executor) C26890h.m65003a());
        }
        if (!(this.f70700f == null || this.f70700f.getData() == null)) {
            C29981aa a = C29981aa.m70153a();
            String str2 = this.f101852c;
            LogPbBean logPb = ((UserResponse) this.f70700f.getData()).getLogPb();
            if (!(TextUtils.isEmpty(str2) || logPb == null || logPb.getImprId() == null)) {
                a.f78236b.put(str2, a.f78237c.mo34889b(logPb));
            }
        }
        if (user == null || C20854a.m53167g().isUserEmpty(user)) {
            C26890h.m65011a("profile_request_response", new C23089d().mo47829a("enter_from", this.f101854e).mo47826a("is_success", 0).mo47829a("fail_info", "user_is_empty").mo47829a("to_user_id", this.f101852c).mo47829a("log_pb", C29981aa.m70153a().mo60163b(this.f101852c)).f61491a);
            return;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            IIMService d = C33200k.m76279d();
            if (user != null) {
                iMUser = IMUser.fromUser(user);
            }
            d.updateIMUserFollowStatus(iMUser);
        }
        if (this.f70701g == null || (!TextUtils.isEmpty(((C39980n) this.f70701g).mo81901d()) && !TextUtils.equals(user.getUid(), ((C39980n) this.f70701g).mo81901d()))) {
            String str3 = "profile_request_response";
            C23089d a2 = new C23089d().mo47829a("enter_from", this.f101854e).mo47826a("is_success", 1);
            String str4 = "fail_info";
            StringBuilder sb = new StringBuilder();
            sb.append(this.f101852c);
            sb.append(",");
            sb.append(this.f101853d);
            sb.append(",");
            if (this.f70701g == null) {
                str = "";
            } else {
                str = ((C39980n) this.f70701g).mo81901d();
            }
            sb.append(str);
            sb.append(",");
            sb.append(user.getUid());
            C26890h.m65011a(str3, a2.mo47829a(str4, sb.toString()).mo47829a("log_pb", C29981aa.m70153a().mo60163b(this.f101852c)).f61491a);
            return;
        }
        ((C39980n) this.f70701g).mo81890a(user);
        mo81911a(user);
        RoomStatusEvent roomStatusEvent = new RoomStatusEvent();
        roomStatusEvent.f8661b = Long.parseLong(user.getUid());
        roomStatusEvent.f8660a = user.roomId;
        roomStatusEvent.f8662c = !user.isLive();
        C47718bf.m103288a(roomStatusEvent);
        if (!C47915gg.m103664m(user)) {
            int followStatus = user.getFollowStatus();
            if (followStatus == 1 || followStatus == 2) {
                IMainServiceHelper provideIMainServiceHelper_Monster = MainServiceHelperImpl.provideIMainServiceHelper_Monster();
                if ((provideIMainServiceHelper_Monster == null || !provideIMainServiceHelper_Monster.isChatFunOfflineUnder16()) && (!C10181b.m20511a().mo18172a(HideProfileMessageButton.class, true, "hide_profile_message_button", 31744, false) || user.isShowMessageButton())) {
                    C26890h.m65011a("show_message_button", new C23089d().mo47829a("enter_from", "others_homepage").mo47829a("user_id", user.getUid()).f61491a);
                }
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        if (this.f101856i) {
            C2667b.m7663a("profile", "info", 0);
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        if (this.f101856i) {
            C2667b.m7664a("profile", "info", 0, C10201a.m20660a(C11010c.m22280a(), (Throwable) exc));
        }
        C23089d a = new C23089d().mo47829a("to_user_id", this.f101852c).mo47829a("enter_from", this.f101854e).mo47826a("is_success", 0).mo47829a("fail_info", exc.getMessage());
        if (exc instanceof C23459a) {
            a.mo47829a("response", ((C23459a) exc).getResponse());
        }
        Map<String, String> map = a.f61491a;
        C26890h.m65011a("profile_request_response", map);
        C32458a.m75141a(4, "aweme/v1/user", map.toString());
        super.mo44840c_(exc);
    }
}
