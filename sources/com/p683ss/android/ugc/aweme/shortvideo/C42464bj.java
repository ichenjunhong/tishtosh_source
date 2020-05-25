package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.evencenter.EventCenter;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39555a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39556b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39557c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39558d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39559e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.mob.HashTagMobHelper;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p683ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p683ss.android.ugc.aweme.utils.C47761ce;
import com.p683ss.android.ugc.aweme.video.hashtag.C48024a;
import com.p683ss.android.ugc.aweme.video.hashtag.C48026b;
import com.p683ss.android.ugc.aweme.video.hashtag.C48026b.C48028b;
import com.p683ss.android.ugc.aweme.video.hashtag.C48029c;
import com.p683ss.android.ugc.aweme.video.hashtag.C48031d;
import com.p683ss.android.ugc.aweme.video.hashtag.C48032e;
import com.p683ss.android.ugc.aweme.video.hashtag.C48033f;
import com.p683ss.android.ugc.aweme.video.hashtag.HashTagListAdapter;
import com.p683ss.android.ugc.aweme.video.hashtag.abtest.HorizontalHashTagExperiment;
import com.p683ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.p683ss.android.ugc.aweme.video.hashtag.helper.C48036a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bj */
public final class C42464bj implements C0199s<C23274a>, C26877c<AVChallenge>, C39558d, C48032e, C48033f {

    /* renamed from: a */
    public static String f107379a = "video_challenge";

    /* renamed from: b */
    public static String f107380b = "photo_publish";

    /* renamed from: c */
    public static String f107381c = "challenge_create";

    /* renamed from: d */
    public String f107382d;

    /* renamed from: e */
    C39557c f107383e;

    /* renamed from: f */
    public boolean f107384f;

    /* renamed from: g */
    C39559e f107385g;

    /* renamed from: h */
    public BaseTitleHelper f107386h;

    /* renamed from: i */
    public HashTagMobHelper f107387i;

    /* renamed from: j */
    String f107388j;

    /* renamed from: k */
    private RecyclerView f107389k;

    /* renamed from: l */
    private ViewGroup f107390l;

    /* renamed from: m */
    private DmtStatusView f107391m;

    /* renamed from: n */
    private C43839fl f107392n;

    /* renamed from: o */
    private C39556b f107393o;

    /* renamed from: p */
    private C39555a f107394p;

    /* renamed from: q */
    private boolean f107395q;

    /* renamed from: r */
    private HashTagListAdapter f107396r;

    /* renamed from: s */
    private ArrayList<C48029c> f107397s = new ArrayList<>();

    /* renamed from: t */
    private String f107398t = f107379a;

    /* renamed from: u */
    private EventCenter f107399u;

    /* renamed from: v */
    private C48026b f107400v;

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
    }

    /* renamed from: b */
    public final void mo47026b(List<AVChallenge> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<AVChallenge> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
    }

    public final void aJ_() {
        m93296a(null);
    }

    /* renamed from: h */
    private void m93301h() {
        final HashTagMentionEditText hashTagMentionEditText = this.f107392n.f111009b;
        hashTagMentionEditText.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
                if (!C42464bj.this.f107384f) {
                    C42464bj.this.mo86597c();
                } else if (C42464bj.this.f107382d.endsWith("#")) {
                    C42464bj.this.mo86596a("");
                } else {
                    C42464bj.this.mo86596a(C42464bj.this.f107382d.substring(C42464bj.this.f107382d.lastIndexOf(35) + 1, C42464bj.this.f107382d.length()));
                }
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (i3 <= 0) {
                    ArrayList starAtlasExtraList = hashTagMentionEditText.getStarAtlasExtraList();
                    if (starAtlasExtraList != null) {
                        Iterator it = starAtlasExtraList.iterator();
                        while (it.hasNext()) {
                            if (i == ((TextExtraStruct) it.next()).getEnd() && hashTagMentionEditText.getText() != null) {
                                hashTagMentionEditText.getText().insert(i, " ");
                            }
                        }
                    }
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String str;
                Editable text = hashTagMentionEditText.getText();
                if (text != null) {
                    C42464bj.this.f107382d = text.toString();
                } else {
                    C42464bj.this.f107382d = "";
                }
                if (C42464bj.this.f107386h != null) {
                    BaseTitleHelper baseTitleHelper = C42464bj.this.f107386h;
                    String str2 = C42464bj.this.f107382d;
                    C52711k.m112240b(str2, "value");
                    baseTitleHelper.f120715b = str2;
                    String str3 = baseTitleHelper.f120715b;
                    int b = C52830p.m112444b((CharSequence) str3, '#', 0, false, 6, (Object) null);
                    if (b != -1) {
                        if (str3 != null) {
                            String substring = str3.substring(0, b);
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            baseTitleHelper.f120716c = substring;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                boolean z = true;
                if (C47761ce.m103388a(C42464bj.this.f107382d)) {
                    C42464bj.this.f107384f = true;
                } else if (C42464bj.this.f107382d.endsWith("#")) {
                    C42464bj.this.f107384f = true;
                    C42464bj bjVar = C42464bj.this;
                    if (i3 == 0) {
                        str = "clear_to_sharp";
                    } else {
                        str = "input_sharp";
                    }
                    if (bjVar.f107387i != null) {
                        bjVar.f107387i.mo89563a(str);
                    }
                } else {
                    if (C42464bj.this.f107384f && !C42464bj.this.f107382d.isEmpty() && C42464bj.this.f107387i != null) {
                        HashTagMobHelper hashTagMobHelper = C42464bj.this.f107387i;
                        if (hashTagMobHelper.f111419d != null) {
                            List<? extends C48029c> list = hashTagMobHelper.f111421f;
                            Collection collection = list;
                            if (collection != null && !collection.isEmpty()) {
                                z = false;
                            }
                            if (!z) {
                                C48029c cVar = null;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= list.size()) {
                                        break;
                                    }
                                    C48029c cVar2 = (C48029c) list.get(i4);
                                    if (C52711k.m112239a((Object) hashTagMobHelper.f111419d, (Object) cVar2.f120707a.challengeName)) {
                                        cVar = cVar2;
                                        break;
                                    }
                                    i4++;
                                }
                                if (cVar != null) {
                                    hashTagMobHelper.mo89564a("input_sharp", cVar, Integer.valueOf(i4), "input");
                                }
                            }
                        }
                    }
                    C42464bj.this.f107384f = false;
                    C42464bj.this.mo86597c();
                }
                ArrayList starAtlasExtraList = hashTagMentionEditText.getStarAtlasExtraList();
                if (starAtlasExtraList != null) {
                    Iterator it = starAtlasExtraList.iterator();
                    while (it.hasNext()) {
                        if (i == ((TextExtraStruct) it.next()).getEnd() && hashTagMentionEditText.getText() != null) {
                            C42464bj.this.f107384f = false;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: d */
    private void m93300d() {
        this.f107394p = C39618d.f101163d.mo74180a((C26877c<AVChallenge>) this);
        this.f107393o = C39618d.f101163d.mo74181a((C39558d) this);
    }

    /* renamed from: c */
    public final void mo86597c() {
        this.f107390l.setVisibility(8);
        this.f107397s.clear();
        this.f107396r.notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo80654b() {
        this.f107391m.setVisibility(0);
        this.f107389k.setVisibility(8);
        this.f107391m.mo19212f();
    }

    /* renamed from: a */
    private void m93294a(Fragment fragment) {
        this.f107399u = (EventCenter) C0214z.m438a(fragment).mo359a(EventCenter.class);
    }

    /* renamed from: c */
    private void m93299c(Fragment fragment) {
        this.f107383e = C39618d.f101163d.mo74182a(fragment);
        this.f107383e.mo74188a(this.f107385g);
    }

    /* renamed from: b */
    private void m93298b(Fragment fragment) {
        m93293a(fragment.getContext());
        m93300d();
        this.f107392n.mo89371a();
        m93301h();
        m93299c(fragment);
    }

    /* renamed from: b */
    private void m93297b(Context context) {
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            this.f107387i = (HashTagMobHelper) C0214z.m440a(fragmentActivity).mo359a(HashTagMobHelper.class);
            this.f107387i.f111416a = this.f107388j;
            this.f107387i.f111421f = this.f107397s;
            this.f107386h = BaseTitleHelper.m104027a(fragmentActivity);
            this.f107386h.f120714a = new C42467bl(this);
            this.f107387i.f111420e = this.f107386h;
        }
    }

    /* renamed from: d */
    public final void mo80655d(Exception exc) {
        this.f107391m.setVisibility(0);
        this.f107389k.setVisibility(8);
        this.f107391m.mo19214h();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null && TextUtils.equals(aVar.f62242a, C39554al.f101107a)) {
            if (this.f107400v != null) {
                this.f107383e.mo74187a();
            }
            if (this.f107382d != null && this.f107382d.endsWith("#")) {
                mo86596a("");
            }
        }
    }

    /* renamed from: a */
    private void m93293a(Context context) {
        m93297b(context);
        if (this.f107389k != null) {
            this.f107396r = new HashTagListAdapter(context, this.f107397s, this);
            this.f107389k.setLayoutManager(new LinearLayoutManager(context));
            this.f107389k.setAdapter(this.f107396r);
        }
        if (this.f107391m != null) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(context);
            dmtDefaultView.setStatus(new C10723a(context).mo19282c(R.string.cfw).f28711a);
            dmtDefaultView.setOnClickListener(new C42466bk(this));
            this.f107391m.setBuilder(C10719a.m21676a(context).mo19224a((int) R.string.chv).mo19234c((View) dmtDefaultView));
        }
    }

    /* renamed from: a */
    private void m93296a(List<AVChallenge> list) {
        m93295a("", (LogPbBean) null);
        List a = C48036a.m104032a(list, this.f107383e.mo74187a());
        if (a.isEmpty()) {
            this.f107391m.setVisibility(0);
            this.f107389k.setVisibility(8);
            this.f107391m.mo19213g();
            return;
        }
        this.f107391m.setVisibility(8);
        this.f107389k.setVisibility(0);
        this.f107397s.clear();
        this.f107397s.addAll(a);
        this.f107396r.f120689c = true;
        this.f107396r.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo86595a(AVChallenge aVChallenge) {
        mo86597c();
        this.f107384f = false;
        HashTagMentionEditText hashTagMentionEditText = this.f107392n.f111009b;
        int selectionStart = hashTagMentionEditText.getSelectionStart();
        String substring = hashTagMentionEditText.getText().toString().substring(0, selectionStart);
        if (C47761ce.m103388a(substring) || substring.endsWith("#")) {
            C48024a b = C47761ce.m103389b(substring, aVChallenge.getChallengeName());
            hashTagMentionEditText.getText().replace(substring.lastIndexOf("#"), selectionStart, b.f120702c);
            hashTagMentionEditText.mo91794a(true);
            String trim = b.f120702c.trim();
            if (!C47761ce.m103388a(trim)) {
                hashTagMentionEditText.f121324l.add(trim);
            }
        }
    }

    /* renamed from: a */
    public final void mo80653a(AVSearchChallengeList aVSearchChallengeList) {
        List<C43885i> list;
        if (!this.f107395q) {
            if (aVSearchChallengeList != null) {
                m93295a(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
            }
            String str = null;
            if (aVSearchChallengeList == null) {
                list = null;
            } else {
                list = aVSearchChallengeList.items;
            }
            this.f107397s.clear();
            if (C9414h.m18630a(list)) {
                this.f107391m.setVisibility(0);
                this.f107389k.setVisibility(8);
                this.f107391m.mo19213g();
            } else {
                if (this.f107387i != null) {
                    this.f107387i.f111417b = aVSearchChallengeList.logPb;
                    this.f107387i.f111419d = aVSearchChallengeList.keyword;
                    this.f107387i.f111418c = aVSearchChallengeList.recommendWordMob;
                }
                HashTagListAdapter hashTagListAdapter = this.f107396r;
                String str2 = aVSearchChallengeList.keyword;
                LogPbBean logPbBean = aVSearchChallengeList.logPb;
                hashTagListAdapter.f120691e = str2;
                hashTagListAdapter.f120692f = logPbBean;
                for (C43885i iVar : list) {
                    C48029c cVar = new C48029c();
                    cVar.f120708b = 2;
                    cVar.f120712f = "search";
                    cVar.f120707a = iVar.f111139a;
                    this.f107397s.add(cVar);
                }
                HashTagMobHelper hashTagMobHelper = this.f107387i;
                Integer valueOf = Integer.valueOf(this.f107397s.size());
                if (valueOf != null) {
                    valueOf.intValue();
                    String str3 = "trending_show";
                    C26898j a = new C26898j().mo54849a("words_num", String.valueOf(valueOf.intValue())).mo54849a("words_source", "sug").mo54849a("search_position", "challenge_create").mo54849a("raw_query", hashTagMobHelper.f111419d).mo54849a("rank", "-1");
                    String str4 = "query_id";
                    RecommendWordMob recommendWordMob = hashTagMobHelper.f111418c;
                    if (recommendWordMob != null) {
                        str = recommendWordMob.getQueryId();
                    }
                    C26890h.m65012a(str3, a.mo54849a(str4, str).mo54850a());
                }
                this.f107391m.mo19209d();
                this.f107391m.setVisibility(8);
                this.f107389k.setVisibility(0);
            }
            this.f107396r.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo86596a(String str) {
        if (!C39618d.f101183x.mo74280a()) {
            this.f107390l.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                this.f107395q = true;
                this.f107394p.mo74290a(Integer.valueOf(1));
                return;
            }
            this.f107395q = false;
            this.f107393o.mo74289a(str, f107381c);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<AVChallenge> list, boolean z) {
        m93296a(list);
    }

    /* renamed from: a */
    private static void m93295a(String str, LogPbBean logPbBean) {
        String str2;
        String str3 = "search_tag";
        C26898j jVar = new C26898j();
        String str4 = "search_keyword";
        if (str == null) {
            str = "";
        }
        C26898j a = jVar.mo54849a(str4, str);
        String str5 = "log_pb";
        if (logPbBean == null) {
            str2 = "";
        } else {
            str2 = C39618d.f101161b.mo34889b(logPbBean);
        }
        C26890h.m65014b(str3, a.mo54849a(str5, str2).mo54850a());
    }

    /* renamed from: a */
    public static C42464bj m93292a(String str, C43839fl flVar, View view) {
        return new C42464bj(str, flVar, view);
    }

    private C42464bj(String str, C43839fl flVar, View view) {
        this.f107388j = str;
        this.f107392n = flVar;
        this.f107389k = (RecyclerView) view.findViewById(R.id.ang);
        this.f107390l = (ViewGroup) view.findViewById(R.id.ank);
        this.f107391m = (DmtStatusView) view.findViewById(R.id.csv);
        if (C10181b.m20511a().mo18168a(HorizontalHashTagExperiment.class, true, "publish_recommend_hashtag", 31744, 0) == 1) {
            C48028b bVar = new C48028b(view, this);
            C52711k.m112240b(bVar, "constructorParam");
            this.f107400v = new C48031d(bVar);
        }
    }

    /* renamed from: a */
    public final void mo86594a(Fragment fragment, boolean z, String str, C39559e eVar) {
        this.f107398t = str;
        this.f107385g = eVar;
        m93294a(fragment);
        m93298b(fragment);
    }
}
