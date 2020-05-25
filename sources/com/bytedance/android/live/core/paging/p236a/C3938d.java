package com.bytedance.android.live.core.paging.p236a;

import android.arch.lifecycle.C0199s;
import android.arch.p010b.C0055a;
import android.arch.p010b.C0055a.C00572;
import android.arch.p010b.C0082h;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1210a;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.p051e.C1216d;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.android.live.core.paging.a.d */
final /* synthetic */ class C3938d implements C0199s {

    /* renamed from: a */
    private final C3930c f10973a;

    C3938d(C3930c cVar) {
        this.f10973a = cVar;
    }

    public final void onChanged(Object obj) {
        C0082h<T> hVar = (C0082h) obj;
        C0055a<T> aVar = this.f10973a.f232a;
        if (hVar != null) {
            if (aVar.f131f == null && aVar.f132g == null) {
                aVar.f130e = hVar.mo96a();
            } else if (hVar.mo96a() != aVar.f130e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        if (hVar != aVar.f131f) {
            int i = aVar.f133h + 1;
            aVar.f133h = i;
            if (hVar == null) {
                int a = aVar.mo82a();
                if (aVar.f131f != null) {
                    aVar.f131f.mo122a(aVar.f134i);
                    aVar.f131f = null;
                } else if (aVar.f132g != null) {
                    aVar.f132g = null;
                }
                aVar.f126a.mo166b(0, a);
            } else if (aVar.f131f == null && aVar.f132g == null) {
                aVar.f131f = hVar;
                hVar.mo123a(null, aVar.f134i);
                aVar.f126a.mo164a(0, hVar.size());
            } else {
                if (aVar.f131f != null) {
                    aVar.f131f.mo122a(aVar.f134i);
                    aVar.f132g = (C0082h) aVar.f131f.mo131e();
                    aVar.f131f = null;
                }
                if (aVar.f132g == null || aVar.f131f != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                C0082h<T> hVar2 = aVar.f132g;
                C0082h hVar3 = (C0082h) hVar.mo131e();
                Executor executor = aVar.f127b.f3967b;
                C00572 r1 = new Runnable(hVar2, hVar3, i, hVar) {

                    /* renamed from: a */
                    final /* synthetic */ C0082h f136a;

                    /* renamed from: b */
                    final /* synthetic */ C0082h f137b;

                    /* renamed from: c */
                    final /* synthetic */ int f138c;

                    /* renamed from: d */
                    final /* synthetic */ C0082h f139d;

                    public final void run() {
                        C0092j<T> jVar = this.f136a.f204g;
                        C0092j<T> jVar2 = this.f137b.f204g;
                        C1212c<T> cVar = C0055a.this.f127b.f3968c;
                        int b = jVar.mo151b();
                        C00951 r1 = new C1210a(jVar, b, jVar2, cVar, (jVar.size() - b) - jVar.mo153c(), (jVar2.size() - jVar2.mo151b()) - jVar2.mo153c()) {

                            /* renamed from: a */
                            final /* synthetic */ C0092j f244a;

                            /* renamed from: b */
                            final /* synthetic */ int f245b;

                            /* renamed from: c */
                            final /* synthetic */ C0092j f246c;

                            /* renamed from: d */
                            final /* synthetic */ C1212c f247d;

                            /* renamed from: e */
                            final /* synthetic */ int f248e;

                            /* renamed from: f */
                            final /* synthetic */ int f249f;

                            /* renamed from: a */
                            public final int mo159a() {
                                return this.f248e;
                            }

                            /* renamed from: b */
                            public final int mo161b() {
                                return this.f249f;
                            }

                            /* renamed from: a */
                            public final Object mo160a(int i, int i2) {
                                Object obj = this.f244a.get(i + this.f245b);
                                C0092j jVar = this.f246c;
                                Object obj2 = jVar.get(i2 + jVar.f236b);
                                if (obj == null || obj2 == null) {
                                    return null;
                                }
                                return this.f247d.mo3934c(obj, obj2);
                            }

                            /* renamed from: b */
                            public final boolean mo162b(int i, int i2) {
                                Object obj = this.f244a.get(i + this.f245b);
                                C0092j jVar = this.f246c;
                                Object obj2 = jVar.get(i2 + jVar.f236b);
                                if (obj == obj2) {
                                    return true;
                                }
                                if (obj == null || obj2 == null) {
                                    return false;
                                }
                                return this.f247d.mo3932a(obj, obj2);
                            }

                            /* renamed from: c */
                            public final boolean mo163c(int i, int i2) {
                                Object obj = this.f244a.get(i + this.f245b);
                                C0092j jVar = this.f246c;
                                Object obj2 = jVar.get(i2 + jVar.f236b);
                                if (obj == obj2) {
                                    return true;
                                }
                                if (obj == null || obj2 == null) {
                                    return false;
                                }
                                return this.f247d.mo3933b(obj, obj2);
                            }

                            {
                                this.f244a = r1;
                                this.f245b = r2;
                                this.f246c = r3;
                                this.f247d = r4;
                                this.f248e = r5;
                                this.f249f = r6;
                            }
                        };
                        final C1211b a = C1208c.m3655a(r1, true);
                        C0055a.this.f128c.execute(new Runnable() {
                            public final void run() {
                                if (C0055a.this.f133h == C00572.this.f138c) {
                                    C0055a aVar = C0055a.this;
                                    C0082h<T> hVar = C00572.this.f139d;
                                    C0082h hVar2 = C00572.this.f137b;
                                    C1211b bVar = a;
                                    if (aVar.f132g == null || aVar.f131f != null) {
                                        throw new IllegalStateException("must be in snapshot state to apply diff");
                                    }
                                    C0082h<T> hVar3 = aVar.f132g;
                                    aVar.f131f = hVar;
                                    aVar.f132g = null;
                                    C1216d dVar = aVar.f126a;
                                    C0092j<T> jVar = hVar3.f204g;
                                    C0092j<T> jVar2 = hVar.f204g;
                                    int c = jVar.mo153c();
                                    int c2 = jVar2.mo153c();
                                    int b = jVar.mo151b();
                                    int b2 = jVar2.mo151b();
                                    if (!(c == 0 && c2 == 0 && b == 0 && b2 == 0)) {
                                        if (c > c2) {
                                            int i = c - c2;
                                            dVar.mo166b(jVar.size() - i, i);
                                        } else if (c < c2) {
                                            dVar.mo164a(jVar.size(), c2 - c);
                                        }
                                        if (b > b2) {
                                            dVar.mo166b(0, b - b2);
                                        } else if (b < b2) {
                                            dVar.mo164a(0, b2 - b);
                                        }
                                        if (b2 != 0) {
                                            bVar.mo3930a((C1216d) new C0096a(b2, dVar));
                                            hVar.mo123a((List<T>) hVar2, aVar.f134i);
                                        }
                                    }
                                    bVar.mo3930a(dVar);
                                    hVar.mo123a((List<T>) hVar2, aVar.f134i);
                                }
                            }
                        });
                    }

                    {
                        this.f136a = r2;
                        this.f137b = r3;
                        this.f138c = r4;
                        this.f139d = r5;
                    }
                };
                executor.execute(r1);
            }
        }
    }
}
