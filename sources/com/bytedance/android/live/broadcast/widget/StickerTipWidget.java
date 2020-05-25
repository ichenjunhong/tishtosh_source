package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class StickerTipWidget extends LiveRecyclableWidget implements C0199s<KVData> {

    /* renamed from: a */
    private C1690c f10538a;

    public int getLayoutId() {
        return R.layout.ang;
    }

    public void onInit(Object... objArr) {
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        if (this.f10538a != null && !this.f10538a.isDisposed()) {
            this.f10538a.dispose();
        }
    }

    public void onLoad(Object... objArr) {
        this.dataCenter.observe("cmd_sticker_tip", this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == 1351936788 && key.equals("cmd_sticker_tip")) {
                c = 0;
            }
            if (c == 0) {
                if (this.f10538a != null && !this.f10538a.isDisposed()) {
                    this.f10538a.dispose();
                }
                if (C9431p.m18664a((String) kVData.getData())) {
                    this.contentView.setVisibility(4);
                    return;
                }
                this.contentView.setVisibility(0);
                ((TextView) this.contentView).setText((CharSequence) kVData.getData());
                this.f10538a = C2201v.m6592a(3, TimeUnit.SECONDS).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3754al<Object>(this), C3755am.f10623a);
            }
        }
    }
}
