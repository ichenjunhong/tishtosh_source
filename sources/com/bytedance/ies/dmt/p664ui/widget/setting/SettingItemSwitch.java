package com.bytedance.ies.dmt.p664ui.widget.setting;

import android.content.Context;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch */
public class SettingItemSwitch extends SettingItemBase implements Checkable {

    /* renamed from: a */
    protected Checkable f28768a;

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return R.layout.at6;
    }

    /* renamed from: a */
    public final boolean mo19319a() {
        return isChecked();
    }

    /* renamed from: b */
    public final boolean mo19320b() {
        return isChecked();
    }

    public boolean isChecked() {
        return this.f28768a.isChecked();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public SettingItemSwitch(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        this.f28768a.setChecked(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19302a(Context context) {
        int i;
        int i2;
        super.mo19302a(context);
        this.f28768a = (Checkable) this.f28756f.findViewById(R.id.cct);
        if (C10675b.m21498b(context)) {
            i = R.color.h9;
        } else {
            i = R.color.h_;
        }
        if (C10675b.m21498b(context)) {
            i2 = R.color.h7;
        } else {
            i2 = R.color.h8;
        }
        ((SwitchCompat) this.f28768a).setTrackTintList(C1124a.m3313a(getContext(), i));
        ((SwitchCompat) this.f28768a).setThumbTintList(C1124a.m3313a(getContext(), i2));
    }

    public SettingItemSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingItemSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
