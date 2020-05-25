package com.p683ss.sys.p2577b;

import android.content.Context;
import android.util.Base64;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.sys.ces.C51379a;
import com.p683ss.sys.p2577b.p2578a.C51374a;
import org.json.JSONObject;

/* renamed from: com.ss.sys.b.a */
public class C51373a {

    /* renamed from: g */
    private static volatile C51373a f128469g;

    /* renamed from: a */
    protected long f128470a;

    /* renamed from: b */
    protected int f128471b = 504;

    /* renamed from: c */
    protected boolean f128472c;

    /* renamed from: d */
    protected long f128473d;

    /* renamed from: e */
    protected String f128474e = "";

    /* renamed from: f */
    private Context f128475f;

    private C51373a() {
    }

    /* renamed from: a */
    public static C51373a m110489a() {
        if (f128469g == null) {
            synchronized (C51373a.class) {
                if (f128469g == null) {
                    f128469g = new C51373a();
                }
            }
        }
        return f128469g;
    }

    /* renamed from: a */
    public final void mo102051a(Context context, long j, C51374a aVar) {
        if (this.f128475f == null) {
            this.f128475f = context;
        }
        if (this.f128471b != 102 && this.f128471b != 202 && this.f128471b != 200) {
            this.f128470a = System.currentTimeMillis();
            this.f128472c = false;
            this.f128473d = j;
            this.f128471b = 102;
            new C51375b(context, aVar).mo102054a();
        }
    }

    /* renamed from: b */
    public final String mo102052b() {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put(C42311c.f106863g, "1.0.5");
            if (this.f128474e == null || this.f128474e.length() <= 0) {
                try {
                    jSONObject.put("token_id", C51379a.meta(303, this.f128475f, null));
                } catch (Throwable unused) {
                    str = "token_id";
                    str2 = "";
                }
            } else {
                str = "token_id";
                str2 = this.f128474e;
                jSONObject.put(str, str2);
            }
            jSONObject.put("code", this.f128471b);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            return "";
        }
    }
}
