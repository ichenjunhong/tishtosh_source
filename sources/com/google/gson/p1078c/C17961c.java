package com.google.gson.p1078c;

import com.C2240a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.c.c */
public class C17961c implements Closeable, Flushable {

    /* renamed from: d */
    private static final String[] f49863d = new String[128];

    /* renamed from: e */
    private static final String[] f49864e;

    /* renamed from: a */
    public boolean f49865a = true;

    /* renamed from: b */
    public boolean f49866b;

    /* renamed from: c */
    public boolean f49867c;

    /* renamed from: f */
    private final Writer f49868f;

    /* renamed from: g */
    private int[] f49869g = new int[32];

    /* renamed from: h */
    private int f49870h;

    /* renamed from: i */
    private String f49871i;

    /* renamed from: j */
    private String f49872j;

    /* renamed from: k */
    private String f49873k;

    /* renamed from: a */
    public C17961c mo34861a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f49873k != null) {
            throw new IllegalStateException();
        } else if (this.f49870h != 0) {
            this.f49873k = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C17961c mo34862a(boolean z) throws IOException {
        m44050g();
        m44053j();
        this.f49868f.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: g */
    private void m44050g() throws IOException {
        if (this.f49873k != null) {
            m44052i();
            m44049d(this.f49873k);
            this.f49873k = null;
        }
    }

    /* renamed from: c */
    public C17961c mo34865c() throws IOException {
        return m44045a(1, 2, "]");
    }

    /* renamed from: d */
    public C17961c mo34868d() throws IOException {
        m44050g();
        return m44046a(3, "{");
    }

    /* renamed from: e */
    public C17961c mo34869e() throws IOException {
        return m44045a(3, 5, "}");
    }

    /* renamed from: a */
    private int mo34950a() {
        if (this.f49870h != 0) {
            return this.f49869g[this.f49870h - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    private void m44051h() throws IOException {
        if (this.f49871i != null) {
            this.f49868f.write("\n");
            int i = this.f49870h;
            for (int i2 = 1; i2 < i; i2++) {
                this.f49868f.write(this.f49871i);
            }
        }
    }

    /* renamed from: b */
    public C17961c mo34863b() throws IOException {
        m44050g();
        return m44046a(1, "[");
    }

    public void close() throws IOException {
        this.f49868f.close();
        int i = this.f49870h;
        if (i > 1 || (i == 1 && this.f49869g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f49870h = 0;
    }

    /* renamed from: f */
    public C17961c mo34870f() throws IOException {
        if (this.f49873k != null) {
            if (this.f49867c) {
                m44050g();
            } else {
                this.f49873k = null;
                return this;
            }
        }
        m44053j();
        this.f49868f.write(TEVideoRecorder.FACE_BEAUTY_NULL);
        return this;
    }

    public void flush() throws IOException {
        if (this.f49870h != 0) {
            this.f49868f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    private void m44052i() throws IOException {
        int a = mo34950a();
        if (a == 5) {
            this.f49868f.write(44);
        } else if (a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m44051h();
        m44048b(4);
    }

    /* renamed from: j */
    private void m44053j() throws IOException {
        switch (mo34950a()) {
            case 1:
                m44048b(2);
                m44051h();
                return;
            case 2:
                this.f49868f.append(',');
                m44051h();
                return;
            case 4:
                this.f49868f.append(this.f49872j);
                m44048b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f49865a) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        m44048b(7);
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f49863d[i] = C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f49863d[34] = "\\\"";
        f49863d[92] = "\\\\";
        f49863d[9] = "\\t";
        f49863d[8] = "\\b";
        f49863d[10] = "\\n";
        f49863d[13] = "\\r";
        f49863d[12] = "\\f";
        String[] strArr = (String[]) f49863d.clone();
        f49864e = strArr;
        strArr[60] = "\\u003c";
        f49864e[62] = "\\u003e";
        f49864e[38] = "\\u0026";
        f49864e[61] = "\\u003d";
        f49864e[39] = "\\u0027";
    }

    /* renamed from: b */
    private void m44048b(int i) {
        this.f49869g[this.f49870h - 1] = i;
    }

    /* renamed from: c */
    public final void mo34866c(String str) {
        if (str.length() == 0) {
            this.f49871i = null;
            this.f49872j = ":";
            return;
        }
        this.f49871i = str;
        this.f49872j = ": ";
    }

    public C17961c(Writer writer) {
        m44047a(6);
        this.f49872j = ":";
        this.f49867c = true;
        if (writer != null) {
            this.f49868f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: b */
    public C17961c mo34864b(String str) throws IOException {
        if (str == null) {
            return mo34870f();
        }
        m44050g();
        m44053j();
        m44049d(str);
        return this;
    }

    /* renamed from: a */
    private void m44047a(int i) {
        if (this.f49870h == this.f49869g.length) {
            int[] iArr = new int[(this.f49870h * 2)];
            System.arraycopy(this.f49869g, 0, iArr, 0, this.f49870h);
            this.f49869g = iArr;
        }
        int[] iArr2 = this.f49869g;
        int i2 = this.f49870h;
        this.f49870h = i2 + 1;
        iArr2[i2] = i;
    }

    /* renamed from: d */
    private void m44049d(String str) throws IOException {
        String[] strArr;
        String str2;
        if (this.f49866b) {
            strArr = f49864e;
        } else {
            strArr = f49863d;
        }
        this.f49868f.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f49868f.write(str, i, i2 - i);
            }
            this.f49868f.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f49868f.write(str, i, length - i);
        }
        this.f49868f.write("\"");
    }

    /* renamed from: a */
    public C17961c mo34857a(double d) throws IOException {
        m44050g();
        if (this.f49865a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m44053j();
            this.f49868f.append(Double.toString(d));
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C17961c mo34858a(long j) throws IOException {
        m44050g();
        m44053j();
        this.f49868f.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C17961c mo34859a(Boolean bool) throws IOException {
        String str;
        if (bool == null) {
            return mo34870f();
        }
        m44050g();
        m44053j();
        Writer writer = this.f49868f;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: a */
    public C17961c mo34860a(Number number) throws IOException {
        if (number == null) {
            return mo34870f();
        }
        m44050g();
        String obj = number.toString();
        if (this.f49865a || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m44053j();
            this.f49868f.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private C17961c m44046a(int i, String str) throws IOException {
        m44053j();
        m44047a(i);
        this.f49868f.write(str);
        return this;
    }

    /* renamed from: a */
    private C17961c m44045a(int i, int i2, String str) throws IOException {
        int a = mo34950a();
        if (a != i2 && a != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f49873k == null) {
            this.f49870h--;
            if (a == i2) {
                m44051h();
            }
            this.f49868f.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.f49873k);
            throw new IllegalStateException(sb.toString());
        }
    }
}
