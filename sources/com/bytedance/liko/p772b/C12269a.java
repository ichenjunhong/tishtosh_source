package com.bytedance.liko.p772b;

import android.content.Context;
import android.os.Process;
import com.bytedance.liko.p772b.p773a.C12271a;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52647c;
import p2628d.p2638e.C52666o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.liko.b.a */
public final class C12269a {

    /* renamed from: a */
    public static final C12269a f32380a = new C12269a();

    /* renamed from: com.bytedance.liko.b.a$a */
    public static final class C12270a {

        /* renamed from: a */
        private final byte[] f32381a = new byte[1048576];
    }

    private C12269a() {
    }

    /* renamed from: a */
    public static final List<String> m24750a() {
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/fd");
            return C12271a.m24755a(new File(sb.toString()));
        } catch (Throwable unused) {
            return C52575l.m112097a();
        }
    }

    /* renamed from: a */
    public static final void m24753a(File file, String str) {
        Throwable th;
        Throwable th2;
        C52711k.m112240b(str, "fileName");
        if (file != null) {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/maps");
            File file2 = new File(sb.toString());
            StringBuffer stringBuffer = new StringBuffer();
            Closeable fileReader = new FileReader(file2);
            try {
                for (String str2 : C52666o.m112216a((Reader) (FileReader) fileReader)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(10);
                    stringBuffer.append(sb2.toString());
                }
                C52647c.m112189a(fileReader, null);
                Closeable fileWriter = new FileWriter(new File(file, str));
                try {
                    ((FileWriter) fileWriter).write(stringBuffer.toString());
                    C52647c.m112189a(fileWriter, null);
                } catch (Throwable th3) {
                    C52647c.m112189a(fileWriter, th2);
                    throw th3;
                }
            } catch (Throwable th4) {
                C52647c.m112189a(fileReader, th);
                throw th4;
            }
        }
    }

    /* renamed from: a */
    public static final void m24751a(Context context, File file, String str) {
        C52711k.m112240b(str, "fileName");
        System.currentTimeMillis();
        List<String> a = m24750a();
        FileWriter fileWriter = new FileWriter(new File(file, str));
        for (String str2 : a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(10);
            fileWriter.write(sb.toString());
        }
        fileWriter.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006a A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24754b(android.content.Context r8, java.io.File r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "fileName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x000b
        L_0x0009:
            r8 = 0
            goto L_0x0014
        L_0x000b:
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r8 = android.support.p030v4.content.C0726c.m2090a(r8, r2)
            if (r8 != 0) goto L_0x0009
            r8 = 1
        L_0x0014:
            if (r8 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.System.currentTimeMillis()
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)
            int r4 = android.os.Process.myPid()
            r3.append(r4)
            java.lang.String r4 = "/task"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            java.io.File[] r2 = r2.listFiles()
            java.lang.String r3 = "taskFile.listFiles()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            int r4 = r2.length
            r5 = 0
        L_0x004d:
            if (r5 >= r4) goto L_0x006d
            r6 = r2[r5]
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x0064
            java.lang.String r7 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            boolean r7 = r6.isDirectory()
            if (r7 == 0) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            if (r7 == 0) goto L_0x006a
            r3.add(r6)
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x004d
        L_0x006d:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r0 = r3.iterator()
        L_0x0075:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "stat"
            r4.<init>(r2, r5)
            java.lang.String r2 = "statFile"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r2)
            boolean r2 = r4.exists()
            if (r2 != 0) goto L_0x00ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r2.append(r4)
            java.lang.String r4 = " does not exist"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x00c3
        L_0x00ae:
            java.io.FileReader r2 = new java.io.FileReader
            r2.<init>(r4)
            java.io.Reader r2 = (java.io.Reader) r2
            java.util.List r2 = p2628d.p2638e.C52666o.m112216a(r2)
            java.lang.Object r2 = p2628d.p2629a.C52575l.m112118a(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00c3
            java.lang.String r2 = ""
        L_0x00c3:
            r3.append(r2)
            r2 = 10
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r8.append(r2)
            goto L_0x0075
        L_0x00d3:
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r10)
            java.io.FileWriter r9 = new java.io.FileWriter
            r9.<init>(r0)
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = 0
            r0 = r9
            java.io.FileWriter r0 = (java.io.FileWriter) r0     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00f0 }
            r0.write(r8)     // Catch:{ Throwable -> 0x00f0 }
            p2628d.p2638e.C52647c.m112189a(r9, r10)
            return
        L_0x00ee:
            r8 = move-exception
            goto L_0x00f3
        L_0x00f0:
            r8 = move-exception
            r10 = r8
            throw r10     // Catch:{ all -> 0x00ee }
        L_0x00f3:
            p2628d.p2638e.C52647c.m112189a(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.p772b.C12269a.m24754b(android.content.Context, java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    public static final void m24752a(Context context, File file, String str, StackTraceElement[] stackTraceElementArr) {
        C52711k.m112240b(str, "fileName");
        C52711k.m112240b(stackTraceElementArr, "stackTrace");
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis()));
        C52711k.m112236a((Object) format, "dateformat.format(System.currentTimeMillis())");
        List<String> arrayList = new ArrayList<>();
        FileWriter fileWriter = new FileWriter(new File(file, str));
        StringBuilder sb = new StringBuilder("OOM Time:");
        sb.append(format);
        arrayList.add(sb.toString());
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(stackTraceElement.getLineNumber()));
            sb2.append(" className = ");
            sb2.append(stackTraceElement.getClassName());
            sb2.append(", methodName = ");
            sb2.append(stackTraceElement.getMethodName());
            arrayList.add(sb2.toString());
        }
        for (String str2 : arrayList) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(10);
            fileWriter.write(sb3.toString());
        }
        fileWriter.close();
    }
}
