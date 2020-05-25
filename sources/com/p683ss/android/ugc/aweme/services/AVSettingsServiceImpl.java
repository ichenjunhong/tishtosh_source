package com.p683ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.p683ss.android.ugc.asve.C20341c;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.port.C39525a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.settings.IDmtAVSettingsService;
import com.p683ss.android.ugc.aweme.setting.C41560ay;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43879h;
import com.p683ss.android.ugc.aweme.shortvideo.p2218o.C44335a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.services.AVSettingsServiceImpl */
public class AVSettingsServiceImpl implements IDmtAVSettingsService {
    private static AVSettingsServiceImpl sInstance = new AVSettingsServiceImpl();

    private static C40796a backCameraProperty() {
        return C40796a.BackCameraFilter;
    }

    private int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static C40796a frontCameraProperty() {
        return C40796a.FrontCameraFilter;
    }

    public static AVSettingsServiceImpl getInstance() {
        return sInstance;
    }

    public String getEffectVersion() {
        return C20341c.f55833a;
    }

    public String getVESDKVersion() {
        return "6.7.0.110-mt";
    }

    public boolean needLoginBeforeRecord() {
        return false;
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.property.ag.a(com.ss.android.ugc.aweme.property.aa$a, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0d5f, code lost:
        r2.mo83092a(r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateABTestModel(com.google.gson.C18085o r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "data"
            r2 = r17
            com.google.gson.o r1 = r2.mo35025e(r1)
            if (r1 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r2 = "private_prompt"
            r3 = 0
            int r2 = r0.getAsInt(r1, r2, r3)
            r4 = 1
            if (r2 < 0) goto L_0x0019
            if (r2 <= r4) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            com.ss.android.ugc.aweme.property.h r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PrivatePrompt
            r5.mo83099a(r6, r2)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PhotoEditEnabled
            java.lang.String r6 = "create_image_aweme"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordBitrateCategoryIndex
            java.lang.String r6 = "video_bitrate_category_index"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordQualityCategoryIndex
            java.lang.String r6 = "video_quality_category_index"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VideoSizeIndex
            java.lang.String r6 = "video_size_index"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ImportVideoSizeIndex
            java.lang.String r6 = "upload_video_size_index"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.CompileVideoSizeIndex
            java.lang.String r6 = "compile_video_size_index"
            r7 = 99
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            java.lang.String r2 = "smooth_max"
            r5 = 80
            int r2 = r0.getAsInt(r1, r2, r5)
            r6 = 100
            int r2 = r0.clamp(r2, r3, r6)
            com.ss.android.ugc.aweme.property.h r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r8 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SmoothMax
            float r9 = (float) r2
            r10 = 1120403456(0x42c80000, float:100.0)
            float r11 = r9 / r10
            r7.mo83098a(r8, r11)
            java.lang.String r7 = "smooth_default"
            r8 = -1
            int r7 = r0.getAsInt(r1, r7, r8)
            if (r7 != r8) goto L_0x009e
            boolean r7 = r16.isInTikTokRegion()
            if (r7 != 0) goto L_0x009c
            r7 = 0
            goto L_0x009e
        L_0x009c:
            r7 = 48
        L_0x009e:
            com.ss.android.ugc.aweme.property.h r12 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r13 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SmoothDefault
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x00ac
            float r2 = (float) r7
            float r2 = r2 * r15
            float r2 = r2 / r9
            goto L_0x00ad
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            r12.mo83098a(r13, r2)
            java.lang.String r2 = "reshape_max"
            int r2 = r0.getAsInt(r1, r2, r6)
            int r2 = r0.clamp(r2, r3, r6)
            com.ss.android.ugc.aweme.property.h r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r9 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ReshapeMax
            float r2 = (float) r2
            float r2 = r2 / r10
            r7.mo83098a(r9, r2)
            java.lang.String r2 = "reshape_default"
            r7 = 60
            int r2 = r0.getAsInt(r1, r2, r7)
            int r2 = r0.clamp(r2, r3, r6)
            com.ss.android.ugc.aweme.property.h r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r12 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ReshapeDefault
            float r2 = (float) r2
            float r2 = r2 / r10
            r9.mo83098a(r12, r2)
            java.lang.String r2 = "contour_max"
            int r2 = r0.getAsInt(r1, r2, r5)
            int r2 = r0.clamp(r2, r3, r6)
            com.ss.android.ugc.aweme.property.h r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r12 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ContourMax
            float r13 = (float) r2
            float r11 = r13 / r10
            r9.mo83098a(r12, r11)
            java.lang.String r9 = "contour_default"
            int r9 = r0.getAsInt(r1, r9, r3)
            int r9 = r0.clamp(r9, r8, r6)
            if (r9 != r8) goto L_0x0102
            boolean r9 = r16.isInTikTokRegion()
            if (r9 != 0) goto L_0x0100
            r9 = 0
            goto L_0x0102
        L_0x0100:
            r9 = 48
        L_0x0102:
            com.ss.android.ugc.aweme.property.h r11 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r12 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ContourDefault
            if (r2 == 0) goto L_0x010d
            float r2 = (float) r9
            float r2 = r2 * r15
            float r2 = r2 / r13
            goto L_0x010e
        L_0x010d:
            r2 = 0
        L_0x010e:
            r11.mo83098a(r12, r2)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r9 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ColorFilterPanel
            java.lang.String r11 = "color_filter_panel"
            int r11 = r0.getAsInt(r1, r11, r4)
            r2.mo83099a(r9, r11)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r9 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PhotoMovieEnabled
            java.lang.String r11 = "enable_photomovie"
            int r11 = r0.getAsInt(r1, r11, r3)
            r2.mo83099a(r9, r11)
            java.lang.String r2 = "eyes_max"
            int r2 = r0.getAsInt(r1, r2, r7)
            int r2 = r0.clamp(r2, r3, r6)
            com.ss.android.ugc.aweme.property.h r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r9 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EyesMax
            float r11 = (float) r2
            float r12 = r11 / r10
            r7.mo83098a(r9, r12)
            java.lang.String r7 = "eyes_default"
            int r7 = r0.getAsInt(r1, r7, r8)
            int r7 = r0.clamp(r7, r8, r6)
            if (r7 != r8) goto L_0x0155
            boolean r7 = r16.isInTikTokRegion()
            if (r7 != 0) goto L_0x0153
            r7 = 0
            goto L_0x0155
        L_0x0153:
            r7 = 36
        L_0x0155:
            com.ss.android.ugc.aweme.property.h r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r12 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EyesDefault
            if (r2 == 0) goto L_0x0160
            float r2 = (float) r7
            float r2 = r2 * r15
            float r2 = r2 / r11
            goto L_0x0161
        L_0x0160:
            r2 = 0
        L_0x0161:
            r9.mo83098a(r12, r2)
            java.lang.String r2 = "shape_max"
            int r2 = r0.getAsInt(r1, r2, r5)
            int r2 = r0.clamp(r2, r3, r6)
            com.ss.android.ugc.aweme.property.h r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShapeMax
            float r9 = (float) r2
            float r10 = r9 / r10
            r5.mo83098a(r7, r10)
            java.lang.String r5 = "shape_default"
            int r5 = r0.getAsInt(r1, r5, r8)
            int r5 = r0.clamp(r5, r8, r6)
            if (r5 != r8) goto L_0x018e
            boolean r5 = r16.isInTikTokRegion()
            if (r5 != 0) goto L_0x018c
            r5 = 0
            goto L_0x018e
        L_0x018c:
            r5 = 48
        L_0x018e:
            com.ss.android.ugc.aweme.property.h r6 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShapeDefault
            if (r2 == 0) goto L_0x0199
            float r2 = (float) r5
            float r2 = r2 * r15
            float r14 = r2 / r9
        L_0x0199:
            r6.mo83098a(r7, r14)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.BeautificationIconStyle
            java.lang.String r6 = "beautification_icon_style"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordHardwareProfile
            java.lang.String r6 = "record_hardware_profile"
            int r6 = r0.getAsInt(r1, r6, r4)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.FetchEffectModelType
            java.lang.String r6 = "fetch_effect_model_zip_version"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PreFetchPopEffectModel
            java.lang.String r6 = "pre_fetch_effect_model"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseContourSlider
            java.lang.String r6 = "use_contour_slider"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSaveUploadVideo
            java.lang.String r6 = "upload_save_local"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableInstagramSilentShare
            java.lang.String r6 = "instagram_silent_share"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUploadFallback
            java.lang.String r6 = "enable_upload_fallback"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UploadOptimizeForPie
            java.lang.String r6 = "upload_optimize_for_pie"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.AddTextInMusically
            java.lang.String r6 = "show_button_title_in_record_page"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseEffectCam
            java.lang.String r6 = "use_effectcam_key"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecommentMusicByAIPolicy
            java.lang.String r6 = "music_ailab_new"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableExposureOptimize
            java.lang.String r6 = "enable_exposure_optmize"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordCameraTypeAB
            java.lang.String r6 = "camera_type_ab"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordCameraCompatLevelAB
            java.lang.String r6 = "record_camera_compat_level_ab"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UploadSpeedProbeSize
            java.lang.String r6 = "upload_speed_probe_size"
            r7 = 524288(0x80000, float:7.34684E-40)
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UploadSpeedProbeMinGap
            java.lang.String r6 = "upload_speed_probe_min_gap"
            r7 = 300000(0x493e0, float:4.2039E-40)
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UploadSpeedProbeTimeOut
            java.lang.String r6 = "upload_speed_probe_time_out"
            r7 = 20000(0x4e20, float:2.8026E-41)
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SyntheticVideoQuality
            java.lang.String r6 = "synthetic_video_quality"
            int r6 = r0.getAsInt(r1, r6, r8)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SyntheticVideoMaxRate
            java.lang.String r6 = "synthetic_video_maxrate"
            r9 = -1
            long r6 = r0.getAsLong(r1, r6, r9)
            r2.mo83100a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SyntheticVideoPreset
            java.lang.String r6 = "synthetic_video_preset"
            int r6 = r0.getAsInt(r1, r6, r8)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SyntheticVideoGop
            java.lang.String r6 = "synthetic_video_gop"
            int r6 = r0.getAsInt(r1, r6, r8)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SyntheticVideoBitrate
            java.lang.String r6 = "synthetic_video_bitrate"
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r0.getAsFloat(r1, r6, r7)
            r2.mo83098a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VideoBitrate
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VideoBitrate
            java.lang.String r6 = r6.key()
            float r6 = r0.getAsFloat(r1, r6, r7)
            r2.mo83098a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShareVideo2GifEditable
            java.lang.String r6 = "new_version_gif_share"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseVECompiler
            java.lang.String r6 = "use_ve_compiler"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RemoveStoryStrategy
            java.lang.String r6 = "remove_story_strategy"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSoftEncodeAcc
            java.lang.String r6 = "enable_soft_encode_acc"
            int r6 = r0.getAsInt(r1, r6, r3)
            if (r6 != r4) goto L_0x0318
            r6 = 1
            goto L_0x0319
        L_0x0318:
            r6 = 0
        L_0x0319:
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StickerDetailsEntranceEnable
            java.lang.String r6 = "sticker_details_entrance_enable"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableInfoSticker
            java.lang.String r6 = "enable_infosticker"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.NeedLoginInBeforeRecord
            java.lang.String r6 = "douyin_shoot_without_login"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r6 = r6 ^ r4
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickerCollection
            java.lang.String r6 = "show_sticker_collection"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableParallelSynthesizeUpload
            java.lang.String r6 = "enable_concurrent_synthesize_upload"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearCamera
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearCamera
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UsingMixRecordButton
            java.lang.String r6 = "use_mix_record_button"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.NeedRecode
            java.lang.String r6 = "need_recode"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VeEditorANRDestroy
            java.lang.String r6 = "veeditor_anr_destroy"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableFeedbackLog
            java.lang.String r6 = "enable_feedback_log"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.TTUploaderHttpDNSConfig
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ConcurrentUploadCancelOnAuthKey
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StoryPreviewUsingSurfaceView
            java.lang.String r6 = "is_surface_view_story_preview"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.CanShowPublishFriendGuide
            java.lang.String r6 = "post_friends_permission_prompts"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VideoSynthesisOpt
            java.lang.String r6 = "video_synthesis_opt"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VESynthesisSettings
            java.lang.String r6 = "ve_synthesis_settings"
            java.lang.String r6 = r0.getAsString(r1, r6)
            r2.mo83101a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VESynthesisSettingsByUploadSpeed
            java.lang.String r6 = "ve_synthesis_settings_by_upload_speed"
            java.lang.String r6 = r0.getAsString(r1, r6)
            r2.mo83101a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EffectExclusionPattern
            java.lang.String r6 = "android_effect_black_list_pattern"
            java.lang.String r6 = r0.getAsString(r1, r6)
            r2.mo83101a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewEffectExecutorType
            java.lang.String r6 = "effect_download_executor_type"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSearchGIF
            java.lang.String r6 = "enable_search_gif"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRecordTutorial
            java.lang.String r6 = "shoot_tutorial_switch"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.LongVideoDefaultUseLong
            java.lang.String r6 = "default_enable_long_video"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.LongDurationRecordAsTab
            java.lang.String r6 = "is_long_duration_record_as_tab"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableOpenGl3
            java.lang.String r6 = "use_open_gl_three"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectParallelFwk
            java.lang.String r6 = "enable_effect_parallel_fwk"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableQIEffectParallelFwk
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableQIEffectParallelFwk
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.CameraOptionFlagsOpt
            java.lang.String r6 = "camera_option_flags_opt"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VEExtractFramesAfterRender
            java.lang.String r6 = "ve_extract_frames_after_render"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewPublishShareDescription
            java.lang.String r6 = "is_publish_share_description"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.DefaultPublishPrivacyType
            java.lang.String r6 = "default_publish_privacy_type"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSlimVECutProcessor
            java.lang.String r6 = "enable_slim_ve_cut_processor"
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MvThemeRecordMode
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MvThemeRecordMode
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenCameraFrameOptimizeSDK
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenCameraFrameOptimizeSDK
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenRecordToEditFrameOptimize
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenRecordToEditFrameOptimize
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenRecordToViewOptimize
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenTakenInSameOptimize
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenAbLoadSo
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenCameraFrameOptimizePreLoadSo
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenCameraFrameOptimizePreLoadSo
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EditorSceneLazyInit
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EditorSceneLazyInit
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableASVESandBox
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableASVESandBox
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableTextStickerInMain
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableTextStickerInMain
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVideoEditActivityUploadSpeedProbe
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVideoEditActivityUploadSpeedProbe
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMVThemePreUpload
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMVThemePreUpload
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PublishOnNewIntentCheckDelay
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableNewEffectEngineForBuiltInEffect
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.TTUploaderResponseTimeOut
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSingleSegmentConcatUseCopy
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.CompileProbeConfig
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VECameraPreviewSize
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordMinDiskAmountMB
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UploadStatusReportGapS
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableOnlyReportKeyUploadLog
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMultiPublisherScheduler
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.TTNetExternNetInfo
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.WatermarkResSetting
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UploadExtraParams
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePublishDetailALog
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableOptimizePublishContainerActivityNotInStack
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVECompileCrfReencode
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableProcessPublishFix
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePreSynthetic
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAutoProcessAfterLogin
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRetryParallelSynthesizeUpload
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.TTUploaderTTNetProxyType
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePublisherOpt
            r0.setAB(r1, r2)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectNewEngine
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectNewEngine
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectNewEngineEdit
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectNewEngineEdit
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVEFastImport
            java.lang.String r6 = "enable_ve_fast_import"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.FastImportFpsLimit
            java.lang.String r6 = "fast_import_fps_limit"
            r7 = 40
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.FastImportResolutionLimit
            java.lang.String r6 = "fast_import_resolution_limit"
            java.lang.String r6 = r0.getAsString(r1, r6)
            r2.mo83101a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEnhanceVolume
            java.lang.String r6 = "use_enhance_volume"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVoiceConversion
            java.lang.String r6 = "studio_enable_editpage_voicechanger"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRecordConversion
            java.lang.String r6 = "studio_enable_video_edit_dub"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEffectNewTabUi
            java.lang.String r6 = "studio_effect_new_tab_ui"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EditPageMusicPanelOptimization
            java.lang.String r6 = "edit_page_music_panel_optimization"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableTT265Decoder
            java.lang.String r6 = "enable_tt_265_decoder"
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.DuetFixNewPlan
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.DuetFixNewPlan
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UlikeBeautyAbGroup
            java.lang.String r6 = "studio_recorder_beautify_effects_group"
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RememberLastRecordDuration
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RememberLastRecordDuration
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVECacheGLContext
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVECacheGLContext
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.FastImportGopLimit
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SyntheticVideoGop
            java.lang.String r6 = r6.key()
            r7 = 3000(0xbb8, float:4.204E-42)
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EditPagePrompt
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EditPagePrompt
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEditPageMemoryOpt
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEditPageMemoryOpt
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStoryCameraOpt
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStoryCameraOpt
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEditPageMVMemoryOpt
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEditPageMVMemoryOpt
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePublishThreadOpt
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePublishThreadOpt
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMBlackPanel
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMBlackPanel
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenSDKQAdaption
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenSDKQAdaption
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SDKQAdaptionConfig
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.SDKQAdaptionConfig
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyEffectComposer
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyEffectComposer
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ComposerPanelHasTitle
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ComposerPanelHasTitle
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioMBeautyPanel
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioMBeautyPanel
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyEffectComposerGroup
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyEffectComposerGroup
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectDiskCache
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectDiskCache
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAsyncInitVesdk
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAsyncInitVesdk
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRushLooper
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRushLooper
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.LightEnhanceBlackList
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.LightEnhanceBlackList
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMainPlusSpecialEntrance
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMainPlusSpecialEntrance
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShowAutoImproveButtonInEditPage
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShowAutoImproveButtonInEditPage
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUploadMetadata
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUploadMetadata
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMusicStickPoint
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMusicStickPoint
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSmartMusicStickPoint
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSmartMusicStickPoint
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSmartStickPointFeedback
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSmartStickPointFeedback
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShowMusicStickPointBubble
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ShowMusicStickPointBubble
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StickPointMusicCutLength
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StickPointMusicCutLength
            java.lang.String r6 = r6.key()
            r7 = 20
            int r6 = r0.getAsInt(r1, r6, r7)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StickPointDefaltMode
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StickPointDefaltMode
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r4)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VEUseNewEffectAlgorithmApi
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VEUseNewEffectAlgorithmApi
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickerFunctionalities
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickerFunctionalities
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearMusicAutoLoop
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearMusicAutoLoop
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.IsForcedToDefaultFullScreenPlan
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.IsForcedToDefaultFullScreenPlan
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VEEditorCompileForDuetReact
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VEEditorCompileForDuetReact
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUploadVideoSlideAutoJust
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUploadVideoSlideAutoJust
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordOutputCategory
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordOutputCategory
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r4)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableThreeBuffer
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableThreeBuffer
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewMvStruct
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewMvStruct
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVEUploadApplog
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVEUploadApplog
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVideoImageMixed
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVideoImageMixed
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePublishPrivacySetting
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePublishPrivacySetting
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableImportAvSync
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableImportAvSync
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableOpenGLResourceReuse
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableOpenGLResourceReuse
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSubtitleRecognition
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSubtitleRecognition
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSubtitleRecognitionAI
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSubtitleRecognitionAI
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSearchEffect
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSearchEffect
            java.lang.String r6 = r6.key()
            com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSearchEffect
            java.lang.Object r7 = r7.defValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r6 = r0.getAsBoolean(r1, r6, r7)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSdkInputCrossPlatForm
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSdkInputCrossPlatForm
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MVPBeautyNewIcon
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MVPBeautyNewIcon
            java.lang.String r6 = r6.key()
            com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MVPBeautyNewIcon
            java.lang.Object r7 = r7.defValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r6 = r0.getAsBoolean(r1, r6, r7)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMultiFastImport
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMultiFastImport
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableFilterIntensityJust
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableFilterIntensityJust
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioStickerPinEnable
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioStickerPinEnable
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRecordStatusMode
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRecordStatusMode
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStatusBgRandomOrder
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStatusBgRandomOrder
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRecordStatusRandomAll
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableRecordStatusRandomAll
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RenderUseVideoSizeIndex
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RenderUseVideoSizeIndex
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMultiVideoEdit
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMultiVideoEdit
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePostponeRecordTask
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePostponeRecordTask
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUseNewEffectIconUI
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUseNewEffectIconUI
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.DisableUploadALog
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.DisableUploadALog
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVboostOpt
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableVboostOpt
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableGLBase
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableGLBase
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSATCamera
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSATCamera
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectAsyncAPI
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectAsyncAPI
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEnableRecorderTutorial
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEnableRecorderTutorial
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PlatformOptimizeStrategy
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PlatformOptimizeStrategy
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OptimizeEffectRenderFirstFrame
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OptimizeEffectRenderFirstFrame
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableCategorizedInfoStickers
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableCategorizedInfoStickers
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VboostCompile
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VboostCompile
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PublishProgressOptimize
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.PublishProgressOptimize
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAllTabWhenUpload
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAllTabWhenUpload
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickPointWhenSelectMultiPhotos
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickPointWhenSelectMultiPhotos
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EffectSDKInfoStickerUseAmazing
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EffectSDKInfoStickerUseAmazing
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableLivePublishBackToCut
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableLivePublishBackToCut
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r4)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MonitorPublishFailed
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MonitorPublishFailed
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEditFpsLimited
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEditFpsLimited
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r8)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickPointCutFavoriteMusicTab
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickPointCutFavoriteMusicTab
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickTopMusicAfterClickMusicSyncAnchor
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableStickTopMusicAfterClickMusicSyncAnchor
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyButtonTitleStrategy
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioBeautyButtonTitleStrategy
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioDuetChangeLayout
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioDuetChangeLayout
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEnableStitch
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEnableStitch
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordLayoutColorScheme
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordLayoutColorScheme
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEchoCancellation
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEchoCancellation
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAlbumTimelineAndFullScreenPreview
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAlbumTimelineAndFullScreenPreview
            java.lang.String r6 = r6.key()
            int r6 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VideoStickerPassThroughLive
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VideoStickerPassThroughLive
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ChangeRecordBottomTabOrder
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ChangeRecordBottomTabOrder
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableDonationSticker
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableDonationSticker
            java.lang.String r6 = r6.key()
            boolean r6 = r0.getAsBoolean(r1, r6, r3)
            r2.mo83102a(r5, r6)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MvPlan
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MvPlan
            java.lang.String r6 = r6.key()
            int r3 = r0.getAsInt(r1, r6, r3)
            r2.mo83099a(r5, r3)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r3 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OpenAbLoadSo
            boolean r2 = r2.mo83103a(r3)
            if (r2 == 0) goto L_0x0c53
            com.p683ss.android.vesdk.C50712l.f127268a = r4
        L_0x0c53:
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.ag r2 = r2.f103907a
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            com.ss.android.vesdk.l r3 = com.p683ss.android.vesdk.C50712l.m109659a()
            java.lang.String r5 = "VEConfigCenter.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.util.Map r3 = r3.mo99231b()
            java.lang.String r5 = "VEConfigCenter.getInstance().configs"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0c76:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0d72
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            if (r6 == 0) goto L_0x0c76
            java.lang.Object r6 = r5.getKey()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0c76
            java.lang.Object r6 = r5.getKey()
            java.lang.String r7 = "it.key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r7 = "it.value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            com.ss.android.vesdk.l$c r5 = (com.p683ss.android.vesdk.C50712l.C50716c) r5
            com.ss.android.ugc.aweme.property.aa$a r5 = com.p683ss.android.ugc.aweme.property.C40769ag.m90191a(r6, r5)
            com.ss.android.ugc.aweme.property.aa$b r6 = r5.type()
            if (r6 == 0) goto L_0x0d6c
            int[] r7 = com.p683ss.android.ugc.aweme.property.C40772ah.f103876d
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x0d42;
                case 2: goto L_0x0d1c;
                case 3: goto L_0x0cf6;
                case 4: goto L_0x0cd0;
                case 5: goto L_0x0cc1;
                default: goto L_0x0cbf;
            }
        L_0x0cbf:
            goto L_0x0d6c
        L_0x0cc1:
            java.lang.String r6 = r5.key()
            java.lang.String r7 = "property.key()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r6 = com.p683ss.android.ugc.aweme.property.C40769ag.m90192a(r1, r6)
            goto L_0x0d5f
        L_0x0cd0:
            java.lang.String r6 = r5.key()
            java.lang.String r7 = "property.key()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object r7 = r5.defValue()
            if (r7 == 0) goto L_0x0cee
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            float r6 = com.p683ss.android.ugc.aweme.property.C40769ag.m90188a(r1, r6, r7)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L_0x0d5f
        L_0x0cee:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Float"
            r1.<init>(r2)
            throw r1
        L_0x0cf6:
            java.lang.String r6 = r5.key()
            java.lang.String r7 = "property.key()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object r7 = r5.defValue()
            if (r7 == 0) goto L_0x0d14
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r6 = com.p683ss.android.ugc.aweme.property.C40769ag.m90190a(r1, r6, r7)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x0d5f
        L_0x0d14:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Long"
            r1.<init>(r2)
            throw r1
        L_0x0d1c:
            java.lang.String r6 = r5.key()
            java.lang.String r7 = "property.key()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object r7 = r5.defValue()
            if (r7 == 0) goto L_0x0d3a
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r6 = com.p683ss.android.ugc.aweme.property.C40769ag.m90189a(r1, r6, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0d5f
        L_0x0d3a:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r1.<init>(r2)
            throw r1
        L_0x0d42:
            java.lang.String r6 = r5.key()
            java.lang.String r7 = "property.key()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.Object r7 = r5.defValue()
            if (r7 == 0) goto L_0x0d64
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r6 = com.p683ss.android.ugc.aweme.property.C40769ag.m90193a(r1, r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        L_0x0d5f:
            r2.mo83092a(r5, r6)
            goto L_0x0c76
        L_0x0d64:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            r1.<init>(r2)
            throw r1
        L_0x0d6c:
            d.l r1 = new d.l
            r1.<init>()
            throw r1
        L_0x0d72:
            com.ss.android.ugc.aweme.shortvideo.o.a r1 = com.p683ss.android.ugc.aweme.shortvideo.p2218o.C44335a.f112206c
            com.p683ss.android.ugc.aweme.shortvideo.p2218o.C44335a.f112205b = r4
            r1.mo90204a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.AVSettingsServiceImpl.updateABTestModel(com.google.gson.o):void");
    }

    public C39525a<Boolean> bubbleGuideShown() {
        return new C39525a<Boolean>() {
            public Boolean get() {
                return Boolean.valueOf(C39618d.f101151O.mo83117a(C40796a.BubbleGuideShown));
            }

            public void set(Boolean bool) {
                C39618d.f101151O.mo83116a(C40796a.BubbleGuideShown, bool.booleanValue());
            }
        };
    }

    public boolean enableSaveUploadVideo() {
        return C40797m.m90260o();
    }

    public boolean isLongVideoPermitted() {
        return C43879h.m96386a();
    }

    public boolean duetSupportChangeLayout() {
        return C39618d.f101152P.mo83103a(C40790a.StudioDuetChangeLayout);
    }

    public boolean enableDuetReactVEEditor() {
        return C39618d.f101152P.mo83103a(C40790a.VEEditorCompileForDuetReact);
    }

    public boolean enableFeedbackLog() {
        return C39618d.f101152P.mo83103a(C40790a.EnableFeedbackLog);
    }

    public boolean enableInstagramSilentShare() {
        return C39618d.f101152P.mo83103a(C40790a.EnableInstagramSilentShare);
    }

    public int enableMainPlusSpecialEntrance() {
        return C39618d.f101152P.mo83104b(C40790a.EnableMainPlusSpecialEntrance);
    }

    public boolean enablePhotoMovie() {
        if (C39618d.f101152P.mo83104b(C40790a.PhotoMovieEnabled) != 0) {
            return true;
        }
        return false;
    }

    public boolean enableStatusMode() {
        if (!TextUtils.isEmpty(getStatusTabKey())) {
            return true;
        }
        return false;
    }

    public boolean enableStickTopMusicAfterClickMusicSyncAnchor() {
        return C39618d.f101152P.mo83103a(C40790a.EnableStickTopMusicAfterClickMusicSyncAnchor);
    }

    public boolean enableStickerDetailsEntrance() {
        return C39618d.f101152P.mo83103a(C40790a.StickerDetailsEntranceEnable);
    }

    public boolean enableStitch() {
        return C39618d.f101152P.mo83103a(C40790a.StudioEnableStitch);
    }

    public boolean enableUploadFallback() {
        return C39618d.f101152P.mo83103a(C40790a.EnableUploadFallback);
    }

    public boolean enableUploadSyncIns() {
        return C39618d.f101151O.mo83117a(C40796a.EnableUploadSyncIns);
    }

    public boolean enableUploadSyncInsStory() {
        return C39618d.f101151O.mo83117a(C40796a.EnableUploadSyncInsStory);
    }

    public boolean enableUploadSyncTwitter() {
        return C39618d.f101151O.mo83117a(C40796a.EnableUploadSyncTwitter);
    }

    public int getMvPlan() {
        return C39618d.f101152P.mo83104b(C40790a.MvPlan);
    }

    public boolean getPublishProgressOptimize() {
        return C39618d.f101152P.mo83103a(C40790a.PublishProgressOptimize);
    }

    public String getStatusTabKey() {
        return C39618d.f101151O.mo83121e(C40796a.StatusTabKey);
    }

    public boolean isEnableGetThumbsWithEffect() {
        return C39618d.f101151O.mo83117a(C40796a.EnableVeCoverEffect);
    }

    public boolean isEnableUseVEGetThumbs() {
        return C39618d.f101151O.mo83117a(C40796a.EnableUseVeCover);
    }

    public boolean isEnableVideoEditActivityUploadSpeedProbe() {
        return C39618d.f101152P.mo83103a(C40790a.EnableVideoEditActivityUploadSpeedProbe);
    }

    public boolean isPhotoEditEnabled() {
        return C39618d.f101152P.mo83103a(C40790a.PhotoEditEnabled);
    }

    public long progressBarThreshold() {
        return C39618d.f101151O.mo83119c(C40796a.ProgressBarThreshold);
    }

    public int recommentMusicByAIPolicy() {
        return C39618d.f101152P.mo83104b(C40790a.RecommentMusicByAIPolicy);
    }

    public boolean shareVideo2GifEditable() {
        return C39618d.f101152P.mo83103a(C40790a.ShareVideo2GifEditable);
    }

    public boolean showMvThemeRecordMode() {
        return C39618d.f101152P.mo83103a(C40790a.MvThemeRecordMode);
    }

    public boolean uploadOptimizeForPie() {
        return C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie);
    }

    private boolean isInTikTokRegion() {
        C39566ar B = C39630m.m88234a().mo58598B();
        if (B == null || !B.mo74222c().booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean enablePreUploadByUser() {
        boolean a = C39618d.f101151O.mo83117a(C40796a.EnablePreUploadByUser);
        StringBuilder sb = new StringBuilder("Get EnablePreUploadByUser:");
        sb.append(a);
        C45407ay.m98968a(sb.toString());
        return a;
    }

    public boolean enableReact() {
        if (!C39618d.f101151O.mo83117a(C40796a.CanReact) || duetSupportChangeLayout()) {
            return false;
        }
        return true;
    }

    public boolean isXsSupport() {
        if (C39618d.f101181v == null || C39618d.f101181v.mo80652a() == null || !C39618d.f101181v.mo80652a().mo80728a()) {
            return false;
        }
        return true;
    }

    public boolean showStickerCollection() {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.StickerDetailsEntranceEnable) || !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerCollection)) {
            return false;
        }
        return true;
    }

    public void updateUserSettings(C18085o oVar) {
        configUserPreUploadSetting(oVar);
    }

    private void asynMonitorAwemeSetting(IESSettingsProxy iESSettingsProxy) {
        C0013i.m16a((Callable<TResult>) new AVSettingsServiceImpl$$Lambda$0<TResult>(iESSettingsProxy));
    }

    public void setEnablePreUploadByUser(boolean z) {
        StringBuilder sb = new StringBuilder("Set EnablePreUploadByUser:");
        sb.append(z);
        C45407ay.m98968a(sb.toString());
        C39618d.f101151O.mo83116a(C40796a.EnablePreUploadByUser, z);
    }

    private void configUserPreUploadSetting(C18085o oVar) {
        int asInt = getAsInt(oVar, "enable_pre_upload", -1);
        StringBuilder sb = new StringBuilder("EnablePreUploadByUser userPreUploadSetting:");
        sb.append(asInt);
        C45407ay.m98968a(sb.toString());
        boolean z = false;
        if (asInt != -1) {
            if (asInt == 1) {
                z = true;
            }
            setEnablePreUploadByUser(z);
            return;
        }
        if (!enablePreUploadByUser()) {
            C0013i.m16a((Callable<TResult>) new C41560ay<TResult>("enable_pre_upload", 0));
        }
    }

    static final /* synthetic */ Void lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl(IESSettingsProxy iESSettingsProxy) throws Exception {
        try {
            C44335a.f112206c.mo90205a("filter", iESSettingsProxy.getBeautyModel().intValue());
            C44335a.f112206c.mo90205a("hard_code_shot", iESSettingsProxy.getUseHardcode().intValue());
            C44335a.f112206c.mo90205a("hard_code_release", iESSettingsProxy.getUseSyntheticHardcode().intValue());
            C44335a.f112206c.mo90205a("hard_code_water_marker", iESSettingsProxy.getUseWatermarkHardcode().booleanValue() ? 1 : 0);
        } catch (Exception unused) {
        }
        return null;
    }

    public void setLongVideoPermitted(boolean z) {
        long j;
        C39629l.m88232a().mo58574e().mo83116a(C40796a.LongVideoPermitted, z);
        C40795l e = C39629l.m88232a().mo58574e();
        C40796a aVar = C40796a.LongVideoThreshold;
        if (z) {
            j = 60000;
        } else {
            j = 0;
        }
        e.mo83114a(aVar, j);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(152:0|1|2|3|4|5|6|7|(1:9)|(3:10|11|(1:13))|14|16|17|(1:19)|20|21|22|23|24|25|26|27|(2:28|29)|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|(2:56|57)|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|(2:158|159)|160|(1:163)(1:164)|165|(1:167)|168|(2:169|170)|171|(3:173|174|175)|(1:178)|179|180) */
    /* JADX WARNING: Can't wrap try/catch for region: R(154:0|1|2|3|4|5|6|7|(1:9)|(3:10|11|(1:13))|14|16|17|(1:19)|20|21|22|23|24|25|26|27|(2:28|29)|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|(2:56|57)|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|(2:158|159)|160|(1:163)(1:164)|165|(1:167)|168|(2:169|170)|171|173|174|175|(1:178)|179|180) */
    /* JADX WARNING: Can't wrap try/catch for region: R(155:0|1|2|3|4|5|6|7|(1:9)|(3:10|11|(1:13))|14|16|17|(1:19)|20|21|22|23|24|25|26|27|(2:28|29)|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|(2:56|57)|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|(2:158|159)|160|(1:163)(1:164)|165|(1:167)|168|169|170|171|173|174|175|(1:178)|179|180) */
    /* JADX WARNING: Can't wrap try/catch for region: R(156:0|1|2|3|4|5|6|7|(1:9)|(3:10|11|(1:13))|14|16|17|(1:19)|20|21|22|23|24|25|26|27|(2:28|29)|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|(2:56|57)|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(1:163)(1:164)|165|(1:167)|168|169|170|171|173|174|175|(1:178)|179|180) */
    /* JADX WARNING: Can't wrap try/catch for region: R(159:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|16|17|(1:19)|20|21|22|23|24|25|26|27|(2:28|29)|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|56|57|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(1:163)(1:164)|165|(1:167)|168|169|170|171|173|174|175|(1:178)|179|180) */
    /* JADX WARNING: Can't wrap try/catch for region: R(160:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|16|17|(1:19)|20|21|22|23|24|25|26|27|28|29|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|56|57|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(1:163)(1:164)|165|(1:167)|168|169|170|171|173|174|175|(1:178)|179|180) */
    /* JADX WARNING: Can't wrap try/catch for region: R(161:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|16|17|(1:19)|20|21|22|23|24|25|26|27|28|29|30|32|33|(1:35)(1:36)|37|38|39|(1:41)(1:42)|43|44|45|46|48|49|50|51|52|53|54|55|56|57|58|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|(1:163)(1:164)|165|(1:167)|168|169|170|171|173|174|175|(1:178)|179|180) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x02d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x02f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0303 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x0312 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x0321 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0330 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x033f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x034e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x035d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x036c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x037b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x038a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x0399 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x03a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x03b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x03c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x03d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x03e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x03eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x03fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x0405 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x0410 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x041b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x042a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0439 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0448 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0453 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0115 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x012a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0139 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0148 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x01c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x01d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x01e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x01f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0200 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x020f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x021e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x022d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x023c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x024b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x025a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0269 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0278 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0287 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0296 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x02a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x02b4 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e3 A[Catch:{ a -> 0x02f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050 A[Catch:{ a -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a A[Catch:{ a -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5 A[Catch:{ a -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[Catch:{ a -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9 A[Catch:{ a -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb A[Catch:{ a -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037 A[Catch:{ a -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateServerSettings(com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x000f }
            com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.HttpTimeout     // Catch:{ a -> 0x000f }
            java.lang.Long r2 = r8.getHttpTimeout()     // Catch:{ a -> 0x000f }
            long r2 = r2.longValue()     // Catch:{ a -> 0x000f }
            r0.mo83114a(r1, r2)     // Catch:{ a -> 0x000f }
        L_0x000f:
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x001e }
            com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.HttpRetryInterval     // Catch:{ a -> 0x001e }
            java.lang.Long r2 = r8.getHttpRetryInterval()     // Catch:{ a -> 0x001e }
            long r2 = r2.longValue()     // Catch:{ a -> 0x001e }
            r0.mo83114a(r1, r2)     // Catch:{ a -> 0x001e }
        L_0x001e:
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x002d }
            com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VideoBitrate     // Catch:{ a -> 0x002d }
            java.lang.Float r2 = r8.getVideoBitrate()     // Catch:{ a -> 0x002d }
            float r2 = r2.floatValue()     // Catch:{ a -> 0x002d }
            r0.mo83112a(r1, r2)     // Catch:{ a -> 0x002d }
        L_0x002d:
            java.lang.Integer r0 = r8.getVideoCompose()     // Catch:{ a -> 0x0046 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x0046 }
            if (r0 <= 0) goto L_0x0046
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0046 }
            com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VideoCompose     // Catch:{ a -> 0x0046 }
            java.lang.Integer r2 = r8.getVideoCompose()     // Catch:{ a -> 0x0046 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x0046 }
            r0.mo83113a(r1, r2)     // Catch:{ a -> 0x0046 }
        L_0x0046:
            java.lang.Integer r0 = r8.getVideoCommit()     // Catch:{ a -> 0x005f }
            int r0 = r0.intValue()     // Catch:{ a -> 0x005f }
            if (r0 <= 0) goto L_0x005f
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x005f }
            com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VideoCommit     // Catch:{ a -> 0x005f }
            java.lang.Integer r2 = r8.getVideoCommit()     // Catch:{ a -> 0x005f }
            int r2 = r2.intValue()     // Catch:{ a -> 0x005f }
            r0.mo83113a(r1, r2)     // Catch:{ a -> 0x005f }
        L_0x005f:
            r0 = 1
            java.lang.Boolean r1 = r8.getLongVideoPermitted()     // Catch:{ a -> 0x007b }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x007b }
            if (r1 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()     // Catch:{ a -> 0x007b }
            com.ss.android.ugc.aweme.property.l r1 = r1.mo58574e()     // Catch:{ a -> 0x007b }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.LongVideoPermitted     // Catch:{ a -> 0x007b }
            boolean r1 = r1.mo83117a(r2)     // Catch:{ a -> 0x007b }
            r1 = r1 ^ r0
            com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43879h.f111136a = r1     // Catch:{ a -> 0x007b }
        L_0x007b:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x008a }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SyntheticVideoBitrate     // Catch:{ a -> 0x008a }
            java.lang.Float r3 = r8.getSyntheticVideoBitrate()     // Catch:{ a -> 0x008a }
            float r3 = r3.floatValue()     // Catch:{ a -> 0x008a }
            r1.mo83112a(r2, r3)     // Catch:{ a -> 0x008a }
        L_0x008a:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0099 }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.PrivateAvailable     // Catch:{ a -> 0x0099 }
            java.lang.Boolean r3 = r8.getPrivateAvailable()     // Catch:{ a -> 0x0099 }
            boolean r3 = r3.booleanValue()     // Catch:{ a -> 0x0099 }
            r1.mo83116a(r2, r3)     // Catch:{ a -> 0x0099 }
        L_0x0099:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x00a8 }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.LongVideoPermitted     // Catch:{ a -> 0x00a8 }
            java.lang.Boolean r3 = r8.getLongVideoPermitted()     // Catch:{ a -> 0x00a8 }
            boolean r3 = r3.booleanValue()     // Catch:{ a -> 0x00a8 }
            r1.mo83116a(r2, r3)     // Catch:{ a -> 0x00a8 }
        L_0x00a8:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x00b7 }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.LongVideoThreshold     // Catch:{ a -> 0x00b7 }
            java.lang.Long r3 = r8.getLongVideoThreshold()     // Catch:{ a -> 0x00b7 }
            long r3 = r3.longValue()     // Catch:{ a -> 0x00b7 }
            r1.mo83114a(r2, r3)     // Catch:{ a -> 0x00b7 }
        L_0x00b7:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x00c6 }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ProgressBarThreshold     // Catch:{ a -> 0x00c6 }
            java.lang.Long r3 = r8.getProgressbarThreshold()     // Catch:{ a -> 0x00c6 }
            long r3 = r3.longValue()     // Catch:{ a -> 0x00c6 }
            r1.mo83114a(r2, r3)     // Catch:{ a -> 0x00c6 }
        L_0x00c6:
            r1 = 0
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x00db }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.HardCode     // Catch:{ a -> 0x00db }
            java.lang.Integer r4 = r8.getUseHardcode()     // Catch:{ a -> 0x00db }
            int r4 = r4.intValue()     // Catch:{ a -> 0x00db }
            if (r4 != r0) goto L_0x00d7
            r4 = 1
            goto L_0x00d8
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x00db }
        L_0x00db:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x00ef }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SyntheticHardCode     // Catch:{ a -> 0x00ef }
            java.lang.Integer r4 = r8.getUseSyntheticHardcode()     // Catch:{ a -> 0x00ef }
            int r4 = r4.intValue()     // Catch:{ a -> 0x00ef }
            if (r4 != r0) goto L_0x00eb
            r4 = 1
            goto L_0x00ec
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x00ef }
        L_0x00ef:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x00fe }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.BeautyModel     // Catch:{ a -> 0x00fe }
            java.lang.Integer r4 = r8.getBeautyModel()     // Catch:{ a -> 0x00fe }
            int r4 = r4.intValue()     // Catch:{ a -> 0x00fe }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x00fe }
        L_0x00fe:
            r2 = 51
            com.ss.android.ugc.aweme.property.l r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0115 }
            com.ss.android.ugc.aweme.property.l$a r4 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordVideoQuality     // Catch:{ a -> 0x0115 }
            java.lang.Integer r5 = r8.getVideoQuality()     // Catch:{ a -> 0x0115 }
            int r5 = r5.intValue()     // Catch:{ a -> 0x0115 }
            r6 = 18
            int r5 = com.p683ss.android.ugc.aweme.property.C40797m.m90240a(r5, r0, r2, r6)     // Catch:{ a -> 0x0115 }
            r3.mo83113a(r4, r5)     // Catch:{ a -> 0x0115 }
        L_0x0115:
            com.ss.android.ugc.aweme.property.l r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x012a }
            com.ss.android.ugc.aweme.property.l$a r4 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SyntheticVideoQuality     // Catch:{ a -> 0x012a }
            java.lang.Integer r5 = r8.getSyntheticVideoQuality()     // Catch:{ a -> 0x012a }
            int r5 = r5.intValue()     // Catch:{ a -> 0x012a }
            r6 = 15
            int r2 = com.p683ss.android.ugc.aweme.property.C40797m.m90240a(r5, r0, r2, r6)     // Catch:{ a -> 0x012a }
            r3.mo83113a(r4, r2)     // Catch:{ a -> 0x012a }
        L_0x012a:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0139 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.FaceDetectInterval     // Catch:{ a -> 0x0139 }
            java.lang.Integer r4 = r8.getFaceDetectInterval()     // Catch:{ a -> 0x0139 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x0139 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x0139 }
        L_0x0139:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0148 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableAutoRetryRecord     // Catch:{ a -> 0x0148 }
            java.lang.Boolean r4 = r8.getEnableAutoRetryRecord()     // Catch:{ a -> 0x0148 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0148 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0148 }
        L_0x0148:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0153 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VideoSize     // Catch:{ a -> 0x0153 }
            java.lang.String r4 = r8.getVideoSize()     // Catch:{ a -> 0x0153 }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x0153 }
        L_0x0153:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordBitrateCategory
            com.google.gson.f r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            java.util.List r5 = r8.getVideoBitrateCategory()
            java.lang.String r4 = r4.mo34889b(r5)
            r2.mo83115a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordQualityCategory
            com.google.gson.f r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            java.util.List r5 = r8.getVideoQualityCategory()
            java.lang.String r4 = r4.mo34889b(r5)
            r2.mo83115a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VideoSizeCategory
            com.google.gson.f r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            java.util.List r5 = r8.getVideoSizeCategory()
            java.lang.String r4 = r4.mo34889b(r5)
            r2.mo83115a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ImportVideoSizeCategory
            com.google.gson.f r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            java.util.List r5 = r8.getUploadVideoSizeCategory()
            java.lang.String r4 = r4.mo34889b(r5)
            r2.mo83115a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x01a6 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SyntheticVideoMaxRate     // Catch:{ a -> 0x01a6 }
            java.lang.Long r4 = r8.getSyntheticVideoMaxrate()     // Catch:{ a -> 0x01a6 }
            long r4 = r4.longValue()     // Catch:{ a -> 0x01a6 }
            r2.mo83114a(r3, r4)     // Catch:{ a -> 0x01a6 }
        L_0x01a6:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x01b5 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SyntheticVideoPreset     // Catch:{ a -> 0x01b5 }
            java.lang.Integer r4 = r8.getSyntheticVideoPreset()     // Catch:{ a -> 0x01b5 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x01b5 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x01b5 }
        L_0x01b5:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x01c4 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SyntheticVideoGop     // Catch:{ a -> 0x01c4 }
            java.lang.Integer r4 = r8.getSyntheticVideoGop()     // Catch:{ a -> 0x01c4 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x01c4 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x01c4 }
        L_0x01c4:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x01d3 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UploadOriginalAudioTrack     // Catch:{ a -> 0x01d3 }
            java.lang.Boolean r4 = r8.getUploadOriginAudioTrack()     // Catch:{ a -> 0x01d3 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x01d3 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x01d3 }
        L_0x01d3:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x01e2 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordBitrateMode     // Catch:{ a -> 0x01e2 }
            java.lang.Integer r4 = r8.getRecordBitrateMode()     // Catch:{ a -> 0x01e2 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x01e2 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x01e2 }
        L_0x01e2:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x01f1 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordHardwareProfile     // Catch:{ a -> 0x01f1 }
            java.lang.Integer r4 = r8.getRecordOpenHighProfile()     // Catch:{ a -> 0x01f1 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x01f1 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x01f1 }
        L_0x01f1:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0200 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ForbidLocalWatermark     // Catch:{ a -> 0x0200 }
            java.lang.Boolean r4 = r8.getForbidLocalWatermark()     // Catch:{ a -> 0x0200 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0200 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0200 }
        L_0x0200:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x020f }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ForbidLifeStoryLocalWatermark     // Catch:{ a -> 0x020f }
            java.lang.Boolean r4 = r8.getForbidLifeStoryLocalWatermark()     // Catch:{ a -> 0x020f }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x020f }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x020f }
        L_0x020f:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x021e }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUploadSyncTwitter     // Catch:{ a -> 0x021e }
            java.lang.Boolean r4 = r8.getEnableUploadSyncTwitter()     // Catch:{ a -> 0x021e }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x021e }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x021e }
        L_0x021e:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x022d }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUploadSyncIns     // Catch:{ a -> 0x022d }
            java.lang.Boolean r4 = r8.getEnableUploadSyncIns()     // Catch:{ a -> 0x022d }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x022d }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x022d }
        L_0x022d:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x023c }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUploadSyncInsStory     // Catch:{ a -> 0x023c }
            java.lang.Boolean r4 = r8.getEnableUploadSyncInsStory()     // Catch:{ a -> 0x023c }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x023c }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x023c }
        L_0x023c:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x024b }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordCameraType     // Catch:{ a -> 0x024b }
            java.lang.Integer r4 = r8.getRecordCameraType()     // Catch:{ a -> 0x024b }
            int r4 = r4.intValue()     // Catch:{ a -> 0x024b }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x024b }
        L_0x024b:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x025a }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.InCamera2BlackList     // Catch:{ a -> 0x025a }
            java.lang.Integer r4 = r8.getInCamera2BlackList()     // Catch:{ a -> 0x025a }
            int r4 = r4.intValue()     // Catch:{ a -> 0x025a }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x025a }
        L_0x025a:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0269 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordCameraCompatLevel     // Catch:{ a -> 0x0269 }
            java.lang.Integer r4 = r8.getRecordCameraCompatLevel()     // Catch:{ a -> 0x0269 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x0269 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x0269 }
        L_0x0269:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0278 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.DefaultMicrophoneState     // Catch:{ a -> 0x0278 }
            java.lang.Integer r4 = r8.getReactMicStatus()     // Catch:{ a -> 0x0278 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x0278 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x0278 }
        L_0x0278:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0287 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CanReact     // Catch:{ a -> 0x0287 }
            java.lang.Boolean r4 = r8.getCanReact()     // Catch:{ a -> 0x0287 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0287 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0287 }
        L_0x0287:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0296 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CloseUploadExtractFrames     // Catch:{ a -> 0x0296 }
            java.lang.Integer r4 = r8.getCloseVframeUpload()     // Catch:{ a -> 0x0296 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x0296 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x0296 }
        L_0x0296:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x02a5 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.InEvening     // Catch:{ a -> 0x02a5 }
            java.lang.Integer r4 = r8.getInEvening()     // Catch:{ a -> 0x02a5 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x02a5 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x02a5 }
        L_0x02a5:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x02b4 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UseLargeMattingModel     // Catch:{ a -> 0x02b4 }
            java.lang.Boolean r4 = r8.getEnableLargeMattingDetectModel()     // Catch:{ a -> 0x02b4 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x02b4 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x02b4 }
        L_0x02b4:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x02c3 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UseLargeGestureDetectModel     // Catch:{ a -> 0x02c3 }
            java.lang.Boolean r4 = r8.getEnableLargeGestureDetectModel()     // Catch:{ a -> 0x02c3 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x02c3 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x02c3 }
        L_0x02c3:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ReactDuetSettingChanged
            r2.mo83116a(r3, r1)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x02d9 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.MusicCopyRightGranted     // Catch:{ a -> 0x02d9 }
            java.lang.Boolean r4 = r8.getMusicCopyrightGranted()     // Catch:{ a -> 0x02d9 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x02d9 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x02d9 }
        L_0x02d9:
            java.lang.Integer r2 = r8.getStoryImagePlayTime()     // Catch:{ a -> 0x02f4 }
            int r2 = r2.intValue()     // Catch:{ a -> 0x02f4 }
            if (r2 <= 0) goto L_0x02f4
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x02f4 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StoryImagePlayTime     // Catch:{ a -> 0x02f4 }
            java.lang.Integer r4 = r8.getStoryImagePlayTime()     // Catch:{ a -> 0x02f4 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x02f4 }
            int r4 = r4 * 1000
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x02f4 }
        L_0x02f4:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0303 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableWaterBgMask     // Catch:{ a -> 0x0303 }
            java.lang.Boolean r4 = r8.getEnableWaterBgMask()     // Catch:{ a -> 0x0303 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0303 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0303 }
        L_0x0303:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0312 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.BitrateOfRecodeThreshold     // Catch:{ a -> 0x0312 }
            java.lang.Integer r4 = r8.getBitrateOfRecodeThreshold()     // Catch:{ a -> 0x0312 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x0312 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x0312 }
        L_0x0312:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0321 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableSyntheticFpsSet     // Catch:{ a -> 0x0321 }
            java.lang.Boolean r4 = r8.getEnableSyntheticFpsSet()     // Catch:{ a -> 0x0321 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0321 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0321 }
        L_0x0321:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0330 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ShowLastStoryFrame     // Catch:{ a -> 0x0330 }
            java.lang.Boolean r4 = r8.getStorySupportAnimate()     // Catch:{ a -> 0x0330 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0330 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0330 }
        L_0x0330:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x033f }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.MaxFansCount     // Catch:{ a -> 0x033f }
            java.lang.Integer r4 = r8.getVideoUploadNormalizationParam()     // Catch:{ a -> 0x033f }
            int r4 = r4.intValue()     // Catch:{ a -> 0x033f }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x033f }
        L_0x033f:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x034e }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.WideCameraInfo     // Catch:{ a -> 0x034e }
            java.lang.Integer r4 = r8.getWideCameraInfo()     // Catch:{ a -> 0x034e }
            int r4 = r4.intValue()     // Catch:{ a -> 0x034e }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x034e }
        L_0x034e:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x035d }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.DefaultWideMode     // Catch:{ a -> 0x035d }
            java.lang.Boolean r4 = r8.getAvDefaultWideMode()     // Catch:{ a -> 0x035d }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x035d }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x035d }
        L_0x035d:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x036c }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ShakeFreeWhiteList     // Catch:{ a -> 0x036c }
            java.lang.Integer r4 = r8.getShakeFreeWhiteList()     // Catch:{ a -> 0x036c }
            int r4 = r4.intValue()     // Catch:{ a -> 0x036c }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x036c }
        L_0x036c:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x037b }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ShakeFreeDefaultMode     // Catch:{ a -> 0x037b }
            java.lang.Boolean r4 = r8.getDefaultShakeFreeMode()     // Catch:{ a -> 0x037b }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x037b }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x037b }
        L_0x037b:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x038a }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ShutterSoundEnable     // Catch:{ a -> 0x038a }
            java.lang.Boolean r4 = r8.getShutterSoundEnable()     // Catch:{ a -> 0x038a }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x038a }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x038a }
        L_0x038a:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0399 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SpringEffectCacheController     // Catch:{ a -> 0x0399 }
            java.lang.Boolean r4 = r8.getLifeEffectsColdReq()     // Catch:{ a -> 0x0399 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0399 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0399 }
        L_0x0399:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03a8 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.IsExportHqFrame     // Catch:{ a -> 0x03a8 }
            java.lang.Boolean r4 = r8.getEnableHqVframe()     // Catch:{ a -> 0x03a8 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x03a8 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x03a8 }
        L_0x03a8:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03b7 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VideoDurationLimitMillisecond     // Catch:{ a -> 0x03b7 }
            java.lang.Long r4 = r8.getVideoDurationLimitMs()     // Catch:{ a -> 0x03b7 }
            long r4 = r4.longValue()     // Catch:{ a -> 0x03b7 }
            r2.mo83114a(r3, r4)     // Catch:{ a -> 0x03b7 }
        L_0x03b7:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03c2 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordTutorialLink     // Catch:{ a -> 0x03c2 }
            java.lang.String r4 = r8.getShootTutorialLink()     // Catch:{ a -> 0x03c2 }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x03c2 }
        L_0x03c2:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03d1 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.PreUploadMemoryLimit     // Catch:{ a -> 0x03d1 }
            java.lang.Integer r4 = r8.getPreUploadMemoryLimit()     // Catch:{ a -> 0x03d1 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x03d1 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x03d1 }
        L_0x03d1:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03e0 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.Enable1080pFastImport     // Catch:{ a -> 0x03e0 }
            java.lang.Integer r4 = r8.getEnable1080pFastImport()     // Catch:{ a -> 0x03e0 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x03e0 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x03e0 }
        L_0x03e0:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03eb }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StickerArtistIconUrl     // Catch:{ a -> 0x03eb }
            java.lang.String r4 = r8.getStickerArtistIconUrl()     // Catch:{ a -> 0x03eb }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x03eb }
        L_0x03eb:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x03fa }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableVESingleGL     // Catch:{ a -> 0x03fa }
            java.lang.Integer r4 = r8.getEnableVeSingleGl()     // Catch:{ a -> 0x03fa }
            int r4 = r4.intValue()     // Catch:{ a -> 0x03fa }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x03fa }
        L_0x03fa:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0405 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectSdkConfigSettings     // Catch:{ a -> 0x0405 }
            java.lang.String r4 = r8.getEffectSdkConfigSettings()     // Catch:{ a -> 0x0405 }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x0405 }
        L_0x0405:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0410 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StatusTabKey     // Catch:{ a -> 0x0410 }
            java.lang.String r4 = r8.getStatusTabKey()     // Catch:{ a -> 0x0410 }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x0410 }
        L_0x0410:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x041b }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StatusLottieUrl     // Catch:{ a -> 0x041b }
            java.lang.String r4 = r8.getStatusLottieUrl()     // Catch:{ a -> 0x041b }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x041b }
        L_0x041b:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x042a }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.StatusPhoneType     // Catch:{ a -> 0x042a }
            java.lang.Integer r4 = r8.getStatusPhoneType()     // Catch:{ a -> 0x042a }
            int r4 = r4.intValue()     // Catch:{ a -> 0x042a }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x042a }
        L_0x042a:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0439 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUpdateMoji     // Catch:{ a -> 0x0439 }
            java.lang.Boolean r4 = r8.getEnableMojiUpdateResources()     // Catch:{ a -> 0x0439 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0439 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0439 }
        L_0x0439:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0448 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ReviewVideoFastPublish     // Catch:{ a -> 0x0448 }
            java.lang.Boolean r4 = r8.getUseNewyearDirectUpload()     // Catch:{ a -> 0x0448 }
            boolean r4 = r4.booleanValue()     // Catch:{ a -> 0x0448 }
            r2.mo83116a(r3, r4)     // Catch:{ a -> 0x0448 }
        L_0x0448:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0453 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VERuntimeConfig     // Catch:{ a -> 0x0453 }
            java.lang.String r4 = r8.getVeRuntimeConfig()     // Catch:{ a -> 0x0453 }
            r2.mo83115a(r3, r4)     // Catch:{ a -> 0x0453 }
        L_0x0453:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x0462 }
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SATCameraType     // Catch:{ a -> 0x0462 }
            java.lang.Integer r4 = r8.getSatCameraType()     // Catch:{ a -> 0x0462 }
            int r4 = r4.intValue()     // Catch:{ a -> 0x0462 }
            r2.mo83113a(r3, r4)     // Catch:{ a -> 0x0462 }
        L_0x0462:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.PostDownloadSetting
            java.lang.Boolean r4 = r8.getPostDownloadSetting()
            boolean r4 = r4.booleanValue()
            r2.mo83116a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VEFastImportIgnoreRecode
            java.lang.Boolean r4 = r8.getVeFastImportIgnoreRecode()
            boolean r4 = r4.booleanValue()
            r2.mo83116a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.VEFastImportIgnoreRecodeForRotation
            java.lang.Boolean r4 = r8.getVeFastImportIgnoreRecodeForRotation()
            boolean r4 = r4.booleanValue()
            r2.mo83116a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUseVeCover
            java.lang.Integer r4 = r8.getUseVeImage()
            int r4 = r4.intValue()
            if (r4 != r0) goto L_0x049f
            r4 = 1
            goto L_0x04a0
        L_0x049f:
            r4 = 0
        L_0x04a0:
            r2.mo83116a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableVeCoverEffect
            java.lang.Integer r4 = r8.getEnableCoverEffect()
            int r4 = r4.intValue()
            if (r4 != r0) goto L_0x04b2
            r1 = 1
        L_0x04b2:
            r2.mo83116a(r3, r1)
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUseGameRotationSensor
            java.lang.Boolean r3 = r8.getEnableUseGameRotationSensor()
            boolean r3 = r3.booleanValue()
            r1.mo83116a(r2, r3)
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeBeautyDownloadEnable
            java.lang.Boolean r3 = r8.getEnableCameraBeautifyEffect()
            boolean r3 = r3.booleanValue()
            r1.mo83116a(r2, r3)
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.IsLowMemoryMachine
            java.lang.Boolean r3 = r8.getIsLowMemoryMachineForTools()
            boolean r3 = r3.booleanValue()
            r1.mo83116a(r2, r3)
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O     // Catch:{ a -> 0x04f1 }
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.DraftUseMultiVideoEdit     // Catch:{ a -> 0x04f1 }
            java.lang.Boolean r3 = r8.getDraftUseMultiVideoEdit()     // Catch:{ a -> 0x04f1 }
            boolean r3 = r3.booleanValue()     // Catch:{ a -> 0x04f1 }
            r1.mo83116a(r2, r3)     // Catch:{ a -> 0x04f1 }
        L_0x04f1:
            r1 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams r2 = r8.getUlikeParams()     // Catch:{ a -> 0x04f7 }
            r1 = r2
        L_0x04f7:
            if (r1 == 0) goto L_0x058f
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeSharpenDefaultValue
            java.lang.Float r4 = r1.getUlikeSharpenDefaultValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeSmoothDefaultValue
            java.lang.Float r4 = r1.getUlikeSmoothDefaultValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeShapeDefaultValue
            java.lang.Float r4 = r1.getUlikeShapeDefaultValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeEyesDefaultValue
            java.lang.Float r4 = r1.getUlikeEyesDefaultValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeLipDefaultValue
            java.lang.Float r4 = r1.getUlikeLipDefaultValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeBlusherDefaultValue
            java.lang.Float r4 = r1.getUlikeBlusherDefaultValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeSmoothMaxValue
            java.lang.Float r4 = r1.getUlikeSmoothMaxValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeShapeMaxValue
            java.lang.Float r4 = r1.getUlikeShapeMaxValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.UlikeEyesMaxValue
            java.lang.Float r4 = r1.getUlikeEyesMaxValue()
            float r4 = r4.floatValue()
            r2.mo83112a(r3, r4)
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableBeautySharpen
            java.lang.Boolean r1 = r1.getEnableBeautySharpen()
            boolean r1 = r1.booleanValue()
            r2.mo83116a(r3, r1)
        L_0x058f:
            com.ss.android.ugc.aweme.shortvideo.o.a r1 = com.p683ss.android.ugc.aweme.shortvideo.p2218o.C44335a.f112206c
            com.p683ss.android.ugc.aweme.shortvideo.p2218o.C44335a.f112204a = r0
            r1.mo90204a()
            r7.asynMonitorAwemeSetting(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.AVSettingsServiceImpl.updateServerSettings(com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy):void");
    }

    private String getAsString(C18085o oVar, String str) {
        String str2 = "";
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                return c.mo34905c();
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public void setDefaultFilterForCamera(int i, int i2) {
        if (i == 0) {
            C39618d.f101151O.mo83113a(backCameraProperty(), i2);
        } else {
            C39618d.f101151O.mo83113a(frontCameraProperty(), i2);
        }
    }

    private void setAB(C18085o oVar, C40790a aVar) {
        switch (aVar.type()) {
            case Boolean:
                C39618d.f101152P.mo83102a((C40762a) aVar, getAsBoolean(oVar, aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
                return;
            case Integer:
                C39618d.f101152P.mo83099a((C40762a) aVar, getAsInt(oVar, aVar.key(), ((Integer) aVar.defValue()).intValue()));
                return;
            case Long:
                C39618d.f101152P.mo83100a((C40762a) aVar, getAsLong(oVar, aVar.key(), ((Long) aVar.defValue()).longValue()));
                return;
            case Float:
                C39618d.f101152P.mo83098a((C40762a) aVar, getAsFloat(oVar, aVar.key(), ((Float) aVar.defValue()).floatValue()));
                return;
            case String:
                C39618d.f101152P.mo83101a((C40762a) aVar, getAsString(oVar, aVar.key()));
                break;
        }
    }

    private float getAsFloat(C18085o oVar, String str, float f) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                return c.mo34907e();
            }
            return f;
        } catch (Exception unused) {
            return f;
        }
    }

    private long getAsLong(C18085o oVar, String str, long j) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                return c.mo34909f();
            }
            return j;
        } catch (Exception unused) {
            return j;
        }
    }

    private int getAsInt(C18085o oVar, String str, int i) {
        int i2;
        try {
            C18088r c = oVar.mo35023c(str);
            if (c == null) {
                return i;
            }
            if (!c.mo35030a()) {
                i2 = c.mo34910g();
            } else if (c.mo34911h()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            return i2;
        } catch (Exception unused) {
            return i;
        }
    }

    private boolean getAsBoolean(C18085o oVar, String str, boolean z) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c == null) {
                return z;
            }
            if (!c.mo35033q()) {
                return c.mo34911h();
            }
            if (c.mo34904b().intValue() == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return z;
        }
    }
}
