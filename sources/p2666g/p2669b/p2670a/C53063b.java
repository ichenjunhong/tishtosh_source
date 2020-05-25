package p2666g.p2669b.p2670a;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.C53500ac;
import okhttp3.C53678w;
import okio.Buffer;
import p2666g.C53095e;

/* renamed from: g.b.a.b */
final class C53063b<T> implements C53095e<T, C53500ac> {

    /* renamed from: a */
    private static final C53678w f131555a = C53678w.m114225a("application/json; charset=UTF-8");

    /* renamed from: b */
    private static final Charset f131556b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final C17971f f131557c;

    /* renamed from: d */
    private final C18095w<T> f131558d;

    /* renamed from: a */
    public final /* synthetic */ Object mo110590a(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        C17961c a = this.f131557c.mo34874a((Writer) new OutputStreamWriter(buffer.outputStream(), f131556b));
        this.f131558d.write(a, obj);
        a.close();
        return C53500ac.create(f131555a, buffer.readByteString());
    }

    C53063b(C17971f fVar, C18095w<T> wVar) {
        this.f131557c = fVar;
        this.f131558d = wVar;
    }
}
