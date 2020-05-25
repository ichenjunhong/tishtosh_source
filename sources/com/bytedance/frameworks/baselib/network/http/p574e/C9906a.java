package com.bytedance.frameworks.baselib.network.http.p574e;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.a */
public final class C9906a {

    /* renamed from: a */
    public char[] f26973a = new char[32];

    /* renamed from: b */
    public int f26974b;

    public final String toString() {
        return new String(this.f26973a, 0, this.f26974b);
    }

    public C9906a(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17839a(int i) {
        char[] cArr = new char[Math.max(this.f26973a.length << 1, i)];
        System.arraycopy(this.f26973a, 0, cArr, 0, this.f26974b);
        this.f26973a = cArr;
    }

    /* renamed from: a */
    public final void mo17840a(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.f26974b + length;
        if (i > this.f26973a.length) {
            mo17839a(i);
        }
        str.getChars(0, length, this.f26973a, this.f26974b);
        this.f26974b = i;
    }
}
