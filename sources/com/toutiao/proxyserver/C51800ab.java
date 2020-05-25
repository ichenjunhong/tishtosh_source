package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p2614f.C51838d;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.toutiao.proxyserver.ab */
final class C51800ab {

    /* renamed from: a */
    public List<String> f129260a;

    /* renamed from: b */
    public final ArrayDeque<C51801a> f129261b;

    /* renamed from: c */
    private final ArrayDeque<C51801a> f129262c;

    /* renamed from: com.toutiao.proxyserver.ab$a */
    class C51801a {

        /* renamed from: a */
        final String f129263a;

        /* renamed from: b */
        boolean f129264b = true;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo107295a() {
            if (this.f129264b) {
                C51800ab.this.f129261b.addLast(this);
                this.f129264b = false;
            }
        }

        C51801a(String str) {
            this.f129263a = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo107293a() {
        if (!this.f129262c.isEmpty() || !this.f129261b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C51801a mo107294b() {
        if (!this.f129262c.isEmpty()) {
            return (C51801a) this.f129262c.removeFirst();
        }
        if (!this.f129261b.isEmpty()) {
            return (C51801a) this.f129261b.removeFirst();
        }
        throw new NoSuchElementException();
    }

    C51800ab(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("urls is empty");
        }
        int size = list.size();
        this.f129260a = list;
        this.f129262c = new ArrayDeque<>(size);
        this.f129261b = new ArrayDeque<>(size);
        for (String str : list) {
            if (C51838d.m111182a(str)) {
                this.f129262c.add(new C51801a(str));
            }
        }
    }
}
