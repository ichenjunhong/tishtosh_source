package p2628d.p2639f.p2641b;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.C52693b;
import p2628d.p2648k.C52759b;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52773k;
import p2628d.p2648k.C52774l;

/* renamed from: d.f.b.c */
public abstract class C52702c implements C52759b, Serializable {
    public static final Object NO_RECEIVER = C52703a.f130964a;
    protected final Object receiver;
    private transient C52759b reflected;

    /* renamed from: d.f.b.c$a */
    static class C52703a implements Serializable {

        /* renamed from: a */
        public static final C52703a f130964a = new C52703a();

        private C52703a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f130964a;
        }
    }

    /* access modifiers changed from: protected */
    public abstract C52759b computeReflected();

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public C52702c() {
        this(NO_RECEIVER);
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public C52761d getOwner() {
        throw new AbstractMethodError();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public C52759b compute() {
        C52759b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C52759b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C52759b getReflected() {
        C52759b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C52693b();
    }

    public C52773k getReturnType() {
        return getReflected().getReturnType();
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C52774l getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C52702c(Object obj) {
        this.receiver = obj;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }
}
