package com.bytedance.p702im.core.internal.utils;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.l */
public class C11499l implements C11502a {

    /* renamed from: a */
    private static C11499l f30839a;

    /* renamed from: b */
    private C11501n f30840b;

    /* renamed from: c */
    private long f30841c;

    private C11499l() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-SNAPSHOT");
        handlerThread.start();
        this.f30840b = new C11501n(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public static C11499l m23554a() {
        if (f30839a == null) {
            synchronized (C11499l.class) {
                if (f30839a == null) {
                    f30839a = new C11499l();
                }
            }
        }
        return f30839a;
    }

    /* renamed from: b */
    public static List<C11180b> m23555b() {
        try {
            return Arrays.asList((C11180b[]) C11466d.f30773a.mo34884a(C11498k.m23543a().f30838a.getString(C11498k.m23545a("im_snapshot"), ""), C11180b[].class));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo21127c() {
        if (!this.f30840b.hasMessages(1001)) {
            if (SystemClock.uptimeMillis() - this.f30841c <= C11165c.m22588a().mo20513b().f30132G) {
                this.f30840b.sendEmptyMessageDelayed(1001, (this.f30841c + C11165c.m22588a().mo20513b().f30132G) - SystemClock.uptimeMillis());
            } else {
                m23556d();
            }
        }
    }

    /* renamed from: d */
    private synchronized void m23556d() {
        this.f30841c = SystemClock.uptimeMillis();
        List b = C11182d.m22641a().mo20667b();
        if (b.size() > C11165c.m22588a().mo20513b().f30131F) {
            b = b.subList(0, C11165c.m22588a().mo20513b().f30131F);
        }
        try {
            C11498k.m23543a().f30838a.edit().putString(C11498k.m23545a("im_snapshot"), C11466d.f30773a.mo34889b(b.toArray(new C11180b[0]))).commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo20961a(Message message) {
        if (message.what == 1001) {
            m23556d();
        }
    }
}
