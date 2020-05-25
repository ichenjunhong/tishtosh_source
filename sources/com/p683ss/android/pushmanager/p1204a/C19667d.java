package com.p683ss.android.pushmanager.p1204a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.message.NotifyService;
import com.p683ss.android.message.p1191b.C19468i;
import com.p683ss.android.message.p1191b.C19470k;
import com.p683ss.android.message.sswo.SswoActivity;
import com.p683ss.android.pushmanager.C19681c;
import com.p683ss.android.pushmanager.C19698d;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.C19703i;
import com.p683ss.android.pushmanager.p1204a.C19664c.C19665a;
import com.p683ss.android.pushmanager.p1204a.C19664c.C19666b;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.aweme.lancet.I18nLancet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.a.d */
public final class C19667d implements C19665a {

    /* renamed from: c */
    protected static C19667d f54168c;

    /* renamed from: a */
    protected final Context f54169a;

    /* renamed from: b */
    protected final C19698d f54170b;

    /* renamed from: d */
    private boolean f54171d;

    /* renamed from: c */
    public final Map mo41019c() {
        return C19669e.m48060a(this);
    }

    /* renamed from: a */
    public static C19667d m48045a() {
        if (f54168c != null) {
            return f54168c;
        }
        throw new IllegalStateException("MessageData not init");
    }

    /* renamed from: b */
    public final C19698d mo41018b() {
        if (this.f54170b != null) {
            return this.f54170b;
        }
        throw new IllegalStateException("appContext not init");
    }

    /* renamed from: d */
    public final Map<String, String> mo41020d() {
        String str;
        HashMap hashMap = new HashMap();
        C19710b.m48173a();
        C19710b.m48174a((Map<String, String>) hashMap);
        HashMap hashMap2 = new HashMap();
        String str2 = (String) hashMap.get(C19703i.f54233b);
        if (!C9431p.m18664a(str2)) {
            hashMap2.put("iid", str2);
        }
        String str3 = (String) hashMap.get(C19703i.f54232a);
        if (!C9431p.m18664a(str3)) {
            hashMap2.put("device_id", str3);
        }
        String e = C9425l.m18654e(this.f54169a);
        if (!C9431p.m18664a(e)) {
            hashMap2.put("ac", e);
        }
        String d = this.f54170b.mo41050d();
        if (d != null) {
            hashMap2.put("channel", d);
        }
        hashMap2.put("aid", String.valueOf(this.f54170b.mo41049c()));
        String b = this.f54170b.mo41048b();
        if (b != null) {
            hashMap2.put("app_name", b);
        }
        hashMap2.put("version_code", String.valueOf(this.f54170b.mo41052f()));
        hashMap2.put("version_name", this.f54170b.mo41051e());
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("language", Locale.getDefault().getLanguage());
        hashMap2.put("os_api", String.valueOf(VERSION.SDK_INT));
        try {
            String str4 = VERSION.RELEASE;
            if (str4 != null && str4.length() > 10) {
                str4 = str4.substring(0, 10);
            }
            hashMap2.put("os_version", str4);
        } catch (Exception unused) {
        }
        String str5 = (String) hashMap.get(C19703i.f54235d);
        if (!C9431p.m18664a(str5)) {
            hashMap2.put("openudid", str5);
        }
        int d2 = C9432q.m18694d(this.f54169a);
        if (d2 > 0) {
            hashMap2.put("dpi", String.valueOf(d2));
        }
        String str6 = "rom";
        if (!TextUtils.isEmpty(I18nLancet.f52269a)) {
            str = I18nLancet.f52269a;
        } else {
            str = C19470k.m47655b();
            I18nLancet.f52269a = str;
        }
        hashMap2.put(str6, str);
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f54169a.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!C9431p.m18664a(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!C9431p.m18664a(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        String str7 = "country";
        try {
            C19700f.m48127b();
            hashMap2.put(str7, C19681c.m48081c());
            C19700f.m48127b();
            hashMap2.putAll(new HashMap());
            hashMap2.put("rom_version", C19468i.f53791a);
        } catch (Exception unused2) {
        }
        return hashMap2;
    }

    public C19667d(final C19698d dVar) {
        this.f54170b = dVar;
        this.f54169a = dVar.mo41047a();
        C19664c.f54166a = this;
        C19664c.f54167b = new C19666b() {
            /* renamed from: a */
            public final C19698d mo41009a() {
                return dVar;
            }

            /* renamed from: b */
            public final Class mo41011b() {
                return NotifyService.class;
            }

            /* renamed from: c */
            public final String mo41012c() {
                return "message_data";
            }

            /* renamed from: d */
            public final String mo41013d() {
                return "com.ss.android.message";
            }

            /* renamed from: g */
            public final boolean mo41016g() {
                return SswoActivity.m47728a();
            }

            /* renamed from: h */
            public final Map<String, String> mo41017h() {
                return C19667d.this.mo41019c();
            }

            /* renamed from: e */
            public final String mo41014e() {
                return C19700f.m48124a().mo41053a();
            }

            /* renamed from: f */
            public final String mo41015f() {
                if (!TextUtils.isEmpty(I18nLancet.f52269a)) {
                    return I18nLancet.f52269a;
                }
                String b = C19470k.m47655b();
                I18nLancet.f52269a = b;
                return b;
            }

            /* renamed from: a */
            public final void mo41010a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                C19700f.m48124a().mo41056a(context, str, str2, str3, j, j2, jSONObject);
            }
        };
    }

    /* renamed from: a */
    public static void m48046a(C19667d dVar) {
        if (f54168c == null) {
            f54168c = dVar;
            return;
        }
        throw new IllegalStateException("MessageData already inited");
    }

    /* renamed from: a */
    public final void mo41008a(Context context) {
        if (!this.f54171d) {
            try {
                C19408a.m47501a((Application) context.getApplicationContext());
                this.f54171d = true;
            } catch (Exception unused) {
            }
        }
    }
}
