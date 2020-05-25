package com.facebook.p913b;

import com.facebook.common.p920d.C13689i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.b.b */
public final class C13614b implements C13613a {

    /* renamed from: a */
    public final File f35532a;

    /* renamed from: a */
    public final InputStream mo25466a() throws IOException {
        return new FileInputStream(this.f35532a);
    }

    /* renamed from: b */
    public final long mo25467b() {
        return this.f35532a.length();
    }

    public final int hashCode() {
        return this.f35532a.hashCode();
    }

    private C13614b(File file) {
        this.f35532a = (File) C13689i.m27652a(file);
    }

    /* renamed from: a */
    public static C13614b m27487a(File file) {
        if (file != null) {
            return new C13614b(file);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C13614b)) {
            return false;
        }
        return this.f35532a.equals(((C13614b) obj).f35532a);
    }
}
