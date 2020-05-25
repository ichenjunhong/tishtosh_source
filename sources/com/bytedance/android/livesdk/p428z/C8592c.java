package com.bytedance.android.livesdk.p428z;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.recyclerview.C4240a.C4242a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.admin.p273a.C4529a;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import com.bytedance.android.livesdk.admin.p275c.C4533a;
import com.bytedance.android.livesdk.admin.p276d.C4538a;
import com.bytedance.android.livesdk.admin.p277e.C4546a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6080dg.C6082b;
import com.bytedance.android.livesdk.chatroom.p325ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.kickout.C7715a;
import com.bytedance.android.livesdk.kickout.C7722b;
import com.bytedance.android.livesdk.kickout.p389a.C7720a;
import com.bytedance.android.livesdk.kickout.p389a.C7721b;
import com.bytedance.android.livesdk.kickout.p390b.C7723a;
import com.bytedance.android.livesdk.kickout.p391c.C7724a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.z.c */
public final class C8592c extends FrameLayout {

    /* renamed from: j */
    public static final C8594a f23542j = new C8594a(null);

    /* renamed from: a */
    public boolean f23543a;

    /* renamed from: b */
    public C4538a f23544b;

    /* renamed from: c */
    public int f23545c = 10;

    /* renamed from: d */
    public String f23546d;

    /* renamed from: e */
    public int f23547e;

    /* renamed from: f */
    public boolean f23548f;

    /* renamed from: g */
    public long f23549g;

    /* renamed from: h */
    public C7715a f23550h;

    /* renamed from: i */
    public C7724a f23551i;

    /* renamed from: k */
    private int f23552k;

    /* renamed from: l */
    private int f23553l;

    /* renamed from: m */
    private String f23554m;

    /* renamed from: n */
    private C6082b f23555n;

    /* renamed from: o */
    private final C1689b f23556o = new C1689b();

    /* renamed from: p */
    private C4533a f23557p;

    /* renamed from: q */
    private final C4546a f23558q = new C8596c(this);

    /* renamed from: r */
    private final C7722b f23559r = new C8597d(this);

    /* renamed from: s */
    private final C4242a f23560s = new C8598e(this);

    /* renamed from: t */
    private final Long f23561t;

    /* renamed from: u */
    private final Long f23562u;

    /* renamed from: v */
    private HashMap f23563v;

    /* renamed from: com.bytedance.android.livesdk.z.c$a */
    public static final class C8594a {
        private C8594a() {
        }

        public /* synthetic */ C8594a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.z.c$b */
    static final class C8595b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8592c f23565a;

        /* renamed from: b */
        final /* synthetic */ int f23566b;

        C8595b(C8592c cVar, int i) {
            this.f23565a = cVar;
            this.f23566b = i;
        }

        public final void onClick(View view) {
            if (1 == this.f23566b) {
                this.f23565a.mo15079a();
            } else {
                this.f23565a.mo15082b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.z.c$c */
    public static final class C8596c implements C4546a {

        /* renamed from: a */
        final /* synthetic */ C8592c f23567a;

        /* renamed from: a */
        public final void mo10362a(boolean z, User user) {
            C52711k.m112240b(user, "user");
        }

        /* renamed from: a */
        public final void mo10363a(boolean z, Exception exc) {
        }

        C8596c(C8592c cVar) {
            this.f23567a = cVar;
        }

        /* renamed from: a */
        public final void mo10360a(C4532c cVar, Exception exc) {
            if (!this.f23567a.f23543a || this.f23567a.f23544b == null) {
                return;
            }
            if (exc != null || cVar == null) {
                C4538a aVar = this.f23567a.f23544b;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.getItemCount() == 0) {
                    ((LoadingStatusView) this.f23567a.mo15081b(R.id.cf4)).mo9845d();
                }
                C4602l.m11046a(this.f23567a.getContext(), exc);
            } else if (!C9376b.m18558a((Collection<T>) cVar.f12466a)) {
                ((LoadingStatusView) this.f23567a.mo15081b(R.id.cf4)).mo9842a();
                this.f23567a.f23545c = cVar.f12467b;
                C4538a aVar2 = this.f23567a.f23544b;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.mo10358a(cVar);
            } else {
                LoadingStatusView loadingStatusView = (LoadingStatusView) this.f23567a.mo15081b(R.id.cf4);
                if (loadingStatusView == null) {
                    C52711k.m112234a();
                }
                loadingStatusView.mo9844c();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.z.c$d */
    public static final class C8597d implements C7722b {

        /* renamed from: a */
        final /* synthetic */ C8592c f23568a;

        /* renamed from: a */
        public final void mo14066a(boolean z, Exception exc) {
        }

        /* renamed from: b */
        public final void mo14068b(boolean z) {
        }

        /* renamed from: a */
        public final void mo14064a() {
            if (this.f23568a.f23543a && this.f23568a.f23551i != null) {
                C7724a aVar = this.f23568a.f23551i;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.mo9862c() == 0) {
                    ((LoadingStatusView) this.f23568a.mo15081b(R.id.cf4)).mo9843b();
                    return;
                }
                C7724a aVar2 = this.f23568a.f23551i;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.mo9854a();
            }
        }

        /* renamed from: b */
        public final void mo14067b() {
            if (this.f23568a.f23543a && this.f23568a.f23551i != null) {
                C7724a aVar = this.f23568a.f23551i;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.mo9862c() == 0) {
                    ((LoadingStatusView) this.f23568a.mo15081b(R.id.cf4)).mo9842a();
                    return;
                }
                C7724a aVar2 = this.f23568a.f23551i;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.mo9856b();
            }
        }

        C8597d(C8592c cVar) {
            this.f23568a = cVar;
        }

        /* renamed from: a */
        public final void mo14065a(C7723a aVar, Exception exc) {
            if (!this.f23568a.f23543a || this.f23568a.f23551i == null) {
                return;
            }
            if (exc != null || aVar == null || aVar.f11365b == null) {
                C7724a aVar2 = this.f23568a.f23551i;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                if (aVar2.getItemCount() == 0) {
                    ((LoadingStatusView) this.f23568a.mo15081b(R.id.cf4)).mo9845d();
                    this.f23568a.f23547e = 0;
                }
                C4602l.m11046a(this.f23568a.getContext(), exc);
                return;
            }
            this.f23568a.f23548f = aVar.f11366c.hasMore;
            if (!this.f23568a.f23548f) {
                C7724a aVar3 = this.f23568a.f23551i;
                if (aVar3 == null) {
                    C52711k.m112234a();
                }
                aVar3.f21235c = false;
                C7724a aVar4 = this.f23568a.f23551i;
                if (aVar4 == null) {
                    C52711k.m112234a();
                }
                aVar4.f11611b = false;
            }
            List list = aVar.f11365b;
            if (list == null || list.size() <= 0) {
                ((LoadingStatusView) this.f23568a.mo15081b(R.id.cf4)).mo9844c();
                return;
            }
            C7724a aVar5 = this.f23568a.f23551i;
            if (aVar5 == null) {
                C52711k.m112234a();
            }
            aVar5.mo14070a((Collection<? extends User>) list);
            C7724a aVar6 = this.f23568a.f23551i;
            if (aVar6 == null) {
                C52711k.m112234a();
            }
            aVar6.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.z.c$e */
    static final class C8598e implements C4242a {

        /* renamed from: a */
        final /* synthetic */ C8592c f23569a;

        C8598e(C8592c cVar) {
            this.f23569a = cVar;
        }

        /* renamed from: a */
        public final void mo9858a(boolean z) {
            if (this.f23569a.f23548f && this.f23569a.f23550h != null) {
                this.f23569a.f23547e++;
                C7715a aVar = this.f23569a.f23550h;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                aVar.mo14058a(this.f23569a.f23549g, this.f23569a.f23546d, this.f23569a.f23547e, 20);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.z.c$f */
    static final class C8599f<T> implements C1710e<T> {

        /* renamed from: a */
        final /* synthetic */ C8592c f23570a;

        C8599f(C8592c cVar) {
            this.f23570a = cVar;
        }

        public final void accept(T t) {
            if (t instanceof C4529a) {
                this.f23570a.onEvent((C4529a) t);
            } else if (t instanceof C7720a) {
                this.f23570a.onEvent((C7720a) t);
            } else {
                if (t instanceof C7721b) {
                    this.f23570a.onEvent((C7721b) t);
                }
            }
        }
    }

    /* renamed from: b */
    public final View mo15081b(int i) {
        if (this.f23563v == null) {
            this.f23563v = new HashMap();
        }
        View view = (View) this.f23563v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f23563v.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C6082b getClickCallback() {
        return this.f23555n;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23543a = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23543a = false;
        this.f23556o.dispose();
    }

    private final Map<String, String> getCommonLogPara() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("anchor_id", String.valueOf(this.f23562u));
        hashMap.put("room_id", String.valueOf(this.f23561t));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo15079a() {
        if (!C8600d.m16995a(getContext())) {
            C4204a.m10421a(getContext(), (int) R.string.e77);
            return;
        }
        ((LoadingStatusView) mo15081b(R.id.cf4)).mo9843b();
        Long l = this.f23562u;
        if (l != null) {
            long longValue = l.longValue();
            C4533a aVar = this.f23557p;
            if (aVar != null) {
                aVar.mo10355a(longValue);
            }
        }
    }

    /* renamed from: b */
    public final void mo15082b() {
        if (!C8600d.m16995a(getContext())) {
            C4204a.m10421a(getContext(), (int) R.string.e77);
            ((LoadingStatusView) mo15081b(R.id.cf4)).mo9845d();
            return;
        }
        if (this.f23550h != null) {
            C7715a aVar = this.f23550h;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.mo14058a(this.f23549g, this.f23546d, this.f23547e, 20);
        }
    }

    public final void setClickCallback(C6082b bVar) {
        this.f23555n = bVar;
    }

    /* renamed from: a */
    private final <T> void m16980a(Class<T> cls) {
        this.f23556o.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C8599f<Object>(this)));
    }

    public final void onEvent(C4529a aVar) {
        if (this.f23543a && aVar != null && !aVar.f12461a && this.f23544b != null) {
            C4538a aVar2 = this.f23544b;
            if (aVar2 == null) {
                C52711k.m112234a();
            }
            aVar2.mo10357a(aVar.f12462b);
            C4538a aVar3 = this.f23544b;
            if (aVar3 != null && aVar3.getItemCount() == 0) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) mo15081b(R.id.cf4);
                if (loadingStatusView == null) {
                    C52711k.m112234a();
                }
                loadingStatusView.mo9844c();
            }
        }
    }

    public final void onEvent(C7720a aVar) {
        if (this.f23543a && aVar != null && !aVar.f21231a && this.f23551i != null) {
            C7724a aVar2 = this.f23551i;
            if (aVar2 == null) {
                C52711k.m112234a();
            }
            aVar2.mo14069a(aVar.f21232b);
            C7724a aVar3 = this.f23551i;
            if (aVar3 != null && aVar3.getItemCount() == 0) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) mo15081b(R.id.cf4);
                if (loadingStatusView == null) {
                    C52711k.m112234a();
                }
                loadingStatusView.mo9844c();
            }
        }
    }

    /* renamed from: c */
    private final void m16981c(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bvd, null);
        inflate.setOnClickListener(new C8595b(this, i));
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        LoadingEmptyView loadingEmptyView = new LoadingEmptyView(context, null, 0, 6, null);
        LoadingEmptyView b = loadingEmptyView.mo11844a(getContext().getString(this.f23553l)).mo11845b(getContext().getString(this.f23552k));
        b.setLayoutParams(new LayoutParams(-1, -1));
        LoadingStatusView loadingStatusView = (LoadingStatusView) mo15081b(R.id.cf4);
        C4239a c = C4239a.m10480a(getContext()).mo9851b((View) b).mo9852c(inflate);
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        loadingStatusView.setBuilder(c.mo9847a(context2.getResources().getDimensionPixelSize(R.dimen.o4)));
    }

    public final void onEvent(C7721b bVar) {
        if (this.f23543a && bVar != null && !bVar.f21233a && this.f23551i != null) {
            C7724a aVar = this.f23551i;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.mo14069a(bVar.f21234b);
            C7724a aVar2 = this.f23551i;
            if (aVar2 != null && aVar2.getItemCount() == 0) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) mo15081b(R.id.cf4);
                if (loadingStatusView == null) {
                    C52711k.m112234a();
                }
                loadingStatusView.mo9844c();
            }
        }
    }

    /* renamed from: a */
    public final void mo15080a(int i) {
        if (this.f23561t != null && this.f23562u != null) {
            RecyclerView recyclerView = (RecyclerView) mo15081b(R.id.cf3);
            C52711k.m112236a((Object) recyclerView, "room_manage_list_content");
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
            this.f23553l = R.string.gzl;
            if (1 == i) {
                this.f23552k = R.string.hqg;
                this.f23554m = getContext().getString(R.string.e2v);
                this.f23557p = new C4533a(this.f23558q);
                C4538a aVar = new C4538a(getContext(), this.f23562u.longValue(), this.f23561t.longValue());
                this.f23544b = aVar;
                RecyclerView recyclerView2 = (RecyclerView) mo15081b(R.id.cf3);
                C52711k.m112236a((Object) recyclerView2, "room_manage_list_content");
                recyclerView2.setAdapter(this.f23544b);
                mo15079a();
                C8049c.m15979a().mo14202a("livesdk_anchor_admin_list_show", getCommonLogPara(), new Object[0]);
            } else {
                if (2 == i) {
                    this.f23546d = "activity_banned_talk";
                    this.f23552k = R.string.gzz;
                    this.f23554m = getContext().getString(R.string.e3p);
                    C8049c.m15979a().mo14202a("livesdk_anchor_mute_list_show", getCommonLogPara(), new Object[0]);
                } else if (3 == i) {
                    this.f23546d = "activity_kick_out";
                    this.f23552k = R.string.gzq;
                    this.f23554m = getContext().getString(R.string.f17);
                    C8049c.m15979a().mo14202a("livesdk_anchor_blacklist_show", getCommonLogPara(), new Object[0]);
                }
                this.f23550h = new C7715a();
                C7715a aVar2 = this.f23550h;
                if (aVar2 != null) {
                    aVar2.f21222a = this.f23559r;
                }
                C7724a aVar3 = new C7724a(getContext(), this.f23546d, this.f23561t.longValue(), this.f23562u.longValue());
                this.f23551i = aVar3;
                RecyclerView recyclerView3 = (RecyclerView) mo15081b(R.id.cf3);
                C52711k.m112236a((Object) recyclerView3, "room_manage_list_content");
                recyclerView3.setAdapter(this.f23551i);
                C7724a aVar4 = this.f23551i;
                if (aVar4 != null) {
                    aVar4.f11607a = this.f23560s;
                }
                this.f23547e = 0;
                this.f23549g = this.f23561t.longValue();
                mo15082b();
            }
            ((TextView) mo15081b(R.id.cf5)).setText(this.f23554m);
            m16981c(i);
        }
    }

    public C8592c(Context context, Long l, Long l2) {
        C52711k.m112240b(context, "context");
        super(context);
        this.f23561t = l;
        this.f23562u = l2;
        LayoutInflater.from(context).inflate(R.layout.bwa, this, true);
        ((LinearLayout) mo15081b(R.id.eta)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C8592c f23564a;

            {
                this.f23564a = r1;
            }

            public final void onClick(View view) {
                C6082b clickCallback = this.f23564a.getClickCallback();
                if (clickCallback != null) {
                    clickCallback.mo12119a(3);
                }
            }
        });
        m16980a(C4529a.class);
        m16980a(C7720a.class);
        m16980a(C7721b.class);
    }
}
