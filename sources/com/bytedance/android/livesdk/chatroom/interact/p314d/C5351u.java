package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5318k.C5319a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5318k.C5320b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5418bc;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.u */
public final class C5351u extends C5320b implements OnCheckedChangeListener {

    /* renamed from: e */
    private Switch f14254e;

    /* renamed from: f */
    private Switch f14255f;

    /* renamed from: g */
    private Switch f14256g;

    /* renamed from: h */
    private View f14257h;

    /* renamed from: c */
    public final float mo11150c() {
        return 216.0f;
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.elc);
    }

    /* renamed from: d */
    public final View mo11151d() {
        return this.f14146a.mo11095b();
    }

    /* renamed from: h */
    public final void mo11203h() {
        int i;
        if (this.f10828D) {
            C4526c<Integer> cVar = C4525b.f12444r;
            if (this.f14255f.isChecked()) {
                i = 2;
            } else {
                i = 1;
            }
            cVar.mo10346a(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo11200a() {
        if (this.f10828D) {
            if (!this.f14254e.isChecked()) {
                C4525b.f12444r.mo10346a(Integer.valueOf(0));
            } else if (!this.f14255f.isChecked()) {
                C4525b.f12444r.mo10346a(Integer.valueOf(1));
            } else {
                C4525b.f12444r.mo10346a(Integer.valueOf(2));
            }
        }
    }

    /* renamed from: a */
    public static C5351u m12157a(C5323b bVar) {
        C5351u uVar = new C5351u();
        uVar.f14148c = new C5418bc(uVar);
        uVar.f14146a = bVar;
        return uVar;
    }

    /* renamed from: b */
    public final void mo11202b(Throwable th) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
            this.f14255f.setOnCheckedChangeListener(null);
            this.f14255f.setChecked(!this.f14255f.isClickable());
            this.f14255f.setOnCheckedChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo11201a(Throwable th) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
            this.f14254e.setOnCheckedChangeListener(null);
            this.f14254e.setChecked(!this.f14254e.isClickable());
            this.f14254e.setOnCheckedChangeListener(null);
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        int id = compoundButton.getId();
        if (id == R.id.cvz) {
            View view = this.f14257h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (!z) {
                this.f14255f.setOnCheckedChangeListener(null);
                this.f14255f.setChecked(false);
                this.f14255f.setOnCheckedChangeListener(this);
            }
            ((C5319a) this.f14148c).mo11198a(z);
        } else if (id == R.id.cw0) {
            ((C5319a) this.f14148c).mo11199b(z);
        } else {
            if (id == R.id.cw4) {
                C4525b.f12306B.mo10346a(Boolean.valueOf(z));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.akf, viewGroup, false);
        this.f14254e = (Switch) inflate.findViewById(R.id.cvz);
        this.f14255f = (Switch) inflate.findViewById(R.id.cw0);
        this.f14256g = (Switch) inflate.findViewById(R.id.cw4);
        this.f14257h = inflate.findViewById(R.id.ago);
        int intValue = ((Integer) C4525b.f12444r.mo10345a()).intValue();
        if (intValue == 0) {
            this.f14254e.setChecked(false);
            this.f14257h.setVisibility(8);
        } else if (intValue == 1) {
            this.f14254e.setChecked(true);
        } else if (intValue == 2) {
            this.f14254e.setChecked(true);
            this.f14255f.setChecked(true);
        }
        this.f14256g.setChecked(((Boolean) C4525b.f12306B.mo10345a()).booleanValue());
        this.f14254e.setOnCheckedChangeListener(this);
        this.f14255f.setOnCheckedChangeListener(this);
        this.f14256g.setOnCheckedChangeListener(new C5352v(this));
        return inflate;
    }
}
