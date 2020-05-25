package com.p683ss.android.ugc.aweme.net.cache;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.C11031g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.net.C37813v;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.p2683a.C53539d;
import okhttp3.internal.p2683a.C53539d.C53542a;
import okhttp3.internal.p2688f.C53623a;
import okio.Buffer;
import okio.Sink;

/* renamed from: com.ss.android.ugc.aweme.net.cache.a */
public class C37752a {

    /* renamed from: a */
    private static volatile C37752a f96195a;

    /* renamed from: b */
    private final C53539d f96196b;

    /* renamed from: c */
    private final ConcurrentHashMap<String, Long> f96197c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C37752a m84274a() {
        if (f96195a == null) {
            synchronized (C37752a.class) {
                if (f96195a == null) {
                    f96195a = new C37752a();
                }
            }
        }
        return f96195a;
    }

    private C37752a() {
        File file;
        String str;
        C53623a aVar = C53623a.f132977a;
        Context a = C11010c.m22280a();
        if (a != null) {
            file = a.getCacheDir();
        } else {
            file = null;
        }
        if (file == null) {
            if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
                str = a.getCacheDir().getPath();
            } else if (a.getExternalCacheDir() != null) {
                str = a.getExternalCacheDir().getPath();
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append("net");
            file = new File(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        sb2.append(File.separator);
        sb2.append("net");
        this.f96196b = C53539d.m113712a(aVar, new File(sb2.toString()), 20190214, 1, 2097152);
    }

    /* renamed from: a */
    public static boolean m84275a(C12686c cVar) {
        if (C11031g.m22343a() != null && C11031g.m22343a().f96293i && cVar != null && !TextUtils.isEmpty(cVar.f33321b) && !C23715d.m58202a((Collection<T>) cVar.f33322c)) {
            for (C12685b bVar : cVar.f33322c) {
                if (bVar != null && "cache".equalsIgnoreCase(bVar.f33318a)) {
                    cVar.f33322c.remove(bVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m84276a(C12688d dVar, Sink sink) {
        try {
            byte[] bArr = new byte[4096];
            Buffer buffer = new Buffer();
            InputStream in = dVar.f33350e.mo9554in();
            buffer.writeLong(SystemClock.elapsedRealtime());
            while (true) {
                int read = in.read(bArr);
                if (read == -1) {
                    break;
                }
                buffer.write(bArr, 0, read);
                sink.write(buffer, (long) read);
                buffer.clear();
            }
            buffer.clear();
            buffer.close();
            in.close();
            if (sink != null) {
                sink.flush();
                sink.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo77246a(C12686c cVar, C12799u uVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f33321b) && uVar != null && uVar.mo23958a() == 200 && uVar.f33551a != null) {
            String str = "";
            if (!C23715d.m58202a((Collection<T>) cVar.f33322c)) {
                List b = cVar.mo23859b("cache-key");
                if (!C23715d.m58202a((Collection<T>) b)) {
                    str = ((C12685b) b.get(0)).f33319b;
                    cVar.f33322c.removeAll(b);
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = C37813v.m84416a(cVar.f33321b);
            }
            if (!TextUtils.isEmpty(str)) {
                new StringBuilder("CacheManager.put.key:").append(str);
                try {
                    C53542a b2 = this.f96196b.mo111355b(str);
                    if (b2 != null) {
                        if (m84276a(uVar.f33551a, b2.mo111363a(0))) {
                            b2.mo111365b();
                            return;
                        }
                        b2.mo111366c();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
