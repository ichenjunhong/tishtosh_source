package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.IAccountService.C20836c;
import java.io.Serializable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.services.LoginService$$Lambda$0 */
final /* synthetic */ class LoginService$$Lambda$0 implements C0011g {
    private final LoginService arg$1;
    private final C20836c arg$2;
    private final boolean arg$3;
    private final Serializable arg$4;

    LoginService$$Lambda$0(LoginService loginService, C20836c cVar, boolean z, Serializable serializable) {
        this.arg$1 = loginService;
        this.arg$2 = cVar;
        this.arg$3 = z;
        this.arg$4 = serializable;
    }

    public final Object then(C0013i iVar) {
        return this.arg$1.lambda$showLoginAndRegisterView$0$LoginService(this.arg$2, this.arg$3, this.arg$4, iVar);
    }
}
