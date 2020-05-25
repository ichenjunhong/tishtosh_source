package com.facebook.fresco.animation.p948b.p950b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.SparseArray;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13715a;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p948b.C13867b;
import com.facebook.fresco.animation.p948b.C13873c;
import com.facebook.imagepipeline.p963c.C13946f;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.fresco.animation.b.b.c */
public class C13870c implements C13869b {

    /* renamed from: a */
    public static final Class<?> f36177a = C13870c.class;

    /* renamed from: b */
    public final C13946f f36178b;

    /* renamed from: c */
    public final C13873c f36179c;

    /* renamed from: d */
    public final Config f36180d;

    /* renamed from: e */
    public final SparseArray<Runnable> f36181e = new SparseArray<>();

    /* renamed from: f */
    private final ExecutorService f36182f;

    /* renamed from: com.facebook.fresco.animation.b.b.c$a */
    class C13871a implements Runnable {

        /* renamed from: b */
        private final C13867b f36184b;

        /* renamed from: c */
        private final C13857a f36185c;

        /* renamed from: d */
        private final int f36186d;

        /* renamed from: e */
        private final int f36187e;

        public final void run() {
            try {
                if (this.f36184b.mo26016c(this.f36186d)) {
                    C13697a.m27673a(C13870c.f36177a, "Frame %d is cached already.", (Object) Integer.valueOf(this.f36186d));
                    synchronized (C13870c.this.f36181e) {
                        C13870c.this.f36181e.remove(this.f36187e);
                    }
                    return;
                }
                if (m28255a(this.f36186d, 1)) {
                    C13697a.m27673a(C13870c.f36177a, "Prepared frame frame %d.", (Object) Integer.valueOf(this.f36186d));
                } else {
                    C13697a.m27694c(C13870c.f36177a, "Could not prepare frame %d.", Integer.valueOf(this.f36186d));
                }
                synchronized (C13870c.this.f36181e) {
                    C13870c.this.f36181e.remove(this.f36187e);
                }
            } catch (Throwable th) {
                synchronized (C13870c.this.f36181e) {
                    C13870c.this.f36181e.remove(this.f36187e);
                    throw th;
                }
            }
        }

        /* renamed from: a */
        private boolean m28255a(int i, int i2) {
            C13715a aVar;
            char c;
            boolean a;
            while (true) {
                switch (i2) {
                    case 1:
                        aVar = this.f36184b.mo26011a(i, this.f36185c.mo25996a(), this.f36185c.mo26001b());
                        c = 2;
                        break;
                    case 2:
                        try {
                            aVar = C13870c.this.f36178b.mo26111b(this.f36185c.mo25996a(), this.f36185c.mo26001b(), C13870c.this.f36180d);
                            c = 65535;
                            break;
                        } catch (RuntimeException e) {
                            C13697a.m27677a(C13870c.f36177a, "Failed to create frame bitmap", (Throwable) e);
                            C13715a.m27752c(null);
                            return false;
                        } catch (Throwable th) {
                            C13715a.m27752c(null);
                            throw th;
                        }
                    default:
                        C13715a.m27752c(null);
                        return false;
                }
                a = m28256a(i, aVar, i2);
                C13715a.m27752c(aVar);
                if (a || c == 65535) {
                    return a;
                }
                i2 = 2;
            }
            return a;
        }

        /* renamed from: a */
        private boolean m28256a(int i, C13715a<Bitmap> aVar, int i2) {
            if (!C13715a.m27750a(aVar) || !C13870c.this.f36179c.mo26021a(i, (Bitmap) aVar.mo25630a())) {
                return false;
            }
            C13697a.m27673a(C13870c.f36177a, "Frame %d ready.", (Object) Integer.valueOf(this.f36186d));
            synchronized (C13870c.this.f36181e) {
                this.f36184b.mo26015b(this.f36186d, aVar, i2);
            }
            return true;
        }

        public C13871a(C13857a aVar, C13867b bVar, int i, int i2) {
            this.f36185c = aVar;
            this.f36184b = bVar;
            this.f36186d = i;
            this.f36187e = i2;
        }
    }

    /* renamed from: a */
    public final boolean mo26017a(C13867b bVar, C13857a aVar, int i) {
        int hashCode = (aVar.hashCode() * 31) + i;
        synchronized (this.f36181e) {
            if (this.f36181e.get(hashCode) != null) {
                C13697a.m27673a(f36177a, "Already scheduled decode job for frame %d", (Object) Integer.valueOf(i));
                return true;
            } else if (bVar.mo26016c(i)) {
                C13697a.m27673a(f36177a, "Frame %d is cached already.", (Object) Integer.valueOf(i));
                return true;
            } else {
                C13871a aVar2 = new C13871a(aVar, bVar, i, hashCode);
                this.f36181e.put(hashCode, aVar2);
                this.f36182f.execute(aVar2);
                return true;
            }
        }
    }

    public C13870c(C13946f fVar, C13873c cVar, Config config, ExecutorService executorService) {
        this.f36178b = fVar;
        this.f36179c = cVar;
        this.f36180d = config;
        this.f36182f = executorService;
    }
}
