package com.p683ss.android.ugc.aweme.utils;

import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.ei */
public final class C47850ei extends C18095w<String> {
    public final /* synthetic */ Object read(C17958a aVar) throws IOException {
        C17960b f = aVar.mo34843f();
        switch (f) {
            case NULL:
                aVar.mo34847k();
                return null;
            case STRING:
                String i = aVar.mo34845i();
                if (i.contains("\r\n")) {
                    i = i.replaceAll("\r\n", "\n");
                }
                return i;
            default:
                StringBuilder sb = new StringBuilder("expect STRING, but got ");
                sb.append(f.name());
                sb.append(" at ");
                sb.append(aVar.mo34852p());
                throw new C18091u(sb.toString());
        }
    }

    public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
        cVar.mo34864b((String) obj);
    }
}
