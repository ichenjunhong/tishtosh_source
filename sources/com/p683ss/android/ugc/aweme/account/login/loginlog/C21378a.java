package com.p683ss.android.ugc.aweme.account.login.loginlog;

import android.webkit.CookieManager;
import com.alibaba.fastjson.JSONObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.LogManager;

/* renamed from: com.ss.android.ugc.aweme.account.login.loginlog.a */
public final class C21378a {

    /* renamed from: b */
    private static C21378a f58035b;

    /* renamed from: a */
    public ArrayList<LoginLog> f58036a = new ArrayList<>();

    /* renamed from: b */
    public final String mo45513b() {
        try {
            return JSONObject.toJSONString(this.f58036a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C21378a m53998a() {
        if (f58035b == null) {
            synchronized (LogManager.class) {
                if (f58035b == null) {
                    f58035b = new C21378a();
                }
            }
        }
        return f58035b;
    }

    /* renamed from: a */
    public static String m53999a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    /* renamed from: a */
    public final void mo45512a(String str, String str2, boolean z, String str3, String str4, String str5) {
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = str;
        loginLog.errorUrl = str2;
        loginLog.isSuccess = z;
        loginLog.platform = str3;
        loginLog.postParams = str4;
        try {
            loginLog.cookie = CookieManager.getInstance().getCookie(str2);
        } catch (Exception unused) {
            loginLog.cookie = "";
        }
        loginLog.time = m53999a(System.currentTimeMillis());
        loginLog.action = str5;
        if (this.f58036a != null) {
            this.f58036a.add(loginLog);
        }
    }
}
