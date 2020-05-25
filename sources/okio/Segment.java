package okio;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class Segment {
    public static final Companion Companion = new Companion(null);
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        this.owner = true;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        Segment segment = new Segment(this.data, this.pos, this.limit, true, false);
        return segment;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        Segment segment = new Segment(copyOf, this.pos, this.limit, false, true);
        return segment;
    }

    public final Segment pop() {
        Segment segment;
        if (this.next != this) {
            segment = this.next;
        } else {
            segment = null;
        }
        Segment segment2 = this.prev;
        if (segment2 == null) {
            C52711k.m112234a();
        }
        segment2.next = this.next;
        Segment segment3 = this.next;
        if (segment3 == null) {
            C52711k.m112234a();
        }
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final void compact() {
        boolean z;
        int i = 0;
        if (this.prev != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Segment segment = this.prev;
            if (segment == null) {
                C52711k.m112234a();
            }
            if (segment.owner) {
                int i2 = this.limit - this.pos;
                Segment segment2 = this.prev;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
                int i3 = 8192 - segment2.limit;
                Segment segment3 = this.prev;
                if (segment3 == null) {
                    C52711k.m112234a();
                }
                if (!segment3.shared) {
                    Segment segment4 = this.prev;
                    if (segment4 == null) {
                        C52711k.m112234a();
                    }
                    i = segment4.pos;
                }
                if (i2 <= i3 + i) {
                    Segment segment5 = this.prev;
                    if (segment5 == null) {
                        C52711k.m112234a();
                    }
                    writeTo(segment5, i2);
                    pop();
                    SegmentPool.recycle(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final Segment push(Segment segment) {
        C52711k.m112240b(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        if (segment2 == null) {
            C52711k.m112234a();
        }
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment split(int i) {
        boolean z;
        Segment segment;
        if (i <= 0 || i > this.limit - this.pos) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i >= 1024) {
                segment = sharedCopy();
            } else {
                Segment take = SegmentPool.take();
                Platform.arraycopy(this.data, this.pos, take.data, 0, i);
                segment = take;
            }
            segment.limit = segment.pos + i;
            this.pos += i;
            Segment segment2 = this.prev;
            if (segment2 == null) {
                C52711k.m112234a();
            }
            segment2.push(segment);
            return segment;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void writeTo(Segment segment, int i) {
        C52711k.m112240b(segment, "sink");
        if (segment.owner) {
            if (segment.limit + i > 8192) {
                if (segment.shared) {
                    throw new IllegalArgumentException();
                } else if ((segment.limit + i) - segment.pos <= 8192) {
                    Platform.arraycopy(segment.data, segment.pos, segment.data, 0, segment.limit - segment.pos);
                    segment.limit -= segment.pos;
                    segment.pos = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            Platform.arraycopy(this.data, this.pos, segment.data, segment.limit, i);
            segment.limit += i;
            this.pos += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C52711k.m112240b(bArr, "data");
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }
}
