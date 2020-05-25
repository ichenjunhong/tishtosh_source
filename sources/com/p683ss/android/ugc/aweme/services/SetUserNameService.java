package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.C23762bb;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.SetUserNameService */
public final class SetUserNameService implements C23762bb {
    private C20840g mResult;

    public final void returnResult(int i, int i2, Object obj) {
        if (this.mResult != null) {
            C20840g gVar = this.mResult;
            if (gVar == null) {
                C52711k.m112234a();
            }
            gVar.onResult(i, i2, obj);
            this.mResult = null;
        }
    }

    public final void setUserNameForThirdParty(Activity activity, Bundle bundle, C20840g gVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "data");
        C52711k.m112240b(gVar, "result");
        Intent intent = new Intent(activity, SignUpOrLoginActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("next_page", C21850i.CREATE_USERNAME.getValue());
        activity.startActivity(intent);
        this.mResult = gVar;
    }
}
