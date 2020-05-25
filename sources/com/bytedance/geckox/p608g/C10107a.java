package com.bytedance.geckox.p608g;

import android.os.Process;
import android.util.Pair;
import com.bytedance.geckox.p594a.C10039c;
import com.bytedance.geckox.p608g.p609a.C10108a;
import com.bytedance.geckox.p608g.p609a.C10109b;
import com.bytedance.geckox.p608g.p609a.C10110c;
import com.bytedance.geckox.p610h.C10113b;
import com.bytedance.geckox.p610h.C10114c;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10153c;
import com.bytedance.geckox.utils.C10166m;
import com.bytedance.geckox.utils.FileLock;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.g.a */
public final class C10107a {

    /* renamed from: a */
    public String f27394a;

    /* renamed from: b */
    public volatile Long f27395b;

    /* renamed from: c */
    private String f27396c;

    /* renamed from: d */
    private volatile File f27397d;

    /* renamed from: e */
    private volatile C10108a f27398e;

    /* renamed from: f */
    private AtomicBoolean f27399f = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        super.finalize();
        try {
            m20373a();
        } catch (Exception e) {
            C10153c.m20478a(e);
        }
    }

    /* renamed from: a */
    private void m20373a() throws Exception {
        if (!this.f27399f.getAndSet(true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27396c);
            sb.append(File.separator);
            sb.append(this.f27394a);
            sb.append(File.separator);
            sb.append("select.lock");
            C10113b a = C10113b.m20384a(sb.toString());
            C10117b.m20388a("gecko-file-lock", "channel version loader clean");
            try {
                if (this.f27397d == null) {
                    a.mo18091a();
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f27397d.getAbsolutePath());
                sb2.append(File.separator);
                sb2.append("using.lock");
                String sb3 = sb2.toString();
                synchronized (C10114c.f27412a) {
                    Pair pair = (Pair) C10114c.f27412a.get(sb3);
                    if (pair != null) {
                        long decrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
                        if (decrementAndGet < 0) {
                            throw new RuntimeException("using.lock count illegal");
                        } else if (decrementAndGet == 0) {
                            ((FileLock) pair.first).mo18151a();
                            C10114c.f27412a.remove(sb3);
                        }
                    } else {
                        throw new RuntimeException("using.lock illegal state");
                    }
                }
                a.mo18091a();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f27396c);
                sb4.append(File.separator);
                sb4.append(this.f27394a);
                C10039c.m20200a(sb4.toString());
            } catch (Throwable th) {
                a.mo18091a();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public synchronized C10108a mo18084a(String str) throws Exception {
        if (this.f27398e != null) {
            return this.f27398e;
        }
        File b = m20374b(str);
        if (b != null) {
            File file = new File(b, "res.macv");
            File file2 = new File(b, "res");
            if (file2.exists() && file2.isDirectory()) {
                this.f27398e = new C10110c(b);
            } else if (!file.exists() || !file.isFile()) {
                StringBuilder sb = new StringBuilder("can not find res, dir:");
                sb.append(b.getAbsolutePath());
                throw new RuntimeException(sb.toString());
            } else {
                this.f27398e = new C10109b(b);
            }
            return this.f27398e;
        }
        StringBuilder sb2 = new StringBuilder("channel不存在，channel:");
        sb2.append(str);
        throw new FileNotFoundException(sb2.toString());
    }

    /* renamed from: b */
    private synchronized File m20374b(String str) throws Exception {
        if (this.f27397d != null) {
            return this.f27397d;
        } else if (this.f27395b != null && this.f27395b.longValue() == -1) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27396c);
            sb.append(File.separator);
            sb.append(str);
            sb.append(File.separator);
            sb.append("select.lock");
            C10113b a = C10113b.m20384a(sb.toString());
            try {
                if (this.f27395b == null) {
                    this.f27395b = C10166m.m20492a(new File(this.f27396c, str));
                }
                if (this.f27395b == null) {
                    this.f27395b = Long.valueOf(-1);
                    a.mo18091a();
                    return null;
                }
                String str2 = this.f27396c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(File.separator);
                sb2.append(str);
                sb2.append(File.separator);
                sb2.append(this.f27395b);
                sb2.append(File.separator);
                sb2.append("using.lock");
                File file = new File(str2, sb2.toString());
                this.f27397d = file.getParentFile();
                String absolutePath = file.getAbsolutePath();
                synchronized (C10114c.f27412a) {
                    Pair pair = (Pair) C10114c.f27412a.get(absolutePath);
                    if (pair == null) {
                        Pair pair2 = new Pair(FileLock.m20467a(absolutePath, Process.myPid()), new AtomicLong(0));
                        C10114c.f27412a.put(absolutePath, pair2);
                        pair = pair2;
                    }
                    ((AtomicLong) pair.second).incrementAndGet();
                }
                File file2 = this.f27397d;
                a.mo18091a();
                return file2;
            } catch (Throwable th) {
                a.mo18091a();
                throw th;
            }
        }
    }

    C10107a(String str, String str2, String str3) {
        this.f27396c = str2;
        this.f27394a = str3;
    }
}
