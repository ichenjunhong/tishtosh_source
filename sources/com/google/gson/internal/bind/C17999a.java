package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.a */
public final class C17999a<E> extends C18095w<Object> {

    /* renamed from: a */
    public static final C18097x f49999a = new ArrayTypeAdapter$1();

    /* renamed from: b */
    private final Class<E> f50000b;

    /* renamed from: c */
    private final C18095w<E> f50001c;

    public final Object read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() == C17960b.NULL) {
            aVar.mo34847k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo34837a();
        while (aVar.mo34842e()) {
            arrayList.add(this.f50001c.read(aVar));
        }
        aVar.mo34838b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f50000b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void write(C17961c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo34870f();
            return;
        }
        cVar.mo34863b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f50001c.write(cVar, Array.get(obj, i));
        }
        cVar.mo34865c();
    }

    public C17999a(C17971f fVar, C18095w<E> wVar, Class<E> cls) {
        this.f50001c = new C18011i(fVar, wVar, cls);
        this.f50000b = cls;
    }
}
