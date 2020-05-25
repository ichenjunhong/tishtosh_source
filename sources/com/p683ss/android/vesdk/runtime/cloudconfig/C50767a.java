package com.p683ss.android.vesdk.runtime.cloudconfig;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.a */
public final class C50767a implements C50768b {
    /* renamed from: a */
    public final void mo99455a(Map<String, String> map, C50770d dVar) {
        dVar.f127539a = 1;
        dVar.f127540b = 1;
        dVar.f127541c = 15;
        dVar.f127542d = 15000000;
        dVar.f127543e = 0;
        dVar.f127544f = 35;
        dVar.f127545g = 15;
        dVar.f127546h = 1;
        dVar.f127547i = 4194304;
        dVar.f127548j = 0;
        dVar.f127549k = 0;
        dVar.f127550l = 0;
        dVar.f127551m = 576;
        dVar.f127552n = PreloadTask.BYTE_UNIT_NUMBER;
        dVar.f127553o = 15;
        dVar.f127554p = 15000000;
        dVar.f127555q = 0;
        dVar.f127556r = 35;
        dVar.f127557s = 15;
        dVar.f127558t = 0;
        dVar.f127559u = 0;
        dVar.f127560v = 4194304;
        dVar.f127561w = 0;
        dVar.f127562x = 0;
        dVar.f127563y = 576;
        dVar.f127564z = 15;
        dVar.f127525A = 15000000;
        dVar.f127526B = 0;
        dVar.f127527C = 35;
        dVar.f127528D = 15;
        dVar.f127529E = 1;
        dVar.f127530F = 0;
        dVar.f127531G = 4194304;
        dVar.f127532H = 0;
        dVar.f127533I = 0;
        dVar.f127534J = 1;
        dVar.f127535K = 1;
        dVar.f127536L = 1;
        if (map.containsKey("record_camera_type")) {
            dVar.f127539a = Integer.parseInt((String) map.get("record_camera_type"));
        }
        if (map.containsKey("record_camera_compat_level")) {
            dVar.f127540b = Integer.parseInt((String) map.get("record_camera_compat_level"));
        }
        if (map.containsKey("record_video_sw_crf")) {
            dVar.f127541c = Integer.parseInt((String) map.get("record_video_sw_crf"));
        }
        if (map.containsKey("record_video_sw_maxrate")) {
            dVar.f127542d = Integer.parseInt((String) map.get("record_video_sw_maxrate"));
        }
        if (map.containsKey("record_video_sw_preset")) {
            dVar.f127543e = Integer.parseInt((String) map.get("record_video_sw_preset"));
        }
        if (map.containsKey("record_video_sw_gop")) {
            dVar.f127544f = Integer.parseInt((String) map.get("record_video_sw_gop"));
        }
        if (map.containsKey("record_video_sw_qp")) {
            dVar.f127545g = Integer.parseInt((String) map.get("record_video_sw_qp"));
        }
        if (map.containsKey("record_sw_bitrate_mode")) {
            dVar.f127546h = Integer.parseInt((String) map.get("record_sw_bitrate_mode"));
        }
        if (map.containsKey("record_video_hw_bitrate")) {
            dVar.f127547i = Integer.parseInt((String) map.get("record_video_hw_bitrate"));
        }
        if (map.containsKey("record_encode_mode")) {
            dVar.f127548j = Integer.parseInt((String) map.get("record_encode_mode"));
        }
        if (map.containsKey("record_hw_bitrate_mode")) {
            dVar.f127549k = Integer.parseInt((String) map.get("record_hw_bitrate_mode"));
        }
        if (map.containsKey("record_hw_profile")) {
            dVar.f127550l = Integer.parseInt((String) map.get("record_hw_profile"));
        }
        if (map.containsKey("record_resolution_width")) {
            dVar.f127551m = Integer.parseInt((String) map.get("record_resolution_width"));
        }
        if (map.containsKey("record_resolution_height")) {
            dVar.f127552n = Integer.parseInt((String) map.get("record_resolution_height"));
        }
        if (map.containsKey("import_video_sw_crf")) {
            dVar.f127553o = Integer.parseInt((String) map.get("import_video_sw_crf"));
        }
        if (map.containsKey("import_video_sw_maxrate")) {
            dVar.f127554p = Integer.parseInt((String) map.get("import_video_sw_maxrate"));
        }
        if (map.containsKey("import_video_sw_preset")) {
            dVar.f127555q = Integer.parseInt((String) map.get("import_video_sw_preset"));
        }
        if (map.containsKey("import_video_sw_gop")) {
            dVar.f127556r = Integer.parseInt((String) map.get("import_video_sw_gop"));
        }
        if (map.containsKey("import_video_sw_qp")) {
            dVar.f127557s = Integer.parseInt((String) map.get("import_video_sw_qp"));
        }
        if (map.containsKey("import_sw_bitrate_mode")) {
            dVar.f127558t = Integer.parseInt((String) map.get("import_sw_bitrate_mode"));
        }
        if (map.containsKey("import_encode_mode")) {
            dVar.f127559u = Integer.parseInt((String) map.get("import_encode_mode"));
        }
        if (map.containsKey("import_video_hw_bitrate")) {
            dVar.f127560v = Integer.parseInt((String) map.get("import_video_hw_bitrate"));
        }
        if (map.containsKey("import_hw_bitrate_mode")) {
            dVar.f127561w = Integer.parseInt((String) map.get("import_hw_bitrate_mode"));
        }
        if (map.containsKey("import_hw_profile")) {
            dVar.f127562x = Integer.parseInt((String) map.get("import_hw_profile"));
        }
        if (map.containsKey("import_shorter_pixels")) {
            dVar.f127563y = Integer.parseInt((String) map.get("import_shorter_pixels"));
        }
        if (map.containsKey("synthetic_video_sw_crf")) {
            dVar.f127564z = Integer.parseInt((String) map.get("synthetic_video_sw_crf"));
        }
        if (map.containsKey("synthetic_video_sw_maxrate")) {
            dVar.f127525A = Integer.parseInt((String) map.get("synthetic_video_sw_maxrate"));
        }
        if (map.containsKey("synthetic_video_sw_preset")) {
            dVar.f127526B = Integer.parseInt((String) map.get("synthetic_video_sw_preset"));
        }
        if (map.containsKey("synthetic_video_sw_gop")) {
            dVar.f127527C = Integer.parseInt((String) map.get("synthetic_video_sw_gop"));
        }
        if (map.containsKey("synthetic_video_sw_qp")) {
            dVar.f127528D = Integer.parseInt((String) map.get("synthetic_video_sw_qp"));
        }
        if (map.containsKey("synthetic_sw_bitrate_mode")) {
            dVar.f127529E = Integer.parseInt((String) map.get("synthetic_sw_bitrate_mode"));
        }
        if (map.containsKey("synthetic_encode_mode")) {
            dVar.f127530F = Integer.parseInt((String) map.get("synthetic_encode_mode"));
        }
        if (map.containsKey("synthetic_video_hw_bitrate")) {
            dVar.f127531G = Integer.parseInt((String) map.get("synthetic_video_hw_bitrate"));
        }
        if (map.containsKey("synthetic_hw_bitrate_mode")) {
            dVar.f127532H = Integer.parseInt((String) map.get("synthetic_hw_bitrate_mode"));
        }
        if (map.containsKey("synthetic_hw_profile")) {
            dVar.f127533I = Integer.parseInt((String) map.get("synthetic_hw_profile"));
        }
        if (map.containsKey("earphone_echo_normal")) {
            dVar.f127534J = Integer.parseInt((String) map.get("earphone_echo_normal"));
        }
        if (map.containsKey("earphone_echo_aaudio")) {
            dVar.f127535K = Integer.parseInt((String) map.get("earphone_echo_aaudio"));
        }
        if (map.containsKey("earphone_echo_huawei")) {
            dVar.f127536L = Integer.parseInt((String) map.get("earphone_echo_huawei"));
        }
    }
}
