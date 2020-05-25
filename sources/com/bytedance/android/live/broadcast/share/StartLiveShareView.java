package com.bytedance.android.live.broadcast.share;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;

public class StartLiveShareView extends AbsStartLiveShareView {

    /* renamed from: e */
    ImageView f10322e;

    /* renamed from: f */
    ImageView f10323f;

    /* renamed from: g */
    ImageView f10324g;

    /* renamed from: c */
    private void m9452c() {
        this.f10322e.setImageResource(R.drawable.bz4);
        this.f10323f.setImageResource(R.drawable.c03);
        this.f10324g.setImageResource(R.drawable.c09);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8999a() {
        inflate(getContext(), R.layout.arc, this);
        this.f10322e = (ImageView) findViewById(R.id.ad8);
        this.f10323f = (ImageView) findViewById(R.id.dk1);
        this.f10324g = (ImageView) findViewById(R.id.dv0);
        this.f10322e.setOnClickListener(this);
        this.f10323f.setOnClickListener(this);
        this.f10324g.setOnClickListener(this);
        String[] strArr = (String[]) LiveSettingKeys.I18N_SHARE_CHANNEL_LIST.mo9431a();
        if (strArr != null) {
            for (String str : strArr) {
                if ("facebook".equals(str)) {
                    this.f10322e.setVisibility(0);
                } else if ("twitter".equals(str)) {
                    this.f10323f.setVisibility(0);
                } else if ("whatsapp".equals(str)) {
                    this.f10324g.setVisibility(0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9001b() {
        String str = (String) C4525b.f12445s.mo10345a();
        if (!TextUtils.isEmpty(str)) {
            if (C9431p.m18665a(str, "facebook")) {
                if (m9451a("facebook")) {
                    this.f10318a = "facebook";
                    this.f10322e.setImageResource(R.drawable.bz5);
                }
            } else if (C9431p.m18665a(str, "twitter")) {
                if (m9451a("twitter")) {
                    this.f10318a = "twitter";
                    this.f10323f.setImageResource(R.drawable.c04);
                }
            } else if (C9431p.m18665a(str, "whatsapp") && m9451a("whatsapp")) {
                this.f10318a = "whatsapp";
                this.f10324g.setImageResource(R.drawable.c0_);
            }
            this.f10321d.mo8899a(this.f10318a);
        }
    }

    public StartLiveShareView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m9451a(String str) {
        return this.f10320c.isShareAvailable(str, this.f10319b);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ad8) {
            if (!m9451a("facebook")) {
                C4204a.m10421a((Context) this.f10319b, (int) R.string.ea2);
            } else {
                m9452c();
                if (!"facebook".equals(this.f10318a)) {
                    this.f10318a = "facebook";
                    this.f10322e.setImageResource(R.drawable.bz5);
                } else {
                    this.f10322e.setImageResource(R.drawable.bz4);
                    this.f10318a = null;
                }
                C8068g.m16014a((Context) this.f10319b);
            }
        } else if (id == R.id.dk1) {
            if (!m9451a("twitter")) {
                C4204a.m10421a((Context) this.f10319b, (int) R.string.f2r);
            } else {
                m9452c();
                if (!"twitter".equals(this.f10318a)) {
                    this.f10318a = "twitter";
                    this.f10323f.setImageResource(R.drawable.c04);
                } else {
                    this.f10323f.setImageResource(R.drawable.c03);
                    this.f10318a = null;
                }
                C8068g.m16014a((Context) this.f10319b);
            }
        } else if (id == R.id.dv0) {
            if (!m9451a("whatsapp")) {
                C4204a.m10421a((Context) this.f10319b, (int) R.string.f40);
            } else {
                m9452c();
                if (!"whatsapp".equals(this.f10318a)) {
                    this.f10318a = "whatsapp";
                    this.f10324g.setImageResource(R.drawable.c0_);
                } else {
                    this.f10324g.setImageResource(R.drawable.c09);
                    this.f10318a = null;
                }
                C8068g.m16014a((Context) this.f10319b);
            }
        }
        C4525b.f12445s.mo10346a(this.f10318a);
        super.onClick(view);
    }

    public StartLiveShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StartLiveShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
