package com.p683ss.android.p1103ad.splash.p1123g;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.C2240a;
import com.p683ss.android.p1103ad.splash.core.C18626e;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.C18654k;
import com.p683ss.android.p1103ad.splash.core.C18673u;
import com.p683ss.android.p1103ad.splash.core.C18674v;
import com.p683ss.android.p1103ad.splash.core.p1113b.C18586b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18608f;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18610h;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18612j;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18613k;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18617n;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.g.j */
public final class C18744j {

    /* renamed from: a */
    public static final Set<String> f51828a = new HashSet();

    /* renamed from: b */
    private static final Map<String, String> f51829b = new HashMap();

    /* renamed from: a */
    public static boolean m45717a(long j, long j2) {
        return j2 > j;
    }

    /* renamed from: a */
    public static boolean m45721a(C18673u uVar) {
        int l = uVar.mo38169l();
        return l > 0 && uVar.mo38171n() >= l;
    }

    /* renamed from: a */
    public static String m45709a(boolean z) {
        C18626e e = C18642g.m45227e();
        e.f51418a = false;
        HashMap K = C18642g.m45183K();
        if (e == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            String q = C18673u.m45399a().mo38174q();
            sb.append("/api/ad/v1/splash/stock/");
            sb.append("?_unused=0");
            sb.append(m45739j());
            sb.append(e.toString());
            if (K != null) {
                sb.append(m45708a(K));
            }
            if (z) {
                sb.append("&show_limit=1");
            } else {
                sb.append("&show_limit=0");
            }
            if (!TextUtils.isEmpty(q)) {
                sb.append(q);
            }
            int o = C18673u.m45399a().mo38172o();
            StringBuilder sb2 = new StringBuilder("发送 stock 请求，当前刷次是 ");
            sb2.append(o);
            C18735a.m45667b(sb2.toString());
            sb.append("&refresh_num=");
            sb.append(o);
            if (C18642g.m45194V() != -1) {
                sb.append("&is_cold_start=");
                sb.append(C18642g.m45194V());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m45718a(C18602b bVar) {
        if (bVar == null) {
            return false;
        }
        return bVar.mo37991m() || bVar.mo37990l();
    }

    /* renamed from: a */
    public static boolean m45719a(C18608f fVar, C18673u uVar) {
        return fVar != null && fVar.mo38008a() && m45722a(fVar.f51375d, uVar);
    }

    /* renamed from: a */
    public static boolean m45720a(C18617n nVar, C18673u uVar) {
        return nVar != null && nVar.mo38019a() && m45722a(nVar.f51405d, uVar);
    }

    /* renamed from: a */
    private static boolean m45722a(String str, C18673u uVar) {
        if (C18747l.m45742a(str)) {
            return false;
        }
        String[] strArr = {m45733d(str), m45731c(str)};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
                if (uVar.mo38160f(str)) {
                    return true;
                }
                C18586b.m44982a();
                C18586b.m44987a(str, str2);
                C18654k.m45259a();
                C18654k.m45260a(str, str2);
            }
        }
        uVar.mo38158e(str);
        return false;
    }

    /* renamed from: a */
    public static List<C18602b> m45713a(JSONArray jSONArray, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C18602b bVar = new C18602b();
                    bVar.mo37976a(optJSONObject, j, z);
                    if (!z && m45718a(bVar)) {
                        C18586b.m44982a();
                        C18586b.m44986a(bVar, "topview_boarding");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C18602b> m45714a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C18602b bVar = new C18602b();
                    bVar.mo37974a(optJSONObject);
                    if (!z) {
                        arrayList.add(bVar);
                    } else if (System.currentTimeMillis() <= bVar.mo37982e()) {
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, C18602b> m45715a(List<C18602b> list) {
        HashMap hashMap = new HashMap();
        if (C18740f.m45691a(list)) {
            return hashMap;
        }
        for (C18602b bVar : list) {
            if (!TextUtils.isEmpty(bVar.mo37989k())) {
                hashMap.put(bVar.mo37989k(), bVar);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<C18602b> m45710a(List<C18602b> list, List<C18602b> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= list.size()) {
                break;
            }
            C18602b bVar = (C18602b) list.get(i);
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            if (bVar.mo37981d() > instance.getTimeInMillis() || currentTimeMillis >= bVar.mo37982e()) {
                z = false;
            }
            if (z) {
                arrayList.add(bVar);
                C18735a.m45661a(bVar.mo37863p(), "预加载: 本地有效首刷广告");
                new StringBuilder("预加载: 本地首刷广告 ad:").append(bVar.mo37863p());
            } else {
                C18735a.m45661a(bVar.mo37863p(), "预加载：本地过期首刷广告");
                new StringBuilder("预加载: 本地首刷广告过期 ad:").append(bVar.mo37863p());
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        if (C18740f.m45691a(list2)) {
            return arrayList;
        }
        for (C18602b bVar2 : list2) {
            if (bVar2.f51341o == 1) {
                arrayList2.add(bVar2);
                C18735a.m45661a(bVar2.mo37863p(), "预加载: 拉取到首刷广告");
                new StringBuilder("预加载: 拉取首刷广告 ad:").append(bVar2.mo37863p());
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public static <E extends C18613k> List<C18602b> m45711a(Map<String, C18602b> map, List<E> list) {
        ArrayList arrayList = new ArrayList();
        if (C18740f.m45691a(list) || map == null) {
            return arrayList;
        }
        for (E e : list) {
            C18602b bVar = (C18602b) map.get(e.mo37971G());
            if (bVar != null) {
                if (e instanceof C18612j) {
                    bVar.f51333g = ((C18612j) e).f51388a;
                    bVar.f51347u = true;
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C18613k> m45712a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C18613k(optString));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m45716a(int i, boolean z) {
        int i2;
        switch (i) {
            case 0:
                if (!z) {
                    i2 = 1;
                    break;
                } else {
                    i2 = 2;
                    break;
                }
            case 1:
            case 2:
                if (!z) {
                    i2 = 4;
                    break;
                } else {
                    i2 = 8;
                    break;
                }
            default:
                i2 = 0;
                break;
        }
        return (i2 & C18642g.m45218ah()) > 0;
    }

    /* renamed from: a */
    public static int m45701a() {
        int h = m45737h();
        if (h <= 0) {
            return m45738i();
        }
        return h;
    }

    /* renamed from: h */
    private static int m45737h() {
        return (int) C18752p.m45750a(C18642g.m45184L(), (float) C18642g.m45185M());
    }

    /* renamed from: g */
    public static int m45736g() {
        int a = (int) C18752p.m45750a(C18642g.m45184L(), (float) C18642g.m45192T());
        if (a > 0) {
            return a;
        }
        return (m45701a() / 2) - C18642g.m45184L().getResources().getDimensionPixelSize(R.dimen.ma);
    }

    /* renamed from: c */
    public static String m45729c() {
        C18610h hVar = C18654k.m45259a().f51556c;
        if (hVar == null) {
            return null;
        }
        List<C18602b> list = hVar.f51380a;
        if (C18740f.m45691a(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String j = ((C18602b) list.get(i)).mo37988j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m45732d() {
        StringBuilder sb = new StringBuilder(5120);
        C18626e e = C18642g.m45227e();
        e.f51418a = true;
        if (e != null) {
            try {
                String q = C18673u.m45399a().mo38174q();
                sb.append("/api/ad/v3/splash/creatives/");
                sb.append("?_unused=0");
                sb.append(m45739j());
                sb.append(e.toString());
                if (!TextUtils.isEmpty(q)) {
                    sb.append(q);
                }
                if (C18642g.m45194V() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C18642g.m45194V());
                }
            } catch (Exception unused) {
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    /* renamed from: e */
    public static String m45734e() {
        StringBuilder sb = new StringBuilder(5120);
        C18626e e = C18642g.m45227e();
        e.f51418a = true;
        if (e != null) {
            try {
                String q = C18673u.m45399a().mo38174q();
                sb.append("/api/ad/v2/ack/splash/");
                sb.append("?_unused=0");
                sb.append(m45739j());
                sb.append(e.toString());
                if (!TextUtils.isEmpty(q)) {
                    sb.append(q);
                }
                sb.append("&refresh_num=");
                sb.append(C18673u.m45399a().mo38172o());
                if (C18642g.m45194V() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C18642g.m45194V());
                }
            } catch (Exception unused) {
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    /* renamed from: f */
    public static long m45735f() {
        long f = C18674v.m45443a().mo38185f();
        if (f != -1) {
            StringBuilder sb = new StringBuilder("时间校验, 远端时间及时返回，数值为: ");
            sb.append(f);
            C18735a.m45663a(sb.toString());
            return f;
        }
        long c = C18673u.m45399a().mo38151c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < c) {
            StringBuilder sb2 = new StringBuilder("时间校验, 设备重启过, 当前开机时间: ");
            sb2.append(elapsedRealtime);
            sb2.append(", 上次开机时间: ");
            sb2.append(c);
            C18735a.m45663a(sb2.toString());
            return -1;
        }
        long b = C18673u.m45399a().mo38147b();
        long j = elapsedRealtime - c;
        StringBuilder sb3 = new StringBuilder("时间校验, 上次远端时间: ");
        sb3.append(b);
        sb3.append(", 两次启动时间差值: ");
        sb3.append(j);
        sb3.append(", 推算的当前时间: ");
        long j2 = b + j;
        sb3.append(j2);
        C18735a.m45663a(sb3.toString());
        return j2;
    }

    /* renamed from: i */
    private static int m45738i() {
        int i;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) C18642g.m45184L().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        double d = (double) C18642g.m45184L().getResources().getDisplayMetrics().density;
        if (d <= 1.1d) {
            i = 100;
        } else if (d <= 1.6d) {
            i = 960;
        } else {
            i = 1260;
        }
        return (((point.y - C18752p.m45756b(C18642g.m45184L())) * 200) / i) + ((int) C18752p.m45750a(C18642g.m45184L(), 25.0f));
    }

    /* renamed from: b */
    public static String m45723b() {
        C18626e e = C18642g.m45227e();
        e.f51418a = true;
        HashMap K = C18642g.m45183K();
        if (e == null) {
            return null;
        }
        String str = (String) f51829b.get(e.mo38025a());
        if (C18747l.m45742a(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            sb.append("/api/ad/splash/");
            sb.append(str);
            if (C18642g.m45195W()) {
                sb.append("/v14/");
            } else {
                sb.append("/v16/");
            }
            sb.append("?_unused=0");
            sb.append(m45739j());
            sb.append(e.toString());
            sb.append("&app_name=");
            sb.append(str);
            if (K != null) {
                sb.append(m45708a(K));
            }
            sb.append("&refresh_num=");
            sb.append(C18673u.m45399a().mo38172o() + 1);
            if (C18642g.m45194V() != -1) {
                sb.append("&is_cold_start=");
                sb.append(C18642g.m45194V());
            }
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: j */
    private static StringBuilder m45739j() {
        StringBuilder sb = new StringBuilder(PreloadTask.BYTE_UNIT_NUMBER);
        TelephonyManager telephonyManager = (TelephonyManager) C18642g.m45184L().getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!C18747l.m45742a(networkOperatorName)) {
                sb.append("&carrier=");
                sb.append(Uri.encode(networkOperatorName));
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!C18747l.m45742a(networkOperator)) {
                sb.append("&mcc_mnc=");
                sb.append(Uri.encode(networkOperator));
            }
        }
        DisplayMetrics displayMetrics = C18642g.m45184L().getResources().getDisplayMetrics();
        int b = displayMetrics.heightPixels - C18752p.m45756b(C18642g.m45184L());
        sb.append("&ad_area=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(b);
        sb.append("&sdk_version=");
        sb.append(C18642g.m45189Q());
        sb.append("&os_api=");
        sb.append(VERSION.SDK_INT);
        sb.append("&device_platform=android");
        sb.append("&os_version=");
        sb.append(VERSION.RELEASE);
        sb.append("&display_density=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(displayMetrics.heightPixels);
        sb.append("&dpi=");
        sb.append(C18752p.m45751a(C18642g.m45184L()));
        sb.append("&device_brand=");
        sb.append(Uri.encode(Build.BRAND));
        sb.append("&device_type=");
        sb.append(Uri.encode(Build.MODEL));
        int a = m45701a();
        if (a > 0) {
            sb.append("&bh=");
            sb.append(a);
        }
        sb.append("&display_dpi=");
        sb.append(displayMetrics.densityDpi);
        sb.append("&density=");
        sb.append(displayMetrics.density);
        String d = C18742h.m45699d(C18642g.m45184L());
        if (!C18747l.m45742a(d)) {
            sb.append("&ac=");
            sb.append(Uri.encode(d));
        }
        return sb;
    }

    static {
        f51829b.put("1128", "aweme");
        f51829b.put(C23018b.f61360b, "trill");
        f51829b.put("1233", "musical");
        f51829b.put("13", "news_article");
        f51829b.put("35", "news_article_lite");
        f51829b.put("32", "video_article");
        f51829b.put("1106", "topbuzz");
        f51829b.put("1116", "topbuzz");
        f51829b.put("1131", "topbuzz");
        f51829b.put("1184", "topbuzz");
        f51829b.put("1104", "topbuzz");
        f51829b.put("1117", "topbuzz");
        f51829b.put("1132", "topbuzz");
        f51829b.put("1185", "topbuzz");
        f51829b.put("1239", "topbuzz");
        f51829b.put("1197", "topbuzz");
        f51829b.put("1193", "topbuzz");
        f51829b.put("1222", "topbuzz");
        f51829b.put("1211", "topbuzz");
        f51829b.put("1194", "topbuzz");
        f51829b.put("1124", "topbuzz");
        f51829b.put("1125", "topbuzz");
        f51829b.put("1245", "topbuzz");
        f51829b.put("1113", "topbuzz");
        f51829b.put("1342", "topbuzz");
        f51829b.put("1346", "topbuzz");
        f51829b.put("1145", "live_i18n");
        f51829b.put("1164", "flipagram");
        f51829b.put("7", "neihan");
        f51829b.put("10001", "faceu");
        f51829b.put("1207", "learning");
        f51829b.put("36", "automobile");
        f51829b.put("150121", "beauty_me");
        f51829b.put("1372", "beauty_me_oversea");
        f51829b.put("1319", "super");
        f51829b.put("1370", "f100");
        f51829b.put("1488", "f101");
        f51829b.put("1353", "hively");
        f51829b.put("1354", "hively");
        f51829b.put("1112", "live_stream");
        f51829b.put("1350", "live_stream_lite");
        f51829b.put("1398", "homed");
        f51829b.put("1967", "novelapp");
        f51829b.put("1840", "xianshijie");
        f51828a.add(C23018b.f61360b);
        f51828a.add("1233");
        f51828a.add("1106");
        f51828a.add("1116");
        f51828a.add("1131");
        f51828a.add("1184");
        f51828a.add("1104");
        f51828a.add("1117");
        f51828a.add("1132");
        f51828a.add("1185");
        f51828a.add("1239");
        f51828a.add("1197");
        f51828a.add("1193");
        f51828a.add("1222");
        f51828a.add("1211");
        f51828a.add("1194");
        f51828a.add("1124");
        f51828a.add("1125");
        f51828a.add("1245");
        f51828a.add("1113");
        f51828a.add("1342");
        f51828a.add("1346");
        f51828a.add("1372");
    }

    /* renamed from: b */
    public static String m45724b(C18608f fVar) {
        if (fVar == null || !fVar.mo38008a()) {
            return null;
        }
        return m45731c(fVar.f51375d);
    }

    /* renamed from: c */
    private static String m45730c(C18617n nVar) {
        if (nVar == null || !nVar.mo38019a()) {
            return null;
        }
        return m45733d(nVar.f51405d);
    }

    /* renamed from: d */
    private static String m45733d(String str) {
        if (C18747l.m45742a(str)) {
            return null;
        }
        String F = C18642g.m45178F();
        if (TextUtils.isEmpty(F)) {
            return null;
        }
        return m45726b(F, str);
    }

    /* renamed from: a */
    public static String m45705a(C18608f fVar) {
        if (fVar == null) {
            return null;
        }
        List<String> list = fVar.f51372a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = (String) list.get(0);
        if (C18747l.m45742a(str) && list.size() >= 2) {
            str = (String) list.get(1);
            if (C18747l.m45742a(str) && list.size() >= 3) {
                str = (String) list.get(2);
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m45725b(C18617n nVar) {
        if (nVar == null || !nVar.mo38019a()) {
            return null;
        }
        return m45731c(nVar.f51405d);
    }

    /* renamed from: c */
    private static String m45731c(String str) {
        if (C18747l.m45742a(str)) {
            return null;
        }
        String E = C18642g.m45177E();
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        return m45726b(E, str);
    }

    /* renamed from: a */
    public static int m45702a(String str) {
        if (C18747l.m45742a(str)) {
            return 0;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            if (C18747l.m45742a(scheme)) {
                return 0;
            }
            if (C18753q.m45758a(str)) {
                return 2;
            }
            if (C18642g.m45227e() != null && "13".equals(C18642g.m45227e().mo38025a())) {
                if ("jdsdk".equalsIgnoreCase(scheme)) {
                    return 3;
                }
                if ("taobaosdk".equalsIgnoreCase(scheme)) {
                    return 4;
                }
            }
            if (C18753q.m45759b(str)) {
                return 5;
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m45706a(C18617n nVar) {
        if (nVar == null || nVar.f51404c == null || nVar.f51404c.isEmpty()) {
            return null;
        }
        return C18751o.m45749a((String) nVar.f51404c.get(0));
    }

    /* renamed from: b */
    public static JSONArray m45727b(List<C18602b> list) {
        JSONArray jSONArray = new JSONArray();
        if (C18740f.m45691a(list)) {
            return jSONArray;
        }
        try {
            for (C18602b bVar : list) {
                if (bVar.f51350x != null) {
                    jSONArray.put(bVar.f51350x);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static boolean m45728b(String str) {
        if (C18747l.m45742a(str)) {
            return false;
        }
        try {
            switch (m45702a(str)) {
                case 0:
                    return false;
                case 1:
                    Uri parse = Uri.parse(str);
                    if (C23057c.f61423a.equalsIgnoreCase(parse.getScheme())) {
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    List queryIntentActivities = C18642g.m45184L().getPackageManager().queryIntentActivities(intent, 65536);
                    if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                case 4:
                case 5:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            C18550a.m44899a().mo37842a(e, "key_exception_open_url");
            return false;
        }
    }

    /* renamed from: a */
    private static String m45708a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            if (!C18747l.m45742a((String) entry.getKey()) && !C18747l.m45742a((String) entry.getValue())) {
                sb.append("&");
                sb.append(C2240a.m6772a("%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m45703a(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    /* renamed from: b */
    private static String m45726b(String str, String str2) {
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C18736b.m45672a(str2));
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m45707a(C18617n nVar, boolean z) {
        if (TextUtils.isEmpty(C18642g.m45178F()) || !z) {
            return m45725b(nVar);
        }
        return m45730c(nVar);
    }

    /* renamed from: a */
    public static C18610h m45704a(JSONArray jSONArray, JSONArray jSONArray2, long j) {
        C18610h hVar = new C18610h();
        ArrayList<C18602b> arrayList = new ArrayList<>();
        if (jSONArray2 != null) {
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    C18602b bVar = new C18602b();
                    bVar.mo37975a(optJSONObject, j);
                    arrayList.add(bVar);
                }
            }
        }
        if (C18642g.m45229f() != null) {
            C18642g.m45229f().mo37854a(arrayList);
        }
        List<C18602b> a = m45714a(jSONArray, true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C18602b bVar2 : a) {
            if (!C18747l.m45742a(bVar2.mo37971G())) {
                arrayList2.add(bVar2);
            }
        }
        for (C18602b bVar3 : arrayList) {
            if (m45718a(bVar3)) {
                C18586b.m44982a();
                C18586b.m44986a(bVar3, "topview_boarding");
            }
            if (!C18747l.m45742a(bVar3.mo37971G())) {
                arrayList3.add(bVar3);
            }
        }
        arrayList2.removeAll(arrayList3);
        arrayList2.addAll(arrayList3);
        Map<String, C18602b> a2 = m45715a((List<C18602b>) arrayList2);
        hVar.f51380a = arrayList2;
        hVar.f51382c = a2;
        hVar.f51383d = arrayList;
        return hVar;
    }
}
