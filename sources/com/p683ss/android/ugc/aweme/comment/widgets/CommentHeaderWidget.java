package com.p683ss.android.ugc.aweme.comment.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.experiment.HideCommentHeaderWidgetExperiment;
import com.p683ss.android.ugc.aweme.commerce.model.C25519e;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commercialize.link.C25973h;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20850b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.model.C39118b;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47891fl;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget */
public final class CommentHeaderWidget extends BaseCommentWidget implements OnClickListener {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f67281i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mStarLinkTag", "getMStarLinkTag()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mStarLinkIcon", "getMStarLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mStarLinkTitle", "getMStarLinkTitle()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mStarLinkDesc", "getMStarLinkDesc()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mTaskLinkTag", "getMTaskLinkTag()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mTaskLinkIcon", "getMTaskLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mTaskLinkTitle", "getMTaskLinkTitle()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mTaskLinkDesc", "getMTaskLinkDesc()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mLinkTag", "getMLinkTag()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mLinkIcon", "getMLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mLinkTitle", "getMLinkTitle()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mLinkAdTag", "getMLinkAdTag()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mLinkAdTagDivider", "getMLinkAdTagDivider()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mLinkDesc", "getMLinkDesc()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceArea", "getMCommerceArea()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceLogo", "getMCommerceLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceTitle", "getMCommerceTitle()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceDescriptionLayout", "getMCommerceDescriptionLayout()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommercePrice", "getMCommercePrice()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceBottomDivider", "getMCommerceBottomDivider()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceSales", "getMCommerceSales()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceBottomDivider2", "getMCommerceBottomDivider2()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mPoiCouponText", "getMPoiCouponText()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceDivider", "getMCommerceDivider()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentHeaderWidget.class), "mCommerceLogoRight", "getMCommerceLogoRight()Landroid/widget/ImageView;"))};

    /* renamed from: k */
    public static final C25434a f67282k = new C25434a(null);

    /* renamed from: A */
    private final C25429a f67283A = m61852a((int) R.id.y2);

    /* renamed from: B */
    private final C25429a f67284B = m61852a((int) R.id.ye);

    /* renamed from: C */
    private final C25429a f67285C = m61852a((int) R.id.b78);

    /* renamed from: D */
    private final C25429a f67286D = m61852a((int) R.id.y4);

    /* renamed from: E */
    private final C25429a f67287E = m61852a((int) R.id.xs);

    /* renamed from: F */
    private final C25429a f67288F = m61852a((int) R.id.y5);

    /* renamed from: G */
    private final C25429a f67289G = m61852a((int) R.id.xt);

    /* renamed from: H */
    private final C25429a f67290H = m61852a((int) R.id.a1j);

    /* renamed from: I */
    private final C25429a f67291I = m61852a((int) R.id.xz);

    /* renamed from: J */
    private final C25429a f67292J = m61852a((int) R.id.y3);

    /* renamed from: K */
    private C52671b<? super View, C52860x> f67293K = C25435b.f67310a;

    /* renamed from: j */
    public final C52670a<C52860x> f67294j;

    /* renamed from: l */
    private final C25429a f67295l = m61852a((int) R.id.ewo);

    /* renamed from: m */
    private final C25429a f67296m = m61852a((int) R.id.ewn);

    /* renamed from: n */
    private final C25429a f67297n = m61852a((int) R.id.ewp);

    /* renamed from: o */
    private final C25429a f67298o = m61852a((int) R.id.ewm);

    /* renamed from: p */
    private final C25429a f67299p = m61852a((int) R.id.ezd);

    /* renamed from: q */
    private final C25429a f67300q = m61852a((int) R.id.ezc);

    /* renamed from: r */
    private final C25429a f67301r = m61852a((int) R.id.eze);

    /* renamed from: s */
    private final C25429a f67302s = m61852a((int) R.id.ezb);

    /* renamed from: t */
    private final C25429a f67303t = m61852a((int) R.id.bbm);

    /* renamed from: u */
    private final C25429a f67304u = m61852a((int) R.id.bbe);

    /* renamed from: v */
    private final C25429a f67305v = m61852a((int) R.id.bbn);

    /* renamed from: w */
    private final C25429a f67306w = m61852a((int) R.id.cw);

    /* renamed from: x */
    private final C25429a f67307x = m61852a((int) R.id.cz);

    /* renamed from: y */
    private final C25429a f67308y = m61852a((int) R.id.bbb);

    /* renamed from: z */
    private final C25429a f67309z = m61852a((int) R.id.xq);

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$a */
    static final class C25434a {
        private C25434a() {
        }

        public /* synthetic */ C25434a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$b */
    static final class C25435b extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        public static final C25435b f67310a = new C25435b();

        C25435b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$c */
    static final class C25436c extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f67311a;

        /* renamed from: b */
        final /* synthetic */ C25519e f67312b;

        C25436c(CommentHeaderWidget commentHeaderWidget, C25519e eVar) {
            this.f67311a = commentHeaderWidget;
            this.f67312b = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            String str2;
            C52711k.m112240b((View) obj, "it");
            User author = this.f67311a.mo52029d().getAuthor();
            if (author != null) {
                Context context = this.f67311a.mo52038k().getContext();
                C52711k.m112236a((Object) context, "mCommercePrice.context");
                C30669b a = C30666a.m71942a(context);
                if (C47891fl.m103593a(a.getEntranceInfo())) {
                    str = a.getEntranceInfo();
                } else {
                    try {
                        str = new JSONObject(a.getTracker()).optString("entrance_info");
                    } catch (Exception unused) {
                        str = "";
                    }
                }
                String str3 = str;
                C48021h M = C48121w.m104249M();
                C52711k.m112236a((Object) M, "PlayerManager.inst()");
                C25539a.m62079a().onFeedAnchorClick(this.f67311a.f62235b, this.f67311a.mo52029d(), this.f67312b.getPromotionId(), (long) this.f67312b.getPromotionSource(), author, true, this.f67311a.mo52033h(), "click_comment_tag", "full_screen_card", "comment_cart_tag", M.mo95256n(), str3);
                if (C26512f.m64064g(this.f67311a.mo52029d())) {
                    Context context2 = this.f67311a.f62235b;
                    Aweme d = this.f67311a.mo52029d();
                    String str4 = "comment_ad";
                    if (TextUtils.equals(this.f67311a.mo52033h(), "general_search")) {
                        str2 = "comment_first_ad";
                    } else {
                        str2 = null;
                    }
                    C26088l.m63316b(context2, d, str4, str2);
                } else if (C26512f.m64063f(this.f67311a.mo52029d()) || C26512f.m64065h(this.f67311a.mo52029d())) {
                    C26088l.m63334c(this.f67311a.f62235b, this.f67311a.mo52029d(), "comment_ad", "cart");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$d */
    static final class C25437d extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f67313a;

        /* renamed from: b */
        final /* synthetic */ PoiStruct f67314b;

        /* renamed from: c */
        final /* synthetic */ C52727e f67315c;

        C25437d(CommentHeaderWidget commentHeaderWidget, PoiStruct poiStruct, C52727e eVar) {
            this.f67313a = commentHeaderWidget;
            this.f67314b = poiStruct;
            this.f67315c = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            C52711k.m112240b((View) obj, "it");
            Context context = this.f67313a.f62235b;
            Aweme d = this.f67313a.mo52029d();
            String e = C23198ae.m56861e(this.f67313a.mo52029d());
            String str2 = "comment_ad";
            if (TextUtils.equals(this.f67313a.mo52033h(), "general_search")) {
                str = "comment_first_ad";
            } else {
                str = null;
            }
            C26088l.m63285a(context, d, e, str2, str);
            SmartRouter.buildRoute(this.f67313a.f62235b, "//poi/detail").withParam("poi_bundle", (Serializable) new C39129m().mo79728j(C23198ae.m56877m(this.f67313a.mo52029d())).mo79724f(C23198ae.m56865g(this.f67313a.mo52029d())).mo79718a(C23198ae.m56861e(this.f67313a.mo52029d())).mo79723e(C23198ae.m56867h(this.f67313a.mo52029d())).mo79717a(this.f67314b).mo79725g(C23198ae.m56846a(this.f67313a.mo52029d())).mo79726h(this.f67313a.mo52032g()).mo79732n((String) this.f67315c.element).mo79735q(String.valueOf(this.f67314b.getPoiSubTitleType())).mo79729k("click_comment").mo79714a(this.f67313a.mo52029d()).mo79719a(C32401a.m74903b(this.f67313a.mo52029d(), "")).mo79713a()).open();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$e */
    static final class C25438e extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f67316a;

        /* renamed from: b */
        final /* synthetic */ String f67317b;

        C25438e(CommentHeaderWidget commentHeaderWidget, String str) {
            this.f67316a = commentHeaderWidget;
            this.f67317b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            C20850b.m53157a(this.f67316a.f62235b, this.f67316a.mo52029d());
            C26890h.m65011a("click_mission_icon", C23089d.m56640a().mo47829a("enter_from", this.f67316a.mo52032g()).mo47829a("group_id", this.f67316a.mo52029d().getAid()).mo47829a("author_id", this.f67317b).mo47829a("entrance_location", "comment_page").f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: A */
    private final TextView m61879A() {
        return (TextView) this.f67306w.mo52036a(this, f67281i[11]);
    }

    /* renamed from: B */
    private final View m61880B() {
        return this.f67307x.mo52036a(this, f67281i[12]);
    }

    /* renamed from: C */
    private final TextView m61881C() {
        return (TextView) this.f67308y.mo52036a(this, f67281i[13]);
    }

    /* renamed from: D */
    private final View m61882D() {
        return this.f67309z.mo52036a(this, f67281i[14]);
    }

    /* renamed from: E */
    private final RemoteImageView m61883E() {
        return (RemoteImageView) this.f67283A.mo52036a(this, f67281i[15]);
    }

    /* renamed from: F */
    private final TextView m61884F() {
        return (TextView) this.f67284B.mo52036a(this, f67281i[16]);
    }

    /* renamed from: G */
    private final View m61885G() {
        return this.f67285C.mo52036a(this, f67281i[17]);
    }

    /* renamed from: H */
    private final View m61886H() {
        return this.f67287E.mo52036a(this, f67281i[19]);
    }

    /* renamed from: I */
    private final TextView m61887I() {
        return (TextView) this.f67288F.mo52036a(this, f67281i[20]);
    }

    /* renamed from: J */
    private final View m61888J() {
        return this.f67289G.mo52036a(this, f67281i[21]);
    }

    /* renamed from: K */
    private final TextView m61889K() {
        return (TextView) this.f67290H.mo52036a(this, f67281i[22]);
    }

    /* renamed from: p */
    private final View m61896p() {
        return this.f67295l.mo52036a(this, f67281i[0]);
    }

    /* renamed from: q */
    private final RemoteImageView m61897q() {
        return (RemoteImageView) this.f67296m.mo52036a(this, f67281i[1]);
    }

    /* renamed from: r */
    private final TextView m61898r() {
        return (TextView) this.f67297n.mo52036a(this, f67281i[2]);
    }

    /* renamed from: s */
    private final TextView m61899s() {
        return (TextView) this.f67298o.mo52036a(this, f67281i[3]);
    }

    /* renamed from: t */
    private final View m61900t() {
        return this.f67299p.mo52036a(this, f67281i[4]);
    }

    /* renamed from: u */
    private final RemoteImageView m61901u() {
        return (RemoteImageView) this.f67300q.mo52036a(this, f67281i[5]);
    }

    /* renamed from: v */
    private final TextView m61902v() {
        return (TextView) this.f67301r.mo52036a(this, f67281i[6]);
    }

    /* renamed from: w */
    private final TextView m61903w() {
        return (TextView) this.f67302s.mo52036a(this, f67281i[7]);
    }

    /* renamed from: x */
    private final View m61904x() {
        return this.f67303t.mo52036a(this, f67281i[8]);
    }

    /* renamed from: y */
    private final RemoteImageView m61905y() {
        return (RemoteImageView) this.f67304u.mo52036a(this, f67281i[9]);
    }

    /* renamed from: z */
    private final TextView m61906z() {
        return (TextView) this.f67305v.mo52036a(this, f67281i[10]);
    }

    /* renamed from: a */
    public final int mo48238a() {
        return R.layout.awq;
    }

    /* renamed from: k */
    public final TextView mo52038k() {
        return (TextView) this.f67286D.mo52036a(this, f67281i[18]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c5, code lost:
        if (r6 != null) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b1, code lost:
        if (r6 != null) goto L_0x02b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06ec  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x070c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            super.onChanged(r27)
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r1 = r1.f62242a
            int r2 = r1.hashCode()
            r3 = 2016314694(0x782e8546, float:1.4158793E34)
            if (r2 == r3) goto L_0x0017
            goto L_0x0b80
        L_0x0017:
            java.lang.String r2 = "comment_aweme_and_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0b80
            boolean r1 = r26.mo52030e()
            if (r1 == 0) goto L_0x0b80
            boolean r1 = r26.mo52031f()
            if (r1 == 0) goto L_0x0b80
            boolean r1 = r26.mo52030e()
            if (r1 == 0) goto L_0x0b80
            r1 = 1
            android.view.View[] r2 = new android.view.View[r1]
            android.view.View r3 = r26.m61885G()
            r4 = 0
            r2[r4] = r3
            m61853a(r2)
            r2 = 13
            android.view.View[] r2 = new android.view.View[r2]
            android.view.View r3 = r26.m61882D()
            r2[r4] = r3
            android.widget.TextView r3 = r26.mo52038k()
            android.view.View r3 = (android.view.View) r3
            r2[r1] = r3
            android.view.View r3 = r26.m61886H()
            r5 = 2
            r2[r5] = r3
            android.widget.TextView r3 = r26.m61887I()
            android.view.View r3 = (android.view.View) r3
            r6 = 3
            r2[r6] = r3
            android.view.View r3 = r26.m61888J()
            r7 = 4
            r2[r7] = r3
            com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget$a r3 = r0.f67291I
            r8 = r0
            com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget r8 = (com.p683ss.android.ugc.aweme.comment.widgets.BaseCommentWidget) r8
            d.k.h[] r9 = f67281i
            r10 = 23
            r9 = r9[r10]
            android.view.View r3 = r3.mo52036a(r8, r9)
            r9 = 5
            r2[r9] = r3
            com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget$a r3 = r0.f67292J
            d.k.h[] r10 = f67281i
            r11 = 24
            r10 = r10[r11]
            android.view.View r3 = r3.mo52036a(r8, r10)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.View r3 = (android.view.View) r3
            r8 = 6
            r2[r8] = r3
            r3 = 7
            android.widget.TextView r10 = r26.m61889K()
            android.view.View r10 = (android.view.View) r10
            r2[r3] = r10
            r3 = 8
            android.view.View r10 = r26.m61896p()
            r2[r3] = r10
            r3 = 9
            android.view.View r10 = r26.m61900t()
            r2[r3] = r10
            r3 = 10
            android.view.View r10 = r26.m61904x()
            r2[r3] = r10
            r3 = 11
            android.widget.TextView r10 = r26.m61879A()
            android.view.View r10 = (android.view.View) r10
            r2[r3] = r10
            r3 = 12
            android.view.View r10 = r26.m61880B()
            r2[r3] = r10
            m61854b(r2)
            boolean r2 = r26.mo52030e()
            r3 = 0
            if (r2 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.link.C25973h.m62968a(r2, r1, r4, r7, r3)
            if (r2 == 0) goto L_0x00d8
            com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64144c()
            r2 = 1
            goto L_0x00d9
        L_0x00d8:
            r2 = 0
        L_0x00d9:
            r10 = 2131955407(0x7f130ecf, float:1.954734E38)
            r11 = 2131821859(0x7f110523, float:1.9276473E38)
            r12 = 2131821816(0x7f1104f8, float:1.9276386E38)
            r13 = 2131821819(0x7f1104fb, float:1.9276392E38)
            if (r2 == 0) goto L_0x01a1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r2 = r2.getStarAtlasInfo()
            if (r2 == 0) goto L_0x0b43
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r2 = r2.getStarAtlasLink()
            if (r2 != 0) goto L_0x00f9
            goto L_0x0b43
        L_0x00f9:
            android.view.View[] r3 = new android.view.View[r1]
            android.view.View r5 = r26.m61896p()
            r3[r4] = r5
            m61853a(r3)
            android.widget.TextView r3 = r26.m61898r()
            java.lang.String r5 = r2.getTitle()
            if (r5 == 0) goto L_0x0111
        L_0x010e:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x0114
        L_0x0111:
            java.lang.String r5 = ""
            goto L_0x010e
        L_0x0114:
            r3.setText(r5)
            android.widget.TextView r3 = r26.m61899s()
            java.lang.String r5 = r2.getSubTitle()
            if (r5 == 0) goto L_0x0124
        L_0x0121:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x0127
        L_0x0124:
            java.lang.String r5 = ""
            goto L_0x0121
        L_0x0127:
            r3.setText(r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61897q()
            com.facebook.drawee.h.b r3 = r3.getHierarchy()
            com.facebook.drawee.f.a r3 = (com.facebook.drawee.p940f.C13833a) r3
            r3.mo25907c(r11)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAvatarIcon()
            if (r3 == 0) goto L_0x0151
            java.util.List r5 = r3.getUrlList()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 != 0) goto L_0x0151
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r26.m61897q()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r3)
            goto L_0x0158
        L_0x0151:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61897q()
            r3.setImageResource(r10)
        L_0x0158:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r26.mo52029d()
            java.lang.String r5 = "show"
            java.lang.String r6 = r26.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.log.C26087k.m63253a(r2, r3, r5, r1, r6)
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r2 = r2.isBlackMode()
            if (r2 == 0) goto L_0x0b43
            android.content.Context r2 = r0.f62235b
            if (r2 == 0) goto L_0x0b43
            android.widget.TextView r2 = r26.m61898r()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x017e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x017e:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r12)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.m61899s()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0194
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0194:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r13)
            r2.setTextColor(r3)
            goto L_0x0b43
        L_0x01a1:
            boolean r2 = r26.mo52030e()
            if (r2 == 0) goto L_0x01b6
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.link.C25973h.m62973b(r2, r1, r4, r7, r3)
            if (r2 == 0) goto L_0x01b6
            com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64144c()
            r2 = 1
            goto L_0x01b7
        L_0x01b6:
            r2 = 0
        L_0x01b7:
            if (r2 == 0) goto L_0x0273
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r2 = r2.getAwemeNationalTask()
            if (r2 == 0) goto L_0x0b43
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r2 = r2.getNationalTaskLink()
            if (r2 != 0) goto L_0x01cb
            goto L_0x0b43
        L_0x01cb:
            android.view.View[] r3 = new android.view.View[r1]
            android.view.View r5 = r26.m61900t()
            r3[r4] = r5
            m61853a(r3)
            android.widget.TextView r3 = r26.m61902v()
            java.lang.String r5 = r2.getTitle()
            if (r5 == 0) goto L_0x01e3
        L_0x01e0:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x01e6
        L_0x01e3:
            java.lang.String r5 = ""
            goto L_0x01e0
        L_0x01e6:
            r3.setText(r5)
            android.widget.TextView r3 = r26.m61903w()
            java.lang.String r5 = r2.getSubTitle()
            if (r5 == 0) goto L_0x01f6
        L_0x01f3:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x01f9
        L_0x01f6:
            java.lang.String r5 = ""
            goto L_0x01f3
        L_0x01f9:
            r3.setText(r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61901u()
            com.facebook.drawee.h.b r3 = r3.getHierarchy()
            com.facebook.drawee.f.a r3 = (com.facebook.drawee.p940f.C13833a) r3
            r3.mo25907c(r11)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAvatarIcon()
            if (r3 == 0) goto L_0x0223
            java.util.List r5 = r3.getUrlList()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 != 0) goto L_0x0223
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r26.m61901u()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r3)
            goto L_0x022a
        L_0x0223:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61901u()
            r3.setImageResource(r10)
        L_0x022a:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r26.mo52029d()
            java.lang.String r5 = "show"
            java.lang.String r6 = r26.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.log.C26087k.m63252a(r2, r3, r5, r1, r6)
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r2 = r2.isBlackMode()
            if (r2 == 0) goto L_0x0b43
            android.content.Context r2 = r0.f62235b
            if (r2 == 0) goto L_0x0b43
            android.widget.TextView r2 = r26.m61902v()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0250
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0250:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r12)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.m61903w()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0266
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0266:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r13)
            r2.setTextColor(r3)
            goto L_0x0b43
        L_0x0273:
            boolean r2 = r26.m61892l()
            if (r2 == 0) goto L_0x0398
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64071n(r2)
            if (r2 == 0) goto L_0x0290
            android.view.View[] r2 = new android.view.View[r1]
            android.view.View r3 = r26.m61904x()
            r2[r4] = r3
            m61854b(r2)
            goto L_0x0b43
        L_0x0290:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.commercialize.model.s r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm.m63902a(r2)
            if (r2 != 0) goto L_0x029c
            goto L_0x0b43
        L_0x029c:
            android.view.View[] r3 = new android.view.View[r1]
            android.view.View r6 = r26.m61904x()
            r3[r4] = r6
            m61853a(r3)
            android.widget.TextView r3 = r26.m61906z()
            com.ss.android.ugc.aweme.commercialize.model.s$a r6 = r2.commentArea
            if (r6 == 0) goto L_0x02b4
            java.lang.String r6 = r6.title
            if (r6 == 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            java.lang.String r6 = ""
        L_0x02b6:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r3.setText(r6)
            android.widget.TextView r3 = r26.m61881C()
            com.ss.android.ugc.aweme.commercialize.model.s$a r6 = r2.commentArea
            if (r6 == 0) goto L_0x02c8
            java.lang.String r6 = r6.featureLabel
            if (r6 == 0) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            java.lang.String r6 = ""
        L_0x02ca:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r3.setText(r6)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61905y()
            com.facebook.drawee.h.b r3 = r3.getHierarchy()
            com.facebook.drawee.f.a r3 = (com.facebook.drawee.p940f.C13833a) r3
            r3.mo25907c(r11)
            java.lang.String r3 = r2.label
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x02eb
            int r3 = r3.length()
            if (r3 != 0) goto L_0x02e9
            goto L_0x02eb
        L_0x02e9:
            r3 = 0
            goto L_0x02ec
        L_0x02eb:
            r3 = 1
        L_0x02ec:
            if (r3 == 0) goto L_0x0302
            android.view.View[] r3 = new android.view.View[r5]
            android.widget.TextView r5 = r26.m61879A()
            android.view.View r5 = (android.view.View) r5
            r3[r4] = r5
            android.view.View r5 = r26.m61880B()
            r3[r1] = r5
            m61854b(r3)
            goto L_0x0320
        L_0x0302:
            android.widget.TextView r3 = r26.m61879A()
            java.lang.String r6 = r2.label
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r3.setText(r6)
            android.view.View[] r3 = new android.view.View[r5]
            android.widget.TextView r5 = r26.m61879A()
            android.view.View r5 = (android.view.View) r5
            r3[r4] = r5
            android.view.View r5 = r26.m61880B()
            r3[r1] = r5
            m61853a(r3)
        L_0x0320:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61905y()
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r2.getCommentAvatarIcon()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r3, r5)
            android.content.Context r3 = r0.f62235b
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r5 = new com.ss.android.ugc.aweme.commercialize.link.a.a$a
            r5.<init>()
            java.lang.String r6 = "comment_show"
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r5 = r5.mo53296a(r6)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r5 = r5.mo53294a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r26.mo52029d()
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r5 = r5.mo53295a(r6)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r5 = r5.mo53297a(r1)
            com.ss.android.ugc.aweme.commercialize.link.a.a r5 = r5.mo53298a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63274a(r3, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r26.mo52029d()
            java.lang.String r5 = "show"
            java.lang.String r6 = r26.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.log.C26087k.m63251a(r2, r3, r5, r1, r6)
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r2 = r2.isBlackMode()
            if (r2 == 0) goto L_0x0b43
            android.content.Context r2 = r0.f62235b
            if (r2 == 0) goto L_0x0b43
            android.widget.TextView r2 = r26.m61906z()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0375
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0375:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r12)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.m61881C()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x038b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x038b:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r13)
            r2.setTextColor(r3)
            goto L_0x0b43
        L_0x0398:
            java.lang.String r2 = "poi"
            boolean r2 = r0.m61891a(r2)
            if (r2 == 0) goto L_0x0723
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r2.getPoiStruct()
            if (r2 != 0) goto L_0x03ac
            goto L_0x0b43
        L_0x03ac:
            android.view.View[] r8 = new android.view.View[r8]
            android.view.View r10 = r26.m61882D()
            r8[r4] = r10
            android.widget.TextView r10 = r26.mo52038k()
            android.view.View r10 = (android.view.View) r10
            r8[r1] = r10
            android.view.View r10 = r26.m61886H()
            r8[r5] = r10
            android.widget.TextView r10 = r26.m61887I()
            android.view.View r10 = (android.view.View) r10
            r8[r6] = r10
            android.view.View r10 = r26.m61888J()
            r8[r7] = r10
            android.widget.TextView r10 = r26.m61889K()
            android.view.View r10 = (android.view.View) r10
            r8[r9] = r10
            m61853a(r8)
            com.ss.android.ugc.aweme.poi.service.IPoiService r8 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r8 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r8
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r10 = r26.m61883E()
            r8.setupLocationIcon(r10, r2)
            android.widget.TextView r8 = r26.m61884F()
            java.lang.String r10 = r2.poiName
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r8.setText(r10)
            android.content.Context r8 = r0.f62235b
            com.ss.android.ugc.aweme.location.l r8 = com.p683ss.android.ugc.aweme.location.C36272l.m81897a(r8)
            com.ss.android.ugc.aweme.poi.d r8 = r8.mo75072a()
            if (r8 == 0) goto L_0x04c2
            java.lang.String r10 = r8.city
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x040e
            int r10 = r10.length()
            if (r10 != 0) goto L_0x040c
            goto L_0x040e
        L_0x040c:
            r10 = 0
            goto L_0x040f
        L_0x040e:
            r10 = 1
        L_0x040f:
            if (r10 != 0) goto L_0x04c2
            boolean r10 = m61890a(r2)
            if (r10 != 0) goto L_0x04c2
            java.lang.String r10 = r8.city
            java.lang.String r11 = "locationWrapper.city"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            com.ss.android.ugc.aweme.poi.model.b r11 = r2.address
            java.lang.String r14 = "poiStruct.address"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r14)
            java.lang.String r11 = r11.getCity()
            java.lang.String r14 = "poiStruct.address.city"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r14)
            boolean r14 = com.p683ss.android.ugc.aweme.location.C36272l.m81898e()
            if (r14 == 0) goto L_0x0493
            r14 = r10
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r14 = r14.length()
            if (r14 != 0) goto L_0x043f
            r14 = 1
            goto L_0x0440
        L_0x043f:
            r14 = 0
        L_0x0440:
            if (r14 != 0) goto L_0x0493
            r14 = r11
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r14 = r14.length()
            if (r14 != 0) goto L_0x044d
            r14 = 1
            goto L_0x044e
        L_0x044d:
            r14 = 0
        L_0x044e:
            if (r14 == 0) goto L_0x0451
            goto L_0x0493
        L_0x0451:
            if (r10 == 0) goto L_0x048b
            java.lang.String r10 = r10.toLowerCase()
            java.lang.String r14 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r14)
            if (r11 == 0) goto L_0x0483
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r14 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r14)
            int r14 = r10.length()
            int r15 = r11.length()
            if (r14 <= r15) goto L_0x047a
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r10, r11, r4, r5, r3)
            goto L_0x0494
        L_0x047a:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r11, r10, r4, r5, r3)
            goto L_0x0494
        L_0x0483:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x048b:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x0493:
            r3 = 0
        L_0x0494:
            if (r3 == 0) goto L_0x04c2
            java.lang.String r3 = r2.poiLatitude
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x04a5
            int r3 = r3.length()
            if (r3 != 0) goto L_0x04a3
            goto L_0x04a5
        L_0x04a3:
            r3 = 0
            goto L_0x04a6
        L_0x04a5:
            r3 = 1
        L_0x04a6:
            if (r3 != 0) goto L_0x04bd
            java.lang.String r3 = r2.poiLongitude
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x04b7
            int r3 = r3.length()
            if (r3 != 0) goto L_0x04b5
            goto L_0x04b7
        L_0x04b5:
            r3 = 0
            goto L_0x04b8
        L_0x04b7:
            r3 = 1
        L_0x04b8:
            if (r3 == 0) goto L_0x04bb
            goto L_0x04bd
        L_0x04bb:
            r3 = 0
            goto L_0x04be
        L_0x04bd:
            r3 = 1
        L_0x04be:
            if (r3 != 0) goto L_0x04c2
            r3 = 1
            goto L_0x04c3
        L_0x04c2:
            r3 = 0
        L_0x04c3:
            if (r3 == 0) goto L_0x0521
            java.lang.String r3 = r2.poiLatitude
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.String r10 = r2.poiLongitude
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            if (r8 != 0) goto L_0x04d6
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x04d6:
            double r14 = r8.latitude
            double r12 = r8.longitude
            boolean r11 = r8.isGaode
            if (r11 != 0) goto L_0x04ec
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r11
            double[] r11 = r11.wgs84togcj02(r12, r14)
            r12 = r11[r4]
            r14 = r11[r1]
        L_0x04ec:
            r24 = r12
            r22 = r14
            android.widget.TextView r11 = r26.mo52038k()
            com.ss.android.ugc.aweme.poi.service.IPoiService r12 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            r16 = r12
            com.ss.android.ugc.aweme.poi.service.IPoiService r16 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r16
            android.content.Context r12 = r0.f62235b
            java.lang.String r13 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.String r13 = "poiLat"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r13)
            double r18 = r3.doubleValue()
            java.lang.String r3 = "poiLng"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r3)
            double r20 = r10.doubleValue()
            r17 = r12
            java.lang.String r3 = r16.getDistanceBetweenLocations(r17, r18, r20, r22, r24)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r11.setText(r3)
            goto L_0x054f
        L_0x0521:
            boolean r3 = m61890a(r2)
            if (r3 != 0) goto L_0x053c
            android.widget.TextView r3 = r26.mo52038k()
            com.ss.android.ugc.aweme.poi.model.b r10 = r2.address
            java.lang.String r11 = "poiStruct.address"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            java.lang.String r10 = r10.getCity()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r3.setText(r10)
            goto L_0x054f
        L_0x053c:
            android.view.View[] r3 = new android.view.View[r5]
            android.widget.TextView r10 = r26.mo52038k()
            android.view.View r10 = (android.view.View) r10
            r3[r4] = r10
            android.view.View r10 = r26.m61886H()
            r3[r1] = r10
            m61854b(r3)
        L_0x054f:
            com.ss.android.ugc.aweme.poi.service.IPoiService r3 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r3 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r3
            android.content.Context r10 = r0.f62235b
            java.lang.String r11 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            java.lang.String r3 = r3.getDisplayCount(r10, r2)
            boolean r10 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r3)
            if (r10 == 0) goto L_0x0571
            android.widget.TextView r10 = r26.m61887I()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r10.setText(r3)
            r3 = 1
            goto L_0x0585
        L_0x0571:
            android.view.View[] r3 = new android.view.View[r5]
            android.widget.TextView r10 = r26.m61887I()
            android.view.View r10 = (android.view.View) r10
            r3[r4] = r10
            android.view.View r10 = r26.m61886H()
            r3[r1] = r10
            m61854b(r3)
            r3 = 0
        L_0x0585:
            d.f.b.v$e r10 = new d.f.b.v$e
            r10.<init>()
            java.lang.String r11 = "0"
            r10.element = r11
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r11 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r11
            boolean r8 = r11.needHideLabel(r8, r2)
            if (r8 != 0) goto L_0x0668
            com.ss.android.ugc.aweme.poi.service.IPoiService r8 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r8 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r8
            boolean r8 = r8.isPoiLabelCoupon(r2)
            if (r8 == 0) goto L_0x05aa
            java.lang.String r8 = "1"
            r10.element = r8
        L_0x05aa:
            android.widget.TextView r8 = r26.m61889K()
            java.lang.String r11 = r2.getPoiSubTitle()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r8.setText(r11)
            boolean r8 = m61890a(r2)
            if (r8 != 0) goto L_0x067b
            android.widget.TextView r8 = r26.mo52038k()
            java.lang.CharSequence r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            android.widget.TextView r11 = r26.m61887I()
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            android.widget.TextView r12 = r26.m61889K()
            java.lang.CharSequence r12 = r12.getText()
            java.lang.String r12 = r12.toString()
            android.widget.TextView r13 = r26.mo52038k()
            android.text.TextPaint r13 = r13.getPaint()
            float r8 = r13.measureText(r8)
            int r8 = (int) r8
            float r11 = r13.measureText(r11)
            int r11 = (int) r11
            r14 = 4624070917402656768(0x402c000000000000, double:14.0)
            int r16 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r14)
            int r11 = r11 + r16
            float r12 = r13.measureText(r12)
            int r12 = (int) r12
            int r13 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r14)
            int r12 = r12 + r13
            android.content.Context r13 = r0.f62235b
            int r13 = com.bytedance.common.utility.C9432q.m18670a(r13)
            r14 = 4638144666238189568(0x405e000000000000, double:120.0)
            int r14 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r14)
            int r13 = r13 - r14
            int r13 = r13 - r12
            int r13 = r13 - r8
            if (r13 >= r11) goto L_0x063f
            android.view.View[] r3 = new android.view.View[r5]
            android.widget.TextView r8 = r26.m61887I()
            android.view.View r8 = (android.view.View) r8
            r3[r4] = r8
            android.view.View r8 = r26.m61886H()
            r3[r1] = r8
            m61854b(r3)
            android.widget.TextView r3 = r26.mo52038k()
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x067b
            android.view.View[] r3 = new android.view.View[r1]
            android.view.View r8 = r26.m61888J()
            r3[r4] = r8
            m61854b(r3)
            goto L_0x067b
        L_0x063f:
            android.view.View[] r8 = new android.view.View[r1]
            android.view.View r11 = r26.m61886H()
            r8[r4] = r11
            m61853a(r8)
            if (r3 == 0) goto L_0x065a
            android.view.View[] r3 = new android.view.View[r1]
            android.widget.TextView r8 = r26.m61887I()
            android.view.View r8 = (android.view.View) r8
            r3[r4] = r8
            m61853a(r3)
            goto L_0x067b
        L_0x065a:
            android.view.View[] r3 = new android.view.View[r1]
            android.widget.TextView r8 = r26.m61887I()
            android.view.View r8 = (android.view.View) r8
            r3[r4] = r8
            m61854b(r3)
            goto L_0x067b
        L_0x0668:
            android.view.View[] r3 = new android.view.View[r5]
            android.view.View r8 = r26.m61888J()
            r3[r4] = r8
            android.widget.TextView r8 = r26.m61889K()
            android.view.View r8 = (android.view.View) r8
            r3[r1] = r8
            m61854b(r3)
        L_0x067b:
            com.ss.android.ugc.aweme.poi.service.IPoiService r3 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r3 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r3
            boolean r3 = r3.isPoiAreaFilterNotOnlineStyle()
            if (r3 == 0) goto L_0x06b4
            boolean r3 = r2.isAdminArea
            if (r3 == 0) goto L_0x06b4
            android.view.View[] r3 = new android.view.View[r9]
            android.widget.TextView r8 = r26.mo52038k()
            android.view.View r8 = (android.view.View) r8
            r3[r4] = r8
            android.view.View r8 = r26.m61886H()
            r3[r1] = r8
            android.widget.TextView r8 = r26.m61887I()
            android.view.View r8 = (android.view.View) r8
            r3[r5] = r8
            android.view.View r5 = r26.m61888J()
            r3[r6] = r5
            android.widget.TextView r5 = r26.m61889K()
            android.view.View r5 = (android.view.View) r5
            r3[r7] = r5
            m61854b(r3)
        L_0x06b4:
            com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$d r3 = new com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$d
            r3.<init>(r0, r2, r10)
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            r0.f67293K = r3
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r2 = r2.isBlackMode()
            if (r2 == 0) goto L_0x0b43
            android.content.Context r2 = r0.f62235b
            if (r2 == 0) goto L_0x0b43
            android.widget.TextView r2 = r26.m61884F()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x06d6
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x06d6:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131821816(0x7f1104f8, float:1.9276386E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.mo52038k()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x06ef
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x06ef:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131821819(0x7f1104fb, float:1.9276392E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.view.View r2 = r26.m61886H()
            r2.setBackgroundResource(r5)
            android.widget.TextView r2 = r26.m61887I()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x070f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x070f:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.view.View r2 = r26.m61888J()
            r2.setBackgroundResource(r5)
            goto L_0x0b43
        L_0x0723:
            java.lang.String r2 = "shopping_cart"
            boolean r2 = r0.m61891a(r2)
            if (r2 == 0) goto L_0x0a21
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.commerce.model.e r2 = r2.getPromotion()
            if (r2 != 0) goto L_0x0737
            goto L_0x0b43
        L_0x0737:
            java.lang.String r3 = "aweme.promotion ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.ab.CommentAB> r9 = com.p683ss.android.ugc.aweme.commerce.service.p1535ab.CommentAB.class
            r10 = 1
            java.lang.String r11 = "goods_comment_title_style"
            r12 = 31744(0x7c00, float:4.4483E-41)
            r13 = 0
            int r3 = r8.mo18168a(r9, r10, r11, r12, r13)
            if (r3 != 0) goto L_0x088a
            android.view.View[] r3 = new android.view.View[r7]
            android.widget.TextView r7 = r26.mo52038k()
            android.view.View r7 = (android.view.View) r7
            r3[r4] = r7
            android.view.View r7 = r26.m61886H()
            r3[r1] = r7
            android.widget.TextView r7 = r26.m61887I()
            android.view.View r7 = (android.view.View) r7
            r3[r5] = r7
            android.view.View r7 = r26.m61882D()
            r3[r6] = r7
            m61853a(r3)
            android.widget.TextView r3 = r26.mo52038k()
            android.content.Context r6 = r0.f62235b
            r7 = 2132546555(0x7f1c13fb, float:2.0746331E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "mContext.getString(R.string.money_format)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            int r8 = r2.getPrice()
            float r8 = (float) r8
            r9 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r9
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7[r4] = r8
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.lang.String r6 = com.C2240a.m6772a(r6, r7)
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r7 = "[.]"
            java.lang.String[] r7 = r6.split(r7)
            int r8 = r7.length
            if (r8 < r5) goto L_0x07d6
            r8 = r7[r1]
            java.lang.String r9 = "00"
            boolean r9 = android.text.TextUtils.equals(r8, r9)
            if (r9 == 0) goto L_0x07b4
            r6 = r7[r4]
            goto L_0x07d6
        L_0x07b4:
            java.lang.String r9 = "0"
            boolean r9 = r8.endsWith(r9)
            if (r9 == 0) goto L_0x07d6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r7[r4]
            r6.append(r7)
            java.lang.String r7 = "."
            r6.append(r7)
            char r7 = r8.charAt(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x07d6:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r3.setText(r6)
            android.widget.TextView r3 = r26.m61887I()
            android.content.Context r6 = r0.f62235b
            r7 = 2132546570(0x7f1c140a, float:2.0746362E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "mContext.getString(R.string.mouth_sold_num)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            int r8 = r2.getSales()
            long r8 = (long) r8
            r10 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0871
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r11 = "Locale.getDefault()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            java.lang.String r11 = "%.1f"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = (double) r8
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r13
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 / r13
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r12[r4] = r8
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r12, r1)
            java.lang.String r8 = com.C2240a.m6773a(r10, r11, r8)
            java.lang.String r9 = "java.lang.String.format(locale, format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r9 = 48
            int r10 = r8.length()
            int r10 = r10 - r1
            char r10 = r8.charAt(r10)
            if (r9 != r10) goto L_0x085f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r8.length()
            int r10 = r10 - r5
            if (r8 == 0) goto L_0x0857
            java.lang.String r5 = r8.substring(r4, r10)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)
            r9.append(r5)
            java.lang.String r5 = "k"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            goto L_0x0875
        L_0x0857:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x085f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r8 = "k"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            goto L_0x0875
        L_0x0871:
            java.lang.String r5 = java.lang.String.valueOf(r8)
        L_0x0875:
            r7[r4] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r1)
            java.lang.String r5 = com.C2240a.m6772a(r6, r5)
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setText(r5)
            goto L_0x08aa
        L_0x088a:
            android.view.View[] r3 = new android.view.View[r5]
            android.widget.TextView r5 = r26.mo52038k()
            android.view.View r5 = (android.view.View) r5
            r3[r4] = r5
            android.view.View r5 = r26.m61882D()
            r3[r1] = r5
            m61853a(r3)
            android.widget.TextView r3 = r26.mo52038k()
            java.lang.String r5 = r2.getCommentArea()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setText(r5)
        L_0x08aa:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61883E()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "res"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "2131953603"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            r3.setImageURI(r5)
            android.widget.TextView r3 = r26.m61884F()
            java.lang.String r5 = r2.getShortTitle()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setText(r5)
            com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$c r3 = new com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$c
            r3.<init>(r0, r2)
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            r0.f67293K = r3
            android.widget.TextView r3 = r26.mo52038k()
            android.content.Context r3 = r3.getContext()
            java.lang.String r5 = "mCommercePrice.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            com.ss.android.ugc.aweme.feed.param.b r3 = com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a.m71942a(r3)
            java.lang.String r3 = r3.getFromGroupId()
            android.widget.TextView r5 = r26.mo52038k()
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "mCommercePrice.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.feed.param.b r5 = com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a.m71942a(r5)
            java.lang.String r5 = r5.getReferCommodityId()
            java.lang.Integer r6 = r26.mo52034i()
            java.lang.Long r6 = com.p683ss.android.ugc.aweme.commerce.shoptag.C25573a.m62093a(r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r26.mo52029d()
            java.lang.Integer r8 = r26.mo52034i()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.commerce.shoptag.C25573a.m62094a(r7, r8)
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r8 = com.p683ss.android.ugc.aweme.commerce.service.C25539a.m62079a()
            java.lang.String r9 = "product_entrance_show"
            com.ss.android.ugc.aweme.commerce.service.models.e r10 = new com.ss.android.ugc.aweme.commerce.service.models.e
            r10.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r26.mo52029d()
            java.lang.String r11 = r11.getAuthorUid()
            r10.f67571d = r11
            java.lang.String r11 = "comment_cart_tag"
            r10.f67576i = r11
            java.lang.String r11 = r2.getPromotionId()
            r10.f67573f = r11
            int r11 = r2.getPromotionSource()
            long r11 = (long) r11
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.f67574g = r11
            r10.f67572e = r3
            r10.f67579l = r5
            java.lang.String r3 = r26.mo52033h()
            r10.f67569b = r3
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r26.mo52029d()
            java.lang.String r3 = r3.getAid()
            r10.f67570c = r3
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r26.mo52029d()
            int r3 = r3.getFollowStatus()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.f67578k = r3
            r10.f67588u = r6
            r10.f67589v = r7
            r8.logCommerceEvents(r9, r10)
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r3 = com.p683ss.android.ugc.aweme.commerce.service.C25539a.m62079a()
            java.lang.String r5 = "show_product"
            com.ss.android.ugc.aweme.commerce.service.models.e r6 = new com.ss.android.ugc.aweme.commerce.service.models.e
            r6.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r26.mo52029d()
            java.lang.String r7 = r7.getAuthorUid()
            r6.f67571d = r7
            java.lang.String r7 = "comment_cart_tag"
            r6.f67576i = r7
            java.lang.String r7 = r2.getPromotionId()
            r6.f67573f = r7
            int r2 = r2.getPromotionSource()
            long r7 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r6.f67574g = r2
            java.lang.String r2 = r26.mo52033h()
            r6.f67569b = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            java.lang.String r2 = r2.getAid()
            r6.f67570c = r2
            java.lang.String r2 = "click_comment"
            r6.f67577j = r2
            java.lang.String r2 = r26.mo52033h()
            r6.f67575h = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            int r2 = r2.getFollowStatus()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f67578k = r2
            r3.logCommerceEvents(r5, r6)
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r2 = r2.isBlackMode()
            if (r2 == 0) goto L_0x0b43
            android.content.Context r2 = r0.f62235b
            if (r2 == 0) goto L_0x0b43
            android.widget.TextView r2 = r26.m61884F()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x09db
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x09db:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131821816(0x7f1104f8, float:1.9276386E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.mo52038k()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x09f4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x09f4:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131821819(0x7f1104fb, float:1.9276392E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.view.View r2 = r26.m61886H()
            r2.setBackgroundResource(r5)
            android.widget.TextView r2 = r26.m61887I()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0a14
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0a14:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            goto L_0x0b43
        L_0x0a21:
            boolean r2 = r26.mo52030e()
            if (r2 == 0) goto L_0x0a3d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.link.C25973h.m62979d(r2, r1, r4, r7, r3)
            if (r2 == 0) goto L_0x0a3d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            boolean r2 = com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20850b.m53158a(r2)
            if (r2 == 0) goto L_0x0a3d
            r2 = 1
            goto L_0x0a3e
        L_0x0a3d:
            r2 = 0
        L_0x0a3e:
            if (r2 == 0) goto L_0x0b43
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct r2 = r2.getXiGuaTask()
            if (r2 != 0) goto L_0x0a4c
            goto L_0x0b43
        L_0x0a4c:
            android.view.View[] r3 = new android.view.View[r6]
            android.view.View r6 = r26.m61882D()
            r3[r4] = r6
            android.widget.TextView r6 = r26.mo52038k()
            android.view.View r6 = (android.view.View) r6
            r3[r1] = r6
            android.widget.TextView r6 = r26.m61887I()
            android.view.View r6 = (android.view.View) r6
            r3[r5] = r6
            m61853a(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r26.m61883E()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "res"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "2131953576"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            r3.setImageURI(r5)
            android.widget.TextView r3 = r26.m61884F()
            r5 = 2132552040(0x7f1c2968, float:2.0757456E38)
            r3.setText(r5)
            android.widget.TextView r3 = r26.mo52038k()
            java.lang.String r5 = r2.getTitle()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.setText(r5)
            android.widget.TextView r3 = r26.m61887I()
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r26.mo52029d()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56855b(r2)
            com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$e r3 = new com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$e
            r3.<init>(r0, r2)
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            r0.f67293K = r3
            java.lang.String r3 = "show_mission_icon"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "enter_from"
            java.lang.String r7 = r26.mo52032g()
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r26.mo52029d()
            java.lang.String r7 = r7.getAid()
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "author_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r5.mo47829a(r6, r2)
            java.lang.String r5 = "entrance_location"
            java.lang.String r6 = "comment_page"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r5, r6)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r2)
            com.ss.android.ugc.aweme.comment.services.CommentService r2 = com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a.m61493a()
            boolean r2 = r2.isBlackMode()
            if (r2 == 0) goto L_0x0b43
            android.content.Context r2 = r0.f62235b
            if (r2 == 0) goto L_0x0b43
            android.widget.TextView r2 = r26.m61884F()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0b06
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0b06:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131821816(0x7f1104f8, float:1.9276386E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.mo52038k()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0b1f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0b1f:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131821819(0x7f1104fb, float:1.9276392E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r26.m61887I()
            android.content.Context r3 = r0.f62235b
            if (r3 != 0) goto L_0x0b38
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0b38:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
        L_0x0b43:
            android.widget.TextView r2 = r26.mo52038k()
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0b80
            android.view.View r2 = r26.m61886H()
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0b80
            android.widget.TextView r2 = r26.m61887I()
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0b80
            android.view.View r2 = r26.m61888J()
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0b80
            android.widget.TextView r2 = r26.m61889K()
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0b80
            android.view.View[] r1 = new android.view.View[r1]
            android.view.View r2 = r26.m61885G()
            r1[r4] = r2
            m61854b(r1)
        L_0x0b80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* renamed from: m */
    private final boolean m61893m() {
        if (!mo52030e() || !C25973h.m62976c(mo52029d(), true, 0, 4, null) || mo52029d().getMicroAppInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final boolean m61894n() {
        if (!mo52030e() || !C25973h.m62979d(mo52029d(), true, 0, 4, null) || mo52029d().getPoiStruct() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m61895o() {
        if (!mo52030e() || !C25973h.m62975c(mo52029d(), true, 0) || mo52029d().getPromotion() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo52035j() {
        OnClickListener onClickListener = this;
        m61896p().setOnClickListener(onClickListener);
        m61900t().setOnClickListener(onClickListener);
        m61904x().setOnClickListener(onClickListener);
        m61882D().setOnClickListener(onClickListener);
    }

    /* renamed from: l */
    private final boolean m61892l() {
        boolean z;
        if (mo52030e()) {
            Aweme d = mo52029d();
            if (C25973h.m62970a("company_link", d, true, 0) || C25973h.m62970a("link", d, true, 0)) {
                z = true;
            } else {
                z = false;
            }
            if (z && C26428bm.m63902a(mo52029d()) != null) {
                C26512f.m64144c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m61890a(PoiStruct poiStruct) {
        boolean z;
        if (poiStruct.address != null) {
            C39118b bVar = poiStruct.address;
            C52711k.m112236a((Object) bVar, "address");
            CharSequence city = bVar.getCity();
            if (city == null || city.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m61891a(String str) {
        int a = C10181b.m20511a().mo18168a(HideCommentHeaderWidgetExperiment.class, true, "hide_comment_header_widget", 31744, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1648893033) {
            if (hashCode != -309942941) {
                if (hashCode == 111178 && str.equals("poi") && m61894n() && a != 2) {
                    return true;
                }
                return false;
            } else if (!str.equals("iron_man") || !m61893m() || a == 1) {
                return false;
            } else {
                return true;
            }
        } else if (!str.equals("shopping_cart") || !m61895o() || a == 3) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public CommentHeaderWidget(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "hide");
        this.f67294j = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.feed.model.NationalTaskLink] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.feed.model.NationalTaskLink] */
    /* JADX WARNING: type inference failed for: r0v19, types: [com.ss.android.ugc.aweme.feed.model.StarAtlasLink] */
    /* JADX WARNING: type inference failed for: r0v20, types: [com.ss.android.ugc.aweme.feed.model.StarAtlasLink] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.StarAtlasLink, com.ss.android.ugc.aweme.feed.model.NationalTaskLink]
      uses: [com.ss.android.ugc.aweme.feed.model.NationalTaskLink, com.ss.android.ugc.aweme.feed.model.StarAtlasLink]
      mth insns count: 103
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
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
            boolean r0 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r6)
            if (r0 == 0) goto L_0x000a
            return
        L_0x000a:
            r0 = 0
            if (r6 == 0) goto L_0x0016
            int r1 = r6.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            r2 = 1
            if (r1 != 0) goto L_0x001b
            goto L_0x006e
        L_0x001b:
            int r3 = r1.intValue()
            r4 = 2132022964(0x7f1416b4, float:1.9684362E38)
            if (r3 != r4) goto L_0x006e
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r6 = r6.getStarAtlasInfo()
            if (r6 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r6 = r6.getStarAtlasLink()
            goto L_0x0034
        L_0x0033:
            r6 = r0
        L_0x0034:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            java.lang.String r3 = "click"
            java.lang.String r4 = r5.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.log.C26087k.m63253a(r6, r1, r3, r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo52029d()
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64066i(r6)
            if (r6 == 0) goto L_0x0056
            android.content.Context r6 = r5.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            java.lang.String r3 = "common_link"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63354f(r6, r1, r3)
        L_0x0056:
            android.content.Context r6 = r5.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r1 = r1.getStarAtlasInfo()
            if (r1 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r0 = r1.getStarAtlasLink()
        L_0x0066:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64205a(r6, r0, r1, r2)
            return
        L_0x006e:
            if (r1 != 0) goto L_0x0071
            goto L_0x00af
        L_0x0071:
            int r3 = r1.intValue()
            r4 = 2132023260(0x7f1417dc, float:1.9684963E38)
            if (r3 != r4) goto L_0x00af
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r6 = r6.getAwemeNationalTask()
            if (r6 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r6 = r6.getNationalTaskLink()
            goto L_0x008a
        L_0x0089:
            r6 = r0
        L_0x008a:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            java.lang.String r3 = "click"
            java.lang.String r4 = r5.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.log.C26087k.m63252a(r6, r1, r3, r2, r4)
            android.content.Context r6 = r5.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r1 = r1.getAwemeNationalTask()
            if (r1 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r0 = r1.getNationalTaskLink()
        L_0x00a7:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64204a(r6, r0, r1, r2)
            return
        L_0x00af:
            if (r1 != 0) goto L_0x00b3
            goto L_0x012d
        L_0x00b3:
            int r0 = r1.intValue()
            r3 = 2132020624(0x7f140d90, float:1.9679616E38)
            if (r0 != r3) goto L_0x012d
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo52029d()
            com.ss.android.ugc.aweme.commercialize.model.s r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm.m63902a(r6)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = new com.ss.android.ugc.aweme.commercialize.link.a.a$a
            r0.<init>()
            java.lang.String r1 = "click"
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo53296a(r1)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo53294a(r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo53295a(r1)
            com.ss.android.ugc.aweme.commercialize.link.a.a$a r0 = r0.mo53297a(r2)
            com.ss.android.ugc.aweme.commercialize.link.a.a r0 = r0.mo53298a()
            android.content.Context r1 = r5.f62235b
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63274a(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo52029d()
            java.lang.String r1 = "click"
            java.lang.String r3 = r5.mo52032g()
            com.p683ss.android.ugc.aweme.commercialize.log.C26087k.m63251a(r6, r0, r1, r2, r3)
            android.content.Context r0 = r5.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64202a(r0, r6, r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo52029d()
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64064g(r0)
            if (r0 == 0) goto L_0x0111
            android.content.Context r0 = r5.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mo52029d()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63275a(r0, r6, r1, r2)
        L_0x0111:
            boolean r6 = r5.m61892l()
            if (r6 == 0) goto L_0x013e
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.mo52029d()
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64066i(r6)
            if (r6 == 0) goto L_0x013e
            android.content.Context r6 = r5.f62235b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mo52029d()
            java.lang.String r1 = "common_link"
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63354f(r6, r0, r1)
            return
        L_0x012d:
            if (r1 != 0) goto L_0x0130
            return
        L_0x0130:
            int r0 = r1.intValue()
            r1 = 2132018208(0x7f140420, float:1.9674716E38)
            if (r0 != r1) goto L_0x013e
            d.f.a.b<? super android.view.View, d.x> r0 = r5.f67293K
            r0.invoke(r6)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget.onClick(android.view.View):void");
    }
}
