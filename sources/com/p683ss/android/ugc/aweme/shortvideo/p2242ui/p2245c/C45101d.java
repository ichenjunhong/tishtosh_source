package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c.d */
public final class C45101d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114216a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45101d.class), "workerThread", "getWorkerThread()Landroid/os/HandlerThread;"))};

    /* renamed from: b */
    static C45099b f114217b = C45099b.RECORD_ON_NONE;

    /* renamed from: c */
    static final CopyOnWriteArrayList<C45098a> f114218c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    static final C45102a f114219d = new C45102a();

    /* renamed from: e */
    static final C45103b f114220e;

    /* renamed from: f */
    public static final C45101d f114221f = new C45101d();

    /* renamed from: g */
    private static final C52668f f114222g = C52732g.m112285a(C45105d.f114224a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c.d$a */
    public static final class C45102a extends Handler {
        public C45102a() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            Integer num;
            super.handleMessage(message);
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            int ordinal = C45099b.RECORD_ON_UI_SHOW.ordinal();
            if (num != null && num.intValue() == ordinal) {
                C45103b bVar = C45101d.f114220e;
                Message obtain = Message.obtain();
                obtain.what = C45104c.WORKER_POSTPONE_UI.ordinal();
                bVar.sendMessageDelayed(obtain, 300);
                return;
            }
            int ordinal2 = C45099b.RECORD_ON_DESTROY.ordinal();
            if (num != null && num.intValue() == ordinal2) {
                C45101d.f114217b = C45099b.RECORD_ON_NONE;
                C45101d.f114218c.clear();
                C45101d.f114219d.removeCallbacksAndMessages(null);
                C45101d.f114220e.removeCallbacksAndMessages(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c.d$b */
    public static final class C45103b extends Handler {
        public C45103b(Looper looper) {
            C52711k.m112240b(looper, "looper");
            super(looper);
        }

        public final void handleMessage(Message message) {
            Integer num;
            super.handleMessage(message);
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            int ordinal = C45104c.WORKER_POSTPONE_UI.ordinal();
            if (num != null && num.intValue() == ordinal && C39629l.m88232a().mo58583n().mo83103a(C40790a.EnablePostponeRecordTask)) {
                for (C45098a aVar : C45101d.f114218c) {
                    C52711k.m112236a((Object) aVar, "it");
                    C45100c.m98615a(aVar);
                }
                C45101d.f114218c.clear();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c.d$c */
    public enum C45104c {
        WORKER_POSTPONE_UI
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c.d$d */
    static final class C45105d extends C52712l implements C52670a<HandlerThread> {

        /* renamed from: a */
        public static final C45105d f114224a = new C45105d();

        C45105d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            HandlerThread handlerThread = new HandlerThread("record_task_manager");
            handlerThread.start();
            return handlerThread;
        }
    }

    private C45101d() {
    }

    static {
        Looper looper = ((HandlerThread) f114222g.getValue()).getLooper();
        C52711k.m112236a((Object) looper, "workerThread.looper");
        f114220e = new C45103b(looper);
    }

    /* renamed from: a */
    public static final void m98617a(C45099b bVar) {
        C52711k.m112240b(bVar, "status");
        f114217b = bVar;
        C45102a aVar = f114219d;
        Message obtain = Message.obtain();
        obtain.what = f114217b.ordinal();
        aVar.sendMessage(obtain);
    }

    /* renamed from: a */
    public static final C45101d m98616a(C45098a aVar) {
        C52711k.m112240b(aVar, "task");
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnablePostponeRecordTask) || f114217b.ordinal() == C45099b.RECORD_ON_UI_SHOW.ordinal()) {
            C45100c.m98615a(aVar);
        } else {
            f114218c.add(aVar);
        }
        return f114221f;
    }
}
