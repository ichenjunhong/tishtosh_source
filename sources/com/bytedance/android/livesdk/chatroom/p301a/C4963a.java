package com.bytedance.android.livesdk.chatroom.p301a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.a */
public final class C4963a extends Dialog implements OnCheckedChangeListener, OnSeekBarChangeListener {

    /* renamed from: a */
    private final C4964a f13305a;

    /* renamed from: b */
    private View f13306b;

    /* renamed from: c */
    private View f13307c;

    /* renamed from: d */
    private TextView f13308d;

    /* renamed from: e */
    private View f13309e;

    /* renamed from: f */
    private TextView f13310f;

    /* renamed from: g */
    private View f13311g;

    /* renamed from: h */
    private TextView f13312h;

    /* renamed from: i */
    private ToggleButton f13313i;

    /* renamed from: j */
    private SeekBar f13314j;

    /* renamed from: k */
    private SeekBar f13315k;

    /* renamed from: l */
    private TextView f13316l;

    /* renamed from: m */
    private TextView f13317m;

    /* renamed from: n */
    private TextView f13318n;

    /* renamed from: o */
    private View f13319o;

    /* renamed from: p */
    private OnClickListener f13320p = new C4968b(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a$a */
    public interface C4964a {
        /* renamed from: a */
        void mo10729a(boolean z);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: a */
    private void m11454a() {
        this.f13307c.setAlpha(1.0f);
        this.f13308d.setAlpha(1.0f);
        this.f13309e.setAlpha(1.0f);
        this.f13310f.setAlpha(1.0f);
        this.f13311g.setAlpha(1.0f);
        this.f13312h.setAlpha(1.0f);
        this.f13313i.setAlpha(1.0f);
        this.f13314j.setAlpha(1.0f);
        this.f13315k.setAlpha(1.0f);
        this.f13316l.setAlpha(1.0f);
        this.f13317m.setAlpha(1.0f);
        this.f13318n.setAlpha(1.0f);
        this.f13319o.setVisibility(8);
    }

    /* renamed from: b */
    private void m11455b() {
        this.f13307c.setAlpha(0.64f);
        this.f13308d.setAlpha(0.64f);
        this.f13309e.setAlpha(0.64f);
        this.f13310f.setAlpha(0.64f);
        this.f13311g.setAlpha(0.64f);
        this.f13312h.setAlpha(0.64f);
        this.f13313i.setAlpha(0.64f);
        this.f13314j.setAlpha(0.64f);
        this.f13315k.setAlpha(0.64f);
        this.f13316l.setAlpha(0.64f);
        this.f13317m.setAlpha(0.64f);
        this.f13318n.setAlpha(0.64f);
        this.f13319o.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10723a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view = this.f13307c;
        if (i == 0) {
            i2 = R.drawable.bs8;
        } else {
            i2 = R.drawable.bs9;
        }
        view.setBackgroundResource(i2);
        TextView textView = this.f13308d;
        Resources resources = getContext().getResources();
        int i7 = R.color.a9e;
        if (i == 0) {
            i3 = R.color.a9d;
        } else {
            i3 = R.color.a9e;
        }
        textView.setTextColor(resources.getColor(i3));
        View view2 = this.f13309e;
        if (i == 1) {
            i4 = R.drawable.bs5;
        } else {
            i4 = R.drawable.bs6;
        }
        view2.setBackgroundResource(i4);
        TextView textView2 = this.f13310f;
        Resources resources2 = getContext().getResources();
        if (i == 1) {
            i5 = R.color.a9d;
        } else {
            i5 = R.color.a9e;
        }
        textView2.setTextColor(resources2.getColor(i5));
        View view3 = this.f13311g;
        if (i == 2) {
            i6 = R.drawable.bs3;
        } else {
            i6 = R.drawable.bs4;
        }
        view3.setBackgroundResource(i6);
        TextView textView3 = this.f13312h;
        Resources resources3 = getContext().getResources();
        if (i == 2) {
            i7 = R.color.a9d;
        }
        textView3.setTextColor(resources3.getColor(i7));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f13306b = LayoutInflater.from(getContext()).inflate(R.layout.ahd, null);
            setContentView(this.f13306b);
            if (getWindow() != null) {
                getWindow().setLayout((int) C9432q.m18687b(getContext(), 256.0f), -1);
                getWindow().setGravity(8388613);
            }
            this.f13307c = this.f13306b.findViewById(R.id.ayf);
            this.f13308d = (TextView) this.f13306b.findViewById(R.id.d76);
            this.f13309e = this.f13306b.findViewById(R.id.aye);
            this.f13310f = (TextView) this.f13306b.findViewById(R.id.d75);
            this.f13311g = this.f13306b.findViewById(R.id.ayd);
            this.f13312h = (TextView) this.f13306b.findViewById(R.id.d74);
            this.f13314j = (SeekBar) this.f13306b.findViewById(R.id.es);
            this.f13315k = (SeekBar) this.f13306b.findViewById(R.id.cp3);
            this.f13314j.setOnSeekBarChangeListener(this);
            this.f13315k.setOnSeekBarChangeListener(this);
            this.f13318n = (TextView) this.f13306b.findViewById(R.id.d6p);
            this.f13317m = (TextView) this.f13306b.findViewById(R.id.dg3);
            this.f13316l = (TextView) this.f13306b.findViewById(R.id.ddu);
            this.f13319o = this.f13306b.findViewById(R.id.bmv);
            this.f13319o.setOnClickListener(C4973c.f13343a);
            this.f13313i = (ToggleButton) this.f13306b.findViewById(R.id.d1v);
            this.f13307c.setOnClickListener(this.f13320p);
            this.f13308d.setOnClickListener(this.f13320p);
            this.f13309e.setOnClickListener(this.f13320p);
            this.f13310f.setOnClickListener(this.f13320p);
            this.f13311g.setOnClickListener(this.f13320p);
            this.f13312h.setOnClickListener(this.f13320p);
            int i = 0;
            boolean z = true;
            if (!((Boolean) C4525b.f12329Y.mo10345a()).booleanValue() || ((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo9431a()).intValue() != 1) {
                z = false;
            }
            this.f13313i.setChecked(z);
            View view = this.f13319o;
            if (z) {
                i = 8;
            }
            view.setVisibility(i);
            this.f13315k.setProgress((int) (((Float) C4525b.f12327W.mo10345a()).floatValue() * 100.0f));
            this.f13314j.setProgress((int) (((Float) C4525b.f12326V.mo10345a()).floatValue() * 100.0f));
            mo10723a(((Integer) C4525b.f12328X.mo10345a()).intValue());
            this.f13313i.setOnCheckedChangeListener(this);
            if (z) {
                m11454a();
            } else {
                m11455b();
            }
        } catch (Exception e) {
            C8064d.m16005b();
            C8064d.m9718a(6, e.getStackTrace());
        }
    }

    public C4963a(Context context, C4964a aVar) {
        super(context, R.style.yb);
        this.f13305a = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.d1v) {
            if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo9431a()).intValue() != 1) {
                this.f13313i.setChecked(false);
                C4575an.m10981a((int) R.string.eed);
                return;
            }
            if (z) {
                m11454a();
            } else {
                m11455b();
            }
            C4525b.f12329Y.mo10346a(Boolean.valueOf(z));
            this.f13305a.mo10729a(z);
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() == R.id.es) {
            C4525b.f12326V.mo10346a(Float.valueOf(((float) i) / 100.0f));
            return;
        }
        if (seekBar.getId() == R.id.cp3) {
            C4525b.f12327W.mo10346a(Float.valueOf(((float) i) / 100.0f));
        }
    }
}
