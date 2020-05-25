package com.google.gson;

import com.google.gson.internal.C18072k;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17962d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: com.google.gson.q */
public final class C18087q {
    /* renamed from: a */
    public final C18082l mo35029a(String str) throws C18091u {
        return m44305a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    private C18082l m44305a(Reader reader) throws C18083m, C18091u {
        try {
            C17958a aVar = new C17958a(reader);
            C18082l a = m44304a(aVar);
            if (!a.mo35008l()) {
                if (aVar.mo34843f() != C17960b.END_DOCUMENT) {
                    throw new C18091u("Did not consume the entire document.");
                }
            }
            return a;
        } catch (C17962d e) {
            throw new C18091u((Throwable) e);
        } catch (IOException e2) {
            throw new C18083m((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new C18091u((Throwable) e3);
        }
    }

    /* renamed from: a */
    private static C18082l m44304a(C17958a aVar) throws C18083m, C18091u {
        boolean z = aVar.f49847a;
        aVar.f49847a = true;
        try {
            C18082l a = C18072k.m44265a(aVar);
            aVar.f49847a = z;
            return a;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder("Failed parsing JSON source: ");
            sb.append(aVar);
            sb.append(" to Json");
            throw new C18086p(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder("Failed parsing JSON source: ");
            sb2.append(aVar);
            sb2.append(" to Json");
            throw new C18086p(sb2.toString(), e2);
        } catch (Throwable th) {
            aVar.f49847a = z;
            throw th;
        }
    }
}
