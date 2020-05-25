package p2666g.p2669b.p2671b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C53500ac;
import okhttp3.C53506ae;
import p2666g.C53095e;
import p2666g.C53095e.C53096a;
import p2666g.C53134n;

/* renamed from: g.b.b.a */
public final class C53065a extends C53096a {
    /* renamed from: a */
    public final C53095e<C53506ae, ?> mo110588a(Type type, Annotation[] annotationArr, C53134n nVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C53067c(ProtoAdapter.get(cls));
    }

    /* renamed from: a */
    public final C53095e<?, C53500ac> mo110589a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C53134n nVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C53066b(ProtoAdapter.get(cls));
    }
}
