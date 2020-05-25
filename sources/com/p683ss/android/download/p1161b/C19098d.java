package com.p683ss.android.download.p1161b;

import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: com.ss.android.download.b.d */
public final class C19098d extends PrintWriter {

    /* renamed from: a */
    public final String f52585a;

    /* renamed from: b */
    public StringBuilder f52586b;

    /* renamed from: c */
    public char[] f52587c;

    /* renamed from: d */
    private final int f52588d;

    /* renamed from: e */
    private int f52589e;

    /* renamed from: f */
    private boolean f52590f;

    /* renamed from: a */
    private void m46516a() {
        if (this.f52590f) {
            this.f52590f = false;
            if (this.f52586b.length() != 0) {
                if (this.f52587c == null) {
                    this.f52587c = this.f52586b.toString().toCharArray();
                }
                super.write(this.f52587c, 0, this.f52587c.length);
            }
        }
    }

    public C19098d(Writer writer, String str) {
        this(writer, str, -1);
    }

    /* renamed from: a */
    public final void mo39017a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=");
        sb.append(String.valueOf(obj));
        sb.append(" ");
        print(sb.toString());
    }

    private C19098d(Writer writer, String str, int i) {
        super(writer);
        this.f52586b = new StringBuilder();
        this.f52590f = true;
        this.f52585a = str;
        this.f52588d = -1;
    }

    public final void write(char[] cArr, int i, int i2) {
        int length = this.f52586b.length();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int i5 = i + 1;
            char c = cArr[i];
            this.f52589e++;
            if (c == 10) {
                m46516a();
                super.write(cArr, i4, i5 - i4);
                this.f52590f = true;
                this.f52589e = 0;
                i4 = i5;
            }
            if (this.f52588d > 0 && this.f52589e >= this.f52588d - length) {
                if (!this.f52590f) {
                    super.write(10);
                    this.f52590f = true;
                    this.f52589e = i5 - i4;
                } else {
                    m46516a();
                    super.write(cArr, i4, i5 - i4);
                    super.write(10);
                    this.f52590f = true;
                    this.f52589e = 0;
                    i4 = i5;
                }
            }
            i = i5;
        }
        if (i4 != i) {
            m46516a();
            super.write(cArr, i4, i - i4);
        }
    }
}
