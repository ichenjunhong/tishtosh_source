package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p325ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.p325ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.gift.dialog.C7246c;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.android.livesdk.widget.p425c.C8535a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LiveGiftListWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    final List<C7491b> f19726a = new ArrayList();

    /* renamed from: b */
    RecyclerView f19727b;

    /* renamed from: c */
    C7264f f19728c;

    /* renamed from: d */
    RtlViewPagerShower f19729d;

    /* renamed from: e */
    View f19730e;

    /* renamed from: f */
    int f19731f;

    /* renamed from: g */
    public int f19732g;

    /* renamed from: h */
    int f19733h;

    /* renamed from: i */
    long f19734i;

    /* renamed from: j */
    int f19735j = -1;

    /* renamed from: k */
    private final GiftViewModel f19736k;

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftListWidget$a */
    class C7258a extends SSGridLayoutManager {

        /* renamed from: K */
        public boolean f19739K = true;

        /* renamed from: e */
        public final boolean mo4742e() {
            if (!super.mo4742e() || !this.f19739K) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo4745f() {
            if (!super.mo4745f() || !this.f19739K) {
                return false;
            }
            return true;
        }

        public C7258a(Context context, int i, int i2, boolean z) {
            super(context, 2, 0, false);
        }
    }

    public int getLayoutId() {
        return R.layout.bvk;
    }

    public void onUnload() {
        this.f19736k.mo13529a((C0184k) this);
    }

    public LiveGiftListWidget(GiftViewModel giftViewModel) {
        this.f19736k = giftViewModel;
    }

    /* renamed from: a */
    public final void mo13502a(int i) {
        int i2 = i / 8;
        if (i2 >= 0 && i2 < this.f19733h) {
            if (i2 != this.f19731f) {
                mo13503b(i2 + 1);
            }
            this.f19731f = i2;
            this.f19729d.mo11846a(this.f19731f);
        }
    }

    public void onInit(Object[] objArr) {
        this.f19727b = (RecyclerView) findViewById(R.id.bbo);
        this.f19729d = (RtlViewPagerShower) findViewById(R.id.bvw);
        this.f19730e = findViewById(R.id.br1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13503b(int i) {
        C7246c.m15031a((Room) this.dataCenter.get("data_room", null), i, this.f19735j);
        if (this.f19735j == 5) {
            int i2 = (i - 1) * 8;
            int i3 = i2 + 7;
            while (i2 <= i3 && i2 >= 0 && i2 < this.f19726a.size()) {
                C7491b bVar = (C7491b) this.f19726a.get(i2);
                if ((bVar instanceof C7497h) && (bVar.f20516d instanceof Prop)) {
                    Prop prop = (Prop) bVar.f20516d;
                    if (prop.propType == 4) {
                        C7246c.m15028a(prop.count);
                        return;
                    }
                }
                i2++;
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f19736k.mo13530a((C0184k) this, (C0199s<C7290b>) new C7266h<C7290b>(this));
        this.f19728c = new C7264f(this.context, this.f19736k);
        this.f19727b.setAdapter(this.f19728c);
        RecyclerView recyclerView = this.f19727b;
        C7258a aVar = new C7258a(this.context, 2, 0, false);
        recyclerView.setLayoutManager(aVar);
        this.f19727b.setHasFixedSize(true);
        this.f19727b.setItemViewCacheSize(16);
        C72561 r8 = new C8535a() {
            /* renamed from: a */
            public final View mo13505a(C1332i iVar) {
                View a = super.mo13505a(iVar);
                if (a == null) {
                    return null;
                }
                LiveGiftListWidget.this.f19732g = C1332i.m4418c(a);
                LiveGiftListWidget.this.mo13502a(LiveGiftListWidget.this.f19732g);
                return a;
            }

            /* renamed from: a */
            public final int mo13504a(C1332i iVar, int i, int i2) {
                LiveGiftListWidget.this.f19732g = super.mo13504a(iVar, i, i2);
                LiveGiftListWidget.this.mo13502a(LiveGiftListWidget.this.f19732g);
                return LiveGiftListWidget.this.f19732g;
            }
        };
        r8.mo14964a(2).mo14967b(4);
        r8.mo14975a(this.f19727b);
        this.f19727b.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    LiveGiftListWidget.this.mo13502a(LiveGiftListWidget.this.f19732g);
                    super.onScrollStateChanged(recyclerView, i);
                }
            }
        });
        this.f19729d.setMargin(0);
        this.f19729d.mo11848a(this.context.getResources().getDrawable(R.drawable.dzy), this.context.getResources().getDrawable(R.drawable.dzz));
    }
}
