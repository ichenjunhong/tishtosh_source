package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.common.p1593e.C26873e;
import com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment;
import com.p683ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p683ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.C30272c;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.util.C40556o;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.az */
public final class C30039az extends C1352v implements OnClickListener, C30272c, C39979m {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f78410a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "realName", "getRealName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "close", "getClose()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "follow", "getFollow()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "text", "getText()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "image", "getImage()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30039az.class), "mSurface", "getMSurface()Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;"))};

    /* renamed from: b */
    final int f78411b;

    /* renamed from: c */
    final int f78412c;

    /* renamed from: d */
    public C40443b f78413d;

    /* renamed from: e */
    public C26873e<C30039az> f78414e;

    /* renamed from: f */
    public VideoViewComponent f78415f;

    /* renamed from: g */
    public boolean f78416g;

    /* renamed from: h */
    public boolean f78417h;

    /* renamed from: i */
    public Video f78418i;

    /* renamed from: j */
    public UserWithAweme f78419j;

    /* renamed from: k */
    public final C30042a f78420k;

    /* renamed from: l */
    public final C30043b f78421l;

    /* renamed from: m */
    public GalleryLayoutManager f78422m;

    /* renamed from: n */
    private final C52668f f78423n;

    /* renamed from: o */
    private final C52668f f78424o;

    /* renamed from: p */
    private final C52668f f78425p;

    /* renamed from: q */
    private final C52668f f78426q;

    /* renamed from: r */
    private final C52668f f78427r;

    /* renamed from: s */
    private final C52668f f78428s;

    /* renamed from: t */
    private final C52668f f78429t;

    /* renamed from: u */
    private final C30178a f78430u = new C30178a();

    /* renamed from: v */
    private C39971i f78431v = new C39971i();

    /* renamed from: w */
    private final C30051j f78432w = new C30051j(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$a */
    public interface C30042a {
        /* renamed from: a */
        void mo60308a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$b */
    public interface C30043b {
        /* renamed from: b */
        void mo60309b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$c */
    static final class C30044c extends C52712l implements C52670a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f78436a;

        C30044c(View view) {
            this.f78436a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AvatarImageWithVerify) this.f78436a.findViewById(R.id.hi);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$d */
    static final class C30045d extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f78437a;

        C30045d(View view) {
            this.f78437a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f78437a.findViewById(R.id.ue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$e */
    static final class C30046e extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f78438a;

        C30046e(View view) {
            this.f78438a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f78438a.findViewById(R.id.ai0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$f */
    static final class C30047f implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C30039az f78439a;

        C30047f(C30039az azVar) {
            this.f78439a = azVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            this.f78439a.mo60318g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$g */
    public static final class C30048g implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C30039az f78440a;

        public final void onAnimationRepeat(Animation animation) {
            C52711k.m112240b(animation, "animation");
        }

        public final void onAnimationStart(Animation animation) {
            C52711k.m112240b(animation, "animation");
        }

        C30048g(C30039az azVar) {
            this.f78440a = azVar;
        }

        public final void onAnimationEnd(Animation animation) {
            C52711k.m112240b(animation, "animation");
            this.f78440a.mo60310a().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$h */
    static final class C30049h extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f78441a;

        C30049h(View view) {
            this.f78441a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f78441a.findViewById(R.id.azj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$i */
    public static final class C30050i implements C50161j {

        /* renamed from: a */
        final /* synthetic */ C30039az f78442a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C30050i(C30039az azVar) {
            this.f78442a = azVar;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f78442a.f78417h) {
                this.f78442a.f78417h = false;
                this.f78442a.mo60316e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$j */
    public static final class C30051j extends C48009d {

        /* renamed from: a */
        final /* synthetic */ C30039az f78443a;

        C30051j(C30039az azVar) {
            this.f78443a = azVar;
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            super.mo53524a(dVar);
            this.f78443a.mo60310a().setVisibility(0);
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            super.mo53526a(gVar);
            this.f78443a.f78416g = true;
            this.f78443a.mo60315d();
            if (this.f78443a.getAdapterPosition() != this.f78443a.f78422m.f79080b) {
                VideoViewComponent videoViewComponent = this.f78443a.f78415f;
                if (videoViewComponent == null) {
                    C52711k.m112237a("mVideoView");
                }
                videoViewComponent.mo60215af();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$k */
    static final class C30052k extends C52712l implements C52670a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ View f78444a;

        C30052k(View view) {
            this.f78444a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (KeepSurfaceTextureView) this.f78444a.findViewById(R.id.czh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$l */
    static final class C30053l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30039az f78445a;

        C30053l(C30039az azVar) {
            this.f78445a = azVar;
        }

        public final void run() {
            this.f78445a.mo60318g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$m */
    static final class C30054m extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f78446a;

        C30054m(View view) {
            this.f78446a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f78446a.findViewById(R.id.c9j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.az$n */
    static final class C30055n extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f78447a;

        C30055n(View view) {
            this.f78447a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f78447a.findViewById(R.id.dn1);
        }
    }

    /* renamed from: j */
    private DmtTextView m70451j() {
        return (DmtTextView) this.f78423n.getValue();
    }

    /* renamed from: k */
    private AvatarImageWithVerify m70452k() {
        return (AvatarImageWithVerify) this.f78424o.getValue();
    }

    /* renamed from: l */
    private DmtTextView m70453l() {
        return (DmtTextView) this.f78426q.getValue();
    }

    /* renamed from: m */
    private DmtTextView m70454m() {
        return (DmtTextView) this.f78427r.getValue();
    }

    /* renamed from: a */
    public final RemoteImageView mo60310a() {
        return (RemoteImageView) this.f78428s.getValue();
    }

    /* renamed from: b */
    public final KeepSurfaceTextureView mo60313b() {
        return (KeepSurfaceTextureView) this.f78429t.getValue();
    }

    /* renamed from: h */
    public final void mo60319h() {
        mo60320i();
    }

    /* renamed from: c */
    public final void mo60314c() {
        mo60310a().setVisibility(0);
    }

    /* renamed from: d */
    public final void mo60315d() {
        if (this.f78416g && mo60310a().getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new C30048g(this));
            mo60310a().startAnimation(alphaAnimation);
        }
    }

    /* renamed from: f */
    public final void mo60317f() {
        this.f78417h = false;
        if (this.f78430u.f78757a != 0) {
            VideoViewComponent videoViewComponent = this.f78415f;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent.mo60216ag();
            VideoViewComponent videoViewComponent2 = this.f78415f;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo97919b();
            VideoViewComponent videoViewComponent3 = this.f78415f;
            if (videoViewComponent3 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent3.mo60226b((C38871j) this.f78432w);
            this.f78430u.f78757a = 0;
            mo60314c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo60320i() {
        UserWithAweme userWithAweme = this.f78419j;
        if (userWithAweme != null) {
            m70450a(userWithAweme.getUser().getFollowStatus(), userWithAweme.getUser().getFollowerStatus());
            UserVerify userVerify = new UserVerify(userWithAweme.getUser().getAvatarThumb(), userWithAweme.getUser().getCustomVerify(), userWithAweme.getUser().getEnterpriseVerifyReason(), Integer.valueOf(userWithAweme.getUser().getVerificationType()), userWithAweme.getUser().getWeiboVerify());
            m70452k().setUserData(userVerify);
            m70452k().mo48964b();
            mo60312a(userWithAweme.getUser());
        }
    }

    /* renamed from: e */
    public final void mo60316e() {
        VideoViewComponent videoViewComponent = this.f78415f;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        C50160i iVar = videoViewComponent.f125619b;
        C52711k.m112236a((Object) iVar, "mVideoView.surfaceHolder");
        if (!iVar.mo97954c() || this.f78418i == null) {
            this.f78417h = true;
            return;
        }
        int i = this.f78430u.f78757a;
        if (i == 0) {
            VideoViewComponent videoViewComponent2 = this.f78415f;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo60207a((C38871j) this.f78432w);
            VideoViewComponent videoViewComponent3 = this.f78415f;
            if (videoViewComponent3 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent3.mo60205a(this.f78418i, true, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
            this.f78417h = false;
            this.f78430u.f78757a = 2;
        } else if (i == 3) {
            int i2 = this.f78430u.f78757a;
            if (i2 == 0) {
                mo60316e();
            } else if (i2 == 3) {
                mo60315d();
                VideoViewComponent videoViewComponent4 = this.f78415f;
                if (videoViewComponent4 == null) {
                    C52711k.m112237a("mVideoView");
                }
                videoViewComponent4.mo60204a(this.f78418i);
                this.f78430u.f78757a = 4;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r2 != null) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60318g() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r1 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 != 0) goto L_0x0023
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            java.lang.String r2 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.feed.adapter.az$f r4 = new com.ss.android.ugc.aweme.feed.adapter.az$f
            r4.<init>(r7)
            com.ss.android.ugc.aweme.base.component.g r4 = (com.p683ss.android.ugc.aweme.base.component.C23505g) r4
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r0, r2, r3, r1, r4)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.friends.model.UserWithAweme r0 = r7.f78419j
            if (r0 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getUser()
            int r2 = r2.getFollowStatus()
            if (r2 != 0) goto L_0x003a
            com.ss.android.ugc.aweme.feed.adapter.az$b r2 = r7.f78421l
            int r3 = r7.getAdapterPosition()
            r2.mo60309b(r3)
        L_0x003a:
            android.view.View r2 = r7.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x006e
            android.view.View r2 = r7.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.content.Context r2 = r2.getContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x006e
            android.view.View r2 = r7.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x0066
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x006f
        L_0x0066:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x006e:
            r2 = r1
        L_0x006f:
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getUser()
            int r3 = r3.getFollowStatus()
            r4 = 0
            r5 = 1
            r6 = 4
            if (r3 == r6) goto L_0x009a
            switch(r3) {
                case 0: goto L_0x0080;
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x009a
        L_0x0080:
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getUser()
            boolean r3 = r3.isSecret()
            if (r3 == 0) goto L_0x008c
            r4 = 4
            goto L_0x009a
        L_0x008c:
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getUser()
            int r3 = r3.getFollowerStatus()
            if (r3 != r5) goto L_0x0099
            r3 = 2
            r4 = 2
            goto L_0x009a
        L_0x0099:
            r4 = 1
        L_0x009a:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            int r0 = r0.getFollowStatus()
            if (r0 != r6) goto L_0x00a7
            if (r2 == 0) goto L_0x0113
            goto L_0x0110
        L_0x00a7:
            if (r4 != r6) goto L_0x0110
            if (r2 == 0) goto L_0x0113
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.app.bf r0 = r0.getPrivacyAccountFollowCount()
            java.lang.String r3 = "prefCacheItem"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.Object r3 = r0.mo47782d()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x00c6
            goto L_0x00e9
        L_0x00c6:
            int r6 = r3.intValue()
            if (r6 != 0) goto L_0x00e9
            com.bytedance.ies.dmt.ui.b.a$a r6 = new com.bytedance.ies.dmt.ui.b.a$a
            android.content.Context r2 = (android.content.Context) r2
            r6.<init>(r2)
            r2 = 2132547838(0x7f1c18fe, float:2.0748933E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r6.mo18899b(r2)
            r6 = 2132545162(0x7f1c0e8a, float:2.0743506E38)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r2.mo18886a(r6, r1)
            com.bytedance.ies.dmt.ui.b.a r1 = r1.mo18897a()
            r1.mo18882b()
            goto L_0x0104
        L_0x00e9:
            r1 = 3
            java.lang.String r6 = "followCount"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
            int r6 = r3.intValue()
            if (r5 <= r6) goto L_0x00f6
            goto L_0x0104
        L_0x00f6:
            if (r1 < r6) goto L_0x0104
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2132547839(0x7f1c18ff, float:2.0748935E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r2, r1)
            r1.mo19066a()
        L_0x0104:
            int r1 = r3.intValue()
            int r1 = r1 + r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.mo47776a(r1)
        L_0x0110:
            r7.m70449a(r4)
        L_0x0113:
            return
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30039az.mo60318g():void");
    }

    public final void onFollowFail(Exception exc) {
        if (!C24501b.m59896a(exc)) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C22971a.m56494a(view.getContext(), exc, R.string.b47);
        }
        UserWithAweme userWithAweme = this.f78419j;
        if (userWithAweme != null) {
            m70450a(userWithAweme.getUser().getFollowStatus(), userWithAweme.getUser().getFollowerStatus());
        }
    }

    /* renamed from: a */
    private final void m70449a(int i) {
        int i2;
        m70450a(i, -1);
        UserWithAweme userWithAweme = this.f78419j;
        if (userWithAweme != null) {
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f78431v.mo66349a(new C39970a().mo81871a(userWithAweme.getUser().getUid()).mo81874b(userWithAweme.getUser().getSecUid()).mo81869a(i2).mo81876c("homepage_follow").mo81873b(12).mo81877d(userWithAweme.getUser().getFollowerStatus()).mo81872a());
        }
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "view");
        int id = view.getId();
        if (id == R.id.ue) {
            UserWithAweme userWithAweme = this.f78419j;
            if (userWithAweme != null) {
                C40443b bVar = this.f78413d;
                if (bVar != null) {
                    bVar.mo60645a(userWithAweme.getUser(), getAdapterPosition());
                }
                this.f78420k.mo60308a(userWithAweme.getUser(), getAdapterPosition());
            }
        } else if (id == R.id.ai0 && !C32800a.m75679a(view)) {
            UserWithAweme userWithAweme2 = this.f78419j;
            if (userWithAweme2 != null) {
                C40443b bVar2 = this.f78413d;
                if (bVar2 != null) {
                    bVar2.mo60647c(userWithAweme2.getUser(), getAdapterPosition());
                }
                IIMService d = C33194e.m76279d();
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                Context context = view2.getContext();
                if (userWithAweme2.getUser().getFollowStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                d.wrapperSyncXAlert(context, 2, z, new C30053l(this));
            }
        }
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        C52711k.m112240b(followStatus, "followStatus");
        UserWithAweme userWithAweme = this.f78419j;
        if (userWithAweme != null && TextUtils.equals(followStatus.userId, userWithAweme.getUser().getUid())) {
            userWithAweme.getUser().setFollowStatus(followStatus.followStatus);
            int i = followStatus.followStatus;
            UserWithAweme userWithAweme2 = this.f78419j;
            if (userWithAweme2 == null) {
                C52711k.m112234a();
            }
            C47718bf.m103288a(new C24530d(i, userWithAweme2));
            m70450a(followStatus.followStatus, followStatus.followerStatus);
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C40556o.m89968a(view.getContext(), userWithAweme.getUser(), followStatus);
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(userWithAweme.getUser().getRemarkName())) {
                userWithAweme.getUser().setRemarkName("");
                mo60312a(userWithAweme.getUser());
            }
        }
    }

    /* renamed from: a */
    public final void mo60312a(User user) {
        C52711k.m112240b(user, "user");
        m70454m().setText(user.getNickname());
        DmtTextView j = m70451j();
        StringBuilder sb = new StringBuilder("@");
        sb.append(user.getUniqueId());
        j.setText(sb.toString());
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        C47916gh.m103675a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), m70454m());
    }

    /* renamed from: a */
    private final void m70450a(int i, int i2) {
        m70453l().setVisibility(0);
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        Resources resources = context.getResources();
        if (i == 0) {
            if (i2 != 1 || !FollowToFollowBackExperiment.m69596a()) {
                m70453l().setText(resources.getText(R.string.b3w));
            } else {
                m70453l().setText(resources.getText(R.string.gfm));
            }
            m70453l().setBackgroundResource(R.drawable.cjh);
            m70453l().setTextColor(resources.getColor(R.color.jf));
        } else if (i == 1 || i == 2) {
            int i3 = R.string.b55;
            if (i == 2) {
                i3 = R.string.as8;
            }
            m70453l().setText(i3);
            m70453l().setTextColor(resources.getColor(R.color.a18));
            m70453l().setBackgroundResource(R.drawable.l5);
        } else {
            if (i == 4) {
                m70453l().setTextColor(resources.getColor(R.color.a18));
                m70453l().setBackgroundResource(R.drawable.l5);
                DmtTextView l = m70453l();
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                l.setText(view2.getContext().getString(R.string.b4y));
            }
        }
    }

    /* renamed from: a */
    public final void mo60311a(RecyclerView recyclerView, View view, int i) {
        if (getAdapterPosition() != i) {
            mo60317f();
            return;
        }
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            C26873e<C30039az> eVar = this.f78414e;
            if (eVar != null) {
                eVar.mo54831b(this);
            }
            if (this.f78422m.mo60651g()) {
                mo60316e();
            }
        }
    }

    public C30039az(final View view, C30042a aVar, C30043b bVar, GalleryLayoutManager galleryLayoutManager) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(aVar, "onItemCloseListener");
        C52711k.m112240b(bVar, "onItemFollowListener");
        C52711k.m112240b(galleryLayoutManager, "mGalleryLayoutManager");
        super(view);
        this.f78420k = aVar;
        this.f78421l = bVar;
        this.f78422m = galleryLayoutManager;
        this.f78411b = (int) C9432q.m18687b(view.getContext(), 279.0f);
        this.f78412c = (int) C9432q.m18687b(view.getContext(), 372.0f);
        this.f78423n = C52732g.m112285a(new C30054m(view));
        this.f78424o = C52732g.m112285a(new C30044c(view));
        this.f78425p = C52732g.m112285a(new C30045d(view));
        this.f78426q = C52732g.m112285a(new C30046e(view));
        this.f78427r = C52732g.m112285a(new C30055n(view));
        this.f78428s = C52732g.m112285a(new C30049h(view));
        this.f78429t = C52732g.m112285a(new C30052k(view));
        view.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ C30039az f78433a;

            {
                this.f78433a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C52711k.m112240b(view, "view");
                GalleryLayoutManager galleryLayoutManager = this.f78433a.f78422m;
                galleryLayoutManager.f79088j.add(this.f78433a);
            }

            public final void onViewDetachedFromWindow(View view) {
                C52711k.m112240b(view, "view");
                this.f78433a.mo60317f();
                GalleryLayoutManager galleryLayoutManager = this.f78433a.f78422m;
                galleryLayoutManager.f79088j.remove(this.f78433a);
            }
        });
        this.f78415f = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f78415f;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent.mo97917a(mo60313b());
        VideoViewComponent videoViewComponent2 = this.f78415f;
        if (videoViewComponent2 == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent2.f125619b.mo97950a((C50161j) new C30050i(this));
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C30039az f78434a;

            {
                this.f78434a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UserWithAweme userWithAweme = this.f78434a.f78419j;
                if (userWithAweme == null) {
                    C52711k.m112234a();
                }
                if (this.f78434a.getAdapterPosition() < this.f78434a.f78422m.f79080b) {
                    this.f78434a.f78422m.mo4672a(this.f78434a.f78422m.f79080b - 1);
                } else if (this.f78434a.getAdapterPosition() > this.f78434a.f78422m.f79080b) {
                    this.f78434a.f78422m.mo4672a(this.f78434a.f78422m.f79080b + 1);
                } else {
                    C40443b bVar = this.f78434a.f78413d;
                    if (bVar != null) {
                        bVar.mo60648d(userWithAweme.getUser(), this.f78434a.getAdapterPosition());
                    }
                    UserProfileActivity.m89400a(view.getContext(), C47661ab.m103163a().mo94972a("uid", userWithAweme.getUser().getUid()).mo94972a("sec_user_id", userWithAweme.getUser().getSecUid()).mo94972a("enter_from", "homepage_follow").mo94972a("enter_from_request_id", userWithAweme.getUser().getRequestId()).mo94972a("extra_previous_page_position", "card_head").mo94969a("need_track_compare_recommend_reason", 1).mo94972a("previous_recommend_reason", userWithAweme.getUser().getRecommendReason()).mo94972a("recommend_from_type", "card").f120139a);
                }
            }
        });
        OnClickListener onClickListener = this;
        m70453l().setOnClickListener(onClickListener);
        ((ImageView) this.f78425p.getValue()).setOnClickListener(onClickListener);
        this.f78431v.mo54800a(this);
    }
}
