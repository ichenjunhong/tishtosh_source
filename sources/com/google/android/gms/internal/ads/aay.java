package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;

@C16299uq
public final class aay implements aba {
    /* renamed from: a */
    public final aga<String> mo28581a(String str, PackageInfo packageInfo) {
        return afp.m32820a(str);
    }

    /* renamed from: a */
    public final aga<C14903a> mo28580a(Context context) {
        agl agl = new agl();
        if (aes.m32761b(context)) {
            acb.m32566a((Runnable) new aaz(this, context, agl));
        }
        return agl;
    }
}
