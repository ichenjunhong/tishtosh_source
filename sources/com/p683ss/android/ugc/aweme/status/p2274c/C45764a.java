package com.p683ss.android.ugc.aweme.status.p2274c;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a.C43093a;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.status.p2273b.C45739a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.c.a */
public final class C45764a extends C1352v implements OnClickListener {

    /* renamed from: a */
    public C43092a f115658a;

    /* renamed from: b */
    public int f115659b;

    /* renamed from: c */
    public boolean f115660c;

    /* renamed from: d */
    public int f115661d;

    /* renamed from: e */
    public int f115662e;

    /* renamed from: f */
    public int f115663f;

    /* renamed from: g */
    public View f115664g;

    /* renamed from: h */
    public final RecordStatusViewModel f115665h;

    /* renamed from: i */
    public FragmentActivity f115666i;

    /* renamed from: j */
    public C45739a f115667j;

    /* renamed from: com.ss.android.ugc.aweme.status.c.a$a */
    static final class C45766a<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C45764a f115669a;

        C45766a(C45764a aVar) {
            this.f115669a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                C45764a aVar = this.f115669a;
                C52711k.m112236a((Object) num, "it");
                aVar.f115661d = num.intValue();
                this.f115669a.mo92215a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c.a$b */
    static final class C45767b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C45764a f115670a;

        C45767b(C45764a aVar) {
            this.f115670a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                C45764a aVar = this.f115670a;
                C52711k.m112236a((Object) num, "it");
                aVar.f115662e = num.intValue();
                this.f115670a.mo92215a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c.a$c */
    static final class C45768c<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C45764a f115671a;

        C45768c(C45764a aVar) {
            this.f115671a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                C45764a aVar = this.f115671a;
                C52711k.m112236a((Object) num, "it");
                aVar.f115663f = num.intValue();
                this.f115671a.mo92215a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.c.a$d */
    public static final class C45769d implements C43093a {

        /* renamed from: a */
        final /* synthetic */ C45764a f115672a;

        /* renamed from: a */
        public final void mo87412a() {
            this.f115672a.f115665h.mo92162g().setValue(null);
            this.f115672a.f115659b = 0;
            this.f115672a.f115660c = false;
            if (this.f115672a.f115658a != null) {
                C43092a aVar = this.f115672a.f115658a;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.isShowing()) {
                    C43092a aVar2 = this.f115672a.f115658a;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    this.f115672a.f115658a = null;
                    this.f115672a.f115661d = 0;
                    this.f115672a.f115663f = 0;
                    this.f115672a.f115662e = 0;
                }
            }
        }

        C45769d(C45764a aVar) {
            this.f115672a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo92215a() {
        if (this.f115658a == null && this.f115660c) {
            this.f115658a = new C43092a(this.f115666i);
            C43092a aVar = this.f115658a;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("       ");
                sb.append(this.f115666i.getString(R.string.fj));
                sb.append("       ");
                aVar.setMessage(sb.toString());
            }
            C43092a aVar2 = this.f115658a;
            if (aVar2 != null) {
                aVar2.mo87485a(0);
            }
            C43092a aVar3 = this.f115658a;
            if (aVar3 != null) {
                aVar3.setCancelable(false);
            }
            C43092a aVar4 = this.f115658a;
            if (aVar4 != null) {
                aVar4.mo87486a((C43093a) new C45769d(this));
            }
            C43092a aVar5 = this.f115658a;
            if (aVar5 != null) {
                aVar5.show();
            }
        }
        if (this.f115658a != null) {
            int i = this.f115661d + this.f115662e + this.f115663f;
            if (i >= this.f115659b) {
                this.f115659b = i;
                C43092a aVar6 = this.f115658a;
                if (aVar6 == null) {
                    C52711k.m112234a();
                }
                aVar6.mo87485a(this.f115659b);
            }
            if (this.f115659b >= 100) {
                C43092a aVar7 = this.f115658a;
                if (aVar7 == null) {
                    C52711k.m112234a();
                }
                aVar7.mo87485a(100);
                C43092a aVar8 = this.f115658a;
                if (aVar8 == null) {
                    C52711k.m112234a();
                }
                aVar8.dismiss();
                this.f115659b = 0;
                this.f115661d = 0;
                this.f115663f = 0;
                this.f115662e = 0;
                this.f115658a = null;
                this.f115660c = false;
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f115665h.mo92162g().setValue(this.f115667j);
        this.f115660c = true;
    }

    public C45764a(View view, RecordStatusViewModel recordStatusViewModel, FragmentActivity fragmentActivity, C45739a aVar) {
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(recordStatusViewModel, "statusViewModel");
        C52711k.m112240b(fragmentActivity, "context");
        C52711k.m112240b(aVar, "effect");
        super(view);
        this.f115664g = view;
        this.f115665h = recordStatusViewModel;
        this.f115666i = fragmentActivity;
        this.f115667j = aVar;
        this.f115664g.post(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ C45764a f115668a;

            {
                this.f115668a = r1;
            }

            public final void run() {
                LayoutParams layoutParams = this.f115668a.f115664g.getLayoutParams();
                layoutParams.height = (this.f115668a.f115664g.getWidth() * 16) / 9;
                this.f115668a.f115664g.setLayoutParams(layoutParams);
            }
        });
        this.f115664g.setOnClickListener(this);
        this.f115665h.mo92161f().setValue(this.f115667j);
        this.f115665h.mo92163h().observe(this.f115666i, new C45766a(this));
        this.f115665h.mo92164i().observe(this.f115666i, new C45767b(this));
        this.f115665h.mo92165j().observe(this.f115666i, new C45768c(this));
    }
}
