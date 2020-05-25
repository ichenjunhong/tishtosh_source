package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.chatroom.p325ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8138a;
import com.bytedance.android.livesdk.rank.p412e.C8152f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;

public class NobleUserRankListView extends UserRankListView implements C8138a {

    /* renamed from: n */
    private NobleRankListBottomView f22488n;

    /* renamed from: o */
    private long f22489o;

    /* renamed from: p */
    private boolean f22490p;

    public Fragment getFragment() {
        return this.f22523l;
    }

    /* renamed from: c */
    public final void mo14338c() {
        if (!this.f22490p) {
            this.f22488n.mo14371a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo14377d() {
        inflate(getContext(), R.layout.aoj, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo14379f() {
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
        inflate.setOnClickListener(new C8231d(this));
        return inflate;
    }

    /* renamed from: e */
    public final View mo14378e() {
        int i;
        this.f22512a = (RecyclerView) findViewById(R.id.c8f);
        this.f22512a.setLayoutManager(new SSLinearLayoutManager(getContext()));
        this.f22488n = (NobleRankListBottomView) findViewById(R.id.c88);
        NobleRankListBottomView nobleRankListBottomView = this.f22488n;
        if (this.f22521j == null || ((Boolean) this.f22521j.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
            i = R.drawable.bg8;
        } else {
            i = R.drawable.bj0;
        }
        nobleRankListBottomView.setBackgroundResource(i);
        this.f22488n.setDataCenter(this.f22521j);
        this.f22488n.setLoginObserver(this.f22522k);
        if (this.f22490p) {
            this.f22488n.setVisibility(8);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.bx5, null).setOnClickListener(new C8230c(this));
        LoadingEmptyView a = new LoadingEmptyView(getContext()).mo11844a(getContext().getString(R.string.ex0));
        a.setLayoutParams(new LayoutParams(-1, -1));
        this.f22514c = (LoadingStatusView) findViewById(R.id.csv);
        this.f22514c.setBuilder(C4239a.m10480a(getContext()).mo9852c(getErrorView()).mo9851b((View) a).mo9847a(getResources().getDimensionPixelSize(R.dimen.o4)));
        this.f22514c.mo9843b();
        return this;
    }

    public NobleUserRankListView(Context context) {
        super(context);
    }

    public void setFragment(Fragment fragment) {
        if (fragment != null) {
            this.f22523l = fragment;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14376a(View view) {
        if (this.f22516e != null) {
            this.f22516e.mo14341a();
        }
    }

    /* renamed from: a */
    public final void mo14335a(C1322a aVar) {
        this.f22512a.setAdapter(aVar);
        this.f22512a.setVisibility(0);
        this.f22514c.setVisibility(8);
        if (this.f22524m != null) {
            this.f22524m.mo14367a();
        }
    }

    public NobleUserRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo14336a(boolean z, C8219f fVar) {
        int i;
        NobleRankListBottomView nobleRankListBottomView = this.f22488n;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        nobleRankListBottomView.setVisibility(i);
        if (z) {
            this.f22488n.mo14372a(fVar);
        }
    }

    public NobleUserRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NobleUserRankListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo14375a(Fragment fragment, DataCenter dataCenter, int i, C8335g<C3009i> gVar) {
        this.f22523l = fragment;
        this.f22521j = dataCenter;
        this.f22522k = gVar;
        if (this.f22521j != null) {
            Room room = (Room) dataCenter.get("data_room");
            if (room != null) {
                this.f22518g = room.getId();
                this.f22489o = room.getOwner().getId();
            }
            this.f22490p = ((Boolean) dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        }
        if (getFragment() == null) {
            mo14334a();
            C3831a.m9707a("UserRankListView", "getFragment() == null");
        } else {
            C8152f fVar = new C8152f(this, this.f22518g, this.f22489o, this.f22490p);
            this.f22516e = fVar;
        }
        mo14378e();
    }
}
