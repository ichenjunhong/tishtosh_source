package com.p683ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.depend.C19823ab;
import com.p683ss.android.socialbase.downloader.depend.C19834e;
import com.p683ss.android.socialbase.downloader.depend.C19834e.C19835a;
import com.p683ss.android.socialbase.downloader.depend.C19840g;
import com.p683ss.android.socialbase.downloader.depend.C19866u;
import com.p683ss.android.socialbase.downloader.depend.C19866u.C19867a;
import com.p683ss.android.socialbase.downloader.depend.C19871x;
import com.p683ss.android.socialbase.downloader.depend.C19871x.C19872a;
import com.p683ss.android.socialbase.downloader.model.C20045a;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.j */
public interface C19898j extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.downloader.j$a */
    public static abstract class C19899a extends Binder implements C19898j {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.j$a$a */
        static class C19900a implements C19898j {

            /* renamed from: a */
            private IBinder f54708a;

            public final IBinder asBinder() {
                return this.f54708a;
            }

            /* renamed from: a */
            public final void mo41526a(C20045a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f54708a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41523a(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54708a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo41536b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54708a.transact(4, obtain, obtain2, 0);
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
            public final void mo41527a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    this.f54708a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41519a(int i, int i2, C19840g gVar, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54708a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo41529a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54708a.transact(24, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final void mo41520a(int i, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54708a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41525a(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54708a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo41537b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54708a.transact(35, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final void mo41518a(int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.f54708a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41517a(int i, int i2, int i3, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    this.f54708a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41522a(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f54708a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41524a(C19823ab abVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(abVar != null ? abVar.asBinder() : null);
                    this.f54708a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41521a(int i, C19866u uVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(uVar != null ? uVar.asBinder() : null);
                    this.f54708a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo41543d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    this.f54708a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41513a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    this.f54708a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final boolean mo41547e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f54708a.transact(51, obtain, obtain2, 0);
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

            /* renamed from: c */
            public final boolean mo41541c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f54708a.transact(31, obtain, obtain2, 0);
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
            public final boolean mo41535b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f54708a.transact(27, obtain, obtain2, 0);
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

            C19900a(IBinder iBinder) {
                this.f54708a = iBinder;
            }

            /* renamed from: a */
            public final void mo41528a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f54708a.transact(26, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final List<DownloadInfo> mo41538c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54708a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final List<DownloadInfo> mo41542d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54708a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final long mo41545e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final int mo41548f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final boolean mo41549g(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54708a.transact(10, obtain, obtain2, 0);
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

            /* renamed from: h */
            public final DownloadInfo mo41550h(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(11, obtain, obtain2, 0);
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
            public final List<DownloadChunk> mo41551i(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadChunk.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo41552j(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final boolean mo41553k(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54708a.transact(29, obtain, obtain2, 0);
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

            /* renamed from: l */
            public final void mo41554l(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final int mo41555m(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final boolean mo41556n(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54708a.transact(36, obtain, obtain2, 0);
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

            /* renamed from: o */
            public final void mo41557o(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final boolean mo41558p(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f54708a.transact(41, obtain, obtain2, 0);
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

            /* renamed from: q */
            public final C19866u mo41559q(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19867a.m48558a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final C19871x mo41560r(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19872a.m48567a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public final C19834e mo41561s(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                    return C19835a.m48501a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final List<DownloadInfo> mo41512a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54708a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final List<DownloadInfo> mo41531b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54708a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo41539c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final List<DownloadInfo> mo41546e(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f54708a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo41544d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41514a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f54708a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo41511a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54708a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final DownloadInfo mo41530b(String str, String str2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54708a.transact(15, obtain, obtain2, 0);
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
            public final void mo41540c(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54708a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41533b(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f54708a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41515a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54708a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41534b(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54708a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41516a(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f54708a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41532b(int i, int i2, C19840g gVar, int i3, boolean z) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    this.f54708a.transact(23, obtain, obtain2, 0);
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

        public C19899a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        /* renamed from: a */
        public static C19898j m48725a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19898j)) {
                return new C19900a(iBinder);
            }
            return (C19898j) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [com.ss.android.socialbase.downloader.model.a] */
        /* JADX WARNING: type inference failed for: r2v2, types: [com.ss.android.socialbase.downloader.model.a$a$a] */
        /* JADX WARNING: type inference failed for: r2v4, types: [com.ss.android.socialbase.downloader.model.a] */
        /* JADX WARNING: type inference failed for: r2v7, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v9, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v10, types: [android.app.Notification] */
        /* JADX WARNING: type inference failed for: r2v12, types: [android.app.Notification] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r2v15, types: [com.ss.android.socialbase.downloader.model.DownloadChunk] */
        /* JADX WARNING: type inference failed for: r2v16, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v18, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r2v21, types: [com.ss.android.socialbase.downloader.depend.ab] */
        /* JADX WARNING: type inference failed for: r2v22, types: [com.ss.android.socialbase.downloader.depend.ab$a$a] */
        /* JADX WARNING: type inference failed for: r2v24, types: [com.ss.android.socialbase.downloader.depend.ab] */
        /* JADX WARNING: type inference failed for: r2v25, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v26, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v27, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v28, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v29, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v30, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: type inference failed for: r2v32 */
        /* JADX WARNING: type inference failed for: r2v33 */
        /* JADX WARNING: type inference failed for: r2v34 */
        /* JADX WARNING: type inference failed for: r2v35 */
        /* JADX WARNING: type inference failed for: r2v36 */
        /* JADX WARNING: type inference failed for: r2v37 */
        /* JADX WARNING: type inference failed for: r2v38 */
        /* JADX WARNING: type inference failed for: r2v39 */
        /* JADX WARNING: type inference failed for: r2v40 */
        /* JADX WARNING: type inference failed for: r2v41 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.model.a$a$a, com.ss.android.socialbase.downloader.model.a, android.app.Notification, com.ss.android.socialbase.downloader.model.DownloadChunk, com.ss.android.socialbase.downloader.depend.ab$a$a, com.ss.android.socialbase.downloader.depend.ab, android.os.IBinder]
          uses: [com.ss.android.socialbase.downloader.model.a, com.ss.android.socialbase.downloader.model.DownloadInfo, android.app.Notification, com.ss.android.socialbase.downloader.model.DownloadChunk, com.ss.android.socialbase.downloader.depend.ab, android.os.IBinder]
          mth insns count: 442
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
        /* JADX WARNING: Unknown variable types count: 12 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
            /*
                r8 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r9 == r0) goto L_0x049b
                r0 = 0
                r2 = 0
                switch(r9) {
                    case 1: goto L_0x0473;
                    case 2: goto L_0x0463;
                    case 3: goto L_0x044c;
                    case 4: goto L_0x0438;
                    case 5: goto L_0x0428;
                    case 6: goto L_0x0418;
                    case 7: goto L_0x040c;
                    case 8: goto L_0x03f8;
                    case 9: goto L_0x03e4;
                    case 10: goto L_0x03d0;
                    case 11: goto L_0x03b3;
                    case 12: goto L_0x039f;
                    case 13: goto L_0x038b;
                    case 14: goto L_0x0373;
                    case 15: goto L_0x0352;
                    case 16: goto L_0x033e;
                    case 17: goto L_0x032a;
                    case 18: goto L_0x0316;
                    case 19: goto L_0x0306;
                    case 20: goto L_0x02ef;
                    case 21: goto L_0x02df;
                    case 22: goto L_0x02b5;
                    case 23: goto L_0x028b;
                    case 24: goto L_0x026c;
                    case 25: goto L_0x0250;
                    case 26: goto L_0x0240;
                    case 27: goto L_0x0230;
                    case 28: goto L_0x021c;
                    case 29: goto L_0x0208;
                    case 30: goto L_0x01f8;
                    case 31: goto L_0x01e8;
                    case 32: goto L_0x01d1;
                    case 33: goto L_0x01bd;
                    case 34: goto L_0x01a2;
                    case 35: goto L_0x0183;
                    case 36: goto L_0x016f;
                    case 37: goto L_0x015f;
                    case 38: goto L_0x0147;
                    case 39: goto L_0x012a;
                    case 40: goto L_0x010e;
                    case 41: goto L_0x00fa;
                    case 42: goto L_0x00ee;
                    case 43: goto L_0x00d8;
                    case 44: goto L_0x00c2;
                    case 45: goto L_0x009a;
                    case 46: goto L_0x0086;
                    case 47: goto L_0x006c;
                    case 48: goto L_0x0052;
                    case 49: goto L_0x003a;
                    case 50: goto L_0x0020;
                    case 51: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r9 = super.onTransact(r9, r10, r11, r12)
                return r9
            L_0x0010:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.mo41547e()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0020:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.e r9 = r8.mo41561s(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0036
                android.os.IBinder r2 = r9.asBinder()
            L_0x0036:
                r11.writeStrongBinder(r2)
                return r1
            L_0x003a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.u r10 = com.p683ss.android.socialbase.downloader.depend.C19866u.C19867a.m48558a(r10)
                r8.mo41521a(r9, r10)
                r11.writeNoException()
                return r1
            L_0x0052:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.x r9 = r8.mo41560r(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0068
                android.os.IBinder r2 = r9.asBinder()
            L_0x0068:
                r11.writeStrongBinder(r2)
                return r1
            L_0x006c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.u r9 = r8.mo41559q(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0082
                android.os.IBinder r2 = r9.asBinder()
            L_0x0082:
                r11.writeStrongBinder(r2)
                return r1
            L_0x0086:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                r8.mo41515a(r9, r10)
                r11.writeNoException()
                return r1
            L_0x009a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x00a6
                goto L_0x00bb
            L_0x00a6:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x00b6
                boolean r12 = r10 instanceof com.p683ss.android.socialbase.downloader.depend.C19823ab
                if (r12 == 0) goto L_0x00b6
                r2 = r10
                com.ss.android.socialbase.downloader.depend.ab r2 = (com.p683ss.android.socialbase.downloader.depend.C19823ab) r2
                goto L_0x00bb
            L_0x00b6:
                com.ss.android.socialbase.downloader.depend.ab$a$a r2 = new com.ss.android.socialbase.downloader.depend.ab$a$a
                r2.<init>(r9)
            L_0x00bb:
                r8.mo41524a(r2)
                r11.writeNoException()
                return r1
            L_0x00c2:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r12 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.util.ArrayList r10 = r10.createTypedArrayList(r12)
                r8.mo41533b(r9, r10)
                r11.writeNoException()
                return r1
            L_0x00d8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r12 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.util.ArrayList r10 = r10.createTypedArrayList(r12)
                r8.mo41522a(r9, r10)
                r11.writeNoException()
                return r1
            L_0x00ee:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                r8.mo41543d()
                r11.writeNoException()
                return r1
            L_0x00fa:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo41558p(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x010e:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r12 = r10.readInt()
                int r0 = r10.readInt()
                int r10 = r10.readInt()
                r8.mo41516a(r9, r12, r0, r10)
                r11.writeNoException()
                return r1
            L_0x012a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                long r6 = r10.readLong()
                r2 = r8
                r2.mo41517a(r3, r4, r5, r6)
                r11.writeNoException()
                return r1
            L_0x0147:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r12 = r10.readInt()
                long r2 = r10.readLong()
                r8.mo41518a(r9, r12, r2)
                r11.writeNoException()
                return r1
            L_0x015f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo41557o(r9)
                r11.writeNoException()
                return r1
            L_0x016f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo41556n(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0183:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0197
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r9 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r2
            L_0x0197:
                boolean r9 = r8.mo41537b(r2)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01a2:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x01b6
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadChunk> r9 = com.p683ss.android.socialbase.downloader.model.DownloadChunk.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadChunk r2 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r2
            L_0x01b6:
                r8.mo41525a(r2)
                r11.writeNoException()
                return r1
            L_0x01bd:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r9 = r8.mo41555m(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01d1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x01e1
                r0 = 1
            L_0x01e1:
                r8.mo41540c(r9, r0)
                r11.writeNoException()
                return r1
            L_0x01e8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.mo41541c()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01f8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo41554l(r9)
                r11.writeNoException()
                return r1
            L_0x0208:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo41553k(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x021c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo41546e(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0230:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.mo41535b()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0240:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x024c
                r0 = 1
            L_0x024c:
                r8.mo41528a(r0)
                return r1
            L_0x0250:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r11 = r10.readInt()
                if (r11 == 0) goto L_0x0268
                android.os.Parcelable$Creator r11 = android.app.Notification.CREATOR
                java.lang.Object r10 = r11.createFromParcel(r10)
                r2 = r10
                android.app.Notification r2 = (android.app.Notification) r2
            L_0x0268:
                r8.mo41520a(r9, r2)
                return r1
            L_0x026c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0280
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r9 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r2
            L_0x0280:
                boolean r9 = r8.mo41529a(r2)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x028b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.g r5 = com.p683ss.android.socialbase.downloader.depend.C19840g.C19841a.m48517a(r9)
                int r6 = r10.readInt()
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x02ac
                r7 = 1
                goto L_0x02ad
            L_0x02ac:
                r7 = 0
            L_0x02ad:
                r2 = r8
                r2.mo41532b(r3, r4, r5, r6, r7)
                r11.writeNoException()
                return r1
            L_0x02b5:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.g r5 = com.p683ss.android.socialbase.downloader.depend.C19840g.C19841a.m48517a(r9)
                int r6 = r10.readInt()
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x02d6
                r7 = 1
                goto L_0x02d7
            L_0x02d6:
                r7 = 0
            L_0x02d7:
                r2 = r8
                r2.mo41519a(r3, r4, r5, r6, r7)
                r11.writeNoException()
                return r1
            L_0x02df:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo41552j(r9)
                r11.writeNoException()
                return r1
            L_0x02ef:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x02ff
                r0 = 1
            L_0x02ff:
                r8.mo41534b(r9, r0)
                r11.writeNoException()
                return r1
            L_0x0306:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.util.ArrayList r9 = r10.createStringArrayList()
                r8.mo41527a(r9)
                r11.writeNoException()
                return r1
            L_0x0316:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo41542d(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x032a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo41538c(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x033e:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo41531b(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0352:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.lang.String r10 = r10.readString()
                com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r8.mo41530b(r9, r10)
                r11.writeNoException()
                if (r9 == 0) goto L_0x036f
                r11.writeInt(r1)
                r9.writeToParcel(r11, r1)
                goto L_0x0372
            L_0x036f:
                r11.writeInt(r0)
            L_0x0372:
                return r1
            L_0x0373:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.lang.String r10 = r10.readString()
                int r9 = r8.mo41511a(r9, r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x038b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                java.util.List r9 = r8.mo41551i(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x039f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.mo41512a(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x03b3:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r8.mo41550h(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x03cc
                r11.writeInt(r1)
                r9.writeToParcel(r11, r1)
                goto L_0x03cf
            L_0x03cc:
                r11.writeInt(r0)
            L_0x03cf:
                return r1
            L_0x03d0:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo41549g(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x03e4:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r9 = r8.mo41548f(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x03f8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                long r9 = r8.mo41545e(r9)
                r11.writeNoException()
                r11.writeLong(r9)
                return r1
            L_0x040c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                r8.mo41513a()
                r11.writeNoException()
                return r1
            L_0x0418:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo41544d(r9)
                r11.writeNoException()
                return r1
            L_0x0428:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo41539c(r9)
                r11.writeNoException()
                return r1
            L_0x0438:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.mo41536b(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x044c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x045c
                r0 = 1
            L_0x045c:
                r8.mo41523a(r9, r0)
                r11.writeNoException()
                return r1
            L_0x0463:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.mo41514a(r9)
                r11.writeNoException()
                return r1
            L_0x0473:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x047f
                goto L_0x0494
            L_0x047f:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x048f
                boolean r12 = r10 instanceof com.p683ss.android.socialbase.downloader.model.C20045a
                if (r12 == 0) goto L_0x048f
                r2 = r10
                com.ss.android.socialbase.downloader.model.a r2 = (com.p683ss.android.socialbase.downloader.model.C20045a) r2
                goto L_0x0494
            L_0x048f:
                com.ss.android.socialbase.downloader.model.a$a$a r2 = new com.ss.android.socialbase.downloader.model.a$a$a
                r2.<init>(r9)
            L_0x0494:
                r8.mo41526a(r2)
                r11.writeNoException()
                return r1
            L_0x049b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r11.writeString(r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19898j.C19899a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo41511a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    List<DownloadInfo> mo41512a(String str) throws RemoteException;

    /* renamed from: a */
    void mo41513a() throws RemoteException;

    /* renamed from: a */
    void mo41514a(int i) throws RemoteException;

    /* renamed from: a */
    void mo41515a(int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo41516a(int i, int i2, int i3, int i4) throws RemoteException;

    /* renamed from: a */
    void mo41517a(int i, int i2, int i3, long j) throws RemoteException;

    /* renamed from: a */
    void mo41518a(int i, int i2, long j) throws RemoteException;

    /* renamed from: a */
    void mo41519a(int i, int i2, C19840g gVar, int i3, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo41520a(int i, Notification notification) throws RemoteException;

    /* renamed from: a */
    void mo41521a(int i, C19866u uVar) throws RemoteException;

    /* renamed from: a */
    void mo41522a(int i, List<DownloadChunk> list) throws RemoteException;

    /* renamed from: a */
    void mo41523a(int i, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo41524a(C19823ab abVar) throws RemoteException;

    /* renamed from: a */
    void mo41525a(DownloadChunk downloadChunk) throws RemoteException;

    /* renamed from: a */
    void mo41526a(C20045a aVar) throws RemoteException;

    /* renamed from: a */
    void mo41527a(List<String> list) throws RemoteException;

    /* renamed from: a */
    void mo41528a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo41529a(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: b */
    DownloadInfo mo41530b(String str, String str2) throws RemoteException;

    /* renamed from: b */
    List<DownloadInfo> mo41531b(String str) throws RemoteException;

    /* renamed from: b */
    void mo41532b(int i, int i2, C19840g gVar, int i3, boolean z) throws RemoteException;

    /* renamed from: b */
    void mo41533b(int i, List<DownloadChunk> list) throws RemoteException;

    /* renamed from: b */
    void mo41534b(int i, boolean z) throws RemoteException;

    /* renamed from: b */
    boolean mo41535b() throws RemoteException;

    /* renamed from: b */
    boolean mo41536b(int i) throws RemoteException;

    /* renamed from: b */
    boolean mo41537b(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: c */
    List<DownloadInfo> mo41538c(String str) throws RemoteException;

    /* renamed from: c */
    void mo41539c(int i) throws RemoteException;

    /* renamed from: c */
    void mo41540c(int i, boolean z) throws RemoteException;

    /* renamed from: c */
    boolean mo41541c() throws RemoteException;

    /* renamed from: d */
    List<DownloadInfo> mo41542d(String str) throws RemoteException;

    /* renamed from: d */
    void mo41543d() throws RemoteException;

    /* renamed from: d */
    void mo41544d(int i) throws RemoteException;

    /* renamed from: e */
    long mo41545e(int i) throws RemoteException;

    /* renamed from: e */
    List<DownloadInfo> mo41546e(String str) throws RemoteException;

    /* renamed from: e */
    boolean mo41547e() throws RemoteException;

    /* renamed from: f */
    int mo41548f(int i) throws RemoteException;

    /* renamed from: g */
    boolean mo41549g(int i) throws RemoteException;

    /* renamed from: h */
    DownloadInfo mo41550h(int i) throws RemoteException;

    /* renamed from: i */
    List<DownloadChunk> mo41551i(int i) throws RemoteException;

    /* renamed from: j */
    void mo41552j(int i) throws RemoteException;

    /* renamed from: k */
    boolean mo41553k(int i) throws RemoteException;

    /* renamed from: l */
    void mo41554l(int i) throws RemoteException;

    /* renamed from: m */
    int mo41555m(int i) throws RemoteException;

    /* renamed from: n */
    boolean mo41556n(int i) throws RemoteException;

    /* renamed from: o */
    void mo41557o(int i) throws RemoteException;

    /* renamed from: p */
    boolean mo41558p(int i) throws RemoteException;

    /* renamed from: q */
    C19866u mo41559q(int i) throws RemoteException;

    /* renamed from: r */
    C19871x mo41560r(int i) throws RemoteException;

    /* renamed from: s */
    C19834e mo41561s(int i) throws RemoteException;
}
