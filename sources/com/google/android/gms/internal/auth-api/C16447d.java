package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.auth.api.C15106a;
import com.google.android.gms.auth.api.C15106a.C15107a;
import com.google.android.gms.auth.api.credentials.C15120a;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.auth-api.d */
public final class C16447d implements C15120a {
    /* renamed from: a */
    public final PendingIntent mo27895a(C15233f fVar, HintRequest hintRequest) {
        C15464q.m32124a(fVar, (Object) "client must not be null");
        C15464q.m32124a(hintRequest, (Object) "request must not be null");
        C15107a aVar = ((C16448e) fVar.mo28096a((C15214c<C>) C15106a.f39002a)).f46353a;
        Context b = fVar.mo28104b();
        C15464q.m32124a(b, (Object) "context must not be null");
        C15464q.m32124a(hintRequest, (Object) "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        return PendingIntent.getActivity(b, 2000, putExtra, 134217728);
    }
}
