package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27881bm;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28604by;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.x */
public final class C28157x extends C28604by<SearchUser> implements C26877c<SearchUser>, C39979m {

    /* renamed from: a */
    public C32772s f73944a;

    /* renamed from: c */
    private HashMap f73945c;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.x$a */
    final class C28158a implements C32112c {
        public C28158a() {
        }

        /* renamed from: a */
        public final boolean mo56498a(User user) {
            String str;
            String str2;
            String str3;
            C52711k.m112240b(user, "user");
            JSONObject jSONObject = new JSONObject();
            String str4 = "enter_from";
            try {
                if (C28157x.this.f74963o == 1) {
                    str3 = "search_history";
                } else {
                    str3 = "search_recommend";
                }
                jSONObject.put(str4, str3);
            } catch (Exception unused) {
            }
            if (user.getFollowStatus() != 0) {
                C26890h.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            } else {
                try {
                    jSONObject.put("follow_from", "search_result");
                } catch (JSONException unused2) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("discovery").setValue(user.getUid()).setJsonObject(jSONObject));
            }
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            new C23253w(str).mo48161b("search_result").mo48163c("follow_button").mo48166f(user.getUid()).mo48164d("search_result").mo48165e("follow_button").mo48169s(user.getRequestId()).mo48076e();
            C28390aj ajVar = C28390aj.f74551a;
            if (user.getFollowStatus() == 0) {
                str2 = "search_follow";
            } else {
                str2 = "search_follow_cancel";
            }
            String str5 = str2;
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "user.uid");
            ajVar.mo56824a(str5, uid, "search_user", true, "");
            return true;
        }

        /* renamed from: a */
        public final void mo56497a(User user, int i) {
            C52711k.m112240b(user, "user");
            View view = C28157x.this.getView();
            String str = C28157x.this.f74960l;
            String requestId = user.getRequestId();
            String uid = user.getUid();
            String a = C28393ak.m67382a(C28157x.this.f74960l);
            C28381ab.m67350a(view, uid, i);
            C28393ak.m67385a(i, str, requestId, (C23231d) ((C23249s) ((C23249s) ((C23249s) new C23249s().mo47942a(true)).mo48137c(C28393ak.m67381a(0)).mo48145t(requestId).mo47944b(false)).mo47943b(String.valueOf(i))).mo48144s(uid), 0, a);
            C28393ak.m67384a(0, requestId, uid);
            SmartRouter.buildRoute((Context) C28157x.this.getActivity(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "search_result").withParam("profile_enterprise_type", user.getCommerceUserLevel()).withParam("extra_previous_page_position", "main_head").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.g.x$b */
    public static final class C28159b implements C24493b {

        /* renamed from: a */
        final /* synthetic */ C28157x f73947a;

        /* renamed from: b */
        final /* synthetic */ Exception f73948b;

        /* renamed from: a */
        public final void mo45353a() {
            C32772s sVar = this.f73947a.f73944a;
            if (sVar == null) {
                C52711k.m112234a();
            }
            sVar.mo66351c();
        }

        /* renamed from: b */
        public final void mo45354b() {
            C22971a.m56494a(this.f73947a.getContext(), this.f73948b, R.string.b47);
        }

        C28159b(C28157x xVar, Exception exc) {
            this.f73947a = xVar;
            this.f73948b = exc;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo56545a(int i) {
        if (this.f73945c == null) {
            this.f73945c = new HashMap();
        }
        View view = (View) this.f73945c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73945c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo56547b_(boolean z) {
        return true;
    }

    /* renamed from: j */
    public final void mo56548j() {
        if (this.f73945c != null) {
            this.f73945c.clear();
        }
    }

    /* renamed from: l */
    public final String mo56549l() {
        return "user";
    }

    /* renamed from: o */
    public final void mo56551o() {
        mo58239a((C26840g<D>) new C27881bm<D>(new C27797ad(false), this.f74960l, new C28158a(), this));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f73944a != null) {
            C32772s sVar = this.f73944a;
            if (sVar == null) {
                C52711k.m112234a();
            }
            sVar.mo66347S_();
        }
        mo56548j();
    }

    /* renamed from: n */
    public final void mo56550n() {
        boolean z;
        if (this.f74963o == C41440e.FROM_NEARBY) {
            z = true;
        } else {
            z = false;
        }
        mo58298a((C28128i<?>) new C28163z<Object>(z));
        mo58297J().mo54800a((C26877c) this);
        this.f73944a = C32616c.f84865a.getFollowPresenter();
        C32772s sVar = this.f73944a;
        if (sVar == null) {
            C52711k.m112234a();
        }
        sVar.mo66348a((C39979m) this);
        mo58297J().f73866b = this;
    }

    /* renamed from: a */
    private final void m67039a(FollowStatus followStatus) {
        if (isViewValid() && mo58250x() != null) {
        }
    }

    @C53771m
    public final void onFollowStatus(FollowStatus followStatus) {
        C52711k.m112240b(followStatus, "status");
        m67039a(followStatus);
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        C52711k.m112240b(followStatus, "followStatus");
        if (isViewValid()) {
            m67039a(followStatus);
        }
    }

    /* renamed from: a */
    public final void mo56546a(String str) {
        C52711k.m112240b(str, "keyword");
        if (mo58250x() != null) {
            C26840g x = mo58250x();
            if (x != null) {
                ((C27881bm) x).f73083f = str;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchUserAdapter");
        }
    }

    public final void onFollowFail(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (isViewValid()) {
            if (C23794bh.m58389c().mo50264a(exc)) {
                C23794bh.m58389c().mo50263a(getChildFragmentManager(), (C23459a) exc, new C28159b(this, exc));
            } else {
                C22971a.m56494a(getContext(), exc, R.string.b47);
            }
        }
    }

    @C53771m
    public final void onProfileFollowEvent(C24530d dVar) {
        C52711k.m112240b(dVar, "event");
        if (dVar.f64952b instanceof User) {
            Object obj = dVar.f64952b;
            if (obj != null) {
                User user = (User) obj;
                FollowStatus followStatus = new FollowStatus();
                followStatus.userId = user.getUid();
                followStatus.followStatus = dVar.f64951a;
                m67039a(followStatus);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<? extends SearchUser> list, boolean z) {
        C28128i J = mo58297J();
        C52711k.m112240b(J, "presenter");
        super.mo47026b(list, ((C28163z) J).mo56575e());
    }
}
