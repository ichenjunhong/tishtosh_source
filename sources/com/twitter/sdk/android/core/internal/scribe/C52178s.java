package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C2240a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.twitter.sdk.android.core.internal.C52114g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.s */
public final class C52178s implements C52168m {

    /* renamed from: a */
    private final Context f129870a;

    /* renamed from: b */
    private final File f129871b;

    /* renamed from: c */
    private final String f129872c;

    /* renamed from: d */
    private final File f129873d;

    /* renamed from: e */
    private C52173r f129874e = new C52173r(this.f129873d);

    /* renamed from: f */
    private File f129875f = new File(this.f129871b, this.f129872c);

    /* renamed from: a */
    public final int mo108895a() {
        return this.f129874e.mo108903a();
    }

    /* renamed from: b */
    public final boolean mo108901b() {
        return this.f129874e.mo108907b();
    }

    /* renamed from: c */
    public final List<File> mo108902c() {
        return Arrays.asList(this.f129875f.listFiles());
    }

    /* renamed from: a */
    public final void mo108899a(byte[] bArr) throws IOException {
        this.f129874e.mo108906a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final List<File> mo108896a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f129875f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo108898a(List<File> list) {
        for (File file : list) {
            C52114g.m111464a(this.f129870a, C2240a.m6772a("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    /* renamed from: a */
    public final void mo108897a(String str) throws IOException {
        FileInputStream fileInputStream;
        this.f129874e.close();
        File file = this.f129873d;
        File file2 = new File(this.f129875f, str);
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    C52114g.m111468a((InputStream) fileInputStream, (OutputStream) fileOutputStream2, new byte[PreloadTask.BYTE_UNIT_NUMBER]);
                    C52114g.m111467a((Closeable) fileInputStream, "Failed to close file input stream");
                    C52114g.m111467a((Closeable) fileOutputStream2, "Failed to close output stream");
                    file.delete();
                    this.f129874e = new C52173r(this.f129873d);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C52114g.m111467a((Closeable) fileInputStream, "Failed to close file input stream");
                    C52114g.m111467a((Closeable) fileOutputStream, "Failed to close output stream");
                    file.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C52114g.m111467a((Closeable) fileInputStream, "Failed to close file input stream");
                C52114g.m111467a((Closeable) fileOutputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            C52114g.m111467a((Closeable) fileInputStream, "Failed to close file input stream");
            C52114g.m111467a((Closeable) fileOutputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo108900a(int i, int i2) {
        if (this.f129874e.mo108903a() + 4 + i <= i2) {
            return true;
        }
        return false;
    }

    public C52178s(Context context, File file, String str, String str2) throws IOException {
        this.f129870a = context;
        this.f129871b = file;
        this.f129872c = str2;
        this.f129873d = new File(this.f129871b, str);
        if (!this.f129875f.exists()) {
            this.f129875f.mkdirs();
        }
    }
}
