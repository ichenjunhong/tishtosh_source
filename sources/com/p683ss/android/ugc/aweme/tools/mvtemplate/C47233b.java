package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.common.p920d.C13696m;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1387as.C23286a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45324z;
import com.p683ss.android.ugc.aweme.tools.C47059f;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47301r.C47302a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47255g;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47256h;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d.C47259a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.C47321b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b */
public final class C47233b implements C23286a, C47297p {

    /* renamed from: a */
    MvTemplateView f119278a;

    /* renamed from: b */
    C29252f f119279b;

    /* renamed from: c */
    public String f119280c;

    /* renamed from: d */
    public int f119281d;

    /* renamed from: e */
    public int f119282e;

    /* renamed from: f */
    public String f119283f;

    /* renamed from: g */
    public boolean f119284g = true;

    /* renamed from: h */
    public boolean f119285h;

    /* renamed from: i */
    public volatile boolean f119286i;

    /* renamed from: j */
    private FragmentActivity f119287j;

    /* renamed from: k */
    private ViewStubCompat f119288k;

    /* renamed from: l */
    private Effect f119289l;

    /* renamed from: m */
    private ShortVideoContext f119290m;

    /* renamed from: n */
    private boolean f119291n;

    /* renamed from: o */
    private String f119292o;

    /* renamed from: p */
    private int f119293p;

    /* renamed from: q */
    private String f119294q;

    /* renamed from: r */
    private final int f119295r = 20;

    /* renamed from: s */
    private boolean f119296s = true;

    /* renamed from: t */
    private boolean f119297t;

    /* renamed from: u */
    private boolean f119298u;

    /* renamed from: a */
    public final boolean mo94513a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null || C23715d.m58202a((Collection<T>) effectChannelResponse.getAllCategoryEffects())) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.mo94473a(effect);
            mvThemeData.f119231b = effectChannelResponse.getUrlPrefix();
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        if (this.f119289l != null && !TextUtils.isEmpty(this.f119289l.getEffectId())) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                } else if (this.f119289l.getEffectId().equals(((MvThemeData) arrayList.get(i2)).mo94472a())) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                MvThemeData mvThemeData2 = (MvThemeData) arrayList.remove(i);
                mvThemeData2.mo94473a(this.f119289l);
                arrayList.add(0, mvThemeData2);
            }
        }
        if (m102517i()) {
            this.f119278a.mo94456a((List<MvThemeData>) arrayList);
            this.f119278a.mo94453a();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo94512a(CategoryPageModel categoryPageModel) {
        if (categoryPageModel == null || C23715d.m58202a((Collection<T>) categoryPageModel.getCategoryEffects().getEffects())) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : categoryPageModel.getCategoryEffects().getEffects()) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.mo94473a(effect);
            mvThemeData.f119231b = categoryPageModel.getUrl_prefix();
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        if (this.f119289l != null && !TextUtils.isEmpty(this.f119289l.getEffectId())) {
            if (!this.f119298u) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (this.f119289l.getEffectId().equals(((MvThemeData) arrayList.get(i)).mo94472a())) {
                        arrayList.remove(i);
                        this.f119298u = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (this.f119278a.getDataCount() == 0) {
                MvThemeData mvThemeData2 = new MvThemeData();
                mvThemeData2.mo94473a(this.f119289l);
                mvThemeData2.f119231b = categoryPageModel.getUrl_prefix();
                arrayList.add(0, mvThemeData2);
            }
        }
        if (!this.f119296s) {
            this.f119278a.mo94456a((List<MvThemeData>) arrayList);
        } else if (m102517i()) {
            this.f119278a.mo94456a((List<MvThemeData>) arrayList);
            this.f119278a.mo94453a();
            this.f119296s = false;
        }
        if (!this.f119284g) {
            this.f119278a.mo94464f();
        }
        return true;
    }

    /* renamed from: j */
    private void m102518j() {
        if (this.f119297t) {
            mo94514f();
        } else {
            m102520l();
        }
    }

    /* renamed from: c */
    public final void mo48262c() {
        if (m102517i()) {
            this.f119278a.mo94463e();
        }
    }

    public final void dismiss() {
        if (this.f119278a != null) {
            this.f119278a.dismiss();
            C47718bf.m103291d(this.f119278a);
        }
    }

    /* renamed from: g */
    public final void mo94515g() {
        this.f119279b.mo59126a("mv", (C48702g) new C48702g() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                C47233b.this.mo94513a((EffectChannelResponse) obj);
            }

            /* renamed from: a */
            public final void mo8637a(C48649d dVar) {
                C47233b.this.mo94510a(C47233b.this.f119280c);
            }
        });
    }

    /* renamed from: k */
    private void m102519k() {
        if (this.f119279b == null) {
            this.f119279b = C29242c.m68869a(this.f119287j.getApplication(), C47267g.f119349a);
        }
    }

    /* renamed from: l */
    private void m102520l() {
        if (this.f119287j != null && !this.f119287j.isFinishing()) {
            m102519k();
            this.f119279b.mo59143b("mv", false, (C48702g) new C48702g() {
                /* renamed from: a */
                public final void mo8637a(C48649d dVar) {
                    C47233b.this.mo94515g();
                    if (dVar == null) {
                        C47233b.m102516a(false, 1, (Exception) null);
                    } else {
                        C47233b.m102516a(false, dVar.f122279a, dVar.f122281c);
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    if (!C47233b.this.mo94513a((EffectChannelResponse) obj)) {
                        C47233b.this.mo94515g();
                    }
                    C47233b.m102516a(true, 0, (Exception) null);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo48259a() {
        if (this.f119278a != null && this.f119278a.getVisibility() == 0) {
            this.f119278a.mo94460d();
        }
    }

    /* renamed from: d */
    public final void mo48263d() {
        if (this.f119278a != null) {
            C47718bf.m103291d(this.f119278a);
            C50130a.m108170a().mo97927c();
        }
        if (this.f119279b != null) {
            this.f119279b.destroy();
        }
    }

    /* renamed from: h */
    public final void mo94516h() {
        this.f119286i = true;
        this.f119279b.mo59134a("mv", "all", true, 20, this.f119281d, this.f119282e, this.f119283f, new C48701f() {
            /* renamed from: a */
            public final void mo59186a(C48649d dVar) {
                C47233b.this.mo94510a(C47233b.this.f119280c);
                if (C47233b.this.f119286i) {
                    C47233b.this.f119286i = false;
                }
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
                if (TextUtils.isEmpty(C47233b.this.f119283f)) {
                    C47233b.this.f119283f = categoryPageModel.getCategoryEffects().getVersion();
                }
                C47233b.this.f119281d = categoryPageModel.getCategoryEffects().getCursor();
                C47233b.this.f119282e = categoryPageModel.getCategoryEffects().getSortingPosition();
                C47233b.this.f119284g = categoryPageModel.getCategoryEffects().hasMore();
                if (C47233b.this.mo94512a(categoryPageModel)) {
                    C47233b.this.f119285h = true;
                }
                if (C47233b.this.f119286i) {
                    C47233b.this.f119286i = false;
                }
            }
        });
    }

    /* renamed from: m */
    private C23089d m102521m() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119293p);
        return C23089d.m56640a().mo47829a("shoot_way", this.f119294q).mo47829a("creation_id", this.f119292o).mo47829a("draft_id", sb.toString());
    }

    /* renamed from: b */
    public final void mo48261b() {
        if (m102517i()) {
            MvTemplateView mvTemplateView = this.f119278a;
            C47259a a = mvTemplateView.mo94452a(mvTemplateView.f119202h);
            if (a != null && a.f119334e != null && a.f119334e.mo97922d()) {
                a.f119334e.mo60215af();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo94514f() {
        if (this.f119287j != null && !this.f119287j.isFinishing()) {
            m102519k();
            this.f119286i = true;
            this.f119279b.mo59134a("mv", "all", false, 20, this.f119281d, this.f119282e, this.f119283f, new C48701f() {
                /* renamed from: a */
                public final void mo59186a(C48649d dVar) {
                    C47233b.this.mo94516h();
                    if (dVar == null) {
                        C47233b.m102516a(false, 1, (Exception) null);
                    } else {
                        C47233b.m102516a(false, dVar.f122279a, dVar.f122281c);
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
                    if (TextUtils.isEmpty(C47233b.this.f119283f)) {
                        C47233b.this.f119283f = categoryPageModel.getCategoryEffects().getVersion();
                    }
                    C47233b.this.f119281d = categoryPageModel.getCategoryEffects().getCursor();
                    C47233b.this.f119282e = categoryPageModel.getCategoryEffects().getSortingPosition();
                    C47233b.this.f119284g = categoryPageModel.getCategoryEffects().hasMore();
                    if (!C47233b.this.mo94512a(categoryPageModel)) {
                        C47233b.this.mo94516h();
                    }
                    if (C47233b.this.f119286i) {
                        C47233b.this.f119286i = false;
                    }
                    C47233b.m102516a(true, 0, (Exception) null);
                }
            });
        }
    }

    /* renamed from: i */
    private boolean m102517i() {
        if (this.f119278a != null) {
            return true;
        }
        if (this.f119288k == null || this.f119288k.getParent() == null) {
            return false;
        }
        this.f119278a = (MvTemplateView) this.f119288k.mo5425a();
        this.f119278a.setOnClickListener(C47258d.f119329a);
        this.f119278a.setMvThemeClickListener(this);
        this.f119278a.setMoreDataFetcher(new C47265e(this));
        m102519k();
        this.f119278a.setMvEffectPlatform(this.f119279b);
        if (m102517i()) {
            MvTemplateView mvTemplateView = this.f119278a;
            if (mvTemplateView.f119206l != null) {
                LayoutParams layoutParams = (LayoutParams) mvTemplateView.f119206l.getLayoutParams();
                layoutParams.topMargin = (int) (((float) C43303dy.m94972c(mvTemplateView.getContext())) + C9432q.m18687b(mvTemplateView.getContext(), 24.5f));
                mvTemplateView.f119206l.setLayoutParams(layoutParams);
            }
        }
        if (this.f119291n) {
            mo48260a(true);
        }
        return true;
    }

    /* renamed from: e */
    public final void mo48265e() {
        if (m102517i()) {
            C47718bf.m103290c(this.f119278a);
            MvTemplateView mvTemplateView = this.f119278a;
            mvTemplateView.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mvTemplateView.f119199e, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
            mvTemplateView.mo94460d();
            if (this.f119278a.getDataCount() == 0) {
                MvTemplateView mvTemplateView2 = this.f119278a;
                mvTemplateView2.f119204j.setVisibility(0);
                mvTemplateView2.f119203i.setVisibility(4);
                mvTemplateView2.mo94459c();
                m102518j();
            } else if (this.f119278a.f119205k) {
                m102518j();
            } else {
                this.f119278a.mo94453a();
            }
        }
        C26890h.m65011a("enter_mv_shoot_page", m102521m().mo47829a("content_source", "upload").mo47829a("content_type", "mv").mo47829a("enter_method", C47251c.f119321b).f61491a);
        C47251c.m102593d("change_mode");
    }

    /* renamed from: a */
    public final void mo94507a(MvThemeData mvThemeData) {
        m102515a("mv_show", mvThemeData, 0);
    }

    /* renamed from: a */
    public final void mo48260a(boolean z) {
        this.f119291n = z;
        if (this.f119278a != null) {
            this.f119278a.mo94455a(Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo94506a(ShortVideoContext shortVideoContext) {
        this.f119290m = shortVideoContext;
        if (this.f119290m != null) {
            this.f119292o = this.f119290m.f107131x;
            this.f119294q = this.f119290m.f107132y;
            this.f119293p = this.f119290m.f107022A;
        }
    }

    /* renamed from: a */
    public final void mo94509a(Effect effect) {
        this.f119289l = effect;
        if (effect == null) {
            if (this.f119297t) {
                if (this.f119287j != null && !this.f119287j.isFinishing() && C47269i.m102628a(this.f119287j)) {
                    m102519k();
                    this.f119279b.mo59134a("mv", "all", false, 20, this.f119281d, this.f119282e, this.f119283f, new C48701f() {
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                            CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
                            C47233b.m102516a(true, 0, (Exception) null);
                        }

                        /* renamed from: a */
                        public final void mo59186a(C48649d dVar) {
                            if (dVar == null) {
                                C47233b.m102516a(false, 1, (Exception) null);
                            } else {
                                C47233b.m102516a(false, dVar.f122279a, dVar.f122281c);
                            }
                        }
                    });
                }
            } else if (this.f119287j != null && !this.f119287j.isFinishing() && C47269i.m102628a(this.f119287j)) {
                m102519k();
                C45101d.m98616a((C45098a) new C47266f(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo94510a(String str) {
        if (m102517i()) {
            C10691a.m21551c(this.f119278a.getContext(), str).mo19066a();
            if (this.f119278a.getDataCount() == 0) {
                MvTemplateView mvTemplateView = this.f119278a;
                mvTemplateView.f119204j.setVisibility(8);
                mvTemplateView.f119203i.setVisibility(0);
                mvTemplateView.f119196b.setVisibility(8);
                mvTemplateView.f119195a.setVisibility(8);
                mvTemplateView.f119208n.setNoScroll(true);
                mvTemplateView.f119197c.setVisibility(8);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    MvThemeData mvThemeData = new MvThemeData();
                    mvThemeData.f119238i = true;
                    arrayList.add(mvThemeData);
                }
                mvTemplateView.mo94456a((List<MvThemeData>) arrayList);
                mvTemplateView.mo94459c();
                if (mvTemplateView.f119213s) {
                    mvTemplateView.f119211q.f119416d = false;
                    mvTemplateView.mo94464f();
                }
                mvTemplateView.f119205k = true;
                mvTemplateView.f119200f.mo94599a((C47321b) null);
            }
        }
    }

    public C47233b(FragmentActivity fragmentActivity, ViewStubCompat viewStubCompat) {
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            this.f119287j = fragmentActivity;
            this.f119288k = viewStubCompat;
            this.f119279b = C29242c.m68869a(fragmentActivity.getApplication(), C47248c.f119318a);
            this.f119280c = this.f119287j.getResources().getString(R.string.azb);
            this.f119297t = C39618d.f101152P.mo83103a(C40790a.UseNewMvStruct);
        }
    }

    /* renamed from: a */
    public final boolean mo94511a(MvThemeData mvThemeData, int i) {
        boolean a = C47251c.m102585a(mvThemeData);
        if (a) {
            FragmentActivity fragmentActivity = this.f119287j;
            C47268h hVar = new C47268h(this);
            if (!(fragmentActivity == null || fragmentActivity.isFinishing() || mvThemeData == null || mvThemeData.f119230a == null)) {
                String id = mvThemeData.f119230a.getId();
                C52711k.m112240b(id, "key");
                if (C35807d.m80935a(C39618d.f101160a, "mv_template", 0).getBoolean(id, false)) {
                    hVar.onClick(null, 0);
                } else {
                    new C10643a(fragmentActivity).mo18892a(fragmentActivity.getResources().getString(R.string.dzz)).mo18902b(fragmentActivity.getResources().getString(R.string.r)).mo18903b(fragmentActivity.getResources().getString(R.string.p), (OnClickListener) new C47255g(null)).mo18893a(fragmentActivity.getResources().getString(R.string.o), (OnClickListener) new C47256h(mvThemeData, hVar)).mo18897a().mo18883c().show();
                }
            }
        }
        if (!a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m102515a(String str, MvThemeData mvThemeData, int i) {
        if (mvThemeData != null) {
            C26890h.m65011a(str, m102521m().mo47829a("mv_id", mvThemeData.mo94472a()).mo47829a("mv_name", mvThemeData.mo94479f()).mo47826a("impr_position", i + 1).f61491a);
        }
    }

    /* renamed from: a */
    public static void m102516a(boolean z, int i, Exception exc) {
        JSONObject jSONObject = null;
        if (z) {
            C23569o.m57776a("mv_resource_list_download_error_state", 0, (JSONObject) null);
            return;
        }
        if (exc != null) {
            jSONObject = C42437ay.m93202a().mo86521a("exception", C13696m.m27668c(exc)).mo86521a("event", C45324z.m98803a().mo91603b().toString()).mo86522b();
        }
        C23569o.m57776a("mv_resource_list_download_error_state", i, jSONObject);
    }

    /* renamed from: a */
    public final void mo94508a(MvThemeData mvThemeData, int i, int i2) {
        String str;
        if (i == 2) {
            dismiss();
            if (this.f119287j instanceof VideoRecordNewActivity) {
                ((VideoRecordNewActivity) this.f119287j).f113794t.mo86791d().mo86531a(new C47059f("close_view"));
            }
        } else if (i == 1) {
            if (!m102517i() || this.f119278a.getVisibility() == 0) {
                C47302a aVar = C47301r.f119399a;
                FragmentActivity fragmentActivity = this.f119287j;
                ShortVideoContext shortVideoContext = this.f119290m;
                C52711k.m112240b(fragmentActivity, "activity");
                if (mvThemeData != null && mvThemeData.f119232c >= 0) {
                    String d = mvThemeData.mo94476d();
                    if (C48016e.m103944b(d)) {
                        mvThemeData.f119240k = C47251c.m102585a(mvThemeData);
                        Bundle bundle = new Bundle();
                        bundle.putInt("key_photo_select_min_count", mvThemeData.f119232c);
                        bundle.putInt("key_photo_select_max_count", mvThemeData.f119233d);
                        bundle.putString("key_mv_src_limited_toast", mvThemeData.f119246q);
                        bundle.putInt("upload_photo_min_height", mvThemeData.f119245p);
                        bundle.putInt("upload_photo_min_width", mvThemeData.f119244o);
                        bundle.putString("key_mv_hint_text", mvThemeData.mo94481h());
                        bundle.putString("key_mv_resource_unzip_path", d);
                        bundle.putParcelable("key_select_mv_data", mvThemeData);
                        bundle.putParcelable("key_short_video_context", shortVideoContext);
                        bundle.putInt("key_support_flag", 3);
                        String a = C47302a.m102660a(mvThemeData.f119230a);
                        if (a != null) {
                            bundle.putString("Key_challenge_id", a);
                        }
                        if (mvThemeData.f119230a != null) {
                            Effect effect = mvThemeData.f119230a;
                            C52711k.m112236a((Object) effect, "data.effect");
                            bundle.putString("key_sdk_extra_data", effect.getSdkExtra());
                        }
                        String str2 = "key_mv_algorithm_hint";
                        if (mvThemeData.f119241l == null) {
                            str = "";
                        } else {
                            str = mvThemeData.f119241l;
                        }
                        bundle.putString(str2, str);
                        bundle.putInt("key_choose_scene", 2);
                        C52711k.m112240b(fragmentActivity, "activity");
                        C52711k.m112240b(bundle, "bundle");
                        Intent intent = new Intent(fragmentActivity, MvChoosePhotoActivity.class);
                        intent.putExtras(bundle);
                        intent.putExtra("key_choose_request_code", 10001);
                        fragmentActivity.startActivity(intent);
                    }
                }
                m102515a("select_mv", mvThemeData, i2);
            }
        } else if (i == 3) {
            m102515a("mv_show", mvThemeData, i2);
            C43804f fVar = C43214dh.m94817a().f109289d;
            if (fVar != null && !fVar.f110931h && !TextUtils.equals(fVar.f110930g, mvThemeData.mo94482i())) {
                C10691a.m21548c((Context) this.f119287j, (int) R.string.gtq).mo19066a();
                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "8").mo47829a("task_id", fVar.f110924a).f61491a);
                fVar.f110931h = true;
            }
        }
    }
}
