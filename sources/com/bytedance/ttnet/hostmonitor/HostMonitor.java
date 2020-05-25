package com.bytedance.ttnet.hostmonitor;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class HostMonitor extends IntentService {
    public HostMonitor() {
        super("HostMonitor");
    }

    public void onCreate() {
        try {
            super.onCreate();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static C13346a m26904a(Context context) {
        NetworkInfo a = C13349d.m26916a((ConnectivityManager) context.getSystemService("connectivity"));
        if (a == null || !a.isConnected()) {
            return C13346a.NONE;
        }
        int type = a.getType();
        if (type == 0) {
            return C13346a.MOBILE;
        }
        if (type == 1) {
            return C13346a.WIFI;
        }
        StringBuilder sb = new StringBuilder("Unsupported connection type: ");
        sb.append(type);
        sb.append(". Returning NONE");
        C13351f.m26925a("HostMonitor", sb.toString());
        return C13346a.NONE;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        C13346a aVar;
        if (intent != null) {
            try {
                if ("com.bytedance.ttnet.hostmonitor.check".equals(intent.getAction())) {
                    C13350e eVar = new C13350e(this);
                    if (eVar.mo24965b().isEmpty()) {
                        C13351f.m26926b("HostMonitor", "No hosts to check at this moment");
                    } else {
                        int intExtra = intent.getIntExtra("com.bytedance.ttnet.hostmonitor.connection_type", -1);
                        if (intExtra < 0) {
                            aVar = m26904a(this);
                        } else {
                            aVar = C13346a.values()[intExtra];
                        }
                        if (aVar == C13346a.NONE) {
                            C13351f.m26926b("HostMonitor", "No active connection. Notifying that all the hosts are unreachable");
                            for (C13348c cVar : eVar.mo24965b().keySet()) {
                                C13356g gVar = (C13356g) eVar.mo24965b().get(cVar);
                                C13356g gVar2 = new C13356g(false, aVar);
                                if (!gVar2.equals(gVar)) {
                                    StringBuilder sb = new StringBuilder("Host ");
                                    sb.append(cVar.f34826a);
                                    sb.append(" is currently unreachable on port ");
                                    sb.append(cVar.f34827b);
                                    C13351f.m26926b("HostMonitor", sb.toString());
                                    eVar.mo24965b().put(cVar, gVar2);
                                    m26906a(eVar.mo24966c(), cVar, gVar, gVar2);
                                }
                            }
                            eVar.mo24968e();
                        } else {
                            m26905a(aVar, eVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036 A[SYNTHETIC, Splitter:B:24:0x0036] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m26907a(com.bytedance.ttnet.hostmonitor.C13348c r3, int r4) {
        /*
            r0 = 0
            java.net.Socket r1 = new java.net.Socket     // Catch:{ Exception -> 0x0033, all -> 0x0023 }
            r1.<init>()     // Catch:{ Exception -> 0x0033, all -> 0x0023 }
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            java.lang.String r2 = r3.f34826a     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            int r3 = r3.f34827b     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r1.connect(r0, r4)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r3 = 1
            r1.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0039
        L_0x0017:
            java.lang.String r4 = "HostMonitor"
            java.lang.String r0 = "Error while closing socket."
            com.bytedance.ttnet.hostmonitor.C13351f.m26926b(r4, r0)
            goto L_0x0039
        L_0x001f:
            r3 = move-exception
            goto L_0x0025
        L_0x0021:
            r0 = r1
            goto L_0x0033
        L_0x0023:
            r3 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ Exception -> 0x002b }
            goto L_0x0032
        L_0x002b:
            java.lang.String r4 = "HostMonitor"
            java.lang.String r0 = "Error while closing socket."
            com.bytedance.ttnet.hostmonitor.C13351f.m26926b(r4, r0)
        L_0x0032:
            throw r3
        L_0x0033:
            r3 = 0
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ Exception -> 0x0017 }
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.hostmonitor.HostMonitor.m26907a(com.bytedance.ttnet.hostmonitor.c, int):boolean");
    }

    /* renamed from: a */
    private void m26905a(C13346a aVar, C13350e eVar) {
        String str;
        C13351f.m26926b("HostMonitor", "Starting reachability check");
        for (C13348c cVar : eVar.mo24965b().keySet()) {
            C13356g gVar = (C13356g) eVar.mo24965b().get(cVar);
            if (eVar.f34831d <= 0) {
                eVar.f34831d = eVar.mo24963a().getInt("socketTimeout", 5000);
            }
            int i = eVar.f34831d;
            if (eVar.f34833f <= 0) {
                eVar.f34833f = eVar.mo24963a().getInt("maxAttempts", 3);
            }
            int i2 = eVar.f34833f;
            boolean z = false;
            for (int i3 = 0; i3 < i2; i3++) {
                z = m26907a(cVar, i);
                if (z) {
                    break;
                }
            }
            C13356g gVar2 = new C13356g(z, aVar);
            if (!gVar2.equals(gVar)) {
                String str2 = "HostMonitor";
                StringBuilder sb = new StringBuilder("Host ");
                sb.append(cVar.f34826a);
                sb.append(" is currently ");
                if (z) {
                    str = "reachable";
                } else {
                    str = "unreachable";
                }
                sb.append(str);
                sb.append(" on port ");
                sb.append(cVar.f34827b);
                sb.append(" via ");
                sb.append(aVar);
                C13351f.m26926b(str2, sb.toString());
                eVar.mo24965b().put(cVar, gVar2);
                m26906a(eVar.mo24966c(), cVar, gVar, gVar2);
            }
        }
        eVar.mo24968e();
        C13351f.m26926b("HostMonitor", "Reachability check finished!");
    }

    /* renamed from: a */
    private void m26906a(String str, C13348c cVar, C13356g gVar, C13356g gVar2) {
        HostStatus a = new HostStatus().mo24952a(cVar.f34826a).mo24950a(cVar.f34827b).mo24953a(gVar.f34839a).mo24954b(gVar.f34840b).mo24955b(gVar2.f34839a).mo24951a(gVar2.f34840b);
        StringBuilder sb = new StringBuilder("Broadcast with action: ");
        sb.append(str);
        sb.append(" and status: ");
        sb.append(a);
        C13351f.m26926b("HostMonitor", sb.toString());
        Intent intent = new Intent(str);
        intent.putExtra("HostStatus", a);
        sendBroadcast(intent);
    }
}
