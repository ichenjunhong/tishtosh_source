package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C26685a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction */
public class TopPageAction extends AbsAdCardAction {

    /* renamed from: i */
    public C26686a f70326i;

    /* renamed from: j */
    public int f70327j;

    /* renamed from: k */
    private boolean f70328k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction$a */
    public interface C26686a {
        /* renamed from: a */
        void mo54532a(C26690d dVar);
    }

    /* renamed from: i */
    public final boolean mo54530i() {
        if (this.f70327j == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54516b() {
        if (this.f70316e != null) {
            this.f70316e.mo48226a("ON_AD_TOP_WEB_PAGE_SHOW", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (C0199s<C23274a>) this);
            this.f70316e.mo48226a("ON_AD_TOP_WEB_PAGE_HIDE", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: d */
    public final void mo54520d() {
        mo54519c("top page show");
        this.f70318g = true;
        this.f70315d.mo54558a("javascript:window.creative_showModal()");
        mo54514a(new C26449a().mo54168a("othershow").mo54171b("coupon").mo54167a(this.f70314c).mo54170a());
    }

    /* renamed from: f */
    public final void mo54522f() {
        mo54519c("top page close");
        this.f70318g = false;
        this.f70315d.mo54558a("javascript:window.creative_dismissModal()");
        if (this.f70328k) {
            mo54514a(new C26449a().mo54168a("close").mo54171b("coupon").mo54167a(this.f70314c).mo54170a());
        }
    }

    /* renamed from: a */
    public final void mo54506a(C26690d dVar) {
        if (this.f70326i != null) {
            this.f70326i.mo54532a(dVar);
        }
    }

    @C53771m
    public void onEvent(C26685a aVar) {
        mo54519c("top page committed");
        this.f70328k = false;
        this.f70316e.mo48228a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
    }

    /* renamed from: a */
    public final void mo54515a(String str) {
        StringBuilder sb = new StringBuilder("top page show fail: ");
        sb.append(str);
        mo54519c(sb.toString());
        mo54514a(new C26449a().mo54168a("othershow_fail").mo54171b("coupon").mo54172c(str).mo54167a(this.f70314c).mo54170a());
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1923750303) {
                if (hashCode != -200264351) {
                    if (hashCode == -199937252 && str.equals("ON_AD_TOP_WEB_PAGE_SHOW")) {
                        c = 0;
                    }
                } else if (str.equals("ON_AD_TOP_WEB_PAGE_HIDE")) {
                    c = 2;
                }
            } else if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW_FAIL")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo54520d();
                    return;
                case 1:
                    mo54515a((String) aVar.mo48246a());
                    return;
                case 2:
                    mo54522f();
                    break;
            }
        }
    }

    public TopPageAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
        this.f70328k = true;
        this.f70309a = R.drawable.dfh;
    }
}
