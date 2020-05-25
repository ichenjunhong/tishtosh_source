package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.signin.internal.C17148a;

/* renamed from: com.google.android.gms.signin.c */
final class C17145c extends C15212a<C17148a, C17142a> {
    C17145c() {
    }

    /* renamed from: a */
    public final /* synthetic */ C15222f mo27863a(Context context, Looper looper, C15441d dVar, Object obj, C15235b bVar, C15236c cVar) {
        C17142a aVar = (C17142a) obj;
        if (aVar == null) {
            aVar = C17142a.f48516a;
        }
        C17148a aVar2 = new C17148a(context, looper, true, dVar, aVar, bVar, cVar);
        return aVar2;
    }
}
