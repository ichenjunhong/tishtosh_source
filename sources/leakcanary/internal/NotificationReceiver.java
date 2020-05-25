package leakcanary.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

public final class NotificationReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C53394b f132060a = new C53394b(null);

    /* renamed from: leakcanary.internal.NotificationReceiver$a */
    public enum C53393a {
        DUMP_HEAP,
        CANCEL_NOTIFICATION
    }

    /* renamed from: leakcanary.internal.NotificationReceiver$b */
    public static final class C53394b {
        private C53394b() {
        }

        public /* synthetic */ C53394b(C52707g gVar) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        String action = intent.getAction();
        if (C52711k.m112239a((Object) action, (Object) C53393a.DUMP_HEAP.name())) {
            InternalLeakCanary.INSTANCE.onDumpHeapReceived();
            return;
        }
        if (!C52711k.m112239a((Object) action, (Object) C53393a.CANCEL_NOTIFICATION.name())) {
            C53174a a = C53173a.m112969a();
            if (a != null) {
                StringBuilder sb = new StringBuilder("NotificationReceiver received unknown intent action for ");
                sb.append(intent);
                a.mo110681a(sb.toString());
            }
        }
    }
}
