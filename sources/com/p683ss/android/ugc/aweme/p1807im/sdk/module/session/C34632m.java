package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.emoji.p1681b.C29294a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1864a.C34643d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1866c.C34648a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34576b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34589f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1863b.C34601a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34684c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34028i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34028i.C34029a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34879a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.NoticeStructureSimplify;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35437a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35438b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.C53755c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.m */
public final class C34632m extends C23526a implements C26846a, C35437a {

    /* renamed from: a */
    public View f89218a;

    /* renamed from: b */
    public C34643d f89219b;

    /* renamed from: c */
    public DmtStatusView f89220c;

    /* renamed from: d */
    public int f89221d = -1;

    /* renamed from: e */
    public int f89222e = -1;

    /* renamed from: j */
    private View f89223j;

    /* renamed from: k */
    private View f89224k;

    /* renamed from: l */
    private RecyclerView f89225l;

    /* renamed from: m */
    private View f89226m;

    /* renamed from: n */
    private RecyclerView f89227n;

    /* renamed from: o */
    private LinearLayoutManager f89228o;

    /* renamed from: p */
    private C34648a f89229p;

    /* renamed from: q */
    private C34628l f89230q;

    /* renamed from: r */
    private Boolean f89231r = Boolean.valueOf(true);

    /* renamed from: s */
    private String f89232s = "";

    /* renamed from: t */
    private C35438b f89233t;

    /* renamed from: u */
    private C1340m f89234u = new C1340m() {
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 2) {
                C34632m.this.mo72681a(recyclerView);
            }
            if (i == 0) {
                C34632m.this.mo72681a(recyclerView);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int j = linearLayoutManager.mo4749j();
                int l = linearLayoutManager.mo4751l();
                if (C34632m.this.f89221d == -1 || C34632m.this.f89222e == -1) {
                    C34632m.this.f89221d = j;
                    C34632m.this.f89222e = l;
                    return;
                }
                if (C34632m.this.f89221d < j) {
                    C34632m.this.mo72680a(linearLayoutManager, C34632m.this.f89221d, j - 1);
                }
                if (C34632m.this.f89222e > l) {
                    C34632m.this.mo72680a(linearLayoutManager, l + 1, C34632m.this.f89222e);
                }
                C34632m.this.f89221d = j;
                C34632m.this.f89222e = l;
            }
        }
    };

    /* renamed from: f */
    public final Fragment mo72686f() {
        return this;
    }

    /* renamed from: g */
    public final void mo72687g() {
    }

    /* renamed from: h */
    public final void mo72688h() {
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onStop() {
        super.onStop();
    }

    public final void ar_() {
        this.f89229p.f89259d.mo72724f();
    }

    /* renamed from: e */
    public final void mo72685e() {
        if (C34664o.m78640a(getActivity())) {
            if (this.f89219b.mo72698j()) {
                this.f89220c.mo19212f();
            }
            C35197am.m79560b();
            C53755c.m114319a().mo112960d("sessionListFragment-onMain");
            return;
        }
        if (this.f89219b.mo72698j()) {
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    if (C34632m.this.isViewValid() && C34632m.this.f89219b.getItemCount() <= 0) {
                        C34632m.this.f89220c.mo19214h();
                        C10691a.m21542b((Context) C34632m.this.getActivity(), (int) R.string.cg1).mo19066a();
                    }
                }
            }, 100);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (C34028i.f87976a != null) {
            Handler handler = C34028i.f87976a;
            if (handler == null) {
                C52711k.m112234a();
            }
            handler.removeMessages(220);
            C34028i.f87976a = null;
        }
        if (C34028i.f87977b != null) {
            C34028i.f87977b = null;
        }
        if (C33707b.f87418b != null) {
            C33707b.f87418b = null;
        }
        if (C33707b.f87417a != null) {
            C33707b.f87417a = null;
        }
        if (this.f89229p != null) {
            C34648a aVar = this.f89229p;
            if (C53755c.m114319a().mo112958b((Object) aVar)) {
                C53755c.m114319a().mo112959c((Object) aVar);
            }
            C34684c.m78664a().f89354b = null;
        }
        C34032k.m77795a().mo71985b(this.f89229p);
        if (this.f89227n != null) {
            this.f89227n.setAdapter(null);
        }
        if (this.f89230q != null) {
            this.f89230q.f89208b.clear();
        }
    }

    /* renamed from: i */
    public final void mo72689i() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        RecyclerView recyclerView = this.f89227n;
        C34643d dVar = this.f89219b;
        List a = dVar.mo50673a();
        if (a != null && a.size() != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                int j = linearLayoutManager.mo4749j();
                int l = linearLayoutManager.mo4751l();
                int g = dVar.mo72697g();
                int i = (j + 1) - g;
                int i2 = -1;
                while (true) {
                    if (i < 0 || i >= a.size()) {
                        break;
                    }
                    Object obj = a.get(i);
                    if (obj instanceof C35456b) {
                        C35456b bVar = (C35456b) obj;
                        C11180b a2 = C11182d.m22641a().mo20658a(bVar.bm_());
                        int i3 = bVar.f91119j;
                        int b = bVar.mo72634b();
                        if (a2 == null || !a2.isMute()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean a3 = C34623h.m78569a(i3, b, z);
                        if (i2 == -1) {
                            if (bVar.mo72634b() == 10) {
                                int f = ((C34589f) bVar).mo72648f();
                                int b2 = bVar.mo72634b();
                                if (a2 == null || !a2.isMute()) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                z2 = C34623h.m78570b(f, b2, z5);
                            } else if (bVar.mo72634b() == 17) {
                                int i4 = ((C34576b) bVar).f89121a;
                                int b3 = bVar.mo72634b();
                                if (a2 == null || !a2.isMute()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                z2 = C34623h.m78570b(i4, b3, z4);
                            } else {
                                int i5 = bVar.f91119j;
                                int b4 = bVar.mo72634b();
                                if (a2 == null || !a2.isMute()) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                z2 = C34623h.m78570b(i5, b4, z3);
                            }
                            if (z2) {
                                i2 = i;
                            }
                        }
                        if (!a3) {
                            int i6 = j - g;
                            if (i == i6 || (i == a.size() - 1 && i6 == -1)) {
                                break;
                            } else if (i != a.size() - 1) {
                                i++;
                            }
                        } else {
                            break;
                        }
                    } else {
                        int i7 = j - g;
                        if (i == i7 || (i == a.size() - 1 && i7 == -1)) {
                            break;
                        } else if (i != a.size() - 1) {
                            i++;
                        }
                    }
                    i = 0;
                }
                i = -1;
                int i8 = l - j;
                if ((i == -1 || i + g > j) && !(recyclerView.getChildAt(i8) != null && recyclerView.getHeight() == recyclerView.getChildAt(i8).getBottom() && l - g == a.size())) {
                    int i9 = i + g;
                    if (i9 > j) {
                        C34623h.m78568a(recyclerView, g, j, l, i9);
                    } else if ((i2 == -1 || i2 + g > j) && !(recyclerView.getChildAt(i8) != null && recyclerView.getHeight() == recyclerView.getChildAt(i8).getBottom() && l - g == a.size())) {
                        int i10 = i2 + g;
                        if (i10 > j) {
                            C34623h.m78568a(recyclerView, g, j, l, i10);
                            return;
                        }
                        C34623h.m78568a(recyclerView, g, j, l, 0);
                    } else {
                        C34623h.m78568a(recyclerView, g, j, l, 0);
                    }
                } else {
                    C34623h.m78568a(recyclerView, g, j, l, 0);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r10 = this;
            super.onResume()
            java.lang.Boolean r0 = r10.f89231r
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.im.sdk.module.session.l r0 = r10.f89230q
            r0.f89209c = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.l r0 = r10.f89230q
            android.support.v4.app.FragmentActivity r2 = r10.getActivity()
            r0.mo72677a(r2)
        L_0x0019:
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79560b()
            java.lang.Boolean r0 = r10.f89231r
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0136
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r0 = r10.f89219b
            java.util.List r2 = r0.f70670n
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x0054
            java.util.List r2 = r0.f70670n
            java.lang.String r3 = "mItems"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b
            if (r4 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.im.service.h.b r3 = (com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b) r3
            r3.mo73752a(r1)
            goto L_0x003d
        L_0x0051:
            r0.notifyDataSetChanged()
        L_0x0054:
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.c.a r0 = r10.f89229p
            r0.f89256a = r1
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
            if (r2 != 0) goto L_0x0136
            com.ss.android.ugc.aweme.im.sdk.d.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r3 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.im.service.j r2 = r2.mo71949f()
            java.lang.String r3 = "AwemeImManager.instance().proxy"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.im.service.model.e r2 = r2.getIMSetting()
            java.lang.String r3 = "AwemeImManager.instance().proxy.imSetting"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            int r2 = r2.f91153k
            boolean r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
            r4 = 1
            if (r3 != 0) goto L_0x00f6
            boolean r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.f87983a
            if (r3 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r3 = r0.f89260e
            java.util.List<com.ss.android.ugc.aweme.im.service.h.b> r3 = r3.f89244b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r3 = r3.iterator()
        L_0x0097:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00b9
            java.lang.Object r6 = r3.next()
            r7 = r6
            com.ss.android.ugc.aweme.im.service.h.b r7 = (com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b) r7
            boolean r8 = r7 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a
            if (r8 == 0) goto L_0x00ac
            boolean r8 = r7 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34595h
            if (r8 == 0) goto L_0x00b0
        L_0x00ac:
            boolean r7 = r7 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34582d
            if (r7 == 0) goto L_0x00b2
        L_0x00b0:
            r7 = 1
            goto L_0x00b3
        L_0x00b2:
            r7 = 0
        L_0x00b3:
            if (r7 == 0) goto L_0x0097
            r5.add(r6)
            goto L_0x0097
        L_0x00b9:
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            if (r3 > r2) goto L_0x00f6
            com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            java.lang.String r3 = "IMSPUtils.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.content.SharedPreferences r2 = r2.f90620a
            java.lang.String r3 = "key_remove_recommend_time"
            r5 = 0
            long r2 = r2.getLong(r3, r5)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00da
        L_0x00d8:
            r2 = 1
            goto L_0x00f2
        L_0x00da:
            int r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.IMShowRecommendIntervalExperiment.m76316a()
            if (r5 != 0) goto L_0x00e1
            goto L_0x00d8
        L_0x00e1:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            long r2 = (long) r5
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r8
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f1
            goto L_0x00d8
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            if (r2 == 0) goto L_0x00f6
            r2 = 1
            goto L_0x00f7
        L_0x00f6:
            r2 = 0
        L_0x00f7:
            if (r2 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r2 = r0.f89260e
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r2.f89243a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f r2 = r0.f89259d
            r2.mo72723e()
            r0.f89257b = r1
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r0 = r0.f89260e
            r0.am_()
            goto L_0x0136
        L_0x0110:
            boolean r2 = r0.f89257b
            if (r2 == 0) goto L_0x0136
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r0 = r0.f89260e
            r0.mo72700l()
            goto L_0x0136
        L_0x011a:
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r2 = r0.f89260e
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r2.f89243a
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0136
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r2 = r0.f89260e
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r2.f89243a
            r2.clear()
            com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.a.d r2 = r0.f89260e
            r2.mo72700l()
            r0.mo72709c()
        L_0x0136:
            com.ss.android.ugc.aweme.im.sdk.d.k r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k.m77795a()
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79709a()
            if (r2 == 0) goto L_0x0160
            com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            int r3 = r0.f87989f
            android.content.SharedPreferences r2 = r2.f90620a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "last_xcard_unread_dot"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r4, r3)
            r2.commit()
            int r2 = r0.f87988e
            if (r2 > 0) goto L_0x015d
            int r2 = r0.f87989f
            if (r2 <= 0) goto L_0x0160
        L_0x015d:
            r0.mo71987d()
        L_0x0160:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r10.f89231r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34632m.onResume():void");
    }

    /* renamed from: a */
    public final void mo72682a(C35438b bVar) {
        this.f89233t = bVar;
    }

    /* renamed from: a */
    public final void mo72683a(String str) {
        if (this.f89229p != null) {
            this.f89229p.mo72705a(str);
        }
        this.f89232s = str;
    }

    /* renamed from: a */
    public final void mo72681a(RecyclerView recyclerView) {
        int i;
        NoticeStructureSimplify.m80100a();
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if (this.f89226m != null) {
            View view = this.f89226m;
            if (canScrollVertically) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C34018h.m77779b().mo71970a();
        if (C34028i.f87977b == null) {
            C34028i.f87977b = new CopyOnWriteArrayList();
        }
        if (C34028i.f87976a == null) {
            C34028i.f87976a = new C34029a();
        }
        SessionListUserActiveViewModel a = SessionListUserActiveViewModel.m78491a(requireActivity());
        C52711k.m112240b(this, "lifecycleOwner");
        getLifecycle().mo324a(a);
    }

    /* renamed from: a */
    public final void mo72684a(boolean z) {
        if (z) {
            this.f89230q.f89209c = false;
            this.f89230q.mo72679b(getActivity());
        } else if (!this.f89231r.booleanValue()) {
            this.f89230q.f89209c = true;
            this.f89230q.mo72677a(getActivity());
        }
        SessionListUserActiveViewModel a = SessionListUserActiveViewModel.m78491a(requireActivity());
        boolean z2 = !z;
        C34879a aVar = a.f89093c;
        if (aVar != null) {
            aVar.mo72995a(true);
        }
        a.f89093c = null;
        if (z2) {
            a.onSessionListFragmentResume();
        } else {
            a.onSessionListFragmentStop();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        super.onViewCreated(view, bundle);
        this.f89227n = (RecyclerView) view.findViewById(R.id.clk);
        this.f89220c = (DmtStatusView) view.findViewById(R.id.csv);
        this.f89226m = view.findViewById(R.id.elb);
        NoticeStructureSimplify.m80100a();
        this.f89228o = new LinearLayoutManager(getActivity());
        this.f89227n.setLayoutManager(this.f89228o);
        this.f89227n.setItemViewCacheSize(4);
        this.f89219b = new C34643d();
        this.f89227n.mo4801a((C1340m) new C32461a(getActivity()));
        this.f89227n.mo4801a(this.f89234u);
        this.f89219b.mo54788a((C26846a) this);
        this.f89219b.mo54798c(false);
        this.f89219b.an_();
        this.f89218a = LayoutInflater.from(getContext()).inflate(R.layout.bg_, null, false);
        this.f89218a.setLayoutParams(new LayoutParams(-1, -2));
        this.f89218a.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C34632m.this.f89220c.getLayoutParams();
                layoutParams.topMargin = C34632m.this.f89218a.getHeight();
                C34632m.this.f89220c.setLayoutParams(layoutParams);
                C34632m.this.f89220c.post(new C34639n(this));
            }
        });
        this.f89219b.mo72696c(this.f89218a);
        this.f89225l = (RecyclerView) this.f89218a.findViewById(R.id.cfv);
        this.f89230q = new C34628l(getActivity(), (ViewGroup) this.f89218a);
        this.f89230q.mo72679b(getActivity());
        this.f89223j = this.f89218a.findViewById(R.id.b7r);
        this.f89218a.findViewById(R.id.d_j).setTag("tag_msg_follow_request_count");
        this.f89218a.findViewById(R.id.aie).setTag("tag_msg_follow_request_unread_dot");
        this.f89224k = this.f89218a.findViewById(R.id.b_h);
        this.f89218a.findViewById(R.id.e3).setTag("tag_msg_tutorial_video_head");
        this.f89218a.findViewById(R.id.d8j).setTag("tag_msg_tutorial_video_content");
        this.f89218a.findViewById(R.id.pk).setTag("tag_msg_tutorial_video_watch");
        if (!C34755a.f89518g.mo72832l() && this.f89233t != null) {
            this.f89233t.mo73736a(this.f89225l, this.f89223j, this.f89224k, (ViewStub) this.f89218a.findViewById(R.id.f7i));
        }
        NoticeStructureSimplify.m80100a();
        this.f89227n.setAdapter(this.f89219b);
        this.f89227n.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C34028i.m77785a();
                }
            }
        });
        if (C34755a.f89518g.mo72832l()) {
            MtEmptyView a = MtEmptyView.m21697a((Context) getActivity());
            a.setStatus(new C10723a(getActivity()).mo19277a((int) R.drawable.d93).mo19280b((int) R.string.c5v).mo19282c(R.string.c5u).f28711a);
            this.f89220c.setBuilder(C10719a.m21676a((Context) getActivity()).mo19231b((View) a).mo19223a().mo19226a(R.drawable.b0q, R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C34632m.this.mo72685e();
                }
            }));
        } else {
            C10723a c = new C10723a(getActivity()).mo19280b((int) R.string.bnl).mo19282c(R.string.bnk);
            if (C35279p.m79763a()) {
                view2 = MtEmptyView.m21697a((Context) getActivity());
                ((MtEmptyView) view2).setStatus(c.mo19277a((int) R.drawable.da7).f28711a);
            } else {
                view2 = new DmtDefaultView(getActivity());
                ((DmtDefaultView) view2).setStatus(c.f28711a);
            }
            this.f89220c.setBuilder(C10719a.m21676a((Context) getActivity()).mo19231b(view2).mo19223a().mo19226a(R.drawable.b0q, R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C34632m.this.mo72685e();
                }
            }));
            ViewGroup.LayoutParams layoutParams = this.f89220c.getLayoutParams();
            layoutParams.height = (int) C9432q.m18687b((Context) getActivity(), 404.0f);
            this.f89220c.setLayoutParams(layoutParams);
        }
        this.f89229p = new C34648a(this.f89219b, this.f89220c);
        this.f89229p.mo72705a(this.f89232s);
        C34032k.m77795a().mo71980a((C34601a<C35456b>) this.f89229p);
        if (!C35279p.m79763a()) {
            C35460j f = C34004b.m77717a().mo71949f();
            IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
            if (f != null && !f.isFFSDKBind() && provideIMService_Monster != null && C35284t.m79782a().f90620a.getBoolean("flip_chat_push_click_show_state", false)) {
                provideIMService_Monster.onFlipChatPushMsgUpdate(C35284t.m79782a().f90620a.getString("flip_chat_push_click_show_desc", ""), C35284t.m79782a().f90620a.getLong("flip_chat_push_click_show_time", 0));
            }
        }
        mo72685e();
        C34004b a2 = C34004b.m77717a();
        C29294a.f76673a.mo59241a();
        C29410a.m69356a();
        C29410a.m69360c();
        if (a2.mo71949f().showNewStyle()) {
            C34169a.m77980a().mo72158b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bcn, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo72680a(LinearLayoutManager linearLayoutManager, int i, int i2) {
        if (linearLayoutManager != null && i < i2) {
            while (i <= i2) {
                try {
                    Object obj = this.f89219b.mo50673a().get(i);
                    if (obj instanceof C35456b) {
                        C35456b bVar = (C35456b) obj;
                        if (bVar.f91123n) {
                            bVar.mo73752a(false);
                        }
                    }
                    i++;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
