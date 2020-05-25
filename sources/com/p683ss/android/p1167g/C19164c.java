package com.p683ss.android.p1167g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import com.p683ss.android.p1167g.C19162b.C19163a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: com.ss.android.g.c */
public final class C19164c {

    /* renamed from: a */
    private static final String f52808a = Environment.getRootDirectory().getAbsolutePath();

    /* renamed from: b */
    private static final String f52809b = Environment.getDataDirectory().getAbsolutePath();

    /* renamed from: c */
    private static String f52810c = "meta_umeng_channel";

    /* renamed from: d */
    private static String f52811d = "ss.properties";

    /* renamed from: e */
    private static String f52812e = "com.ss.android.article.news";

    /* renamed from: f */
    private static int f52813f = 470;

    /* renamed from: g */
    private static final List<File> f52814g = Arrays.asList(new File[]{new File("/system/preload"), new File("/system/delapp"), new File("/data/miui/app"), new File("/cust"), new File("/system/presetapp"), new File("/system/preset_apps"), new File("/system/reserve"), new File("/system/pre-install"), new File("/data/preload"), new File("/system/appbackup"), new File("/system/etc/customization/applications"), new File("/system/etc/property/app"), new File("/apps")});

    /* renamed from: h */
    private static final List<File> f52815h = Collections.singletonList(new File(f52809b, "gn_apps.zip"));

    /* renamed from: i */
    private static final List<String> f52816i;

    /* renamed from: a */
    private static boolean m46724a(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            if (!file.getCanonicalFile().equals(file.getAbsoluteFile())) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m46725a(String str, Collection<String> collection) {
        if (TextUtils.isEmpty(str) || collection == null) {
            return false;
        }
        for (String str2 : collection) {
            if (str.equals(str2)) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(File.separator);
            if (str.startsWith(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m46723a(Set<String> set) {
        for (File file : f52814g) {
            if (file.isDirectory() && file.canRead()) {
                set.add(file.getAbsolutePath());
            }
        }
    }

    /* renamed from: a */
    private static void m46722a(InputStream inputStream, OutputStream outputStream) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipOutputStream.close();
                return;
            } else if (!nextEntry.isDirectory()) {
                String name = nextEntry.getName();
                if (!"AndroidManifest.xml".equals(name) && !"resources.arsc".equals(name)) {
                    StringBuilder sb = new StringBuilder("assets/");
                    sb.append(f52811d);
                    if (!sb.toString().equals(name)) {
                        m46726b(zipInputStream, null);
                    }
                }
                zipOutputStream.putNextEntry(nextEntry);
                m46726b(zipInputStream, zipOutputStream);
                zipOutputStream.closeEntry();
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f52808a);
        sb.append("/app");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f52808a);
        sb2.append("/framework");
        f52816i = Arrays.asList(new String[]{sb.toString(), sb2.toString(), "/sys", "/proc", "/etc", "/dev", "/res", "/d", "mnt/sdcard", "/sdcard"});
    }

    /* renamed from: a */
    public static String m46718a(Context context) {
        String str;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            PackageManager packageManager = context.getPackageManager();
            m46723a((Set<String>) linkedHashSet);
            for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(0)) {
                File file = new File(applicationInfo.sourceDir);
                if (applicationInfo.sourceDir.startsWith(f52808a) && !m46725a(applicationInfo.sourceDir, (Collection<String>) f52816i) && !m46725a(applicationInfo.sourceDir, (Collection<String>) linkedHashSet)) {
                    while (!f52808a.equals(file.getParent())) {
                        file = file.getParentFile();
                    }
                    linkedHashSet.add(file.getAbsolutePath());
                }
            }
            m46720a(context, (Set<String>) linkedHashSet);
            C19162b a = m46717a(context, (Set<String>) linkedHashSet, null);
            if (a == null) {
                linkedHashSet.addAll(f52816i);
                a = m46716a(context, Environment.getRootDirectory().getParentFile(), (Set<String>) linkedHashSet);
            }
            if (a == null) {
                return null;
            }
            if (a == null) {
                str = null;
            } else if (a.f52804c < f52813f) {
                str = a.mo39109a().getText(a.mo39109a().getIdentifier(f52810c, "string", a.f52803b)).toString();
            } else {
                str = m46719a(a);
            }
            a.mo39110b();
            if (context != null) {
                if (context.getFilesDir() != null) {
                    File file2 = new File(context.getFilesDir(), "apks");
                    if (file2.isDirectory()) {
                        file2.delete();
                    }
                }
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m46719a(C19162b bVar) throws C19163a {
        try {
            Properties properties = new Properties();
            InputStream open = bVar.f52806e.open(f52811d);
            properties.load(open);
            open.close();
            return properties.getProperty(f52810c);
        } catch (IOException e) {
            throw new C19163a((Throwable) e);
        }
    }

    /* renamed from: b */
    private static void m46726b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: a */
    private static void m46720a(Context context, Set<String> set) {
        if (context != null && context.getFilesDir() != null) {
            File file = new File(context.getFilesDir(), "apks");
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                return;
            }
            for (File file2 : f52815h) {
                if (file2.isFile() && file2.getName().endsWith(".zip")) {
                    try {
                        m46721a(file, file2);
                    } catch (IOException unused) {
                    }
                }
            }
            set.add(file.getAbsolutePath());
        }
    }

    /* renamed from: a */
    private static void m46721a(File file, File file2) throws IOException {
        boolean z;
        ZipFile zipFile = new ZipFile(file2);
        try {
            Enumeration entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                String name = zipEntry.getName();
                if (!zipEntry.isDirectory()) {
                    if (name != null) {
                        StringBuilder sb = new StringBuilder("..");
                        sb.append(File.separator);
                        if (!name.contains(sb.toString())) {
                            z = true;
                            if (z && name.endsWith(".apk")) {
                                m46722a(zipFile.getInputStream(zipEntry), (OutputStream) new FileOutputStream(new File(file, name)));
                            }
                        }
                    }
                    z = false;
                    try {
                        m46722a(zipFile.getInputStream(zipEntry), (OutputStream) new FileOutputStream(new File(file, name)));
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        } finally {
            zipFile.close();
        }
    }

    /* renamed from: a */
    private static C19162b m46717a(Context context, Set<String> set, Set<String> set2) throws C19163a {
        if (context == null || set == null) {
            return null;
        }
        for (String file : set) {
            C19162b a = m46716a(context, new File(file), null);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C19162b m46716a(Context context, File file, Set<String> set) {
        C19162b bVar;
        if (context == null || file == null || m46725a(file.getAbsolutePath(), (Collection<String>) set)) {
            return null;
        }
        if (file.canRead() && file.canWrite() && file.getName() != "apks") {
            return null;
        }
        if (file.isFile() && file.getName().endsWith(".apk") && file.canRead()) {
            try {
                bVar = new C19162b(file);
            } catch (C19163a unused) {
                bVar = null;
            }
            if (bVar == null) {
                return null;
            }
            if (f52812e.endsWith(bVar.f52803b)) {
                return bVar;
            }
            bVar.mo39110b();
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            for (File file2 : listFiles) {
                if (file2 == null || !m46724a(file)) {
                    C19162b a = m46716a(context, file2, set);
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }
}
