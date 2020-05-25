package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.customtabs.C0366a;
import android.support.customtabs.C0378e;
import java.util.List;

final class aci implements C15818cw {

    /* renamed from: a */
    private final /* synthetic */ List f40257a;

    /* renamed from: b */
    private final /* synthetic */ C15817cv f40258b;

    /* renamed from: c */
    private final /* synthetic */ Context f40259c;

    aci(acd acd, List list, C15817cv cvVar, Context context) {
        this.f40257a = list;
        this.f40258b = cvVar;
        this.f40259c = context;
    }

    /* renamed from: a */
    public final void mo28679a() {
        for (String str : this.f40257a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            abv.m32796d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            Uri parse = Uri.parse(str);
            C15817cv cvVar = this.f40258b;
            if (cvVar.f44794b != null) {
                if (cvVar.f44794b == null) {
                    cvVar.f44793a = null;
                } else if (cvVar.f44793a == null) {
                    cvVar.f44793a = cvVar.f44794b.mo853a((C0366a) null);
                }
                C0378e eVar = cvVar.f44793a;
                if (eVar != null) {
                    eVar.mo868a(parse, null, null);
                }
            }
        }
        C15817cv cvVar2 = this.f40258b;
        Activity activity = (Activity) this.f40259c;
        if (cvVar2.f44795c != null) {
            activity.unbindService(cvVar2.f44795c);
            cvVar2.f44794b = null;
            cvVar2.f44793a = null;
            cvVar2.f44795c = null;
        }
    }
}
