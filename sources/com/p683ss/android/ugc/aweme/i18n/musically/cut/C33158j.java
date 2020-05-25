package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33147g.C33154a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22808c;
import com.p683ss.android.ugc.aweme.p1361ap.C22816d;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22797b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44153p;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPreviewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2263b.C45595a;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.j */
public final class C33158j extends C23526a implements IVideoChoose {

    /* renamed from: a */
    protected TextView f86090a;

    /* renamed from: b */
    protected DmtLoadingLayout f86091b;

    /* renamed from: c */
    protected RecyclerView f86092c;

    /* renamed from: d */
    protected C33147g f86093d;

    /* renamed from: e */
    protected C22795c f86094e;

    /* renamed from: j */
    public boolean f86095j;

    /* renamed from: k */
    public long f86096k = C43307ea.m94995a();

    /* renamed from: l */
    protected C33154a f86097l = new C33154a() {
        /* renamed from: a */
        public final void mo70195a(View view, MediaModel mediaModel) {
            if (!C33158j.this.f86093d.f86049f) {
                C22816d.m56188a(false, true);
                C33158j jVar = C33158j.this;
                C22795c.m56156a().mo47276c();
                C22795c.m56156a().mo47271a(mediaModel);
                if (mediaModel.f95385d == 4) {
                    if (mediaModel.f95386e <= jVar.f86096k) {
                        C10691a.m21545b((Context) jVar.getActivity(), jVar.getString(R.string.f85, Long.valueOf(jVar.f86096k / 1000))).mo19066a();
                    } else if (mediaModel.f95386e <= 600000) {
                        String str = mediaModel.f95383b;
                        if (jVar.getActivity() != null) {
                            new C22808c(jVar.getActivity()).mo47261a(mediaModel, jVar.f86096k, -1, new C33163k(jVar), new C33164l(jVar));
                        }
                    } else {
                        C10691a.m21542b((Context) jVar.getActivity(), (int) R.string.fc5).mo19066a();
                    }
                }
            } else if (!C33158j.this.f86095j) {
                C33158j.this.f86095j = true;
                C33158j jVar2 = C33158j.this;
                String str2 = mediaModel.f95383b;
                if (jVar2.getActivity() != null) {
                    new C22808c(jVar2.getActivity()).mo47261a(mediaModel, 0, -1, new C33165m(jVar2, view, str2), new C33166n(jVar2));
                }
            }
        }
    };

    /* renamed from: m */
    public Callback f86098m;

    /* renamed from: n */
    private MultiSelectView f86099n;

    /* renamed from: o */
    private boolean f86100o;

    /* renamed from: p */
    private C45595a f86101p;

    /* renamed from: q */
    private int f86102q;

    /* renamed from: r */
    private int f86103r;

    /* renamed from: s */
    private int f86104s;

    /* renamed from: t */
    private boolean f86105t = false;

    /* renamed from: u */
    private C22797b f86106u = new C22797b() {
        /* renamed from: a */
        public final void mo47279a(boolean z, int i, List<MediaModel> list) {
            if (C33158j.this.isViewValid()) {
                C33158j.this.f86091b.setVisibility(8);
                if (z) {
                    C33158j.this.mo70204e();
                }
            }
        }
    };

    public final Fragment fragment() {
        return this;
    }

    /* renamed from: a */
    public final void mo70201a() {
        if (this.f86101p != null) {
            this.f86101p.notifyDataSetChanged();
        }
    }

    public final void loadData() {
        if (!this.f86105t) {
            mo70204e();
        }
    }

    public final void onStart() {
        super.onStart();
        C33147g gVar = this.f86093d;
        C22795c cVar = gVar.f86057n;
        cVar.f61075e.add(gVar.f86058o);
        gVar.f86057n.mo47269a(gVar.f86059p);
        this.f86094e.mo47270a(this.f86106u);
    }

    public final void onStop() {
        super.onStop();
        C33147g gVar = this.f86093d;
        C22795c cVar = gVar.f86057n;
        cVar.f61075e.remove(gVar.f86058o);
        gVar.f86057n.mo47274b(gVar.f86059p);
        this.f86094e.mo47275b(this.f86106u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo70204e() {
        final ArrayList arrayList = new ArrayList();
        if (this.f86094e != null) {
            this.f86105t = true;
            List a = m76171a(this.f86094e.mo47272b(4));
            if (!a.isEmpty()) {
                this.f86091b.setVisibility(0);
            }
            final List d = this.f86094e.mo47277d();
            arrayList.addAll(a);
            final ArrayList arrayList2 = new ArrayList();
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MediaModel mediaModel = (MediaModel) it.next();
                        String str = mediaModel.f95383b;
                        if (!TextUtils.isEmpty(str) && !str.contains("amweme/") && !str.contains("hotsoon/") && str.endsWith("mp4")) {
                            arrayList2.add(mediaModel);
                        }
                    }
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            try {
                                C33147g gVar = C33158j.this.f86093d;
                                ArrayList arrayList = arrayList2;
                                List list = d;
                                gVar.f86045b.clear();
                                gVar.f86045b.addAll(arrayList);
                                gVar.mo70190a(gVar.f86045b.size());
                                gVar.f86055l.mo70201a();
                                C33158j.this.f86092c.setAdapter(C33158j.this.f86093d);
                                C33158j.this.f86093d.f86050g = C33158j.this.f86097l;
                                C33158j.this.f86091b.setVisibility(8);
                                if (arrayList2.size() == 0) {
                                    C33158j.this.f86090a.setText(C33158j.this.getResources().getString(R.string.ci9));
                                } else {
                                    C33158j.this.f86090a.setText(null);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    private static List<MediaModel> m76171a(List<MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.f95386e > 3000) {
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f86102q = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.f86103r = getArguments().getInt("ARG_TEXT_COLOR", getResources().getColor(R.color.a53));
        this.f86104s = getArguments().getInt("ARG_SHADOW_COLOR", getResources().getColor(R.color.a44));
        this.f86100o = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
        this.f86097l = new C33167o(this);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f86094e == null && getActivity() != null) {
            C22795c.m56157a(getActivity().getApplicationContext());
            this.f86094e = C22795c.m56156a();
        }
        if (C9414h.m18630a(this.f86094e.mo47272b(4))) {
            this.f86091b.setVisibility(0);
            this.f86094e.mo47267a(4, 0, -1, -1, null);
        }
        if (this.f86093d == null) {
            C33147g gVar = new C33147g(getActivity(), this, this.f86102q, 1.0d, 1.5f, 0);
            this.f86093d = gVar;
            this.f86101p = new C45595a(this.f86093d);
            C45595a aVar = this.f86101p;
            FragmentActivity activity = getActivity();
            C52711k.m112240b(activity, "context");
            LayoutParams layoutParams = new LayoutParams(-1, (int) C9432q.m18687b((Context) activity, 96.0f));
            View view = new View(activity);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(0);
            aVar.f115334b.mo2595b(aVar.f115334b.mo2596c() + 200000, view);
            aVar.notifyItemRangeChanged(aVar.getItemCount() - aVar.mo91984b(), aVar.mo91984b());
        }
        this.f86093d.f86052i = this.f86104s;
        this.f86093d.f86051h = this.f86103r;
        this.f86093d.f86053j = false;
        this.f86099n.setOnModeChangeListener(new C33168p(this));
        loadData();
        this.f86099n.setVisibility(8);
        this.f86092c.setPadding(0, 0, 0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70202a(boolean z) {
        this.f86093d.f86049f = z;
        C33147g gVar = this.f86093d;
        gVar.mo70190a(gVar.f86045b.size());
        gVar.f86055l.mo70201a();
        if (!C9414h.m18630a(gVar.f86054k)) {
            gVar.f86054k.clear();
        }
        this.f86101p.notifyDataSetChanged();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo70199a(String str, Long l) {
        if (!isViewValid()) {
            return null;
        }
        C23569o.m57776a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        m76172a(str, 0, l.longValue(), "select");
        C39618d.f101162c.mo74146a((Context) getActivity(), (AVChallenge) getArguments().getSerializable("challenge"));
        return null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.atj, null);
        this.f86092c = (RecyclerView) inflate.findViewById(R.id.amf);
        this.f86092c.setLayoutManager(new WrapGridLayoutManager(null, this.f86102q));
        int i = 0;
        this.f86092c.mo4798a((C1331h) new C23745a(this.f86102q, (int) C9432q.m18687b(getContext(), 1.0f), false));
        this.f86090a = (TextView) inflate.findViewById(R.id.da5);
        this.f86091b = (DmtLoadingLayout) inflate.findViewById(R.id.dpg);
        this.f86099n = (MultiSelectView) inflate.findViewById(R.id.elz);
        MultiSelectView multiSelectView = this.f86099n;
        if (!this.f86100o) {
            i = 8;
        }
        multiSelectView.setVisibility(i);
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo70200a(String str, Long l, Integer num, String str2) {
        this.f86095j = false;
        m76173a(str, num.intValue(), l.longValue(), "preview", str2);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C52860x mo70203b(String str, Long l, Integer num, String str2) {
        m76173a(str, num.intValue(), l.longValue(), "select", str2);
        return null;
    }

    /* renamed from: a */
    private static void m76172a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C23569o.m57780a("aweme_video_import_duration", jSONObject, C23088c.m56631a().mo47824a("status", String.valueOf(i)).mo47824a("scene_name", str2).mo47824a("type", str).mo47825b());
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo70198a(View view, String str, String str2, Long l) {
        if (!isViewValid()) {
            this.f86095j = false;
            return null;
        }
        C23569o.m57776a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        m76172a(str2, 0, l.longValue(), "preview");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, VideoPreviewActivity.class);
            intent.putExtra("extra_zoom_info", ZoomAnimationUtils.m103150a(view));
            intent.putExtra("file_path", str);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
        this.f86095j = false;
        return null;
    }

    /* renamed from: a */
    private void m76173a(String str, int i, long j, String str2, String str3) {
        if (getActivity() != null && isViewValid()) {
            C44153p.m96803a(getActivity(), i, (int) (this.f86096k / 1000));
            C23569o.m57776a("aweme_movie_import_error_rate", 1, C23088c.m56631a().mo47824a("errorCode", String.valueOf(i)).mo47824a("errorMsg", str3).mo47825b());
            m76172a(str, 1, j, str2);
        }
    }
}
