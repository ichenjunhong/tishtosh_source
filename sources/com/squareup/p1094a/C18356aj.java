package com.squareup.p1094a;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.System;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.squareup.a.aj */
public final class C18356aj {

    /* renamed from: a */
    static final StringBuilder f50702a = new StringBuilder();

    /* renamed from: com.squareup.a.aj$a */
    static class C18358a {
        /* renamed from: a */
        static int m44605a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.squareup.a.aj$b */
    static class C18359b extends Thread {
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        public C18359b(Runnable runnable) {
            super(runnable);
        }
    }

    /* renamed from: com.squareup.a.aj$c */
    static class C18360c implements ThreadFactory {
        C18360c() {
        }

        public final Thread newThread(Runnable runnable) {
            return new C18359b(runnable);
        }
    }

    /* renamed from: a */
    public static void m44597a() {
        if (!m44602b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: a */
    public static String m44595a(C18409y yVar) {
        String a = m44596a(yVar, f50702a);
        f50702a.setLength(0);
        return a;
    }

    /* renamed from: a */
    private static String m44596a(C18409y yVar, StringBuilder sb) {
        if (yVar.f50844f != null) {
            sb.ensureCapacity(yVar.f50844f.length() + 50);
            sb.append(yVar.f50844f);
        } else if (yVar.f50842d != null) {
            String uri = yVar.f50842d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(yVar.f50843e);
        }
        sb.append(10);
        if (yVar.f50851m != 0.0f) {
            sb.append("rotation:");
            sb.append(yVar.f50851m);
            if (yVar.f50854p) {
                sb.append('@');
                sb.append(yVar.f50852n);
                sb.append('x');
                sb.append(yVar.f50853o);
            }
            sb.append(10);
        }
        if (yVar.mo36871c()) {
            sb.append("resize:");
            sb.append(yVar.f50846h);
            sb.append('x');
            sb.append(yVar.f50847i);
            sb.append(10);
        }
        if (yVar.f50848j) {
            sb.append("centerCrop\n");
        } else if (yVar.f50849k) {
            sb.append("centerInside\n");
        }
        if (yVar.f50845g != null) {
            int size = yVar.f50845g.size();
            for (int i = 0; i < size; i++) {
                sb.append(((C18352ag) yVar.f50845g.get(i)).mo36799a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m44599a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    static boolean m44600a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static void m44598a(Looper looper) {
        C183571 r0 = new Handler(looper) {
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    /* renamed from: b */
    private static boolean m44602b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static C18382l m44590a(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return new C18395u(context);
        } catch (ClassNotFoundException unused) {
            return new C18353ah(context);
        }
    }

    /* renamed from: b */
    static File m44601b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    static boolean m44604c(Context context) {
        try {
            if (System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static int m44587a(Bitmap bitmap) {
        int i;
        if (VERSION.SDK_INT >= 12) {
            i = C18358a.m44605a(bitmap);
        } else {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static long m44588a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: b */
    static byte[] m44603b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    static String m44593a(C18362c cVar) {
        return m44594a(cVar, "");
    }

    /* renamed from: a */
    static <T> T m44591a(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: a */
    static <T> T m44592a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static int m44586a(Resources resources, C18409y yVar) throws FileNotFoundException {
        int i;
        if (yVar.f50843e != 0 || yVar.f50842d == null) {
            return yVar.f50843e;
        }
        String authority = yVar.f50842d.getAuthority();
        if (authority != null) {
            List pathSegments = yVar.f50842d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder("No path segments: ");
                sb.append(yVar.f50842d);
                throw new FileNotFoundException(sb.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Last path segment is not a resource ID: ");
                    sb2.append(yVar.f50842d);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder("More than two path segments: ");
                sb3.append(yVar.f50842d);
                throw new FileNotFoundException(sb3.toString());
            }
            return i;
        }
        StringBuilder sb4 = new StringBuilder("No package provided: ");
        sb4.append(yVar.f50842d);
        throw new FileNotFoundException(sb4.toString());
    }

    /* renamed from: a */
    static Resources m44589a(Context context, C18409y yVar) throws FileNotFoundException {
        if (yVar.f50843e != 0 || yVar.f50842d == null) {
            return context.getResources();
        }
        String authority = yVar.f50842d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("Unable to obtain resources for package: ");
                sb.append(yVar.f50842d);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No package provided: ");
            sb2.append(yVar.f50842d);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    /* renamed from: a */
    static String m44594a(C18362c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C18341a aVar = cVar.f50719k;
        if (aVar != null) {
            sb.append(aVar.f50650b.mo36869a());
        }
        List<C18341a> list = cVar.f50720l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(((C18341a) list.get(i)).f50650b.mo36869a());
            }
        }
        return sb.toString();
    }
}
