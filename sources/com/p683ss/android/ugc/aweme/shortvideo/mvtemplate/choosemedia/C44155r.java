package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22817e;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22796a;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22797b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44091ad.C44093b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44091ad.C44095d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r */
public final class C44155r extends C23526a implements C44093b {

    /* renamed from: a */
    public C44091ad f111847a;

    /* renamed from: b */
    public C22795c f111848b;

    /* renamed from: c */
    View f111849c;

    /* renamed from: d */
    public C44093b f111850d;

    /* renamed from: e */
    public boolean f111851e;

    /* renamed from: j */
    public boolean f111852j;

    /* renamed from: k */
    int f111853k;

    /* renamed from: l */
    int f111854l;

    /* renamed from: m */
    public boolean f111855m;

    /* renamed from: n */
    C22817e f111856n = new C44157s(this);

    /* renamed from: o */
    private RecyclerView f111857o;

    /* renamed from: p */
    private C22797b f111858p = new C22797b() {
        /* renamed from: a */
        public final void mo47279a(boolean z, int i, List<MediaModel> list) {
            List<MediaModel> b = C44155r.this.f111848b.mo47272b(i);
            ArrayList arrayList = new ArrayList();
            for (MediaModel mediaModel : b) {
                if (!(mediaModel == null || mediaModel.f95383b == null || TextUtils.isEmpty(mediaModel.f95383b))) {
                    String[] split = mediaModel.f95383b.split("\\.");
                    if (split.length <= 0 || !split[split.length - 1].equals("gif")) {
                        arrayList.add(MyMediaModel.m96697a(mediaModel));
                    }
                }
            }
            if (i == 4) {
                C44155r.this.f111852j = false;
            } else {
                C44155r.this.f111851e = false;
            }
            C44155r.this.f111847a.mo90001a(arrayList, i, false, false);
        }
    };

    /* renamed from: q */
    private C44095d f111859q = new C44158t(this);

    /* renamed from: r */
    private C22796a f111860r = new C44159u(this);

    public final void onDestroy() {
        super.onDestroy();
        if (this.f111848b != null) {
            this.f111848b.mo47275b(this.f111858p);
            this.f111848b.mo47274b(this.f111860r);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo90034a(boolean z) {
        int i;
        this.f111855m = z;
        int i2 = -1;
        if (z) {
            i = 0;
        } else {
            i = -1;
            i2 = 0;
        }
        int height = this.f111849c.getHeight();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{(float) i2, (float) i}).setDuration(500);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new C44161w(this, height));
        duration.start();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f111849c = layoutInflater.inflate(R.layout.a61, viewGroup, false);
        Bundle arguments = getArguments();
        int i = -1;
        if (arguments != null) {
            i = arguments.getInt("key_support_flag", -1);
        }
        this.f111857o = (RecyclerView) this.f111849c.findViewById(R.id.ar9);
        this.f111857o.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
        this.f111847a = new C44091ad(getActivity(), this);
        this.f111847a.f111703f = this.f111859q;
        this.f111848b = C22795c.m56156a();
        if (this.f111848b != null) {
            this.f111848b.mo47270a(this.f111858p);
            this.f111848b.mo47269a(this.f111860r);
        }
        this.f111857o.setAdapter(this.f111847a);
        this.f111849c.post(new C44160v(this));
        if (this.f111848b != null) {
            if (!((i & 1) == 0 && (i & 2) == 0)) {
                this.f111851e = true;
                this.f111853k = 0;
                this.f111848b.mo47268a(3, 300, this.f111853k, this.f111856n);
            }
            if ((i & 4) != 0) {
                this.f111852j = true;
                this.f111854l = 0;
                this.f111848b.mo47268a(4, 300, this.f111854l, this.f111856n);
            }
        }
        return this.f111849c;
    }

    /* renamed from: a */
    public final void mo89953a(C44092a aVar, boolean z, int i, boolean z2) {
        if (this.f111850d != null) {
            this.f111850d.mo89953a(aVar, z, i, z2);
        }
    }
}
