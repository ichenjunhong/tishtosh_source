package com.p2620vk.sdk.api.p2622a;

import com.p2620vk.sdk.api.C52351b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vk.sdk.api.a.a */
public abstract class C52327a {

    /* renamed from: a */
    public C52331b f130308a;

    /* renamed from: b */
    public C52332c f130309b = C52332c.Created;

    /* renamed from: c */
    private boolean f130310c;

    /* renamed from: d */
    private ExecutorService f130311d;

    /* renamed from: com.vk.sdk.api.a.a$a */
    public static abstract class C52330a<OperationType extends C52327a, ResponseType> {
        /* renamed from: a */
        public abstract void mo109144a(OperationType operationtype, C52351b bVar);

        /* renamed from: a */
        public abstract void mo109145a(OperationType operationtype, ResponseType responsetype);
    }

    /* renamed from: com.vk.sdk.api.a.a$b */
    public interface C52331b {
        /* renamed from: a */
        void mo109146a();
    }

    /* renamed from: com.vk.sdk.api.a.a$c */
    public enum C52332c {
        Created,
        Ready,
        Executing,
        Paused,
        Finished,
        Canceled
    }

    public C52327a() {
        mo109140a(C52332c.Ready);
    }

    /* renamed from: a */
    public void mo109139a() {
        this.f130310c = true;
        mo109140a(C52332c.Canceled);
    }

    /* renamed from: b */
    public void mo109142b() {
        C523281 r0 = new Runnable() {
            public final void run() {
                if (C52327a.this.f130308a != null) {
                    C52327a.this.f130308a.mo109146a();
                }
            }
        };
        if (this.f130311d != null) {
            this.f130311d.submit(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: a */
    public void mo109141a(ExecutorService executorService) {
        this.f130311d = executorService;
    }

    /* renamed from: a */
    public final void mo109140a(C52332c cVar) {
        if (!m111799a(this.f130309b, cVar, this.f130310c)) {
            this.f130309b = cVar;
            if (this.f130309b == C52332c.Finished || this.f130309b == C52332c.Canceled) {
                mo109142b();
            }
        }
    }

    /* renamed from: a */
    private static boolean m111799a(C52332c cVar, C52332c cVar2, boolean z) {
        switch (cVar) {
            case Paused:
                if (C523292.f130313a[cVar2.ordinal()] == 3 || cVar2 == C52332c.Ready) {
                    return false;
                }
                return true;
            case Executing:
                int i = C523292.f130313a[cVar2.ordinal()];
                if (i != 1) {
                    switch (i) {
                        case 3:
                        case 4:
                            break;
                        default:
                            return true;
                    }
                }
                return false;
            case Canceled:
            case Finished:
                return true;
            case Ready:
                switch (cVar2) {
                    case Paused:
                    case Executing:
                    case Canceled:
                        return false;
                    case Finished:
                        if (!z) {
                            return true;
                        }
                        return false;
                    default:
                        return true;
                }
            default:
                return false;
        }
    }
}
