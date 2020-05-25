package com.bytedance.android.livesdk.kickout.p391c;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.kickout.C7715a;
import com.bytedance.android.livesdk.kickout.C7722b;
import com.bytedance.android.livesdk.kickout.p389a.C7720a;
import com.bytedance.android.livesdk.kickout.p389a.C7721b;
import com.bytedance.android.livesdk.kickout.p390b.C7723a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p328d.C6737a;
import com.bytedance.android.livesdk.p328d.C6742f;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.c.b */
public final class C7726b extends C1352v implements C6742f, C7722b {

    /* renamed from: a */
    VHeadView f21242a;

    /* renamed from: b */
    TextView f21243b;

    /* renamed from: c */
    View f21244c;

    /* renamed from: d */
    TextView f21245d;

    /* renamed from: e */
    public HSImageView f21246e;

    /* renamed from: f */
    Context f21247f;

    /* renamed from: g */
    public List<User> f21248g = new ArrayList();

    /* renamed from: h */
    public String f21249h;

    /* renamed from: i */
    C7715a f21250i;

    /* renamed from: j */
    C6737a f21251j;

    /* renamed from: k */
    User f21252k;

    /* renamed from: l */
    long f21253l;

    /* renamed from: m */
    private long f21254m;

    /* renamed from: a */
    public final void mo14064a() {
    }

    /* renamed from: a */
    public final void mo14065a(C7723a aVar, Exception exc) {
    }

    /* renamed from: b */
    public final void mo14067b() {
    }

    /* renamed from: b */
    public final void mo12006b(boolean z, Exception exc) {
    }

    /* renamed from: c */
    public final Map<String, String> mo14071c() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f21254m));
        hashMap.put("room_id", String.valueOf(this.f21253l));
        return hashMap;
    }

    /* renamed from: a */
    static String m15749a(User user) {
        if (user == null) {
            return null;
        }
        if (((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
            return user.displayId;
        }
        if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
            return user.displayId;
        }
        return user.getNickName();
    }

    /* renamed from: b */
    public final void mo14068b(boolean z) {
        if (!z) {
            this.f21243b.setVisibility(0);
            this.f21244c.setVisibility(8);
            C4495a.m10823a().mo10301a((Object) new C7721b(false, this.f21252k.getId()));
        }
    }

    /* renamed from: a */
    public final void mo12005a(boolean z) {
        if (!z) {
            C4495a.m10823a().mo10301a((Object) new C7720a(false, this.f21252k.getId()));
            this.f21243b.setVisibility(0);
            this.f21244c.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo14066a(boolean z, Exception exc) {
        if (!z) {
            this.f21243b.setVisibility(0);
            this.f21244c.setVisibility(8);
            C4602l.m11046a(this.f21247f, exc);
        }
    }

    public C7726b(Context context, View view, String str, long j, long j2) {
        super(view);
        this.f21242a = (VHeadView) view.findViewById(R.id.ao6);
        this.f21243b = (TextView) view.findViewById(R.id.qa);
        this.f21244c = view.findViewById(R.id.qg);
        this.f21245d = (TextView) view.findViewById(R.id.dn1);
        this.f21246e = (HSImageView) view.findViewById(R.id.dme);
        this.f21247f = context;
        this.f21249h = str;
        this.f21253l = j;
        this.f21254m = j2;
        this.f21250i = new C7715a();
        this.f21250i.f21222a = this;
        this.f21251j = new C6737a();
        this.f21251j.f18413a = this;
    }
}
