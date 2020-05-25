package com.bytedance.common.wschannel.channel.p530a.p531a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.p537e.C9518a;
import java.io.UnsupportedEncodingException;
import okhttp3.C53504ad;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.d */
final class C9501d implements C9485d {

    /* renamed from: a */
    private final IWsChannelClient f25884a;

    /* renamed from: b */
    private final C9467b f25885b;

    /* renamed from: c */
    private final Context f25886c;

    /* renamed from: a */
    public final void mo17192a(ByteString byteString) {
        if (this.f25884a != null) {
            this.f25884a.onMessage(byteString.toByteArray());
        }
    }

    /* renamed from: b */
    public final void mo17193b(String str) {
        if (this.f25884a != null) {
            try {
                this.f25884a.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo17189a(String str) {
        if (this.f25884a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("state", 1);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f25884a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo17191a(C53504ad adVar) {
        if (this.f25884a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("state", 4);
                jSONObject.put("url", adVar.f132398a.f132378a.toString());
                jSONObject.put("channel_type", 2);
                this.f25884a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    C9501d(Context context, C9467b bVar, IWsChannelClient iWsChannelClient) {
        this.f25885b = bVar;
        this.f25884a = iWsChannelClient;
        this.f25886c = context;
    }

    /* renamed from: b */
    public final void mo17194b(String str, int i, String str2) {
        if (this.f25884a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 3);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f25884a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo17190a(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        C9518a.m18888a(this.f25886c, "WsChannelSdk_ok", bundle);
        if (this.f25884a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 2);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i);
                this.f25884a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
