package com.bytedance.android.livesdk.feed.drawerfeed;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.C2976b;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p230g.p231a.C3858h;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent.C6798a;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.C7012l;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.C7066p;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p331a.C6806a;
import com.bytedance.android.livesdk.feed.p331a.C6812e.C6815a;
import com.bytedance.android.livesdk.feed.p331a.C6812e.C6816b;
import com.bytedance.android.livesdk.feed.p337e.C6909a;
import com.bytedance.android.livesdk.feed.p338f.C6915d;
import com.bytedance.android.livesdk.feed.p341i.C6966ag;
import com.bytedance.android.livesdk.feed.p341i.C6972am;
import com.bytedance.android.livesdk.feed.p342j.C7006a;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.C7069a;
import com.bytedance.android.livesdk.feed.services.C7104d;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.widget.LiveFeedFloatTabView;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.p450h.C8751b;
import com.bytedance.android.livesdkapi.p450h.C8752c;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.l */
public class C6890l extends C6915d {

    /* renamed from: F */
    private static final String f18862F = C6890l.class.getCanonicalName();

    /* renamed from: l */
    public static C6945f f18863l = null;

    /* renamed from: G */
    private final C1340m f18864G = new C1340m() {

        /* renamed from: b */
        private boolean f18884b;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (C6890l.this.f18879j != null && i == 0) {
                if (C6890l.this.f18877h.mo4749j() > C6890l.this.f18879j.intValue() || !C6890l.this.f18872c.f19439a) {
                    this.f18884b = true;
                } else {
                    C6890l.this.f18872c.mo13277c();
                    this.f18884b = false;
                }
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (this.f18884b && C6890l.this.f18879j != null) {
                if (i2 < 0 && C6890l.this.f18879j.intValue() >= 0) {
                    int j = C6890l.this.f18877h.mo4749j();
                    if (j > C6890l.this.f18879j.intValue()) {
                        if (i2 < -5) {
                            C6890l.this.f18872c.mo13275a();
                        }
                    } else if (j < C6890l.this.f18879j.intValue()) {
                        C6890l.this.f18872c.mo13277c();
                    }
                } else if (i2 > 5 && C6890l.this.f18879j.intValue() >= 0) {
                    C6890l.this.f18872c.mo13276b();
                }
            }
        }
    };

    /* renamed from: H */
    private final Map<Long, FeedDataKey> f18865H = new HashMap();

    /* renamed from: I */
    private LiveFeedViewModel f18866I;

    /* renamed from: J */
    private String f18867J = "";

    /* renamed from: K */
    private String f18868K = "";

    /* renamed from: L */
    private C1340m f18869L;

    /* renamed from: a */
    protected View f18870a;

    /* renamed from: b */
    protected TextureView f18871b;

    /* renamed from: c */
    LiveFeedFloatTabView f18872c;

    /* renamed from: d */
    C6863a f18873d;

    /* renamed from: e */
    C6957i f18874e = C7104d.m14774a();

    /* renamed from: f */
    C8649h f18875f;

    /* renamed from: g */
    C3810b<FeedDataKey, FeedItem> f18876g;

    /* renamed from: h */
    public GridLayoutManager f18877h;

    /* renamed from: i */
    public C8751b f18878i;

    /* renamed from: j */
    public Integer f18879j = null;

    /* renamed from: k */
    public boolean f18880k = true;

    /* renamed from: m */
    LiveFeedRoomPlayComponent f18881m;

    /* renamed from: n */
    boolean f18882n = false;

    /* renamed from: h */
    public final C6806a mo13089h() {
        return this.f18873d;
    }

    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public final String mo13078a() {
        if (!C9431p.m18664a(this.f18867J)) {
            return this.f18867J;
        }
        return super.mo13078a();
    }

    /* renamed from: b */
    public final String mo13084b() {
        if (!C9431p.m18664a(this.f18868K)) {
            return this.f18868K;
        }
        return super.mo13084b();
    }

    /* renamed from: f */
    public final int mo13088f() {
        if (m14433g()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: i */
    public final long mo13090i() {
        if (f18863l != null) {
            return f18863l.f19009a;
        }
        return 1;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f18921q.mo4818b(this.f18864G);
    }

    public void onResume() {
        super.onResume();
        C9432q.m18691b((View) this.f18938z, 8);
    }

    /* renamed from: g */
    public static boolean m14433g() {
        if (f18863l == null || f18863l.mo13132a() == 2 || f18863l.mo13132a() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final C1332i mo13091j() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.f4526g = new C1302b() {
            /* renamed from: a */
            public final int mo4690a(int i) {
                if (C6890l.this.f18873d.getItemViewType(i) == R.layout.bwq) {
                    return 1;
                }
                return 2;
            }
        };
        return gridLayoutManager;
    }

    /* renamed from: d */
    public final int mo13086d() {
        int i;
        C2976b bVar = (C2976b) CoreSettingKeys.LIVE_FEED_PRELOAD.mo9431a();
        if (bVar == null) {
            i = 0;
        } else if (m14433g()) {
            i = bVar.mo7694a();
        } else {
            i = bVar.f8723a;
        }
        if (i <= 1) {
            return super.mo13086d();
        }
        return i;
    }

    /* renamed from: k */
    public final void mo13092k() {
        super.mo13092k();
        if (this.f18877h != null && this.f18932t != null) {
            this.f18932t.f19408F = this.f18877h.mo4750k();
            View c = this.f18877h.mo4736c(this.f18932t.f19408F);
            if (c != null) {
                this.f18932t.f19409G = c.getTop();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        for (FeedDataKey feedDataKey : this.f18865H.values()) {
            if (this.f18876g != null) {
                this.f18876g.mo9191c(feedDataKey);
            }
        }
    }

    /* renamed from: e */
    public final FragmentFeedViewModel mo13087e() {
        String str;
        String str2;
        this.f18932t = (TabFeedViewModel) C0214z.m441a(getActivity(), (C0212b) this.f18920p.mo13107a(mo13090i()).mo13108a((C7005j) this)).mo359a(TabFeedViewModel.class);
        this.f18932t.f11040c.observe(this, new C6901t(this));
        if (C8830k.m17330d() != null) {
            str = C8830k.m17330d().mo15060m().mo10871c();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        this.f18931s.setOnRefreshListener(new C6902u(this, str2));
        return this.f18932t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13080a(FeedItem feedItem) {
        mo13109b(feedItem);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6972am.f19061b = -1;
        C6966ag.f19055b = -1;
        this.f18873d.notifyDataSetChanged();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f18881m != null) {
            this.f18881m.mo12926a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13085b(C6945f fVar) {
        if (this.f18879j != null) {
            this.f18932t.f11045h.mo9296a(this.f18879j.intValue());
            mo13081a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo13079a(View view) {
        super.mo13079a(view);
        this.f18870a = view.findViewById(R.id.cvb);
        if (VERSION.SDK_INT >= 21) {
            this.f18870a.setBackgroundResource(R.drawable.bqi);
        }
        this.f18871b = (TextureView) view.findViewById(R.id.cv_);
        this.f18872c = (LiveFeedFloatTabView) view.findViewById(R.id.ahv);
        if (this.f18921q != null && this.f18869L != null) {
            this.f18921q.mo4801a(this.f18869L);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C8830k.m17330d() != null) {
            this.f18875f = C8830k.m17330d().mo15051d();
            this.f18881m = new LiveFeedRoomPlayComponent(new C6798a() {
                /* renamed from: a */
                public final RecyclerView mo12946a() {
                    return C6890l.this.f18921q;
                }

                /* renamed from: b */
                public final C6806a mo12947b() {
                    return C6890l.this.mo13089h();
                }

                /* renamed from: c */
                public final BannerSwipeRefreshLayout mo12948c() {
                    return C6890l.this.f18931s;
                }

                /* renamed from: d */
                public final View mo12949d() {
                    return C6890l.this.f18870a;
                }

                /* renamed from: e */
                public final TextureView mo12950e() {
                    return C6890l.this.f18871b;
                }

                /* renamed from: f */
                public final C8649h mo12951f() {
                    return C6890l.this.f18875f;
                }

                /* renamed from: g */
                public final C0176h mo12952g() {
                    return C6890l.this.getLifecycle();
                }

                /* renamed from: h */
                public final Activity mo12953h() {
                    return C6890l.this.getActivity();
                }

                /* renamed from: i */
                public final String mo12954i() {
                    if (C6890l.f18863l != null) {
                        return C6890l.f18863l.f19016h;
                    }
                    return "";
                }
            });
            this.f18881m.mo12985d(m14433g());
            this.f18881m.mo12926a(getUserVisibleHint());
        }
    }

    /* renamed from: a */
    public final C6815a mo13077a(C6815a aVar) {
        return new C6815a().mo13004a((C0184k) getActivity()).mo13011a((BaseFeedDataViewModel) this.f18919o).mo13007a(this.f18921q).mo13009a((C6816b) new C6895n(this)).mo13008a(mo13089h()).mo13006a(mo13091j()).mo13005a(mo13112m()).mo13012a(false).mo13003a(mo13088f()).mo13010a((C7012l) this);
    }

    /* renamed from: a */
    public final void mo13081a(C6945f fVar) {
        f18863l = fVar;
        this.f18867J = fVar.f19012d;
        this.f18868K = fVar.f19016h;
        TabFeedViewModel tabFeedViewModel = (TabFeedViewModel) this.f18922r.f18677c;
        if (!this.f18865H.containsKey(Long.valueOf(fVar.f19009a))) {
            if (this.f18865H.isEmpty()) {
                this.f18865H.put(Long.valueOf(mo13090i()), tabFeedViewModel.mo13267f());
            }
            this.f18865H.put(Long.valueOf(fVar.f19009a), FeedDataKey.m14536a(fVar.f19016h, fVar.f19012d, mo13090i()));
        }
        IFeedRepository iFeedRepository = (IFeedRepository) this.f18874e.mo13096a(tabFeedViewModel.mo13267f());
        tabFeedViewModel.f19397D = false;
        tabFeedViewModel.f19370B = (FeedDataKey) this.f18865H.get(Long.valueOf(fVar.f19009a));
        this.f18874e.mo13098a((FeedDataKey) this.f18865H.get(Long.valueOf(fVar.f19009a)), (ItemRepository) iFeedRepository);
        tabFeedViewModel.mo13262a(fVar.f19012d, fVar.f19016h);
        tabFeedViewModel.mo13274c(this.f18867J);
        tabFeedViewModel.mo13265d();
        tabFeedViewModel.mo9355a();
        mo9206a(((IFeedRepository) this.f18874e.mo13096a(tabFeedViewModel.mo13267f())).mo12968a().mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6903v<Object>(this), C6904w.f18899a));
        if (this.f18881m != null) {
            this.f18881m.mo12985d(m14433g());
        }
        this.f18872c.mo13284a(fVar);
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        StringBuilder sb = new StringBuilder("live_merge_");
        sb.append(fVar.f19016h);
        hashMap.put("enter_from_merge", sb.toString());
        C7007b.m14648a("livesdk_enter_subtab", (Map<String, String>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13082a(C7069a aVar) {
        if (aVar == C7069a.SUCCESS) {
            if (this.f18932t != null && this.f18932t.f19408F > 0 && this.f18873d.getItemCount() > this.f18932t.f19408F) {
                this.f18877h.mo4721a(this.f18932t.f19408F, this.f18932t.f19409G);
            }
            this.f18932t.f19409G = 0;
            this.f18932t.f19408F = 0;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C3982g.m10091b(C3983a.LiveFeedInit);
        C3974b.m10061a().mo9384b(C3983a.LiveFeedInit.name(), (C0184k) this, getContext());
        C3974b.m10061a().mo9377a(C3983a.LiveFeedInit.name(), (C0184k) this, getContext());
        if (C8830k.m17330d() != null) {
            str = C8830k.m17330d().mo15060m().mo10873e();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f18867J = str;
        } else {
            List c = C7128p.m14812d().mo13185c();
            if (c != null && c.size() > 0) {
                f18863l = (C6945f) c.get(0);
                this.f18867J = f18863l.f19012d;
            }
        }
        super.onCreate(bundle);
        this.f18866I = (LiveFeedViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p.mo13107a(mo13090i())).mo359a(LiveFeedViewModel.class);
        this.f18866I.mo13273a();
        this.f18866I.f19402d = this.f18867J;
        LiveFeedViewModel liveFeedViewModel = this.f18866I;
        liveFeedViewModel.f19401c = true;
        liveFeedViewModel.f19399a.mo12973a(true);
        C6880c cVar = new C6880c(this);
        HashMap hashMap = new HashMap();
        Integer valueOf = Integer.valueOf(R.layout.aln);
        C6861a aVar = cVar.f18843f;
        C6957i iVar = cVar.f18839b;
        C7023m mVar = cVar.f18840c;
        C8757g gVar = cVar.f18841d;
        C8649h hVar = cVar.f18842e;
        hashMap.put(valueOf, new C6882d(aVar, iVar, mVar, gVar));
        Integer valueOf2 = Integer.valueOf(R.layout.bwq);
        C6861a aVar2 = cVar.f18843f;
        C6957i iVar2 = cVar.f18839b;
        C7023m mVar2 = cVar.f18840c;
        C8757g gVar2 = cVar.f18841d;
        C8649h hVar2 = cVar.f18842e;
        hashMap.put(valueOf2, new C6883e(aVar2, iVar2, mVar2, gVar2));
        hashMap.put(Integer.valueOf(R.layout.apk), new C6884f(cVar.f18838a));
        hashMap.put(Integer.valueOf(R.layout.bxj), new C6886h(new C7066p() {
        }));
        hashMap.put(Integer.valueOf(R.layout.apj), C6887i.f18859a);
        hashMap.put(Integer.valueOf(R.layout.api), C6888j.f18860a);
        hashMap.put(Integer.valueOf(R.layout.alt), C6889k.f18861a);
        hashMap.put(Integer.valueOf(R.layout.alm), new C6885g(cVar.f18843f, cVar.f18839b, cVar.f18840c, cVar.f18841d));
        this.f18873d = new C6863a(hashMap, cVar.f18839b, cVar.f18838a);
        if (getUserVisibleHint()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("page_name", C6890l.class.getName());
            C7006a.m14645b().mo9199b("ttlive_page", (Map<String, ?>) hashMap2);
        }
        ((C4002ac) C4495a.m10823a().mo10300a(C6909a.class).mo6513a(C4064k.m10180a(this)).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9405a((C1710e<? super T>) new C6894m<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13083a(String str) {
        TabFeedViewModel tabFeedViewModel = this.f18932t;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("feed_refresh");
        tabFeedViewModel.mo13263a(sb.toString());
        if (!C6905x.m14464a(getContext())) {
            C4204a.m10421a(getContext(), (int) R.string.eas);
        }
        if (C6828b.f18712a) {
            C3858h.m9785a().mo9243b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18922r.f18677c.f19377p.observe(this, new C6897p(this));
        this.f18877h = (GridLayoutManager) this.f18921q.getLayoutManager();
        if (this.f18936x.mo13270a() != null && !C9414h.m18630a(this.f18936x.mo13270a())) {
            this.f18921q.mo4801a(this.f18864G);
            this.f18872c.setTabList(this.f18936x.mo13270a());
            this.f18872c.setOnTabClickListener(new C6898q(this));
        }
        if (this.f18866I != null) {
            this.f18866I.f19400b.observe(this, new C6899r(this));
        }
        String string = getString(R.string.eal);
        if (getActivity() != null && (getActivity() instanceof C8752c)) {
            ((C8752c) getActivity()).mo15414a(string);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "tab_click");
        C7007b.m14648a("live_enter", (Map<String, String>) hashMap);
        this.f18919o.f19382u.observe(this, new C6900s(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f18921q.setBackgroundColor(getContext().getResources().getColor(R.color.b3h));
        return this.f18937y;
    }
}
