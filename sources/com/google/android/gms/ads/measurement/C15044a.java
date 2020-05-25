package com.google.android.gms.ads.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bgp;
import com.google.android.gms.internal.ads.bgq;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.measurement.a */
public interface C15044a extends IInterface {

    /* renamed from: com.google.android.gms.ads.measurement.a$a */
    public static abstract class C15045a extends bgp implements C15044a {
        public C15045a() {
            super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
        }

        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    mo27733a((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 2:
                    Bundle b = mo27737b((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    bgq.m35600b(parcel2, b);
                    break;
                case 3:
                    mo27735a(parcel.readString(), parcel.readString(), (Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    mo27736a(parcel.readString(), parcel.readString(), C14883a.m30535a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 5:
                    Map a = mo27732a(parcel.readString(), parcel.readString(), bgq.m35598a(parcel));
                    parcel2.writeNoException();
                    parcel2.writeMap(a);
                    break;
                case 6:
                    int a2 = mo27729a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    break;
                case 7:
                    mo27742c((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 8:
                    mo27740b(parcel.readString(), parcel.readString(), (Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 9:
                    List a3 = mo27731a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeList(a3);
                    break;
                case 10:
                    String a4 = mo27730a();
                    parcel2.writeNoException();
                    parcel2.writeString(a4);
                    break;
                case 11:
                    String b2 = mo27738b();
                    parcel2.writeNoException();
                    parcel2.writeString(b2);
                    break;
                case 12:
                    long c = mo27741c();
                    parcel2.writeNoException();
                    parcel2.writeLong(c);
                    break;
                case 13:
                    mo27739b(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 14:
                    mo27743c(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 15:
                    mo27734a(C14883a.m30535a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 16:
                    String d = mo27744d();
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    break;
                case 17:
                    String e = mo27745e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    break;
                case 18:
                    String f = mo27746f();
                    parcel2.writeNoException();
                    parcel2.writeString(f);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    int mo27729a(String str) throws RemoteException;

    /* renamed from: a */
    String mo27730a() throws RemoteException;

    /* renamed from: a */
    List mo27731a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    Map mo27732a(String str, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo27733a(Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo27734a(C14882b bVar, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo27735a(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo27736a(String str, String str2, C14882b bVar) throws RemoteException;

    /* renamed from: b */
    Bundle mo27737b(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    String mo27738b() throws RemoteException;

    /* renamed from: b */
    void mo27739b(String str) throws RemoteException;

    /* renamed from: b */
    void mo27740b(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: c */
    long mo27741c() throws RemoteException;

    /* renamed from: c */
    void mo27742c(Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo27743c(String str) throws RemoteException;

    /* renamed from: d */
    String mo27744d() throws RemoteException;

    /* renamed from: e */
    String mo27745e() throws RemoteException;

    /* renamed from: f */
    String mo27746f() throws RemoteException;
}
