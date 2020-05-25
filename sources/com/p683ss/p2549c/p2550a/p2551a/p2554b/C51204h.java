package com.p683ss.p2549c.p2550a.p2551a.p2554b;

import android.support.p030v4.p038f.C0777a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.ss.c.a.a.b.h */
final class C51204h {

    /* renamed from: a */
    public final String f127878a;

    /* renamed from: b */
    public C51208k f127879b;

    /* renamed from: c */
    final List<String> f127880c = new ArrayList(10);

    /* renamed from: d */
    public final Map<String, C51206i> f127881d = new C0777a();

    /* renamed from: e */
    final List<String> f127882e = new ArrayList();

    /* renamed from: f */
    public String f127883f = null;

    /* renamed from: g */
    private final Random f127884g;

    /* renamed from: h */
    private C51208k f127885h;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo101731a() {
        if (this.f127882e != null && !this.f127882e.isEmpty()) {
            return (String) this.f127882e.get(this.f127884g.nextInt(this.f127882e.size()));
        }
        if (this.f127885h != null && this.f127885h.f127895b != null && !this.f127885h.f127895b.isEmpty()) {
            return (String) this.f127885h.f127895b.get(this.f127884g.nextInt(this.f127885h.f127895b.size()));
        }
        if (this.f127879b == null || this.f127879b.f127895b == null || this.f127879b.f127895b.isEmpty()) {
            return null;
        }
        return (String) this.f127879b.f127895b.get(this.f127884g.nextInt(this.f127879b.f127895b.size()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo101734b() {
        this.f127880c.clear();
        if (this.f127885h == null || this.f127879b == null) {
            return false;
        }
        if (this.f127885h.f127895b.size() > 5) {
            this.f127880c.addAll(this.f127885h.f127895b.subList(0, 5));
        } else {
            this.f127880c.addAll(this.f127885h.f127895b);
        }
        ArrayList arrayList = new ArrayList(this.f127879b.f127895b);
        arrayList.removeAll(this.f127885h.f127895b);
        int size = 10 - this.f127880c.size();
        if (arrayList.size() >= size) {
            this.f127880c.addAll(arrayList.subList(0, size));
        } else {
            this.f127880c.addAll(arrayList);
            int size2 = 10 - this.f127880c.size();
            if (this.f127885h.f127895b.size() - 5 > size2) {
                this.f127880c.addAll(this.f127885h.f127895b.subList(5, size2 + 5));
            } else if (this.f127885h.f127895b.size() - 5 > 0) {
                this.f127880c.addAll(this.f127885h.f127895b.subList(5, this.f127885h.f127895b.size()));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo101733a(C51208k kVar) {
        this.f127885h = kVar;
        return mo101734b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo101732a(String str) {
        if (this.f127885h.f127895b.contains(str)) {
            return this.f127883f;
        }
        return "local_dns";
    }

    C51204h(String str) {
        this.f127878a = str;
        this.f127884g = new Random(System.currentTimeMillis());
    }
}
