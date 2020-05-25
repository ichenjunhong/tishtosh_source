package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.p052a.C1385a;
import android.text.TextUtils;
import android.view.View;
import com.C2240a;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44086a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2212b.C44010a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2212b.C44011b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44284a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44285b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44286c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44290d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44291e;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44292f;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45426bi;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d */
public final class C44296d implements C44285b {

    /* renamed from: a */
    public VideoImageMixedView f112134a;

    /* renamed from: b */
    public C44286c f112135b;

    /* renamed from: c */
    public final ArrayList<MyMediaModel> f112136c = new ArrayList<>();

    /* renamed from: d */
    public C44291e f112137d;

    /* renamed from: e */
    public C44290d f112138e;

    /* renamed from: f */
    public boolean f112139f;

    /* renamed from: g */
    public boolean f112140g;

    /* renamed from: h */
    public boolean f112141h;

    /* renamed from: i */
    public C44086a f112142i;

    /* renamed from: j */
    public C44086a f112143j;

    /* renamed from: k */
    public C44086a f112144k;

    /* renamed from: l */
    public int f112145l;

    /* renamed from: m */
    public boolean f112146m;

    /* renamed from: n */
    private String f112147n;

    /* renamed from: o */
    private String f112148o;

    /* renamed from: p */
    private String f112149p;

    /* renamed from: q */
    private Drawable f112150q;

    /* renamed from: r */
    private Drawable f112151r;

    /* renamed from: s */
    private String f112152s;

    /* renamed from: t */
    private ArrayList<C44010a> f112153t;

    /* renamed from: u */
    private int f112154u = 1;

    /* renamed from: v */
    private int f112155v = 1;

    /* renamed from: w */
    private List<String> f112156w = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$a */
    public static final class C44297a implements C44291e {

        /* renamed from: a */
        final /* synthetic */ C44296d f112157a;

        C44297a(C44296d dVar) {
            this.f112157a = dVar;
        }

        /* renamed from: a */
        public final void mo89956a(MyMediaModel myMediaModel) {
            if (myMediaModel != null) {
                Iterator it = this.f112157a.f112136c.iterator();
                int i = 1;
                while (it.hasNext()) {
                    MyMediaModel myMediaModel2 = (MyMediaModel) it.next();
                    String str = myMediaModel.f95383b;
                    C52711k.m112236a((Object) myMediaModel2, "model");
                    if (C52711k.m112239a((Object) str, (Object) myMediaModel2.f95383b)) {
                        myMediaModel2.f111662r = -1;
                    } else {
                        myMediaModel2.f111662r = i;
                        i++;
                    }
                }
                this.f112157a.f112136c.remove(myMediaModel);
                this.f112157a.mo90188a(true, myMediaModel);
                C44086a aVar = this.f112157a.f112142i;
                if (aVar != null) {
                    aVar.mo89997g();
                }
                C44086a aVar2 = this.f112157a.f112143j;
                if (aVar2 != null) {
                    aVar2.mo89997g();
                }
                C44086a aVar3 = this.f112157a.f112144k;
                if (aVar3 != null) {
                    aVar3.mo89997g();
                }
                C44291e eVar = this.f112157a.f112137d;
                if (eVar != null) {
                    eVar.mo89956a(myMediaModel);
                }
                C44306f fVar = C44306f.f112168a;
                C26890h.m65011a("edit_clip_delete", C44306f.m97048a(myMediaModel.mo76676c()).f61491a);
            }
        }

        /* renamed from: a */
        public final void mo89957a(MyMediaModel myMediaModel, View view) {
            C44291e eVar = this.f112157a.f112137d;
            if (eVar != null) {
                eVar.mo89957a(myMediaModel, view);
            }
            if (myMediaModel != null) {
                C44306f fVar = C44306f.f112168a;
                C26890h.m65011a("edit_clip_preview", C44306f.m97048a(myMediaModel.mo76676c()).mo47829a("edit_way", "click").f61491a);
            }
        }

        /* renamed from: a */
        public final void mo89955a(int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (i < 0 || i >= this.f112157a.f112136c.size()) {
                z = false;
            } else {
                z = true;
            }
            if (i2 < 0 || i2 >= this.f112157a.f112136c.size()) {
                z2 = false;
            }
            if (z && z2) {
                Object remove = this.f112157a.f112136c.remove(i);
                C52711k.m112236a(remove, "selectMediaModelList.removeAt(from)");
                MyMediaModel myMediaModel = (MyMediaModel) remove;
                this.f112157a.f112136c.add(i2, myMediaModel);
                this.f112157a.mo90189b();
                C44086a aVar = this.f112157a.f112142i;
                if (aVar != null) {
                    aVar.mo89988a(i, i2);
                }
                C44086a aVar2 = this.f112157a.f112144k;
                if (aVar2 != null) {
                    aVar2.mo89988a(i, i2);
                }
                C44086a aVar3 = this.f112157a.f112143j;
                if (aVar3 != null) {
                    aVar3.mo89988a(i, i2);
                }
                C44291e eVar = this.f112157a.f112137d;
                if (eVar != null) {
                    eVar.mo89955a(i, i2);
                }
                C44306f fVar = C44306f.f112168a;
                C26890h.m65011a("edit_clips_order", C44306f.m97048a(myMediaModel.mo76676c()).mo47829a("edit_way", "press").f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$b */
    public static final class C44298b extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C44296d f112158a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$b$a */
        public static final class C44299a implements C44284a {

            /* renamed from: a */
            final /* synthetic */ C44298b f112159a;

            /* renamed from: b */
            final /* synthetic */ View f112160b;

            C44299a(C44298b bVar, View view) {
                this.f112159a = bVar;
                this.f112160b = view;
            }

            /* renamed from: a */
            public final void mo90009a(String str, boolean z) {
                if (!z) {
                    C44290d dVar = this.f112159a.f112158a.f112138e;
                    if (dVar != null) {
                        dVar.mo89954a(true);
                    }
                } else if (this.f112159a.f112158a.f112136c.size() > 1 || this.f112159a.f112158a.f112141h) {
                    View view = this.f112160b;
                    if (view != null) {
                        C10691a.m21548c(view.getContext(), (int) R.string.f7s).mo19066a();
                    }
                } else {
                    if (C45426bi.m98997a()) {
                        C44290d dVar2 = this.f112159a.f112158a.f112138e;
                        if (dVar2 != null) {
                            dVar2.mo89954a(true);
                        }
                    } else {
                        View view2 = this.f112160b;
                        if (view2 != null) {
                            C10691a.m21548c(view2.getContext(), (int) R.string.f7u).mo19066a();
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            Context context;
            if (!this.f112158a.f112146m) {
                if (this.f112158a.f112140g) {
                    if (view != null) {
                        context = view.getContext();
                    } else {
                        context = null;
                    }
                    if (context == null) {
                        C52711k.m112234a();
                    }
                    String string = context.getString(R.string.g0v);
                    C52711k.m112236a((Object) string, "v?.context!!.getString(R…creation_mv_footages_num)");
                    String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f112158a.f112145l)}, 1));
                    C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                    C50275d.m108534a(view.getContext(), a, 1).mo98174a();
                }
                C44290d dVar = this.f112158a.f112138e;
                if (dVar != null) {
                    dVar.mo89954a(false);
                }
            } else if (this.f112158a.f112140g || this.f112158a.f112139f) {
                C44290d dVar2 = this.f112158a.f112138e;
                if (dVar2 != null) {
                    dVar2.mo89954a(true);
                }
            } else if (!C44296d.m97019a((List<? extends MyMediaModel>) this.f112158a.f112136c)) {
                C44290d dVar3 = this.f112158a.f112138e;
                if (dVar3 != null) {
                    dVar3.mo89954a(true);
                }
            } else {
                C44300e.m97037a((List<? extends MediaModel>) this.f112158a.f112136c, (C44284a) new C44299a(this, view));
            }
        }

        C44298b(C44296d dVar, long j) {
            this.f112158a = dVar;
            super(1100);
        }
    }

    /* renamed from: a */
    public final void mo90180a(C44295c cVar) {
        this.f112137d = cVar.f112120a;
        this.f112138e = cVar.f112121b;
        this.f112139f = cVar.f112122c;
        this.f112141h = cVar.f112124e;
        this.f112142i = cVar.f112125f;
        this.f112143j = cVar.f112126g;
        this.f112144k = cVar.f112127h;
        this.f112155v = cVar.f112129j;
        this.f112154u = cVar.f112130k;
        this.f112152s = cVar.f112128i;
        this.f112156w = cVar.f112132m;
        this.f112140g = cVar.f112123d;
        this.f112153t = cVar.f112133n;
        if (this.f112140g) {
            this.f112145l = cVar.f112131l;
        } else {
            this.f112145l = C44300e.f112162b.mo90190a();
        }
    }

    /* renamed from: a */
    public final List<MyMediaModel> mo90177a() {
        return this.f112136c;
    }

    /* renamed from: c */
    private final int m97020c() {
        int size = (this.f112145l - this.f112136c.size()) - this.f112156w.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    /* renamed from: b */
    public final void mo90189b() {
        Iterator it = this.f112136c.iterator();
        int i = 1;
        while (it.hasNext()) {
            ((MyMediaModel) it.next()).f111662r = i;
            i++;
        }
    }

    /* renamed from: d */
    private final void m97021d() {
        Iterator it = this.f112136c.iterator();
        while (it.hasNext()) {
            MyMediaModel myMediaModel = (MyMediaModel) it.next();
            C52711k.m112236a((Object) myMediaModel, "mediaModel");
            String str = myMediaModel.f95383b;
            C52711k.m112236a((Object) str, "mediaModel.filePath");
            if (C44300e.m97039a(str)) {
                myMediaModel.f95386e = 3000;
                myMediaModel.f95390i = 720;
                myMediaModel.f95391j = 1280;
            }
        }
    }

    /* renamed from: e */
    private final void m97022e() {
        VideoImageMixedView videoImageMixedView = this.f112134a;
        if (videoImageMixedView == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        DmtTextView sureTextView = videoImageMixedView.getSureTextView();
        int size = this.f112136c.size();
        boolean a = m97019a((List<? extends MyMediaModel>) this.f112136c);
        boolean z = false;
        if (a || size == 1 || this.f112139f || this.f112141h) {
            if (this.f112141h) {
                if (size == 1) {
                    sureTextView.setText(sureTextView.getContext().getString(R.string.amf));
                } else {
                    String str = this.f112149p;
                    if (str == null) {
                        C52711k.m112237a("sureText");
                    }
                    String a2 = C2240a.m6772a(str, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
                    sureTextView.setText(a2);
                }
            } else if (this.f112139f) {
                String str2 = this.f112149p;
                if (str2 == null) {
                    C52711k.m112237a("sureText");
                }
                String a3 = C2240a.m6772a(str2, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                C52711k.m112236a((Object) a3, "java.lang.String.format(format, *args)");
                sureTextView.setText(a3);
            } else if (size == 1) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.cgm));
            } else {
                String str3 = this.f112148o;
                if (str3 == null) {
                    C52711k.m112237a("nextStepText");
                }
                String a4 = C2240a.m6772a(str3, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                C52711k.m112236a((Object) a4, "java.lang.String.format(format, *args)");
                sureTextView.setText(a4);
            }
        } else if (C44300e.m97043e()) {
            String str4 = this.f112148o;
            if (str4 == null) {
                C52711k.m112237a("nextStepText");
            }
            String a5 = C2240a.m6772a(str4, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C52711k.m112236a((Object) a5, "java.lang.String.format(format, *args)");
            sureTextView.setText(a5);
        } else {
            String str5 = this.f112147n;
            if (str5 == null) {
                C52711k.m112237a("photoMovieText");
            }
            String a6 = C2240a.m6772a(str5, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C52711k.m112236a((Object) a6, "java.lang.String.format(format, *args)");
            sureTextView.setText(a6);
        }
        if (this.f112140g) {
            sureTextView.setText(sureTextView.getContext().getString(R.string.amf));
        }
        if (size == 0) {
            m97018a(sureTextView, false);
            if (!this.f112140g) {
                VideoImageMixedView videoImageMixedView2 = this.f112134a;
                if (videoImageMixedView2 == null) {
                    C52711k.m112237a("videoImageMixedView");
                }
                videoImageMixedView2.mo90169a(false);
            }
            if (this.f112141h || this.f112139f || this.f112140g) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.amf));
            } else {
                sureTextView.setText(sureTextView.getContext().getString(R.string.cgm));
            }
        } else {
            if (a) {
                if (size >= this.f112154u) {
                    z = true;
                }
                m97018a(sureTextView, z);
            } else {
                if (size >= this.f112155v) {
                    z = true;
                }
                m97018a(sureTextView, z);
            }
            VideoImageMixedView videoImageMixedView3 = this.f112134a;
            if (videoImageMixedView3 == null) {
                C52711k.m112237a("videoImageMixedView");
            }
            videoImageMixedView3.mo90169a(true);
        }
    }

    /* renamed from: b */
    public final View mo90181b(int i) {
        VideoImageMixedView videoImageMixedView = this.f112134a;
        if (videoImageMixedView == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        C1332i layoutManager = videoImageMixedView.getMediaSelectRecyleView().getLayoutManager();
        if (layoutManager != null) {
            View c = layoutManager.mo4736c(i);
            if (c != null) {
                return c.findViewById(R.id.dp2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m97019a(List<? extends MyMediaModel> list) {
        if (C9190h.m18253a(list)) {
            return false;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        for (MyMediaModel c : list) {
            if (c.mo76676c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo90178a(int i) {
        VideoImageMixedView videoImageMixedView = this.f112134a;
        if (videoImageMixedView == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        C1332i layoutManager = videoImageMixedView.getMediaSelectRecyleView().getLayoutManager();
        if (layoutManager != null && layoutManager.mo4736c(i) == null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).mo4721a(i, 0);
        }
    }

    /* renamed from: a */
    public final void mo90179a(View view) {
        C44286c aVar;
        C52711k.m112240b(view, "contentView");
        this.f112134a = (VideoImageMixedView) view;
        VideoImageMixedView videoImageMixedView = this.f112134a;
        if (videoImageMixedView == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        videoImageMixedView.setVisibility(0);
        if (this.f112140g) {
            aVar = new C44011b();
        } else {
            aVar = new C44283a();
        }
        this.f112135b = aVar;
        VideoImageMixedView videoImageMixedView2 = this.f112134a;
        if (videoImageMixedView2 == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        RecyclerView mediaSelectRecyleView = videoImageMixedView2.getMediaSelectRecyleView();
        C44286c cVar = this.f112135b;
        if (cVar == null) {
            C52711k.m112237a("videoImageMixedAdapter");
        }
        mediaSelectRecyleView.setAdapter(cVar);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "contentView.getContext()");
        String string = context.getResources().getString(R.string.b88);
        C52711k.m112236a((Object) string, "contentView.getContext()…g.generating_photo_films)");
        this.f112147n = string;
        Context context2 = view.getContext();
        C52711k.m112236a((Object) context2, "contentView.getContext()");
        String string2 = context2.getResources().getString(R.string.cgo);
        C52711k.m112236a((Object) string2, "contentView.getContext()…ing.next_step_with_count)");
        this.f112148o = string2;
        Context context3 = view.getContext();
        C52711k.m112236a((Object) context3, "contentView.getContext()");
        String string3 = context3.getResources().getString(R.string.d53);
        C52711k.m112236a((Object) string3, "contentView.getContext()…record_choose_photo_sure)");
        this.f112149p = string3;
        Context context4 = view.getContext();
        C52711k.m112236a((Object) context4, "contentView.getContext()");
        int a = (int) C20141b.m49696a(view.getContext(), 2.0f);
        Drawable a2 = C42430at.m93196a(0, context4.getResources().getColor(R.color.z_), 0, a);
        C52711k.m112236a((Object) a2, "DmtDesignDrawableFactory…T, clickColor, 0, radius)");
        this.f112150q = a2;
        Drawable a3 = C42430at.m93196a(0, 253106211, 0, a);
        C52711k.m112236a((Object) a3, "DmtDesignDrawableFactory…T, 0x0F161823, 0, radius)");
        this.f112151r = a3;
        VideoImageMixedView videoImageMixedView3 = this.f112134a;
        if (videoImageMixedView3 == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        String str = this.f112152s;
        boolean z = this.f112139f;
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            DmtTextView dmtTextView = videoImageMixedView3.f112093b;
            if (dmtTextView == null) {
                C52711k.m112237a("hintTextView");
            }
            dmtTextView.setText(charSequence);
        } else if (z) {
            DmtTextView dmtTextView2 = videoImageMixedView3.f112093b;
            if (dmtTextView2 == null) {
                C52711k.m112237a("hintTextView");
            }
            dmtTextView2.setText("");
        }
        m97022e();
        if (!this.f112141h) {
            C44300e eVar = C44300e.f112162b;
            if (C44300e.m97041c()) {
                C0013i.m16a((Callable<TResult>) C44303c.f112165a);
            }
        }
        if (this.f112140g) {
            C44286c cVar2 = this.f112135b;
            if (cVar2 == null) {
                C52711k.m112237a("videoImageMixedAdapter");
            }
            cVar2.mo89840a(this.f112154u);
            C44286c cVar3 = this.f112135b;
            if (cVar3 == null) {
                C52711k.m112237a("videoImageMixedAdapter");
            }
            cVar3.mo89843a(this.f112153t);
            VideoImageMixedView videoImageMixedView4 = this.f112134a;
            if (videoImageMixedView4 == null) {
                C52711k.m112237a("videoImageMixedView");
            }
            videoImageMixedView4.mo90169a(true);
        } else {
            C44286c cVar4 = this.f112135b;
            if (cVar4 == null) {
                C52711k.m112237a("videoImageMixedAdapter");
            }
            C1385a aVar2 = new C1385a(new C44292f(cVar4));
            VideoImageMixedView videoImageMixedView5 = this.f112134a;
            if (videoImageMixedView5 == null) {
                C52711k.m112237a("videoImageMixedView");
            }
            aVar2.mo5444a(videoImageMixedView5.getMediaSelectRecyleView());
        }
        C44286c cVar5 = this.f112135b;
        if (cVar5 == null) {
            C52711k.m112237a("videoImageMixedAdapter");
        }
        cVar5.f112104e = new C44297a(this);
        VideoImageMixedView videoImageMixedView6 = this.f112134a;
        if (videoImageMixedView6 == null) {
            C52711k.m112237a("videoImageMixedView");
        }
        videoImageMixedView6.getSureTextView().setOnClickListener(new C44298b(this, 1100));
    }

    /* renamed from: a */
    private final void m97018a(DmtTextView dmtTextView, boolean z) {
        if (z) {
            if (dmtTextView != null) {
                dmtTextView.setTextColor(-1);
            }
            if (dmtTextView != null) {
                Drawable drawable = this.f112150q;
                if (drawable == null) {
                    C52711k.m112237a("clickDrawable");
                }
                dmtTextView.setBackground(drawable);
            }
            this.f112146m = true;
            return;
        }
        if (dmtTextView != null) {
            dmtTextView.setTextColor(1461065763);
        }
        if (dmtTextView != null) {
            Drawable drawable2 = this.f112151r;
            if (drawable2 == null) {
                C52711k.m112237a("unClickDrawable");
            }
            dmtTextView.setBackground(drawable2);
        }
        this.f112146m = false;
    }

    /* renamed from: a */
    public final int mo90175a(int i, int i2) {
        int size = this.f112136c.size();
        if (i2 == 6) {
            return 10;
        }
        int i3 = 2;
        if (this.f112141h) {
            m97021d();
            return 2;
        } else if (i == 1) {
            return i;
        } else {
            if (size == 1) {
                Object obj = this.f112136c.get(0);
                C52711k.m112236a(obj, "selectMediaModelList[0]");
                if (!((MyMediaModel) obj).mo76676c()) {
                    i3 = i2 == 1 ? 5 : 3;
                } else if (i2 == 1) {
                    i3 = 6;
                }
            } else if (m97019a((List<? extends MyMediaModel>) this.f112136c) || C44300e.m97043e()) {
                m97021d();
            } else {
                i3 = 4;
            }
            return i3;
        }
    }

    /* renamed from: a */
    public final int mo90188a(boolean z, MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return -1;
        }
        C44286c cVar = this.f112135b;
        if (cVar == null) {
            C52711k.m112237a("videoImageMixedAdapter");
        }
        cVar.mo89842a(myMediaModel);
        this.f112136c.remove(myMediaModel);
        mo90189b();
        m97022e();
        if (this.f112140g) {
            VideoImageMixedView videoImageMixedView = this.f112134a;
            if (videoImageMixedView == null) {
                C52711k.m112237a("videoImageMixedView");
            }
            C44286c cVar2 = this.f112135b;
            if (cVar2 == null) {
                C52711k.m112237a("videoImageMixedAdapter");
            }
            videoImageMixedView.mo90168a(cVar2.mo89839a());
        }
        return m97020c();
    }

    /* renamed from: a */
    public final int mo90176a(MyMediaModel myMediaModel, boolean z, boolean z2) {
        int i;
        if (!z) {
            i = mo90188a(false, myMediaModel);
        } else if (myMediaModel == null) {
            i = -1;
        } else {
            this.f112136c.add(myMediaModel);
            C44286c cVar = this.f112135b;
            if (cVar == null) {
                C52711k.m112237a("videoImageMixedAdapter");
            }
            cVar.mo89844b(myMediaModel);
            mo90189b();
            m97022e();
            VideoImageMixedView videoImageMixedView = this.f112134a;
            if (videoImageMixedView == null) {
                C52711k.m112237a("videoImageMixedView");
            }
            C44286c cVar2 = this.f112135b;
            if (cVar2 == null) {
                C52711k.m112237a("videoImageMixedAdapter");
            }
            videoImageMixedView.mo90168a(cVar2.mo89839a());
            i = m97020c();
        }
        if (z2) {
            C44086a aVar = this.f112144k;
            if (aVar != null) {
                aVar.mo89994b(i);
            }
        } else {
            C44086a aVar2 = this.f112143j;
            if (aVar2 != null) {
                aVar2.mo89994b(i);
            }
        }
        C44086a aVar3 = this.f112142i;
        if (aVar3 != null) {
            aVar3.mo89994b(i);
        }
        if (!z) {
            C44086a aVar4 = this.f112143j;
            if (aVar4 != null) {
                aVar4.mo89997g();
            }
            C44086a aVar5 = this.f112144k;
            if (aVar5 != null) {
                aVar5.mo89997g();
            }
            C44086a aVar6 = this.f112142i;
            if (aVar6 != null) {
                aVar6.mo89997g();
            }
        } else if (i == 0) {
            C44086a aVar7 = this.f112143j;
            if (aVar7 != null) {
                aVar7.mo89997g();
            }
            C44086a aVar8 = this.f112144k;
            if (aVar8 != null) {
                aVar8.mo89997g();
            }
            C44086a aVar9 = this.f112142i;
            if (aVar9 != null) {
                aVar9.mo89997g();
            }
        }
        return mo90177a().size();
    }
}
