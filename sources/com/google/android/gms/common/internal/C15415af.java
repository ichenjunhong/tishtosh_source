package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C15497a;
import com.google.android.gms.internal.p1043d.C16482d;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.af */
final class C15415af extends C15449i implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashMap<C15450a, C15416ag> f39761a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f39762b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f39763c;

    /* renamed from: d */
    private final C15497a f39764d;

    /* renamed from: e */
    private final long f39765e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f39766f;

    C15415af(Context context) {
        this.f39762b = context.getApplicationContext();
        this.f39763c = new C16482d(context.getMainLooper(), this);
        this.f39764d = C15497a.m32246a();
        this.f39765e = 5000;
        this.f39766f = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28378a(C15450a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        C15464q.m32124a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f39761a) {
            C15416ag agVar = (C15416ag) this.f39761a.get(aVar);
            if (agVar == null) {
                agVar = new C15416ag(this, aVar);
                agVar.mo28381a(serviceConnection, str);
                agVar.mo28382a(str);
                this.f39761a.put(aVar, agVar);
            } else {
                this.f39763c.removeMessages(0, aVar);
                if (!agVar.mo28384a(serviceConnection)) {
                    agVar.mo28381a(serviceConnection, str);
                    switch (agVar.f39768b) {
                        case 1:
                            serviceConnection.onServiceConnected(agVar.f39772f, agVar.f39770d);
                            break;
                        case 2:
                            agVar.mo28382a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = agVar.f39769c;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28379b(C15450a aVar, ServiceConnection serviceConnection, String str) {
        C15464q.m32124a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f39761a) {
            C15416ag agVar = (C15416ag) this.f39761a.get(aVar);
            if (agVar == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (agVar.mo28384a(serviceConnection)) {
                agVar.f39767a.remove(serviceConnection);
                if (agVar.mo28383a()) {
                    this.f39763c.sendMessageDelayed(this.f39763c.obtainMessage(0, aVar), this.f39765e);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f39761a) {
                    C15450a aVar = (C15450a) message.obj;
                    C15416ag agVar = (C15416ag) this.f39761a.get(aVar);
                    if (agVar != null && agVar.mo28383a()) {
                        if (agVar.f39769c) {
                            agVar.f39773g.f39763c.removeMessages(1, agVar.f39771e);
                            C15497a.m32247a(agVar.f39773g.f39762b, agVar);
                            agVar.f39769c = false;
                            agVar.f39768b = 2;
                        }
                        this.f39761a.remove(aVar);
                    }
                }
                return true;
            case 1:
                synchronized (this.f39761a) {
                    C15450a aVar2 = (C15450a) message.obj;
                    C15416ag agVar2 = (C15416ag) this.f39761a.get(aVar2);
                    if (agVar2 != null && agVar2.f39768b == 3) {
                        String valueOf = String.valueOf(aVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName componentName = agVar2.f39772f;
                        if (componentName == null) {
                            componentName = aVar2.f39861b;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(aVar2.f39860a, "unknown");
                        }
                        agVar2.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
