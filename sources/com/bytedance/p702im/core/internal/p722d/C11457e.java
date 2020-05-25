package com.bytedance.p702im.core.internal.p722d;

import android.os.Looper;
import android.os.Message;
import com.bytedance.p702im.core.internal.utils.C11501n;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.im.core.internal.d.e */
public final class C11457e<T> implements C11502a, Runnable {

    /* renamed from: a */
    private C11456d<T> f30755a;

    /* renamed from: b */
    private C11455c<T> f30756b;

    /* renamed from: c */
    private T f30757c;

    /* renamed from: d */
    private C11501n f30758d = new C11501n(Looper.getMainLooper(), this);

    /* renamed from: e */
    private Executor f30759e;

    /* renamed from: a */
    private void m23433a() {
        this.f30759e.execute(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r2 = this;
            com.bytedance.im.core.internal.d.d<T> r0 = r2.f30755a
            if (r0 == 0) goto L_0x000f
            com.bytedance.im.core.internal.d.d<T> r0 = r2.f30755a     // Catch:{ Exception -> 0x000b }
            java.lang.Object r0 = r0.mo20683a()     // Catch:{ Exception -> 0x000b }
            goto L_0x0010
        L_0x000b:
            r0 = move-exception
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r0)
        L_0x000f:
            r0 = 0
        L_0x0010:
            r2.f30757c = r0
            com.bytedance.im.core.internal.utils.n r0 = r2.f30758d
            if (r0 == 0) goto L_0x0026
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 100001(0x186a1, float:1.40131E-40)
            r0.what = r1
            r0.obj = r2
            com.bytedance.im.core.internal.utils.n r1 = r2.f30758d
            r1.sendMessage(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p722d.C11457e.run():void");
    }

    /* renamed from: a */
    public final void mo20961a(Message message) {
        if (message.obj instanceof C11457e) {
            C11457e eVar = (C11457e) message.obj;
            if (message.what == 100001 && eVar.f30756b != null) {
                try {
                    eVar.f30756b.mo20684a(eVar.f30757c);
                } catch (Exception e) {
                    C11176d.m22632a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> void m23434a(C11456d<T> dVar, C11455c<T> cVar) {
        if (C11165c.m22588a().f30110e) {
            new C11457e(dVar, cVar, C11452a.m23424a()).m23433a();
        }
    }

    private C11457e(C11456d<T> dVar, C11455c<T> cVar, Executor executor) {
        this.f30755a = dVar;
        this.f30756b = cVar;
        this.f30759e = executor;
    }

    /* renamed from: a */
    public static <T> void m23435a(C11456d<T> dVar, C11455c<T> cVar, Executor executor) {
        if (C11165c.m22588a().f30110e) {
            new C11457e(dVar, cVar, executor).m23433a();
        }
    }
}
