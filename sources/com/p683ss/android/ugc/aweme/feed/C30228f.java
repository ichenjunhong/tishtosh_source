package com.p683ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p683ss.android.ugc.aweme.location.C36285u;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.f */
public final class C30228f {

    /* renamed from: a */
    public static CityBean f78953a;

    /* renamed from: i */
    static Keva m70985i() {
        return Keva.getRepo("SelectOldCities");
    }

    /* renamed from: a */
    public static String m70974a() {
        String j = m70986j();
        if (TextUtils.isEmpty(j)) {
            return m70987k();
        }
        return j;
    }

    /* renamed from: b */
    public static String m70977b() {
        String c = m70979c();
        if (TextUtils.isEmpty(c)) {
            return m70982f();
        }
        return c;
    }

    /* renamed from: g */
    public static String m70983g() {
        String c = m70979c();
        if (TextUtils.isEmpty(c)) {
            return m70982f();
        }
        return c;
    }

    /* renamed from: j */
    private static String m70986j() {
        CityBean cityBean;
        try {
            cityBean = (CityBean) C47760cd.m103384a(m70975a(""), CityBean.class);
        } catch (Exception unused) {
            cityBean = null;
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.name;
    }

    /* renamed from: d */
    public static CityBean m70980d() {
        try {
            return (CityBean) C47760cd.m103384a(m70975a(""), CityBean.class);
        } catch (Exception e) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("poi_class_code", C23198ae.f61671a);
            StringBuilder sb = new StringBuilder("getSelectCity:");
            sb.append(e.getMessage());
            a.mo47824a("err_msg", sb.toString());
            m70976a(a.mo47825b());
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m70984h() {
        if (!C36285u.m81919a(C11010c.m22280a())) {
            return false;
        }
        String f = m70982f();
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        String c = m70979c();
        if (TextUtils.isEmpty(c)) {
            return true;
        }
        return TextUtils.equals(c, f);
    }

    /* renamed from: c */
    public static String m70979c() {
        CityBean cityBean;
        try {
            cityBean = (CityBean) C47760cd.m103384a(m70975a(""), CityBean.class);
        } catch (Exception e) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("poi_class_code", C23198ae.f61671a);
            StringBuilder sb = new StringBuilder("getSelectCityCode:");
            sb.append(e.getMessage());
            a.mo47824a("err_msg", sb.toString());
            m70976a(a.mo47825b());
            cityBean = null;
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.code;
    }

    /* renamed from: e */
    public static CityBean m70981e() {
        CityBean cityBean;
        if (f78953a != null) {
            CityBean cityBean2 = f78953a;
            f78953a = null;
            return cityBean2;
        }
        try {
            cityBean = (CityBean) C47760cd.m103384a(m70978b(""), CityBean.class);
        } catch (Exception e) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("poi_class_code", C23198ae.f61671a);
            StringBuilder sb = new StringBuilder("getCurrentCity:");
            sb.append(e.getMessage());
            a.mo47824a("err_msg", sb.toString());
            m70976a(a.mo47825b());
            cityBean = null;
        }
        return cityBean;
    }

    /* renamed from: f */
    public static String m70982f() {
        CityBean cityBean;
        try {
            cityBean = (CityBean) C47760cd.m103384a(m70978b(""), CityBean.class);
        } catch (Exception e) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("poi_class_code", C23198ae.f61671a);
            StringBuilder sb = new StringBuilder("getCurrentCityCode:");
            sb.append(e.getMessage());
            a.mo47824a("err_msg", sb.toString());
            m70976a(a.mo47825b());
            cityBean = null;
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.code;
    }

    /* renamed from: k */
    private static String m70987k() {
        CityBean cityBean;
        try {
            cityBean = (CityBean) C47760cd.m103384a(m70978b(""), CityBean.class);
        } catch (Exception e) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("poi_class_code", C23198ae.f61671a);
            StringBuilder sb = new StringBuilder("getCurrentCityCode:");
            sb.append(e.getMessage());
            a.mo47824a("err_msg", sb.toString());
            m70976a(a.mo47825b());
            cityBean = null;
        }
        if (cityBean == null) {
            return "";
        }
        return cityBean.name;
    }

    /* renamed from: a */
    public static void m70976a(JSONObject jSONObject) {
        C23131p.m56692a("poi_log", "poi_city", jSONObject);
    }

    /* renamed from: a */
    private static String m70975a(String str) {
        return m70985i().getString("select_city", str);
    }

    /* renamed from: b */
    private static String m70978b(String str) {
        return m70985i().getString("current_city", str);
    }
}
