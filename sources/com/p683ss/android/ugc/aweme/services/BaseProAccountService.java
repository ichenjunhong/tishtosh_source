package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.C23330az;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;

/* renamed from: com.ss.android.ugc.aweme.services.BaseProAccountService */
public class BaseProAccountService implements C0183j, C23330az {
    private C0184k mLifeOwner;
    private C20840g mResult;

    public boolean enableNewPhoneBindFlow() {
        return false;
    }

    public void switchProAccount(int i, String str, String str2, int i2, C20840g gVar) {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().mo325b(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            this.mResult.onResult(i, i2, obj);
        }
    }

    public void bindProAccountMobile(Activity activity, String str, C20840g gVar, int i, String str2) {
        this.mResult = gVar;
        if (activity instanceof C0184k) {
            C0184k kVar = (C0184k) activity;
            this.mLifeOwner = kVar;
            kVar.getLifecycle().mo324a(this);
        }
    }
}
