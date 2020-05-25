package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26 implements C18097x {
    TypeAdapters$26() {
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (aVar.f49842b != Timestamp.class) {
            return null;
        }
        final C18095w a = fVar.mo34879a(Date.class);
        return new C18095w<Timestamp>() {
            public final /* synthetic */ Object read(C17958a aVar) throws IOException {
                Date date = (Date) a.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            public final /* bridge */ /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
                a.write(cVar, (Timestamp) obj);
            }
        };
    }
}
