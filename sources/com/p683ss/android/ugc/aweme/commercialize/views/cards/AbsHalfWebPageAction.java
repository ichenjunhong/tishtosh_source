package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26409b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction */
public abstract class AbsHalfWebPageAction implements C0183j, C0199s<C23274a> {

    /* renamed from: h */
    static final /* synthetic */ boolean f70312h = (!AbsHalfWebPageAction.class.desiredAssertionStatus());

    /* renamed from: b */
    protected Context f70313b;

    /* renamed from: c */
    protected Aweme f70314c;

    /* renamed from: d */
    protected C26718p f70315d;

    /* renamed from: e */
    protected DataCenter f70316e = new DataCenter();

    /* renamed from: f */
    protected boolean f70317f = false;

    /* renamed from: g */
    public boolean f70318g = false;

    /* renamed from: e */
    public void mo54521e() {
        mo54519c("click");
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        mo54519c("onCreate");
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        mo54519c("onResume");
    }

    /* renamed from: c */
    public final void mo54518c() {
        this.f70316e.mo48225a((C0199s<C23274a>) this);
        if (C47718bf.m103292e(this)) {
            C47718bf.m103291d(this);
        }
    }

    /* renamed from: g */
    public void mo54523g() {
        mo54519c("expand");
        this.f70318g = true;
    }

    /* renamed from: h */
    public void mo54524h() {
        mo54519c("collapse");
        this.f70318g = false;
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        mo54519c("onDestroy");
        this.f70315d.mo54560b().getLifecycle().mo325b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54516b() {
        if (this.f70316e != null) {
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_SHOW", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_HIDE", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_EXPAND", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: d */
    public void mo54520d() {
        mo54519c("show");
        mo54514a(new C26449a().mo54168a("othershow").mo54171b("card").mo54167a(this.f70314c).mo54169a(C26512f.m64134ab(this.f70314c)).mo54170a());
        if (this.f70317f) {
            this.f70315d.mo54559a(false);
        }
    }

    /* renamed from: f */
    public void mo54522f() {
        mo54519c("close");
        mo54514a(new C26449a().mo54168a("close").mo54171b("card").mo54167a(this.f70314c).mo54170a());
    }

    /* renamed from: a */
    public final void mo54512a(DataCenter dataCenter) {
        this.f70316e = dataCenter;
        mo54516b();
    }

    /* renamed from: b */
    public void mo54517b(String str) {
        mo54519c("expand fail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54514a(C26448c cVar) {
        StringBuilder sb = new StringBuilder("sendLog: ");
        sb.append(cVar.toString());
        mo54519c(sb.toString());
        C26088l.m63276a(this.f70313b, cVar);
        m64511b(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo54519c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        sb.append(hashCode());
        sb.append(" ");
        sb.append(str);
    }

    /* renamed from: a */
    public void mo54515a(String str) {
        StringBuilder sb = new StringBuilder("show fail: ");
        sb.append(str);
        mo54519c(sb.toString());
        mo54514a(new C26449a().mo54168a("othershow_fail").mo54171b("card").mo54172c(str).mo54167a(this.f70314c).mo54169a(C26512f.m64134ab(this.f70314c)).mo54170a());
    }

    /* renamed from: b */
    private void m64511b(C26448c cVar) {
        if (C26503d.m64061d(cVar.f69711a)) {
            if (f70312h || cVar.f69711a.getAwemeRawAd() != null) {
                AwemeRawAd awemeRawAd = cVar.f69711a.getAwemeRawAd();
                String str = cVar.f69712b;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1944956403) {
                    if (hashCode == 94750088 && str.equals("click")) {
                        c = 0;
                    }
                } else if (str.equals("othershow")) {
                    c = 1;
                }
                switch (c) {
                    case 0:
                        C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26687a<Object,Object,Object>(awemeRawAd));
                        return;
                    case 1:
                        if (awemeRawAd.getCardInfos() != null) {
                            String str2 = cVar.f69713c;
                            String str3 = "3";
                            if (TextUtils.equals(str2, "card")) {
                                str3 = "3";
                            }
                            if (TextUtils.equals(str2, "coupon")) {
                                str3 = "4";
                            }
                            if (awemeRawAd.getCardInfos().containsKey(str3)) {
                                C26060ay.f68819a.mo53545a("othershow", ((CardStruct) awemeRawAd.getCardInfos().get(str3)).getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26688b<Object,Object,Object>(this));
                                break;
                            }
                        }
                        break;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1528248849:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1501644853:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_CLICK_COVER")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1393672249:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL")) {
                        c = 2;
                        break;
                    }
                    break;
                case -201580690:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL")) {
                        c = 6;
                        break;
                    }
                    break;
                case 995285931:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_FAIL")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1538688450:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_COLLAPSE")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2116917719:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_HIDE")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2117244818:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo54520d();
                    return;
                case 1:
                    mo54515a((String) aVar.mo48246a());
                    return;
                case 2:
                    String str2 = (String) aVar.mo48246a();
                    StringBuilder sb = new StringBuilder("show cancel: ");
                    sb.append(str2);
                    mo54519c(sb.toString());
                    return;
                case 3:
                    mo54521e();
                    return;
                case 4:
                    C26409b bVar = (C26409b) aVar.mo48246a();
                    if (bVar == null || bVar.f69660b) {
                        mo54522f();
                        return;
                    }
                case 5:
                    mo54523g();
                    return;
                case 6:
                    mo54517b((String) aVar.mo48246a());
                    return;
                case 7:
                    mo54524h();
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C26080b mo54511a(C26080b bVar, Boolean bool) {
        if (bool.booleanValue()) {
            return bVar.mo53590b(this.f70314c);
        }
        return bVar.mo53578a(this.f70314c);
    }

    public AbsHalfWebPageAction(Context context, Aweme aweme, C26718p pVar) {
        this.f70313b = context;
        this.f70314c = aweme;
        this.f70315d = pVar;
        this.f70315d.mo54560b().getLifecycle().mo324a(this);
    }
}
