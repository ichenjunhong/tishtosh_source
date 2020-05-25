package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;

public class NobleRankListBottomView extends RelativeLayout {

    /* renamed from: j */
    private static final String f22478j = "NobleRankListBottomView";

    /* renamed from: a */
    protected View f22479a;

    /* renamed from: b */
    protected ImageView f22480b;

    /* renamed from: c */
    protected TextView f22481c;

    /* renamed from: d */
    protected ImageView f22482d;

    /* renamed from: e */
    protected TextView f22483e;

    /* renamed from: f */
    protected TextView f22484f;

    /* renamed from: g */
    protected View f22485g;

    /* renamed from: h */
    protected DataCenter f22486h;

    /* renamed from: i */
    C8335g<C3009i> f22487i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14371a() {
        C9432q.m18691b((View) this, 0);
        C9432q.m18691b(this.f22479a, 8);
        C9432q.m18691b(this.f22485g, 0);
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f22486h = dataCenter;
    }

    public void setLoginObserver(C8335g<C3009i> gVar) {
        this.f22487i = gVar;
    }

    public NobleRankListBottomView(Context context) {
        super(context);
        m16304a(context);
    }

    /* renamed from: a */
    private void m16304a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.ao_, this, true);
        this.f22479a = findViewById(R.id.c87);
        this.f22480b = (ImageView) findViewById(R.id.c8c);
        this.f22481c = (TextView) findViewById(R.id.c8g);
        this.f22482d = (ImageView) findViewById(R.id.dm3);
        this.f22483e = (TextView) findViewById(R.id.dn1);
        this.f22484f = (TextView) findViewById(R.id.cl9);
        this.f22484f.setOnClickListener(new C8228a(context));
        this.f22485g = findViewById(R.id.bj_);
        this.f22485g.setOnClickListener(new C8229b(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14372a(C8219f fVar) {
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            this.f22485g.setVisibility(0);
            this.f22479a.setVisibility(8);
            this.f22484f.setVisibility(8);
        } else if (fVar == null) {
            setVisibility(8);
            this.f22485g.setVisibility(8);
            this.f22479a.setVisibility(8);
            this.f22484f.setVisibility(8);
        } else if (this.f22486h == null || !((Boolean) this.f22486h.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
            C9432q.m18691b((View) this, 0);
            C9432q.m18691b(this.f22479a, 0);
            C9432q.m18691b(this.f22485g, 8);
            C9432q.m18691b((View) this.f22484f, 0);
            if (!(fVar == null || fVar.f22442a == null)) {
                NobleLevelInfo nobleLevelInfo = fVar.f22442a.getNobleLevelInfo();
                if (nobleLevelInfo == null || nobleLevelInfo.getNobleLevel() <= 0) {
                    this.f22480b.setVisibility(8);
                    this.f22481c.setVisibility(0);
                    this.f22484f.setText(getContext().getString(R.string.ex1));
                    this.f22481c.setText("-");
                } else {
                    this.f22480b.setVisibility(0);
                    this.f22481c.setVisibility(8);
                    if (nobleLevelInfo.getNobleLevel() >= 4) {
                        this.f22484f.setText(getContext().getString(R.string.ex3));
                    } else {
                        this.f22484f.setText(getContext().getString(R.string.ex4));
                    }
                    C5213c.m11814a(this.f22480b, nobleLevelInfo.getNobleIcon());
                }
            }
            User user = fVar.f22442a;
            if (user != null) {
                C5213c.m11826b(this.f22482d, user.getAvatarThumb(), this.f22482d.getWidth(), this.f22482d.getHeight(), R.drawable.bt6);
                this.f22483e.setText(user.getNickName());
            }
        } else {
            C9432q.m18691b((View) this, 8);
            C9432q.m18691b(this.f22479a, 8);
            C9432q.m18691b((View) this.f22484f, 8);
            C9432q.m18691b(this.f22485g, 8);
        }
    }

    public NobleRankListBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16304a(context);
    }

    public NobleRankListBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16304a(context);
    }

    public NobleRankListBottomView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
