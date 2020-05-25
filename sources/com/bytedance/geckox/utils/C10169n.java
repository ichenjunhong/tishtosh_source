package com.bytedance.geckox.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.geckox.utils.n */
public final class C10169n {

    /* renamed from: a */
    private static byte[] f27500a = {80, 75, 3, 4};

    /* renamed from: b */
    private static byte[] f27501b = {80, 75, 5, 6};

    /* renamed from: a */
    private static boolean m20496a(String str) {
        if (str.startsWith("__MACOSX/") || str.equals(".DS_Store")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m20495a(InputStream inputStream) throws Exception {
        try {
            byte[] bArr = new byte[4];
            boolean z = false;
            if (inputStream.read(bArr, 0, 4) == 4) {
                if (Arrays.equals(f27500a, bArr) || Arrays.equals(f27501b, bArr)) {
                    z = true;
                }
                return z;
            }
            C10152b.m20477a((Closeable) inputStream);
            return false;
        } finally {
            C10152b.m20477a((Closeable) inputStream);
        }
    }

    /* renamed from: a */
    public static void m20494a(InputStream inputStream, String str, String str2) throws Exception {
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            zipInputStream = new ZipInputStream(inputStream);
            boolean z = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        z = true;
                        String name = nextEntry.getName();
                        if (!m20496a(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(File.separator);
                            if (!name.startsWith(sb.toString())) {
                                StringBuilder sb2 = new StringBuilder("zip包最外层文件夹不是channel命名 channel:");
                                sb2.append(str2);
                                throw new RuntimeException(sb2.toString());
                            } else if (nextEntry.isDirectory()) {
                                File file = new File(canonicalPath, name);
                                if (file.getCanonicalPath().startsWith(canonicalPath)) {
                                    file.mkdirs();
                                } else {
                                    StringBuilder sb3 = new StringBuilder("目录穿越, dir:");
                                    sb3.append(name);
                                    sb3.append(", channel:");
                                    sb3.append(str2);
                                    throw new RuntimeException(sb3.toString());
                                }
                            } else {
                                String canonicalPath2 = new File(canonicalPath, name).getCanonicalPath();
                                if (canonicalPath2.startsWith(canonicalPath)) {
                                    File file2 = new File(canonicalPath2);
                                    file2.getParentFile().mkdirs();
                                    try {
                                        fileOutputStream = new FileOutputStream(file2);
                                        C10154d.m20479a(zipInputStream, fileOutputStream);
                                        C10152b.m20477a((Closeable) fileOutputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        C10152b.m20477a((Closeable) fileOutputStream2);
                                        throw th;
                                    }
                                } else {
                                    StringBuilder sb4 = new StringBuilder("目录穿越, file name:");
                                    sb4.append(name);
                                    throw new RuntimeException(sb4.toString());
                                }
                            }
                        }
                    } else if (!z) {
                        inputStream.reset();
                        if (!m20495a(inputStream)) {
                            StringBuilder sb5 = new StringBuilder("不是zip文件  channel:");
                            sb5.append(str2);
                            throw new RuntimeException(sb5.toString());
                        }
                        StringBuilder sb6 = new StringBuilder("未解压 file: channel:");
                        sb6.append(str2);
                        throw new RuntimeException(sb6.toString());
                    } else {
                        C10152b.m20477a((Closeable) zipInputStream);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C10152b.m20477a((Closeable) zipInputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            zipInputStream = null;
            C10152b.m20477a((Closeable) zipInputStream);
            throw th;
        }
    }
}
