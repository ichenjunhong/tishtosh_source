package android.support.p030v4.p038f;

import java.io.Writer;

/* renamed from: android.support.v4.f.f */
public final class C0784f extends Writer {

    /* renamed from: a */
    private final String f2682a;

    /* renamed from: b */
    private StringBuilder f2683b = new StringBuilder(128);

    public final void close() {
        m2225a();
    }

    public final void flush() {
        m2225a();
    }

    /* renamed from: a */
    private void m2225a() {
        if (this.f2683b.length() > 0) {
            this.f2683b.delete(0, this.f2683b.length());
        }
    }

    public C0784f(String str) {
        this.f2682a = str;
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m2225a();
            } else {
                this.f2683b.append(c);
            }
        }
    }
}
