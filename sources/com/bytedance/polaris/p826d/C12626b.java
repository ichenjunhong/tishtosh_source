package com.bytedance.polaris.p826d;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.bytedance.polaris.d.b */
public final class C12626b {

    /* renamed from: a */
    private static C12626b f33185a;

    /* renamed from: b */
    private final Properties f33186b = new Properties();

    /* renamed from: a */
    public static C12626b m25366a() throws IOException {
        if (f33185a == null) {
            f33185a = new C12626b();
        }
        return f33185a;
    }

    private C12626b() throws IOException {
        this.f33186b.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
    }

    /* renamed from: a */
    public final String mo23729a(String str) {
        return this.f33186b.getProperty(str);
    }
}
