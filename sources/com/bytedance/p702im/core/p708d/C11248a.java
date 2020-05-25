package com.bytedance.p702im.core.p708d;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.p702im.core.internal.C11261a;
import com.bytedance.p702im.core.internal.utils.C11463b;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p708d.p709a.C11251a;
import com.bytedance.p702im.core.proto.GetConversationsCheckInfoRequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.d.a */
public class C11248a {

    /* renamed from: a */
    public static boolean f30299a;

    /* renamed from: d */
    private static volatile C11248a f30300d;

    /* renamed from: b */
    public Handler f30301b;

    /* renamed from: c */
    public Runnable f30302c;

    private C11248a() {
        HandlerThread handlerThread = new HandlerThread("RepairManager-Thread");
        handlerThread.start();
        this.f30301b = new Handler(handlerThread.getLooper());
        f30299a = true;
    }

    /* renamed from: a */
    public static C11248a m22842a() {
        if (f30300d == null) {
            synchronized (C11248a.class) {
                if (f30300d == null) {
                    f30300d = new C11248a();
                }
            }
        }
        return f30300d;
    }

    /* renamed from: c */
    private void m22845c() {
        if (C11261a.m22865a() && this.f30302c == null) {
            final long j = C11261a.f30328b;
            this.f30302c = new Runnable() {
                public final void run() {
                    C11165c.m22588a().mo20514b(4);
                    C11248a.this.f30301b.postDelayed(this, j);
                }
            };
            this.f30301b.postDelayed(this.f30302c, j);
        }
    }

    /* renamed from: b */
    public static void m22844b() {
        if (C11261a.m22865a()) {
            m22842a().m22845c();
        }
        if (C11261a.m22866b()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C11498k.m23543a().mo21126d() > C11261a.m22867c()) {
                C11498k.m23543a().mo21121a(currentTimeMillis);
                for (int a : C11463b.m23445a()) {
                    m22843a(a);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m22843a(int i) {
        if (C11261a.m22866b()) {
            new C11251a().mo21053a(i, new Builder().get_conversations_checkinfo_body(new GetConversationsCheckInfoRequestBody.Builder().build()).build(), null, new Object[0]);
        }
    }
}
