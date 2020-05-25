package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25718h;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C26685a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction */
public class FormAdCardAction extends AbsAdCardAction {

    /* renamed from: i */
    private boolean f70321i;

    /* renamed from: f */
    public final void mo54522f() {
        if (!this.f70321i && !this.f70318g) {
            super.mo54522f();
        }
    }

    /* renamed from: g */
    public final void mo54523g() {
        super.mo54523g();
        this.f70315d.mo54558a("javascript:window.dialogPopUp()");
    }

    /* renamed from: h */
    public final void mo54524h() {
        super.mo54524h();
        if (!this.f70321i) {
            C26088l.m63389z(this.f70313b, this.f70314c);
        }
    }

    /* renamed from: e */
    public final void mo54521e() {
        super.mo54521e();
        mo54514a(new C26449a().mo54168a("click").mo54171b("card").mo54167a(this.f70314c).mo54170a());
        if (C26540w.m64212a(this.f70313b, this.f70314c, 33)) {
            this.f70321i = false;
            mo54522f();
            return;
        }
        C47718bf.m103288a(new C25718h(this.f70314c, 2));
    }

    /* renamed from: b */
    public final void mo54517b(String str) {
        super.mo54517b(str);
        C26088l.m63254A(this.f70313b, this.f70314c);
    }

    @C53771m
    public void onEvent(C26685a aVar) {
        this.f70321i = false;
        this.f70316e.mo48228a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) null);
    }

    public FormAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
        this.f70317f = true;
    }
}
