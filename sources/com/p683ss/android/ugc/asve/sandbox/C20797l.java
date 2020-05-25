package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20682h;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20694l;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20697m;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20825d;

/* renamed from: com.ss.android.ugc.asve.sandbox.l */
public interface C20797l extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.l$a */
    public static abstract class C20798a extends Binder implements C20797l {

        /* renamed from: com.ss.android.ugc.asve.sandbox.l$a$a */
        static class C20799a implements C20797l {

            /* renamed from: a */
            private IBinder f56688a;

            public final IBinder asBinder() {
                return this.f56688a;
            }

            /* renamed from: a */
            public final void mo44085a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44091b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo44098h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final void mo44099i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final void mo44100j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(14, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo44101k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(15, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo44102l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(16, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo44103m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(17, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final C20788i mo44093c() throws RemoteException {
                C20788i iVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20788i)) {
                            iVar = new C20790a(readStrongBinder);
                        } else {
                            iVar = (C20788i) queryLocalInterface;
                        }
                    }
                    return iVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final C20782g mo44094d() throws RemoteException {
                C20782g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        gVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20782g)) {
                            gVar = new C20784a(readStrongBinder);
                        } else {
                            gVar = (C20782g) queryLocalInterface;
                        }
                    }
                    return gVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final C20791j mo44095e() throws RemoteException {
                C20791j jVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        jVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20791j)) {
                            jVar = new C20793a(readStrongBinder);
                        } else {
                            jVar = (C20791j) queryLocalInterface;
                        }
                    }
                    return jVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final C20785h mo44096f() throws RemoteException {
                C20785h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        hVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20785h)) {
                            hVar = new C20787a(readStrongBinder);
                        } else {
                            hVar = (C20785h) queryLocalInterface;
                        }
                    }
                    return hVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final C20794k mo44097g() throws RemoteException {
                C20794k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    this.f56688a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        kVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20794k)) {
                            kVar = new C20796a(readStrongBinder);
                        } else {
                            kVar = (C20794k) queryLocalInterface;
                        }
                    }
                    return kVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20799a(IBinder iBinder) {
                this.f56688a = iBinder;
            }

            /* renamed from: a */
            public final void mo44086a(C20670d dVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56688a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo44092b(C20694l lVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (lVar != null) {
                        iBinder = lVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56688a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44087a(C20682h hVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (hVar != null) {
                        iBinder = hVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56688a.transact(19, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44088a(C20694l lVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (lVar != null) {
                        iBinder = lVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56688a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44089a(C20697m mVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (mVar != null) {
                        iBinder = mVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56688a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44090a(C20825d dVar, String str) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f56688a.transact(18, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20798a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v2, types: [com.ss.android.ugc.asve.sandbox.b.m] */
        /* JADX WARNING: type inference failed for: r1v3, types: [com.ss.android.ugc.asve.sandbox.b.m$a$a] */
        /* JADX WARNING: type inference failed for: r1v5, types: [com.ss.android.ugc.asve.sandbox.b.m] */
        /* JADX WARNING: type inference failed for: r1v6, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v7, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v9, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v10, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v11, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v12, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v13, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v14, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v15, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v16, types: [com.ss.android.ugc.asve.sandbox.wrap.d] */
        /* JADX WARNING: type inference failed for: r1v17, types: [com.ss.android.ugc.asve.sandbox.wrap.d$a$a] */
        /* JADX WARNING: type inference failed for: r1v19, types: [com.ss.android.ugc.asve.sandbox.wrap.d] */
        /* JADX WARNING: type inference failed for: r1v20, types: [com.ss.android.ugc.asve.sandbox.b.h] */
        /* JADX WARNING: type inference failed for: r1v21, types: [com.ss.android.ugc.asve.sandbox.b.h$a$a] */
        /* JADX WARNING: type inference failed for: r1v23, types: [com.ss.android.ugc.asve.sandbox.b.h] */
        /* JADX WARNING: type inference failed for: r1v24 */
        /* JADX WARNING: type inference failed for: r1v25 */
        /* JADX WARNING: type inference failed for: r1v26 */
        /* JADX WARNING: type inference failed for: r1v27 */
        /* JADX WARNING: type inference failed for: r1v28 */
        /* JADX WARNING: type inference failed for: r1v29 */
        /* JADX WARNING: type inference failed for: r1v30 */
        /* JADX WARNING: type inference failed for: r1v31 */
        /* JADX WARNING: type inference failed for: r1v32 */
        /* JADX WARNING: type inference failed for: r1v33 */
        /* JADX WARNING: type inference failed for: r1v34 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.IBinder, com.ss.android.ugc.asve.sandbox.b.m$a$a, com.ss.android.ugc.asve.sandbox.b.m, com.ss.android.ugc.asve.sandbox.wrap.d$a$a, com.ss.android.ugc.asve.sandbox.wrap.d, com.ss.android.ugc.asve.sandbox.b.h$a$a, com.ss.android.ugc.asve.sandbox.b.h]
          uses: [com.ss.android.ugc.asve.sandbox.b.m, android.os.IBinder, com.ss.android.ugc.asve.sandbox.wrap.d, com.ss.android.ugc.asve.sandbox.b.h]
          mth insns count: 133
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
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                java.lang.String r0 = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService"
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r2 = 1
                if (r4 == r1) goto L_0x0147
                r1 = 0
                switch(r4) {
                    case 1: goto L_0x0124;
                    case 2: goto L_0x0115;
                    case 3: goto L_0x0106;
                    case 4: goto L_0x00f7;
                    case 5: goto L_0x00f0;
                    case 6: goto L_0x00e9;
                    case 7: goto L_0x00d5;
                    case 8: goto L_0x00c1;
                    case 9: goto L_0x00ad;
                    case 10: goto L_0x0099;
                    case 11: goto L_0x0085;
                    case 12: goto L_0x007e;
                    case 13: goto L_0x0077;
                    case 14: goto L_0x0070;
                    case 15: goto L_0x0069;
                    case 16: goto L_0x0062;
                    case 17: goto L_0x005b;
                    case 18: goto L_0x0034;
                    case 19: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r0)
                android.os.IBinder r4 = r5.readStrongBinder()
                if (r4 != 0) goto L_0x001b
                goto L_0x0030
            L_0x001b:
                java.lang.String r5 = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxExternalOnInfoCallback"
                android.os.IInterface r5 = r4.queryLocalInterface(r5)
                if (r5 == 0) goto L_0x002b
                boolean r6 = r5 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20682h
                if (r6 == 0) goto L_0x002b
                r1 = r5
                com.ss.android.ugc.asve.sandbox.b.h r1 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20682h) r1
                goto L_0x0030
            L_0x002b:
                com.ss.android.ugc.asve.sandbox.b.h$a$a r1 = new com.ss.android.ugc.asve.sandbox.b.h$a$a
                r1.<init>(r4)
            L_0x0030:
                r3.mo44087a(r1)
                return r2
            L_0x0034:
                r5.enforceInterface(r0)
                android.os.IBinder r4 = r5.readStrongBinder()
                if (r4 != 0) goto L_0x003e
                goto L_0x0053
            L_0x003e:
                java.lang.String r6 = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager"
                android.os.IInterface r6 = r4.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x004e
                boolean r7 = r6 instanceof com.p683ss.android.ugc.asve.sandbox.wrap.C20825d
                if (r7 == 0) goto L_0x004e
                r1 = r6
                com.ss.android.ugc.asve.sandbox.wrap.d r1 = (com.p683ss.android.ugc.asve.sandbox.wrap.C20825d) r1
                goto L_0x0053
            L_0x004e:
                com.ss.android.ugc.asve.sandbox.wrap.d$a$a r1 = new com.ss.android.ugc.asve.sandbox.wrap.d$a$a
                r1.<init>(r4)
            L_0x0053:
                java.lang.String r4 = r5.readString()
                r3.mo44090a(r1, r4)
                return r2
            L_0x005b:
                r5.enforceInterface(r0)
                r3.mo44103m()
                return r2
            L_0x0062:
                r5.enforceInterface(r0)
                r3.mo44102l()
                return r2
            L_0x0069:
                r5.enforceInterface(r0)
                r3.mo44101k()
                return r2
            L_0x0070:
                r5.enforceInterface(r0)
                r3.mo44100j()
                return r2
            L_0x0077:
                r5.enforceInterface(r0)
                r3.mo44099i()
                return r2
            L_0x007e:
                r5.enforceInterface(r0)
                r3.mo44098h()
                return r2
            L_0x0085:
                r5.enforceInterface(r0)
                com.ss.android.ugc.asve.sandbox.k r4 = r3.mo44097g()
                r6.writeNoException()
                if (r4 == 0) goto L_0x0095
                android.os.IBinder r1 = r4.asBinder()
            L_0x0095:
                r6.writeStrongBinder(r1)
                return r2
            L_0x0099:
                r5.enforceInterface(r0)
                com.ss.android.ugc.asve.sandbox.h r4 = r3.mo44096f()
                r6.writeNoException()
                if (r4 == 0) goto L_0x00a9
                android.os.IBinder r1 = r4.asBinder()
            L_0x00a9:
                r6.writeStrongBinder(r1)
                return r2
            L_0x00ad:
                r5.enforceInterface(r0)
                com.ss.android.ugc.asve.sandbox.j r4 = r3.mo44095e()
                r6.writeNoException()
                if (r4 == 0) goto L_0x00bd
                android.os.IBinder r1 = r4.asBinder()
            L_0x00bd:
                r6.writeStrongBinder(r1)
                return r2
            L_0x00c1:
                r5.enforceInterface(r0)
                com.ss.android.ugc.asve.sandbox.g r4 = r3.mo44094d()
                r6.writeNoException()
                if (r4 == 0) goto L_0x00d1
                android.os.IBinder r1 = r4.asBinder()
            L_0x00d1:
                r6.writeStrongBinder(r1)
                return r2
            L_0x00d5:
                r5.enforceInterface(r0)
                com.ss.android.ugc.asve.sandbox.i r4 = r3.mo44093c()
                r6.writeNoException()
                if (r4 == 0) goto L_0x00e5
                android.os.IBinder r1 = r4.asBinder()
            L_0x00e5:
                r6.writeStrongBinder(r1)
                return r2
            L_0x00e9:
                r5.enforceInterface(r0)
                r3.mo44091b()
                return r2
            L_0x00f0:
                r5.enforceInterface(r0)
                r3.mo44085a()
                return r2
            L_0x00f7:
                r5.enforceInterface(r0)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.d r4 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d.C20671a.m52014a(r4)
                r3.mo44086a(r4)
                return r2
            L_0x0106:
                r5.enforceInterface(r0)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.l r4 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20694l.C20695a.m52034a(r4)
                r3.mo44092b(r4)
                return r2
            L_0x0115:
                r5.enforceInterface(r0)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.l r4 = com.p683ss.android.ugc.asve.sandbox.p1251b.C20694l.C20695a.m52034a(r4)
                r3.mo44088a(r4)
                return r2
            L_0x0124:
                r5.enforceInterface(r0)
                android.os.IBinder r4 = r5.readStrongBinder()
                if (r4 != 0) goto L_0x012e
                goto L_0x0143
            L_0x012e:
                java.lang.String r5 = "com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback"
                android.os.IInterface r5 = r4.queryLocalInterface(r5)
                if (r5 == 0) goto L_0x013e
                boolean r6 = r5 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20697m
                if (r6 == 0) goto L_0x013e
                r1 = r5
                com.ss.android.ugc.asve.sandbox.b.m r1 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20697m) r1
                goto L_0x0143
            L_0x013e:
                com.ss.android.ugc.asve.sandbox.b.m$a$a r1 = new com.ss.android.ugc.asve.sandbox.b.m$a$a
                r1.<init>(r4)
            L_0x0143:
                r3.mo44089a(r1)
                return r2
            L_0x0147:
                r6.writeString(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.sandbox.C20797l.C20798a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo44085a() throws RemoteException;

    /* renamed from: a */
    void mo44086a(C20670d dVar) throws RemoteException;

    /* renamed from: a */
    void mo44087a(C20682h hVar) throws RemoteException;

    /* renamed from: a */
    void mo44088a(C20694l lVar) throws RemoteException;

    /* renamed from: a */
    void mo44089a(C20697m mVar) throws RemoteException;

    /* renamed from: a */
    void mo44090a(C20825d dVar, String str) throws RemoteException;

    /* renamed from: b */
    void mo44091b() throws RemoteException;

    /* renamed from: b */
    void mo44092b(C20694l lVar) throws RemoteException;

    /* renamed from: c */
    C20788i mo44093c() throws RemoteException;

    /* renamed from: d */
    C20782g mo44094d() throws RemoteException;

    /* renamed from: e */
    C20791j mo44095e() throws RemoteException;

    /* renamed from: f */
    C20785h mo44096f() throws RemoteException;

    /* renamed from: g */
    C20794k mo44097g() throws RemoteException;

    /* renamed from: h */
    void mo44098h() throws RemoteException;

    /* renamed from: i */
    void mo44099i() throws RemoteException;

    /* renamed from: j */
    void mo44100j() throws RemoteException;

    /* renamed from: k */
    void mo44101k() throws RemoteException;

    /* renamed from: l */
    void mo44102l() throws RemoteException;

    /* renamed from: m */
    void mo44103m() throws RemoteException;
}
