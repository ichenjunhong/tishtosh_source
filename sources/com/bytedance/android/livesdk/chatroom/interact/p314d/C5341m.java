package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5306g.C5307a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5306g.C5308b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5400al;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdkapi.C8737f;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.m */
public final class C5341m extends C5308b implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: e */
    private TextView f14214e;

    /* renamed from: f */
    private Switch f14215f;

    /* renamed from: g */
    private Switch f14216g;

    /* renamed from: h */
    private ViewGroup f14217h;

    /* renamed from: i */
    private C8737f f14218i;

    /* renamed from: c */
    public final float mo11150c() {
        return 216.0f;
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.elc);
    }

    /* renamed from: h */
    public final void mo11189h() {
        int i;
        if (this.f10828D) {
            C4526c<Integer> cVar = C4525b.f12444r;
            if (this.f14216g.isChecked()) {
                i = 2;
            } else {
                i = 1;
            }
            cVar.mo10346a(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo11184a() {
        if (this.f10828D) {
            if (!this.f14215f.isChecked()) {
                C4525b.f12444r.mo10346a(Integer.valueOf(0));
            } else if (!this.f14216g.isChecked()) {
                C4525b.f12444r.mo10346a(Integer.valueOf(1));
            } else {
                C4525b.f12444r.mo10346a(Integer.valueOf(2));
            }
        }
    }

    /* renamed from: d */
    public final View mo11151d() {
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new LayoutParams(C3922z.m9899a(32.0f), C3922z.m9899a(32.0f)));
        autoRTLImageView.setImageDrawable(C3922z.m9911c(R.drawable.bsi));
        autoRTLImageView.setOnClickListener(new C5342n(this));
        return autoRTLImageView;
    }

    /* renamed from: a */
    public static C5341m m12118a(C5323b bVar) {
        C5341m mVar = new C5341m();
        mVar.f14148c = new C5400al(mVar);
        mVar.f14146a = bVar;
        return mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11252a(View view) {
        C4525b.f12352aU.mo10346a(((C5307a) this.f14148c).mo11183e());
        this.f14146a.mo11093a();
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.dh7) {
            this.f14146a.mo11094a(C5343o.m12129a(this.f14146a, this, ((C5307a) this.f14148c).mo11182d()));
        }
    }

    /* renamed from: b */
    public final void mo11188b(Throwable th) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
            this.f14216g.setOnCheckedChangeListener(null);
            this.f14216g.setChecked(!this.f14216g.isClickable());
            this.f14216g.setOnCheckedChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo11185a(int i) {
        if (this.f10828D) {
            this.f14214e.setText(C4604n.m11050a(getContext().getString(R.string.edm), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public final void mo11187a(Throwable th) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
            this.f14215f.setOnCheckedChangeListener(null);
            this.f14215f.setChecked(!this.f14215f.isClickable());
            this.f14215f.setOnCheckedChangeListener(null);
        }
    }

    /* renamed from: a */
    public final void mo11186a(int i, int i2) {
        ((C5307a) this.f14148c).mo11177a(i, i2);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        if (compoundButton.getId() == R.id.cw3) {
            C4525b.f12350aS.mo10346a(Boolean.valueOf(z));
        } else if (compoundButton.getId() == R.id.cw1) {
            C4525b.f12351aT.mo10346a(Boolean.valueOf(z));
        } else if (compoundButton.getId() == R.id.cvz) {
            ViewGroup viewGroup = this.f14217h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            viewGroup.setVisibility(i);
            if (!z) {
                this.f14216g.setOnCheckedChangeListener(null);
                this.f14216g.setChecked(false);
                this.f14216g.setOnCheckedChangeListener(this);
            }
            ((C5307a) this.f14148c).mo11179a(z);
        } else if (compoundButton.getId() == R.id.cw0) {
            ((C5307a) this.f14148c).mo11180b(z);
        } else {
            if (compoundButton.getId() != R.id.cw2 && compoundButton.getId() == R.id.cw9) {
                C4525b.f12306B.mo10346a(Boolean.valueOf(z));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.akd, viewGroup, false);
        this.f14214e = (TextView) inflate.findViewById(R.id.dh7);
        inflate.findViewById(R.id.cw3);
        inflate.findViewById(R.id.cw1);
        this.f14217h = (ViewGroup) inflate.findViewById(R.id.ago);
        this.f14215f = (Switch) inflate.findViewById(R.id.cvz);
        this.f14216g = (Switch) inflate.findViewById(R.id.cw0);
        int intValue = ((Integer) C4525b.f12444r.mo10345a()).intValue();
        if (intValue == 0) {
            this.f14215f.setChecked(false);
            this.f14217h.setVisibility(8);
        } else if (intValue == 1) {
            this.f14215f.setChecked(true);
        } else if (intValue == 2) {
            this.f14215f.setChecked(true);
            this.f14216g.setChecked(true);
        }
        this.f14215f.setOnCheckedChangeListener(this);
        this.f14216g.setOnCheckedChangeListener(this);
        this.f14218i = TTLiveSDKContext.getHostService().mo10309b().mo15489b();
        this.f14214e.setOnClickListener(this);
        this.f14214e.setText(C4604n.m11050a(getContext().getString(R.string.edm), Integer.valueOf(((C5307a) this.f14148c).mo11181c())));
        ((C5307a) this.f14148c).mo11178a((String) C4525b.f12352aU.mo10345a());
        return inflate;
    }
}
