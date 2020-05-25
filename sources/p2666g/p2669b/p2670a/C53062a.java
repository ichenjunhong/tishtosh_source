package p2666g.p2669b.p2670a;

import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C53500ac;
import okhttp3.C53506ae;
import p2666g.C53095e;
import p2666g.C53095e.C53096a;
import p2666g.C53134n;

/* renamed from: g.b.a.a */
public final class C53062a extends C53096a {

    /* renamed from: a */
    private final C17971f f131554a;

    /* renamed from: a */
    public static C53062a m112827a() {
        return m112828a(new C17971f());
    }

    private C53062a(C17971f fVar) {
        this.f131554a = fVar;
    }

    /* renamed from: a */
    public static C53062a m112828a(C17971f fVar) {
        if (fVar != null) {
            return new C53062a(fVar);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C53095e<C53506ae, ?> mo110588a(Type type, Annotation[] annotationArr, C53134n nVar) {
        return new C53064c(this.f131554a, this.f131554a.mo34877a(C17956a.m44007a(type)));
    }

    /* renamed from: a */
    public final C53095e<?, C53500ac> mo110589a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C53134n nVar) {
        return new C53063b(this.f131554a, this.f131554a.mo34877a(C17956a.m44007a(type)));
    }
}
