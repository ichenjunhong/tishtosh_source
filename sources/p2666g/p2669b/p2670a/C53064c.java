package p2666g.p2669b.p2670a;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import java.io.IOException;
import okhttp3.C53506ae;
import p2666g.C53095e;

/* renamed from: g.b.a.c */
final class C53064c<T> implements C53095e<C53506ae, T> {

    /* renamed from: a */
    private final C17971f f131559a;

    /* renamed from: b */
    private final C18095w<T> f131560b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo110590a(C53506ae aeVar) throws IOException {
        try {
            return this.f131560b.read(this.f131559a.mo34873a(aeVar.charStream()));
        } finally {
            aeVar.close();
        }
    }

    C53064c(C17971f fVar, C18095w<T> wVar) {
        this.f131559a = fVar;
        this.f131560b = wVar;
    }
}
