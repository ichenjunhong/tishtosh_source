package com.p683ss.android.ugc.effectmanager.common.p2441h;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48662c.C48664a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.f */
public final class C48668f {

    /* renamed from: a */
    public static final C48668f f122308a = new C48668f();

    private C48668f() {
    }

    /* renamed from: a */
    private static String m105303a(Context context) {
        HashMap hashMap = new HashMap();
        Map map = hashMap;
        map.put("platform", Integer.valueOf(1));
        try {
            hashMap.put("gl_version", Float.valueOf(Float.parseFloat(C48672j.f122314a.mo96265a().f122320b)));
        } catch (Exception unused) {
        }
        map.put("gl_vendor", C48672j.f122314a.mo96265a().f122321c);
        map.put("gl_renderer", C48672j.f122314a.mo96265a().f122319a);
        map.put("gl_extension", C48672j.f122314a.mo96265a().f122326h);
        if (context != null) {
            C48664a a = C48662c.m105291a(context);
            C52711k.m112236a((Object) a, "DeviceUtil.getMemoryInfo(context)");
            map.put("memory_total_size", Long.valueOf(a.f122298a));
        }
        String a2 = C48662c.m105292a();
        C52711k.m112236a((Object) a2, "DeviceUtil.getCpuModel()");
        map.put("cpu_vendor", a2);
        String str = VERSION.RELEASE;
        C52711k.m112236a((Object) str, "Build.VERSION.RELEASE");
        map.put("os_version", str);
        String jSONObject = new JSONObject(map).toString();
        C52711k.m112236a((Object) jSONObject, "JSONObject(deviceInfoMap).toString()");
        return jSONObject;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo96252a(C48890g gVar) {
        C52711k.m112240b(gVar, "configuration");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(gVar.f122956b)) {
            String str = gVar.f122956b;
            C52711k.m112236a((Object) str, "configuration.accessKey");
            hashMap.put("access_key", str);
        }
        if (!TextUtils.isEmpty(gVar.f122959e)) {
            String str2 = gVar.f122959e;
            C52711k.m112236a((Object) str2, "configuration.deviceId");
            hashMap.put("device_id", str2);
        }
        if (!TextUtils.isEmpty(gVar.f122962h)) {
            String str3 = gVar.f122962h;
            C52711k.m112236a((Object) str3, "configuration.deviceType");
            hashMap.put("device_type", str3);
        }
        if (!TextUtils.isEmpty(gVar.f122961g)) {
            String str4 = gVar.f122961g;
            C52711k.m112236a((Object) str4, "configuration.platform");
            hashMap.put("device_platform", str4);
        }
        if (!TextUtils.isEmpty(gVar.f122965k)) {
            String str5 = gVar.f122965k;
            C52711k.m112236a((Object) str5, "configuration.region");
            hashMap.put("region", str5);
        }
        if (!TextUtils.isEmpty(gVar.f122957c)) {
            String str6 = gVar.f122957c;
            C52711k.m112236a((Object) str6, "configuration.sdkVersion");
            hashMap.put("sdk_version", str6);
        }
        if (!TextUtils.isEmpty(gVar.f122958d)) {
            String str7 = gVar.f122958d;
            C52711k.m112236a((Object) str7, "configuration.appVersion");
            hashMap.put("app_version", str7);
        }
        if (!TextUtils.isEmpty(gVar.f122960f)) {
            String str8 = gVar.f122960f;
            C52711k.m112236a((Object) str8, "configuration.channel");
            hashMap.put("channel", str8);
        }
        if (!TextUtils.isEmpty(gVar.f122966l)) {
            String str9 = gVar.f122966l;
            C52711k.m112236a((Object) str9, "configuration.appID");
            hashMap.put("aid", str9);
        }
        if (!TextUtils.isEmpty(gVar.f122967m)) {
            String str10 = gVar.f122967m;
            C52711k.m112236a((Object) str10, "configuration.appLanguage");
            hashMap.put("app_language", str10);
        }
        if (!TextUtils.isEmpty(gVar.f122968n)) {
            String str11 = gVar.f122968n;
            C52711k.m112236a((Object) str11, "configuration.longitude");
            hashMap.put("longitude", str11);
        }
        if (!TextUtils.isEmpty(gVar.f122969o)) {
            String str12 = gVar.f122969o;
            C52711k.m112236a((Object) str12, "configuration.latitude");
            hashMap.put("latitude", str12);
        }
        if (!TextUtils.isEmpty(gVar.f122970p)) {
            String str13 = gVar.f122970p;
            C52711k.m112236a((Object) str13, "configuration.cityCode");
            hashMap.put("city_code", str13);
        }
        if (!TextUtils.isEmpty(gVar.f122963i)) {
            String str14 = gVar.f122963i;
            C52711k.m112236a((Object) str14, "configuration.gpuVersion");
            hashMap.put("gpu", str14);
        }
        Map map = hashMap;
        map.put("platform_ab_params", String.valueOf(gVar.f122975u));
        map.put("platform_sdk_version", "650.0.0.15");
        map.put("device_info", m105303a(gVar.f122950C));
        return hashMap;
    }
}
