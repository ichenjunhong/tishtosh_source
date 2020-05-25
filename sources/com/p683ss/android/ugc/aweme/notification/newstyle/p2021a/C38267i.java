package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m;
import com.p683ss.android.ugc.aweme.notification.C38112a;
import com.p683ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38391j;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38394l;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38396n;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38399p;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38401r;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38406u;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38120f;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38136p;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38144x;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.i */
public final class C38267i extends C38144x {

    /* renamed from: e */
    public int f97410e;

    /* renamed from: f */
    private final int f97411f = ((int) C9432q.m18687b((Context) this.f97412g, 8.0f));

    /* renamed from: g */
    private final FragmentActivity f97412g;

    /* renamed from: h */
    private final String f97413h;

    /* renamed from: i */
    private final int f97414i;

    /* renamed from: j */
    private final int f97415j;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.i$a */
    static final class C38268a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38267i f97416a;

        /* renamed from: b */
        final /* synthetic */ int f97417b;

        C38268a(C38267i iVar, int i) {
            this.f97416a = iVar;
            this.f97417b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            int size = this.f97416a.f70670n.size();
            if (size > 0 && this.f97417b >= 0 && this.f97417b < size) {
                BaseNotice baseNotice = (BaseNotice) this.f97416a.f70670n.get(this.f97417b);
                if (baseNotice != null) {
                    NoticeApiManager.m85271a(baseNotice.getNid());
                }
                BaseNotice baseNotice2 = (BaseNotice) this.f97416a.f70670n.get(this.f97417b);
                if (baseNotice2.timeLineType == 0) {
                    this.f97416a.f97410e--;
                }
                List list = this.f97416a.f97145d;
                if (list != null) {
                    list.remove(baseNotice2);
                }
                this.f97416a.f70670n.remove(this.f97417b);
                C38267i iVar = this.f97416a;
                boolean z = false;
                if (!C9376b.m18558a((Collection<T>) iVar.f70670n)) {
                    if (iVar.f70670n.size() != 1) {
                        int size2 = iVar.f70670n.size() - 2;
                        if (size2 >= 0) {
                            int i2 = 0;
                            while (true) {
                                if (!(iVar.f70670n.get(i2) instanceof C38099m) || !(iVar.f70670n.get(i2 + 1) instanceof C38099m)) {
                                    if (i2 == size2) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    iVar.f70670n.remove(i2);
                                    if (i2 == 0 && ((BaseNotice) iVar.f70670n.get(i2)).timeLineType == 5) {
                                        iVar.f70670n.remove(i2);
                                    }
                                }
                            }
                        }
                    } else if (iVar.f70670n.get(0) instanceof C38099m) {
                        iVar.f70670n.remove(0);
                    }
                    z = true;
                }
                if (z) {
                    this.f97416a.notifyDataSetChanged();
                } else {
                    this.f97416a.notifyItemRemoved(this.f97417b);
                }
                this.f97416a.f97144c.mo78119a(this.f97416a.f97145d.size());
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: g */
    public final void mo78118g() {
        this.f97410e = C38046d.m85098a(this.f97414i);
        if (this.f97410e > 0) {
            int i = this.f97415j;
            if (!(i == 7 || i == 10 || i == 62)) {
                switch (i) {
                    case 4:
                    case 5:
                        break;
                    default:
                        C47718bf.m103288a(new C38041h(this.f97414i, 0));
                        C47718bf.m103288a(new C38112a(this.f97414i, 0));
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        BaseNotice baseNotice = (BaseNotice) mo50673a().get(i);
        if (baseNotice == null) {
            return 0;
        }
        if (baseNotice instanceof C38099m) {
            return 999;
        }
        if (baseNotice.getVoteNotice() != null) {
            return 20;
        }
        if (this.f97415j != 2 || baseNotice.getDuetNotice() == null) {
            return this.f97415j;
        }
        return 21;
    }

    /* renamed from: e */
    private final boolean m85492e(int i) {
        if (i > 0) {
            Iterable a = C52753d.m112318a(i - 1, 0);
            Collection arrayList = new ArrayList(C52575l.m112104a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add((BaseNotice) this.f70670n.get(((C52549aa) it).mo110114a()));
            }
            for (BaseNotice baseNotice : (List) arrayList) {
                if (baseNotice instanceof C38099m) {
                    if (baseNotice.timeLineType == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void mo78116c(int i) {
        Dialog dialog = this.f97143b;
        if (dialog == null || !dialog.isShowing()) {
            C26891a aVar = new C26891a(this.f97412g);
            aVar.mo54844a((CharSequence[]) new String[]{this.f97412g.getResources().getString(R.string.ao2)}, (OnClickListener) new C38268a(this, i));
            this.f97143b = aVar.mo54842a();
            Dialog dialog2 = this.f97143b;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    /* renamed from: e */
    public final List<BaseNotice> mo78117e(List<? extends BaseNotice> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        List<BaseNotice> e = super.mo78117e(list);
        C52711k.m112236a((Object) e, "data");
        int i = this.f97410e;
        int i2 = 0;
        for (BaseNotice baseNotice : e) {
            if (i > 0) {
                baseNotice.timeLineType = 0;
                i--;
            } else {
                baseNotice.timeLineType = 5;
            }
            baseNotice.clientOrder = i2;
            i2++;
        }
        if (this.f97410e > 0) {
            e.add(0, new C38099m(0));
            int size = e.size() - 1;
            while (size >= 0 && ((BaseNotice) e.get(size)).timeLineType != 0) {
                int i3 = ((BaseNotice) e.get(size)).timeLineType;
                if (size == 0) {
                    e.add(i, new C38099m(i3));
                } else if (i3 != ((BaseNotice) e.get(size - 1)).timeLineType) {
                    e.add(size, new C38099m(i3));
                }
                size--;
            }
        }
        return e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p043v7.widget.RecyclerView.C1352v mo48221a(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            r0 = 7
            r1 = 0
            if (r7 == r0) goto L_0x0090
            r0 = 10
            if (r7 == r0) goto L_0x0090
            r0 = 62
            if (r7 == r0) goto L_0x0090
            r0 = 999(0x3e7, float:1.4E-42)
            if (r7 == r0) goto L_0x0080
            switch(r7) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0060;
                case 2: goto L_0x0050;
                case 3: goto L_0x0040;
                case 4: goto L_0x0090;
                case 5: goto L_0x0090;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r7) {
                case 20: goto L_0x002f;
                case 21: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = 0
            goto L_0x00b3
        L_0x001e:
            r0 = 2132214164(0x7f170194, float:2.0072162E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.l r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.l
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x002f:
            r0 = 2132214175(0x7f17019f, float:2.0072184E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.a.p r1 = new com.ss.android.ugc.aweme.notification.a.p
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x0040:
            r0 = 2132214159(0x7f17018f, float:2.0072152E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.j r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.j
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x0050:
            r0 = 2132214157(0x7f17018d, float:2.0072148E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.r r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.r
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x0060:
            r0 = 2132214169(0x7f170199, float:2.0072172E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.p r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.p
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x0070:
            r0 = 2132214166(0x7f170196, float:2.0072166E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.n r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.n
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x0080:
            r0 = 2132214174(0x7f17019e, float:2.0072182E38)
            android.view.View r0 = m85491a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.u r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.u
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            goto L_0x00b3
        L_0x0090:
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2132214145(0x7f170181, float:2.0072124E38)
            android.view.View r0 = r0.inflate(r2, r6, r1)
            java.lang.String r1 = "LayoutInflater.from(pare…elper_new, parent, false)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.notification.a.f r1 = new com.ss.android.ugc.aweme.notification.a.f
            android.support.v4.app.FragmentActivity r2 = r5.f97412g
            android.app.Activity r2 = (android.app.Activity) r2
            int r3 = r5.f97415j
            r4 = 1
            r1.<init>(r0, r2, r3, r4)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
        L_0x00b3:
            if (r0 == 0) goto L_0x00c1
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.notification.p2011a.C38114b
            if (r1 == 0) goto L_0x00c1
            r1 = r0
            com.ss.android.ugc.aweme.notification.a.b r1 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38114b) r1
            r2 = r5
            com.ss.android.ugc.aweme.notification.a.m r2 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38131m) r2
            r1.f97003a = r2
        L_0x00c1:
            if (r0 != 0) goto L_0x00cc
            android.support.v7.widget.RecyclerView$v r0 = super.mo48221a(r6, r7)
            java.lang.String r6 = "super.onCreateBasicViewHolder(parent, viewType)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38267i.mo48221a(android.view.ViewGroup, int):android.support.v7.widget.RecyclerView$v");
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        if (vVar instanceof C38406u) {
            C38406u uVar = (C38406u) vVar;
            Object obj = mo50673a().get(i);
            if (obj != null) {
                uVar.mo78316a((C38099m) obj);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTitle");
        }
        if (vVar != null) {
            View view = vVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                int i3 = marginLayoutParams.leftMargin;
                if (i == 0) {
                    i2 = this.f97411f;
                } else {
                    i2 = 0;
                }
                marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int a = mo48641a(i);
        if (!(a == 7 || a == 10 || a == 62)) {
            switch (a) {
                case 0:
                    if (vVar != null) {
                        C38396n nVar = (C38396n) vVar;
                        Object obj2 = mo50673a().get(i);
                        C52711k.m112236a(obj2, "data[position]");
                        nVar.mo78312a((BaseNotice) obj2, true, null, this.f97413h);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder");
                case 1:
                    if (vVar != null) {
                        C38399p pVar = (C38399p) vVar;
                        Object obj3 = mo50673a().get(i);
                        C52711k.m112236a(obj3, "data[position]");
                        pVar.mo78313a((BaseNotice) obj3, true, m85492e(i), (String) null, this.f97413h);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder");
                case 2:
                    if (vVar != null) {
                        C38401r rVar = (C38401r) vVar;
                        Object obj4 = mo50673a().get(i);
                        C52711k.m112236a(obj4, "data[position]");
                        rVar.mo78314a((BaseNotice) obj4, true, null, this.f97413h);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder");
                case 3:
                    if (vVar != null) {
                        C38391j jVar = (C38391j) vVar;
                        Object obj5 = mo50673a().get(i);
                        C52711k.m112236a(obj5, "data[position]");
                        jVar.mo78310a((BaseNotice) obj5, true, null, this.f97413h);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder");
                case 4:
                case 5:
                    break;
                default:
                    switch (a) {
                        case 20:
                            C26890h.m65011a("notification_message_inner_message", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("account_type", "pollsticker").mo47829a("client_order", String.valueOf(i)).mo47829a("timeline", String.valueOf(((BaseNotice) mo50673a().get(i)).timeLineType)).mo47829a("scene_id", "1002").f61491a);
                            if (vVar != null) {
                                C38136p pVar2 = (C38136p) vVar;
                                Object obj6 = mo50673a().get(i);
                                C52711k.m112236a(obj6, "data[position]");
                                pVar2.mo78110a((BaseNotice) obj6, true, m85492e(i), null, this.f97413h);
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder");
                        case 21:
                            if (vVar != null) {
                                C38394l lVar = (C38394l) vVar;
                                Object obj7 = mo50673a().get(i);
                                C52711k.m112236a(obj7, "data[position]");
                                lVar.mo78311a((BaseNotice) obj7, true);
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder");
                        default:
                            super.mo48222a(vVar, i);
                            return;
                    }
            }
        }
        if (vVar != null) {
            ((C38120f) vVar).mo78081a((BaseNotice) mo50673a().get(i), true, this.f97413h);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder");
    }

    /* renamed from: a */
    private static View m85491a(int i, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare… parent, attatchToParent)");
        return inflate;
    }

    public C38267i(FragmentActivity fragmentActivity, String str, int i, int i2, int i3) {
        C52711k.m112240b(fragmentActivity, "mFragment");
        C52711k.m112240b(str, "enterFrom");
        super(i2, fragmentActivity, i3, str);
        this.f97412g = fragmentActivity;
        this.f97413h = str;
        this.f97414i = i;
        this.f97415j = i2;
        this.f97410e = i3;
    }
}
