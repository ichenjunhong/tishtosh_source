package com.p683ss.android.ugc.aweme.poi.preview.p2071c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.app.C1160b.C1161a;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39046f;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39155a;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39157b;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39168b;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39170c;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2069a.C39161a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2070b.C39169a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39172a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39173b;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39174c;
import com.p683ss.android.ugc.aweme.poi.utils.C39446g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.h */
public final class C39194h implements OnDismissListener, OnKeyListener, OnShowListener, C39192a {

    /* renamed from: a */
    public boolean f100014a;

    /* renamed from: b */
    private Context f100015b;

    /* renamed from: c */
    private Dialog f100016c;

    /* renamed from: d */
    private C39184f f100017d;

    /* renamed from: e */
    private C39181e f100018e;

    /* renamed from: f */
    private C39446g f100019f;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.c.h$a */
    public interface C39195a {
    }

    /* renamed from: c */
    private void m87107c() {
        this.f100017d = new C39184f(this.f100015b);
        this.f100017d.setOnLayoutResetListener(this);
    }

    /* renamed from: a */
    public final void mo79870a() {
        this.f100016c.dismiss();
        this.f100014a = false;
    }

    /* renamed from: b */
    public final void mo79875b() {
        if (!this.f100014a) {
            this.f100016c.show();
            this.f100014a = true;
        }
    }

    /* renamed from: f */
    private String m87111f() {
        if (this.f100018e == null) {
            return null;
        }
        HashMap<String, String> hashMap = this.f100018e.f99959y;
        if (hashMap != null) {
            return (String) hashMap.get("poi_id");
        }
        return null;
    }

    public final void dismiss() {
        if (this.f100014a) {
            this.f100017d.dismiss(this.f100018e.f99935a);
            this.f100014a = false;
        }
    }

    /* renamed from: e */
    private void m87110e() {
        ArrayList arrayList = new ArrayList();
        if (this.f100018e.f99954t != null) {
            m87104a((List<ImageView>) arrayList);
        } else if (this.f100018e.f99953s != null) {
            m87106b(arrayList);
        } else if (this.f100018e.f99955u != null) {
            ViewPager viewPager = this.f100018e.f99955u;
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter instanceof C39178c) {
                C39178c cVar = (C39178c) adapter;
                View a = cVar.mo79127a();
                if (a != null) {
                    arrayList.add((ImageView) a.findViewById(this.f100018e.f99952r));
                } else {
                    arrayList.add(null);
                }
                int currentItem = viewPager.getCurrentItem() % cVar.mo79128b();
                m87105a(arrayList, 1, currentItem, currentItem);
            } else {
                throw new IllegalArgumentException("customized adapter should implement IViewPagerCurrentView");
            }
        } else {
            m87108c(arrayList);
        }
        this.f100018e.f99945k = arrayList;
    }

    /* renamed from: d */
    private void m87109d() {
        boolean z;
        long j;
        C39170c cVar;
        C39168b bVar;
        C39157b bVar2;
        C39181e eVar = this.f100018e;
        int i = 0;
        int i2 = 1;
        if (eVar.f99946l == null || eVar.f99946l.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C39181e eVar2 = this.f100018e;
            if (this.f100018e.f99935a >= 0) {
                i = this.f100018e.f99935a;
            }
            eVar2.f99935a = i;
            C39181e eVar3 = this.f100018e;
            if (this.f100018e.f99936b > 0) {
                i2 = this.f100018e.f99936b;
            }
            eVar3.f99936b = i2;
            C39181e eVar4 = this.f100018e;
            if (this.f100018e.f99940f <= 0) {
                j = 300;
            } else {
                j = this.f100018e.f99940f;
            }
            eVar4.f99940f = j;
            C39181e eVar5 = this.f100018e;
            if (this.f100018e.f99949o == null) {
                cVar = new C39169a();
            } else {
                cVar = this.f100018e.f99949o;
            }
            eVar5.f99949o = cVar;
            C39181e eVar6 = this.f100018e;
            if (this.f100018e.f99950p == null) {
                bVar = new C39161a();
            } else {
                bVar = this.f100018e.f99950p;
            }
            eVar6.f99950p = bVar;
            C39181e eVar7 = this.f100018e;
            if (this.f100018e.f99951q == null) {
                bVar2 = new C39155a();
            } else {
                bVar2 = this.f100018e.f99951q;
            }
            eVar7.f99951q = bVar2;
            return;
        }
        throw new IllegalArgumentException("the parameter sourceImageList can't be empty");
    }

    /* renamed from: a */
    public static C39194h m87103a(Context context) {
        return new C39194h(context);
    }

    /* renamed from: c */
    private void m87108c(List<ImageView> list) {
        int size = this.f100018e.f99946l.size();
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

    private C39194h(Context context) {
        this.f100015b = context;
        this.f100019f = new C39446g();
        m87107c();
        this.f100016c = new C1161a(this.f100015b, 16973840).mo3762a((View) this.f100017d).mo3772b();
        this.f100016c.setOnShowListener(this);
        this.f100016c.setOnDismissListener(this);
        this.f100016c.setOnKeyListener(this);
    }

    /* renamed from: b */
    private void m87106b(List<ImageView> list) {
        AbsListView absListView = this.f100018e.f99953s;
        int childCount = absListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            list.add((ImageView) absListView.getChildAt(i).findViewById(this.f100018e.f99952r));
        }
        m87105a(list, absListView.getCount(), absListView.getFirstVisiblePosition(), absListView.getLastVisiblePosition());
    }

    /* renamed from: a */
    public final C39194h mo79874a(C39181e eVar) {
        if (!this.f100014a) {
            this.f100018e = eVar;
            m87110e();
            m87109d();
            this.f100017d.mo79852a(eVar);
        }
        return this;
    }

    /* renamed from: a */
    private void m87104a(List<ImageView> list) {
        int i;
        RecyclerView recyclerView = this.f100018e.f99954t;
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            list.add((ImageView) recyclerView.getChildAt(i3).findViewById(this.f100018e.f99952r));
        }
        C1332i layoutManager = recyclerView.getLayoutManager();
        int A = layoutManager.mo5013A();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i2 = gridLayoutManager.mo4749j();
            i = gridLayoutManager.mo4751l();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.mo4749j();
            i = linearLayoutManager.mo4751l();
        } else {
            i = 0;
        }
        m87105a(list, A, i2, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss(android.content.DialogInterface r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.poi.b.f r12 = new com.ss.android.ugc.aweme.poi.b.f
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r11.m87111f()
            r12.<init>(r0, r1)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r12)
            com.ss.android.ugc.aweme.poi.utils.g r12 = r11.f100019f
            if (r12 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.poi.utils.g r12 = r11.f100019f
            android.content.Context r1 = r11.f100015b
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r11.f100018e
            if (r0 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r11.f100018e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f99959y
            if (r0 == 0) goto L_0x002c
            java.lang.String r2 = "enter_from"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x002e
        L_0x002c:
            java.lang.String r0 = ""
        L_0x002e:
            r2 = r0
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r11.f100018e
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.poi.preview.c.e r0 = r11.f100018e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f99959y
            if (r0 == 0) goto L_0x0076
            java.lang.String r3 = "poi_id"
            java.lang.Object r3 = r0.get(r3)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r3 = "poi_type"
            java.lang.Object r3 = r0.get(r3)
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r3 = "page_type"
            java.lang.Object r3 = r0.get(r3)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r3 = "group_id"
            java.lang.Object r3 = r0.get(r3)
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r3 = "poi_city"
            java.lang.Object r3 = r0.get(r3)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r3 = "poi_backend_type"
            java.lang.Object r0 = r0.get(r3)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            com.ss.android.ugc.aweme.aq.as$a r0 = new com.ss.android.ugc.aweme.aq.as$a
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            r5 = r0
            long r3 = r12.f100865a
            r6 = -1
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            long r3 = java.lang.System.currentTimeMillis()
            long r8 = r12.f100865a
            long r3 = r3 - r8
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.poi.utils.g$a r8 = new com.ss.android.ugc.aweme.poi.utils.g$a
            r0 = r8
            r0.<init>(r1, r2, r3, r5)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45932a(r8)
        L_0x00a1:
            r12.f100865a = r6
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39194h.onDismiss(android.content.DialogInterface):void");
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i;
        C39184f fVar = this.f100017d;
        int size = fVar.f99993d.f99946l.size();
        boolean z = fVar.f99993d.f99932D;
        int i2 = fVar.f99993d.f99935a;
        C52711k.m112240b(fVar, "transferLayout");
        C39174c bVar = new C39173b(fVar, size, i2);
        if (z) {
            bVar = new C39172a(bVar);
        }
        fVar.f99992c = bVar;
        if (fVar.f99993d.f99932D) {
            double d = (double) size;
            double ceil = Math.ceil((double) (1.07374182E9f / ((float) size)));
            Double.isNaN(d);
            i = (int) (d * ceil);
        } else {
            i = 0;
        }
        fVar.f99992c.mo79817a(fVar.f99997h);
        fVar.f99991b = new ViewPager(fVar.f99994e);
        fVar.f99991b.setVisibility(4);
        fVar.f99991b.setOffscreenPageLimit(fVar.f99993d.f99936b + 1);
        fVar.f99991b.setAdapter(fVar.f99992c);
        fVar.f99991b.setCurrentItem(i + fVar.f99993d.f99935a);
        fVar.addView(fVar.f99991b, new LayoutParams(-1, -1));
        int i3 = fVar.f99993d.f99935a;
        if (i3 < 0) {
            C23131p.m56692a("poi_log", "", C23088c.m56631a().mo47824a("service", "preview").mo47824a("status", fVar.f99993d.f99958x).mo47825b());
            i3 = 0;
        }
        fVar.f99990a = fVar.mo79848a(i3).mo79821a(i3);
        C47718bf.m103288a(new C39046f(Boolean.valueOf(false), m87111f()));
        if (this.f100019f != null) {
            C39446g gVar = this.f100019f;
            if (gVar.f100865a == -1) {
                gVar.f100865a = System.currentTimeMillis();
            }
        }
    }

    public C39194h(Context context, int i) {
        this.f100015b = context;
        m87107c();
        this.f100016c = new C1161a(this.f100015b, i).mo3762a((View) this.f100017d).mo3772b();
        this.f100016c.setOnShowListener(this);
        this.f100016c.setOnKeyListener(this);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            dismiss();
        }
        return true;
    }

    /* renamed from: a */
    private static void m87105a(List<ImageView> list, int i, int i2, int i3) {
        if (i2 > 0) {
            while (i2 > 0) {
                list.add(0, null);
                i2--;
            }
        }
        if (i3 < i) {
            for (int i4 = (i - 1) - i3; i4 > 0; i4--) {
                list.add(null);
            }
        }
    }
}
