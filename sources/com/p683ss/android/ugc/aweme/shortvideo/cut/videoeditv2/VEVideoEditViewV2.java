package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42661d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2 */
public class VEVideoEditViewV2 extends VideoEditViewV2 {

    /* renamed from: L */
    private long f109014L;

    /* renamed from: M */
    private long f109015M;

    /* renamed from: N */
    private Map<String, Boolean> f109016N;

    /* renamed from: a */
    public final void mo87543a(C0794k<Float, Float> kVar, boolean z) {
    }

    /* renamed from: a */
    public final void mo87546a(boolean z, C0794k<Float, Float> kVar) {
    }

    /* renamed from: a */
    public final boolean mo87553a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list, boolean z) {
        return false;
    }

    /* renamed from: f */
    public final void mo87521f() {
    }

    /* renamed from: g */
    public final boolean mo87559g() {
        return false;
    }

    public int getEditState() {
        return this.f109067s;
    }

    public long getLeftSeekingValue() {
        return this.f109073y;
    }

    public long getMultiSeekTime() {
        return this.f109073y;
    }

    public long getRightSeekingValue() {
        return this.f109074z;
    }

    public long getSingleSeekTime() {
        return this.f109073y;
    }

    public C0794k<Float, Float> getSlideX() {
        return null;
    }

    public void setCanEdit(boolean z) {
    }

    /* renamed from: a */
    public final void mo87516a(List<VideoSegment> list) {
        this.f109067s = 1;
        this.f109061m.mo87619b(list);
        this.f109058j = C43155d.m94698c();
        this.f109072x = C43150b.m94679a(this.f109061m.mo87634l(), this.f109061m.mo87635m());
        this.f109017A = mo87703b(Math.min(this.f109072x, 60000));
        this.f109063o.f109078b = this.f109017A;
        this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
        this.f109073y = 0;
        this.f109074z = this.f109073y + this.f109017A;
        this.f109055g.setVisibility(8);
        this.f109054f.setVisibility(0);
        this.f109054f.mo4814b(0);
        C43152c cVar = this.f109064p;
        float f = this.f109063o.f109077a;
        C52711k.m112240b(list, "videoSegmentList");
        if (!C9414h.m18630a(list)) {
            cVar.f109084c.addAll(list);
            cVar.mo87726b(f, 0.0f);
        }
        this.f109061m.mo87605a(0.0f);
        if (this.f109024H.booleanValue()) {
            this.f109015M = 0;
            this.f109014L = this.f109017A;
        }
        mo87710k();
    }

    /* renamed from: a */
    public final void mo87517a(boolean z) {
        if (!this.f109024H.booleanValue() && z) {
            this.f109014L = this.f109017A;
            this.f109015M = this.f109073y;
            if (getRecyclerView().f108977N) {
                mo87711l();
            }
        }
        this.f109024H = Boolean.valueOf(z);
        if (z) {
            this.f109052d.setImageResource(R.drawable.cbi);
            this.f109051c.setImageResource(R.drawable.cbh);
            m94630n();
        } else {
            this.f109052d.setImageResource(R.drawable.cbc);
            this.f109051c.setImageResource(R.drawable.cbb);
            this.f109052d.setOnTouchListener(this);
            this.f109052d.setTag("startSlide");
            this.f109051c.setOnTouchListener(this);
            this.f109051c.setTag("endSlide");
            this.f109053e.setOnTouchListener(this);
            this.f109053e.setTag("curPoint");
        }
        setFocusOnMode(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87691a(Void voidR) {
        m94627a((VideoSegment) this.f109061m.mo87634l().get(this.f109068t), true);
        this.f109067s = 1;
        this.f109061m.mo87606a(1);
        this.f109069u.f107940a = (long) (((float) this.f109073y) * this.f109069u.f107943d);
        this.f109069u.f107941b = (long) (((float) this.f109074z) * this.f109069u.f107943d);
        this.f109061m.mo87611a(this.f109069u, this.f109068t);
        this.f109058j = C43155d.m94698c();
        this.f109072x = C43150b.m94679a(this.f109061m.mo87634l(), this.f109061m.mo87635m());
        this.f109017A = mo87703b(Math.min(this.f109072x, 60000));
        this.f109063o.f109078b = this.f109017A;
        this.f109073y = 0;
        this.f109074z = this.f109017A;
        this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
        if (!this.f109024H.booleanValue()) {
            this.f109055g.setVisibility(8);
            this.f109054f.setVisibility(0);
        }
        this.f109054f.mo4814b(0);
        this.f109064p.mo87721a(this.f109063o.f109077a);
        this.f109061m.mo87631i();
        if (this.f109069u != null) {
            this.f109069u.mo86966a();
        }
        mo87710k();
        this.f109026J.mo87679c();
    }

    /* renamed from: d */
    public final boolean mo87519d() {
        return this.f109024H.booleanValue();
    }

    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    private Map<String, Boolean> getSingleEditFirstMap() {
        if (this.f109016N == null) {
            this.f109016N = new HashMap(8);
        }
        return this.f109016N;
    }

    public C0794k<Long, Long> getPlayBoundary() {
        if (this.f109067s == 1) {
            return getMultiVideoPlayDur();
        }
        return getSingleVideoPlayDur();
    }

    /* renamed from: n */
    private void m94630n() {
        this.f109052d.setOnTouchListener(null);
        this.f109051c.setOnTouchListener(null);
        this.f109053e.setOnTouchListener(null);
    }

    public int getCurrentRotate() {
        if (this.f109067s == 2 || this.f109067s == 0) {
            return this.f109069u.f107942c;
        }
        return 0;
    }

    public float getCurrentSpeed() {
        if (this.f109067s == 2 || this.f109067s == 0) {
            return this.f109069u.f107943d;
        }
        return this.f109061m.mo87635m();
    }

    public long getMaxCutDuration() {
        if (this.f109067s == 1) {
            return m94629c(this.f109059k);
        }
        return (long) (((float) this.f109059k) * this.f109069u.f107943d);
    }

    public C0794k<Long, Long> getMultiVideoPlayDur() {
        return C0794k.m2265a(Long.valueOf(m94629c(this.f109073y)), Long.valueOf(m94629c(this.f109074z)));
    }

    public long getPlayingPosition() {
        return (long) ((((this.f109053e.getStartX() - this.f109052d.getStartX()) - ((float) C43155d.f109100c)) * this.f109063o.f109077a) + ((float) this.f109073y));
    }

    public float getSelectedTime() {
        long j;
        if (this.f109024H.booleanValue()) {
            j = this.f109023G;
        } else {
            j = this.f109017A;
            if (this.f109017A > this.f109059k) {
                j = this.f109059k;
            }
        }
        return ((float) j) / 1000.0f;
    }

    public C0794k<Long, Long> getSingleVideoPlayDur() {
        return C0794k.m2265a(Long.valueOf((long) (((float) this.f109073y) * this.f109069u.f107943d)), Long.valueOf((long) (((float) this.f109074z) * this.f109069u.f107943d)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo87696h() {
        super.mo87696h();
        this.f109062n.f107669c.observe(this.f109060l, new C43157f(this));
        this.f109062n.f107670d.observe(this.f109060l, new C43158g(this));
        this.f109062n.f107671e.observe(this.f109060l, new C43159h(this));
        this.f109062n.f107672f.observe(this.f109060l, new C43160i(this));
        this.f109062n.f107673g.observe(this.f109060l, new C43161j(this));
        this.f109062n.f107674h.observe(this.f109060l, new C43162k(this));
        this.f109062n.f107675i.observe(this.f109060l, new C43163l(this));
        this.f109014L = this.f109017A;
        this.f109015M = this.f109073y;
    }

    /* renamed from: a */
    public final void mo87538a() {
        if (this.f109061m != null) {
            if (this.f109067s == 0) {
                if (this.f109065q != null) {
                    this.f109065q.mo87723a(this.f109061m.mo87634l());
                }
            } else if (this.f109064p != null) {
                this.f109064p.mo87723a(this.f109061m.mo87634l());
            }
        }
    }

    /* renamed from: c */
    public final void mo87556c() {
        this.f109017A = mo87703b(Math.min(this.f109072x, 60000));
        this.f109063o.f109078b = this.f109017A;
        this.f109073y = 0;
        this.f109074z = this.f109073y + this.f109017A;
        if (this.f109024H.booleanValue()) {
            this.f109015M = 0;
            this.f109014L = this.f109017A;
        }
        this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
        this.f109054f.mo4814b(0);
        this.f109061m.mo87605a(this.f109066r);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f109061m.mo87634l()) {
            if (!videoSegment.f107911j) {
                arrayList.add(videoSegment);
            }
        }
        this.f109064p.mo87724a((List<? extends VideoSegment>) arrayList, this.f109063o.f109077a);
        mo87711l();
        mo87710k();
    }

    /* renamed from: e */
    public final void mo87520e() {
        if (this.f109024H.booleanValue()) {
            this.f109054f.setVisibility(8);
        } else {
            this.f109072x = C43150b.m94679a(this.f109061m.mo87634l(), this.f109061m.mo87635m());
            this.f109073y = this.f109015M;
            this.f109017A = this.f109014L;
            this.f109074z = this.f109073y + this.f109017A;
            this.f109063o.f109078b = this.f109017A;
            this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
            this.f109055g.setVisibility(8);
            this.f109054f.setVisibility(0);
            this.f109052d.setStartX((float) this.f109071w);
            this.f109051c.setStartX((float) ((this.f109057i - this.f109071w) - C43155d.f109100c));
            mo87698a(this.f109052d.getStartX() + ((float) C43155d.f109100c), false);
            mo87700a((int) this.f109052d.getStartX(), (int) this.f109051c.getStartX());
        }
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f109061m.mo87634l()) {
            if (!videoSegment.f107911j) {
                arrayList.add(videoSegment);
            }
        }
        this.f109064p.mo87724a((List<? extends VideoSegment>) arrayList, this.f109063o.f109077a);
        mo87708i();
        this.f109061m.mo87621c();
        if (this.f109024H.booleanValue()) {
            this.f109061m.mo87624d();
        }
    }

    public void setExtractFramesInRoughMode(boolean z) {
        this.f109020D = z;
    }

    public void setLoadThumbnailDirectly(boolean z) {
        this.f109070v = z;
    }

    public void setMaxVideoLength(long j) {
        this.f109059k = j;
    }

    public void setMinVideoLength(long j) {
        this.f109058j = j;
    }

    public VEVideoEditViewV2(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo87693c(Void voidR) {
        if (this.f109069u != null) {
            this.f109069u.f107942c += 90;
            if (this.f109069u.f107942c >= 360) {
                this.f109069u.f107942c = 0;
            }
            if (this.f109067s == 0) {
                this.f109061m.mo87611a(this.f109069u, 0);
            }
        }
    }

    /* renamed from: b */
    private void m94628b(boolean z) {
        if (z) {
            this.f109052d.setStartX((float) this.f109071w);
            double d = (double) this.f109023G;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double d3 = (double) this.f109017A;
            Double.isNaN(d3);
            double d4 = d2 / d3;
            double d5 = (double) this.f109066r;
            Double.isNaN(d5);
            this.f109025I = (float) (d4 * d5);
            this.f109051c.setStartX(this.f109052d.getStartX() + ((float) C43155d.f109100c) + this.f109025I);
        } else {
            this.f109052d.setStartX((float) this.f109071w);
            this.f109051c.setStartX((float) ((this.f109057i - this.f109071w) - C43155d.f109100c));
        }
        mo87700a((int) this.f109052d.getStartX(), (int) this.f109051c.getStartX());
    }

    /* renamed from: c */
    private long m94629c(long j) {
        long j2 = 0;
        if (this.f109061m.mo87634l() == null || this.f109061m.mo87634l().isEmpty()) {
            return 0;
        }
        for (VideoSegment videoSegment : this.f109061m.mo87634l()) {
            if (!videoSegment.f107911j) {
                float g = ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / videoSegment.mo86954h();
                float f = (float) j;
                if (f < g) {
                    return (long) (((float) j2) + (f * videoSegment.mo86954h()));
                }
                j2 += videoSegment.mo86953g() - videoSegment.mo86952f();
                j = (long) (f - g);
            }
        }
        return j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo87692b(Void voidR) {
        this.f109067s = 1;
        this.f109061m.mo87606a(1);
        this.f109058j = C43155d.m94698c();
        this.f109072x = C43150b.m94679a(this.f109061m.mo87634l(), this.f109061m.mo87635m());
        mo87701a(this.f109018B, this.f109019C, this.f109072x);
        this.f109063o.f109078b = this.f109017A;
        this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
        if (!this.f109024H.booleanValue()) {
            this.f109055g.setVisibility(8);
            this.f109054f.setVisibility(0);
        }
        this.f109061m.mo87630h();
        if (this.f109069u != null) {
            this.f109069u.mo86966a();
        }
        mo87710k();
        this.f109026J.mo87679c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87687a(float f) {
        switch (this.f109067s) {
            case 0:
                m94626a(0, f);
                mo87554b();
                break;
            case 1:
                this.f109061m.mo87622c(f);
                this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
                this.f109064p.mo87721a(this.f109063o.f109077a);
                this.f109054f.mo4814b(0);
                break;
            case 2:
                m94626a(this.f109068t, f);
                break;
        }
        mo87710k();
        this.f109061m.mo87616b(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87688a(long j) {
        if (!this.f109021E && !this.f109022F && j != -1 && j != 1) {
            mo87698a(this.f109052d.getStartX() + ((float) C43155d.f109100c) + (((float) (j - this.f109073y)) / this.f109063o.f109077a), false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87689a(C0794k kVar) {
        this.f109067s = 2;
        this.f109061m.mo87606a(2);
        this.f109068t = ((Integer) kVar.f2712b).intValue();
        this.f109058j = 500;
        VideoSegment videoSegment = (VideoSegment) this.f109061m.mo87634l().get(this.f109068t);
        if (this.f109069u == null) {
            this.f109069u = new C42661d(videoSegment);
        } else {
            this.f109069u.mo86967a(videoSegment);
        }
        this.f109018B = this.f109073y;
        this.f109019C = this.f109074z;
        this.f109072x = (long) (((float) videoSegment.f107904c) / videoSegment.mo86954h());
        if (this.f109024H.booleanValue()) {
            this.f109023G = videoSegment.mo86953g() - videoSegment.mo86952f();
            this.f109017A = videoSegment.mo86953g() - videoSegment.mo86952f();
            if (this.f109017A <= 1000) {
                this.f109017A = 1000;
                this.f109052d.setOnTouchListener(this);
                this.f109052d.setTag("startSlide");
                this.f109051c.setOnTouchListener(this);
                this.f109051c.setTag("endSlide");
                this.f109053e.setOnTouchListener(null);
                this.f109053e.setTag("curPoint");
                m94628b(true);
                this.f109063o.f109078b = this.f109017A;
                this.f109063o.mo87719a(videoSegment.f107904c, videoSegment.mo86954h());
                this.f109073y = (long) (((float) videoSegment.mo86952f()) / videoSegment.mo86954h());
                this.f109074z = this.f109073y + this.f109023G;
            } else {
                m94630n();
                m94628b(false);
                this.f109063o.f109078b = this.f109017A;
                this.f109063o.mo87719a(videoSegment.f107904c, videoSegment.mo86954h());
                this.f109073y = (long) (((float) videoSegment.mo86952f()) / videoSegment.mo86954h());
                this.f109074z = this.f109073y + this.f109017A;
            }
        } else {
            VideoSegment videoSegment2 = (VideoSegment) this.f109061m.mo87634l().get(this.f109068t);
            long g = (long) (((float) (videoSegment2.mo86953g() - videoSegment2.mo86952f())) / videoSegment2.mo86954h());
            Boolean bool = (Boolean) getSingleEditFirstMap().get(videoSegment2.mo86941a(false));
            if (bool == null || !bool.booleanValue()) {
                g = Math.min(g, 60000);
            }
            this.f109017A = mo87703b(g);
            this.f109063o.f109078b = this.f109017A;
            this.f109063o.mo87719a(videoSegment.f107904c, videoSegment.mo86954h());
            this.f109073y = (long) (((float) videoSegment.mo86952f()) / videoSegment.mo86954h());
            this.f109074z = this.f109073y + this.f109017A;
        }
        mo87554b();
        this.f109054f.setVisibility(8);
        this.f109055g.setVisibility(0);
        this.f109055g.mo4814b(0);
        C43152c cVar = this.f109065q;
        float f = this.f109063o.f109077a;
        C52711k.m112240b(videoSegment, "data");
        cVar.f109084c.clear();
        cVar.f109084c.add(videoSegment);
        cVar.mo87726b(f, 0.0f);
        mo87708i();
        this.f109061m.mo87609a(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87690a(VideoSegment videoSegment) {
        m94627a(videoSegment, false);
        this.f109067s = 1;
        this.f109061m.mo87606a(1);
        this.f109061m.mo87618b(videoSegment.mo86950e());
        this.f109058j = C43155d.m94698c();
        this.f109072x = C43150b.m94679a(this.f109061m.mo87634l(), this.f109061m.mo87635m());
        this.f109017A = mo87703b(Math.min(this.f109072x, 60000));
        this.f109063o.f109078b = this.f109017A;
        this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
        this.f109055g.setVisibility(8);
        if (!this.f109024H.booleanValue()) {
            this.f109054f.setVisibility(0);
        }
        mo87701a(0, this.f109017A, this.f109072x);
        if (this.f109024H.booleanValue()) {
            this.f109015M = 0;
            this.f109014L = this.f109017A;
        }
        this.f109054f.mo4814b(0);
        C43152c cVar = this.f109064p;
        float f = this.f109063o.f109077a;
        C52711k.m112240b(videoSegment, "videoSegment");
        if (!C9414h.m18630a(cVar.f109084c)) {
            cVar.f109084c.remove(videoSegment);
            cVar.mo87726b(f, 0.0f);
        }
        this.f109061m.mo87610a(videoSegment);
        if (this.f109069u != null) {
            this.f109069u.mo86966a();
        }
        mo87710k();
    }

    public VEVideoEditViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m94627a(VideoSegment videoSegment, boolean z) {
        if (!this.f109024H.booleanValue() && this.f109067s == 2) {
            if (z) {
                getSingleEditFirstMap().put(videoSegment.mo86941a(false), Boolean.valueOf(true));
            } else {
                getSingleEditFirstMap().remove(videoSegment.mo86941a(false));
            }
        }
    }

    /* renamed from: a */
    private void m94626a(int i, float f) {
        float f2 = this.f109069u.f107943d;
        this.f109069u.f107943d = f;
        VideoSegment videoSegment = (VideoSegment) this.f109061m.mo87634l().get(i);
        this.f109072x = (long) (((float) videoSegment.f107904c) / f);
        this.f109017A = mo87703b(C43164m.m94702a(this.f109017A, f2, f, this.f109058j));
        this.f109063o.f109078b = this.f109017A;
        this.f109063o.mo87719a(videoSegment.f107904c, this.f109069u.f107943d);
        this.f109065q.mo87722a(this.f109063o.f109077a, f);
        mo87709j();
        this.f109073y = (long) (((float) this.f109069u.f107940a) / f);
        this.f109074z = this.f109073y + this.f109017A;
    }

    public VEVideoEditViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
