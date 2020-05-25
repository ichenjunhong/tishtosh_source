package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.ab */
final class C17891ab implements Runnable {

    /* renamed from: a */
    private final long f49718a;

    /* renamed from: b */
    private final WakeLock f49719b = ((PowerManager) mo34730a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c */
    private final FirebaseInstanceId f49720c;

    /* renamed from: d */
    private final C17933q f49721d;

    /* renamed from: e */
    private final C17894ae f49722e;

    C17891ab(FirebaseInstanceId firebaseInstanceId, C17933q qVar, C17894ae aeVar, long j) {
        this.f49720c = firebaseInstanceId;
        this.f49721d = qVar;
        this.f49722e = aeVar;
        this.f49718a = j;
        this.f49719b.setReferenceCounted(false);
    }

    public final void run() {
        this.f49719b.acquire();
        try {
            this.f49720c.mo34718a(true);
            if (!this.f49720c.f49701e.mo34753a()) {
                this.f49720c.mo34718a(false);
            } else if (!mo34731b()) {
                C17893ad adVar = new C17893ad(this);
                FirebaseInstanceId.m43846f();
                adVar.f49723a.mo34730a().registerReceiver(adVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f49719b.release();
            } else {
                if (!m43869c() || !m43870d() || !this.f49722e.mo34736a(this.f49720c)) {
                    this.f49720c.mo34717a(this.f49718a);
                } else {
                    this.f49720c.mo34718a(false);
                }
                this.f49719b.release();
            }
        } finally {
            this.f49719b.release();
        }
    }

    /* renamed from: c */
    private final boolean m43869c() {
        try {
            if (!this.f49720c.mo34723h()) {
                FirebaseInstanceId firebaseInstanceId = this.f49720c;
                firebaseInstanceId.mo34716a(firebaseInstanceId.f49701e.mo34750a(FirebaseInstanceId.m43845d(), C17890aa.m43866a(firebaseInstanceId.mo34721e())));
            }
            return true;
        } catch (IOException e) {
            String str = "Build channel failed: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m43870d() {
        C17890aa e = this.f49720c.mo34721e();
        if (e != null && !e.mo34729b(this.f49721d.mo34783b())) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.f49720c;
            String a = C17933q.m43949a(firebaseInstanceId.f49699c);
            String str = "*";
            if (Looper.getMainLooper() != Looper.myLooper()) {
                String a2 = ((C17888a) firebaseInstanceId.mo34716a(firebaseInstanceId.mo34715a(a, str))).mo34728a();
                if (a2 == null) {
                    return false;
                }
                if (e == null || (e != null && !a2.equals(e.f49715a))) {
                    Context a3 = mo34730a();
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", a2);
                    a3.sendBroadcast(C17941y.m43970a(a3, "com.google.firebase.MESSAGING_EVENT", intent));
                    a3.sendBroadcast(C17941y.m43970a(a3, "com.google.firebase.INSTANCE_ID_EVENT", new Intent("com.google.firebase.iid.TOKEN_REFRESH")));
                }
                return true;
            }
            throw new IOException("MAIN_THREAD");
        } catch (IOException | SecurityException e2) {
            String str2 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo34730a() {
        return this.f49720c.f49699c.mo34679a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo34731b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo34730a().getSystemService("connectivity");
        NetworkInfo a = connectivityManager != null ? C17892ac.m43873a(connectivityManager) : null;
        return a != null && a.isConnected();
    }
}
