package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43220dn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.utils.b */
public final class C47702b {

    /* renamed from: a */
    public static final C47702b f120193a = new C47702b();

    /* renamed from: b */
    private static final List<C47805dc> f120194b;

    private C47702b() {
    }

    static {
        List<C47805dc> arrayList = new ArrayList<>();
        f120194b = arrayList;
        arrayList.add(new C47805dc() {
            /* renamed from: a */
            private static boolean m103243a(String str, String str2) {
                CharSequence charSequence = str;
                if (TextUtils.equals(charSequence, "im_story") || (TextUtils.equals(charSequence, "story") && TextUtils.equals(str2, "from_chat"))) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final boolean mo94986a(String str, Map<String, String> map) {
                String str2;
                C52711k.m112240b(str, "eventName");
                String str3 = null;
                if (map != null) {
                    str2 = (String) map.get("shoot_way");
                } else {
                    str2 = null;
                }
                if (map != null) {
                    str3 = (String) map.get("enter_from");
                }
                return m103243a(str2, str3);
            }

            /* renamed from: a */
            public final boolean mo94987a(String str, JSONObject jSONObject) {
                String str2;
                C52711k.m112240b(str, "eventName");
                String str3 = null;
                if (jSONObject != null) {
                    str2 = jSONObject.optString("shoot_way", "");
                } else {
                    str2 = null;
                }
                if (jSONObject != null) {
                    str3 = jSONObject.optString("enter_from", "");
                }
                return m103243a(str2, str3);
            }
        });
        f120194b.add(new C47805dc() {
            /* renamed from: a */
            public final boolean mo94986a(String str, Map<String, String> map) {
                CharSequence charSequence;
                C52711k.m112240b(str, "eventName");
                String str2 = null;
                if (C52830p.m112411b(str, "tool_performance_", false, 2, null)) {
                    if (map != null) {
                        charSequence = (String) map.get("tool_performance_");
                    } else {
                        charSequence = null;
                    }
                    if (TextUtils.isEmpty(charSequence) && map != null) {
                        String str3 = "creation_id";
                        String str4 = C43220dn.m94841a().f109306b;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        map.put(str3, str4);
                    }
                    if (map != null) {
                        str2 = (String) map.get("shoot_way");
                    }
                    if (TextUtils.isEmpty(str2) && map != null) {
                        String str5 = "shoot_way";
                        String str6 = C43220dn.m94841a().f109305a;
                        if (str6 == null) {
                            str6 = "no_shootWay";
                        }
                        map.put(str5, str6);
                    }
                }
                return false;
            }

            /* renamed from: a */
            public final boolean mo94987a(String str, JSONObject jSONObject) {
                CharSequence charSequence;
                C52711k.m112240b(str, "eventName");
                String str2 = null;
                if (C52830p.m112411b(str, "tool_performance_", false, 2, null)) {
                    if (jSONObject != null) {
                        charSequence = jSONObject.optString("creation_id", "");
                    } else {
                        charSequence = null;
                    }
                    if (TextUtils.isEmpty(charSequence) && jSONObject != null) {
                        String str3 = "creation_id";
                        String str4 = C43220dn.m94841a().f109306b;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        jSONObject.put(str3, str4);
                    }
                    if (jSONObject != null) {
                        str2 = jSONObject.optString("shoot_way", "");
                    }
                    if (TextUtils.isEmpty(str2) && jSONObject != null) {
                        String str5 = "shoot_way";
                        String str6 = C43220dn.m94841a().f109305a;
                        if (str6 == null) {
                            str6 = "no_shootWay";
                        }
                        jSONObject.put(str5, str6);
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public final void mo94984a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "eventName");
        if (m103239b(str, map)) {
            try {
                C39629l.m88232a().mo58567E().mo49430a(str, map);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m103239b(String str, Map<String, String> map) {
        Iterable<C47805dc> iterable = f120194b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C47805dc a : iterable) {
                if (a.mo94986a(str, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo94985a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "eventName");
        if (m103240b(str, jSONObject)) {
            try {
                C39629l.m88232a().mo58567E().mo49433b(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m103240b(String str, JSONObject jSONObject) {
        Iterable<C47805dc> iterable = f120194b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C47805dc a : iterable) {
                if (a.mo94987a(str, jSONObject)) {
                    return false;
                }
            }
        }
        return true;
    }
}
