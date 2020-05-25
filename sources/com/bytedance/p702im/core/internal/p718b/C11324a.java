package com.bytedance.p702im.core.internal.p718b;

import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.MessageBody.Builder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.internal.b.a */
public final class C11324a {

    /* renamed from: a */
    public static final Set<Integer> f30471a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Set<String> f30472b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Set<Integer> f30473c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public static final Set<Integer> f30474d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public static final Set<String> f30475e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public static final Map<Integer, Map<String, MessageBody>> f30476f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final Set<String> f30477g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public static final Map<Integer, List<String>> f30478h = new ConcurrentHashMap();

    /* renamed from: i */
    public static final Set<Integer> f30479i = new CopyOnWriteArraySet();

    /* renamed from: j */
    public static final Set<Integer> f30480j = new CopyOnWriteArraySet();

    /* renamed from: a */
    public static void m23124a() {
        m23130a(false);
    }

    /* renamed from: b */
    public static void m23134b(String str) {
        f30472b.add(str);
    }

    /* renamed from: c */
    public static boolean m23136c(String str) {
        return f30475e.contains(str);
    }

    /* renamed from: d */
    public static void m23137d(String str) {
        f30475e.add(str);
    }

    /* renamed from: a */
    public static boolean m23131a(int i) {
        return f30473c.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public static void m23133b(int i) {
        f30473c.add(Integer.valueOf(i));
    }

    /* renamed from: c */
    public static void m23135c(int i) {
        f30473c.remove(Integer.valueOf(i));
    }

    /* renamed from: d */
    public static boolean m23138d(int i) {
        return f30474d.contains(Integer.valueOf(i));
    }

    /* renamed from: e */
    public static void m23139e(int i) {
        f30474d.remove(Integer.valueOf(i));
    }

    /* renamed from: f */
    public static boolean m23140f(int i) {
        List list = (List) f30478h.get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m23130a(boolean z) {
        if (!f30476f.isEmpty()) {
            for (Integer num : f30476f.keySet()) {
                C11409r.m23292a();
                C11409r.m23297a(num.intValue(), (Map) f30476f.get(num), z);
            }
            f30476f.clear();
        }
        if (!f30477g.isEmpty()) {
            for (String str : f30477g) {
                C11409r.m23292a();
                C11409r.m23303c(str);
            }
            f30477g.clear();
        }
    }

    /* renamed from: a */
    public static boolean m23132a(String str) {
        return f30472b.contains(str);
    }

    /* renamed from: a */
    public static void m23125a(int i, int i2) {
        if (f30471a.contains(Integer.valueOf(i))) {
            f30471a.remove(Integer.valueOf(i));
            C11165c.m22588a().f30108c.mo20500c(i, i2);
        }
    }

    /* renamed from: a */
    public static void m23126a(int i, MessageBody messageBody) {
        if (!(messageBody.conversation_id == null || messageBody.conversation_short_id == null || messageBody.conversation_type == null)) {
            if (f30476f.get(Integer.valueOf(i)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                f30476f.put(Integer.valueOf(i), concurrentHashMap);
                return;
            }
            ((Map) f30476f.get(Integer.valueOf(i))).put(messageBody.conversation_id, messageBody);
        }
    }

    /* renamed from: a */
    public static void m23127a(int i, String str) {
        if (f30476f.containsKey(Integer.valueOf(i))) {
            ((Map) f30476f.get(Integer.valueOf(i))).remove(str);
        }
    }

    /* renamed from: a */
    public static void m23129a(int i, Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            List list = (List) f30478h.get(Integer.valueOf(i));
            if (list != null) {
                list.removeAll(collection);
                if (list.isEmpty() && f30479i.contains(Integer.valueOf(i))) {
                    C11472i.m23483a().mo21115b(i);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23128a(int i, String str, long j, int i2, long j2) {
        m23126a(i, new Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).create_time(Long.valueOf(j2)).build());
    }
}
