package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.ugc.aweme.C22551ak;
import com.p683ss.android.ugc.aweme.C22551ak.C22552a;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.bean.C20933a;
import com.p683ss.android.ugc.aweme.account.bean.C20935b;
import com.p683ss.android.ugc.aweme.account.bean.C20936c;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.services.BaseBindService */
public abstract class BaseBindService implements C0183j, C22551ak {
    private boolean mKeepCallback;
    private C0184k mLifeOwner;
    private C20840g mResult;

    public void bind(AppCompatActivity appCompatActivity, C20933a aVar, C22552a aVar2) {
    }

    public void bindEmail(Activity activity, String str, Bundle bundle, C20840g gVar) {
    }

    public C20935b bindWithApi(Context context, C20933a aVar) throws Exception {
        return null;
    }

    public void changeEmail(Activity activity, String str, Bundle bundle, C20840g gVar) {
    }

    public void checkVcdPhoneRequired(C17410f<Boolean, C52860x> fVar) {
    }

    public C20936c getBindToken(Context context, C20933a aVar) throws Exception {
        return null;
    }

    public C22551ak keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void returnAuthorizeResult(String str, boolean z) {
    }

    public void syncAllVideos(Context context, C20933a aVar, C22552a aVar2) {
    }

    public void unBind(Context context, C20933a aVar, C22552a aVar2) {
    }

    public void unBindWithApi(Context context, C20933a aVar) throws Exception {
    }

    public void verifyEmail(Activity activity, String str, Bundle bundle, C20840g gVar) {
    }

    public boolean hasPlatformBound() {
        return C19718b.m48210a().mo41124b();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.mLifeOwner != null) {
            this.mLifeOwner.getLifecycle().mo325b(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public Intent getAuthorizeActivityStartIntent(Context context) {
        return new Intent(context, AuthorizeActivity.class);
    }

    public boolean isPlatformBound(String str) {
        return C19718b.m48210a().mo41123a(str);
    }

    public void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            this.mResult.onResult(i, i2, obj);
        }
        this.mResult = null;
    }

    public void bindMobile(Activity activity, String str, Bundle bundle, C20840g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0184k)) {
            C0184k kVar = (C0184k) activity;
            this.mLifeOwner = kVar;
            kVar.getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }

    public void modifyMobile(Activity activity, String str, Bundle bundle, C20840g gVar) {
        this.mResult = gVar;
        if (!this.mKeepCallback && (activity instanceof C0184k)) {
            C0184k kVar = (C0184k) activity;
            this.mLifeOwner = kVar;
            kVar.getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
    }
}
