package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48748d;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.c */
public final class C48858c extends C48656j implements C48686a {

    /* renamed from: a */
    private static Field f122768a;

    /* renamed from: b */
    private C48620c f122769b;

    /* renamed from: f */
    private C48565a f122770f;

    /* renamed from: g */
    private C48890g f122771g = this.f122770f.f122047a;

    /* renamed from: h */
    private Queue<Effect> f122772h;

    /* renamed from: i */
    private List<Effect> f122773i;

    /* renamed from: j */
    private Handler f122774j;

    /* renamed from: k */
    private DownloadEffectExtra f122775k;

    /* renamed from: a */
    public final void mo96139a() {
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        try {
            this.f122774j = new C48685j(myLooper, this);
            Effect effect = (Effect) this.f122772h.poll();
            if (effect != null) {
                m105587b(effect);
                Looper.loop();
            }
        } catch (Throwable th) {
            myLooper.quit();
            m105586a(Thread.currentThread());
            throw th;
        }
        myLooper.quit();
        m105586a(Thread.currentThread());
    }

    /* renamed from: b */
    private void m105587b(final Effect effect) {
        this.f122774j.post(new Runnable() {
            public final void run() {
                C48858c.this.mo96328a(effect);
            }
        });
    }

    /* renamed from: a */
    private static void m105586a(Thread thread) {
        Field field;
        try {
            if (f122768a != null) {
                field = f122768a;
            } else {
                if (VERSION.SDK_INT >= 24) {
                    field = Thread.class.getDeclaredField("threadLocals");
                } else {
                    field = Thread.class.getDeclaredField("localValues");
                }
                f122768a = field;
            }
            field.setAccessible(true);
            field.set(thread, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        if (message.what == 15) {
            C48749e eVar = (C48749e) message.obj;
            Effect effect = eVar.f122430b;
            C48649d dVar = eVar.f122431c;
            if (dVar != null) {
                mo96238a(17, new C48748d(this.f122773i, dVar));
                Looper.myLooper().quit();
                return;
            }
            this.f122773i.add(effect);
            if (!this.f122772h.isEmpty()) {
                m105587b((Effect) this.f122772h.poll());
            } else {
                mo96238a(17, new C48748d(this.f122773i, null));
                Looper.myLooper().quit();
            }
        }
    }

    /* renamed from: a */
    public final void mo96328a(Effect effect) {
        if (TextUtils.isEmpty(effect.getZipPath()) || TextUtils.isEmpty(effect.getUnzipPath())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122771g.f122964j);
            sb.append(File.separator);
            sb.append(effect.getId());
            sb.append(".zip");
            effect.setZipPath(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f122771g.f122964j);
            sb2.append(File.separator);
            sb2.append(effect.getId());
            effect.setUnzipPath(sb2.toString());
        }
        if (!this.f122769b.mo96155d(effect.getId())) {
            try {
                C48565a aVar = this.f122770f;
                String str = this.f122293e;
                if (str == null) {
                    str = "";
                }
                C48860d dVar = new C48860d(effect, aVar, str, this.f122774j, this.f122775k);
                dVar.mo96139a();
            } catch (RuntimeException e) {
                throw e;
            }
        } else {
            C48749e eVar = new C48749e(effect, null);
            Message obtainMessage = this.f122774j.obtainMessage(15);
            obtainMessage.obj = eVar;
            obtainMessage.sendToTarget();
        }
    }

    public C48858c(C48565a aVar, List<Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.f122770f = aVar;
        this.f122769b = aVar.f122047a.f122972r;
        this.f122772h = new ArrayDeque(list);
        this.f122773i = new ArrayList();
        this.f122775k = downloadEffectExtra;
    }
}
