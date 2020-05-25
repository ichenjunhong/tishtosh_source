package com.p683ss.android.ugc.tools.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.tools.utils.i */
public final class C50205i {

    /* renamed from: a */
    public static final C50205i f125758a = new C50205i();

    private C50205i() {
    }

    /* renamed from: a */
    private static boolean m108371a(ZipEntry zipEntry) {
        boolean z;
        if (zipEntry != null) {
            CharSequence name = zipEntry.getName();
            if (name == null || name.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String name2 = zipEntry.getName();
                C52711k.m112236a((Object) name2, LeakCanaryFileProvider.f132049i);
                CharSequence charSequence = name2;
                StringBuilder sb = new StringBuilder("..");
                sb.append(File.separator);
                if (!C52830p.m112456b(charSequence, (CharSequence) sb.toString(), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final String m108365a(File file, File file2) throws IOException {
        C52711k.m112240b(file, "source");
        C52711k.m112240b(file2, "destDir");
        try {
            InputStream fileInputStream = new FileInputStream(file);
            String absolutePath = file2.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath, "destDir.absolutePath");
            m108369a(fileInputStream, absolutePath);
            String absolutePath2 = file2.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath2, "destDir.absolutePath");
            return absolutePath2;
        } catch (Exception e) {
            file2.delete();
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static final String m108367a(String str, List<String> list) {
        C52711k.m112240b(str, "dir");
        C52711k.m112240b(list, "filePathList");
        StringBuilder sb = new StringBuilder("ame-extract-frames");
        sb.append(System.currentTimeMillis());
        sb.append(".zip");
        return m108366a(str, sb.toString(), list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ee, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        p2628d.p2638e.C52647c.m112189a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        throw r11;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m108369a(java.io.InputStream r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "inputStream"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "destDir"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r10)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r10 = 0
            r1 = r0
            java.util.zip.ZipInputStream r1 = (java.util.zip.ZipInputStream) r1     // Catch:{ Throwable -> 0x00f0 }
            d.f.b.v$e r2 = new d.f.b.v$e     // Catch:{ Throwable -> 0x00f0 }
            r2.<init>()     // Catch:{ Throwable -> 0x00f0 }
        L_0x001a:
            java.util.zip.ZipEntry r3 = r1.getNextEntry()     // Catch:{ Throwable -> 0x00f0 }
            r2.element = r3     // Catch:{ Throwable -> 0x00f0 }
            if (r3 == 0) goto L_0x00ea
            T r3 = r2.element     // Catch:{ Throwable -> 0x00f0 }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ Throwable -> 0x00f0 }
            if (r3 != 0) goto L_0x002b
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00f0 }
        L_0x002b:
            boolean r3 = m108371a(r3)     // Catch:{ Throwable -> 0x00f0 }
            if (r3 == 0) goto L_0x001a
            T r3 = r2.element     // Catch:{ Throwable -> 0x00f0 }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ Throwable -> 0x00f0 }
            if (r3 != 0) goto L_0x003a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00f0 }
        L_0x003a:
            boolean r3 = r3.isDirectory()     // Catch:{ Throwable -> 0x00f0 }
            if (r3 == 0) goto L_0x006a
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x00f0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f0 }
            r4.<init>()     // Catch:{ Throwable -> 0x00f0 }
            r4.append(r11)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Throwable -> 0x00f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00f0 }
            T r5 = r2.element     // Catch:{ Throwable -> 0x00f0 }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Throwable -> 0x00f0 }
            if (r5 != 0) goto L_0x0058
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00f0 }
        L_0x0058:
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x00f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x00f0 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00f0 }
            r3.mkdirs()     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x001a
        L_0x006a:
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x00f0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f0 }
            r4.<init>()     // Catch:{ Throwable -> 0x00f0 }
            r4.append(r11)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Throwable -> 0x00f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00f0 }
            T r5 = r2.element     // Catch:{ Throwable -> 0x00f0 }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Throwable -> 0x00f0 }
            if (r5 != 0) goto L_0x0082
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00f0 }
        L_0x0082:
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x00f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x00f0 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00f0 }
            java.io.File r4 = r3.getParentFile()     // Catch:{ Throwable -> 0x00f0 }
            boolean r5 = r4.exists()     // Catch:{ Throwable -> 0x00f0 }
            if (r5 != 0) goto L_0x009e
            r4.mkdirs()     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00ab
        L_0x009e:
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x00f0 }
            if (r4 == 0) goto L_0x00a8
            r3.delete()     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00ab
        L_0x00a8:
            r3.createNewFile()     // Catch:{ Throwable -> 0x00f0 }
        L_0x00ab:
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x00f0 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00f0 }
            r5.<init>(r3)     // Catch:{ Throwable -> 0x00f0 }
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ Throwable -> 0x00f0 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x00f0 }
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ Throwable -> 0x00f0 }
            r3 = r4
            java.io.BufferedOutputStream r3 = (java.io.BufferedOutputStream) r3     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            d.f.b.v$c r5 = new d.f.b.v$c     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            r5.<init>()     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
        L_0x00c5:
            int r7 = r1.read(r6)     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            r5.element = r7     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            r8 = -1
            if (r7 == r8) goto L_0x00d5
            r7 = 0
            int r8 = r5.element     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            r3.write(r6, r7, r8)     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            goto L_0x00c5
        L_0x00d5:
            r3.flush()     // Catch:{ Throwable -> 0x00e0, all -> 0x00dd }
            p2628d.p2638e.C52647c.m112189a(r4, r10)     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x001a
        L_0x00dd:
            r11 = move-exception
            r1 = r10
            goto L_0x00e6
        L_0x00e0:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x00e6:
            p2628d.p2638e.C52647c.m112189a(r4, r1)     // Catch:{ Throwable -> 0x00f0 }
            throw r11     // Catch:{ Throwable -> 0x00f0 }
        L_0x00ea:
            p2628d.p2638e.C52647c.m112189a(r0, r10)
            return
        L_0x00ee:
            r11 = move-exception
            goto L_0x00f2
        L_0x00f0:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00ee }
        L_0x00f2:
            p2628d.p2638e.C52647c.m112189a(r0, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.tools.utils.C50205i.m108369a(java.io.InputStream, java.lang.String):void");
    }

    /* renamed from: a */
    public static final String m108366a(String str, String str2, List<String> list) {
        String str3;
        Closeable zipOutputStream;
        Throwable th;
        Throwable th2;
        C52711k.m112240b(str, "dir");
        C52711k.m112240b(str2, "fileName");
        C52711k.m112240b(list, "filePathList");
        if (list.isEmpty()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
            File file = new File(sb.toString());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                ZipOutputStream zipOutputStream2 = (ZipOutputStream) zipOutputStream;
                for (String file2 : list) {
                    File file3 = new File(file2);
                    if (file3.exists()) {
                        if (file3.isDirectory()) {
                            C50205i iVar = f125758a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file3.getName());
                            sb2.append(File.separator);
                            iVar.m108370a(zipOutputStream2, file3, sb2.toString());
                        } else {
                            f125758a.m108370a(zipOutputStream2, file3, "");
                        }
                    }
                }
                zipOutputStream2.flush();
                str3 = file.getAbsolutePath();
                C52647c.m112189a(zipOutputStream, null);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th = r8;
                th2 = th4;
            }
        } catch (Exception unused) {
            str3 = null;
        }
        return str3;
        C52647c.m112189a(zipOutputStream, th);
        throw th2;
    }

    /* renamed from: a */
    public static final void m108368a(Context context, int i, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "destDir");
        if (i != 0 && !TextUtils.isEmpty(str)) {
            Resources resources = context.getResources();
            if (resources != null) {
                InputStream openRawResource = resources.openRawResource(i);
                C52711k.m112236a((Object) openRawResource, "this.openRawResource(rawId)");
                m108369a(openRawResource, str);
            }
        }
    }

    /* renamed from: a */
    private final void m108370a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        Throwable th;
        File[] listFiles;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getName());
                        sb.append(File.separator);
                        sb.append(file2.getName());
                        sb.append(File.separator);
                        m108370a(zipOutputStream, file2, sb.toString());
                    } else {
                        m108370a(zipOutputStream, file2, str);
                    }
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            BufferedInputStream bufferedInputStream2 = (BufferedInputStream) bufferedInputStream;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(file.getName());
            zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
            C52725c cVar = new C52725c();
            while (true) {
                int read = bufferedInputStream2.read(bArr);
                cVar.element = read;
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, cVar.element);
                } else {
                    C52647c.m112189a(bufferedInputStream, null);
                    return;
                }
            }
        } catch (Throwable th2) {
            C52647c.m112189a(bufferedInputStream, th);
            throw th2;
        }
    }
}
