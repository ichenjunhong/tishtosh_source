package com.p683ss.android.message.p1186a.p1187a;

import android.content.Context;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.C19478f;
import com.p683ss.android.pushmanager.p1204a.C19670f;
import com.p683ss.android.ugc.aweme.app.C23060d;
import java.io.IOException;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.a.a.c */
public final class C19411c implements C19409a {

    /* renamed from: a */
    public String f53651a;

    /* renamed from: b */
    public String f53652b;

    /* renamed from: c */
    public String f53653c;

    /* renamed from: d */
    public long f53654d;

    /* renamed from: e */
    public boolean f53655e;

    /* renamed from: f */
    public int f53656f;

    /* renamed from: g */
    public String f53657g;

    /* renamed from: a */
    public final String mo40503a() {
        return this.f53651a;
    }

    /* renamed from: b */
    public final String mo40505b() {
        return this.f53652b;
    }

    /* renamed from: d */
    public final long mo40507d() {
        return this.f53654d;
    }

    /* renamed from: e */
    public final boolean mo40508e() {
        return this.f53655e;
    }

    /* renamed from: f */
    public final String mo40509f() {
        return this.f53657g;
    }

    /* renamed from: c */
    public final long mo40506c() {
        String str = this.f53653c;
        if (C9431p.m18664a(str)) {
            str = "0";
        }
        return Long.parseLong(str);
    }

    /* renamed from: g */
    private static JSONObject m47511g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", "今日头条");
            jSONObject.put("text", "新消息");
            jSONObject.put("id", (int) ((Math.random() * 1000.0d) + 1012.0d));
            String str = C23060d.f61428b;
            StringBuilder sb = new StringBuilder("snssdk143://detail?groupid=34265446");
            sb.append(String.valueOf((int) (Math.random() * 100.0d)));
            jSONObject.put(str, sb.toString());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53651a);
        sb.append("|");
        sb.append(String.valueOf(this.f53652b));
        sb.append("|");
        sb.append(this.f53653c);
        sb.append("|");
        sb.append(String.valueOf(this.f53654d));
        sb.append("|");
        sb.append(String.valueOf(this.f53655e));
        sb.append("|");
        sb.append(String.valueOf(this.f53656f));
        sb.append("|");
        sb.append(this.f53657g);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo40504a(Context context, byte[] bArr) {
        if (bArr != null) {
            try {
                JSONObject a = C19670f.m48062a(bArr, false);
                if (a != null) {
                    StringBuilder sb = new StringBuilder("PushUtils.getMessage = ");
                    sb.append(a.toString());
                    C19410b.m47510a(context, sb.toString());
                    C19478f.m47685a(context, a, 1, mo40509f());
                } else {
                    if (C9415i.m18635b()) {
                        C19478f.m47685a(context, m47511g(), 1, mo40509f());
                    }
                }
            } catch (IOException | DataFormatException unused) {
            } catch (Exception unused2) {
            }
        }
    }
}
