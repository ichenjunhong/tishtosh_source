package com.p683ss.android.ugc.aweme.photo.publish;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p2615tt.appbrandimpl.C51928d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.photo.C38682k;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac.C39542a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39559e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.MobParam;
import com.p683ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42464bj;
import com.p683ss.android.ugc.aweme.shortvideo.C43217dk;
import com.p683ss.android.ugc.aweme.shortvideo.C43839fl;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.PublishPermissionActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43452bf;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44364a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44365b;
import com.p683ss.android.ugc.aweme.shortvideo.util.VideoPublishHintDescriptionSettings;
import com.p683ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47761ce;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.video.hashtag.C48024a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishFragment */
public class PhotoPublishFragment extends Fragment implements C39592a {

    /* renamed from: a */
    C44365b f98425a = new C44365b();

    /* renamed from: b */
    C43839fl f98426b;

    /* renamed from: c */
    PhotoContext f98427c;

    /* renamed from: d */
    public boolean f98428d;

    /* renamed from: e */
    OnTouchListener f98429e = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C43452bf.m95244a(PhotoPublishFragment.this.getActivity());
            return false;
        }
    };

    /* renamed from: f */
    private C42464bj f98430f;

    /* renamed from: g */
    private C43217dk f98431g;

    /* renamed from: h */
    private List<C0794k<Class<?>, IAVPublishExtension<?>>> f98432h = C39618d.f101179t.mo74306a(AVPublishContentType.Photo);
    @BindView(2131493581)
    LinearLayout mLayoutSettingContainer;
    @BindView(2131493774)
    PermissionSettingItem mPermissionSettingItem;
    @BindView(2131493397)
    ImageView mPhotoThumbView;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: d */
    public final String mo78635d() {
        return this.f98426b.mo89380c();
    }

    /* renamed from: c */
    public final String mo78634c() {
        if (this.f98427c == null) {
            return null;
        }
        return this.f98427c.commerceData;
    }

    /* renamed from: e */
    public final boolean mo78636e() {
        if (this.f98427c == null || this.f98427c.microAppModel == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo78637f() {
        if (this.f98427c != null) {
            this.f98427c.microAppModel = null;
        }
    }

    public void onDestroyView() {
        m86049a(getView(), null);
        super.onDestroyView();
        this.f98431g.mo87870c();
        for (C0794k kVar : this.f98432h) {
            ((IAVPublishExtension) kVar.f2712b).onDestroy();
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        for (C0794k kVar : this.f98432h) {
            ((IAVPublishExtension) kVar.f2712b).onResume();
        }
    }

    /* renamed from: b */
    public final PhotoContext mo78633b() {
        this.f98426b.mo89377b();
        this.f98427c.mText = this.f98426b.mo89380c();
        if (this.f98426b.mo89381d() != null) {
            this.f98427c.mExtras = this.f98426b.mo89381d();
        }
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f98432h, PoiPublishModel.class);
        this.f98427c.mIsPrivate = this.mPermissionSettingItem.getPermission();
        if (poiPublishModel != null) {
            this.f98427c.mPoiId = poiPublishModel.getPoiContext();
        }
        for (C0794k kVar : this.f98432h) {
            ((IAVPublishExtension) kVar.f2712b).onBackPressed(C38682k.m86038a(this.f98427c));
        }
        return this.f98427c;
    }

    /* renamed from: a */
    public final void mo78631a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!C39618d.f101183x.mo74282b()) {
            C39618d.f101183x.mo74277a((Fragment) this, "photo_post_page", "click_post", (Bundle) null, (C39528a) null);
            return;
        }
        C47858ep.m103516b();
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f98432h, PoiPublishModel.class);
        SeedPublishModel seedPublishModel = (SeedPublishModel) AVPublishExtensionUtils.findModel(this.f98432h, SeedPublishModel.class);
        C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98427c.creationId).mo47829a("shoot_way", this.f98427c.mShootWay).mo47829a("filter_list", this.f98427c.mFilterName).mo47826a("filter_id_list", this.f98427c.mFilterId).mo47829a("prop_selected_from", this.f98427c.mPropSource).mo47829a("content_type", "photo");
        String str7 = "content_source";
        if (this.f98427c.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        C23089d a2 = a.mo47829a(str7, str).mo47829a("mix_type", C45624b.m99356a(0, 1)).mo47826a("is_multi_content", 0).mo47829a("enter_from", "video_post_page").mo47826a("location_gps_cnt", this.f98427c.getCoordinateCount());
        String str8 = "seed_id";
        if (seedPublishModel != null) {
            str2 = seedPublishModel.getSeedId();
        } else {
            str2 = "0";
        }
        C23089d a3 = a2.mo47829a(str8, str2).mo47826a("is_multi_content", 0);
        String str9 = "seed_name";
        if (seedPublishModel != null) {
            str3 = seedPublishModel.getSeedName();
        } else {
            str3 = "";
        }
        C23089d a4 = a3.mo47829a(str9, str3);
        String str10 = "refer_seed_id";
        if (seedPublishModel != null) {
            str4 = seedPublishModel.getReferSeedId();
        } else {
            str4 = "";
        }
        C23089d a5 = a4.mo47829a(str10, str4);
        String str11 = "refer_seed_name";
        if (seedPublishModel != null) {
            str5 = seedPublishModel.getReferSeedName();
        } else {
            str5 = "";
        }
        C23089d a6 = a5.mo47829a(str11, str5);
        String str12 = "data_type";
        if (seedPublishModel != null) {
            str6 = seedPublishModel.getDataType();
        } else {
            str6 = "";
        }
        a6.mo47829a(str12, str6);
        Map<String, String> map = a2.f61491a;
        if (poiPublishModel != null) {
            map.putAll(poiPublishModel.getMobParams());
            this.f98427c.poiServerMobParam = poiPublishModel.getServerMobParams();
        }
        C26890h.m65011a("publish", map);
        C26890h.m65011a("performance_publish", new C23089d().mo47829a("creation_id", this.f98427c.creationId).mo47829a("content_type", "photo").mo47826a("retry_publish", 0).mo47826a("video_type", 5).mo47826a("video_upload_type", 0).f61491a);
        this.f98426b.mo89378b("publish");
        this.f98427c.updatePhotoPath();
        if (getActivity() != null) {
            getActivity().finish();
            this.f98426b.mo89377b();
            this.f98427c.mText = this.f98426b.mo89380c();
            if (this.f98426b.mo89381d() != null) {
                this.f98427c.mExtras = this.f98426b.mo89381d();
            }
            PoiPublishModel poiPublishModel2 = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f98432h, PoiPublishModel.class);
            this.f98427c.mIsPrivate = this.mPermissionSettingItem.getPermission();
            if (poiPublishModel2 != null) {
                this.f98427c.mPoiId = poiPublishModel2.getPoiContext();
                this.f98427c.mLatitude = poiPublishModel2.getLatitude();
                this.f98427c.mLongitude = poiPublishModel2.getLongitude();
            }
            this.f98427c.mSyncPlatforms = this.f98431g.mo87866a();
            GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f98432h, GoodsPublishModel.class);
            if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
                this.f98427c.shopDraftId = goodsPublishModel.getGoodsDraftId();
            }
            C46806g.m101653a(C44309n.m97060b(this.f98427c), C44309n.m97055a(this.f98427c), C46804e.PUBLISH, C46804e.SEND_REQUEST);
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_photo_publish_args", this.f98427c);
            bundle.putString("shoot_way", this.f98427c.mShootWay);
            bundle.putInt("video_type", 5);
            bundle.putBoolean("enter_record_from_other_platform", this.f98427c.mFromOtherPlatform);
            C23763a.m58315a().mo49225a(getActivity(), bundle);
            for (C0794k kVar : this.f98432h) {
                ((IAVPublishExtension) kVar.f2712b).onPublish(C38682k.m86038a(this.f98427c));
            }
        }
    }

    /* renamed from: a */
    public final void mo78632a(String str) {
        if (this.f98427c != null) {
            this.f98427c.commerceData = str;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (C0794k kVar : this.f98432h) {
            ((IAVPublishExtension) kVar.f2712b).onSaveInstanceState(bundle);
        }
        bundle.putInt("permission", this.mPermissionSettingItem.getPermission());
        bundle.putSerializable("challenge", this.f98425a.f112277a);
        bundle.putBoolean("contentModified", this.f98428d);
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493774, 2131492930, 2131493811, 2131493397})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bx9) {
            PublishPermissionActivity.m93012a(this, 5, this.mPermissionSettingItem.getPermission(), R.string.b3o, R.string.b3n, 2);
            return;
        }
        if (id == R.id.ar6) {
            FragmentActivity activity = getActivity();
            PhotoContext photoContext = this.f98427c;
            ImageView imageView = this.mPhotoThumbView;
            Intent intent = new Intent();
            intent.setClass(activity, PhotoPreviewActivity.class);
            intent.putExtra("photo_model", photoContext);
            C1056u.m3036a((View) imageView, "photo_preview_transition");
            activity.startActivity(intent, C0643c.m1725a((Activity) activity, (View) imageView, "photo_preview_transition").mo2171a());
        }
    }

    /* renamed from: a */
    private void m86049a(View view, OnTouchListener onTouchListener) {
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(onTouchListener);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    m86049a(viewGroup.getChildAt(i), onTouchListener);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        List<AVTextExtraStruct> list;
        View view2 = view;
        Bundle bundle2 = bundle;
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        m86049a(view2, this.f98429e);
        view2.findViewById(R.id.c6u).setOnClickListener(new C47687av(1000) {
            /* renamed from: a */
            public final void mo59929a(View view) {
                if (C39618d.f101183x.mo74286f()) {
                    C10691a.m21548c(PhotoPublishFragment.this.getContext(), (int) R.string.dw2).mo19066a();
                } else if (PhotoPublishFragment.this.mPermissionSettingItem.getPermission() == 1) {
                    PhotoPublishFragment.this.mo78631a();
                } else {
                    C39618d.f101162c.mo74145a(PhotoPublishFragment.this.getContext(), (C39542a) new C39542a() {
                        /* renamed from: a */
                        public final void mo78639a(boolean z) {
                            if (z) {
                                PhotoPublishFragment.this.mPermissionSettingItem.setPermission(1);
                                PhotoPublishFragment.this.f98428d = true;
                            }
                            PhotoPublishFragment.this.mo78631a();
                        }
                    });
                }
            }
        });
        if (C39618d.f101137A.mo74204a()) {
            view2.findViewById(R.id.cwj).setVisibility(8);
            view2.findViewById(R.id.en1).setVisibility(0);
        }
        this.f98427c = (PhotoContext) getArguments().getSerializable("photo_model");
        C43839fl flVar = new C43839fl(this, (HashTagMentionEditText) view2.findViewById(R.id.a9y), view2.findViewById(R.id.gf), view2.findViewById(R.id.ge), 0, 1);
        this.f98426b = flVar;
        this.f98430f = C42464bj.m93292a(this.f98427c.creationId, this.f98426b, view2);
        this.f98431g = C43217dk.m94834a((Fragment) this, view2, 2);
        this.f98426b.mo89371a();
        this.f98426b.mo89375a(this.f98427c.mText);
        C43839fl flVar2 = this.f98426b;
        if (this.f98427c.mExtras == null) {
            list = null;
        } else {
            list = this.f98427c.mExtras;
        }
        flVar2.mo89379b(list);
        this.f98426b.mo89376a(this.f98427c.challenges);
        if (this.f98427c.microAppModel != null) {
            C43839fl flVar3 = this.f98426b;
            C43758o oVar = this.f98427c.microAppModel;
            flVar3.f111009b.f121324l.clear();
            if (oVar != null && !TextUtils.isEmpty(oVar.getExtra())) {
                C51928d dVar = (C51928d) C39618d.f101161b.mo34884a(oVar.getExtra(), C51928d.class);
                if (dVar != null && !C9376b.m18558a((Collection<T>) dVar.f129606a)) {
                    for (String str : dVar.f129606a) {
                        Set set = flVar3.f111009b.f121324l;
                        StringBuilder sb = new StringBuilder("#");
                        sb.append(str);
                        set.add(sb.toString());
                        C48024a b = C47761ce.m103389b(flVar3.f111009b.getText().toString(), str);
                        if (b.f120701b <= 150) {
                            flVar3.f111009b.getText().insert(b.f120700a, b.f120702c);
                        }
                        flVar3.f111009b.mo91794a(true);
                    }
                }
            }
        }
        this.mPermissionSettingItem.setPermission(this.f98427c.mIsPrivate);
        if (C39618d.f101137A.mo74204a()) {
            this.f98431g.mo87867a(this.f98427c.mIsPrivate);
        }
        C43217dk dkVar = this.f98431g;
        C52711k.m112240b(getString(R.string.d12), "string");
        if (bundle2 != null) {
            this.f98425a.f112277a = (AVChallenge) bundle2.getSerializable("challenge");
            this.mPermissionSettingItem.setPermission(bundle2.getInt("permission"));
            if (C39618d.f101137A.mo74204a()) {
                this.f98431g.mo87867a(bundle2.getInt("permission"));
            }
            this.f98428d = bundle2.getBoolean("contentModified");
        }
        C13771c.m27875c().mo26186a(this.f98427c.getTmpPhotoUri(C39618d.f101160a));
        this.mPhotoThumbView.setImageURI(this.f98427c.getTmpPhotoUri(C39618d.f101160a));
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) C0214z.m438a((Fragment) this).mo359a(ExtensionDataRepo.class);
        for (C0794k kVar : this.f98432h) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) kVar.f2712b;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.ad5);
            AVPublishContentType aVPublishContentType = AVPublishContentType.Photo;
            PublishOutput a = C38682k.m86038a(this.f98427c);
            ExtensionMisc extensionMisc = new ExtensionMisc(this.f98427c.poiData, this.f98427c.defaultSelectStickerPoi, this.f98427c.mPoiId, this.f98427c.microAppModel, this, extensionDataRepo, new MobParam("photo_post_page", this.f98427c.mShootWay, this.f98427c.creationId));
            iAVPublishExtension.onCreate(this, linearLayout, bundle, aVPublishContentType, a, extensionMisc, new C38703b(this));
        }
        for (C0794k kVar2 : this.f98432h) {
            ((IAVPublishExtension) kVar2.f2712b).onCreateFinish();
        }
        C42464bj bjVar = this.f98430f;
        String str2 = C42464bj.f107380b;
        C44364a aVar = C44364a.f112276b;
        PhotoContext photoContext = this.f98427c;
        C52711k.m112240b(photoContext, "context");
        C39559e eVar = new C39559e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(photoContext.mStickers);
        eVar.f101109b = sb2.toString();
        eVar.f101110c = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", photoContext.mShootWay);
        jSONObject.put("method", "getFromPhotoContext");
        eVar.f101112e = jSONObject.toString();
        eVar.f101113f = C44364a.m97155a(photoContext.creationId, "");
        bjVar.mo86594a(this, true, str2, eVar);
        String a2 = C10193n.m20607a().mo18203a(VideoPublishHintDescriptionSettings.class, "video_description", C10181b.m20511a().mo18175c().getVideoDescription(), "");
        if (!TextUtils.isEmpty(a2)) {
            ((HashTagMentionEditText) view2.findViewById(R.id.a9y)).setHint(a2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.p5, viewGroup, false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (C0794k kVar : this.f98432h) {
            ((IAVPublishExtension) kVar.f2712b).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C0794k kVar : this.f98432h) {
            ((IAVPublishExtension) kVar.f2712b).onActivityResult(i, i2, intent);
        }
        this.f98431g.mo87868a(i, i2, intent);
        this.f98425a.f112277a = C39618d.f101163d.mo74183a(i, i2, intent, 1);
        if (i == 1) {
            this.f98428d = true;
        }
        if (i == 2 && i2 == -1 && intent != null) {
            this.mPermissionSettingItem.setPermission(intent.getIntExtra("extra.PERMISSION", 0));
            this.f98428d = true;
        }
        if (i == 3 && i2 == -1) {
            this.f98426b.mo89373a(intent);
            this.f98428d = true;
        }
    }
}
