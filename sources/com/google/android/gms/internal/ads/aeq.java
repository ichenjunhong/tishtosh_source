package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C16299uq
public final class aeq {

    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f40367a = new HashMap();

    /* renamed from: b */
    private static List<MediaCodecInfo> f40368b;

    /* renamed from: c */
    private static final Object f40369c = new Object();

    /* renamed from: a */
    public static List<Map<String, Object>> m32739a(String str) {
        CodecProfileLevel[] codecProfileLevelArr;
        synchronized (f40369c) {
            if (f40367a.containsKey(str)) {
                List<Map<String, Object>> list = (List) f40367a.get(str);
                return list;
            }
            try {
                synchronized (f40369c) {
                    if (f40368b == null) {
                        if (VERSION.SDK_INT >= 21) {
                            f40368b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f40368b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f40368b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f40368b = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f40368b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (VERSION.SDK_INT >= 21) {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m32740a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m32740a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m32740a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m32740a(videoCapabilities.getSupportedHeights()));
                        }
                        if (VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f40367a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f40367a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    /* renamed from: a */
    private static Integer[] m32740a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
