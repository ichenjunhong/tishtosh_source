package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.z */
public enum C14367z {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    public static final EnumSet<C14367z> ALL = null;

    /* renamed from: a */
    private final long f37369a;

    public final long getValue() {
        return this.f37369a;
    }

    static {
        ALL = EnumSet.allOf(C14367z.class);
    }

    public static EnumSet<C14367z> parseOptions(long j) {
        EnumSet<C14367z> noneOf = EnumSet.noneOf(C14367z.class);
        Iterator it = ALL.iterator();
        while (it.hasNext()) {
            C14367z zVar = (C14367z) it.next();
            if ((zVar.getValue() & j) != 0) {
                noneOf.add(zVar);
            }
        }
        return noneOf;
    }

    private C14367z(long j) {
        this.f37369a = j;
    }
}
