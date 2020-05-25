package com.p683ss.android.ugc.aweme.newfollow.util;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.d */
public final class C37934d {

    /* renamed from: a */
    public volatile HashSet<String> f96589a;

    /* renamed from: b */
    public volatile HashSet<String> f96590b;

    /* renamed from: c */
    private HashSet<String> f96591c;

    /* renamed from: d */
    private volatile List<String> f96592d;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.d$a */
    static class C37936a {

        /* renamed from: a */
        private static final Map<String, C37934d> f96593a = new ConcurrentHashMap(1);

        /* renamed from: a */
        public static C37934d m84807a(String str) {
            C37934d dVar = (C37934d) f96593a.get(str);
            if (dVar != null) {
                return dVar;
            }
            C37934d dVar2 = new C37934d();
            f96593a.put(str, dVar2);
            return dVar2;
        }
    }

    private C37934d() {
        m84798f();
    }

    /* renamed from: b */
    public final boolean mo77397b() {
        return C9376b.m18558a((Collection<T>) this.f96589a);
    }

    /* renamed from: g */
    private static void m84799g() {
        C23542f.m57721f().mo48709b("to_report_feed_ids", "");
    }

    /* renamed from: e */
    public final void mo77400e() {
        C23542f.m57721f().mo48709b("to_report_feed_ids", mo77398c());
    }

    /* renamed from: f */
    private void m84798f() {
        String a = C23542f.m57721f().mo48703a("to_report_feed_ids", "");
        if (a != null && !a.isEmpty()) {
            for (String b : a.split(",")) {
                mo77396b(b);
            }
        }
    }

    /* renamed from: a */
    public final String mo77394a() {
        if (C9376b.m18558a((Collection<T>) this.f96592d)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String append : this.f96592d) {
            sb.append(append);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo77398c() {
        if (C9376b.m18558a((Collection<T>) this.f96589a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f96589a.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo77399d() {
        if (this.f96589a != null) {
            if (!C9376b.m18558a((Collection<T>) this.f96590b)) {
                this.f96589a.removeAll(this.f96590b);
            } else {
                this.f96589a.clear();
            }
        }
        if (this.f96590b != null) {
            this.f96590b.clear();
        }
        m84799g();
    }

    /* renamed from: a */
    public static C37934d m84797a(String str) {
        return C37936a.m84807a(str);
    }

    /* renamed from: a */
    public final void mo77395a(List<String> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            if (this.f96592d != null) {
                this.f96592d.clear();
            }
            return;
        }
        this.f96592d = list;
    }

    /* renamed from: b */
    public final void mo77396b(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f96591c == null) {
                this.f96591c = new HashSet<>();
            }
            if (this.f96589a == null) {
                this.f96589a = new HashSet<>();
            }
            if (!this.f96591c.contains(str)) {
                this.f96589a.add(str);
                this.f96591c.add(str);
            }
        }
    }
}
