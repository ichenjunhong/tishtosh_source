package p064c.p065a.p072e.p074b;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.p2692b.C53696d;
import p064c.p065a.C2200u;
import p064c.p065a.p070c.C1702d;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1714i;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p087j.C2134j;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.b.a */
public final class C1723a {

    /* renamed from: a */
    static final C1711f<Object, Object> f5842a = new C1735l();

    /* renamed from: b */
    public static final Runnable f5843b = new C1731h();

    /* renamed from: c */
    public static final C1706a f5844c = new C1728e();

    /* renamed from: d */
    static final C1710e<Object> f5845d = new C1729f();

    /* renamed from: e */
    public static final C1710e<Throwable> f5846e = new C1732i();

    /* renamed from: f */
    public static final C1710e<Throwable> f5847f = new C1743t();

    /* renamed from: g */
    public static final C1714i f5848g = new C1730g();

    /* renamed from: h */
    static final C1715j<Object> f5849h = new C1744u();

    /* renamed from: i */
    static final C1715j<Object> f5850i = new C1733j();

    /* renamed from: j */
    static final Callable<Object> f5851j = new C1742s();

    /* renamed from: k */
    static final Comparator<Object> f5852k = new C1738o();

    /* renamed from: l */
    public static final C1710e<C53696d> f5853l = new C1737n();

    /* renamed from: c.a.e.b.a$a */
    static final class C1724a<T1, T2, R> implements C1711f<Object[], R> {

        /* renamed from: a */
        final C1707b<? super T1, ? super T2, ? extends R> f5854a;

        C1724a(C1707b<? super T1, ? super T2, ? extends R> bVar) {
            this.f5854a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return this.f5854a.mo6200a(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c.a.e.b.a$b */
    public static final class C1725b<T> implements Callable<List<T>> {

        /* renamed from: a */
        final int f5855a;

        public final /* synthetic */ Object call() throws Exception {
            return new ArrayList(this.f5855a);
        }

        public C1725b(int i) {
            this.f5855a = i;
        }
    }

    /* renamed from: c.a.e.b.a$c */
    public static final class C1726c<T, U> implements C1711f<T, U> {

        /* renamed from: a */
        final Class<U> f5856a;

        public C1726c(Class<U> cls) {
            this.f5856a = cls;
        }

        public final U apply(T t) throws Exception {
            return this.f5856a.cast(t);
        }
    }

    /* renamed from: c.a.e.b.a$d */
    static final class C1727d<T, U> implements C1715j<T> {

        /* renamed from: a */
        final Class<U> f5857a;

        C1727d(Class<U> cls) {
            this.f5857a = cls;
        }

        /* renamed from: a */
        public final boolean mo6207a(T t) throws Exception {
            return this.f5857a.isInstance(t);
        }
    }

    /* renamed from: c.a.e.b.a$e */
    static final class C1728e implements C1706a {
        C1728e() {
        }

        /* renamed from: a */
        public final void mo6199a() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: c.a.e.b.a$f */
    static final class C1729f implements C1710e<Object> {
        C1729f() {
        }

        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: c.a.e.b.a$g */
    static final class C1730g implements C1714i {
        C1730g() {
        }
    }

    /* renamed from: c.a.e.b.a$h */
    static final class C1731h implements Runnable {
        C1731h() {
        }

        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: c.a.e.b.a$i */
    static final class C1732i implements C1710e<Throwable> {
        C1732i() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            C2150a.m6492a((Throwable) obj);
        }
    }

    /* renamed from: c.a.e.b.a$j */
    static final class C1733j implements C1715j<Object> {
        C1733j() {
        }

        /* renamed from: a */
        public final boolean mo6207a(Object obj) {
            return false;
        }
    }

    /* renamed from: c.a.e.b.a$k */
    enum C1734k implements Callable<Set<Object>> {
        INSTANCE
    }

    /* renamed from: c.a.e.b.a$l */
    static final class C1735l implements C1711f<Object, Object> {
        C1735l() {
        }

        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: c.a.e.b.a$m */
    static final class C1736m<T, U> implements C1711f<T, U>, Callable<U> {

        /* renamed from: a */
        final U f5860a;

        public final U call() throws Exception {
            return this.f5860a;
        }

        public final U apply(T t) throws Exception {
            return this.f5860a;
        }

        C1736m(U u) {
            this.f5860a = u;
        }
    }

    /* renamed from: c.a.e.b.a$n */
    static final class C1737n implements C1710e<C53696d> {
        C1737n() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            ((C53696d) obj).request(Long.MAX_VALUE);
        }
    }

    /* renamed from: c.a.e.b.a$o */
    static final class C1738o implements Comparator<Object> {
        C1738o() {
        }

        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: c.a.e.b.a$p */
    static final class C1739p<T> implements C1706a {

        /* renamed from: a */
        final C1710e<? super C2200u<T>> f5861a;

        /* renamed from: a */
        public final void mo6199a() throws Exception {
            this.f5861a.accept(C2200u.f7030b);
        }

        C1739p(C1710e<? super C2200u<T>> eVar) {
            this.f5861a = eVar;
        }
    }

    /* renamed from: c.a.e.b.a$q */
    static final class C1740q<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final C1710e<? super C2200u<T>> f5862a;

        C1740q(C1710e<? super C2200u<T>> eVar) {
            this.f5862a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            C1710e<? super C2200u<T>> eVar = this.f5862a;
            C1745b.m6050a(th, "error is null");
            eVar.accept(new C2200u(C2134j.error(th)));
        }
    }

    /* renamed from: c.a.e.b.a$r */
    static final class C1741r<T> implements C1710e<T> {

        /* renamed from: a */
        final C1710e<? super C2200u<T>> f5863a;

        C1741r(C1710e<? super C2200u<T>> eVar) {
            this.f5863a = eVar;
        }

        public final void accept(T t) throws Exception {
            C1710e<? super C2200u<T>> eVar = this.f5863a;
            C1745b.m6050a(t, "value is null");
            eVar.accept(new C2200u(t));
        }
    }

    /* renamed from: c.a.e.b.a$s */
    static final class C1742s implements Callable<Object> {
        C1742s() {
        }

        public final Object call() {
            return null;
        }
    }

    /* renamed from: c.a.e.b.a$t */
    static final class C1743t implements C1710e<Throwable> {
        C1743t() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            C2150a.m6492a((Throwable) new C1702d((Throwable) obj));
        }
    }

    /* renamed from: c.a.e.b.a$u */
    static final class C1744u implements C1715j<Object> {
        C1744u() {
        }

        /* renamed from: a */
        public final boolean mo6207a(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> C1711f<T, T> m6033a() {
        return f5842a;
    }

    /* renamed from: b */
    public static <T> C1710e<T> m6037b() {
        return f5845d;
    }

    /* renamed from: c */
    public static <T> C1715j<T> m6041c() {
        return f5849h;
    }

    /* renamed from: d */
    public static <T> Callable<Set<T>> m6042d() {
        return C1734k.INSTANCE;
    }

    /* renamed from: a */
    public static <T> C1710e<T> m6032a(C1710e<? super C2200u<T>> eVar) {
        return new C1741r(eVar);
    }

    /* renamed from: b */
    public static <T> C1710e<Throwable> m6038b(C1710e<? super C2200u<T>> eVar) {
        return new C1740q(eVar);
    }

    /* renamed from: c */
    public static <T> C1706a m6040c(C1710e<? super C2200u<T>> eVar) {
        return new C1739p(eVar);
    }

    /* renamed from: a */
    public static <T1, T2, R> C1711f<Object[], R> m6034a(C1707b<? super T1, ? super T2, ? extends R> bVar) {
        C1745b.m6050a(bVar, "f is null");
        return new C1724a(bVar);
    }

    /* renamed from: b */
    public static <T, U> C1711f<T, U> m6039b(U u) {
        return new C1736m(u);
    }

    /* renamed from: a */
    public static <T, U> C1715j<T> m6035a(Class<U> cls) {
        return new C1727d(cls);
    }

    /* renamed from: a */
    public static <T> Callable<T> m6036a(T t) {
        return new C1736m(t);
    }
}
