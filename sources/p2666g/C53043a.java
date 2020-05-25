package p2666g;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C53500ac;
import okhttp3.C53506ae;
import p2666g.C53095e.C53096a;
import p2666g.p2672c.C53092w;

/* renamed from: g.a */
final class C53043a extends C53096a {

    /* renamed from: g.a$a */
    static final class C53044a implements C53095e<C53506ae, C53506ae> {

        /* renamed from: a */
        static final C53044a f131525a = new C53044a();

        C53044a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo110590a(Object obj) throws IOException {
            return m112806a((C53506ae) obj);
        }

        /* renamed from: a */
        private static C53506ae m112806a(C53506ae aeVar) throws IOException {
            try {
                return C53139p.m112961a(aeVar);
            } finally {
                aeVar.close();
            }
        }
    }

    /* renamed from: g.a$b */
    static final class C53045b implements C53095e<C53500ac, C53500ac> {

        /* renamed from: a */
        static final C53045b f131526a = new C53045b();

        C53045b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo110590a(Object obj) throws IOException {
            return (C53500ac) obj;
        }
    }

    /* renamed from: g.a$c */
    static final class C53046c implements C53095e<C53506ae, C53506ae> {

        /* renamed from: a */
        static final C53046c f131527a = new C53046c();

        C53046c() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo110590a(Object obj) throws IOException {
            return (C53506ae) obj;
        }
    }

    /* renamed from: g.a$d */
    static final class C53047d implements C53095e<Object, String> {

        /* renamed from: a */
        static final C53047d f131528a = new C53047d();

        C53047d() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo110590a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* renamed from: g.a$e */
    static final class C53048e implements C53095e<C53506ae, Void> {

        /* renamed from: a */
        static final C53048e f131529a = new C53048e();

        C53048e() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo110590a(Object obj) throws IOException {
            ((C53506ae) obj).close();
            return null;
        }
    }

    C53043a() {
    }

    /* renamed from: a */
    public final C53095e<C53506ae, ?> mo110588a(Type type, Annotation[] annotationArr, C53134n nVar) {
        if (type == C53506ae.class) {
            Class<C53092w> cls = C53092w.class;
            int length = annotationArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (cls.isInstance(annotationArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return C53046c.f131527a;
            }
            return C53044a.f131525a;
        } else if (type == Void.class) {
            return C53048e.f131529a;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final C53095e<?, C53500ac> mo110589a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C53134n nVar) {
        if (C53500ac.class.isAssignableFrom(C53139p.m112956a(type))) {
            return C53045b.f131526a;
        }
        return null;
    }
}
