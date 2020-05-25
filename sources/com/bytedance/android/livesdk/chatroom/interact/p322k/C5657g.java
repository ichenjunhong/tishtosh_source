package com.bytedance.android.livesdk.chatroom.interact.p322k;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3896j;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.C5277ak;
import com.bytedance.android.livesdk.chatroom.interact.C5282ap;
import com.bytedance.android.livesdk.chatroom.interact.C5282ap.C5283a;
import com.bytedance.android.livesdk.chatroom.interact.C5629j;
import com.bytedance.android.livesdk.chatroom.interact.data.p315a.C5354a;
import com.bytedance.android.livesdk.chatroom.interact.data.p315a.C5356c;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5697f;
import com.bytedance.android.livesdk.chatroom.p310f.C5217f;
import com.bytedance.android.livesdk.chatroom.p310f.C5217f.C5218a;
import com.bytedance.android.livesdk.chatroom.widget.C6682m;
import com.bytedance.android.livesdk.chatroom.widget.C6682m.C6687a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4550a;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4610t;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.android.livesdk.rank.C8208i;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1674ab;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.k.g */
public final class C5657g implements C5218a, C5283a, C5631a, C6687a {

    /* renamed from: a */
    public Context f14816a;

    /* renamed from: b */
    FrameLayout f14817b;

    /* renamed from: c */
    TextView f14818c;

    /* renamed from: d */
    List<C6682m> f14819d = new ArrayList();

    /* renamed from: e */
    int f14820e;

    /* renamed from: f */
    int f14821f;

    /* renamed from: g */
    public C5217f f14822g;

    /* renamed from: h */
    public Room f14823h;

    /* renamed from: i */
    public boolean f14824i;

    /* renamed from: j */
    public boolean f14825j;

    /* renamed from: k */
    public boolean f14826k = true;

    /* renamed from: l */
    public C5354a f14827l;

    /* renamed from: m */
    public DataCenter f14828m;

    /* renamed from: n */
    private FrameLayout f14829n;

    /* renamed from: o */
    private C6682m f14830o;

    /* renamed from: p */
    private C5630a f14831p;

    /* renamed from: q */
    private C8208i f14832q;

    /* renamed from: r */
    private int f14833r;

    /* renamed from: s */
    private int f14834s;

    /* renamed from: t */
    private int f14835t;

    /* renamed from: u */
    private C5282ap f14836u;

    /* renamed from: v */
    private boolean f14837v = false;

    /* renamed from: w */
    private OnLayoutChangeListener f14838w = new OnLayoutChangeListener() {
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 != i8 && C5657g.this.f14827l != null) {
                C5657g.this.mo11056a(C5657g.this.f14827l);
            }
        }
    };

    /* renamed from: x */
    private OnClickListener f14839x = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            C5657g.this.mo11543b();
            if (C5657g.this.mo11542a()) {
                if (C5657g.this.f14828m != null) {
                    C5657g.this.f14828m.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(0));
                }
                Room room = C5657g.this.f14823h;
                String str2 = "click_connection_banner";
                if (C5657g.this.f14825j) {
                    str = "anchor_connection";
                } else {
                    str = "guest_connection";
                }
                C4563ad.m10956a(room, str2, str, C5657g.this.f14825j);
            }
        }
    };

    /* renamed from: y */
    private OnClickListener f14840y = new OnClickListener() {
        public final void onClick(View view) {
            C5657g.this.mo11543b();
            if (C5657g.this.mo11542a()) {
                C4563ad.m10956a(C5657g.this.f14823h, "click_connection_banner", "guest_connection", false);
                if (!C5657g.this.f14825j && ((Integer) C4639e.m11122a().f12651b).intValue() == 0 && C4610t.m11071b(C5657g.this.f14816a, C4550a.LINK_MIC)) {
                    C8302f.m16453a((Activity) C5657g.this.f14816a).mo14484a(new C8288d() {
                        /* renamed from: b */
                        public final void mo9069b(String... strArr) {
                            C4204a.m10421a(C5657g.this.f14816a, (int) R.string.emh);
                        }

                        /* renamed from: a */
                        public final void mo9068a(String... strArr) {
                            if (C5657g.this.f14828m != null) {
                                C5657g.this.f14828m.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(1));
                            }
                        }
                    }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo11122a(long j, long j2) {
    }

    /* renamed from: a */
    public final void mo11074a(long j, String str, boolean z) {
    }

    /* renamed from: b */
    public final void mo11126b(List<C5696e> list) {
    }

    /* renamed from: a */
    public final boolean mo11542a() {
        if (!this.f14825j) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.f14816a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ek_)).mo14543c("interact").mo14539a(0).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                return false;
            } else if (TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.INTERACT)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo11541a(boolean z) {
        C4495a.m10823a().mo10301a((Object) new C5277ak(true));
        this.f14828m.lambda$put$1$DataCenter("cmd_interact_player_view_change", new C5277ak(true));
        this.f14826k = z;
        this.f14824i = true;
        this.f14818c = (TextView) LayoutInflater.from(this.f14817b.getContext()).inflate(R.layout.aq4, this.f14817b, false);
        this.f14818c.setVisibility(4);
        this.f14817b.addView(this.f14818c);
        this.f14831p.mo11515a((C5631a) this);
        this.f14836u.mo11121a();
        C5629j.m12530a("connection_request");
        m12583f();
        this.f14817b.addOnLayoutChangeListener(this.f14838w);
    }

    /* renamed from: e */
    private void m12582e() {
        for (C6682m removeView : this.f14819d) {
            this.f14817b.removeView(removeView);
        }
        this.f14819d.clear();
    }

    /* renamed from: b */
    public final void mo11543b() {
        if (!this.f14825j) {
            C5629j.m12531b("connection_request");
        }
    }

    /* renamed from: d */
    private void m12581d() {
        int size = this.f14819d.size();
        for (int i = 0; i < size; i++) {
            C6682m mVar = (C6682m) this.f14819d.get(i);
            LayoutParams layoutParams = (LayoutParams) mVar.getLayoutParams();
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = ((this.f14820e + this.f14834s) * i) + this.f14821f;
            layoutParams.rightMargin = this.f14835t;
            layoutParams.width = this.f14833r;
            layoutParams.height = this.f14834s;
            mVar.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    public final void mo11545c() {
        this.f14824i = false;
        this.f14817b.removeOnLayoutChangeListener(this.f14838w);
        if (this.f14832q != null && this.f14832q.isShowing()) {
            this.f14832q.dismiss();
        }
        this.f14836u.mo11124b();
        this.f14817b.removeAllViews();
        C4495a.m10823a().mo10301a((Object) new C5277ak(false));
        this.f14828m.lambda$put$1$DataCenter("cmd_interact_player_view_change", new C5277ak(false));
    }

    /* renamed from: f */
    private void m12583f() {
        if (!C4610t.m11070a(this.f14816a, C4550a.LINK_MIC)) {
            this.f14818c.setVisibility(4);
            return;
        }
        int c = this.f14831p.mo11524c();
        if (!this.f14825j) {
            int intValue = ((Integer) C4639e.m11122a().f12651b).intValue();
            if (intValue == 0) {
                this.f14818c.setText(R.string.gy6);
                this.f14818c.setOnClickListener(this.f14840y);
                this.f14818c.setVisibility(0);
            } else if (intValue == 2) {
                this.f14818c.setText(R.string.gy6);
                this.f14818c.setOnClickListener(this.f14840y);
                this.f14818c.setVisibility(8);
            }
            this.f14817b.post(new C5662h(this));
        }
        this.f14818c.setText(C3896j.m9851a(R.string.gzg, Integer.valueOf(c)));
        this.f14818c.setOnClickListener(this.f14839x);
        this.f14818c.setVisibility(0);
        this.f14817b.post(new C5662h(this));
    }

    /* renamed from: a */
    public final void mo11127a(int i) {
        m12583f();
    }

    /* renamed from: b */
    private void m12580b(C6682m mVar) {
        this.f14817b.addView(mVar);
        this.f14819d.add(mVar);
    }

    /* renamed from: b */
    public final void mo11544b(boolean z) {
        this.f14826k = z;
        m12582e();
        if (this.f14829n != null) {
            this.f14829n.removeAllViews();
        }
    }

    /* renamed from: a */
    public final void mo11539a(C6682m mVar) {
        if (mVar == this.f14830o) {
            this.f14830o = null;
        }
        this.f14817b.removeView(mVar);
        this.f14819d.remove(mVar);
        m12581d();
        m12583f();
    }

    /* renamed from: a */
    public final void mo11056a(C5354a aVar) {
        int i;
        int i2;
        if (this.f14826k && this.f14824i) {
            this.f14827l = aVar;
            m12582e();
            List<C5356c> list = aVar.f14265e;
            if (list == null || list.size() <= 0) {
                m12583f();
                return;
            }
            int width = this.f14817b.getWidth();
            int height = this.f14817b.getHeight();
            if (aVar.f14266f != null) {
                i = aVar.f14266f.f14269c;
            } else {
                i = 0;
            }
            if (aVar.f14266f != null) {
                i2 = aVar.f14266f.f14268b;
            } else {
                i2 = 0;
            }
            String str = C4638d.m11114a().f12661d;
            if (TextUtils.isEmpty(str)) {
                this.f14837v = true;
                return;
            }
            for (C5356c cVar : list) {
                if (cVar != null && !TextUtils.equals(cVar.mo11278a(), str)) {
                    C6682m a = m12579a(cVar.mo11278a(), false);
                    if (a != null) {
                        a.setLayoutParams(C5217f.m11830a(width, height, i, i2, cVar));
                        a.getPresenter().mo11208a(cVar.f14278i);
                        m12580b(a);
                    }
                }
            }
            m12583f();
        }
    }

    /* renamed from: b */
    public final boolean mo11057b(int i) {
        if (!this.f14826k || i != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo11092a(List<C5696e> list) {
        if (this.f14826k) {
            if (!TextUtils.isEmpty(C4638d.m11114a().f12661d)) {
                this.f14837v = false;
                if (this.f14827l != null) {
                    mo11056a(this.f14827l);
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C5696e eVar : list) {
            Iterator it = this.f14819d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6682m mVar = (C6682m) it.next();
                if (TextUtils.equals(eVar.mo11637a(), mVar.getPresenter().mo11213d())) {
                    arrayList.add(mVar);
                    this.f14819d.remove(mVar);
                    break;
                }
            }
        }
        arrayList.addAll(this.f14819d);
        this.f14819d = arrayList;
        m12581d();
        m12583f();
    }

    /* renamed from: a */
    private C6682m m12579a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C6682m mVar = new C6682m(this.f14816a, this.f14836u.mo11120a(0, str), this, this.f14828m);
        mVar.f18232d = !z;
        return mVar;
    }

    /* renamed from: a */
    private C6682m m12578a(long j, String str) {
        for (C6682m mVar : this.f14819d) {
            if (j > 0 && mVar.getPresenter().mo11212c() == j) {
                return mVar;
            }
            if (TextUtils.equals(mVar.getPresenter().mo11213d(), str)) {
                return mVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo11125b(long j, String str) {
        if (!this.f14826k && this.f14824i) {
            C6682m a = m12578a(j, str);
            if (a != null) {
                a.mo12814b();
                long id = this.f14823h.getOwner().getId();
                if (!(a.getPresenter() == null || a.getPresenter().mo11216g() == null || a.getPresenter().mo11212c() == id || TTLiveSDKContext.getHostService().mo10315h().mo14529b() == this.f14823h.getOwnerUserId())) {
                    C5696e g = a.getPresenter().mo11216g();
                    C4204a.m10423a(this.f14816a, this.f14816a.getString(R.string.ek1, new Object[]{g.f14953d.getNickName()}));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11540a(String str, SurfaceView surfaceView) {
        if (!this.f14826k && this.f14824i) {
            boolean z = false;
            if (TextUtils.equals(str, C4638d.m11114a().f12661d)) {
                surfaceView.setLayoutParams(new LayoutParams(-1, -1));
                this.f14829n.removeAllViews();
                this.f14829n.addView(surfaceView);
                this.f14829n.setVisibility(0);
                return;
            }
            C6682m a = m12578a(0, str);
            if (a != null) {
                mo11539a(a);
                z = true;
            }
            C6682m a2 = m12579a(str, true);
            if (a2 != null) {
                if (this.f14825j && !z) {
                    a2.mo12811a();
                } else if (!this.f14825j && TextUtils.equals(str, C4638d.m11114a().f12665h)) {
                    if (!z) {
                        a2.mo12811a();
                    }
                    this.f14830o = a2;
                }
                if (surfaceView != null) {
                    surfaceView.setLayoutParams(new LayoutParams(this.f14833r, this.f14834s));
                    surfaceView.setZOrderMediaOverlay(true);
                    a2.mo12813a(surfaceView);
                }
                m12580b(a2);
                mo11092a(this.f14831p.f14760h);
            }
        }
    }

    /* renamed from: a */
    public final void mo11123a(List<C5697f> list, long j) {
        if (this.f14824i) {
            if (this.f14832q != null && this.f14832q.isShowing()) {
                this.f14832q.dismiss();
            }
            this.f14832q = new C8208i(this.f14816a, list);
            this.f14832q.f22391a = j;
            this.f14832q.show();
        }
    }

    public C5657g(Room room, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2, C5630a aVar) {
        this.f14816a = frameLayout2.getContext();
        this.f14823h = room;
        this.f14825j = z;
        this.f14817b = frameLayout2;
        this.f14829n = frameLayout;
        this.f14831p = aVar;
        this.f14822g = new C5217f(this);
        this.f14836u = new C5282ap(room, aVar, this);
        Resources resources = this.f14816a.getResources();
        this.f14833r = resources.getDimensionPixelSize(R.dimen.q_);
        this.f14834s = resources.getDimensionPixelSize(R.dimen.q9);
        this.f14820e = (int) C9432q.m18687b(this.f14816a, 4.0f);
        this.f14821f = (int) C9432q.m18687b(this.f14816a, 52.0f);
        this.f14835t = (int) C9432q.m18687b(this.f14816a, 12.0f);
    }
}
