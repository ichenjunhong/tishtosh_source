package com.p683ss.android.ugc.aweme.tools.beauty.service;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig */
public final class BeautyFilterConfig {
    private final int abGroup;
    private final boolean hasTitle;
    private final String sequenceKey;
    private boolean uLike2ComposerTagValueConvert;

    public static /* synthetic */ BeautyFilterConfig copy$default(BeautyFilterConfig beautyFilterConfig, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = beautyFilterConfig.abGroup;
        }
        if ((i2 & 2) != 0) {
            str = beautyFilterConfig.sequenceKey;
        }
        if ((i2 & 4) != 0) {
            z = beautyFilterConfig.hasTitle;
        }
        return beautyFilterConfig.copy(i, str, z);
    }

    public final int component1() {
        return this.abGroup;
    }

    public final String component2() {
        return this.sequenceKey;
    }

    public final boolean component3() {
        return this.hasTitle;
    }

    public final BeautyFilterConfig copy(int i, String str, boolean z) {
        C52711k.m112240b(str, "sequenceKey");
        return new BeautyFilterConfig(i, str, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BeautyFilterConfig) {
                BeautyFilterConfig beautyFilterConfig = (BeautyFilterConfig) obj;
                if ((this.abGroup == beautyFilterConfig.abGroup) && C52711k.m112239a((Object) this.sequenceKey, (Object) beautyFilterConfig.sequenceKey)) {
                    if (this.hasTitle == beautyFilterConfig.hasTitle) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean getHasTitle() {
        return this.hasTitle;
    }

    public final String getSequenceKey() {
        return this.sequenceKey;
    }

    public final boolean getULike2ComposerTagValueConvert() {
        return this.uLike2ComposerTagValueConvert;
    }

    public final int hashCode() {
        int i = this.abGroup * 31;
        String str = this.sequenceKey;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.hasTitle;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautyFilterConfig(abGroup=");
        sb.append(this.abGroup);
        sb.append(", sequenceKey=");
        sb.append(this.sequenceKey);
        sb.append(", hasTitle=");
        sb.append(this.hasTitle);
        sb.append(")");
        return sb.toString();
    }

    public final void setULike2ComposerTagValueConvert(boolean z) {
        this.uLike2ComposerTagValueConvert = z;
    }

    public BeautyFilterConfig(int i, String str, boolean z) {
        C52711k.m112240b(str, "sequenceKey");
        this.abGroup = i;
        this.sequenceKey = str;
        this.hasTitle = z;
    }

    public /* synthetic */ BeautyFilterConfig(int i, String str, boolean z, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        this(i, str, z);
    }
}
