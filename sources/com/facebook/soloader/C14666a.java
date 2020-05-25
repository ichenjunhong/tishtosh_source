package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.C2240a;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
public final class C14666a extends C14676f {

    /* renamed from: a */
    public final int f38041a;

    /* renamed from: com.facebook.soloader.a$a */
    protected class C14667a extends C14679b {

        /* renamed from: e */
        private File f38043e;

        /* renamed from: f */
        private final int f38044f;

        C14667a(C14676f fVar) throws IOException {
            super(fVar);
            this.f38043e = new File(C14666a.this.f38068f.getApplicationInfo().nativeLibraryDir);
            this.f38044f = C14666a.this.f38041a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo26942a(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(C14666a.this.f38069g)) {
                C14666a.this.f38069g = null;
                C2240a.m6772a("allowing consideration of corrupted lib %s", new Object[]{str});
                return true;
            } else if ((this.f38044f & 1) == 0) {
                StringBuilder sb = new StringBuilder("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
                return true;
            } else {
                File file = new File(this.f38043e, str);
                if (!file.isFile()) {
                    C2240a.m6772a("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                    return true;
                }
                long length = file.length();
                long size = zipEntry.getSize();
                if (length != size) {
                    C2240a.m6772a("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    return true;
                }
                StringBuilder sb2 = new StringBuilder("not allowing consideration of ");
                sb2.append(name);
                sb2.append(": deferring to libdir");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14695e mo26940a() throws IOException {
        return new C14667a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte[] mo26941b() throws IOException {
        File canonicalFile = this.f38055d.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(C14686k.m30035a(this.f38068f));
            if ((this.f38041a & 1) == 0) {
                obtain.writeByte(0);
                return obtain.marshall();
            }
            String str = this.f38068f.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte(2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    public C14666a(Context context, String str, int i) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
        this.f38041a = i;
    }
}
