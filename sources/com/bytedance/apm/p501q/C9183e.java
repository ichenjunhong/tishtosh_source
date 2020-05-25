package com.bytedance.apm.p501q;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.apm.q.e */
public class C9183e {

    /* renamed from: a */
    public static final String f25150a = "e";

    /* renamed from: b */
    private static File f25151b;

    /* renamed from: a */
    public static File m18228a() {
        if (f25151b == null) {
            f25151b = Environment.getExternalStorageDirectory();
        }
        return f25151b;
    }

    /* renamed from: a */
    public static void m18229a(List<String> list, String str) throws Exception {
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            try {
                for (String file : list) {
                    File file2 = new File(file);
                    m18230a(zipOutputStream, file2, file2.getName());
                }
                C9184f.m18231a(zipOutputStream);
            } catch (Throwable th) {
                th = th;
                C9184f.m18231a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = null;
            C9184f.m18231a(zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m18230a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        String str2;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
            if (str.length() == 0) {
                str2 = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("/");
                str2 = sb2.toString();
            }
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(listFiles[i].getName());
                m18230a(zipOutputStream, file2, sb3.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                zipOutputStream.write(read);
            } else {
                return;
            }
        }
    }
}
