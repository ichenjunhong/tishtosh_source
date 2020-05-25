package com.p683ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.draft.model.C29057a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39559e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be.C39595a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl.C39606a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.MobParam;
import com.p683ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.Publish;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42423an;
import com.p683ss.android.ugc.aweme.shortvideo.C42464bj;
import com.p683ss.android.ugc.aweme.shortvideo.C42480by;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C42558cp;
import com.p683ss.android.ugc.aweme.shortvideo.C42559cq;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43217dk;
import com.p683ss.android.ugc.aweme.shortvideo.C43301dw;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43839fl;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43597g;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45054bg;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45207p;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44364a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44365b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44378h;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44394n;
import com.p683ss.android.ugc.aweme.shortvideo.util.VideoPublishHintDescriptionSettings;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p683ss.android.ugc.aweme.status.C45733a;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photomovie.m */
public final class C38805m extends Fragment implements OnClickListener, C39592a, C42480by {

    /* renamed from: a */
    public PhotoMovieContext f98745a;

    /* renamed from: b */
    C45546c f98746b;

    /* renamed from: c */
    C44365b f98747c = new C44365b();

    /* renamed from: d */
    C43839fl f98748d;

    /* renamed from: e */
    C42559cq f98749e;

    /* renamed from: f */
    LinearLayout f98750f;

    /* renamed from: g */
    C42464bj f98751g;

    /* renamed from: h */
    ImageView f98752h;

    /* renamed from: i */
    FrameLayout f98753i;

    /* renamed from: j */
    C43217dk f98754j;

    /* renamed from: k */
    C44378h f98755k;

    /* renamed from: l */
    public boolean f98756l;

    /* renamed from: m */
    Handler f98757m;

    /* renamed from: n */
    List<C0794k<Class<?>, IAVPublishExtension<?>>> f98758n = C39618d.f101179t.mo74306a(AVPublishContentType.PhotoMovie);

    /* renamed from: o */
    OnTouchListener f98759o = new C38812n(this);

    /* renamed from: p */
    private PermissionSettingItem f98760p;

    /* renamed from: q */
    private CommonItemView f98761q;

    /* renamed from: r */
    private CommonItemView f98762r;

    /* renamed from: s */
    private View f98763s;

    /* renamed from: t */
    private C26916m f98764t;

    /* renamed from: u */
    private long f98765u;

    /* renamed from: v */
    private TextView f98766v;

    /* renamed from: w */
    private TextView f98767w;

    /* renamed from: x */
    private HashTagMentionEditText f98768x;

    /* renamed from: y */
    private CheckBox f98769y;

    /* renamed from: z */
    private FrameLayout f98770z;

    /* renamed from: e */
    public final boolean mo78636e() {
        return false;
    }

    /* renamed from: f */
    public final void mo78637f() {
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: d */
    public final String mo78635d() {
        return this.f98748d.mo89380c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ C52860x mo78779g() {
        mo78775a();
        return null;
    }

    /* renamed from: i */
    private void m86218i() {
        this.f98745a.getPhotoMovieCover(new C38821w(this));
    }

    /* renamed from: c */
    public final String mo78634c() {
        if (this.f98745a == null) {
            return null;
        }
        return this.f98745a.commerceData;
    }

    /* renamed from: k */
    private void m86220k() {
        if (this.f98755k != null) {
            this.f98745a.commentSetting = this.f98755k.mo90238a(this.f98762r);
            this.f98745a.allowDownloadSetting = this.f98755k.mo90245c();
        }
    }

    /* renamed from: b */
    public final void mo78778b() {
        C44394n.m97193a(getActivity(), new C38817s(this), new C38818t(this), new C38819u(this), new C38820v(this));
    }

    /* renamed from: j */
    private void m86219j() {
        this.f98745a.setMainBusinessData(C43597g.updateSDKShareContextWhenSaveOrPost(this.f98745a.mIsFromDraft, this.f98745a.getMainBusinessData()));
        this.f98764t = (C26916m) C39618d.f101139C.getRetrofitFactoryGson().mo34884a(C43597g.getShareContext(this.f98745a.getMainBusinessData()), C26916m.class);
    }

    public final void onDestroyView() {
        m86217a(getView(), null);
        super.onDestroyView();
        this.f98754j.mo87870c();
        for (C0794k kVar : this.f98758n) {
            ((IAVPublishExtension) kVar.f2712b).onDestroy();
        }
    }

    public final void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        for (C0794k kVar : this.f98758n) {
            ((IAVPublishExtension) kVar.f2712b).onResume();
        }
    }

    /* renamed from: a */
    public final void mo78775a() {
        C26890h.m65011a("save_draft", C23089d.m56640a().mo47829a("creation_id", this.f98745a.creationId).mo47829a("shoot_way", this.f98745a.mShootWay).mo47826a("draft_id", this.f98745a.draftId).mo47829a("content_type", "slideshow").mo47829a("content_source", "upload").mo47829a("enter_from", "video_post_page").f61491a);
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f98758n, PoiPublishModel.class);
        if (poiPublishModel != null) {
            this.f98745a.poiId = poiPublishModel.getPoiContext();
        }
        m86219j();
        mo78777a(false);
        C10691a.m21539a((Context) C39618d.f101160a, getString(R.string.d_3), 1, 1).mo19066a();
        Intent intent = new Intent();
        if (C39618d.f101152P.mo83103a(C40790a.EnableOptimizePublishContainerActivityNotInStack) && !C39618d.f101162c.mo74160f()) {
            intent.putExtra("enable_optimize_main_not_in_stack", true);
        }
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
        if (this.f98764t != null && !this.f98745a.mIsFromDraft) {
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", this.f98764t);
        }
        if (this.f98745a.mIsFromDraft) {
            intent.setFlags(536870912);
            C44403a.m97196a().mo48307c(getActivity(), intent);
            return;
        }
        intent.addFlags(872415232);
        intent.setClass(getActivity(), C39618d.f101162c.mo74158d());
        startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ C52860x mo78780h() {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (C39618d.f101183x.mo74286f()) {
            C10691a.m21548c(getContext(), (int) R.string.dw2).mo19066a();
        } else {
            this.f98765u = SystemClock.uptimeMillis();
            this.f98748d.mo89378b("publish");
            m86219j();
            this.f98748d.mo89377b();
            this.f98745a.title = this.f98748d.mo89380c();
            if (this.f98748d.mo89381d() != null) {
                this.f98745a.structList = this.f98748d.mo89381d();
            }
            GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f98758n, GoodsPublishModel.class);
            if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
                this.f98745a.shopDraftId = goodsPublishModel.getGoodsDraftId();
            }
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f98758n, PoiPublishModel.class);
            if (poiPublishModel != null) {
                this.f98745a.poiId = poiPublishModel.getPoiContext();
                this.f98745a.latitude = poiPublishModel.getLatitude();
                this.f98745a.longitude = poiPublishModel.getLongitude();
            }
            this.f98745a.isPrivate = this.f98749e.mo86781a();
            this.f98745a.reactDuetSetting = this.f98755k.mo90244b(this.f98761q);
            this.f98745a.commentSetting = this.f98755k.mo90238a(this.f98762r);
            this.f98755k.mo90242a((BaseShortVideoContext) this.f98745a);
            this.f98745a.city = C39618d.f101183x.mo74285e().mo46164h();
            if (this.f98747c.mo90230a() != null) {
                this.f98745a.challenges = Collections.singletonList(this.f98747c.f112277a);
            } else {
                this.f98745a.challenges = null;
            }
            this.f98745a.mSaveModel = C43301dw.m94961a(this.f98745a.mSaveModel, this.f98754j.mo87869b());
            if (this.f98745a.mSaveModel != null) {
                this.f98745a.mSaveModel.setSaveToAlbum(this.f98755k.mo90243a());
                this.f98745a.mSaveModel.setSaveToAppPathInsteadOfAlbum(this.f98755k.f112290e);
                this.f98745a.mSaveModel.setEnableSilentEnhancement(C44378h.m97179e());
            }
            int i2 = 1;
            mo78777a(true);
            if (getActivity() != null) {
                getActivity().finish();
                C46806g.m101653a(C44309n.m97057a((BaseShortVideoContext) this.f98745a), C44309n.m97058b((BaseShortVideoContext) this.f98745a), C46804e.PUBLISH, C46804e.SEND_REQUEST);
                this.f98745a.mOutputVideoPath = C43307ea.m94996a(".mp4");
                PhotoMovieContext photoMovieContext = this.f98745a;
                if (this.f98745a.mMusicPath == null) {
                    str = "";
                } else {
                    str = C43307ea.m94996a(".wav");
                }
                photoMovieContext.mInputAudioPath = str;
                this.f98745a.mSyncPlatforms = this.f98754j.mo87866a();
                this.f98745a.userClickPublishTime = this.f98765u;
                Bundle bundle = new Bundle();
                bundle.putInt("video_type", 0);
                bundle.putParcelable(IPhotoMovieService.EXTRA_VIDEO_PUBLISH_ARGS, this.f98745a);
                bundle.putString("shoot_way", this.f98745a.mShootWay);
                Publish.PublishBundle = bundle;
                C23763a.m58315a().mo49225a(getActivity(), bundle);
                for (C0794k kVar : this.f98758n) {
                    ((IAVPublishExtension) kVar.f2712b).onPublish(C38744b.m86100a(this.f98745a));
                }
                C47858ep.m103516b();
                PoiPublishModel poiPublishModel2 = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f98758n, PoiPublishModel.class);
                SeedPublishModel seedPublishModel = (SeedPublishModel) AVPublishExtensionUtils.findModel(this.f98758n, SeedPublishModel.class);
                C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98745a.creationId).mo47829a("shoot_way", this.f98745a.mShootWay).mo47829a("filter_list", this.f98745a.mFilterName).mo47826a("filter_id_list", this.f98745a.mFilterId).mo47829a("mix_type", C45624b.m99356a(0, this.f98745a.getImageCount()));
                String str8 = "is_multi_content";
                if (this.f98745a.getImageCount() > 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                C23089d a2 = a.mo47826a(str8, i).mo47829a("prop_selected_from", this.f98745a.getPropSource()).mo47826a("draft_id", this.f98745a.draftId);
                String str9 = "music_selected_from";
                if (this.f98745a.musicOrigin == null) {
                    str2 = "original";
                } else {
                    str2 = this.f98745a.musicOrigin;
                }
                C23089d a3 = a2.mo47829a(str9, str2).mo47829a("content_type", "slideshow").mo47829a("content_source", "upload").mo47829a("enter_from", "video_post_page").mo47829a("from_group_id", C42423an.m93185a());
                String str10 = "is_multi_content";
                if (this.f98745a.mRealImageCount <= 1) {
                    i2 = 0;
                }
                C23089d a4 = a3.mo47826a(str10, i2);
                String str11 = "seed_id";
                if (seedPublishModel != null) {
                    str3 = seedPublishModel.getSeedId();
                } else {
                    str3 = "0";
                }
                C23089d a5 = a4.mo47829a(str11, str3);
                String str12 = "seed_name";
                if (seedPublishModel != null) {
                    str4 = seedPublishModel.getSeedName();
                } else {
                    str4 = "";
                }
                C23089d a6 = a5.mo47829a(str12, str4);
                String str13 = "refer_seed_id";
                if (seedPublishModel != null) {
                    str5 = seedPublishModel.getReferSeedId();
                } else {
                    str5 = "";
                }
                C23089d a7 = a6.mo47829a(str13, str5);
                String str14 = "refer_seed_name";
                if (seedPublishModel != null) {
                    str6 = seedPublishModel.getReferSeedName();
                } else {
                    str6 = "";
                }
                C23089d a8 = a7.mo47829a(str14, str6);
                String str15 = "data_type";
                if (seedPublishModel != null) {
                    str7 = seedPublishModel.getDataType();
                } else {
                    str7 = "";
                }
                Map<String, String> map = a8.mo47829a(str15, str7).mo47826a("location_gps_cnt", this.f98745a.getCoordinateCount()).f61491a;
                if (poiPublishModel2 != null) {
                    map.putAll(poiPublishModel2.getMobParams());
                    this.f98745a.poiServerMobParam = poiPublishModel2.getServerMobParams();
                }
                if (C45733a.m99540a()) {
                    map.put("is_commercial", "1");
                }
                C26890h.m65011a("publish", map);
                C26890h.m65011a("performance_publish", new C23089d().mo47829a("creation_id", this.f98745a.creationId).mo47829a("content_type", "slideshow").mo47826a("retry_publish", 0).mo47826a("video_type", 6).mo47826a("video_upload_type", 0).f61491a);
                if (this.f98745a.isSaveLocal()) {
                    C26890h.m65011a("download", new C23089d().mo47826a("scene_id", 1004).mo47829a("group_id", "").mo47829a("enter_from", "video_post_page").mo47829a("download_type", "self").mo47829a("download_method", "download_with_publish").f61491a);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo78776a(Object obj) {
        this.f98756l = true;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* renamed from: a */
    public final void mo78632a(String str) {
        if (this.f98745a != null) {
            this.f98745a.commerceData = str;
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.a8i) {
            if (!C39618d.f101183x.mo74282b()) {
                C39618d.f101183x.mo74277a((Fragment) this, "photo_movie_post_page", "click_save_draft", (Bundle) null, (C39528a) new C39528a() {
                    /* renamed from: b */
                    public final void mo64372b() {
                    }

                    /* renamed from: a */
                    public final void mo64371a() {
                        if (C38805m.this.f98755k != null) {
                            C38805m.this.f98755k.mo90246d();
                        }
                        if (C39618d.f101152P.mo83103a(C40790a.EnableAutoProcessAfterLogin)) {
                            C38805m.this.mo78775a();
                        }
                    }
                });
                return;
            }
            mo78775a();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f98749e.mo86784a(bundle);
        for (C0794k kVar : this.f98758n) {
            ((IAVPublishExtension) kVar.f2712b).onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.f98747c.f112277a);
        bundle.putBoolean("contentModified", this.f98756l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo78777a(boolean z) {
        if (this.f98745a != null) {
            m86220k();
            C39595a b = C39618d.f101174o.mo74238b();
            boolean z2 = true;
            if (this.f98745a.isPrivate != 1) {
                z2 = false;
            }
            b.mo74246a(Boolean.valueOf(z2));
            C29059c convertToDraft = C46994b.m102064a().convertToDraft(this.f98745a);
            C43214dh.m94817a().f109293h = convertToDraft.mo58774ak();
            C29057a aVar = new C29057a();
            this.f98748d.mo89377b();
            aVar.f76028a = this.f98748d.mo89380c();
            List<AVTextExtraStruct> d = this.f98748d.mo89381d();
            if (d != null) {
                aVar.f76029b = d;
            }
            if (this.f98747c.mo90230a() != null) {
                aVar.f76030c = Collections.singletonList(this.f98747c.f112277a);
            }
            convertToDraft.f76124B = this.f98749e.mo86781a();
            convertToDraft.f76144b = aVar;
            C39618d.f101144H.mo58573d().mo80730a(convertToDraft);
            C46994b.m102064a().notifyDraftUpdate(convertToDraft);
            for (C0794k kVar : this.f98758n) {
                ((IAVPublishExtension) kVar.f2712b).onSaveDraft(C38744b.m86100a(this.f98745a));
            }
            C39629l.m88232a().mo58573d().mo80732a(convertToDraft, z);
        }
    }

    /* renamed from: a */
    private void m86217a(View view, OnTouchListener onTouchListener) {
        if (view.getId() != R.id.gf) {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m86217a(viewGroup.getChildAt(i), onTouchListener);
                    i++;
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        HashMap hashMap;
        boolean z;
        boolean z2;
        View view2 = view;
        Bundle bundle2 = bundle;
        super.onViewCreated(view, bundle);
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) C0214z.m438a((Fragment) this).mo359a(ExtensionDataRepo.class);
        if (VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        this.f98745a = (PhotoMovieContext) getActivity().getIntent().getParcelableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE);
        this.f98763s = view2.findViewById(R.id.a8i);
        this.f98763s.setOnClickListener(this);
        this.f98757m = new Handler();
        m86217a(view2, this.f98759o);
        this.f98760p = (PermissionSettingItem) view2.findViewById(R.id.bx9);
        this.f98749e = C42559cq.m93454a(this, this.f98760p, 0);
        C45054bg.m98549a(this.f98760p, (Activity) getActivity());
        this.f98749e.mo86785a((C42558cp) new C42558cp() {
        });
        this.f98750f = (LinearLayout) view2.findViewById(R.id.b9m);
        this.f98761q = (CommonItemView) view2.findViewById(R.id.c9a);
        this.f98762r = (CommonItemView) view2.findViewById(R.id.xj);
        this.f98766v = (TextView) view2.findViewById(R.id.ge);
        this.f98768x = (HashTagMentionEditText) view2.findViewById(R.id.a9y);
        this.f98767w = (TextView) view2.findViewById(R.id.gf);
        this.f98748d = C43839fl.m96268a(this, this.f98768x, this.f98767w, this.f98766v, 0);
        this.f98751g = C42464bj.m93292a(this.f98745a.creationId, this.f98748d, view2);
        this.f98755k = new C44378h(this, this.f98745a.mIsFromDraft, 5);
        this.f98755k.mo90240a(this.f98750f);
        C44378h hVar = this.f98755k;
        LinearLayout linearLayout = this.f98750f;
        PhotoMovieContext photoMovieContext = this.f98745a;
        String str = null;
        if (this.f98745a == null) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("creation_id", this.f98745a.creationId);
            hashMap2.put("enter_from", "video_post_page");
            hashMap2.put("content_type", "photo");
            hashMap2.put("shoot_way", this.f98745a.mShootWay);
            hashMap = hashMap2;
        }
        hVar.mo90241a(linearLayout, photoMovieContext, hashMap, this.f98745a.creationId, this.f98761q, this.f98762r);
        this.f98754j = C43217dk.m94834a((Fragment) this, view2, 3);
        try {
            z = C32816h.m75716b().getSilentShareConfigurable().booleanValue();
        } catch (C10174a unused) {
            z = true;
        }
        if (z) {
            C43217dk dkVar = this.f98754j;
            String string = getString(R.string.dhh);
            C52711k.m112240b(string, "string");
            if (dkVar != null) {
                C39606a aVar = dkVar.f109303a;
                if (aVar != null) {
                    aVar.mo74258a(string);
                }
            }
        }
        this.f98748d.mo89371a();
        this.f98748d.mo89376a(this.f98745a.challenges);
        this.f98752h = (ImageView) view2.findViewById(R.id.ar6);
        this.f98752h.setScaleType(ScaleType.CENTER_CROP);
        m86218i();
        this.f98752h.setOnClickListener(new C38813o(this));
        view2.findViewById(R.id.t8).setOnClickListener(new C47687av(800) {
            /* renamed from: a */
            public final void mo59929a(View view) {
                C26890h.m65011a("click_cover_entrance", C23089d.m56640a().mo47829a("creation_id", C38805m.this.f98745a.creationId).mo47829a("enter_from", "video_post_page").mo47829a("content_type", "photo").mo47829a("shoot_way", C38805m.this.f98745a.mShootWay).mo47829a("content_source", "upload").f61491a);
                C39618d.m88208a(C38805m.this.getActivity(), "from publish_choose_cover", new PhotoMovieServiceLoadCallback() {
                    public final void onPhotoMovieServiceLoadFailed(int i, String str) {
                    }

                    public final void onPhotoMovieServiceLoadSuccess(IPhotoMovieService iPhotoMovieService) {
                        iPhotoMovieService.startPhotoMovieChooseCoverActivity(C38805m.this.getActivity(), C38805m.this.f98745a, 4);
                    }
                });
            }
        });
        this.f98753i = (FrameLayout) view2.findViewById(R.id.c6u);
        this.f98753i.setOnClickListener(new C38815q(this));
        List list = this.f98745a.challenges;
        if (list != null && !list.isEmpty()) {
            this.f98747c.f112277a = (AVChallenge) list.get(0);
        }
        if (this.f98745a.mIsFromDraft) {
            this.f98745a.mShootWay = "edit_draft";
        }
        this.f98749e.mo86782a(this.f98745a.isPrivate);
        if (C39618d.f101137A.mo74204a()) {
            this.f98754j.mo87867a(this.f98745a.isPrivate);
        }
        this.f98748d.mo89375a(this.f98745a.title);
        if (this.f98745a.structList != null) {
            this.f98748d.mo89379b(this.f98745a.structList);
        }
        this.f98748d.mo89376a(this.f98745a.challenges);
        if (bundle2 != null) {
            this.f98747c.f112277a = (AVChallenge) bundle2.getSerializable("challenge");
            this.f98749e.mo86786b(bundle2);
            this.f98756l = bundle2.getBoolean("contentModified");
        }
        for (C0794k kVar : this.f98758n) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) kVar.f2712b;
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.ad5);
            AVPublishContentType aVPublishContentType = AVPublishContentType.PhotoMovie;
            PublishOutput a = C38744b.m86100a(this.f98745a);
            ExtensionMisc extensionMisc = new ExtensionMisc(this.f98745a.poiData, null, this.f98745a.poiId, null, this, extensionDataRepo, new MobParam("video_post_page", this.f98745a.mShootWay, this.f98745a.creationId));
            iAVPublishExtension.onCreate(this, linearLayout2, bundle, aVPublishContentType, a, extensionMisc, new C38816r(this));
        }
        for (C0794k kVar2 : this.f98758n) {
            ((IAVPublishExtension) kVar2.f2712b).onCreateFinish();
        }
        C39595a b = C39618d.f101174o.mo74238b();
        if (this.f98745a.isPrivate == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        b.mo74246a(Boolean.valueOf(z2));
        C43839fl flVar = this.f98748d;
        C45207p pVar = new C45207p(this.f98750f);
        KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(flVar.f111008a);
        keyBoardMonitor.f120118a = flVar.f111009b.getRootView();
        keyBoardMonitor.f120119b = pVar;
        if (keyBoardMonitor.f120118a != null) {
            keyBoardMonitor.f120118a.getViewTreeObserver().addOnGlobalLayoutListener(keyBoardMonitor);
        }
        this.f98748d.mo89374a((C42480by) this);
        this.f98769y = (CheckBox) view2.findViewById(R.id.sz);
        this.f98770z = (FrameLayout) view2.findViewById(R.id.ahg);
        FrameLayout frameLayout = this.f98770z;
        CheckBox checkBox = this.f98769y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C22055c e = C39618d.f101183x.mo74285e();
        if (e != null && e.mo46160d()) {
            this.f98754j.f109303a.mo74261d().setVisibility(8);
        }
        if (C39618d.f101183x.mo74280a()) {
            this.f98760p.setVisibility(8);
            this.f98767w.setVisibility(8);
            this.f98766v.setVisibility(8);
            this.f98762r.setVisibility(8);
            C23729p.m58261a(false, this.f98761q);
            view2.findViewById(R.id.a8m).setVisibility(8);
            View findViewById = view2.findViewById(R.id.t2);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C38822x(this));
            if (!(this.f98754j == null || this.f98754j.f109303a == null)) {
                this.f98754j.f109303a.mo74261d().setVisibility(8);
            }
            this.f98768x.setHint(R.string.a2b);
            this.f98768x.setMentionTextColor(C0726c.m2098c(getContext(), R.color.a17));
        }
        C42464bj bjVar = this.f98751g;
        String str2 = C42464bj.f107379a;
        C44364a aVar2 = C44364a.f112276b;
        PhotoMovieContext photoMovieContext2 = this.f98745a;
        C52711k.m112240b(photoMovieContext2, "context");
        C39559e eVar = new C39559e();
        C42482c cVar = photoMovieContext2.mMusic;
        if (cVar != null) {
            str = cVar.getMusicId();
        }
        eVar.f101108a = str;
        eVar.f101110c = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mFrom", photoMovieContext2.mFrom);
        jSONObject.put("mShootWay", photoMovieContext2.mShootWay);
        jSONObject.put("mIsFromDraft", photoMovieContext2.mIsFromDraft);
        jSONObject.put("method", "getFromPhotoMovieContext");
        eVar.f101112e = jSONObject.toString();
        eVar.f101113f = C44364a.m97155a(photoMovieContext2.creationId, "");
        bjVar.mo86594a(this, true, str2, eVar);
        String a2 = C10193n.m20607a().mo18203a(VideoPublishHintDescriptionSettings.class, "video_description", C10181b.m20511a().mo18175c().getVideoDescription(), "");
        if (!TextUtils.isEmpty(a2)) {
            this.f98768x.setHint(a2);
        }
        if (C39618d.f101137A.mo74204a()) {
            view2.findViewById(R.id.cwj).setVisibility(8);
            view2.findViewById(R.id.en1).setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) this.f98770z.getLayoutParams();
            layoutParams.addRule(6, R.id.en1);
            layoutParams.addRule(8, R.id.en1);
            this.f98770z.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f98769y.getLayoutParams();
            layoutParams2.gravity = 16;
            this.f98769y.setLayoutParams(layoutParams2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.p4, viewGroup, false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (C0794k kVar : this.f98758n) {
            ((IAVPublishExtension) kVar.f2712b).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C0794k kVar : this.f98758n) {
            ((IAVPublishExtension) kVar.f2712b).onActivityResult(i, i2, intent);
        }
        this.f98754j.mo87868a(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                this.f98747c.f112277a = C39618d.f101163d.mo74184a(intent);
            } else {
                this.f98747c.f112277a = null;
            }
            this.f98756l = true;
        }
        if (i == 2 && i2 == -1 && intent != null) {
            intent.getIntExtra("extra.PERMISSION", 0);
            this.f98749e.mo86783a(intent);
            this.f98756l = true;
        }
        if (i == 3 && i2 == -1) {
            this.f98748d.mo89373a(intent);
            this.f98756l = true;
        }
        if (i == 4 && i2 == -1 && intent != null && intent.getParcelableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT") != null) {
            this.f98745a = (PhotoMovieContext) intent.getParcelableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
            m86218i();
        }
        if (this.f98755k != null) {
            this.f98755k.mo90239a(i, i2, intent);
        }
    }
}
