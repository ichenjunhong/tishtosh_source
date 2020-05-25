package com.p683ss.android.ugc.aweme.p1308ad.common;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Process;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ad.common.a */
public class C22381a {

    /* renamed from: a */
    private static final String f60278a = "a";

    /* renamed from: b */
    private static C22381a f60279b;

    /* renamed from: c */
    private static ContentResolver f60280c;

    /* renamed from: d */
    private static HashMap<String, String> f60281d;

    /* renamed from: e */
    private String f60282e;

    /* renamed from: f */
    private SharedPreferences f60283f;

    /* renamed from: g */
    private String f60284g;

    /* renamed from: h */
    private String f60285h;

    /* renamed from: c */
    private String m55388c() {
        if (this.f60285h == null) {
            this.f60285h = "content://com.ss.android.ugc.aweme.ad_impl.helpers.sharedPref.MainSharedPrefProvider/";
        }
        return this.f60285h;
    }

    /* renamed from: a */
    public static synchronized C22381a m55385a() {
        C22381a aVar;
        synchronized (C22381a.class) {
            if (f60279b == null) {
                f60279b = new C22381a();
            }
            aVar = f60279b;
        }
        return aVar;
    }

    private C22381a() {
        HashMap<String, String> hashMap = new HashMap<>();
        f60281d = hashMap;
        hashMap.put("com.ss.android.ugc.aweme.ad_impl", "main_settings");
        f60281d.put("com.ss.android.ugc.aweme.ad_impl:remote", "remote_settings");
        f60281d.put("com.ss.android.ugc.aweme.ad_impl:nice_service", "service_settings");
        f60280c = C11010c.m22280a().getContentResolver();
    }

    /* renamed from: b */
    private synchronized SharedPreferences m55387b() {
        String str;
        if (this.f60284g == null || this.f60284g.length() == 0) {
            if (this.f60282e == null || this.f60282e.length() == 0) {
                ActivityManager activityManager = (ActivityManager) C11010c.m22280a().getSystemService("activity");
                if (activityManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    int myPid = Process.myPid();
                    if (runningAppProcesses != null) {
                        int i = 0;
                        while (true) {
                            if (i >= runningAppProcesses.size()) {
                                break;
                            } else if (((RunningAppProcessInfo) runningAppProcesses.get(i)).pid == myPid) {
                                str = ((RunningAppProcessInfo) runningAppProcesses.get(i)).processName;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                str = "com.ss.android.ugc.aweme.ad_impl";
                this.f60282e = str;
            }
            if (f60281d.containsKey(this.f60282e)) {
                this.f60284g = (String) f60281d.get(this.f60282e);
            } else {
                this.f60284g = "main_settings";
            }
        }
        return C35807d.m80935a(C11010c.m22280a(), this.f60284g, 0);
    }

    /* renamed from: a */
    private static boolean m55386a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (String equals : C22382b.f60286a) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo46604a(String str, int i) {
        int i2;
        if (m55386a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(m55388c());
            sb.append(str);
            String type = f60280c.getType(Uri.parse(sb.toString()));
            if (type == null) {
                return -1;
            }
            try {
                i2 = Integer.parseInt(type);
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            return i2;
        }
        this.f60283f = m55387b();
        return this.f60283f.getInt(str, -1);
    }

    /* renamed from: b */
    public final void mo46605b(String str, int i) {
        if (m55386a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(m55388c());
            sb.append(str);
            Uri parse = Uri.parse(sb.toString());
            ContentValues contentValues = new ContentValues();
            contentValues.put(str, String.valueOf(i));
            f60280c.insert(parse, contentValues);
            return;
        }
        this.f60283f = m55387b();
        SharedPreferences sharedPreferences = this.f60283f;
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
                return;
            }
            edit.commit();
        }
    }
}
