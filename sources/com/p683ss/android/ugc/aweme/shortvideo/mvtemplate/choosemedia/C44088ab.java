package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab */
public final class C44088ab extends C44086a {

    /* renamed from: a */
    public String f111692a;

    /* renamed from: b */
    public boolean f111693b;

    /* renamed from: c */
    private TextView f111694c;

    public final void onStart() {
        super.onStart();
    }

    public final void onStop() {
        super.onStop();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String h = mo89998h();
        MvImageChooseAdapter mvImageChooseAdapter = new MvImageChooseAdapter(getContext(), 4, 1.0d, 1.5f, 0, 2);
        this.f111677d = mvImageChooseAdapter;
        this.f111677d.f111645m = this.f111689t;
        this.f111677d.f111639g = this.f111679j;
        this.f111677d.mo89966a(this.f111693b);
        this.f111677d.f111638f = new C44090ac(this);
        final WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, 4);
        wrapGridLayoutManager.f4526g = new C1302b() {
            /* renamed from: a */
            public final int mo4690a(int i) {
                if (C44088ab.this.f111677d.getItemViewType(i) == 1) {
                    return wrapGridLayoutManager.f4521b;
                }
                return 1;
            }
        };
        this.f111678e.setLayoutManager(wrapGridLayoutManager);
        this.f111678e.mo4798a((C1331h) new C23745a(4, (int) C9432q.m18687b(getContext(), 1.0f), false));
        this.f111677d.f111643k = this.f111678e;
        this.f111678e.setAdapter(this.f111677d);
        if (this.f111684o) {
            this.f111677d.mo89969c(this.f111687r);
        }
        if (this.f111677d != null) {
            this.f111677d.f111633a = this.f111683n;
            this.f111677d.f111634b = h;
        }
        if (!TextUtils.isEmpty(this.f111692a)) {
            this.f111681l.setVisibility(0);
            this.f111681l.setText(this.f111692a);
        } else {
            this.f111681l.setVisibility(8);
        }
        this.f111682m.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89999a(View view, MediaModel mediaModel) {
        if (mediaModel != null) {
            if (!C48016e.m103944b(mediaModel.f95383b)) {
                C10691a.m21545b(getContext(), getContext().getString(R.string.coz)).mo19066a();
                return;
            }
            if (this.f111677d.f111640h) {
                if (this.f111679j != null && (mediaModel instanceof MyMediaModel)) {
                    this.f111679j.mo89945a((MyMediaModel) mediaModel, view);
                }
            } else if (this.f111679j != null) {
                this.f111679j.mo89950b(mediaModel);
            }
        }
    }

    /* renamed from: a */
    public final void mo89992a(List<MyMediaModel> list, boolean z) {
        super.mo89992a(list, z);
        if (list != null) {
            this.f111682m.setVisibility(8);
            if (list.isEmpty()) {
                this.f111694c.setVisibility(0);
                this.f111694c.setText(R.string.chd);
            } else {
                this.f111694c.setVisibility(8);
            }
            if (z) {
                this.f111677d.mo89965a(list);
            } else {
                this.f111677d.mo89968b(list);
            }
            C47702b.f120193a.mo94984a("tool_performance_fetch_album_assets", C42438az.m93209a().mo86524a("duration", System.currentTimeMillis() - this.f111688s.longValue()).mo86523a("type", 2).mo86523a("count", list.size()).f107329a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.f111680k = layoutInflater.inflate(R.layout.rm, viewGroup, false);
        this.f111678e = (RecyclerView) this.f111680k.findViewById(R.id.arb);
        this.f111681l = (TextView) this.f111680k.findViewById(R.id.aox);
        this.f111694c = (TextView) this.f111680k.findViewById(R.id.br2);
        this.f111682m = (DmtLoadingLayout) this.f111680k.findViewById(R.id.ard);
        if (this.f111678e instanceof FastScrollRecyclerView) {
            int b = C39618d.f101152P.mo83104b(C40790a.EnableAlbumTimelineAndFullScreenPreview);
            FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) this.f111678e;
            if ((b == 2 || b == 3) && this.f111689t != 1) {
                z = true;
            }
            fastScrollRecyclerView.setFastScrollEnabled(z);
            ((FastScrollRecyclerView) this.f111678e).setFastScrollListener(this.f111690u);
        }
        return this.f111680k;
    }
}
