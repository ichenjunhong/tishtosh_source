package okio;

import p2628d.p2639f.p2641b.C52711k;

public final class SegmentPool {
    public static final SegmentPool INSTANCE = new SegmentPool();
    public static long byteCount;
    public static Segment next;

    private SegmentPool() {
    }

    public static final Segment take() {
        synchronized (INSTANCE) {
            Segment segment = next;
            if (segment == null) {
                return new Segment();
            }
            next = segment.next;
            segment.next = null;
            byteCount -= 8192;
            return segment;
        }
    }

    public static final void recycle(Segment segment) {
        boolean z;
        C52711k.m112240b(segment, "segment");
        if (segment.next == null && segment.prev == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!segment.shared) {
            synchronized (INSTANCE) {
                if (byteCount + 8192 <= 65536) {
                    byteCount += 8192;
                    segment.next = next;
                    segment.limit = 0;
                    segment.pos = segment.limit;
                    next = segment;
                }
            }
        }
    }
}
