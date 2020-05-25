package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a */
public final class C18256a<T> implements MetricQueue<T> {

    /* renamed from: a */
    final MetricPublisher<T> f50424a;

    /* renamed from: b */
    final int f50425b;

    /* renamed from: c */
    final Runnable f50426c = new Runnable() {
        public final void run() {
            C18256a.this.mo36421b();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ScheduledExecutorService f50427d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LinkedHashSet<C18267b<T>> f50428e = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final LinkedHashSet<C18267b<T>> f50429f = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicReference<Future<?>> f50430g = new AtomicReference<>();

    /* renamed from: a */
    public final void mo36420a() {
        this.f50427d.execute(new Runnable() {
            public final void run() {
                List persistedEvents = C18256a.this.f50424a.getPersistedEvents();
                if (persistedEvents != null && !persistedEvents.isEmpty()) {
                    C18256a.this.f50428e.addAll(persistedEvents);
                    C18256a.this.f50430g.set(C18256a.this.f50427d.schedule(C18256a.this.f50426c, 1000, TimeUnit.MILLISECONDS));
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo36421b() {
        Future future = (Future) this.f50430g.getAndSet(null);
        if (future != null) {
            future.cancel(false);
        }
        if (!this.f50428e.isEmpty()) {
            final ArrayList arrayList = new ArrayList(this.f50428e);
            this.f50428e.clear();
            this.f50429f.addAll(arrayList);
            this.f50424a.publishMetrics(m44474a((Collection<C18267b<T>>) arrayList), new PublishCallback() {
                public final void onNetworkError() {
                    C18256a.this.f50427d.execute(new Runnable() {
                        public final void run() {
                            C18256a.this.f50429f.removeAll(arrayList);
                            C18256a.this.f50428e.addAll(arrayList);
                        }
                    });
                }

                public final void onSuccess() {
                    C18256a.this.f50427d.execute(new Runnable() {
                        public final void run() {
                            C18256a.this.f50429f.removeAll(arrayList);
                            C18256a.m44477d(C18256a.this);
                        }
                    });
                }

                public final void onServerError(final Error error) {
                    C18256a.this.f50427d.execute(new Runnable() {
                        public final void run() {
                            C18256a.this.f50429f.removeAll(arrayList);
                            for (C18267b bVar : arrayList) {
                                if (bVar.f50449a <= 0) {
                                    bVar.f50449a++;
                                    C18256a.this.f50428e.add(bVar);
                                }
                            }
                            C18256a.m44477d(C18256a.this);
                        }
                    });
                }
            });
        }
    }

    public final void push(final T t) {
        this.f50427d.execute(new Runnable() {
            public final void run() {
                C18256a.this.f50428e.add(new C18267b(t));
                C18256a.m44477d(C18256a.this);
                if (C18256a.this.f50428e.size() >= C18256a.this.f50425b) {
                    C18256a.this.mo36421b();
                    return;
                }
                if (C18256a.this.f50430g.get() == null) {
                    C18256a.this.f50430g.set(C18256a.this.f50427d.schedule(C18256a.this.f50426c, 30000, TimeUnit.MILLISECONDS));
                }
            }
        });
    }

    /* renamed from: a */
    private static <T> List<T> m44474a(Collection<C18267b<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C18267b bVar : collection) {
            arrayList.add(bVar.f50450b);
        }
        return arrayList;
    }

    /* renamed from: d */
    static /* synthetic */ void m44477d(C18256a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f50428e);
        arrayList.addAll(aVar.f50429f);
        aVar.f50424a.persistMetrics(arrayList);
    }

    C18256a(MetricPublisher<T> metricPublisher, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f50424a = metricPublisher;
        this.f50427d = scheduledExecutorService;
        this.f50425b = 1;
    }
}
