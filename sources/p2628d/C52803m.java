package p2628d;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.m */
public final class C52803m extends Error {
    public C52803m() {
        this(null, 1, null);
    }

    public C52803m(String str) {
        C52711k.m112240b(str, "message");
        super(str);
    }

    public /* synthetic */ C52803m(String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "An operation is not implemented.";
        }
        this(str);
    }
}
