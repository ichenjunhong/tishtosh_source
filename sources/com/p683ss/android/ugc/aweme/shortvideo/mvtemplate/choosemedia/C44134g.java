package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22808c;
import com.p683ss.android.ugc.aweme.p1361ap.C22818f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.C43037a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.C44032a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44038c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44083d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g */
public final class C44134g extends C44086a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f111810a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44134g.class), "videoLegalChecker", "getVideoLegalChecker()Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;"))};

    /* renamed from: y */
    public static final C44135a f111811y = new C44135a(null);

    /* renamed from: A */
    private MultiSelectView f111812A;

    /* renamed from: B */
    private final C52668f f111813B = C52732g.m112285a(new C44143h(this));

    /* renamed from: C */
    private HashMap f111814C;

    /* renamed from: b */
    C44038c f111815b;

    /* renamed from: c */
    public C44082c f111816c;

    /* renamed from: v */
    public boolean f111817v = true;

    /* renamed from: w */
    public boolean f111818w;

    /* renamed from: x */
    public long f111819x = C43307ea.m94995a();

    /* renamed from: z */
    private DmtTextView f111820z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$a */
    public static final class C44135a {
        private C44135a() {
        }

        public /* synthetic */ C44135a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$b */
    static final class C44136b extends C52712l implements C52682m<String, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44134g f111821a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f111822b;

        /* renamed from: c */
        final /* synthetic */ String f111823c;

        /* renamed from: d */
        final /* synthetic */ C52670a f111824d;

        C44136b(C44134g gVar, MediaModel mediaModel, String str, C52670a aVar) {
            this.f111821a = gVar;
            this.f111822b = mediaModel;
            this.f111823c = str;
            this.f111824d = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            long longValue = ((Number) obj2).longValue();
            C52711k.m112240b(str, "checkerType");
            C23569o.m57776a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            C44134g.m96783a(this.f111822b, str, 0, 0, longValue, this.f111823c);
            if (this.f111821a.getActivity() == null || !this.f111821a.isViewValid()) {
                this.f111821a.f111818w = false;
            } else {
                this.f111824d.invoke();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$c */
    static final class C44137c extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44134g f111825a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f111826b;

        /* renamed from: c */
        final /* synthetic */ String f111827c;

        C44137c(C44134g gVar, MediaModel mediaModel, String str) {
            this.f111825a = gVar;
            this.f111826b = mediaModel;
            this.f111827c = str;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            long longValue = ((Number) obj2).longValue();
            int intValue = ((Number) obj3).intValue();
            String str2 = (String) obj4;
            C52711k.m112240b(str, "checkerType");
            C52711k.m112240b(str2, "errorMsg");
            this.f111825a.f111818w = false;
            this.f111825a.mo90027a(this.f111826b, str, intValue, longValue, this.f111827c, str2);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$d */
    static final class C44138d implements C44083d {

        /* renamed from: a */
        final /* synthetic */ C44134g f111828a;

        C44138d(C44134g gVar) {
            this.f111828a = gVar;
        }

        /* renamed from: a */
        public final void mo89972a(View view, final MediaModel mediaModel) {
            String str;
            if (mediaModel != null) {
                MvImageChooseAdapter mvImageChooseAdapter = this.f111828a.f111677d;
                C52711k.m112236a((Object) mvImageChooseAdapter, "mediaAdapter");
                boolean z = false;
                if (mvImageChooseAdapter.f111640h) {
                    C44134g gVar = this.f111828a;
                    if (!(mediaModel == null || view == null || gVar.f111818w)) {
                        gVar.f111818w = true;
                        gVar.mo90029a(true, mediaModel, new C44142g(gVar, mediaModel, view));
                        z = true;
                    }
                    if (!z) {
                    }
                } else if (!C48016e.m103944b(mediaModel.f95383b)) {
                    Context activity = this.f111828a.getActivity();
                    FragmentActivity activity2 = this.f111828a.getActivity();
                    if (activity2 != null) {
                        Resources resources = activity2.getResources();
                        if (resources != null) {
                            str = resources.getString(R.string.bex);
                            C10691a.m21545b(activity, str).mo19066a();
                        }
                    }
                    str = null;
                    C10691a.m21545b(activity, str).mo19066a();
                } else {
                    this.f111828a.mo90029a(false, mediaModel, new C52670a<C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44138d f111829a;

                        {
                            this.f111829a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            C44082c cVar = this.f111829a.f111828a.f111816c;
                            if (cVar != null) {
                                cVar.mo89950b(mediaModel);
                            }
                            return C52860x.f131107a;
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$e */
    public static final class C44140e extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C44134g f111831c;

        /* renamed from: d */
        final /* synthetic */ WrapGridLayoutManager f111832d;

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (this.f111831c.f111677d.getItemViewType(i) == 1) {
                return this.f111832d.f4521b;
            }
            return 1;
        }

        C44140e(C44134g gVar, WrapGridLayoutManager wrapGridLayoutManager) {
            this.f111831c = gVar;
            this.f111832d = wrapGridLayoutManager;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$f */
    public static final class C44141f implements C44032a {

        /* renamed from: a */
        final /* synthetic */ C44134g f111833a;

        C44141f(C44134g gVar) {
            this.f111833a = gVar;
        }

        /* renamed from: a */
        public final void mo70209a(boolean z) {
            MvImageChooseAdapter mvImageChooseAdapter = this.f111833a.f111677d;
            C52711k.m112236a((Object) mvImageChooseAdapter, "mediaAdapter");
            mvImageChooseAdapter.mo89966a(z);
            if (z) {
                this.f111833a.mo90028a(true);
            } else {
                this.f111833a.mo90028a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$g */
    static final class C44142g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44134g f111834a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f111835b;

        /* renamed from: c */
        final /* synthetic */ View f111836c;

        C44142g(C44134g gVar, MediaModel mediaModel, View view) {
            this.f111834a = gVar;
            this.f111835b = mediaModel;
            this.f111836c = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44082c cVar = this.f111834a.f111816c;
            if (cVar != null && (this.f111835b instanceof MyMediaModel)) {
                cVar.mo89945a((MyMediaModel) this.f111835b, this.f111836c);
                this.f111834a.f111818w = false;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g$h */
    static final class C44143h extends C52712l implements C52670a<C22808c> {

        /* renamed from: a */
        final /* synthetic */ C44134g f111837a;

        C44143h(C44134g gVar) {
            this.f111837a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f111837a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return new C22808c(activity);
        }
    }

    /* renamed from: a */
    private final C22818f m96782a() {
        return (C22818f) this.f111813B.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f111814C != null) {
            this.f111814C.clear();
        }
    }

    /* renamed from: a */
    public final void mo90028a(boolean z) {
        String str;
        C22818f a = m96782a();
        if (z) {
            str = "enter_from_multi";
        } else {
            str = "enter_from_single";
        }
        a.mo47262a(str);
        C44038c cVar = this.f111815b;
        if (cVar != null) {
            cVar.mo89934a(z);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        MvImageChooseAdapter mvImageChooseAdapter = new MvImageChooseAdapter(getContext(), 4, 1.0d, 1.5f, 0, 1);
        this.f111677d = mvImageChooseAdapter;
        this.f111677d.f111645m = this.f111689t;
        MvImageChooseAdapter mvImageChooseAdapter2 = this.f111677d;
        C52711k.m112236a((Object) mvImageChooseAdapter2, "mediaAdapter");
        mvImageChooseAdapter2.mo89966a(this.f111684o);
        this.f111677d.f111641i = true;
        this.f111677d.f111639g = this.f111816c;
        this.f111677d.f111638f = new C44138d(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(null, 4);
        wrapGridLayoutManager.f4526g = new C44140e(this, wrapGridLayoutManager);
        RecyclerView recyclerView = this.f111678e;
        C52711k.m112236a((Object) recyclerView, "imageGridView");
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        this.f111678e.mo4798a((C1331h) new C23745a(4, (int) C9432q.m18687b(getContext(), 1.0f), false));
        this.f111677d.f111643k = this.f111678e;
        RecyclerView recyclerView2 = this.f111678e;
        C52711k.m112236a((Object) recyclerView2, "imageGridView");
        recyclerView2.setAdapter(this.f111677d);
        this.f111677d.f111633a = this.f111683n;
        this.f111677d.f111634b = mo89998h();
        DmtLoadingLayout dmtLoadingLayout = this.f111682m;
        C52711k.m112236a((Object) dmtLoadingLayout, "loadingDialog");
        dmtLoadingLayout.setVisibility(0);
        if (this.f111684o) {
            this.f111677d.mo89969c(this.f111687r);
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("forbid_init_multi_mode", false)) {
            return;
        }
        if ((this.f111817v && C44300e.m97042d()) || C44300e.f112162b.mo90192a(this.f111689t)) {
            MvImageChooseAdapter mvImageChooseAdapter3 = this.f111677d;
            C52711k.m112236a((Object) mvImageChooseAdapter3, "mediaAdapter");
            mvImageChooseAdapter3.mo89966a(true);
            MultiSelectView multiSelectView = this.f111812A;
            if (multiSelectView == null) {
                C52711k.m112237a("multiSelectView");
            }
            multiSelectView.setVisibility(8);
            m96782a().mo47262a("enter_from_multi");
        }
    }

    /* renamed from: a */
    public final void mo89992a(List<? extends MyMediaModel> list, boolean z) {
        super.mo89992a(list, z);
        if (list != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f111682m;
            C52711k.m112236a((Object) dmtLoadingLayout, "loadingDialog");
            dmtLoadingLayout.setVisibility(8);
            if (list.isEmpty()) {
                DmtTextView dmtTextView = this.f111820z;
                if (dmtTextView == null) {
                    C52711k.m112237a("noVideoHintTextView");
                }
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.f111820z;
                if (dmtTextView2 == null) {
                    C52711k.m112237a("noVideoHintTextView");
                }
                dmtTextView2.setText(R.string.ci9);
            } else {
                DmtTextView dmtTextView3 = this.f111820z;
                if (dmtTextView3 == null) {
                    C52711k.m112237a("noVideoHintTextView");
                }
                dmtTextView3.setVisibility(8);
            }
            if (z) {
                this.f111677d.mo89965a(list);
            } else {
                this.f111677d.mo89968b(list);
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f111688s;
            C52711k.m112236a((Object) l, "onCreateViewTime");
            C47702b.f120193a.mo94984a("tool_performance_fetch_album_assets", C42438az.m93209a().mo86524a("duration", currentTimeMillis - l.longValue()).mo86523a("type", 1).mo86523a("count", list.size()).f107329a);
        }
    }

    /* renamed from: a */
    public final void mo90029a(boolean z, MediaModel mediaModel, C52670a<C52860x> aVar) {
        String str;
        long j;
        if (z) {
            str = "preview";
        } else {
            str = "select";
        }
        if (z) {
            j = 0;
        } else {
            j = this.f111819x;
        }
        m96782a().mo47261a(mediaModel, j, -1, new C44136b(this, mediaModel, str, aVar), new C44137c(this, mediaModel, str));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        C52711k.m112240b(layoutInflater, "inflater");
        boolean z2 = false;
        this.f111680k = layoutInflater.inflate(R.layout.atj, viewGroup, false);
        this.f111678e = (RecyclerView) this.f111680k.findViewById(R.id.amf);
        View findViewById = this.f111680k.findViewById(R.id.da5);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.tv_hint)");
        this.f111820z = (DmtTextView) findViewById;
        this.f111682m = (DmtLoadingLayout) this.f111680k.findViewById(R.id.dpg);
        View findViewById2 = this.f111680k.findViewById(R.id.elz);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.multi_select_view)");
        this.f111812A = (MultiSelectView) findViewById2;
        MultiSelectView multiSelectView = this.f111812A;
        if (multiSelectView == null) {
            C52711k.m112237a("multiSelectView");
        }
        if (!this.f111817v || this.f111684o) {
            i = 8;
        } else {
            i = 0;
        }
        multiSelectView.setVisibility(i);
        MultiSelectView multiSelectView2 = this.f111812A;
        if (multiSelectView2 == null) {
            C52711k.m112237a("multiSelectView");
        }
        multiSelectView2.setOnModeChangeListener(new C44141f(this));
        if (this.f111689t == -1 || this.f111689t == 1 || this.f111689t == 6 || this.f111689t == 8) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C43036f fVar = C43036f.f108637b;
            MultiSelectView multiSelectView3 = this.f111812A;
            if (multiSelectView3 == null) {
                C52711k.m112237a("multiSelectView");
            }
            View view = multiSelectView3;
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            Activity activity2 = activity;
            C52711k.m112240b(view, "anchor");
            C52711k.m112240b(activity2, "activity");
            C23543g a = C23541e.m57714a(C39629l.m88233b(), C39630m.m88234a().mo58623u().mo74236a());
            if (!a.mo48705a("bubble_to_stick_point_hint_shown", false) && C43036f.m94312e() && C39629l.m88232a().mo58583n().mo83103a(C40790a.ShowMusicStickPointBubble) && view.getParent() != null && !activity2.isFinishing() && !C44300e.m97041c()) {
                view.postDelayed(new C43037a(activity2, view, new C10661a(activity2).mo19015b((int) R.string.f9_).mo19010a(5000).mo19014a(), a), 500);
            }
        }
        int b = C39618d.f101152P.mo83104b(C40790a.EnableAlbumTimelineAndFullScreenPreview);
        if (this.f111678e instanceof FastScrollRecyclerView) {
            RecyclerView recyclerView = this.f111678e;
            if (recyclerView != null) {
                FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) recyclerView;
                if ((b == 2 || b == 3) && this.f111689t != 1) {
                    z2 = true;
                }
                fastScrollRecyclerView.setFastScrollEnabled(z2);
                RecyclerView recyclerView2 = this.f111678e;
                if (recyclerView2 != null) {
                    ((FastScrollRecyclerView) recyclerView2).setFastScrollListener(this.f111690u);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView");
            }
        }
        return this.f111680k;
    }

    /* renamed from: a */
    public static void m96783a(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C23569o.m57780a("aweme_video_import_duration", jSONObject, C23088c.m56631a().mo47824a("status", String.valueOf(i)).mo47824a("scene_name", str2).mo47822a("errorCode", Integer.valueOf(i2)).mo47824a("type", str).mo47822a("width", Integer.valueOf(mediaModel.f95390i)).mo47822a("height", Integer.valueOf(mediaModel.f95391j)).mo47825b());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo90027a(MediaModel mediaModel, String str, int i, long j, String str2, String str3) {
        if (getActivity() == null || !isViewValid()) {
            return;
        }
        int i2 = i;
        C44153p.m96803a(getActivity(), i, (int) this.f111819x);
        C23569o.m57776a("aweme_movie_import_error_rate", 1, C23088c.m56631a().mo47824a("errorCode", String.valueOf(i)).mo47824a("errorMsg", str3).mo47825b());
        m96783a(mediaModel, str, 1, i2, j, str2);
    }
}
