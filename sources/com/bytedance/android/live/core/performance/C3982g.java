package com.bytedance.android.live.core.performance;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p225d.C3837e;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.performance.g */
public final class C3982g {

    /* renamed from: a */
    public static boolean f11106a = false;

    /* renamed from: b */
    private static String f11107b = "ttlive_feed_base_performance_monitor_all";

    /* renamed from: c */
    private static String f11108c = "ttlive_create_room_base_performance_monitor_all";

    /* renamed from: d */
    private static String f11109d = "ttlive_enter_room_base_performance_monitor_all";

    /* renamed from: e */
    private static String f11110e = "ttlive_pk_watch_room_base_performance_monitor_all";

    /* renamed from: f */
    private static ConcurrentHashMap<String, Long> f11111f = new ConcurrentHashMap<>(200);

    /* renamed from: g */
    private static ConcurrentHashMap<String, Long> f11112g = new ConcurrentHashMap<>(200);

    /* renamed from: com.bytedance.android.live.core.performance.g$a */
    public enum C3983a {
        LiveFeedInit,
        LiveFeedPreview,
        LiveFeedScroll,
        StartLivePlay,
        ScrollWatchLivePlay,
        CreateStartLivePreview,
        CreateLive,
        ShowBInteractionFirstWidget,
        ShowVideoGift,
        ShowBarrage,
        ShowCInteractionFirstWidget,
        LivePk
    }

    /* renamed from: c */
    public static void m10092c(C3983a aVar) {
        if (f11106a) {
            m10085a(aVar, null);
        }
    }

    /* renamed from: b */
    public static void m10091b(C3983a aVar) {
        if (f11106a) {
            f11111f.put(aVar.name(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public static void m10084a(C3983a aVar) {
        if (aVar != null) {
            if (f11111f.containsKey(aVar.name())) {
                f11111f.remove(aVar.name());
            }
            if (f11112g.containsKey(aVar.name())) {
                f11112g.remove(aVar.name());
            }
            C3974b.m10061a().mo9381b(aVar.name());
        }
    }

    /* renamed from: a */
    public static String m10082a(String str) {
        String str2 = f11107b;
        if (TextUtils.equals(str, C3983a.LiveFeedInit.name()) || TextUtils.equals(str, C3983a.LiveFeedPreview.name()) || TextUtils.equals(str, C3983a.LiveFeedScroll.name())) {
            return f11107b;
        }
        if (TextUtils.equals(str, C3983a.CreateStartLivePreview.name()) || TextUtils.equals(str, C3983a.CreateLive.name()) || TextUtils.equals(str, C3983a.CreateStartLivePreview.name()) || TextUtils.equals(str, C3983a.ShowBInteractionFirstWidget.name())) {
            return f11108c;
        }
        if (TextUtils.equals(str, C3983a.StartLivePlay.name()) || TextUtils.equals(str, C3983a.ScrollWatchLivePlay.name()) || TextUtils.equals(str, C3983a.ShowCInteractionFirstWidget.name()) || TextUtils.equals(str, C3983a.ShowBarrage.name()) || TextUtils.equals(str, C3983a.ShowVideoGift.name())) {
            return f11109d;
        }
        if (TextUtils.equals(str, C3983a.LivePk.name())) {
            return f11110e;
        }
        return str2;
    }

    /* renamed from: a */
    public static HashMap<String, String> m10083a(String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        return hashMap;
    }

    /* renamed from: a */
    public static void m10085a(C3983a aVar, HashMap<String, String> hashMap) {
        if (f11106a && f11111f.containsKey(aVar.name())) {
            f11112g.put(aVar.name(), Long.valueOf(SystemClock.elapsedRealtime()));
            m10087a(aVar.name(), hashMap);
        }
    }

    /* renamed from: a */
    private static void m10087a(String str, HashMap<String, String> hashMap) {
        if (f11112g.containsKey(str) && f11111f.containsKey(str)) {
            long longValue = ((Long) f11112g.get(str)).longValue() - ((Long) f11111f.get(str)).longValue();
            String str2 = "";
            if (hashMap != null) {
                str2 = C2942b.m8369a().mo34889b(hashMap);
            }
            f11112g.remove(str);
            f11111f.remove(str);
            m10086a(str, longValue, str2);
        }
    }

    /* renamed from: a */
    private static void m10088a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m10089a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static void m10086a(String str, long j, String str2) {
        JSONObject jSONObject = new JSONObject();
        m10089a(jSONObject, "biz", str);
        m10088a(jSONObject, "duration", j);
        if (!TextUtils.isEmpty(str2)) {
            m10089a(jSONObject, "extra", str2);
        }
        C3837e.m9749b(m10082a(str), 0, jSONObject);
    }

    /* renamed from: a */
    public static void m10090a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
