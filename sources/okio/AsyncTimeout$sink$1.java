package okio;

import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

public final class AsyncTimeout$sink$1 implements Sink {
    final /* synthetic */ Sink $sink;
    final /* synthetic */ AsyncTimeout this$0;

    public final AsyncTimeout timeout() {
        return this.this$0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
        sb.append(this.$sink);
        sb.append(')');
        return sb.toString();
    }

    public final void close() {
        this.this$0.enter();
        try {
            this.$sink.close();
            this.this$0.exit$jvm(true);
        } catch (IOException e) {
            throw this.this$0.exit$jvm(e);
        } catch (Throwable th) {
            this.this$0.exit$jvm(false);
            throw th;
        }
    }

    public final void flush() {
        this.this$0.enter();
        try {
            this.$sink.flush();
            this.this$0.exit$jvm(true);
        } catch (IOException e) {
            throw this.this$0.exit$jvm(e);
        } catch (Throwable th) {
            this.this$0.exit$jvm(false);
            throw th;
        }
    }

    AsyncTimeout$sink$1(AsyncTimeout asyncTimeout, Sink sink) {
        this.this$0 = asyncTimeout;
        this.$sink = sink;
    }

    public final void write(Buffer buffer, long j) {
        C52711k.m112240b(buffer, "source");
        Util.checkOffsetAndCount(buffer.size(), 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                Segment segment = buffer.head;
                if (segment == null) {
                    C52711k.m112234a();
                }
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (segment.limit - segment.pos);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    segment = segment.next;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                }
                this.this$0.enter();
                try {
                    this.$sink.write(buffer, j2);
                    j -= j2;
                    this.this$0.exit$jvm(true);
                } catch (IOException e) {
                    throw this.this$0.exit$jvm(e);
                } catch (Throwable th) {
                    this.this$0.exit$jvm(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
