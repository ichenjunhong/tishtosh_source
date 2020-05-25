package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C15538a;
import com.google.android.gms.dynamite.DynamiteModule.C15539b;
import com.google.android.gms.dynamite.DynamiteModule.C15539b.C15540a;
import com.google.android.gms.dynamite.DynamiteModule.C15539b.C15541b;

/* renamed from: com.google.android.gms.dynamite.c */
final class C15546c implements C15539b {
    C15546c() {
    }

    /* renamed from: a */
    public final C15541b mo28531a(Context context, String str, C15540a aVar) throws C15538a {
        C15541b bVar = new C15541b();
        bVar.f40034a = aVar.mo28532a(context, str);
        if (bVar.f40034a != 0) {
            bVar.f40036c = -1;
        } else {
            bVar.f40035b = aVar.mo28533a(context, str, true);
            if (bVar.f40035b != 0) {
                bVar.f40036c = 1;
            }
        }
        return bVar;
    }
}
