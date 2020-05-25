package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
public final class byh {

    /* renamed from: a */
    bgr f44573a;

    /* renamed from: b */
    boolean f44574b;

    /* renamed from: a */
    public final byl mo30862a(byte[] bArr) {
        return new byl(this, bArr);
    }

    public byh(Context context, String str, String str2) {
        C15740bx.m36941a(context);
        try {
            this.f44573a = (bgr) afd.m32800a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", byi.f44575a);
            C14886d.m30544a(context);
            this.f44573a.mo30140a(C14886d.m30544a(context), str, null);
            this.f44574b = true;
        } catch (RemoteException | aff | NullPointerException unused) {
            afc.m32792b("Cannot dynamite load clearcut");
        }
    }

    public byh(Context context) {
        C15740bx.m36941a(context);
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44326cG)).booleanValue()) {
            try {
                this.f44573a = (bgr) afd.m32800a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", byj.f44576a);
                C14886d.m30544a(context);
                this.f44573a.mo30139a(C14886d.m30544a(context), "GMA_SDK");
                this.f44574b = true;
            } catch (RemoteException | aff | NullPointerException unused) {
                afc.m32792b("Cannot dynamite load clearcut");
            }
        }
    }

    public byh() {
    }
}
