package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t;
import java.util.List;

/* renamed from: com.ss.android.ugc.asve.sandbox.g */
public interface C20782g extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.g$a */
    public static abstract class C20783a extends Binder implements C20782g {

        /* renamed from: com.ss.android.ugc.asve.sandbox.g$a$a */
        static class C20784a implements C20782g {

            /* renamed from: a */
            private IBinder f56683a;

            public final IBinder asBinder() {
                return this.f56683a;
            }

            /* renamed from: a */
            public final void mo43885a(C20676f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f56683a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo43892a(int i, int i2, float f, float[] fArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeFloat(f);
                    obtain.writeFloatArray(fArr);
                    boolean z = false;
                    this.f56683a.transact(17, obtain, obtain2, 0);
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
            public final void mo43890a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56683a.transact(19, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43887a(C20703o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f56683a.transact(33, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43891a(float[] fArr, double d) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloatArray(fArr);
                    obtain.writeDouble(d);
                    this.f56683a.transact(35, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43888a(C20712r rVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(rVar != null ? rVar.asBinder() : null);
                    this.f56683a.transact(37, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43889a(C20718t tVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    this.f56683a.transact(39, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43886a(C20700n nVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.f56683a.transact(42, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43904d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo43910f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo43911g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo43912h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(20, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo43917m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(29, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final void mo43920p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(38, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo43878a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int mo43893b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final int mo43900c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final boolean mo43913i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56683a.transact(21, obtain, obtain2, 0);
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

            /* renamed from: j */
            public final boolean mo43914j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56683a.transact(22, obtain, obtain2, 0);
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

            /* renamed from: k */
            public final float mo43915k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final List mo43916l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final boolean mo43918n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56683a.transact(30, obtain, obtain2, 0);
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
            public final boolean mo43919o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56683a.transact(31, obtain, obtain2, 0);
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
            public final boolean mo43921q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    boolean z = false;
                    this.f56683a.transact(43, obtain, obtain2, 0);
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

            /* renamed from: r */
            public final int mo43922r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final C20806o mo43907e() throws RemoteException {
                C20806o oVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    this.f56683a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        oVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20806o)) {
                            oVar = new C20808a(readStrongBinder);
                        } else {
                            oVar = (C20806o) queryLocalInterface;
                        }
                    }
                    return oVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20784a(IBinder iBinder) {
                this.f56683a = iBinder;
            }

            /* renamed from: a */
            public final void mo43879a(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    this.f56683a.transact(26, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43894b(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    this.f56683a.transact(27, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43901c(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    this.f56683a.transact(28, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo43908e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56683a.transact(41, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43905d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56683a.transact(18, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo43909e(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56683a.transact(45, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43895b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56683a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43902c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56683a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43906d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56683a.transact(40, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43881a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    this.f56683a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43903c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56683a.transact(32, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43897b(C20667c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56683a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43883a(C20661aa aaVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (aaVar != null) {
                        iBinder = aaVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56683a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43898b(C20703o oVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56683a.transact(34, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43884a(C20667c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56683a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43899b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56683a.transact(23, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43896b(int i, C20667c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56683a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43882a(int i, C20667c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeInt(i);
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56683a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43880a(float f, float f2, float f3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    this.f56683a.transact(36, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20783a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [com.ss.android.ugc.asve.sandbox.b.aa] */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.asve.sandbox.b.aa$a$a] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.ss.android.ugc.asve.sandbox.b.aa] */
        /* JADX WARNING: type inference failed for: r3v5, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v6, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v7, types: [com.ss.android.ugc.asve.sandbox.b.f] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.ss.android.ugc.asve.sandbox.b.f$a$a] */
        /* JADX WARNING: type inference failed for: r3v10, types: [com.ss.android.ugc.asve.sandbox.b.f] */
        /* JADX WARNING: type inference failed for: r3v11, types: [com.ss.android.ugc.asve.sandbox.b.r] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.ss.android.ugc.asve.sandbox.b.r$a$a] */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.ss.android.ugc.asve.sandbox.b.r] */
        /* JADX WARNING: type inference failed for: r3v15, types: [com.ss.android.ugc.asve.sandbox.b.t] */
        /* JADX WARNING: type inference failed for: r3v16, types: [com.ss.android.ugc.asve.sandbox.b.t$a$a] */
        /* JADX WARNING: type inference failed for: r3v18, types: [com.ss.android.ugc.asve.sandbox.b.t] */
        /* JADX WARNING: type inference failed for: r3v19, types: [com.ss.android.ugc.asve.sandbox.b.n] */
        /* JADX WARNING: type inference failed for: r3v20, types: [com.ss.android.ugc.asve.sandbox.b.n$a$a] */
        /* JADX WARNING: type inference failed for: r3v22, types: [com.ss.android.ugc.asve.sandbox.b.n] */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: type inference failed for: r3v25 */
        /* JADX WARNING: type inference failed for: r3v26 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: type inference failed for: r3v28 */
        /* JADX WARNING: type inference failed for: r3v29 */
        /* JADX WARNING: type inference failed for: r3v30 */
        /* JADX WARNING: type inference failed for: r3v31 */
        /* JADX WARNING: type inference failed for: r3v32 */
        /* JADX WARNING: type inference failed for: r3v33 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.IBinder, com.ss.android.ugc.asve.sandbox.b.aa$a$a, com.ss.android.ugc.asve.sandbox.b.aa, com.ss.android.ugc.asve.sandbox.b.f$a$a, com.ss.android.ugc.asve.sandbox.b.f, com.ss.android.ugc.asve.sandbox.b.r$a$a, com.ss.android.ugc.asve.sandbox.b.r, com.ss.android.ugc.asve.sandbox.b.t$a$a, com.ss.android.ugc.asve.sandbox.b.t, com.ss.android.ugc.asve.sandbox.b.n$a$a, com.ss.android.ugc.asve.sandbox.b.n]
          uses: [com.ss.android.ugc.asve.sandbox.b.aa, android.os.IBinder, com.ss.android.ugc.asve.sandbox.b.f, com.ss.android.ugc.asve.sandbox.b.r, com.ss.android.ugc.asve.sandbox.b.t, com.ss.android.ugc.asve.sandbox.b.n]
          mth insns count: 279
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 12 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                java.lang.String r0 = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService"
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r2 = 1
                if (r5 == r1) goto L_0x02d9
                r1 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x02b6;
                    case 2: goto L_0x02a8;
                    case 3: goto L_0x029a;
                    case 4: goto L_0x028f;
                    case 5: goto L_0x0281;
                    case 6: goto L_0x027a;
                    case 7: goto L_0x026f;
                    case 8: goto L_0x025b;
                    case 9: goto L_0x0248;
                    case 10: goto L_0x0241;
                    case 11: goto L_0x0232;
                    case 12: goto L_0x0223;
                    case 13: goto L_0x021c;
                    case 14: goto L_0x01f9;
                    case 15: goto L_0x01e6;
                    case 16: goto L_0x01db;
                    case 17: goto L_0x01bd;
                    case 18: goto L_0x01b2;
                    case 19: goto L_0x01a4;
                    case 20: goto L_0x019d;
                    case 21: goto L_0x018f;
                    case 22: goto L_0x0181;
                    case 23: goto L_0x0173;
                    case 24: goto L_0x0165;
                    case 25: goto L_0x0157;
                    case 26: goto L_0x014c;
                    case 27: goto L_0x0141;
                    case 28: goto L_0x0136;
                    case 29: goto L_0x012f;
                    case 30: goto L_0x0121;
                    case 31: goto L_0x0113;
                    case 32: goto L_0x0105;
                    case 33: goto L_0x00f6;
                    case 34: goto L_0x00e7;
                    case 35: goto L_0x00d8;
                    case 36: goto L_0x00c5;
                    case 37: goto L_0x00a2;
                    case 38: goto L_0x009b;
                    case 39: goto L_0x0078;
                    case 40: goto L_0x006a;
                    case 41: goto L_0x005f;
                    case 42: goto L_0x003c;
                    case 43: goto L_0x002e;
                    case 44: goto L_0x0020;
                    case 45: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x001c
                r1 = 1
            L_0x001c:
                r4.mo43909e(r1)
                return r2
            L_0x0020:
                r6.enforceInterface(r0)
                int r5 = r4.mo43922r()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x002e:
                r6.enforceInterface(r0)
                boolean r5 = r4.mo43921q()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x003c:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0046
                goto L_0x005b
            L_0x0046:
                java.lang.String r6 = "com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x0056
                boolean r7 = r6 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n
                if (r7 == 0) goto L_0x0056
                r3 = r6
                com.ss.android.ugc.asve.sandbox.b.n r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n) r3
                goto L_0x005b
            L_0x0056:
                com.ss.android.ugc.asve.sandbox.b.n$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.n$a$a
                r3.<init>(r5)
            L_0x005b:
                r4.mo43886a(r3)
                return r2
            L_0x005f:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                r4.mo43908e(r5)
                return r2
            L_0x006a:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0074
                r1 = 1
            L_0x0074:
                r4.mo43906d(r1)
                return r2
            L_0x0078:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0082
                goto L_0x0097
            L_0x0082:
                java.lang.String r6 = "com.ss.android.ugc.asve.sandbox.listener.IFrameRefreshListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x0092
                boolean r7 = r6 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t
                if (r7 == 0) goto L_0x0092
                r3 = r6
                com.ss.android.ugc.asve.sandbox.b.t r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t) r3
                goto L_0x0097
            L_0x0092:
                com.ss.android.ugc.asve.sandbox.b.t$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.t$a$a
                r3.<init>(r5)
            L_0x0097:
                r4.mo43889a(r3)
                return r2
            L_0x009b:
                r6.enforceInterface(r0)
                r4.mo43920p()
                return r2
            L_0x00a2:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x00ac
                goto L_0x00c1
            L_0x00ac:
                java.lang.String r6 = "com.ss.android.ugc.asve.sandbox.listener.IFOVCallback"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x00bc
                boolean r7 = r6 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r
                if (r7 == 0) goto L_0x00bc
                r3 = r6
                com.ss.android.ugc.asve.sandbox.b.r r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r) r3
                goto L_0x00c1
            L_0x00bc:
                com.ss.android.ugc.asve.sandbox.b.r$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.r$a$a
                r3.<init>(r5)
            L_0x00c1:
                r4.mo43888a(r3)
                return r2
            L_0x00c5:
                r6.enforceInterface(r0)
                float r5 = r6.readFloat()
                float r7 = r6.readFloat()
                float r6 = r6.readFloat()
                r4.mo43880a(r5, r7, r6)
                return r2
            L_0x00d8:
                r6.enforceInterface(r0)
                float[] r5 = r6.createFloatArray()
                double r6 = r6.readDouble()
                r4.mo43891a(r5, r6)
                return r2
            L_0x00e7:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.o r5 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o.C20704a.m52043a(r5)
                r4.mo43898b(r5)
                return r2
            L_0x00f6:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.o r5 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o.C20704a.m52043a(r5)
                r4.mo43887a(r5)
                return r2
            L_0x0105:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x010f
                r1 = 1
            L_0x010f:
                r4.mo43903c(r1)
                return r2
            L_0x0113:
                r6.enforceInterface(r0)
                boolean r5 = r4.mo43919o()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0121:
                r6.enforceInterface(r0)
                boolean r5 = r4.mo43918n()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x012f:
                r6.enforceInterface(r0)
                r4.mo43917m()
                return r2
            L_0x0136:
                r6.enforceInterface(r0)
                float r5 = r6.readFloat()
                r4.mo43901c(r5)
                return r2
            L_0x0141:
                r6.enforceInterface(r0)
                float r5 = r6.readFloat()
                r4.mo43894b(r5)
                return r2
            L_0x014c:
                r6.enforceInterface(r0)
                float r5 = r6.readFloat()
                r4.mo43879a(r5)
                return r2
            L_0x0157:
                r6.enforceInterface(r0)
                java.util.List r5 = r4.mo43916l()
                r7.writeNoException()
                r7.writeList(r5)
                return r2
            L_0x0165:
                r6.enforceInterface(r0)
                float r5 = r4.mo43915k()
                r7.writeNoException()
                r7.writeFloat(r5)
                return r2
            L_0x0173:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x017d
                r1 = 1
            L_0x017d:
                r4.mo43899b(r1)
                return r2
            L_0x0181:
                r6.enforceInterface(r0)
                boolean r5 = r4.mo43914j()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x018f:
                r6.enforceInterface(r0)
                boolean r5 = r4.mo43913i()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x019d:
                r6.enforceInterface(r0)
                r4.mo43912h()
                return r2
            L_0x01a4:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01ae
                r1 = 1
            L_0x01ae:
                r4.mo43890a(r1)
                return r2
            L_0x01b2:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                r4.mo43905d(r5)
                return r2
            L_0x01bd:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                float r0 = r6.readFloat()
                float[] r6 = r6.createFloatArray()
                boolean r5 = r4.mo43892a(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x01db:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                r4.mo43902c(r5)
                return r2
            L_0x01e6:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                android.os.IBinder r6 = r6.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.c r6 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a.m52009a(r6)
                r4.mo43896b(r5, r6)
                return r2
            L_0x01f9:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0203
                goto L_0x0218
            L_0x0203:
                java.lang.String r6 = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x0213
                boolean r7 = r6 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f
                if (r7 == 0) goto L_0x0213
                r3 = r6
                com.ss.android.ugc.asve.sandbox.b.f r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f) r3
                goto L_0x0218
            L_0x0213:
                com.ss.android.ugc.asve.sandbox.b.f$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.f$a$a
                r3.<init>(r5)
            L_0x0218:
                r4.mo43885a(r3)
                return r2
            L_0x021c:
                r6.enforceInterface(r0)
                r4.mo43911g()
                return r2
            L_0x0223:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.c r5 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a.m52009a(r5)
                r4.mo43897b(r5)
                return r2
            L_0x0232:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.c r5 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a.m52009a(r5)
                r4.mo43884a(r5)
                return r2
            L_0x0241:
                r6.enforceInterface(r0)
                r4.mo43910f()
                return r2
            L_0x0248:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                android.os.IBinder r6 = r6.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.c r6 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a.m52009a(r6)
                r4.mo43882a(r5, r6)
                return r2
            L_0x025b:
                r6.enforceInterface(r0)
                com.ss.android.ugc.asve.sandbox.o r5 = r4.mo43907e()
                r7.writeNoException()
                if (r5 == 0) goto L_0x026b
                android.os.IBinder r3 = r5.asBinder()
            L_0x026b:
                r7.writeStrongBinder(r3)
                return r2
            L_0x026f:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                r4.mo43895b(r5)
                return r2
            L_0x027a:
                r6.enforceInterface(r0)
                r4.mo43904d()
                return r2
            L_0x0281:
                r6.enforceInterface(r0)
                int r5 = r4.mo43900c()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x028f:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                r4.mo43881a(r5)
                return r2
            L_0x029a:
                r6.enforceInterface(r0)
                int r5 = r4.mo43893b()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x02a8:
                r6.enforceInterface(r0)
                int r5 = r4.mo43878a()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x02b6:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x02c0
                goto L_0x02d5
            L_0x02c0:
                java.lang.String r6 = "com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x02d0
                boolean r7 = r6 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa
                if (r7 == 0) goto L_0x02d0
                r3 = r6
                com.ss.android.ugc.asve.sandbox.b.aa r3 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa) r3
                goto L_0x02d5
            L_0x02d0:
                com.ss.android.ugc.asve.sandbox.b.aa$a$a r3 = new com.ss.android.ugc.asve.sandbox.b.aa$a$a
                r3.<init>(r5)
            L_0x02d5:
                r4.mo43883a(r3)
                return r2
            L_0x02d9:
                r7.writeString(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.sandbox.C20782g.C20783a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo43878a() throws RemoteException;

    /* renamed from: a */
    void mo43879a(float f) throws RemoteException;

    /* renamed from: a */
    void mo43880a(float f, float f2, float f3) throws RemoteException;

    /* renamed from: a */
    void mo43881a(int i) throws RemoteException;

    /* renamed from: a */
    void mo43882a(int i, C20667c cVar) throws RemoteException;

    /* renamed from: a */
    void mo43883a(C20661aa aaVar) throws RemoteException;

    /* renamed from: a */
    void mo43884a(C20667c cVar) throws RemoteException;

    /* renamed from: a */
    void mo43885a(C20676f fVar) throws RemoteException;

    /* renamed from: a */
    void mo43886a(C20700n nVar) throws RemoteException;

    /* renamed from: a */
    void mo43887a(C20703o oVar) throws RemoteException;

    /* renamed from: a */
    void mo43888a(C20712r rVar) throws RemoteException;

    /* renamed from: a */
    void mo43889a(C20718t tVar) throws RemoteException;

    /* renamed from: a */
    void mo43890a(boolean z) throws RemoteException;

    /* renamed from: a */
    void mo43891a(float[] fArr, double d) throws RemoteException;

    /* renamed from: a */
    boolean mo43892a(int i, int i2, float f, float[] fArr) throws RemoteException;

    /* renamed from: b */
    int mo43893b() throws RemoteException;

    /* renamed from: b */
    void mo43894b(float f) throws RemoteException;

    /* renamed from: b */
    void mo43895b(int i) throws RemoteException;

    /* renamed from: b */
    void mo43896b(int i, C20667c cVar) throws RemoteException;

    /* renamed from: b */
    void mo43897b(C20667c cVar) throws RemoteException;

    /* renamed from: b */
    void mo43898b(C20703o oVar) throws RemoteException;

    /* renamed from: b */
    void mo43899b(boolean z) throws RemoteException;

    /* renamed from: c */
    int mo43900c() throws RemoteException;

    /* renamed from: c */
    void mo43901c(float f) throws RemoteException;

    /* renamed from: c */
    void mo43902c(int i) throws RemoteException;

    /* renamed from: c */
    void mo43903c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo43904d() throws RemoteException;

    /* renamed from: d */
    void mo43905d(int i) throws RemoteException;

    /* renamed from: d */
    void mo43906d(boolean z) throws RemoteException;

    /* renamed from: e */
    C20806o mo43907e() throws RemoteException;

    /* renamed from: e */
    void mo43908e(int i) throws RemoteException;

    /* renamed from: e */
    void mo43909e(boolean z) throws RemoteException;

    /* renamed from: f */
    void mo43910f() throws RemoteException;

    /* renamed from: g */
    void mo43911g() throws RemoteException;

    /* renamed from: h */
    void mo43912h() throws RemoteException;

    /* renamed from: i */
    boolean mo43913i() throws RemoteException;

    /* renamed from: j */
    boolean mo43914j() throws RemoteException;

    /* renamed from: k */
    float mo43915k() throws RemoteException;

    /* renamed from: l */
    List mo43916l() throws RemoteException;

    /* renamed from: m */
    void mo43917m() throws RemoteException;

    /* renamed from: n */
    boolean mo43918n() throws RemoteException;

    /* renamed from: o */
    boolean mo43919o() throws RemoteException;

    /* renamed from: p */
    void mo43920p() throws RemoteException;

    /* renamed from: q */
    boolean mo43921q() throws RemoteException;

    /* renamed from: r */
    int mo43922r() throws RemoteException;
}
