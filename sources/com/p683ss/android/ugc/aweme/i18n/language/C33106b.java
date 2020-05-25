package com.p683ss.android.ugc.aweme.i18n.language;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.language.C35834e;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b */
public final class C33106b {
    /* renamed from: a */
    public static Locale m76103a() {
        return m76104a(C11010c.m22280a());
    }

    /* renamed from: b */
    public static String m76108b() {
        String b = m76110b("key_current_locale", "");
        if (TextUtils.isEmpty(b)) {
            return "en";
        }
        return b;
    }

    /* renamed from: a */
    public static Locale m76104a(Context context) {
        return m76105a((String) null, (String) null, context);
    }

    /* renamed from: d */
    private static SharedPreferences m76113d(Context context) {
        return C35807d.m80935a(context, "key_language_sp_key", 0);
    }

    /* renamed from: c */
    public static String m76112c(Context context) {
        return I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(context).mo70126f();
    }

    /* renamed from: b */
    public static void m76111b(Context context) {
        if (context == null) {
            context = C11010c.m22280a();
        }
        C33102c.m76090a(context, m76104a(context), false, null);
    }

    /* renamed from: a */
    public static void m76107a(String str, String str2) {
        m76113d(C11010c.m22280a()).edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    public static String m76110b(String str, String str2) {
        return m76113d(C11010c.m22280a()).getString(str, str2);
    }

    /* renamed from: b */
    public static String m76109b(Context context, String str, String str2) {
        return m76113d(context).getString(str, str2);
    }

    /* renamed from: a */
    public static void m76106a(Context context, String str, String str2) {
        m76113d(context).edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    public static Locale m76105a(String str, String str2, Context context) {
        Locale locale = Locale.getDefault();
        if (str2 == null) {
            if (context == null) {
                str2 = "";
            } else {
                str2 = m76109b(context, "pref_language_key", "");
            }
        }
        if (str == null) {
            str = m76110b("key_current_locale", "");
            if (TextUtils.isEmpty(str)) {
                String country = locale.getCountry();
                String language = locale.getLanguage();
                if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, language)) {
                    str2 = language;
                } else if (TextUtils.equals(str2, "zh-Hant") || TextUtils.equals(str2, "zh")) {
                    m76107a("key_current_locale", "zh-Hant-TW");
                    str = "zh-Hant-TW";
                } else if (TextUtils.equals(str2, "in")) {
                    m76107a("key_current_locale", "id-ID");
                    str = "id-ID";
                } else if (TextUtils.equals(str2, "iw")) {
                    m76107a("key_current_locale", "he-IL");
                    str = "he-IL";
                } else {
                    country = "";
                }
                if (!C33102c.m76094a(locale, Locale.SIMPLIFIED_CHINESE)) {
                    if (!TextUtils.equals("in", str2)) {
                        if (!TextUtils.equals("iw", str2)) {
                            Iterator it = C33098b.m76080a().f85923b.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    m76107a("key_current_locale", "en");
                                    str = "en";
                                    break;
                                }
                                C35834e eVar = (C35834e) it.next();
                                if (!TextUtils.isEmpty(eVar.mo70123c().getCountry())) {
                                    if (!TextUtils.equals("zh-Hant", str2) && !TextUtils.equals("zh", str2) && !TextUtils.equals("zh_TW", str2)) {
                                        if (TextUtils.equals(str2, eVar.mo70123c().getLanguage()) && TextUtils.equals(country, eVar.mo70123c().getCountry())) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str2);
                                            sb.append("-");
                                            sb.append(country);
                                            m76107a("key_current_locale", sb.toString());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str2);
                                            sb2.append("-");
                                            sb2.append(country);
                                            str = sb2.toString();
                                            break;
                                        } else if (TextUtils.equals(str2, eVar.mo70123c().getLanguage())) {
                                            m76107a("key_current_locale", eVar.mo70121a());
                                            str = eVar.mo70121a();
                                            break;
                                        }
                                    } else {
                                        m76107a("key_current_locale", "zh-Hant-TW");
                                        str = "zh-Hant-TW";
                                    }
                                } else if (TextUtils.equals(str2, eVar.mo70123c().getLanguage())) {
                                    m76107a("key_current_locale", str2);
                                    str = str2;
                                    break;
                                }
                            }
                        } else {
                            m76107a("key_current_locale", "he-IL");
                            str = "he-IL";
                        }
                    } else {
                        m76107a("key_current_locale", "id-ID");
                        str = "id-ID";
                    }
                } else {
                    str = "en";
                }
            }
        }
        try {
            Locale locale2 = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getLocale(str);
            if (locale2 != null) {
                return locale2;
            }
            return locale;
        } catch (Throwable unused) {
        }
    }
}
