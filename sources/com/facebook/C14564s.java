package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.s */
public final class C14564s extends AbstractList<GraphRequest> {

    /* renamed from: g */
    private static AtomicInteger f37838g = new AtomicInteger();

    /* renamed from: a */
    public Handler f37839a;

    /* renamed from: b */
    public List<GraphRequest> f37840b;

    /* renamed from: c */
    public int f37841c;

    /* renamed from: d */
    public final String f37842d;

    /* renamed from: e */
    public List<C14565a> f37843e;

    /* renamed from: f */
    public String f37844f;

    /* renamed from: com.facebook.s$a */
    public interface C14565a {
        /* renamed from: a */
        void mo25465a(C14564s sVar);
    }

    /* renamed from: com.facebook.s$b */
    public interface C14566b extends C14565a {
    }

    /* renamed from: b */
    private C14563r m29816b() {
        return GraphRequest.m27282b(this);
    }

    /* renamed from: a */
    public final C14563r mo26802a() {
        return m29816b();
    }

    public final void clear() {
        this.f37840b.clear();
    }

    public final int size() {
        return this.f37840b.size();
    }

    public C14564s() {
        this.f37840b = new ArrayList();
        this.f37841c = 0;
        this.f37842d = Integer.valueOf(f37838g.incrementAndGet()).toString();
        this.f37843e = new ArrayList();
        this.f37840b = new ArrayList();
    }

    /* renamed from: a */
    public final GraphRequest get(int i) {
        return (GraphRequest) this.f37840b.get(i);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.f37840b.add((GraphRequest) obj);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return (GraphRequest) this.f37840b.remove(i);
    }

    /* renamed from: a */
    public final void mo26803a(C14565a aVar) {
        if (!this.f37843e.contains(aVar)) {
            this.f37843e.add(aVar);
        }
    }

    public C14564s(Collection<GraphRequest> collection) {
        this.f37840b = new ArrayList();
        this.f37841c = 0;
        this.f37842d = Integer.valueOf(f37838g.incrementAndGet()).toString();
        this.f37843e = new ArrayList();
        this.f37840b = new ArrayList(collection);
    }

    public C14564s(GraphRequest... graphRequestArr) {
        this.f37840b = new ArrayList();
        this.f37841c = 0;
        this.f37842d = Integer.valueOf(f37838g.incrementAndGet()).toString();
        this.f37843e = new ArrayList();
        this.f37840b = Arrays.asList(graphRequestArr);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        this.f37840b.add(i, (GraphRequest) obj);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return (GraphRequest) this.f37840b.set(i, (GraphRequest) obj);
    }
}
