package com.p683ss.android.ugc.aweme.app.p1363a;

import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.base.component.C23505g;

/* renamed from: com.ss.android.ugc.aweme.app.a.m */
public class C22917m implements C20840g {

    /* renamed from: a */
    private C23505g f61246a;

    public C22917m(C23505g gVar) {
        this.f61246a = gVar;
    }

    public void onResult(int i, int i2, Object obj) {
        if (this.f61246a != null && i == 1) {
            if (i2 == 1) {
                this.f61246a.mo46279a();
                return;
            }
            this.f61246a.mo46280a(null);
        }
    }
}
