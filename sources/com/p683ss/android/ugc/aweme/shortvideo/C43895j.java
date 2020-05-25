package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.OcrLocation;
import com.p683ss.android.ugc.aweme.feed.model.VPAInfo;
import com.p683ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.j */
public class C43895j implements Serializable {
    @C17952c(mo34828a = "diamond_game_id")
    public String diamondGameId;
    @C17952c(mo34828a = "hproject_info")
    public C43896a f2ProjectInfo;
    @C17952c(mo34828a = "green_screen")
    public int greenScreen;
    @C17952c(mo34828a = "koi_fish")
    public int koiFish;
    @C17952c(mo34828a = "status_template_id")
    public String mStatusId;
    @C17952c(mo34828a = "video_tag")
    public int mVideoTag;
    @C17952c(mo34828a = "mv_info")
    public MvModel mvInfo;
    @C17952c(mo34828a = "mv_id")
    public String mvThemeId;
    @C17952c(mo34828a = "mv_type")
    public int mvType;
    @C17952c(mo34828a = "ocr_location")
    public String ocrLocation;
    @C17952c(mo34828a = "vpa_info")
    public VPAInfo vpaInfo = new VPAInfo(false, 0);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.j$a */
    public static class C43896a implements Serializable {
        @C17952c(mo34828a = "icon_url")
        public UrlModel iconUrl;
        @C17952c(mo34828a = "schema_url")
        public String schemaUrl;
        @C17952c(mo34828a = "title")
        public String title;
    }

    public OcrLocation getOcrLocation() {
        OcrLocation ocrLocation2;
        if (TextUtils.isEmpty(this.ocrLocation)) {
            return null;
        }
        try {
            ocrLocation2 = (OcrLocation) new C17971f().mo34884a(this.ocrLocation, OcrLocation.class);
        } catch (Exception unused) {
            ocrLocation2 = null;
        }
        return ocrLocation2;
    }

    public static C43895j createStruct(String str) {
        C43895j jVar;
        C43895j jVar2 = new C43895j();
        if (TextUtils.isEmpty(str)) {
            return jVar2;
        }
        try {
            jVar = (C43895j) new C17971f().mo34884a(str, C43895j.class);
        } catch (Exception unused) {
            jVar = jVar2;
        }
        return jVar;
    }
}
