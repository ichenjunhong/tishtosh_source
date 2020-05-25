package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44028a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44081b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a */
public abstract class C44086a extends C23526a {

    /* renamed from: d */
    protected MvImageChooseAdapter f111677d;

    /* renamed from: e */
    protected RecyclerView f111678e;

    /* renamed from: j */
    public C44082c f111679j;

    /* renamed from: k */
    protected View f111680k;

    /* renamed from: l */
    protected TextView f111681l;

    /* renamed from: m */
    protected DmtLoadingLayout f111682m;

    /* renamed from: n */
    protected int f111683n = C44300e.f112162b.mo90190a();

    /* renamed from: o */
    protected boolean f111684o;

    /* renamed from: p */
    public boolean f111685p;

    /* renamed from: q */
    public boolean f111686q;

    /* renamed from: r */
    protected List<String> f111687r = new ArrayList();

    /* renamed from: s */
    protected Long f111688s = Long.valueOf(0);

    /* renamed from: t */
    public int f111689t = -1;

    /* renamed from: u */
    public C44028a f111690u;

    /* renamed from: e */
    public void mo69794e() {
        if (this.f111678e instanceof FastScrollRecyclerView) {
            ((FastScrollRecyclerView) this.f111678e).mo49162o();
        }
    }

    /* renamed from: g */
    public final void mo89997g() {
        if (this.f111677d != null) {
            this.f111677d.mo89963a();
        }
    }

    /* renamed from: h */
    public final String mo89998h() {
        String a = C44300e.f112162b.mo90191a(this.f111680k.getContext());
        if (this.f111685p || this.f111686q) {
            return C2240a.m6772a(getString(R.string.d5p), new Object[]{Integer.valueOf(this.f111683n)});
        } else if (C44300e.m97041c()) {
            return C44300e.f112162b.mo90191a(this.f111680k.getContext());
        } else {
            if (C43036f.m94312e()) {
                return C43036f.f108637b.mo87415a(this.f111680k.getContext());
            }
            return a;
        }
    }

    /* renamed from: b */
    public final void mo89994b(int i) {
        this.f111683n = i;
        if (this.f111677d != null) {
            this.f111677d.f111633a = i;
        }
    }

    /* renamed from: a */
    public final void mo89991a(List<String> list) {
        this.f111684o = true;
        this.f111687r.addAll(list);
    }

    /* renamed from: c */
    public final void mo89995c(int i) {
        if (this.f111678e != null) {
            C1332i layoutManager = this.f111678e.getLayoutManager();
            if (layoutManager != null && layoutManager.mo4736c(i) == null) {
                layoutManager.mo4741e(i);
            }
        }
    }

    /* renamed from: d */
    public final View mo89996d(int i) {
        if (this.f111678e == null) {
            return null;
        }
        C1332i layoutManager = this.f111678e.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.mo4736c(i);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo89993b(MyMediaModel myMediaModel) {
        if (this.f111677d == null) {
            return -1;
        }
        MvImageChooseAdapter mvImageChooseAdapter = this.f111677d;
        for (int i = 0; i < mvImageChooseAdapter.f111644l.size(); i++) {
            C44147k kVar = (C44147k) mvImageChooseAdapter.f111644l.get(i);
            if ((kVar instanceof MyMediaModel) && ((MyMediaModel) kVar).f95382a == myMediaModel.f95382a) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo89989a(MyMediaModel myMediaModel) {
        if (this.f111677d != null) {
            MvImageChooseAdapter mvImageChooseAdapter = this.f111677d;
            if (myMediaModel.f111662r >= 0) {
                int i = myMediaModel.f111662r;
                myMediaModel.f111662r = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < mvImageChooseAdapter.f111636d.size(); i3++) {
                    MyMediaModel myMediaModel2 = (MyMediaModel) mvImageChooseAdapter.f111636d.get(i3);
                    if (myMediaModel2.f95382a == myMediaModel.f95382a) {
                        i2 = i3;
                    }
                    if (myMediaModel2.f111662r > i) {
                        myMediaModel2.f111662r--;
                    }
                }
                mvImageChooseAdapter.f111637e.remove(myMediaModel.f95383b);
                if (i2 >= 0) {
                    mvImageChooseAdapter.f111636d.remove(i2);
                }
                mvImageChooseAdapter.notifyItemChanged(myMediaModel.f111661q);
                mvImageChooseAdapter.mo89967b();
                if (mvImageChooseAdapter.f111639g != null) {
                    mvImageChooseAdapter.f111639g.mo89946a(mvImageChooseAdapter.f111636d, C44081b.PREVIEW);
                    mvImageChooseAdapter.f111639g.mo89944a(myMediaModel, false);
                }
            } else if (!C48016e.m103944b(myMediaModel.f95383b)) {
                if (myMediaModel.mo76676c()) {
                    C10691a.m21545b(mvImageChooseAdapter.f111635c, mvImageChooseAdapter.f111635c.getString(R.string.bex)).mo19066a();
                    MvImageChooseAdapter.m96676a((MediaModel) myMediaModel, false);
                } else {
                    C10691a.m21545b(mvImageChooseAdapter.f111635c, mvImageChooseAdapter.f111635c.getString(R.string.coz)).mo19066a();
                }
            } else if (mvImageChooseAdapter.f111639g.mo89947a()) {
                C10691a.m21545b(mvImageChooseAdapter.f111635c, mvImageChooseAdapter.f111634b).mo19066a();
                if (myMediaModel.mo76676c()) {
                    MvImageChooseAdapter.m96676a((MediaModel) myMediaModel, false);
                }
            } else if (mvImageChooseAdapter.f111639g.mo89948a((MediaModel) myMediaModel) && mvImageChooseAdapter.f111639g.mo89949a(myMediaModel)) {
                mvImageChooseAdapter.mo89964a((MediaModel) myMediaModel, (C44080a) new C44104am(mvImageChooseAdapter, myMediaModel));
            }
        }
    }

    /* renamed from: a */
    public final void mo89988a(int i, int i2) {
        if (this.f111677d != null) {
            this.f111677d.mo89967b();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f111688s = Long.valueOf(System.currentTimeMillis());
        super.onViewCreated(view, bundle);
    }

    /* renamed from: a */
    public final void mo89990a(MyMediaModel myMediaModel, boolean z) {
        if (this.f111677d != null) {
            if (z) {
                MvImageChooseAdapter mvImageChooseAdapter = this.f111677d;
                if (myMediaModel != null) {
                    if (!mvImageChooseAdapter.f111636d.contains(myMediaModel)) {
                        mvImageChooseAdapter.f111636d.add(myMediaModel);
                    }
                    mvImageChooseAdapter.f111637e.put(myMediaModel.f95383b, myMediaModel);
                    mvImageChooseAdapter.mo89967b();
                }
                return;
            }
            MvImageChooseAdapter mvImageChooseAdapter2 = this.f111677d;
            if (myMediaModel != null) {
                mvImageChooseAdapter2.f111637e.remove(myMediaModel.f95383b);
                mvImageChooseAdapter2.f111636d.remove(myMediaModel);
                mvImageChooseAdapter2.mo89967b();
            }
        }
    }

    /* renamed from: a */
    public void mo89992a(List<MyMediaModel> list, boolean z) {
        if (z) {
            HashMap<String, MyMediaModel> hashMap = null;
            if (this.f111677d != null) {
                hashMap = this.f111677d.f111637e;
            }
            if (hashMap != null && hashMap.size() != 0) {
                for (MyMediaModel myMediaModel : list) {
                    if (myMediaModel != null) {
                        MyMediaModel myMediaModel2 = (MyMediaModel) hashMap.get(myMediaModel.f95383b);
                        if (myMediaModel2 != null) {
                            myMediaModel.f111662r = myMediaModel2.f111662r;
                        }
                    }
                }
            }
        }
    }
}
