package com.p683ss.android.p1162e;

import android.content.Context;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.e.b */
public final class C19140b {

    /* renamed from: a */
    public static Context f52739a;

    /* renamed from: c */
    private static C19142c<C19140b> f52740c = new C19142c<C19140b>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo22768a() {
            return new C19140b();
        }
    };

    /* renamed from: b */
    public C19139a f52741b;

    /* renamed from: a */
    private static int m46664a() {
        try {
            return C35807d.m80935a(f52739a, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).getInt("json_data", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C19140b m46665a(Context context) {
        f52739a = context.getApplicationContext();
        return (C19140b) f52740c.mo39084b();
    }

    /* renamed from: b */
    private boolean m46667b(Uri uri) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
        int a = m46664a();
        if (!booleanQueryParameter || a <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m46666a(Map<String, String> map) {
        if (this.f52741b != null) {
            this.f52741b.onEvent(map);
        }
    }

    /* renamed from: c */
    private static Map<String, String> m46668c(Uri uri) throws UnsupportedEncodingException {
        String[] split;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQuery().split("&")) {
            int indexOf = str.indexOf("=");
            linkedHashMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
        linkedHashMap.put("launchlog_protocol", uri.getScheme());
        linkedHashMap.put("launchlog_authority", uri.getAuthority());
        linkedHashMap.put("launchlog_path", uri.getPath());
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo39082a(Uri uri) {
        try {
            if (m46667b(uri)) {
                m46666a(m46668c(uri));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo39083a(String str) {
        try {
            mo39082a(Uri.parse(str));
        } catch (Exception unused) {
        }
    }
}
