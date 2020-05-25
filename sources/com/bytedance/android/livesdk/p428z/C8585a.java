package com.bytedance.android.livesdk.p428z;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.recyclerview.C4240a.C4242a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.admin.p273a.C4529a;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import com.bytedance.android.livesdk.admin.p275c.C4533a;
import com.bytedance.android.livesdk.admin.p276d.C4538a;
import com.bytedance.android.livesdk.admin.p277e.C4546a;
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
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.z.a */
public final class C8585a extends Dialog {

    /* renamed from: a */
    public int f23513a;

    /* renamed from: b */
    public boolean f23514b;

    /* renamed from: c */
    public TextView f23515c;

    /* renamed from: d */
    public LoadingStatusView f23516d;

    /* renamed from: e */
    public C4538a f23517e;

    /* renamed from: f */
    public int f23518f;

    /* renamed from: g */
    public String f23519g;

    /* renamed from: h */
    public int f23520h;

    /* renamed from: i */
    public boolean f23521i;

    /* renamed from: j */
    public long f23522j;

    /* renamed from: k */
    public C7715a f23523k;

    /* renamed from: l */
    public C7724a f23524l;

    /* renamed from: m */
    private long f23525m;

    /* renamed from: n */
    private long f23526n;

    /* renamed from: o */
    private int f23527o;

    /* renamed from: p */
    private String f23528p;

    /* renamed from: q */
    private TextView f23529q;

    /* renamed from: r */
    private RecyclerView f23530r;

    /* renamed from: s */
    private boolean f23531s;

    /* renamed from: t */
    private C1689b f23532t;

    /* renamed from: u */
    private C4533a f23533u;

    /* renamed from: v */
    private C4546a f23534v;

    /* renamed from: w */
    private C7722b f23535w;

    /* renamed from: x */
    private C4242a f23536x;

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23514b = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23514b = false;
        this.f23532t.dispose();
    }

    /* renamed from: a */
    public final void mo15069a() {
        if (!C8591b.m16979a(getContext())) {
            C4204a.m10421a(getContext(), (int) R.string.e77);
            return;
        }
        this.f23516d.mo9843b();
        this.f23533u.mo10355a(this.f23526n);
    }

    /* renamed from: b */
    public final void mo15070b() {
        if (!C8591b.m16979a(getContext())) {
            C4204a.m10421a(getContext(), (int) R.string.e77);
            this.f23516d.mo9845d();
            return;
        }
        if (this.f23523k != null) {
            this.f23523k.mo14058a(this.f23522j, this.f23519g, this.f23520h, 20);
        }
    }

    /* renamed from: a */
    private <T> void m16967a(Class<T> cls) {
        this.f23532t.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4529a) {
                    C8585a.this.onEvent((C4529a) t);
                } else if (t instanceof C7720a) {
                    C8585a.this.onEvent((C7720a) t);
                } else {
                    if (t instanceof C7721b) {
                        C8585a.this.onEvent((C7721b) t);
                    }
                }
            }
        }));
    }

    public final void onEvent(C7720a aVar) {
        if (this.f23514b && aVar != null && !aVar.f21231a && this.f23524l != null) {
            this.f23524l.mo14069a(aVar.f21232b);
        }
    }

    public final void onEvent(C4529a aVar) {
        if (this.f23514b && aVar != null && !aVar.f12461a && this.f23517e != null) {
            this.f23517e.mo10357a(aVar.f12462b);
            this.f23515c.setText(getContext().getString(R.string.e2w, new Object[]{Integer.valueOf(this.f23517e.getItemCount()), Integer.valueOf(this.f23518f)}));
        }
    }

    public final void onEvent(C7721b bVar) {
        if (this.f23514b && bVar != null && !bVar.f21233a && this.f23524l != null) {
            this.f23524l.mo14069a(bVar.f21234b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(R.layout.aja);
            this.f23529q = (TextView) findViewById(R.id.cf5);
            this.f23515c = (TextView) findViewById(R.id.cf6);
            this.f23530r = (RecyclerView) findViewById(R.id.cf3);
            this.f23516d = (LoadingStatusView) findViewById(R.id.cf4);
            this.f23530r.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
            if (1 == this.f23513a) {
                this.f23527o = R.string.efu;
                this.f23528p = getContext().getString(R.string.e2v);
                this.f23533u = new C4533a(this.f23534v);
                C4538a aVar = new C4538a(getContext(), this.f23526n, this.f23525m);
                this.f23517e = aVar;
                this.f23530r.setAdapter(this.f23517e);
                mo15069a();
            } else {
                if (2 == this.f23513a) {
                    this.f23519g = "activity_banned_talk";
                    this.f23527o = R.string.efz;
                    this.f23528p = getContext().getString(R.string.e3p);
                } else if (3 == this.f23513a) {
                    this.f23519g = "activity_kick_out";
                    this.f23527o = R.string.eft;
                    this.f23528p = getContext().getString(R.string.f17);
                }
                this.f23523k = new C7715a();
                this.f23523k.f21222a = this.f23535w;
                C7724a aVar2 = new C7724a(getContext(), this.f23519g, this.f23525m, this.f23526n);
                this.f23524l = aVar2;
                this.f23530r.setAdapter(this.f23524l);
                this.f23524l.f11607a = this.f23536x;
                this.f23520h = 0;
                this.f23522j = this.f23525m;
                mo15070b();
            }
            this.f23529q.setText(this.f23528p);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bx5, null);
            inflate.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (1 == C8585a.this.f23513a) {
                        C8585a.this.mo15069a();
                    } else {
                        C8585a.this.mo15070b();
                    }
                }
            });
            LoadingEmptyView a = new LoadingEmptyView(getContext()).mo11844a(getContext().getString(this.f23527o));
            a.setLayoutParams(new LayoutParams(-1, -1));
            this.f23516d.setBuilder(C4239a.m10480a(getContext()).mo9851b((View) a).mo9852c(inflate).mo9847a(getContext().getResources().getDimensionPixelSize(R.dimen.o4)));
            m16967a(C4529a.class);
            m16967a(C7720a.class);
            m16967a(C7721b.class);
            if (this.f23531s) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setGravity(5);
                window.setLayout(-2, -1);
            }
            window.setBackgroundDrawableResource(17170445);
            window.setDimAmount(0.0f);
        }
    }

    public C8585a(Context context, int i, long j, long j2, boolean z) {
        int i2;
        if (z) {
            i2 = R.style.y3;
        } else {
            i2 = R.style.xz;
        }
        super(context, i2);
        this.f23532t = new C1689b();
        this.f23518f = 10;
        this.f23534v = new C4546a() {
            /* renamed from: a */
            public final void mo10362a(boolean z, User user) {
            }

            /* renamed from: a */
            public final void mo10363a(boolean z, Exception exc) {
            }

            /* renamed from: a */
            public final void mo10360a(C4532c cVar, Exception exc) {
                if (!C8585a.this.f23514b || C8585a.this.f23517e == null) {
                    return;
                }
                if (exc != null || cVar == null) {
                    if (C8585a.this.f23517e.getItemCount() == 0) {
                        C8585a.this.f23516d.mo9845d();
                    }
                    C4602l.m11046a(C8585a.this.getContext(), exc);
                } else if (!C9376b.m18558a((Collection<T>) cVar.f12466a)) {
                    C8585a.this.f23516d.mo9842a();
                    C8585a.this.f23518f = cVar.f12467b;
                    C8585a.this.f23515c.setText(C3897k.m9852a(C3922z.m9903a((int) R.string.e2w), Integer.valueOf(cVar.f12468c), Integer.valueOf(C8585a.this.f23518f)));
                    C9432q.m18691b((View) C8585a.this.f23515c, 0);
                    C8585a.this.f23517e.mo10358a(cVar);
                } else {
                    C8585a.this.f23516d.mo9844c();
                }
            }
        };
        this.f23535w = new C7722b() {
            /* renamed from: a */
            public final void mo14066a(boolean z, Exception exc) {
            }

            /* renamed from: b */
            public final void mo14068b(boolean z) {
            }

            /* renamed from: a */
            public final void mo14064a() {
                if (!C8585a.this.f23514b || C8585a.this.f23524l == null) {
                    return;
                }
                if (C8585a.this.f23524l.mo9862c() == 0) {
                    C8585a.this.f23516d.mo9843b();
                } else {
                    C8585a.this.f23524l.mo9854a();
                }
            }

            /* renamed from: b */
            public final void mo14067b() {
                if (!C8585a.this.f23514b || C8585a.this.f23524l == null) {
                    return;
                }
                if (C8585a.this.f23524l.mo9862c() == 0) {
                    C8585a.this.f23516d.mo9842a();
                } else {
                    C8585a.this.f23524l.mo9856b();
                }
            }

            /* renamed from: a */
            public final void mo14065a(C7723a aVar, Exception exc) {
                if (!C8585a.this.f23514b || C8585a.this.f23524l == null) {
                    return;
                }
                if (exc != null || aVar == null || aVar.f11365b == null) {
                    if (C8585a.this.f23524l.getItemCount() == 0) {
                        C8585a.this.f23516d.mo9845d();
                        C8585a.this.f23520h = 0;
                    }
                    C4602l.m11046a(C8585a.this.getContext(), exc);
                    return;
                }
                C8585a.this.f23521i = aVar.f11366c.hasMore;
                if (!C8585a.this.f23521i) {
                    C8585a.this.f23524l.f21235c = true;
                    C8585a.this.f23524l.f11611b = false;
                }
                List list = aVar.f11365b;
                if (list == null || list.size() <= 0) {
                    C8585a.this.f23516d.mo9844c();
                    return;
                }
                C8585a.this.f23524l.mo14070a((Collection<? extends User>) list);
                C8585a.this.f23524l.notifyDataSetChanged();
            }
        };
        this.f23536x = new C4242a() {
            /* renamed from: a */
            public final void mo9858a(boolean z) {
                if (C8585a.this.f23521i && C8585a.this.f23523k != null) {
                    C8585a.this.f23520h++;
                    C8585a.this.f23523k.mo14058a(C8585a.this.f23522j, C8585a.this.f23519g, C8585a.this.f23520h, 20);
                }
            }
        };
        this.f23531s = z;
        this.f23513a = i;
        this.f23525m = j;
        this.f23526n = j2;
    }
}
