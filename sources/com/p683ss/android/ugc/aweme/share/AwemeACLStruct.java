package com.p683ss.android.ugc.aweme.share;

import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.model.VideoControl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct */
public final class AwemeACLStruct {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f106073a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AwemeACLStruct.class), "aclCommonStruct", "getAclCommonStruct()Lcom/ss/android/ugc/aweme/share/AwemeACLStruct$ACLCommonStruct;"))};

    /* renamed from: b */
    public static final AwemeACLStruct f106074b = new AwemeACLStruct();

    /* renamed from: c */
    private static final C52668f f106075c = C52732g.m112285a(C41915a.f106081a);

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct */
    public static final class ACLCommonStruct implements Serializable {
        private int code;
        private String extra = "";
        private int showType = 2;
        private String toastMsg = "";

        public final int getCode() {
            return this.code;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final String getToastMsg() {
            return this.toastMsg;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("code = ");
            sb.append(this.code);
            sb.append(", showType = ");
            sb.append(this.showType);
            sb.append(", toastMsg = ");
            sb.append(this.toastMsg);
            sb.append(" extra = ");
            sb.append(this.extra);
            return sb.toString();
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setShowType(int i) {
            this.showType = i;
        }

        public final void setExtra(String str) {
            C52711k.m112240b(str, "<set-?>");
            this.extra = str;
        }

        public final void setToastMsg(String str) {
            C52711k.m112240b(str, "<set-?>");
            this.toastMsg = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$ServerExtra */
    public static final class ServerExtra implements Serializable {

        /* renamed from: aa */
        private Integer f106076aa = Integer.valueOf(0);
        private Boolean aac = Boolean.valueOf(true);
        private Integer aad = Integer.valueOf(0);
        private Boolean aas = Boolean.valueOf(false);

        /* renamed from: ad */
        private Boolean f106077ad = Boolean.valueOf(false);

        /* renamed from: ap */
        private Boolean f106078ap = Boolean.valueOf(false);
        private Boolean arv = Boolean.valueOf(false);
        private Boolean arw = Boolean.valueOf(false);
        private Boolean asa = Boolean.valueOf(false);
        private Integer asd = Integer.valueOf(0);
        private Boolean asr = Boolean.valueOf(false);
        private Integer avp = Integer.valueOf(0);

        /* renamed from: sd */
        private Integer f106079sd = Integer.valueOf(0);

        /* renamed from: ss */
        private Boolean f106080ss = Boolean.valueOf(false);

        public final Integer getAa() {
            return this.f106076aa;
        }

        public final Boolean getAac() {
            return this.aac;
        }

        public final Integer getAad() {
            return this.aad;
        }

        public final Boolean getAas() {
            return this.aas;
        }

        public final Boolean getAd() {
            return this.f106077ad;
        }

        public final Boolean getAp() {
            return this.f106078ap;
        }

        public final Boolean getArv() {
            return this.arv;
        }

        public final Boolean getArw() {
            return this.arw;
        }

        public final Boolean getAsa() {
            return this.asa;
        }

        public final Integer getAsd() {
            return this.asd;
        }

        public final Boolean getAsr() {
            return this.asr;
        }

        public final Integer getAvp() {
            return this.avp;
        }

        public final Integer getSd() {
            return this.f106079sd;
        }

        public final Boolean getSs() {
            return this.f106080ss;
        }

        public final void setAa(Integer num) {
            this.f106076aa = num;
        }

        public final void setAac(Boolean bool) {
            this.aac = bool;
        }

        public final void setAad(Integer num) {
            this.aad = num;
        }

        public final void setAas(Boolean bool) {
            this.aas = bool;
        }

        public final void setAd(Boolean bool) {
            this.f106077ad = bool;
        }

        public final void setAp(Boolean bool) {
            this.f106078ap = bool;
        }

        public final void setArv(Boolean bool) {
            this.arv = bool;
        }

        public final void setArw(Boolean bool) {
            this.arw = bool;
        }

        public final void setAsa(Boolean bool) {
            this.asa = bool;
        }

        public final void setAsd(Integer num) {
            this.asd = num;
        }

        public final void setAsr(Boolean bool) {
            this.asr = bool;
        }

        public final void setAvp(Integer num) {
            this.avp = num;
        }

        public final void setSd(Integer num) {
            this.f106079sd = num;
        }

        public final void setSs(Boolean bool) {
            this.f106080ss = bool;
        }

        public final ServerExtra buildServerExtraJson(Aweme aweme) {
            Boolean bool;
            Integer num;
            Integer num2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Integer num3;
            Boolean bool6;
            Integer num4;
            C52711k.m112240b(aweme, "aweme");
            ServerExtra serverExtra = new ServerExtra();
            User author = aweme.getAuthor();
            Boolean bool7 = null;
            if (author != null) {
                bool = Boolean.valueOf(author.isSecret());
            } else {
                bool = null;
            }
            serverExtra.aas = bool;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                num = Integer.valueOf(author2.getDownloadSetting());
            } else {
                num = null;
            }
            serverExtra.aad = num;
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                num2 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                num2 = null;
            }
            serverExtra.avp = num2;
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null) {
                bool2 = Boolean.valueOf(awemeRiskModel.isWarn());
            } else {
                bool2 = null;
            }
            serverExtra.arw = bool2;
            AwemeRiskModel awemeRiskModel2 = aweme.getAwemeRiskModel();
            if (awemeRiskModel2 != null) {
                bool3 = Boolean.valueOf(awemeRiskModel2.isVote());
            } else {
                bool3 = null;
            }
            serverExtra.arv = bool3;
            serverExtra.f106076aa = Integer.valueOf(aweme.getAwemeType());
            AwemeControl awemeControl = aweme.getAwemeControl();
            if (awemeControl != null) {
                bool4 = Boolean.valueOf(awemeControl.canShare());
            } else {
                bool4 = null;
            }
            serverExtra.aac = bool4;
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                bool5 = Boolean.valueOf(status.isReviewed());
            } else {
                bool5 = null;
            }
            serverExtra.asr = bool5;
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf D = a.mo47893D();
            if (D != null) {
                num3 = (Integer) D.mo47782d();
            } else {
                num3 = null;
            }
            serverExtra.f106079sd = num3;
            serverExtra.f106078ap = Boolean.valueOf(aweme.isPreventDownload());
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null) {
                bool6 = Boolean.valueOf(status2.isAllowShare());
            } else {
                bool6 = null;
            }
            serverExtra.asa = bool6;
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null) {
                num4 = Integer.valueOf(status3.getDownloadStatus());
            } else {
                num4 = null;
            }
            serverExtra.asd = num4;
            VideoControl videoControl2 = aweme.getVideoControl();
            if (videoControl2 != null) {
                bool7 = videoControl2.allowDownload;
            }
            serverExtra.f106077ad = bool7;
            return serverExtra;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.AwemeACLStruct$a */
    static final class C41915a extends C52712l implements C52670a<ACLCommonStruct> {

        /* renamed from: a */
        public static final C41915a f106081a = new C41915a();

        C41915a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ACLCommonStruct();
        }
    }

    private AwemeACLStruct() {
    }

    /* renamed from: a */
    public static final ACLCommonStruct m91858a() {
        return (ACLCommonStruct) f106075c.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ACLCommonStruct = [");
        sb.append(m91858a());
        sb.append(']');
        return sb.toString();
    }
}
