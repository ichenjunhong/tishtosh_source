package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C18061g;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.e */
public final class C18006e extends C18095w<Object> {

    /* renamed from: a */
    public static final C18097x f50016a = new ObjectTypeAdapter$1();

    /* renamed from: b */
    private final C17971f f50017b;

    C18006e(C17971f fVar) {
        this.f50017b = fVar;
    }

    public final Object read(C17958a aVar) throws IOException {
        switch (aVar.mo34843f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                aVar.mo34837a();
                while (aVar.mo34842e()) {
                    arrayList.add(read(aVar));
                }
                aVar.mo34838b();
                return arrayList;
            case BEGIN_OBJECT:
                C18061g gVar = new C18061g();
                aVar.mo34839c();
                while (aVar.mo34842e()) {
                    gVar.put(aVar.mo34844h(), read(aVar));
                }
                aVar.mo34841d();
                return gVar;
            case STRING:
                return aVar.mo34845i();
            case NUMBER:
                return Double.valueOf(aVar.mo34848l());
            case BOOLEAN:
                return Boolean.valueOf(aVar.mo34846j());
            case NULL:
                aVar.mo34847k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void write(C17961c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo34870f();
            return;
        }
        C18095w a = this.f50017b.mo34879a(obj.getClass());
        if (a instanceof C18006e) {
            cVar.mo34868d();
            cVar.mo34869e();
            return;
        }
        a.write(cVar, obj);
    }
}
