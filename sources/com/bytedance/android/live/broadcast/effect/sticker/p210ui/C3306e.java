package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6433c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.e */
public class C3306e extends Dialog implements OnCheckedChangeListener, C3300a {

    /* renamed from: a */
    final C3277a f9513a;

    /* renamed from: b */
    public SwitchCompat f9514b;

    /* renamed from: c */
    public LoadingStatusView f9515c;

    /* renamed from: d */
    public RecyclerView f9516d;

    /* renamed from: e */
    public C3338i f9517e;

    /* renamed from: f */
    public List<EffectCategoryResponse> f9518f;

    /* renamed from: g */
    private final DataCenter f9519g;

    /* renamed from: h */
    private View f9520h;

    /* renamed from: i */
    private boolean f9521i;

    /* renamed from: j */
    private View f9522j;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo8680a(4);
        mo8679a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8679a() {
        this.f9515c.mo9843b();
        this.f9513a.mo8280a(C3037b.f8913a, new C3045b() {
            /* renamed from: a */
            public final void mo8286a() {
                C3306e.this.f9515c.mo9845d();
            }

            /* renamed from: a */
            public final void mo8287a(EffectChannelResponse effectChannelResponse) {
                C3306e.this.mo8680a(0);
                if (effectChannelResponse != null) {
                    List<EffectCategoryResponse> categoryResponseList = effectChannelResponse.getCategoryResponseList();
                    if (C9414h.m18630a(categoryResponseList)) {
                        C3306e.this.f9515c.mo9844c();
                        return;
                    }
                    if (categoryResponseList.size() > 3) {
                        LayoutParams layoutParams = C3306e.this.f9516d.getLayoutParams();
                        layoutParams.height = (int) C9432q.m18687b(C3306e.this.getContext(), 216.0f);
                        C3306e.this.f9516d.setLayoutParams(layoutParams);
                    }
                    C3306e.this.f9518f = categoryResponseList;
                    C3306e.this.f9515c.mo9842a();
                    C3306e.this.f9515c.setVisibility(8);
                    C3338i iVar = C3306e.this.f9517e;
                    List<EffectCategoryResponse> list = C3306e.this.f9518f;
                    if (!C9414h.m18630a(list)) {
                        iVar.f9595c = list;
                        if (iVar.f9598f) {
                            iVar.mo8713a();
                            iVar.f9598f = false;
                        }
                        iVar.notifyDataSetChanged();
                    }
                    C3306e.this.mo8681a(((Boolean) C4525b.f12373ap.mo10345a()).booleanValue());
                    if (((Boolean) C4525b.f12373ap.mo10345a()).booleanValue()) {
                        C3306e.this.f9517e.mo8713a();
                    }
                    C3306e.this.f9514b.setOnCheckedChangeListener(null);
                    C3306e.this.f9514b.setChecked(((Boolean) C4525b.f12373ap.mo10345a()).booleanValue());
                    C3306e.this.f9514b.setOnCheckedChangeListener(C3306e.this);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo8680a(int i) {
        this.f9522j.setVisibility(i);
        this.f9516d.setVisibility(i);
        this.f9514b.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo8681a(boolean z) {
        int i;
        View view = this.f9520h;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6610k.m13986b().mo12667a(C6605h.GESTURE_MAGIC, (C6597a) new C6433c(false));
        C6610k.m13985a().mo12667a(C6605h.MORE, (C6597a) new C6433c(false));
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ais, null));
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        setCanceledOnTouchOutside(true);
        this.f9522j = findViewById(R.id.d_u);
        this.f9514b = (SwitchCompat) findViewById(R.id.akf);
        this.f9514b.setThumbResource(R.drawable.c5y);
        this.f9514b.setTrackResource(R.drawable.c61);
        this.f9515c = (LoadingStatusView) findViewById(R.id.csv);
        this.f9516d = (RecyclerView) findViewById(R.id.caf);
        this.f9516d.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f9516d.mo4798a((C1331h) new C3343l());
        this.f9517e = new C3338i(this.f9513a);
        this.f9517e.f9593a = new C3308f(this);
        this.f9516d.setAdapter(this.f9517e);
        this.f9520h = findViewById(R.id.bmv);
        this.f9515c.setOnClickListener(C3309g.f9525a);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aqx, null, false);
        inflate.setOnClickListener(new C3337h(this));
        this.f9515c.setBuilder(C4239a.m10480a(getContext()).mo9847a((int) C9432q.m18687b(getContext(), 56.0f)).mo9852c(inflate));
    }

    public void show(C0654k kVar, String str) {
        show();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C4525b.f12373ap.mo10346a(Boolean.valueOf(z));
        this.f9521i = z;
        if (z) {
            this.f9519g.lambda$put$1$DataCenter("cmd_sticker_tip", getContext().getString(R.string.ehn));
            this.f9517e.mo8713a();
        } else {
            this.f9519g.lambda$put$1$DataCenter("cmd_sticker_tip", "");
            C3338i iVar = this.f9517e;
            iVar.f9598f = false;
            if (iVar.f9597e) {
                iVar.f9597e = false;
                iVar.f9594b.clear();
                for (int i = 0; i < iVar.f9596d.size(); i++) {
                    C3302c cVar = (C3302c) iVar.f9596d.get(i);
                    if (cVar != null) {
                        cVar.f9503h = false;
                        if (cVar.f9501f) {
                            cVar.f9501f = false;
                            if (cVar.f9497b != null) {
                                cVar.f9497b.mo8685a(Boolean.valueOf(false), cVar.f9498c);
                            }
                            cVar.f9502g = cVar.f9498c;
                            cVar.f9498c = null;
                            cVar.notifyDataSetChanged();
                        }
                    }
                }
                iVar.notifyDataSetChanged();
            }
        }
        mo8681a(z);
    }

    public C3306e(Context context, C3277a aVar, DataCenter dataCenter) {
        super(context, R.style.z7);
        this.f9513a = aVar;
        this.f9519g = dataCenter;
        C4525b.f12370am.mo10346a(Boolean.valueOf(false));
    }
}
