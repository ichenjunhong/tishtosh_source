package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C2240a;
import com.twitter.sdk.android.core.internal.C52114g;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.c */
public abstract class C52156c<T> implements C52170o<T> {

    /* renamed from: a */
    protected final Context f129819a;

    /* renamed from: b */
    protected final C52161g<T> f129820b;

    /* renamed from: c */
    final ScheduledExecutorService f129821c;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f129822d;

    /* renamed from: e */
    public volatile int f129823e = -1;

    /* renamed from: c */
    public final boolean mo108867c() {
        try {
            return this.f129820b.mo108884a();
        } catch (IOException e) {
            C52114g.m111465a(this.f129819a, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo108866b() {
        if (this.f129822d.get() != null) {
            C52114g.m111464a(this.f129819a, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f129822d.get()).cancel(false);
            this.f129822d.set(null);
        }
    }

    /* renamed from: a */
    public final void mo108864a() {
        C52172q d = mo108868d();
        if (d == null) {
            C52114g.m111464a(this.f129819a, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C52114g.m111464a(this.f129819a, "Sending all files");
        List c = this.f129820b.mo108886c();
        int i = 0;
        while (c.size() > 0) {
            try {
                C52114g.m111464a(this.f129819a, C2240a.m6773a(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(c.size())}));
                boolean a = d.mo108848a(c);
                if (a) {
                    i += c.size();
                    this.f129820b.mo108883a(c);
                }
                if (!a) {
                    break;
                }
                c = this.f129820b.mo108886c();
            } catch (Exception e) {
                Context context = this.f129819a;
                StringBuilder sb = new StringBuilder("Failed to send batch of analytics files to server: ");
                sb.append(e.getMessage());
                C52114g.m111465a(context, sb.toString(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.f129820b.mo108887d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo108869a(int i) {
        this.f129823e = i;
        m111537a(0, (long) this.f129823e);
    }

    /* renamed from: a */
    public final void mo108865a(T t) {
        boolean z;
        C52114g.m111464a(this.f129819a, t.toString());
        try {
            this.f129820b.mo108882a(t);
        } catch (IOException e) {
            C52114g.m111465a(this.f129819a, "Failed to write event.", (Throwable) e);
        }
        if (this.f129823e != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m111537a((long) this.f129823e, (long) this.f129823e);
        }
    }

    /* renamed from: a */
    private void m111537a(long j, long j2) {
        boolean z;
        if (this.f129822d.get() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C52153ad adVar = new C52153ad(this.f129819a, this);
            Context context = this.f129819a;
            StringBuilder sb = new StringBuilder("Scheduling time based file roll over every ");
            sb.append(j2);
            sb.append(" seconds");
            C52114g.m111464a(context, sb.toString());
            try {
                this.f129822d.set(this.f129821c.scheduleAtFixedRate(adVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C52114g.m111465a(this.f129819a, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }

    public C52156c(Context context, ScheduledExecutorService scheduledExecutorService, C52161g<T> gVar) {
        this.f129819a = context;
        this.f129821c = scheduledExecutorService;
        this.f129820b = gVar;
        this.f129822d = new AtomicReference<>();
    }
}
