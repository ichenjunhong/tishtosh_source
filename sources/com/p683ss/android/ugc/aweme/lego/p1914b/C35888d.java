package com.p683ss.android.ugc.aweme.lego.p1914b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35895e;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lego.b.d */
public final class C35888d {

    /* renamed from: a */
    public Context f92108a;

    /* renamed from: b */
    public final Map<C35898h, List<LegoTask>> f92109b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map<C35898h, List<LegoTask>> f92110c = new ConcurrentHashMap();

    /* renamed from: a */
    public final boolean mo74564a(C35898h hVar) {
        C52711k.m112240b(hVar, "type");
        Object obj = this.f92109b.get(hVar);
        if (obj == null) {
            C52711k.m112234a();
        }
        if (!((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final LegoTask mo74565b(C35898h hVar) {
        C52711k.m112240b(hVar, "type");
        synchronized (this.f92109b) {
            Object obj = this.f92109b.get(hVar);
            if (obj == null) {
                C52711k.m112234a();
            }
            if (((List) obj).isEmpty()) {
                return null;
            }
            Object obj2 = this.f92109b.get(hVar);
            if (obj2 == null) {
                C52711k.m112234a();
            }
            LegoTask legoTask = (LegoTask) ((List) obj2).remove(0);
            synchronized (this.f92110c) {
                Object obj3 = this.f92110c.get(legoTask.type());
                if (obj3 == null) {
                    C52711k.m112234a();
                }
                ((List) obj3).add(legoTask);
            }
            return legoTask;
        }
    }

    /* renamed from: a */
    public final void mo74563a(LegoTask legoTask) {
        C52711k.m112240b(legoTask, "task");
        Object obj = this.f92109b.get(legoTask.type());
        if (obj == null) {
            C52711k.m112234a();
        }
        if (((List) obj).contains(legoTask)) {
            synchronized (this.f92109b) {
                Object obj2 = this.f92109b.get(legoTask.type());
                if (obj2 == null) {
                    C52711k.m112234a();
                }
                ((List) obj2).remove(legoTask);
            }
            synchronized (this.f92110c) {
                Object obj3 = this.f92110c.get(legoTask.type());
                if (obj3 == null) {
                    C52711k.m112234a();
                }
                if (!((List) obj3).contains(legoTask)) {
                    Object obj4 = this.f92110c.get(legoTask.type());
                    if (obj4 == null) {
                        C52711k.m112234a();
                    }
                    ((List) obj4).add(legoTask);
                }
            }
        }
        Object obj5 = this.f92110c.get(legoTask.type());
        if (obj5 == null) {
            C52711k.m112234a();
        }
        if (((List) obj5).contains(legoTask)) {
            mo74566b(legoTask);
        }
    }

    /* renamed from: b */
    public final void mo74566b(LegoTask legoTask) {
        C52711k.m112240b(legoTask, "task");
        synchronized (legoTask) {
            Object obj = this.f92110c.get(legoTask.type());
            if (obj == null) {
                C52711k.m112234a();
            }
            if (((List) obj).contains(legoTask)) {
                StringBuilder sb = new StringBuilder("task_");
                sb.append(legoTask.getClass().getSimpleName());
                String sb2 = sb.toString();
                C35895e a = C35857a.m80996a();
                if (a != null) {
                    a.mo47849a(sb2);
                }
                Context context = this.f92108a;
                if (context == null) {
                    C52711k.m112237a("context");
                }
                legoTask.run(context);
                C35895e a2 = C35857a.m80996a();
                if (a2 != null) {
                    a2.mo47850b(sb2);
                }
                synchronized (this.f92110c) {
                    Object obj2 = this.f92110c.get(legoTask.type());
                    if (obj2 == null) {
                        C52711k.m112234a();
                    }
                    ((List) obj2).remove(legoTask);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo74567b(C35898h hVar, List<? extends LegoTask> list) {
        C52711k.m112240b(hVar, "type");
        C52711k.m112240b(list, "task");
        synchronized (this.f92109b) {
            Object obj = this.f92109b.get(hVar);
            if (obj == null) {
                C52711k.m112234a();
            }
            ((List) obj).addAll(list);
        }
    }

    /* renamed from: a */
    public final List<LegoTask> mo74562a(C35898h hVar, List<? extends LegoTask> list) {
        C52711k.m112240b(hVar, "type");
        C52711k.m112240b(list, "tasks");
        synchronized (this.f92109b) {
            for (LegoTask legoTask : list) {
                Object obj = this.f92109b.get(hVar);
                if (obj == null) {
                    C52711k.m112234a();
                }
                ((List) obj).remove(legoTask);
            }
            synchronized (this.f92110c) {
                Object obj2 = this.f92110c.get(hVar);
                if (obj2 == null) {
                    C52711k.m112234a();
                }
                ((List) obj2).addAll(list);
            }
        }
        return list;
    }
}
