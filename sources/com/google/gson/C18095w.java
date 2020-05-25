package com.google.gson;

import com.google.gson.internal.bind.C18002c;
import com.google.gson.internal.bind.C18004d;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.w */
public abstract class C18095w<T> {
    public abstract T read(C17958a aVar) throws IOException;

    public abstract void write(C17961c cVar, T t) throws IOException;

    public final C18095w<T> nullSafe() {
        return new C18095w<T>() {
            public final T read(C17958a aVar) throws IOException {
                if (aVar.mo34843f() != C17960b.NULL) {
                    return C18095w.this.read(aVar);
                }
                aVar.mo34847k();
                return null;
            }

            public final void write(C17961c cVar, T t) throws IOException {
                if (t == null) {
                    cVar.mo34870f();
                } else {
                    C18095w.this.write(cVar, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new C17958a(reader));
    }

    public final T fromJson(String str) throws IOException {
        return fromJson((Reader) new StringReader(str));
    }

    public final T fromJsonTree(C18082l lVar) {
        try {
            return read(new C18002c(lVar));
        } catch (IOException e) {
            throw new C18083m((Throwable) e);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final C18082l toJsonTree(T t) {
        try {
            C18004d dVar = new C18004d();
            write(dVar, t);
            return dVar.mo34950a();
        } catch (IOException e) {
            throw new C18083m((Throwable) e);
        }
    }

    public final void toJson(Writer writer, T t) throws IOException {
        write(new C17961c(writer), t);
    }
}
