package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.internal.C15328d;
import com.google.android.gms.common.p1035b.C15368a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C15153h {

    /* renamed from: a */
    private static C15368a f39192a = new C15368a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m31346a(Context context, GoogleSignInOptions googleSignInOptions) {
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: a */
    static void m31347a(Context context) {
        C15159n.m31354a(context).mo27970a();
        for (C15233f d : C15233f.m31488a()) {
            d.mo28108d();
        }
        C15328d.m31840b();
    }
}
