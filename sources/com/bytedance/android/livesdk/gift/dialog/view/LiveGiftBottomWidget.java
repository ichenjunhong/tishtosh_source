package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LiveGiftBottomWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    public final List<C7248a> f19685a = new ArrayList();

    /* renamed from: b */
    public RecyclerView f19686b;

    /* renamed from: c */
    C7249b f19687c;

    /* renamed from: d */
    public GiftViewModel f19688d;

    /* renamed from: e */
    public int f19689e;

    /* renamed from: f */
    public View f19690f;

    /* renamed from: g */
    public View f19691g;

    /* renamed from: h */
    private TextView f19692h;

    /* renamed from: i */
    private View f19693i;

    /* renamed from: j */
    private View f19694j;

    /* renamed from: k */
    private View f19695k;

    /* renamed from: l */
    private boolean f19696l;

    /* renamed from: m */
    private boolean f19697m;

    /* renamed from: n */
    private boolean f19698n;

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftBottomWidget$a */
    class C7248a {

        /* renamed from: a */
        String f19700a;

        /* renamed from: b */
        int f19701b;

        /* renamed from: c */
        boolean f19702c;

        /* renamed from: d */
        boolean f19703d;

        private C7248a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftBottomWidget$b */
    class C7249b extends C1322a<C7250c> {
        public final int getItemCount() {
            return LiveGiftBottomWidget.this.f19685a.size();
        }

        private C7249b() {
        }

        public final int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == getItemCount() - 1) {
                return 2;
            }
            return 1;
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            int i2;
            C7250c cVar = (C7250c) vVar;
            C7248a aVar = (C7248a) LiveGiftBottomWidget.this.f19685a.get(i);
            if (aVar != null) {
                cVar.f19706a.setGravity(48);
                cVar.f19706a.setText(aVar.f19700a);
                GiftTabTextView giftTabTextView = cVar.f19706a;
                if (aVar.f19703d) {
                    i2 = LiveGiftBottomWidget.this.context.getResources().getColor(R.color.b3p);
                } else {
                    i2 = LiveGiftBottomWidget.this.context.getResources().getColor(R.color.b3o);
                }
                giftTabTextView.setTextColor(i2);
                cVar.f19706a.mo13472a(aVar.f19702c);
                cVar.f19706a.setTextSize(14.0f);
                cVar.itemView.setOnClickListener(new C7263e(cVar, aVar));
                if (aVar.f19702c) {
                    C7647s.m15644a(aVar.f19701b);
                }
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(LiveGiftBottomWidget.this.context).inflate(R.layout.bwl, null);
            View findViewById = inflate.findViewById(R.id.e_x);
            if (findViewById.getLayoutParams() instanceof LayoutParams) {
                LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9432q.m18687b(LiveGiftBottomWidget.this.context, 16.0f);
                    layoutParams.setMarginStart((int) C9432q.m18687b(LiveGiftBottomWidget.this.context, 16.0f));
                } else if (i == 2) {
                    layoutParams.rightMargin = (int) C9432q.m18687b(LiveGiftBottomWidget.this.context, 50.0f);
                    layoutParams.setMarginEnd((int) C9432q.m18687b(LiveGiftBottomWidget.this.context, 50.0f));
                }
                findViewById.setLayoutParams(layoutParams);
            }
            return new C7250c(inflate);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftBottomWidget$c */
    class C7250c extends C1352v {

        /* renamed from: a */
        GiftTabTextView f19706a;

        public C7250c(View view) {
            super(view);
            this.f19706a = (GiftTabTextView) view.findViewById(R.id.e_x);
        }
    }

    public int getLayoutId() {
        return R.layout.bvg;
    }

    public void onUnload() {
        this.f19688d.mo13529a((C0184k) this);
    }

    public void onResume() {
        super.onResume();
        this.f19688d.mo13536a(new C7289a(9, null));
    }

    public LiveGiftBottomWidget(GiftViewModel giftViewModel) {
        this.f19688d = giftViewModel;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.e1n && !this.f19697m) {
            this.f19688d.mo13536a(new C7289a(8, null));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13483a(boolean z) {
        if (z && !this.f19698n) {
            this.f19698n = true;
            C7649u.m15656a().mo14015b();
            if (C7649u.m15656a().mo14016c()) {
                for (C7248a aVar : this.f19685a) {
                    if (aVar.f19701b == 5) {
                        aVar.f19702c = true;
                        this.f19696l = true;
                        return;
                    }
                }
            }
        }
    }

    public void onInit(Object[] objArr) {
        this.f19686b = (RecyclerView) findViewById(R.id.ez8);
        this.f19692h = (TextView) findViewById(R.id.erb);
        this.f19693i = findViewById(R.id.e2f);
        this.f19694j = findViewById(R.id.e1n);
        this.f19690f = findViewById(R.id.ewq);
        this.f19691g = findViewById(R.id.e7b);
        this.f19695k = findViewById(R.id.er9);
    }

    public void onLoad(Object[] objArr) {
        this.f19687c = new C7249b();
        this.f19686b.setItemViewCacheSize(16);
        this.f19686b.setAdapter(this.f19687c);
        this.f19686b.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
        mo13481a((C7290b) null);
        this.f19688d.mo13530a((C0184k) this, (C0199s<C7290b>) new C7262d<C7290b>(this));
        this.f19694j.setOnClickListener(this);
        this.f19686b.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                super.onScrolled(recyclerView, i, i2);
                if (LiveGiftBottomWidget.this.f19686b.getLayoutManager() instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) LiveGiftBottomWidget.this.f19686b.getLayoutManager();
                    int k = linearLayoutManager.mo4750k();
                    int m = linearLayoutManager.mo4752m();
                    View view = LiveGiftBottomWidget.this.f19690f;
                    int i4 = 0;
                    if (k == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                    View view2 = LiveGiftBottomWidget.this.f19691g;
                    if (m == LiveGiftBottomWidget.this.f19685a.size() - 1) {
                        i4 = 8;
                    }
                    view2.setVisibility(i4);
                }
            }
        });
        if (((Boolean) C4525b.f12427by.mo10345a()).booleanValue()) {
            this.f19696l = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13481a(C7290b bVar) {
        long b = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b();
        boolean c = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c();
        this.f19697m = false;
        if (b <= 0 || !c) {
            this.f19692h.setText(R.string.f2f);
            this.f19692h.setTextColor(this.context.getResources().getColor(R.color.b3n));
            this.f19692h.setTextSize(1, 14.0f);
            this.f19693i.setVisibility(8);
            this.f19695k.setVisibility(0);
            return;
        }
        this.f19692h.setText(C3890e.m9838f(b));
        this.f19692h.setTextColor(this.context.getResources().getColor(R.color.b3m));
        this.f19692h.setTextSize(1, 16.0f);
        this.f19693i.setVisibility(0);
        this.f19693i.setBackgroundResource(R.drawable.bsx);
        this.f19695k.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13482a(List<GiftPage> list, GiftPage giftPage) {
        boolean z;
        this.f19685a.clear();
        if (C9414h.m18630a(list)) {
            C7248a aVar = new C7248a();
            aVar.f19701b = 1;
            aVar.f19703d = true;
            aVar.f19700a = this.context.getString(R.string.ehu);
            this.f19685a.add(aVar);
            return;
        }
        if (giftPage == null) {
            giftPage = (GiftPage) list.get(0);
        }
        this.f19689e = giftPage.pageType;
        for (GiftPage giftPage2 : list) {
            if (giftPage2 != null && giftPage2.display) {
                C7248a aVar2 = new C7248a();
                aVar2.f19700a = giftPage2.pageName;
                if (giftPage2.pageType == giftPage.pageType) {
                    z = true;
                } else {
                    z = false;
                }
                aVar2.f19703d = z;
                aVar2.f19701b = giftPage2.pageType;
                if (this.f19696l) {
                    if (this.f19689e == 5) {
                        C7649u.m15656a().mo14017d();
                        this.f19696l = false;
                    } else if (giftPage2.pageType == 5) {
                        aVar2.f19702c = true;
                    }
                }
                this.f19685a.add(aVar2);
            }
        }
    }
}
