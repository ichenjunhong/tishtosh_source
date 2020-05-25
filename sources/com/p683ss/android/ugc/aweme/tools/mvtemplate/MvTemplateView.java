package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.uikit.textview.AlwaysMarqueeTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.status.C45733a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j.C47271a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47270j.C47272b;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2367a.C47232b;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47250b;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d.C47259a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d.C47263e;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d.C47264f;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.thumbnail.C47309a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.C47316a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.C47318a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.C47321b;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView */
public class MvTemplateView extends FrameLayout {

    /* renamed from: A */
    private int f119193A;

    /* renamed from: B */
    private C47271a f119194B;

    /* renamed from: a */
    public AlwaysMarqueeTextView f119195a;

    /* renamed from: b */
    public AlwaysMarqueeTextView f119196b;

    /* renamed from: c */
    TextView f119197c;

    /* renamed from: d */
    MvThumbnailRecyclerView f119198d;

    /* renamed from: e */
    View f119199e;

    /* renamed from: f */
    CircularAnimateButton f119200f;

    /* renamed from: g */
    public int f119201g;

    /* renamed from: h */
    public int f119202h;

    /* renamed from: i */
    View f119203i;

    /* renamed from: j */
    DmtLoadingLayout f119204j;

    /* renamed from: k */
    public boolean f119205k;

    /* renamed from: l */
    View f119206l;

    /* renamed from: m */
    public C47297p f119207m;

    /* renamed from: n */
    MvThemeListViewPager f119208n;

    /* renamed from: o */
    public C47263e f119209o;

    /* renamed from: p */
    public int f119210p;

    /* renamed from: q */
    C47309a f119211q;

    /* renamed from: r */
    public C47224a f119212r;

    /* renamed from: s */
    public boolean f119213s;

    /* renamed from: t */
    public boolean f119214t;

    /* renamed from: u */
    private ViewGroup f119215u;

    /* renamed from: v */
    private View f119216v;

    /* renamed from: w */
    private int f119217w;

    /* renamed from: x */
    private FragmentActivity f119218x;

    /* renamed from: y */
    private C47298q f119219y;

    /* renamed from: z */
    private C47264f f119220z;

    public int getDataCount() {
        return this.f119209o.getCount();
    }

    /* renamed from: d */
    public final void mo94460d() {
        C47259a a = mo94452a(this.f119202h);
        if (a != null) {
            a.mo94529d();
        }
    }

    /* renamed from: e */
    public final void mo94463e() {
        C47259a a = mo94452a(this.f119202h);
        if (a != null) {
            a.mo94531e();
        }
    }

    private int getItemWidth() {
        if (this.f119210p <= 0) {
            C47259a a = this.f119209o.getItem(0);
            if (a != null) {
                this.f119210p = a.mo94525a();
            }
        }
        return this.f119210p;
    }

    /* renamed from: b */
    public final void mo94458b() {
        final int i = this.f119202h;
        mo94457a(false);
        final MvThemeData b = this.f119209o.mo94536b(i);
        final C47259a a = mo94452a(i);
        if (b != null) {
            this.f119219y.mo94579a(b.f119230a, (C48699d) new C48699d() {
                /* renamed from: a */
                public final void mo8643a(Effect effect) {
                    MvTemplateView.this.mo94457a(false);
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    Effect effect = (Effect) obj;
                    MvTemplateView mvTemplateView = MvTemplateView.this;
                    int i = i;
                    C47259a aVar = a;
                    if (i == mvTemplateView.f119202h) {
                        mvTemplateView.mo94457a(true);
                        if (mvTemplateView.f119207m != null) {
                            mvTemplateView.f119207m.mo94508a(mvTemplateView.f119209o.mo94536b(mvTemplateView.f119202h), 1, mvTemplateView.f119202h);
                        }
                    }
                    if (aVar != null) {
                        aVar.mo94527c();
                    }
                    C47250b.f119319a.mo94519a(b, null, true);
                    StringBuilder sb = new StringBuilder("MVRes: Download Success:");
                    sb.append(effect.getUnzipPath());
                    C45407ay.m98968a(sb.toString());
                }

                /* renamed from: a */
                public final void mo8644a(Effect effect, C48649d dVar) {
                    C50275d.m108533a(MvTemplateView.this.getContext(), MvTemplateView.this.getResources().getString(R.string.d_r)).mo98174a();
                    MvTemplateView mvTemplateView = MvTemplateView.this;
                    int i = i;
                    C47259a aVar = a;
                    if (i == mvTemplateView.f119202h) {
                        mvTemplateView.mo94457a(true);
                    }
                    if (aVar != null) {
                        aVar.mo94527c();
                    }
                    C47250b.f119319a.mo94519a(b, dVar, false);
                    if (effect != null) {
                        StringBuilder sb = new StringBuilder("MVRes: Download Failed:");
                        sb.append(effect.getName());
                        C45407ay.m98968a(sb.toString());
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("MVRes: Download Failed:");
                    sb2.append(b.mo94479f());
                    C45407ay.m98968a(sb2.toString());
                }

                /* renamed from: a */
                public final void mo59191a(Effect effect, int i, long j) {
                    if (a != null) {
                        C47259a aVar = a;
                        aVar.mo94530d(true);
                        aVar.mo94528c(false);
                        if (aVar.f119330a != null) {
                            aVar.f119330a.setProgress((float) i);
                        }
                        if (aVar.f119331b != null) {
                            TextView textView = aVar.f119331b;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append("%");
                            textView.setText(sb.toString());
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo94459c() {
        this.f119200f.setText(this.f119200f.getContext().getResources().getString(R.string.d5q));
        this.f119200f.setClickable(false);
    }

    /* renamed from: f */
    public final void mo94464f() {
        this.f119211q.f119417e = false;
        View childAt = this.f119198d.getChildAt(this.f119198d.getChildCount() - 1);
        if (childAt != null) {
            View findViewById = childAt.findViewById(R.id.bhy);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo94453a() {
        this.f119204j.setVisibility(8);
        this.f119203i.setVisibility(0);
        this.f119196b.setVisibility(0);
        this.f119195a.setVisibility(0);
        if (!this.f119213s) {
            this.f119197c.setVisibility(0);
        }
        this.f119208n.setNoScroll(false);
        if (this.f119209o != null) {
            mo94454a(this.f119209o.mo94536b(this.f119202h));
        } else {
            mo94457a(true);
        }
        this.f119200f.mo94599a((C47321b) null);
        this.f119205k = false;
        if (this.f119207m != null) {
            this.f119207m.mo94507a(this.f119209o.mo94536b(0));
        }
    }

    public void dismiss() {
        if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f119199e, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
            CircularAnimateButton circularAnimateButton = this.f119200f;
            C47296o oVar = new C47296o(this);
            C47318a a = circularAnimateButton.mo94598a((float) circularAnimateButton.f119437b, (float) circularAnimateButton.f119440e, circularAnimateButton.f119439d, circularAnimateButton.f119440e);
            a.f119446e = circularAnimateButton.f119438c;
            a.f119447f = circularAnimateButton.f119438c;
            a.f119448g = 0;
            a.f119449h = 0;
            a.f119442a = oVar;
            a.mo94603a();
            mo94463e();
        }
    }

    public void setMoreDataFetcher(C47224a aVar) {
        this.f119212r = aVar;
    }

    public void setMvThemeClickListener(C47297p pVar) {
        this.f119207m = pVar;
    }

    public MvTemplateView(Context context) {
        this(context, null);
    }

    public void setMvEffectPlatform(C29252f fVar) {
        this.f119219y.f119395a = fVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C47259a mo94452a(int i) {
        C47259a aVar = null;
        if (this.f119209o.getCount() <= 0) {
            return null;
        }
        if (i >= 0 && i < this.f119209o.getCount()) {
            aVar = this.f119209o.getItem(i);
        }
        return aVar;
    }

    /* renamed from: b */
    private static List<MvThemeData> m102473b(List<MvThemeData> list) {
        if (!C45733a.m99540a()) {
            return list;
        }
        if (C23715d.m58202a((Collection<T>) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MvThemeData mvThemeData : list) {
            if (mvThemeData.f119247r) {
                arrayList.add(mvThemeData);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo94454a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f119230a == null) {
            mo94457a(true);
        } else {
            mo94457a(!this.f119219y.mo94580a(mvThemeData.f119230a));
        }
    }

    /* renamed from: a */
    public final void mo94455a(Boolean bool) {
        float f;
        int b = (int) C9432q.m18687b(getContext(), 16.0f);
        if (this.f119200f != null) {
            LayoutParams layoutParams = (LayoutParams) this.f119200f.getLayoutParams();
            if (bool.booleanValue()) {
                f = ((float) b) + C9432q.m18687b(getContext(), 65.0f);
            } else {
                f = C9432q.m18687b(getContext(), 65.0f);
            }
            layoutParams.bottomMargin = (int) f;
            this.f119200f.setLayoutParams(layoutParams);
        }
    }

    @C53771m
    public void handleSelectEvent(C47270j jVar) {
        if (jVar.f119351a == C47272b.START) {
            this.f119194B = jVar.f119352b;
        } else if (!(this.f119194B == null || jVar.f119352b == this.f119194B)) {
            return;
        }
        switch (jVar.f119352b) {
            case ICON_LIST:
                if (jVar.f119351a == C47272b.SCROLL) {
                    float f = jVar.f119354d;
                    this.f119208n.scrollTo((int) ((((float) jVar.f119353c) + f) * ((float) (getItemWidth() + this.f119193A))), 0);
                    if (jVar.f119353c != this.f119208n.getCurrentItem() && ((double) f) < 0.01d) {
                        this.f119208n.setCurrentItem(jVar.f119353c);
                    }
                    C47259a a = this.f119209o.getItem(jVar.f119353c);
                    if (a != null) {
                        this.f119220z.mo3111a(a.getView(), f);
                        int i = jVar.f119353c + 1;
                        if (i < this.f119209o.getCount()) {
                            this.f119220z.mo3111a(this.f119209o.getItem(i).getView(), 1.0f - f);
                        }
                        return;
                    }
                    return;
                }
                break;
            case MAIN_TEMPLATE:
                if (jVar.f119351a == C47272b.SCROLL) {
                    this.f119198d.mo94584a(jVar.f119353c, jVar.f119354d, false);
                    break;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo94456a(List<MvThemeData> list) {
        List b = m102473b(list);
        if (!C23715d.m58202a((Collection<T>) b)) {
            if (this.f119213s) {
                if (this.f119205k) {
                    this.f119211q.f119413a.clear();
                    this.f119211q.f119416d = true;
                    this.f119210p = 0;
                }
                this.f119214t = false;
                int size = this.f119211q.f119413a.size();
                this.f119211q.f119413a.addAll(b);
                if (this.f119198d.mo4875i()) {
                    this.f119198d.post(new C47276n(this, size, b));
                } else if (size == 0) {
                    this.f119211q.notifyDataSetChanged();
                } else {
                    this.f119211q.notifyItemRangeInserted(size + 1, b.size());
                }
            }
            if (getDataCount() == 0 || this.f119205k) {
                this.f119208n.setAdapter(this.f119209o);
                this.f119209o.mo94535a(b);
                if (this.f119197c != null && !C23715d.m58202a((Collection<T>) b)) {
                    TextView textView = this.f119197c;
                    StringBuilder sb = new StringBuilder("1/");
                    sb.append(b.size());
                    textView.setText(sb.toString());
                    MvThemeData mvThemeData = (MvThemeData) b.get(0);
                    if (mvThemeData != null) {
                        if (!TextUtils.isEmpty(mvThemeData.mo94479f())) {
                            this.f119195a.setText(mvThemeData.mo94479f());
                        }
                        if (!TextUtils.isEmpty(mvThemeData.mo94481h())) {
                            this.f119196b.setText(mvThemeData.mo94481h());
                        }
                    }
                }
            } else {
                this.f119209o.mo94537b(b);
            }
        }
    }

    /* renamed from: a */
    public final void mo94457a(boolean z) {
        if (z) {
            this.f119200f.setText(this.f119200f.getContext().getResources().getString(R.string.d5q));
            this.f119200f.setClickable(true);
            return;
        }
        this.f119200f.setText(this.f119200f.getContext().getResources().getString(R.string.fo8));
        this.f119200f.setClickable(false);
    }

    public MvTemplateView(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet);
        this.f119219y = new C47298q();
        this.f119214t = false;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof FragmentActivity) {
                this.f119218x = (FragmentActivity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        this.f119217w = context.getResources().getColor(R.color.a4m);
        this.f119213s = C39618d.f101152P.mo83103a(C40790a.UseNewMvStruct);
        setClipChildren(false);
        setBackgroundColor(Color.parseColor("#C0000000"));
        LayoutInflater.from(context).inflate(R.layout.a62, this);
        this.f119195a = (AlwaysMarqueeTextView) findViewById(R.id.czk);
        this.f119196b = (AlwaysMarqueeTextView) findViewById(R.id.czj);
        this.f119197c = (TextView) findViewById(R.id.a1b);
        this.f119198d = (MvThumbnailRecyclerView) findViewById(R.id.cgc);
        this.f119215u = (ViewGroup) findViewById(R.id.b_c);
        this.f119200f = (CircularAnimateButton) findViewById(R.id.cs7);
        this.f119203i = findViewById(R.id.zr);
        this.f119204j = (DmtLoadingLayout) findViewById(R.id.bhk);
        this.f119199e = findViewById(R.id.bw8);
        this.f119216v = findViewById(R.id.ds3);
        this.f119200f.setOnClickListener(new C47687av() {
            /* renamed from: a */
            public final void mo59929a(View view) {
                boolean z;
                MvTemplateView mvTemplateView = MvTemplateView.this;
                MvThemeData b = mvTemplateView.f119209o.mo94536b(mvTemplateView.f119202h);
                if (mvTemplateView.f119207m == null || !mvTemplateView.f119207m.mo94511a(b, mvTemplateView.f119202h)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    MvTemplateView.this.mo94458b();
                }
            }
        });
        this.f119206l = findViewById(R.id.bp4);
        this.f119206l.setOnClickListener(new C47687av() {
            /* renamed from: a */
            public final void mo59929a(View view) {
                if (MvTemplateView.this.f119207m != null) {
                    MvTemplateView.this.f119207m.mo94508a(MvTemplateView.this.f119209o.mo94536b(MvTemplateView.this.f119202h), 2, MvTemplateView.this.f119202h);
                }
            }
        });
        if (this.f119213s) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f119199e.getLayoutParams();
            layoutParams.topMargin = (int) (((float) C43303dy.m94972c(getContext())) + C9432q.m18687b(getContext(), 32.0f));
            this.f119199e.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f119199e.getLayoutParams();
            layoutParams2.topMargin = (int) (((float) C43303dy.m94972c(getContext())) + C9432q.m18687b(getContext(), 68.5f));
            this.f119199e.setLayoutParams(layoutParams2);
        }
        this.f119208n = (MvThemeListViewPager) findViewById(R.id.ds2);
        this.f119208n.setOffscreenPageLimit(3);
        C47232b bVar = new C47232b(this.f119208n.getContext());
        bVar.mo94503a(this.f119208n);
        bVar.f119277a = 500;
        if (this.f119213s) {
            f = 0.0f;
        } else {
            f = 0.6f;
        }
        this.f119220z = new C47264f(f);
        this.f119193A = (int) C9432q.m18687b((Context) this.f119218x, 16.0f);
        this.f119208n.setPageMargin(this.f119193A);
        this.f119208n.setPageTransformer(true, this.f119220z);
        this.f119208n.setBounceScrollListener(new C47316a() {
            /* renamed from: a */
            public final void mo94470a() {
                MvTemplateView.this.f119195a.setAlpha(1.0f);
                MvTemplateView.this.f119196b.setAlpha(1.0f);
            }

            /* renamed from: a */
            public final void mo94471a(float f) {
                if (MvTemplateView.this.f119210p == 0) {
                    C47259a a = MvTemplateView.this.f119209o.getItem(0);
                    if (a != null) {
                        MvTemplateView.this.f119210p = a.mo94525a();
                    }
                }
                if (MvTemplateView.this.f119210p > 0 && f < 0.0f) {
                    float abs = 1.0f - ((Math.abs(f) / ((float) MvTemplateView.this.f119210p)) * 2.0f);
                    MvTemplateView.this.f119195a.setAlpha(abs);
                    MvTemplateView.this.f119196b.setAlpha(abs);
                }
            }
        });
        this.f119209o = new C47263e(this.f119218x.getSupportFragmentManager());
        this.f119208n.setAdapter(this.f119209o);
        this.f119208n.addOnPageChangeListener(new C0997e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                MvThemeData b = MvTemplateView.this.f119209o.mo94536b(i);
                if (b != null) {
                    if (MvTemplateView.this.f119201g != i) {
                        MvTemplateView mvTemplateView = MvTemplateView.this;
                        int i2 = MvTemplateView.this.f119201g;
                        mvTemplateView.f119195a.setText(b.mo94479f());
                        mvTemplateView.f119196b.setText(b.mo94481h());
                        TextView textView = mvTemplateView.f119197c;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i + 1);
                        sb.append("/");
                        sb.append(mvTemplateView.f119209o.getCount());
                        textView.setText(sb.toString());
                        C47259a a = mvTemplateView.mo94452a(i2);
                        if (!(a == null || a.f119333d == null)) {
                            a.mo94531e();
                        }
                        C47259a a2 = mvTemplateView.mo94452a(i);
                        if (!(a2 == null || a2.f119333d == null)) {
                            a2.mo94526b();
                        }
                        mvTemplateView.mo94454a(b);
                        if (mvTemplateView.f119207m != null) {
                            mvTemplateView.f119207m.mo94508a(b, 3, i);
                        }
                    }
                    MvTemplateView.this.f119201g = i;
                }
                MvTemplateView.this.f119202h = i;
                if (MvTemplateView.this.f119213s && MvTemplateView.this.f119214t) {
                    MvTemplateView.this.f119212r.mo94495a();
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
                C47718bf.m103288a(new C47270j(C47272b.SCROLL, C47271a.MAIN_TEMPLATE, i, f));
            }
        });
        this.f119208n.setHandleClickChange(!this.f119213s);
        this.f119216v.setOnTouchListener(new C47275m(this));
        if (this.f119213s) {
            this.f119215u.setVisibility(0);
            this.f119211q = new C47309a();
            this.f119211q.f119414b = new C47273k(this);
            this.f119211q.f119415c = new C47274l(this);
            this.f119198d.setAdapter(this.f119211q);
        }
        this.f119200f.setBackgroundColor(this.f119217w);
    }
}
