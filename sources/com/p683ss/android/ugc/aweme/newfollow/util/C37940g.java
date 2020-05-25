package com.p683ss.android.ugc.aweme.newfollow.util;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.g */
public final class C37940g {

    /* renamed from: a */
    public volatile List<String> f96607a;

    /* renamed from: b */
    private List<String> f96608b;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.g$a */
    static class C37941a {

        /* renamed from: a */
        public static final C37940g f96609a = new C37940g();
    }

    /* renamed from: a */
    public static C37940g m84832a() {
        return C37941a.f96609a;
    }

    /* renamed from: e */
    private static C23543g m84833e() {
        return C23541e.m57714a(C11010c.m22280a(), "rec_user");
    }

    /* renamed from: f */
    private void m84834f() {
        m84833e().mo48709b("to_report_rec_user_ids", "");
    }

    /* renamed from: g */
    private String m84835g() {
        return m84833e().mo48703a("to_report_rec_user_ids", "");
    }

    /* renamed from: d */
    public final void mo77418d() {
        m84833e().mo48709b("to_report_rec_user_ids", mo77416b());
    }

    /* renamed from: c */
    public final void mo77417c() {
        if (this.f96607a != null) {
            this.f96607a.clear();
        }
        if (this.f96608b != null) {
            this.f96608b.clear();
        }
        m84834f();
    }

    /* renamed from: h */
    private void m84836h() {
        if (!m84835g().isEmpty()) {
            for (String str : Arrays.asList(m84835g().split(","))) {
                if (this.f96607a.contains(str)) {
                    this.f96607a.remove(str);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo77416b() {
        String g = m84835g();
        if (this.f96607a == null || this.f96607a.size() == 0) {
            return g;
        }
        StringBuilder sb = new StringBuilder();
        if (!g.isEmpty()) {
            sb.append(g);
            sb.append(",");
        }
        m84836h();
        ArrayList arrayList = new ArrayList(this.f96607a);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            sb.append(",");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    /* renamed from: a */
    public final void mo77415a(int i, String str) {
        if (this.f96608b == null) {
            this.f96608b = new ArrayList();
        }
        if (this.f96607a == null) {
            this.f96607a = new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":");
        sb.append(str);
        String sb2 = sb.toString();
        if (!this.f96608b.contains(sb2)) {
            this.f96607a.add(sb2);
            this.f96608b.add(sb2);
        }
    }
}
