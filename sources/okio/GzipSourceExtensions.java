package okio;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-GzipSourceExtensions reason: invalid class name */
public final class GzipSourceExtensions {
    public static final boolean getBit(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    public static final GzipSource gzip(Source source) {
        C52711k.m112240b(source, "$receiver");
        return new GzipSource(source);
    }
}
