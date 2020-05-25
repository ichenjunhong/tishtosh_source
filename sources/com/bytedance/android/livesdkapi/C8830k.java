package com.bytedance.android.livesdkapi;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.p458l.C8833a;
import com.bytedance.android.livesdkapi.p458l.C8833a.C8834a;
import com.bytedance.android.livesdkapi.service.C8861d;
import com.bytedance.android.livesdkapi.service.C8862e;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.k */
public final class C8830k {

    /* renamed from: a */
    public static volatile C8808i f24109a;

    /* renamed from: b */
    public static volatile Context f24110b;

    /* renamed from: c */
    public static volatile C8861d f24111c;

    /* renamed from: d */
    private static volatile boolean f24112d;

    /* renamed from: e */
    private static volatile boolean f24113e;

    /* renamed from: f */
    private static List<String> f24114f = Arrays.asList(new String[]{"livesdk", "livegiftimpl"});

    /* renamed from: c */
    public static Context m17329c() {
        return f24110b;
    }

    /* renamed from: e */
    public static C8861d m17331e() {
        return f24111c;
    }

    /* renamed from: d */
    public static C8862e m17330d() {
        if (f24109a == null) {
            return null;
        }
        return f24109a.mo10339a();
    }

    /* renamed from: a */
    public static synchronized boolean m17327a() {
        boolean z;
        synchronized (C8830k.class) {
            if (!f24112d) {
                C8833a.m17337a("com.bytedance.android.livesdk.TTLiveSDKContext", "delayInit", new Object[0]);
                f24112d = true;
            }
            z = f24112d;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized void m17328b() {
        synchronized (C8830k.class) {
            if (!f24113e) {
                C8833a.m17337a("com.bytedance.android.livesdk.TTLiveSDKContext", "initGiftResource", new Object[0]);
                f24113e = true;
            }
        }
    }

    /* renamed from: a */
    public static <T> T m17325a(Class<T> cls) {
        if (f24109a == null) {
            return null;
        }
        return f24109a.mo10340a(cls);
    }

    /* renamed from: a */
    public static void m17326a(C8861d dVar) {
        try {
            for (String str : f24114f) {
                StringBuilder sb = new StringBuilder("com.bytedance.android.live.misc.LiveService$$");
                sb.append(str);
                C8833a.m17337a(sb.toString(), "registerService", new Object[0]);
            }
            C8833a.m17335a(Class.forName("com.bytedance.android.live.network.NetWorkService"), new C8834a(IHostNetwork.class, dVar.mo13046h()));
            C8833a.m17335a(Class.forName("com.bytedance.android.live.wallet.WalletService"), new C8834a(IHostWallet.class, dVar.mo13044f()));
            C8833a.m17334a(Class.forName("com.bytedance.android.livesdk.fans.FansService"));
            C8833a.m17334a(Class.forName("com.bytedance.android.livesdk.schema.LiveActionHandlerImpl"));
            C8833a.m17334a(Class.forName("com.bytedance.android.livesdk.module.MessageService"));
            C8833a.m17334a(Class.forName("com.bytedance.android.live.livepullstream.PullStreamService"));
            C8833a.m17334a(Class.forName("com.bytedance.android.livesdk.module.LiveSDKService"));
            try {
                C8833a.m17334a(Class.forName("com.bytedance.android.live.broadcast.BroadcastService"));
            } catch (Exception unused) {
                C8833a.m17334a(Class.forName("com.bytedance.android.live.broadcast.api.dummy.BroadcastServiceDummy"));
            }
        } catch (Exception unused2) {
        }
    }
}
