package com.bytedance.geckox.p599d;

import com.google.gson.C18086p;
import com.google.gson.C18095w;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.d.a */
public final class C10062a extends C18095w<Boolean> {
    public final /* synthetic */ Object read(C17958a aVar) throws IOException {
        boolean z;
        C17960b f = aVar.mo34843f();
        switch (f) {
            case BOOLEAN:
                return Boolean.valueOf(aVar.mo34846j());
            case NULL:
                aVar.mo34847k();
                return null;
            case NUMBER:
                if (aVar.mo34850n() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                sb.append(f);
                throw new C18086p(sb.toString());
        }
    }

    public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            cVar.mo34870f();
        } else {
            cVar.mo34862a(bool.booleanValue());
        }
    }
}
