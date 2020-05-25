package com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder;

import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.discover.mob.C28396b;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p683ss.android.ugc.aweme.discover.p1662v3.p1664b.C28744c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder */
public final class DiscoveryV3CoverViewHolder extends JediSimpleViewHolder<DiscoveryCellStructV3> implements OnClickListener, C28744c {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f75395f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3CoverViewHolder.class), "mIvCover", "getMIvCover()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3CoverViewHolder.class), "mTvDiggCount", "getMTvDiggCount()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3CoverViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;"))};

    /* renamed from: g */
    private final C52668f f75396g = C52732g.m112285a(new C28746b(this));

    /* renamed from: j */
    private final C52668f f75397j = C52732g.m112285a(new C28748d(this));

    /* renamed from: k */
    private final C52668f f75398k = C52732g.m112285a(new C28747c(this));

    /* renamed from: l */
    private boolean f75399l;

    /* renamed from: m */
    private boolean f75400m;

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$a */
    public static final class C28745a extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f75401a;

        C28745a(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f75401a = discoveryV3CoverViewHolder;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, (C14045f) obj, animatable);
            this.f75401a.mo58375p().setImageResource(R.drawable.a3g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$b */
    static final class C28746b extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f75402a;

        C28746b(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f75402a = discoveryV3CoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75402a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (RemoteImageView) view.findViewById(R.id.azj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$c */
    static final class C28747c extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f75403a;

        C28747c(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f75403a = discoveryV3CoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75403a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.b2a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$d */
    static final class C28748d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f75404a;

        C28748d(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f75404a = discoveryV3CoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75404a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.d9h);
        }
    }

    /* renamed from: q */
    private final RemoteImageView m68016q() {
        return (RemoteImageView) this.f75396g.getValue();
    }

    /* renamed from: p */
    public final ImageView mo58375p() {
        return (ImageView) this.f75398k.getValue();
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        this.f75400m = false;
    }

    /* renamed from: g */
    public final void mo22671g() {
        super.mo22671g();
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        this.f75400m = true;
        m68017r();
    }

    /* renamed from: r */
    private final void m68017r() {
        String str;
        if (this.f75399l && this.f75400m) {
            String str2 = "discovery";
            String playListType = ((DiscoveryCellStructV3) mo22689o()).getPlayListType();
            String str3 = ((DiscoveryCellStructV3) mo22689o()).cellID;
            int i = this.f31643i + 1;
            List<Aweme> list = ((DiscoveryCellStructV3) mo22689o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C52575l.m112140f(list);
                if (aweme != null) {
                    str = aweme.getAid();
                    C28396b.m67407a(str2, playListType, str3, i, str, ((DiscoveryCellStructV3) mo22689o()).logPb);
                }
            }
            str = null;
            C28396b.m67407a(str2, playListType, str3, i, str, ((DiscoveryCellStructV3) mo22689o()).logPb);
        }
    }

    /* renamed from: j */
    public final void mo22674j() {
        RemoteImageView q = m68016q();
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        q.setImageDrawable(view.getResources().getDrawable(R.color.c8));
        mo58375p().setImageResource(R.drawable.a3h);
        RemoteImageView q2 = m68016q();
        C52711k.m112236a((Object) q2, "mIvCover");
        q2.getLayoutParams().height = ((DiscoveryCellStructV3) mo22689o()).displayHeight;
        this.f75399l = false;
        this.f75400m = false;
        super.mo22674j();
    }

    /* renamed from: a */
    public final void mo58373a(boolean z) {
        if (!z) {
            m68017r();
        }
    }

    public DiscoveryV3CoverViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_v3_image, parent, false)");
        super(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo22662a(java.lang.Object r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r5 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r5
            java.lang.String r0 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r4.m68016q()
            java.lang.String r1 = "mIvCover"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r5 = r5.displayHeight
            r0.height = r5
            java.lang.Object r5 = r4.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r5 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r5
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r5.awemes
            r0 = 0
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = p2628d.p2629a.C52575l.m112140f(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r5
            goto L_0x002b
        L_0x002a:
            r5 = r0
        L_0x002b:
            d.f r1 = r4.f75397j
            java.lang.Object r1 = r1.getValue()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "mTvDiggCount"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            if (r5 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()
            if (r2 == 0) goto L_0x0045
            long r2 = r2.getDiggCount()
            goto L_0x0047
        L_0x0045:
            r2 = 0
        L_0x0047:
            java.lang.String r2 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            if (r5 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()
        L_0x0056:
            if (r0 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r4.m68016q()
            com.ss.android.ugc.aweme.feed.model.Video r5 = r5.getVideo()
            java.lang.String r1 = "aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getOriginCover()
            com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$a r1 = new com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$a
            r1.<init>(r4)
            com.facebook.drawee.c.d r1 = (com.facebook.drawee.p936c.C13791d) r1
            com.p683ss.android.ugc.aweme.base.C23515d.m57672a(r0, r5, r1)
        L_0x0073:
            r5 = 1
            r4.f75399l = r5
            r4.m68017r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3CoverViewHolder.mo22662a(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
            java.lang.String r0 = "discovery"
            java.lang.Object r8 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            java.lang.String r1 = r8.getPlayListType()
            java.lang.Object r8 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            java.lang.String r2 = r8.cellID
            java.lang.Object r8 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = r8.awemes
            r6 = 0
            if (r8 == 0) goto L_0x0030
            java.lang.Object r8 = p2628d.p2629a.C52575l.m112140f(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r8
            if (r8 == 0) goto L_0x0030
            java.lang.String r8 = r8.getAid()
            r3 = r8
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            int r8 = r7.f31643i
            int r4 = r8 + 1
            java.lang.Object r8 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r8.logPb
            com.p683ss.android.ugc.aweme.discover.mob.C28396b.m67408a(r0, r1, r2, r3, r4, r5)
            android.view.View r8 = r7.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            android.content.Context r8 = r8.getContext()
            java.lang.Object r0 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r0 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r0
            int r0 = r0.type
            java.lang.Object r1 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.lang.String r1 = r1.cellID
            java.lang.Object r2 = r7.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L_0x0071
            java.lang.String r6 = r2.getAid()
        L_0x0071:
            int r2 = r7.f31643i
            com.p683ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity.m66409a(r8, r0, r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3CoverViewHolder.onClick(android.view.View):void");
    }
}
