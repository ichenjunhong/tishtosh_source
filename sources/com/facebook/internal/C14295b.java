package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C14533n;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
public class C14295b {

    /* renamed from: d */
    private static final String f37237d = C14295b.class.getCanonicalName();

    /* renamed from: g */
    private static C14295b f37238g;

    /* renamed from: a */
    public String f37239a;

    /* renamed from: b */
    public String f37240b;

    /* renamed from: c */
    public boolean f37241c;

    /* renamed from: e */
    private String f37242e;

    /* renamed from: f */
    private long f37243f;

    /* renamed from: com.facebook.internal.b$a */
    static final class C14297a implements IInterface {

        /* renamed from: a */
        private IBinder f37244a;

        public final IBinder asBinder() {
            return this.f37244a;
        }

        /* renamed from: a */
        public final String mo26513a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f37244a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: b */
        public final boolean mo26515b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f37244a.transact(2, obtain, obtain2, 0);
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

        C14297a(IBinder iBinder) {
            this.f37244a = iBinder;
        }
    }

    /* renamed from: com.facebook.internal.b$b */
    static final class C14298b implements ServiceConnection {

        /* renamed from: a */
        AtomicBoolean f37245a;

        /* renamed from: b */
        final BlockingQueue<IBinder> f37246b;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private C14298b() {
            this.f37245a = new AtomicBoolean(false);
            this.f37246b = new LinkedBlockingDeque();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f37246b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo26512a() {
        if (!C14533n.m29764a() || !C14533n.m29781o()) {
            return null;
        }
        return this.f37242e;
    }

    /* renamed from: a */
    private static C14295b m29332a(C14295b bVar) {
        bVar.f37243f = System.currentTimeMillis();
        f37238g = bVar;
        return bVar;
    }

    /* renamed from: c */
    private static C14295b m29334c(Context context) {
        boolean z;
        C14298b bVar = new C14298b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
            z = context.bindService(intent, bVar, 1);
        } else {
            z = true;
        }
        if (z) {
            try {
                if (!bVar.f37245a.compareAndSet(true, true)) {
                    C14297a aVar = new C14297a((IBinder) bVar.f37246b.take());
                    C14295b bVar2 = new C14295b();
                    bVar2.f37242e = aVar.mo26513a();
                    bVar2.f37241c = aVar.mo26515b();
                    return bVar2;
                }
                throw new IllegalStateException("Binder already consumed");
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[Catch:{ Exception -> 0x0086 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e A[Catch:{ Exception -> 0x0086 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.internal.C14295b m29333b(android.content.Context r7) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.common.GooglePlayServicesUtil"
            java.lang.String r2 = "isGooglePlayServicesAvailable"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r1 = com.facebook.internal.C14277aa.m29256a(r1, r2, (java.lang.Class<?>[]) r4)     // Catch:{ Exception -> 0x0086 }
            if (r1 != 0) goto L_0x0015
        L_0x0013:
            r1 = 0
            goto L_0x002b
        L_0x0015:
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0086 }
            r2[r6] = r7     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r1 = com.facebook.internal.C14277aa.m29247a(r0, r1, r2)     // Catch:{ Exception -> 0x0086 }
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0086 }
            if (r2 == 0) goto L_0x0013
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0086 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x002a
            goto L_0x0013
        L_0x002a:
            r1 = 1
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.String r1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.String r2 = "getAdvertisingIdInfo"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r6] = r5     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r1 = com.facebook.internal.C14277aa.m29256a(r1, r2, (java.lang.Class<?>[]) r4)     // Catch:{ Exception -> 0x0086 }
            if (r1 != 0) goto L_0x003f
            return r0
        L_0x003f:
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0086 }
            r2[r6] = r7     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r7 = com.facebook.internal.C14277aa.m29247a(r0, r1, r2)     // Catch:{ Exception -> 0x0086 }
            if (r7 != 0) goto L_0x004a
            return r0
        L_0x004a:
            java.lang.Class r1 = r7.getClass()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "getId"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r1 = com.facebook.internal.C14277aa.m29255a(r1, r2, (java.lang.Class<?>[]) r3)     // Catch:{ Exception -> 0x0086 }
            java.lang.Class r2 = r7.getClass()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r2 = com.facebook.internal.C14277aa.m29255a(r2, r3, (java.lang.Class<?>[]) r4)     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x0085
            if (r2 != 0) goto L_0x0067
            goto L_0x0085
        L_0x0067:
            com.facebook.internal.b r3 = new com.facebook.internal.b     // Catch:{ Exception -> 0x0086 }
            r3.<init>()     // Catch:{ Exception -> 0x0086 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r1 = com.facebook.internal.C14277aa.m29247a(r7, r1, r4)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0086 }
            r3.f37242e = r1     // Catch:{ Exception -> 0x0086 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r7 = com.facebook.internal.C14277aa.m29247a(r7, r2, r1)     // Catch:{ Exception -> 0x0086 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x0086 }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0086 }
            r3.f37241c = r7     // Catch:{ Exception -> 0x0086 }
            return r3
        L_0x0085:
            return r0
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14295b.m29333b(android.content.Context):com.facebook.internal.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084 A[Catch:{ Exception -> 0x0106, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[Catch:{ Exception -> 0x0106, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[Catch:{ Exception -> 0x0106, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094 A[Catch:{ Exception -> 0x0106, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099 A[Catch:{ Exception -> 0x0106, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C14295b m29331a(android.content.Context r10) {
        /*
            com.facebook.internal.b r0 = m29333b(r10)
            if (r0 != 0) goto L_0x0011
            com.facebook.internal.b r0 = m29334c(r10)
            if (r0 != 0) goto L_0x0011
            com.facebook.internal.b r0 = new com.facebook.internal.b
            r0.<init>()
        L_0x0011:
            r1 = 0
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r2 == r3) goto L_0x00fc
            com.facebook.internal.b r2 = f37238g     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r2 == 0) goto L_0x0034
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            com.facebook.internal.b r4 = f37238g     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            long r4 = r4.f37243f     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0034
            com.facebook.internal.b r10 = f37238g     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            return r10
        L_0x0034:
            r2 = 3
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            java.lang.String r2 = "aid"
            r3 = 0
            r5[r3] = r2     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            r2 = 1
            java.lang.String r4 = "androidid"
            r5[r2] = r4     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            r2 = 2
            java.lang.String r4 = "limit_tracking"
            r5[r2] = r4     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            java.lang.String r4 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r4, r3)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            android.content.pm.PackageManager r4 = r10.getPackageManager()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            java.lang.String r6 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r3 = r4.resolveContentProvider(r6, r3)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            boolean r2 = com.facebook.internal.C14324k.m29377a(r10, r2)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
        L_0x006a:
            r4 = r2
            goto L_0x007e
        L_0x006c:
            if (r3 == 0) goto L_0x007d
            java.lang.String r2 = r3.packageName     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            boolean r2 = com.facebook.internal.C14324k.m29377a(r10, r2)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r2 == 0) goto L_0x007d
            java.lang.String r2 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            goto L_0x006a
        L_0x007d:
            r4 = r1
        L_0x007e:
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r2 == 0) goto L_0x008d
            java.lang.String r3 = r10.getPackageName()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            java.lang.String r2 = r2.getInstallerPackageName(r3)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            goto L_0x008e
        L_0x008d:
            r2 = r1
        L_0x008e:
            if (r2 == 0) goto L_0x0092
            r0.f37240b = r2     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
        L_0x0092:
            if (r4 != 0) goto L_0x0099
            com.facebook.internal.b r10 = m29332a(r0)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            return r10
        L_0x0099:
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            if (r10 == 0) goto L_0x00f2
            boolean r2 = r10.moveToFirst()     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            if (r2 != 0) goto L_0x00ad
            goto L_0x00f2
        L_0x00ad:
            java.lang.String r2 = "aid"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            java.lang.String r3 = "androidid"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            java.lang.String r4 = "limit_tracking"
            int r4 = r10.getColumnIndex(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            r0.f37239a = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            if (r3 <= 0) goto L_0x00df
            if (r4 <= 0) goto L_0x00df
            java.lang.String r2 = r0.mo26512a()     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            if (r2 != 0) goto L_0x00df
            java.lang.String r2 = r10.getString(r3)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            r0.f37242e = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            java.lang.String r2 = r10.getString(r4)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            r0.f37241c = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
        L_0x00df:
            if (r10 == 0) goto L_0x00e4
            r10.close()
        L_0x00e4:
            com.facebook.internal.b r10 = m29332a(r0)
            return r10
        L_0x00e9:
            r0 = move-exception
            r1 = r10
            r10 = r0
            goto L_0x011e
        L_0x00ed:
            r0 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x0108
        L_0x00f2:
            com.facebook.internal.b r0 = m29332a(r0)     // Catch:{ Exception -> 0x00ed, all -> 0x00e9 }
            if (r10 == 0) goto L_0x00fb
            r10.close()
        L_0x00fb:
            return r0
        L_0x00fc:
            com.facebook.k r10 = new com.facebook.k     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
            r10.<init>(r0)     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
            throw r10     // Catch:{ Exception -> 0x0106, all -> 0x0104 }
        L_0x0104:
            r10 = move-exception
            goto L_0x011e
        L_0x0106:
            r10 = move-exception
            r0 = r1
        L_0x0108:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.<init>(r3)     // Catch:{ all -> 0x011c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x011c }
            r2.append(r10)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x011b
            r0.close()
        L_0x011b:
            return r1
        L_0x011c:
            r10 = move-exception
            r1 = r0
        L_0x011e:
            if (r1 == 0) goto L_0x0123
            r1.close()
        L_0x0123:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14295b.m29331a(android.content.Context):com.facebook.internal.b");
    }
}
