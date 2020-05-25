package com.google.android.play.core.p1053e;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17257ag;
import com.google.android.play.core.p1056f.C17374l;
import java.util.List;

/* renamed from: com.google.android.play.core.e.m */
class C17348m<T> extends C17257ag {

    /* renamed from: a */
    final C17374l<T> f48850a;

    /* renamed from: b */
    private final /* synthetic */ C17325af f48851b;

    C17348m(C17325af afVar, C17374l<T> lVar) {
        this.f48851b = afVar;
        this.f48850a = lVar;
    }

    /* renamed from: a */
    public final void mo33531a() throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onGetSplitsForAppUpdate", new Object[0]);
    }

    /* renamed from: a */
    public final void mo33532a(int i) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo33533a(int i, Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo33534a(Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        int i = bundle.getInt("error_code");
        C17325af.f48805a.mo33689d("onError(%d)", Integer.valueOf(i));
        this.f48850a.mo33666a((Exception) new C17318a(i));
    }

    /* renamed from: a */
    public final void mo33535a(List<Bundle> list) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onGetSessionStates", new Object[0]);
    }

    /* renamed from: b */
    public final void mo33536b() throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: b */
    public void mo33537b(int i, Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo33538b(Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onDeferredUninstall", new Object[0]);
    }

    /* renamed from: c */
    public void mo33539c(int i, Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo33540c(Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onDeferredInstall", new Object[0]);
    }

    /* renamed from: d */
    public final void mo33541d(Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: e */
    public final void mo33542e(Bundle bundle) throws RemoteException {
        this.f48851b.f48807b.mo33587a();
        C17325af.f48805a.mo33685a("onDeferredLanguageUninstall", new Object[0]);
    }
}
