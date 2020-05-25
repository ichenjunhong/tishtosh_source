package p064c.p065a.p070c;

import p064c.p065a.p072e.p087j.C2131h;

/* renamed from: c.a.c.b */
public final class C1700b {
    /* renamed from: a */
    public static RuntimeException m6016a(Throwable th) {
        throw C2131h.m6422a(th);
    }

    /* renamed from: b */
    public static void m6017b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
