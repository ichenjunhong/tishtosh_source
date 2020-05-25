package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C7066p;
import com.bytedance.android.livesdk.feed.banner.p333a.C6842c;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.banner.b */
public class C6843b extends C3923a<FeedItem> {

    /* renamed from: b */
    ViewPager f18762b;

    /* renamed from: c */
    RoundIndicatorView f18763c;

    /* renamed from: d */
    C6845b f18764d = new C6845b(this.f18762b);

    /* renamed from: e */
    C2180b<Object> f18765e;

    /* renamed from: f */
    C2180b<Object> f18766f;

    /* renamed from: g */
    C2180b<Boolean> f18767g;

    /* renamed from: h */
    private C6842c f18768h;

    /* renamed from: i */
    private C6844a f18769i;

    /* renamed from: j */
    private List<C2965a> f18770j;

    /* renamed from: k */
    private Context f18771k;

    /* renamed from: l */
    private String f18772l;

    /* renamed from: m */
    private boolean f18773m;

    /* renamed from: n */
    private C7066p f18774n;

    /* renamed from: com.bytedance.android.livesdk.feed.banner.b$a */
    public static class C6844a implements C0997e {

        /* renamed from: a */
        public boolean f18775a;

        /* renamed from: b */
        public int f18776b;

        /* renamed from: c */
        public boolean f18777c = true;

        /* renamed from: d */
        private ViewPager f18778d;

        /* renamed from: e */
        private C6845b f18779e;

        /* renamed from: f */
        private String f18780f;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            C2965a aVar;
            this.f18776b = i;
            if (this.f18775a) {
                C6843b.m14356a(this.f18778d, (Runnable) this.f18779e);
                if (this.f18777c && ((C6842c) this.f18778d.getAdapter()) != null) {
                    C6842c cVar = (C6842c) this.f18778d.getAdapter();
                    if (cVar.f18759a == null || cVar.f18759a.isEmpty() || i < 0) {
                        aVar = null;
                    } else {
                        aVar = (C2965a) cVar.f18759a.get(i % cVar.f18759a.size());
                    }
                    if (aVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("show_source", this.f18780f);
                        hashMap.put("banner_id", String.valueOf(aVar.getId()));
                        C7007b.m14648a("banner_show", (Map<String, String>) hashMap);
                        if (this.f18778d instanceof BannerViewPager) {
                            BannerViewPager bannerViewPager = (BannerViewPager) this.f18778d;
                            if (bannerViewPager.f18727a == null || bannerViewPager.f18727a.getAction() == 3 || bannerViewPager.f18727a.getAction() == 1) {
                                bannerViewPager.post(new C6853j(bannerViewPager));
                            }
                        }
                    }
                }
            }
        }

        public C6844a(ViewPager viewPager, C6845b bVar, String str) {
            this.f18778d = viewPager;
            this.f18779e = bVar;
            this.f18780f = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.banner.b$b */
    public static class C6845b implements Runnable {

        /* renamed from: a */
        ViewPager f18781a;

        public final void run() {
            if (!C6828b.f18712a || !C4206c.m10426a(C3922z.m9915e())) {
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f18781a, Boolean.valueOf(false));
                    declaredField.setAccessible(false);
                    Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f18781a, new Object[]{Integer.valueOf(this.f18781a.getCurrentItem() + 1), Boolean.valueOf(true), Boolean.valueOf(true), Integer.valueOf(1)});
                    declaredMethod.setAccessible(false);
                } catch (Exception unused) {
                    this.f18781a.setCurrentItem(this.f18781a.getCurrentItem() + 1);
                }
            } else {
                this.f18781a.setCurrentItem(this.f18781a.getCurrentItem() + 1);
            }
        }

        public C6845b(ViewPager viewPager) {
            this.f18781a = viewPager;
        }
    }

    /* renamed from: b */
    public final boolean mo9281b() {
        return true;
    }

    /* renamed from: c */
    public final void mo9282c() {
        super.mo9282c();
        this.f18773m = true;
        if (this.f18769i != null) {
            this.f18769i.f18777c = true;
        }
        mo13027e();
    }

    /* renamed from: d */
    public final void mo9283d() {
        super.mo9283d();
        this.f18773m = false;
        if (this.f18769i != null) {
            this.f18769i.f18777c = false;
        }
        mo13028f();
    }

    /* renamed from: f */
    public final void mo13028f() {
        this.f18762b.removeCallbacks(this.f18764d);
        this.f18762b.clearOnPageChangeListeners();
        if (this.f18769i != null) {
            this.f18769i.f18775a = false;
        }
    }

    /* renamed from: e */
    public final void mo13027e() {
        if (this.f18773m && this.itemView != null && this.itemView.getVisibility() == 0) {
            m14357a(this.f18770j);
            if (!(this.f18770j == null || this.f18770j.size() <= 1 || this.f18762b == null || this.f18763c == null)) {
                if (this.f18769i != null) {
                    this.f18769i.f18775a = true;
                }
                this.f18762b.clearOnPageChangeListeners();
                this.f18762b.addOnPageChangeListener(this.f18769i);
                this.f18763c.setViewPager(this.f18762b);
                m14356a(this.f18762b, (Runnable) this.f18764d);
            }
        }
    }

    /* renamed from: a */
    private void m14357a(List<C2965a> list) {
        int i;
        if (this.f18769i != null) {
            i = this.f18769i.f18776b;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.f18773m) {
            C2965a aVar = (C2965a) list.get(i % list.size());
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f18772l);
            hashMap.put("banner_id", String.valueOf(aVar.getId()));
            C7007b.m14648a("banner_show", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m14356a(ViewPager viewPager, Runnable runnable) {
        viewPager.removeCallbacks(runnable);
        viewPager.postDelayed(runnable, 5000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo9280a(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            com.bytedance.android.live.base.model.feed.FeedItem r8 = (com.bytedance.android.live.base.model.feed.FeedItem) r8
            if (r8 == 0) goto L_0x013f
            java.util.List<com.bytedance.android.live.base.model.banner.a> r9 = r8.banners
            if (r9 != 0) goto L_0x000a
            goto L_0x013f
        L_0x000a:
            java.util.List<com.bytedance.android.live.base.model.banner.a> r8 = r8.banners
            java.util.List<com.bytedance.android.live.base.model.banner.a> r9 = r7.f18770j
            r0 = 1
            r1 = 0
            if (r9 == r8) goto L_0x0050
            if (r9 == 0) goto L_0x0018
            if (r8 != 0) goto L_0x0018
        L_0x0016:
            r9 = 0
            goto L_0x0051
        L_0x0018:
            if (r9 != 0) goto L_0x001d
            if (r8 == 0) goto L_0x001d
            goto L_0x0016
        L_0x001d:
            int r2 = r9.size()
            int r3 = r8.size()
            if (r2 == r3) goto L_0x0028
            goto L_0x0016
        L_0x0028:
            r2 = 0
        L_0x0029:
            int r3 = r9.size()
            if (r2 >= r3) goto L_0x0050
            java.lang.Object r3 = r9.get(r2)
            com.bytedance.android.live.base.model.banner.a r3 = (com.bytedance.android.live.base.model.banner.C2965a) r3
            java.lang.Object r4 = r8.get(r2)
            com.bytedance.android.live.base.model.banner.a r4 = (com.bytedance.android.live.base.model.banner.C2965a) r4
            if (r3 == 0) goto L_0x0044
            boolean r5 = r3.mo7672a(r4)
            if (r5 != 0) goto L_0x0044
            goto L_0x0016
        L_0x0044:
            if (r4 == 0) goto L_0x004d
            boolean r3 = r4.mo7672a(r3)
            if (r3 != 0) goto L_0x004d
            goto L_0x0016
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0050:
            r9 = 1
        L_0x0051:
            if (r9 != 0) goto L_0x013e
            r7.m14357a(r8)
            android.support.v4.view.ViewPager r9 = r7.f18762b
            com.bytedance.android.livesdk.feed.banner.b$b r2 = r7.f18764d
            r9.removeCallbacks(r2)
            r7.f18770j = r8
            android.support.v4.view.ViewPager r9 = r7.f18762b
            r2 = 0
            r9.setAdapter(r2)
            r9 = 8
            if (r8 == 0) goto L_0x012a
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x012a
            android.support.v4.view.ViewPager r2 = r7.f18762b
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.util.Iterator r3 = r8.iterator()
        L_0x0079:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0099
            java.lang.Object r4 = r3.next()
            com.bytedance.android.live.base.model.banner.a r4 = (com.bytedance.android.live.base.model.banner.C2965a) r4
            if (r4 == 0) goto L_0x0079
            int r5 = r4.f8678f
            if (r5 == 0) goto L_0x0079
            android.content.Context r3 = r7.f18771k
            int r3 = com.bytedance.common.utility.C9432q.m18670a(r3)
            int r5 = r4.f8677e
            int r3 = r3 * r5
            int r4 = r4.f8678f
            int r3 = r3 / r4
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            int r4 = r2.height
            if (r3 == r4) goto L_0x00a5
            r2.height = r3
            android.support.v4.view.ViewPager r3 = r7.f18762b
            r3.setLayoutParams(r2)
        L_0x00a5:
            com.bytedance.android.livesdk.feed.banner.a.c r2 = r7.f18768h
            if (r2 != 0) goto L_0x00c4
            com.bytedance.android.livesdk.feed.banner.a.c r2 = new com.bytedance.android.livesdk.feed.banner.a.c
            android.view.View r3 = r7.itemView
            android.content.Context r3 = r3.getContext()
            android.view.View r4 = r7.itemView
            android.content.Context r4 = r4.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            java.lang.String r5 = r7.f18772l
            com.bytedance.android.livesdk.feed.p r6 = r7.f18774n
            r2.<init>(r3, r4, r5, r6)
            r7.f18768h = r2
        L_0x00c4:
            com.bytedance.android.livesdk.feed.banner.a.c r2 = r7.f18768h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r3 = r7.f18770j
            r2.mo13026a(r3)
            android.support.v4.view.ViewPager r2 = r7.f18762b
            com.bytedance.android.livesdk.feed.banner.a.c r3 = r7.f18768h
            r2.setAdapter(r3)
            java.util.List<com.bytedance.android.live.base.model.banner.a> r2 = r7.f18770j
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x0124
            android.support.v4.view.ViewPager r9 = r7.f18762b
            com.bytedance.android.livesdk.feed.banner.b$b r2 = r7.f18764d
            m14356a(r9, r2)
            android.support.v4.view.ViewPager r9 = r7.f18762b
            r9.clearOnPageChangeListeners()
            android.support.v4.view.ViewPager r9 = r7.f18762b
            com.bytedance.android.livesdk.feed.banner.b$a r2 = r7.f18769i
            r9.addOnPageChangeListener(r2)
            com.bytedance.android.livesdk.feed.banner.b$a r9 = r7.f18769i
            if (r9 == 0) goto L_0x00f5
            com.bytedance.android.livesdk.feed.banner.b$a r9 = r7.f18769i
            r9.f18775a = r0
        L_0x00f5:
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r9 = r7.f18763c
            android.support.v4.view.ViewPager r0 = r7.f18762b
            r9.setViewPager(r0)
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r9 = r7.f18763c
            r9.setVisibility(r1)
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r9 = r7.f18763c
            int r8 = r8.size()
            r9.setCount(r8)
            android.support.v4.view.ViewPager r8 = r7.f18762b
            java.util.List<com.bytedance.android.live.base.model.banner.a> r9 = r7.f18770j
            int r9 = r9.size()
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List<com.bytedance.android.live.base.model.banner.a> r1 = r7.f18770j
            int r1 = r1.size()
            int r1 = r1 * 2
            int r0 = r0 / r1
            int r9 = r9 * r0
            r8.setCurrentItem(r9)
            goto L_0x013e
        L_0x0124:
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r8 = r7.f18763c
            r8.setVisibility(r9)
            return
        L_0x012a:
            android.support.v4.view.ViewPager r8 = r7.f18762b
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r8.height = r1
            android.support.v4.view.ViewPager r0 = r7.f18762b
            r0.setLayoutParams(r8)
            r7.f18768h = r2
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r8 = r7.f18763c
            r8.setVisibility(r9)
        L_0x013e:
            return
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.banner.C6843b.mo9280a(java.lang.Object, int):void");
    }

    public C6843b(View view, C6792a aVar, FeedDataKey feedDataKey, C2180b<Object> bVar, C2180b<Object> bVar2, C2180b<Boolean> bVar3, C7066p pVar) {
        super(view);
        this.f18762b = (ViewPager) view.findViewById(R.id.ds2);
        this.f18763c = (RoundIndicatorView) view.findViewById(R.id.atj);
        this.f18771k = view.getContext();
        this.f18772l = feedDataKey.f18991b;
        this.f18774n = pVar;
        this.f18765e = bVar;
        this.f18766f = bVar2;
        this.f18767g = bVar3;
        this.f18762b.removeCallbacks(this.f18764d);
        this.f18769i = new C6844a(this.f18762b, this.f18764d, this.f18772l);
        this.f18762b.setOnTouchListener(new C6846c(this));
        this.f18763c.setViewPager(this.f18762b);
        this.f18763c.mo13018a(this.f18769i);
        if (aVar != null) {
            aVar.mo12920a(this.f18762b, view);
        }
        this.f18767g.mo6505a((C1710e<? super T>) new C6847d<Object>(this), C6848e.f18784a);
        this.f18765e.mo6505a((C1710e<? super T>) new C6849f<Object>(this), C6850g.f18786a);
        this.f18766f.mo6505a((C1710e<? super T>) new C6851h<Object>(this), C6852i.f18788a);
    }
}
