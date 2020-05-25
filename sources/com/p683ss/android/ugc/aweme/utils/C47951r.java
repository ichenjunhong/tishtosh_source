package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.utils.r */
public final class C47951r {

    /* renamed from: a */
    public static final String f120546a = "crash_";

    /* renamed from: b */
    public static final String f120547b = "_key";

    /* renamed from: c */
    private static final String f120548c = "crash_last_sticker_id";

    /* renamed from: d */
    private static final String f120549d = "last_sticker_id";

    /* renamed from: e */
    private static final String f120550e = "last_mv_id";

    /* renamed from: f */
    private static final String f120551f = "last_filter_id";

    /* renamed from: g */
    private static final String f120552g = "last_infosticker_id";

    /* renamed from: h */
    private static final String f120553h = "last_beauty_id";

    /* renamed from: com.ss.android.ugc.aweme.utils.r$a */
    static final class C47952a extends C52712l implements C52686q<HashMap<String, String>, String, Keva, C52860x> {

        /* renamed from: a */
        public static final C47952a f120554a = new C47952a();

        C47952a() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m103762a((HashMap) obj, (String) obj2, (Keva) obj3);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public static void m103762a(HashMap<String, String> hashMap, String str, Keva keva) {
            C52711k.m112240b(hashMap, "$this$putValue");
            C52711k.m112240b(str, "key");
            C52711k.m112240b(keva, "keva");
            Map map = hashMap;
            StringBuilder sb = new StringBuilder();
            sb.append(C47951r.f120546a);
            sb.append(str);
            sb.append(C47951r.f120547b);
            map.put(str, keva.getString(sb.toString(), ""));
        }
    }

    /* renamed from: a */
    public static final HashMap<String, String> m103759a(Context context) {
        HashMap<String, String> hashMap = null;
        if (context == null) {
            return null;
        }
        Keva repoSync = Keva.getRepoSync(f120548c, 1);
        try {
            HashMap<String, String> hashMap2 = new HashMap<>();
            String str = f120549d;
            C52711k.m112236a((Object) repoSync, "keva");
            C47952a.m103762a(hashMap2, str, repoSync);
            C47952a.m103762a(hashMap2, f120550e, repoSync);
            C47952a.m103762a(hashMap2, f120553h, repoSync);
            C47952a.m103762a(hashMap2, f120552g, repoSync);
            C47952a.m103762a(hashMap2, f120551f, repoSync);
            hashMap = hashMap2;
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static final List<User> m103760a(ExtraMentionUserModel extraMentionUserModel) {
        C52711k.m112240b(extraMentionUserModel, "$this$transformToUserList");
        List userList = extraMentionUserModel.getUserList();
        if (!(!extraMentionUserModel.getUserList().isEmpty())) {
            userList = null;
        }
        if (userList == null) {
            return null;
        }
        Iterable<C52847n> iterable = userList;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C52847n nVar : iterable) {
            User user = new User();
            user.setUid((String) nVar.getFirst());
            user.setNickname((String) nVar.getSecond());
            arrayList.add(user);
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final void m103761a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Keva repoSync = Keva.getRepoSync(f120548c, 1);
                switch (i) {
                    case 1:
                        repoSync.storeString(f120549d, str);
                        return;
                    case 2:
                        repoSync.storeString(f120550e, str);
                        return;
                    case 3:
                        repoSync.storeString(f120551f, str);
                        break;
                    case 4:
                        repoSync.storeString(f120553h, str);
                        return;
                    case 5:
                        repoSync.storeString(f120552g, str);
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
