package com.p683ss.sys.ces.p2582c;

import android.content.Context;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.p1096a.p1097a.C18478b;
import com.p683ss.sys.ces.C51379a;
import com.p683ss.sys.ces.C51393c;
import com.p683ss.sys.ces.C51410g;
import com.p683ss.sys.ces.p2580a.C51384d;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.c.c */
public final class C51399c extends C18478b {

    /* renamed from: f */
    private Context f128529f;

    public C51399c(Context context, String str) {
        super(context, str);
        this.f128529f = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44716c(0));
        sb.append("/v2/s");
        sb.append(m110550b());
        this.f50893a = sb.toString();
    }

    /* renamed from: b */
    private String m110550b() {
        String str = "?os=0&ver=0.6.11.29.02-MT&m=2";
        String str2 = "";
        try {
            str2 = this.f128529f.getPackageManager().getPackageInfo(this.f128529f.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&app_ver=");
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("&region=");
        sb3.append(C51384d.m110514a(this.f128529f));
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("&aid=");
        sb5.append(C51393c.m110536b());
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        sb7.append("&did=");
        sb7.append(C51393c.m110538d());
        return sb7.toString();
    }

    /* renamed from: a */
    public final boolean mo37728a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str = (String) C51379a.meta(200, this.f128529f, bArr);
                    if (str != null && str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("result", 0);
                        int optInt2 = jSONObject.optInt("t1", C51410g.f128554a);
                        int optInt3 = jSONObject.optInt("t2", C51410g.f128555b);
                        int optInt4 = jSONObject.optInt("t3", C51410g.f128556c);
                        if (optInt == 1) {
                            C51410g.f128554a = optInt2;
                            C51410g.f128555b = optInt3;
                            C51410g.f128556c = optInt4;
                            C51393c.f128504k = true;
                            return true;
                        }
                        C51393c.f128504k = false;
                    }
                }
            } catch (Throwable unused) {
                C51393c.f128504k = false;
            }
        }
        return false;
    }
}
