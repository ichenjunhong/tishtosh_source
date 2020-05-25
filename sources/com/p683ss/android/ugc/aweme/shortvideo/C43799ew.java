package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ew */
public final class C43799ew implements Serializable {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT;
    public static int BEATES_FILE_SERVER_C = 1;
    public static final C43800a Companion = new C43800a(null);
    @C17952c(mo34828a = "music_id")

    /* renamed from: a */
    private String f110903a;
    @C17952c(mo34828a = "vebeats_url")

    /* renamed from: b */
    private String f110904b;
    @C17952c(mo34828a = "vebeats_path")

    /* renamed from: c */
    private String f110905c;
    @C17952c(mo34828a = "downbeats_url")

    /* renamed from: d */
    private String f110906d;
    @C17952c(mo34828a = "downbeats_path")

    /* renamed from: e */
    private String f110907e;
    @C17952c(mo34828a = "nostrengthbeats_url")

    /* renamed from: f */
    private String f110908f;
    @C17952c(mo34828a = "nostrengthbeats_path")

    /* renamed from: g */
    private String f110909g;
    @C17952c(mo34828a = "defaultlocal_path")

    /* renamed from: h */
    private String f110910h;
    @C17952c(mo34828a = "defaultlocal_url")

    /* renamed from: i */
    private String f110911i;
    @C17952c(mo34828a = "manmodebeats_url")

    /* renamed from: j */
    private String f110912j;
    @C17952c(mo34828a = "manmodebeats_path")

    /* renamed from: k */
    private String f110913k;
    @C17952c(mo34828a = "alg_type")

    /* renamed from: l */
    private int f110914l = BEATES_FILE_DEFAULT;
    @C17952c(mo34828a = "min_seg")

    /* renamed from: m */
    private int f110915m;
    @C17952c(mo34828a = "max_seg")

    /* renamed from: n */
    private int f110916n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ew$a */
    public static final class C43800a {
        private C43800a() {
        }

        public /* synthetic */ C43800a(C52707g gVar) {
            this();
        }
    }

    public final int getAlgType() {
        return this.f110914l;
    }

    public final String getDefaultLocalPath() {
        return this.f110910h;
    }

    public final String getDefaultLocalUrl() {
        return this.f110911i;
    }

    public final String getDownBeatsPath() {
        return this.f110907e;
    }

    public final String getDownBeatsUrl() {
        return this.f110906d;
    }

    public final String getManModeBeatsPath() {
        return this.f110913k;
    }

    public final String getManModeBeatsUrl() {
        return this.f110912j;
    }

    public final int getMaxSeg() {
        return this.f110916n;
    }

    public final int getMinSeg() {
        return this.f110915m;
    }

    public final String getMusicId() {
        return this.f110903a;
    }

    public final String getNoStrengthBeatsPath() {
        return this.f110909g;
    }

    public final String getNoStrengthBeatsUrl() {
        return this.f110908f;
    }

    public final String getVeBeatsPath() {
        return this.f110905c;
    }

    public final String getVeBeatsUrl() {
        return this.f110904b;
    }

    public final boolean existOnSetAlgFile() {
        return C50200d.m108346a(this.f110905c);
    }

    public final boolean hasOnSetAlgUrl() {
        if (!TextUtils.isEmpty(this.f110904b)) {
            return true;
        }
        return false;
    }

    public final boolean isSuccessivelyAlgType() {
        if (this.f110914l == BEATES_FILE_SERVER_C || this.f110914l == BEATES_FILE_BEATS_A0 || this.f110914l == BEATES_FILE_CUSTOM) {
            return true;
        }
        return false;
    }

    public final boolean existSuccessivelyAlgFile() {
        if (this.f110914l == BEATES_FILE_BEATS_A0) {
            return C50200d.m108346a(this.f110905c);
        }
        if (this.f110914l == BEATES_FILE_SERVER_C) {
            return C50200d.m108346a(this.f110907e);
        }
        if (this.f110914l == BEATES_FILE_CUSTOM) {
            return C50200d.m108346a(this.f110913k);
        }
        return false;
    }

    public final boolean hasSuccessivelyAlgUrl() {
        if (this.f110914l == BEATES_FILE_BEATS_A0) {
            if (!TextUtils.isEmpty(this.f110904b)) {
                return true;
            }
            return false;
        } else if (this.f110914l == BEATES_FILE_SERVER_C) {
            if (!TextUtils.isEmpty(this.f110906d)) {
                return true;
            }
            return false;
        } else if (this.f110914l != BEATES_FILE_CUSTOM || TextUtils.isEmpty(this.f110912j)) {
            return false;
        } else {
            return true;
        }
    }

    public final void setAlgType(int i) {
        this.f110914l = i;
    }

    public final void setDefaultLocalPath(String str) {
        this.f110910h = str;
    }

    public final void setDefaultLocalUrl(String str) {
        this.f110911i = str;
    }

    public final void setDownBeatsPath(String str) {
        this.f110907e = str;
    }

    public final void setDownBeatsUrl(String str) {
        this.f110906d = str;
    }

    public final void setManModeBeatsPath(String str) {
        this.f110913k = str;
    }

    public final void setManModeBeatsUrl(String str) {
        this.f110912j = str;
    }

    public final void setMaxSeg(int i) {
        this.f110916n = i;
    }

    public final void setMinSeg(int i) {
        this.f110915m = i;
    }

    public final void setMusicId(String str) {
        this.f110903a = str;
    }

    public final void setNoStrengthBeatsPath(String str) {
        this.f110909g = str;
    }

    public final void setNoStrengthBeatsUrl(String str) {
        this.f110908f = str;
    }

    public final void setVeBeatsPath(String str) {
        this.f110905c = str;
    }

    public final void setVeBeatsUrl(String str) {
        this.f110904b = str;
    }
}
