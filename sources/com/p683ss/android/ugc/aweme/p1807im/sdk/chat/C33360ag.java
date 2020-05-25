package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33689r.C33703c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35214b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ag */
public final class C33360ag {

    /* renamed from: p */
    public static final C33361a f86509p = new C33361a(null);

    /* renamed from: a */
    public boolean f86510a;

    /* renamed from: b */
    boolean f86511b;

    /* renamed from: c */
    public boolean f86512c;

    /* renamed from: d */
    public boolean f86513d;

    /* renamed from: e */
    public long f86514e;

    /* renamed from: f */
    public long f86515f;

    /* renamed from: g */
    public int f86516g = -1;

    /* renamed from: h */
    final Context f86517h;

    /* renamed from: i */
    public int f86518i;

    /* renamed from: j */
    final View f86519j;

    /* renamed from: k */
    final DmtTextView f86520k;

    /* renamed from: l */
    public final LinearLayoutManager f86521l;

    /* renamed from: m */
    public final View f86522m;

    /* renamed from: n */
    public final RecyclerView f86523n;

    /* renamed from: o */
    public final C33689r f86524o;

    /* renamed from: q */
    private int f86525q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ag$a */
    public static final class C33361a {
        private C33361a() {
        }

        public /* synthetic */ C33361a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ag$b */
    static final class C33362b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33360ag f86526a;

        C33362b(C33360ag agVar) {
            this.f86526a = agVar;
        }

        public final void run() {
            String str;
            LinearLayoutManager linearLayoutManager = this.f86526a.f86521l;
            if (linearLayoutManager != null) {
                int j = linearLayoutManager.mo4749j();
                if (this.f86526a.f86515f > ((long) ((linearLayoutManager.mo4751l() - j) + 1))) {
                    C33360ag agVar = this.f86526a;
                    long j2 = this.f86526a.f86515f;
                    if (j2 > 99) {
                        str = agVar.f86517h.getResources().getString(R.string.bp4, new Object[]{agVar.f86517h.getResources().getString(R.string.bp2)});
                        C52711k.m112236a((Object) str, "mContext.resources.getSt…ng.im_unread_count_more))");
                    } else {
                        str = agVar.f86517h.getResources().getString(R.string.bp4, new Object[]{String.valueOf(j2)});
                        C52711k.m112236a((Object) str, "mContext.resources.getSt…, unreadCount.toString())");
                    }
                    DmtTextView dmtTextView = agVar.f86520k;
                    C52711k.m112236a((Object) dmtTextView, "mUnreadMessageCount");
                    dmtTextView.setText(str);
                    agVar.f86519j.setVisibility(0);
                    agVar.f86519j.startAnimation(C35214b.m79602a(240, C9432q.m18687b(agVar.f86517h, 120.0f), 0.0f, 0.0f, 0.0f));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ag$c */
    static final class C33363c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33360ag f86527a;

        C33363c(C33360ag agVar) {
            this.f86527a = agVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f86527a.f86514e != -1 && !this.f86527a.f86510a) {
                this.f86527a.f86510a = true;
                this.f86527a.mo70729a();
                this.f86527a.mo70730b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ag$d */
    static final class C33364d implements C33703c {

        /* renamed from: a */
        final /* synthetic */ C33360ag f86528a;

        C33364d(C33360ag agVar) {
            this.f86528a = agVar;
        }

        /* renamed from: a */
        public final void mo70733a() {
            if (this.f86528a.f86513d) {
                this.f86528a.mo70730b();
                return;
            }
            C33360ag agVar = this.f86528a;
            if (agVar.f86524o.getItemCount() > 0 && agVar.f86515f > 0 && !agVar.f86511b) {
                agVar.f86511b = true;
                agVar.f86523n.post(new C33362b(agVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ag$e */
    public static final class C33365e extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C33360ag f86529a;

        C33365e(C33360ag agVar) {
            this.f86529a = agVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f86529a.f86512c) {
                LinearLayoutManager linearLayoutManager = this.f86529a.f86521l;
                if (linearLayoutManager != null) {
                    i2 = linearLayoutManager.mo4751l();
                } else {
                    i2 = -1;
                }
                if (i2 == this.f86529a.f86516g) {
                    recyclerView.mo4795a(0, -this.f86529a.f86518i);
                    this.f86529a.f86512c = false;
                    return;
                }
                recyclerView.mo4833d(this.f86529a.f86516g);
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C33360ag agVar = this.f86529a;
            if (agVar.f86519j.getVisibility() != 8) {
                LinearLayoutManager linearLayoutManager = agVar.f86521l;
                if (linearLayoutManager != null) {
                    int l = linearLayoutManager.mo4751l();
                    if (l >= 0 && l < agVar.f86524o.f86483b.size()) {
                        C11207p pVar = (C11207p) agVar.f86524o.f86483b.get(l);
                        if (pVar != null) {
                            if (pVar.getIndex() <= agVar.f86514e) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                agVar.mo70729a();
                            } else if (l == agVar.f86524o.getItemCount() - 1 && !agVar.f86524o.f87366k) {
                                agVar.mo70729a();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70729a() {
        this.f86519j.startAnimation(C35214b.m79602a(240, 0.0f, (float) this.f86519j.getWidth(), 0.0f, 0.0f));
        C9432q.m18691b(this.f86519j, 8);
    }

    /* renamed from: b */
    public final void mo70730b() {
        boolean z;
        this.f86516g = this.f86524o.mo71702a(this.f86514e);
        if (this.f86516g == -1) {
            Collection collection = this.f86524o.f86483b;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f86513d = true;
                this.f86525q++;
                if (this.f86525q > 10) {
                    this.f86525q = 0;
                    this.f86513d = false;
                    return;
                } else if (this.f86515f > 50) {
                    this.f86524o.mo71704a(((int) this.f86515f) + 1);
                    return;
                } else {
                    this.f86524o.mo71704a(51);
                    return;
                }
            }
        }
        this.f86513d = false;
        this.f86512c = true;
        if (this.f86516g != -1) {
            this.f86523n.mo4833d(this.f86516g);
        }
    }

    public C33360ag(View view, RecyclerView recyclerView, C33689r rVar) {
        LinearLayoutManager linearLayoutManager;
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(rVar, "adapter");
        this.f86522m = view;
        this.f86523n = recyclerView;
        this.f86524o = rVar;
        Context context = this.f86522m.getContext();
        C52711k.m112236a((Object) context, "rootView.context");
        this.f86517h = context;
        this.f86518i = (int) C9432q.m18687b(this.f86517h, 60.0f);
        View findViewById = this.f86522m.findViewById(R.id.dlg);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById<Vi…R.id.unread_message_tips)");
        this.f86519j = findViewById;
        this.f86520k = (DmtTextView) this.f86522m.findViewById(R.id.dlf);
        if (this.f86523n.getLayoutManager() instanceof LinearLayoutManager) {
            C1332i layoutManager = this.f86523n.getLayoutManager();
            if (layoutManager != null) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            linearLayoutManager = null;
        }
        this.f86521l = linearLayoutManager;
        View view2 = this.f86519j;
        view2.setVisibility(8);
        view2.setOnClickListener(new C33363c(this));
        C11180b a = C11182d.m22641a().mo20658a(this.f86524o.f87368m.getConversationId());
        if (a != null) {
            this.f86514e = a.getReadIndex();
            this.f86515f = a.getUnreadCount();
        }
        this.f86524o.mo71708a((C33703c) new C33364d(this));
        this.f86523n.mo4801a((C1340m) new C33365e(this));
    }
}
