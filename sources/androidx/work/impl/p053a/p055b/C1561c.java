package androidx.work.impl.p053a.p055b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.C2240a;

/* renamed from: androidx.work.impl.a.b.c */
public abstract class C1561c<T> extends C1563d<T> {

    /* renamed from: b */
    private final BroadcastReceiver f5558b = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C1561c.this.mo5951a(context, intent);
            }
        }
    };

    /* renamed from: a */
    public abstract IntentFilter mo5950a();

    /* renamed from: a */
    public abstract void mo5951a(Context context, Intent intent);

    /* renamed from: c */
    public final void mo5953c() {
        C2240a.m6772a("%s: registering receiver", new Object[]{getClass().getSimpleName()});
        this.f5560a.registerReceiver(this.f5558b, mo5950a());
    }

    /* renamed from: d */
    public final void mo5954d() {
        C2240a.m6772a("%s: unregistering receiver", new Object[]{getClass().getSimpleName()});
        this.f5560a.unregisterReceiver(this.f5558b);
    }

    public C1561c(Context context) {
        super(context);
    }
}
