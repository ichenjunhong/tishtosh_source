package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20721u;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20819b;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20822c;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20828e;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;

/* renamed from: com.ss.android.ugc.asve.sandbox.n */
public interface C20803n extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.n$a */
    public static abstract class C20804a extends Binder implements C20803n {

        /* renamed from: com.ss.android.ugc.asve.sandbox.n$a$a */
        static class C20805a implements C20803n {

            /* renamed from: a */
            private IBinder f56690a;

            public final IBinder asBinder() {
                return this.f56690a;
            }

            /* renamed from: a */
            public final void mo43720a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    this.f56690a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            C20805a(IBinder iBinder) {
                this.f56690a = iBinder;
            }

            /* renamed from: a */
            public final void mo43721a(C20721u uVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    if (uVar != null) {
                        iBinder = uVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56690a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20797l mo43719a(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) throws RemoteException {
                C20797l lVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    if (aSSandBoxRecorderContextWrapper != null) {
                        obtain.writeInt(1);
                        aSSandBoxRecorderContextWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56690a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        lVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C20797l)) {
                            lVar = new C20799a(readStrongBinder);
                        } else {
                            lVar = (C20797l) queryLocalInterface;
                        }
                    }
                    return lVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43722a(SandBoxASContextWrapper sandBoxASContextWrapper, C20800m mVar, C20822c cVar, C20828e eVar, C20819b bVar, C20779f fVar) throws RemoteException {
                IBinder iBinder;
                IBinder iBinder2;
                IBinder iBinder3;
                IBinder iBinder4;
                IBinder iBinder5;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    if (sandBoxASContextWrapper != null) {
                        obtain.writeInt(1);
                        sandBoxASContextWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (mVar != null) {
                        iBinder = mVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (cVar != null) {
                        iBinder2 = cVar.asBinder();
                    } else {
                        iBinder2 = null;
                    }
                    obtain.writeStrongBinder(iBinder2);
                    if (eVar != null) {
                        iBinder3 = eVar.asBinder();
                    } else {
                        iBinder3 = null;
                    }
                    obtain.writeStrongBinder(iBinder3);
                    if (bVar != null) {
                        iBinder4 = bVar.asBinder();
                    } else {
                        iBinder4 = null;
                    }
                    obtain.writeStrongBinder(iBinder4);
                    if (fVar != null) {
                        iBinder5 = fVar.asBinder();
                    } else {
                        iBinder5 = null;
                    }
                    obtain.writeStrongBinder(iBinder5);
                    this.f56690a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20804a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
        }

        /* renamed from: a */
        public static C20803n m53072a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20803n)) {
                return new C20805a(iBinder);
            }
            return (C20803n) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v4, types: [com.ss.android.ugc.asve.sandbox.f$a$a] */
        /* JADX WARNING: type inference failed for: r1v6, types: [com.ss.android.ugc.asve.sandbox.f] */
        /* JADX WARNING: type inference failed for: r1v7 */
        /* JADX WARNING: type inference failed for: r9v0, types: [com.ss.android.ugc.asve.sandbox.f] */
        /* JADX WARNING: type inference failed for: r1v8, types: [com.ss.android.ugc.asve.sandbox.b.u] */
        /* JADX WARNING: type inference failed for: r1v9, types: [com.ss.android.ugc.asve.sandbox.b.u$a$a] */
        /* JADX WARNING: type inference failed for: r1v11, types: [com.ss.android.ugc.asve.sandbox.b.u] */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13 */
        /* JADX WARNING: type inference failed for: r1v14 */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.asve.sandbox.f$a$a, android.os.IBinder, com.ss.android.ugc.asve.sandbox.f, com.ss.android.ugc.asve.sandbox.b.u$a$a, com.ss.android.ugc.asve.sandbox.b.u]
          uses: [android.os.IBinder, ?[OBJECT, ARRAY], com.ss.android.ugc.asve.sandbox.b.u]
          mth insns count: 116
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
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            /*
                r10 = this;
                java.lang.String r0 = "com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService"
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r2 = 1
                if (r11 == r1) goto L_0x0112
                r1 = 0
                switch(r11) {
                    case 1: goto L_0x00ee;
                    case 2: goto L_0x003b;
                    case 3: goto L_0x0034;
                    case 4: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r11 = super.onTransact(r11, r12, r13, r14)
                return r11
            L_0x0011:
                r12.enforceInterface(r0)
                android.os.IBinder r11 = r12.readStrongBinder()
                if (r11 != 0) goto L_0x001b
                goto L_0x0030
            L_0x001b:
                java.lang.String r12 = "com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback"
                android.os.IInterface r12 = r11.queryLocalInterface(r12)
                if (r12 == 0) goto L_0x002b
                boolean r13 = r12 instanceof com.p683ss.android.ugc.asve.sandbox.p1251b.C20721u
                if (r13 == 0) goto L_0x002b
                r1 = r12
                com.ss.android.ugc.asve.sandbox.b.u r1 = (com.p683ss.android.ugc.asve.sandbox.p1251b.C20721u) r1
                goto L_0x0030
            L_0x002b:
                com.ss.android.ugc.asve.sandbox.b.u$a$a r1 = new com.ss.android.ugc.asve.sandbox.b.u$a$a
                r1.<init>(r11)
            L_0x0030:
                r10.mo43721a(r1)
                return r2
            L_0x0034:
                r12.enforceInterface(r0)
                r10.mo43720a()
                return r2
            L_0x003b:
                r12.enforceInterface(r0)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x004e
                android.os.Parcelable$Creator<com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper> r11 = com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper r11 = (com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper) r11
                r4 = r11
                goto L_0x004f
            L_0x004e:
                r4 = r1
            L_0x004f:
                android.os.IBinder r11 = r12.readStrongBinder()
                if (r11 != 0) goto L_0x0057
                r5 = r1
                goto L_0x006e
            L_0x0057:
                java.lang.String r13 = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder"
                android.os.IInterface r13 = r11.queryLocalInterface(r13)
                if (r13 == 0) goto L_0x0068
                boolean r14 = r13 instanceof com.p683ss.android.ugc.asve.sandbox.C20800m
                if (r14 == 0) goto L_0x0068
                r11 = r13
                com.ss.android.ugc.asve.sandbox.m r11 = (com.p683ss.android.ugc.asve.sandbox.C20800m) r11
                r5 = r11
                goto L_0x006e
            L_0x0068:
                com.ss.android.ugc.asve.sandbox.m$a$a r13 = new com.ss.android.ugc.asve.sandbox.m$a$a
                r13.<init>(r11)
                r5 = r13
            L_0x006e:
                android.os.IBinder r11 = r12.readStrongBinder()
                if (r11 != 0) goto L_0x0076
                r6 = r1
                goto L_0x008d
            L_0x0076:
                java.lang.String r13 = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger"
                android.os.IInterface r13 = r11.queryLocalInterface(r13)
                if (r13 == 0) goto L_0x0087
                boolean r14 = r13 instanceof com.p683ss.android.ugc.asve.sandbox.wrap.C20822c
                if (r14 == 0) goto L_0x0087
                r11 = r13
                com.ss.android.ugc.asve.sandbox.wrap.c r11 = (com.p683ss.android.ugc.asve.sandbox.wrap.C20822c) r11
                r6 = r11
                goto L_0x008d
            L_0x0087:
                com.ss.android.ugc.asve.sandbox.wrap.c$a$a r13 = new com.ss.android.ugc.asve.sandbox.wrap.c$a$a
                r13.<init>(r11)
                r6 = r13
            L_0x008d:
                android.os.IBinder r11 = r12.readStrongBinder()
                if (r11 != 0) goto L_0x0095
                r7 = r1
                goto L_0x00ac
            L_0x0095:
                java.lang.String r13 = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor"
                android.os.IInterface r13 = r11.queryLocalInterface(r13)
                if (r13 == 0) goto L_0x00a6
                boolean r14 = r13 instanceof com.p683ss.android.ugc.asve.sandbox.wrap.C20828e
                if (r14 == 0) goto L_0x00a6
                r11 = r13
                com.ss.android.ugc.asve.sandbox.wrap.e r11 = (com.p683ss.android.ugc.asve.sandbox.wrap.C20828e) r11
                r7 = r11
                goto L_0x00ac
            L_0x00a6:
                com.ss.android.ugc.asve.sandbox.wrap.e$a$a r13 = new com.ss.android.ugc.asve.sandbox.wrap.e$a$a
                r13.<init>(r11)
                r7 = r13
            L_0x00ac:
                android.os.IBinder r11 = r12.readStrongBinder()
                if (r11 != 0) goto L_0x00b4
                r8 = r1
                goto L_0x00cb
            L_0x00b4:
                java.lang.String r13 = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter"
                android.os.IInterface r13 = r11.queryLocalInterface(r13)
                if (r13 == 0) goto L_0x00c5
                boolean r14 = r13 instanceof com.p683ss.android.ugc.asve.sandbox.wrap.C20819b
                if (r14 == 0) goto L_0x00c5
                r11 = r13
                com.ss.android.ugc.asve.sandbox.wrap.b r11 = (com.p683ss.android.ugc.asve.sandbox.wrap.C20819b) r11
                r8 = r11
                goto L_0x00cb
            L_0x00c5:
                com.ss.android.ugc.asve.sandbox.wrap.b$a$a r13 = new com.ss.android.ugc.asve.sandbox.wrap.b$a$a
                r13.<init>(r11)
                r8 = r13
            L_0x00cb:
                android.os.IBinder r11 = r12.readStrongBinder()
                if (r11 != 0) goto L_0x00d3
            L_0x00d1:
                r9 = r1
                goto L_0x00e9
            L_0x00d3:
                java.lang.String r12 = "com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor"
                android.os.IInterface r12 = r11.queryLocalInterface(r12)
                if (r12 == 0) goto L_0x00e3
                boolean r13 = r12 instanceof com.p683ss.android.ugc.asve.sandbox.C20779f
                if (r13 == 0) goto L_0x00e3
                r1 = r12
                com.ss.android.ugc.asve.sandbox.f r1 = (com.p683ss.android.ugc.asve.sandbox.C20779f) r1
                goto L_0x00d1
            L_0x00e3:
                com.ss.android.ugc.asve.sandbox.f$a$a r1 = new com.ss.android.ugc.asve.sandbox.f$a$a
                r1.<init>(r11)
                goto L_0x00d1
            L_0x00e9:
                r3 = r10
                r3.mo43722a(r4, r5, r6, r7, r8, r9)
                return r2
            L_0x00ee:
                r12.enforceInterface(r0)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0100
                android.os.Parcelable$Creator<com.ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper> r11 = com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper r11 = (com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper) r11
                goto L_0x0101
            L_0x0100:
                r11 = r1
            L_0x0101:
                com.ss.android.ugc.asve.sandbox.l r11 = r10.mo43719a(r11)
                r13.writeNoException()
                if (r11 == 0) goto L_0x010e
                android.os.IBinder r1 = r11.asBinder()
            L_0x010e:
                r13.writeStrongBinder(r1)
                return r2
            L_0x0112:
                r13.writeString(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.sandbox.C20803n.C20804a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    C20797l mo43719a(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) throws RemoteException;

    /* renamed from: a */
    void mo43720a() throws RemoteException;

    /* renamed from: a */
    void mo43721a(C20721u uVar) throws RemoteException;

    /* renamed from: a */
    void mo43722a(SandBoxASContextWrapper sandBoxASContextWrapper, C20800m mVar, C20822c cVar, C20828e eVar, C20819b bVar, C20779f fVar) throws RemoteException;
}
