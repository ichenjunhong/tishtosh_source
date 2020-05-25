package com.bytedance.common.wschannel.channel.p530a.p531a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.wschannel.C9454c;
import com.bytedance.common.wschannel.C9503d;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.p530a.p531a.C9467b.C9475a;
import com.bytedance.common.wschannel.channel.p530a.p531a.p532a.C9466d;
import com.bytedance.common.wschannel.p534d.C9504a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a */
public final class C9461a implements C9382a, IWsChannelClient {

    /* renamed from: a */
    public Context f25746a;

    /* renamed from: b */
    public Map<String, Object> f25747b = new HashMap();

    /* renamed from: c */
    public List<String> f25748c;

    /* renamed from: d */
    private final int f25749d;

    /* renamed from: e */
    private Handler f25750e;

    /* renamed from: f */
    private C9467b f25751f;

    /* renamed from: g */
    private boolean f25752g;

    /* renamed from: h */
    private ContentObserver f25753h;

    public final void handleMsg(Message message) {
    }

    public final void onConnection(JSONObject jSONObject) {
    }

    public final void onMessage(byte[] bArr) {
    }

    public final boolean isConnected() {
        return this.f25751f.mo17164f();
    }

    public final void stopConnection() {
        this.f25751f.mo17154a();
    }

    public final void destroy() {
        C9467b bVar = this.f25751f;
        bVar.f25761c.removeMessages(2);
        bVar.f25761c.removeMessages(1);
        bVar.f25761c.removeMessages(3);
        bVar.f25761c.removeMessages(5);
        bVar.mo17157a((Runnable) new Runnable() {
            public final void run() {
                C9467b.this.mo17154a();
            }
        });
        try {
            if (this.f25746a != null) {
                this.f25746a.getContentResolver().unregisterContentObserver(this.f25753h);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m18768a(Context context) {
        return C9503d.m18870a(context).f25897a.mo17080a("key_ok_impl_enable", true);
    }

    public final void onAppStateChanged(int i) {
        if (m18768a(this.f25746a)) {
            C9467b bVar = this.f25751f;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            bVar.f25761c.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
        }
    }

    public final void onNetworkStateChanged(int i) {
        if (m18768a(this.f25746a)) {
            this.f25751f.f25761c.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
        }
    }

    public final boolean sendMessage(byte[] bArr) {
        boolean z = false;
        if (!m18768a(this.f25746a)) {
            return false;
        }
        C9467b bVar = this.f25751f;
        ByteString of = ByteString.m114277of(bArr);
        if (bVar.f25763e != null && bVar.mo17164f() && (of instanceof ByteString)) {
            z = bVar.f25763e.mo17209d(of);
        }
        return z;
    }

    public C9461a(int i, Handler handler) {
        this.f25749d = i;
        this.f25750e = handler;
        this.f25753h = new ContentObserver(this.f25750e) {
            public final void onChange(boolean z) {
                super.onChange(z);
                if (C9461a.m18768a(C9461a.this.f25746a)) {
                    C9461a.this.openConnection(C9461a.this.f25747b, C9461a.this.f25748c);
                } else {
                    C9461a.this.stopConnection();
                }
            }
        };
    }

    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f25747b.putAll(map);
        }
        this.f25748c = list;
        if (m18768a(this.f25746a)) {
            C9467b bVar = this.f25751f;
            if (!list.isEmpty()) {
                bVar.mo17157a((Runnable) new Runnable(map, list) {

                    /* renamed from: a */
                    final /* synthetic */ Map f25782a;

                    /* renamed from: b */
                    final /* synthetic */ List f25783b;

                    public final void run() {
                        C9467b.this.mo17159a(this.f25782a);
                        C9467b.this.handleMsg(C9467b.this.f25761c.obtainMessage(7, this.f25783b));
                    }

                    {
                        this.f25782a = r2;
                        this.f25783b = r3;
                    }
                });
            }
        }
    }

    public final void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f25747b.putAll(map);
        }
        this.f25748c = list;
        if (m18768a(this.f25746a)) {
            C9467b bVar = this.f25751f;
            if (!list.isEmpty()) {
                bVar.mo17157a((Runnable) new Runnable(map, list) {

                    /* renamed from: a */
                    final /* synthetic */ Map f25777a;

                    /* renamed from: b */
                    final /* synthetic */ List f25778b;

                    public final void run() {
                        int e = C9467b.this.mo17163e();
                        if (e != 4 && e != 1 && e != 5) {
                            C9467b.this.mo17159a(this.f25777a);
                            C9467b.this.handleMsg(C9467b.this.f25761c.obtainMessage(2, this.f25778b));
                        }
                    }

                    {
                        this.f25777a = r2;
                        this.f25778b = r3;
                    }
                });
            }
        }
    }

    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        if (!this.f25752g) {
            this.f25752g = true;
            this.f25746a = context.getApplicationContext();
            C9475a aVar = new C9475a(context);
            aVar.f25788d = new C9466d(context);
            C9504a aVar2 = (C9504a) C9454c.f25733c.get(Integer.valueOf(this.f25749d));
            if (aVar2 != null) {
                aVar.f25789e = aVar2;
            }
            C9476b bVar = new C9476b(aVar.f25785a, aVar.f25786b, aVar.f25787c, aVar.f25788d, aVar.f25789e);
            this.f25751f = new C9467b(bVar);
            this.f25751f.f25762d = new C9501d(this.f25746a, this.f25751f, iWsChannelClient);
            try {
                context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.m18701a(context, "key_ok_impl_enable", "boolean"), true, this.f25753h);
            } catch (Throwable unused) {
            }
        }
    }
}
