package com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder;

import android.graphics.drawable.Animatable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mob.C28396b;
import com.p683ss.android.ugc.aweme.discover.mob.C28412q;
import com.p683ss.android.ugc.aweme.discover.mob.C28413r;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p683ss.android.ugc.aweme.discover.p1659ui.DiscoverHollowTextView;
import com.p683ss.android.ugc.aweme.discover.p1662v3.p1664b.C28744c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2643g.C52733a;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder */
public final class DiscoveryV3PlaylistViewHolder extends JediSimpleViewHolder<DiscoveryCellStructV3> implements OnClickListener, C28744c {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f75405f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mIvCover", "getMIvCover()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mSurfaceView", "getMSurfaceView()Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mBgView", "getMBgView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mFrameLayout", "getMFrameLayout()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mHtvTag", "getMHtvTag()Lcom/ss/android/ugc/aweme/discover/ui/DiscoverHollowTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoveryV3PlaylistViewHolder.class), "mBgGray", "getMBgGray()Landroid/view/View;"))};

    /* renamed from: l */
    public static final C28749a f75406l = new C28749a(null);

    /* renamed from: g */
    public boolean f75407g;

    /* renamed from: j */
    public long f75408j = -1;

    /* renamed from: k */
    public boolean f75409k;

    /* renamed from: m */
    private final C52668f f75410m = C52732g.m112285a(new C28756h(this));

    /* renamed from: n */
    private final C52668f f75411n = C52732g.m112285a(new C28760l(this));

    /* renamed from: o */
    private final C52668f f75412o = C52732g.m112285a(new C28759k(this));

    /* renamed from: p */
    private final C52668f f75413p = C52732g.m112285a(new C28753e(this));

    /* renamed from: q */
    private final C52668f f75414q = C52732g.m112285a(new C28757i(this));

    /* renamed from: r */
    private final C52668f f75415r = C52732g.m112285a(new C28754f(this));

    /* renamed from: s */
    private final C52668f f75416s = C52732g.m112285a(new C28755g(this));

    /* renamed from: t */
    private final C52668f f75417t = C52732g.m112285a(new C28752d(this));

    /* renamed from: u */
    private VideoViewComponent f75418u;

    /* renamed from: v */
    private final C30178a f75419v = new C30178a();

    /* renamed from: w */
    private boolean f75420w;

    /* renamed from: x */
    private boolean f75421x;

    /* renamed from: y */
    private C28758j f75422y = new C28758j(this);

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$a */
    public static final class C28749a {
        private C28749a() {
        }

        public /* synthetic */ C28749a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$b */
    public static final class C28750b extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75423a;

        C28750b(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75423a = discoveryV3PlaylistViewHolder;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, (C14045f) obj, animatable);
            this.f75423a.mo58379r().setImageResource(R.drawable.a3g);
            if (this.f75423a.f75409k) {
                View q = this.f75423a.mo58378q();
                C52711k.m112236a((Object) q, "mBgView");
                q.setVisibility(0);
                return;
            }
            View q2 = this.f75423a.mo58378q();
            C52711k.m112236a((Object) q2, "mBgView");
            q2.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$c */
    public static final class C28751c implements C50161j {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75424a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C28751c(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75424a = discoveryV3PlaylistViewHolder;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f75424a.f75407g) {
                this.f75424a.f75407g = false;
                this.f75424a.mo58382u();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$d */
    static final class C28752d extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75425a;

        C28752d(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75425a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75425a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return view.findViewById(R.id.k_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$e */
    static final class C28753e extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75426a;

        C28753e(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75426a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75426a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return view.findViewById(R.id.k3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$f */
    static final class C28754f extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75427a;

        C28754f(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75427a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75427a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (FrameLayout) view.findViewById(R.id.agt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$g */
    static final class C28755g extends C52712l implements C52670a<DiscoverHollowTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75428a;

        C28755g(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75428a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75428a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DiscoverHollowTextView) view.findViewById(R.id.apy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$h */
    static final class C28756h extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75429a;

        C28756h(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75429a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75429a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (RemoteImageView) view.findViewById(R.id.azj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$i */
    static final class C28757i extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75430a;

        C28757i(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75430a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75430a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.b2a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$j */
    public static final class C28758j extends C48009d {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75431a;

        C28758j(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75431a = discoveryV3PlaylistViewHolder;
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            super.mo53524a(dVar);
            this.f75431a.mo58381t();
        }

        /* renamed from: d */
        public final void mo53534d(String str) {
            String str2;
            super.mo53534d(str);
            String str3 = "discovery";
            String playListType = ((DiscoveryCellStructV3) this.f75431a.mo22689o()).getPlayListType();
            String str4 = ((DiscoveryCellStructV3) this.f75431a.mo22689o()).cellID;
            List<Aweme> list = ((DiscoveryCellStructV3) this.f75431a.mo22689o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C52575l.m112140f(list);
                if (aweme != null) {
                    str2 = aweme.getAid();
                    C28413r rVar = new C28413r(str3, playListType, str4, str2, this.f75431a.f31643i + 1, ((DiscoveryCellStructV3) this.f75431a.mo22689o()).logPb);
                    C0013i.m18a((Callable<TResult>) rVar, (Executor) C26890h.m65003a());
                }
            }
            str2 = null;
            C28413r rVar2 = new C28413r(str3, playListType, str4, str2, this.f75431a.f31643i + 1, ((DiscoveryCellStructV3) this.f75431a.mo22689o()).logPb);
            C0013i.m18a((Callable<TResult>) rVar2, (Executor) C26890h.m65003a());
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            String str;
            super.mo53526a(gVar);
            this.f75431a.mo58379r().setImageResource(R.drawable.a3g);
            RemoteImageView p = this.f75431a.mo58377p();
            C52711k.m112236a((Object) p, "mIvCover");
            p.setVisibility(8);
            View s = this.f75431a.mo58380s();
            C52711k.m112236a((Object) s, "mBgGray");
            s.setVisibility(8);
            this.f75431a.f75408j = System.currentTimeMillis();
            if (this.f75431a.f75409k) {
                View q = this.f75431a.mo58378q();
                C52711k.m112236a((Object) q, "mBgView");
                q.setVisibility(0);
            } else {
                View q2 = this.f75431a.mo58378q();
                C52711k.m112236a((Object) q2, "mBgView");
                q2.setVisibility(4);
            }
            String str2 = "discovery";
            String playListType = ((DiscoveryCellStructV3) this.f75431a.mo22689o()).getPlayListType();
            String str3 = ((DiscoveryCellStructV3) this.f75431a.mo22689o()).cellID;
            List<Aweme> list = ((DiscoveryCellStructV3) this.f75431a.mo22689o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C52575l.m112140f(list);
                if (aweme != null) {
                    str = aweme.getAid();
                    C28412q qVar = new C28412q(str2, playListType, str3, str, this.f75431a.f31643i + 1, ((DiscoveryCellStructV3) this.f75431a.mo22689o()).logPb);
                    C0013i.m18a((Callable<TResult>) qVar, (Executor) C26890h.m65003a());
                }
            }
            str = null;
            C28412q qVar2 = new C28412q(str2, playListType, str3, str, this.f75431a.f31643i + 1, ((DiscoveryCellStructV3) this.f75431a.mo22689o()).logPb);
            C0013i.m18a((Callable<TResult>) qVar2, (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$k */
    static final class C28759k extends C52712l implements C52670a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75432a;

        C28759k(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75432a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75432a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (KeepSurfaceTextureView) view.findViewById(R.id.czh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$l */
    static final class C28760l extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f75433a;

        C28760l(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f75433a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75433a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.dhb);
            dmtTextView.setFontType(C10751d.f28903b);
            return dmtTextView;
        }
    }

    /* renamed from: v */
    private final DmtTextView m68029v() {
        return (DmtTextView) this.f75411n.getValue();
    }

    /* renamed from: w */
    private final KeepSurfaceTextureView m68030w() {
        return (KeepSurfaceTextureView) this.f75412o.getValue();
    }

    /* renamed from: x */
    private final FrameLayout m68031x() {
        return (FrameLayout) this.f75415r.getValue();
    }

    /* renamed from: y */
    private final DiscoverHollowTextView m68032y() {
        return (DiscoverHollowTextView) this.f75416s.getValue();
    }

    /* renamed from: k */
    public final void mo22675k() {
        super.mo22675k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final RemoteImageView mo58377p() {
        return (RemoteImageView) this.f75410m.getValue();
    }

    /* renamed from: q */
    public final View mo58378q() {
        return (View) this.f75413p.getValue();
    }

    /* renamed from: r */
    public final ImageView mo58379r() {
        return (ImageView) this.f75414q.getValue();
    }

    /* renamed from: s */
    public final View mo58380s() {
        return (View) this.f75417t.getValue();
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        this.f75421x = false;
    }

    /* renamed from: l */
    public final void mo22676l() {
        super.mo22676l();
        m68027C();
    }

    /* renamed from: t */
    public final void mo58381t() {
        RemoteImageView p = mo58377p();
        C52711k.m112236a((Object) p, "mIvCover");
        p.setVisibility(0);
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        this.f75421x = true;
        m68028D();
        if (this.f75420w) {
            m68026B();
        }
    }

    /* renamed from: g */
    public final void mo22671g() {
        super.mo22671g();
        this.itemView.setOnClickListener(this);
        this.f75418u = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f75418u;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent.mo97917a(m68030w());
        VideoViewComponent videoViewComponent2 = this.f75418u;
        if (videoViewComponent2 == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent2.mo97918a((C50161j) new C28751c(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m68026B() {
        /*
            r2 = this;
            r0 = 0
            r2.f75407g = r0
            com.ss.android.ugc.aweme.feed.d.a r0 = r2.f75419v
            int r0 = r0.f78757a
            if (r0 == 0) goto L_0x0043
            r1 = 3
            if (r0 == r1) goto L_0x000d
            goto L_0x0046
        L_0x000d:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f75418u
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0016:
            java.lang.Object r1 = r2.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.awemes
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = p2628d.p2629a.C52575l.m112140f(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            r0.mo60204a(r1)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f75418u
            if (r0 != 0) goto L_0x003a
            java.lang.String r1 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x003a:
            r0.mo97915a()
            com.ss.android.ugc.aweme.feed.d.a r0 = r2.f75419v
            r1 = 4
            r0.f78757a = r1
            return
        L_0x0043:
            r2.mo58382u()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3PlaylistViewHolder.m68026B():void");
    }

    /* renamed from: D */
    private final void m68028D() {
        String str;
        if (this.f75420w && this.f75421x) {
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
        this.f75420w = false;
        this.f75421x = false;
        RemoteImageView p = mo58377p();
        C52711k.m112236a((Object) p, "mIvCover");
        p.getLayoutParams().height = ((DiscoveryCellStructV3) mo22689o()).displayHeight;
        KeepSurfaceTextureView w = m68030w();
        C52711k.m112236a((Object) w, "mSurfaceView");
        w.getLayoutParams().height = ((DiscoveryCellStructV3) mo22689o()).displayHeight;
        FrameLayout x = m68031x();
        C52711k.m112236a((Object) x, "mFrameLayout");
        x.getLayoutParams().height = ((DiscoveryCellStructV3) mo22689o()).displayHeight;
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        if (C41589c.m91440l() == 2) {
            View q = mo58378q();
            C52711k.m112236a((Object) q, "mBgView");
            q.getLayoutParams().height = ((DiscoveryCellStructV3) mo22689o()).displayHeight;
        }
        super.mo22674j();
    }

    /* renamed from: u */
    public final void mo58382u() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        if (C41589c.m91440l() == 2) {
            if (this.f31643i % 4 == 1 || this.f31643i % 4 == 2) {
                KeepSurfaceTextureView w = m68030w();
                C52711k.m112236a((Object) w, "mSurfaceView");
                w.setVisibility(0);
                View s = mo58380s();
                C52711k.m112236a((Object) s, "mBgGray");
                s.setVisibility(0);
            } else {
                View s2 = mo58380s();
                C52711k.m112236a((Object) s2, "mBgGray");
                s2.setVisibility(8);
                KeepSurfaceTextureView w2 = m68030w();
                C52711k.m112236a((Object) w2, "mSurfaceView");
                w2.setVisibility(8);
                return;
            }
        }
        m68025A();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m68025A() {
        /*
            r9 = this;
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f75418u
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            com.ss.android.ugc.playerkit.videoview.i r0 = r0.f125619b
            java.lang.String r1 = "mVideoView.surfaceHolder"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.mo97954c()
            r1 = 1
            if (r0 != 0) goto L_0x001a
            r9.f75407g = r1
            return
        L_0x001a:
            com.ss.android.ugc.aweme.feed.d.a r0 = r9.f75419v
            int r0 = r0.f78757a
            if (r0 == 0) goto L_0x0028
            r1 = 3
            if (r0 == r1) goto L_0x0024
            goto L_0x0080
        L_0x0024:
            r9.m68026B()
            return
        L_0x0028:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f75418u
            if (r0 != 0) goto L_0x0031
            java.lang.String r2 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0031:
            com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$j r2 = r9.f75422y
            com.ss.android.ugc.aweme.player.sdk.a.j r2 = (com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j) r2
            r0.mo60207a(r2)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f75418u
            if (r0 != 0) goto L_0x0041
            java.lang.String r2 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0041:
            java.lang.Object r2 = r9.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment> r4 = com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment.class
            r5 = 1
            java.lang.String r6 = "decoder_type"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r8 = 0
            int r3 = r3.mo18168a(r4, r5, r6, r7, r8)
            r0.mo60205a(r2, r1, r3)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f75418u
            if (r0 != 0) goto L_0x0075
            java.lang.String r1 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0075:
            r0.mo97915a()
            r0 = 0
            r9.f75407g = r0
            com.ss.android.ugc.aweme.feed.d.a r0 = r9.f75419v
            r1 = 2
            r0.f78757a = r1
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3PlaylistViewHolder.m68025A():void");
    }

    /* renamed from: C */
    private final void m68027C() {
        String str;
        this.f75407g = false;
        if (this.f75419v.f78757a != 0) {
            VideoViewComponent videoViewComponent = this.f75418u;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent.mo60216ag();
            VideoViewComponent videoViewComponent2 = this.f75418u;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo97919b();
            VideoViewComponent videoViewComponent3 = this.f75418u;
            if (videoViewComponent3 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent3.mo60226b((C38871j) this.f75422y);
            this.f75419v.f78757a = 0;
            if (this.f75408j > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f75408j;
                this.f75408j = -1;
                String str2 = "discovery";
                String playListType = ((DiscoveryCellStructV3) mo22689o()).getPlayListType();
                String str3 = ((DiscoveryCellStructV3) mo22689o()).cellID;
                List<Aweme> list = ((DiscoveryCellStructV3) mo22689o()).awemes;
                if (list != null) {
                    Aweme aweme = (Aweme) C52575l.m112140f(list);
                    if (aweme != null) {
                        str = aweme.getAid();
                        C28396b.m67410a(str2, playListType, str3, str, currentTimeMillis, this.f31643i + 1, ((DiscoveryCellStructV3) mo22689o()).logPb);
                    }
                }
                str = null;
                C28396b.m67410a(str2, playListType, str3, str, currentTimeMillis, this.f31643i + 1, ((DiscoveryCellStructV3) mo22689o()).logPb);
            }
            mo58381t();
        }
    }

    /* renamed from: z */
    private final void m68033z() {
        if (C24678b.m60182a(((DiscoveryCellStructV3) mo22689o()).title)) {
            float f = (float) ((DiscoveryCellStructV3) mo22689o()).displayWidth;
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            float b = f - C9432q.m18687b(view.getContext(), 30.0f);
            DmtTextView v = m68029v();
            C52711k.m112236a((Object) v, "mTvTitle");
            TextPaint paint = v.getPaint();
            m68029v().setTextSize(2, 20.0f);
            C52711k.m112236a((Object) paint, "paint");
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            paint.setTextSize(C9432q.m18669a(view2.getContext(), 20.0f));
            if (paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) <= b) {
                m68029v().setTextSize(2, 20.0f);
            } else if (paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) <= b || paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) > b * 2.0f) {
                float f2 = 2.0f * b;
                if (paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) <= f2 || paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) > b * 3.0f) {
                    m68029v().setTextSize(2, 17.0f);
                } else {
                    View view3 = this.itemView;
                    C52711k.m112236a((Object) view3, "itemView");
                    paint.setTextSize(C9432q.m18669a(view3.getContext(), 17.0f));
                    if (paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) > f2) {
                        m68029v().setTextSize(2, 20.0f);
                    } else {
                        m68029v().setTextSize(2, 17.0f);
                    }
                }
            } else {
                View view4 = this.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                paint.setTextSize(C9432q.m18669a(view4.getContext(), 17.0f));
                if (paint.measureText(((DiscoveryCellStructV3) mo22689o()).title) > b) {
                    m68029v().setTextSize(2, 20.0f);
                } else {
                    m68029v().setTextSize(2, 17.0f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58373a(boolean z) {
        if (!z) {
            m68028D();
            if (this.f75420w) {
                m68026B();
            }
        } else if (this.f75420w) {
            m68027C();
        }
    }

    public DiscoveryV3PlaylistViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tg, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_v3_video, parent, false)");
        super(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r9)
            java.lang.String r0 = "discovery"
            java.lang.Object r9 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.lang.String r1 = r9.getPlayListType()
            java.lang.Object r9 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.lang.String r2 = r9.cellID
            java.lang.Object r9 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r9 = r9.awemes
            r6 = 0
            if (r9 == 0) goto L_0x0030
            java.lang.Object r9 = p2628d.p2629a.C52575l.m112140f(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r9
            if (r9 == 0) goto L_0x0030
            java.lang.String r9 = r9.getAid()
            r3 = r9
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            int r9 = r8.f31643i
            r7 = 1
            int r4 = r9 + 1
            java.lang.Object r9 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r9.logPb
            com.p683ss.android.ugc.aweme.discover.mob.C28396b.m67408a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.setting.c r9 = com.p683ss.android.ugc.aweme.setting.C41589c.m91432a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            int r9 = com.p683ss.android.ugc.aweme.setting.C41589c.m91440l()
            r0 = 2
            if (r9 != r0) goto L_0x00a5
            java.lang.Object r9 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            int r9 = r9.type
            r1 = 5
            if (r9 != r1) goto L_0x00a5
            java.lang.Object r9 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.lang.String r9 = r9.refUrl
            boolean r9 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r9)
            if (r9 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.router.w r9 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r1 = "RouterManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            com.ss.android.ugc.aweme.router.u r9 = r9.f104758d
            java.lang.String r1 = "use_webview_title"
            r9.mo83856c(r1)
            com.ss.android.ugc.aweme.router.w r9 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.Object r1 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.lang.String r1 = r1.refUrl
            d.n[] r0 = new p2628d.C52847n[r0]
            r2 = 0
            java.lang.String r3 = "use_webview_title"
            java.lang.String r4 = "true"
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r0[r2] = r3
            java.lang.String r2 = "title"
            java.lang.String r3 = " "
            d.n r2 = p2628d.C52856t.m112465a(r2, r3)
            r0[r7] = r2
            java.util.HashMap r0 = p2628d.p2629a.C52550ab.m112057c(r0)
            r9.mo83862a(r1, r0)
            return
        L_0x00a5:
            android.view.View r9 = r8.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            android.content.Context r9 = r9.getContext()
            java.lang.Object r0 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r0 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r0
            int r0 = r0.type
            java.lang.Object r1 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.lang.String r1 = r1.cellID
            java.lang.Object r2 = r8.mo22689o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L_0x00d6
            java.lang.String r6 = r2.getAid()
        L_0x00d6:
            int r2 = r8.f31643i
            com.p683ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity.m66409a(r9, r0, r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3PlaylistViewHolder.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        Aweme aweme;
        Aweme aweme2;
        Video video;
        DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) obj;
        C52711k.m112240b(discoveryCellStructV3, "item");
        this.f75420w = true;
        RemoteImageView p = mo58377p();
        C52711k.m112236a((Object) p, "mIvCover");
        p.getLayoutParams().height = discoveryCellStructV3.displayHeight;
        FrameLayout x = m68031x();
        C52711k.m112236a((Object) x, "mFrameLayout");
        x.getLayoutParams().height = discoveryCellStructV3.displayHeight;
        View q = mo58378q();
        C52711k.m112236a((Object) q, "mBgView");
        q.setVisibility(4);
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        Video video2 = null;
        if (C41589c.m91440l() == 2) {
            int i = ((DiscoveryCellStructV3) mo22689o()).displayWidth;
            int i2 = ((DiscoveryCellStructV3) mo22689o()).displayHeight;
            List<Aweme> list = ((DiscoveryCellStructV3) mo22689o()).awemes;
            if (list != null) {
                aweme2 = (Aweme) C52575l.m112140f(list);
            } else {
                aweme2 = null;
            }
            if (aweme2 != null) {
                video = aweme2.getVideo();
            } else {
                video = null;
            }
            if (video != null) {
                float width = (float) video.getWidth();
                float height = (float) video.getHeight();
                float f = width / height;
                if (f >= 0.75f || f <= 0.5625f) {
                    i2 = C52733a.m112277a((((float) i) / width) * height);
                } else {
                    i = C52733a.m112277a((((float) i2) / height) * width);
                }
            }
            RemoteImageView p2 = mo58377p();
            C52711k.m112236a((Object) p2, "mIvCover");
            p2.getLayoutParams().width = i;
            RemoteImageView p3 = mo58377p();
            C52711k.m112236a((Object) p3, "mIvCover");
            p3.getLayoutParams().height = i2;
            KeepSurfaceTextureView w = m68030w();
            C52711k.m112236a((Object) w, "mSurfaceView");
            w.getLayoutParams().width = i;
            KeepSurfaceTextureView w2 = m68030w();
            C52711k.m112236a((Object) w2, "mSurfaceView");
            w2.getLayoutParams().height = i2;
            if (i2 < ((DiscoveryCellStructV3) mo22689o()).displayHeight) {
                this.f75409k = true;
            } else {
                this.f75409k = false;
                View q2 = mo58378q();
                C52711k.m112236a((Object) q2, "mBgView");
                q2.setVisibility(4);
            }
            DiscoverHollowTextView y = m68032y();
            C52711k.m112236a((Object) y, "mHtvTag");
            y.setVisibility(0);
            m68029v().setTextSize(2, 20.0f);
            if (((DiscoveryCellStructV3) mo22689o()).type == 0 || ((DiscoveryCellStructV3) mo22689o()).type == 3) {
                DiscoverHollowTextView y2 = m68032y();
                C52711k.m112236a((Object) y2, "mHtvTag");
                y2.setVisibility(4);
                m68033z();
            } else if (((DiscoveryCellStructV3) mo22689o()).type != 1) {
                if (((DiscoveryCellStructV3) mo22689o()).type == 4) {
                    DiscoverHollowTextView y3 = m68032y();
                    C52711k.m112236a((Object) y3, "mHtvTag");
                    View view = this.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    y3.setText(view.getContext().getString(R.string.cpd));
                } else if (((DiscoveryCellStructV3) mo22689o()).type == 5) {
                    DiscoverHollowTextView y4 = m68032y();
                    C52711k.m112236a((Object) y4, "mHtvTag");
                    View view2 = this.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    y4.setText(view2.getContext().getString(R.string.dmb));
                    m68033z();
                } else {
                    DiscoverHollowTextView y5 = m68032y();
                    C52711k.m112236a((Object) y5, "mHtvTag");
                    View view3 = this.itemView;
                    C52711k.m112236a((Object) view3, "itemView");
                    y5.setText(view3.getContext().getString(R.string.yo));
                }
            }
            View view4 = this.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            if (C47918gj.m103682a(view4.getContext())) {
                DmtTextView v = m68029v();
                C52711k.m112236a((Object) v, "mTvTitle");
                v.setGravity(5);
            }
        }
        DmtTextView v2 = m68029v();
        C52711k.m112236a((Object) v2, "mTvTitle");
        v2.setText(((DiscoveryCellStructV3) mo22689o()).title);
        mo58381t();
        List<Aweme> list2 = ((DiscoveryCellStructV3) mo22689o()).awemes;
        if (list2 != null) {
            aweme = (Aweme) C52575l.m112140f(list2);
        } else {
            aweme = null;
        }
        if (aweme != null) {
            video2 = aweme.getVideo();
        }
        if (video2 != null) {
            RemoteImageView p4 = mo58377p();
            Video video3 = aweme.getVideo();
            C52711k.m112236a((Object) video3, "aweme.video");
            C23515d.m57672a(p4, video3.getOriginCover(), (C13791d<C14045f>) new C28750b<C14045f>(this));
        }
        mo58379r().setImageResource(R.drawable.a3h);
        mo58382u();
        m68028D();
    }
}
