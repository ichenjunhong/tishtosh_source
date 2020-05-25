package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.DeepMemoryLeakExperiment;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MemoryExperimentTask */
public final class MemoryExperimentTask implements LegoTask {
    public static final C35951a Companion = new C35951a(null);
    public static byte[] memoryLeak;
    public Handler handler;
    private final HandlerThread handlerThread = new HandlerThread("MemoryPeakThread");

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.MemoryExperimentTask$a */
    public static final class C35951a {
        private C35951a() {
        }

        public /* synthetic */ C35951a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.MemoryExperimentTask$b */
    public static final class C35952b extends Handler {

        /* renamed from: a */
        final /* synthetic */ MemoryExperimentTask f92181a;

        public final void handleMessage(Message message) {
            this.f92181a.detectMemory();
            Handler handler = this.f92181a.handler;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(0, 10000);
            }
        }

        C35952b(MemoryExperimentTask memoryExperimentTask, Looper looper) {
            this.f92181a = memoryExperimentTask;
            super(looper);
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void detectMemory() {
        Runtime.getRuntime().totalMemory();
        Runtime.getRuntime().freeMemory();
        if (memoryLeak != null) {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = memoryLeak;
            if (bArr == null) {
                C52711k.m112234a();
            }
            sb.append(String.valueOf(bArr.length));
            sb.append("after leak java memory :");
        }
    }

    public final void run(Context context) {
        int a = C10181b.m20511a().mo18168a(DeepMemoryLeakExperiment.class, true, "deep_memory_leak", 31744, 0);
        if (a > DeepMemoryLeakExperiment.DEFAULT) {
            detectMemory();
            memoryLeak = new byte[(a * 5242880)];
            this.handlerThread.start();
            this.handler = new C35952b(this, this.handlerThread.getLooper());
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.sendEmptyMessage(0);
            }
        }
    }
}
