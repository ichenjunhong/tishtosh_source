package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordService$$Lambda$0 */
final /* synthetic */ class PasswordService$$Lambda$0 implements C20840g {
    private final Bundle arg$1;
    private final Activity arg$2;
    private final C20840g arg$3;

    PasswordService$$Lambda$0(Bundle bundle, Activity activity, C20840g gVar) {
        this.arg$1 = bundle;
        this.arg$2 = activity;
        this.arg$3 = gVar;
    }

    public final void onResult(int i, int i2, Object obj) {
        PasswordService.lambda$changePassword$0$PasswordService(this.arg$1, this.arg$2, this.arg$3, i, i2, obj);
    }
}
