package okio;

import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

public final class AsyncTimeout$source$1 implements Source {
    final /* synthetic */ Source $source;
    final /* synthetic */ AsyncTimeout this$0;

    public final AsyncTimeout timeout() {
        return this.this$0;
    }

    public final void close() {
        try {
            this.$source.close();
            this.this$0.exit$jvm(true);
        } catch (IOException e) {
            throw this.this$0.exit$jvm(e);
        } catch (Throwable th) {
            this.this$0.exit$jvm(false);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
        sb.append(this.$source);
        sb.append(')');
        return sb.toString();
    }

    AsyncTimeout$source$1(AsyncTimeout asyncTimeout, Source source) {
        this.this$0 = asyncTimeout;
        this.$source = source;
    }

    public final long read(Buffer buffer, long j) {
        C52711k.m112240b(buffer, "sink");
        this.this$0.enter();
        try {
            long read = this.$source.read(buffer, j);
            this.this$0.exit$jvm(true);
            return read;
        } catch (IOException e) {
            throw this.this$0.exit$jvm(e);
        } catch (Throwable th) {
            this.this$0.exit$jvm(false);
            throw th;
        }
    }
}
