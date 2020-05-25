package com.bytedance.android.livesdk.p279af;

import com.bytedance.common.utility.C9431p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.android.livesdk.af.m */
public final class C4603m {
    /* renamed from: a */
    public static boolean m11049a(File file) {
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return file.delete();
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m11049a(file2);
            } else {
                file2.delete();
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static void m11048a(String str, String str2) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        StringBuilder sb = new StringBuilder("..");
        sb.append(File.separator);
        String sb2 = sb.toString();
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!C9431p.m18664a(name) && name.contains(sb2)) {
                    throw new IOException("Unzip maybe be unsafe.");
                } else if (nextEntry.isDirectory()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(File.separator);
                    sb3.append(name);
                    new File(sb3.toString()).mkdirs();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(File.separator);
                    sb4.append(name);
                    File file = new File(sb4.toString());
                    if (file.exists()) {
                        file.delete();
                    } else {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
