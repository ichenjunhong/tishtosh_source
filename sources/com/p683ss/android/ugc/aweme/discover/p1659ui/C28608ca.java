package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ca */
public final class C28608ca {

    /* renamed from: a */
    static List<String> f75133a;

    /* renamed from: b */
    public static final int f75134b = f75133a.indexOf("general");

    /* renamed from: c */
    public static final int f75135c = f75133a.indexOf("video");

    /* renamed from: d */
    public static final int f75136d = f75133a.indexOf("user");

    /* renamed from: e */
    public static final int f75137e = f75133a.indexOf("poi");

    /* renamed from: f */
    public static final int f75138f = f75133a.indexOf("music");

    /* renamed from: g */
    public static final int f75139g = f75133a.indexOf("hashtag");

    /* renamed from: h */
    public static final int f75140h = f75133a.indexOf("goods");

    /* renamed from: i */
    public static final int f75141i = f75133a.indexOf(CustomActionPushReceiver.f104061f);

    /* renamed from: a */
    public static int m67854a() {
        return f75133a.size();
    }

    static {
        try {
            f75133a = (List) new C17971f().mo34885a((String) SharePrefCache.inst().getSearchTabIndex().mo47782d(), new C17956a<List<String>>() {
            }.f49843c);
        } catch (Exception unused) {
        }
        if (C9376b.m18558a((Collection<T>) f75133a)) {
            ArrayList arrayList = new ArrayList();
            f75133a = arrayList;
            arrayList.addAll(C28610cb.m67856a());
        }
        Iterator it = f75133a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            boolean z = false;
            if (C28610cb.m67856a().contains(str) && !"goods".equalsIgnoreCase(str)) {
                z = true;
            }
            if (!z) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static String m67855a(int i) {
        return (String) f75133a.get(i);
    }
}
