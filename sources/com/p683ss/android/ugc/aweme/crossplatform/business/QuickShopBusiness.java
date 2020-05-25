package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness */
public class QuickShopBusiness extends Business {

    /* renamed from: a */
    public boolean f71670a;

    /* renamed from: b */
    public boolean f71671b;

    /* renamed from: c */
    public boolean f71672c;

    /* renamed from: a */
    public Boolean mo55512a() {
        boolean z;
        if (this.f71633j == null || this.f71633j.f71719b == null || this.f71633j.f71719b.f71770y != 2 || !TextUtils.equals(this.f71633j.f71719b.f71771z, "user_profile")) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public QuickShopBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo55513a(String str) {
        String str2;
        if (!this.f71672c && mo55512a().booleanValue()) {
            this.f71672c = true;
            if (!this.f71671b) {
                str2 = "failed_user";
            } else if (this.f71670a) {
                str2 = "failed_app";
            } else {
                str2 = "success";
            }
            C26890h.m65011a("enter_flash_store", C23089d.m56640a().mo47829a("author_id", str).mo47829a("enter_method", "click").mo47829a("is_success", str2).f61491a);
        }
    }
}
