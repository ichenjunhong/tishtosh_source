package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23392f;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24527a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.experiment.C29503d;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.feed.C30128ae;
import com.p683ss.android.ugc.aweme.friends.C32502a;
import com.p683ss.android.ugc.aweme.friends.adapter.C32540o;
import com.p683ss.android.ugc.aweme.friends.adapter.C32548v;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.friends.utils.C32782b;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.ImportFromMailListView;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.recommend.C41087b;
import com.p683ss.android.ugc.aweme.recommend.C41108d;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.aweme.utils.permission.PermissionStateReporter;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dr */
public final class C40346dr extends C23526a implements C23452y<User>, C26846a, C32506c, C32540o, C39981o {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f102991a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40346dr.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/friends/adapter/RecommendListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C40346dr.class), "mRecommendCommonUserPresenter", "getMRecommendCommonUserPresenter()Lcom/ss/android/ugc/aweme/profile/presenter/RecommendCommonUserPresenter;"))};

    /* renamed from: b */
    public String f102992b;

    /* renamed from: c */
    public String f102993c;

    /* renamed from: d */
    public int f102994d;

    /* renamed from: e */
    private String f102995e;

    /* renamed from: j */
    private String f102996j;

    /* renamed from: k */
    private String f102997k;

    /* renamed from: l */
    private boolean f102998l;

    /* renamed from: m */
    private List<User> f102999m = new ArrayList();

    /* renamed from: n */
    private final C52668f f103000n = C52732g.m112285a(new C40348b(this));

    /* renamed from: o */
    private final C52668f f103001o = C52732g.m112285a(new C40349c(this));

    /* renamed from: p */
    private HashMap f103002p;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dr$a */
    static final class C40347a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40346dr f103003a;

        C40347a(C40346dr drVar) {
            this.f103003a = drVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtStatusView) this.f103003a.mo82596a((int) R.id.csv)).mo19212f();
            this.f103003a.mo82597e().mo81920a(30, this.f103003a.f102992b, this.f103003a.f102994d, C47945d.m103731a(), (String) null, C47945d.m103733b(), this.f103003a.f102993c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dr$b */
    static final class C40348b extends C52712l implements C52670a<C32548v> {

        /* renamed from: a */
        final /* synthetic */ C40346dr f103004a;

        C40348b(C40346dr drVar) {
            this.f103004a = drVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C32548v(this.f103004a.getContext(), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dr$c */
    static final class C40349c extends C52712l implements C52670a<C39993z> {

        /* renamed from: a */
        final /* synthetic */ C40346dr f103005a;

        C40349c(C40346dr drVar) {
            this.f103005a = drVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C39993z(new RecommendCommonUserModel(), this.f103005a);
        }
    }

    /* renamed from: f */
    private final C32548v m89706f() {
        return (C32548v) this.f103000n.getValue();
    }

    /* renamed from: a */
    public final View mo82596a(int i) {
        if (this.f103002p == null) {
            this.f103002p = new HashMap();
        }
        View view = (View) this.f103002p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f103002p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final C39993z mo82597e() {
        return (C39993z) this.f103001o.getValue();
    }

    /* renamed from: p */
    public final boolean mo65263p() {
        return this.f102998l;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f103002p != null) {
            this.f103002p.clear();
        }
    }

    public final void onStop() {
        super.onStop();
        C37940g.m84832a().mo77418d();
    }

    /* renamed from: q */
    public final void mo65264q() {
        if (isViewValid()) {
            m89707g();
            this.f102998l = false;
        }
    }

    /* renamed from: g */
    private final void m89707g() {
        mo82597e().mo81920a(30, this.f102992b, this.f102994d, C47945d.m103731a(), (String) null, C47945d.m103733b(), this.f102993c);
        ((DmtStatusView) mo82596a((int) R.id.csv)).mo19212f();
    }

    public final void ar_() {
        mo82597e().mo81917a(30, this.f102992b, this.f102994d, C47945d.m103731a(), C47945d.m103733b(), this.f102993c);
        if (this.f102994d == 2) {
            C30128ae.m70698a("api_recommend_user", "recommend_user_activity", "load_more");
        }
        m89706f().am_();
    }

    /* renamed from: a */
    public final void mo65254a(boolean z) {
        this.f102998l = z;
    }

    /* renamed from: a */
    private final void m89705a(User user) {
        m89706f().mo65849a(user);
        mo82597e().mo81921a(user);
        C10691a.m21548c(getContext(), (int) R.string.ti).mo19066a();
    }

    /* renamed from: a */
    public final void mo60634a(RecommendList recommendList) {
        C52711k.m112240b(recommendList, "userList");
        if (isViewValid()) {
            if (C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
                ((DmtStatusView) mo82596a((int) R.id.csv)).mo19213g();
                m89706f().ao_();
                return;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) mo82596a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
            m89706f().mo50303a(m89704a(recommendList, true));
            m89706f().mo54798c(true);
            if (recommendList.hasMore()) {
                m89706f().mo54788a((C26846a) this);
                return;
            }
            m89706f().mo54788a((C26846a) null);
            m89706f().an_();
        }
    }

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
        C52711k.m112240b(recommendList, "userList");
        if (isViewValid()) {
            m89706f().ao_();
            m89706f().mo50304b(C32548v.m75311e(m89704a(recommendList, false)));
            m89706f().mo54798c(true);
            if (!recommendList.hasMore()) {
                m89706f().mo54788a((C26846a) null);
                m89706f().an_();
            }
        }
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo82596a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            if (dmtStatusView.getVisibility() != 8) {
                ((DmtStatusView) mo82596a((int) R.id.csv)).mo19214h();
            }
            m89706f().co_();
            C22971a.m56493a(getContext(), (Throwable) exc);
        }
    }

    /* renamed from: a */
    private final List<User> m89704a(RecommendList recommendList, boolean z) {
        List<User> arrayList = new ArrayList<>();
        if (this.f102994d != 16) {
            if (z) {
                int newUserCount = recommendList.getNewUserCount();
                if (!(newUserCount == -1 || recommendList.getUserList() == null || newUserCount > recommendList.getUserList().size())) {
                    for (int i = 0; i < newUserCount; i++) {
                        Object obj = recommendList.getUserList().get(i);
                        C52711k.m112236a(obj, "userList.userList[i]");
                        ((User) obj).setNewRecommend(true);
                    }
                }
            }
            List userList = recommendList.getUserList();
            C52711k.m112236a((Object) userList, "userList.userList");
            arrayList.addAll(userList);
            if (C32782b.f85367a.mo66362a()) {
                int a = C29503d.m69640a();
                if (a >= arrayList.size()) {
                    arrayList.add(new RecommendContact(null, 1, null));
                } else {
                    arrayList.add(a, new RecommendContact(null, 1, null));
                }
            }
        } else if (C9376b.m18558a((Collection<T>) this.f102999m)) {
            List userList2 = recommendList.getUserList();
            C52711k.m112236a((Object) userList2, "userList.userList");
            arrayList.addAll(userList2);
        } else {
            arrayList.addAll(this.f102999m);
            List userList3 = recommendList.getUserList();
            C52711k.m112236a((Object) userList3, "userList.userList");
            Iterable iterable = userList3;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                User user = (User) next;
                Set a2 = C41108d.m90797a();
                C52711k.m112236a((Object) user, "it");
                if (!a2.contains(user.getUid())) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll((List) arrayList2);
        }
        return arrayList;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f102992b = arguments.getString("uid");
            this.f102993c = arguments.getString(C22835a.f61196a);
            this.f102994d = arguments.getInt("type", 1);
            this.f102996j = arguments.getString("enter_from");
            this.f102995e = arguments.getString("extra_previous_page");
            this.f102997k = arguments.getString("request_id");
        }
        RecyclerView recyclerView = (RecyclerView) mo82596a((int) R.id.c_1);
        C52711k.m112236a((Object) recyclerView, "recommend_list");
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        ((RecyclerView) mo82596a((int) R.id.c_1)).mo4798a((C1331h) new C40355dv((int) C9432q.m18687b(getContext(), 6.0f)));
        m89706f().f84754h = this.f102996j;
        m89706f().f84756j = this.f102992b;
        m89706f().f84755i = this.f102995e;
        m89706f().mo54798c(false);
        ImportFromMailListView importFromMailListView = new ImportFromMailListView(getContext());
        C32548v f = m89706f();
        f.f84747a = importFromMailListView;
        f.notifyItemInserted(0);
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        DmtStatusView dmtStatusView = new DmtStatusView(context);
        C32548v f2 = m89706f();
        f2.f84748b = dmtStatusView;
        f2.notifyItemInserted(f2.getItemCount() - 1);
        m89706f().f70682s = getResources().getColor(R.color.a1a);
        m89706f().f84753g = this;
        m89706f().f84752f = this;
        m89706f().f84749c = this.f102994d;
        RecyclerView recyclerView2 = (RecyclerView) mo82596a((int) R.id.c_1);
        C52711k.m112236a((Object) recyclerView2, "recommend_list");
        recyclerView2.setAdapter(m89706f());
        int i = this.f102994d;
        if (i == 2) {
            C30128ae.m70698a("api_recommend_user", "recommend_user_activity", "refresh");
        } else if (i == 16) {
            this.f102999m = C41108d.f104473a;
        }
        ((DmtStatusView) mo82596a((int) R.id.csv)).setBuilder(C10719a.m21676a(getContext()).mo19223a().mo19229a(new C10723a(getContext()).mo19277a((int) R.drawable.b0o).mo19280b((int) R.string.ay2).mo19281b("").f28711a).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C40347a(this)));
        if (!this.f102998l) {
            m89707g();
        }
    }

    /* renamed from: a */
    public final void mo65818a(String str, int i) {
        C41302w a = C41302w.m91042a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "find_friends").mo83871a());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.baw, viewGroup, false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        if (i == 1) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (iArr[0] == 0) {
                    Context context = getContext();
                    if (context == null) {
                        C52711k.m112234a();
                    }
                    startActivity(ContactsActivity.m75414a(context, null, true));
                    PermissionStateReporter.m103713d().mo95108e();
                    return;
                }
                C10691a.m21548c((Context) getActivity(), (int) R.string.hd).mo19066a();
                ((C32502a) C23392f.m57473a(getActivity(), C32502a.class)).mo48498b(true);
                return;
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48614a(int i, Object obj, int i2, View view, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        User user = (User) obj;
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "enterMethod");
        if (isViewValid()) {
            int i3 = 1;
            switch (i) {
                case 100:
                    if (!C40350ds.m89718a(getContext())) {
                        C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
                        return;
                    }
                    if (user.getFollowStatus() == 0) {
                        i3 = 0;
                    }
                    C47718bf.m103288a(new C24527a(i3 ^ 1, user));
                    if (i3 == 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("rec_uid", user.getUid());
                            if (C52711k.m112239a((Object) "others_homepage", (Object) this.f102995e)) {
                                jSONObject.put("profile_uid", this.f102992b);
                            }
                            jSONObject.put("enter_from", this.f102996j);
                            jSONObject.put("previous_page", this.f102995e);
                            jSONObject.put("event_type", "follow");
                            jSONObject.put("impr_order", i2);
                            RecommendList d = mo82597e().mo81924d();
                            C52711k.m112236a((Object) d, "mRecommendCommonUserPresenter.data");
                            jSONObject.put("req_id", d.getRid());
                            jSONObject.put("trigger_reason", "friend_rec_message");
                            jSONObject.put("rec_reason", user.getRecommendReason());
                            String str7 = "card_type";
                            if (user.isNewRecommend()) {
                                str3 = "new";
                            } else {
                                str3 = "past";
                            }
                            jSONObject.put(str7, str3);
                            jSONObject.put("rec_user_type", C29650b.f77509a.getRecUserType(user));
                        } catch (Exception unused) {
                        }
                        C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
                        C26890h.m65012a("follow_card", jSONObject);
                        C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(user.getUid().toString()));
                    }
                    if (i3 == 0) {
                        str2 = "follow";
                    } else {
                        str2 = "follow_cancel";
                    }
                    C23253w wVar = new C23253w(str2);
                    String str8 = this.f102996j;
                    if (str8 == null) {
                        C52711k.m112234a();
                    }
                    C23253w f = wVar.mo48161b(str8).mo48163c("follow_button").mo48169s(this.f102997k).mo48164d(this.f102995e).mo48165e("other_places").mo48166f(user.getUid());
                    f.f62127Q = C29650b.f77509a.getRecUserType(user);
                    f.mo48076e();
                    return;
                case BaseNotice.HASHTAG /*101*/:
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("rec_uid", user.getUid());
                        if (C52711k.m112239a((Object) "others_homepage", (Object) this.f102995e)) {
                            jSONObject2.put("profile_uid", this.f102992b);
                        }
                        jSONObject2.put("enter_from", this.f102996j);
                        jSONObject2.put("previous_page", this.f102995e);
                        jSONObject2.put("event_type", "enter_profile");
                        jSONObject2.put("impr_order", i2);
                        RecommendList d2 = mo82597e().mo81924d();
                        C52711k.m112236a((Object) d2, "mRecommendCommonUserPresenter.data");
                        jSONObject2.put("req_id", d2.getRid());
                        jSONObject2.put("trigger_reason", "friend_rec_message");
                        jSONObject2.put("rec_reason", user.getRecommendReason());
                        String str9 = "card_type";
                        if (user.isNewRecommend()) {
                            str5 = "new";
                        } else {
                            str5 = "past";
                        }
                        jSONObject2.put(str9, str5);
                        jSONObject2.put("rec_user_type", C29650b.f77509a.getRecUserType(user));
                    } catch (Exception unused2) {
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
                    C26890h.m65012a("follow_card", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    String str10 = "request_id";
                    try {
                        RecommendList d3 = mo82597e().mo81924d();
                        C52711k.m112236a((Object) d3, "mRecommendCommonUserPresenter.data");
                        jSONObject3.put(str10, d3.getRid());
                        jSONObject3.put("enter_method", "click_head");
                    } catch (Exception unused3) {
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("to_user_id", user.getUid());
                        RecommendList d4 = mo82597e().mo81924d();
                        C52711k.m112236a((Object) d4, "mRecommendCommonUserPresenter.data");
                        jSONObject4.put("request_id", d4.getRid());
                    } catch (Exception unused4) {
                    }
                    if (C52711k.m112239a((Object) "click_name", (Object) str)) {
                        str4 = LeakCanaryFileProvider.f132049i;
                    } else {
                        str4 = "head";
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName(str4).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject4));
                    C23249s s = new C23249s().mo48144s(user.getUid());
                    String str11 = this.f102996j;
                    if (str11 == null) {
                        C52711k.m112234a();
                    }
                    C23249s t = ((C23249s) s.mo48137c(str11).mo47941a(str)).mo48145t(this.f102997k);
                    t.f62088P = C29650b.f77509a.getRecUserType(user);
                    t.mo48076e();
                    UserProfileActivity.m89400a(getContext(), C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94969a("from_recommend_card", 1).mo94972a("sec_user_id", user.getSecUid()).mo94972a("enter_from", this.f102996j).mo94972a("enter_from_request_id", user.getRequestId()).mo94972a("extra_previous_page_position", "main_head").mo94969a("need_track_compare_recommend_reason", 1).mo94972a("previous_recommend_reason", user.getRecommendReason()).mo94972a("recommend_from_type", "list").f120139a);
                    return;
                case 102:
                    if (C40350ds.m89718a(getContext())) {
                        if (this.f102994d == 16) {
                            this.f102999m.remove(user);
                        }
                        if (!(user instanceof RecommendContact)) {
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("rec_uid", user.getUid());
                                jSONObject5.put("enter_from", m89706f().f84754h);
                                jSONObject5.put("event_type", "delete");
                                jSONObject5.put("impr_order", i2);
                                jSONObject5.put("req_id", this.f102997k);
                                jSONObject5.put("trigger_reason", "friend_rec_message");
                                jSONObject5.put("rec_reason", user.getRecommendReason());
                                String str12 = "card_type";
                                if (user.isNewRecommend()) {
                                    str6 = "new";
                                } else {
                                    str6 = "past";
                                }
                                jSONObject5.put(str12, str6);
                                jSONObject5.put("rec_user_type", C29650b.f77509a.getRecUserType(user));
                            } catch (Exception unused5) {
                            }
                            C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                            C26890h.m65012a("follow_card", jSONObject5);
                            C32616c cVar = C32616c.f84865a;
                            String uid = user.getUid();
                            C52711k.m112236a((Object) uid, "user.uid");
                            cVar.dislikeRecommendUser(uid, user.getSecUid());
                            m89705a(user);
                            break;
                        } else {
                            C47718bf.m103288a(new C41087b());
                            m89705a(user);
                            return;
                        }
                    } else {
                        C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
                        return;
                    }
            }
        }
    }
}
