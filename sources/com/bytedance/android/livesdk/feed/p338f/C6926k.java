package com.bytedance.android.livesdk.feed.p338f;

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
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.base.model.feed.C2976b;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3913t;
import com.bytedance.android.live.core.p230g.p231a.C3858h;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent.C6798a;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.C7066p;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.LiveFeedRoomPlayComponent;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p331a.C6806a;
import com.bytedance.android.livesdk.feed.p331a.C6811d;
import com.bytedance.android.livesdk.feed.p332b.C6829a;
import com.bytedance.android.livesdk.feed.p341i.C6966ag;
import com.bytedance.android.livesdk.feed.p341i.C6972am;
import com.bytedance.android.livesdk.feed.p342j.C7006a;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.p344l.C7013a;
import com.bytedance.android.livesdk.feed.p344l.C7015b;
import com.bytedance.android.livesdk.feed.p344l.C7016c;
import com.bytedance.android.livesdk.feed.p344l.C7017d;
import com.bytedance.android.livesdk.feed.p344l.C7018e;
import com.bytedance.android.livesdk.feed.p344l.C7019f;
import com.bytedance.android.livesdk.feed.p344l.C7020g;
import com.bytedance.android.livesdk.feed.p344l.C7021h;
import com.bytedance.android.livesdk.feed.p344l.C7022i;
import com.bytedance.android.livesdk.feed.services.C7104d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.widget.LiveFeedFloatTabView;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.p450h.C8752c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.f.k */
public class C6926k extends C6915d implements C6829a {

    /* renamed from: H */
    private static final String f18949H = C6926k.class.getCanonicalName();

    /* renamed from: l */
    public static C6945f f18950l = null;

    /* renamed from: F */
    long f18951F;

    /* renamed from: G */
    boolean f18952G;

    /* renamed from: I */
    private String f18953I = "live_merge";

    /* renamed from: J */
    private C2180b<JSONObject> f18954J = C2180b.m6534l();

    /* renamed from: K */
    private final C1340m f18955K = new C1340m() {

        /* renamed from: b */
        private boolean f18975b;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (C6926k.this.f18969i != null && i == 0) {
                if (C6926k.this.f18968h.mo4749j() > C6926k.this.f18969i.intValue() || !C6926k.this.f18963c.f19439a) {
                    this.f18975b = true;
                } else {
                    C6926k.this.f18963c.mo13277c();
                    this.f18975b = false;
                }
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (this.f18975b && C6926k.this.f18969i != null) {
                if (i2 < 0 && C6926k.this.f18969i.intValue() >= 0) {
                    int j = C6926k.this.f18968h.mo4749j();
                    if (j > C6926k.this.f18969i.intValue()) {
                        if (i2 < -5) {
                            C6926k.this.f18963c.mo13275a();
                        }
                    } else if (j < C6926k.this.f18969i.intValue()) {
                        C6926k.this.f18963c.mo13277c();
                    }
                } else if (i2 > 5 && C6926k.this.f18969i.intValue() >= 0) {
                    C6926k.this.f18963c.mo13276b();
                }
            }
        }
    };

    /* renamed from: L */
    private final Map<Long, FeedDataKey> f18956L = new HashMap();

    /* renamed from: M */
    private LiveFeedViewModel f18957M;

    /* renamed from: N */
    private String f18958N = "";

    /* renamed from: O */
    private String f18959O = "";

    /* renamed from: P */
    private C1340m f18960P;

    /* renamed from: a */
    protected View f18961a;

    /* renamed from: b */
    protected TextureView f18962b;

    /* renamed from: c */
    LiveFeedFloatTabView f18963c;

    /* renamed from: d */
    C6811d f18964d;

    /* renamed from: e */
    C6957i f18965e = C7104d.m14774a();

    /* renamed from: f */
    C3810b<FeedDataKey, FeedItem> f18966f;

    /* renamed from: g */
    public C7023m f18967g = C7128p.m14812d();

    /* renamed from: h */
    public GridLayoutManager f18968h;

    /* renamed from: i */
    public Integer f18969i = null;

    /* renamed from: j */
    public boolean f18970j = true;

    /* renamed from: k */
    boolean f18971k;

    /* renamed from: m */
    LiveFeedRoomPlayComponent f18972m;

    /* renamed from: n */
    boolean f18973n = true;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C6806a mo13089h() {
        return this.f18964d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo13092k() {
        super.mo13092k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo13115n() {
        super.mo13115n();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public final String mo13078a() {
        if (!C9431p.m18664a(this.f18958N)) {
            return this.f18958N;
        }
        return super.mo13078a();
    }

    /* renamed from: b */
    public final String mo13084b() {
        if (!C9431p.m18664a(this.f18959O)) {
            return this.f18959O;
        }
        return super.mo13084b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo13088f() {
        if (m14508g()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: i */
    public final long mo13090i() {
        if (f18950l != null) {
            return f18950l.f19009a;
        }
        return 1;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f18921q.mo4818b(this.f18955K);
    }

    /* renamed from: g */
    public static boolean m14508g() {
        if (f18950l == null) {
            return false;
        }
        if (f18950l.mo13132a() == 2 || f18950l.mo13132a() == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C1332i mo13091j() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.f4526g = new C1302b() {
            /* renamed from: a */
            public final int mo4690a(int i) {
                if (C6926k.this.f18964d.getItemViewType(i) == R.layout.alo) {
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
        } else if (m14508g()) {
            i = bVar.mo7694a();
        } else {
            i = bVar.f8723a;
        }
        if (i <= 1) {
            return super.mo13086d();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final FragmentFeedViewModel mo13087e() {
        this.f18932t = (TabFeedViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p.mo13107a(mo13090i()).mo13108a((C7005j) this)).mo359a(TabFeedViewModel.class);
        this.f18951F = System.currentTimeMillis();
        this.f18932t.f11040c.observe(this, new C6933o(this));
        this.f18931s.setOnRefreshListener(new C6934p(this));
        return this.f18932t;
    }

    public void onDestroy() {
        super.onDestroy();
        for (FeedDataKey feedDataKey : this.f18956L.values()) {
            IFeedRepository iFeedRepository = (IFeedRepository) this.f18965e.mo13096a(feedDataKey);
            if (iFeedRepository != null) {
                this.f18965e.mo13106b(feedDataKey, iFeedRepository);
            }
            if (this.f18966f != null) {
                this.f18966f.mo9191c(feedDataKey);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo13122p() {
        this.f18932t.mo13263a("feed_refresh");
        if (!C6938t.m14535a(getContext())) {
            C4204a.m10421a(getContext(), (int) R.string.eas);
        }
        if (C6828b.f18712a) {
            C3858h.m9785a().mo9243b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6972am.f19061b = -1;
        C6966ag.f19055b = -1;
        this.f18964d.notifyDataSetChanged();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f18972m != null) {
            this.f18972m.mo12926a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13121b(C6945f fVar) {
        if (this.f18969i != null) {
            this.f18932t.f11045h.mo9296a(this.f18969i.intValue());
            mo13120a(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13079a(View view) {
        super.mo13079a(view);
        this.f18961a = view.findViewById(R.id.cvb);
        if (VERSION.SDK_INT >= 21) {
            this.f18961a.setBackgroundResource(R.drawable.bqi);
        }
        this.f18962b = (TextureView) view.findViewById(R.id.cv_);
        this.f18963c = (LiveFeedFloatTabView) view.findViewById(R.id.ahv);
        if (this.f18921q != null && this.f18960P != null) {
            this.f18921q.mo4801a(this.f18960P);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C8830k.m17330d() != null) {
            this.f18972m = new LiveFeedRoomPlayComponent(new C6798a() {
                /* renamed from: a */
                public final RecyclerView mo12946a() {
                    return C6926k.this.f18921q;
                }

                /* renamed from: b */
                public final C6806a mo12947b() {
                    return C6926k.this.mo13089h();
                }

                /* renamed from: c */
                public final BannerSwipeRefreshLayout mo12948c() {
                    return C6926k.this.f18931s;
                }

                /* renamed from: d */
                public final View mo12949d() {
                    return C6926k.this.f18961a;
                }

                /* renamed from: e */
                public final TextureView mo12950e() {
                    return C6926k.this.f18962b;
                }

                /* renamed from: g */
                public final C0176h mo12952g() {
                    return C6926k.this.getLifecycle();
                }

                /* renamed from: h */
                public final Activity mo12953h() {
                    return C6926k.this.getActivity();
                }

                /* renamed from: f */
                public final C8649h mo12951f() {
                    return C8830k.m17330d().mo15051d();
                }

                /* renamed from: i */
                public final String mo12954i() {
                    if (C6926k.f18950l != null) {
                        return C6926k.f18950l.f19016h;
                    }
                    return "";
                }
            });
            this.f18972m.mo12985d(m14508g());
            this.f18972m.mo12926a(getUserVisibleHint());
        }
    }

    /* renamed from: a */
    public final void mo13120a(C6945f fVar) {
        f18950l = fVar;
        this.f18958N = fVar.f19012d;
        if (TextUtils.isEmpty(fVar.f19016h)) {
            fVar.f19016h = "live_merge_null";
        }
        this.f18959O = fVar.f19016h;
        TabFeedViewModel tabFeedViewModel = (TabFeedViewModel) this.f18922r.f18677c;
        if (!this.f18956L.containsKey(Long.valueOf(fVar.f19009a))) {
            if (this.f18956L.isEmpty()) {
                this.f18956L.put(Long.valueOf(mo13090i()), tabFeedViewModel.mo13267f());
            }
            this.f18956L.put(Long.valueOf(fVar.f19009a), FeedDataKey.m14536a(fVar.f19016h, fVar.f19012d, mo13090i()));
        }
        IFeedRepository iFeedRepository = (IFeedRepository) this.f18965e.mo13096a(tabFeedViewModel.mo13267f());
        tabFeedViewModel.f19397D = false;
        tabFeedViewModel.f19370B = (FeedDataKey) this.f18956L.get(Long.valueOf(fVar.f19009a));
        this.f18965e.mo13098a((FeedDataKey) this.f18956L.get(Long.valueOf(fVar.f19009a)), (ItemRepository) iFeedRepository);
        tabFeedViewModel.mo13262a(fVar.f19012d, fVar.f19016h);
        tabFeedViewModel.mo13274c(this.f18958N);
        tabFeedViewModel.mo13265d();
        tabFeedViewModel.mo9355a();
        ((C4002ac) ((IFeedRepository) this.f18965e.mo13096a(tabFeedViewModel.mo13267f())).mo12968a().mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9406a(new C6935q(this), C6936r.f18984a);
        if (this.f18972m != null) {
            this.f18972m.mo12985d(m14508g());
        }
        this.f18963c.mo13284a(fVar);
        if (this.f18954J != null && ((Integer) LiveFeedSettings.LIVE_FEED_SHOW_NEARBY_GSP_DIALOG.mo9431a()).intValue() == 1) {
            try {
                this.f18954J.onNext(new JSONObject(C3913t.m9891a(fVar)));
            } catch (JSONException e) {
                C3831a.m9714b("ttlivefeed", (Throwable) e);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C3982g.m10091b(C3983a.LiveFeedInit);
        C3974b.m10061a().mo9384b(C3983a.LiveFeedInit.name(), (C0184k) this, getContext());
        C3974b.m10061a().mo9377a(C3983a.LiveFeedInit.name(), (C0184k) this, getContext());
        super.onCreate(bundle);
        if (this.f18967g != null) {
            List c = this.f18967g.mo13185c();
            if (c != null && c.size() > 0) {
                f18950l = (C6945f) c.get(0);
                this.f18958N = f18950l.f19012d;
            }
            this.f18957M = (LiveFeedViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p.mo13107a(mo13090i())).mo359a(LiveFeedViewModel.class);
            this.f18957M.mo13273a();
            C7013a aVar = new C7013a(this);
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(R.layout.aln), new C7015b(aVar.f19157e, aVar.f19154b, aVar.f19155c, aVar.f19156d));
            hashMap.put(Integer.valueOf(R.layout.alo), new C7016c(aVar.f19157e, aVar.f19154b, aVar.f19155c, aVar.f19156d));
            hashMap.put(Integer.valueOf(R.layout.apk), new C7017d(aVar.f19153a));
            hashMap.put(Integer.valueOf(R.layout.aph), new C7019f(new C7066p() {
            }));
            hashMap.put(Integer.valueOf(R.layout.apj), C7020g.f19173a);
            hashMap.put(Integer.valueOf(R.layout.api), C7021h.f19174a);
            hashMap.put(Integer.valueOf(R.layout.alt), C7022i.f19175a);
            hashMap.put(Integer.valueOf(R.layout.alm), new C7018e(aVar.f19157e, aVar.f19154b, aVar.f19155c, aVar.f19156d));
            this.f18964d = new C6811d(hashMap, aVar.f19154b, aVar.f19153a);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event_type", "click");
            hashMap2.put("event_belong", "tab_click");
            hashMap2.put("enter_from_merge", this.f18953I);
            C7007b.m14648a("live_enter", (Map<String, String>) hashMap2);
            if (getUserVisibleHint()) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("page_name", C6926k.class.getName());
                C7006a.m14645b().mo9199b("ttlive_page", (Map<String, ?>) hashMap3);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18922r.f18677c.f19377p.observe(this, new C6930l(this));
        this.f18968h = (GridLayoutManager) this.f18921q.getLayoutManager();
        if (this.f18936x.mo13270a() != null && !C9414h.m18630a(this.f18936x.mo13270a())) {
            this.f18921q.mo4801a(this.f18955K);
            this.f18963c.setTabList(this.f18936x.mo13270a());
            this.f18963c.setOnTabClickListener(new C6931m(this));
        }
        if (this.f18957M != null) {
            this.f18957M.f19400b.observe(this, new C6932n(this));
        }
        String string = getString(R.string.eal);
        if (getActivity() != null && (getActivity() instanceof C8752c)) {
            ((C8752c) getActivity()).mo15414a(string);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "tab_click");
        C7007b.m14648a("live_enter", (Map<String, String>) hashMap);
    }
}
