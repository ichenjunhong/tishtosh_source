package com.p683ss.android.ugc.aweme.shortvideo.p2204h;

import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h.l */
public final class C43884l {

    /* renamed from: a */
    public static final C43884l f111138a = new C43884l();

    private C43884l() {
    }

    /* renamed from: b */
    private static int m96398b(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.hasOriginalSound()) {
            return 1;
        }
        if (videoPublishEditModel.mMusicOrigin == null) {
            return 0;
        }
        return 2;
    }

    /* renamed from: d */
    private static int m96400d(VideoPublishEditModel videoPublishEditModel) {
        int i = 2;
        switch (videoPublishEditModel.mOrigin) {
            case 0:
                return 1;
            case 1:
                if (videoPublishEditModel.videoEditorType == 2) {
                    return 3;
                }
                switch (videoPublishEditModel.videoType) {
                    case 6:
                        i = 4;
                        break;
                    case 7:
                    case 9:
                        break;
                    default:
                        if (TextUtils.isEmpty(videoPublishEditModel.mDuetFrom)) {
                            i = 0;
                            break;
                        } else {
                            return 5;
                        }
                }
            default:
                i = -1;
                break;
        }
        return i;
    }

    /* renamed from: c */
    private static String[] m96399c(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        for (ImportVideoInfo importVideoInfo : arrayList) {
            sb.append(importVideoInfo.getImportPath());
            sb.append(",");
            sb2.append(importVideoInfo.getVideoWidth());
            sb2.append("*");
            sb2.append(importVideoInfo.getVideoHeight());
            sb2.append(",");
            sb3.append(VEUtils.getVideoEncodeTypeByID(importVideoInfo.getEncodeId()));
            sb3.append(",");
            sb4.append(importVideoInfo.getImportfileDuration());
            sb4.append(",");
            sb5.append(importVideoInfo.getDuration());
            sb5.append(",");
        }
        String[] strArr = new String[5];
        String sb6 = sb.toString();
        C52711k.m112236a((Object) sb6, "importPaths.toString()");
        int length = sb.length() - 1;
        if (sb6 != null) {
            String substring = sb6.substring(0, length);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            strArr[0] = substring;
            String sb7 = sb2.toString();
            C52711k.m112236a((Object) sb7, "importResolutions.toString()");
            int length2 = sb2.length() - 1;
            if (sb7 != null) {
                String substring2 = sb7.substring(0, length2);
                C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                strArr[1] = substring2;
                String sb8 = sb3.toString();
                C52711k.m112236a((Object) sb8, "importEncodeType.toString()");
                int length3 = sb3.length() - 1;
                if (sb8 != null) {
                    String substring3 = sb8.substring(0, length3);
                    C52711k.m112236a((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    strArr[2] = substring3;
                    String sb9 = sb4.toString();
                    C52711k.m112236a((Object) sb9, "importOriginDurations.toString()");
                    int length4 = sb4.length() - 1;
                    if (sb9 != null) {
                        String substring4 = sb9.substring(0, length4);
                        C52711k.m112236a((Object) substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        strArr[3] = substring4;
                        String sb10 = sb5.toString();
                        C52711k.m112236a((Object) sb10, "importTrimDurations.toString()");
                        int length5 = sb5.length() - 1;
                        if (sb10 != null) {
                            String substring5 = sb10.substring(0, length5);
                            C52711k.m112236a((Object) substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            strArr[4] = substring5;
                            return strArr;
                        }
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static String m96397a(VideoPublishEditModel videoPublishEditModel) {
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        C52711k.m112240b(videoPublishEditModel2, "model");
        Map<String, Object> map = videoPublishEditModel2.metadataMap;
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("uid", C39618d.f101183x.mo74283c());
        jSONObject.put("did", AppLog.getServerDeviceId());
        C39566ar arVar = C39618d.f101167h;
        C52711k.m112236a((Object) arVar, "AVEnv.LOCATION_SERVICE");
        jSONObject.put("te_region", arVar.mo74214a());
        jSONObject.put("te_audio_type", m96398b(videoPublishEditModel));
        int d = m96400d(videoPublishEditModel);
        jSONObject.put("te_publish_type", d);
        jSONObject.put("te_face_beauty_type", videoPublishEditModel2.beautyType);
        jSONObject.put("te_camera_type", videoPublishEditModel2.cameraIds);
        jSONObject.put("te_filter_id", videoPublishEditModel.getFilterIds());
        jSONObject.put("te_filter_name", videoPublishEditModel.getFilterName());
        jSONObject.put("te_stricker_id", videoPublishEditModel2.mStickerID);
        jSONObject.put("te_video_speed", videoPublishEditModel.getSpeed());
        if (d == 1) {
            jSONObject.put("te_is_fast_import", videoPublishEditModel2.isFastImport);
        }
        String[] c = m96399c(videoPublishEditModel);
        if (c != null && c.length == 5) {
            jSONObject.put("te_import_path", c[0]);
            jSONObject.put("te_import_resolution", c[1]);
            jSONObject.put("te_import_file_encode_type", c[2]);
            jSONObject.put("te_import_file_duration", c[3]);
            jSONObject.put("te_import_file_trim_duration", c[4]);
        }
        if (videoPublishEditModel2.mBeautyMetadatas != null) {
            ArrayList<BeautyMetadata> arrayList = videoPublishEditModel2.mBeautyMetadatas;
            C52711k.m112236a((Object) arrayList, "model.mBeautyMetadatas");
            if (!arrayList.isEmpty()) {
                ArrayList<BeautyMetadata> arrayList2 = videoPublishEditModel2.mBeautyMetadatas;
                C52711k.m112236a((Object) arrayList2, "model.mBeautyMetadatas");
                Iterable<BeautyMetadata> iterable = arrayList2;
                Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
                for (BeautyMetadata beautyName : iterable) {
                    arrayList3.add(beautyName.getBeautyName());
                }
                String a = C52575l.m112120a((List) arrayList3, ";", null, null, 0, null, null, 62, null);
                ArrayList<BeautyMetadata> arrayList4 = videoPublishEditModel2.mBeautyMetadatas;
                C52711k.m112236a((Object) arrayList4, "model.mBeautyMetadatas");
                Iterable<BeautyMetadata> iterable2 = arrayList4;
                Collection arrayList5 = new ArrayList(C52575l.m112104a(iterable2, 10));
                for (BeautyMetadata beautyStrength : iterable2) {
                    arrayList5.add(beautyStrength.getBeautyStrength());
                }
                String a2 = C52575l.m112120a((List) arrayList5, ";", null, null, 0, null, null, 62, null);
                ArrayList<BeautyMetadata> arrayList6 = videoPublishEditModel2.mBeautyMetadatas;
                C52711k.m112236a((Object) arrayList6, "model.mBeautyMetadatas");
                Iterable<BeautyMetadata> iterable3 = arrayList6;
                Collection arrayList7 = new ArrayList(C52575l.m112104a(iterable3, 10));
                for (BeautyMetadata beautyId : iterable3) {
                    arrayList7.add(beautyId.getBeautyId());
                }
                String a3 = C52575l.m112120a((List) arrayList7, ";", null, null, 0, null, null, 62, null);
                ArrayList<BeautyMetadata> arrayList8 = videoPublishEditModel2.mBeautyMetadatas;
                C52711k.m112236a((Object) arrayList8, "model.mBeautyMetadatas");
                Iterable<BeautyMetadata> iterable4 = arrayList8;
                Collection arrayList9 = new ArrayList(C52575l.m112104a(iterable4, 10));
                for (BeautyMetadata beautyRes : iterable4) {
                    arrayList9.add(beautyRes.getBeautyRes());
                }
                String a4 = C52575l.m112120a((List) arrayList9, ";", null, null, 0, null, null, 62, null);
                ArrayList<BeautyMetadata> arrayList10 = videoPublishEditModel2.mBeautyMetadatas;
                C52711k.m112236a((Object) arrayList10, "model.mBeautyMetadatas");
                Iterable<BeautyMetadata> iterable5 = arrayList10;
                Collection arrayList11 = new ArrayList(C52575l.m112104a(iterable5, 10));
                for (BeautyMetadata beautyValid : iterable5) {
                    arrayList11.add(beautyValid.getBeautyValid());
                }
                String a5 = C52575l.m112120a((List) arrayList11, ";", null, null, 0, null, null, 62, null);
                jSONObject.put("te_record_beauty_name", a);
                jSONObject.put("te_record_beauty_strength", a2);
                jSONObject.put("te_record_beauty_id", a3);
                jSONObject.put("te_record_beauty_res", a4);
                jSONObject.put("te_record_beauty_res_valid", a5);
            }
        }
        return jSONObject.toString();
    }
}
