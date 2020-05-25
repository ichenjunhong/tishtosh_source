package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C15041k;
import com.google.android.gms.ads.C15043m;
import com.google.android.gms.ads.mediation.C15073o;
import com.google.android.gms.ads.mediation.C15074p;
import com.google.android.gms.ads.mediation.C15075q;
import com.google.android.gms.ads.mediation.C15076r;
import com.google.android.gms.ads.mediation.C15077s;
import com.google.android.gms.ads.mediation.C15079u;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qr */
public final class C16192qr extends C16187qm {

    /* renamed from: a */
    private final aoh f45439a;

    public C16192qr(aoh aoh) {
        this.f45439a = aoh;
    }

    /* renamed from: a */
    public final void mo31336a(C14882b bVar) {
    }

    /* renamed from: a */
    public final void mo31342a(String[] strArr, Bundle[] bundleArr) {
    }

    /* renamed from: b */
    public final boolean mo31344b(C14882b bVar) throws RemoteException {
        return false;
    }

    /* renamed from: c */
    public final boolean mo31346c(C14882b bVar) throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final void mo31338a(String str, String str2, zzyv zzyv, C14882b bVar, C16176qb qbVar, C16141ou ouVar, zzyz zzyz) throws RemoteException {
        zzyv zzyv2 = zzyv;
        zzyz zzyz2 = zzyz;
        try {
            C16193qs qsVar = new C16193qs(this, qbVar, ouVar);
            aoh aoh = this.f45439a;
            new C15073o((Context) C14886d.m30545a(bVar), str, m38685a(str2), m38688b(zzyv2), m38687a(zzyv), zzyv2.f46327k, zzyv2.f46323g, zzyv2.f46336t, m38686a(str2, zzyv), C15043m.m31117a(zzyz2.f46342e, zzyz2.f46339b, zzyz2.f46338a));
            qsVar.mo27792a(String.valueOf(aoh.getClass().getSimpleName()).concat(" does not support banner ads."));
        } catch (Throwable th) {
            afc.m32793b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31339a(String str, String str2, zzyv zzyv, C14882b bVar, C16178qd qdVar, C16141ou ouVar) throws RemoteException {
        zzyv zzyv2 = zzyv;
        try {
            C16194qt qtVar = new C16194qt(this, qdVar, ouVar);
            aoh aoh = this.f45439a;
            new C15075q((Context) C14886d.m30545a(bVar), str, m38685a(str2), m38688b(zzyv2), m38687a(zzyv), zzyv2.f46327k, zzyv2.f46323g, zzyv2.f46336t, m38686a(str2, zzyv));
            qtVar.mo27792a(String.valueOf(aoh.getClass().getSimpleName()).concat(" does not support interstitial ads."));
        } catch (Throwable th) {
            afc.m32793b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31341a(String str, String str2, zzyv zzyv, C14882b bVar, C16184qj qjVar, C16141ou ouVar) throws RemoteException {
        zzyv zzyv2 = zzyv;
        try {
            C16195qu quVar = new C16195qu(this, qjVar, ouVar);
            aoh aoh = this.f45439a;
            C15077s sVar = new C15077s((Context) C14886d.m30545a(bVar), str, m38685a(str2), m38688b(zzyv2), m38687a(zzyv), zzyv2.f46327k, zzyv2.f46323g, zzyv2.f46336t, m38686a(str2, zzyv));
            aoh.mo27790a(sVar, quVar);
        } catch (Throwable th) {
            afc.m32793b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31340a(String str, String str2, zzyv zzyv, C14882b bVar, C16180qf qfVar, C16141ou ouVar) throws RemoteException {
        zzyv zzyv2 = zzyv;
        try {
            C16196qv qvVar = new C16196qv(this, qfVar, ouVar);
            aoh aoh = this.f45439a;
            new C15076r((Context) C14886d.m30545a(bVar), str, m38685a(str2), m38688b(zzyv2), m38687a(zzyv), zzyv2.f46327k, zzyv2.f46323g, zzyv2.f46336t, m38686a(str2, zzyv));
            qvVar.mo27792a(String.valueOf(aoh.getClass().getSimpleName()).concat(" does not support native ads."));
        } catch (Throwable th) {
            afc.m32793b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final C15583ak mo31345c() {
        if (!(this.f45439a instanceof C15079u)) {
            return null;
        }
        try {
            return ((C15079u) this.f45439a).getVideoController();
        } catch (Throwable th) {
            afc.m32793b("", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo31337a(C14882b bVar, String str, Bundle bundle, Bundle bundle2, zzyz zzyz, C16189qo qoVar) throws RemoteException {
        int i;
        try {
            new C16197qw(this, qoVar);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1396342996) {
                if (hashCode != -1052618729) {
                    if (hashCode != -239580146) {
                        if (hashCode == 604727084) {
                            if (str.equals("interstitial")) {
                                c = 1;
                            }
                        }
                    } else if (str.equals("rewarded")) {
                        c = 2;
                    }
                } else if (str.equals("native")) {
                    c = 3;
                }
            } else if (str.equals("banner")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    i = C15041k.f38869a;
                    break;
                case 1:
                    i = C15041k.f38870b;
                    break;
                case 2:
                    i = C15041k.f38871c;
                    break;
                case 3:
                    i = C15041k.f38872d;
                    break;
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
            new aoi((Context) C14886d.m30545a(bVar), new C15074p(i, bundle2), bundle, C15043m.m31117a(zzyz.f46342e, zzyz.f46339b, zzyz.f46338a));
        } catch (Throwable th) {
            afc.m32793b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final zzaso mo31335a() throws RemoteException {
        return zzaso.m39269a(this.f45439a.mo27789a());
    }

    /* renamed from: b */
    public final zzaso mo31343b() throws RemoteException {
        return zzaso.m39269a(this.f45439a.mo27791b());
    }

    /* renamed from: a */
    private static Bundle m38685a(String str) throws RemoteException {
        String str2 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        afc.m32798e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                bundle2.putString(str3, jSONObject.getString(str3));
            }
            return bundle2;
        } catch (JSONException e) {
            afc.m32793b("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m38687a(zzyv zzyv) {
        return zzyv.f46322f || aes.m32757a();
    }

    /* renamed from: a */
    private static String m38686a(String str, zzyv zzyv) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzyv.f46337u;
        }
    }

    /* renamed from: b */
    private final Bundle m38688b(zzyv zzyv) {
        if (zzyv.f46329m != null) {
            Bundle bundle = zzyv.f46329m.getBundle(this.f45439a.getClass().getName());
            if (bundle != null) {
                return bundle;
            }
        }
        return new Bundle();
    }
}
