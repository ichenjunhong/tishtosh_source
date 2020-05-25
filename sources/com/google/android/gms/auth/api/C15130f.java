package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C15152g;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
final class C15130f extends C15212a<C15152g, GoogleSignInOptions> {
    C15130f() {
    }

    /* renamed from: a */
    public final /* synthetic */ C15222f mo27863a(Context context, Looper looper, C15441d dVar, Object obj, C15235b bVar, C15236c cVar) {
        C15152g gVar = new C15152g(context, looper, dVar, (GoogleSignInOptions) obj, bVar, cVar);
        return gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ List mo27906a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo27920a();
    }
}
