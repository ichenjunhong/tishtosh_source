package com.p683ss.android.ugc.aweme.p1386ar;

import com.google.gson.C17971f;
import java.util.ArrayList;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ar.a */
public final class C23258a {

    /* renamed from: a */
    public static final C17971f f62185a = new C17971f();

    /* renamed from: b */
    public static final String f62186b = f62186b;

    /* renamed from: c */
    public static final C23258a f62187c = new C23258a();

    /* renamed from: d */
    private static final String f62188d = f62188d;

    /* renamed from: e */
    private static ArrayList<Integer> f62189e;

    /* renamed from: f */
    private static final ArrayList<String> f62190f = C52575l.m112103d("/service/1/update_token/", "/aweme/v1/aweme/detail/", "/aweme/v1/user/", "/aweme/v1/abtest/param/", "/aweme/v1/commerce/settings", "/aweme/v1/feed/", "/aweme/v1/settings/", "/aweme/v1/story/", "/aweme/v1/user/settings/", "/aweme/v1/im/cloud/token/", "/aweme/v1/upload/contacts/", "/aweme/v1/aweme/post/", "/aweme/v1/poi/search/", "/aweme/v1/user/", "/aweme/v1/commit/follow/user/", "/aweme/v1/multi/aweme/detail/", "/aweme/v1/comment/publish/", "/aweme/v1/general/search/", "/passport/user/logout/", "/aweme/v1/commit/item/digg/", "/aweme/v1/poi/vertical/aweme/", "/user/mobile/reset_password/", "/passport/auth/login/", "/aweme/v1/create/aweme/", "/aweme/v1/recommend/user/", "/aweme/v2/comment/list/", "/passport/mobile/login/", "/aweme/v1/user/follower/list/", "/aweme/v1/notice/count/", "/aweme/v1/friend/feed/", "/aweme/v1/aweme/stats/", "/aweme/v1/hot/search/list/", "/aweme/v1/recommend/challenge/");

    private C23258a() {
    }

    /* renamed from: a */
    public static ArrayList<Integer> m57198a() {
        if (f62189e == null) {
            synchronized (f62187c) {
                if (f62189e != null) {
                    ArrayList<Integer> arrayList = f62189e;
                    return arrayList;
                }
                f62189e = new ArrayList<>();
                for (String str : f62190f) {
                    ArrayList<Integer> arrayList2 = f62189e;
                    if (arrayList2 == null) {
                        C52711k.m112234a();
                    }
                    arrayList2.add(Integer.valueOf(str.hashCode()));
                }
            }
        }
        return f62189e;
    }
}
