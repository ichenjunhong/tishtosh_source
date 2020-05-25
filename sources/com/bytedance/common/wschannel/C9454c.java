package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.wschannel.C9447b.C9450a;
import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.SsWsApp.C9524a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p527a.C9443b;
import com.bytedance.common.wschannel.p527a.C9445c;
import com.bytedance.common.wschannel.p534d.C9504a;
import com.bytedance.common.wschannel.server.WsChannelReceiver;
import com.p683ss.android.message.C19408a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.common.wschannel.c */
public final class C9454c {

    /* renamed from: a */
    public static C9443b f25731a = new C9445c();

    /* renamed from: b */
    public static Application f25732b;

    /* renamed from: c */
    public static Map<Integer, C9504a> f25733c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final Object f25734d = new Object();

    /* renamed from: e */
    private static volatile boolean f25735e;

    /* renamed from: f */
    private static C9456a f25736f = new C9456a();

    /* renamed from: g */
    private static Map<Integer, C9439a> f25737g = new ConcurrentHashMap();

    /* renamed from: h */
    private static boolean f25738h;

    /* renamed from: com.bytedance.common.wschannel.c$a */
    static class C9456a implements C9450a {
        private C9456a() {
        }

        /* renamed from: a */
        public final void mo17121a() {
            C9454c.f25731a.mo17093a(C9454c.f25732b);
        }

        /* renamed from: b */
        public final void mo17122b() {
            C9454c.f25731a.mo17097b(C9454c.f25732b);
        }
    }

    /* renamed from: b */
    private static void m18762b() {
        if (!f25735e) {
            throw new IllegalStateException("please init first");
        }
    }

    /* renamed from: a */
    private static void m18755a() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f25732b.registerReceiver(new WsChannelReceiver(f25732b), intentFilter);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m18756a(int i) {
        m18762b();
        WsConstants.remove(1239108);
        f25737g.remove(Integer.valueOf(1239108));
        f25731a.mo17094a((Context) f25732b, 1239108);
    }

    /* renamed from: a */
    public static void m18761a(WsChannelMsg wsChannelMsg) {
        m18762b();
        if (wsChannelMsg == null) {
            throw new IllegalArgumentException("WsChannelMsg can't be null");
        } else if (wsChannelMsg.f25958k <= 0) {
            throw new IllegalArgumentException("illegal channelId");
        } else if (wsChannelMsg.f25951d <= 0) {
            throw new IllegalArgumentException("illegal service");
        } else if (wsChannelMsg.f25952e <= 0) {
            throw new IllegalArgumentException("illegal method");
        } else if (wsChannelMsg.mo17289a() != null) {
            f25731a.mo17096a((Context) f25732b, wsChannelMsg);
        } else {
            throw new IllegalArgumentException("illegal payload");
        }
    }

    /* renamed from: a */
    public static void m18757a(Application application, C9446a aVar) {
        m18759a(application, null, false, true);
    }

    /* renamed from: a */
    public static void m18760a(C9439a aVar, String str) {
        C9439a aVar2 = aVar;
        aVar2.f25703d.put("sid", str);
        m18762b();
        f25737g.put(Integer.valueOf(aVar2.f25700a), aVar2);
        Map<String, String> map = aVar2.f25703d;
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            if (entry != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
                arrayList.add(sb.toString());
            }
        }
        int i = aVar2.f25706g;
        if (i > 0) {
            String str2 = aVar2.f25701b;
            if (!C9431p.m18664a(str2)) {
                String str3 = aVar2.f25702c;
                if (!C9431p.m18664a(str3)) {
                    int i2 = aVar2.f25705f;
                    if (i2 > 0) {
                        String str4 = aVar2.f25707h;
                        if (!C9431p.m18664a(str4)) {
                            int i3 = aVar2.f25708i;
                            if (i3 > 0) {
                                int i4 = aVar2.f25700a;
                                if (i4 > 0) {
                                    C9524a aVar3 = new C9524a();
                                    aVar3.f25936a = i;
                                    aVar3.f25937b = str2;
                                    aVar3.f25938c = str3;
                                    aVar3.f25941f = i2;
                                    aVar3.f25942g = str4;
                                    aVar3.f25945j = aVar2.f25704e;
                                    aVar3.f25939d = i3;
                                    aVar3.f25940e = 0;
                                    aVar3.f25944i = i4;
                                    aVar3.f25943h = TextUtils.join("&", arrayList.toArray());
                                    SsWsApp ssWsApp = new SsWsApp(aVar3.f25944i, aVar3.f25936a, aVar3.f25937b, aVar3.f25938c, aVar3.f25945j, aVar3.f25939d, aVar3.f25940e, aVar3.f25941f, aVar3.f25942g, aVar3.f25943h);
                                    f25731a.mo17095a((Context) f25732b, ssWsApp);
                                    return;
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    /* renamed from: a */
    public static void m18758a(Application application, C9446a aVar, boolean z) {
        m18759a(application, aVar, z, true);
    }

    /* renamed from: a */
    private static void m18759a(Application application, C9446a aVar, boolean z, boolean z2) {
        if (!f25735e) {
            f25735e = true;
            f25732b = application;
            f25738h = true;
            try {
                C19408a.m47501a(application);
            } catch (Throwable unused) {
            }
            C9447b bVar = new C9447b();
            bVar.f25726b = f25736f;
            application.registerActivityLifecycleCallbacks(bVar);
            WsConstants.setOnMessageReceiveListener(aVar);
            m18755a();
        }
    }
}
