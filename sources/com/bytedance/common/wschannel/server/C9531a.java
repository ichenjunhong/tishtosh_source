package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.wschannel.C9503d;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.C9502b;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg.C9528a;
import com.bytedance.common.wschannel.p528b.C9452b;
import com.bytedance.common.wschannel.p537e.C9518a;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.common.wschannel.server.a */
public class C9531a implements C9382a, C9539a {

    /* renamed from: m */
    private static C9531a f25979m;

    /* renamed from: a */
    public final HandlerThread f25980a = new HandlerThread("wschannel");

    /* renamed from: b */
    public final C9381g f25981b;

    /* renamed from: c */
    public final Context f25982c;

    /* renamed from: d */
    final Object f25983d = new Object();

    /* renamed from: e */
    public final C9543f f25984e;

    /* renamed from: f */
    final C9540e f25985f;

    /* renamed from: g */
    AtomicLong f25986g = new AtomicLong(0);

    /* renamed from: h */
    public C9537d f25987h;

    /* renamed from: i */
    Map<Integer, IWsApp> f25988i = new ConcurrentHashMap();

    /* renamed from: j */
    Map<Integer, IWsChannelClient> f25989j = new ConcurrentHashMap();

    /* renamed from: k */
    Map<Integer, SocketState> f25990k = new ConcurrentHashMap();

    /* renamed from: l */
    public boolean f25991l = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo17320b() {
        return this.f25987h.f25998b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo17318a() {
        String str;
        C9528a a = C9528a.m18907a(Integer.MAX_VALUE).mo17308c(4).mo17305b(9000).mo17300a(1008601).mo17303a(new byte[0]).mo17307b("pb").mo17301a("pb");
        String str2 = "IsBackground";
        if (this.f25991l) {
            str = "0";
        } else {
            str = "1";
        }
        return C9452b.m18752a().mo17124a(a.mo17302a(str2, str).mo17304a());
    }

    /* renamed from: a */
    private void m18919a(Runnable runnable) {
        this.f25981b.post(runnable);
    }

    public void handleMsg(Message message) {
        final Message obtain = Message.obtain(message);
        m18919a((Runnable) new Runnable() {
            public final void run() {
                boolean z;
                IWsChannelClient iWsChannelClient;
                C9531a aVar = C9531a.this;
                Message message = obtain;
                try {
                    int i = message.what;
                    if (i == 0) {
                        message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                        Parcelable parcelable = message.getData().getParcelable("ws_app");
                        if (parcelable instanceof IWsApp) {
                            aVar.mo17319b((IWsApp) parcelable);
                        }
                    } else {
                        boolean z2 = true;
                        if (i == 1) {
                            message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                            Parcelable parcelable2 = message.getData().getParcelable("ws_app");
                            if (parcelable2 instanceof IntegerParcelable) {
                                int i2 = ((IntegerParcelable) parcelable2).f25918a;
                                synchronized (WsChannelService.class) {
                                    aVar.f25988i.remove(Integer.valueOf(i2));
                                }
                                synchronized (aVar.f25983d) {
                                    iWsChannelClient = (IWsChannelClient) aVar.f25989j.remove(Integer.valueOf(i2));
                                }
                                if (iWsChannelClient != null) {
                                    iWsChannelClient.destroy();
                                }
                                aVar.f25990k.remove(Integer.valueOf(i2));
                                aVar.f25981b.sendMessageDelayed(aVar.f25981b.obtainMessage(8, iWsChannelClient), 1000);
                            }
                        } else {
                            boolean z3 = false;
                            if (i == 2) {
                                int i3 = message.arg1;
                                if (i3 != 1) {
                                    z2 = false;
                                }
                                aVar.f25991l = z2;
                                if (aVar.mo17320b()) {
                                    Collection<IWsChannelClient> values = aVar.f25989j.values();
                                    if (C9503d.m18870a(aVar.f25982c).mo17231b()) {
                                        byte[] a = aVar.mo17318a();
                                        for (IWsChannelClient sendMessage : values) {
                                            try {
                                                sendMessage.sendMessage(a);
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                    for (IWsChannelClient iWsChannelClient2 : aVar.f25989j.values()) {
                                        if (iWsChannelClient2 != null) {
                                            iWsChannelClient2.onAppStateChanged(i3);
                                        }
                                    }
                                }
                            } else if (i == 3) {
                                int i4 = message.arg1;
                                if (aVar.mo17320b()) {
                                    for (IWsChannelClient iWsChannelClient3 : aVar.f25989j.values()) {
                                        if (iWsChannelClient3 != null) {
                                            iWsChannelClient3.onNetworkStateChanged(i4);
                                        }
                                    }
                                }
                            } else if (i == 4) {
                                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                                Parcelable parcelable3 = message.getData().getParcelable("ws_app");
                                if (parcelable3 instanceof IWsApp) {
                                    aVar.mo17315a((IWsApp) parcelable3);
                                }
                            } else {
                                if (i != 5) {
                                    if (i != 10) {
                                        if (i == 9) {
                                            C9540e eVar = aVar.f25985f;
                                            Intent intent = new Intent();
                                            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
                                            intent.putParcelableArrayListExtra("connection", new ArrayList(eVar.f26004b.values()));
                                            eVar.f26005c.mo17091a(intent);
                                        }
                                    }
                                }
                                if (i == 10) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                                Parcelable parcelable4 = message.getData().getParcelable("payload");
                                if (parcelable4 instanceof WsChannelMsg) {
                                    WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable4;
                                    if (wsChannelMsg.f25949b <= 0) {
                                        wsChannelMsg.f25949b = aVar.f25986g.incrementAndGet();
                                    }
                                    IWsChannelClient iWsChannelClient4 = (IWsChannelClient) aVar.f25989j.get(Integer.valueOf(wsChannelMsg.f25958k));
                                    if (iWsChannelClient4 != null) {
                                        z3 = iWsChannelClient4.sendMessage(C9452b.m18752a().mo17124a(wsChannelMsg));
                                        if (!z3 && !z) {
                                            long a2 = C9503d.m18870a(aVar.f25982c).f25897a.mo17079a("key_retry_send_msg_delay", 0);
                                            if (a2 > 0) {
                                                Message obtain = Message.obtain(message);
                                                obtain.what = 10;
                                                aVar.f25981b.sendMessageDelayed(obtain, a2);
                                            }
                                        }
                                    }
                                    ComponentName componentName = wsChannelMsg.f25957j;
                                    if (componentName != null) {
                                        byte[] a3 = wsChannelMsg.mo17289a();
                                        if (a3 == null) {
                                            a3 = new byte[1];
                                        }
                                        Intent intent2 = new Intent();
                                        intent2.setAction("com.bytedance.article.wschannel.send.payload");
                                        intent2.setComponent(componentName);
                                        intent2.putExtra("send_result", z3);
                                        intent2.putExtra("payload_md5", C9395d.m18574b(a3));
                                        Context context = aVar.f25982c;
                                        if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent2)) {
                                            context.startService(intent2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }

    /* renamed from: a */
    public static C9531a m18918a(Context context) {
        if (f25979m == null) {
            synchronized (C9531a.class) {
                if (f25979m == null) {
                    f25979m = new C9531a(context);
                }
            }
        }
        return f25979m;
    }

    /* renamed from: a */
    private void m18920a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        C9518a.m18888a(this.f25982c, "wschannel_param_null", bundle);
    }

    private C9531a(Context context) {
        this.f25982c = context.getApplicationContext();
        this.f25980a.start();
        this.f25981b = new C9381g(this.f25980a.getLooper(), this);
        this.f25984e = new C9543f(this.f25982c);
        this.f25985f = new C9540e(this.f25982c, this.f25990k, this.f25988i, this.f25981b);
        m18919a((Runnable) new Runnable() {
            public final void run() {
                C9531a.this.f25987h = new C9537d(C9531a.this.f25982c, C9531a.this.f25981b, C9531a.this);
                C9531a.this.mo17316a(C9543f.m18938a());
            }
        });
    }

    /* renamed from: d */
    private void m18922d(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        synchronized (this.f25983d) {
            iWsChannelClient = (IWsChannelClient) this.f25989j.get(Integer.valueOf(iWsApp.mo17102a()));
            if (iWsChannelClient == null) {
                iWsChannelClient = C9502b.m18867a(iWsApp.mo17102a(), this.f25985f, this.f25981b);
                iWsChannelClient.init(this.f25982c, iWsChannelClient);
                this.f25989j.put(Integer.valueOf(iWsApp.mo17102a()), iWsChannelClient);
            }
        }
        if (iWsChannelClient.isConnected()) {
            SocketState socketState = (SocketState) this.f25990k.get(Integer.valueOf(iWsApp.mo17102a()));
            if (socketState != null) {
                try {
                    this.f25985f.mo17326a(socketState);
                } catch (Throwable unused) {
                }
            }
        } else {
            try {
                iWsChannelClient.openConnection(m18921c(iWsApp), iWsApp.mo17110i());
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17315a(IWsApp iWsApp) {
        int a = WsChannelService.m18917a(iWsApp);
        if (mo17320b()) {
            try {
                IWsChannelClient iWsChannelClient = (IWsChannelClient) this.f25989j.get(Integer.valueOf(iWsApp.mo17102a()));
                synchronized (WsChannelService.class) {
                    IWsApp iWsApp2 = (IWsApp) this.f25988i.get(Integer.valueOf(a));
                    if (iWsChannelClient != null) {
                        if (!iWsApp.equals(iWsApp2) || !iWsChannelClient.isConnected()) {
                            this.f25988i.put(Integer.valueOf(a), iWsApp);
                            iWsChannelClient.onParameterChange(m18921c(iWsApp), iWsApp.mo17110i());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17319b(com.bytedance.common.wschannel.app.IWsApp r8) {
        /*
            r7 = this;
            int r0 = com.bytedance.common.wschannel.server.WsChannelService.m18917a(r8)
            boolean r1 = r7.mo17320b()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r1 = com.bytedance.common.wschannel.server.WsChannelService.class
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.f25988i     // Catch:{ all -> 0x004e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x004e }
            com.bytedance.common.wschannel.app.IWsApp r2 = (com.bytedance.common.wschannel.app.IWsApp) r2     // Catch:{ all -> 0x004e }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.channel.IWsChannelClient> r3 = r7.f25989j     // Catch:{ all -> 0x004e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004e }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x004e }
            com.bytedance.common.wschannel.channel.IWsChannelClient r3 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r3     // Catch:{ all -> 0x004e }
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0035
            boolean r6 = r8.equals(r2)     // Catch:{ all -> 0x004e }
            if (r6 == 0) goto L_0x0035
            if (r3 != 0) goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            r5 = 0
            goto L_0x0041
        L_0x0035:
            if (r2 != 0) goto L_0x0041
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.f25988i     // Catch:{ all -> 0x004e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004e }
            r2.put(r0, r8)     // Catch:{ all -> 0x004e }
            goto L_0x0032
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0048
            r7.m18922d(r8)
            return
        L_0x0048:
            if (r5 == 0) goto L_0x004d
            r7.mo17315a(r8)
        L_0x004d:
            return
        L_0x004e:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9531a.mo17319b(com.bytedance.common.wschannel.app.IWsApp):void");
    }

    /* renamed from: c */
    private Map<String, Object> m18921c(IWsApp iWsApp) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.mo17107f());
        hashMap.put("fpid", Integer.valueOf(iWsApp.mo17108g()));
        hashMap.put("sdk_version", Integer.valueOf(2));
        hashMap.put("platform", Integer.valueOf(0));
        hashMap.put("app_version", Integer.valueOf(iWsApp.mo17106e()));
        hashMap.put("aid", Integer.valueOf(iWsApp.mo17103b()));
        hashMap.put("device_id", iWsApp.mo17104c());
        hashMap.put("iid", iWsApp.mo17105d());
        hashMap.put("channel_id", Integer.valueOf(iWsApp.mo17102a()));
        String h = iWsApp.mo17109h();
        if (h == null) {
            m18920a("extra");
            h = "";
        }
        if (C9503d.m18870a(this.f25982c).mo17231b()) {
            String[] split = h.split("&");
            StringBuilder sb = new StringBuilder("is_background=");
            if (this.f25991l) {
                str = "0";
            } else {
                str = "1";
            }
            sb.append(str);
            String sb2 = sb.toString();
            if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
                h = sb2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(h);
                sb3.append("&");
                sb3.append(sb2);
                h = sb3.toString();
            }
        }
        hashMap.put("extra", h);
        if (iWsApp.mo17104c() == null) {
            m18920a("device_id");
        }
        if (iWsApp.mo17105d() == null) {
            m18920a("install_id");
        }
        if (C9431p.m18664a(iWsApp.mo17107f())) {
            m18920a("app_key");
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo17316a(Map<Integer, IWsApp> map) {
        if (this.f25987h.f25998b && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    mo17319b(iWsApp);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17317a(boolean z) {
        if (z) {
            mo17316a(C9543f.m18938a());
            return;
        }
        try {
            synchronized (this.f25983d) {
                for (Entry value : this.f25989j.entrySet()) {
                    IWsChannelClient iWsChannelClient = (IWsChannelClient) value.getValue();
                    if (iWsChannelClient != null) {
                        iWsChannelClient.destroy();
                    }
                }
                this.f25989j.clear();
            }
            this.f25988i.clear();
        } catch (Throwable unused) {
        }
    }
}
