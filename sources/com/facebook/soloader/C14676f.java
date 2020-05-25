package com.facebook.soloader;

import android.content.Context;
import com.C2240a;
import com.facebook.soloader.C14689m.C14691a;
import com.facebook.soloader.C14689m.C14692b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.f */
public class C14676f extends C14689m {

    /* renamed from: d */
    protected final File f38055d;

    /* renamed from: e */
    protected final String f38056e;

    /* renamed from: com.facebook.soloader.f$a */
    static final class C14678a extends C14691a implements Comparable {

        /* renamed from: a */
        final ZipEntry f38057a;

        /* renamed from: b */
        final int f38058b;

        public final int compareTo(Object obj) {
            return this.f38077c.compareTo(((C14678a) obj).f38077c);
        }

        C14678a(String str, ZipEntry zipEntry, int i) {
            super(str, C2240a.m6772a("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
            this.f38057a = zipEntry;
            this.f38058b = i;
        }
    }

    /* renamed from: com.facebook.soloader.f$b */
    protected class C14679b extends C14695e {

        /* renamed from: a */
        private final C14689m f38059a;

        /* renamed from: b */
        public C14678a[] f38060b;

        /* renamed from: c */
        public final ZipFile f38061c;

        /* renamed from: com.facebook.soloader.f$b$a */
        final class C14680a extends C14694d {

            /* renamed from: b */
            private int f38064b;

            /* renamed from: a */
            public final boolean mo26950a() {
                C14679b.this.mo26953c();
                if (this.f38064b < C14679b.this.f38060b.length) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final C14693c mo26951b() throws IOException {
                C14679b.this.mo26953c();
                C14678a[] aVarArr = C14679b.this.f38060b;
                int i = this.f38064b;
                this.f38064b = i + 1;
                C14678a aVar = aVarArr[i];
                InputStream inputStream = C14679b.this.f38061c.getInputStream(aVar.f38057a);
                try {
                    return new C14693c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }

            private C14680a() {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo26942a(ZipEntry zipEntry, String str) {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C14694d mo26949b() throws IOException {
            return new C14680a();
        }

        public void close() throws IOException {
            this.f38061c.close();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C14692b mo26948a() throws IOException {
            return new C14692b(mo26953c());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C14678a[] mo26953c() {
            if (this.f38060b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C14676f.this.f38056e);
                String[] a = C14686k.m30039a();
                Enumeration entries = this.f38061c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a2 = C14686k.m30037a(a, group);
                        if (a2 >= 0) {
                            linkedHashSet.add(group);
                            C14678a aVar = (C14678a) hashMap.get(group2);
                            if (aVar == null || a2 < aVar.f38058b) {
                                hashMap.put(group2, new C14678a(group2, zipEntry, a2));
                            }
                        }
                    }
                }
                this.f38059a.f38070h = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                C14678a[] aVarArr = (C14678a[]) hashMap.values().toArray(new C14678a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    C14678a aVar2 = aVarArr[i2];
                    if (mo26942a(aVar2.f38057a, aVar2.f38077c)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                C14678a[] aVarArr2 = new C14678a[i];
                int i3 = 0;
                for (C14678a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        int i4 = i3 + 1;
                        aVarArr2[i3] = aVar3;
                        i3 = i4;
                    }
                }
                this.f38060b = aVarArr2;
            }
            return this.f38060b;
        }

        C14679b(C14689m mVar) throws IOException {
            this.f38061c = new ZipFile(C14676f.this.f38055d);
            this.f38059a = mVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C14695e mo26940a() throws IOException {
        return new C14679b(this);
    }

    public C14676f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f38055d = file;
        this.f38056e = str2;
    }
}
