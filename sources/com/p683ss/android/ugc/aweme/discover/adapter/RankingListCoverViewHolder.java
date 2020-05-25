package com.p683ss.android.ugc.aweme.discover.adapter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27715b;
import com.p683ss.android.ugc.aweme.discover.widget.RankScrollView;
import com.p683ss.android.ugc.aweme.discover.widget.RankScrollView.C28973a;
import com.p683ss.android.ugc.aweme.music.model.Brand;
import com.p683ss.android.ugc.aweme.music.model.BrandCategory;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder */
public class RankingListCoverViewHolder extends C1352v {

    /* renamed from: a */
    public RankScrollView f72889a;

    /* renamed from: b */
    public View f72890b;

    /* renamed from: c */
    public TextView f72891c;

    /* renamed from: d */
    public TextView f72892d;

    /* renamed from: e */
    public TextView f72893e;

    /* renamed from: f */
    public RemoteImageView f72894f;

    /* renamed from: g */
    Rect f72895g;

    /* renamed from: h */
    boolean f72896h;

    /* renamed from: i */
    boolean f72897i;

    /* renamed from: j */
    public Fragment f72898j;

    /* renamed from: k */
    public View f72899k;

    /* renamed from: l */
    public LinearLayout f72900l;

    /* renamed from: m */
    public TextView f72901m;
    View mMusicContainer;
    public RemoteImageView mMusicHeaderView;
    public TextView mMusicName;
    RemoteImageView mStarBackground;
    public View mStarContainer;
    public CircleImageView mStarHeaderView;
    public TextView mStarName;

    /* renamed from: n */
    public TextView f72902n;

    /* renamed from: o */
    public CircleImageView f72903o;

    /* renamed from: p */
    public boolean f72904p;

    /* renamed from: q */
    public ObjectAnimator f72905q;

    /* renamed from: r */
    public AnimatorSet f72906r;

    /* renamed from: s */
    public int f72907s;

    /* renamed from: t */
    Rect f72908t;

    /* renamed from: u */
    boolean f72909u;

    /* renamed from: v */
    public C28973a f72910v;

    /* renamed from: w */
    public RankingListCover f72911w;

    public RankingListCoverViewHolder(View view, boolean z) {
        this(view, false, null);
    }

    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31, types: [com.ss.android.ugc.aweme.commerce.service.e.a] */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v57, types: [com.ss.android.ugc.aweme.commerce.service.e.a] */
    /* JADX WARNING: type inference failed for: r5v59, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v60, types: [com.ss.android.ugc.aweme.base.a.a.p, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v61 */
    /* JADX WARNING: type inference failed for: r5v62 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v30
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.base.a.a.p, com.ss.android.ugc.aweme.commerce.service.e.a, java.lang.Object]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.commerce.service.e.a, ?[OBJECT, ARRAY], java.lang.Object]
      mth insns count: 224
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RankingListCoverViewHolder(final android.view.View r4, boolean r5, android.support.p030v4.app.Fragment r6) {
        /*
            r3 = this;
            r3.<init>(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f72895g = r0
            r0 = 1
            r3.f72896h = r0
            r1 = 0
            r3.f72897i = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.f72908t = r2
            r3.f72909u = r0
            r3.f72898j = r6
            butterknife.ButterKnife.bind(r3, r4)
            android.view.View r6 = r3.mStarContainer
            com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder$1 r2 = new com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder$1
            r2.<init>()
            r6.setOnTouchListener(r2)
            android.view.View r6 = r3.mMusicContainer
            com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder$2 r2 = new com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder$2
            r2.<init>(r4)
            r6.setOnTouchListener(r2)
            if (r5 == 0) goto L_0x0154
            r3.f72904p = r0
            android.view.View r4 = r3.itemView
            r5 = 2132023178(0x7f14178a, float:1.9684797E38)
            android.view.View r4 = r4.findViewById(r5)
            com.ss.android.ugc.aweme.discover.widget.RankScrollView r4 = (com.p683ss.android.ugc.aweme.discover.widget.RankScrollView) r4
            r3.f72889a = r4
            android.view.View r4 = r3.itemView
            android.content.Context r4 = r4.getContext()
            r5 = 0
            if (r4 != 0) goto L_0x004d
            goto L_0x007d
        L_0x004d:
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.e.a> r6 = com.p683ss.android.ugc.aweme.commerce.service.p1539e.C25545a.class
            if (r4 == 0) goto L_0x007b
            android.content.Context r4 = r4.getApplicationContext()
            if (r4 == 0) goto L_0x007b
            boolean r2 = r6.isInterface()
            if (r2 == 0) goto L_0x007b
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.e.a> r2 = com.p683ss.android.ugc.aweme.commerce.service.p1539e.C25545a.class
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            java.util.Map<java.lang.Class, java.lang.Object> r5 = com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23389c.f62415a
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto L_0x0071
            boolean r2 = r5 instanceof com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23402p
            if (r2 != 0) goto L_0x007b
        L_0x0071:
            com.ss.android.ugc.aweme.base.a.a.p r5 = new com.ss.android.ugc.aweme.base.a.a.p
            r5.<init>(r4)
            java.util.Map<java.lang.Class, java.lang.Object> r4 = com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23389c.f62415a
            r4.put(r6, r5)
        L_0x007b:
            com.ss.android.ugc.aweme.commerce.service.e.a r5 = (com.p683ss.android.ugc.aweme.commerce.service.p1539e.C25545a) r5
        L_0x007d:
            if (r5 == 0) goto L_0x0085
            boolean r4 = r5.mo48487a(r0)
            if (r4 == 0) goto L_0x00a0
        L_0x0085:
            r5.mo48488b(r1)
            r3.f72897i = r0
            com.ss.android.ugc.aweme.discover.widget.RankScrollView r4 = r3.f72889a
            com.ss.android.ugc.aweme.discover.adapter.ae r5 = new com.ss.android.ugc.aweme.discover.adapter.ae
            r5.<init>(r3)
            r4.post(r5)
            com.ss.android.ugc.aweme.discover.widget.RankScrollView r4 = r3.f72889a
            com.ss.android.ugc.aweme.discover.adapter.af r5 = new com.ss.android.ugc.aweme.discover.adapter.af
            r5.<init>(r3)
            r1 = 2000(0x7d0, double:9.88E-321)
            r4.postDelayed(r5, r1)
        L_0x00a0:
            android.view.View r4 = r3.itemView
            r5 = 2132022316(0x7f14142c, float:1.9683048E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f72890b = r4
            android.view.View r4 = r3.itemView
            r5 = 2132022314(0x7f14142a, float:1.9683044E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f72899k = r4
            android.view.View r4 = r3.itemView
            android.content.Context r4 = r4.getContext()
            int r4 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58224b(r4)
            int r4 = r4 * 168
            int r4 = r4 / 375
            android.view.View r5 = r3.f72890b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            r5.width = r4
            android.view.View r5 = r3.mStarContainer
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            r5.width = r4
            android.view.View r5 = r3.mMusicContainer
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            r5.width = r4
            android.view.View r5 = r3.f72899k
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            r5.width = r4
            android.view.View r4 = r3.itemView
            r5 = 2132024173(0x7f141b6d, float:1.9686815E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f72891c = r4
            android.view.View r4 = r3.itemView
            r5 = 2132024186(0x7f141b7a, float:1.968684E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f72892d = r4
            android.view.View r4 = r3.itemView
            r5 = 2132023827(0x7f141a13, float:1.9686113E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f72893e = r4
            android.view.View r4 = r3.itemView
            r5 = 2132020071(0x7f140b67, float:1.9678495E38)
            android.view.View r4 = r4.findViewById(r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r4
            r3.f72894f = r4
            android.view.View r4 = r3.itemView
            r5 = 2132020753(0x7f140e11, float:1.9679878E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.f72900l = r4
            android.view.View r4 = r3.itemView
            r5 = 2132024185(0x7f141b79, float:1.9686839E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f72901m = r4
            android.view.View r4 = r3.itemView
            r5 = 2132023672(0x7f141978, float:1.9685798E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f72902n = r4
            android.view.View r4 = r3.itemView
            r5 = 2132020070(0x7f140b66, float:1.9678493E38)
            android.view.View r4 = r4.findViewById(r5)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r4 = (com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView) r4
            r3.f72903o = r4
        L_0x0154:
            com.facebook.drawee.f.e r4 = new com.facebook.drawee.f.e
            r4.<init>()
            r4.mo25937a(r0)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r5 = r3.mStarHeaderView
            com.facebook.drawee.h.b r5 = r5.getHierarchy()
            com.facebook.drawee.f.a r5 = (com.facebook.drawee.p940f.C13833a) r5
            r5.mo25899a(r4)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r5 = r3.mStarHeaderView
            com.facebook.drawee.h.b r5 = r5.getHierarchy()
            com.facebook.drawee.f.a r5 = (com.facebook.drawee.p940f.C13833a) r5
            com.facebook.drawee.e.q$b r6 = com.facebook.drawee.p939e.C13816q.C13818b.f36067g
            r5.mo25898a(r6)
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r5 = r5.getHitRankActivityStatus()
            java.lang.Object r5 = r5.mo47782d()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x01b2
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r5 = r5.getHitRankActivityStarBackground()
            java.lang.Object r5 = r5.mo47782d()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x01b2
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.mStarBackground
            java.lang.String r1 = "draweeView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r1)
            java.lang.String r1 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r1)
            com.ss.android.ugc.aweme.discover.a.b$b r1 = new com.ss.android.ugc.aweme.discover.a.b$b
            r1.<init>(r6, r5)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r6.post(r1)
        L_0x01b2:
            com.facebook.drawee.f.e r5 = new com.facebook.drawee.f.e
            r5.<init>()
            android.view.View r6 = r3.itemView
            android.content.Context r6 = r6.getContext()
            r1 = 1082130432(0x40800000, float:4.0)
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r1)
            r5.mo25932a(r6)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.mMusicHeaderView
            com.facebook.drawee.h.b r6 = r6.getHierarchy()
            com.facebook.drawee.f.a r6 = (com.facebook.drawee.p940f.C13833a) r6
            r6.mo25899a(r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.mMusicHeaderView
            com.facebook.drawee.h.b r6 = r6.getHierarchy()
            com.facebook.drawee.f.a r6 = (com.facebook.drawee.p940f.C13833a) r6
            com.facebook.drawee.e.q$b r2 = com.facebook.drawee.p939e.C13816q.C13818b.f36067g
            r6.mo25898a(r2)
            boolean r6 = r3.f72904p
            if (r6 == 0) goto L_0x0212
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r3.f72894f
            com.facebook.drawee.h.b r6 = r6.getHierarchy()
            com.facebook.drawee.f.a r6 = (com.facebook.drawee.p940f.C13833a) r6
            r6.mo25899a(r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f72894f
            com.facebook.drawee.h.b r5 = r5.getHierarchy()
            com.facebook.drawee.f.a r5 = (com.facebook.drawee.p940f.C13833a) r5
            com.facebook.drawee.e.q$b r6 = com.facebook.drawee.p939e.C13816q.C13818b.f36067g
            r5.mo25898a(r6)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r5 = r3.f72903o
            com.facebook.drawee.h.b r5 = r5.getHierarchy()
            com.facebook.drawee.f.a r5 = (com.facebook.drawee.p940f.C13833a) r5
            r5.mo25899a(r4)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r4 = r3.f72903o
            com.facebook.drawee.h.b r4 = r4.getHierarchy()
            com.facebook.drawee.f.a r4 = (com.facebook.drawee.p940f.C13833a) r4
            com.facebook.drawee.e.q$b r5 = com.facebook.drawee.p939e.C13816q.C13818b.f36067g
            r4.mo25898a(r5)
        L_0x0212:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r4 < r5) goto L_0x0284
            android.view.View r4 = r3.mStarContainer
            com.ss.android.ugc.aweme.utils.en r5 = new com.ss.android.ugc.aweme.utils.en
            android.view.View r6 = r3.itemView
            android.content.Context r6 = r6.getContext()
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r1)
            int r6 = (int) r6
            r5.<init>(r6)
            r4.setOutlineProvider(r5)
            android.view.View r4 = r3.mStarContainer
            r4.setClipToOutline(r0)
            android.view.View r4 = r3.mMusicContainer
            com.ss.android.ugc.aweme.utils.en r5 = new com.ss.android.ugc.aweme.utils.en
            android.view.View r6 = r3.itemView
            android.content.Context r6 = r6.getContext()
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r1)
            int r6 = (int) r6
            r5.<init>(r6)
            r4.setOutlineProvider(r5)
            android.view.View r4 = r3.mMusicContainer
            r4.setClipToOutline(r0)
            boolean r4 = r3.f72904p
            if (r4 == 0) goto L_0x0284
            android.view.View r4 = r3.f72890b
            com.ss.android.ugc.aweme.utils.en r5 = new com.ss.android.ugc.aweme.utils.en
            android.view.View r6 = r3.itemView
            android.content.Context r6 = r6.getContext()
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r1)
            int r6 = (int) r6
            r5.<init>(r6)
            r4.setOutlineProvider(r5)
            android.view.View r4 = r3.f72890b
            r4.setClipToOutline(r0)
            android.view.View r4 = r3.f72899k
            com.ss.android.ugc.aweme.utils.en r5 = new com.ss.android.ugc.aweme.utils.en
            android.view.View r6 = r3.itemView
            android.content.Context r6 = r6.getContext()
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r1)
            int r6 = (int) r6
            r5.<init>(r6)
            r4.setOutlineProvider(r5)
            android.view.View r4 = r3.f72899k
            r4.setClipToOutline(r0)
        L_0x0284:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.<init>(android.view.View, boolean, android.support.v4.app.Fragment):void");
    }

    /* renamed from: a */
    public boolean mo56198a(List<BrandCategory> list, List<Brand> list2, List<String> list3, int i, int i2, int i3) {
        for (BrandCategory brandCategory : list) {
            if (brandCategory.getBrandList() != null) {
                list2.add(brandCategory.getBrandList().get(0));
            }
            list3.add(brandCategory.getName());
        }
        if (list2.size() == 0) {
            return false;
        }
        if (((Brand) list2.get(0)).getLogoUrl() == null) {
            this.f72903o.setImageResource(R.drawable.dv5);
        } else {
            C27715b.m66364a(this.f72903o, ((Brand) list2.get(0)).getLogoUrl());
        }
        this.f72902n.setText(((Brand) list2.get(0)).getName());
        this.f72901m.setText(C2240a.m6772a(C23723j.m58219b(R.string.uw), new Object[]{list3.get(0)}));
        return true;
    }
}
