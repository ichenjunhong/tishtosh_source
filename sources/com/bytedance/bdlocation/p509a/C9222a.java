package com.bytedance.bdlocation.p509a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.p2544b.p2545a.C51151a;

/* renamed from: com.bytedance.bdlocation.a.a */
public final class C9222a {

    /* renamed from: a */
    public BDLocation f25200a;

    /* renamed from: b */
    public C9234c f25201b;

    /* renamed from: c */
    private SharedPreferences f25202c;

    /* renamed from: a */
    public final BDLocation mo16665a() {
        if (this.f25200a == null) {
            this.f25200a = m18323b(m18322a("BDLocation"));
        }
        return this.f25200a;
    }

    /* renamed from: b */
    public final C9234c mo16667b() {
        if (this.f25201b == null) {
            try {
                this.f25201b = (C9234c) Util.sGson.mo34884a(m18322a("LBSResult"), C9234c.class);
            } catch (Throwable th) {
                C51151a.m110020b("BDLocation", th);
            }
        }
        return this.f25201b;
    }

    public C9222a(Context context) {
        this.f25202c = C35807d.m80935a(context, "BDLocationCache", 0);
    }

    /* renamed from: a */
    private String m18322a(String str) {
        return this.f25202c.getString(str, "");
    }

    /* renamed from: a */
    public static String m18321a(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        try {
            return Util.sGson.mo34889b(bDLocation);
        } catch (Throwable th) {
            C51151a.m110020b("BDLocation", th);
            return null;
        }
    }

    /* renamed from: b */
    private static BDLocation m18323b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (BDLocation) Util.sGson.mo34884a(str, BDLocation.class);
        } catch (Throwable th) {
            C51151a.m110020b("BDLocation", th);
            return null;
        }
    }

    /* renamed from: a */
    public void mo16666a(String str, String str2) {
        Editor edit = this.f25202c.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
