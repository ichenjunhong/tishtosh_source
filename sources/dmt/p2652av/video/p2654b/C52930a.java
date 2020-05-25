package dmt.p2652av.video.p2654b;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONException;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: dmt.av.video.b.a */
public class C52930a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f131301a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C52930a.class), "allowReload", "getAllowReload()Z"))};

    /* renamed from: b */
    public static final C52931a f131302b = new C52931a(null);

    /* renamed from: c */
    private final C52932b f131303c = new C52932b(C39618d.f101147K.mo74202d());

    /* renamed from: d */
    private final C52668f f131304d = C52732g.m112285a(C52933c.f131306a);

    /* renamed from: dmt.av.video.b.a$a */
    public static final class C52931a {
        private C52931a() {
        }

        public /* synthetic */ C52931a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: dmt.av.video.b.a$b */
    static final class C52932b {

        /* renamed from: a */
        public final ArrayList<String> f131305a;

        public C52932b(ArrayList<String> arrayList) {
            C52711k.m112240b(arrayList, "referList");
            this.f131305a = arrayList;
        }
    }

    /* renamed from: dmt.av.video.b.a$c */
    static final class C52933c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C52933c f131306a = new C52933c();

        C52933c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C39618d.f101147K.mo74203e());
        }
    }

    /* renamed from: b */
    public final boolean mo110534b(String str) {
        C52711k.m112240b(str, "libName");
        C52932b bVar = this.f131303c;
        C52711k.m112240b(str, "soName");
        if (bVar.f131305a.contains(str)) {
            try {
                m112622a(str, C39618d.f101147K.mo74201c());
                StringBuilder sb = new StringBuilder("So decompress: CompressedLibraryLoader: Success loading compressed library: ");
                sb.append(str);
                C45407ay.m98968a(sb.toString());
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("So decompress: CompressedLibraryLoader: Fail loading compressed library: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(e.getMessage());
                C45407ay.m98971b(sb2.toString());
                Throwable th = e;
                StringBuilder sb3 = new StringBuilder("Compressed so load fail ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(e.getMessage());
                sb3.append(", ");
                sb3.append(e.getStackTrace());
                C9220a.m18312a(th, sb3.toString());
                if (((Boolean) this.f131304d.getValue()).booleanValue()) {
                    StringBuilder sb4 = new StringBuilder("So decompress: CompressedLibraryLoader: Using Librarian to reload ");
                    sb4.append(str);
                    C45407ay.m98968a(sb4.toString());
                    C11511a.m23578a(str);
                } else {
                    throw th;
                }
            }
            return true;
        }
        StringBuilder sb5 = new StringBuilder("So decompress: CompressedLibraryLoader: loading uncompressed library: ");
        sb5.append(str);
        C45407ay.m98968a(sb5.toString());
        C11511a.m23578a(str);
        return true;
    }

    /* renamed from: a */
    private final boolean m112622a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/lib");
        sb.append(str);
        sb.append(".so");
        File file = new File(sb.toString());
        try {
            StringBuilder sb2 = new StringBuilder("So decompress: CompressedLibraryLoader: ");
            sb2.append(str);
            sb2.append("'s complete path: ");
            sb2.append(file.getAbsolutePath());
            C45407ay.m98968a(sb2.toString());
            if (file.exists()) {
                C52934b.m112624a(file.getAbsolutePath());
                try {
                    C23569o.m57776a("so_decompress_load_rate", 0, C23088c.m56631a().mo47824a("soName", str).mo47825b());
                } catch (JSONException unused) {
                }
                return true;
            }
            StringBuilder sb3 = new StringBuilder("So decompress: CompressedLibraryLoader: ");
            sb3.append(str);
            sb3.append("'s compressed file ");
            sb3.append(file.getAbsolutePath());
            sb3.append(" not found");
            C45407ay.m98971b(sb3.toString());
            StringBuilder sb4 = new StringBuilder("lib");
            sb4.append(str);
            sb4.append(".so not exit, path: ");
            sb4.append(file.getAbsolutePath());
            sb4.append(' ');
            throw new RuntimeException(sb4.toString());
        } catch (Throwable th) {
            long length = file.length();
            String message = th.getMessage();
            String str3 = "so_decompress_load_rate";
            try {
                C23088c a = C23088c.m56631a().mo47823a("length", Long.valueOf(length)).mo47824a("soName", str);
                String str4 = "errorMsg";
                if (message == null) {
                    message = "";
                }
                C23569o.m57776a(str3, 1, a.mo47824a(str4, message).mo47825b());
            } catch (JSONException unused2) {
            }
            StringBuilder sb5 = new StringBuilder("so name: ");
            sb5.append(str);
            sb5.append(", with length: ");
            sb5.append(length);
            sb5.append(", error msg: ");
            sb5.append(th.getMessage());
            throw new RuntimeException(sb5.toString());
        }
    }
}
