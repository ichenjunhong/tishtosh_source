package android.support.p043v7.p048c.p049a;

import android.support.p043v7.p048c.p049a.C1197a.C1198a;
import android.support.p043v7.p051e.C1206a;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1210a;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.c.a.c */
public abstract class C1204c<T, VH extends C1352v> extends C1322a<VH> {

    /* renamed from: a */
    private final C1199b<T> f3989a;

    public int getItemCount() {
        return this.f3989a.f3979e.size();
    }

    /* renamed from: a */
    public final T mo3924a(int i) {
        return this.f3989a.f3979e.get(i);
    }

    protected C1204c(C1212c<T> cVar) {
        this.f3989a = new C1199b<>(new C1206a(this), new C1198a(cVar).mo3920a());
    }

    /* renamed from: a */
    public final void mo3925a(List<T> list) {
        C1199b<T> bVar = this.f3989a;
        int i = bVar.f3980f + 1;
        bVar.f3980f = i;
        if (list != bVar.f3978d) {
            if (list == null) {
                int size = bVar.f3978d.size();
                bVar.f3978d = null;
                bVar.f3979e = Collections.emptyList();
                bVar.f3975a.mo166b(0, size);
            } else if (bVar.f3978d == null) {
                bVar.f3978d = list;
                bVar.f3979e = Collections.unmodifiableList(list);
                bVar.f3975a.mo164a(0, list.size());
            } else {
                bVar.f3976b.f3967b.execute(new Runnable(bVar.f3978d, list, i) {

                    /* renamed from: a */
                    final /* synthetic */ List f3981a;

                    /* renamed from: b */
                    final /* synthetic */ List f3982b;

                    /* renamed from: c */
                    final /* synthetic */ int f3983c;

                    public final void run() {
                        final C1211b a = C1208c.m3654a(new C1210a() {
                            /* renamed from: a */
                            public final int mo159a() {
                                return C12001.this.f3981a.size();
                            }

                            /* renamed from: b */
                            public final int mo161b() {
                                return C12001.this.f3982b.size();
                            }

                            /* renamed from: a */
                            public final Object mo160a(int i, int i2) {
                                Object obj = C12001.this.f3981a.get(i);
                                Object obj2 = C12001.this.f3982b.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1199b.this.f3976b.f3968c.mo3934c(obj, obj2);
                                }
                                throw new AssertionError();
                            }

                            /* renamed from: b */
                            public final boolean mo162b(int i, int i2) {
                                Object obj = C12001.this.f3981a.get(i);
                                Object obj2 = C12001.this.f3982b.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1199b.this.f3976b.f3968c.mo3932a(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                return false;
                            }

                            /* renamed from: c */
                            public final boolean mo163c(int i, int i2) {
                                Object obj = C12001.this.f3981a.get(i);
                                Object obj2 = C12001.this.f3982b.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1199b.this.f3976b.f3968c.mo3933b(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                throw new AssertionError();
                            }
                        });
                        C1199b.this.f3977c.execute(new Runnable() {
                            public final void run() {
                                if (C1199b.this.f3980f == C12001.this.f3983c) {
                                    C1199b bVar = C1199b.this;
                                    List<T> list = C12001.this.f3982b;
                                    C1211b bVar2 = a;
                                    bVar.f3978d = list;
                                    bVar.f3979e = Collections.unmodifiableList(list);
                                    bVar2.mo3930a(bVar.f3975a);
                                }
                            }
                        });
                    }

                    {
                        this.f3981a = r2;
                        this.f3982b = r3;
                        this.f3983c = r4;
                    }
                });
            }
        }
    }
}
