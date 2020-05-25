package okio;

public final class Pipe {
    private final Buffer buffer = new Buffer();
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    /* renamed from: -deprecated_sink reason: not valid java name */
    public final Sink m114645deprecated_sink() {
        return this.sink;
    }

    /* renamed from: -deprecated_source reason: not valid java name */
    public final Source m114646deprecated_source() {
        return this.source;
    }

    public final Buffer getBuffer$jvm() {
        return this.buffer;
    }

    public final long getMaxBufferSize$jvm() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$jvm() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$jvm() {
        return this.sourceClosed;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }

    public final void setSinkClosed$jvm(boolean z) {
        this.sinkClosed = z;
    }

    public final void setSourceClosed$jvm(boolean z) {
        this.sourceClosed = z;
    }

    public Pipe(long j) {
        boolean z;
        this.maxBufferSize = j;
        if (this.maxBufferSize >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.sink = new Pipe$sink$1(this);
            this.source = new Pipe$source$1(this);
            return;
        }
        StringBuilder sb = new StringBuilder("maxBufferSize < 1: ");
        sb.append(this.maxBufferSize);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
