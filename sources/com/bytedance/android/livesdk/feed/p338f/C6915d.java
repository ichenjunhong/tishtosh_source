package com.bytedance.android.livesdk.feed.p338f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.C7096s;
import com.bytedance.android.livesdk.feed.p331a.C6812e.C6815a;
import com.bytedance.android.livesdk.feed.p343k.C7009a;
import com.bytedance.android.livesdk.feed.p343k.C7009a.C7011a;
import com.bytedance.android.livesdk.feed.p345m.C7024a;
import com.bytedance.android.livesdk.feed.services.C7104d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdk.feed.tab.p351d.C7134a;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.SyncContentViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.bytedance.ies.p672e.C10753b;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.f.d */
public abstract class C6915d extends C6911a {

    /* renamed from: A */
    public boolean f18926A;

    /* renamed from: B */
    long f18927B;

    /* renamed from: a */
    private TimeOutRefreshViewModel f18928a;

    /* renamed from: b */
    private SyncContentViewModel f18929b;

    /* renamed from: c */
    private int f18930c = -1;

    /* renamed from: s */
    public BannerSwipeRefreshLayout f18931s;

    /* renamed from: t */
    protected TabFeedViewModel f18932t;

    /* renamed from: u */
    public DislikeTipViewModel f18933u;

    /* renamed from: v */
    public C7134a f18934v;

    /* renamed from: w */
    public C0212b f18935w;

    /* renamed from: x */
    protected FeedTabViewModel f18936x;

    /* renamed from: y */
    protected View f18937y;

    /* renamed from: z */
    protected ImageView f18938z;

    /* renamed from: c */
    public final long mo13110c() {
        return mo13090i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo13116o() {
        this.f18932t.mo13263a("feed_refresh");
    }

    public void onStop() {
        super.onStop();
        mo13092k();
    }

    /* renamed from: i */
    public long mo13090i() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("id");
        }
        return -1;
    }

    /* renamed from: d */
    public int mo13086d() {
        int intValue = ((Integer) LiveFeedSettings.FEED_PRELOAD.mo9431a()).intValue();
        if (intValue <= 1) {
            return super.mo13086d();
        }
        return intValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FragmentFeedViewModel mo13087e() {
        this.f18932t = (TabFeedViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p.mo13107a(mo13090i()).mo13108a((C7005j) this)).mo359a(TabFeedViewModel.class);
        this.f18932t.f11040c.observe(this, new C6924i(this));
        this.f18931s.setOnRefreshListener(new C6925j(this));
        return this.f18932t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo13092k() {
        this.f18927B = 0;
        if (this.f18933u != null) {
            this.f18933u.f19390b = -1;
        }
        if (this.f18928a != null) {
            TimeOutRefreshViewModel timeOutRefreshViewModel = this.f18928a;
            if (timeOutRefreshViewModel.f19414c == Long.MAX_VALUE) {
                timeOutRefreshViewModel.f19414c = System.currentTimeMillis();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C1331h mo13112m() {
        this.f18921q.setPadding(this.f18921q.getPaddingLeft(), this.f18921q.getPaddingTop(), this.f18921q.getPaddingRight(), this.f18921q.getPaddingBottom());
        return new C7024a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo13115n() {
        if (this.f18928a != null) {
            TimeOutRefreshViewModel timeOutRefreshViewModel = this.f18928a;
            if (!timeOutRefreshViewModel.f19412a && timeOutRefreshViewModel.f19414c != Long.MAX_VALUE && System.currentTimeMillis() - timeOutRefreshViewModel.f19414c > ((long) ((Integer) LiveFeedSettings.MAIN_REFRESH_TIME_OUT.mo9431a()).intValue())) {
                timeOutRefreshViewModel.f19413b.onNext(C4064k.f11214a);
            }
            timeOutRefreshViewModel.f19414c = Long.MAX_VALUE;
            timeOutRefreshViewModel.f19412a = false;
        }
    }

    public void onResume() {
        super.onResume();
        mo13115n();
        if (this.f18930c != ((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo9431a()).intValue()) {
            this.f18930c = ((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo9431a()).intValue();
            if (((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo9431a()).intValue() != 0) {
                this.f18938z.setVisibility(0);
                LayoutParams layoutParams = (LayoutParams) this.f18938z.getLayoutParams();
                int intValue = ((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo9431a()).intValue();
                if (intValue == 1) {
                    layoutParams.gravity = 8388691;
                } else if (intValue != 3) {
                    layoutParams.gravity = 81;
                } else {
                    layoutParams.gravity = 8388693;
                }
            } else {
                this.f18938z.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6815a mo13077a(C6815a aVar) {
        aVar.f18700k = new C6792a() {
            /* renamed from: a */
            public final void mo12921a(RecyclerView recyclerView) {
                C6915d.this.f18931s.f18601o = recyclerView;
            }

            /* renamed from: a */
            public final void mo12920a(ViewPager viewPager, View view) {
                BannerSwipeRefreshLayout bannerSwipeRefreshLayout = C6915d.this.f18931s;
                bannerSwipeRefreshLayout.f18599m = viewPager;
                bannerSwipeRefreshLayout.f18600n = view;
            }
        };
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13114a(Object obj) throws Exception {
        if (this.f18932t != null) {
            this.f18932t.mo13263a("enter_auto");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13109b(FeedItem feedItem) {
        super.mo13111c(feedItem);
        if (this.f18928a != null) {
            this.f18928a.f19412a = true;
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo13092k();
        } else {
            mo13115n();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("user_visible")) {
            setUserVisibleHint(arguments.getBoolean("user_visible"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13079a(View view) {
        this.f18931s = (BannerSwipeRefreshLayout) view.findViewById(R.id.cvv);
        this.f18938z = (ImageView) view.findViewById(R.id.d4q);
        this.f18938z.setOnClickListener(new C6920e(this));
        this.f18921q.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int i2;
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    DislikeTipViewModel dislikeTipViewModel = C6915d.this.f18933u;
                    if (dislikeTipViewModel.f19389a && recyclerView != null && !dislikeTipViewModel.f19392d && dislikeTipViewModel.f19390b == -1) {
                        C1332i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            dislikeTipViewModel.f19390b = ((StaggeredGridLayoutManager) layoutManager).mo5242c((int[]) null)[0];
                        } else if (layoutManager instanceof GridLayoutManager) {
                            dislikeTipViewModel.f19390b = ((GridLayoutManager) layoutManager).mo4751l();
                        }
                    }
                } else {
                    DislikeTipViewModel dislikeTipViewModel2 = C6915d.this.f18933u;
                    if (dislikeTipViewModel2.f19389a && recyclerView != null && !dislikeTipViewModel2.f19392d && dislikeTipViewModel2.f19390b != -1) {
                        C1332i layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                            int[] c = ((StaggeredGridLayoutManager) layoutManager2).mo5242c((int[]) null);
                            if (c.length > 1) {
                                i2 = c[1];
                                if (i2 >= 0 && i2 - dislikeTipViewModel2.f19390b > 10) {
                                    dislikeTipViewModel2.f19390b = -1;
                                    C10753b.m21794a(dislikeTipViewModel2.f19391c, "ttlive_live_user").mo19441a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.valueOf(true)).mo19443a();
                                    dislikeTipViewModel2.f19392d = true;
                                }
                            }
                        } else if (layoutManager2 instanceof GridLayoutManager) {
                            i2 = ((GridLayoutManager) layoutManager2).mo4751l();
                            dislikeTipViewModel2.f19390b = -1;
                            C10753b.m21794a(dislikeTipViewModel2.f19391c, "ttlive_live_user").mo19441a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.valueOf(true)).mo19443a();
                            dislikeTipViewModel2.f19392d = true;
                        }
                        i2 = -1;
                        dislikeTipViewModel2.f19390b = -1;
                        C10753b.m21794a(dislikeTipViewModel2.f19391c, "ttlive_live_user").mo19441a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.valueOf(true)).mo19443a();
                        dislikeTipViewModel2.f19392d = true;
                    }
                }
                C7009a aVar = C7011a.f19152a;
                if (i == 0) {
                    aVar.mo13179b();
                } else if (aVar.f19148e || aVar.f19149f <= 10) {
                    aVar.mo13177a();
                }
                C3974b.m10061a().mo9378a(C3983a.LiveFeedScroll.name(), (C0184k) C6915d.this, C6915d.this.getContext(), i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (i2 > 20) {
                    C6915d.this.mo13113a(0);
                    return;
                }
                if (i2 < -20) {
                    C6915d.this.mo13113a(1);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13113a(int i) {
        boolean z;
        if (((Integer) LiveFeedSettings.START_LIVE_ICON_POSITION.mo9431a()).intValue() != 0 && !this.f18926A) {
            if (this.f18938z.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            float a = (float) C3922z.m9899a(100.0f);
            switch (i) {
                case 0:
                    if (z) {
                        this.f18926A = true;
                        this.f18938z.animate().setDuration(300).translationY(a).setListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                C6915d.this.f18938z.setVisibility(8);
                                C6915d.this.f18926A = false;
                            }
                        }).start();
                        return;
                    }
                    break;
                case 1:
                    if (!z) {
                        this.f18926A = true;
                        this.f18938z.setVisibility(0);
                        this.f18938z.setTranslationY(a);
                        this.f18938z.animate().setDuration(300).translationY(0.0f).setListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                C6915d.this.f18926A = false;
                            }
                        }).start();
                        break;
                    }
                    break;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18933u = (DislikeTipViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p.mo13107a(mo13090i())).mo359a(DislikeTipViewModel.class);
        this.f18934v = new C7134a(C7128p.m14812d(), new C7096s(), C7104d.m14775b());
        this.f18936x = (FeedTabViewModel) C0214z.m441a(getActivity(), (C0212b) this.f18934v).mo359a(FeedTabViewModel.class);
        this.f18928a = (TimeOutRefreshViewModel) C0214z.m439a((Fragment) this, (C0212b) this.f18920p).mo359a(TimeOutRefreshViewModel.class);
        this.f18928a.f19413b.mo6505a((C1710e<? super T>) new C6921f<Object>(this), C6922g.f18945a);
        this.f18929b = (SyncContentViewModel) C0214z.m439a((Fragment) this, this.f18935w).mo359a(SyncContentViewModel.class);
        this.f18919o.f19379r.observe(this, new C6923h(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18937y = super.onCreateView(layoutInflater, viewGroup, bundle);
        mo13079a(this.f18937y);
        return this.f18937y;
    }
}
