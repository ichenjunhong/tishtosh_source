package com.bytedance.android.livesdk.feed.drawerfeed.p336a;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C7066p;
import com.bytedance.android.livesdk.feed.banner.C6843b.C6844a;
import com.bytedance.android.livesdk.feed.banner.C6843b.C6845b;
import com.bytedance.android.livesdk.feed.banner.RoundIndicatorView;
import com.bytedance.android.livesdk.feed.banner.p333a.C6842c;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.a */
public final class C6867a extends C3923a<FeedItem> {

    /* renamed from: b */
    ViewPager f18811b;

    /* renamed from: c */
    RoundIndicatorView f18812c;

    /* renamed from: d */
    C6845b f18813d = new C6845b(this.f18811b);

    /* renamed from: e */
    C2180b<Object> f18814e;

    /* renamed from: f */
    C2180b<Object> f18815f;

    /* renamed from: g */
    C2180b<Boolean> f18816g;

    /* renamed from: h */
    private C6842c f18817h;

    /* renamed from: i */
    private C6844a f18818i;

    /* renamed from: j */
    private List<C2965a> f18819j;

    /* renamed from: k */
    private Context f18820k;

    /* renamed from: l */
    private String f18821l;

    /* renamed from: m */
    private boolean f18822m;

    /* renamed from: n */
    private C7066p f18823n;

    /* renamed from: o */
    private ViewGroup f18824o;

    /* renamed from: b */
    public final boolean mo9281b() {
        return true;
    }

    /* renamed from: c */
    public final void mo9282c() {
        super.mo9282c();
        this.f18822m = true;
        if (this.f18818i != null) {
            this.f18818i.f18777c = true;
        }
        mo13066e();
    }

    /* renamed from: d */
    public final void mo9283d() {
        super.mo9283d();
        this.f18822m = false;
        if (this.f18818i != null) {
            this.f18818i.f18777c = false;
        }
        mo13067f();
    }

    /* renamed from: f */
    public final void mo13067f() {
        this.f18811b.removeCallbacks(this.f18813d);
        this.f18811b.clearOnPageChangeListeners();
        if (this.f18818i != null) {
            this.f18818i.f18775a = false;
        }
    }

    /* renamed from: e */
    public final void mo13066e() {
        if (this.f18822m && this.itemView != null && this.itemView.getVisibility() == 0) {
            m14408a(this.f18819j);
            if (!(this.f18819j == null || this.f18819j.size() <= 1 || this.f18811b == null || this.f18812c == null)) {
                if (this.f18818i != null) {
                    this.f18818i.f18775a = true;
                }
                this.f18811b.clearOnPageChangeListeners();
                this.f18811b.addOnPageChangeListener(this.f18818i);
                this.f18812c.setViewPager(this.f18811b);
                m14407a(this.f18811b, (Runnable) this.f18813d);
            }
        }
    }

    /* renamed from: a */
    private void m14408a(List<C2965a> list) {
        int i;
        if (this.f18818i != null) {
            i = this.f18818i.f18776b;
        } else {
            i = 0;
        }
        if (list != null && !list.isEmpty() && this.f18822m) {
            C2965a aVar = (C2965a) list.get(i % list.size());
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.f18821l);
            hashMap.put("banner_id", String.valueOf(aVar.getId()));
            C7007b.m14648a("banner_show", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    private static void m14407a(ViewPager viewPager, Runnable runnable) {
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
            java.util.List<com.bytedance.android.live.base.model.banner.a> r9 = r7.f18819j
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
            r7.m14408a(r8)
            android.support.v4.view.ViewPager r9 = r7.f18811b
            com.bytedance.android.livesdk.feed.banner.b$b r2 = r7.f18813d
            r9.removeCallbacks(r2)
            r7.f18819j = r8
            android.support.v4.view.ViewPager r9 = r7.f18811b
            r2 = 0
            r9.setAdapter(r2)
            r9 = 8
            if (r8 == 0) goto L_0x012a
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x012a
            android.support.v4.view.ViewPager r2 = r7.f18811b
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
            android.view.ViewGroup r3 = r7.f18824o
            int r3 = r3.getMeasuredWidth()
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
            android.support.v4.view.ViewPager r3 = r7.f18811b
            r3.setLayoutParams(r2)
        L_0x00a5:
            com.bytedance.android.livesdk.feed.banner.a.c r2 = r7.f18817h
            if (r2 != 0) goto L_0x00c4
            com.bytedance.android.livesdk.feed.banner.a.c r2 = new com.bytedance.android.livesdk.feed.banner.a.c
            android.view.View r3 = r7.itemView
            android.content.Context r3 = r3.getContext()
            android.view.View r4 = r7.itemView
            android.content.Context r4 = r4.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            java.lang.String r5 = r7.f18821l
            com.bytedance.android.livesdk.feed.p r6 = r7.f18823n
            r2.<init>(r3, r4, r5, r6)
            r7.f18817h = r2
        L_0x00c4:
            com.bytedance.android.livesdk.feed.banner.a.c r2 = r7.f18817h
            java.util.List<com.bytedance.android.live.base.model.banner.a> r3 = r7.f18819j
            r2.mo13026a(r3)
            android.support.v4.view.ViewPager r2 = r7.f18811b
            com.bytedance.android.livesdk.feed.banner.a.c r3 = r7.f18817h
            r2.setAdapter(r3)
            java.util.List<com.bytedance.android.live.base.model.banner.a> r2 = r7.f18819j
            int r2 = r2.size()
            if (r2 <= r0) goto L_0x0124
            android.support.v4.view.ViewPager r9 = r7.f18811b
            com.bytedance.android.livesdk.feed.banner.b$b r2 = r7.f18813d
            m14407a(r9, r2)
            android.support.v4.view.ViewPager r9 = r7.f18811b
            r9.clearOnPageChangeListeners()
            android.support.v4.view.ViewPager r9 = r7.f18811b
            com.bytedance.android.livesdk.feed.banner.b$a r2 = r7.f18818i
            r9.addOnPageChangeListener(r2)
            com.bytedance.android.livesdk.feed.banner.b$a r9 = r7.f18818i
            if (r9 == 0) goto L_0x00f5
            com.bytedance.android.livesdk.feed.banner.b$a r9 = r7.f18818i
            r9.f18775a = r0
        L_0x00f5:
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r9 = r7.f18812c
            android.support.v4.view.ViewPager r0 = r7.f18811b
            r9.setViewPager(r0)
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r9 = r7.f18812c
            r9.setVisibility(r1)
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r9 = r7.f18812c
            int r8 = r8.size()
            r9.setCount(r8)
            android.support.v4.view.ViewPager r8 = r7.f18811b
            java.util.List<com.bytedance.android.live.base.model.banner.a> r9 = r7.f18819j
            int r9 = r9.size()
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List<com.bytedance.android.live.base.model.banner.a> r1 = r7.f18819j
            int r1 = r1.size()
            int r1 = r1 * 2
            int r0 = r0 / r1
            int r9 = r9 * r0
            r8.setCurrentItem(r9)
            goto L_0x013e
        L_0x0124:
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r8 = r7.f18812c
            r8.setVisibility(r9)
            return
        L_0x012a:
            android.support.v4.view.ViewPager r8 = r7.f18811b
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r8.height = r1
            android.support.v4.view.ViewPager r0 = r7.f18811b
            r0.setLayoutParams(r8)
            r7.f18817h = r2
            com.bytedance.android.livesdk.feed.banner.RoundIndicatorView r8 = r7.f18812c
            r8.setVisibility(r9)
        L_0x013e:
            return
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.drawerfeed.p336a.C6867a.mo9280a(java.lang.Object, int):void");
    }

    public C6867a(View view, C6792a aVar, FeedDataKey feedDataKey, C2180b<Object> bVar, C2180b<Object> bVar2, C2180b<Boolean> bVar3, C7066p pVar, ViewGroup viewGroup) {
        super(view);
        this.f18824o = viewGroup;
        this.f18811b = (ViewPager) view.findViewById(R.id.ds2);
        this.f18812c = (RoundIndicatorView) view.findViewById(R.id.atj);
        this.f18820k = view.getContext();
        this.f18821l = feedDataKey.f18991b;
        this.f18823n = pVar;
        this.f18814e = bVar;
        this.f18815f = bVar2;
        this.f18816g = bVar3;
        this.f18811b.removeCallbacks(this.f18813d);
        this.f18818i = new C6844a(this.f18811b, this.f18813d, this.f18821l);
        this.f18811b.setOnTouchListener(new C6868b(this));
        this.f18812c.setViewPager(this.f18811b);
        this.f18812c.mo13018a(this.f18818i);
        if (aVar != null) {
            aVar.mo12920a(this.f18811b, view);
        }
        this.f18816g.mo6505a((C1710e<? super T>) new C6869c<Object>(this), C6870d.f18827a);
        this.f18814e.mo6505a((C1710e<? super T>) new C6871e<Object>(this), C6872f.f18829a);
        this.f18815f.mo6505a((C1710e<? super T>) new C6873g<Object>(this), C6874h.f18831a);
    }
}
