package okio;

import java.util.zip.Inflater;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-InflaterSourceExtensions reason: invalid class name */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        C52711k.m112240b(source, "$receiver");
        C52711k.m112240b(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        C52711k.m112240b(source, "$receiver");
        C52711k.m112240b(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
