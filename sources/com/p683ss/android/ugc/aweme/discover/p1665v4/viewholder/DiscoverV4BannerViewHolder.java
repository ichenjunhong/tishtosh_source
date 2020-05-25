package com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27888d;
import com.p683ss.android.ugc.aweme.discover.helper.C28209q;
import com.p683ss.android.ugc.aweme.discover.mob.C28419x;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.p683ss.android.ugc.aweme.utils.C47664ae;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4BannerViewHolder */
public final class DiscoverV4BannerViewHolder extends JediSimpleViewHolder<Object> implements C38923d {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f75625f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4BannerViewHolder.class), "mHelper", "getMHelper()Lcom/ss/android/ugc/aweme/discover/helper/ViewPagerSwitchHelper;"))};

    /* renamed from: g */
    public final List<Banner> f75626g = Arrays.asList(new Banner[]{new Banner()});

    /* renamed from: j */
    public final boolean f75627j = true;

    /* renamed from: k */
    private boolean f75628k = true;

    /* renamed from: l */
    private boolean f75629l = true;

    /* renamed from: m */
    private C27888d f75630m;

    /* renamed from: n */
    private final C52668f f75631n = C52732g.m112285a(new C28874a(this));

    /* renamed from: o */
    private List<? extends Banner> f75632o;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4BannerViewHolder$a */
    static final class C28874a extends C52712l implements C52670a<C28209q> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4BannerViewHolder f75633a;

        C28874a(DiscoverV4BannerViewHolder discoverV4BannerViewHolder) {
            this.f75633a = discoverV4BannerViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75633a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return new C28209q((BannerViewPager) view.findViewById(R.id.ds2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4BannerViewHolder$b */
    static final class C28875b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4BannerViewHolder f75634a;

        /* renamed from: b */
        final /* synthetic */ int f75635b;

        /* renamed from: c */
        final /* synthetic */ Banner f75636c;

        /* renamed from: d */
        final /* synthetic */ String f75637d;

        C28875b(DiscoverV4BannerViewHolder discoverV4BannerViewHolder, int i, Banner banner, String str) {
            this.f75634a = discoverV4BannerViewHolder;
            this.f75635b = i;
            this.f75636c = banner;
            this.f75637d = str;
        }

        public final /* synthetic */ Object call() {
            String str;
            MobClick extValueLong = MobClick.obtain().setEventName("banner_show").setLabelName("discovery").setExtValueLong((long) this.f75635b);
            Banner banner = this.f75636c;
            if (banner == null) {
                C52711k.m112234a();
            }
            C26890h.onEvent(extValueLong.setValue(String.valueOf(banner.getCreativeId())));
            String str2 = "banner_show";
            C28419x clientOrder = new C28419x().setBannerId(this.f75636c.getBid()).setTagId(this.f75637d).setClientOrder(this.f75635b);
            if (!NewDiscoverV4Experiment.m69617a() || NewDiscoverV4Experiment.m69621e()) {
                str = "discovery";
            } else {
                str = "discovery_tab";
            }
            C26890h.m65011a(str2, (Map<String, String>) clientOrder.setEnterFrom(str).buildParams());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4BannerViewHolder$c */
    public static final class C28876c implements C0997e {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4BannerViewHolder f75638a;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C28876c(DiscoverV4BannerViewHolder discoverV4BannerViewHolder) {
            this.f75638a = discoverV4BannerViewHolder;
        }

        public final void onPageSelected(int i) {
            this.f75638a.mo58447a(i);
        }
    }

    /* renamed from: b */
    private static boolean m68159b(Object obj) {
        return obj == null;
    }

    /* renamed from: s */
    private final C28209q m68160s() {
        return (C28209q) this.f75631n.getValue();
    }

    /* renamed from: p */
    public final void mo58451p() {
    }

    /* renamed from: q */
    public final void mo58452q() {
    }

    /* renamed from: r */
    public final void mo58453r() {
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        mo58448a(false);
    }

    /* renamed from: k */
    public final void mo22675k() {
        super.mo22675k();
        mo58448a(true);
    }

    /* renamed from: l */
    public final void mo22676l() {
        super.mo22676l();
        mo58448a(false);
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        if (this.f75628k) {
            mo58448a(true);
        }
    }

    /* renamed from: j */
    public final void mo22674j() {
        LayoutParams layoutParams;
        super.mo22674j();
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        C52711k.m112240b(context, "context");
        int a = (int) (((float) C9432q.m18670a(context)) * 0.48104957f);
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.j7);
        if (relativeLayout != null) {
            layoutParams = relativeLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = a;
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            RelativeLayout relativeLayout2 = (RelativeLayout) view3.findViewById(R.id.j7);
            if (relativeLayout2 != null) {
                relativeLayout2.setLayoutParams(layoutParams2);
            }
            if (VERSION.SDK_INT >= 19) {
                View view4 = this.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                View findViewById = view4.findViewById(R.id.csm);
                if (findViewById != null) {
                    LayoutParams layoutParams3 = findViewById.getLayoutParams();
                    if (layoutParams3 != null) {
                        View view5 = this.itemView;
                        C52711k.m112236a((Object) view5, "itemView");
                        layoutParams3.height = C9432q.m18695e(view5.getContext());
                    }
                }
            }
            View view6 = this.itemView;
            C52711k.m112236a((Object) view6, "itemView");
            BannerViewPager bannerViewPager = (BannerViewPager) view6.findViewById(R.id.ds2);
            if (bannerViewPager != null) {
                bannerViewPager.addOnPageChangeListener(new C28876c(this));
            }
            View view7 = this.itemView;
            C52711k.m112236a((Object) view7, "itemView");
            C1056u.m3049c((View) (IndicatorView) view7.findViewById(R.id.a71), 0);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo58448a(boolean z) {
        if (!z || !this.f75628k) {
            m68160s().mo56625b();
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            BannerViewPager bannerViewPager = (BannerViewPager) view.findViewById(R.id.ds2);
            if (bannerViewPager != null) {
                bannerViewPager.setOnTouchListener(null);
                return;
            }
            return;
        }
        m68160s().mo56624a();
    }

    /* renamed from: b */
    public final void mo58450b(boolean z) {
        int i;
        if (z != this.f75628k && z) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            if (((BannerViewPager) view.findViewById(R.id.ds2)) != null) {
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                if (((BannerViewPager) view2.findViewById(R.id.ds2)).getChildCount() > 0) {
                    View view3 = this.itemView;
                    C52711k.m112236a((Object) view3, "itemView");
                    BannerViewPager bannerViewPager = (BannerViewPager) view3.findViewById(R.id.ds2);
                    if (bannerViewPager != null) {
                        i = bannerViewPager.getCurrentItem();
                    } else {
                        i = 0;
                    }
                    mo58447a(i);
                }
            }
        }
        if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
            this.f75628k = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58447a(int i) {
        if (this.f75632o != null) {
            List<? extends Banner> list = this.f75632o;
            if (list == null || list.size() != 0) {
                List<? extends Banner> list2 = this.f75632o;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                List<? extends Banner> list3 = this.f75632o;
                if (list3 == null) {
                    C52711k.m112234a();
                }
                Banner banner = (Banner) list2.get(i % list3.size());
                List<? extends Banner> list4 = this.f75632o;
                if (list4 == null) {
                    C52711k.m112234a();
                }
                int size = (i % list4.size()) + 1;
                List<? extends Banner> list5 = this.f75632o;
                if (list5 == null) {
                    C52711k.m112234a();
                }
                List<? extends Banner> list6 = this.f75632o;
                if (list6 == null) {
                    C52711k.m112234a();
                }
                C0013i.m18a((Callable<TResult>) new C28875b<TResult>(this, size, banner, C47664ae.m103172a(((Banner) list5.get(i % list6.size())).getSchema())), (Executor) C26890h.m65003a());
                if (banner.isAd()) {
                    View view = this.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    Context context = view.getContext();
                    List<? extends Banner> list7 = this.f75632o;
                    if (list7 == null) {
                        C52711k.m112234a();
                    }
                    C27936b.m66689a(context, banner, (i % list7.size()) + 1);
                    if (C47915gg.m103651b()) {
                        C23131p.m56692a("ftc_show_banner_ad", "", null);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22662a(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            android.view.View r0 = r5.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r1)
            boolean r1 = r6 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r6 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r6
            com.ss.android.ugc.aweme.discover.model.BannerList r1 = r6.bannerList
            boolean r1 = m68159b(r1)
            if (r1 != 0) goto L_0x005d
            com.ss.android.ugc.aweme.discover.model.BannerList r6 = r6.bannerList
            if (r6 != 0) goto L_0x002a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002a:
            java.util.List<com.ss.android.ugc.aweme.discover.model.Banner> r6 = r6.items
            goto L_0x005e
        L_0x002d:
            boolean r1 = r6 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4
            if (r1 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4 r6 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4) r6
            com.ss.android.ugc.aweme.discover.model.BannerList r1 = r6.bannerList
            boolean r1 = m68159b(r1)
            if (r1 != 0) goto L_0x005d
            com.ss.android.ugc.aweme.discover.model.BannerList r6 = r6.bannerList
            if (r6 != 0) goto L_0x0042
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0042:
            java.util.List<com.ss.android.ugc.aweme.discover.model.Banner> r6 = r6.items
            goto L_0x005e
        L_0x0045:
            boolean r1 = r6 instanceof com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct
            if (r1 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct r6 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct) r6
            com.ss.android.ugc.aweme.discover.model.BannerList r1 = r6.bannerList
            boolean r1 = m68159b(r1)
            if (r1 != 0) goto L_0x005d
            com.ss.android.ugc.aweme.discover.model.BannerList r6 = r6.bannerList
            if (r6 != 0) goto L_0x005a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005a:
            java.util.List<com.ss.android.ugc.aweme.discover.model.Banner> r6 = r6.items
            goto L_0x005e
        L_0x005d:
            r6 = 0
        L_0x005e:
            r5.f75632o = r6
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r6 = r5.f75632o
            if (r6 != 0) goto L_0x0065
            return
        L_0x0065:
            java.util.List<com.ss.android.ugc.aweme.discover.model.Banner> r6 = r5.f75626g
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r1 = r5.f75632o
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)
            if (r6 == 0) goto L_0x0070
            return
        L_0x0070:
            com.ss.android.ugc.aweme.discover.adapter.d r6 = r5.f75630m
            r1 = 2132024610(0x7f141d22, float:1.96877E38)
            if (r6 != 0) goto L_0x00a9
            java.lang.String r6 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            java.lang.String r6 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r6)
            com.ss.android.ugc.aweme.discover.adapter.d r6 = new com.ss.android.ugc.aweme.discover.adapter.d
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r6.<init>(r0, r2)
            r5.f75630m = r6
            android.view.View r6 = r5.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r2)
            android.view.View r6 = r6.findViewById(r1)
            com.ss.android.ugc.aweme.discover.widget.BannerViewPager r6 = (com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager) r6
            if (r6 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.shortvideo.ui.o r2 = new com.ss.android.ugc.aweme.shortvideo.ui.o
            com.ss.android.ugc.aweme.discover.adapter.d r3 = r5.f75630m
            android.support.v4.view.PagerAdapter r3 = (android.support.p030v4.view.PagerAdapter) r3
            r2.<init>(r3)
            android.support.v4.view.PagerAdapter r2 = (android.support.p030v4.view.PagerAdapter) r2
            r6.setAdapter(r2)
        L_0x00a9:
            boolean r6 = com.p683ss.android.ugc.aweme.utils.C47842ed.m103485a(r0)
            if (r6 == 0) goto L_0x00b4
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r0 = r5.f75632o
            java.util.Collections.reverse(r0)
        L_0x00b4:
            com.ss.android.ugc.aweme.discover.helper.q r0 = r5.m68160s()
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r2 = r5.f75632o
            if (r2 != 0) goto L_0x00bf
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00bf:
            int r2 = r2.size()
            r0.f74055b = r2
            com.ss.android.ugc.aweme.discover.adapter.d r0 = r5.f75630m
            if (r0 == 0) goto L_0x00ce
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r2 = r5.f75632o
            r0.mo56303a(r2)
        L_0x00ce:
            android.view.View r0 = r5.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r2 = 2132018630(0x7f1405c6, float:1.9675572E38)
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.discover.widget.IndicatorView r0 = (com.p683ss.android.ugc.aweme.discover.widget.IndicatorView) r0
            if (r0 == 0) goto L_0x00f0
            android.view.View r3 = r5.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.view.View r3 = r3.findViewById(r1)
            com.ss.android.ugc.aweme.discover.widget.BannerViewPager r3 = (com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager) r3
            r0.mo58544a(r3)
        L_0x00f0:
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r0 = r5.f75632o
            if (r0 != 0) goto L_0x00f7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00f7:
            int r0 = r0.size()
            r3 = 2
            r4 = 0
            if (r0 >= r3) goto L_0x0114
            android.view.View r0 = r5.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.discover.widget.IndicatorView r0 = (com.p683ss.android.ugc.aweme.discover.widget.IndicatorView) r0
            if (r0 == 0) goto L_0x0126
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0126
        L_0x0114:
            android.view.View r0 = r5.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.view.View r0 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.discover.widget.IndicatorView r0 = (com.p683ss.android.ugc.aweme.discover.widget.IndicatorView) r0
            if (r0 == 0) goto L_0x0126
            r0.setVisibility(r4)
        L_0x0126:
            if (r6 == 0) goto L_0x0147
            android.view.View r6 = r5.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            android.view.View r6 = r6.findViewById(r1)
            com.ss.android.ugc.aweme.discover.widget.BannerViewPager r6 = (com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager) r6
            if (r6 == 0) goto L_0x0147
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r0 = r5.f75632o
            if (r0 != 0) goto L_0x013e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x013e:
            int r0 = r0.size()
            int r0 = r0 + -1
            r6.setCurrentItem(r0)
        L_0x0147:
            boolean r6 = r5.f75629l
            if (r6 == 0) goto L_0x0172
            java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> r6 = r5.f75632o
            if (r6 != 0) goto L_0x0152
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0152:
            int r6 = r6.size()
            if (r6 == 0) goto L_0x0170
            android.view.View r6 = r5.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            android.view.View r6 = r6.findViewById(r1)
            com.ss.android.ugc.aweme.discover.widget.BannerViewPager r6 = (com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager) r6
            if (r6 == 0) goto L_0x016c
            int r6 = r6.getCurrentItem()
            goto L_0x016d
        L_0x016c:
            r6 = 0
        L_0x016d:
            r5.mo58447a(r6)
        L_0x0170:
            r5.f75629l = r4
        L_0x0172:
            boolean r6 = r5.f75627j
            r5.mo58448a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4BannerViewHolder.mo22662a(java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo58449a(boolean z, boolean z2) {
        mo58448a(!z);
    }

    public DiscoverV4BannerViewHolder(ViewGroup viewGroup, boolean z) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bht, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…v4_banner, parent, false)");
        super(inflate);
    }
}
