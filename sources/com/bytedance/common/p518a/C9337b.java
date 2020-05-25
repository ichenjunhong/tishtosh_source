package com.bytedance.common.p518a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.a.b */
final class C9337b {

    /* renamed from: a */
    public String f25551a;

    /* renamed from: b */
    public String[] f25552b;

    /* renamed from: c */
    public List<InetAddress> f25553c;

    /* renamed from: d */
    public long f25554d;

    /* renamed from: e */
    public long f25555e;

    /* renamed from: f */
    private Handler f25556f = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && message.what == 0) {
                StringBuilder sb = new StringBuilder("get MSG_EXPIRE for ");
                sb.append(C9337b.this.f25551a);
                C9343f.m18512a(sb.toString());
                C9342e a = C9341d.m18501a();
                if (a != null) {
                    a.mo16965a(C9337b.this.f25551a);
                }
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16959a() {
        this.f25556f.removeMessages(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo16960b() {
        if (this.f25555e + this.f25554d >= System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("host: ");
        sb.append(this.f25551a);
        sb.append(" ip cnt: ");
        sb.append(this.f25552b.length);
        sb.append(" ttl: ");
        sb.append(this.f25554d);
        String sb2 = sb.toString();
        for (String append : this.f25552b) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("\n ip: ");
            sb3.append(append);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: a */
    private void m18495a(boolean z) {
        this.f25556f.removeMessages(0);
        if (z) {
            this.f25556f.sendEmptyMessageDelayed(0, this.f25554d * 1000);
        }
    }

    C9337b(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f25551a = jSONObject.getString("host");
            JSONArray jSONArray = jSONObject.getJSONArray("ips");
            int length = jSONArray.length();
            this.f25552b = new String[length];
            this.f25553c = new ArrayList();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                this.f25552b[i] = string;
                if (C9345h.m18515a(string)) {
                    this.f25553c.add(InetAddress.getByAddress(this.f25551a, InetAddress.getByName(string).getAddress()));
                }
            }
            this.f25554d = jSONObject.getLong("ttl");
            this.f25555e = System.currentTimeMillis() / 1000;
            m18495a(z);
        } catch (Exception unused) {
        }
    }

    C9337b(String str, long j, boolean z) {
        this.f25551a = str;
        this.f25554d = j;
        this.f25555e = System.currentTimeMillis() / 1000;
        m18495a(z);
    }
}
