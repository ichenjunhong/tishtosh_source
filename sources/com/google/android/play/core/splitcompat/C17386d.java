package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.C2240a;
import com.google.android.play.core.p1051c.C17295h;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.d */
public final class C17386d {

    /* renamed from: a */
    private final File f48915a;

    /* renamed from: b */
    private final long f48916b;

    public C17386d(Context context) throws IOException, NameNotFoundException {
        this(context.getFilesDir(), (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
    }

    private C17386d(File file, long j) {
        this.f48915a = file;
        this.f48916b = j;
    }

    /* renamed from: b */
    static File m42587b(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String str = "Unable to create directory: ";
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: c */
    private static void m42588c(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File c : listFiles) {
                    m42588c(c);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(C2240a.m6772a("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: d */
    public static String m42589d(String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(".apk");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: f */
    private final File m42590f(String str) throws IOException {
        return m42587b(new File(mo33704e(), str));
    }

    /* renamed from: g */
    private final File m42591g() throws IOException {
        return m42587b(new File(this.f48915a, "splitcompat"));
    }

    /* renamed from: a */
    public final File mo33695a(String str) throws IOException {
        return new File(mo33701c(), m42589d(str));
    }

    /* renamed from: a */
    public final File mo33696a(String str, String str2) throws IOException {
        return new File(m42590f(str), str2);
    }

    /* renamed from: a */
    public final void mo33697a() throws IOException {
        File g = m42591g();
        String[] list = g.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f48916b))) {
                    m42588c(new File(g, str));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33698a(File file) throws IOException {
        C17295h.m42359a(file.getParentFile().getParentFile().equals(mo33704e()), (Object) "File to remove is not a native library");
        m42588c(file);
    }

    /* renamed from: b */
    public final File mo33699b() throws IOException {
        return m42587b(new File(mo33703d(), "unverified-splits"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33700b(String str) throws IOException {
        m42588c(m42590f(str));
    }

    /* renamed from: c */
    public final File mo33701c() throws IOException {
        return m42587b(new File(mo33703d(), "verified-splits"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Set<File> mo33702c(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m42590f(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    public final File mo33703d() throws IOException {
        return m42587b(new File(m42591g(), Long.toString(this.f48916b)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final File mo33704e() throws IOException {
        return m42587b(new File(mo33703d(), "native-libraries"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo33705e(String str) throws IOException {
        m42588c(mo33695a(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Set<C17400r> mo33706f() throws IOException {
        File c = mo33701c();
        HashSet hashSet = new HashSet();
        File[] listFiles = c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C17385c(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }
}
