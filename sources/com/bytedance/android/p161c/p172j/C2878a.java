package com.bytedance.android.p161c.p172j;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.android.c.j.a */
public final class C2878a {
    /* renamed from: a */
    public static InputStream m8176a(File file, String str) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        Enumeration entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (str.equals(zipEntry.getName())) {
                return zipFile.getInputStream(zipEntry);
            }
        }
        return null;
    }
}
