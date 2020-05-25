package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29387c;
import com.p683ss.android.ugc.aweme.emoji.utils.C29476f;
import com.p683ss.android.ugc.aweme.emoji.utils.C29481i;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2629a.C52579p.C52580a;
import p2628d.p2638e.C52646b;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.c */
public final class C29393c {

    /* renamed from: a */
    public static final C29393c f76991a = new C29393c();

    /* renamed from: b */
    private static final String f76992b;

    /* renamed from: c */
    private static final String f76993c;

    /* renamed from: d */
    private static final int f76994d = C23728o.m58241a(32.0d);

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.c$a */
    static final class C29394a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String[] f76995a;

        C29394a(String[] strArr) {
            this.f76995a = strArr;
        }

        public final boolean accept(File file, String str) {
            String[] strArr = this.f76995a;
            C52711k.m112236a((Object) str, "fileName");
            if (!C52568f.m112077a((Object[]) strArr, (Object) C52830p.m112432a(str, (CharSequence) ".zip"))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.c$b */
    static final class C29395b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ List f76996a;

        C29395b(List list) {
            this.f76996a = list;
        }

        public final boolean accept(File file, String str) {
            return this.f76996a.contains(str);
        }
    }

    private C29393c() {
    }

    /* renamed from: a */
    public static String m69300a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f76993c);
        sb.append("tmp/");
        return sb.toString();
    }

    static {
        StringBuilder sb = new StringBuilder("/data/data/");
        sb.append(C11010c.m22280a().getPackageName());
        sb.append('/');
        f76992b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f76992b);
        sb2.append("small_emoji_res/");
        f76993c = sb2.toString();
    }

    /* renamed from: a */
    private static Bitmap m69299a(File file) {
        return BitmapUtils.decodeBitmap(file, f76994d);
    }

    /* renamed from: a */
    public static String m69301a(String str) {
        C52711k.m112240b(str, "md5");
        StringBuilder sb = new StringBuilder();
        sb.append(f76993c);
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo59458b(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        C52711k.m112236a((Object) file2, "child");
                        if (file2.isDirectory()) {
                            String path = file2.getPath();
                            C52711k.m112236a((Object) path, "child.path");
                            mo59458b(path);
                        } else {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        }
    }

    /* renamed from: c */
    public final C29387c mo59459c(String str) {
        C29387c cVar;
        boolean z;
        C52711k.m112240b(str, "md5");
        File file = new File(m69301a(str));
        if (!file.exists() || !file.isDirectory()) {
            C32458a.m75144a("OnlineEmojiFileHelper loadCache, cacheDir not exist");
            return null;
        }
        File[] listFiles = file.listFiles();
        boolean z2 = true;
        if (listFiles != null) {
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            C32458a.m75144a("OnlineEmojiFileHelper loadCache, cacheDirFileList is empty");
            return null;
        }
        File file2 = listFiles[0];
        File file3 = new File(file2, "info.json");
        if (!file3.exists() || !file3.isFile()) {
            C32458a.m75144a("OnlineEmojiFileHelper loadCache, infoFile not exist");
            return null;
        }
        String a = C29476f.m69555a(file3);
        if (TextUtils.isEmpty(a)) {
            C32458a.m75144a("OnlineEmojiFileHelper loadCache, infoJsonStr is empty");
            return null;
        }
        try {
            cVar = (C29387c) C29481i.m69567a(a, C29387c.class);
        } catch (Throwable th) {
            C32458a.m75148a(th);
            cVar = null;
        }
        if (cVar == null) {
            C32458a.m75144a("OnlineEmojiFileHelper loadCache resultResInfo is null");
            return null;
        }
        cVar.setMd5(str);
        C52711k.m112236a((Object) file2, "resourceDir");
        String absolutePath = file2.getAbsolutePath();
        C52711k.m112236a((Object) absolutePath, "resourceDir.absolutePath");
        cVar.setResDirPath(absolutePath);
        String absolutePath2 = new File(file2, "static/").getAbsolutePath();
        C52711k.m112236a((Object) absolutePath2, "File(resourceDir, STATIC…LE_DIR_PATH).absolutePath");
        cVar.setPicFileDirPath(absolutePath2);
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo59455a(java.lang.String... r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "whiteMd5"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)     // Catch:{ all -> 0x0054 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = f76993c     // Catch:{ all -> 0x0054 }
            r0.<init>(r1)     // Catch:{ all -> 0x0054 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0052
            boolean r1 = r0.isDirectory()     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x001a
            goto L_0x0052
        L_0x001a:
            com.ss.android.ugc.aweme.emoji.h.a.c$a r1 = new com.ss.android.ugc.aweme.emoji.h.a.c$a     // Catch:{ all -> 0x0054 }
            r1.<init>(r6)     // Catch:{ all -> 0x0054 }
            java.io.FilenameFilter r1 = (java.io.FilenameFilter) r1     // Catch:{ all -> 0x0054 }
            java.io.File[] r6 = r0.listFiles(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "cacheDir.listFiles { _, …ix(SUFFIX_ZIP))\n        }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)     // Catch:{ all -> 0x0054 }
            int r0 = r6.length     // Catch:{ all -> 0x0054 }
            r1 = 0
        L_0x002c:
            if (r1 >= r0) goto L_0x0050
            r2 = r6[r1]     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ all -> 0x0054 }
            boolean r3 = r2.isDirectory()     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.emoji.h.a.c r3 = f76991a     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "it.absolutePath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ all -> 0x0054 }
            r3.mo59458b(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x004d
        L_0x004a:
            r2.delete()     // Catch:{ all -> 0x0054 }
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0050:
            monitor-exit(r5)
            return
        L_0x0052:
            monitor-exit(r5)
            return
        L_0x0054:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29393c.mo59455a(java.lang.String[]):void");
    }

    /* renamed from: a */
    private static long m69298a(InputStream inputStream, File file) {
        Throwable th;
        Closeable fileOutputStream = new FileOutputStream(file);
        try {
            long a = C52646b.m112188a(inputStream, (FileOutputStream) fileOutputStream, VideoCacheReadBuffersizeExperiment.DEFAULT);
            C52647c.m112189a(fileOutputStream, null);
            return a;
        } catch (Throwable th2) {
            C52647c.m112189a(fileOutputStream, th);
            throw th2;
        }
    }

    /* renamed from: b */
    public final Bitmap mo59457b(String str, String str2) {
        C52711k.m112240b(str, "picFileDirPath");
        C52711k.m112240b(str2, "picFileName");
        boolean z = true;
        LinkedHashMap a = m69302a(str, C52575l.m112101c(str2));
        if (a != null) {
            if (a.size() != 1) {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a != null) {
                Map map = a;
                Collection arrayList = new ArrayList(map.size());
                for (Entry value : map.entrySet()) {
                    arrayList.add((Bitmap) value.getValue());
                }
                return (Bitmap) ((List) arrayList).get(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static LinkedHashMap<String, Bitmap> m69302a(String str, List<String> list) {
        boolean z;
        if (list.isEmpty()) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File[] listFiles = file.listFiles(new C29395b(list));
        boolean z2 = true;
        if (listFiles != null) {
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        LinkedHashMap<String, Bitmap> linkedHashMap = new LinkedHashMap<>();
        for (File file2 : listFiles) {
            C52711k.m112236a((Object) file2, "it");
            Bitmap a = m69299a(file2);
            if (a != null) {
                Map map = linkedHashMap;
                String name = file2.getName();
                C52711k.m112236a((Object) name, "it.name");
                map.put(name, a);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final boolean mo59456a(String str, String str2) {
        Closeable zipFile;
        Throwable th;
        Closeable inputStream;
        Throwable th2;
        Throwable th3;
        C52711k.m112240b(str, "zipFilePath");
        C52711k.m112240b(str2, "outputDirPath");
        File file = new File(str2);
        if (file.exists()) {
            mo59458b(str2);
        }
        file.mkdirs();
        File file2 = new File(str);
        if (file2.exists()) {
            String name = file2.getName();
            C52711k.m112236a((Object) name, "zipFile.name");
            if (C52830p.m112413c(name, ".zip", false, 2, null)) {
                try {
                    zipFile = new ZipFile(file2);
                    ZipFile zipFile2 = (ZipFile) zipFile;
                    Enumeration entries = zipFile2.entries();
                    C52711k.m112236a((Object) entries, "zip.entries()");
                    C52711k.m112240b(entries, "$this$iterator");
                    Iterator aVar = new C52580a(entries);
                    boolean z = false;
                    while (aVar.hasNext()) {
                        ZipEntry zipEntry = (ZipEntry) aVar.next();
                        C52711k.m112236a((Object) zipEntry, "entry");
                        String name2 = zipEntry.getName();
                        C52711k.m112236a((Object) name2, "entry.name");
                        if (C52830p.m112411b(name2, "emoji_", false, 2, null)) {
                            String name3 = zipEntry.getName();
                            C52711k.m112236a((Object) name3, "entry.name");
                            if (!C52830p.m112456b((CharSequence) name3, (CharSequence) "../", false, 2, (Object) null)) {
                                z = true;
                                File file3 = new File(file, zipEntry.getName());
                                if (zipEntry.isDirectory()) {
                                    file3.mkdirs();
                                } else {
                                    inputStream = zipFile2.getInputStream(zipEntry);
                                    try {
                                        InputStream inputStream2 = (InputStream) inputStream;
                                        C52711k.m112236a((Object) inputStream2, "it");
                                        m69298a(inputStream2, file3);
                                        C52647c.m112189a(inputStream, null);
                                    } catch (Throwable th4) {
                                        Throwable th5 = th4;
                                        th3 = r13;
                                        th2 = th5;
                                    }
                                }
                            }
                        }
                    }
                    C52647c.m112189a(zipFile, null);
                    return z;
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("OnlineEmojiFileHelper unZipFile cause exception: ");
                    sb.append(e.getMessage());
                    C32458a.m75144a(sb.toString());
                    C32458a.m75148a((Throwable) e);
                    return false;
                } catch (Throwable th6) {
                    C52647c.m112189a(zipFile, th);
                    throw th6;
                }
            }
        }
        file2.delete();
        StringBuilder sb2 = new StringBuilder("OnlineEmojiFileHelper unZipFile zipFile invalid: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        C32458a.m75144a(sb2.toString());
        return false;
        C52647c.m112189a(inputStream, th3);
        throw th2;
    }
}
