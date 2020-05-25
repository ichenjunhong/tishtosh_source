package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22808c;
import com.p683ss.android.ugc.aweme.p1361ap.C22818f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44083d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.utils.C47702b;
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
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e */
public final class C44126e extends C44086a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f111788a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44126e.class), "videoLegalChecker", "getVideoLegalChecker()Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;"))};

    /* renamed from: b */
    public C44082c f111789b;

    /* renamed from: c */
    public boolean f111790c;

    /* renamed from: v */
    public long f111791v = C43307ea.m94995a();

    /* renamed from: w */
    private DmtTextView f111792w;

    /* renamed from: x */
    private MultiSelectView f111793x;

    /* renamed from: y */
    private final C52668f f111794y = C52732g.m112285a(new C44132f(this));

    /* renamed from: z */
    private HashMap f111795z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$a */
    static final class C44127a extends C52712l implements C52682m<String, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44126e f111796a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f111797b;

        /* renamed from: c */
        final /* synthetic */ String f111798c;

        /* renamed from: d */
        final /* synthetic */ C52670a f111799d;

        C44127a(C44126e eVar, MediaModel mediaModel, String str, C52670a aVar) {
            this.f111796a = eVar;
            this.f111797b = mediaModel;
            this.f111798c = str;
            this.f111799d = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            long longValue = ((Number) obj2).longValue();
            C52711k.m112240b(str, "checkerType");
            C23569o.m57776a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            C44126e.m96773a(this.f111797b, str, 0, 0, longValue, this.f111798c);
            if (this.f111796a.getActivity() == null || !this.f111796a.isViewValid()) {
                this.f111796a.f111790c = false;
            } else {
                this.f111799d.invoke();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$b */
    static final class C44128b extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44126e f111800a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f111801b;

        /* renamed from: c */
        final /* synthetic */ String f111802c;

        C44128b(C44126e eVar, MediaModel mediaModel, String str) {
            this.f111800a = eVar;
            this.f111801b = mediaModel;
            this.f111802c = str;
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
            this.f111800a.f111790c = false;
            this.f111800a.mo90026a(this.f111801b, str, intValue, longValue, this.f111802c, str2);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$c */
    static final class C44129c implements C44083d {

        /* renamed from: a */
        final /* synthetic */ C44126e f111803a;

        C44129c(C44126e eVar) {
            this.f111803a = eVar;
        }

        /* renamed from: a */
        public final void mo89972a(View view, MediaModel mediaModel) {
            C44126e eVar = this.f111803a;
            if (mediaModel != null && view != null) {
                if (!mediaModel.mo76676c()) {
                    C44082c cVar = eVar.f111789b;
                    if (cVar != null && (mediaModel instanceof MyMediaModel)) {
                        cVar.mo89945a((MyMediaModel) mediaModel, view);
                        eVar.f111790c = false;
                    }
                } else if (!eVar.f111790c) {
                    eVar.f111790c = true;
                    C52670a eVar2 = new C44131e(eVar, mediaModel, view);
                    String str = "preview";
                    eVar.mo90025a().mo47261a(mediaModel, 0, -1, new C44127a(eVar, mediaModel, str, eVar2), new C44128b(eVar, mediaModel, str));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$d */
    public static final class C44130d extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C44126e f111804c;

        /* renamed from: d */
        final /* synthetic */ WrapGridLayoutManager f111805d;

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (this.f111804c.f111677d.getItemViewType(i) == 1) {
                return this.f111805d.f4521b;
            }
            return 1;
        }

        C44130d(C44126e eVar, WrapGridLayoutManager wrapGridLayoutManager) {
            this.f111804c = eVar;
            this.f111805d = wrapGridLayoutManager;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$e */
    static final class C44131e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44126e f111806a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f111807b;

        /* renamed from: c */
        final /* synthetic */ View f111808c;

        C44131e(C44126e eVar, MediaModel mediaModel, View view) {
            this.f111806a = eVar;
            this.f111807b = mediaModel;
            this.f111808c = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44082c cVar = this.f111806a.f111789b;
            if (cVar != null && (this.f111807b instanceof MyMediaModel)) {
                cVar.mo89945a((MyMediaModel) this.f111807b, this.f111808c);
                this.f111806a.f111790c = false;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e$f */
    static final class C44132f extends C52712l implements C52670a<C22808c> {

        /* renamed from: a */
        final /* synthetic */ C44126e f111809a;

        C44132f(C44126e eVar) {
            this.f111809a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f111809a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return new C22808c(activity);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C22818f mo90025a() {
        return (C22818f) this.f111794y.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f111795z != null) {
            this.f111795z.clear();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        MvImageChooseAdapter mvImageChooseAdapter = new MvImageChooseAdapter(getContext(), 4, 1.0d, 1.5f, 0, 3);
        this.f111677d = mvImageChooseAdapter;
        this.f111677d.f111645m = this.f111689t;
        MvImageChooseAdapter mvImageChooseAdapter2 = this.f111677d;
        C52711k.m112236a((Object) mvImageChooseAdapter2, "mediaAdapter");
        mvImageChooseAdapter2.mo89966a(true);
        this.f111677d.f111641i = true;
        this.f111677d.f111639g = this.f111789b;
        this.f111677d.f111638f = new C44129c(this);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getActivity(), 4);
        wrapGridLayoutManager.f4526g = new C44130d(this, wrapGridLayoutManager);
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
    }

    /* renamed from: a */
    public final void mo89992a(List<? extends MyMediaModel> list, boolean z) {
        super.mo89992a(list, z);
        if (list != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f111682m;
            C52711k.m112236a((Object) dmtLoadingLayout, "loadingDialog");
            dmtLoadingLayout.setVisibility(8);
            if (list.isEmpty()) {
                DmtTextView dmtTextView = this.f111792w;
                if (dmtTextView == null) {
                    C52711k.m112237a("noVideoHintTextView");
                }
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.f111792w;
                if (dmtTextView2 == null) {
                    C52711k.m112237a("noVideoHintTextView");
                }
                dmtTextView2.setText(R.string.ci9);
            } else {
                DmtTextView dmtTextView3 = this.f111792w;
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
            C47702b.f120193a.mo94984a("tool_performance_fetch_album_assets", C42438az.m93209a().mo86524a("duration", currentTimeMillis - l.longValue()).mo86523a("type", 0).mo86523a("count", list.size()).f107329a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        boolean z = false;
        this.f111680k = layoutInflater.inflate(R.layout.atj, viewGroup, false);
        this.f111678e = (RecyclerView) this.f111680k.findViewById(R.id.amf);
        View findViewById = this.f111680k.findViewById(R.id.elz);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.multi_select_view)");
        this.f111793x = (MultiSelectView) findViewById;
        View findViewById2 = this.f111680k.findViewById(R.id.da5);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.tv_hint)");
        this.f111792w = (DmtTextView) findViewById2;
        this.f111682m = (DmtLoadingLayout) this.f111680k.findViewById(R.id.dpg);
        MultiSelectView multiSelectView = this.f111793x;
        if (multiSelectView == null) {
            C52711k.m112237a("multiSelectView");
        }
        multiSelectView.setVisibility(8);
        mo90025a().mo47262a("enter_from_multi");
        int b = C39618d.f101152P.mo83104b(C40790a.EnableAlbumTimelineAndFullScreenPreview);
        if (this.f111678e instanceof FastScrollRecyclerView) {
            RecyclerView recyclerView = this.f111678e;
            if (recyclerView != null) {
                FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) recyclerView;
                if ((b == 2 || b == 3) && this.f111689t != 1) {
                    z = true;
                }
                fastScrollRecyclerView.setFastScrollEnabled(z);
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
    public static void m96773a(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C23569o.m57780a("aweme_video_import_duration", jSONObject, C23088c.m56631a().mo47824a("status", String.valueOf(i)).mo47824a("scene_name", str2).mo47822a("errorCode", Integer.valueOf(i2)).mo47824a("type", str).mo47822a("width", Integer.valueOf(mediaModel.f95390i)).mo47822a("height", Integer.valueOf(mediaModel.f95391j)).mo47825b());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo90026a(MediaModel mediaModel, String str, int i, long j, String str2, String str3) {
        if (getActivity() == null || !isViewValid()) {
            return;
        }
        int i2 = i;
        C44153p.m96803a(getActivity(), i, (int) this.f111791v);
        C23569o.m57776a("aweme_movie_import_error_rate", 1, C23088c.m56631a().mo47824a("errorCode", String.valueOf(i)).mo47824a("errorMsg", str3).mo47825b());
        m96773a(mediaModel, str, 1, i2, j, str2);
    }
}
