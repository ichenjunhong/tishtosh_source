package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43994a;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45457u;
import com.p683ss.android.ugc.aweme.sticker.C46072o;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.tools.C47350y;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.es */
public final class C43795es {

    /* renamed from: a */
    private final FragmentActivity f110895a;

    /* renamed from: b */
    private final ShortVideoContext f110896b;

    /* renamed from: c */
    private final C45004a f110897c;

    /* renamed from: d */
    private final C49683a f110898d;

    /* renamed from: e */
    private final C50048n f110899e;

    /* renamed from: f */
    private final C42451a f110900f;

    public final void onEvent(C47350y yVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z;
        String str14;
        String str15;
        long j;
        if (this.f110896b.f107120m < this.f110896b.f107110c) {
            FaceStickerBean C = this.f110899e.mo97798C();
            if (C == FaceStickerBean.NONE || this.f110896b.mo86369j()) {
                C = null;
            }
            C31459g e = ((C43906h) this.f110898d.mo89445c()).mo89440e();
            if (C == null) {
                str = "";
            } else {
                str = C.getId();
            }
            if (e == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(e.f82324a);
                str2 = sb.toString();
            }
            FragmentActivity fragmentActivity = this.f110895a;
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a;
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
            C23088c a2 = C23088c.m56631a().mo47824a("creation_id", shortVideoContext.f107131x).mo47824a("shoot_way", shortVideoContext.f107132y).mo47824a("route", "1");
            String str16 = "is_photo";
            if (shortVideoContextViewModel.mo86389b()) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C23088c a3 = a2.mo47824a(str16, str3).mo47824a("position", "shoot_page");
            C52711k.m112236a((Object) a3, "EventJsonBuilder.newBuil…\"position\", \"shoot_page\")");
            JSONObject b = a3.mo47825b();
            C52711k.m112236a((Object) b, "builder.build()");
            String str17 = "prop_id";
            if (C != null) {
                try {
                    j = C.getStickerId();
                } catch (JSONException unused) {
                }
            } else {
                j = 0;
            }
            b.put(str17, j);
            boolean z2 = !C23777a.m58349b();
            C23089d a4 = C23089d.m56640a().mo47829a("creation_id", this.f110896b.f107131x).mo47829a("enter_from", "video_shoot_page").mo47829a("content_type", this.f110896b.mo86370k().getContentType()).mo47829a("content_source", this.f110896b.mo86370k().getContentSource()).mo47829a("shoot_way", this.f110896b.f107132y).mo47826a("draft_id", this.f110896b.f107022A);
            String str18 = "camera";
            if (this.f110897c.mo91315U() == 1) {
                str4 = "front";
            } else {
                str4 = "back";
            }
            C23089d a5 = a4.mo47829a(str18, str4).mo47829a("speed_mode", this.f110897c.mo91313S().toString()).mo47829a("filter_name", e.f82326c).mo47826a("filter_id", e.f82324a);
            String str19 = "record_mode";
            switch (this.f110896b.f107081ag) {
                case 0:
                    str5 = "click";
                    break;
                case 1:
                    str5 = "press";
                    break;
                case 8:
                    str5 = "video";
                    break;
                case 10:
                    str5 = "video_15";
                    break;
                case 11:
                    str5 = "video_60";
                    break;
                case 13:
                    str5 = "green_screen";
                    break;
                default:
                    str5 = "";
                    break;
            }
            C23089d a6 = a5.mo47829a(str19, str5);
            String str20 = "record_type";
            switch (yVar.f119502b) {
                case 1:
                    str6 = "click";
                    break;
                case 2:
                    str6 = "press";
                    break;
                case 3:
                    str6 = "countdown";
                    break;
                default:
                    str6 = "";
                    break;
            }
            C23089d a7 = a6.mo47829a(str20, str6);
            String str21 = "prop_id";
            if (C == null) {
                str7 = "";
            } else {
                str7 = String.valueOf(C.getStickerId());
            }
            C23089d a8 = a7.mo47829a(str21, str7);
            String str22 = "prop_index";
            if (C == null) {
                str8 = "";
            } else {
                str8 = C.getGradeKey();
            }
            C23089d a9 = a8.mo47829a(str22, str8);
            if (C == null) {
                str9 = "";
            } else {
                str9 = C.getPropSource();
            }
            String a10 = C46072o.m100125a(str9);
            if (!TextUtils.isEmpty(a10)) {
                a9.mo47829a("prop_selected_from", a10);
            }
            if (this.f110897c.mo91304J() != null) {
                ReactionWindowInfo reactionWindowInfo = this.f110897c.mo91304J().f112430c.getReactionWindowInfo();
                ReactionParams reactionParams = this.f110896b.f107035N;
                C52711k.m112240b(reactionWindowInfo, "info");
                reactionParams.addReactionWindowInfo(new CopiedReactionWindowInfo(reactionWindowInfo.getWidth(), reactionWindowInfo.getHeight(), reactionWindowInfo.getAngle(), reactionWindowInfo.getType()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(reactionWindowInfo.getAngle());
                C23089d a11 = a9.mo47826a("height", reactionWindowInfo.getHeight()).mo47826a("width", reactionWindowInfo.getWidth()).mo47829a("angle", sb2.toString());
                String str23 = "window_type";
                if (reactionWindowInfo.getType() == 1) {
                    str15 = "round";
                } else {
                    str15 = "square";
                }
                a11.mo47829a(str23, str15);
            }
            if (z2) {
                a9.mo47826a("smooth", this.f110900f.mo86584i()).mo47826a("shape", this.f110900f.mo86586l()).mo47826a("eyes", this.f110900f.mo86585k()).mo47826a("tanning", this.f110900f.mo86589o());
            } else {
                a9.mo47826a("smooth", (int) (C40797m.m90239a(this.f110900f.mo86584i()) * 100.0f)).mo47826a("eyes", (int) (C40797m.m90245b(this.f110900f.mo86586l()) * 100.0f));
            }
            if (C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust)) {
                C31459g e2 = ((C43906h) this.f110898d.mo89445c()).mo89440e();
                C31405ah a12 = this.f110898d.mo97568a();
                C44885g K = this.f110897c.mo91305K();
                K.getClass();
                float a13 = C31460h.m73279a(e2, a12, (C31406ai) new C43796et(K));
                a9.mo47828a("filter_value", (Object) Float.valueOf(a13));
                C31459g e3 = ((C43906h) this.f110898d.mo89445c()).mo89440e();
                if (((double) Math.abs(e3.f82334k - a13)) < 0.01d || e3.f82334k == -1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                String str24 = "is_original_filter";
                if (z) {
                    str14 = "1";
                } else {
                    str14 = "0";
                }
                a9.mo47829a(str24, str14);
            }
            a9.mo47829a("camera_type", C45457u.m99057a(this.f110897c.mo91307M().getCurrentCameraType()));
            a9.mo47826a("camera_level", C39618d.f101151O.mo83118b(C40796a.RecordCameraCompatLevel));
            String str25 = "countdown_type";
            if (yVar.f119501a == 0) {
                obj = "";
            } else {
                obj = Integer.valueOf(yVar.f119501a);
            }
            a9.mo47828a(str25, obj);
            if (this.f110896b.f107102ba != 0) {
                String str26 = "picture_source";
                if (this.f110896b.f107102ba == 1) {
                    str13 = "upload";
                } else {
                    str13 = "shoot";
                }
                a9.mo47829a(str26, str13);
            }
            if (this.f110896b.f107122o) {
                a9.mo47829a("action_type", "reshoot");
            }
            if (!TextUtils.isEmpty(C42423an.m93187b())) {
                a9.mo47829a("tutorial_item_id", C42423an.m93187b());
            }
            if (C43236a.m94873a(this.f110896b)) {
                a9.mo47829a("duet_at", this.f110896b.f107104bc);
                String str27 = "mic_status";
                if (this.f110896b.f107040S) {
                    str12 = "off";
                } else {
                    str12 = "on";
                }
                a9.mo47829a(str27, str12);
            }
            if (this.f110896b.mo86369j()) {
                a9.mo47826a("is_greenscreen", 1);
                if (this.f110896b.f107108bg != null) {
                    a9.mo47829a("background_type", this.f110896b.f107108bg.getBackgroundType());
                    a9.mo47829a("background_id", this.f110896b.f107108bg.getImageId());
                }
            }
            C26890h.m65011a("record_video", a9.f61491a);
            if (this.f110896b.f107102ba == 0) {
                this.f110896b.f107103bb.add("");
            } else {
                ArrayList<String> arrayList = this.f110896b.f107103bb;
                if (this.f110896b.f107102ba == 1) {
                    str11 = "upload";
                } else {
                    str11 = "shoot";
                }
                arrayList.add(str11);
            }
            C23778b.m58357d(this.f110900f.mo86562d().mo94112k());
            if (C39630m.m88234a().mo58610h().mo74177c(C11010c.m22280a())) {
                str10 = "on";
            } else {
                str10 = "off";
            }
            C26890h.m65011a("earphone_status", C23089d.m56640a().mo47829a("plugin_type", "record_video").mo47829a("to_status", str10).f61491a);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C23778b.m58353b());
            C26890h.m65011a("video_shoot_page_end", C23089d.m56640a().mo47829a("creation_id", this.f110896b.f107131x).mo47829a("shoot_way", this.f110896b.f107132y).mo47829a("prop_list", str).mo47829a("filter_id_list", str2).mo47826a("fps", this.f110897c.mo91307M().getFPS()).mo47829a("beautify_used", sb3.toString()).mo47829a("beautify_info", C23778b.m58351a()).f61491a);
            C43994a.m96556a(this.f110896b, this.f110897c.mo91307M().getMediaController(), this.f110899e.mo97798C(), this.f110898d, this.f110900f.mo86562d().mo94112k(), "start_record");
        }
    }

    public C43795es(FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext, C45004a aVar, C12361b bVar) {
        this.f110895a = fragmentActivity;
        this.f110896b = shortVideoContext;
        this.f110897c = aVar;
        this.f110898d = (C49683a) bVar.mo23372a(C49683a.class);
        this.f110899e = (C50048n) bVar.mo23372a(C50048n.class);
        this.f110900f = (C42451a) bVar.mo23372a(C42451a.class);
    }
}
