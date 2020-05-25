package com.facebook.drawee.p935b;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.facebook.drawee.b.b */
public class C13780b {

    /* renamed from: b */
    private static final C13780b f35871b = new C13780b();

    /* renamed from: c */
    private static boolean f35872c = true;

    /* renamed from: a */
    private final Queue<C13781a> f35873a = new ArrayBlockingQueue(20);

    /* renamed from: com.facebook.drawee.b.b$a */
    public enum C13781a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    public String toString() {
        return this.f35873a.toString();
    }

    private C13780b() {
    }

    /* renamed from: a */
    public static C13780b m27909a() {
        if (f35872c) {
            return new C13780b();
        }
        return f35871b;
    }

    /* renamed from: a */
    public final void mo25731a(C13781a aVar) {
        if (f35872c) {
            if (this.f35873a.size() + 1 > 20) {
                this.f35873a.poll();
            }
            this.f35873a.add(aVar);
        }
    }
}
