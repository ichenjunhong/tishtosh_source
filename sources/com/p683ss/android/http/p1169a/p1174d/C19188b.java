package com.p683ss.android.http.p1169a.p1174d;

import com.p683ss.android.http.p1169a.p1173c.C19185a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.ss.android.http.a.d.b */
public final class C19188b {

    /* renamed from: a */
    public char[] f52888a;

    /* renamed from: b */
    public int f52889b;

    public final String toString() {
        return new String(this.f52888a, 0, this.f52889b);
    }

    /* renamed from: b */
    public final char mo39152b(int i) {
        return this.f52888a[i];
    }

    public C19188b(int i) {
        if (i >= 0) {
            this.f52888a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    public final void mo39149a(char c) {
        int i = this.f52889b + 1;
        if (i > this.f52888a.length) {
            mo39150a(i);
        }
        this.f52888a[this.f52889b] = c;
        this.f52889b = i;
    }

    /* renamed from: a */
    public void mo39150a(int i) {
        char[] cArr = new char[Math.max(this.f52888a.length << 1, i)];
        System.arraycopy(this.f52888a, 0, cArr, 0, this.f52889b);
        this.f52888a = cArr;
    }

    /* renamed from: a */
    public final void mo39151a(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.f52889b + length;
        if (i > this.f52888a.length) {
            mo39150a(i);
        }
        str.getChars(0, length, this.f52888a, this.f52889b);
        this.f52889b = i;
    }

    /* renamed from: a */
    public final String mo39148a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f52889b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.f52888a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public final String mo39153b(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f52889b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && C19185a.m46769a(this.f52888a[i])) {
                i++;
            }
            while (i2 > i && C19185a.m46769a(this.f52888a[i2 - 1])) {
                i2--;
            }
            return new String(this.f52888a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
