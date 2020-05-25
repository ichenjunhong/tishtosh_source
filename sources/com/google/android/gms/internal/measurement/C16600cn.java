package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p1027a.C14886d;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.cn */
final class C16600cn extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Context f46635c;

    /* renamed from: d */
    private final /* synthetic */ String f46636d;

    /* renamed from: e */
    private final /* synthetic */ String f46637e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f46638f;

    /* renamed from: g */
    private final /* synthetic */ C16596cm f46639g;

    C16600cn(C16596cm cmVar, Context context, String str, String str2, Bundle bundle) {
        this.f46639g = cmVar;
        this.f46635c = context;
        this.f46636d = str;
        this.f46637e = str2;
        this.f46638f = bundle;
        super(cmVar);
    }

    /* renamed from: b */
    public final void mo31905b() {
        String str;
        String str2;
        String str3;
        try {
            this.f46639g.f46621d = new HashMap();
            this.f46639g.f46624g = this.f46639g.mo31898a(this.f46635c);
            if (this.f46639g.f46624g != null) {
                C16596cm cmVar = this.f46639g;
                if (C16596cm.m39663a(this.f46636d, this.f46637e)) {
                    String str4 = this.f46637e;
                    str2 = this.f46636d;
                    str = str4;
                    str3 = this.f46639g.f46618a;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                int a = DynamiteModule.m32331a(this.f46635c, "com.google.android.gms.measurement.dynamite");
                int b = DynamiteModule.m32339b(this.f46635c, "com.google.android.gms.measurement.dynamite");
                zzdy zzdy = new zzdy(13001, (long) Math.max(a, b), b < a, str3, str2, str, this.f46638f);
                this.f46639g.f46624g.mo31873a(C14886d.m30544a(this.f46635c), zzdy, this.f46630a);
            }
        } catch (RemoteException e) {
            this.f46639g.m39662a(e, true, false);
        }
    }
}
