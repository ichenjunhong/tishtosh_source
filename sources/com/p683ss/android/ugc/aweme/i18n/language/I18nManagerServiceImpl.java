package com.p683ss.android.ugc.aweme.i18n.language;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9425l;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.utils.C23726m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26387am;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26387am.C26388a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.i18n.p1804a.C33094c;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.trill.language.C50350i;
import com.p683ss.android.ugc.trill.language.C50350i.C50351a;
import com.p683ss.android.ugc.trill.p2520e.C50320c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl */
public class I18nManagerServiceImpl implements I18nManagerService {
    public String getRNLanguage() {
        return null;
    }

    public int[] getZipBeautyFaceResIds() {
        return null;
    }

    public void switchLanguage(String str, Context context) {
    }

    public Map<String, C35834e> getLocaleMap() {
        return C33098b.m76080a().f85923b;
    }

    public String getSimCountry() {
        return C35837h.m80981f();
    }

    public String getSysRegion() {
        return C33098b.m76082c();
    }

    public String getAppLanguage() {
        return C33098b.m76080a().mo70131b();
    }

    public String getAppLogRegion() {
        return C33106b.m76110b("key_current_region", C33106b.m76103a().getCountry());
    }

    public List<C35834e> getI18nItems() {
        return new ArrayList(C33098b.m76080a().f85923b.values());
    }

    public String getSysLanguage() {
        C33098b.m76080a();
        return C33098b.m76081a(Locale.getDefault());
    }

    public static I18nManagerService createI18nManagerServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(I18nManagerService.class);
        if (a != null) {
            return (I18nManagerService) a;
        }
        return new I18nManagerServiceImpl();
    }

    public Locale getCountryLocale() {
        return new Locale(C33098b.m76080a().mo70128a(C11010c.m22280a()).mo70122b(), C35837h.m80980e());
    }

    public boolean isIndonesiaByMcc() {
        String str = (String) C33094c.f85912a.mo70100b();
        if (TextUtils.isEmpty(str) || !str.startsWith("510")) {
            return false;
        }
        return true;
    }

    public boolean isKorean() {
        return TextUtils.equals(C33098b.m76080a().mo70128a(C11010c.m22280a()).mo70123c().getCountry(), "KR");
    }

    public String getRegion() {
        C33098b.m76080a();
        if (!TextUtils.isEmpty(C33106b.m76110b("key_current_region", C33098b.m76082c()))) {
            return C33106b.m76110b("key_current_region", C33098b.m76082c());
        }
        return C33098b.m76082c();
    }

    public void installCommonParams() {
        NetUtil.setExtraparams(new C33096a(this));
        NetUtil.addCustomParams("mcc_mnc", C23726m.m58235a());
        NetUtil.addCustomParams("app_type", C31483a.f82385b);
        NetUtil.addCustomParams("timezone_name", TimeZone.getDefault().getID());
        NetUtil.addCustomParams("current_region", (String) SharePrefCache.inst().getUserCurrentRegion().mo47782d());
        NetUtil.addCustomParams("residence", (String) SharePrefCache.inst().getUserResidence().mo47782d());
        NetUtil.addCustomParams("carrier_region_v2", (String) C50320c.f126206a.mo98226b());
        NetUtil.addCustomParams("sys_region", getSysRegion());
        NetUtil.addCustomParams("language", getSysLanguage());
        NetUtil.addCustomParams("app_skin", "white");
        if (!((Boolean) SharePrefCache.inst().getTTRegion().mo47782d()).booleanValue()) {
            NetUtil.addCustomParams("pass-region", "1");
        }
        if (!((Boolean) SharePrefCache.inst().getTTRoute().mo47782d()).booleanValue()) {
            NetUtil.addCustomParams("pass-route", "1");
        }
        User curUser = C20902b.m53242a().getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (accountRegion != null && !accountRegion.isEmpty()) {
                NetUtil.addCustomParams("account_region", accountRegion);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ HashMap lambda$installCommonParams$0$I18nManagerServiceImpl() {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_language", getAppLanguage());
        String str2 = "uoo";
        int i = 0;
        if (C26387am.f69614d.compareAndSet(false, true)) {
            C26387am.f69612b = !C26540w.m64209a(C11010c.m22280a());
        }
        if (C26387am.f69612b) {
            z = true;
        } else {
            if (C26387am.f69613c.compareAndSet(false, true)) {
                C0013i.m16a((Callable<TResult>) C26388a.f69616a);
            }
            z = C26387am.f69611a;
        }
        if (z) {
            i = 1;
        }
        hashMap.put(str2, String.valueOf(i));
        hashMap.put("build_number", C11010c.m22294o());
        hashMap.put("locale", C33106b.m76108b());
        hashMap.put("timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
        hashMap.put("carrier_region", C35837h.m80981f());
        hashMap.put("region", getRegion());
        hashMap.put("op_region", C35837h.m80973a());
        hashMap.put("ts", String.valueOf(NetworkUtils.getServerTime()));
        Map c = C35837h.m80978c();
        if (LarkSsoHelper.m81944a() && c != null && c.size() > 0) {
            hashMap.putAll(c);
        }
        hashMap.put("ac2", String.valueOf(C9425l.m18653d(C11010c.m22280a())));
        String str3 = "content_language";
        C50350i a = C50351a.m108630a();
        C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
        if (C47549c.m102978c()) {
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf userAddLanguages = inst.getUserAddLanguages();
            C52711k.m112236a((Object) userAddLanguages, "SharePrefCache.inst().userAddLanguages");
            Object d = userAddLanguages.mo47782d();
            C52711k.m112236a(d, "SharePrefCache.inst().userAddLanguages.cache");
            str = (String) d;
        } else {
            str = a.f126264a.mo75727c();
        }
        hashMap.put(str3, str);
        return hashMap;
    }

    public String getLanguage(Locale locale) {
        return C33098b.m76081a(locale);
    }

    public C35834e getCurrentI18nItem(Context context) {
        return C33098b.m76080a().mo70128a(context);
    }

    public Locale getLocale(String str) {
        return C33098b.m76080a().mo70129a(str);
    }

    public boolean isArabicLang(Context context) {
        String str;
        if (context == null) {
            str = "";
        } else {
            str = C33106b.m76109b(context, "pref_language_key", "");
        }
        if (TextUtils.isEmpty(str)) {
            str = Locale.getDefault().getLanguage();
        }
        return "ar".equals(str);
    }
}
