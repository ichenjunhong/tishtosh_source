package com.google.firebase.components;

import com.google.firebase.p1072a.C17845a;
import com.google.firebase.p1072a.C17846b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.p */
final /* synthetic */ class C17880p implements Runnable {

    /* renamed from: a */
    private final Entry f49675a;

    /* renamed from: b */
    private final C17845a f49676b;

    C17880p(Entry entry, C17845a aVar) {
        this.f49675a = entry;
        this.f49676b = aVar;
    }

    public final void run() {
        Entry entry = this.f49675a;
        ((C17846b) entry.getKey()).mo34667a(this.f49676b);
    }
}
