package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.wschannel.channel.p530a.p531a.C9461a;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.b */
public final class C9502b implements IWsChannelClient {

    /* renamed from: a */
    private static String f25887a = "";

    /* renamed from: i */
    private static boolean f25888i = true;

    /* renamed from: b */
    private final int f25889b;

    /* renamed from: c */
    private final Handler f25890c;

    /* renamed from: d */
    private boolean f25891d;

    /* renamed from: e */
    private List<String> f25892e;

    /* renamed from: f */
    private boolean f25893f = true;

    /* renamed from: g */
    private IWsChannelClient f25894g;

    /* renamed from: h */
    private C9460a f25895h;

    public final boolean isConnected() {
        if (this.f25894g != null) {
            return this.f25894g.isConnected();
        }
        return false;
    }

    public final void stopConnection() {
        if (this.f25894g != null) {
            this.f25894g.stopConnection();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|(2:5|(5:7|(1:12)(1:11)|13|14|15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void destroy() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            r5.f25891d = r0     // Catch:{ all -> 0x004a }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.f25894g     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.f25894g     // Catch:{ all -> 0x004a }
            r1.destroy()     // Catch:{ all -> 0x004a }
            com.bytedance.common.wschannel.channel.IWsChannelClient r1 = r5.f25894g     // Catch:{ all -> 0x004a }
            boolean r1 = r1 instanceof com.bytedance.common.wschannel.channel.p530a.p531a.C9461a     // Catch:{ all -> 0x004a }
            if (r1 != 0) goto L_0x0048
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            java.util.List<java.lang.String> r2 = r5.f25892e     // Catch:{ all -> 0x004a }
            r3 = 0
            if (r2 == 0) goto L_0x002e
            java.util.List<java.lang.String> r2 = r5.f25892e     // Catch:{ all -> 0x004a }
            int r2 = r2.size()     // Catch:{ all -> 0x004a }
            if (r2 <= 0) goto L_0x002e
            java.util.List<java.lang.String> r2 = r5.f25892e     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x004a }
            goto L_0x0030
        L_0x002e:
            java.lang.String r2 = ""
        L_0x0030:
            java.lang.String r4 = "type"
            r1.put(r4, r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "state"
            r4 = 3
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "url"
            r1.put(r3, r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = "channel_type"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0048 }
            r5.m18869a(r1)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.C9502b.destroy():void");
    }

    /* renamed from: a */
    private static Class<?> m18868a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void onAppStateChanged(int i) {
        if (this.f25894g != null) {
            this.f25894g.onAppStateChanged(i);
        }
    }

    public final void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            if (!this.f25891d) {
                m18869a(jSONObject);
            }
        }
    }

    public final void onMessage(byte[] bArr) {
        if (this.f25895h != null) {
            this.f25895h.mo17146a(this.f25889b, bArr);
        }
    }

    public final void onNetworkStateChanged(int i) {
        if (this.f25894g != null) {
            this.f25894g.onNetworkStateChanged(i);
        }
    }

    public final boolean sendMessage(byte[] bArr) {
        if (this.f25894g != null) {
            return this.f25894g.sendMessage(bArr);
        }
        return false;
    }

    /* renamed from: a */
    private void m18869a(JSONObject jSONObject) {
        if (this.f25895h != null) {
            this.f25895h.mo17147a(this, this.f25889b, jSONObject);
        }
    }

    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (this.f25894g != null) {
            this.f25894g.onParameterChange(map, list);
        }
        this.f25892e = list;
    }

    public final void openConnection(Map<String, Object> map, List<String> list) {
        if (this.f25894g != null) {
            this.f25894g.openConnection(map, list);
        }
        this.f25892e = list;
    }

    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        if (this.f25894g != null) {
            try {
                this.f25894g.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.f25894g instanceof C9461a)) {
                    this.f25894g = new C9461a(this.f25889b, this.f25890c);
                    this.f25894g.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C9502b m18867a(int i, C9460a aVar, Handler handler) {
        return new C9502b(i, aVar, handler);
    }

    private C9502b(int i, C9460a aVar, Handler handler) {
        this.f25889b = i;
        this.f25895h = aVar;
        this.f25890c = handler;
        if (f25888i) {
            try {
                if (this.f25894g == null) {
                    Class cls = null;
                    if (!C9431p.m18664a(f25887a)) {
                        cls = m18868a(f25887a);
                    }
                    if (cls == null) {
                        cls = m18868a("org.chromium.wschannel.MySelfChannelImpl");
                        this.f25893f = true;
                    }
                    if (cls == null) {
                        cls = m18868a("com.b.c.ws.MySelfChannelImpl");
                        this.f25893f = false;
                    }
                    if (cls != null) {
                        Object newInstance = cls.newInstance();
                        if (newInstance instanceof IWsChannelClient) {
                            this.f25894g = (IWsChannelClient) newInstance;
                        }
                    } else {
                        throw new ClassNotFoundException("plugin class not found");
                    }
                }
                if (!this.f25893f) {
                    f25888i = false;
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f25894g == null) {
            this.f25894g = new C9461a(i, handler);
        }
    }
}
