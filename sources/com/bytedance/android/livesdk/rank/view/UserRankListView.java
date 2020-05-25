package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.chatroom.p325ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8138a;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8139b;
import com.bytedance.android.livesdk.rank.p412e.C8147a;
import com.bytedance.android.livesdk.rank.p412e.C8156j;
import com.bytedance.android.livesdk.rank.p412e.C8160n;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.Random;

public class UserRankListView extends RelativeLayout implements C8138a {

    /* renamed from: a */
    protected RecyclerView f22512a;

    /* renamed from: b */
    protected UserRankListAnchorView f22513b;

    /* renamed from: c */
    protected LoadingStatusView f22514c;

    /* renamed from: d */
    protected TextView f22515d;

    /* renamed from: e */
    protected C8139b f22516e;

    /* renamed from: f */
    protected boolean f22517f;

    /* renamed from: g */
    protected long f22518g;

    /* renamed from: h */
    protected long f22519h;

    /* renamed from: i */
    protected int f22520i;

    /* renamed from: j */
    protected DataCenter f22521j;

    /* renamed from: k */
    protected C8335g<C3009i> f22522k;

    /* renamed from: l */
    protected Fragment f22523l;

    /* renamed from: m */
    protected C8227a f22524m;

    /* renamed from: n */
    private String[] f22525n;

    /* renamed from: o */
    private Random f22526o;

    /* renamed from: p */
    private boolean f22527p = true;

    /* renamed from: com.bytedance.android.livesdk.rank.view.UserRankListView$a */
    public interface C8227a {
        /* renamed from: a */
        void mo14367a();
    }

    /* renamed from: g */
    public final void mo14391g() {
        mo14379f();
    }

    public Fragment getFragment() {
        return this.f22523l;
    }

    /* renamed from: h */
    public final void mo14392h() {
        mo14379f();
    }

    /* renamed from: c */
    public void mo14338c() {
        this.f22513b.mo14383a();
    }

    /* renamed from: i */
    private void m16321i() {
        if (this.f22524m != null) {
            this.f22524m.mo14367a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14377d() {
        inflate(getContext(), R.layout.aku, this);
    }

    /* renamed from: a */
    public final void mo14334a() {
        this.f22512a.setVisibility(8);
        this.f22514c.setVisibility(0);
        this.f22514c.mo9845d();
        m16321i();
    }

    /* renamed from: b */
    public final void mo14337b() {
        this.f22512a.setVisibility(8);
        this.f22514c.setVisibility(0);
        this.f22514c.mo9844c();
        m16321i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo14379f() {
        this.f22512a.setVisibility(8);
        this.f22514c.setVisibility(0);
        this.f22514c.mo9843b();
        if (this.f22516e != null) {
            this.f22516e.mo14341a();
        }
    }

    /* access modifiers changed from: protected */
    public View getErrorView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bx5, null);
        inflate.setOnClickListener(new C8245n(this));
        return inflate;
    }

    private View getEmptyView() {
        Context context;
        int i;
        int i2;
        if (this.f22517f) {
            context = getContext();
            i = R.string.efv;
        } else {
            context = getContext();
            i = R.string.efw;
        }
        String string = context.getString(i);
        if (22 == this.f22520i) {
            if (this.f22521j != null) {
                i2 = ((Integer) this.f22521j.get("data_member_count", Integer.valueOf(-1))).intValue();
            } else {
                i2 = -1;
            }
            if (i2 > 0) {
                string = C3922z.m9905a((int) R.string.hrt, C3890e.m9835c((long) i2));
            } else {
                string = getContext().getString(R.string.exi);
            }
        }
        LoadingEmptyView a = new LoadingEmptyView(getContext()).mo11844a(string);
        a.setLayoutParams(new LayoutParams(-1, -1));
        return a;
    }

    /* renamed from: e */
    public View mo14378e() {
        int i;
        this.f22512a = (RecyclerView) findViewById(R.id.c8f);
        this.f22512a.setLayoutManager(new SSLinearLayoutManager(getContext()));
        this.f22513b = (UserRankListAnchorView) findViewById(R.id.c88);
        UserRankListAnchorView userRankListAnchorView = this.f22513b;
        if (this.f22521j == null || ((Boolean) this.f22521j.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
            i = R.drawable.dzf;
        } else {
            i = R.drawable.bj0;
        }
        userRankListAnchorView.setBackgroundResource(i);
        this.f22513b.setOwnerId(this.f22519h);
        this.f22513b.setDataCenter(this.f22521j);
        this.f22513b.setLoginObserver(this.f22522k);
        LayoutInflater.from(getContext()).inflate(R.layout.bx5, null).setOnClickListener(new C8244m(this));
        this.f22514c = (LoadingStatusView) findViewById(R.id.csv);
        this.f22514c.setBuilder(C4239a.m10480a(getContext()).mo9852c(getErrorView()).mo9851b(getEmptyView()).mo9847a(getResources().getDimensionPixelSize(R.dimen.o4)));
        this.f22514c.mo9843b();
        this.f22515d = (TextView) findViewById(R.id.aur);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14390c(View view) {
        mo14392h();
    }

    public void setFetchCompleteListener(C8227a aVar) {
        this.f22524m = aVar;
    }

    public void setFragment(Fragment fragment) {
        if (fragment != null) {
            this.f22523l = fragment;
        }
    }

    public UserRankListView(Context context) {
        super(context);
        mo14377d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14389b(View view) {
        if (this.f22516e != null) {
            this.f22516e.mo14341a();
        }
    }

    /* renamed from: a */
    public void mo14335a(C1322a aVar) {
        if (getFragment() == null) {
            this.f22512a.setVisibility(8);
            this.f22514c.setVisibility(0);
            this.f22514c.mo9845d();
            C3831a.m9707a("UserRankListView", "getFragment() == null");
            return;
        }
        try {
            this.f22512a.setAdapter(aVar);
        } catch (Exception unused) {
            C3831a.m9707a("UserRankListView", "setAdapter error");
        }
        this.f22512a.setVisibility(0);
        this.f22514c.setVisibility(8);
        m16321i();
    }

    public UserRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo14377d();
    }

    /* renamed from: a */
    public void mo14336a(boolean z, C8219f fVar) {
        int i;
        UserRankListAnchorView userRankListAnchorView = this.f22513b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        userRankListAnchorView.setVisibility(i);
        if (z) {
            this.f22513b.mo14385a(fVar, this.f22520i);
        }
    }

    public UserRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo14377d();
    }

    public UserRankListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo14377d();
    }

    /* renamed from: a */
    public void mo14375a(Fragment fragment, DataCenter dataCenter, int i, C8335g<C3009i> gVar) {
        this.f22523l = fragment;
        this.f22521j = dataCenter;
        this.f22520i = i;
        this.f22522k = gVar;
        this.f22525n = C3922z.m9901a().getStringArray(R.array.bb);
        this.f22526o = new Random();
        if (this.f22521j != null) {
            this.f22517f = ((Boolean) dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            Room room = (Room) dataCenter.get("data_room");
            if (room != null) {
                this.f22518g = room.getId();
                this.f22519h = room.getOwnerUserId();
            }
            this.f22527p = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        }
        int i2 = this.f22520i;
        if (i2 == 7 || i2 == 9) {
            C8160n nVar = new C8160n(this, this.f22521j, this.f22518g, this.f22519h, this.f22517f, i2);
            this.f22516e = nVar;
        } else if (i2 == 17) {
            C8147a aVar = new C8147a(this, this.f22521j, this.f22518g, this.f22519h, this.f22517f);
            this.f22516e = aVar;
        } else if (i2 != 22) {
            C8147a aVar2 = new C8147a(this, this.f22521j, this.f22518g, this.f22519h, this.f22517f);
            this.f22516e = aVar2;
        } else {
            C8156j jVar = new C8156j(this, this.f22521j, this.f22518g, this.f22519h, this.f22517f);
            this.f22516e = jVar;
        }
        mo14378e();
    }
}
