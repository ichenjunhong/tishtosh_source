package com.p683ss.android.ugc.aweme.language;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1060c.C17530ab;
import com.google.p1057b.p1060c.C17666bt;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1987n.C37731a;
import com.p683ss.android.ugc.aweme.p1987n.C37734b;
import com.p683ss.android.ugc.aweme.setting.AppCurrentRegionSetting;
import com.p683ss.android.ugc.aweme.setting.TikTokRegionList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.language.h */
public class C35837h {

    /* renamed from: a */
    static List<String> f92011a = Arrays.asList(new String[]{"JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN"});

    /* renamed from: b */
    private static Set<String> f92012b = new HashSet();

    /* renamed from: c */
    private static Set<String> f92013c = new HashSet();

    /* renamed from: d */
    private static volatile String f92014d = "";

    /* renamed from: e */
    private static volatile List<String> f92015e;

    /* renamed from: f */
    private static HashSet<String> f92016f;

    /* renamed from: g */
    private static Resources f92017g = null;

    /* renamed from: com.ss.android.ugc.aweme.language.h$a */
    public interface C35838a {
        /* renamed from: a */
        void mo74497a(String str);
    }

    /* renamed from: b */
    public static boolean m80977b() {
        return m80984i().contains(m80973a());
    }

    /* renamed from: d */
    public static boolean m80979d() {
        return "IN".equalsIgnoreCase(m80980e());
    }

    /* renamed from: g */
    public static final boolean m80982g() {
        if (Locale.JAPAN.getCountry() == null || !Locale.JAPAN.getCountry().equalsIgnoreCase(m80980e())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final String m80980e() {
        String f = m80981f();
        if (TextUtils.isEmpty(f)) {
            f = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysRegion();
            if (TextUtils.isEmpty(f)) {
                f = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getRegion();
            }
        }
        if (TextUtils.isEmpty(f)) {
            f = "";
        }
        return f.toUpperCase();
    }

    /* renamed from: a */
    public static String m80973a() {
        if (!TextUtils.isEmpty(f92014d)) {
            return f92014d;
        }
        synchronized (C35837h.class) {
            if (TextUtils.isEmpty(f92014d)) {
                f92014d = C10193n.m20607a().mo18203a(AppCurrentRegionSetting.class, "priority_region", C10181b.m20511a().mo18175c().getPriorityRegion(), "");
            }
            if (TextUtils.isEmpty(f92014d)) {
                f92014d = m80983h();
            }
        }
        return f92014d;
    }

    /* renamed from: c */
    public static Map<String, String> m80978c() {
        if (!C35833d.m80963a()) {
            return null;
        }
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "test_setting", 0);
        HashMap hashMap = new HashMap();
        String string = a.getString("pref_province_name", "");
        if (!TextUtils.isEmpty(string)) {
            hashMap.put("province_name", string);
        }
        String string2 = a.getString("pref_province_id", "");
        if (!TextUtils.isEmpty(string2)) {
            hashMap.put("province_id", string2);
        }
        String string3 = a.getString("pref_city_name", "");
        if (!TextUtils.isEmpty(string3)) {
            hashMap.put("city_name", string3);
        }
        String string4 = a.getString("pref_city_id", "");
        if (!TextUtils.isEmpty(string4)) {
            hashMap.put("city_id", string4);
        }
        return hashMap;
    }

    /* renamed from: f */
    public static final String m80981f() {
        if (C35833d.m80963a()) {
            String string = C35807d.m80935a(C11010c.m22280a(), "test_setting", 0).getString("pref_carrier", "US");
            C52711k.m112240b(C35840j.class, "clazz");
            C52711k.m112240b(String.class, "dataClass");
            String str = string;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        String str2 = "";
        try {
            str2 = ((TelephonyManager) C11010c.m22280a().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.toUpperCase();
        }
        return str2;
    }

    /* renamed from: h */
    private static final String m80983h() {
        String f = m80981f();
        if (TextUtils.isEmpty(f)) {
            String networkOperatorCode = NetworkUtils.getNetworkOperatorCode(C11010c.m22280a());
            try {
                if (!TextUtils.isEmpty(networkOperatorCode) && !networkOperatorCode.equals("unkown") && networkOperatorCode.length() >= 3) {
                    f = (String) C37734b.f96155a.get(Integer.valueOf(Integer.parseInt(networkOperatorCode.substring(0, 3))));
                }
            } catch (NumberFormatException unused) {
            }
            if (TextUtils.isEmpty(f)) {
                f = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysRegion();
                if (TextUtils.isEmpty(f)) {
                    f = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getRegion();
                }
            }
        }
        if (TextUtils.isEmpty(f)) {
            f = "";
        }
        return f.toUpperCase();
    }

    /* renamed from: i */
    private static List<String> m80984i() {
        if (f92015e != null && f92015e.size() > 0) {
            return f92015e;
        }
        synchronized (C35837h.class) {
            if (f92015e == null || f92015e.size() <= 0) {
                f92015e = new ArrayList();
                if (!TextUtils.isEmpty(C10193n.m20607a().mo18203a(TikTokRegionList.class, "tt_regions", C10181b.m20511a().mo18175c().getTtRegions(), ""))) {
                    f92015e.addAll(Arrays.asList(C10193n.m20607a().mo18203a(TikTokRegionList.class, "tt_regions", C10181b.m20511a().mo18175c().getTtRegions(), "").split(",")));
                } else {
                    f92015e.addAll(f92011a);
                }
            }
        }
        return f92015e;
    }

    static {
        f92012b.add("TW");
        f92012b.add("JP");
        f92012b.add("KR");
        f92012b.add("ID");
        f92012b.add("VN");
        f92012b.add("PH");
        f92012b.add("MY");
        f92012b.add("LA");
        f92012b.add("MM");
        f92012b.add("KH");
        f92012b.add("MO");
        f92012b.add("SG");
        f92012b.add("HK");
        f92012b.add("TH");
        f92012b.add("AU");
        f92012b.add("NZ");
        f92012b.add("SA");
        f92012b.add("AE");
        f92012b.add("KW");
        f92012b.add("BH");
        f92012b.add("QA");
        f92012b.add("OM");
        f92012b.add("MA");
        f92012b.add("DZ");
        f92012b.add("TN");
        f92012b.add("EG");
        f92012b.add("LB");
        f92012b.add("IQ");
        f92012b.add("JO");
        f92012b.add("SD");
        f92012b.add("DJ");
        f92012b.add("LY");
        f92012b.add("PS");
        f92012b.add("SY");
        f92012b.add("YE");
        f92012b.add("SO");
        f92012b.add("MR");
        f92012b.add("KM");
        f92012b.add("CZ");
        f92012b.add("RO");
        f92012b.add("HU");
        f92012b.add("SK");
        f92012b.add("SI");
        f92012b.add("HR");
        f92012b.add("BG");
        f92012b.add("ZA");
        f92012b.add("NG");
        f92012b.add("KE");
        f92012b.add("ET");
        f92012b.add("TZ");
        f92012b.add("UG");
        f92012b.add("GH");
        f92012b.add("SN");
        f92013c.add("BR");
        f92013c.add("US");
        f92013c.add("IN");
        f92013c.add("RU");
        f92013c.add("GB");
        f92013c.add("PT");
        f92013c.add("ES");
        f92013c.add("AU");
        f92013c.add("IT");
        f92013c.add("MX");
        f92013c.add("TR");
        f92013c.add("CA");
        f92013c.add("DE");
        f92013c.add("AR");
        f92013c.add("MN");
        f92013c.add("SA");
        f92013c.add("CO");
        f92013c.add("PL");
        f92013c.add("SE");
        f92013c.add("NO");
        f92013c.add("DK");
        f92013c.add("RO");
        f92013c.add("CZ");
        f92013c.add("FR");
        f92013c.add("NL");
        f92013c.add("BE");
        f92013c.add("IE");
        f92013c.add("LK");
        f92013c.add("PK");
        f92013c.add("BD");
        f92013c.add("TR");
        f92013c.add("EG");
        f92013c.add("AE");
        f92013c.add("KW");
        f92013c.add("MA");
        f92013c.add("DZ");
        f92013c.add("ZA");
        f92013c.addAll(f92012b);
        HashSet<String> hashSet = new HashSet<>();
        f92016f = hashSet;
        hashSet.add("EG");
        f92016f.add("SD");
        f92016f.add("DZ");
        f92016f.add("MA");
        f92016f.add("IQ");
        f92016f.add("SA");
        f92016f.add("YE");
        f92016f.add("SY");
        f92016f.add("TD");
        f92016f.add("TN");
        f92016f.add("SO");
        f92016f.add("LY");
        f92016f.add("JO");
        f92016f.add("ER");
        f92016f.add("AE");
        f92016f.add("LB");
        f92016f.add("MR");
        f92016f.add("KW");
        f92016f.add("OM");
        f92016f.add("QA");
        f92016f.add("DJ");
        f92016f.add("BH");
        f92016f.add("KM");
    }

    /* renamed from: a */
    private static String m80974a(Context context, int i) {
        Resources a = m80972a(context.getApplicationContext().getPackageManager(), context.getPackageName(), new Locale("zh", "CN"));
        if (a == null) {
            return "";
        }
        try {
            return a.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static Resources m80972a(PackageManager packageManager, String str, Locale locale) {
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
            f92017g = resourcesForApplication;
            Configuration configuration = resourcesForApplication.getConfiguration();
            configuration.locale = locale;
            resourcesForApplication.updateConfiguration(configuration, null);
        } catch (NameNotFoundException unused) {
        }
        return f92017g;
    }

    /* renamed from: a */
    public static void m80975a(Activity activity, String str, C35838a aVar) {
        String str2;
        HashMap hashMap = new HashMap();
        C17666bt it = ((C17530ab) C37731a.f96147g.getValue()).iterator();
        while (it.hasNext()) {
            C37731a aVar2 = (C37731a) it.next();
            if (aVar2 != null) {
                hashMap.put(aVar2.f96151c, m80974a(activity, aVar2.f96149a));
            }
        }
        ArrayList arrayList = new ArrayList();
        C35841k kVar = null;
        ArrayList<String> arrayList2 = new ArrayList<>(f92013c);
        Collections.sort(arrayList2);
        for (String str3 : arrayList2) {
            if (hashMap.get(str3) == null) {
                str2 = "";
            } else {
                str2 = (String) hashMap.get(str3);
            }
            C35841k kVar2 = new C35841k(str2, str3);
            arrayList.add(kVar2);
            if (str3.equalsIgnoreCase(str)) {
                kVar = kVar2;
            }
        }
        C35843m mVar = new C35843m(activity, arrayList, kVar);
        mVar.f92034k = new C35839i(activity, aVar);
        mVar.show();
    }

    /* renamed from: a */
    public static void m80976a(Context context, String str, C35841k kVar, C35841k kVar2) {
        SharedPreferences a = C35807d.m80935a(context, "test_setting", 0);
        a.edit().putString("pref_carrier", str).apply();
        if (kVar == null) {
            a.edit().putString("pref_province_id", "").apply();
            a.edit().putString("pref_province_name", "").apply();
        } else {
            a.edit().putString("pref_province_id", kVar.f92021b).apply();
            a.edit().putString("pref_province_name", kVar.f92020a).apply();
        }
        if (kVar2 == null) {
            a.edit().putString("pref_city_id", "").apply();
            a.edit().putString("pref_city_name", "").apply();
            return;
        }
        a.edit().putString("pref_city_id", kVar2.f92021b).apply();
        a.edit().putString("pref_city_name", kVar2.f92020a).apply();
    }
}
