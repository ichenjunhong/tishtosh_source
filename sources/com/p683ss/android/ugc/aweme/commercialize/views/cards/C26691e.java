package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26105a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26409b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26431bp;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26519j;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26519j.C26520a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26524k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26525l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26528m;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer.C26567l;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer.C26568m;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer.C26569n;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer.C26570o;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer.C26571a;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26718p.C26719a;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30345n;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.e */
public class C26691e implements C0199s<C23274a>, C26720q {

    /* renamed from: r */
    private static final String f70339r = "e";

    /* renamed from: a */
    public Context f70340a;

    /* renamed from: b */
    public Aweme f70341b;

    /* renamed from: c */
    public AdHalfWebPageContainer f70342c;

    /* renamed from: d */
    public AdHalfWebPageMaskLayer f70343d;

    /* renamed from: e */
    public C0654k f70344e;

    /* renamed from: f */
    public AbsHalfWebPageAction f70345f;

    /* renamed from: g */
    public int f70346g;

    /* renamed from: h */
    TopPageAction f70347h;

    /* renamed from: i */
    public AdHalfWebPageMaskLayer f70348i;

    /* renamed from: j */
    public DataCenter f70349j;

    /* renamed from: k */
    Handler f70350k;

    /* renamed from: l */
    long f70351l;

    /* renamed from: m */
    long f70352m;

    /* renamed from: n */
    public C30016ag f70353n;

    /* renamed from: o */
    public boolean f70354o;

    /* renamed from: p */
    String f70355p;

    /* renamed from: q */
    boolean f70356q;

    /* renamed from: s */
    private AdHalfWebPageContainer f70357s;

    /* renamed from: t */
    private C0654k f70358t;

    /* renamed from: u */
    private Runnable f70359u;

    /* renamed from: v */
    private C26519j f70360v;

    /* renamed from: w */
    private C26431bp f70361w;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.e$a */
    public static class C26699a {

        /* renamed from: a */
        public C26691e f70371a = new C26691e();
    }

    /* renamed from: h */
    private void m64556h() {
        if (this.f70340a instanceof FragmentActivity) {
            C26718p a = mo54533a(true);
            if (a != null) {
                this.f70358t.mo2225a().mo2177a(a.mo54563e()).mo2195c();
            }
        }
    }

    private C26691e() {
        this.f70349j = new DataCenter();
        this.f70350k = new Handler(Looper.getMainLooper());
        this.f70351l = -1;
        this.f70352m = -1;
        this.f70354o = false;
        this.f70355p = null;
        this.f70356q = false;
    }

    /* renamed from: g */
    private void m64555g() {
        if (this.f70344e != null && mo54533a(false) != null) {
            C0679r a = this.f70344e.mo2225a();
            C26718p a2 = mo54533a(false);
            if (a2 != null) {
                a.mo2177a(a2.mo54563e());
                a.mo2195c();
            }
        }
    }

    /* renamed from: d */
    public void mo54542d() {
        if (this.f70359u != null && this.f70351l > 0 && this.f70352m > 0) {
            this.f70352m = System.currentTimeMillis();
            this.f70350k.removeCallbacks(this.f70359u);
            this.f70350k.postDelayed(this.f70359u, this.f70351l);
        }
    }

    /* renamed from: e */
    public void mo54543e() {
        if (this.f70359u != null && this.f70352m > 0 && this.f70351l > 0) {
            this.f70351l -= System.currentTimeMillis() - this.f70352m;
            this.f70350k.removeCallbacks(this.f70359u);
        }
    }

    /* renamed from: b */
    public final void mo54539b() {
        if (!this.f70354o) {
            this.f70354o = true;
            if (this.f70342c != null && this.f70342c.mo54261b()) {
                this.f70345f.mo54522f();
            }
            m64555g();
            m64556h();
            if (this.f70345f != null) {
                this.f70345f.mo54518c();
                this.f70345f = null;
            }
            if (this.f70347h != null) {
                this.f70347h.mo54518c();
                this.f70347h = null;
            }
            this.f70349j.mo48225a((C0199s<C23274a>) this);
            if (this.f70350k != null) {
                this.f70350k.removeCallbacksAndMessages(null);
                this.f70350k = null;
                this.f70359u = null;
            }
            C26525l.m64179h(this.f70341b);
        }
    }

    /* renamed from: a */
    public final void mo54534a() {
        if (!this.f70354o && this.f70340a != null && (this.f70340a instanceof FragmentActivity)) {
            this.f70358t = ((FragmentActivity) this.f70340a).getSupportFragmentManager();
            this.f70357s = (AdHalfWebPageContainer) ((FragmentActivity) this.f70340a).findViewById(R.id.d3);
            this.f70348i = (AdHalfWebPageMaskLayer) ((FragmentActivity) this.f70340a).findViewById(R.id.d4);
            if (this.f70358t != null && this.f70357s != null && this.f70348i != null) {
                CardStruct A = C26512f.m64049A(this.f70341b);
                if (A == null) {
                    this.f70357s.setVisibility(8);
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) this.f70357s.getLayoutParams();
                layoutParams.height = C26525l.m64170a(A, this.f70357s);
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.f70357s.mo54263d();
                this.f70357s.setLayoutParams(layoutParams);
                this.f70348i.mo54292b();
                C0679r a = this.f70358t.mo2225a();
                C26709o a2 = C26709o.m64582a(C26512f.m64117S(this.f70341b));
                a2.mo54557a((C26719a) new C26719a() {
                    /* renamed from: a */
                    public final void mo54545a() {
                    }

                    /* renamed from: b */
                    public final void mo54546b() {
                        C26691e.this.f70349j.mo48228a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                    }
                });
                this.f70347h = new TopPageAction(this.f70340a, this.f70341b, a2);
                this.f70347h.mo54512a(this.f70349j);
                this.f70347h.f70326i = new C26700f(this);
                a.mo2176a(R.id.d3, a2.mo54563e(), "card_tag_top_page");
                a.mo2193b(a2.mo54563e()).mo2195c();
            }
        }
    }

    /* renamed from: c */
    public final void mo54541c() {
        if (!this.f70354o) {
            String b = mo54538b(false);
            if (!TextUtils.isEmpty(b)) {
                this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (Object) b);
            } else if (!this.f70342c.f69933b) {
                final C26718p a = mo54533a(false);
                if (a != null) {
                    a.mo54559a(true);
                    this.f70360v = new C26519j((Activity) this.f70340a, this.f70342c);
                    this.f70360v.mo54208b();
                    this.f70360v.f69846c = new C26520a() {
                        /* renamed from: a */
                        public final void mo54210a(boolean z) {
                            a.mo54562b(z);
                        }
                    };
                    C26528m.m64183a(this.f70340a, true);
                    C26528m.m64181a(this.f70340a, a.mo54564f());
                    int width = this.f70342c.getWidth();
                    int a2 = C26525l.m64170a(C26525l.m64171a(this.f70341b), this.f70342c);
                    if (!this.f70342c.mo54260a()) {
                        this.f70342c.mo54266g();
                        this.f70342c.mo54256a(this.f70342c.getWidth(), a2);
                        this.f70342c.mo54270h();
                    }
                    this.f70342c.mo54257a(width, a2, 100);
                    this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_EXPAND", (Object) null);
                    this.f70343d.setCallback(new C26571a() {
                        /* renamed from: b */
                        public final void mo54302b() {
                        }

                        /* renamed from: a */
                        public final void mo54300a() {
                            C26691e.this.f70343d.postDelayed(new C26707m(this), 200);
                            C47718bf.m103288a(new C30345n(false));
                        }

                        /* renamed from: a */
                        public final void mo54301a(boolean z) {
                            if (C26691e.this.f70346g == 0 && z) {
                                if (!C48121w.m104087I()) {
                                    C48121w.m104249M().mo95291x();
                                } else {
                                    C50158g a = C26691e.m64553a(C26691e.this.f70353n);
                                    if (a != null) {
                                        a.mo60214ae();
                                    } else {
                                        C50130a.m108170a().mo60214ae();
                                    }
                                }
                            }
                            C47718bf.m103288a(new C30345n(true));
                        }
                    });
                    this.f70343d.mo54291a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo54544f() {
        if (!this.f70354o) {
            C26525l.m64172a(this.f70340a, this.f70341b, this.f70342c);
            AdHalfWebPageContainer adHalfWebPageContainer = this.f70342c;
            boolean f = C26525l.m64177f(this.f70341b);
            if (!adHalfWebPageContainer.f69934c) {
                adHalfWebPageContainer.mo54262c();
            }
            if (f) {
                adHalfWebPageContainer.setTranslationX(0.0f);
                adHalfWebPageContainer.setTranslationY((float) C23728o.m58241a(17.0d));
                adHalfWebPageContainer.animate().alpha(1.0f).translationY(0.0f).withStartAction(new C26567l(adHalfWebPageContainer)).setInterpolator(new LinearInterpolator()).setDuration(280).withEndAction(new C26568m(adHalfWebPageContainer)).start();
            } else {
                adHalfWebPageContainer.setTranslationX(adHalfWebPageContainer.getToTransX());
                adHalfWebPageContainer.setTranslationY(0.0f);
                adHalfWebPageContainer.animate().alpha(1.0f).translationX(0.0f).withStartAction(new C26569n(adHalfWebPageContainer)).setDuration(200).withEndAction(new C26570o(adHalfWebPageContainer)).start();
            }
            int e = C26525l.m64176e(this.f70341b);
            if (e > 0) {
                this.f70359u = new C26702h(this);
                this.f70352m = System.currentTimeMillis();
                this.f70351l = (long) (e * 1000);
                this.f70350k.postDelayed(this.f70359u, this.f70351l);
            }
            this.f70356q = true;
            if (C26512f.m64070m(this.f70341b) && !C26512f.m64119U(this.f70341b)) {
                AwemeSplashInfo l = C26512f.m64069l(this.f70341b);
                if (l != null) {
                    l.adCardShownOnce = true;
                }
            }
            this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_SHOW", (Object) null);
            C26072c.m63176b(this.f70341b, 0);
            Aweme aweme = this.f70341b;
            if (aweme != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("card_type", C26524k.m64164a(aweme));
                    jSONObject.put("url", C26524k.m64169c(aweme));
                    if (aweme.isAd()) {
                        jSONObject.put("creative_id", C26524k.m64167b(aweme));
                    }
                } catch (Exception unused) {
                }
                C23569o.m57776a("aweme_ad_card_show_error_rate", 0, jSONObject);
                C23569o.m57776a("aweme_ad_card_show_error_rate_v2", 0, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public static C50158g m64553a(C30016ag agVar) {
        if (agVar == null) {
            return null;
        }
        return agVar.mo60242m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C26718p mo54533a(boolean z) {
        if (z) {
            if (this.f70358t != null) {
                Fragment a = this.f70358t.mo2224a("card_tag_top_page");
                if (a instanceof C26718p) {
                    return (C26718p) a;
                }
            }
        } else if (this.f70344e != null) {
            Fragment a2 = this.f70344e.mo2224a("card_default");
            if (a2 instanceof C26718p) {
                return (C26718p) a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo54538b(boolean z) {
        boolean z2;
        AbsHalfWebPageAction absHalfWebPageAction;
        C26718p a = mo54533a(z);
        boolean z3 = false;
        if (a != null) {
            z3 = a.mo54565g();
            if (z) {
                absHalfWebPageAction = this.f70347h;
            } else {
                absHalfWebPageAction = this.f70345f;
            }
            z2 = m64554a(z3, absHalfWebPageAction);
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("checkLoadStatus() called isTopPage = ");
            sb.append(z);
            sb.append(" loadSuccess = ");
            sb.append(z3);
            sb.append(" renderSuccess = ");
            sb.append(z2);
            return null;
        } else if (!z3) {
            return "data_load_fail";
        } else {
            return "load_timeout";
        }
    }

    /* renamed from: a */
    public final void mo54535a(int i) {
        if (!this.f70354o) {
            final C26718p a = mo54533a(true);
            if (a != null) {
                if (!C20902b.m53242a().isLogin()) {
                    C27965f.m66724a(a.mo54563e(), "", "click_get_coupon", C47661ab.m103163a().mo94972a("login_title", this.f70340a.getString(R.string.ajj)).f120139a);
                } else if (this.f70357s != null && this.f70358t != null) {
                    String b = mo54538b(true);
                    if (!TextUtils.isEmpty(b)) {
                        this.f70349j.mo48228a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (Object) b);
                        return;
                    }
                    a.mo54559a(true);
                    if ((this.f70342c.mo54260a() || (this.f70342c.f69934c && this.f70342c.getAlpha() == 1.0f)) && (i == 17 || i == 25 || i == 3)) {
                        this.f70342c.mo54259a(C26525l.m64177f(this.f70341b));
                    }
                    this.f70347h.f70327j = i;
                    boolean z = false;
                    if (this.f70340a instanceof Activity) {
                        if (this.f70361w != null) {
                            this.f70361w.mo54157a(false);
                            this.f70361w = null;
                        }
                        this.f70361w = new C26431bp((Activity) this.f70340a) {
                            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                                if (i != 4) {
                                    return false;
                                }
                                C26691e.this.f70349j.mo48228a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                                return true;
                            }
                        };
                        this.f70361w.mo54157a(true);
                    }
                    this.f70348i.setCallback(new C26571a() {
                        /* renamed from: a */
                        public final void mo54300a() {
                            C26691e.this.f70348i.postDelayed(new C26708n(this), 200);
                        }

                        /* renamed from: b */
                        public final void mo54302b() {
                            C26691e.this.f70349j.mo48228a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                        }

                        /* renamed from: a */
                        public final void mo54301a(boolean z) {
                            if (z) {
                                if (!C48121w.m104087I()) {
                                    C48121w.m104249M().mo95291x();
                                    return;
                                }
                                C50158g a = C26691e.m64553a(C26691e.this.f70353n);
                                if (a != null) {
                                    a.mo60214ae();
                                    return;
                                }
                                C50130a.m108170a().mo60214ae();
                            }
                        }
                    });
                    this.f70348i.mo54291a();
                    this.f70358t.mo2225a().mo2196c(a.mo54563e()).mo2195c();
                    Aweme aweme = this.f70341b;
                    C52711k.m112240b(aweme, "aweme");
                    CardStruct b2 = C26525l.m64173b(aweme);
                    if (b2 != null && (b2.getCardType() == 9 || b2.getCardType() == 1001)) {
                        z = true;
                    }
                    if (z) {
                        this.f70360v = new C26519j((Activity) this.f70340a, this.f70357s);
                        this.f70360v.mo54208b();
                        this.f70360v.f69846c = new C26520a() {
                            /* renamed from: a */
                            public final void mo54210a(boolean z) {
                                a.mo54562b(z);
                            }
                        };
                        C26528m.m64183a(this.f70340a, true);
                        C26528m.m64181a(this.f70340a, a.mo54564f());
                    }
                    int width = this.f70357s.getWidth();
                    int height = this.f70357s.getHeight();
                    if (!this.f70357s.mo54260a()) {
                        this.f70357s.mo54266g();
                        this.f70357s.mo54256a(this.f70357s.getWidth(), height);
                        this.f70357s.mo54270h();
                    }
                    this.f70357s.mo54257a(width, height, 100);
                    this.f70349j.mo48228a("ON_AD_TOP_WEB_PAGE_SHOW", (Object) null);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo54537a(String str) {
        this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (Object) str);
        C26524k.m64168b(this.f70341b, str);
    }

    public /* synthetic */ void onChanged(Object obj) {
        boolean z;
        C23274a aVar = (C23274a) obj;
        if (!this.f70354o && aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            boolean z2 = false;
            switch (str.hashCode()) {
                case -2033402377:
                    if (str.equals("ad_comment_dialog_visible")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1461741929:
                    if (str.equals("ACTION_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1282907273:
                    if (str.equals("ad_share_dialog_visible")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1106283978:
                    if (str.equals("ON_AD_FORM_MASK_HIDE")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1105956879:
                    if (str.equals("ON_AD_FORM_MASK_SHOW")) {
                        c = 13;
                        break;
                    }
                    break;
                case -1023452510:
                    if (str.equals("on_ad_light_web_page_hide")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1023125411:
                    if (str.equals("on_ad_light_web_page_show")) {
                        c = 7;
                        break;
                    }
                    break;
                case -786416465:
                    if (str.equals("ACTION_HALF_WEB_PAGE_COLLAPSE")) {
                        c = 2;
                        break;
                    }
                    break;
                case -481195123:
                    if (str.equals("on_ad_pop_up_web_page_hide")) {
                        c = 10;
                        break;
                    }
                    break;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show")) {
                        c = 9;
                        break;
                    }
                    break;
                case -293484551:
                    if (str.equals("ON_SIMILAR_ADVERT_HIDE")) {
                        c = 16;
                        break;
                    }
                    break;
                case 662448029:
                    if (str.equals("ON_AD_COMMON_MASK_HIDE")) {
                        c = 12;
                        break;
                    }
                    break;
                case 662775128:
                    if (str.equals("ON_AD_COMMON_MASK_SHOW")) {
                        c = 11;
                        break;
                    }
                    break;
                case 683265860:
                    if (str.equals("ACTION_HALF_WEB_PAGE_HIDE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 683592959:
                    if (str.equals("ACTION_HALF_WEB_PAGE_SHOW")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1000414804:
                    if (str.equals("ACTION_TOP_WEB_PAGE_HIDE")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1808895717:
                    if (str.equals("ON_SIMILAR_ADVERT_DATA_RECEIVE")) {
                        c = 15;
                        break;
                    }
                    break;
            }
            String str2 = null;
            switch (c) {
                case 0:
                    C26105a aVar2 = (C26105a) aVar.mo48246a();
                    if (aVar2 != null) {
                        this.f70350k.postDelayed(new C26701g(this, aVar2), (long) aVar2.f68909a);
                    }
                    return;
                case 1:
                    C26409b bVar = (C26409b) aVar.mo48246a();
                    if (this.f70342c.mo54261b()) {
                        this.f70342c.mo54259a(C26525l.m64177f(this.f70341b));
                        this.f70342c.postDelayed(new C26703i(this), C26525l.m64178g(this.f70341b));
                        this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_HIDE", (Object) bVar);
                    }
                    C30367g.m71282a().f79378g = true;
                    return;
                case 2:
                    if (aVar.mo48246a() != null) {
                        z = ((Boolean) aVar.mo48246a()).booleanValue();
                    } else {
                        z = false;
                    }
                    if (this.f70360v != null) {
                        this.f70360v.mo54209c();
                        this.f70360v = null;
                    }
                    if (this.f70361w != null) {
                        this.f70361w.mo54157a(false);
                        this.f70361w = null;
                    }
                    C26528m.m64183a(this.f70340a, false);
                    C26528m.m64180a(this.f70340a);
                    this.f70342c.mo54258a(400, (Runnable) new C26704j(this));
                    this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (Object) null);
                    this.f70343d.dismiss(z);
                    C30367g.m71282a().f79378g = true;
                    return;
                case 3:
                    if (this.f70342c.mo54261b() && this.f70342c.getTranslationX() == 0.0f && !this.f70342c.f69935d) {
                        this.f70342c.mo54264e();
                        this.f70349j.mo48228a("ON_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN", (Object) null);
                        return;
                    }
                case 4:
                    if (this.f70360v != null) {
                        this.f70360v.mo54209c();
                        this.f70360v = null;
                    }
                    if (this.f70361w != null) {
                        this.f70361w.mo54157a(false);
                        this.f70361w = null;
                    }
                    C26528m.m64183a(this.f70340a, false);
                    C26528m.m64180a(this.f70340a);
                    this.f70357s.mo54258a(400, (Runnable) new C26705k(this));
                    AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = this.f70348i;
                    if (this.f70347h != null && !this.f70347h.mo54530i()) {
                        z2 = true;
                    }
                    adHalfWebPageMaskLayer.dismiss(z2);
                    this.f70349j.mo48228a("ON_AD_TOP_WEB_PAGE_HIDE", (Object) null);
                    C30367g.m71282a().f79378g = true;
                    return;
                case 5:
                    if (aVar.mo48246a() != null) {
                        z2 = ((Boolean) aVar.mo48246a()).booleanValue();
                    }
                    if (z2) {
                        str2 = "comment_block";
                    }
                    this.f70355p = str2;
                    return;
                case 6:
                    if (aVar.mo48246a() != null) {
                        z2 = ((Boolean) aVar.mo48246a()).booleanValue();
                    }
                    if (z2) {
                        str2 = "share_block";
                    }
                    this.f70355p = str2;
                    return;
                case 7:
                    this.f70355p = "lightpage_block";
                    return;
                case 8:
                    this.f70355p = null;
                    return;
                case 9:
                    this.f70355p = "popup_webpage_block";
                    return;
                case 10:
                    this.f70355p = null;
                    return;
                case 11:
                    mo54543e();
                    return;
                case 12:
                    mo54542d();
                    return;
                case 13:
                    mo54543e();
                    return;
                case 14:
                    mo54542d();
                    return;
                case 15:
                    this.f70355p = "similar_recommend_block";
                    return;
                case 16:
                    this.f70355p = null;
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m64554a(boolean z, AbsHalfWebPageAction absHalfWebPageAction) {
        if (this.f70345f instanceof AbsAdCardAction) {
            return ((AbsAdCardAction) absHalfWebPageAction).mo54507a();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo54536a(int i, int i2) {
        if (!this.f70354o) {
            if (i != 0 || i2 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f70342c.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C23728o.m58242a(this.f70340a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C23728o.m58242a(this.f70340a, i2);
                }
                this.f70342c.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: b */
    public final void mo54540b(int i, int i2) {
        if (!this.f70354o) {
            if (i != 0 || i2 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f70357s.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C23728o.m58242a(this.f70340a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C23728o.m58242a(this.f70340a, i2);
                }
                this.f70357s.setLayoutParams(layoutParams);
            }
        }
    }
}
