package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26051ar;
import com.p683ss.android.ugc.aweme.commercialize.log.C26059ax;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.DescTextView;
import com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a;
import com.p683ss.android.ugc.aweme.commercialize.search.C26204a;
import com.p683ss.android.ugc.aweme.commercialize.search.C26212h;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26369ac;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26345b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26348d;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26505b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26506c.C26507a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26508d;
import com.p683ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30308a;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37933c;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.util.C47615c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d */
public class C37954d extends C31805p {

    /* renamed from: bb */
    public static final C37955a f96637bb = new C37955a(null);

    /* renamed from: aT */
    public boolean f96638aT;

    /* renamed from: aU */
    public LinearLayout f96639aU;

    /* renamed from: aV */
    public LinearLayout f96640aV;

    /* renamed from: aW */
    public AdRatingView f96641aW;

    /* renamed from: aX */
    public View f96642aX;

    /* renamed from: aY */
    public DmtTextView f96643aY;

    /* renamed from: aZ */
    public DmtTextView f96644aZ;

    /* renamed from: ba */
    public RelativeLayout f96645ba;

    /* renamed from: bc */
    private final C26508d f96646bc;

    /* renamed from: bd */
    private boolean f96647bd;

    /* renamed from: be */
    private String f96648be;

    /* renamed from: bf */
    private boolean f96649bf;

    /* renamed from: bg */
    private boolean f96650bg;

    /* renamed from: bh */
    private boolean f96651bh;

    /* renamed from: bi */
    private boolean f96652bi;

    /* renamed from: bj */
    private int f96653bj;

    /* renamed from: bk */
    private int f96654bk;

    /* renamed from: bl */
    private int f96655bl;

    /* renamed from: bm */
    private DmtTextView f96656bm;

    /* renamed from: bn */
    private LinearLayout f96657bn;

    /* renamed from: bo */
    private DescTextView f96658bo;

    /* renamed from: bp */
    private RemoteImageView f96659bp;

    /* renamed from: bq */
    private DmtTextView f96660bq;

    /* renamed from: br */
    private C26051ar f96661br;

    /* renamed from: bs */
    private SearchAdBottomBar f96662bs;

    /* renamed from: bt */
    private SearchAdBottomBar f96663bt;

    /* renamed from: bu */
    private SearchAdBottomBar f96664bu;

    /* renamed from: bv */
    private final C37968n f96665bv;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$a */
    public static final class C37955a {
        private C37955a() {
        }

        public /* synthetic */ C37955a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$b */
    static final class C37956b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96666a;

        C37956b(C37954d dVar) {
            this.f96666a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f96666a.mo77431ah()) {
                C37954d dVar = this.f96666a;
                Aweme aweme = this.f96666a.f83048c;
                C52711k.m112236a((Object) aweme, "mAweme");
                dVar.mo77427a(aweme.getAwemeRawAd(), "bg_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$c */
    static final class C37957c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96667a;

        C37957c(C37954d dVar) {
            this.f96667a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f96667a.mo77431ah()) {
                C37954d dVar = this.f96667a;
                Aweme aweme = this.f96667a.f83048c;
                C52711k.m112236a((Object) aweme, "mAweme");
                dVar.mo77427a(aweme.getAwemeRawAd(), "bg_hot_region");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$d */
    static final class C37958d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96668a;

        C37958d(C37954d dVar) {
            this.f96668a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f96668a.mo77431ah()) {
                C37954d dVar = this.f96668a;
                Aweme aweme = this.f96668a.f83048c;
                C52711k.m112236a((Object) aweme, "mAweme");
                dVar.mo77427a(aweme.getAwemeRawAd(), "bg_title");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$e */
    static final class C37959e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96669a;

        C37959e(C37954d dVar) {
            this.f96669a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f96669a.mo77431ah()) {
                C37954d dVar = this.f96669a;
                Aweme aweme = this.f96669a.f83048c;
                C52711k.m112236a((Object) aweme, "mAweme");
                dVar.mo77427a(aweme.getAwemeRawAd(), "bg_photo");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$f */
    static final class C37960f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96670a;

        C37960f(C37954d dVar) {
            this.f96670a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f96670a.mo77431ah()) {
                Aweme aweme = this.f96670a.f83048c;
                C52711k.m112236a((Object) aweme, "mAweme");
                if (aweme.isAppAd()) {
                    this.f96670a.mo64843a(true, true);
                    return;
                }
                C37954d dVar = this.f96670a;
                Aweme aweme2 = this.f96670a.f83048c;
                C52711k.m112236a((Object) aweme2, "mAweme");
                dVar.mo77427a(aweme2.getAwemeRawAd(), "bg_more_button");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$g */
    static final class C37961g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96671a;

        C37961g(C37954d dVar) {
            this.f96671a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96671a.mo77430ag();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$h */
    static final class C37962h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37954d f96672a;

        C37962h(C37954d dVar) {
            this.f96672a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96672a.mo77430ag();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$i */
    static final class C37963i extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f96673a;

        C37963i(AwemeRawAd awemeRawAd) {
            this.f96673a = awemeRawAd;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            C26080b a = bVar.mo53579a(this.f96673a);
            C52711k.m112236a((Object) a, "adId(this@apply)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$j */
    static final class C37964j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37954d f96674a;

        /* renamed from: b */
        final /* synthetic */ boolean f96675b;

        /* renamed from: c */
        final /* synthetic */ boolean f96676c;

        C37964j(C37954d dVar, boolean z, boolean z2) {
            this.f96674a = dVar;
            this.f96675b = z;
            this.f96676c = z2;
        }

        public final void run() {
            LinearLayout linearLayout = this.f96674a.f96639aU;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (this.f96675b) {
                this.f96674a.mo64849d(this.f96674a.f83048c);
            }
            if (this.f96676c) {
                C26077e.m63190a().mo53590b(this.f96674a.f83048c).mo53582a("result_ad").mo53593b("play").mo53586a(this.f96674a.mo64749N());
            }
            this.f96674a.f96638aT = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$k */
    static final class C37965k extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f96677a;

        C37965k(AwemeRawAd awemeRawAd) {
            this.f96677a = awemeRawAd;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            C26080b a = bVar.mo53579a(this.f96677a);
            C52711k.m112236a((Object) a, "adId(rawAd)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$l */
    static final class C37966l extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f96678a;

        C37966l(AwemeRawAd awemeRawAd) {
            this.f96678a = awemeRawAd;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53591b(this.f96678a);
                C52711k.m112236a((Object) b, "fill(this@apply)");
                return b;
            }
            C26080b a = bVar.mo53579a(this.f96678a);
            C52711k.m112236a((Object) a, "adId(this@apply)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$m */
    static final class C37967m implements C26534a {

        /* renamed from: a */
        final /* synthetic */ C37954d f96679a;

        C37967m(C37954d dVar) {
            this.f96679a = dVar;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            String str;
            C26080b a = C26077e.m63190a().mo53590b(this.f96679a.f83048c).mo53582a("result_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a.mo53593b(str).mo53586a(this.f96679a.mo64749N());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$n */
    public static final class C37968n implements C26505b {

        /* renamed from: a */
        final /* synthetic */ C37954d f96680a;

        /* renamed from: a */
        public final long mo54191a() {
            C37937e eVar = this.f96680a.f83109aN;
            C52711k.m112236a((Object) eVar, "mPlayVideoHelper");
            return eVar.mo77407d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo77444a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5, com.p683ss.android.ugc.playerkit.videoview.C50158g r6) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.newfollow.vh.d r6 = r4.f96680a
                com.ss.android.ugc.aweme.newfollow.util.e r6 = r6.f83109aN
                java.lang.String r0 = "mPlayVideoHelper"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
                long r0 = r6.mo77406c()
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0014
                return r0
            L_0x0014:
                if (r5 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.feed.model.Video r6 = r5.getVideo()
                if (r6 == 0) goto L_0x0025
                int r6 = r6.getDuration()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L_0x0026
            L_0x0025:
                r6 = 0
            L_0x0026:
                if (r6 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.feed.model.Video r6 = r5.getVideo()
                java.lang.String r0 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
                int r6 = r6.getDuration()
                if (r6 <= 0) goto L_0x0046
                com.ss.android.ugc.aweme.feed.model.Video r5 = r5.getVideo()
                java.lang.String r6 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                int r5 = r5.getDuration()
                long r5 = (long) r5
                return r5
            L_0x0046:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37954d.C37968n.mo77444a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.videoview.g):long");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$o */
    static final class C37969o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37954d f96681a;

        C37969o(C37954d dVar) {
            this.f96681a = dVar;
        }

        public final void run() {
            this.f96681a.mo77433d(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$p */
    static final class C37970p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37954d f96682a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f96683b;

        /* renamed from: c */
        final /* synthetic */ SearchAdBottomBar f96684c;

        C37970p(C37954d dVar, AwemeRawAd awemeRawAd, SearchAdBottomBar searchAdBottomBar) {
            this.f96682a = dVar;
            this.f96683b = awemeRawAd;
            this.f96684c = searchAdBottomBar;
        }

        public final void run() {
            if (!this.f96682a.mo77428a(this.f96683b)) {
                this.f96684c.mo54457a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$q */
    static final class C37971q extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37954d f96685a;

        C37971q(C37954d dVar) {
            this.f96685a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f96685a.mo77432ai();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.d$r */
    static final class C37972r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37954d f96686a;

        C37972r(C37954d dVar) {
            this.f96686a = dVar;
        }

        public final void run() {
            CharSequence charSequence;
            RelativeLayout relativeLayout = this.f96686a.f96645ba;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            this.f96686a.mo64837V();
            LinearLayout linearLayout = this.f96686a.f96639aU;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            Aweme aweme = this.f96686a.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String str = null;
            if (awemeRawAd != null) {
                charSequence = awemeRawAd.getAppInstall();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                DmtTextView dmtTextView = this.f96686a.f96643aY;
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(8);
                }
                View view = this.f96686a.f96642aX;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                AdRatingView adRatingView = this.f96686a.f96641aW;
                if (adRatingView == null || adRatingView.getVisibility() != 0) {
                    DmtTextView dmtTextView2 = this.f96686a.f96643aY;
                    if (dmtTextView2 != null) {
                        Aweme aweme2 = this.f96686a.f83048c;
                        C52711k.m112236a((Object) aweme2, "mAweme");
                        AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            str = awemeRawAd2.getAppInstall();
                        }
                        dmtTextView2.setText(str);
                    }
                } else {
                    DmtTextView dmtTextView3 = this.f96686a.f96643aY;
                    if (dmtTextView3 != null) {
                        dmtTextView3.post(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C37972r f96687a;

                            {
                                this.f96687a = r1;
                            }

                            public final void run() {
                                int measuredWidth;
                                String str;
                                if (this.f96687a.f96686a.mo77429af()) {
                                    LinearLayout linearLayout = this.f96687a.f96686a.f96640aV;
                                    if (linearLayout == null) {
                                        C52711k.m112234a();
                                    }
                                    int i = linearLayout.getLayoutParams().width;
                                    AdRatingView adRatingView = this.f96687a.f96686a.f96641aW;
                                    if (adRatingView == null) {
                                        C52711k.m112234a();
                                    }
                                    measuredWidth = (i - adRatingView.getMeasuredWidth()) - C23728o.m58241a(16.5d);
                                } else {
                                    LinearLayout linearLayout2 = this.f96687a.f96686a.f96640aV;
                                    if (linearLayout2 == null) {
                                        C52711k.m112234a();
                                    }
                                    int i2 = linearLayout2.getLayoutParams().width;
                                    AdRatingView adRatingView2 = this.f96687a.f96686a.f96641aW;
                                    if (adRatingView2 == null) {
                                        C52711k.m112234a();
                                    }
                                    measuredWidth = ((i2 - adRatingView2.getMeasuredWidth()) - C23728o.m58241a(16.5d)) - C23728o.m58241a(58.0d);
                                }
                                int i3 = measuredWidth;
                                Aweme aweme = this.f96687a.f96686a.f83048c;
                                C52711k.m112236a((Object) aweme, "mAweme");
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                if (awemeRawAd == null) {
                                    C52711k.m112234a();
                                }
                                C52711k.m112236a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                                CharSequence appInstall = awemeRawAd.getAppInstall();
                                DmtTextView dmtTextView = this.f96687a.f96686a.f96643aY;
                                if (dmtTextView == null) {
                                    C52711k.m112234a();
                                }
                                DynamicLayout dynamicLayout = new DynamicLayout(appInstall, dmtTextView.getPaint(), i3, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                if (dynamicLayout.getLineCount() > 1) {
                                    DmtTextView dmtTextView2 = this.f96687a.f96686a.f96643aY;
                                    if (dmtTextView2 != null) {
                                        dmtTextView2.setVisibility(8);
                                    }
                                    View view = this.f96687a.f96686a.f96642aX;
                                    if (view != null) {
                                        view.setVisibility(8);
                                    }
                                    return;
                                }
                                DmtTextView dmtTextView3 = this.f96687a.f96686a.f96643aY;
                                if (dmtTextView3 != null) {
                                    Aweme aweme2 = this.f96687a.f96686a.f83048c;
                                    C52711k.m112236a((Object) aweme2, "mAweme");
                                    AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                    if (awemeRawAd2 != null) {
                                        str = awemeRawAd2.getAppInstall();
                                    } else {
                                        str = null;
                                    }
                                    dmtTextView3.setText(str);
                                }
                            }
                        });
                    }
                }
            }
            C47795d.m103429a(this.f96686a.f96644aZ);
            float a = (float) C23728o.m58241a(2.0d);
            Context N = this.f96686a.mo64749N();
            C52711k.m112236a((Object) N, "context");
            C25592b bVar = new C25592b(a, N.getResources().getColor(R.color.ss));
            if (C26512f.m64079v(this.f96686a.f83048c)) {
                C47795d.m103431a(this.f96686a.f96644aZ, bVar, C0726c.m2098c(this.f96686a.mo64749N(), R.color.a1x), Color.parseColor(C26512f.m64078u(this.f96686a.f83048c)), 300);
            } else {
                DmtTextView dmtTextView4 = this.f96686a.f96644aZ;
                if (dmtTextView4 != null) {
                    dmtTextView4.setBackground(bVar);
                }
            }
            LinearLayout linearLayout2 = this.f96686a.f96639aU;
            if (linearLayout2 != null) {
                ViewPropertyAnimator animate = linearLayout2.animate();
                if (animate != null) {
                    ViewPropertyAnimator alpha = animate.alpha(1.0f);
                    if (alpha != null) {
                        ViewPropertyAnimator duration = alpha.setDuration(150);
                        if (duration != null) {
                            duration.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: as */
    private final boolean m84865as() {
        C26503d.m64058a(mo64771c());
        return false;
    }

    /* renamed from: L */
    public final void mo64747L() {
        super.mo64747L();
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "aweme");
        m84867e(aweme);
    }

    /* renamed from: O */
    public final void mo64750O() {
        super.mo64750O();
        this.f96651bh = false;
        this.f96652bi = false;
        m84863aq();
        m84862ap();
    }

    /* renamed from: aj */
    private boolean m84856aj() {
        if (!C26503d.m64061d(this.f83048c)) {
            return false;
        }
        Aweme aweme = this.f83048c;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.getOutFlowButtonStyle() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: am */
    private final void m84859am() {
        boolean z;
        CharSequence charSequence = this.f96648be;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f96648be = null;
        }
    }

    /* renamed from: ap */
    private final void m84862ap() {
        if (this.f96661br != null) {
            if (!m84866at()) {
                this.f96649bf = false;
            } else if (!this.f96649bf) {
                this.f96649bf = true;
                C26059ax.m63133a(mo64749N(), this.f96661br);
            }
        }
    }

    /* renamed from: at */
    private final boolean m84866at() {
        if (!this.f96652bi) {
            this.f96651bh = C23729p.m58267b(this.itemView);
            this.f96652bi = true;
        }
        return this.f96651bh;
    }

    /* renamed from: ar */
    private void m84864ar() {
        C26077e.m63190a().mo53582a("result_ad").mo53593b("show").mo53590b(this.f83048c).mo53602g("video").mo53586a(mo64749N());
    }

    /* renamed from: Q */
    public final void mo64752Q() {
        super.mo64752Q();
        C26512f.m64114P(this.f83048c);
        m84860an();
        C26512f.m64114P(this.f83048c);
        C26080b b = C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("click");
        C26512f.m64114P(this.f83048c);
        b.mo53602g("more_button").mo53586a(mo64749N());
    }

    /* renamed from: ae */
    public final void mo64847ae() {
        super.mo64847ae();
        C28393ak.m67387a(this.itemView, mo64771c(), this.f83048c);
        C26059ax.m63136c(mo64749N(), this.f96661br);
        C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("otherclick").mo53586a(mo64749N());
    }

    /* renamed from: af */
    public final boolean mo77429af() {
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "mAweme");
        Video video = aweme.getVideo();
        C52711k.m112236a((Object) video, "mAweme.video");
        int height = video.getHeight() * 3;
        Aweme aweme2 = this.f83048c;
        C52711k.m112236a((Object) aweme2, "mAweme");
        Video video2 = aweme2.getVideo();
        C52711k.m112236a((Object) video2, "mAweme.video");
        if (height >= video2.getWidth() * 4) {
            return true;
        }
        return false;
    }

    /* renamed from: ah */
    public final boolean mo77431ah() {
        boolean z;
        boolean a = C26512f.m64057a(this.f83048c);
        if (C26512f.m64061d(this.f83048c) || !a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C10691a.m21542b(mo64749N(), (int) R.string.dm).mo19066a();
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* renamed from: aq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m84863aq() {
        /*
            r7 = this;
            boolean r0 = r7.f83034an
            if (r0 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f83048c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getSearchAdType()
            if (r0 != r2) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x001c
            return
        L_0x001c:
            boolean r0 = r7.m84865as()
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            boolean r0 = r7.m84866at()
            if (r0 == 0) goto L_0x0058
            boolean r0 = r7.f96650bg
            if (r0 != 0) goto L_0x005a
            r7.f96650bg = r2
            r7.m84864ar()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f83048c
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.commercialize.log.ay r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26060ay.f68819a
            java.lang.String r2 = "show"
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getTrackUrlList()
            java.lang.Long r4 = r0.getCreativeId()
            java.lang.String r5 = r0.getLogExtra()
            com.ss.android.ugc.aweme.newfollow.vh.d$i r6 = new com.ss.android.ugc.aweme.newfollow.vh.d$i
            r6.<init>(r0)
            d.f.a.m r6 = (p2628d.p2639f.p2640a.C52682m) r6
            r1.mo53545a(r2, r3, r4, r5, r6)
            goto L_0x005a
        L_0x0057:
            return
        L_0x0058:
            r7.f96650bg = r1
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37954d.m84863aq():void");
    }

    /* renamed from: W */
    public final void mo64838W() {
        super.mo64838W();
        if (this.f83110aO != null && this.f83048c != null && C26512f.m64061d(this.f83048c)) {
            C26080b b = C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("break");
            C48021h hVar = this.f83110aO;
            C52711k.m112236a((Object) hVar, "mPlayer");
            C26080b a = b.mo53573a(hVar.mo95256n());
            Aweme aweme = this.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C52711k.m112236a((Object) video, "mAweme.video");
            a.mo53588b((long) video.getVideoLength()).mo53586a(mo64749N());
        }
    }

    /* renamed from: ag */
    public final void mo77430ag() {
        if (!mo77431ah()) {
            C25493a.m62004a();
            C25493a.m62005a(mo64749N(), this.f83048c);
            if (C26512f.m64061d(this.f83048c)) {
                Context N = mo64749N();
                Aweme aweme = this.f83048c;
                C52711k.m112236a((Object) aweme, "mAweme");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
                String valueOf = String.valueOf(awemeRawAd.getCreativeId().longValue());
                String str = "background";
                Aweme aweme2 = this.f83048c;
                C52711k.m112236a((Object) aweme2, "mAweme");
                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd2, "mAweme.awemeRawAd!!");
                C26088l.m63298a(N, "replay", valueOf, str, awemeRawAd2.getLogExtra());
            }
            mo64843a(true, false);
        }
    }

    /* renamed from: ai */
    public final void mo77432ai() {
        if (m84856aj() && VERSION.SDK_INT >= 21) {
            FrameLayout frameLayout = this.f83120av;
            C52711k.m112236a((Object) frameLayout, "mVideoLayout");
            FrameLayout frameLayout2 = this.f83120av;
            C52711k.m112236a((Object) frameLayout2, "mVideoLayout");
            frameLayout.setOutlineProvider(new C26212h(frameLayout2.getResources().getDimensionPixelOffset(R.dimen.i6)));
            FrameLayout frameLayout3 = this.f83120av;
            C52711k.m112236a((Object) frameLayout3, "mVideoLayout");
            frameLayout3.setClipToOutline(true);
            SearchAdBottomBar searchAdBottomBar = this.f96662bs;
            if (searchAdBottomBar != null) {
                FrameLayout frameLayout4 = this.f83120av;
                C52711k.m112236a((Object) frameLayout4, "mVideoLayout");
                searchAdBottomBar.setOutlineProvider(new C26204a(frameLayout4.getResources().getDimensionPixelOffset(R.dimen.i6)));
                searchAdBottomBar.setClipToOutline(true);
            }
        }
    }

    /* renamed from: ak */
    private final boolean m84857ak() {
        String str;
        String str2;
        if (this.f96639aU == null || this.f96641aW == null || this.f96643aY == null || this.f96642aX == null || !C26512f.m64061d(this.f83048c)) {
            return false;
        }
        this.f96645ba = (RelativeLayout) this.itemView.findViewById(R.id.dv6);
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "mAweme");
        if (aweme.isAppAd()) {
            return false;
        }
        this.f96638aT = true;
        Aweme aweme2 = this.f83048c;
        C52711k.m112236a((Object) aweme2, "mAweme");
        String str3 = null;
        if (aweme2.isAppAd()) {
            Context N = mo64749N();
            Aweme aweme3 = this.f83048c;
            C52711k.m112236a((Object) aweme3, "mAweme");
            AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getCreativeIdStr();
            } else {
                str2 = null;
            }
            String str4 = "bg_download_button";
            Aweme aweme4 = this.f83048c;
            C52711k.m112236a((Object) aweme4, "mAweme");
            AwemeRawAd awemeRawAd2 = aweme4.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str3 = awemeRawAd2.getLogExtra();
            }
            C26088l.m63350e(N, str2, str4, str3);
        } else {
            Context N2 = mo64749N();
            Aweme aweme5 = this.f83048c;
            C52711k.m112236a((Object) aweme5, "mAweme");
            AwemeRawAd awemeRawAd3 = aweme5.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str = awemeRawAd3.getCreativeIdStr();
            } else {
                str = null;
            }
            String str5 = "bg_more_button";
            Aweme aweme6 = this.f83048c;
            C52711k.m112236a((Object) aweme6, "mAweme");
            AwemeRawAd awemeRawAd4 = aweme6.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                str3 = awemeRawAd4.getLogExtra();
            }
            C26088l.m63350e(N2, str, str5, str3);
        }
        LinearLayout linearLayout = this.f96639aU;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
        }
        RelativeLayout relativeLayout = this.f96645ba;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(1.0f);
        }
        RelativeLayout relativeLayout2 = this.f96645ba;
        if (relativeLayout2 != null) {
            ViewPropertyAnimator animate = relativeLayout2.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(150);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new C37972r(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        C30367g a = C30367g.m71282a();
        C52711k.m112236a((Object) a, "FeedSharePlayInfoHelper.inst()");
        a.f79375d = true;
        C30367g a2 = C30367g.m71282a();
        C52711k.m112236a((Object) a2, "FeedSharePlayInfoHelper.inst()");
        a2.f79376e = true;
        return true;
    }

    /* renamed from: ao */
    private final void m84861ao() {
        boolean z;
        SearchAdBottomBar searchAdBottomBar = this.f96662bs;
        if (searchAdBottomBar != null) {
            Aweme aweme = this.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "mAweme.awemeRawAd ?: return");
                boolean z2 = true;
                this.f96647bd = true;
                if (mo77428a(awemeRawAd)) {
                    mo77433d(true);
                    return;
                }
                long a = this.f96665bv.mo77444a(this.f83048c, null);
                int showButtonSeconds = awemeRawAd.getShowButtonSeconds() * 1000;
                if (showButtonSeconds < 0) {
                    showButtonSeconds = 0;
                }
                if (this.f96665bv.mo54191a() >= ((long) showButtonSeconds) || showButtonSeconds == 0) {
                    mo77433d(true);
                    z = false;
                } else {
                    this.f96646bc.mo54200a(new C26507a().mo54193a(a).mo54192a(showButtonSeconds).mo54194a((Runnable) new C37969o(this)).mo54195a(false).mo54196a());
                    z = true;
                }
                int max = Math.max(showButtonSeconds, awemeRawAd.getShowButtonColorSeconds() * 1000);
                if (max < 0) {
                    max = 0;
                }
                if (this.f96665bv.mo54191a() >= ((long) max)) {
                    searchAdBottomBar.mo54457a(true);
                    z2 = z;
                } else {
                    this.f96646bc.mo54200a(new C26507a().mo54193a(a).mo54192a(max).mo54194a((Runnable) new C37970p(this, awemeRawAd, searchAdBottomBar)).mo54195a(false).mo54196a());
                }
                if (z2) {
                    this.f96646bc.mo54199a((C26505b) this.f96665bv);
                    this.f96646bc.mo54201b();
                }
            }
        }
    }

    /* renamed from: an */
    private final void m84860an() {
        boolean z;
        if (C26512f.m64061d(this.f83048c)) {
            Aweme aweme = this.f83048c;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C37966l<Object,Object,Object>(awemeRawAd));
                }
            }
            C26512f.m64114P(this.f83048c);
            Aweme aweme2 = this.f83048c;
            C52711k.m112236a((Object) aweme2, "mAweme");
            AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
            if (awemeRawAd2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) awemeRawAd2, "mAweme.awemeRawAd!!");
            String openUrl = awemeRawAd2.getOpenUrl();
            boolean c = C26540w.m64242c(openUrl);
            if (C26512f.m64141b(openUrl)) {
                String builder = Uri.parse(C25653a.f67876a).buildUpon().appendQueryParameter("tag", "result_ad").toString();
                C52711k.m112236a((Object) builder, "Uri.parse(CommercializeC…              .toString()");
                openUrl = C26512f.m64129a(openUrl, builder);
                z = true;
            } else {
                z = false;
            }
            if (!c || !C26540w.m64221a(mo64749N(), openUrl, this.f83048c, false, false)) {
                Context N = mo64749N();
                Aweme aweme3 = this.f83048c;
                String G = C26512f.m64105G(this.f83048c);
                String H = C26512f.m64106H(this.f83048c);
                Aweme aweme4 = this.f83048c;
                C52711k.m112236a((Object) aweme4, "mAweme");
                AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
                if (awemeRawAd3 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd3, "mAweme.awemeRawAd!!");
                if (C26540w.m64217a(N, aweme3, G, H, C47615c.m103090a(awemeRawAd3), false, 5)) {
                    C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("open_url_h5").mo53586a(mo64749N());
                }
                return;
            }
            if (z) {
                C25732e a = C25732e.m62287a();
                C52711k.m112236a((Object) a, "CommercializeManager.getInstance()");
                a.f68051a = this.f83048c;
            }
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("open_url_app").mo53586a(mo64749N());
            C26540w.m64208a((C26534a) new C37967m(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053  */
    /* renamed from: al */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m84858al() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "mAweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarMedium()
            if (r0 != 0) goto L_0x0024
            goto L_0x003e
        L_0x0024:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r6.f96659bp
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f83048c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r2 = "mAweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r1)
            goto L_0x004a
        L_0x003e:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r6.f96659bp
            r1 = 2131953301(0x7f130695, float:1.954307E38)
            com.ss.android.ugc.aweme.base.model.a r1 = com.p683ss.android.ugc.aweme.base.model.C23556a.m57755a(r1)
            com.p683ss.android.ugc.aweme.base.C23515d.m57676a(r0, r1)
        L_0x004a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            if (r0 != 0) goto L_0x0053
            return
        L_0x0053:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            r1 = 3
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x00a2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f96656bm
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r3 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.commercialize.model.y r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x007b
            com.bytedance.t.b.f r2 = r2.vast
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = r2.adTitle
            goto L_0x007c
        L_0x007b:
            r2 = r1
        L_0x007c:
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = ""
            goto L_0x009c
        L_0x0081:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r3 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.commercialize.model.y r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x009b
            com.bytedance.t.b.f r2 = r2.vast
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r2.adTitle
            goto L_0x009c
        L_0x009b:
            r2 = r1
        L_0x009c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x00d0
        L_0x00a2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f96656bm
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r3 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = ""
        L_0x00b5:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x00cd
        L_0x00b8:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r3 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            java.lang.String r3 = "mAweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getNickname()
            goto L_0x00b5
        L_0x00cd:
            r0.setText(r2)
        L_0x00d0:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r0.getAppInstall()
            goto L_0x00e3
        L_0x00e2:
            r0 = r1
        L_0x00e3:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1082130432(0x40800000, float:4.0)
            r3 = 8
            if (r0 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x00ff
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ff:
            java.lang.String r4 = "mAweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            float r0 = r0.getAppLike()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            android.widget.LinearLayout r0 = r6.f96657bn
            if (r0 == 0) goto L_0x0113
            r0.setVisibility(r3)
        L_0x0113:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f96658bo
            if (r0 == 0) goto L_0x011b
            r4 = 2
            r0.setMaxLines(r4)
        L_0x011b:
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r0 = r6.f96641aW
            if (r0 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f83048c
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 != 0) goto L_0x012f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x012f:
            java.lang.String r5 = "mAweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            float r4 = r4.getAppLike()
            r0.setRatingProgress(r4)
        L_0x013b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x014b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x014b:
            java.lang.String r4 = "mAweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            float r0 = r0.getAppLike()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0166
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r0 = r6.f96641aW
            if (r0 == 0) goto L_0x015f
            r0.setVisibility(r3)
        L_0x015f:
            android.view.View r0 = r6.f96642aX
            if (r0 == 0) goto L_0x0166
            r0.setVisibility(r3)
        L_0x0166:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r0.getAppInstall()
            goto L_0x0179
        L_0x0178:
            r0 = r1
        L_0x0179:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0190
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f96643aY
            if (r0 == 0) goto L_0x0188
            r0.setVisibility(r3)
        L_0x0188:
            android.view.View r0 = r6.f96642aX
            if (r0 == 0) goto L_0x01ac
            r0.setVisibility(r3)
            goto L_0x01ac
        L_0x0190:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.f96643aY
            if (r0 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x01a6
            java.lang.String r2 = r2.getAppInstall()
            goto L_0x01a7
        L_0x01a6:
            r2 = r1
        L_0x01a7:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x01ac:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r0 = r0.getDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0212
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f96658bo
            if (r0 == 0) goto L_0x01d3
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r3 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x01d3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x01e4
            java.lang.String r1 = r0.getAdMoreTextual()
        L_0x01e4:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f96658bo
            if (r0 == 0) goto L_0x0211
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f83048c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x0200
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0200:
            java.lang.String r2 = "mAweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.getAdMoreTextual()
            java.lang.String r2 = "mAweme.awemeRawAd!!.adMoreTextual"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r0.setMoreString(r1)
        L_0x0211:
            return
        L_0x0212:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r6.f96658bo
            if (r0 == 0) goto L_0x021a
            r0.setVisibility(r3)
            return
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37954d.m84858al():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04f1  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64751P() {
        /*
            r13 = this;
            super.mo64751P()
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96663bt
            r1 = 8
            if (r0 == 0) goto L_0x000c
            r0.setVisibility(r1)
        L_0x000c:
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96664bu
            if (r0 == 0) goto L_0x0013
            r0.setVisibility(r1)
        L_0x0013:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            java.lang.String r3 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.String r3 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            android.view.View r3 = r13.itemView
            r4 = 2132017327(0x7f1400af, float:1.967293E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = 2131821457(0x7f110391, float:1.9275658E38)
            r7 = -1
            r8 = 0
            if (r3 != 0) goto L_0x0038
            goto L_0x00a0
        L_0x0038:
            if (r2 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x0043
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0043:
            java.lang.String r9 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r9)
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r0 = r0.getLabel()
            if (r0 == 0) goto L_0x009d
            r3.setVisibility(r8)
            java.lang.String r9 = r0.getTextColor()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x005f
            r9 = -1
            goto L_0x0067
        L_0x005f:
            java.lang.String r9 = r0.getTextColor()
            int r9 = android.graphics.Color.parseColor(r9)
        L_0x0067:
            r3.setTextColor(r9)
            java.lang.String r9 = r0.getBgColor()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x007f
            android.content.Context r9 = r13.mo64749N()
            int r9 = android.support.p030v4.content.C0726c.m2098c(r9, r6)
            goto L_0x0087
        L_0x007f:
            java.lang.String r9 = r0.getBgColor()
            int r9 = android.graphics.Color.parseColor(r9)
        L_0x0087:
            int r10 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            float r10 = (float) r10
            android.graphics.drawable.Drawable r9 = com.p683ss.android.ugc.aweme.base.utils.C23729p.m58249a(r9, r10)
            r3.setBackgroundDrawable(r9)
            java.lang.String r0 = r0.getLabelName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            goto L_0x00a0
        L_0x009d:
            r3.setVisibility(r1)
        L_0x00a0:
            if (r2 == 0) goto L_0x05c6
            android.content.Context r0 = r13.mo64749N()
            int r0 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58224b(r0)
            float r0 = (float) r0
            r2 = 4645304685958266880(0x4077700000000000, double:375.0)
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r2)
            float r2 = (float) r2
            float r0 = r0 / r2
            boolean r2 = r13.mo77429af()
            r9 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r2 == 0) goto L_0x01ac
            android.view.View r2 = r13.itemView
            r3 = 2132024463(0x7f141c8f, float:1.9687403E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r13.f96639aU = r2
            android.view.View r2 = r13.itemView
            r3 = 2132024457(0x7f141c89, float:1.968739E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r13.f96640aV = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017289(0x7f140089, float:1.9672852E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96656bm = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017311(0x7f14009f, float:1.9672897E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r2
            r13.f96641aW = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017282(0x7f140082, float:1.9672838E38)
            android.view.View r2 = r2.findViewById(r3)
            r13.f96642aX = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017230(0x7f14004e, float:1.9672733E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96643aY = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017285(0x7f140085, float:1.9672844E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r13.f96657bn = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017252(0x7f140064, float:1.9672777E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.DescTextView) r2
            r13.f96658bo = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017271(0x7f140077, float:1.9672816E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            r13.f96659bp = r2
            android.view.View r2 = r13.itemView
            r3 = 2132018995(0x7f140733, float:1.9676312E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96644aZ = r2
            android.view.View r2 = r13.itemView
            r3 = 2132018999(0x7f140737, float:1.967632E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96660bq = r2
            android.widget.LinearLayout r2 = r13.f96640aV
            if (r2 == 0) goto L_0x0164
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x0164
            r11 = 4640642756656496640(0x4066e00000000000, double:183.0)
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.width = r3
        L_0x0164:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r13.f96660bq
            r11 = 4635787313308237824(0x4055a00000000000, double:86.5)
            if (r2 == 0) goto L_0x017d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x017d
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.width = r3
        L_0x017d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r13.f96644aZ
            if (r2 == 0) goto L_0x0299
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x0299
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.width = r3
            if (r2 == 0) goto L_0x0299
            if (r2 == 0) goto L_0x01a4
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r9)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r0 = (int) r3
            r2.setMarginStart(r0)
            goto L_0x0299
        L_0x01a4:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x01ac:
            android.view.View r2 = r13.itemView
            r3 = 2132019522(0x7f140942, float:1.9677381E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r13.f96639aU = r2
            android.view.View r2 = r13.itemView
            r3 = 2132019515(0x7f14093b, float:1.9677367E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r13.f96640aV = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017288(0x7f140088, float:1.967285E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96656bm = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017310(0x7f14009e, float:1.9672895E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r2
            r13.f96641aW = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017281(0x7f140081, float:1.9672836E38)
            android.view.View r2 = r2.findViewById(r3)
            r13.f96642aX = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017229(0x7f14004d, float:1.967273E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96643aY = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017284(0x7f140084, float:1.9672842E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r13.f96657bn = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017251(0x7f140063, float:1.9672775E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.DescTextView) r2
            r13.f96658bo = r2
            android.view.View r2 = r13.itemView
            r3 = 2132017268(0x7f140074, float:1.967281E38)
            android.view.View r2 = r2.findViewById(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            r13.f96659bp = r2
            android.view.View r2 = r13.itemView
            r3 = 2132018994(0x7f140732, float:1.967631E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96644aZ = r2
            android.view.View r2 = r13.itemView
            r3 = 2132018998(0x7f140736, float:1.9676318E38)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r13.f96660bq = r2
            android.widget.LinearLayout r2 = r13.f96640aV
            if (r2 == 0) goto L_0x0252
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x0252
            r11 = 4642050131540049920(0x406be00000000000, double:223.0)
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.width = r3
        L_0x0252:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r13.f96660bq
            r11 = 4637194688191791104(0x405aa00000000000, double:106.5)
            if (r2 == 0) goto L_0x026b
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x026b
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.width = r3
        L_0x026b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r13.f96644aZ
            if (r2 == 0) goto L_0x0299
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x0299
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.width = r3
            if (r2 == 0) goto L_0x0299
            if (r2 == 0) goto L_0x0291
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r9)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r0 = (int) r3
            r2.setMarginStart(r0)
            goto L_0x0299
        L_0x0291:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x0299:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            if (r0 == 0) goto L_0x02a3
            r2 = 2131952810(0x7f1304aa, float:1.9542073E38)
            r0.setDescLightDrawable(r2)
        L_0x02a3:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            r2 = 1
            if (r0 == 0) goto L_0x02ae
            java.lang.String r3 = "... "
            r0.f67744b = r3
            r0.f67745c = r2
        L_0x02ae:
            android.widget.LinearLayout r0 = r13.f96639aU
            if (r0 == 0) goto L_0x02bc
            com.ss.android.ugc.aweme.newfollow.vh.d$h r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$h
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x02bc:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96656bm
            if (r0 == 0) goto L_0x02ca
            com.ss.android.ugc.aweme.newfollow.vh.d$b r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$b
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x02ca:
            android.widget.LinearLayout r0 = r13.f96657bn
            if (r0 == 0) goto L_0x02d8
            com.ss.android.ugc.aweme.newfollow.vh.d$c r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$c
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x02d8:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            if (r0 == 0) goto L_0x02e6
            com.ss.android.ugc.aweme.newfollow.vh.d$d r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$d
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x02e6:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r13.f96659bp
            if (r0 == 0) goto L_0x02f4
            com.ss.android.ugc.aweme.newfollow.vh.d$e r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$e
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x02f4:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96644aZ
            if (r0 == 0) goto L_0x0302
            com.ss.android.ugc.aweme.newfollow.vh.d$f r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$f
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x0302:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96660bq
            if (r0 == 0) goto L_0x0310
            com.ss.android.ugc.aweme.newfollow.vh.d$g r3 = new com.ss.android.ugc.aweme.newfollow.vh.d$g
            r3.<init>(r13)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x0310:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96644aZ
            android.view.View r0 = (android.view.View) r0
            r3 = 1061158912(0x3f400000, float:0.75)
            com.p683ss.android.ugc.aweme.utils.C47795d.m103430a(r0, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96660bq
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.utils.C47795d.m103429a(r0)
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.utils.C47795d.m103430a(r0, r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r13.f96659bp
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.utils.C47795d.m103430a(r0, r3)
            android.widget.LinearLayout r0 = r13.f96657bn
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.utils.C47795d.m103430a(r0, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96656bm
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ugc.aweme.utils.C47795d.m103430a(r0, r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            if (r0 == 0) goto L_0x039b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96644aZ
            if (r0 == 0) goto L_0x0357
            android.content.Context r3 = r13.mo64749N()
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r13.f83048c
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26369ac.m63810a(r3, r9, r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x0357:
            com.ss.android.ugc.aweme.commercialize.ad.b r0 = new com.ss.android.ugc.aweme.commercialize.ad.b
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            float r3 = (float) r3
            android.content.Context r4 = r13.mo64749N()
            java.lang.String r5 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r6)
            r0.<init>(r3, r4)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f83048c
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64079v(r3)
            if (r3 == 0) goto L_0x0394
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.content.Context r3 = r13.mo64749N()
            r4 = 2131821828(0x7f110504, float:1.927641E38)
            int r3 = android.support.p030v4.content.C0726c.m2098c(r3, r4)
            android.graphics.drawable.Drawable r0 = com.p683ss.android.ugc.aweme.utils.C47795d.m103428a(r0, r3)
            java.lang.String r3 = "AdAnimationUtils.tintDra…or(context, R.color.s14))"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
        L_0x0394:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.f96644aZ
            if (r3 == 0) goto L_0x039b
            r3.setBackground(r0)
        L_0x039b:
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager r0 = com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager.m63648a()
            android.content.Context r3 = r13.mo64749N()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.f83048c
            boolean r0 = r0.mo53953a(r3, r4)
            r3 = 2
            if (r0 != 0) goto L_0x03bc
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager r0 = com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager.m63648a()
            android.content.Context r4 = r13.mo64749N()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r13.f83048c
            boolean r0 = r0.mo53956b(r4, r5)
            if (r0 == 0) goto L_0x0542
        L_0x03bc:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            if (r0 == 0) goto L_0x03de
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto L_0x03d4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x03d4:
            java.lang.String r4 = "mAweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            int r0 = r0.getNativeCardType()
            goto L_0x03df
        L_0x03de:
            r0 = 0
        L_0x03df:
            switch(r0) {
                case 1: goto L_0x053f;
                case 2: goto L_0x03e7;
                default: goto L_0x03e2;
            }
        L_0x03e2:
            r13.m84858al()
            goto L_0x0542
        L_0x03e7:
            android.widget.LinearLayout r0 = r13.f96657bn
            if (r0 == 0) goto L_0x03ee
            r0.setVisibility(r1)
        L_0x03ee:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            java.lang.String r0 = r0.getDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r0 != 0) goto L_0x0466
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            if (r0 == 0) goto L_0x0409
            r0.setMaxLines(r3)
        L_0x0409:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            if (r0 == 0) goto L_0x041d
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            java.lang.String r1 = r1.getDesc()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x041d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            if (r0 != 0) goto L_0x046d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0437
            java.lang.String r0 = r0.getAdMoreTextual()
            goto L_0x0438
        L_0x0437:
            r0 = r4
        L_0x0438:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x046d
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            if (r0 == 0) goto L_0x046d
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 != 0) goto L_0x0454
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0454:
            java.lang.String r5 = "mAweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            java.lang.String r1 = r1.getAdMoreTextual()
            java.lang.String r5 = "mAweme.awemeRawAd!!.adMoreTextual"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            r0.setMoreString(r1)
            goto L_0x046d
        L_0x0466:
            com.ss.android.ugc.aweme.commercialize.ad.DescTextView r0 = r13.f96658bo
            if (r0 == 0) goto L_0x046d
            r0.setVisibility(r1)
        L_0x046d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x04ab
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "mAweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarMedium()
            if (r0 != 0) goto L_0x0491
            goto L_0x04ab
        L_0x0491:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r13.f96659bp
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r5 = "mAweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarMedium()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r1)
            goto L_0x04b7
        L_0x04ab:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r13.f96659bp
            r1 = 2131953301(0x7f130695, float:1.954307E38)
            com.ss.android.ugc.aweme.base.model.a r1 = com.p683ss.android.ugc.aweme.base.model.C23556a.m57755a(r1)
            com.p683ss.android.ugc.aweme.base.C23515d.m57676a(r0, r1)
        L_0x04b7:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0542
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            r1 = 3
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r0, r1)
            if (r0 == 0) goto L_0x0510
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96656bm
            if (r0 == 0) goto L_0x0542
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x04eb
            com.ss.android.ugc.aweme.commercialize.model.y r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x04eb
            com.bytedance.t.b.f r1 = r1.vast
            if (r1 == 0) goto L_0x04eb
            java.lang.String r1 = r1.adTitle
            goto L_0x04ec
        L_0x04eb:
            r1 = r4
        L_0x04ec:
            if (r1 != 0) goto L_0x04f1
            java.lang.String r4 = ""
            goto L_0x050a
        L_0x04f1:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x050a
            com.ss.android.ugc.aweme.commercialize.model.y r1 = r1.getOmVast()
            if (r1 == 0) goto L_0x050a
            com.bytedance.t.b.f r1 = r1.vast
            if (r1 == 0) goto L_0x050a
            java.lang.String r4 = r1.adTitle
        L_0x050a:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
            goto L_0x0542
        L_0x0510:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.f96656bm
            if (r0 == 0) goto L_0x0542
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 != 0) goto L_0x0526
            java.lang.String r1 = ""
        L_0x0523:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x053b
        L_0x0526:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r4 = "mAweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.String r1 = r1.getNickname()
            goto L_0x0523
        L_0x053b:
            r0.setText(r1)
            goto L_0x0542
        L_0x053f:
            r13.m84858al()
        L_0x0542:
            boolean r0 = r13.mo64804t()
            if (r0 == 0) goto L_0x05c6
            r13.f96647bd = r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f83048c
            if (r0 == 0) goto L_0x0558
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0558
            int r7 = r0.getOutFlowButtonStyle()
        L_0x0558:
            if (r7 != r2) goto L_0x0589
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96663bt
            if (r0 != 0) goto L_0x0584
            android.view.View r0 = r13.itemView
            r1 = 2132023086(0x7f14172e, float:1.968461E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0584
            r1 = 2132214576(0x7f170330, float:2.0072998E38)
            r0.setLayoutResource(r1)
            android.view.View r0 = r0.inflate()
            if (r0 == 0) goto L_0x057c
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = (com.p683ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar) r0
            r13.f96663bt = r0
            goto L_0x0584
        L_0x057c:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar"
            r0.<init>(r1)
            throw r0
        L_0x0584:
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96663bt
            r13.f96662bs = r0
            goto L_0x05b5
        L_0x0589:
            if (r7 != r3) goto L_0x05b5
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96664bu
            if (r0 != 0) goto L_0x05b1
            android.view.View r0 = r13.itemView
            r1 = 2132023089(0x7f141731, float:1.9684616E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x05b1
            r1 = 2132215254(0x7f1705d6, float:2.0074373E38)
            r0.setLayoutResource(r1)
            android.view.View r0 = r0.inflate()
            r1 = 2132022524(0x7f1414fc, float:1.968347E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = (com.p683ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar) r0
            r13.f96664bu = r0
        L_0x05b1:
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96664bu
            r13.f96662bs = r0
        L_0x05b5:
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96662bs
            if (r0 == 0) goto L_0x05bc
            r0.setStyle(r7)
        L_0x05bc:
            com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar r0 = r13.f96662bs
            if (r0 == 0) goto L_0x05c6
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f83048c
            r0.mo54456a(r1)
            return
        L_0x05c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37954d.mo64751P():void");
    }

    /* renamed from: e */
    private final void m84867e(Aweme aweme) {
        m84859am();
        this.f96648be = C26512f.m64077t(aweme);
    }

    /* renamed from: a */
    public final boolean mo77428a(AwemeRawAd awemeRawAd) {
        if (!awemeRawAd.isAppAd() || this.f96653bj == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo77433d(boolean z) {
        SearchAdBottomBar searchAdBottomBar = this.f96662bs;
        if (searchAdBottomBar != null) {
            searchAdBottomBar.mo54458a(z, new C37971q(this));
        }
    }

    @C53771m
    public final void onDetailPlayComplete(C30308a aVar) {
        C52711k.m112240b(aVar, "event");
        this.f96646bc.mo54202c();
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        super.mo53526a(gVar);
        C26059ax.m63135b(mo64749N(), this.f96661br);
        if (C26512f.m64061d(this.f83048c)) {
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("play").mo53586a(mo64749N());
        }
    }

    @C53771m
    public final void onForwardResultEvent(C32385a aVar) {
        C52711k.m112240b(aVar, "event");
        if (aVar.f84278c == this.f83048c && C26503d.m64061d(aVar.f84278c)) {
            mo64755a(mo64749N(), 4);
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("repost").mo53586a(mo64749N());
        }
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        C47718bf.m103291d(this);
        if (m84865as()) {
            String str = "";
            C52711k.m112240b(str, "<set-?>");
            C37933c.f96587a = str;
        }
        m84859am();
        this.f96646bc.mo54197a();
        this.f96647bd = false;
        if (m84856aj()) {
            ViewGroup viewGroup = this.f83099aD;
            C52711k.m112236a((Object) viewGroup, "mMusicLayout");
            viewGroup.setVisibility(0);
            mo64810z();
        }
    }

    /* renamed from: g */
    public final void mo64786g(String str) {
        super.mo64786g(str);
        if (C26512f.m64061d(this.f83048c)) {
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("click_source").mo53602g(str).mo53586a(mo64749N());
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("click").mo53602g(str).mo53586a(mo64749N());
            m84860an();
        }
    }

    public void onViewAttachedToWindow(View view) {
        int i;
        super.onViewAttachedToWindow(view);
        C47718bf.m103290c(this);
        this.f96649bf = false;
        this.f96650bg = false;
        m84862ap();
        m84863aq();
        mo64843a(false, false);
        Aweme aweme = this.f83048c;
        C52711k.m112236a((Object) aweme, "aweme");
        m84867e(aweme);
        if (m84856aj()) {
            ViewGroup viewGroup = this.f83099aD;
            C52711k.m112236a((Object) viewGroup, "mMusicLayout");
            viewGroup.setVisibility(8);
            SearchAdBottomBar searchAdBottomBar = this.f96662bs;
            if (searchAdBottomBar != null) {
                LayoutParams layoutParams = searchAdBottomBar.getLayoutParams();
                FrameLayout frameLayout = this.f83120av;
                C52711k.m112236a((Object) frameLayout, "mVideoLayout");
                LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    i = layoutParams2.width;
                } else {
                    i = -1;
                }
                layoutParams.width = i;
                searchAdBottomBar.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo64783f(String str) {
        if (!C26512f.m64061d(this.f83048c)) {
            return false;
        }
        C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("click_source").mo53602g(str).mo53586a(mo64749N());
        if (C26512f.m64057a(this.f83048c)) {
            m84860an();
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("click").mo53602g(str).mo53586a(mo64749N());
            return true;
        }
        if (C26512f.m64065h(this.f83048c)) {
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("click").mo53602g(str).mo53586a(mo64749N());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        super.mo53525a(fVar);
        if (C26512f.m64061d(this.f83048c)) {
            Aweme aweme = this.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
            this.f96655bl = awemeRawAd.getShowOutflowMaskTimes();
            C30367g a = C30367g.m71282a();
            C52711k.m112236a((Object) a, "FeedSharePlayInfoHelper.inst()");
            a.f79377f = 0;
            C30367g a2 = C30367g.m71282a();
            C52711k.m112236a((Object) a2, "FeedSharePlayInfoHelper.inst()");
            this.f96654bk = a2.f79377f;
            C30367g a3 = C30367g.m71282a();
            C52711k.m112236a((Object) a3, "FeedSharePlayInfoHelper.inst()");
            a3.f79375d = false;
            C30367g a4 = C30367g.m71282a();
            C52711k.m112236a((Object) a4, "FeedSharePlayInfoHelper.inst()");
            a4.f79378g = false;
            if (C26512f.m64064g(this.f83048c)) {
                C26088l.m63301a(this.f83048c, "result_ad", "video");
            }
            if (!this.f96647bd && mo64804t()) {
                m84861ao();
            }
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        String str2;
        super.mo53533c(str);
        if (C26512f.m64061d(this.f83048c)) {
            this.f96646bc.mo54202c();
            C26080b b = C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("over");
            Aweme aweme = this.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C52711k.m112236a((Object) video, "mAweme.video");
            b.mo53588b((long) video.getVideoLength()).mo53586a(mo64749N());
            this.f96654bk++;
            C30367g a = C30367g.m71282a();
            C52711k.m112236a((Object) a, "FeedSharePlayInfoHelper.inst()");
            a.f79377f = this.f96654bk;
            if (this.f96654bk >= this.f96655bl) {
                C30367g a2 = C30367g.m71282a();
                C52711k.m112236a((Object) a2, "FeedSharePlayInfoHelper.inst()");
                if (!a2.f79375d) {
                    Aweme aweme2 = this.f83048c;
                    C52711k.m112236a((Object) aweme2, "mAweme");
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        str2 = awemeRawAd.getWebUrl();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        boolean z = false;
                        if (C26512f.m64061d(this.f83048c)) {
                            Aweme aweme3 = this.f83048c;
                            C52711k.m112236a((Object) aweme3, "mAweme");
                            Video video2 = aweme3.getVideo();
                            C52711k.m112236a((Object) video2, "mAweme.video");
                            if (video2.getHeight() >= 300 && (!C37974e.m84892a(mo64749N()) || TextUtils.isEmpty(C26512f.m64104F(this.f83048c)) || !C19547d.m47842a(C26512f.m64104F(this.f83048c)) || !C26369ac.m63812a(this.f83048c))) {
                                z = m84857ak();
                            }
                        }
                        if (z) {
                            mo64837V();
                            return;
                        }
                        this.f96655bl++;
                    } else {
                        C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("play").mo53586a(mo64749N());
                        return;
                    }
                }
            }
            C26077e.m63190a().mo53590b(this.f83048c).mo53582a("result_ad").mo53593b("play").mo53586a(mo64749N());
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        super.mo53527a(str);
        C30367g a = C30367g.m71282a();
        C52711k.m112236a((Object) a, "FeedSharePlayInfoHelper.inst()");
        this.f96654bk = a.f79377f;
        mo64843a(false, true);
        if (!this.f96647bd && mo64804t()) {
            m84861ao();
        }
    }

    /* renamed from: a */
    public final void mo64755a(Context context, int i) {
        super.mo64755a(context, i);
        switch (i) {
            case 0:
                C26059ax.m63134a(context, this.f96661br, "safety_video_click_account");
                return;
            case 1:
                C26059ax.m63134a(context, this.f96661br, "safety_video_like");
                return;
            case 2:
                C26059ax.m63134a(context, this.f96661br, "safety_video_comment");
                return;
            case 3:
                C26059ax.m63134a(context, this.f96661br, "safety_video_share");
                return;
            case 4:
                C26059ax.m63134a(context, this.f96661br, "safety_video_repost");
                return;
            case 5:
                C26059ax.m63136c(context, this.f96661br);
                return;
            case 6:
                C26059ax.m63135b(context, this.f96661br);
                break;
        }
    }

    /* renamed from: a */
    public final void mo77427a(AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd != null) {
            Context N = mo64749N();
            C52711k.m112236a((Object) N, "context");
            Aweme aweme = this.f83048c;
            C52711k.m112236a((Object) aweme, "mAweme");
            C26348d.m63784a(N, C26345b.m63777a(aweme, null)).mo54089a();
            C26088l.m63298a(mo64749N(), "click", String.valueOf(awemeRawAd.getCreativeId().longValue()), str, awemeRawAd.getLogExtra());
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C37965k<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: a */
    public final void mo64843a(boolean z, boolean z2) {
        if (this.f96639aU != null) {
            LinearLayout linearLayout = this.f96639aU;
            int i = 8;
            if (linearLayout == null || linearLayout.getVisibility() != 8) {
                LinearLayout linearLayout2 = this.f96639aU;
                if (linearLayout2 != null) {
                    linearLayout2.setAlpha(1.0f);
                }
                LinearLayout linearLayout3 = this.f96639aU;
                if (linearLayout3 != null) {
                    ViewPropertyAnimator animate = linearLayout3.animate();
                    if (animate != null) {
                        ViewPropertyAnimator alpha = animate.alpha(0.0f);
                        if (alpha != null) {
                            ViewPropertyAnimator duration = alpha.setDuration(150);
                            if (duration != null) {
                                ViewPropertyAnimator withEndAction = duration.withEndAction(new C37964j(this, z, z2));
                                if (withEndAction != null) {
                                    withEndAction.start();
                                }
                            }
                        }
                    }
                }
                RelativeLayout relativeLayout = this.f96645ba;
                if (relativeLayout != null) {
                    relativeLayout.setAlpha(0.0f);
                }
                RelativeLayout relativeLayout2 = this.f96645ba;
                if (relativeLayout2 != null) {
                    if (!TimeLockRuler.isTeenModeON()) {
                        i = 0;
                    }
                    relativeLayout2.setVisibility(i);
                }
                RelativeLayout relativeLayout3 = this.f96645ba;
                if (relativeLayout3 != null) {
                    ViewPropertyAnimator animate2 = relativeLayout3.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(150);
                            if (duration2 != null) {
                                duration2.start();
                            }
                        }
                    }
                }
                C30367g a = C30367g.m71282a();
                C52711k.m112236a((Object) a, "FeedSharePlayInfoHelper.inst()");
                a.f79376e = false;
            }
        }
    }
}
