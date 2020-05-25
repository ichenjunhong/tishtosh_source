package com.p683ss.android.ugc.aweme.p1336ak.p1337a;

import com.p683ss.android.ugc.aweme.history.C32957c;
import com.p683ss.android.ugc.aweme.music.dislike.C37371a;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22556a;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22557b;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22559c;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22560d;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22561e;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22562f;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22563g;
import com.p683ss.android.ugc.aweme.p1428bc.p1429a.C23768a;
import com.p683ss.android.ugc.aweme.p1433bf.C23789a;
import com.p683ss.android.ugc.aweme.p1438bk.C23856a;
import com.p683ss.android.ugc.aweme.p1493cb.C24515a;
import com.p683ss.android.ugc.aweme.p1936m.C36448a;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ak.a.a */
public final class C22554a {

    /* renamed from: a */
    public static final Map<Object, Object> f60690a = new LinkedHashMap();

    /* renamed from: b */
    public static final C22555a f60691b = new C22555a(null);

    /* renamed from: com.ss.android.ugc.aweme.ak.a.a$a */
    public static final class C22555a {
        private C22555a() {
        }

        public /* synthetic */ C22555a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T> T mo46901a(Class<T> cls) {
            C52711k.m112240b(cls, "clazz");
            T t = C22554a.f60690a.get(cls);
            if (t != null) {
                return t;
            }
            T b = m55713b(cls);
            C22554a.f60690a.put(cls, b);
            return b;
        }

        /* renamed from: b */
        private static <T> T m55713b(Class<T> cls) {
            if (C52711k.m112239a((Object) cls, (Object) C22560d.class)) {
                return new C23768a();
            }
            if (C52711k.m112239a((Object) cls, (Object) C22557b.class)) {
                return new C32957c();
            }
            if (C52711k.m112239a((Object) cls, (Object) C22559c.class)) {
                return new C37371a();
            }
            if (C52711k.m112239a((Object) cls, (Object) C22562f.class)) {
                return new C23856a();
            }
            if (C52711k.m112239a((Object) cls, (Object) C22561e.class)) {
                return new C23789a();
            }
            if (C52711k.m112239a((Object) cls, (Object) C22563g.class)) {
                return new C24515a();
            }
            if (C52711k.m112239a((Object) cls, (Object) C22556a.class)) {
                return new C36448a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append("  impl not register");
            throw new Exception(sb.toString());
        }
    }
}
