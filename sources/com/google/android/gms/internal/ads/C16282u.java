package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.u */
public final class C16282u extends bgo implements C16228s {
    C16282u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* renamed from: a */
    public final C15931h mo27436a(C14882b bVar, zzyz zzyz, String str, C16134on onVar, int i) throws RemoteException {
        C15931h hVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(i);
        Parcel a = mo30131a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            hVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15931h) {
                hVar = (C15931h) queryLocalInterface;
            } else {
                hVar = new C15985j(readStrongBinder);
            }
        }
        a.recycle();
        return hVar;
    }

    /* renamed from: b */
    public final C15931h mo27440b(C14882b bVar, zzyz zzyz, String str, C16134on onVar, int i) throws RemoteException {
        C15931h hVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(i);
        Parcel a = mo30131a(2, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            hVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15931h) {
                hVar = (C15931h) queryLocalInterface;
            } else {
                hVar = new C15985j(readStrongBinder);
            }
        }
        a.recycle();
        return hVar;
    }

    /* renamed from: a */
    public final C15795c mo27432a(C14882b bVar, String str, C16134on onVar, int i) throws RemoteException {
        C15795c cVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(i);
        Parcel a = mo30131a(3, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof C15795c) {
                cVar = (C15795c) queryLocalInterface;
            } else {
                cVar = new C15850e(readStrongBinder);
            }
        }
        a.recycle();
        return cVar;
    }

    /* renamed from: a */
    public final C16390y mo27437a(C14882b bVar) throws RemoteException {
        C16390y yVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(4, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            yVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof C16390y) {
                yVar = (C16390y) queryLocalInterface;
            } else {
                yVar = new C15561aa(readStrongBinder);
            }
        }
        a.recycle();
        return yVar;
    }

    /* renamed from: a */
    public final C15870et mo27433a(C14882b bVar, C14882b bVar2) throws RemoteException {
        C15870et etVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) bVar2);
        Parcel a = mo30131a(5, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            etVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof C15870et) {
                etVar = (C15870et) queryLocalInterface;
            } else {
                etVar = new C15872ev(readStrongBinder);
            }
        }
        a.recycle();
        return etVar;
    }

    /* renamed from: a */
    public final C16391ya mo27439a(C14882b bVar, C16134on onVar, int i) throws RemoteException {
        C16391ya yaVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(i);
        Parcel a = mo30131a(6, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            yaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof C16391ya) {
                yaVar = (C16391ya) queryLocalInterface;
            } else {
                yaVar = new C16393yc(readStrongBinder);
            }
        }
        a.recycle();
        return yaVar;
    }

    /* renamed from: b */
    public final C16232sd mo27441b(C14882b bVar) throws RemoteException {
        C16232sd sdVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(7, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            sdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
            if (queryLocalInterface instanceof C16232sd) {
                sdVar = (C16232sd) queryLocalInterface;
            } else {
                sdVar = new C16233se(readStrongBinder);
            }
        }
        a.recycle();
        return sdVar;
    }

    /* renamed from: c */
    public final C16222ru mo27443c(C14882b bVar) throws RemoteException {
        C16222ru ruVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(8, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ruVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof C16222ru) {
                ruVar = (C16222ru) queryLocalInterface;
            } else {
                ruVar = new C16224rw(readStrongBinder);
            }
        }
        a.recycle();
        return ruVar;
    }

    /* renamed from: a */
    public final C16390y mo27438a(C14882b bVar, int i) throws RemoteException {
        C16390y yVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeInt(i);
        Parcel a = mo30131a(9, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            yVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof C16390y) {
                yVar = (C16390y) queryLocalInterface;
            } else {
                yVar = new C15561aa(readStrongBinder);
            }
        }
        a.recycle();
        return yVar;
    }

    /* renamed from: a */
    public final C15931h mo27435a(C14882b bVar, zzyz zzyz, String str, int i) throws RemoteException {
        C15931h hVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        z.writeString(str);
        z.writeInt(i);
        Parcel a = mo30131a(10, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            hVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15931h) {
                hVar = (C15931h) queryLocalInterface;
            } else {
                hVar = new C15985j(readStrongBinder);
            }
        }
        a.recycle();
        return hVar;
    }

    /* renamed from: a */
    public final C15875ey mo27434a(C14882b bVar, C14882b bVar2, C14882b bVar3) throws RemoteException {
        C15875ey eyVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) bVar2);
        bgq.m35595a(z, (IInterface) bVar3);
        Parcel a = mo30131a(11, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            eyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof C15875ey) {
                eyVar = (C15875ey) queryLocalInterface;
            } else {
                eyVar = new C15878fa(readStrongBinder);
            }
        }
        a.recycle();
        return eyVar;
    }

    /* renamed from: b */
    public final C16429zl mo27442b(C14882b bVar, String str, C16134on onVar, int i) throws RemoteException {
        C16429zl zlVar;
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(i);
        Parcel a = mo30131a(12, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof C16429zl) {
                zlVar = (C16429zl) queryLocalInterface;
            } else {
                zlVar = new C16430zm(readStrongBinder);
            }
        }
        a.recycle();
        return zlVar;
    }
}
