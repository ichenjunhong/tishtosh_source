package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.p1033b.C15180h;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.au */
final /* synthetic */ class C17910au implements Runnable {

    /* renamed from: a */
    private final C17909at f49768a;

    /* renamed from: b */
    private final Bundle f49769b;

    /* renamed from: c */
    private final C15180h f49770c;

    C17910au(C17909at atVar, Bundle bundle, C15180h hVar) {
        this.f49768a = atVar;
        this.f49769b = bundle;
        this.f49770c = hVar;
    }

    public final void run() {
        C17909at atVar = this.f49768a;
        Bundle bundle = this.f49769b;
        C15180h hVar = this.f49770c;
        try {
            hVar.mo28005a(atVar.f49764a.mo34788a(bundle));
        } catch (IOException e) {
            hVar.mo28004a((Exception) e);
        }
    }
}
