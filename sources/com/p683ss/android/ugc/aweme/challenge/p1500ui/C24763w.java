package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.os.Handler;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C1000h;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10737c;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.service.C24599a;
import com.p683ss.android.ugc.aweme.commerce.challenge.C25509a;
import com.p683ss.android.ugc.aweme.commerce.challenge.C25509a.C25510a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.views.ChallengeViewPager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.w */
public final class C24763w implements C24599a {

    /* renamed from: a */
    public Challenge f65557a;

    /* renamed from: b */
    public final C24724l f65558b;

    /* renamed from: c */
    private final ViewPager f65559c;

    /* renamed from: d */
    private final DmtTabLayout f65560d;

    /* renamed from: e */
    private final View f65561e;

    /* renamed from: f */
    private final ImageView f65562f;

    /* renamed from: g */
    private final Context f65563g;

    /* renamed from: h */
    private ChallengeDetail f65564h;

    /* renamed from: i */
    private C46069d f65565i;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.w$a */
    public static final class C24764a extends C17956a<C46069d> {
        C24764a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.w$b */
    static final class C24765b implements C10736b {

        /* renamed from: a */
        final /* synthetic */ C24763w f65566a;

        C24765b(C24763w wVar) {
            this.f65566a = wVar;
        }

        /* renamed from: a */
        public final void mo19399a(C10742f fVar) {
            C24724l lVar = this.f65566a.f65558b;
            C52711k.m112236a((Object) fVar, "it");
            lVar.mo55749c(fVar.f28860e);
            fVar.mo19417a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.w$c */
    public static final class C24766c implements C10737c {

        /* renamed from: a */
        final /* synthetic */ C24763w f65567a;

        C24766c(C24763w wVar) {
            this.f65567a = wVar;
        }

        /* renamed from: a */
        public final void mo19400a(C10742f fVar) {
            String str;
            if (fVar != null) {
                int i = fVar.f28860e;
                C24763w wVar = this.f65567a;
                if (i == 0) {
                    str = "output";
                } else {
                    Challenge challenge = this.f65567a.f65557a;
                    if (challenge == null) {
                        C52711k.m112237a("mChallenge");
                    }
                    str = ((ShowItemsStruct) challenge.showItems.get(i - 1)).getType();
                }
                String str2 = "change_inter_tag";
                C23089d a = C23089d.m56640a();
                String str3 = "tag_id";
                Challenge challenge2 = wVar.f65557a;
                if (challenge2 == null) {
                    C52711k.m112237a("mChallenge");
                }
                C26890h.m65011a(str2, a.mo47829a(str3, challenge2.getCid()).mo47829a("tag_name", str).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.w$d */
    public static final class C24767d extends C1000h {

        /* renamed from: a */
        final /* synthetic */ C24763w f65568a;

        /* renamed from: b */
        final /* synthetic */ C52725c f65569b;

        /* renamed from: c */
        private int f65570c;

        public final void onPageSelected(int i) {
            Fragment a = this.f65568a.mo50638b().mo2309a(i);
            String str = null;
            if (!(a instanceof C25509a)) {
                a = null;
            }
            if (a != null) {
                if (a != null) {
                    new Handler().postDelayed(new C25510a((C25509a) a), 100);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
                }
            }
            Fragment a2 = this.f65568a.mo50638b().mo2309a(this.f65570c);
            if (!(a2 instanceof C25509a)) {
                a2 = null;
            }
            if (a2 != null) {
                if (a2 != null) {
                    C25509a aVar = (C25509a) a2;
                    if (aVar.f67469b) {
                        CommonBizWebView e = aVar.mo52131e();
                        if (e != null) {
                            e.mo50080a("brand_room_left", new JSONObject());
                        }
                    } else {
                        CrossPlatformWebView a3 = aVar.mo52130a();
                        if (a3 != null) {
                            String str2 = "brand_room_left";
                            JSONObject jSONObject = new JSONObject();
                            CrossPlatformWebView a4 = aVar.mo52130a();
                            if (a4 != null) {
                                str = a4.getReactId();
                            }
                            a3.mo55678a(str2, jSONObject, str);
                        }
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
                }
            }
            this.f65570c = i;
        }

        C24767d(C24763w wVar, C52725c cVar) {
            this.f65568a = wVar;
            this.f65569b = cVar;
            this.f65570c = cVar.element;
        }
    }

    /* renamed from: a */
    public final void mo50417a() {
        this.f65560d.f28821q.clear();
    }

    /* renamed from: b */
    public final C40320dc<C23526a> mo50638b() {
        PagerAdapter adapter = this.f65559c.getAdapter();
        if (adapter != null) {
            return (C40320dc) adapter;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter<com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment>");
    }

    /* renamed from: a */
    public final boolean mo50421a(int i) {
        boolean z = false;
        if (i == R.id.csb) {
            IStickerUtilsService stickerInfo = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo();
            if (!(this.f65565i == null || stickerInfo == null)) {
                C46069d dVar = this.f65565i;
                if (dVar == null) {
                    C52711k.m112234a();
                }
                if (stickerInfo.isLockCommerceFaceSticker(dVar)) {
                    Context context = this.f65563g;
                    C46069d dVar2 = this.f65565i;
                    if (dVar2 == null) {
                        C52711k.m112234a();
                    }
                    stickerInfo.showCommerceStickerDialog(context, dVar2, "challenge");
                    z = true;
                }
            }
            return false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo50418a(float f, float f2) {
        Fragment a = mo50638b().mo2309a(this.f65559c.getCurrentItem());
        if ((a instanceof C25509a) && f2 != 0.0f) {
            ((C25509a) a).mo52132f();
        }
    }

    /* renamed from: a */
    public final void mo50419a(int i, int i2) {
        Fragment a = mo50638b().mo2309a(this.f65559c.getCurrentItem());
        if ((a instanceof C25509a) && i != 0) {
            ((C25509a) a).mo52132f();
        }
    }

    public C24763w(View view, C24724l lVar) {
        C52711k.m112240b(view, "viewRoot");
        C52711k.m112240b(lVar, "parent");
        this.f65558b = lVar;
        View findViewById = view.findViewById(R.id.ds2);
        C52711k.m112236a((Object) findViewById, "viewRoot.findViewById(R.id.viewpager)");
        this.f65559c = (ViewPager) findViewById;
        View findViewById2 = view.findViewById(R.id.cwz);
        C52711k.m112236a((Object) findViewById2, "viewRoot.findViewById(R.id.tab_layout)");
        this.f65560d = (DmtTabLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.bq6);
        C52711k.m112236a((Object) findViewById3, "viewRoot.findViewById(R.id.navigator_div)");
        this.f65561e = findViewById3;
        this.f65562f = (ImageView) view.findViewById(R.id.csd);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "viewRoot.context");
        this.f65563g = context;
    }

    /* renamed from: a */
    public final void mo50420a(ChallengeDetail challengeDetail, int i) {
        C52711k.m112240b(challengeDetail, "data");
        this.f65564h = challengeDetail;
        Challenge challenge = challengeDetail.challenge;
        C52711k.m112236a((Object) challenge, "data.challenge");
        this.f65557a = challenge;
        try {
            C17971f fVar = new C17971f();
            Challenge challenge2 = this.f65557a;
            if (challenge2 == null) {
                C52711k.m112237a("mChallenge");
            }
            this.f65565i = (C46069d) fVar.mo34885a(challenge2.getChallengeStickerDetail(), new C24764a().f49843c);
        } catch (Exception unused) {
        }
        if (this.f65565i != null) {
            IStickerUtilsService stickerInfo = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo();
            C46069d dVar = this.f65565i;
            if (dVar == null) {
                C52711k.m112234a();
            }
            if (stickerInfo.isLockCommerceFaceSticker(dVar)) {
                ImageView imageView = this.f65562f;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.bcn);
                }
            }
        }
        Challenge challenge3 = this.f65557a;
        if (challenge3 == null) {
            C52711k.m112237a("mChallenge");
        }
        if (C9376b.m18558a((Collection<T>) challenge3.showItems)) {
            this.f65560d.setVisibility(8);
            return;
        }
        ViewPager viewPager = this.f65559c;
        if (viewPager != null) {
            ((ChallengeViewPager) viewPager).setPagingEnable(true);
            ((ChallengeViewPager) this.f65559c).setOffscreenPageLimit(2);
            this.f65560d.setVisibility(0);
            this.f65561e.setVisibility(0);
            C52725c cVar = new C52725c();
            cVar.element = ((ChallengeViewPager) this.f65559c).getCurrentItem();
            C27336g gVar = (C27336g) this.f65558b.mo50617m().get(0);
            Integer num = (Integer) mo50638b().f102923d.get(0);
            C23526a aVar = (C23526a) mo50638b().f102922c.get(0);
            C52711k.m112236a((Object) aVar, "fragment");
            aVar.f62623N = true;
            List m = this.f65558b.mo50617m();
            m.clear();
            m.add(gVar);
            List<T> list = mo50638b().f102922c;
            list.clear();
            list.add(aVar);
            List<Integer> list2 = mo50638b().f102923d;
            list2.clear();
            list2.add(num);
            Challenge challenge4 = this.f65557a;
            if (challenge4 == null) {
                C52711k.m112237a("mChallenge");
            }
            List<ShowItemsStruct> list3 = challenge4.showItems;
            C52711k.m112236a((Object) list3, "mChallenge.showItems");
            for (ShowItemsStruct showItemsStruct : list3) {
                C25509a aVar2 = new C25509a();
                aVar2.f67470c = showItemsStruct.getDesc();
                aVar2.f67471d = showItemsStruct.getSchema();
                Challenge challenge5 = this.f65557a;
                if (challenge5 == null) {
                    C52711k.m112237a("mChallenge");
                }
                aVar2.mo50460a(challenge5.getCid());
                this.f65558b.mo50617m().add(aVar2);
                mo50638b().f102922c.add(aVar2);
                mo50638b().f102923d.add(Integer.valueOf(aVar2.hashCode()));
            }
            for (C27336g a_ : this.f65558b.mo50617m()) {
                a_.mo50464a_(true);
            }
            mo50638b().notifyDataSetChanged();
            int size = mo50638b().f102922c.size();
            if (i >= 0 && size > i) {
                cVar.element = i;
            }
            this.f65560d.setupWithViewPager(this.f65559c);
            this.f65560d.setOnTabClickListener(new C24765b(this));
            this.f65560d.mo19349a((C10737c) new C24766c(this));
            ((ChallengeViewPager) this.f65559c).setCurrentItem(cVar.element);
            this.f65559c.addOnPageChangeListener(new C24767d(this, cVar));
            this.f65558b.onPageSelected(cVar.element);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ChallengeViewPager");
    }
}
