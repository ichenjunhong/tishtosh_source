package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult.C20405a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d.C20671a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20673e;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20673e.C20674a.C20675a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20679g;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20679g.C20680a.C20681a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i.C20686a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j.C20689a.C20690a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20691k;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20691k.C20692a.C20693a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.asve.sandbox.j */
public interface C20791j extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.j$a */
    public static abstract class C20792a extends Binder implements C20791j {

        /* renamed from: com.ss.android.ugc.asve.sandbox.j$a$a */
        static class C20793a implements C20791j {

            /* renamed from: a */
            private IBinder f56686a;

            public final IBinder asBinder() {
                return this.f56686a;
            }

            /* renamed from: a */
            public final void mo44037a(C20670d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f56686a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44040a(String str, int i, int i2, boolean z, int i3, C20688j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i3);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f56686a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44034a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(i);
                    this.f56686a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44038a(C20685i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f56686a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44036a(Surface surface, String str, C20685i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f56686a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44044a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i, C20673e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeTypedArray(aSMediaSegmentArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f56686a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44035a(Surface surface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56686a.transact(20, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44042a(String str, String str2, boolean z, String str3, String str4, C20679g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f56686a.transact(23, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44033a(float f, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56686a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44043a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56686a.transact(27, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44039a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    this.f56686a.transact(33, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44041a(String str, long j, long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.f56686a.transact(34, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44031a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44045b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo44053d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo44055e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo44057f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo44061i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(26, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo44062j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(29, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo44063k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(30, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final long mo44051c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final long mo44059g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final boolean mo44060h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    boolean z = false;
                    this.f56686a.transact(21, obtain, obtain2, 0);
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
            public final long mo44064l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final int mo44065m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final int mo44066n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final int mo44067o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final float mo44068p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final int mo44069q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final int mo44070r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public final int mo44071s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public final float mo44072t() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public final float mo44073u() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public final int mo44074v() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public final float[] mo44075w() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    this.f56686a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createFloatArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20793a(IBinder iBinder) {
                this.f56686a = iBinder;
            }

            /* renamed from: c */
            public final void mo44052c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56686a.transact(35, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44046b(Surface surface) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56686a.transact(32, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo44054d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56686a.transact(36, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo44056e(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56686a.transact(37, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final boolean mo44058f(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56686a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44049b(C20685i iVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (iVar != null) {
                        iBinder = iVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56686a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo44050b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56686a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44047b(Surface surface, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f56686a.transact(31, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo44028a(Surface surface, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f56686a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44048b(Surface surface, String str, C20685i iVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (iVar != null) {
                        iBinder = iVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56686a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo44029a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeTypedArray(aSMediaSegmentArr, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f56686a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final RecorderConcatResult mo44030a(String str, String str2, String str3, String str4) throws RemoteException {
                RecorderConcatResult recorderConcatResult;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f56686a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        recorderConcatResult = C20405a.m50613a(obtain2);
                    } else {
                        recorderConcatResult = null;
                    }
                    return recorderConcatResult;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo44026a(double d, boolean z, float f, int i, int i2, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeDouble(d);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f56686a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44032a(double d, boolean z, float f, int i, int i2, boolean z2, C20691k kVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeDouble(d);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (kVar != null) {
                        iBinder = kVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56686a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo44027a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56686a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20792a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C20688j jVar;
            C20688j jVar2;
            boolean z;
            boolean z2;
            C20691k kVar;
            C20691k kVar2;
            boolean z3;
            boolean z4;
            C20673e eVar;
            C20673e eVar2;
            C20679g gVar;
            C20679g gVar2;
            boolean z5;
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService";
            if (i3 != 1598968902) {
                Surface surface = null;
                boolean z6 = false;
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface(str);
                        mo44031a();
                        return true;
                    case 2:
                        parcel3.enforceInterface(str);
                        mo44045b();
                        return true;
                    case 3:
                        parcel3.enforceInterface(str);
                        long c = mo44051c();
                        parcel2.writeNoException();
                        parcel4.writeLong(c);
                        return true;
                    case 4:
                        parcel3.enforceInterface(str);
                        mo44037a(C20671a.m52014a(parcel.readStrongBinder()));
                        return true;
                    case 5:
                        parcel3.enforceInterface(str);
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        int readInt3 = parcel.readInt();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            jVar = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20688j)) {
                                jVar2 = new C20690a(readStrongBinder);
                            } else {
                                jVar2 = (C20688j) queryLocalInterface;
                            }
                            jVar = jVar2;
                        }
                        mo44040a(readString, readInt, readInt2, z6, readInt3, jVar);
                        return true;
                    case 6:
                        parcel3.enforceInterface(str);
                        mo44034a(parcel.readInt());
                        return true;
                    case 7:
                        parcel3.enforceInterface(str);
                        double readDouble = parcel.readDouble();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float readFloat = parcel.readFloat();
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            kVar = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C20691k)) {
                                kVar2 = new C20693a(readStrongBinder2);
                            } else {
                                kVar2 = (C20691k) queryLocalInterface2;
                            }
                            kVar = kVar2;
                        }
                        mo44032a(readDouble, z, readFloat, readInt4, readInt5, z2, kVar);
                        return true;
                    case 8:
                        parcel3.enforceInterface(str);
                        double readDouble2 = parcel.readDouble();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float readFloat2 = parcel.readFloat();
                        int readInt6 = parcel.readInt();
                        int readInt7 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int a = mo44026a(readDouble2, z3, readFloat2, readInt6, readInt7, z4);
                        parcel2.writeNoException();
                        parcel4.writeInt(a);
                        return true;
                    case 9:
                        parcel3.enforceInterface(str);
                        mo44053d();
                        return true;
                    case 10:
                        parcel3.enforceInterface(str);
                        mo44055e();
                        return true;
                    case 11:
                        parcel3.enforceInterface(str);
                        mo44038a(C20686a.m52026a(parcel.readStrongBinder()));
                        return true;
                    case 12:
                        parcel3.enforceInterface(str);
                        mo44057f();
                        return true;
                    case 13:
                        parcel3.enforceInterface(str);
                        mo44049b(C20686a.m52026a(parcel.readStrongBinder()));
                        return true;
                    case 14:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        int a2 = mo44028a(surface, parcel.readString());
                        parcel2.writeNoException();
                        parcel4.writeInt(a2);
                        return true;
                    case 15:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo44036a(surface, parcel.readString(), C20686a.m52026a(parcel.readStrongBinder()));
                        return true;
                    case 16:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo44048b(surface, parcel.readString(), C20686a.m52026a(parcel.readStrongBinder()));
                        return true;
                    case 17:
                        parcel3.enforceInterface(str);
                        long g = mo44059g();
                        parcel2.writeNoException();
                        parcel4.writeLong(g);
                        return true;
                    case 18:
                        parcel3.enforceInterface(str);
                        int a3 = mo44029a((ASMediaSegment[]) parcel3.createTypedArray(ASMediaSegment.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(a3);
                        return true;
                    case 19:
                        parcel3.enforceInterface(str);
                        ASMediaSegment[] aSMediaSegmentArr = (ASMediaSegment[]) parcel3.createTypedArray(ASMediaSegment.CREATOR);
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        int readInt8 = parcel.readInt();
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 == null) {
                            eVar = null;
                        } else {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback");
                            if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof C20673e)) {
                                eVar2 = new C20675a(readStrongBinder3);
                            } else {
                                eVar2 = (C20673e) queryLocalInterface3;
                            }
                            eVar = eVar2;
                        }
                        mo44044a(aSMediaSegmentArr, readString2, readString3, readInt8, eVar);
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo44035a(surface);
                        return true;
                    case 21:
                        parcel3.enforceInterface(str);
                        boolean h = mo44060h();
                        parcel2.writeNoException();
                        parcel4.writeInt(h ? 1 : 0);
                        return true;
                    case 22:
                        parcel3.enforceInterface(str);
                        RecorderConcatResult a4 = mo44030a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            parcel4.writeInt(1);
                            a4.writeToParcel(parcel4, 1);
                        } else {
                            parcel4.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel3.enforceInterface(str);
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        String readString6 = parcel.readString();
                        String readString7 = parcel.readString();
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        if (readStrongBinder4 == null) {
                            gVar = null;
                        } else {
                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback");
                            if (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof C20679g)) {
                                gVar2 = new C20681a(readStrongBinder4);
                            } else {
                                gVar2 = (C20679g) queryLocalInterface4;
                            }
                            gVar = gVar2;
                        }
                        mo44042a(readString4, readString5, z6, readString6, readString7, gVar);
                        return true;
                    case 24:
                        parcel3.enforceInterface(str);
                        int readInt9 = parcel.readInt();
                        int readInt10 = parcel.readInt();
                        String readString8 = parcel.readString();
                        int readInt11 = parcel.readInt();
                        int readInt12 = parcel.readInt();
                        String readString9 = parcel.readString();
                        int readInt13 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int a5 = mo44027a(readInt9, readInt10, readString8, readInt11, readInt12, readString9, readInt13, z5);
                        parcel2.writeNoException();
                        parcel4.writeInt(a5);
                        return true;
                    case 25:
                        parcel3.enforceInterface(str);
                        mo44033a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                        return true;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        parcel3.enforceInterface(str);
                        mo44061i();
                        return true;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo44043a(z6);
                        return true;
                    case 28:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        boolean b = mo44050b(z6);
                        parcel2.writeNoException();
                        parcel4.writeInt(b ? 1 : 0);
                        return true;
                    case 29:
                        parcel3.enforceInterface(str);
                        mo44062j();
                        return true;
                    case 30:
                        parcel3.enforceInterface(str);
                        mo44063k();
                        return true;
                    case 31:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo44047b(surface, parcel.readString());
                        return true;
                    case 32:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        }
                        mo44046b(surface);
                        return true;
                    case 33:
                        parcel3.enforceInterface(str);
                        mo44039a(parcel.readString());
                        return true;
                    case 34:
                        parcel3.enforceInterface(str);
                        mo44041a(parcel.readString(), parcel.readLong(), parcel.readLong());
                        return true;
                    case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo44052c(z6);
                        return true;
                    case 36:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo44054d(z6);
                        return true;
                    case 37:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        mo44056e(z6);
                        return true;
                    case 38:
                        parcel3.enforceInterface(str);
                        long l = mo44064l();
                        parcel2.writeNoException();
                        parcel4.writeLong(l);
                        return true;
                    case 39:
                        parcel3.enforceInterface(str);
                        int m = mo44065m();
                        parcel2.writeNoException();
                        parcel4.writeInt(m);
                        return true;
                    case 40:
                        parcel3.enforceInterface(str);
                        int n = mo44066n();
                        parcel2.writeNoException();
                        parcel4.writeInt(n);
                        return true;
                    case BaseNotice.LIKE /*41*/:
                        parcel3.enforceInterface(str);
                        int o = mo44067o();
                        parcel2.writeNoException();
                        parcel4.writeInt(o);
                        return true;
                    case 42:
                        parcel3.enforceInterface(str);
                        float p = mo44068p();
                        parcel2.writeNoException();
                        parcel4.writeFloat(p);
                        return true;
                    case 43:
                        parcel3.enforceInterface(str);
                        int q = mo44069q();
                        parcel2.writeNoException();
                        parcel4.writeInt(q);
                        return true;
                    case 44:
                        parcel3.enforceInterface(str);
                        int r = mo44070r();
                        parcel2.writeNoException();
                        parcel4.writeInt(r);
                        return true;
                    case BaseNotice.f96882AT /*45*/:
                        parcel3.enforceInterface(str);
                        int s = mo44071s();
                        parcel2.writeNoException();
                        parcel4.writeInt(s);
                        return true;
                    case 46:
                        parcel3.enforceInterface(str);
                        float t = mo44072t();
                        parcel2.writeNoException();
                        parcel4.writeFloat(t);
                        return true;
                    case 47:
                        parcel3.enforceInterface(str);
                        float u = mo44073u();
                        parcel2.writeNoException();
                        parcel4.writeFloat(u);
                        return true;
                    case 48:
                        parcel3.enforceInterface(str);
                        int v = mo44074v();
                        parcel2.writeNoException();
                        parcel4.writeInt(v);
                        return true;
                    case 49:
                        parcel3.enforceInterface(str);
                        float[] w = mo44075w();
                        parcel2.writeNoException();
                        parcel4.writeFloatArray(w);
                        return true;
                    case 50:
                        parcel3.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        boolean f = mo44058f(z6);
                        parcel2.writeNoException();
                        parcel4.writeInt(f ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo44026a(double d, boolean z, float f, int i, int i2, boolean z2) throws RemoteException;

    /* renamed from: a */
    int mo44027a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) throws RemoteException;

    /* renamed from: a */
    int mo44028a(Surface surface, String str) throws RemoteException;

    /* renamed from: a */
    int mo44029a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i) throws RemoteException;

    /* renamed from: a */
    RecorderConcatResult mo44030a(String str, String str2, String str3, String str4) throws RemoteException;

    /* renamed from: a */
    void mo44031a() throws RemoteException;

    /* renamed from: a */
    void mo44032a(double d, boolean z, float f, int i, int i2, boolean z2, C20691k kVar) throws RemoteException;

    /* renamed from: a */
    void mo44033a(float f, int i, int i2) throws RemoteException;

    /* renamed from: a */
    void mo44034a(int i) throws RemoteException;

    /* renamed from: a */
    void mo44035a(Surface surface) throws RemoteException;

    /* renamed from: a */
    void mo44036a(Surface surface, String str, C20685i iVar) throws RemoteException;

    /* renamed from: a */
    void mo44037a(C20670d dVar) throws RemoteException;

    /* renamed from: a */
    void mo44038a(C20685i iVar) throws RemoteException;

    /* renamed from: a */
    void mo44039a(String str) throws RemoteException;

    /* renamed from: a */
    void mo44040a(String str, int i, int i2, boolean z, int i3, C20688j jVar) throws RemoteException;

    /* renamed from: a */
    void mo44041a(String str, long j, long j2) throws RemoteException;

    /* renamed from: a */
    void mo44042a(String str, String str2, boolean z, String str3, String str4, C20679g gVar) throws RemoteException;

    /* renamed from: a */
    void mo44043a(boolean z) throws RemoteException;

    /* renamed from: a */
    void mo44044a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i, C20673e eVar) throws RemoteException;

    /* renamed from: b */
    void mo44045b() throws RemoteException;

    /* renamed from: b */
    void mo44046b(Surface surface) throws RemoteException;

    /* renamed from: b */
    void mo44047b(Surface surface, String str) throws RemoteException;

    /* renamed from: b */
    void mo44048b(Surface surface, String str, C20685i iVar) throws RemoteException;

    /* renamed from: b */
    void mo44049b(C20685i iVar) throws RemoteException;

    /* renamed from: b */
    boolean mo44050b(boolean z) throws RemoteException;

    /* renamed from: c */
    long mo44051c() throws RemoteException;

    /* renamed from: c */
    void mo44052c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo44053d() throws RemoteException;

    /* renamed from: d */
    void mo44054d(boolean z) throws RemoteException;

    /* renamed from: e */
    void mo44055e() throws RemoteException;

    /* renamed from: e */
    void mo44056e(boolean z) throws RemoteException;

    /* renamed from: f */
    void mo44057f() throws RemoteException;

    /* renamed from: f */
    boolean mo44058f(boolean z) throws RemoteException;

    /* renamed from: g */
    long mo44059g() throws RemoteException;

    /* renamed from: h */
    boolean mo44060h() throws RemoteException;

    /* renamed from: i */
    void mo44061i() throws RemoteException;

    /* renamed from: j */
    void mo44062j() throws RemoteException;

    /* renamed from: k */
    void mo44063k() throws RemoteException;

    /* renamed from: l */
    long mo44064l() throws RemoteException;

    /* renamed from: m */
    int mo44065m() throws RemoteException;

    /* renamed from: n */
    int mo44066n() throws RemoteException;

    /* renamed from: o */
    int mo44067o() throws RemoteException;

    /* renamed from: p */
    float mo44068p() throws RemoteException;

    /* renamed from: q */
    int mo44069q() throws RemoteException;

    /* renamed from: r */
    int mo44070r() throws RemoteException;

    /* renamed from: s */
    int mo44071s() throws RemoteException;

    /* renamed from: t */
    float mo44072t() throws RemoteException;

    /* renamed from: u */
    float mo44073u() throws RemoteException;

    /* renamed from: v */
    int mo44074v() throws RemoteException;

    /* renamed from: w */
    float[] mo44075w() throws RemoteException;
}
