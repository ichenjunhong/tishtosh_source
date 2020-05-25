package com.p683ss.android.ugc.aweme.commercialize.star;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10699e.C10700a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.commercialize.model.C26120e;
import com.p683ss.android.ugc.aweme.commercialize.star.C26255a.C26256a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PublishSettingItem;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.f */
public final class C26269f extends PublishSettingItem implements C26256a {

    /* renamed from: a */
    public ExtensionDataRepo f69354a;

    /* renamed from: b */
    private String f69355b;

    /* renamed from: k */
    private String f69356k;

    /* renamed from: l */
    private String f69357l;

    /* renamed from: m */
    private C39592a f69358m;

    /* renamed from: n */
    private boolean f69359n;

    public final String getBrandName() {
        return this.f69357l;
    }

    public final C39592a getPublishExtensionDataContainer() {
        return this.f69358m;
    }

    public final String getStarAtlasContent() {
        return this.f69356k;
    }

    public final String getStarAtlasHashTag() {
        return this.f69355b;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        ExtensionDataRepo extensionDataRepo = this.f69354a;
        if (extensionDataRepo == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this);
        C26255a.m63624a((C26256a) this);
    }

    /* renamed from: a */
    private final void m63635a() {
        C10700a.m21571a().mo19074a(getContext(), getContext().getString(R.string.dqb), 1).mo19075a();
    }

    public final boolean getHasStarAtlasOrder() {
        String str;
        C39592a aVar = this.f69358m;
        if (aVar != null) {
            str = aVar.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        C52711k.m112236a((Object) a, "PublishExtensionModel.fr…taContainer?.publishData)");
        return a.f68922d;
    }

    public final long getStarAtlasOrderId() {
        String str;
        C39592a aVar = this.f69358m;
        if (aVar != null) {
            str = aVar.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        C52711k.m112236a((Object) a, "PublishExtensionModel.fr…taContainer?.publishData)");
        if (C26257b.m63629a()) {
            return a.f68921c;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
        if (C52711k.m112239a((Object) C26255a.f69323a, (Object) this)) {
            C26255a.m63624a((C26256a) null);
        }
    }

    public final void setBrandName(String str) {
        this.f69357l = str;
    }

    public final void setPublishExtensionDataContainer(C39592a aVar) {
        this.f69358m = aVar;
    }

    public final void setStarAtlasHashTag(String str) {
        this.f69355b = str;
    }

    public final void setExtensionDataRepo(ExtensionDataRepo extensionDataRepo) {
        C52711k.m112240b(extensionDataRepo, "<set-?>");
        this.f69354a = extensionDataRepo;
    }

    public C26269f(Context context) {
        super(context);
        setDrawableLeft((int) R.drawable.aui);
        setSubtitleMaxWidth(C23728o.m58241a(120.0d));
    }

    private final void setChoose(boolean z) {
        this.f69359n = z;
        if (this.f69359n) {
            setSubtitle(this.f69357l);
        } else {
            setSubtitle((int) R.string.hkr);
        }
    }

    public final void setStarAtlasContent(String str) {
        boolean z;
        this.f69356k = str;
        this.f69357l = C26255a.m63627c(str);
        if (this.f69357l != null) {
            z = true;
        } else {
            z = false;
        }
        setHasStarAtlasOrder(z);
    }

    public final void setStarAtlasOrderId(long j) {
        boolean z;
        C39592a aVar = this.f69358m;
        if (aVar != null) {
            C26109ad a = C26109ad.m63393a(aVar.mo78634c());
            C52711k.m112236a((Object) a, "model");
            a.f68921c = j;
            aVar.mo78632a(C26109ad.m63394a(a));
        }
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        setChoose(z);
    }

    public final void setHasStarAtlasOrder(boolean z) {
        setChoose(z);
        C39592a aVar = this.f69358m;
        if (aVar != null) {
            C26109ad a = C26109ad.m63393a(aVar.mo78634c());
            C52711k.m112236a((Object) a, "model");
            a.mo53628a(z);
            a.f68923e = getStarAtlasContent();
            aVar.mo78632a(C26109ad.m63394a(a));
        }
        if (!z || !C24678b.m60182a(getStarAtlasHashTag())) {
            ExtensionDataRepo extensionDataRepo = this.f69354a;
            if (extensionDataRepo == null) {
                C52711k.m112237a("extensionDataRepo");
            }
            extensionDataRepo.getRemoveStarAtlasTag().invoke();
            return;
        }
        ExtensionDataRepo extensionDataRepo2 = this.f69354a;
        if (extensionDataRepo2 == null) {
            C52711k.m112237a("extensionDataRepo");
        }
        extensionDataRepo2.getAddStarAtlasTag().invoke();
    }

    /* renamed from: a */
    public final void mo53915a(JSONObject jSONObject) {
        C26269f fVar;
        boolean z;
        C52711k.m112240b(jSONObject, "starAtlasOrderJson");
        try {
            C26269f fVar2 = null;
            if (jSONObject.has("star_atlas_id")) {
                fVar = this;
            } else {
                fVar = null;
            }
            C26269f fVar3 = fVar;
            if (fVar3 != null) {
                if (getStarAtlasOrderId() != Long.parseLong(jSONObject.getString("star_atlas_id"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    fVar3 = null;
                }
                if (fVar3 != null) {
                    if (!jSONObject.has("component_type")) {
                        jSONObject.put("component_type", 0);
                    }
                    switch (jSONObject.getInt("component_type")) {
                        case 0:
                            m63637c(jSONObject);
                            break;
                        case 1:
                            m63640f(jSONObject);
                            break;
                        case 2:
                            m63638d(jSONObject);
                            break;
                        case 3:
                            m63639e(jSONObject);
                            break;
                        case 4:
                            m63636b(jSONObject);
                            break;
                    }
                    if (jSONObject.has("star_atlas_id")) {
                        fVar2 = this;
                    }
                    if (fVar2 != null) {
                        setStarAtlasOrderId(Long.parseLong(jSONObject.getString("star_atlas_id")));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private final void m63636b(JSONObject jSONObject) {
        int type;
        if (jSONObject.has("anchor")) {
            C26120e eVar = (C26120e) new C17971f().mo34884a(jSONObject.getString("anchor"), C26120e.class);
            if (eVar != null) {
                ExtensionDataRepo extensionDataRepo = this.f69354a;
                if (extensionDataRepo == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo.getRecordLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo2 = this.f69354a;
                if (extensionDataRepo2 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo2.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo3 = this.f69354a;
                if (extensionDataRepo3 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo3.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo4 = this.f69354a;
                if (extensionDataRepo4 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo4.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo5 = this.f69354a;
                if (extensionDataRepo5 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo5.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo6 = this.f69354a;
                if (extensionDataRepo6 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo6.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo7 = this.f69354a;
                if (extensionDataRepo7 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo7.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo8 = this.f69354a;
                if (extensionDataRepo8 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo8.getWithStarAtlasAnchor().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo9 = this.f69354a;
                if (extensionDataRepo9 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo9.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo10 = this.f69354a;
                if (extensionDataRepo10 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo10.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo11 = this.f69354a;
                if (extensionDataRepo11 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo11.getLocationState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo12 = this.f69354a;
                if (extensionDataRepo12 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo12.getAnchorState().setValue(Boolean.valueOf(false));
                Integer num = eVar.f68969b;
                if (num != null) {
                    type = num.intValue();
                } else {
                    type = C25600a.NO_TYPE.getTYPE();
                }
                int i = type;
                String str = eVar.f68970c;
                if (str == null) {
                    str = "";
                }
                AnchorTransData anchorTransData = new AnchorTransData(i, str, null, null, Integer.valueOf(999), eVar.f68968a, null, 76, null);
                C47718bf.m103288a(new C25615b(anchorTransData));
            }
        }
    }

    /* renamed from: c */
    private final void m63637c(JSONObject jSONObject) {
        boolean z;
        C26269f fVar;
        boolean z2 = true;
        if (jSONObject.has("order_id") || jSONObject.has("star_atlas_id")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fVar = this;
        } else {
            fVar = null;
        }
        C26269f fVar2 = fVar;
        if (fVar2 != null) {
            ExtensionDataRepo extensionDataRepo = this.f69354a;
            if (extensionDataRepo == null) {
                C52711k.m112237a("extensionDataRepo");
            }
            if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo.getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                ExtensionDataRepo extensionDataRepo2 = this.f69354a;
                if (extensionDataRepo2 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo2.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true))) {
                    ExtensionDataRepo extensionDataRepo3 = this.f69354a;
                    if (extensionDataRepo3 == null) {
                        C52711k.m112237a("extensionDataRepo");
                    }
                    if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo3.getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                        ExtensionDataRepo extensionDataRepo4 = this.f69354a;
                        if (extensionDataRepo4 == null) {
                            C52711k.m112237a("extensionDataRepo");
                        }
                        if (!C52711k.m112239a((Object) (Boolean) extensionDataRepo4.getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true))) {
                            z2 = false;
                        }
                    }
                }
            }
            if (!z2) {
                fVar2 = null;
            }
            if (fVar2 != null) {
                ExtensionDataRepo extensionDataRepo5 = this.f69354a;
                if (extensionDataRepo5 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo5.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo6 = this.f69354a;
                if (extensionDataRepo6 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo6.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo7 = this.f69354a;
                if (extensionDataRepo7 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo7.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo8 = this.f69354a;
                if (extensionDataRepo8 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo8.getWithStarAtlasAnchor().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo9 = this.f69354a;
                if (extensionDataRepo9 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo9.getRevertLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo10 = this.f69354a;
                if (extensionDataRepo10 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo10.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo11 = this.f69354a;
                if (extensionDataRepo11 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo11.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo12 = this.f69354a;
                if (extensionDataRepo12 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo12.getResetAnchor().invoke();
            }
        }
    }

    /* renamed from: d */
    private final void m63638d(JSONObject jSONObject) {
        boolean z;
        if (!jSONObject.has("poiInfo")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("poiInfo");
            if (jSONObject2 != null) {
                if (!jSONObject2.has("offline_store_info")) {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("offline_store_info");
                    if (jSONObject3 != null) {
                        if (!jSONObject3.has("poi_id") || !jSONObject3.has("poi_name")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            jSONObject3 = null;
                        }
                        if (jSONObject3 != null) {
                            m63635a();
                            PoiContext poiContext = new PoiContext();
                            poiContext.mSelectPoiId = jSONObject3.getString("poi_id");
                            poiContext.mSelectPoiName = jSONObject3.getString("poi_name");
                            if (jSONObject3.has("poi_longitude") && jSONObject3.has("poi_latitude")) {
                                String string = jSONObject3.getString("poi_longitude");
                                C52711k.m112236a((Object) string, "it.getString(\"poi_longitude\")");
                                poiContext.mShootPoiLng = Double.parseDouble(string);
                                String string2 = jSONObject3.getString("poi_latitude");
                                C52711k.m112236a((Object) string2, "it.getString(\"poi_latitude\")");
                                poiContext.mShootPoiLat = Double.parseDouble(string2);
                            }
                            ExtensionDataRepo extensionDataRepo = this.f69354a;
                            if (extensionDataRepo == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo.getRecordLinkAction().invoke();
                            ExtensionDataRepo extensionDataRepo2 = this.f69354a;
                            if (extensionDataRepo2 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo2.getResetLinkAction().invoke();
                            ExtensionDataRepo extensionDataRepo3 = this.f69354a;
                            if (extensionDataRepo3 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo3.getResetPoiAction().invoke();
                            ExtensionDataRepo extensionDataRepo4 = this.f69354a;
                            if (extensionDataRepo4 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo4.getResetGoodsAction().invoke();
                            ExtensionDataRepo extensionDataRepo5 = this.f69354a;
                            if (extensionDataRepo5 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo5.getResetAnchor().invoke();
                            ExtensionDataRepo extensionDataRepo6 = this.f69354a;
                            if (extensionDataRepo6 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo6.getUpdatePoiContext().invoke(PoiContext.serializeToStr(poiContext));
                            ExtensionDataRepo extensionDataRepo7 = this.f69354a;
                            if (extensionDataRepo7 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo7.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(true));
                            ExtensionDataRepo extensionDataRepo8 = this.f69354a;
                            if (extensionDataRepo8 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo8.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo9 = this.f69354a;
                            if (extensionDataRepo9 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo9.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo10 = this.f69354a;
                            if (extensionDataRepo10 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo10.getWithStarAtlasAnchor().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo11 = this.f69354a;
                            if (extensionDataRepo11 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo11.getLinkState().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo12 = this.f69354a;
                            if (extensionDataRepo12 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo12.getGoodsState().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo13 = this.f69354a;
                            if (extensionDataRepo13 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo13.getLocationState().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo14 = this.f69354a;
                            if (extensionDataRepo14 == null) {
                                C52711k.m112237a("extensionDataRepo");
                            }
                            extensionDataRepo14.getAnchorState().setValue(Boolean.valueOf(false));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private final void m63639e(JSONObject jSONObject) {
        boolean z;
        if (!jSONObject.has("goods_info")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("goods_info");
            if (!jSONObject2.has("draft_id") || !jSONObject2.has("title")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                m63635a();
                JSONObject jSONObject3 = jSONObject.getJSONObject("goods_info");
                ExtensionDataRepo extensionDataRepo = this.f69354a;
                if (extensionDataRepo == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo2 = this.f69354a;
                if (extensionDataRepo2 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo2.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo3 = this.f69354a;
                if (extensionDataRepo3 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo3.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo4 = this.f69354a;
                if (extensionDataRepo4 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo4.getRecordLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo5 = this.f69354a;
                if (extensionDataRepo5 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo5.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo6 = this.f69354a;
                if (extensionDataRepo6 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo6.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo7 = this.f69354a;
                if (extensionDataRepo7 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo7.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo8 = this.f69354a;
                if (extensionDataRepo8 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo8.getResetAnchor().invoke();
                BusinessGoodsPublishModel businessGoodsPublishModel = new BusinessGoodsPublishModel(jSONObject3.getString("draft_id"), jSONObject3.getString("title"));
                ExtensionDataRepo extensionDataRepo9 = this.f69354a;
                if (extensionDataRepo9 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo9.getRestoreGoodsPublishModel().invoke(businessGoodsPublishModel.toJsonString());
                ExtensionDataRepo extensionDataRepo10 = this.f69354a;
                if (extensionDataRepo10 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo10.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo11 = this.f69354a;
                if (extensionDataRepo11 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo11.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo12 = this.f69354a;
                if (extensionDataRepo12 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo12.getLocationState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo13 = this.f69354a;
                if (extensionDataRepo13 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo13.getAnchorState().setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: f */
    private final void m63640f(JSONObject jSONObject) {
        if (jSONObject.has("link_info")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("link_info");
            if (jSONObject2.has("link_title") && jSONObject2.has("link_data")) {
                m63635a();
                ExtensionDataRepo extensionDataRepo = this.f69354a;
                if (extensionDataRepo == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo2 = this.f69354a;
                if (extensionDataRepo2 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo2.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo3 = this.f69354a;
                if (extensionDataRepo3 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo3.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo4 = this.f69354a;
                if (extensionDataRepo4 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo4.getRecordLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo5 = this.f69354a;
                if (extensionDataRepo5 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo5.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo6 = this.f69354a;
                if (extensionDataRepo6 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo6.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo7 = this.f69354a;
                if (extensionDataRepo7 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo7.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo8 = this.f69354a;
                if (extensionDataRepo8 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo8.getResetAnchor().invoke();
                ExtensionDataRepo extensionDataRepo9 = this.f69354a;
                if (extensionDataRepo9 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo9.getUpdateLink().invoke(jSONObject2.getString("link_data"));
                ExtensionDataRepo extensionDataRepo10 = this.f69354a;
                if (extensionDataRepo10 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo10.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo11 = this.f69354a;
                if (extensionDataRepo11 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo11.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo12 = this.f69354a;
                if (extensionDataRepo12 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo12.getLocationState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo13 = this.f69354a;
                if (extensionDataRepo13 == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo13.getAnchorState().setValue(Boolean.valueOf(false));
            }
        }
    }

    @C53771m
    public final void onJsBroacastReceiver(C29906l lVar) {
        C26269f fVar;
        boolean z;
        C26269f fVar2;
        JSONObject jSONObject;
        C52711k.m112240b(lVar, "broadCastEvent");
        try {
            String string = lVar.f78045b.getString("eventName");
            if (string != null) {
                String str = null;
                if (!C52711k.m112239a((Object) string, (Object) "star_atlas_event")) {
                    string = null;
                }
                if (string != null) {
                    if (!lVar.f78045b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        JSONObject jSONObject2 = lVar.f78045b.getJSONObject("data");
                        if (jSONObject2.has("order_id")) {
                            fVar = this;
                        } else {
                            fVar = null;
                        }
                        C26269f fVar3 = fVar;
                        if (fVar3 != null) {
                            if (getStarAtlasOrderId() != Long.parseLong(jSONObject2.getString("order_id"))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                fVar3 = null;
                            }
                            if (fVar3 != null) {
                                if (!jSONObject2.has("component_type")) {
                                    jSONObject2.put("component_type", 0);
                                }
                                switch (jSONObject2.getInt("component_type")) {
                                    case 0:
                                        C52711k.m112236a((Object) jSONObject2, "data");
                                        m63637c(jSONObject2);
                                        break;
                                    case 1:
                                        C52711k.m112236a((Object) jSONObject2, "data");
                                        m63640f(jSONObject2);
                                        break;
                                    case 2:
                                        C52711k.m112236a((Object) jSONObject2, "data");
                                        m63638d(jSONObject2);
                                        break;
                                    case 3:
                                        C52711k.m112236a((Object) jSONObject2, "data");
                                        m63639e(jSONObject2);
                                        break;
                                    case 4:
                                        C52711k.m112236a((Object) jSONObject2, "data");
                                        m63636b(jSONObject2);
                                        break;
                                }
                                if (jSONObject2.has("order_id")) {
                                    fVar2 = this;
                                } else {
                                    fVar2 = null;
                                }
                                if (fVar2 != null) {
                                    setStarAtlasOrderId(Long.parseLong(jSONObject2.getString("order_id")));
                                }
                                String optString = jSONObject2.optString("channel");
                                C39592a aVar = this.f69358m;
                                if (aVar != null) {
                                    str = aVar.mo78634c();
                                }
                                C26109ad a = C26109ad.m63393a(str);
                                C52711k.m112236a((Object) a, "PublishExtensionModel.fr…taContainer?.publishData)");
                                if (TextUtils.isEmpty(a.f68937s)) {
                                    jSONObject = new JSONObject();
                                } else {
                                    jSONObject = new JSONObject(a.f68937s);
                                }
                                a.f68937s = jSONObject.put("channel", optString).toString();
                                C39592a aVar2 = this.f69358m;
                                if (aVar2 != null) {
                                    aVar2.mo78632a(C26109ad.m63394a(a));
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
