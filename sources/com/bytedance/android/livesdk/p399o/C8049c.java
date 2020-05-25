package com.bytedance.android.livesdk.p399o;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p399o.p401b.C8033b;
import com.bytedance.android.livesdk.p399o.p401b.C8034c;
import com.bytedance.android.livesdk.p399o.p401b.C8035d;
import com.bytedance.android.livesdk.p399o.p401b.C8036e;
import com.bytedance.android.livesdk.p399o.p401b.C8037f;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8039h;
import com.bytedance.android.livesdk.p399o.p401b.C8040i;
import com.bytedance.android.livesdk.p399o.p401b.C8041j;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p401b.C8043l;
import com.bytedance.android.livesdk.p399o.p401b.C8044m;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p401b.C8046o;
import com.bytedance.android.livesdk.p399o.p401b.C8047p;
import com.bytedance.android.livesdk.p399o.p401b.C8048q;
import com.bytedance.android.livesdk.p399o.p402c.C8050a;
import com.bytedance.android.livesdk.p399o.p402c.C8051b;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8053d;
import com.bytedance.android.livesdk.p399o.p402c.C8054e;
import com.bytedance.android.livesdk.p399o.p402c.C8055f;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8057h;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.p399o.p402c.C8061l;
import com.bytedance.android.livesdk.p399o.p402c.C8062m;
import com.bytedance.android.livesdk.p399o.p402c.C8063n;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8801e;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.o.c */
public final class C8049c {

    /* renamed from: b */
    private static C8049c f21984b;

    /* renamed from: c */
    private static final List<String> f21985c = Collections.singletonList("livesdk_recharge_success");

    /* renamed from: d */
    private static final List<String> f21986d = Collections.singletonList("livesdk_send_gift");

    /* renamed from: e */
    private static final Map<String, List<String>> f21987e;

    /* renamed from: a */
    private final Map<Class, C8038g> f21988a = new HashMap();

    /* renamed from: a */
    public static synchronized C8049c m15979a() {
        C8049c cVar;
        synchronized (C8049c.class) {
            if (f21984b == null) {
                f21984b = new C8049c();
            }
            cVar = f21984b;
        }
        return cVar;
    }

    static {
        HashMap hashMap = new HashMap();
        f21987e = hashMap;
        hashMap.put("livesdk_send_gift", Arrays.asList(new String[]{"gift_id", "money", "gift_info", "gift_cnt"}));
        f21987e.put("livesdk_recharge_success", Collections.singletonList("money"));
    }

    /* renamed from: b */
    private Map<String, String> m15985b() {
        String str;
        CookieManager instance = CookieManager.getInstance();
        INetworkService iNetworkService = (INetworkService) C4116c.m10249a(INetworkService.class);
        if (iNetworkService != null) {
            str = iNetworkService.getHostDomain();
        } else {
            str = "";
        }
        String cookie = instance.getCookie(str);
        if (TextUtils.isEmpty(cookie)) {
            return Collections.EMPTY_MAP;
        }
        String[] split = cookie.split(";");
        if (split.length <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String split2 : split) {
            String[] split3 = split2.split("=");
            if (split3.length == 2) {
                hashMap.put(m15980a(split3[0]), m15980a(split3[1]));
            }
        }
        return hashMap;
    }

    private C8049c() {
        m15981a(Room.class, (C8038g<T>) new C8045n<T>());
        m15981a(C8051b.class, (C8038g<T>) new C8034c<T>());
        m15981a(C8063n.class, (C8038g<T>) new C8047p<T>());
        m15981a(C8062m.class, (C8038g<T>) new C8046o<T>());
        m15981a(C8061l.class, (C8038g<T>) new C8044m<T>());
        m15981a(C8052c.class, (C8038g<T>) new C8035d<T>());
        m15981a(C8057h.class, (C8038g<T>) new C8041j<T>());
        m15981a(C8055f.class, (C8038g<T>) new C8039h<T>());
        C8042k kVar = new C8042k();
        kVar.mo14194a("event_page", "live_detail");
        m15981a(C8059j.class, (C8038g<T>) kVar);
        m15981a(User.class, (C8038g<T>) new C8048q<T>());
        m15981a(C8056g.class, (C8038g<T>) new C8040i<T>());
        m15981a(C8050a.class, (C8038g<T>) new C8033b<T>());
        m15981a(C8053d.class, (C8038g<T>) new C8036e<T>());
        m15981a(C8054e.class, (C8038g<T>) new C8037f<T>());
        m15981a(C8060k.class, (C8038g<T>) new C8043l<T>());
    }

    /* renamed from: a */
    private static String m15980a(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* renamed from: a */
    private static void m15983a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        C8064d.m16005b().mo9197a("ttlive_eventlog", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final C8038g mo14201a(Class cls) {
        if (this.f21988a.containsKey(cls)) {
            return (C8038g) this.f21988a.get(cls);
        }
        return null;
    }

    /* renamed from: a */
    private <T> void m15981a(Class<T> cls, C8038g<T> gVar) {
        this.f21988a.put(cls, gVar);
    }

    /* renamed from: a */
    private void m15982a(String str, Map<String, String> map) {
        if (!map.isEmpty() && !TextUtils.isEmpty(str)) {
            if (!f21986d.contains(str)) {
                if (f21985c.contains(str)) {
                    Map b = m15985b();
                    String str2 = (String) b.get("store-idc");
                    String str3 = (String) b.get("store-country-code");
                    if (!"maliva".equals(str2) || !"us".equals(str3)) {
                        return;
                    }
                }
            }
            m15984a(map, str);
        }
    }

    /* renamed from: a */
    private static void m15984a(Map<String, String> map, String str) {
        List<String> list = (List) f21987e.get(str);
        if (list != null && !list.isEmpty()) {
            for (String remove : list) {
                map.remove(remove);
            }
        }
    }

    /* renamed from: a */
    public final void mo14203a(String str, Object... objArr) {
        mo14202a(str, null, objArr);
    }

    /* renamed from: a */
    public final void mo14202a(String str, Map<String, String> map, Object... objArr) {
        HashMap hashMap = new HashMap();
        if (this.f21988a.containsKey(C8051b.class)) {
            ((C8038g) this.f21988a.get(C8051b.class)).mo14195a((Map<String, String>) hashMap);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    if (obj instanceof Class) {
                        if (this.f21988a.containsKey(obj)) {
                            ((C8038g) this.f21988a.get(obj)).mo14195a((Map<String, String>) hashMap);
                        }
                    } else if (this.f21988a.containsKey(obj.getClass())) {
                        ((C8038g) this.f21988a.get(obj.getClass())).mo14196a((Map<String, String>) hashMap, obj);
                    }
                }
            }
        }
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        if (!str.startsWith("livesdk_")) {
            StringBuilder sb = new StringBuilder("livesdk_");
            sb.append(str);
            str = sb.toString();
        }
        if (!hashMap.containsKey("_param_live_platform")) {
            hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        }
        hashMap.put("sdk_version", "1510");
        if (str.equals("livesdk_live_show")) {
            if (hashMap.containsKey("event_page")) {
                hashMap.get("event_page");
            }
            if (hashMap.containsKey("event_module")) {
                hashMap.get("event_module");
            }
            hashMap.put("request_page", C8830k.m17330d().mo15060m().mo10874f());
        } else {
            if (hashMap.containsKey("enter_from")) {
                hashMap.get("enter_from");
            }
            if (hashMap.containsKey("source")) {
                hashMap.get("source");
            }
        }
        m15982a(str, (Map<String, String>) hashMap);
        ((C8801e) C4116c.m10249a(C8801e.class)).mo15567a(str, hashMap);
        m15983a((Map<String, String>) hashMap);
    }
}
