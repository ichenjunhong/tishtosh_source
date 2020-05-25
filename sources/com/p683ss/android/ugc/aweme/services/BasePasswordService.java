package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.C23299aw;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;

/* renamed from: com.ss.android.ugc.aweme.services.BasePasswordService */
public abstract class BasePasswordService implements C0183j, C23299aw {
    private boolean mKeepCallback;
    private C0184k mLifeOwner;
    private C20840g mResult;

    public C23299aw keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().mo325b(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            this.mResult.onResult(i, i2, obj);
            this.mResult = null;
        }
    }

    public void setPassword(Activity activity, Bundle bundle, C20840g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0184k)) {
            C0184k kVar = (C0184k) activity;
            this.mLifeOwner = kVar;
            kVar.getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }

    public void changePassword(Activity activity, String str, String str2, Bundle bundle, C20840g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0184k)) {
            C0184k kVar = (C0184k) activity;
            this.mLifeOwner = kVar;
            kVar.getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }
}
