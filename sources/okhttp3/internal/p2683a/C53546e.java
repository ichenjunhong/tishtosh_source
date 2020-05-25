package okhttp3.internal.p2683a;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* renamed from: okhttp3.internal.a.e */
class C53546e extends ForwardingSink {

    /* renamed from: a */
    private boolean f132680a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111362a(IOException iOException) {
    }

    public void close() throws IOException {
        if (!this.f132680a) {
            try {
                super.close();
            } catch (IOException e) {
                this.f132680a = true;
                mo111362a(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.f132680a) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f132680a = true;
                mo111362a(e);
            }
        }
    }

    C53546e(Sink sink) {
        super(sink);
    }

    public void write(Buffer buffer, long j) throws IOException {
        if (this.f132680a) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.f132680a = true;
            mo111362a(e);
        }
    }
}
