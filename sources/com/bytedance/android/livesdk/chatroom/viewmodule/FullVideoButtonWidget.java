package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.C5177aw;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class FullVideoButtonWidget extends LiveWidget implements C0199s<KVData> {

    /* renamed from: a */
    long f16988a;

    /* renamed from: b */
    private boolean f16989b;

    /* renamed from: c */
    private boolean f16990c;

    /* renamed from: d */
    private C1690c f16991d;

    public int getLayoutId() {
        return R.layout.ann;
    }

    public void onDestroy() {
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f16988a = ((Long) this.dataCenter.get("data_room_id")).longValue();
        this.dataCenter.observe("data_keyboard_status", this).observe("cmd_touch_video", this).observe("cmd_video_orientation_changed", this, true);
        this.contentView.setOnClickListener(new C6452an(this));
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getData() != null && isViewValid()) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            boolean z = true;
            boolean z2 = false;
            if (hashCode != 1060055221) {
                if (hashCode != 1631824572) {
                    if (hashCode == 1787593718 && key.equals("cmd_touch_video")) {
                        c = 2;
                    }
                } else if (key.equals("cmd_video_orientation_changed")) {
                    c = 1;
                }
            } else if (key.equals("data_keyboard_status")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.f16990c = ((Boolean) kVData.getData()).booleanValue();
                    if (this.f16990c || !this.f16989b) {
                        z = false;
                    }
                    mo12379a(Boolean.valueOf(z), false);
                    return;
                case 1:
                    this.f16989b = ((C5177aw) kVData.getData()).f13869a;
                    if (!this.f16990c && this.f16989b) {
                        z2 = true;
                    }
                    mo12379a(Boolean.valueOf(z2), true);
                    return;
                case 2:
                    mo12379a((Boolean) kVData.getData(), false);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12379a(Boolean bool, boolean z) {
        int i;
        long j;
        if (isViewValid() && bool != null) {
            View view = this.contentView;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (bool.booleanValue()) {
                if (this.f16991d != null && !this.f16991d.isDisposed()) {
                    this.f16991d.dispose();
                }
                if (z) {
                    j = 10000;
                } else {
                    j = 3000;
                }
                this.f16991d = C2201v.m6592a(j, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C6453ao<Object>(this, z));
                return;
            }
            if (this.f16991d != null && !this.f16991d.isDisposed()) {
                this.f16991d.dispose();
            }
        }
    }
}
