package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.wschannel.C9503d;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.C9460a;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p527a.C9441a;
import com.bytedance.common.wschannel.p527a.C9441a.C9442a;
import com.bytedance.common.wschannel.p528b.C9452b;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.server.e */
final class C9540e implements C9460a {

    /* renamed from: a */
    public final Context f26003a;

    /* renamed from: b */
    final Map<Integer, SocketState> f26004b;

    /* renamed from: c */
    C9441a f26005c = new C9441a(new C9442a() {
        /* renamed from: a */
        public final void mo17092a(WsChannelMsg wsChannelMsg) {
            if (wsChannelMsg != null) {
                C9446a listener = WsConstants.getListener(wsChannelMsg.f25958k);
                if (listener != null) {
                    listener.mo17112a(wsChannelMsg);
                }
            }
        }
    });

    /* renamed from: d */
    private final Map<Integer, IWsApp> f26006d;

    /* renamed from: e */
    private final Handler f26007e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17326a(SocketState socketState) {
        if (socketState != null) {
            this.f26004b.put(Integer.valueOf(socketState.f25922d), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.putExtra("connection", socketState);
                this.f26005c.mo17091a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo17146a(int i, byte[] bArr) {
        if (bArr != null) {
            C9530a aVar = new C9530a();
            aVar.f25977a = i;
            aVar.f25978b = bArr;
            if (aVar.f25978b != null) {
                try {
                    WsChannelMsg a = C9452b.m18752a().mo17123a(aVar.f25978b);
                    if (a != WsChannelMsg.f25948a) {
                        a.f25958k = aVar.f25977a;
                        a.f25957j = new ComponentName(this.f26003a, WsChannelService.class);
                        if (this.f26006d != null) {
                            if (this.f26006d.size() > 0) {
                                for (Entry value : this.f26006d.entrySet()) {
                                    IWsApp iWsApp = (IWsApp) value.getValue();
                                    if (iWsApp != null && iWsApp.mo17102a() == a.f25958k) {
                                        Intent intent = new Intent();
                                        intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                        intent.putExtra("payload", a);
                                        this.f26005c.mo17091a(intent);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17147a(final IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("channel_id", i);
            } catch (JSONException unused) {
            }
            mo17326a(SocketState.m18895a(jSONObject));
            if (C9503d.m18870a(this.f26003a).mo17231b()) {
                this.f26007e.post(new Runnable() {
                    public final void run() {
                        iWsChannelClient.sendMessage(C9531a.m18918a(C9540e.this.f26003a).mo17318a());
                    }
                });
            }
        }
    }

    C9540e(Context context, Map<Integer, SocketState> map, Map<Integer, IWsApp> map2, C9381g gVar) {
        this.f26003a = context;
        this.f26004b = map;
        this.f26006d = map2;
        this.f26007e = gVar;
    }
}
