package com.airbnb.lottie.p112d;

import android.content.Context;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.d.b */
final class C2404b {

    /* renamed from: a */
    final Context f7509a;

    /* renamed from: b */
    final String f7510b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0794k<C2403a, InputStream> mo6773a() {
        C2403a aVar;
        try {
            String str = this.f7510b;
            File file = new File(this.f7509a.getCacheDir(), m7059a(str, C2403a.Json, false));
            if (!file.exists()) {
                file = new File(this.f7509a.getCacheDir(), m7059a(str, C2403a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(".zip")) {
                    aVar = C2403a.Zip;
                } else {
                    aVar = C2403a.Json;
                }
                StringBuilder sb = new StringBuilder("Cache hit for ");
                sb.append(this.f7510b);
                sb.append(" at ");
                sb.append(file.getAbsolutePath());
                return new C0794k<>(aVar, fileInputStream);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    C2404b(Context context, String str) {
        this.f7509a = context.getApplicationContext();
        this.f7510b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo6774a(InputStream inputStream, C2403a aVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(this.f7509a.getCacheDir(), m7059a(this.f7510b, aVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    static String m7059a(String str, C2403a aVar, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = aVar.extension;
        } else {
            str2 = aVar.tempExtension();
        }
        sb.append(str2);
        return sb.toString();
    }
}
