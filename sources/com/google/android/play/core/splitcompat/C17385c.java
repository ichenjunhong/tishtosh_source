package com.google.android.play.core.splitcompat;

import java.io.File;

/* renamed from: com.google.android.play.core.splitcompat.c */
final class C17385c extends C17400r {

    /* renamed from: a */
    private final File f48913a;

    /* renamed from: b */
    private final String f48914b;

    C17385c(File file, String str) {
        if (file != null) {
            this.f48913a = file;
            if (str != null) {
                this.f48914b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo33690a() {
        return this.f48913a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo33691b() {
        return this.f48914b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17400r) {
            C17400r rVar = (C17400r) obj;
            return this.f48913a.equals(rVar.mo33690a()) && this.f48914b.equals(rVar.mo33691b());
        }
    }

    public final int hashCode() {
        return ((this.f48913a.hashCode() ^ 1000003) * 1000003) ^ this.f48914b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48913a);
        String str = this.f48914b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(str).length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
