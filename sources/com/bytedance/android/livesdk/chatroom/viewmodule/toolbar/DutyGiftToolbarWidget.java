package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.C0199s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;

public class DutyGiftToolbarWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener {

    /* renamed from: a */
    static final int f17936a = 2132216392;

    /* renamed from: b */
    private C6609j f17937b;

    /* renamed from: c */
    private ViewGroup f17938c;

    /* renamed from: d */
    private View f17939d;

    public int getLayoutId() {
        return R.layout.ape;
    }

    public void onUnload() {
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ab) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_stop_duty_gift", Boolean.valueOf(true));
        }
    }

    public void onInit(Object... objArr) {
        this.f17938c = (ViewGroup) this.contentView.findViewById(R.id.ac);
        this.contentView.findViewById(R.id.ab).setOnClickListener(this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (!(kVData == null || kVData.getKey() == null || kVData.getData() == null || !"tool_bar_button_load".equals(kVData.getKey()) || !((C6605h) kVData.getData()).equals(C6605h.GIFT))) {
            C6601a b = this.f17937b.mo12685b(C6605h.GIFT);
            if (b != null) {
                this.f17939d.setVisibility(0);
                this.f17939d.setOnClickListener(b);
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f17937b = (C6609j) C6610k.m13985a();
        this.dataCenter.observeForever("tool_bar_button_load", this).observeForever("tool_bar_button_unload", this);
        C6605h hVar = C6605h.GIFT;
        View inflate = LayoutInflater.from(this.context).inflate(hVar.getLayoutId(), this.f17938c, false);
        inflate.setTag(hVar);
        if (hVar.getLayoutId() == f17936a) {
            inflate.setBackgroundResource(hVar.getDrawableUnfolded());
        }
        inflate.setVisibility(8);
        C8064d.m16005b();
        C8064d.m9720b("ttlive_gift", "Gift icon status changed, visiable:false, reason:DutyGiftToolbarWidget#configToolbarViews");
        ViewParent parent = inflate.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(inflate);
        }
        this.f17938c.addView(inflate);
        this.f17937b.mo12683a(hVar, inflate);
        this.f17939d = inflate;
    }
}
