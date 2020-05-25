package com.bytedance.android.livesdkapi.p458l.p459a;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.bytedance.android.livesdkapi.l.a.b */
public final class C8836b {

    /* renamed from: a */
    public char[] f24121a;

    /* renamed from: b */
    public int f24122b;

    public final String toString() {
        return new String(this.f24121a, 0, this.f24122b);
    }

    public C8836b(int i) {
        if (i >= 0) {
            this.f24121a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    private void m17347a(int i) {
        char[] cArr = new char[Math.max(this.f24121a.length << 1, i)];
        System.arraycopy(this.f24121a, 0, cArr, 0, this.f24122b);
        this.f24121a = cArr;
    }

    /* renamed from: a */
    public final void mo15822a(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.f24122b + length;
        if (i > this.f24121a.length) {
            m17347a(i);
        }
        str.getChars(0, length, this.f24121a, this.f24122b);
        this.f24122b = i;
    }
}
