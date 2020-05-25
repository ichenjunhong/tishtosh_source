package com.p683ss.android.ugc.aweme.base.p1409b.p1410a;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.a */
public class C23477a<T> {

    /* renamed from: a */
    public final String f62546a;

    /* renamed from: b */
    public final T[] f62547b;

    /* renamed from: a */
    public final T mo48644a() {
        if (mo48645b()) {
            return this.f62547b[0];
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo48645b() {
        if (this.f62547b == null || this.f62547b.length == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("action = [");
        sb.append(this.f62546a);
        sb.append("], args = ");
        if (this.f62547b != null) {
            sb.append("[");
            for (int i = 0; i < this.f62547b.length; i++) {
                sb.append(this.f62547b[i]);
                if (i != this.f62547b.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        } else {
            sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
        }
        return sb.toString();
    }

    protected C23477a(String str, T... tArr) {
        this.f62546a = str;
        this.f62547b = tArr;
    }
}
