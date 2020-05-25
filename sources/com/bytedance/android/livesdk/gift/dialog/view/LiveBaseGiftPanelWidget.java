package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftTopWidget;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;

public class LiveBaseGiftPanelWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    final GiftViewModel f19678a;

    /* renamed from: b */
    View f19679b;

    /* renamed from: c */
    boolean f19680c;

    /* renamed from: d */
    boolean f19681d;

    /* renamed from: e */
    private View f19682e;

    /* renamed from: f */
    private View f19683f;

    /* renamed from: g */
    private View f19684g;

    public int getLayoutId() {
        return R.layout.bwc;
    }

    public void onUnload() {
        this.f19678a.mo13529a((C0184k) this);
        C4495a.m10823a().mo10301a((Object) new C5171aq(this.f19681d));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.a6c) {
            this.f19678a.mo13536a(new C7289a(1, null));
        }
    }

    public void onInit(Object[] objArr) {
        this.f19682e = findViewById(R.id.a6c);
        this.f19683f = findViewById(R.id.f0o);
        this.f19684g = findViewById(R.id.lp);
        this.f19679b = findViewById(R.id.e_h);
    }

    public void onLoad(Object[] objArr) {
        if (!((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
            WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            int i = 375 - point.y;
            if (this.f19683f.getLayoutParams() instanceof LayoutParams) {
                LayoutParams layoutParams = (LayoutParams) this.f19683f.getLayoutParams();
                layoutParams.height += i / 2;
                this.f19683f.setLayoutParams(layoutParams);
            }
            if (this.f19684g.getLayoutParams() instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) this.f19684g.getLayoutParams();
                layoutParams2.height += i / 2;
                this.f19684g.setLayoutParams(layoutParams2);
            }
        }
        enableSubWidgetManager();
        this.subWidgetManager.load(R.id.f0o, new LiveGiftTopWidget(this.f19678a));
        this.subWidgetManager.load(R.id.e_r, new LiveGiftListWidget(this.f19678a));
        this.subWidgetManager.load(R.id.lp, new LiveGiftBottomWidget(this.f19678a));
        this.subWidgetManager.load(R.id.e8v, new LiveGiftFirstChargeWidget(this.f19678a));
        this.f19682e.setOnClickListener(this);
        this.f19678a.mo13536a(new C7289a(2, null));
        this.f19678a.mo13536a(new C7289a(4, null));
        this.f19678a.mo13536a(new C7289a(3, null));
        this.f19678a.mo13530a((C0184k) this, (C0199s<C7290b>) new C7259a<C7290b>(this));
        this.f19679b.setOnClickListener(new C7260b(this));
    }
}
