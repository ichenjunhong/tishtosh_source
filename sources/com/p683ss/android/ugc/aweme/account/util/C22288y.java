package com.p683ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.bean.C21122a;
import com.p683ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.util.y */
public final class C22288y {
    /* renamed from: a */
    public static C0013i<C21122a> m55168a() {
        if (C32816h.m75716b().getEnableNewUserInfoSync().booleanValue()) {
            CachedUserAgeInfo b = m55175b();
            if (b != null) {
                return m55170a(b.getBirthday(), b.getUserMode(), true);
            }
        }
        return C0013i.m16a(C22292z.f60059a);
    }

    /* renamed from: b */
    public static CachedUserAgeInfo m55175b() {
        HashMap hashMap;
        try {
            hashMap = (HashMap) new C17971f().mo34885a(C22282t.m55149e(), new C17956a<HashMap<String, CachedUserAgeInfo>>() {
            }.f49843c);
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            for (Entry entry : hashMap.entrySet()) {
                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), C23826bi.m58463d())) {
                    return (CachedUserAgeInfo) entry.getValue();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static int m55167a(AgeGateResponse ageGateResponse) {
        if (ageGateResponse.getAgeGatePostAction() != 0) {
            return ageGateResponse.getAgeGatePostAction();
        }
        return ageGateResponse.getRegisterAgeGatePostAction();
    }

    /* renamed from: b */
    public static C0013i<Bundle> m55174b(Bundle bundle) {
        return C0013i.m16a((Callable<TResult>) new C22255aa<TResult>(bundle)).mo20a((C0011g<TResult, TContinuationResult>) new C22256ab<TResult,TContinuationResult>(bundle), C0013i.f25b);
    }

    /* renamed from: a */
    public static C0013i<C21122a> m55169a(Bundle bundle) {
        AgeGateResponse ageGateResponse;
        int i;
        if (bundle.getSerializable("age_gate_response") != null) {
            ageGateResponse = (AgeGateResponse) bundle.getSerializable("age_gate_response");
        } else {
            ageGateResponse = null;
        }
        if (ageGateResponse == null) {
            return m55170a(C22260b.m55105a(), -1, false);
        }
        if (ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0) {
            i = 1;
        } else {
            i = 2;
        }
        bundle.putInt("user_mode", i);
        bundle.putInt("age_gate_post_action", m55167a(ageGateResponse));
        return m55170a(C22260b.m55105a(), i, false);
    }

    /* renamed from: c */
    static final /* synthetic */ User m55176c(Bundle bundle) throws Exception {
        try {
            User queryUser = C23826bi.m58449a().queryUser(null, true);
            C22093d.m54878a(true, 0, "", bundle);
            if (queryUser.getUserMode() == 0) {
                SharedPreferences a = C35807d.m80935a(C23826bi.m58460b(), "aweme_user", 0);
                int i = bundle.getInt("user_mode", -1);
                if (i != 2) {
                    if (i != 1) {
                        StringBuilder sb = new StringBuilder("ftc_user_mode_prefix_");
                        sb.append(queryUser.getUid());
                        int i2 = a.getInt(sb.toString(), 0);
                        if (i2 == 2 || i2 == 1) {
                            queryUser.setUserMode(i2);
                        }
                    }
                }
                queryUser.setUserMode(i);
                Editor edit = a.edit();
                StringBuilder sb2 = new StringBuilder("ftc_user_mode_prefix_");
                sb2.append(queryUser.getUid());
                edit.putInt(sb2.toString(), i).commit();
            }
            return queryUser;
        } catch (C23459a e) {
            C22093d.m54878a(false, e.getErrorCode(), e.getErrorMsg(), bundle);
            throw e;
        }
    }

    /* renamed from: a */
    public static String m55172a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: a */
    private static void m55173a(String str) {
        HashMap hashMap;
        try {
            hashMap = (HashMap) new C17971f().mo34885a(C22282t.m55149e(), new C17956a<HashMap<String, CachedUserAgeInfo>>() {
            }.f49843c);
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str)) {
                    hashMap.remove(entry.getKey());
                    break;
                }
            }
            C22282t.m55140a(new C17971f().mo34889b(hashMap));
        }
    }

    /* renamed from: a */
    public static C0013i<C21122a> m55170a(String str, int i, boolean z) {
        MusLoginManager musLoginManager = new MusLoginManager();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("birthday", str);
        }
        if (i != -1) {
            hashMap.put("user_mode", String.valueOf(i));
        }
        if (hashMap.containsKey("birthday")) {
            return musLoginManager.mo45040a(hashMap).mo24b(new C22257ac(str, i, z), C0013i.f24a);
        }
        return C0013i.m16a(C22258ad.f60031a);
    }

    /* renamed from: a */
    static final /* synthetic */ C0013i m55171a(String str, int i, boolean z, C0013i iVar) throws Exception {
        HashMap hashMap;
        int i2;
        if (iVar.mo33d() || iVar.mo31c() || !(((C21122a) iVar.mo34e()).f57394a == 0 || ((C21122a) iVar.mo34e()).f57394a == 5)) {
            String d = C23826bi.m58463d();
            CachedUserAgeInfo cachedUserAgeInfo = new CachedUserAgeInfo(str, i);
            String e = C22282t.m55149e();
            if (TextUtils.isEmpty(e)) {
                hashMap = new HashMap();
                hashMap.put(d, cachedUserAgeInfo);
            } else {
                try {
                    hashMap = (HashMap) new C17971f().mo34885a(e, new C17956a<HashMap<String, CachedUserAgeInfo>>() {
                    }.f49843c);
                } catch (Exception unused) {
                    hashMap = null;
                }
                if (hashMap != null) {
                    hashMap.put(d, cachedUserAgeInfo);
                }
            }
            C22282t.m55140a(new C17971f().mo34889b(hashMap));
            String str2 = "compliance_api_status";
            String str3 = "";
            C23088c a = C23088c.m56631a().mo47824a("type", "/aweme/v1/user/info/sync/").mo47822a("error_message", Integer.valueOf(((C21122a) iVar.mo34e()).f57394a));
            String str4 = "status";
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            C22089b.m54869a(str2, str3, a.mo47822a(str4, Integer.valueOf(i2)).mo47825b());
            C22260b.m55106a("");
        } else if (iVar.mo26b() && (((C21122a) iVar.mo34e()).f57394a == 0 || ((C21122a) iVar.mo34e()).f57394a == 5)) {
            if (z) {
                m55173a(C23826bi.m58463d());
            } else {
                C22260b.m55106a("");
            }
            C22089b.m54869a("compliance_api_status", "", C23088c.m56631a().mo47824a("type", "/aweme/v1/user/info/sync/").mo47822a("status", Integer.valueOf(0)).mo47825b());
        }
        return C0013i.m16a(C22259ae.f60032a);
    }
}
