package android.support.p030v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: android.support.v4.view.c */
public final class C1028c {

    /* renamed from: a */
    LayoutInflater f3282a;

    /* renamed from: b */
    Handler f3283b;

    /* renamed from: c */
    C1032c f3284c;

    /* renamed from: d */
    private Callback f3285d = new Callback() {
        public final boolean handleMessage(Message message) {
            C1031b bVar = (C1031b) message.obj;
            if (bVar.f3291d == null) {
                bVar.f3291d = C1028c.this.f3282a.inflate(bVar.f3290c, bVar.f3289b, false);
            }
            bVar.f3292e.onInflateFinished(bVar.f3291d, bVar.f3290c, bVar.f3289b);
            C1032c cVar = C1028c.this.f3284c;
            bVar.f3292e = null;
            bVar.f3288a = null;
            bVar.f3289b = null;
            bVar.f3290c = 0;
            bVar.f3291d = null;
            cVar.f3295c.release(bVar);
            return true;
        }
    };

    /* renamed from: android.support.v4.view.c$a */
    static class C1030a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f3287a = {"android.widget.", "android.webkit.", "android.app."};

        C1030a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new C1030a(context);
        }

        /* access modifiers changed from: protected */
        public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = f3287a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: android.support.v4.view.c$b */
    static class C1031b {

        /* renamed from: a */
        C1028c f3288a;

        /* renamed from: b */
        ViewGroup f3289b;

        /* renamed from: c */
        int f3290c;

        /* renamed from: d */
        View f3291d;

        /* renamed from: e */
        C1033d f3292e;

        C1031b() {
        }
    }

    /* renamed from: android.support.v4.view.c$c */
    static class C1032c extends Thread {

        /* renamed from: a */
        static final C1032c f3293a;

        /* renamed from: b */
        ArrayBlockingQueue<C1031b> f3294b = new ArrayBlockingQueue<>(10);

        /* renamed from: c */
        C0798c<C1031b> f3295c = new C0798c<>(10);

        static {
            C1032c cVar = new C1032c();
            f3293a = cVar;
            cVar.start();
        }

        private C1032c() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|9|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:7:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.ArrayBlockingQueue<android.support.v4.view.c$b> r0 = r5.f3294b     // Catch:{ InterruptedException -> 0x0000 }
                java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
                android.support.v4.view.c$b r0 = (android.support.p030v4.view.C1028c.C1031b) r0     // Catch:{ InterruptedException -> 0x0000 }
                r1 = 0
                android.support.v4.view.c r2 = r0.f3288a     // Catch:{ RuntimeException -> 0x0017 }
                android.view.LayoutInflater r2 = r2.f3282a     // Catch:{ RuntimeException -> 0x0017 }
                int r3 = r0.f3290c     // Catch:{ RuntimeException -> 0x0017 }
                android.view.ViewGroup r4 = r0.f3289b     // Catch:{ RuntimeException -> 0x0017 }
                android.view.View r2 = r2.inflate(r3, r4, r1)     // Catch:{ RuntimeException -> 0x0017 }
                r0.f3291d = r2     // Catch:{ RuntimeException -> 0x0017 }
            L_0x0017:
                android.support.v4.view.c r2 = r0.f3288a
                android.os.Handler r2 = r2.f3283b
                android.os.Message r0 = android.os.Message.obtain(r2, r1, r0)
                r0.sendToTarget()
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.C1028c.C1032c.run():void");
        }
    }

    /* renamed from: android.support.v4.view.c$d */
    public interface C1033d {
        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    public C1028c(Context context) {
        this.f3282a = new C1030a(context);
        this.f3283b = new Handler(this.f3285d);
        this.f3284c = C1032c.f3293a;
    }

    /* renamed from: a */
    public final void mo3205a(int i, ViewGroup viewGroup, C1033d dVar) {
        C1031b bVar = (C1031b) this.f3284c.f3295c.acquire();
        if (bVar == null) {
            bVar = new C1031b();
        }
        bVar.f3288a = this;
        bVar.f3290c = i;
        bVar.f3289b = viewGroup;
        bVar.f3292e = dVar;
        try {
            this.f3284c.f3294b.put(bVar);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}
