package com.appsflyer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.appsflyer.h */
final class C2517h {

    /* renamed from: com.appsflyer.h$_lancet */
    class _lancet {
        /* renamed from: com_ss_android_ugc_aweme_push_downgrade_StartServiceLancet_bindService */
        static boolean m7378x6b13abbd(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
            if (context == null || !(context instanceof Context)) {
                return context.bindService(intent, serviceConnection, i);
            }
            if (C40895d.m90464a(context, intent)) {
                return true;
            }
            return context.bindService(intent, serviceConnection, i);
        }
    }

    /* renamed from: com.appsflyer.h$a */
    static final class C2518a implements IInterface {

        /* renamed from: ˎ */
        private IBinder f7818;

        public final IBinder asBinder() {
            return this.f7818;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: ˋ */
        public final boolean mo7007() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f7818.transact(2, obtain, obtain2, 0);
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

        /* renamed from: ॱ */
        public final String mo7008() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f7818.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        C2518a(IBinder iBinder) {
            this.f7818 = iBinder;
        }
    }

    /* renamed from: com.appsflyer.h$b */
    static final class C2519b implements ServiceConnection {

        /* renamed from: ˎ */
        private final LinkedBlockingQueue<IBinder> f7819;

        /* renamed from: ॱ */
        private boolean f7820;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private C2519b() {
            this.f7819 = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: ˊ */
        public final IBinder mo7011() throws InterruptedException {
            if (!this.f7820) {
                this.f7820 = true;
                return (IBinder) this.f7819.take();
            }
            throw new IllegalStateException();
        }

        /* synthetic */ C2519b(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f7819.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.appsflyer.h$e */
    static final class C2520e {

        /* renamed from: ˎ */
        public final boolean f7821;

        /* renamed from: ˏ */
        public final String f7822;

        C2520e(String str, boolean z) {
            this.f7822 = str;
            this.f7821 = z;
        }
    }

    /* renamed from: ˊ */
    static C2520e m7377(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C2519b bVar = new C2519b(0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (_lancet.m7378x6b13abbd(context, intent, bVar, 1)) {
                        C2518a aVar = new C2518a(bVar.mo7011());
                        C2520e eVar = new C2520e(aVar.mo7008(), aVar.mo7007());
                        if (context != null) {
                            context.unbindService(bVar);
                        }
                        return eVar;
                    }
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw new IOException("Google Play connection failed");
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(bVar);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
