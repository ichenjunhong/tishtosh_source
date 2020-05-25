package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.friends.adapter.C32513a;
import com.p683ss.android.ugc.aweme.friends.adapter.C32519b;
import com.p683ss.android.ugc.aweme.friends.adapter.C32519b.C32520a;
import com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32569b;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32578g;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IndexView.C32643a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.a */
public final class C32694a extends C23526a implements C32569b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f85188a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32694a.class), "mSummonFriendSearchPresenter", "getMSummonFriendSearchPresenter()Lcom/ss/android/ugc/aweme/friends/presenter/SummonFriendSearchPresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32694a.class), "normalEmptyView", "getNormalEmptyView()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32694a.class), "searchEmptyView", "getSearchEmptyView()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;"))};

    /* renamed from: l */
    public static final C32695a f85189l = new C32695a(null);

    /* renamed from: b */
    public final AtFriendsViewModel f85190b = new AtFriendsViewModel();

    /* renamed from: c */
    public final C32513a f85191c = new C32513a();

    /* renamed from: d */
    public final C32519b f85192d = new C32519b();

    /* renamed from: e */
    public LinearLayoutManager f85193e;

    /* renamed from: j */
    public C32764k f85194j;

    /* renamed from: k */
    public int f85195k;

    /* renamed from: m */
    private final C52668f f85196m = C52732g.m112285a(C32696b.f85201a);

    /* renamed from: n */
    private final C52668f f85197n = C52732g.m112285a(new C32697c(this));

    /* renamed from: o */
    private final C52668f f85198o = C52732g.m112285a(new C32709n(this));

    /* renamed from: p */
    private String f85199p;

    /* renamed from: q */
    private HashMap f85200q;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$a */
    public static final class C32695a {
        private C32695a() {
        }

        public /* synthetic */ C32695a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$b */
    static final class C32696b extends C52712l implements C52670a<C32578g> {

        /* renamed from: a */
        public static final C32696b f85201a = new C32696b();

        C32696b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C32578g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$c */
    static final class C32697c extends C52712l implements C52670a<C10722c> {

        /* renamed from: a */
        final /* synthetic */ C32694a f85202a;

        C32697c(C32694a aVar) {
            this.f85202a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C10723a(this.f85202a.getContext()).mo19277a((int) R.drawable.b0u).mo19280b((int) R.string.ku).mo19282c(R.string.kv).f28711a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$d */
    static final class C32698d<TTaskResult, TContinuationResult> implements C0011g<AllFriends, Void> {

        /* renamed from: a */
        final /* synthetic */ C32694a f85203a;

        C32698d(C32694a aVar) {
            this.f85203a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            int i;
            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo31c() && !iVar.mo33d()) {
                C52711k.m112236a((Object) baseUserService_Monster, "userService");
                if (baseUserService_Monster.isLogin()) {
                    C32694a aVar = this.f85203a;
                    C32764k kVar = new C32764k(this.f85203a.getContext(), ((AllFriends) iVar.mo34e()).indexLabels, ((AllFriends) iVar.mo34e()).indexLabelCount);
                    ((RecyclerView) this.f85203a.mo66296c(R.id.ca3)).mo4798a((C1331h) kVar);
                    aVar.f85194j = kVar;
                    IndexView indexView = (IndexView) this.f85203a.mo66296c(R.id.ate);
                    List<String> list = ((AllFriends) iVar.mo34e()).indexLabels;
                    List<Integer> list2 = ((AllFriends) iVar.mo34e()).indexLabelCount;
                    indexView.f84953a.clear();
                    indexView.f84954b.clear();
                    indexView.f84953a.addAll(list);
                    indexView.f84954b.addAll(list2);
                    indexView.requestLayout();
                    C32513a aVar2 = this.f85203a.f85191c;
                    AllFriends allFriends = (AllFriends) iVar.mo34e();
                    aVar2.f84628b = allFriends;
                    List<? extends IMUser> arrayList = new ArrayList<>();
                    if (allFriends != null) {
                        arrayList.addAll(allFriends.recentFriends);
                        arrayList.addAll(allFriends.mutualFriends);
                        arrayList.addAll(allFriends.allFollowingFriends);
                        aVar2.f84627a = arrayList;
                    }
                    this.f85203a.f85191c.notifyDataSetChanged();
                    C32694a aVar3 = this.f85203a;
                    if (this.f85203a.f85191c.getItemCount() == 0) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    aVar3.mo66295b(i);
                    return null;
                }
            }
            ((DmtStatusView) this.f85203a.mo66296c(R.id.csl)).mo19213g();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$e */
    static final class C32699e implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C32694a f85204a;

        C32699e(C32694a aVar) {
            this.f85204a = aVar;
        }

        public final void ar_() {
            this.f85204a.f85192d.am_();
            this.f85204a.mo66293a().mo44934a_(Boolean.valueOf(false), this.f85204a.f85190b.latestSearchKey, C32694a.m75582a(this.f85204a.f85195k));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$f */
    public static final class C32700f implements C32520a {

        /* renamed from: a */
        final /* synthetic */ C32694a f85205a;

        /* renamed from: a */
        public final String mo65821a() {
            String str = this.f85205a.mo66293a().f84807a;
            C52711k.m112236a((Object) str, "mSummonFriendSearchPresenter.requestId");
            return str;
        }

        C32700f(C32694a aVar) {
            this.f85205a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$g */
    static final class C32701g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32694a f85206a;

        C32701g(C32694a aVar) {
            this.f85206a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f85206a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$h */
    static final class C32702h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32694a f85207a;

        C32702h(C32694a aVar) {
            this.f85207a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f85207a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$i */
    static final class C32703i implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C32694a f85208a;

        C32703i(C32694a aVar) {
            this.f85208a = aVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            C26894c.m65021a(this.f85208a.getActivity(), (DmtEditText) this.f85208a.mo66296c(R.id.ci5));
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$j */
    public static final class C32704j extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C32694a f85209a;

        /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$j$a */
        static final class C32705a<TTaskResult, TContinuationResult> implements C0011g<List<? extends IMUser>, Void> {

            /* renamed from: a */
            final /* synthetic */ C32704j f85210a;

            C32705a(C32704j jVar) {
                this.f85210a = jVar;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                C52711k.m112236a((Object) iVar, "task");
                if (iVar.mo31c() || iVar.mo33d()) {
                    ((DmtStatusView) this.f85210a.f85209a.mo66296c(R.id.csl)).mo19212f();
                } else {
                    this.f85210a.f85209a.f85192d.f84644a = (List) iVar.mo34e();
                    List list = (List) iVar.mo34e();
                    if (list != null && (!list.isEmpty())) {
                        this.f85210a.f85209a.mo66294a((Integer) null);
                    }
                    this.f85210a.f85209a.f85192d.notifyDataSetChanged();
                }
                this.f85210a.f85209a.mo66293a().mo44934a_(Boolean.valueOf(true), this.f85210a.f85209a.f85190b.latestSearchKey, C32694a.m75582a(this.f85210a.f85209a.f85195k));
                return null;
            }
        }

        C32704j(C32694a aVar) {
            this.f85209a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            int i2;
            C52711k.m112240b(editable, "s");
            boolean z2 = false;
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            ImageButton imageButton = (ImageButton) this.f85209a.mo66296c(R.id.tp);
            C52711k.m112236a((Object) imageButton, "clearSearchInput");
            if (imageButton.getVisibility() != i) {
                if (i == 8) {
                    C32694a aVar = this.f85209a;
                    if (this.f85209a.f85191c.getItemCount() == 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    aVar.mo66295b(i2);
                }
                ImageButton imageButton2 = (ImageButton) this.f85209a.mo66296c(R.id.tp);
                C52711k.m112236a((Object) imageButton2, "clearSearchInput");
                imageButton2.setVisibility(i);
            }
            String obj = editable.toString();
            if (obj != null) {
                String obj2 = C52830p.m112447b(obj).toString();
                C32519b bVar = this.f85209a.f85192d;
                C52711k.m112240b(obj2, "<set-?>");
                bVar.f84646c = obj2;
                if (obj2.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    if (!this.f85209a.mo66293a().av_()) {
                        this.f85209a.mo66293a().mo54800a(this.f85209a);
                    }
                    if (this.f85209a.f85191c.getItemCount() == 0) {
                        ((DmtStatusView) this.f85209a.mo66296c(R.id.csl)).mo19212f();
                    }
                    AtFriendsViewModel atFriendsViewModel = this.f85209a.f85190b;
                    List<? extends IMUser> list = this.f85209a.f85191c.f84627a;
                    if (list == null) {
                        list = C52575l.m112097a();
                    }
                    atFriendsViewModel.searchKeyWord(obj2, list).mo20a((C0011g<TResult, TContinuationResult>) new C32705a<TResult,TContinuationResult>(this), C0013i.f25b);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$k */
    static final class C32706k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32694a f85211a;

        C32706k(C32694a aVar) {
            this.f85211a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f85211a.mo66296c(R.id.ci5)).setText("");
            ((DmtEditText) this.f85211a.mo66296c(R.id.ci5)).clearFocus();
            C26894c.m65021a(this.f85211a.getActivity(), (DmtEditText) this.f85211a.mo66296c(R.id.ci5));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$l */
    public static final class C32707l extends C32461a {

        /* renamed from: a */
        final /* synthetic */ C32694a f85212a;

        /* renamed from: b */
        final /* synthetic */ View f85213b;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            ((IndexView) this.f85212a.mo66296c(R.id.ate)).setRecycleViewPos(C32694a.m75581a(this.f85212a).mo4749j());
            C26894c.m65021a(this.f85212a.getActivity(), (DmtEditText) this.f85212a.mo66296c(R.id.ci5));
        }

        C32707l(C32694a aVar, View view, Context context) {
            this.f85212a = aVar;
            this.f85213b = view;
            super(context);
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (((float) i2) > C9432q.m18687b(this.f85212a.getContext(), 10.0f)) {
                C26894c.m65021a(this.f85212a.getActivity(), (DmtEditText) this.f85212a.mo66296c(R.id.ci5));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$m */
    static final class C32708m implements C32643a {

        /* renamed from: a */
        final /* synthetic */ C32694a f85214a;

        C32708m(C32694a aVar) {
            this.f85214a = aVar;
        }

        /* renamed from: a */
        public final void mo66195a(String str, int i) {
            LinearLayoutManager a = C32694a.m75581a(this.f85214a);
            IndexView indexView = (IndexView) this.f85214a.mo66296c(R.id.ate);
            int i2 = 0;
            int i3 = 0;
            while (i2 < indexView.f84954b.size() && i2 < i) {
                i3 += ((Integer) indexView.f84954b.get(i2)).intValue();
                i2++;
            }
            a.mo4721a(i3, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$n */
    static final class C32709n extends C52712l implements C52670a<C10722c> {

        /* renamed from: a */
        final /* synthetic */ C32694a f85215a;

        C32709n(C32694a aVar) {
            this.f85215a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C10723a(this.f85215a.getContext()).mo19277a((int) R.drawable.b0t).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.a$o */
    static final class C32710o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32694a f85216a;

        C32710o(C32694a aVar) {
            this.f85216a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f85216a.mo66293a().mo44934a_(Boolean.valueOf(true), this.f85216a.f85190b.latestSearchKey, C32694a.m75582a(this.f85216a.f85195k));
        }
    }

    /* renamed from: a */
    public static String m75582a(int i) {
        return i == 1 ? "comment_user" : i == 0 ? "at_user" : "";
    }

    /* renamed from: a */
    public final C32578g mo66293a() {
        return (C32578g) this.f85196m.getValue();
    }

    /* renamed from: c */
    public final View mo66296c(int i) {
        if (this.f85200q == null) {
            this.f85200q = new HashMap();
        }
        View view = (View) this.f85200q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f85200q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f85200q != null) {
            this.f85200q.clear();
        }
    }

    /* renamed from: b */
    public final void mo65890b() {
        if (isViewValid() && this.f85192d.getItemCount() == 0) {
            ((DmtStatusView) mo66296c(R.id.csl)).mo19212f();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayoutManager m75581a(C32694a aVar) {
        LinearLayoutManager linearLayoutManager = aVar.f85193e;
        if (linearLayoutManager == null) {
            C52711k.m112237a("linearLayoutManager");
        }
        return linearLayoutManager;
    }

    /* renamed from: d */
    public final void mo65891d(Exception exc) {
        if (isViewValid()) {
            if (this.f85192d.getItemCount() == 0) {
                ((DmtStatusView) mo66296c(R.id.csl)).mo19214h();
            }
            C26894c.m65021a(getActivity(), (DmtEditText) mo66296c(R.id.ci5));
        }
    }

    /* renamed from: b */
    public final void mo66295b(int i) {
        RecyclerView recyclerView = (RecyclerView) mo66296c(R.id.ca3);
        C52711k.m112236a((Object) recyclerView, "recyclerView");
        if (!C52711k.m112239a((Object) recyclerView.getAdapter(), (Object) this.f85191c)) {
            C32764k kVar = this.f85194j;
            if (kVar != null) {
                C1331h hVar = kVar;
                ((RecyclerView) mo66296c(R.id.ca3)).mo4815b(hVar);
                ((RecyclerView) mo66296c(R.id.ca3)).mo4798a(hVar);
            }
            RecyclerView recyclerView2 = (RecyclerView) mo66296c(R.id.ca3);
            C52711k.m112236a((Object) recyclerView2, "recyclerView");
            recyclerView2.setAdapter(this.f85191c);
            IndexView indexView = (IndexView) mo66296c(R.id.ate);
            C52711k.m112236a((Object) indexView, "indexView");
            indexView.setVisibility(0);
        }
        C10719a a = C10719a.m21676a(getContext());
        MtEmptyView a2 = MtEmptyView.m21697a(getContext());
        a2.setStatus(new C10723a(getContext()).mo19277a((int) R.drawable.aqy).mo19280b((int) R.string.ku).mo19282c(R.string.kv).f28711a);
        a.mo19231b((View) a2);
        ((DmtStatusView) mo66296c(R.id.csl)).setBuilder(a);
        ((DmtStatusView) mo66296c(R.id.csl)).setStatus(-1);
        ((DmtStatusView) mo66296c(R.id.csl)).setStatus(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66294a(Integer num) {
        RecyclerView recyclerView = (RecyclerView) mo66296c(R.id.ca3);
        C52711k.m112236a((Object) recyclerView, "recyclerView");
        int i = 1;
        if (!C52711k.m112239a((Object) recyclerView.getAdapter(), (Object) this.f85192d)) {
            if (this.f85194j != null) {
                RecyclerView recyclerView2 = (RecyclerView) mo66296c(R.id.ca3);
                C32764k kVar = this.f85194j;
                if (kVar == null) {
                    C52711k.m112234a();
                }
                recyclerView2.mo4815b((C1331h) kVar);
            }
            RecyclerView recyclerView3 = (RecyclerView) mo66296c(R.id.ca3);
            C52711k.m112236a((Object) recyclerView3, "recyclerView");
            recyclerView3.setAdapter(this.f85192d);
            IndexView indexView = (IndexView) mo66296c(R.id.ate);
            C52711k.m112236a((Object) indexView, "indexView");
            indexView.setVisibility(4);
        }
        if (num != null) {
            i = num.intValue();
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) mo66296c(R.id.csl);
            C52711k.m112236a((Object) dmtStatusView, "statusView");
            if (dmtStatusView.mo19215i()) {
                i = 0;
            } else {
                DmtStatusView dmtStatusView2 = (DmtStatusView) mo66296c(R.id.csl);
                C52711k.m112236a((Object) dmtStatusView2, "statusView");
                if (!dmtStatusView2.mo19216j()) {
                    DmtStatusView dmtStatusView3 = (DmtStatusView) mo66296c(R.id.csl);
                    C52711k.m112236a((Object) dmtStatusView3, "statusView");
                    if (dmtStatusView3.mo19217k()) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                }
            }
        }
        C10719a a = C10719a.m21676a(getContext()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C32710o(this));
        MtEmptyView a2 = MtEmptyView.m21697a(getContext());
        a2.setStatus(new C10723a(getContext()).mo19277a((int) R.drawable.ar0).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a);
        a.mo19231b((View) a2);
        ((DmtStatusView) mo66296c(R.id.csl)).setBuilder(a);
        ((DmtStatusView) mo66296c(R.id.csl)).setStatus(-1);
        ((DmtStatusView) mo66296c(R.id.csl)).setStatus(i);
    }

    /* renamed from: a */
    public final void mo65889a(List<SummonFriendItem> list, String str) {
        List<? extends SummonFriendItem> list2;
        if (this.f85195k == 0) {
            C26890h.m65014b("search_video_at", C23198ae.m56851a(C23089d.m56640a().mo47829a("search_keyword", str).mo47829a("log_pb", C29981aa.m70153a().mo60161a(mo66293a().f84807a)).f61491a));
        }
        if (isViewValid() && !TextUtils.isEmpty(this.f85192d.f84646c)) {
            if (mo66293a().mo65906e()) {
                this.f85192d.ao_();
            } else {
                this.f85192d.an_();
            }
            C32519b bVar = this.f85192d;
            int i = 1;
            if (list != null) {
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    SummonFriendItem summonFriendItem = (SummonFriendItem) next;
                    AtFriendsViewModel atFriendsViewModel = this.f85190b;
                    User user = summonFriendItem.mUser;
                    C52711k.m112236a((Object) user, "it.user");
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "it.user.uid");
                    if (!atFriendsViewModel.latestSearchUsersContain(uid)) {
                        arrayList.add(next);
                    }
                }
                list2 = (List) arrayList;
            } else {
                list2 = null;
            }
            bVar.f84645b = list2;
            this.f85192d.notifyDataSetChanged();
            if (this.f85192d.getItemCount() != 0) {
                i = -1;
            }
            mo66294a(Integer.valueOf(i));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C23729p.m58255a((Activity) getActivity(), getResources().getColor(R.color.a0_));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f85199p = arguments.getString("video_id");
            this.f85195k = arguments.getInt("source");
        }
        this.f85191c.f84629c = this.f85195k;
        this.f85192d.f84647d = this.f85195k;
        this.f85192d.f84648e = new C32700f(this);
        TextTitleBar textTitleBar = (TextTitleBar) mo66296c(R.id.d0s);
        C52711k.m112236a((Object) textTitleBar, "titleBar");
        textTitleBar.setUseBackIcon(true);
        TextTitleBar textTitleBar2 = (TextTitleBar) mo66296c(R.id.d0s);
        C52711k.m112236a((Object) textTitleBar2, "titleBar");
        textTitleBar2.getBackBtn().setImageResource(R.drawable.ak1);
        TextTitleBar textTitleBar3 = (TextTitleBar) mo66296c(R.id.d0s);
        C52711k.m112236a((Object) textTitleBar3, "titleBar");
        textTitleBar3.getBackBtn().setOnClickListener(new C32701g(this));
        TextTitleBar textTitleBar4 = (TextTitleBar) mo66296c(R.id.d0s);
        C52711k.m112236a((Object) textTitleBar4, "titleBar");
        textTitleBar4.getStartText().setOnClickListener(new C32702h(this));
        ((DmtEditText) mo66296c(R.id.ci5)).setHint(R.string.cpx);
        ((DmtEditText) mo66296c(R.id.ci5)).setOnKeyListener(new C32703i(this));
        ((DmtEditText) mo66296c(R.id.ci5)).addTextChangedListener(new C32704j(this));
        ((ImageButton) mo66296c(R.id.tp)).setOnClickListener(new C32706k(this));
        this.f85193e = new WrapLinearLayoutManager(getContext());
        RecyclerView recyclerView = (RecyclerView) mo66296c(R.id.ca3);
        C52711k.m112236a((Object) recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = this.f85193e;
        if (linearLayoutManager == null) {
            C52711k.m112237a("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) mo66296c(R.id.ca3)).mo4801a((C1340m) new C32707l(this, view, view.getContext()));
        ((IndexView) mo66296c(R.id.ate)).setIndexLetterTv((TextView) mo66296c(R.id.atd));
        ((IndexView) mo66296c(R.id.ate)).setOnLetterTouchListener(new C32708m(this));
        mo66295b(0);
        this.f85190b.loadAllFriends().mo20a((C0011g<TResult, TContinuationResult>) new C32698d<TResult,TContinuationResult>(this), C0013i.f25b);
        this.f85192d.mo54798c(true);
        this.f85192d.mo54788a((C26846a) new C32699e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm, viewGroup, false);
    }
}
