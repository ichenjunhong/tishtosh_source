package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;

/* renamed from: com.ss.android.ugc.aweme.ak */
public interface C22551ak {

    /* renamed from: com.ss.android.ugc.aweme.ak$a */
    public interface C22552a {
    }

    void bindEmail(Activity activity, String str, Bundle bundle, C20840g gVar);

    void bindMobile(Activity activity, String str, Bundle bundle, C20840g gVar);

    void changeEmail(Activity activity, String str, Bundle bundle, C20840g gVar);

    boolean enableNewPhoneBindFlow();

    Intent getAuthorizeActivityStartIntent(Context context);

    C23786bf getVerificationService();

    boolean isPlatformBound(String str);

    C22551ak keepCallback();

    void modifyMobile(Activity activity, String str, Bundle bundle, C20840g gVar);

    void setAuthorzieBindResult(C23855bk bkVar);

    void verifyEmail(Activity activity, String str, Bundle bundle, C20840g gVar);
}
