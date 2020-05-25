package p2628d.p2638e;

import java.io.File;
import java.io.IOException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.e.e */
public class C52649e extends IOException {

    /* renamed from: a */
    private final File f130932a;

    /* renamed from: b */
    private final File f130933b;

    /* renamed from: c */
    private final String f130934c;

    public final File getFile() {
        return this.f130932a;
    }

    public final File getOther() {
        return this.f130933b;
    }

    public final String getReason() {
        return this.f130934c;
    }

    public C52649e(File file, File file2, String str) {
        C52711k.m112240b(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            StringBuilder sb2 = new StringBuilder(" -> ");
            sb2.append(file2);
            sb.append(sb2.toString());
        }
        if (str != null) {
            StringBuilder sb3 = new StringBuilder(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        String sb4 = sb.toString();
        C52711k.m112236a((Object) sb4, "sb.toString()");
        super(sb4);
        this.f130932a = file;
        this.f130933b = file2;
        this.f130934c = str;
    }

    public /* synthetic */ C52649e(File file, File file2, String str, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            file2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(file, file2, str);
    }
}
