package com.bytedance.android.live.core.p223b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.b.b */
public final class C3830b {

    /* renamed from: a */
    private static Map<String, String> f10808a;

    static {
        HashMap hashMap = new HashMap();
        f10808a = hashMap;
        hashMap.put("ar", "ar");
        f10808a.put("bn_in", "bn-IN");
        f10808a.put("en", "en");
        f10808a.put("es", "es");
        f10808a.put("fr_fr", "fr");
        f10808a.put("gu_in", "gu-IN");
        f10808a.put("hi_in", "hi-IN");
        f10808a.put("ja_jp", "ja-JP");
        f10808a.put("kn_in", "kn-IN");
        f10808a.put("ko_kr", "ko-KR");
        f10808a.put("ml_in", "ml-IN");
        f10808a.put("mr_in", "mr-IN");
        f10808a.put("ms", "ms-MY");
        f10808a.put("or_in", "or-IN");
        f10808a.put("pa_in", "pa-IN");
        f10808a.put("pt_br", "pt-BR");
        f10808a.put("pt_pt", "pt-BR");
        f10808a.put("ru_ru", "ru-RU");
        f10808a.put("ta_in", "ta-IN");
        f10808a.put("te_in", "te-IN");
        f10808a.put("th_th", "th-TH");
        f10808a.put("vi_vn", "vi-VN");
        f10808a.put("zh_cn", "zh-hans-CN");
        f10808a.put("de", "de-de");
        f10808a.put("id", "id-ID");
        f10808a.put("it", "it-IT");
        f10808a.put("tr", "tr-TR");
    }

    /* renamed from: a */
    public static String m9703a(Locale locale) {
        if ("tiktokI18n".equals("i18nVigo")) {
            String lowerCase = locale.toString().toLowerCase();
            String lowerCase2 = locale.getLanguage().toLowerCase();
            if (f10808a.containsKey(lowerCase)) {
                return (String) f10808a.get(lowerCase);
            }
            if (f10808a.containsKey(lowerCase2)) {
                return (String) f10808a.get(lowerCase2);
            }
            if (TextUtils.isEmpty(locale.getCountry())) {
                return lowerCase2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append("-");
            sb.append(locale.getCountry());
            return sb.toString();
        }
        if (locale == null || locale.getLanguage() == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (language.equals("ml") || language.equals("pa") || language.equals("gu") || language.equals("bh") || language.equals("bn") || language.equals("mr")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(language);
            sb2.append("-IN");
            return sb2.toString();
        } else if (language.equals("pt")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(language);
            sb3.append("-BR");
            return sb3.toString();
        } else if (language.equals("sv")) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(language);
            sb4.append("-SE");
            return sb4.toString();
        } else if (language.equals("zh") && !TextUtils.equals(country, "CN")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(language);
            sb5.append("-TW");
            return sb5.toString();
        } else if (!language.equals("es") || !TextUtils.equals(country, "US")) {
            return language;
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(language);
            sb6.append("-US");
            return sb6.toString();
        }
    }
}
