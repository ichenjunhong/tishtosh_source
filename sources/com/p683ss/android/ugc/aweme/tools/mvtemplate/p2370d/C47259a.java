package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p683ss.android.ugc.aweme.views.C48216n;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.a */
public final class C47259a extends C47262d {

    /* renamed from: a */
    public CircularProgressView f119330a;

    /* renamed from: b */
    public TextView f119331b;

    /* renamed from: c */
    View f119332c;

    /* renamed from: d */
    public MvThemeData f119333d;

    /* renamed from: e */
    public VideoViewComponent f119334e;

    /* renamed from: f */
    boolean f119335f;

    /* renamed from: g */
    private AnimatedImageView f119336g;

    /* renamed from: h */
    private DmtLoadingLayout f119337h;

    /* renamed from: i */
    private View f119338i;

    /* renamed from: j */
    private Video f119339j;

    /* renamed from: k */
    private int f119340k;

    /* renamed from: c */
    public final void mo94527c() {
        mo94530d(false);
    }

    /* renamed from: a */
    public final int mo94525a() {
        if (this.f119332c != null) {
            return this.f119332c.getMeasuredWidth();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo94529d() {
        if (this.f119334e != null && !this.f119334e.mo97922d() && this.f119339j != null) {
            this.f119334e.mo60204a(this.f119339j);
        }
    }

    /* renamed from: e */
    public final void mo94531e() {
        if (this.f119334e != null) {
            this.f119334e.mo60216ag();
            this.f119335f = false;
            if (this.f119336g != null) {
                this.f119336g.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo94526b() {
        if (this.f119334e == null || !m102596a(this.f119333d)) {
            if (this.f119337h != null) {
                this.f119337h.setVisibility(8);
            }
            return;
        }
        if (this.f119339j == null) {
            this.f119339j = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setH265(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f119333d.mo94478e());
            videoUrlModel.setUrlList(arrayList);
            videoUrlModel.setUrlKey(this.f119333d.f119234e);
            videoUrlModel.setUri(this.f119333d.f119234e);
            this.f119339j.setPlayAddr(videoUrlModel);
            this.f119339j.setSourceId(this.f119333d.mo94482i());
        }
        this.f119334e.mo60204a(this.f119339j);
        if (this.f119332c != null) {
            this.f119332c.postDelayed(new C47261c(this), 300);
        }
    }

    /* renamed from: c */
    public void mo94528c(boolean z) {
        int i;
        if (this.f119337h != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f119337h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            dmtLoadingLayout.setVisibility(i);
        }
    }

    /* renamed from: a */
    private static boolean m102596a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f119230a == null || TextUtils.isEmpty(mvThemeData.mo94478e()) || TextUtils.isEmpty(mvThemeData.f119234e) || TextUtils.isEmpty(mvThemeData.mo94482i())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo94530d(boolean z) {
        int i;
        int i2;
        int i3 = 8;
        if (this.f119338i != null) {
            View view = this.f119338i;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        if (this.f119330a != null) {
            CircularProgressView circularProgressView = this.f119330a;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            circularProgressView.setVisibility(i);
        }
        if (this.f119331b != null) {
            TextView textView = this.f119331b;
            if (z) {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f119334e = new VideoViewComponent();
        this.f119334e.mo60207a((C38871j) this);
        if (getArguments() != null) {
            this.f119340k = getArguments().getInt("position");
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        mo94528c(false);
        if (this.f119336g != null) {
            this.f119336g.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        this.f119335f = true;
        mo94528c(false);
        if (this.f119336g != null) {
            this.f119336g.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        if (this.f119336g != null) {
            this.f119336g.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static C47259a m102595a(MvThemeData mvThemeData, int i) {
        C47259a aVar = new C47259a();
        aVar.f119333d = mvThemeData;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        aVar.setArguments(bundle);
        return aVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f119332c == null) {
            this.f119332c = layoutInflater.inflate(R.layout.xl, viewGroup, false);
        }
        this.f119336g = (AnimatedImageView) this.f119332c.findViewById(R.id.b1m);
        this.f119337h = (DmtLoadingLayout) this.f119332c.findViewById(R.id.bhy);
        this.f119330a = (CircularProgressView) this.f119332c.findViewById(R.id.b25);
        this.f119338i = this.f119332c.findViewById(R.id.bhj);
        this.f119331b = (TextView) this.f119332c.findViewById(R.id.c62);
        this.f119330a.setVisibility(4);
        this.f119331b.setVisibility(4);
        this.f119330a.setColor(-1);
        this.f119330a.setThickness((int) C9432q.m18687b(this.f119332c.getContext(), 2.0f));
        if (VERSION.SDK_INT >= 21) {
            this.f119332c.setOutlineProvider(new C48216n((int) C9432q.m18687b(this.f119336g.getContext(), 8.0f)));
            this.f119332c.setClipToOutline(true);
        }
        this.f119334e.mo97917a((KeepSurfaceTextureView) this.f119332c.findViewById(R.id.dqi));
        this.f119332c.setTag(Integer.valueOf(this.f119340k));
        this.f119332c.post(new C47260b(this, viewGroup));
        if (this.f119333d != null && !TextUtils.isEmpty(this.f119333d.mo94480g())) {
            C50181a.m108293a((SimpleDraweeView) this.f119336g, this.f119333d.mo94480g(), 1, 1);
        }
        if (this.f119340k == 0 && !this.f119334e.mo97922d()) {
            mo94526b();
        }
        return this.f119332c;
    }
}
