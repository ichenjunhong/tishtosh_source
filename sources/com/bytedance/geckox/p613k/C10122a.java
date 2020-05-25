package com.bytedance.geckox.p613k;

import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p600e.C10074b;
import com.bytedance.geckox.p600e.C10101g;
import com.bytedance.geckox.p600e.C10102h;
import com.bytedance.geckox.p600e.C10103i;
import com.bytedance.geckox.p600e.C10104j;
import com.bytedance.geckox.p600e.p601a.p602a.C10066a;
import com.bytedance.geckox.p600e.p601a.p602a.C10067b;
import com.bytedance.geckox.p600e.p601a.p602a.C10068c;
import com.bytedance.geckox.p600e.p601a.p603b.C10069a;
import com.bytedance.geckox.p600e.p601a.p603b.C10070b;
import com.bytedance.geckox.p600e.p601a.p603b.C10071c;
import com.bytedance.geckox.p600e.p601a.p603b.C10072d;
import com.bytedance.geckox.p600e.p601a.p603b.C10073e;
import com.bytedance.geckox.p600e.p604b.p605a.C10075a;
import com.bytedance.geckox.p600e.p604b.p605a.C10076b;
import com.bytedance.geckox.p600e.p604b.p605a.C10077c;
import com.bytedance.geckox.p600e.p604b.p605a.C10078d;
import com.bytedance.geckox.p600e.p604b.p606b.C10079a;
import com.bytedance.geckox.p600e.p604b.p606b.C10080b;
import com.bytedance.geckox.p600e.p604b.p606b.C10081c;
import com.bytedance.geckox.p600e.p604b.p606b.C10082d;
import com.bytedance.geckox.p600e.p604b.p606b.C10083e;
import com.bytedance.geckox.p600e.p604b.p606b.C10084f;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.geckox.p607f.C10106b;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import com.bytedance.p782n.C12388h;
import com.bytedance.p782n.C12388h.C12390a;
import com.bytedance.p782n.C12395l.C12397b;
import com.bytedance.p782n.p784b.C12379a;
import com.bytedance.p782n.p784b.C12380b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.geckox.k.a */
public final class C10122a {
    /* renamed from: a */
    public static C12379a m20395a(final C10105a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C12379a() {
            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                aVar.mo18076a(((UpdatePackage) bVar.mo23392b(C10101g.class)).getChannel(), th);
            }
        };
    }

    /* renamed from: b */
    public static C12379a m20398b(final C10105a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C12379a() {
            /* renamed from: a */
            public final <T> void mo18097a(C12378b<T> bVar, C12382d dVar) {
                super.mo18097a(bVar, dVar);
                Pair pair = (Pair) bVar.mo23390a(C10104j.class);
                aVar.mo18075a((String) pair.first, ((Long) pair.second).longValue());
            }
        };
    }

    /* renamed from: c */
    private static C12379a m20401c(final C10105a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                aVar.mo18079b((UpdatePackage) bVar.mo23392b(C10074b.class));
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                aVar.mo18074a((UpdatePackage) bVar.mo23390a(C10074b.class), th);
            }
        };
    }

    /* renamed from: d */
    private static C12379a m20403d(final C10105a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C12379a() {
            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                aVar.mo18074a((UpdatePackage) bVar.mo23390a(C10074b.class), th);
            }
        };
    }

    /* renamed from: e */
    private static C12379a m20405e(final C10105a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C12379a() {
            /* renamed from: b */
            public final <T> void mo18098b(C12378b<T> bVar, C12382d dVar) {
                super.mo18098b(bVar, dVar);
                aVar.mo18081c((UpdatePackage) bVar.mo23392b(C10074b.class));
            }

            /* renamed from: c */
            public final <T> void mo18099c(C12378b<T> bVar, C12382d dVar) {
                super.mo18099c(bVar, dVar);
                aVar.mo18073a((UpdatePackage) bVar.mo23390a(C10074b.class));
            }

            /* renamed from: a */
            public final <T> void mo18096a(C12378b<T> bVar, C12382d dVar, Throwable th) {
                super.mo18096a(bVar, dVar, th);
                aVar.mo18080b((UpdatePackage) bVar.mo23390a(C10074b.class), th);
            }
        };
    }

    /* renamed from: a */
    private static List<C12388h> m20397a(C10105a aVar, File file, C10044b bVar) {
        return Collections.emptyList();
    }

    /* renamed from: b */
    private static List<C12388h> m20400b(C10105a aVar, File file, C10044b bVar) {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static C12388h m20396a(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        C12397b bVar3 = new C12397b();
        bVar3.mo23406a("patch").mo23404a(m20406e(aVar, file, bVar, bVar2));
        bVar3.mo23406a("full").mo23404a(m20404d(aVar, file, bVar, bVar2));
        return bVar3.mo23405a(C10074b.class);
    }

    /* renamed from: b */
    public static C12388h m20399b(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        C12397b bVar3 = new C12397b();
        bVar3.mo23406a("patch").mo23404a(m20408g(aVar, file, bVar, bVar2));
        bVar3.mo23406a("full").mo23404a(m20407f(aVar, file, bVar, bVar2));
        return bVar3.mo23405a(C10074b.class);
    }

    /* renamed from: c */
    public static C12388h m20402c(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        C12397b bVar3 = new C12397b();
        bVar3.mo23406a("patch").mo23404a(m20400b(aVar, file, bVar));
        bVar3.mo23406a("full").mo23404a(m20397a(aVar, file, bVar));
        return bVar3.mo23405a(C10074b.class);
    }

    /* renamed from: d */
    private static List<C12388h> m20404d(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12390a.m24949a().mo23400a(C10102h.class).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10067b.class).mo23401a(bVar, file).mo23399a((C12379a) new C12380b(m20405e(aVar), bVar2.mo18082a(C10067b.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10066a.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10066a.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10068c.class).mo23399a((C12379a) new C12380b(m20401c(aVar), bVar2.mo18082a(C10068c.class))).mo23402b());
        return arrayList;
    }

    /* renamed from: e */
    private static List<C12388h> m20406e(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12390a.m24949a().mo23400a(C10103i.class).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10071c.class).mo23401a(bVar, file).mo23399a((C12379a) new C12380b(m20405e(aVar), bVar2.mo18082a(C10071c.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10070b.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10070b.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10072d.class).mo23401a(bVar).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10072d.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10069a.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10069a.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10073e.class).mo23399a((C12379a) new C12380b(m20401c(aVar), bVar2.mo18082a(C10073e.class))).mo23402b());
        return arrayList;
    }

    /* renamed from: f */
    private static List<C12388h> m20407f(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12390a.m24949a().mo23400a(C10102h.class).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10076b.class).mo23401a(bVar, file).mo23399a((C12379a) new C12380b(m20405e(aVar), bVar2.mo18082a(C10076b.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10075a.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10075a.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10078d.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10078d.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10077c.class).mo23399a((C12379a) new C12380b(m20401c(aVar))).mo23402b());
        return arrayList;
    }

    /* renamed from: g */
    private static List<C12388h> m20408g(C10105a aVar, File file, C10044b bVar, C10106b bVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12390a.m24949a().mo23400a(C10103i.class).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10081c.class).mo23401a(bVar, file).mo23399a((C12379a) new C12380b(m20405e(aVar), bVar2.mo18082a(C10081c.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10080b.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10080b.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10082d.class).mo23401a(bVar).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10082d.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10079a.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10079a.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10084f.class).mo23399a((C12379a) new C12380b(m20403d(aVar), bVar2.mo18082a(C10084f.class))).mo23402b());
        arrayList.add(C12390a.m24949a().mo23400a(C10083e.class).mo23399a((C12379a) new C12380b(m20401c(aVar))).mo23402b());
        return arrayList;
    }
}
