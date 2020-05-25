package okio;

import java.util.zip.Deflater;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-DeflaterSinkExtensions reason: invalid class name */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        C52711k.m112240b(sink, "$receiver");
        C52711k.m112240b(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        C52711k.m112240b(sink, "$receiver");
        C52711k.m112240b(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
