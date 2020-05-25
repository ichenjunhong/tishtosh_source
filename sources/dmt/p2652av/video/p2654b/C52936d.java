package dmt.p2652av.video.p2654b;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ttve.nativePort.C20129b.C20133d;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.b.d */
public final class C52936d implements C20133d {
    /* renamed from: a */
    public final boolean mo17579a(List<String> list) {
        C52711k.m112240b(list, "list");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            for (String str : list) {
                System.currentTimeMillis();
                C11511a.m23578a(str);
            }
        } catch (Throwable th) {
            C9220a.m18312a(th, "VESDK load so");
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb = new StringBuilder("av-performance");
        sb.append(", SafeLibraryLoader: load all so cost time:  ");
        sb.append(currentTimeMillis2);
        sb.append(" ms");
        C45407ay.m98968a(sb.toString());
        return true;
    }
}
