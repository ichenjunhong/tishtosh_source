package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.location.C36255b.C36256a;
import com.p683ss.android.ugc.aweme.p1382aq.C23222b;
import com.p683ss.android.ugc.aweme.poi.IPOIService;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38951b;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38952c;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39117aw;
import com.p683ss.android.ugc.aweme.poi.model.C39136t;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.C39396b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.C39397c.C39398a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.C39403d;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import com.p683ss.android.ugc.aweme.poi.services.POIService;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.LocationSettingItem.C44905a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa */
public final class C44940aa implements C39396b, C39398a, IAVPublishExtension<PoiPublishModel> {

    /* renamed from: l */
    public static final C44941a f113833l = new C44941a(null);

    /* renamed from: a */
    public ExtensionDataRepo f113834a;

    /* renamed from: b */
    public ExtensionMisc f113835b;

    /* renamed from: c */
    public LocationSettingItem f113836c;

    /* renamed from: d */
    public LinearLayout f113837d;

    /* renamed from: e */
    public String f113838e;

    /* renamed from: f */
    public String f113839f;

    /* renamed from: g */
    public PoiContext f113840g;

    /* renamed from: h */
    public String f113841h;

    /* renamed from: i */
    String f113842i;

    /* renamed from: j */
    Fragment f113843j;

    /* renamed from: k */
    List<C39117aw> f113844k;

    /* renamed from: m */
    private boolean f113845m;

    /* renamed from: n */
    private boolean f113846n;

    /* renamed from: o */
    private MentionEditText f113847o;

    /* renamed from: p */
    private C44942b f113848p;

    /* renamed from: q */
    private C39403d f113849q;

    /* renamed from: r */
    private C29067e f113850r;

    /* renamed from: s */
    private Context f113851s;

    /* renamed from: t */
    private String f113852t;

    /* renamed from: u */
    private AVPublishContentType f113853u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$a */
    public static final class C44941a {
        private C44941a() {
        }

        public /* synthetic */ C44941a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$b */
    public interface C44942b {
        /* renamed from: a */
        void mo91242a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$c */
    static final class C44943c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113854a;

        /* renamed from: b */
        final /* synthetic */ PoiStruct f113855b;

        C44943c(C44940aa aaVar, PoiStruct poiStruct) {
            this.f113854a = aaVar;
            this.f113855b = poiStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113854a.mo91233a((PoiStruct) null);
            PoiStruct poiStruct = this.f113855b;
            PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3IncludingPoiParams(poiStruct, "hide_poi", C23089d.m56640a().mo47829a("enter_from", "video_post_page").mo47829a("poi_id", poiStruct.poiId));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$d */
    static final class C44944d implements C38951b {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113856a;

        C44944d(C44940aa aaVar) {
            this.f113856a = aaVar;
        }

        /* renamed from: a */
        public final void mo79003a(C38952c cVar, PoiStruct poiStruct, String str) {
            String str2;
            String str3;
            String valueFromPoiStruct = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getValueFromPoiStruct(poiStruct, "keyword");
            if (valueFromPoiStruct == null) {
                valueFromPoiStruct = "";
            }
            String str4 = valueFromPoiStruct;
            if (TextUtils.isEmpty(str4)) {
                str2 = "default_search_poi";
            } else {
                str2 = "search_poi";
            }
            String str5 = str2;
            String str6 = "NULL";
            PoiStruct poiStruct2 = null;
            if (poiStruct != null) {
                str3 = poiStruct.getPoiId();
            } else {
                str3 = null;
            }
            if (!C52830p.m112406a(str6, str3, true)) {
                poiStruct2 = poiStruct;
            }
            this.f113856a.mo91233a(poiStruct2);
            if (poiStruct2 != null) {
                String valueFromPoiStruct2 = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getValueFromPoiStruct(poiStruct, "order");
                if (valueFromPoiStruct2 == null) {
                    valueFromPoiStruct2 = "";
                }
                C44940aa aaVar = this.f113856a;
                if (TextUtils.isEmpty(valueFromPoiStruct2)) {
                    valueFromPoiStruct2 = "-1";
                }
                String str7 = valueFromPoiStruct2;
                String valueFromPoiStruct3 = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getValueFromPoiStruct(poiStruct, "logpb");
                if (valueFromPoiStruct3 == null) {
                    valueFromPoiStruct3 = "";
                }
                String str8 = valueFromPoiStruct3;
                C52711k.m112236a((Object) str, "searchRegionType");
                if (poiStruct == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) poiStruct, "poiStruct!!");
                aaVar.mo91235a(str5, str4, str7, str8, str, poiStruct);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$e */
    public static final class C44945e implements C44942b {

        /* renamed from: a */
        final /* synthetic */ Callback f113857a;

        /* renamed from: a */
        public final void mo91242a() {
            this.f113857a.onContentModified();
        }

        C44945e(Callback callback) {
            this.f113857a = callback;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$f */
    static final class C44946f implements C44905a {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113858a;

        C44946f(C44940aa aaVar) {
            this.f113858a = aaVar;
        }

        /* renamed from: a */
        public final void mo91067a(boolean z) {
            C44940aa.m98280a(this.f113858a).getGoodsState().setValue(Boolean.valueOf(!z));
            C44940aa.m98280a(this.f113858a).getAnchorState().setValue(Boolean.valueOf(!z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$g */
    static final class C44947g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113859a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f113860b;

        /* renamed from: c */
        final /* synthetic */ Fragment f113861c;

        C44947g(C44940aa aaVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f113859a = aaVar;
            this.f113860b = extensionMisc;
            this.f113861c = fragment;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            if (!this.f113859a.mo91232a().f113683j) {
                String str3 = null;
                if (C52711k.m112239a((Object) (Boolean) this.f113860b.getExtensionDataRepo().isGoodsAdd().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context = this.f113861c.getContext();
                    Context context2 = this.f113861c.getContext();
                    if (context2 != null) {
                        str2 = context2.getString(R.string.aaq);
                    } else {
                        str2 = null;
                    }
                    C9432q.m18676a(context, str2);
                }
                if (C52711k.m112239a((Object) (Boolean) this.f113860b.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f113860b.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f113860b.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C52711k.m112239a((Object) (Boolean) this.f113860b.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context3 = this.f113861c.getContext();
                    Context context4 = this.f113861c.getContext();
                    if (context4 != null) {
                        str3 = context4.getString(R.string.dq_);
                    }
                    C10691a.m21545b(context3, str3).mo19066a();
                    return;
                }
                if (this.f113860b.getExtensionDataRepo().getUpdateAnchor().getValue() != null) {
                    C10691a.m21545b(this.f113859a.mo91232a().getContext(), this.f113859a.mo91232a().getContext().getString(R.string.aka, new Object[]{this.f113859a.mo91232a().getContext().getString(R.string.alv)})).mo19066a();
                }
                return;
            }
            if (!this.f113859a.mo91238e() && !this.f113859a.mo91239f()) {
                this.f113859a.mo91241h();
                if (C44940aa.m98283c()) {
                    str = "1";
                } else {
                    str = "0";
                }
                new C23222b().mo48062a("video_post_page").mo48063b(str).mo48064c(this.f113859a.f113841h).mo48076e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$h */
    static final class C44948h<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113862a;

        C44948h(C44940aa aaVar) {
            this.f113862a = aaVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C44940aa aaVar = this.f113862a;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    LocationSettingItem locationSettingItem = aaVar.f113836c;
                    if (locationSettingItem == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem.setAlpha(1.0f);
                    List<C39117aw> list = aaVar.f113844k;
                    if (list != null && (!list.isEmpty()) && aaVar.mo91236b()) {
                        LinearLayout linearLayout = aaVar.f113837d;
                        if (linearLayout == null) {
                            C52711k.m112237a("mPoiContainer");
                        }
                        linearLayout.setVisibility(0);
                    }
                    LocationSettingItem locationSettingItem2 = aaVar.f113836c;
                    if (locationSettingItem2 == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem2.setEnable(true);
                } else {
                    LocationSettingItem locationSettingItem3 = aaVar.f113836c;
                    if (locationSettingItem3 == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem3.setAlpha(0.5f);
                    LocationSettingItem locationSettingItem4 = aaVar.f113836c;
                    if (locationSettingItem4 == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem4.setDrawableRight((int) R.drawable.avm);
                    LocationSettingItem locationSettingItem5 = aaVar.f113836c;
                    if (locationSettingItem5 == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem5.mo91061b();
                    LinearLayout linearLayout2 = aaVar.f113837d;
                    if (linearLayout2 == null) {
                        C52711k.m112237a("mPoiContainer");
                    }
                    linearLayout2.setVisibility(8);
                    LocationSettingItem locationSettingItem6 = aaVar.f113836c;
                    if (locationSettingItem6 == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem6.setEnable(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$i */
    static final class C44949i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113863a;

        C44949i(C44940aa aaVar) {
            this.f113863a = aaVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44940aa aaVar = this.f113863a;
            ExtensionDataRepo extensionDataRepo = aaVar.f113834a;
            if (extensionDataRepo == null) {
                C52711k.m112237a("extensionDataRepo");
            }
            extensionDataRepo.getLocationActivityVisible().setValue(Boolean.valueOf(false));
            if (aaVar.mo91236b() && aaVar.mo91238e()) {
                LocationSettingItem locationSettingItem = aaVar.f113836c;
                if (locationSettingItem == null) {
                    C52711k.m112237a("locationSettingItem");
                }
                locationSettingItem.setVisibility(0);
            }
            LocationSettingItem locationSettingItem2 = aaVar.f113836c;
            if (locationSettingItem2 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            locationSettingItem2.setLocation(null);
            ExtensionDataRepo extensionDataRepo2 = aaVar.f113834a;
            if (extensionDataRepo2 == null) {
                C52711k.m112237a("extensionDataRepo");
            }
            C0198r isPoiAdd = extensionDataRepo2.isPoiAdd();
            LocationSettingItem locationSettingItem3 = aaVar.f113836c;
            if (locationSettingItem3 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            isPoiAdd.setValue(Boolean.valueOf(locationSettingItem3.mo91060a()));
            aaVar.mo91234a((PoiContext) null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$j */
    static final class C44950j extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113864a;

        C44950j(C44940aa aaVar) {
            this.f113864a = aaVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f113864a.mo91234a(PoiContext.unserializeFromJson((String) obj));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$k */
    public static final class C44951k implements PoiPublishModel {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113865a;

        public final String getLatitude() {
            return this.f113865a.f113838e;
        }

        public final String getLongitude() {
            return this.f113865a.f113839f;
        }

        public final String getPoiContext() {
            return this.f113865a.mo91240g();
        }

        public final Map<String, String> getMobParams() {
            C44940aa aaVar = this.f113865a;
            HashMap hashMap = new HashMap();
            LocationSettingItem locationSettingItem = aaVar.f113836c;
            if (locationSettingItem == null) {
                C52711k.m112237a("locationSettingItem");
            }
            PoiStruct poiStruct = locationSettingItem.getPoiStruct();
            if (poiStruct != null) {
                Map map = hashMap;
                map.put("poi_id", poiStruct.getPoiId());
                map.put("poi_backend_type", poiStruct.getBackendTypeCode());
                if (aaVar.mo91239f()) {
                    aaVar.f113842i = "poi_rate";
                }
                if (!TextUtils.isEmpty(aaVar.f113842i)) {
                    map.put("poi_enter_method", aaVar.f113842i);
                }
            }
            return hashMap;
        }

        public final HashMap<String, String> getServerMobParams() {
            C44940aa aaVar = this.f113865a;
            HashMap<String, String> hashMap = new HashMap<>();
            LocationSettingItem locationSettingItem = aaVar.f113836c;
            if (locationSettingItem == null) {
                C52711k.m112237a("locationSettingItem");
            }
            PoiStruct poiStruct = locationSettingItem.getPoiStruct();
            if (poiStruct != null) {
                if (poiStruct.getDistance() != null) {
                    String distance = poiStruct.getDistance();
                    C52711k.m112236a((Object) distance, "poiStruct.getDistance()");
                    hashMap.put("distance_info", distance);
                }
                Map map = hashMap;
                map.put("poi_label_type", String.valueOf(poiStruct.getPoiSubTitleType()));
                map.put("poi_type", String.valueOf(poiStruct.poiType));
            }
            return hashMap;
        }

        C44951k(C44940aa aaVar) {
            this.f113865a = aaVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$l */
    static final class C44952l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113866a;

        C44952l(C44940aa aaVar) {
            this.f113866a = aaVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C44940aa aaVar = this.f113866a;
            Fragment fragment = aaVar.f113843j;
            if (fragment != null) {
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    C36256a.m81865a(activity, new C44954n(aaVar));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$m */
    static final class C44953m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C44953m f113867a = new C44953m();

        C44953m() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aa$n */
    public static final class C44954n implements C47939a {

        /* renamed from: a */
        final /* synthetic */ C44940aa f113868a;

        /* renamed from: b */
        public final void mo60069b() {
        }

        /* renamed from: a */
        public final void mo60068a() {
            this.f113868a.mo91237d();
        }

        C44954n(C44940aa aaVar) {
            this.f113868a = aaVar;
        }
    }

    public final String getName() {
        return "PoiPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onDestroy() {
    }

    public final void onPublish(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    /* renamed from: c */
    public static boolean m98283c() {
        return C36256a.m81866a();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return new C44951k(this);
    }

    /* renamed from: j */
    private final void m98285j() {
        LocationSettingItem locationSettingItem = this.f113836c;
        if (locationSettingItem == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem.setVisibility(0);
    }

    /* renamed from: a */
    public final LocationSettingItem mo91232a() {
        LocationSettingItem locationSettingItem = this.f113836c;
        if (locationSettingItem == null) {
            C52711k.m112237a("locationSettingItem");
        }
        return locationSettingItem;
    }

    /* renamed from: e */
    public final boolean mo91238e() {
        C39136t tVar;
        if (this.f113840g != null) {
            PoiContext poiContext = this.f113840g;
            if (poiContext != null) {
                tVar = poiContext.mPoiActivity;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo91239f() {
        String str;
        if (this.f113840g != null) {
            PoiContext poiContext = this.f113840g;
            if (poiContext != null) {
                str = poiContext.mPoiRateId;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public final void onCreateFinish() {
        ExtensionMisc extensionMisc = this.f113835b;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        mo91234a(PoiContext.unserializeFromJson(extensionMisc.getPoiContext()));
    }

    public final void onEnterChildrenMode() {
        LocationSettingItem locationSettingItem = this.f113836c;
        if (locationSettingItem == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem.setVisibility(8);
        C39403d dVar = this.f113849q;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final void mo91241h() {
        IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
        if (createIPoiServicebyMonsterPlugin != null) {
            boolean hasShowPermissionTipDialog = createIPoiServicebyMonsterPlugin.getHasShowPermissionTipDialog();
            if (hasShowPermissionTipDialog) {
                mo91237d();
            } else {
                if (!hasShowPermissionTipDialog) {
                    createIPoiServicebyMonsterPlugin.setHasShowPermissionTipDialog(true);
                    createIPoiServicebyMonsterPlugin.showLocationPermissionTipDialog(this.f113851s, new C44952l(this), C44953m.f113867a);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m98284i() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f67772d
            java.util.List r0 = r0.mo52758b()
            r1 = 0
            if (r0 == 0) goto L_0x0045
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0044
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x001f
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0040
        L_0x001f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.commercialize.anchor.g r2 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r2
            int r2 = r2.f67830a
            com.ss.android.ugc.aweme.commercialize.anchor.a r4 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.POI
            int r4 = r4.getTYPE()
            if (r2 != r4) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            return r1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44940aa.m98284i():boolean");
    }

    /* renamed from: d */
    public final void mo91237d() {
        FragmentActivity fragmentActivity;
        IPOIService createIPOIServicebyMonsterPlugin = POIService.createIPOIServicebyMonsterPlugin();
        if (createIPOIServicebyMonsterPlugin != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.f113852t)) {
                bundle.putString("candidateloc", this.f113852t);
            }
            bundle.putBoolean("enable_global_search", this.f113845m);
            bundle.putBoolean("is_over_sea", this.f113846n);
            Fragment fragment = this.f113843j;
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            createIPOIServicebyMonsterPlugin.getPOISearchDialog(fragmentActivity, bundle, new C44944d(this)).show();
            C26890h.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }

    /* renamed from: g */
    public final String mo91240g() {
        if (mo91238e()) {
            return PoiContext.serializeToStr(this.f113840g);
        }
        LocationSettingItem locationSettingItem = this.f113836c;
        if (locationSettingItem == null) {
            C52711k.m112237a("locationSettingItem");
        }
        if (!TextUtils.isEmpty(locationSettingItem.getPoiId())) {
            if (this.f113840g == null) {
                this.f113840g = new PoiContext();
            }
            PoiContext poiContext = this.f113840g;
            if (poiContext == null) {
                C52711k.m112234a();
            }
            LocationSettingItem locationSettingItem2 = this.f113836c;
            if (locationSettingItem2 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            poiContext.mSelectPoiId = locationSettingItem2.getPoiId();
            PoiContext poiContext2 = this.f113840g;
            if (poiContext2 == null) {
                C52711k.m112234a();
            }
            LocationSettingItem locationSettingItem3 = this.f113836c;
            if (locationSettingItem3 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            poiContext2.mSelectPoiName = locationSettingItem3.getPoiName();
        } else if (this.f113840g != null) {
            PoiContext poiContext3 = this.f113840g;
            if (poiContext3 == null) {
                C52711k.m112234a();
            }
            poiContext3.mSelectPoiId = "";
            PoiContext poiContext4 = this.f113840g;
            if (poiContext4 == null) {
                C52711k.m112234a();
            }
            poiContext4.mSelectPoiName = "";
        }
        return PoiContext.serializeToStr(this.f113840g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo91236b() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        ExtensionMisc extensionMisc = this.f113835b;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        C52711k.m112236a((Object) a, "PublishExtensionModel\n  …                        )");
        if (a.f68924f != null) {
            return false;
        }
        AVPublishContentType aVPublishContentType = this.f113853u;
        if (aVPublishContentType == null) {
            C52711k.m112237a("contentType");
        }
        if (C52711k.m112239a((Object) aVPublishContentType.getContentType(), (Object) AVPublishContentType.Photo.getContentType())) {
            List b = AnchorListManager.f67772d.mo52758b();
            if (b == null) {
                return false;
            }
            Iterable<C25626g> iterable = b;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (C25626g gVar : iterable) {
                if (gVar.f67830a == C25600a.POI.getTYPE()) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    return true;
                }
            }
            return false;
        }
        List b2 = AnchorListManager.f67772d.mo52758b();
        if (b2 != null && b2.size() == 1) {
            Iterable iterable2 = b2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C25626g) it.next()).f67830a == C25600a.POI.getTYPE()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ ExtensionDataRepo m98280a(C44940aa aaVar) {
        ExtensionDataRepo extensionDataRepo = aaVar.f113834a;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* renamed from: b */
    private static String m98281b(PoiContext poiContext) {
        if (!TextUtils.isEmpty(poiContext.mSelectPoiId)) {
            String str = poiContext.mSelectPoiId;
            C52711k.m112236a((Object) str, "poiContext.mSelectPoiId");
            return str;
        }
        String str2 = poiContext.mShootPoiId;
        C52711k.m112236a((Object) str2, "poiContext.mShootPoiId");
        return str2;
    }

    /* renamed from: c */
    private static String m98282c(PoiContext poiContext) {
        if (!TextUtils.isEmpty(poiContext.mSelectPoiName)) {
            String str = poiContext.mSelectPoiName;
            C52711k.m112236a((Object) str, "poiContext.mSelectPoiName");
            return str;
        }
        String str2 = poiContext.mShootPoiName;
        C52711k.m112236a((Object) str2, "poiContext.mShootPoiName");
        return str2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
        String str = "poiStruct";
        LocationSettingItem locationSettingItem = this.f113836c;
        if (locationSettingItem == null) {
            C52711k.m112237a("locationSettingItem");
        }
        bundle.putSerializable(str, locationSettingItem.getPoiStruct());
    }

    /* renamed from: a */
    public final void mo91233a(PoiStruct poiStruct) {
        LocationSettingItem locationSettingItem = this.f113836c;
        if (locationSettingItem == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem.setLocation(poiStruct);
        ExtensionDataRepo extensionDataRepo = this.f113834a;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        C0198r isPoiAdd = extensionDataRepo.isPoiAdd();
        LocationSettingItem locationSettingItem2 = this.f113836c;
        if (locationSettingItem2 == null) {
            C52711k.m112237a("locationSettingItem");
        }
        isPoiAdd.setValue(Boolean.valueOf(locationSettingItem2.mo91060a()));
        C44942b bVar = this.f113848p;
        if (bVar != null) {
            bVar.mo91242a();
        }
        LinearLayout linearLayout = this.f113837d;
        if (linearLayout == null) {
            C52711k.m112237a("mPoiContainer");
        }
        if (linearLayout.getVisibility() == 0 && this.f113849q != null) {
            C39403d dVar = this.f113849q;
            if (dVar != null) {
                dVar.mo80375a(poiStruct, this.f113844k);
            }
        }
        if (poiStruct == null) {
            LocationSettingItem locationSettingItem3 = this.f113836c;
            if (locationSettingItem3 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            locationSettingItem3.setDrawableRight((int) R.drawable.avm);
            LocationSettingItem locationSettingItem4 = this.f113836c;
            if (locationSettingItem4 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            locationSettingItem4.mo91061b();
            return;
        }
        LocationSettingItem locationSettingItem5 = this.f113836c;
        if (locationSettingItem5 == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem5.setDrawableRight((int) R.drawable.aiy);
        LocationSettingItem locationSettingItem6 = this.f113836c;
        if (locationSettingItem6 == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem6.setRightIconListener(new C44943c(this, poiStruct));
    }

    /* renamed from: a */
    public final void mo91234a(PoiContext poiContext) {
        String str;
        String str2;
        if (mo91236b()) {
            this.f113840g = poiContext;
            if (poiContext != null && !TextUtils.isEmpty(poiContext.mShootPoiId)) {
                if (!TextUtils.isEmpty(poiContext.mPoiRatePrompt)) {
                    MentionEditText mentionEditText = this.f113847o;
                    if (mentionEditText == null) {
                        C52711k.m112237a("mMentionEditText");
                    }
                    mentionEditText.setHint(poiContext.mPoiRatePrompt);
                } else {
                    MentionEditText mentionEditText2 = this.f113847o;
                    if (mentionEditText2 == null) {
                        C52711k.m112237a("mMentionEditText");
                    }
                    mentionEditText2.setHint(R.string.cpz);
                }
            }
            if (mo91238e()) {
                ExtensionDataRepo extensionDataRepo = this.f113834a;
                if (extensionDataRepo == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo.getLocationActivityVisible().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo2 = this.f113834a;
                if (extensionDataRepo2 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo2.getSetPoiActivity().invoke(mo91240g());
                ExtensionDataRepo extensionDataRepo3 = this.f113834a;
                if (extensionDataRepo3 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo3.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo4 = this.f113834a;
                if (extensionDataRepo4 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo4.getStarAtlasState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo5 = this.f113834a;
                if (extensionDataRepo5 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo5.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo6 = this.f113834a;
                if (extensionDataRepo6 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo6.getAnchorState().setValue(Boolean.valueOf(false));
            } else if (mo91239f()) {
                LocationSettingItem locationSettingItem = this.f113836c;
                if (locationSettingItem == null) {
                    C52711k.m112237a("locationSettingItem");
                }
                locationSettingItem.setVisibility(0);
                PoiStruct poiStruct = new PoiStruct();
                if (poiContext != null) {
                    str = poiContext.mShootPoiId;
                } else {
                    str = null;
                }
                poiStruct.poiId = str;
                if (poiContext != null) {
                    str2 = poiContext.mShootPoiName;
                } else {
                    str2 = null;
                }
                poiStruct.poiName = str2;
                mo91233a(poiStruct);
                ExtensionDataRepo extensionDataRepo7 = this.f113834a;
                if (extensionDataRepo7 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo7.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo8 = this.f113834a;
                if (extensionDataRepo8 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo8.getStarAtlasState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo9 = this.f113834a;
                if (extensionDataRepo9 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo9.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo10 = this.f113834a;
                if (extensionDataRepo10 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo10.getAnchorState().setValue(Boolean.valueOf(false));
                LocationSettingItem locationSettingItem2 = this.f113836c;
                if (locationSettingItem2 == null) {
                    C52711k.m112237a("locationSettingItem");
                }
                locationSettingItem2.setDrawableRight((Drawable) null);
                LocationSettingItem locationSettingItem3 = this.f113836c;
                if (locationSettingItem3 == null) {
                    C52711k.m112237a("locationSettingItem");
                }
                locationSettingItem3.mo91061b();
            } else {
                if (poiContext != null && (!TextUtils.isEmpty(poiContext.mSelectPoiId) || !TextUtils.isEmpty(poiContext.mShootPoiId))) {
                    LocationSettingItem locationSettingItem4 = this.f113836c;
                    if (locationSettingItem4 == null) {
                        C52711k.m112237a("locationSettingItem");
                    }
                    locationSettingItem4.setVisibility(0);
                    PoiStruct poiStruct2 = new PoiStruct();
                    if (!TextUtils.isEmpty(poiContext.mSelectPoiId)) {
                        poiStruct2.poiId = poiContext.mSelectPoiId;
                        poiStruct2.poiName = poiContext.mSelectPoiName;
                    } else if (!TextUtils.isEmpty(poiContext.mShootPoiId)) {
                        poiStruct2.poiId = poiContext.mShootPoiId;
                        poiStruct2.poiName = poiContext.mShootPoiName;
                    }
                    mo91233a(poiStruct2);
                    ExtensionDataRepo extensionDataRepo11 = this.f113834a;
                    if (extensionDataRepo11 == null) {
                        C52711k.m112237a("extensionDataRepo");
                    }
                    extensionDataRepo11.getResetGoodsAction().invoke();
                    ExtensionDataRepo extensionDataRepo12 = this.f113834a;
                    if (extensionDataRepo12 == null) {
                        C52711k.m112237a("extensionDataRepo");
                    }
                    extensionDataRepo12.getGoodsState().setValue(Boolean.valueOf(false));
                }
                ExtensionDataRepo extensionDataRepo13 = this.f113834a;
                if (extensionDataRepo13 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo13.getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                    ExtensionDataRepo extensionDataRepo14 = this.f113834a;
                    if (extensionDataRepo14 == null) {
                        C52711k.m112237a("extensionDataRepo");
                    }
                    if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo14.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true))) {
                        ExtensionDataRepo extensionDataRepo15 = this.f113834a;
                        if (extensionDataRepo15 == null) {
                            C52711k.m112237a("extensionDataRepo");
                        }
                        if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo15.getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                            LinearLayout linearLayout = this.f113837d;
                            if (linearLayout == null) {
                                C52711k.m112237a("mPoiContainer");
                            }
                            linearLayout.removeAllViews();
                            m98285j();
                        }
                    }
                }
            }
        } else if (m98284i() && poiContext != null) {
            ExtensionDataRepo extensionDataRepo16 = this.f113834a;
            if (extensionDataRepo16 == null) {
                C52711k.m112237a("extensionDataRepo");
            }
            C0198r updateAnchor = extensionDataRepo16.getUpdateAnchor();
            int type = C25600a.POI.getTYPE();
            String b = new C17971f().mo34889b(C52550ab.m112050a(C52856t.m112465a("poi_id", m98281b(poiContext)), C52856t.m112465a("poi_name", m98282c(poiContext))));
            C52711k.m112236a((Object) b, "Gson().toJson(mapOf(\n   …                       ))");
            AnchorTransData anchorTransData = new AnchorTransData(type, b, m98282c(poiContext), "", null, null, null, 112, null);
            updateAnchor.setValue(anchorTransData);
        }
    }

    /* renamed from: a */
    public final void mo80372a(C39117aw awVar, boolean z) {
        String str;
        String str2;
        ExtensionDataRepo extensionDataRepo = this.f113834a;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        String str3 = null;
        if (C52711k.m112239a((Object) (Boolean) extensionDataRepo.isGoodsAdd().getValue(), (Object) Boolean.valueOf(true))) {
            Context context = this.f113851s;
            Context context2 = this.f113851s;
            if (context2 != null) {
                str3 = context2.getString(R.string.aaq);
            }
            C9432q.m18676a(context, str3);
        } else if (z) {
            mo91241h();
            if (m98283c()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            new C23222b().mo48062a("video_post_page").mo48063b(str2).mo48064c(this.f113841h).mo48076e();
        } else if (awVar == null) {
            mo91233a((PoiStruct) null);
        } else {
            mo91233a(awVar.f99792a);
            if (awVar.f99796e) {
                str = "poi_shoot";
            } else {
                str = "recommend_poi";
            }
            String str4 = str;
            String valueOf = String.valueOf(awVar.f99795d);
            String a = C29981aa.m70153a().mo60160a(awVar.f99794c);
            C52711k.m112236a((Object) a, "LogPbManager.getInstance…ormatLogPb(poiItem.logPb)");
            PoiStruct poiStruct = awVar.f99792a;
            C52711k.m112236a((Object) poiStruct, "poiItem.poiStruct");
            mo91235a(str4, "", valueOf, a, "", poiStruct);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* renamed from: a */
    public final void mo91235a(String str, String str2, String str3, String str4, String str5, PoiStruct poiStruct) {
        this.f113842i = str;
        C23089d a = C23089d.m56640a();
        a.mo47829a("enter_from", "edit_page").mo47829a("poi_type", String.valueOf(poiStruct.iconType)).mo47829a("poi_id", poiStruct.poiId).mo47829a("enter_method", str).mo47829a("content_type", this.f113841h).mo47829a("log_pb", str4).mo47829a("order", str3).mo47829a("key_word", str2).mo47829a("is_media_location", poiStruct.isCandidate()).mo47829a("distance_info", poiStruct.getDistance()).mo47829a("search_region_type", str5);
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3IncludingPoiParams(poiStruct, "choose_poi", a);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(linearLayout, "extensionWidgetContainer");
        C52711k.m112240b(aVPublishContentType, "contentType");
        C52711k.m112240b(publishOutput, "publishOutput");
        C52711k.m112240b(extensionMisc, "extensionMisc");
        C52711k.m112240b(callback, "callback");
        this.f113853u = aVPublishContentType;
        this.f113834a = extensionMisc.getExtensionDataRepo();
        this.f113852t = extensionMisc.getCandidateLog();
        this.f113843j = fragment;
        this.f113851s = fragment.getContext();
        View view = fragment.getView();
        if (view == null) {
            C52711k.m112234a();
        }
        View findViewById = view.findViewById(R.id.a9y);
        C52711k.m112236a((Object) findViewById, "fragment.view!!.findViewById(R.id.editor_text)");
        this.f113847o = (MentionEditText) findViewById;
        this.f113841h = aVPublishContentType.getContentType();
        this.f113835b = extensionMisc;
        this.f113840g = PoiContext.unserializeFromJson(extensionMisc.getPoiContext());
        this.f113848p = new C44945e(callback);
        this.f113850r = extensionMisc.getDefaultSelectStickerPoi();
        LocationSettingItem locationSettingItem = new LocationSettingItem(linearLayout.getContext(), null);
        linearLayout.addView(locationSettingItem, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        locationSettingItem.setGravity(16);
        int i = 0;
        locationSettingItem.setOrientation(0);
        locationSettingItem.setVisibility(8);
        this.f113836c = locationSettingItem;
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        int b = (int) C9432q.m18687b(linearLayout.getContext(), 10.0f);
        linearLayout.addView(linearLayout2, new LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, 0, 0, b);
        linearLayout2.setVisibility(8);
        this.f113837d = linearLayout2;
        if (bundle != null) {
            if (bundle.getSerializable("poiStruct") != null) {
                LocationSettingItem locationSettingItem2 = this.f113836c;
                if (locationSettingItem2 == null) {
                    C52711k.m112237a("locationSettingItem");
                }
                Serializable serializable = bundle.getSerializable("poiStruct");
                if (serializable != null) {
                    locationSettingItem2.setLocation((PoiStruct) serializable);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiStruct");
                }
            }
            ExtensionDataRepo extensionDataRepo = this.f113834a;
            if (extensionDataRepo == null) {
                C52711k.m112237a("extensionDataRepo");
            }
            C0198r isPoiAdd = extensionDataRepo.isPoiAdd();
            LocationSettingItem locationSettingItem3 = this.f113836c;
            if (locationSettingItem3 == null) {
                C52711k.m112237a("locationSettingItem");
            }
            isPoiAdd.setValue(Boolean.valueOf(locationSettingItem3.mo91060a()));
        }
        LocationSettingItem locationSettingItem4 = this.f113836c;
        if (locationSettingItem4 == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem4.setStateChangeCB(new C44946f(this));
        LocationSettingItem locationSettingItem5 = this.f113836c;
        if (locationSettingItem5 == null) {
            C52711k.m112237a("locationSettingItem");
        }
        locationSettingItem5.setOnClickListener(new C44947g(this, extensionMisc, fragment));
        extensionMisc.getExtensionDataRepo().getLocationState().observe(fragment, new C44948h(this));
        ExtensionDataRepo extensionDataRepo2 = this.f113834a;
        if (extensionDataRepo2 == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        extensionDataRepo2.setResetPoiAction(new C44949i(this));
        ExtensionDataRepo extensionDataRepo3 = this.f113834a;
        if (extensionDataRepo3 == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        extensionDataRepo3.setUpdatePoiContext(new C44950j(this));
        LocationSettingItem locationSettingItem6 = this.f113836c;
        if (locationSettingItem6 == null) {
            C52711k.m112237a("locationSettingItem");
        }
        if (!mo91236b() || mo91238e()) {
            i = 8;
        }
        locationSettingItem6.setVisibility(i);
    }
}
