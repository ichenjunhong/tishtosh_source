package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.C2240a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.discover.helper.C28209q;
import com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37355h;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.poi.adapter.C38970b;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e;
import com.p683ss.android.ugc.aweme.poi.adapter.C38975f;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder.C38992a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C39000b;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.p683ss.android.ugc.aweme.poi.map.C39074f;
import com.p683ss.android.ugc.aweme.poi.map.C39078j;
import com.p683ss.android.ugc.aweme.poi.map.C39079k;
import com.p683ss.android.ugc.aweme.poi.map.C39081m;
import com.p683ss.android.ugc.aweme.poi.map.C39082n;
import com.p683ss.android.ugc.aweme.poi.map.C39083o;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.model.C39101ag;
import com.p683ss.android.ugc.aweme.poi.model.C39125i;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39043c;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39044d;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j.C39386a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a.C39278a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a.C39279b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.upload.ChooseImageActivity;
import com.p683ss.android.ugc.aweme.poi.preview.C39154a;
import com.p683ss.android.ugc.aweme.poi.preview.C39159b;
import com.p683ss.android.ugc.aweme.poi.utils.C39442c;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.p683ss.android.ugc.aweme.poi.utils.C39446g;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.utils.C39468x;
import com.p683ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment */
public abstract class AbsSlidablePoiAwemeFeedFragment extends AbsPoiAwemeFeedFragment implements C9382a, C38999a, C39000b, C39078j, C39079k, C39081m, C39082n, C39083o, C39386a {

    /* renamed from: A */
    protected C9381g f100304A;

    /* renamed from: B */
    protected C39446g f100305B;

    /* renamed from: C */
    private C38975f f100306C;

    /* renamed from: D */
    private C28209q f100307D;

    /* renamed from: E */
    private C39159b f100308E;

    /* renamed from: F */
    private double f100309F;

    /* renamed from: G */
    private double f100310G;

    /* renamed from: H */
    private C36282r f100311H;

    /* renamed from: I */
    private String f100312I;

    /* renamed from: J */
    private C39044d f100313J;

    /* renamed from: K */
    private boolean f100314K;
    protected AutoRTLImageView mBackBtn;
    protected BannerViewPager mBannerVPer;
    ViewGroup mCollectContainer;
    public View mHeader;
    protected DmtTextView mIndicatorView;
    ImageView mMoreActionBtn;
    protected PoiHeaderLayout mPoiHeaderLayout;
    protected MapLayout mPoiMap;
    protected View mPoiMore;
    protected View mRouteStatus;
    ImageView mShareBtn;
    protected View mStatusBar;
    View mTitleBarBg;
    View mTitleBarTools;
    public CheckableImageView mTopCollectImg;
    protected View mTopbar;
    protected View mTopbarBg;
    public View mTopbarStatus;
    protected ImageView mUploadImage;

    /* renamed from: y */
    protected PoiOptimizedRoutePresenter f100315y;

    /* renamed from: z */
    public List<C39101ag> f100316z;

    /* renamed from: K */
    public abstract void mo80050K();

    /* renamed from: L */
    public boolean mo80051L() {
        return true;
    }

    /* renamed from: Y_ */
    public boolean mo45396Y_() {
        return true;
    }

    /* renamed from: d */
    public final CheckableImageView mo79152d() {
        return this.mTopCollectImg;
    }

    /* renamed from: i */
    public final int mo80030i() {
        return 65441;
    }

    /* renamed from: j */
    public final C11079a mo80015G() {
        return this;
    }

    /* renamed from: z */
    public final C38999a mo80044z() {
        return this;
    }

    /* renamed from: M */
    private void m87254M() {
        this.f100311H = C36286a.m81925a().mo75120b(null);
    }

    public final void bE_() {
        C39452l.m87735a("click_map", "zoom", this.f100279e);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f100304A != null) {
            this.f100304A.removeCallbacksAndMessages(null);
        }
    }

    public void onDestroyView() {
        if (this.mPoiMap != null) {
            this.mPoiMap.mo79274e();
        }
        super.onDestroyView();
    }

    public void onLowMemory() {
        if (this.mPoiMap != null) {
            this.mPoiMap.mo79275f();
        }
        super.onLowMemory();
    }

    public void onPause() {
        super.onPause();
        this.mPoiMap.mo79271c();
        C39043c.pageKey = this.f100312I;
    }

    public void onStart() {
        super.onStart();
        this.mPoiMap.mo79270b();
    }

    public void onStop() {
        super.onStop();
        this.mPoiMap.mo79272d();
    }

    /* renamed from: r */
    public final C39384j mo80041r() {
        if (this.f100276b == null) {
            this.f100276b = new C39278a(this);
        }
        return this.f100276b;
    }

    /* renamed from: s */
    public final C39387k mo80042s() {
        if (this.f100275a == null) {
            this.f100275a = new C39279b();
        }
        return this.f100275a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo80049J() {
        if (isViewValid() && this.mPoiHeaderLayout != null) {
            this.mPoiHeaderLayout.mo80450a(this.f100283m);
            PoiHeaderLayout poiHeaderLayout = this.mPoiHeaderLayout;
            View view = this.mPoiMore;
            PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = poiHeaderLayout.f100941a;
            if (poiDetailHeaderInfoPresenter != null) {
                poiDetailHeaderInfoPresenter.mo79147a(view);
            }
        }
    }

    public final void bG_() {
        this.f100314K = true;
        if (this.f100284n != null && isViewValid()) {
            this.f100315y.mo80063a(this.f100284n);
        }
    }

    public void onResume() {
        boolean z;
        super.onResume();
        this.mPoiMap.mo79264a();
        if (this.f100313J != null && this.f100313J.isSuccess()) {
            Context context = getContext();
            long c = C23859b.m58575b().mo49473c(context, "order_guide_displayed");
            long currentTimeMillis = System.currentTimeMillis();
            if (c <= 0 || (currentTimeMillis > c && currentTimeMillis - c > 604800000)) {
                C23859b.m58575b().mo49463a(context, "order_guide_displayed", currentTimeMillis);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                new C39405q(getActivity(), this.f100313J.isBookOrder(), this.f100279e).show();
            }
            this.f100313J = null;
        }
    }

    /* renamed from: y */
    public final C39140x mo80043y() {
        String str;
        C39125i iVar = new C39125i(mo80030i());
        if (this.f100278d != null) {
            iVar.mo79782a(this.f100278d.poiId).mo79784b(this.f100278d.cityCode).mo79788d(this.f100278d.backendType);
            if (!TextUtils.isEmpty(C30228f.m70982f())) {
                if (C30228f.m70982f().equalsIgnoreCase(this.f100278d.cityCode)) {
                    str = "1";
                } else {
                    str = "0";
                }
                iVar.mo79786c(str);
            }
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo80048I() {
        if (this.mBannerVPer.getVisibility() != 0) {
            C39443d.m87702a(getContext(), C23324d.m57378a().getRawAdAwemeById(mo80010A()), "map", this.f100280j);
            mo80050K();
            mo79283a(this.f100309F, this.f100310G);
            return;
        }
        C39154a.m86995a("top_pic", this.f100275a.f100746m);
        int size = this.f100316z.size();
        if (this.f100308E == null) {
            this.f100308E = C39159b.m87005a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C39101ag agVar : this.f100316z) {
                arrayList.add(agVar.getMedium());
                arrayList2.add(agVar.getLarge());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "poi_page");
            hashMap.put("poi_id", this.f100280j);
            hashMap.put("page_type", "top_pic");
            hashMap.put("poi_type", this.f100282l);
            hashMap.put("group_id", mo80010A());
            hashMap.put("previous_page", mo63443x());
            C39452l.m87736a(hashMap, this.f100279e);
            this.f100308E.mo79798a(getContext(), arrayList, arrayList2, this.mBannerVPer, size, R.id.ci1, this.f100280j, hashMap, true, true);
        }
        this.f100308E.mo79801a("tag_poi_header", this.mBannerVPer.getCurrentItem() % size, size);
    }

    /* renamed from: a */
    public final void mo79150a(boolean z) {
        mo80050K();
    }

    @C53771m
    public void onEvent(C39044d dVar) {
        this.f100313J = dVar;
    }

    @C53771m
    public void onEvent(C39043c cVar) {
        if (cVar != null) {
            cVar.isSamePage(this.f100312I);
        }
    }

    public void handleMsg(Message message) {
        if (isViewValid() && message != null) {
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mPoiMap.mo79268a(bundle);
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("poi", hVar.itemType) || TextUtils.equals("coupon", hVar.itemType)) {
            C47881fd.m103578a(getActivity(), this.mStartRecordOutRing, hVar);
        }
    }

    /* renamed from: b */
    public final void mo80053b(int i) {
        this.mIndicatorView.setText(C2240a.m6772a(getString(R.string.cr7), new Object[]{Integer.valueOf(i), Integer.valueOf(this.f100316z.size())}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo80025b(C36282r rVar) {
        boolean z;
        float f;
        super.mo80025b(rVar);
        m87254M();
        if (this.f100283m != null) {
            if (this.f100309F <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f100310G <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                z = false;
            } else {
                z = true;
            }
            if (z && getContext() != null) {
                MapLayout mapLayout = this.mPoiMap;
                Bitmap a = C39462r.m87764a(getContext());
                double d = this.f100309F;
                double d2 = this.f100310G;
                if (this.f100283m == null || !C39468x.m87786a(this.f100283m.getPoiStruct(), this.f100311H)) {
                    f = this.mPoiMap.getZoomSmall();
                } else {
                    f = this.mPoiMap.getZoomBig();
                }
                mapLayout.mo79267a(a, d, d2, f, null);
            }
        }
    }

    @C53771m
    public void onEvent(C37355h hVar) {
        if (!(hVar.f95317b == null || !TextUtils.equals(hVar.f95317b.poiId, this.f100280j) || this.f100275a == null)) {
            C39387k kVar = this.f100275a;
            int i = hVar.f95316a;
            if (kVar.isViewValid() && kVar.f83139f != null) {
                C38973e eVar = (C38973e) kVar.f83139f;
                if (eVar.f99258E != null) {
                    PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = eVar.f99258E;
                    if (poiOptimizedDetailViewHolder.f99370c != null) {
                        C39389l lVar = poiOptimizedDetailViewHolder.f99370c;
                        if (lVar.f100759c != null) {
                            if (i == 0) {
                                lVar.f100758b = false;
                            } else {
                                lVar.f100758b = true;
                            }
                            lVar.f100759c.setCollectStatus(i);
                            lVar.mo80359c();
                        }
                    }
                }
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bzn) {
            mo80048I();
        } else if (id == R.id.azc) {
            if (this.f100275a != null && !C32800a.m75679a(this.mTopCollectImg)) {
                C39387k kVar = this.f100275a;
                ViewGroup viewGroup = this.mCollectContainer;
                if (kVar.isViewValid() && kVar.f83139f != null) {
                    C38973e eVar = (C38973e) kVar.f83139f;
                    if (eVar.f99258E != null) {
                        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = eVar.f99258E;
                        if (poiOptimizedDetailViewHolder.f99370c != null) {
                            poiOptimizedDetailViewHolder.f99370c.mo80356a((View) viewGroup, true);
                        }
                    }
                }
            }
        } else {
            if (id == R.id.cmr) {
                if (!C32800a.m75679a(view)) {
                    String str = this.f100280j;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C11010c.m22280a().getFilesDir().getPath());
                    sb.append("/mapthumb/");
                    sb.append(str);
                    sb.append(".jpg");
                    if (!new File(sb.toString()).exists()) {
                        MapLayout mapLayout = this.mPoiMap;
                        new C39074f(new C39382h(this));
                    }
                } else {
                    return;
                }
            } else if (id != R.id.c0b) {
                if (id == R.id.c37) {
                    C23361b.m57419a(getActivity(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C39383i(this));
                    return;
                }
            } else {
                return;
            }
            super.onClick(view);
        }
    }

    /* renamed from: a */
    public boolean mo80023a(PoiDetail poiDetail) {
        String str;
        if (super.mo80023a(poiDetail) || !isViewValid() || poiDetail == null || poiDetail.getPoiStruct() == null) {
            return true;
        }
        this.f100283m = poiDetail;
        if (this.f100314K) {
            this.f100315y.mo80063a(this.f100284n);
        }
        C39140x b = mo80043y().mo79782a(this.f100284n.poiId).mo79784b(this.f100284n.getCityCode());
        if (C30228f.m70982f().equalsIgnoreCase(this.f100284n.getCityCode())) {
            str = "1";
        } else {
            str = "0";
        }
        b.mo79786c(str).mo79788d(this.f100284n.getBackendTypeCode());
        if (!poiDetail.isPoiValid()) {
            C10691a.m21542b(getContext(), (int) R.string.cr8).mo19066a();
        }
        if (poiDetail.poiExtension == null || !poiDetail.poiExtension.hasUploadImagePermission) {
            this.mUploadImage.setVisibility(8);
        } else {
            this.mUploadImage.setVisibility(0);
        }
        if (!C9431p.m18664a(this.f100284n.getPoiLatitude()) && !C9431p.m18664a(this.f100284n.getPoiLongitude())) {
            try {
                m87254M();
                this.f100309F = Double.parseDouble(this.f100284n.getPoiLatitude());
                this.f100310G = Double.parseDouble(this.f100284n.getPoiLongitude());
                double[] a = C39442c.m87696a(this.f100309F, this.f100310G);
                this.f100309F = a[0];
                this.f100310G = a[1];
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
        List<C39101ag> poiTopPhoto = poiDetail.getPoiTopPhoto();
        if (!(!isViewValid() || poiTopPhoto == null || poiTopPhoto.size() == 0)) {
            this.f100316z = poiTopPhoto;
            this.f100307D = new C28209q(this.mBannerVPer);
            C1056u.m3049c((View) this.mIndicatorView, 0);
            if (poiTopPhoto.size() > 1) {
                this.mIndicatorView.setVisibility(0);
            }
            this.mBannerVPer.setVisibility(0);
            if (this.f100306C == null) {
                this.f100306C = new C38975f(getContext(), LayoutInflater.from(getContext()), this.f100280j, new C38992a() {
                    /* renamed from: a */
                    public final void mo79138a() {
                        AbsSlidablePoiAwemeFeedFragment.this.mo80048I();
                    }
                });
                this.mBannerVPer.setAdapter(new C38970b(this.f100306C, this.f100316z.size(), true));
            }
            boolean a2 = C47918gj.m103682a(getContext());
            if (a2) {
                Collections.reverse(poiTopPhoto);
            }
            this.f100307D.f74055b = poiTopPhoto.size();
            this.f100307D.f74056c = false;
            C38975f fVar = this.f100306C;
            fVar.f99267d = poiTopPhoto;
            fVar.notifyDataSetChanged();
            this.mBannerVPer.addOnPageChangeListener(new C0997e() {
                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        C39154a.m86993a(AbsSlidablePoiAwemeFeedFragment.this.f100279e, "top_pic");
                    }
                }

                public final void onPageSelected(int i) {
                    AbsSlidablePoiAwemeFeedFragment.this.mo80053b((i % AbsSlidablePoiAwemeFeedFragment.this.f100316z.size()) + 1);
                }
            });
            if (a2) {
                this.mBannerVPer.setCurrentItem(poiTopPhoto.size() - 1);
                mo80053b(poiTopPhoto.size() - 1);
            } else {
                mo80053b(1);
            }
        }
        mo80049J();
        C47718bf.m103288a(new C39043c());
        return false;
    }

    /* renamed from: a */
    public final void mo79283a(double d, double d2) {
        C39452l.m87735a("click_map", "click", this.f100279e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80052a(String[] strArr, int[] iArr) {
        if (strArr != null && strArr.length != 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(getActivity(), ChooseImageActivity.class);
                intent.putExtra("poi_id", this.f100280j);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.q, 0);
                return;
            }
            C10691a.m21543b((Context) getActivity(), (int) R.string.co0, 0).mo19066a();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            this.mTopbarStatus.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
            this.mRouteStatus.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
        }
        this.f100315y = new PoiOptimizedRoutePresenter();
        this.f100315y.mo80079a(this, view, this.mPoiMap, mo80051L());
        this.f100305B = new C39446g();
        this.mPoiMap.mo79269a(bundle, this);
        this.mPoiMap.setOnMapClickListener(this);
        this.mPoiMap.setOnMapZoomGestureListener(this);
        this.mPoiMap.f99666a = this;
        this.f100304A = new C9381g(this);
        if (!C39462r.m87772a()) {
            this.mTopCollectImg.setVisibility(8);
        }
        if (this.mPoiHeaderLayout != null) {
            this.mPoiHeaderLayout.mo80449a(this, this, null, this);
        }
        ((LayoutParams) this.mTitleBarBg.getLayoutParams()).height = (int) C9432q.m18687b(getContext(), 52.0f);
        int b = (int) C9432q.m18687b(getContext(), 32.0f);
        int b2 = (int) C9432q.m18687b(getContext(), 12.0f);
        this.mBackBtn.setBackgroundResource(R.drawable.dk0);
        this.mBackBtn.setImageResource(R.drawable.dl_);
        LayoutParams layoutParams = (LayoutParams) this.mBackBtn.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        layoutParams.leftMargin = b2;
        int b3 = (int) C9432q.m18687b(getContext(), 6.0f);
        this.mBackBtn.setPadding(b3, b3, b3, b3);
        ((LayoutParams) this.mTitleBarTools.getLayoutParams()).rightMargin = b2;
        this.mTopCollectImg.setBackgroundResource(R.drawable.dk0);
        this.mTopCollectImg.setImageResource(R.drawable.dgh);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mTopCollectImg.getLayoutParams();
        layoutParams2.width = b;
        layoutParams2.height = b;
        this.mTopCollectImg.setPadding(b3, b3, b3, b3);
        this.mTopCollectImg.setTag(R.id.aqy, Boolean.valueOf(true));
        this.mShareBtn.setBackgroundResource(R.drawable.dk0);
        this.mShareBtn.setImageResource(R.drawable.dl9);
        this.mMoreActionBtn.setBackgroundResource(R.drawable.dk0);
        this.mMoreActionBtn.setImageResource(R.drawable.dk_);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.mShareBtn.getLayoutParams();
        layoutParams3.width = b;
        layoutParams3.height = b;
        layoutParams3.leftMargin = (int) C9432q.m18687b(getContext(), 8.0f);
        this.mShareBtn.setPadding(b3, b3, b3, b3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.mMoreActionBtn.getLayoutParams();
        layoutParams4.width = b;
        layoutParams4.height = b;
        layoutParams4.leftMargin = (int) C9432q.m18687b(getContext(), 8.0f);
        this.mMoreActionBtn.setPadding(b3, b3, b3, b3);
        StringBuilder sb = new StringBuilder(this.f100280j);
        sb.append(System.currentTimeMillis());
        this.f100312I = C48675k.m105342a(sb.toString());
    }
}
