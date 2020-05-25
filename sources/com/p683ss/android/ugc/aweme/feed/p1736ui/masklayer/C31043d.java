package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.adapter.C30081g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MaskLayerOption;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31040b.C31041a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31048h.C31049a;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.report.VideoReportEnhanceExperiment;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C41994c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.d */
public final class C31043d extends C31039a implements C29689c {

    /* renamed from: a */
    public final Context f81282a;

    /* renamed from: b */
    SharePackage f81283b;

    /* renamed from: c */
    Aweme f81284c;

    /* renamed from: d */
    String f81285d;

    /* renamed from: e */
    C31050i f81286e;

    /* renamed from: f */
    private C29686a f81287f;

    /* renamed from: g */
    private List<MaskLayerOption> f81288g = new ArrayList();

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemCount() {
        return this.f81288g.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo63832a() {
        if (this.f81287f == null) {
            this.f81287f = new C29686a();
        }
        this.f81287f.mo54800a(this);
        this.f81287f.mo44934a_(Integer.valueOf(2), this.f81284c.getAid(), Integer.valueOf(this.f81284c.isCollected() ^ true ? 1 : 0));
    }

    /* renamed from: a */
    public final void mo63831a(C31050i iVar) {
        this.f81286e = iVar;
    }

    public C31043d(Context context) {
        this.f81282a = context;
    }

    /* renamed from: a */
    private static MaskLayerOption m72640a(int i) {
        int i2 = R.string.bmk;
        int i3 = -1;
        if (i == 1) {
            i2 = R.string.d_i;
            if (C31041a.m72639a()) {
                i3 = R.drawable.asa;
            } else {
                i3 = R.drawable.as_;
            }
        } else if (i == 2) {
            i2 = R.string.hz;
            if (C31041a.m72639a()) {
                i3 = R.drawable.as5;
            } else {
                i3 = R.drawable.as4;
            }
        } else if (i == 3) {
            if (C31041a.m72639a()) {
                i2 = R.string.dc7;
            } else {
                i2 = R.string.che;
            }
            if (C31041a.m72639a()) {
                i3 = R.drawable.as9;
            } else {
                i3 = R.drawable.as8;
            }
        } else if (i == 5) {
            i2 = R.string.f9m;
            i3 = R.drawable.as3;
        } else if (i == 6) {
            i3 = R.drawable.d58;
        } else if (i == 7) {
            i3 = R.drawable.d59;
        } else {
            i2 = -1;
        }
        return new MaskLayerOption(i, i3, i2);
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        if (this.f81284c != null) {
            boolean z = !this.f81284c.isCollected();
            this.f81284c.setCollectStatus(z ? 1 : 0);
            C23324d.m57378a().updateCollectStatus(this.f81284c.getAid(), z);
            ReportFeedAdAction.f69464a.mo54011a(this.f81284c, 3, this.f81285d);
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C31049a aVar = C31048h.f81294c;
        C52711k.m112240b(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (C31041a.m72639a()) {
            i2 = R.layout.b40;
        } else {
            i2 = R.layout.b3z;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C31048h(inflate);
    }

    /* renamed from: a */
    public final void mo63830a(Aweme aweme, String str) {
        boolean z;
        this.f81284c = aweme;
        this.f81285d = str;
        this.f81283b = C41979aq.m91946a().parseAweme(C11010c.m22280a(), aweme, 0, str, "long_press_download");
        if (!(this.f81284c == null || this.f81284c.getAwemeType() == 13)) {
            if (this.f81284c.getAuthor() == null || C31190f.m72831a(this.f81284c) || !TextUtils.equals(this.f81285d, "homepage_hot")) {
                z = false;
            } else {
                z = true;
            }
            boolean k = C31190f.m72843k(this.f81284c);
            this.f81288g.clear();
            if (k) {
                this.f81288g.add(m72640a(1));
                C41994c.m91965a(true, this.f81285d, this.f81284c);
            } else {
                C41994c.m91965a(false, this.f81285d, this.f81284c);
            }
            this.f81288g.add(m72640a(2));
            if (z) {
                if (C31041a.m72639a()) {
                    this.f81288g.add(0, m72640a(3));
                } else {
                    this.f81288g.add(m72640a(3));
                }
            }
            if (!C31190f.m72831a(this.f81284c) && C10181b.m20511a().mo18172a(VideoReportEnhanceExperiment.class, true, "enable_enhance_report", 31744, false)) {
                if (this.f81284c == null || !this.f81284c.isAd()) {
                    this.f81288g.add(m72640a(7));
                }
            }
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        int i3;
        int i4;
        C31048h hVar = (C31048h) vVar;
        if (C31041a.m72639a()) {
            LayoutParams layoutParams = (LayoutParams) hVar.itemView.getLayoutParams();
            C31041a aVar = C31040b.f81279d;
            View view = hVar.itemView;
            C52711k.m112240b(view, "itemView");
            if (C31040b.f81276a == -1) {
                View findViewById = view.findViewById(R.id.cm_);
                if (findViewById != null) {
                    TextPaint paint = ((TextView) findViewById).getPaint();
                    int b = C23724k.m58224b(view.getContext());
                    int a = C23728o.m58241a(85.0d);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(R.string.dc7));
                    arrayList.add(Integer.valueOf(R.string.drn));
                    arrayList.add(Integer.valueOf(R.string.d_i));
                    Iterable<Number> iterable = arrayList;
                    Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (Number intValue : iterable) {
                        arrayList2.add(view.getContext().getString(intValue.intValue()));
                    }
                    Iterable<String> iterable2 = (List) arrayList2;
                    Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable2, 10));
                    for (String measureText : iterable2) {
                        arrayList3.add(Integer.valueOf((int) paint.measureText(measureText)));
                    }
                    Iterable<Number> iterable3 = (List) arrayList3;
                    Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable3, 10));
                    for (Number intValue2 : iterable3) {
                        arrayList4.add(Integer.valueOf(intValue2.intValue() + a));
                    }
                    Integer num = (Integer) C52575l.m112146i((List) arrayList4);
                    if (num != null) {
                        i4 = num.intValue();
                    } else {
                        i4 = 0;
                    }
                    double d = (double) i4;
                    double d2 = (double) b;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    if (d3 > 0.77d) {
                        d3 = 0.77d;
                    } else if (d3 < 0.66d) {
                        d3 = 0.66d;
                    }
                    Double.isNaN(d2);
                    C31040b.f81276a = (int) (d2 * d3);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            layoutParams.width = C31040b.f81276a;
            hVar.itemView.setLayoutParams(layoutParams);
        }
        MaskLayerOption maskLayerOption = (MaskLayerOption) this.f81288g.get(i);
        if (C31041a.m72639a()) {
            i2 = R.color.a8t;
        } else {
            i2 = R.color.v6;
        }
        hVar.f81296b.setTextColor(C23723j.m58216a(i2));
        if (2 != maskLayerOption.mType || !this.f81284c.isCollected()) {
            hVar.f81295a.setImageResource(maskLayerOption.mIconResId);
            hVar.f81296b.setText(maskLayerOption.mTextResId);
        } else {
            ImageView imageView = hVar.f81295a;
            if (C31041a.m72639a()) {
                i3 = R.drawable.as7;
            } else {
                i3 = R.drawable.as6;
            }
            imageView.setImageResource(i3);
            hVar.f81296b.setText(R.string.i0);
            maskLayerOption.mDoOrCancel = false;
        }
        hVar.itemView.setOnClickListener(new C31045e(this, maskLayerOption));
        hVar.itemView.setOnTouchListener(new C31046f(this));
        if (6 == maskLayerOption.mType) {
            C23089d a2 = C23089d.m56640a().mo47829a("enter_from", this.f81285d).mo47829a("group_id", this.f81284c.getAid()).mo47829a("author_id", this.f81284c.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f81284c))).mo47829a("enter_method", "long_press");
            if (this.f81284c.isAd()) {
                a2.mo47828a("group_id", (Object) this.f81284c.getAwemeRawAd().getGroupId());
            } else {
                a2.mo47829a("group_id", this.f81284c.getAid());
            }
            C26890h.m65012a("report_show", C23198ae.m56851a(a2.f61491a));
        }
    }

    /* renamed from: a */
    static void m72641a(View view, int i, float f) {
        view.animate().setDuration((long) i).scaleX(f).scaleY(f).setInterpolator(new C30081g()).start();
    }
}
