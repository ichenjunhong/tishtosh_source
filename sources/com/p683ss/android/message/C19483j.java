package com.p683ss.android.message;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Message;
import android.os.RemoteException;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.message.C19472c.C19473a;
import com.p683ss.android.message.p1191b.C19464g;
import com.p683ss.android.pushmanager.C19703i;
import com.p683ss.android.pushmanager.client.C19687a;
import com.p683ss.android.pushmanager.p1204a.C19667d;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.message.j */
public class C19483j implements C9382a {

    /* renamed from: c */
    public static C19687a f53805c;

    /* renamed from: f */
    private static volatile C19483j f53806f;

    /* renamed from: a */
    public Context f53807a;

    /* renamed from: b */
    public C19450b f53808b;

    /* renamed from: d */
    ServiceConnection f53809d = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            C19483j.this.f53808b = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[ExcHandler: RemoteException (unused android.os.RemoteException), SYNTHETIC, Splitter:B:10:0x001f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            /*
                r3 = this;
                com.ss.android.message.j r4 = com.p683ss.android.message.C19483j.this
                r0 = 0
                if (r5 != 0) goto L_0x0007
                r5 = r0
                goto L_0x001d
            L_0x0007:
                java.lang.String r1 = "com.ss.android.message.INotifyService"
                android.os.IInterface r1 = r5.queryLocalInterface(r1)
                if (r1 == 0) goto L_0x0017
                boolean r2 = r1 instanceof com.p683ss.android.message.C19450b
                if (r2 == 0) goto L_0x0017
                r5 = r1
                com.ss.android.message.b r5 = (com.p683ss.android.message.C19450b) r5
                goto L_0x001d
            L_0x0017:
                com.ss.android.message.b$a$a r1 = new com.ss.android.message.b$a$a
                r1.<init>(r5)
                r5 = r1
            L_0x001d:
                r4.f53808b = r5
                com.ss.android.message.j r4 = com.p683ss.android.message.C19483j.this     // Catch:{ RemoteException -> 0x003c, Exception -> 0x003b }
                com.ss.android.message.b r4 = r4.f53808b     // Catch:{ RemoteException -> 0x003c, Exception -> 0x003b }
                com.ss.android.message.j r5 = com.p683ss.android.message.C19483j.this     // Catch:{ RemoteException -> 0x003c, Exception -> 0x003b }
                com.ss.android.message.c$a r5 = r5.f53810e     // Catch:{ RemoteException -> 0x003c, Exception -> 0x003b }
                r4.mo40482a(r5)     // Catch:{ RemoteException -> 0x003c, Exception -> 0x003b }
                com.ss.android.message.j r4 = com.p683ss.android.message.C19483j.this     // Catch:{ RemoteException -> 0x003c, Exception -> 0x003b }
                com.ss.android.message.b r5 = r4.f53808b     // Catch:{ Exception -> 0x003a, RemoteException -> 0x003c }
                if (r5 == 0) goto L_0x003b
                android.content.Context r5 = r4.f53807a     // Catch:{ Exception -> 0x003a, RemoteException -> 0x003c }
                android.content.ServiceConnection r1 = r4.f53809d     // Catch:{ Exception -> 0x003a, RemoteException -> 0x003c }
                r5.unbindService(r1)     // Catch:{ Exception -> 0x003a, RemoteException -> 0x003c }
                r4.f53808b = r0     // Catch:{ Exception -> 0x003a, RemoteException -> 0x003c }
                goto L_0x003b
            L_0x003a:
                return
            L_0x003b:
                return
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.C19483j.C194841.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }
    };

    /* renamed from: e */
    protected C19473a f53810e = new C19473a() {
        /* renamed from: a */
        public final boolean mo40602a() throws RemoteException {
            if (C19483j.f53805c != null) {
                return true;
            }
            throw C19464g.m47632a(" pushapp enable is null");
        }

        /* renamed from: b */
        public final int mo40603b() throws RemoteException {
            if (C19483j.f53805c == null) {
                throw C19464g.m47632a(" pushapp push enable is null");
            } else if (C19710b.m48173a().mo41102k()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: c */
        public final long mo40604c() throws RemoteException {
            if (C19483j.f53805c != null) {
                return C19483j.f53805c.mo40624a();
            }
            throw C19464g.m47632a(" pushapp appId is null");
        }

        /* renamed from: d */
        public final String mo40605d() throws RemoteException {
            if (C19483j.f53805c != null) {
                return C19483j.f53805c.mo40625b();
            }
            throw C19464g.m47632a(" pushapp clientId is null");
        }

        /* renamed from: e */
        public final String mo40606e() throws RemoteException {
            if (C19483j.f53805c != null) {
                return C19483j.f53805c.mo40626c();
            }
            throw C19464g.m47632a(" pushapp devicedId is null");
        }

        /* renamed from: f */
        public final String mo40607f() throws RemoteException {
            if (C19483j.f53805c != null) {
                return C19483j.f53805c.mo40627d();
            }
            throw C19464g.m47632a(" pushapp installId is null");
        }

        /* renamed from: g */
        public final String mo40608g() throws RemoteException {
            if (C19483j.f53805c != null) {
                return C19483j.f53805c.mo40628e();
            }
            throw C19464g.m47632a(" pushapp package is null");
        }
    };

    /* renamed from: com.ss.android.message.j$a */
    public static class C19486a implements C19687a {

        /* renamed from: c */
        private static volatile C19486a f53813c;

        /* renamed from: a */
        private Map<String, String> f53814a = new HashMap();

        /* renamed from: b */
        private Context f53815b;

        /* renamed from: e */
        public final String mo40628e() {
            return this.f53815b.getPackageName();
        }

        /* renamed from: a */
        public final long mo40624a() {
            return (long) C19667d.m48045a().mo41018b().mo41049c();
        }

        /* renamed from: b */
        public final String mo40625b() {
            return (String) this.f53814a.get(C19703i.f54236e);
        }

        /* renamed from: c */
        public final String mo40626c() {
            return (String) this.f53814a.get(C19703i.f54232a);
        }

        /* renamed from: d */
        public final String mo40627d() {
            return (String) this.f53814a.get(C19703i.f54233b);
        }

        private C19486a(Context context) {
            this.f53815b = context.getApplicationContext();
            C19710b.m48173a();
            C19710b.m48174a(this.f53814a);
        }

        /* renamed from: a */
        public static C19486a m47706a(Context context) {
            if (f53813c == null) {
                synchronized (C19486a.class) {
                    if (f53813c == null) {
                        f53813c = new C19486a(context);
                    }
                }
            }
            return f53813c;
        }
    }

    public void handleMsg(Message message) {
    }

    private C19483j() {
    }

    /* renamed from: a */
    public static C19483j m47697a() {
        if (f53806f == null) {
            synchronized (C19483j.class) {
                if (f53806f == null) {
                    f53806f = new C19483j();
                }
            }
        }
        return f53806f;
    }

    /* renamed from: a */
    public final boolean mo40621a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        try {
            boolean z = true;
            if (this.f53808b != null) {
                return true;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null || !(applicationContext instanceof Context) || !C40895d.m90464a(applicationContext, intent)) {
                applicationContext.startService(intent);
            }
            ServiceConnection serviceConnection = this.f53809d;
            if (applicationContext == null || !(applicationContext instanceof Context)) {
                z = applicationContext.bindService(intent, serviceConnection, 1);
            } else if (!C40895d.m90464a(applicationContext, intent)) {
                return applicationContext.bindService(intent, serviceConnection, 1);
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
