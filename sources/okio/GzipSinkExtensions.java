package okio;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-GzipSinkExtensions reason: invalid class name */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        C52711k.m112240b(sink, "$receiver");
        return new GzipSink(sink);
    }
}
