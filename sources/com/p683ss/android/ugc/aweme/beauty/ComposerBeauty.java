package com.p683ss.android.ugc.aweme.beauty;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeauty */
public final class ComposerBeauty {
    private boolean add2Nodes;
    private final ComposerBeautyExtraBeautify beautifyExtra;
    private final boolean categoryExclusive;
    private final String categoryId;
    private final List<ComposerBeauty> childList;
    private final Effect effect;
    private boolean enable;
    private final ComposerBeautyExtra extra;
    private final boolean isCollectionType;
    private final String parentId;
    private final String parentName;
    private int progressValue;
    private boolean selected;
    private boolean showDot;

    public final boolean getAdd2Nodes() {
        return this.add2Nodes;
    }

    public final ComposerBeautyExtraBeautify getBeautifyExtra() {
        return this.beautifyExtra;
    }

    public final boolean getCategoryExclusive() {
        return this.categoryExclusive;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final List<ComposerBeauty> getChildList() {
        return this.childList;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final ComposerBeautyExtra getExtra() {
        return this.extra;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final int getProgressValue() {
        return this.progressValue;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getShowDot() {
        return this.showDot;
    }

    public final boolean isCollectionType() {
        return this.isCollectionType;
    }

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final boolean needFaceDetect() {
        Object obj;
        List requirements = this.effect.getRequirements();
        C52711k.m112236a((Object) requirements, "effect.requirements");
        Iterator it = requirements.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C52711k.m112239a((Object) (String) obj, (Object) "faceDetect")) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final void setAdd2Nodes(boolean z) {
        this.add2Nodes = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setProgressValue(int i) {
        this.progressValue = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setShowDot(boolean z) {
        this.showDot = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeauty)) {
            return false;
        }
        ComposerBeauty composerBeauty = (ComposerBeauty) obj;
        if (!C52711k.m112239a((Object) composerBeauty.effect.getEffectId(), (Object) this.effect.getEffectId()) || !C52711k.m112239a((Object) this.categoryId, (Object) composerBeauty.categoryId) || !C52711k.m112239a((Object) this.parentId, (Object) composerBeauty.parentId)) {
            return false;
        }
        return true;
    }

    public ComposerBeauty(Effect effect2, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, String str, boolean z, boolean z2, String str2, String str3, List<ComposerBeauty> list, boolean z3, boolean z4, int i, boolean z5, boolean z6) {
        C52711k.m112240b(effect2, "effect");
        C52711k.m112240b(composerBeautyExtra, "extra");
        C52711k.m112240b(composerBeautyExtraBeautify, "beautifyExtra");
        C52711k.m112240b(str, "categoryId");
        this.effect = effect2;
        this.extra = composerBeautyExtra;
        this.beautifyExtra = composerBeautyExtraBeautify;
        this.categoryId = str;
        this.categoryExclusive = z;
        this.isCollectionType = z2;
        this.parentId = str2;
        this.parentName = str3;
        this.childList = list;
        this.selected = z3;
        this.showDot = z4;
        this.progressValue = i;
        this.enable = z5;
        this.add2Nodes = z6;
    }

    public /* synthetic */ ComposerBeauty(Effect effect2, ComposerBeautyExtra composerBeautyExtra, ComposerBeautyExtraBeautify composerBeautyExtraBeautify, String str, boolean z, boolean z2, String str2, String str3, List list, boolean z3, boolean z4, int i, boolean z5, boolean z6, int i2, C52707g gVar) {
        String str4;
        boolean z7;
        boolean z8;
        String str5;
        String str6;
        List list2;
        boolean z9;
        boolean z10;
        int i3;
        boolean z11;
        boolean z12;
        int i4 = i2;
        if ((i4 & 8) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i4 & 16) != 0) {
            z7 = false;
        } else {
            z7 = z;
        }
        if ((i4 & 32) != 0) {
            z8 = false;
        } else {
            z8 = z2;
        }
        if ((i4 & 64) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i4 & 128) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i4 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i4 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            z9 = false;
        } else {
            z9 = z3;
        }
        if ((i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            z10 = false;
        } else {
            z10 = z4;
        }
        if ((i4 & 2048) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i4 & 4096) != 0) {
            z11 = true;
        } else {
            z11 = z5;
        }
        if ((i4 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            z12 = false;
        } else {
            z12 = z6;
        }
        this(effect2, composerBeautyExtra, composerBeautyExtraBeautify, str4, z7, z8, str5, str6, list2, z9, z10, i3, z11, z12);
    }
}
