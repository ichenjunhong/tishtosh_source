package com.bytedance.p815p.p816a.p818b;

import com.bytedance.p815p.p816a.C12527a;
import com.bytedance.p815p.p816a.C12536b;
import com.google.android.play.core.p1053e.C17318a;
import com.google.android.play.core.p1053e.C17338d;
import com.google.android.play.core.p1053e.C17339e;
import com.google.android.play.core.p1053e.C17340f;
import com.google.android.play.core.p1053e.C17342g;
import com.google.android.play.core.p1053e.C17343h;
import com.google.android.play.core.p1056f.C17362a;
import com.google.android.play.core.p1056f.C17363b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.p.a.b.a */
public final class C12537a implements C12545c {

    /* renamed from: a */
    private C17338d f32913a;

    /* renamed from: b */
    private List<C12527a> f32914b = new ArrayList();

    /* renamed from: d */
    public static void m25154d(C12527a aVar) {
        if (aVar != null && aVar.f32895d != null) {
            aVar.mo23577a();
        }
    }

    /* renamed from: a */
    private C12527a m25150a(String str) {
        for (C12527a aVar : this.f32914b) {
            if (m25151a(aVar, str) != null) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m25153c(C12527a aVar) {
        if (aVar != null && aVar.f32894c != null && aVar.mo23577a() != 1 && aVar.f32894c.mo10404c()) {
            aVar.f32894c.mo10403b();
        }
    }

    /* renamed from: e */
    private static void m25155e(C12527a aVar) {
        if (aVar != null && aVar.f32894c != null && aVar.mo23577a() == 1 && !aVar.f32894c.mo10404c()) {
            aVar.f32894c.mo10402a();
        }
    }

    /* renamed from: b */
    public final Set<String> mo23585b(C12527a aVar) {
        if (this.f32913a == null) {
            this.f32913a = C17339e.m42458a(aVar.f32893b.getApplicationContext());
        }
        return this.f32913a.mo33621b();
    }

    /* renamed from: a */
    public final void mo23584a(C12527a aVar) {
        C17343h hVar;
        if (aVar.f32893b == null) {
            m25152a(aVar, -1, "GooglePlayEngine初始化需要Context!");
            return;
        }
        if (this.f32913a == null) {
            this.f32913a = C17339e.m42458a(aVar.f32893b.getApplicationContext());
        }
        Set b = mo23585b(aVar);
        List<String> list = aVar.f32892a;
        if (list == null || list.isEmpty()) {
            m25154d(aVar);
            return;
        }
        list.removeAll(b);
        if (list.isEmpty()) {
            m25154d(aVar);
            return;
        }
        boolean z = false;
        ArrayList<C12536b> arrayList = new ArrayList<>();
        for (String str : list) {
            C12527a a = m25150a(str);
            if (a == null) {
                C12536b bVar = new C12536b(str);
                bVar.f32910c = aVar;
                aVar.f32898g.add(bVar);
                arrayList.add(bVar);
                z = true;
            } else {
                a.f32893b = aVar.f32893b;
                C12536b a2 = m25151a(a, str);
                if (a2.f32908a == 1) {
                    m25155e(a2.f32910c);
                } else {
                    a2.f32908a = 1;
                    arrayList.add(a2);
                }
            }
        }
        if (z) {
            this.f32914b.add(aVar);
        }
        for (final C12536b bVar2 : arrayList) {
            if (this.f32913a != null) {
                m25155e(bVar2.f32910c);
                C125381 r1 = new C17343h() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo23054a(Object obj) {
                        C17342g gVar = (C17342g) obj;
                        if (gVar.mo33634b() == 6) {
                            bVar2.f32908a = 4;
                            C12537a.m25152a(bVar2.f32910c, gVar.mo33635c(), "Google play error!");
                            C12537a.m25153c(bVar2.f32910c);
                        } else if (gVar.mo33634b() == 8) {
                            bVar2.f32908a = 4;
                            C12537a.m25153c(bVar2.f32910c);
                            C12537a.m25152a(bVar2.f32910c, gVar.mo33635c(), "Google play error for need user confirmation!");
                        } else {
                            if (gVar.mo33634b() == 5) {
                                bVar2.f32908a = 2;
                                C12537a.m25153c(bVar2.f32910c);
                                C12537a.m25154d(bVar2.f32910c);
                            }
                        }
                    }
                };
                Object obj = bVar2.f32912e;
                if (obj instanceof C17343h) {
                    hVar = (C17343h) obj;
                } else {
                    hVar = null;
                }
                this.f32913a.mo33622b(hVar);
                bVar2.f32912e = r1;
                this.f32913a.mo33618a((C17343h) r1);
                this.f32913a.mo33616a(C17340f.m42459a().mo33631a(bVar2.f32909b).mo33632a()).mo33657a((C17363b<? super ResultT>) new C17363b<Integer>() {
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo23058a(Object obj) {
                    }
                }).mo33656a((C17362a) new C17362a() {
                    /* renamed from: a */
                    public final void mo23057a(Exception exc) {
                        bVar2.f32908a = 4;
                        C12537a.m25153c(bVar2.f32910c);
                        if (exc instanceof C17318a) {
                            C17318a aVar = (C17318a) exc;
                            C12537a.m25152a(bVar2.f32910c, aVar.getErrorCode(), aVar.getMessage());
                            return;
                        }
                        C12537a.m25152a(bVar2.f32910c, -1, "网络出错!");
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static C12536b m25151a(C12527a aVar, String str) {
        if (aVar == null || aVar.f32898g == null || aVar.f32898g.isEmpty()) {
            return null;
        }
        for (C12536b bVar : aVar.f32898g) {
            if (bVar.f32909b != null && bVar.f32909b.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m25152a(C12527a aVar, int i, String str) {
        if (aVar != null && aVar.f32896e != null) {
            aVar.mo23577a();
        }
    }
}
