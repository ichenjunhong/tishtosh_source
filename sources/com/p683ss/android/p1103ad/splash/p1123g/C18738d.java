package com.p683ss.android.p1103ad.splash.p1123g;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.ad.splash.g.d */
public final class C18738d {
    /* renamed from: a */
    private static void m45687a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m45685a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0;
        }
        return file.length() / 1024;
    }

    /* renamed from: a */
    public static long m45684a(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory() || file.listFiles() == null) {
            j = file.length() / 1024;
        } else {
            for (File a : file.listFiles()) {
                j += m45684a(a);
            }
        }
        return j;
    }

    /* renamed from: b */
    public static String m45690b(String str) {
        String str2;
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                str2 = m45686a((InputStream) fileInputStream);
                m45687a((Closeable) fileInputStream);
            } catch (Exception unused) {
                m45687a((Closeable) fileInputStream);
                str2 = null;
                return str2;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                m45687a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            m45687a((Closeable) fileInputStream);
            str2 = null;
            return str2;
        } catch (Throwable th2) {
            th = th2;
            m45687a((Closeable) fileInputStream2);
            throw th;
        }
        return str2;
    }

    /* renamed from: a */
    private static String m45686a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            } catch (Exception e) {
                new StringBuilder("Exception:").append(e);
            } catch (Throwable th) {
                m45687a((Closeable) bufferedReader);
                throw th;
            }
        }
        m45687a((Closeable) bufferedReader);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m45689a(File file, long j) {
        if (file == null || j <= 0 || System.currentTimeMillis() - file.lastModified() > j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m45688a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            File file = new File(str2);
            if (file.exists() || file.mkdir()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str3);
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(sb.toString(), false);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        fileOutputStream2.flush();
                        m45687a((Closeable) fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        try {
                            new StringBuilder("Exception:").append(e);
                            m45687a((Closeable) fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            m45687a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        m45687a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    new StringBuilder("Exception:").append(e);
                    m45687a((Closeable) fileOutputStream);
                }
            }
        }
    }
}
