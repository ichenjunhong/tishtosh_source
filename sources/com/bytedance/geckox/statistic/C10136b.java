package com.bytedance.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p600e.C10102h;
import com.bytedance.geckox.p600e.C10103i;
import com.bytedance.geckox.statistic.model.C10150a;
import com.bytedance.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords;
import com.bytedance.geckox.utils.C10162j;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import com.bytedance.p782n.p784b.C12379a;

/* renamed from: com.bytedance.geckox.statistic.b */
public final class C10136b {
    /* renamed from: a */
    public static C12379a m20425a() {
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel()).f27470i = true;
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27470i = false;
                a.f27473l = SystemClock.uptimeMillis();
                a.f27480s = th.getMessage();
            }
        };
    }

    /* renamed from: b */
    public static C12379a m20428b() {
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27471j = true;
                a.f27474m = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27471j = false;
                a.f27474m = SystemClock.uptimeMillis();
                a.f27481t = th.getMessage();
            }
        };
    }

    /* renamed from: c */
    public static C12379a m20430c() {
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27471j = true;
                a.f27475n = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27471j = false;
                a.f27475n = SystemClock.uptimeMillis();
                a.f27481t = th.getMessage();
            }
        };
    }

    /* renamed from: d */
    public static C12379a m20431d() {
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27458C = true;
                a.f27487z = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27458C = false;
                a.f27487z = SystemClock.uptimeMillis();
                a.f27460E = th.getMessage();
            }
        };
    }

    /* renamed from: a */
    public static C12379a m20426a(final Context context) {
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10102h.class)).second).getChannel());
                a.f27457B = true;
                a.f27486y = SystemClock.uptimeMillis();
            }

            /* renamed from: c */
            public final <T> void mo18099c(C12378b<T> bVar, C12382d dVar) {
                super.mo18099c(bVar, dVar);
                Pair pair = (Pair) bVar.mo23392b(C10102h.class);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) pair.second).getChannel());
                a.f27483v = ((Uri) pair.first).toString();
                a.f27477p = C10162j.m20488a(context);
                a.f27485x = SystemClock.uptimeMillis();
                a.f27479r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a.f27464c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    a.f27462a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    a.f27463b = ((UpdatePackage) pair.second).getGroupName();
                }
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                Pair pair = (Pair) bVar.mo23392b(C10102h.class);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a.f27457B = false;
                a.f27486y = SystemClock.uptimeMillis();
                a.f27484w.add(new DownloadFailRecords(uri, th.getMessage()));
            }
        };
    }

    /* renamed from: b */
    public static C12379a m20429b(final Context context) {
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) ((Pair) bVar.mo23392b(C10103i.class)).second).getChannel());
                a.f27469h = true;
                a.f27468g = SystemClock.uptimeMillis();
            }

            /* renamed from: c */
            public final <T> void mo18099c(C12378b<T> bVar, C12382d dVar) {
                super.mo18099c(bVar, dVar);
                Pair pair = (Pair) bVar.mo23392b(C10103i.class);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) pair.second).getChannel());
                a.f27465d = ((Uri) pair.first).toString();
                a.f27477p = C10162j.m20488a(context);
                a.f27467f = SystemClock.uptimeMillis();
                a.f27478q = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                a.f27479r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a.f27464c = ((UpdatePackage) pair.second).getChannel();
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                Pair pair = (Pair) bVar.mo23392b(C10103i.class);
                C10150a a = C10135a.m20422a(dVar.f32618f).mo18147a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a.f27469h = false;
                a.f27468g = SystemClock.uptimeMillis();
                a.f27466e.add(new DownloadFailRecords(uri, th.getMessage()));
            }
        };
    }

    /* renamed from: a */
    public static C12379a m20427a(final C10044b bVar) {
        return new C12379a() {
            /* renamed from: a */
            public final <T> void mo18097a(C12378b<T> bVar, C12382d dVar) {
                super.mo18097a(bVar, dVar);
                C10148c.m20461a(bVar, C10135a.m20422a(dVar.f32618f));
            }

            /* renamed from: b */
            public final <T> void mo18149b(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18149b(bVar, dVar, th);
                C10148c.m20461a(bVar, C10135a.m20422a(dVar.f32618f));
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                C10148c.m20461a(bVar, C10135a.m20422a(dVar.f32618f));
            }
        };
    }
}
