package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.IAccountService.C20836c;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.services.LoginService$$Lambda$1 */
final /* synthetic */ class LoginService$$Lambda$1 implements C0011g {
    private final LoginService arg$1;
    private final boolean arg$2;
    private final C20836c arg$3;

    LoginService$$Lambda$1(LoginService loginService, boolean z, C20836c cVar) {
        this.arg$1 = loginService;
        this.arg$2 = z;
        this.arg$3 = cVar;
    }

    public final Object then(C0013i iVar) {
        return this.arg$1.lambda$showLoginAndRegisterView$1$LoginService(this.arg$2, this.arg$3, iVar);
    }
}
