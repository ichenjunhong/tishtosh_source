package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31496i;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43905g;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterViewImpl */
public class FilterViewImpl implements C0183j, C31408ak {

    /* renamed from: a */
    AppCompatActivity f82174a;

    /* renamed from: b */
    FilterScrollerModule f82175b;

    /* renamed from: c */
    C31461i f82176c;

    /* renamed from: d */
    public C31384a f82177d;

    /* renamed from: e */
    public C31382b f82178e;

    /* renamed from: f */
    FilterBeautySeekBar f82179f;

    /* renamed from: g */
    public C31459g f82180g;

    /* renamed from: h */
    public List<C43905g> f82181h;

    /* renamed from: i */
    public C43905g f82182i;

    /* renamed from: j */
    Boolean f82183j;

    /* renamed from: k */
    public C31631c f82184k;

    /* renamed from: l */
    Runnable f82185l;

    /* renamed from: m */
    C31499l f82186m;

    /* renamed from: n */
    private View f82187n;

    /* renamed from: o */
    private FrameLayout f82188o;

    /* renamed from: p */
    private FrameLayout f82189p;

    /* renamed from: q */
    private C31384a f82190q;

    /* renamed from: r */
    private boolean f82191r;

    /* renamed from: s */
    private boolean f82192s;

    /* renamed from: t */
    private AVETParameter f82193t;

    /* renamed from: u */
    private C31407aj f82194u;

    /* renamed from: v */
    private final C50207b f82195v;

    /* renamed from: w */
    private C50206a f82196w;

    /* renamed from: x */
    private C52668f<C31496i> f82197x;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterViewImpl$a */
    public static class C31381a {

        /* renamed from: a */
        public C31480q f82203a;

        /* renamed from: b */
        private C31499l f82204b = C39629l.m88232a().mo58584o().mo64334d();

        /* renamed from: c */
        private C52668f<C31496i> f82205c = C52732g.m112285a(C31404ag.f82245a);

        /* renamed from: a */
        public final C31408ak mo64285a() {
            return new FilterViewImpl(this.f82203a, this.f82204b, this.f82205c);
        }

        /* renamed from: a */
        public final C31381a mo64282a(C31407aj ajVar) {
            this.f82203a.f82374e = ajVar;
            return this;
        }

        /* renamed from: a */
        public final C31381a mo64283a(C43905g gVar) {
            this.f82203a.f82372c = gVar;
            return this;
        }

        /* renamed from: a */
        public final C31381a mo64284a(AVETParameter aVETParameter) {
            this.f82203a.f82377h = aVETParameter;
            return this;
        }

        public C31381a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
            this.f82203a = new C31480q(appCompatActivity);
            this.f82203a.f82370a = frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterViewImpl$b */
    static class C31382b implements C0184k {

        /* renamed from: a */
        public C0185l f82206a = new C0185l(this);

        public final C0176h getLifecycle() {
            return this.f82206a;
        }

        C31382b() {
        }
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f82187n = null;
        this.f82181h.clear();
        this.f82174a = null;
    }

    /* renamed from: b */
    public final void mo64271b() {
        if (this.f82190q != null) {
            this.f82190q.mo50223b(new C24453c());
        }
        if (this.f82195v != null) {
            this.f82195v.mo94978b(this.f82196w);
        }
    }

    /* renamed from: c */
    public final void mo64272c() {
        if (this.f82174a != null) {
            ((FilterViewModel) C0214z.m440a((FragmentActivity) this.f82174a).mo359a(FilterViewModel.class)).mo64286a().setValue(null);
        }
    }

    /* renamed from: a */
    public final void mo64269a() {
        C31375b bVar;
        C31374a aVar;
        this.f82188o.removeAllViews();
        final AppCompatActivity appCompatActivity = this.f82174a;
        FrameLayout frameLayout = this.f82188o;
        C31459g gVar = null;
        if (this.f82187n == null) {
            appCompatActivity.getLifecycle().mo324a(this);
            this.f82187n = LayoutInflater.from(appCompatActivity).inflate(R.layout.g7, frameLayout, false);
            LinearLayout linearLayout = (LinearLayout) this.f82187n.findViewById(R.id.csz);
            this.f82179f = (FilterBeautySeekBar) this.f82187n.findViewById(R.id.ch2);
            if (this.f82183j.booleanValue()) {
                this.f82179f.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                    public final void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public final void onStopTrackingTouch(SeekBar seekBar) {
                        if (FilterViewImpl.this.f82180g != null && FilterViewImpl.this.f82184k != null) {
                            FilterViewImpl.this.f82182i.mo64278c(FilterViewImpl.this.f82180g);
                        }
                    }

                    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        if (FilterViewImpl.this.f82180g != null && FilterViewImpl.this.f82184k != null) {
                            FilterViewImpl.this.f82182i.mo64275a(FilterViewImpl.this.f82180g, i);
                        }
                    }
                });
            } else {
                this.f82179f.setVisibility(8);
            }
            this.f82190q = new C31384a(frameLayout, this.f82187n, linearLayout);
            this.f82187n.findViewById(R.id.ctg).setOnClickListener(new C31399ab(this));
            this.f82190q.mo50220a((C24458h) new C24459a() {
                /* renamed from: d */
                public final void mo50225d() {
                    FilterViewImpl.this.f82178e.f82206a.mo333a(C0178b.CREATED);
                    FilterViewImpl.this.f82182i.mo64277b(null);
                }

                /* renamed from: a */
                public final void mo50217a() {
                    FilterViewImpl.this.f82178e.f82206a.mo333a(C0178b.STARTED);
                    ((FilterViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(FilterViewModel.class)).mo64287b().setValue(new C52847n(FilterViewImpl.this.f82180g, null));
                    FilterViewImpl.this.f82182i.mo64274a(null);
                }
            });
            if (this.f82189p != null) {
                C31499l lVar = this.f82186m;
                C52711k.m112240b(appCompatActivity, "activity");
                C52711k.m112240b(lVar, "filterRepository");
                this.f82176c = new C31461i(new C31472l(appCompatActivity, lVar), appCompatActivity, this.f82189p, (C31496i) this.f82197x.getValue());
                this.f82177d = new C31384a(frameLayout, this.f82187n, linearLayout);
                this.f82176c.f82342f = new C24459a() {
                    /* renamed from: a */
                    public final void mo50217a() {
                        FilterViewImpl.this.f82177d.mo50223b(new C24453c());
                    }

                    /* renamed from: c */
                    public final void mo50224c() {
                        FilterViewImpl.this.f82177d.mo50219a((C24454d) new C24453c());
                    }
                };
            }
            C31407aj ajVar = this.f82194u;
            C31499l lVar2 = this.f82186m;
            LinearLayout linearLayout2 = (LinearLayout) this.f82187n.findViewById(R.id.af8);
            AVETParameter aVETParameter = this.f82193t;
            C31461i iVar = this.f82176c;
            boolean z = this.f82192s;
            boolean z2 = this.f82191r;
            if (this.f82183j.booleanValue()) {
                bVar = new C31400ac(this);
            } else {
                bVar = null;
            }
            if (this.f82183j.booleanValue()) {
                aVar = new C31401ad(this);
            } else {
                aVar = null;
            }
            FilterScrollerModule filterScrollerModule = new FilterScrollerModule(appCompatActivity, ajVar, lVar2, linearLayout2, aVETParameter, iVar, z, z2, bVar, aVar);
            this.f82175b = filterScrollerModule;
            ((FilterViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(FilterViewModel.class)).mo64286a().observe(appCompatActivity, new C31402ae(this));
            ((FilterViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(FilterViewModel.class)).mo64287b().observe(this.f82178e, new C31403af(this));
        } else {
            FilterScrollerModule filterScrollerModule2 = this.f82175b;
            if (filterScrollerModule2.f82151e != null) {
                filterScrollerModule2.f82151e.notifyDataSetChanged();
                C52847n nVar = (C52847n) ((FilterViewModel) C0214z.m440a((FragmentActivity) filterScrollerModule2.f82149c).mo359a(FilterViewModel.class)).mo64287b().getValue();
                if (nVar != null) {
                    gVar = (C31459g) nVar.getFirst();
                }
                if (gVar != null) {
                    filterScrollerModule2.mo64259a(gVar);
                    filterScrollerModule2.f82151e.mo64322b(gVar);
                }
            }
        }
        this.f82190q.mo50219a((C24454d) new C24453c());
        if (this.f82195v != null) {
            this.f82195v.mo94977a(this.f82196w);
        }
    }

    /* renamed from: a */
    public final void mo64270a(C31459g gVar) {
        if (this.f82174a != null) {
            FilterViewModel.m73161a(this.f82174a, gVar);
        }
    }

    private FilterViewImpl(C31480q qVar, C31499l lVar, C52668f<C31496i> fVar) {
        this.f82181h = new ArrayList();
        this.f82182i = new C43905g() {
            /* renamed from: a */
            public final void mo64274a(C31459g gVar) {
                for (C43905g a : FilterViewImpl.this.f82181h) {
                    a.mo64274a(gVar);
                }
            }

            /* renamed from: b */
            public final void mo64277b(C31459g gVar) {
                for (C43905g b : FilterViewImpl.this.f82181h) {
                    b.mo64277b(gVar);
                }
            }

            /* renamed from: c */
            public final void mo64278c(C31459g gVar) {
                for (C43905g c : FilterViewImpl.this.f82181h) {
                    c.mo64278c(gVar);
                }
            }

            /* renamed from: a */
            public final void mo64275a(C31459g gVar, int i) {
                for (C43905g a : FilterViewImpl.this.f82181h) {
                    a.mo64275a(gVar, i);
                }
            }

            /* renamed from: a */
            public final void mo64276a(C31459g gVar, String str) {
                for (C43905g a : FilterViewImpl.this.f82181h) {
                    a.mo64276a(gVar, str);
                }
            }
        };
        this.f82196w = new C31398aa(this);
        this.f82186m = lVar;
        this.f82197x = fVar;
        this.f82174a = qVar.f82380k;
        this.f82188o = qVar.f82370a;
        this.f82189p = qVar.f82371b;
        this.f82194u = qVar.f82374e;
        this.f82193t = qVar.f82377h;
        this.f82191r = qVar.f82375f;
        this.f82192s = qVar.f82376g;
        C43905g gVar = qVar.f82372c;
        if (gVar != null) {
            this.f82181h.add(gVar);
        }
        this.f82195v = qVar.f82373d;
        this.f82178e = new C31382b();
        this.f82183j = Boolean.valueOf(qVar.f82378i);
        this.f82184k = qVar.f82379j;
    }
}
