package com.p683ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.depend.C19828c;
import com.p683ss.android.socialbase.downloader.depend.C19828c.C19829a.C19830a;
import com.p683ss.android.socialbase.downloader.depend.C19831d;
import com.p683ss.android.socialbase.downloader.depend.C19831d.C19832a.C19833a;
import com.p683ss.android.socialbase.downloader.depend.C19834e;
import com.p683ss.android.socialbase.downloader.depend.C19834e.C19835a;
import com.p683ss.android.socialbase.downloader.depend.C19837f;
import com.p683ss.android.socialbase.downloader.depend.C19837f.C19838a.C19839a;
import com.p683ss.android.socialbase.downloader.depend.C19840g;
import com.p683ss.android.socialbase.downloader.depend.C19840g.C19841a;
import com.p683ss.android.socialbase.downloader.depend.C19843h;
import com.p683ss.android.socialbase.downloader.depend.C19843h.C19844a.C19845a;
import com.p683ss.android.socialbase.downloader.depend.C19850k;
import com.p683ss.android.socialbase.downloader.depend.C19850k.C19851a.C19852a;
import com.p683ss.android.socialbase.downloader.depend.C19859p;
import com.p683ss.android.socialbase.downloader.depend.C19859p.C19860a.C19861a;
import com.p683ss.android.socialbase.downloader.depend.C19866u;
import com.p683ss.android.socialbase.downloader.depend.C19866u.C19867a;
import com.p683ss.android.socialbase.downloader.depend.C19871x;
import com.p683ss.android.socialbase.downloader.depend.C19871x.C19872a;
import com.p683ss.android.socialbase.downloader.depend.C19875z;
import com.p683ss.android.socialbase.downloader.depend.C19875z.C19876a.C19877a;

/* renamed from: com.ss.android.socialbase.downloader.model.a */
public interface C20045a extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.model.a$a */
    public static abstract class C20046a extends Binder implements C20045a {

        /* renamed from: com.ss.android.socialbase.downloader.model.a$a$a */
        public static class C20047a implements C20045a {

            /* renamed from: a */
            private IBinder f55087a;

            public final IBinder asBinder() {
                return this.f55087a;
            }

            /* renamed from: c */
            public final C19866u mo41763c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19867a.m48558a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final C19871x mo41764d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19872a.m48567a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final C19834e mo41771k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19835a.m48501a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final C19828c mo41761b() throws RemoteException {
                C19828c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19828c)) {
                            cVar = new C19830a(readStrongBinder);
                        } else {
                            cVar = (C19828c) queryLocalInterface;
                        }
                    }
                    return cVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final C19837f mo41765e() throws RemoteException {
                C19837f fVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19837f)) {
                            fVar = new C19839a(readStrongBinder);
                        } else {
                            fVar = (C19837f) queryLocalInterface;
                        }
                    }
                    return fVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final C19831d mo41766f() throws RemoteException {
                C19831d dVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19831d)) {
                            dVar = new C19833a(readStrongBinder);
                        } else {
                            dVar = (C19831d) queryLocalInterface;
                        }
                    }
                    return dVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final C19859p mo41767g() throws RemoteException {
                C19859p pVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        pVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19859p)) {
                            pVar = new C19861a(readStrongBinder);
                        } else {
                            pVar = (C19859p) queryLocalInterface;
                        }
                    }
                    return pVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final C19875z mo41768h() throws RemoteException {
                C19875z zVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        zVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19875z)) {
                            zVar = new C19877a(readStrongBinder);
                        } else {
                            zVar = (C19875z) queryLocalInterface;
                        }
                    }
                    return zVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final C19850k mo41769i() throws RemoteException {
                C19850k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        kVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19850k)) {
                            kVar = new C19852a(readStrongBinder);
                        } else {
                            kVar = (C19850k) queryLocalInterface;
                        }
                    }
                    return kVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final C19843h mo41770j() throws RemoteException {
                C19843h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        hVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C19843h)) {
                            hVar = new C19845a(readStrongBinder);
                        } else {
                            hVar = (C19843h) queryLocalInterface;
                        }
                    }
                    return hVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final DownloadInfo mo41760a() throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f55087a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C20047a(IBinder iBinder) {
                this.f55087a = iBinder;
            }

            /* renamed from: a */
            public final int mo41758a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    this.f55087a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final C19840g mo41762b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    this.f55087a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19841a.m48517a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C19840g mo41759a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f55087a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19841a.m48517a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20046a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo a = mo41760a();
                        parcel2.writeNoException();
                        if (a != null) {
                            parcel2.writeInt(1);
                            a.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19828c b = mo41761b();
                        parcel2.writeNoException();
                        if (b != null) {
                            iBinder = b.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int a2 = mo41758a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19840g a3 = mo41759a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a3 != null) {
                            iBinder = a3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19840g b2 = mo41762b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b2 != null) {
                            iBinder = b2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19866u c = mo41763c();
                        parcel2.writeNoException();
                        if (c != null) {
                            iBinder = c.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19871x d = mo41764d();
                        parcel2.writeNoException();
                        if (d != null) {
                            iBinder = d.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19837f e = mo41765e();
                        parcel2.writeNoException();
                        if (e != null) {
                            iBinder = e.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19831d f = mo41766f();
                        parcel2.writeNoException();
                        if (f != null) {
                            iBinder = f.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19859p g = mo41767g();
                        parcel2.writeNoException();
                        if (g != null) {
                            iBinder = g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19875z h = mo41768h();
                        parcel2.writeNoException();
                        if (h != null) {
                            iBinder = h.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19850k i3 = mo41769i();
                        parcel2.writeNoException();
                        if (i3 != null) {
                            iBinder = i3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19843h j = mo41770j();
                        parcel2.writeNoException();
                        if (j != null) {
                            iBinder = j.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        C19834e k = mo41771k();
                        parcel2.writeNoException();
                        if (k != null) {
                            iBinder = k.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo41758a(int i) throws RemoteException;

    /* renamed from: a */
    C19840g mo41759a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    DownloadInfo mo41760a() throws RemoteException;

    /* renamed from: b */
    C19828c mo41761b() throws RemoteException;

    /* renamed from: b */
    C19840g mo41762b(int i) throws RemoteException;

    /* renamed from: c */
    C19866u mo41763c() throws RemoteException;

    /* renamed from: d */
    C19871x mo41764d() throws RemoteException;

    /* renamed from: e */
    C19837f mo41765e() throws RemoteException;

    /* renamed from: f */
    C19831d mo41766f() throws RemoteException;

    /* renamed from: g */
    C19859p mo41767g() throws RemoteException;

    /* renamed from: h */
    C19875z mo41768h() throws RemoteException;

    /* renamed from: i */
    C19850k mo41769i() throws RemoteException;

    /* renamed from: j */
    C19843h mo41770j() throws RemoteException;

    /* renamed from: k */
    C19834e mo41771k() throws RemoteException;
}
