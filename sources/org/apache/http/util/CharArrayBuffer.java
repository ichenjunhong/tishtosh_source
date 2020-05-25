package org.apache.http.util;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

public final class CharArrayBuffer {
    private char[] buffer;
    private int len;

    public final void clear() {
        this.len = 0;
    }

    public final String toString() {
        return new String(this.buffer, 0, this.len);
    }

    public CharArrayBuffer(int i) {
        if (i >= 0) {
            this.buffer = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void expand(int i) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
    }

    public final void append(char c) {
        int i = this.len + 1;
        if (i > this.buffer.length) {
            expand(i);
        }
        this.buffer[this.len] = c;
        this.len = i;
    }

    public final void ensureCapacity(int i) {
        if (i > 0 && i > this.buffer.length - this.len) {
            expand(this.len + i);
        }
    }

    public final void append(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.len + length;
        if (i > this.buffer.length) {
            expand(i);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i;
    }
}
