package com.google.android.play.core.p1048a;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.p1049b.C17245a;
import com.google.android.play.core.p1056f.C17374l;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.a.l */
final class C17242l extends C17240j<C17231a> {

    /* renamed from: b */
    private final String f48704b;

    C17242l(C17236f fVar, C17374l<C17231a> lVar, String str) {
        super(fVar, new C17384b("OnRequestInstallCallback"), lVar);
        this.f48704b = str;
    }

    /* renamed from: a */
    public final void mo33511a(Bundle bundle) throws RemoteException {
        super.mo33511a(bundle);
        if (bundle.getInt("error.code", -2) == 0 || bundle.getInt("error.code", -2) == 1) {
            C17374l lVar = this.f48698a;
            C17244n nVar = new C17244n(this.f48704b, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), bundle.getInt("client.version.staleness", -1), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"));
            lVar.mo33667a(nVar);
            return;
        }
        this.f48698a.mo33666a((Exception) new C17245a(bundle.getInt("error.code", -2)));
    }
}
