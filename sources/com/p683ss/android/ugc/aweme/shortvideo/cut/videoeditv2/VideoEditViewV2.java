package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42630g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42661d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.C43135a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43457b;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.List;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VideoEditViewV2 */
public abstract class VideoEditViewV2 extends AbstractVideoEditView implements OnTouchListener {

    /* renamed from: A */
    protected long f109017A;

    /* renamed from: B */
    protected long f109018B;

    /* renamed from: C */
    protected long f109019C;

    /* renamed from: D */
    protected boolean f109020D;

    /* renamed from: E */
    protected boolean f109021E;

    /* renamed from: F */
    protected boolean f109022F;

    /* renamed from: G */
    protected long f109023G;

    /* renamed from: H */
    protected Boolean f109024H;

    /* renamed from: I */
    protected float f109025I;

    /* renamed from: J */
    protected VEMediaParserProviderV2 f109026J;

    /* renamed from: K */
    public C42630g f109027K;

    /* renamed from: L */
    private DecelerateInterpolator f109028L = new DecelerateInterpolator();

    /* renamed from: M */
    private View f109029M;

    /* renamed from: N */
    private View f109030N;

    /* renamed from: O */
    private View f109031O;

    /* renamed from: P */
    private View f109032P;

    /* renamed from: Q */
    private boolean f109033Q;

    /* renamed from: R */
    private SpeedyLinearLayoutManager f109034R;

    /* renamed from: S */
    private SpeedyLinearLayoutManager f109035S;

    /* renamed from: T */
    private int f109036T;

    /* renamed from: U */
    private int f109037U;

    /* renamed from: V */
    private int f109038V;

    /* renamed from: W */
    private int f109039W;

    /* renamed from: aa */
    private int f109040aa;

    /* renamed from: ab */
    private int f109041ab;

    /* renamed from: ac */
    private int f109042ac;

    /* renamed from: ad */
    private int f109043ad;

    /* renamed from: ae */
    private int f109044ae;

    /* renamed from: af */
    private long f109045af;

    /* renamed from: ag */
    private C1340m f109046ag;

    /* renamed from: ah */
    private float f109047ah;

    /* renamed from: ai */
    private float f109048ai;

    /* renamed from: aj */
    private float f109049aj;

    /* renamed from: b */
    protected ImageView f109050b;

    /* renamed from: c */
    protected C43135a f109051c;

    /* renamed from: d */
    protected C43135a f109052d;

    /* renamed from: e */
    protected RTLLinearLayout f109053e;

    /* renamed from: f */
    protected AutoPollRecyclerView f109054f;

    /* renamed from: g */
    protected AutoPollRecyclerView f109055g;

    /* renamed from: h */
    protected InterceptFrameLayout f109056h;

    /* renamed from: i */
    protected int f109057i = 0;

    /* renamed from: j */
    protected long f109058j = C43155d.m94698c();

    /* renamed from: k */
    protected long f109059k;

    /* renamed from: l */
    protected FragmentActivity f109060l;

    /* renamed from: m */
    protected VideoEditViewModel f109061m;

    /* renamed from: n */
    protected CutMultiVideoViewModel f109062n;

    /* renamed from: o */
    protected C43150b f109063o;

    /* renamed from: p */
    protected C43152c f109064p;

    /* renamed from: q */
    protected C43152c f109065q;

    /* renamed from: r */
    protected float f109066r;

    /* renamed from: s */
    protected int f109067s;

    /* renamed from: t */
    protected int f109068t;

    /* renamed from: u */
    protected C42661d f109069u;

    /* renamed from: v */
    protected boolean f109070v;

    /* renamed from: w */
    protected int f109071w;

    /* renamed from: x */
    protected long f109072x;

    /* renamed from: y */
    protected long f109073y;

    /* renamed from: z */
    protected long f109074z;

    public View getEndSlide() {
        return this.f109051c;
    }

    public View getStartSlide() {
        return this.f109052d;
    }

    /* renamed from: a */
    public final boolean mo87551a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        this.f109062n = cutMultiVideoViewModel;
        MediaModel a = C43155d.m94694a(str, cutMultiVideoViewModel);
        if (a == null) {
            return false;
        }
        return mo87552a(fragmentActivity, cutMultiVideoViewModel, Collections.singletonList(a));
    }

    /* renamed from: a */
    public final boolean mo87552a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        this.f109060l = fragmentActivity;
        this.f109067s = list.size() > 1 ? 1 : 0;
        this.f109062n = cutMultiVideoViewModel;
        this.f109061m = (VideoEditViewModel) C0214z.m440a(fragmentActivity).mo359a(VideoEditViewModel.class);
        m94652a(cutMultiVideoViewModel, list);
        mo87696h();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87702a(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            m94654b(floatValue);
        } else {
            m94657c(floatValue);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo87712m() {
        m94658n();
        m94659o();
    }

    /* renamed from: p */
    private void m94660p() {
        if (!this.f109033Q) {
            this.f109033Q = true;
            C43155d.m94695a(this.f109060l);
        }
    }

    public C43152c getFrameAdapter() {
        if (this.f109067s == 1) {
            return this.f109064p;
        }
        return this.f109065q;
    }

    public SpeedyLinearLayoutManager getLayoutManager() {
        if (this.f109067s == 1) {
            return this.f109034R;
        }
        return this.f109035S;
    }

    /* access modifiers changed from: protected */
    public AutoPollRecyclerView getRecyclerView() {
        if (this.f109067s == 1) {
            return this.f109054f;
        }
        return this.f109055g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo87710k() {
        postDelayed(new C43166o(this), 100);
    }

    private long getSelectedTimeV2() {
        return (long) Math.round(((this.f109051c.getStartX() - this.f109052d.getStartX()) - ((float) C43155d.f109100c)) * this.f109063o.f109077a);
    }

    /* renamed from: n */
    private void m94658n() {
        int i;
        if (this.f109031O != null) {
            LayoutParams layoutParams = (LayoutParams) this.f109031O.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            float startX = this.f109052d.getStartX() + (((float) C43155d.f109100c) / 2.0f);
            int i2 = 0;
            View c = getLayoutManager().mo4736c(0);
            if (c != null) {
                i = (int) (startX - c.getX());
            } else {
                i = (int) startX;
            }
            if (i > 0) {
                i2 = i + 1;
            }
            this.f109031O.setX(startX - ((float) i2));
            layoutParams.width = i2;
            layoutParams.height = this.f109039W;
            layoutParams.topMargin = this.f109041ab;
            this.f109031O.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: o */
    private void m94659o() {
        int i;
        int i2;
        if (this.f109032P != null) {
            LayoutParams layoutParams = (LayoutParams) this.f109032P.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            float startX = this.f109051c.getStartX() + (((float) C43155d.f109100c) / 2.0f);
            View c = getLayoutManager().mo4736c(getLayoutManager().mo5013A() - 1);
            if (c != null) {
                i = (int) ((c.getX() + ((float) c.getWidth())) - startX);
            } else {
                i = (int) (((float) this.f109057i) - startX);
            }
            if (i <= 0) {
                i2 = 0;
            } else {
                i2 = i + 1;
            }
            this.f109032P.setX(startX);
            layoutParams.width = i2;
            layoutParams.height = this.f109039W;
            layoutParams.topMargin = this.f109041ab;
            this.f109032P.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo87709j() {
        if (this.f109017A != 0 && (this.f109051c.getStartX() - this.f109052d.getStartX()) - ((float) C43155d.f109100c) != this.f109066r) {
            long j = this.f109017A / 6;
            if (this.f109067s == 1) {
                C52847n a = C43150b.m94680a(this.f109073y, (float) j, this.f109038V, this.f109061m.mo87634l());
                this.f109054f.mo87671g(((Integer) a.component1()).intValue(), -Math.round(((Float) a.component2()).floatValue()));
            } else {
                int i = (int) (this.f109073y / j);
                this.f109055g.mo87671g(i, -Math.round((((float) (this.f109073y - (((long) i) * j))) / ((float) j)) * ((float) this.f109038V)));
            }
            mo87710k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo87711l() {
        this.f109053e.setOnTouchListener(this);
        getRecyclerView().mo49162o();
        if (this.f109067s == 1) {
            if (this.f109017A != this.f109063o.f109078b) {
                this.f109063o.f109078b = this.f109017A;
                this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
                this.f109064p.mo87721a(this.f109063o.f109077a);
            }
        } else if (this.f109017A != this.f109063o.f109078b) {
            this.f109063o.f109078b = this.f109017A;
            this.f109063o.mo87718a(this.f109072x);
            this.f109065q.mo87722a(this.f109063o.f109077a, this.f109069u.f107943d);
        }
        mo87709j();
        m94653a(this.f109051c, (float) ((this.f109057i - this.f109071w) - C43155d.f109100c), false);
        m94653a(this.f109052d, (float) this.f109071w, true);
    }

    /* renamed from: q */
    private void m94661q() {
        this.f109053e.setOnTouchListener(this);
        if (this.f109024H.booleanValue()) {
            if (this.f109045af < 0) {
                this.f109073y += this.f109045af;
                if (this.f109073y <= 0) {
                    this.f109073y = 0;
                }
                this.f109074z = this.f109073y + this.f109023G;
            } else {
                this.f109074z += this.f109045af;
                if (this.f109074z >= this.f109072x) {
                    this.f109074z = this.f109072x;
                }
                this.f109073y = this.f109074z - this.f109023G;
            }
            this.f109061m.mo87629g();
            return;
        }
        getRecyclerView().mo49162o();
        if (this.f109067s == 1) {
            if (this.f109017A != this.f109063o.f109078b) {
                this.f109063o.f109078b = this.f109017A;
                this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
                this.f109064p.mo87721a(this.f109063o.f109077a);
            }
        } else if (this.f109017A != this.f109063o.f109078b) {
            this.f109063o.f109078b = this.f109017A;
            this.f109063o.mo87718a(this.f109072x);
            this.f109065q.mo87722a(this.f109063o.f109077a, this.f109069u.f107943d);
        }
        mo87709j();
        m94653a(this.f109051c, (float) ((this.f109057i - this.f109071w) - C43155d.f109100c), false);
        m94653a(this.f109052d, (float) this.f109071w, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo87708i() {
        if (this.f109017A != 0) {
            long j = this.f109017A / 6;
            if (this.f109067s == 1) {
                C52847n a = C43150b.m94680a(this.f109073y, (float) j, this.f109038V, this.f109061m.mo87634l());
                this.f109054f.mo87671g(((Integer) a.component1()).intValue(), -Math.round(((Float) a.component2()).floatValue()));
            } else {
                int i = (int) (this.f109073y / j);
                this.f109055g.mo87671g(i, -Math.round((((float) (this.f109073y - (((long) i) * j))) / ((float) j)) * ((float) this.f109038V)));
            }
            if (this.f109024H.booleanValue() && this.f109023G < 1000) {
                VideoSegment videoSegment = (VideoSegment) this.f109061m.mo87634l().get(this.f109068t);
                if (this.f109073y > videoSegment.f107904c - this.f109017A) {
                    float f = ((float) (this.f109073y - (videoSegment.f107904c - this.f109017A))) / this.f109063o.f109077a;
                    this.f109052d.setStartX(this.f109052d.getStartX() + f);
                    this.f109051c.setStartX(this.f109051c.getStartX() + f);
                    mo87700a((int) this.f109052d.getStartX(), (int) this.f109051c.getStartX());
                }
            }
            mo87710k();
        }
    }

    /* renamed from: b */
    public final void mo87554b() {
        if (this.f109069u != null) {
            if (this.f109067s != 1) {
                this.f109069u.f107940a = (long) (((float) this.f109073y) * this.f109069u.f107943d);
                this.f109069u.f107941b = (long) (((float) this.f109074z) * this.f109069u.f107943d);
            }
            if (this.f109067s == 0) {
                this.f109061m.mo87611a(this.f109069u, this.f109068t);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo87696h() {
        this.f109068t = 0;
        View inflate = View.inflate(this.f109060l, R.layout.atl, this);
        this.f109050b = (ImageView) inflate.findViewById(R.id.a2q);
        this.f109053e = (RTLLinearLayout) inflate.findViewById(R.id.a2r);
        this.f109054f = (AutoPollRecyclerView) inflate.findViewById(R.id.ajp);
        this.f109055g = (AutoPollRecyclerView) inflate.findViewById(R.id.coq);
        this.f109056h = (InterceptFrameLayout) inflate.findViewById(R.id.ca9);
        VideoSegment videoSegment = (VideoSegment) this.f109061m.mo87634l().get(this.f109068t);
        if (this.f109067s != 1) {
            VideoSegment videoSegment2 = (VideoSegment) this.f109061m.mo87634l().get(0);
            this.f109069u = new C42661d(videoSegment2);
            this.f109072x = (long) (((float) videoSegment2.f107904c) / videoSegment2.mo86954h());
        } else {
            this.f109072x = C43150b.m94679a(this.f109061m.mo87634l(), this.f109061m.mo87635m());
        }
        this.f109017A = m94650a(this.f109072x, true);
        this.f109063o = new C43150b(this.f109066r);
        this.f109063o.f109079c = this.f109059k;
        this.f109063o.f109080d = this.f109058j;
        this.f109063o.f109078b = this.f109017A;
        this.f109073y = 0;
        this.f109074z = this.f109073y + this.f109017A;
        this.f109061m.mo87605a(this.f109066r);
        if (this.f109067s == 1) {
            this.f109063o.mo87720b(this.f109072x, this.f109061m.mo87635m());
        } else {
            this.f109063o.mo87719a(videoSegment.f107904c, videoSegment.mo86954h());
        }
        LayoutParams layoutParams = (LayoutParams) this.f109055g.getLayoutParams();
        layoutParams.topMargin = this.f109041ab;
        this.f109055g.setLayoutParams(layoutParams);
        this.f109055g.setPadding(this.f109071w + C43155d.f109100c, 0, this.f109071w + C43155d.f109100c, 0);
        C43152c cVar = new C43152c(this.f109060l, new int[]{this.f109038V, this.f109039W}, this.f109063o.f109077a, this.f109026J, 0);
        this.f109065q = cVar;
        this.f109065q.mo87725a(this.f109020D);
        this.f109055g.setAdapter(this.f109065q);
        this.f109035S = new SpeedyLinearLayoutManager(this.f109060l, 0, false);
        this.f109055g.setLayoutManager(this.f109035S);
        this.f109055g.mo4801a(this.f109046ag);
        LayoutParams layoutParams2 = (LayoutParams) this.f109054f.getLayoutParams();
        layoutParams2.topMargin = this.f109041ab;
        this.f109054f.setLayoutParams(layoutParams2);
        this.f109054f.setPadding(this.f109071w + C43155d.f109100c, 0, this.f109071w + C43155d.f109100c, 0);
        C43152c cVar2 = new C43152c(this.f109060l, new int[]{this.f109038V, this.f109039W}, this.f109063o.f109077a, this.f109026J, 1);
        this.f109064p = cVar2;
        this.f109064p.mo87725a(this.f109020D);
        this.f109054f.setAdapter(this.f109064p);
        this.f109034R = new SpeedyLinearLayoutManager(this.f109060l, 0, false);
        this.f109054f.setLayoutManager(this.f109034R);
        this.f109054f.mo4801a(this.f109046ag);
        if (this.f109067s == 0) {
            this.f109055g.setVisibility(0);
            this.f109054f.setVisibility(8);
        } else {
            this.f109055g.setVisibility(8);
            this.f109054f.setVisibility(0);
        }
        if (this.f109070v) {
            mo87538a();
        }
        this.f109052d = new C43135a(this.f109060l);
        this.f109052d.setScaleType(ScaleType.FIT_XY);
        this.f109052d.setPadding(C43155d.f109100c / 2, 0, 0, 0);
        this.f109052d.setImageResource(R.drawable.cbc);
        LayoutParams layoutParams3 = new LayoutParams(C43155d.f109100c, this.f109040aa);
        layoutParams3.topMargin = this.f109042ac;
        this.f109052d.setLayoutParams(layoutParams3);
        this.f109052d.setOnTouchListener(this);
        this.f109052d.setTag("startSlide");
        this.f109052d.setStartX((float) this.f109071w);
        addView(this.f109052d);
        this.f109051c = new C43135a(this.f109060l);
        this.f109051c.setScaleType(ScaleType.FIT_XY);
        this.f109051c.setPadding(0, 0, C43155d.f109100c / 2, 0);
        this.f109051c.setImageResource(R.drawable.cbb);
        LayoutParams layoutParams4 = new LayoutParams(C43155d.f109100c, this.f109040aa);
        layoutParams4.topMargin = this.f109042ac;
        this.f109051c.setLayoutParams(layoutParams4);
        this.f109051c.setOnTouchListener(this);
        this.f109051c.setTag("endSlide");
        this.f109051c.setStartX((float) ((this.f109057i - this.f109071w) - C43155d.f109100c));
        addView(this.f109051c);
        this.f109029M = new View(this.f109060l);
        this.f109030N = new View(this.f109060l);
        this.f109029M.setBackgroundColor(this.f109060l.getResources().getColor(R.color.a3_));
        this.f109030N.setBackgroundColor(this.f109060l.getResources().getColor(R.color.a3_));
        addView(this.f109029M);
        addView(this.f109030N);
        mo87700a((int) this.f109052d.getStartX(), (int) this.f109051c.getStartX());
        LayoutParams layoutParams5 = (LayoutParams) this.f109053e.getLayoutParams();
        layoutParams5.leftMargin = this.f109071w + C43155d.f109100c;
        layoutParams5.height = this.f109037U;
        this.f109053e.setLayoutParams(layoutParams5);
        this.f109053e.setTag("curPoint");
        this.f109053e.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f109050b.getLayoutParams();
        layoutParams6.width = this.f109036T;
        this.f109050b.setLayoutParams(layoutParams6);
        this.f109050b.setImageDrawable(C42430at.m93196a(0, -1, 1, this.f109036T / 2));
        this.f109031O = new View(this.f109060l);
        this.f109032P = new View(this.f109060l);
        int a = C46788b.f118235d.mo94007a(false, false, true, false, false);
        this.f109031O.setBackgroundColor(a);
        this.f109032P.setBackgroundColor(a);
        LayoutParams layoutParams7 = new LayoutParams(0, this.f109039W);
        layoutParams7.topMargin = this.f109041ab;
        this.f109031O.setLayoutParams(layoutParams7);
        int startX = (int) (this.f109051c.getStartX() + ((float) (C43155d.f109100c / 2)));
        int i = ((int) (((float) (this.f109072x - this.f109074z)) / this.f109063o.f109077a)) - (C43155d.f109100c / 2);
        if (i > this.f109057i - startX) {
            i = this.f109057i - startX;
        }
        LayoutParams layoutParams8 = new LayoutParams(i + 2, this.f109039W);
        layoutParams8.topMargin = this.f109041ab;
        this.f109032P.setX((float) startX);
        this.f109032P.setLayoutParams(layoutParams8);
        addView(this.f109031O);
        addView(this.f109032P);
        this.f109052d.bringToFront();
        this.f109051c.bringToFront();
        this.f109053e.bringToFront();
    }

    public void setSelfAdaptiontoastAnimListener(C42630g gVar) {
        this.f109027K = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo87703b(long j) {
        return m94650a(j, false);
    }

    /* access modifiers changed from: protected */
    public void setFocusOnMode(boolean z) {
        this.f109061m.f108924s.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    private void mo87687a(float f) {
        if (this.f109048ai == 0.0f) {
            this.f109048ai = f;
            return;
        }
        if (Math.abs(this.f109048ai - f) > 3.0f) {
            this.f109048ai = f;
            this.f109061m.mo87628f();
        }
    }

    /* renamed from: b */
    private void m94654b(float f) {
        if (this.f109017A < this.f109058j) {
            m94656b(false);
            this.f109017A = this.f109058j;
            this.f109073y = this.f109074z - this.f109017A;
        } else {
            m94655b(f, true);
        }
        mo87554b();
        if (this.f109044ae == 1) {
            this.f109061m.mo87604a();
        }
    }

    /* renamed from: c */
    private void m94657c(float f) {
        if (this.f109017A < this.f109058j) {
            m94656b(false);
            this.f109017A = this.f109058j;
            this.f109074z = this.f109073y + this.f109058j;
        } else {
            m94655b(f, false);
        }
        mo87554b();
        if (this.f109044ae == 2) {
            this.f109061m.mo87615b();
        }
    }

    public void setEnabled(boolean z) {
        this.f109056h.setIntercept(!z);
        if (z) {
            this.f109052d.setEnabled(true);
            this.f109051c.setEnabled(true);
            this.f109053e.setEnabled(true);
            return;
        }
        if (this.f109044ae == 0) {
            this.f109052d.setEnabled(false);
            this.f109051c.setEnabled(false);
            this.f109053e.setEnabled(false);
        }
    }

    /* renamed from: b */
    private void m94656b(boolean z) {
        String str;
        if (!this.f109033Q) {
            this.f109033Q = true;
            C43155d.m94695a(this.f109060l);
            if (!z) {
                str = getResources().getString(R.string.f87, new Object[]{Float.valueOf(((float) this.f109058j) / 1000.0f)});
            } else if (!this.f108821a || !C43155d.m94697b()) {
                str = getResources().getString(R.string.f86, new Object[]{Long.valueOf(this.f109059k / 1000)});
            } else {
                str = C43457b.m95262a(getContext().getApplicationContext());
            }
            C10691a.m21545b((Context) this.f109060l, str).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo87699a(int i) {
        float abs = ((float) Math.abs(i)) * this.f109063o.f109077a;
        if (i > 0) {
            this.f109074z = (long) (((float) this.f109074z) + abs);
            if (this.f109074z >= this.f109072x) {
                this.f109074z = this.f109072x;
            }
            this.f109073y = this.f109074z - this.f109023G;
        } else {
            this.f109073y = (long) (((float) this.f109073y) - abs);
            if (this.f109073y <= 0) {
                this.f109073y = 0;
            }
            this.f109074z = this.f109073y + this.f109023G;
        }
        m94658n();
        m94659o();
        mo87554b();
    }

    /* renamed from: b */
    public final void mo87704b(int i) {
        if (this.f109044ae != 0) {
            if (i < 0) {
                this.f109051c.setStartX(this.f109051c.getStartX() - ((float) i));
            } else {
                this.f109052d.setStartX(this.f109052d.getStartX() - ((float) i));
            }
            m94658n();
            m94659o();
            mo87700a((int) this.f109052d.getStartX(), (int) this.f109051c.getStartX());
            this.f109017A = getSelectedTimeV2();
            switch (this.f109044ae) {
                case 1:
                    this.f109073y = this.f109074z - this.f109017A;
                    if (this.f109073y <= 0) {
                        this.f109073y = 0;
                        break;
                    }
                    break;
                case 2:
                    this.f109074z = this.f109073y + this.f109017A;
                    if (this.f109074z >= this.f109072x) {
                        this.f109074z = this.f109072x;
                        break;
                    }
                    break;
            }
            this.f109017A = this.f109074z - this.f109073y;
            if (this.f109017A > this.f109059k) {
                this.f109017A = this.f109059k;
                m94656b(true);
                getRecyclerView().mo49162o();
            }
        } else {
            if (i > 0) {
                this.f109074z = (long) (((float) this.f109074z) + (((float) Math.abs(i)) * this.f109063o.f109077a));
                if (this.f109074z >= this.f109072x) {
                    this.f109074z = this.f109072x;
                }
                this.f109073y = this.f109074z - this.f109017A;
            } else {
                this.f109073y = (long) (((float) this.f109073y) - (((float) Math.abs(i)) * this.f109063o.f109077a));
                if (this.f109073y <= 0) {
                    this.f109073y = 0;
                }
                this.f109074z = this.f109073y + this.f109017A;
            }
            m94658n();
            m94659o();
        }
        mo87554b();
    }

    /* renamed from: a */
    private long m94650a(long j, boolean z) {
        long min = Math.min(j, this.f109059k);
        if (!z || !C43457b.m95263a()) {
            return min;
        }
        return Math.min(min, 60000);
    }

    /* renamed from: a */
    private void m94652a(CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list) {
        if (cutMultiVideoViewModel.f107677k) {
            for (MediaModel mediaModel : list) {
                mediaModel.f95386e = (long) cutMultiVideoViewModel.f107678l;
                mediaModel.f95390i = 720;
                mediaModel.f95391j = 1280;
            }
        }
        this.f109061m.mo87612a(list);
    }

    /* renamed from: b */
    private void m94655b(float f, boolean z) {
        if (z) {
            this.f109052d.setStartX(f);
        } else {
            this.f109051c.setStartX(f);
        }
        mo87700a((int) this.f109052d.getStartX(), (int) this.f109051c.getStartX());
        if (z) {
            m94658n();
        } else {
            m94659o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87698a(float f, boolean z) {
        if (f < this.f109052d.getStartX() + ((float) C43155d.f109100c)) {
            f = this.f109052d.getStartX() + ((float) C43155d.f109100c);
        }
        if (f > this.f109051c.getStartX() - ((float) this.f109050b.getWidth())) {
            f = this.f109051c.getStartX() - ((float) this.f109050b.getWidth());
        }
        this.f109053e.setStartX(f);
        if (z) {
            if (this.f109067s == 2) {
                this.f109061m.mo87608a(getSinglePlayingPosition());
                return;
            }
            this.f109061m.mo87608a(getMultiPlayingPosition());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r14.equals("endSlide") == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0294, code lost:
        if (r14.equals("endSlide") == false) goto L_0x02ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            java.lang.Object r14 = r14.getTag()
            java.lang.String r14 = (java.lang.String) r14
            r0 = 0
            if (r14 != 0) goto L_0x000a
            return r0
        L_0x000a:
            int r1 = r15.getAction()
            r2 = 1714230678(0x662d1596, float:2.043419E23)
            r3 = 544295728(0x20714b30, float:2.0438371E-19)
            r4 = -1584466321(0xffffffffa18ef66f, float:-9.687525E-19)
            r5 = 0
            r7 = 0
            r8 = 2
            r9 = -1
            r10 = 1
            switch(r1) {
                case 0: goto L_0x02ec;
                case 1: goto L_0x027a;
                case 2: goto L_0x004c;
                case 3: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0374
        L_0x0022:
            r13.setFocusOnMode(r0)
            r13.f109044ae = r0
            r13.m94661q()
            android.widget.ImageView r15 = r13.f109050b
            r0 = 1065353216(0x3f800000, float:1.0)
            com.p683ss.android.ugc.aweme.shortvideo.util.C45430bl.m99001a(r15, r0)
            java.lang.String r15 = "startSlide"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x0041
            java.lang.String r15 = "endSlide"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0374
        L_0x0041:
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            if (r14 == 0) goto L_0x0374
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            r14.mo86895a()
            goto L_0x0374
        L_0x004c:
            float r15 = r15.getRawX()
            float r1 = r13.f109047ah
            float r1 = r15 - r1
            float r11 = r13.f109049aj
            float r11 = r11 + r1
            int r12 = r14.hashCode()
            if (r12 == r4) goto L_0x0075
            if (r12 == r3) goto L_0x006b
            if (r12 == r2) goto L_0x0062
            goto L_0x007f
        L_0x0062:
            java.lang.String r2 = "endSlide"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x007f
            goto L_0x0080
        L_0x006b:
            java.lang.String r2 = "curPoint"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x007f
            r8 = 0
            goto L_0x0080
        L_0x0075:
            java.lang.String r2 = "startSlide"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x007f
            r8 = 1
            goto L_0x0080
        L_0x007f:
            r8 = -1
        L_0x0080:
            r2 = 0
            switch(r8) {
                case 0: goto L_0x0253;
                case 1: goto L_0x017b;
                case 2: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x025b
        L_0x0086:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r3 = r13.f109053e
            r3.setOnTouchListener(r2)
            java.lang.Boolean r2 = r13.f109024H
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00fa
            int r15 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r15 = (float) r15
            float r15 = r15 + r11
            int r2 = r13.f109057i
            int r3 = r13.f109071w
            int r2 = r2 - r3
            float r2 = (float) r2
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x00f5
            int r15 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r15 = (float) r15
            float r15 = r11 - r15
            float r2 = r13.f109025I
            float r15 = r15 - r2
            int r2 = r13.f109071w
            float r2 = (float) r2
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 >= 0) goto L_0x00b1
            goto L_0x00f5
        L_0x00b1:
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b r15 = r13.f109063o
            float r15 = r15.f109077a
            float r1 = r1 * r15
            long r1 = (long) r1
            r13.f109045af = r1
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            r15.setStartX(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r1 = (float) r1
            float r11 = r11 - r1
            float r1 = r13.f109025I
            float r11 = r11 - r1
            r15.setStartX(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            float r15 = r15.getStartX()
            android.widget.ImageView r1 = r13.f109050b
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r15 = r15 - r1
            r13.mo87698a(r15, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            float r15 = r15.getStartX()
            int r15 = (int) r15
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r0 = r13.f109051c
            float r0 = r0.getStartX()
            int r0 = (int) r0
            r13.mo87700a(r15, r0)
            r13.m94658n()
            r13.m94659o()
            goto L_0x025b
        L_0x00f5:
            r13.m94660p()
            goto L_0x025b
        L_0x00fa:
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r1 = (float) r1
            float r1 = r1 + r11
            int r2 = r13.f109057i
            int r3 = r13.f109071w
            int r2 = r2 - r3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x013d
            long r1 = r13.f109017A
            long r3 = r13.f109059k
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x012d
            r13.mo87687a(r15)
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView r15 = r13.getRecyclerView()
            r15.mo87670g(r10)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            float r15 = r15.getStartX()
            android.widget.ImageView r1 = r13.f109050b
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r15 = r15 - r1
            r13.mo87698a(r15, r0)
            goto L_0x025b
        L_0x012d:
            r13.m94656b(r10)
            long r0 = r13.f109059k
            r13.f109017A = r0
            long r0 = r13.f109073y
            long r2 = r13.f109017A
            long r0 = r0 + r2
            r13.f109074z = r0
            goto L_0x025b
        L_0x013d:
            r13.f109048ai = r7
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView r15 = r13.getRecyclerView()
            r15.mo49162o()
            long r1 = r13.getSelectedTimeV2()
            long r3 = r13.f109074z
            long r5 = r13.f109017A
            long r5 = r5 - r1
            long r3 = r3 - r5
            r13.f109074z = r3
            long r1 = r13.f109074z
            long r3 = r13.f109072x
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 < 0) goto L_0x015e
            long r1 = r13.f109072x
            r13.f109074z = r1
        L_0x015e:
            long r1 = r13.f109074z
            long r3 = r13.f109073y
            long r1 = r1 - r3
            r13.f109017A = r1
            r13.m94657c(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            float r15 = r15.getStartX()
            android.widget.ImageView r1 = r13.f109050b
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r15 = r15 - r1
            r13.mo87698a(r15, r0)
            goto L_0x025b
        L_0x017b:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r3 = r13.f109053e
            r3.setOnTouchListener(r2)
            java.lang.Boolean r2 = r13.f109024H
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01e8
            int r15 = r13.f109071w
            float r15 = (float) r15
            int r15 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x01e4
            float r15 = r13.f109025I
            float r15 = r15 + r11
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r2 = (float) r2
            float r15 = r15 + r2
            int r2 = r13.f109057i
            int r3 = r13.f109071w
            int r2 = r2 - r3
            int r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            int r2 = r2 - r3
            float r2 = (float) r2
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x01a4
            goto L_0x01e4
        L_0x01a4:
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b r15 = r13.f109063o
            float r15 = r15.f109077a
            float r1 = r1 * r15
            long r1 = (long) r1
            r13.f109045af = r1
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            r15.setStartX(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            float r1 = r13.f109025I
            float r11 = r11 + r1
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r1 = (float) r1
            float r11 = r11 + r1
            r15.setStartX(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            float r15 = r15.getStartX()
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r1 = (float) r1
            float r15 = r15 + r1
            r13.mo87698a(r15, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            float r15 = r15.getStartX()
            int r15 = (int) r15
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r0 = r13.f109051c
            float r0 = r0.getStartX()
            int r0 = (int) r0
            r13.mo87700a(r15, r0)
            r13.m94658n()
            r13.m94659o()
            goto L_0x025b
        L_0x01e4:
            r13.m94660p()
            goto L_0x025b
        L_0x01e8:
            int r1 = r13.f109071w
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x021e
            long r1 = r13.f109017A
            long r3 = r13.f109059k
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x020f
            r13.mo87687a(r15)
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView r15 = r13.getRecyclerView()
            r15.mo87670g(r9)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            float r15 = r15.getStartX()
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r1 = (float) r1
            float r15 = r15 + r1
            r13.mo87698a(r15, r0)
            goto L_0x025b
        L_0x020f:
            r13.m94656b(r10)
            long r0 = r13.f109059k
            r13.f109017A = r0
            long r0 = r13.f109074z
            long r2 = r13.f109017A
            long r0 = r0 - r2
            r13.f109073y = r0
            goto L_0x025b
        L_0x021e:
            r13.f109048ai = r7
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView r15 = r13.getRecyclerView()
            r15.mo49162o()
            long r1 = r13.getSelectedTimeV2()
            long r3 = r13.f109073y
            long r7 = r13.f109017A
            long r7 = r7 - r1
            long r3 = r3 + r7
            r13.f109073y = r3
            long r1 = r13.f109073y
            int r15 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r15 > 0) goto L_0x023b
            r13.f109073y = r5
        L_0x023b:
            long r1 = r13.f109074z
            long r3 = r13.f109073y
            long r1 = r1 - r3
            r13.f109017A = r1
            r13.m94654b(r11)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            float r15 = r15.getStartX()
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d.f109100c
            float r1 = (float) r1
            float r15 = r15 + r1
            r13.mo87698a(r15, r0)
            goto L_0x025b
        L_0x0253:
            r13.mo87698a(r11, r10)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87613a(r10)
        L_0x025b:
            java.lang.String r15 = "startSlide"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x026b
            java.lang.String r15 = "endSlide"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0374
        L_0x026b:
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            if (r14 == 0) goto L_0x0374
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            float r15 = r13.getSelectedTime()
            r14.mo86897b(r15)
            goto L_0x0374
        L_0x027a:
            r13.f109021E = r0
            r13.f109033Q = r0
            r13.f109044ae = r0
            r13.setFocusOnMode(r0)
            int r15 = r14.hashCode()
            if (r15 == r4) goto L_0x02a1
            if (r15 == r3) goto L_0x0297
            if (r15 == r2) goto L_0x028e
            goto L_0x02ab
        L_0x028e:
            java.lang.String r15 = "endSlide"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x02ab
            goto L_0x02ac
        L_0x0297:
            java.lang.String r15 = "curPoint"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x02ab
            r8 = 0
            goto L_0x02ac
        L_0x02a1:
            java.lang.String r15 = "startSlide"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x02ab
            r8 = 1
            goto L_0x02ac
        L_0x02ab:
            r8 = -1
        L_0x02ac:
            switch(r8) {
                case 0: goto L_0x02cc;
                case 1: goto L_0x02be;
                case 2: goto L_0x02b0;
                default: goto L_0x02af;
            }
        L_0x02af:
            goto L_0x02d1
        L_0x02b0:
            r13.m94661q()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87624d()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87627e()
            goto L_0x02d1
        L_0x02be:
            r13.m94661q()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87621c()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87627e()
            goto L_0x02d1
        L_0x02cc:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87613a(r0)
        L_0x02d1:
            java.lang.String r15 = "startSlide"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x02e1
            java.lang.String r15 = "endSlide"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0374
        L_0x02e1:
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            if (r14 == 0) goto L_0x0374
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            r14.mo86895a()
            goto L_0x0374
        L_0x02ec:
            float r15 = r15.getRawX()
            r13.f109047ah = r15
            r13.f109021E = r10
            r13.f109048ai = r7
            r13.f109045af = r5
            int r15 = r14.hashCode()
            if (r15 == r4) goto L_0x0317
            if (r15 == r3) goto L_0x030d
            if (r15 == r2) goto L_0x0303
            goto L_0x0320
        L_0x0303:
            java.lang.String r15 = "endSlide"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x0320
            r9 = 2
            goto L_0x0320
        L_0x030d:
            java.lang.String r15 = "curPoint"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x0320
            r9 = 0
            goto L_0x0320
        L_0x0317:
            java.lang.String r15 = "startSlide"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x0320
            r9 = 1
        L_0x0320:
            switch(r9) {
                case 0: goto L_0x034a;
                case 1: goto L_0x0337;
                case 2: goto L_0x0324;
                default: goto L_0x0323;
            }
        L_0x0323:
            goto L_0x0357
        L_0x0324:
            r13.f109044ae = r8
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            float r15 = r15.getStartX()
            r13.f109049aj = r15
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            r15.setEnabled(r0)
            r13.setFocusOnMode(r10)
            goto L_0x0357
        L_0x0337:
            r13.f109044ae = r10
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109052d
            float r15 = r15.getStartX()
            r13.f109049aj = r15
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.a r15 = r13.f109051c
            r15.setEnabled(r0)
            r13.setFocusOnMode(r10)
            goto L_0x0357
        L_0x034a:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout r15 = r13.f109053e
            float r15 = r15.getLeftX()
            r13.f109049aj = r15
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r15 = r13.f109061m
            r15.mo87613a(r10)
        L_0x0357:
            java.lang.String r15 = "startSlide"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x0367
            java.lang.String r15 = "endSlide"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0374
        L_0x0367:
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            if (r14 == 0) goto L_0x0374
            com.ss.android.ugc.aweme.shortvideo.cut.g r14 = r13.f109027K
            float r15 = r13.getSelectedTime()
            r14.mo86896a(r15)
        L_0x0374:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VideoEditViewV2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87700a(int i, int i2) {
        if (this.f109029M != null && this.f109030N != null && i <= i2) {
            int i3 = C43155d.f109100c + i;
            int i4 = ((i2 - i) - C43155d.f109100c) + 1;
            LayoutParams layoutParams = (LayoutParams) this.f109029M.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            layoutParams.width = i4;
            layoutParams.height = this.f109043ad;
            layoutParams.leftMargin = i3;
            layoutParams.topMargin = this.f109042ac;
            this.f109029M.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = (LayoutParams) this.f109030N.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LayoutParams(-2, -2);
            }
            layoutParams2.width = i4;
            layoutParams2.height = this.f109043ad;
            layoutParams2.leftMargin = i3;
            layoutParams2.topMargin = (this.f109042ac + this.f109040aa) - this.f109043ad;
            this.f109030N.setLayoutParams(layoutParams2);
        }
    }

    public VideoEditViewV2(Context context, AttributeSet attributeSet, int i) {
        long j;
        super(context, attributeSet, i);
        if (C39629l.m88232a().mo58594y().mo74171a()) {
            j = 300000;
        } else {
            j = C43155d.m94693a();
        }
        this.f109059k = j;
        this.f109070v = true;
        this.f109039W = C43155d.f109098a;
        this.f109044ae = 0;
        this.f109071w = C43155d.f109101d;
        this.f109072x = 0;
        this.f109073y = 0;
        this.f109074z = 0;
        this.f109017A = 0;
        this.f109018B = 0;
        this.f109019C = 0;
        this.f109021E = false;
        this.f109022F = false;
        this.f109023G = 0;
        this.f109024H = Boolean.valueOf(false);
        this.f109025I = 0.0f;
        this.f109046ag = new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    VideoEditViewV2.this.mo87698a(VideoEditViewV2.this.f109052d.getStartX() + ((float) C43155d.f109100c), false);
                    VideoEditViewV2.this.f109022F = true;
                    VideoEditViewV2.this.f109052d.setEnabled(false);
                    VideoEditViewV2.this.f109051c.setEnabled(false);
                }
                if (i == 0) {
                    VideoEditViewV2.this.f109052d.setEnabled(true);
                    VideoEditViewV2.this.f109051c.setEnabled(true);
                    if (VideoEditViewV2.this.f109022F) {
                        VideoEditViewV2.this.f109061m.mo87629g();
                        VideoEditViewV2.this.f109022F = false;
                        if (VideoEditViewV2.this.f109061m.mo87634l().size() > 8) {
                            VideoEditViewV2.this.f109026J.mo87679c();
                        }
                    } else {
                        if (VideoEditViewV2.this.getLayoutManager().mo4750k() == 0) {
                            VideoEditViewV2.this.f109073y = 0;
                            VideoEditViewV2.this.f109017A = VideoEditViewV2.this.f109074z - VideoEditViewV2.this.f109073y;
                            VideoEditViewV2.this.f109061m.mo87605a(0.0f);
                        }
                        if (VideoEditViewV2.this.getLayoutManager().mo4752m() == VideoEditViewV2.this.getFrameAdapter().getItemCount() - 1) {
                            VideoEditViewV2.this.f109074z = VideoEditViewV2.this.f109072x;
                            VideoEditViewV2.this.f109017A = VideoEditViewV2.this.f109074z - VideoEditViewV2.this.f109073y;
                            VideoEditViewV2.this.f109061m.mo87605a(0.0f);
                        }
                    }
                }
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i != 0) {
                    if (VideoEditViewV2.this.f109024H.booleanValue()) {
                        VideoEditViewV2.this.mo87699a(i);
                    } else {
                        VideoEditViewV2.this.mo87704b(i);
                    }
                    if (!VideoEditViewV2.this.f109022F) {
                        VideoEditViewV2.this.f109061m.mo87605a(VideoEditViewV2.this.f109066r);
                        if (VideoEditViewV2.this.f109027K != null) {
                            VideoEditViewV2.this.f109027K.mo86897b(VideoEditViewV2.this.getSelectedTime());
                        }
                    }
                }
            }
        };
        this.f109048ai = 0.0f;
        this.f109057i = C23724k.m58224b(context);
        this.f109043ad = (int) C9432q.m18687b(context, 2.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ip, R.attr.iq, R.attr.j6, R.attr.j7, R.attr.mi, R.attr.mj, R.attr.s7, R.attr.acz, R.attr.ad0, R.attr.vq, R.attr.a1z, R.attr.adk, R.attr.adl});
            this.f109036T = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
            this.f109037U = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            this.f109040aa = this.f109039W + (this.f109043ad * 2);
            this.f109066r = (float) ((this.f109057i - (C43155d.f109100c * 2)) - (this.f109071w * 2));
            this.f109038V = Math.round(this.f109066r / 6.0f);
            this.f109042ac = (this.f109037U - C43155d.f109099b) / 2;
            this.f109041ab = (this.f109037U - this.f109039W) / 2;
            obtainStyledAttributes.recycle();
        }
        setLoadThumbnailDirectly(!C39629l.m88232a().mo58583n().mo83103a(C40790a.VEExtractFramesAfterRender));
        this.f109026J = new VEMediaParserProviderV2(context);
    }

    /* renamed from: a */
    private void m94653a(C43135a aVar, float f, boolean z) {
        if (aVar != null && Math.abs(aVar.getStartX() - f) > 1.0f) {
            if (z) {
                if (aVar.getStartX() < ((float) (-C43155d.f109100c))) {
                    aVar.setStartX((float) (-C43155d.f109100c));
                }
            } else if (aVar.getStartX() > ((float) (this.f109057i + 1))) {
                aVar.setStartX((float) (this.f109057i + 1));
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{aVar.getStartX(), f});
            ofFloat.setDuration(250);
            ofFloat.setInterpolator(this.f109028L);
            ofFloat.addUpdateListener(new C43165n(this, z));
            ofFloat.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87701a(long j, long j2, long j3) {
        this.f109017A = j2 - j;
        this.f109017A = Math.min(j3, this.f109017A);
        this.f109073y = j;
        this.f109074z = j2;
    }
}
