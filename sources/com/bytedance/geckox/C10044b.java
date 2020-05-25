package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.p594a.p595a.C10032a;
import com.bytedance.geckox.p612j.C10119a;
import com.bytedance.geckox.p612j.C10120b;
import com.bytedance.geckox.p614l.C10130a;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.geckox.b */
public class C10044b {

    /* renamed from: a */
    public final Context f27280a;

    /* renamed from: b */
    public final Executor f27281b;

    /* renamed from: c */
    public final Executor f27282c;

    /* renamed from: d */
    public final C10130a f27283d;

    /* renamed from: e */
    public final C10120b f27284e;

    /* renamed from: f */
    public final List<String> f27285f;

    /* renamed from: g */
    public final List<String> f27286g;

    /* renamed from: h */
    public final C10032a f27287h;

    /* renamed from: i */
    public final String f27288i;

    /* renamed from: j */
    public final String f27289j;

    /* renamed from: k */
    public final String f27290k;

    /* renamed from: l */
    public final String f27291l;

    /* renamed from: m */
    public final String f27292m;

    /* renamed from: n */
    public final File f27293n;

    /* renamed from: o */
    private final Long f27294o;

    /* renamed from: com.bytedance.geckox.b$a */
    public static class C10047a {

        /* renamed from: a */
        public C10120b f27297a;

        /* renamed from: b */
        public List<String> f27298b;

        /* renamed from: c */
        public List<String> f27299c;

        /* renamed from: d */
        public Context f27300d;

        /* renamed from: e */
        public Executor f27301e;

        /* renamed from: f */
        public Executor f27302f;

        /* renamed from: g */
        public C10130a f27303g;

        /* renamed from: h */
        public C10032a f27304h;

        /* renamed from: i */
        public Long f27305i;

        /* renamed from: j */
        public String f27306j;

        /* renamed from: k */
        public String f27307k;

        /* renamed from: l */
        public String f27308l;

        /* renamed from: m */
        public File f27309m;

        /* renamed from: n */
        public String f27310n;

        /* renamed from: o */
        public String f27311o;

        /* renamed from: a */
        public final C10044b mo18028a() {
            return new C10044b(this);
        }

        /* renamed from: a */
        public final C10047a mo18024a(C10120b bVar) {
            this.f27297a = bVar;
            return this;
        }

        /* renamed from: b */
        public final C10047a mo18029b(String str) {
            this.f27307k = str;
            return this;
        }

        /* renamed from: c */
        public final C10047a mo18031c(String str) {
            this.f27308l = str;
            return this;
        }

        /* renamed from: a */
        public final C10047a mo18023a(long j) {
            this.f27305i = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public final C10047a mo18030b(String... strArr) {
            this.f27298b = Arrays.asList(strArr);
            return this;
        }

        public C10047a(Context context) {
            this.f27300d = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C10047a mo18025a(File file) {
            this.f27309m = file;
            return this;
        }

        /* renamed from: a */
        public final C10047a mo18026a(String str) {
            this.f27306j = str;
            return this;
        }

        /* renamed from: a */
        public final C10047a mo18027a(String... strArr) {
            if (strArr.length > 0) {
                this.f27299c = Arrays.asList(strArr);
            }
            return this;
        }
    }

    /* renamed from: b */
    public final long mo18020b() {
        return this.f27294o.longValue();
    }

    /* renamed from: a */
    public final String mo18019a() {
        return (String) this.f27285f.get(0);
    }

    private C10044b(C10047a aVar) {
        this.f27280a = aVar.f27300d;
        if (this.f27280a != null) {
            this.f27285f = aVar.f27298b;
            this.f27286g = aVar.f27299c;
            this.f27283d = aVar.f27303g;
            this.f27287h = aVar.f27304h;
            this.f27294o = aVar.f27305i;
            this.f27288i = aVar.f27306j;
            this.f27289j = aVar.f27307k;
            this.f27291l = aVar.f27310n;
            this.f27292m = aVar.f27311o;
            if (aVar.f27309m == null) {
                this.f27293n = new File(this.f27280a.getFilesDir(), "gecko_offline_res_x");
            } else {
                this.f27293n = aVar.f27309m;
            }
            this.f27290k = aVar.f27308l;
            if (TextUtils.isEmpty(this.f27290k)) {
                throw new IllegalArgumentException("host == null");
            } else if (this.f27285f == null || this.f27285f.isEmpty()) {
                throw new IllegalArgumentException("access key empty");
            } else if (this.f27294o == null) {
                throw new IllegalArgumentException("appId == null");
            } else if (TextUtils.isEmpty(this.f27288i)) {
                throw new IllegalArgumentException("appVersion key empty");
            } else if (!TextUtils.isEmpty(this.f27289j)) {
                if (aVar.f27301e == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                        public final Thread newThread(Runnable runnable) {
                            Thread thread = new Thread(runnable);
                            thread.setName("gecko-update-thread");
                            thread.setPriority(3);
                            return thread;
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f27281b = threadPoolExecutor;
                } else {
                    this.f27281b = aVar.f27301e;
                }
                if (aVar.f27302f == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                        public final Thread newThread(Runnable runnable) {
                            Thread thread = new Thread(runnable);
                            thread.setName("gecko-check-update-thread");
                            thread.setPriority(3);
                            return thread;
                        }
                    });
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f27282c = threadPoolExecutor2;
                } else {
                    this.f27282c = aVar.f27302f;
                }
                if (aVar.f27297a == null) {
                    this.f27284e = new C10119a();
                } else {
                    this.f27284e = aVar.f27297a;
                }
            } else {
                throw new IllegalArgumentException("deviceId key empty");
            }
        } else {
            throw new IllegalArgumentException("context == null");
        }
    }
}
