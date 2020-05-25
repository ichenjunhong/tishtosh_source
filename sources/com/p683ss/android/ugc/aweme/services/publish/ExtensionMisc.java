package com.p683ss.android.ugc.aweme.services.publish;

import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.publish.ExtensionMisc */
public final class ExtensionMisc {
    private final String candidateLog;
    private final C29067e defaultSelectStickerPoi;
    private final ExtensionDataRepo extensionDataRepo;
    private final boolean hasEditPageWikiAnchor;
    private final MobParam mobParam;
    private final String poiContext;
    private final C39592a publishExtensionDataContainer;
    private final C43758o transMicroAppInfo;

    public ExtensionMisc(String str, C29067e eVar, String str2, C43758o oVar, C39592a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2) {
        this(str, eVar, str2, oVar, aVar, extensionDataRepo2, mobParam2, false, 128, null);
    }

    public static /* synthetic */ ExtensionMisc copy$default(ExtensionMisc extensionMisc, String str, C29067e eVar, String str2, C43758o oVar, C39592a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z, int i, Object obj) {
        ExtensionMisc extensionMisc2 = extensionMisc;
        int i2 = i;
        return extensionMisc.copy((i2 & 1) != 0 ? extensionMisc2.candidateLog : str, (i2 & 2) != 0 ? extensionMisc2.defaultSelectStickerPoi : eVar, (i2 & 4) != 0 ? extensionMisc2.poiContext : str2, (i2 & 8) != 0 ? extensionMisc2.transMicroAppInfo : oVar, (i2 & 16) != 0 ? extensionMisc2.publishExtensionDataContainer : aVar, (i2 & 32) != 0 ? extensionMisc2.extensionDataRepo : extensionDataRepo2, (i2 & 64) != 0 ? extensionMisc2.mobParam : mobParam2, (i2 & 128) != 0 ? extensionMisc2.hasEditPageWikiAnchor : z);
    }

    public final String component1() {
        return this.candidateLog;
    }

    public final C29067e component2() {
        return this.defaultSelectStickerPoi;
    }

    public final String component3() {
        return this.poiContext;
    }

    public final C43758o component4() {
        return this.transMicroAppInfo;
    }

    public final C39592a component5() {
        return this.publishExtensionDataContainer;
    }

    public final ExtensionDataRepo component6() {
        return this.extensionDataRepo;
    }

    public final MobParam component7() {
        return this.mobParam;
    }

    public final boolean component8() {
        return this.hasEditPageWikiAnchor;
    }

    public final ExtensionMisc copy(String str, C29067e eVar, String str2, C43758o oVar, C39592a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z) {
        ExtensionDataRepo extensionDataRepo3 = extensionDataRepo2;
        C52711k.m112240b(extensionDataRepo3, "extensionDataRepo");
        MobParam mobParam3 = mobParam2;
        C52711k.m112240b(mobParam3, "mobParam");
        ExtensionMisc extensionMisc = new ExtensionMisc(str, eVar, str2, oVar, aVar, extensionDataRepo3, mobParam3, z);
        return extensionMisc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ExtensionMisc) {
                ExtensionMisc extensionMisc = (ExtensionMisc) obj;
                if (C52711k.m112239a((Object) this.candidateLog, (Object) extensionMisc.candidateLog) && C52711k.m112239a((Object) this.defaultSelectStickerPoi, (Object) extensionMisc.defaultSelectStickerPoi) && C52711k.m112239a((Object) this.poiContext, (Object) extensionMisc.poiContext) && C52711k.m112239a((Object) this.transMicroAppInfo, (Object) extensionMisc.transMicroAppInfo) && C52711k.m112239a((Object) this.publishExtensionDataContainer, (Object) extensionMisc.publishExtensionDataContainer) && C52711k.m112239a((Object) this.extensionDataRepo, (Object) extensionMisc.extensionDataRepo) && C52711k.m112239a((Object) this.mobParam, (Object) extensionMisc.mobParam)) {
                    if (this.hasEditPageWikiAnchor == extensionMisc.hasEditPageWikiAnchor) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCandidateLog() {
        return this.candidateLog;
    }

    public final C29067e getDefaultSelectStickerPoi() {
        return this.defaultSelectStickerPoi;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        return this.extensionDataRepo;
    }

    public final boolean getHasEditPageWikiAnchor() {
        return this.hasEditPageWikiAnchor;
    }

    public final MobParam getMobParam() {
        return this.mobParam;
    }

    public final String getPoiContext() {
        return this.poiContext;
    }

    public final C39592a getPublishExtensionDataContainer() {
        return this.publishExtensionDataContainer;
    }

    public final C43758o getTransMicroAppInfo() {
        return this.transMicroAppInfo;
    }

    public final int hashCode() {
        String str = this.candidateLog;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C29067e eVar = this.defaultSelectStickerPoi;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str2 = this.poiContext;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C43758o oVar = this.transMicroAppInfo;
        int hashCode4 = (hashCode3 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        C39592a aVar = this.publishExtensionDataContainer;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ExtensionDataRepo extensionDataRepo2 = this.extensionDataRepo;
        int hashCode6 = (hashCode5 + (extensionDataRepo2 != null ? extensionDataRepo2.hashCode() : 0)) * 31;
        MobParam mobParam2 = this.mobParam;
        if (mobParam2 != null) {
            i = mobParam2.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.hasEditPageWikiAnchor;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtensionMisc(candidateLog=");
        sb.append(this.candidateLog);
        sb.append(", defaultSelectStickerPoi=");
        sb.append(this.defaultSelectStickerPoi);
        sb.append(", poiContext=");
        sb.append(this.poiContext);
        sb.append(", transMicroAppInfo=");
        sb.append(this.transMicroAppInfo);
        sb.append(", publishExtensionDataContainer=");
        sb.append(this.publishExtensionDataContainer);
        sb.append(", extensionDataRepo=");
        sb.append(this.extensionDataRepo);
        sb.append(", mobParam=");
        sb.append(this.mobParam);
        sb.append(", hasEditPageWikiAnchor=");
        sb.append(this.hasEditPageWikiAnchor);
        sb.append(")");
        return sb.toString();
    }

    public ExtensionMisc(String str, C29067e eVar, String str2, C43758o oVar, C39592a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z) {
        C52711k.m112240b(extensionDataRepo2, "extensionDataRepo");
        C52711k.m112240b(mobParam2, "mobParam");
        this.candidateLog = str;
        this.defaultSelectStickerPoi = eVar;
        this.poiContext = str2;
        this.transMicroAppInfo = oVar;
        this.publishExtensionDataContainer = aVar;
        this.extensionDataRepo = extensionDataRepo2;
        this.mobParam = mobParam2;
        this.hasEditPageWikiAnchor = z;
    }

    public /* synthetic */ ExtensionMisc(String str, C29067e eVar, String str2, C43758o oVar, C39592a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z, int i, C52707g gVar) {
        boolean z2;
        if ((i & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, eVar, str2, oVar, aVar, extensionDataRepo2, mobParam2, z2);
    }
}
