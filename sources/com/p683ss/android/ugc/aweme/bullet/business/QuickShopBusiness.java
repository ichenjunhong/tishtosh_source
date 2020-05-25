package com.p683ss.android.ugc.aweme.bullet.business;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.QuickShopBusiness */
public final class QuickShopBusiness extends Business {

    /* renamed from: b */
    public static final String f64351b = f64351b;

    /* renamed from: c */
    public static final C24250a f64352c = new C24250a(null);

    /* renamed from: a */
    public boolean f64353a;

    /* renamed from: d */
    private boolean f64354d;

    /* renamed from: e */
    private boolean f64355e;

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.QuickShopBusiness$a */
    public static final class C24250a {
        private C24250a() {
        }

        public /* synthetic */ C24250a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo50005a() {
        this.f64354d = true;
    }

    /* renamed from: b */
    public final void mo50007b() {
        if (m59361c()) {
            this.f64354d = false;
            this.f64353a = false;
            this.f64355e = false;
        }
    }

    /* renamed from: c */
    private final boolean m59361c() {
        C10578a b = this.f64316k.mo50019b();
        if (!(b instanceof C24310h)) {
            return false;
        }
        C24310h hVar = (C24310h) b;
        Integer num = (Integer) hVar.f64504g.mo18457b();
        if (num != null && num.intValue() == 2 && TextUtils.equals((CharSequence) hVar.f64488Y.mo18457b(), "user_profile")) {
            return true;
        }
        return false;
    }

    public QuickShopBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo50006a(String str) {
        String str2;
        if (!this.f64355e && m59361c()) {
            this.f64355e = true;
            if (!this.f64353a) {
                str2 = "failed_user";
            } else if (this.f64354d) {
                str2 = "failed_app";
            } else {
                str2 = "success";
            }
            C26890h.m65011a("enter_flash_store", C23089d.m56640a().mo47829a("author_id", str).mo47829a("enter_method", "click").mo47829a("is_success", str2).f61491a);
        }
    }
}
