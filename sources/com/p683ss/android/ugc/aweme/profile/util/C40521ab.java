package com.p683ss.android.ugc.aweme.profile.util;

import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.profile.model.NeedPointStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ab */
public final class C40521ab {

    /* renamed from: a */
    public static final C40521ab f103416a = new C40521ab();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Keva f103417b = Keva.getRepo("users_points_repo");

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ab$a */
    public interface C40522a {
        /* renamed from: a */
        void mo82802a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ab$b */
    public static final class C40523b extends C17956a<Map<String, Map<Integer, Long>>> {
        C40523b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ab$c */
    public static final class C40524c extends C17956a<Map<String, Map<Integer, Boolean>>> {
        C40524c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ab$d */
    public static final class C40525d<T> implements C2205y<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f103418a;

        /* renamed from: b */
        final /* synthetic */ List f103419b;

        public C40525d(String str, List list) {
            this.f103418a = str;
            this.f103419b = list;
        }

        public final void subscribe(C2204x<Boolean> xVar) {
            C52711k.m112240b(xVar, "emitter");
            Map a = C40521ab.m89929a();
            if (a == null) {
                a = new HashMap();
            }
            Map b = C40521ab.m89930b();
            if (b == null) {
                b = new HashMap();
            }
            Map map = (Map) a.get(this.f103418a);
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = (Map) b.get(this.f103418a);
            if (map2 == null) {
                map2 = new HashMap();
            }
            for (NeedPointStruct needPointStruct : this.f103419b) {
                if (map.get(Integer.valueOf(needPointStruct.getPointType())) != null) {
                    Object obj = map.get(Integer.valueOf(needPointStruct.getPointType()));
                    if (obj == null) {
                        C52711k.m112234a();
                    }
                    if (((Number) obj).longValue() >= needPointStruct.getTimeStamp()) {
                    }
                }
                map.put(Integer.valueOf(needPointStruct.getPointType()), Long.valueOf(needPointStruct.getTimeStamp()));
                map2.put(Integer.valueOf(needPointStruct.getPointType()), Boolean.valueOf(true));
            }
            a.put(this.f103418a, map);
            b.put(this.f103418a, map2);
            C40521ab.f103417b.storeString("users_points_timestamp_records", new C17971f().mo34889b(a));
            C40521ab.f103417b.storeString("users_points_update_records", new C17971f().mo34889b(b));
            xVar.mo6282a(Boolean.valueOf(true));
            xVar.mo6273a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ab$e */
    public static final class C40526e<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C40522a f103420a;

        public C40526e(C40522a aVar) {
            this.f103420a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C40522a aVar = this.f103420a;
            if (aVar != null) {
                aVar.mo82802a();
            }
        }
    }

    private C40521ab() {
    }

    /* renamed from: a */
    public static Map<String, Map<Integer, Long>> m89929a() {
        try {
            return (Map) new C17971f().mo34885a(f103417b.getString("users_points_timestamp_records", ""), new C40523b().f49843c);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Map<String, Map<Integer, Boolean>> m89930b() {
        try {
            return (Map) new C17971f().mo34885a(f103417b.getString("users_points_update_records", ""), new C40524c().f49843c);
        } catch (Exception unused) {
            return null;
        }
    }
}
