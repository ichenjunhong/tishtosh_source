package com.p683ss.android.ugc.aweme.p1308ad.p1313d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25889a;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25892b;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25893c;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25894d;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25895e;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1569c.C25896f;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.p1554a.C25709a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.p1714a.C29979a;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.p1311a.C22326b;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.p1311a.C22327c;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22431a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22436d;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22444k;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22447a;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22448b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.d.a */
public final class C22392a implements C22448b {

    /* renamed from: e */
    public static final C22393a f60306e = new C22393a(null);

    /* renamed from: a */
    public Aweme f60307a;

    /* renamed from: b */
    public C25889a f60308b;

    /* renamed from: c */
    public RelativeLayout f60309c;

    /* renamed from: d */
    public final LinearLayout f60310d;

    /* renamed from: f */
    private Context f60311f;

    /* renamed from: g */
    private C25908e f60312g;

    /* renamed from: h */
    private C22400a f60313h;

    /* renamed from: com.ss.android.ugc.aweme.ad.d.a$a */
    public static final class C22393a {
        private C22393a() {
        }

        public /* synthetic */ C22393a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.d.a$b */
    static final class C22394b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22392a f60314a;

        /* renamed from: b */
        final /* synthetic */ boolean f60315b;

        /* renamed from: c */
        final /* synthetic */ C22326b f60316c;

        C22394b(C22392a aVar, boolean z, C22326b bVar) {
            this.f60314a = aVar;
            this.f60315b = z;
            this.f60316c = bVar;
        }

        public final void run() {
            this.f60314a.f60310d.setVisibility(8);
            if (this.f60315b) {
                this.f60316c.mo46463a();
            }
            C47718bf.m103288a(new C25709a(false, C22392a.m55403a(this.f60314a).getAid()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.d.a$c */
    static final class C22395c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22392a f60317a;

        /* renamed from: b */
        final /* synthetic */ C22327c f60318b;

        C22395c(C22392a aVar, C22327c cVar) {
            this.f60317a = aVar;
            this.f60318b = cVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f60317a.f60309c;
            if (relativeLayout == null) {
                C52711k.m112237a("widgetContainer");
            }
            relativeLayout.setVisibility(4);
            this.f60318b.mo46465a();
            this.f60317a.f60310d.setVisibility(0);
            C25889a aVar = this.f60317a.f60308b;
            if (aVar == null) {
                C52711k.m112237a("maskLayoutDelegate");
            }
            C22431a.m55458a(aVar.mo53212a());
            C22447a aVar2 = new C22447a((float) C22444k.m55474a(2.0d), aVar.f68419b.getResources().getColor(R.color.ss));
            if (C22434b.m55461a(aVar.f68420c) || C22434b.m55464b(aVar.f68420c)) {
                C22431a.m55459a(aVar.mo53212a(), aVar2, C0726c.m2098c(aVar.f68419b, R.color.a1x), Color.parseColor(C22434b.m55460a(aVar.f68419b, aVar.f68420c)), 300);
            } else {
                TextView a = aVar.mo53212a();
                C52711k.m112236a((Object) a, "feedAdDownloadBtn");
                a.setBackground(aVar2);
            }
            this.f60317a.f60310d.animate().alpha(1.0f).setDuration(150).start();
            C47718bf.m103288a(new C25709a(true, C22392a.m55403a(this.f60317a).getAid()));
        }
    }

    /* renamed from: b */
    public final boolean mo46620b() {
        if (this.f60310d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo46616a() {
        int i;
        C25889a aVar;
        this.f60310d.setVisibility(8);
        Aweme aweme = this.f60307a;
        if (aweme == null) {
            C52711k.m112237a("mAweme");
        }
        if (aweme.getAwemeRawAd() != null) {
            Aweme aweme2 = this.f60307a;
            if (aweme2 == null) {
                C52711k.m112237a("mAweme");
            }
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            if (awemeRawAd == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) awemeRawAd, "mAweme.awemeRawAd!!");
            i = awemeRawAd.getNativeCardType();
        } else {
            i = 0;
        }
        switch (i) {
            case 0:
                LinearLayout linearLayout = this.f60310d;
                C22400a aVar2 = this.f60313h;
                if (aVar2 == null) {
                    C52711k.m112237a("adMaskParams");
                }
                aVar = new C25894d(linearLayout, aVar2);
                break;
            case 1:
                LinearLayout linearLayout2 = this.f60310d;
                C22400a aVar3 = this.f60313h;
                if (aVar3 == null) {
                    C52711k.m112237a("adMaskParams");
                }
                aVar = new C25892b(linearLayout2, aVar3);
                break;
            case 2:
                LinearLayout linearLayout3 = this.f60310d;
                C22400a aVar4 = this.f60313h;
                if (aVar4 == null) {
                    C52711k.m112237a("adMaskParams");
                }
                aVar = new C25893c(linearLayout3, aVar4);
                break;
            case 3:
                LinearLayout linearLayout4 = this.f60310d;
                C22400a aVar5 = this.f60313h;
                if (aVar5 == null) {
                    C52711k.m112237a("adMaskParams");
                }
                aVar = new C25895e(linearLayout4, aVar5);
                break;
            case 4:
                LinearLayout linearLayout5 = this.f60310d;
                C22400a aVar6 = this.f60313h;
                if (aVar6 == null) {
                    C52711k.m112237a("adMaskParams");
                }
                aVar = new C25896f(linearLayout5, aVar6);
                break;
            default:
                LinearLayout linearLayout6 = this.f60310d;
                C22400a aVar7 = this.f60313h;
                if (aVar7 == null) {
                    C52711k.m112237a("adMaskParams");
                }
                aVar = new C25892b(linearLayout6, aVar7);
                break;
        }
        this.f60308b = aVar;
        C25889a aVar8 = this.f60308b;
        if (aVar8 == null) {
            C52711k.m112237a("maskLayoutDelegate");
        }
        aVar8.mo53215c();
        C25889a aVar9 = this.f60308b;
        if (aVar9 == null) {
            C52711k.m112237a("maskLayoutDelegate");
        }
        if (aVar9.f68420c.isAd()) {
            TextView a = aVar9.mo53212a();
            C52711k.m112236a((Object) a, "feedAdDownloadBtn");
            a.setText(C22436d.m55468a(aVar9.f68419b, aVar9.f68420c, true));
            Drawable aVar10 = new C22447a((float) C22444k.m55474a(2.0d), aVar9.f68419b.getResources().getColor(R.color.ss));
            if (C22434b.m55461a(aVar9.f68420c)) {
                aVar10 = C22431a.m55457a(aVar10.mutate(), C0726c.m2098c(aVar9.f68419b, R.color.a1x));
                C52711k.m112236a((Object) aVar10, "AdAnimationUtils.tintDra…r(mContext, R.color.s14))");
            }
            TextView a2 = aVar9.mo53212a();
            C52711k.m112236a((Object) a2, "feedAdDownloadBtn");
            a2.setBackground(aVar10);
        }
        OnClickListener onClickListener = aVar9;
        aVar9.mo53212a().setOnClickListener(onClickListener);
        aVar9.mo53214b().setOnClickListener(onClickListener);
        C22431a.m55458a(aVar9.mo53212a());
        C22431a.m55458a(aVar9.mo53214b());
    }

    public C22392a(LinearLayout linearLayout) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        this.f60310d = linearLayout;
    }

    /* renamed from: a */
    public static final /* synthetic */ Aweme m55403a(C22392a aVar) {
        Aweme aweme = aVar.f60307a;
        if (aweme == null) {
            C52711k.m112237a("mAweme");
        }
        return aweme;
    }

    /* renamed from: a */
    public final void mo46617a(C22400a aVar) {
        C52711k.m112240b(aVar, "adMaskParams");
        this.f60311f = aVar.mo46641b();
        this.f60307a = aVar.mo46642c();
        this.f60312g = aVar.mo46643d();
        RelativeLayout relativeLayout = aVar.f60336f;
        if (relativeLayout == null) {
            C52711k.m112237a("widgetContainer");
        }
        this.f60309c = relativeLayout;
        this.f60313h = aVar;
    }

    /* renamed from: a */
    public final boolean mo46619a(C22327c cVar) {
        C52711k.m112240b(cVar, "adMaskShowCallback");
        C22400a aVar = this.f60313h;
        if (aVar == null) {
            C52711k.m112237a("adMaskParams");
        }
        C22434b.m55466c(aVar.mo46644e());
        Aweme aweme = this.f60307a;
        if (aweme == null) {
            C52711k.m112237a("mAweme");
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            Map hashMap = new HashMap();
            C52711k.m112236a((Object) awemeRawAd, "it");
            hashMap.put("background_type", String.valueOf(awemeRawAd.getNativeCardType()));
            Context context = this.f60311f;
            if (context == null) {
                C52711k.m112237a("mContext");
            }
            Aweme aweme2 = this.f60307a;
            if (aweme2 == null) {
                C52711k.m112237a("mAweme");
            }
            C29979a.m70143a(context, aweme2, hashMap);
        }
        Context context2 = this.f60311f;
        if (context2 == null) {
            C52711k.m112237a("mContext");
        }
        Aweme aweme3 = this.f60307a;
        if (aweme3 == null) {
            C52711k.m112237a("mAweme");
        }
        C29979a.m70142a(context2, aweme3);
        this.f60310d.setAlpha(0.0f);
        RelativeLayout relativeLayout = this.f60309c;
        if (relativeLayout == null) {
            C52711k.m112237a("widgetContainer");
        }
        relativeLayout.setAlpha(1.0f);
        RelativeLayout relativeLayout2 = this.f60309c;
        if (relativeLayout2 == null) {
            C52711k.m112237a("widgetContainer");
        }
        relativeLayout2.animate().alpha(0.0f).setDuration(150).withEndAction(new C22395c(this, cVar)).start();
        return true;
    }

    /* renamed from: a */
    public final void mo46618a(boolean z, C22326b bVar) {
        C52711k.m112240b(bVar, "adMaskHideCallback");
        this.f60310d.setAlpha(1.0f);
        this.f60310d.animate().alpha(0.0f).setDuration(150).withEndAction(new C22394b(this, z, bVar)).start();
        if (!bVar.mo46464b()) {
            RelativeLayout relativeLayout = this.f60309c;
            if (relativeLayout == null) {
                C52711k.m112237a("widgetContainer");
            }
            relativeLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout2 = this.f60309c;
            if (relativeLayout2 == null) {
                C52711k.m112237a("widgetContainer");
            }
            relativeLayout2.setVisibility(0);
            RelativeLayout relativeLayout3 = this.f60309c;
            if (relativeLayout3 == null) {
                C52711k.m112237a("widgetContainer");
            }
            relativeLayout3.animate().alpha(1.0f).setDuration(150).start();
        }
    }
}
