package com.bytedance.android.live.core.p230g;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.android.live.core.g.i */
public final class C3895i {
    /* renamed from: b */
    private static boolean m9850b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m9847a() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = null;
        }
        if ("mounted".equals(str) || "mounted_ro".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m9848a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    /* renamed from: a */
    public static File m9845a(Context context) {
        if (!m9847a() || !m9850b()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(context.getPackageName());
        sb.append("/cache");
        File file = new File(sb.toString());
        m9848a(file);
        return file;
    }

    /* renamed from: a */
    public static boolean m9849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static void m9846a(String str, String str2) throws IOException {
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
