package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.text.TextUtils;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11201j;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.j */
public final class C34030j {

    /* renamed from: a */
    static C11201j f87979a;

    /* renamed from: b */
    static ConcurrentHashMap<String, String> f87980b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final C34030j f87981c = new C34030j();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.j$a */
    static final class C34031a implements C11201j {

        /* renamed from: a */
        public static final C34031a f87982a = new C34031a();

        C34031a() {
        }

        /* renamed from: g */
        public final void mo20720g(List<C11206o> list) {
            C52711k.m112236a((Object) list, "it");
            for (C11206o oVar : list) {
                C52711k.m112236a((Object) oVar, "member");
                if (oVar.getUid() > 0 && !TextUtils.isEmpty(oVar.getSecUid()) && oVar.getConversationType() != C11170a.f30116b) {
                    IMUser a = C34010e.m77748a().mo71954a(String.valueOf(oVar.getUid()), oVar.getSecUid());
                    if (a != null) {
                        if (TextUtils.isEmpty(a.getSecUid())) {
                            a.setSecUid(oVar.getSecUid());
                            C34010e.m77748a().mo71959a(a);
                        }
                        String uid = a.getUid();
                        C52711k.m112236a((Object) uid, "user.uid");
                        String a2 = C11190e.m22687a(Long.parseLong(uid));
                        if (!TextUtils.isEmpty(a2)) {
                            C52711k.m112236a((Object) a2, "sessionId");
                            C52711k.m112240b(a2, "sessionId");
                            List<String> list2 = C34028i.f87977b;
                            if (list2 != null && list2.contains(a2)) {
                                List<String> list3 = C34028i.f87977b;
                                if (list3 == null) {
                                    C52711k.m112234a();
                                }
                                list3.remove(a2);
                            }
                        }
                    } else {
                        C34030j jVar = C34030j.f87981c;
                        Map map = C34030j.f87980b;
                        String valueOf = String.valueOf(oVar.getUid());
                        String secUid = oVar.getSecUid();
                        C52711k.m112236a((Object) secUid, "member.secUid");
                        map.put(valueOf, secUid);
                    }
                }
            }
        }
    }

    private C34030j() {
    }

    /* renamed from: b */
    public static String m77789b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (String) f87980b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    /* renamed from: a */
    public final String mo71976a(String str) {
        boolean z;
        String str2;
        String b = m77789b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return b;
        }
        IMUser b2 = C34010e.m77748a().mo71964b(str);
        if (b2 != null) {
            str2 = b2.getSecUid();
        } else {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: c */
    public final void mo71978c(String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = mo71975a(C34010e.m77748a().mo71964b(str), str);
            C34004b a2 = C34004b.m77717a();
            C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
            a2.mo71949f().putSecUidToMap(str, a);
        }
    }

    /* renamed from: a */
    public static void m77788a(IMUser iMUser) {
        if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid()) && !TextUtils.isEmpty(iMUser.getSecUid())) {
            if (!TextUtils.isEmpty(iMUser.getSecUid())) {
                Map map = f87980b;
                String uid = iMUser.getUid();
                C52711k.m112236a((Object) uid, "user.uid");
                String secUid = iMUser.getSecUid();
                C52711k.m112236a((Object) secUid, "user.secUid");
                map.put(uid, secUid);
            }
            IMUser b = C34010e.m77748a().mo71964b(iMUser.getUid());
            if (b != null && TextUtils.isEmpty(b.getSecUid())) {
                b.setSecUid(iMUser.getSecUid());
                C34010e.m77748a().mo71959a(b);
            }
        }
    }

    /* renamed from: b */
    public final String mo71977b(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return "";
        }
        if (!TextUtils.isEmpty(iMUser.getSecUid())) {
            return iMUser.getSecUid();
        }
        IMUser b = C34010e.m77748a().mo71964b(iMUser.getUid());
        if (b == null || TextUtils.isEmpty(b.getSecUid())) {
            return m77789b(iMUser.getUid());
        }
        return b.getSecUid();
    }

    /* renamed from: a */
    public final String mo71975a(IMUser iMUser, String str) {
        if (iMUser == null) {
            return m77789b(str);
        }
        return mo71977b(iMUser);
    }
}
