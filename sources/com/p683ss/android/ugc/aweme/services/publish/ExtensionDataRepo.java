package com.p683ss.android.ugc.aweme.services.publish;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo */
public final class ExtensionDataRepo extends C0209x {
    private C52670a<C52860x> addStarAtlasTag = ExtensionDataRepo$addStarAtlasTag$1.INSTANCE;
    private final C0198r<Boolean> anchorState;
    private final C0198r<Boolean> goodsState;
    private final C0198r<Boolean> i18nPrivacy;
    private final C0198r<Boolean> i18nStarAtlasClosed;
    private IPermissionAction iPermissionAction;
    private final C0198r<Boolean> isGoodsAdd;
    private final C0198r<Boolean> isPoiAdd;
    private final C0198r<Boolean> linkState;
    private final C0198r<Boolean> locationActivityVisible;
    private final C0198r<Boolean> locationState;
    private C52670a<C52860x> recordLinkAction = ExtensionDataRepo$recordLinkAction$1.INSTANCE;
    private C52670a<C52860x> removeStarAtlasTag = ExtensionDataRepo$removeStarAtlasTag$1.INSTANCE;
    private C52670a<C52860x> resetAnchor = ExtensionDataRepo$resetAnchor$1.INSTANCE;
    private C52670a<C52860x> resetGoodsAction = ExtensionDataRepo$resetGoodsAction$1.INSTANCE;
    private C52670a<C52860x> resetLinkAction = ExtensionDataRepo$resetLinkAction$1.INSTANCE;
    private C52670a<C52860x> resetPoiAction = ExtensionDataRepo$resetPoiAction$1.INSTANCE;
    private C52671b<? super String, C52860x> restoreGoodsPublishModel = ExtensionDataRepo$restoreGoodsPublishModel$1.INSTANCE;
    private C52670a<C52860x> revertLinkAction = ExtensionDataRepo$revertLinkAction$1.INSTANCE;
    private C52671b<? super String, C52860x> setPoiActivity = ExtensionDataRepo$setPoiActivity$1.INSTANCE;
    private C52671b<? super Integer, Boolean> showPermissionAction;
    private final C0198r<Boolean> starAtlasState;
    private C0198r<AnchorTransData> updateAnchor = new C0198r<>();
    private C52671b<? super String, C52860x> updateLink = ExtensionDataRepo$updateLink$1.INSTANCE;
    private C52671b<? super String, C52860x> updatePoiContext = ExtensionDataRepo$updatePoiContext$1.INSTANCE;
    private final C0198r<Boolean> withStarAtlasAnchor;
    private final C0198r<Boolean> withStarAtlasOrderGoods;
    private final C0198r<Boolean> withStarAtlasOrderLink;
    private final C0198r<Boolean> withStarAtlasOrderPoi;

    public final C52670a<C52860x> getAddStarAtlasTag() {
        return this.addStarAtlasTag;
    }

    public final C0198r<Boolean> getAnchorState() {
        return this.anchorState;
    }

    public final C0198r<Boolean> getGoodsState() {
        return this.goodsState;
    }

    public final C0198r<Boolean> getI18nPrivacy() {
        return this.i18nPrivacy;
    }

    public final C0198r<Boolean> getI18nStarAtlasClosed() {
        return this.i18nStarAtlasClosed;
    }

    public final IPermissionAction getIPermissionAction() {
        return this.iPermissionAction;
    }

    public final C0198r<Boolean> getLinkState() {
        return this.linkState;
    }

    public final C0198r<Boolean> getLocationActivityVisible() {
        return this.locationActivityVisible;
    }

    public final C0198r<Boolean> getLocationState() {
        return this.locationState;
    }

    public final C52670a<C52860x> getRecordLinkAction() {
        return this.recordLinkAction;
    }

    public final C52670a<C52860x> getRemoveStarAtlasTag() {
        return this.removeStarAtlasTag;
    }

    public final C52670a<C52860x> getResetAnchor() {
        return this.resetAnchor;
    }

    public final C52670a<C52860x> getResetGoodsAction() {
        return this.resetGoodsAction;
    }

    public final C52670a<C52860x> getResetLinkAction() {
        return this.resetLinkAction;
    }

    public final C52670a<C52860x> getResetPoiAction() {
        return this.resetPoiAction;
    }

    public final C52671b<String, C52860x> getRestoreGoodsPublishModel() {
        return this.restoreGoodsPublishModel;
    }

    public final C52670a<C52860x> getRevertLinkAction() {
        return this.revertLinkAction;
    }

    public final C52671b<String, C52860x> getSetPoiActivity() {
        return this.setPoiActivity;
    }

    public final C52671b<Integer, Boolean> getShowPermissionAction() {
        return this.showPermissionAction;
    }

    public final C0198r<Boolean> getStarAtlasState() {
        return this.starAtlasState;
    }

    public final C0198r<AnchorTransData> getUpdateAnchor() {
        return this.updateAnchor;
    }

    public final C52671b<String, C52860x> getUpdateLink() {
        return this.updateLink;
    }

    public final C52671b<String, C52860x> getUpdatePoiContext() {
        return this.updatePoiContext;
    }

    public final C0198r<Boolean> getWithStarAtlasAnchor() {
        return this.withStarAtlasAnchor;
    }

    public final C0198r<Boolean> getWithStarAtlasOrderGoods() {
        return this.withStarAtlasOrderGoods;
    }

    public final C0198r<Boolean> getWithStarAtlasOrderLink() {
        return this.withStarAtlasOrderLink;
    }

    public final C0198r<Boolean> getWithStarAtlasOrderPoi() {
        return this.withStarAtlasOrderPoi;
    }

    public final C0198r<Boolean> isGoodsAdd() {
        return this.isGoodsAdd;
    }

    public final C0198r<Boolean> isPoiAdd() {
        return this.isPoiAdd;
    }

    public ExtensionDataRepo() {
        C0198r<Boolean> rVar = new C0198r<>();
        rVar.setValue(Boolean.valueOf(false));
        this.isGoodsAdd = rVar;
        C0198r<Boolean> rVar2 = new C0198r<>();
        rVar2.setValue(Boolean.valueOf(false));
        this.isPoiAdd = rVar2;
        C0198r<Boolean> rVar3 = new C0198r<>();
        rVar3.setValue(Boolean.valueOf(false));
        this.withStarAtlasOrderPoi = rVar3;
        C0198r<Boolean> rVar4 = new C0198r<>();
        rVar4.setValue(Boolean.valueOf(false));
        this.withStarAtlasOrderGoods = rVar4;
        C0198r<Boolean> rVar5 = new C0198r<>();
        rVar5.setValue(Boolean.valueOf(false));
        this.withStarAtlasOrderLink = rVar5;
        C0198r<Boolean> rVar6 = new C0198r<>();
        rVar6.setValue(Boolean.valueOf(false));
        this.withStarAtlasAnchor = rVar6;
        C0198r<Boolean> rVar7 = new C0198r<>();
        rVar7.setValue(Boolean.valueOf(true));
        this.i18nPrivacy = rVar7;
        C0198r<Boolean> rVar8 = new C0198r<>();
        rVar8.setValue(Boolean.valueOf(true));
        this.i18nStarAtlasClosed = rVar8;
        C0198r<Boolean> rVar9 = new C0198r<>();
        rVar9.setValue(Boolean.valueOf(true));
        this.starAtlasState = rVar9;
        C0198r<Boolean> rVar10 = new C0198r<>();
        rVar10.setValue(Boolean.valueOf(true));
        this.locationState = rVar10;
        C0198r<Boolean> rVar11 = new C0198r<>();
        rVar11.setValue(Boolean.valueOf(true));
        this.goodsState = rVar11;
        C0198r<Boolean> rVar12 = new C0198r<>();
        rVar12.setValue(Boolean.valueOf(true));
        this.linkState = rVar12;
        C0198r<Boolean> rVar13 = new C0198r<>();
        rVar13.setValue(Boolean.valueOf(false));
        this.locationActivityVisible = rVar13;
        C0198r<Boolean> rVar14 = new C0198r<>();
        rVar14.setValue(Boolean.valueOf(true));
        this.anchorState = rVar14;
    }

    public final void setIPermissionAction(IPermissionAction iPermissionAction2) {
        this.iPermissionAction = iPermissionAction2;
    }

    public final void setShowPermissionAction(C52671b<? super Integer, Boolean> bVar) {
        this.showPermissionAction = bVar;
    }

    public final void setAddStarAtlasTag(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.addStarAtlasTag = aVar;
    }

    public final void setRecordLinkAction(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.recordLinkAction = aVar;
    }

    public final void setRemoveStarAtlasTag(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.removeStarAtlasTag = aVar;
    }

    public final void setResetAnchor(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.resetAnchor = aVar;
    }

    public final void setResetGoodsAction(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.resetGoodsAction = aVar;
    }

    public final void setResetLinkAction(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.resetLinkAction = aVar;
    }

    public final void setResetPoiAction(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.resetPoiAction = aVar;
    }

    public final void setRestoreGoodsPublishModel(C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.restoreGoodsPublishModel = bVar;
    }

    public final void setRevertLinkAction(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.revertLinkAction = aVar;
    }

    public final void setSetPoiActivity(C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.setPoiActivity = bVar;
    }

    public final void setUpdateAnchor(C0198r<AnchorTransData> rVar) {
        C52711k.m112240b(rVar, "<set-?>");
        this.updateAnchor = rVar;
    }

    public final void setUpdateLink(C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.updateLink = bVar;
    }

    public final void setUpdatePoiContext(C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.updatePoiContext = bVar;
    }
}
