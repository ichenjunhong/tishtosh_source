package com.p683ss.android.ugc.aweme.music.p1977e;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.e.a */
public final class C37375a {

    /* renamed from: a */
    public static final C37376a f95364a = new C37376a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.e.a$a */
    public static final class C37376a {
        private C37376a() {
        }

        public /* synthetic */ C37376a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m83685a(String str, String str2, String str3) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str3, "repo");
            String string = Keva.getRepoFromSp(C11010c.m22280a(), str3, 0).getString(str, str2);
            C52711k.m112236a((Object) string, "keva.getString(key, default?:\"\")");
            return string;
        }

        /* renamed from: a */
        public static <T> List<T> m83686a(String str, Class<T> cls, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(cls, "clazz");
            C52711k.m112240b(str2, "repo");
            String string = Keva.getRepoFromSp(C11010c.m22280a(), str2, 0).getString(str, "");
            if (TextUtils.isEmpty(string)) {
                return new ArrayList<>();
            }
            List<T> parseArray = JSON.parseArray(string, cls);
            C52711k.m112236a((Object) parseArray, "JSON.parseArray(json, clazz)");
            return parseArray;
        }

        /* renamed from: a */
        public static <T> void m83687a(String str, T t, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "repo");
            Keva repoFromSp = Keva.getRepoFromSp(C11010c.m22280a(), str2, 0);
            if (t instanceof String) {
                repoFromSp.storeString(str, (String) t);
            } else if (t instanceof Boolean) {
                repoFromSp.storeBoolean(str, ((Boolean) t).booleanValue());
            } else {
                repoFromSp.storeString(str, JSON.toJSONString(t));
            }
        }

        /* renamed from: a */
        public static boolean m83688a(String str, Boolean bool, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "repo");
            boolean z = false;
            Keva repoFromSp = Keva.getRepoFromSp(C11010c.m22280a(), str2, 0);
            if (bool != null) {
                z = bool.booleanValue();
            }
            return repoFromSp.getBoolean(str, z);
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m83682a(String str, Class<T> cls, String str2) {
        return C37376a.m83686a(str, cls, str2);
    }

    /* renamed from: a */
    public static final <T> void m83683a(String str, T t, String str2) {
        C37376a.m83687a(str, t, str2);
    }

    /* renamed from: a */
    public static final boolean m83684a(String str, Boolean bool, String str2) {
        return C37376a.m83688a(str, bool, str2);
    }
}
