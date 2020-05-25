package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public final class C15138b implements C15358j {

    /* renamed from: a */
    public GoogleSignInAccount f39167a;

    /* renamed from: b */
    private Status f39168b;

    public C15138b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f39167a = googleSignInAccount;
        this.f39168b = status;
    }

    /* renamed from: a */
    public final Status mo27935a() {
        return this.f39168b;
    }
}
