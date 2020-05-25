package com.p683ss.android.socialbase.downloader.p1213c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.c.c */
public interface C19795c extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.c.c$a */
    public static abstract class C19796a extends Binder implements C19795c {

        /* renamed from: com.ss.android.socialbase.downloader.c.c$a$a */
        static class C19797a implements C19795c {

            /* renamed from: a */
            private IBinder f54494a;

            public final IBinder asBinder() {
                return this.f54494a;
            }

            /* renamed from: a */
            public final boolean mo41243a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54494a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41242a(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54494a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41239a(int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.f54494a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41238a(int i, int i2, int i3, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    this.f54494a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo41244a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54494a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41251b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54494a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41240a(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f54494a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41241a(C19792b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f54494a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41248b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    this.f54494a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo41255c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    this.f54494a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final boolean mo41259d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    this.f54494a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41236a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    this.f54494a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19797a(IBinder iBinder) {
                this.f54494a = iBinder;
            }

            /* renamed from: b */
            public final DownloadInfo mo41245b(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(3, obtain, obtain2, 0);
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

            /* renamed from: f */
            public final boolean mo41262f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54494a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final DownloadInfo mo41263g(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(20, obtain, obtain2, 0);
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

            /* renamed from: h */
            public final DownloadInfo mo41264h(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(24, obtain, obtain2, 0);
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

            /* renamed from: i */
            public final DownloadInfo mo41265i(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(28, obtain, obtain2, 0);
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

            /* renamed from: j */
            public final DownloadInfo mo41266j(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(29, obtain, obtain2, 0);
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

            /* renamed from: c */
            public final List<DownloadChunk> mo41253c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadChunk.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final List<DownloadInfo> mo41257d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    this.f54494a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final boolean mo41261e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54494a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final List<DownloadInfo> mo41247b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    this.f54494a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final List<DownloadInfo> mo41254c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    this.f54494a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo41258d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    this.f54494a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final List<DownloadInfo> mo41235a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    this.f54494a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41250b(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54494a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final DownloadInfo mo41232a(int i, int i2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54494a.transact(15, obtain, obtain2, 0);
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

            /* renamed from: c */
            public final DownloadInfo mo41252c(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f54494a.transact(25, obtain, obtain2, 0);
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

            /* renamed from: d */
            public final DownloadInfo mo41256d(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f54494a.transact(26, obtain, obtain2, 0);
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

            /* renamed from: e */
            public final DownloadInfo mo41260e(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f54494a.transact(27, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final DownloadInfo mo41233a(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f54494a.transact(22, obtain, obtain2, 0);
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

            /* renamed from: b */
            public final DownloadInfo mo41246b(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f54494a.transact(23, obtain, obtain2, 0);
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

            /* renamed from: b */
            public final void mo41249b(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f54494a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final DownloadInfo mo41234a(int i, long j, String str, String str2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54494a.transact(21, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final void mo41237a(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f54494a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19796a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        }

        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v11, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v12, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v15, types: [com.ss.android.socialbase.downloader.c.b] */
        /* JADX WARNING: type inference failed for: r0v16, types: [com.ss.android.socialbase.downloader.c.b$a$a] */
        /* JADX WARNING: type inference failed for: r0v18, types: [com.ss.android.socialbase.downloader.c.b] */
        /* JADX WARNING: type inference failed for: r0v19 */
        /* JADX WARNING: type inference failed for: r0v20 */
        /* JADX WARNING: type inference failed for: r0v21 */
        /* JADX WARNING: type inference failed for: r0v22 */
        /* JADX WARNING: type inference failed for: r0v23 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.socialbase.downloader.model.DownloadChunk, com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.c.b$a$a, com.ss.android.socialbase.downloader.c.b]
          uses: [com.ss.android.socialbase.downloader.model.DownloadChunk, com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.c.b]
          mth insns count: 331
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
            /*
                r9 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r10 == r0) goto L_0x038e
                r0 = 0
                r2 = 0
                switch(r10) {
                    case 1: goto L_0x0382;
                    case 2: goto L_0x036e;
                    case 3: goto L_0x0351;
                    case 4: goto L_0x033d;
                    case 5: goto L_0x0329;
                    case 6: goto L_0x0315;
                    case 7: goto L_0x0301;
                    case 8: goto L_0x02ed;
                    case 9: goto L_0x02dd;
                    case 10: goto L_0x02c2;
                    case 11: goto L_0x02a7;
                    case 12: goto L_0x028f;
                    case 13: goto L_0x0272;
                    case 14: goto L_0x0256;
                    case 15: goto L_0x0235;
                    case 16: goto L_0x0216;
                    case 17: goto L_0x0202;
                    case 18: goto L_0x01ee;
                    case 19: goto L_0x01e2;
                    case 20: goto L_0x01c5;
                    case 21: goto L_0x019b;
                    case 22: goto L_0x017a;
                    case 23: goto L_0x0159;
                    case 24: goto L_0x013c;
                    case 25: goto L_0x011b;
                    case 26: goto L_0x00fa;
                    case 27: goto L_0x00d9;
                    case 28: goto L_0x00bc;
                    case 29: goto L_0x009f;
                    case 30: goto L_0x008f;
                    case 31: goto L_0x007f;
                    case 32: goto L_0x0064;
                    case 33: goto L_0x004e;
                    case 34: goto L_0x0038;
                    case 35: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r10 = super.onTransact(r10, r11, r12, r13)
                return r10
            L_0x0010:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                android.os.IBinder r10 = r11.readStrongBinder()
                if (r10 != 0) goto L_0x001c
                goto L_0x0031
            L_0x001c:
                java.lang.String r11 = "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl"
                android.os.IInterface r11 = r10.queryLocalInterface(r11)
                if (r11 == 0) goto L_0x002c
                boolean r13 = r11 instanceof com.p683ss.android.socialbase.downloader.p1213c.C19792b
                if (r13 == 0) goto L_0x002c
                r0 = r11
                com.ss.android.socialbase.downloader.c.b r0 = (com.p683ss.android.socialbase.downloader.p1213c.C19792b) r0
                goto L_0x0031
            L_0x002c:
                com.ss.android.socialbase.downloader.c.b$a$a r0 = new com.ss.android.socialbase.downloader.c.b$a$a
                r0.<init>(r10)
            L_0x0031:
                r9.mo41241a(r0)
                r12.writeNoException()
                return r1
            L_0x0038:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r13 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.util.ArrayList r11 = r11.createTypedArrayList(r13)
                r9.mo41249b(r10, r11)
                r12.writeNoException()
                return r1
            L_0x004e:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r13 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.util.ArrayList r11 = r11.createTypedArrayList(r13)
                r9.mo41240a(r10, r11)
                r12.writeNoException()
                return r1
            L_0x0064:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x0078
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r10 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                r0 = r10
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0078:
                r9.mo41251b(r0)
                r12.writeNoException()
                return r1
            L_0x007f:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                boolean r10 = r9.mo41259d()
                r12.writeNoException()
                r12.writeInt(r10)
                return r1
            L_0x008f:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                boolean r10 = r9.mo41255c()
                r12.writeNoException()
                r12.writeInt(r10)
                return r1
            L_0x009f:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41266j(r10)
                r12.writeNoException()
                if (r10 == 0) goto L_0x00b8
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x00bb
            L_0x00b8:
                r12.writeInt(r2)
            L_0x00bb:
                return r1
            L_0x00bc:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41265i(r10)
                r12.writeNoException()
                if (r10 == 0) goto L_0x00d5
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x00d8
            L_0x00d5:
                r12.writeInt(r2)
            L_0x00d8:
                return r1
            L_0x00d9:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                long r3 = r11.readLong()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41260e(r10, r3)
                r12.writeNoException()
                if (r10 == 0) goto L_0x00f6
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x00f9
            L_0x00f6:
                r12.writeInt(r2)
            L_0x00f9:
                return r1
            L_0x00fa:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                long r3 = r11.readLong()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41256d(r10, r3)
                r12.writeNoException()
                if (r10 == 0) goto L_0x0117
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x011a
            L_0x0117:
                r12.writeInt(r2)
            L_0x011a:
                return r1
            L_0x011b:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                long r3 = r11.readLong()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41252c(r10, r3)
                r12.writeNoException()
                if (r10 == 0) goto L_0x0138
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x013b
            L_0x0138:
                r12.writeInt(r2)
            L_0x013b:
                return r1
            L_0x013c:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41264h(r10)
                r12.writeNoException()
                if (r10 == 0) goto L_0x0155
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x0158
            L_0x0155:
                r12.writeInt(r2)
            L_0x0158:
                return r1
            L_0x0159:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                long r3 = r11.readLong()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41246b(r10, r3)
                r12.writeNoException()
                if (r10 == 0) goto L_0x0176
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x0179
            L_0x0176:
                r12.writeInt(r2)
            L_0x0179:
                return r1
            L_0x017a:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                long r3 = r11.readLong()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41233a(r10, r3)
                r12.writeNoException()
                if (r10 == 0) goto L_0x0197
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x019a
            L_0x0197:
                r12.writeInt(r2)
            L_0x019a:
                return r1
            L_0x019b:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r4 = r11.readInt()
                long r5 = r11.readLong()
                java.lang.String r7 = r11.readString()
                java.lang.String r8 = r11.readString()
                r3 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r3.mo41234a(r4, r5, r7, r8)
                r12.writeNoException()
                if (r10 == 0) goto L_0x01c1
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x01c4
            L_0x01c1:
                r12.writeInt(r2)
            L_0x01c4:
                return r1
            L_0x01c5:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41263g(r10)
                r12.writeNoException()
                if (r10 == 0) goto L_0x01de
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x01e1
            L_0x01de:
                r12.writeInt(r2)
            L_0x01e1:
                return r1
            L_0x01e2:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                r9.mo41248b()
                r12.writeNoException()
                return r1
            L_0x01ee:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                boolean r10 = r9.mo41262f(r10)
                r12.writeNoException()
                r12.writeInt(r10)
                return r1
            L_0x0202:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                boolean r10 = r9.mo41261e(r10)
                r12.writeNoException()
                r12.writeInt(r10)
                return r1
            L_0x0216:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x022a
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r10 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                r0 = r10
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x022a:
                boolean r10 = r9.mo41244a(r0)
                r12.writeNoException()
                r12.writeInt(r10)
                return r1
            L_0x0235:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                int r11 = r11.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41232a(r10, r11)
                r12.writeNoException()
                if (r10 == 0) goto L_0x0252
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x0255
            L_0x0252:
                r12.writeInt(r2)
            L_0x0255:
                return r1
            L_0x0256:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                int r13 = r11.readInt()
                int r0 = r11.readInt()
                int r11 = r11.readInt()
                r9.mo41237a(r10, r13, r0, r11)
                r12.writeNoException()
                return r1
            L_0x0272:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r3 = r11.readInt()
                int r4 = r11.readInt()
                int r5 = r11.readInt()
                long r6 = r11.readLong()
                r2 = r9
                r2.mo41238a(r3, r4, r5, r6)
                r12.writeNoException()
                return r1
            L_0x028f:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                int r13 = r11.readInt()
                long r2 = r11.readLong()
                r9.mo41239a(r10, r13, r2)
                r12.writeNoException()
                return r1
            L_0x02a7:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x02bb
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r10 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                r0 = r10
                com.ss.android.socialbase.downloader.model.DownloadChunk r0 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r0
            L_0x02bb:
                r9.mo41250b(r0)
                r12.writeNoException()
                return r1
            L_0x02c2:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x02d6
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r10 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                r0 = r10
                com.ss.android.socialbase.downloader.model.DownloadChunk r0 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r0
            L_0x02d6:
                r9.mo41242a(r0)
                r12.writeNoException()
                return r1
            L_0x02dd:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                r9.mo41258d(r10)
                r12.writeNoException()
                return r1
            L_0x02ed:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                java.util.List r10 = r9.mo41253c(r10)
                r12.writeNoException()
                r12.writeTypedList(r10)
                return r1
            L_0x0301:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                java.lang.String r10 = r11.readString()
                java.util.List r10 = r9.mo41257d(r10)
                r12.writeNoException()
                r12.writeTypedList(r10)
                return r1
            L_0x0315:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                java.lang.String r10 = r11.readString()
                java.util.List r10 = r9.mo41254c(r10)
                r12.writeNoException()
                r12.writeTypedList(r10)
                return r1
            L_0x0329:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                java.lang.String r10 = r11.readString()
                java.util.List r10 = r9.mo41247b(r10)
                r12.writeNoException()
                r12.writeTypedList(r10)
                return r1
            L_0x033d:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                java.lang.String r10 = r11.readString()
                java.util.List r10 = r9.mo41235a(r10)
                r12.writeNoException()
                r12.writeTypedList(r10)
                return r1
            L_0x0351:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r9.mo41245b(r10)
                r12.writeNoException()
                if (r10 == 0) goto L_0x036a
                r12.writeInt(r1)
                r10.writeToParcel(r12, r1)
                goto L_0x036d
            L_0x036a:
                r12.writeInt(r2)
            L_0x036d:
                return r1
            L_0x036e:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                int r10 = r11.readInt()
                boolean r10 = r9.mo41243a(r10)
                r12.writeNoException()
                r12.writeInt(r10)
                return r1
            L_0x0382:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r11.enforceInterface(r10)
                r9.mo41236a()
                r12.writeNoException()
                return r1
            L_0x038e:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r12.writeString(r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19795c.C19796a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    DownloadInfo mo41232a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    DownloadInfo mo41233a(int i, long j) throws RemoteException;

    /* renamed from: a */
    DownloadInfo mo41234a(int i, long j, String str, String str2) throws RemoteException;

    /* renamed from: a */
    List<DownloadInfo> mo41235a(String str) throws RemoteException;

    /* renamed from: a */
    void mo41236a() throws RemoteException;

    /* renamed from: a */
    void mo41237a(int i, int i2, int i3, int i4) throws RemoteException;

    /* renamed from: a */
    void mo41238a(int i, int i2, int i3, long j) throws RemoteException;

    /* renamed from: a */
    void mo41239a(int i, int i2, long j) throws RemoteException;

    /* renamed from: a */
    void mo41240a(int i, List<DownloadChunk> list) throws RemoteException;

    /* renamed from: a */
    void mo41241a(C19792b bVar) throws RemoteException;

    /* renamed from: a */
    void mo41242a(DownloadChunk downloadChunk) throws RemoteException;

    /* renamed from: a */
    boolean mo41243a(int i) throws RemoteException;

    /* renamed from: a */
    boolean mo41244a(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: b */
    DownloadInfo mo41245b(int i) throws RemoteException;

    /* renamed from: b */
    DownloadInfo mo41246b(int i, long j) throws RemoteException;

    /* renamed from: b */
    List<DownloadInfo> mo41247b(String str) throws RemoteException;

    /* renamed from: b */
    void mo41248b() throws RemoteException;

    /* renamed from: b */
    void mo41249b(int i, List<DownloadChunk> list) throws RemoteException;

    /* renamed from: b */
    void mo41250b(DownloadChunk downloadChunk) throws RemoteException;

    /* renamed from: b */
    void mo41251b(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: c */
    DownloadInfo mo41252c(int i, long j) throws RemoteException;

    /* renamed from: c */
    List<DownloadChunk> mo41253c(int i) throws RemoteException;

    /* renamed from: c */
    List<DownloadInfo> mo41254c(String str) throws RemoteException;

    /* renamed from: c */
    boolean mo41255c() throws RemoteException;

    /* renamed from: d */
    DownloadInfo mo41256d(int i, long j) throws RemoteException;

    /* renamed from: d */
    List<DownloadInfo> mo41257d(String str) throws RemoteException;

    /* renamed from: d */
    void mo41258d(int i) throws RemoteException;

    /* renamed from: d */
    boolean mo41259d() throws RemoteException;

    /* renamed from: e */
    DownloadInfo mo41260e(int i, long j) throws RemoteException;

    /* renamed from: e */
    boolean mo41261e(int i) throws RemoteException;

    /* renamed from: f */
    boolean mo41262f(int i) throws RemoteException;

    /* renamed from: g */
    DownloadInfo mo41263g(int i) throws RemoteException;

    /* renamed from: h */
    DownloadInfo mo41264h(int i) throws RemoteException;

    /* renamed from: i */
    DownloadInfo mo41265i(int i) throws RemoteException;

    /* renamed from: j */
    DownloadInfo mo41266j(int i) throws RemoteException;
}
