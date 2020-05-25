package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C53203ai;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2633b.p2634a.C52617e;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C53331t {
    /* renamed from: a */
    private static final ArrayDeque<StackTraceElement> m113357a(C52617e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(m113351a(stackTraceElement));
        }
        while (true) {
            if (!(eVar instanceof C52617e)) {
                eVar = null;
            }
            if (eVar == null) {
                break;
            }
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(m113351a(stackTraceElement2));
            }
        }
        return arrayDeque;
    }

    /* renamed from: a */
    private static final boolean m113359a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C52711k.m112239a((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && C52711k.m112239a((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && C52711k.m112239a((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    /* renamed from: a */
    private static final void m113358a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m113360b(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                Object last = arrayDeque.getLast();
                C52711k.m112236a(last, "result.last");
                if (m113359a(stackTraceElement, (StackTraceElement) last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m113360b(StackTraceElement stackTraceElement) {
        C52711k.m112240b(stackTraceElement, "receiver$0");
        String className = stackTraceElement.getClassName();
        C52711k.m112236a((Object) className, "className");
        return C52830p.m112410b(className, "\b\b\b", false);
    }

    /* renamed from: a */
    private static StackTraceElement m113352a(String str) {
        C52711k.m112240b(str, "message");
        StringBuilder sb = new StringBuilder("\b\b\b(");
        sb.append(str);
        return new StackTraceElement(sb.toString(), "\b", "\b", -1);
    }

    /* renamed from: b */
    public static final <E extends Throwable> boolean m113361b(E e) {
        if (!C53203ai.f131778b || !C53203ai.f131777a || (e instanceof CancellationException) || (e instanceof C53326o)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static StackTraceElement m113351a(StackTraceElement stackTraceElement) {
        C52711k.m112240b(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        C52711k.m112236a((Object) className, "element.className");
        if (!C52830p.m112453b((CharSequence) className, '/', false)) {
            return stackTraceElement;
        }
        String className2 = stackTraceElement.getClassName();
        C52711k.m112236a((Object) className2, "element.className");
        return new StackTraceElement(C52830p.m112398a(className2, '/', '.', false), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* renamed from: c */
    private static final <E extends Throwable> C52847n<E, StackTraceElement[]> m113362c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C52711k.m112239a((Object) cause.getClass(), (Object) e.getClass())) {
            return C52856t.m112465a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        C52711k.m112236a((Object) stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            C52711k.m112236a((Object) stackTraceElement, "it");
            if (m113360b(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return C52856t.m112465a(cause, stackTrace);
        }
        return C52856t.m112465a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m113353a(E e) {
        C52711k.m112240b(e, "exception");
        if (m113361b(e)) {
            return e;
        }
        Throwable cause = e.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!C52711k.m112239a((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                C52711k.m112236a((Object) stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    C52711k.m112236a((Object) stackTraceElement, "it");
                    if (m113360b(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return e;
                }
                E cause2 = e.getCause();
                if (!(cause2 instanceof Throwable)) {
                    cause2 = null;
                }
                if (cause2 != null) {
                    e = cause2;
                }
                return e;
            }
        }
        return e;
    }

    /* renamed from: a */
    private static final int m113350a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C52711k.m112239a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m113354a(E e, C52617e eVar) {
        C52847n c = m113362c(e);
        E e2 = (Throwable) c.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.component2();
        Throwable a = C53309f.m113303a(e2);
        if (a == null) {
            return e;
        }
        ArrayDeque a2 = m113357a(eVar);
        if (a2.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m113358a(stackTraceElementArr, a2);
        }
        return m113356a(e2, a, a2);
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m113355a(E e, C52625c<?> cVar) {
        C52711k.m112240b(e, "exception");
        C52711k.m112240b(cVar, "continuation");
        if (m113361b(e) || !(cVar instanceof C52617e)) {
            return e;
        }
        return m113354a(e, (C52617e) cVar);
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m113356a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m113352a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        C52711k.m112236a((Object) stackTrace, "causeTrace");
        int a = m113350a(stackTrace, "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        int i = 0;
        if (a == -1) {
            Collection collection = arrayDeque;
            if (collection != null) {
                Object[] array = collection.toArray(new StackTraceElement[0]);
                if (array != null) {
                    e2.setStackTrace((StackTraceElement[]) array);
                    return e2;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new C52857u("null cannot be cast to non-null type java.util.Collection<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }
}
