package com.p683ss.android.vesdk;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ttve.model.C20100g;
import com.p683ss.android.ttve.model.VEMusicWaveBean;
import com.p683ss.android.ttve.monitor.C20110e;
import com.p683ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.p683ss.android.ttve.nativePort.TEEffectUtils;
import com.p683ss.android.ttve.nativePort.TEEffectUtils.ImageListener;
import com.p683ss.android.ttve.nativePort.TEImageFactory;
import com.p683ss.android.ttve.nativePort.TEImageFactory.ImageInfo;
import com.p683ss.android.ttve.nativePort.TEVideoUtils;
import com.p683ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener;
import com.p683ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.p683ss.android.vesdk.VEListener.C50554r;
import com.p683ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.p683ss.android.vesdk.p2534d.C50660a;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.vesdk.VEUtils */
public class VEUtils {

    /* renamed from: com.ss.android.vesdk.VEUtils$a */
    public static class C50570a {

        /* renamed from: a */
        public int f126786a;

        /* renamed from: b */
        public int f126787b;

        /* renamed from: c */
        public C50575f f126788c = new C50575f();

        /* renamed from: d */
        public int f126789d;

        /* renamed from: e */
        public C50572c[] f126790e = new C50572c[4];

        /* renamed from: f */
        public int f126791f;

        /* renamed from: g */
        public int f126792g;
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$b */
    public static class C50571b {

        /* renamed from: a */
        public int f126793a;

        /* renamed from: b */
        public int f126794b;

        /* renamed from: c */
        public int f126795c;

        /* renamed from: d */
        public int f126796d;
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$c */
    public static class C50572c {

        /* renamed from: a */
        public int f126797a;

        /* renamed from: b */
        public int f126798b;

        /* renamed from: c */
        public int f126799c;

        /* renamed from: d */
        public int f126800d;
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$d */
    public interface C50573d {
        /* renamed from: a */
        void mo59657a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$e */
    public static class C50574e {

        /* renamed from: a */
        public int f126801a;

        /* renamed from: b */
        public int f126802b;

        /* renamed from: c */
        public int f126803c;

        /* renamed from: d */
        public int f126804d;

        /* renamed from: e */
        public int f126805e;

        /* renamed from: f */
        public int f126806f;

        /* renamed from: g */
        public int f126807g;

        /* renamed from: h */
        public int f126808h;

        /* renamed from: i */
        public int f126809i;

        /* renamed from: j */
        public int f126810j;

        /* renamed from: k */
        public int f126811k;
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$f */
    public static class C50575f {

        /* renamed from: a */
        public int f126812a;

        /* renamed from: b */
        public int f126813b;

        /* renamed from: c */
        public int f126814c;

        /* renamed from: d */
        public int f126815d;

        /* renamed from: e */
        public float f126816e;

        /* renamed from: f */
        public float f126817f;

        /* renamed from: g */
        public int f126818g;

        /* renamed from: h */
        public int f126819h;

        /* renamed from: i */
        public int f126820i;
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$g */
    public static final class C50576g {

        /* renamed from: a */
        public String f126821a;

        /* renamed from: b */
        public String f126822b;

        /* renamed from: c */
        public String f126823c;

        /* renamed from: d */
        public String f126824d;

        /* renamed from: e */
        public int f126825e = -1;

        /* renamed from: f */
        public float f126826f = 0.4f;

        /* renamed from: g */
        public int f126827g = 8;

        /* renamed from: h */
        public int f126828h = NormalGiftView.ALPHA_180;

        /* renamed from: i */
        public int f126829i;

        /* renamed from: j */
        public int f126830j;

        /* renamed from: k */
        public int f126831k;

        /* renamed from: l */
        public int f126832l;

        /* renamed from: m */
        public int f126833m;
    }

    public static String getVideoEncodeTypeByID(int i) {
        return i != 5 ? i != 13 ? i != 28 ? i != 174 ? "unknown" : "h265" : "h264" : "mpeg4" : "h263";
    }

    public static boolean isSupportGLES3() {
        return TEVideoUtils.isSupportGLES3();
    }

    public static int checkMVResourceIntegrity(String str) {
        return TEVideoUtils.checkMVResourceIntegrity(str);
    }

    public static String findBestRemuxSuffix(String str) throws C50751p {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static int isCanImport(String str) {
        C20110e.m49637a("iesve_veutils_if_video_support_import", 1, (C50660a) null);
        return TEVideoUtils.isCanImport(str);
    }

    public static long getVideoReverseSize(String str) {
        int[] iArr = new int[10];
        if (getVideoFileInfo(str, iArr) < 0) {
            return -1;
        }
        return (((long) (iArr[3] / 1000)) * 5000) / 1024;
    }

    public static C50571b getAudioFileInfo(String str) {
        int[] iArr = new int[16];
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            C50571b bVar = new C50571b();
            bVar.f126793a = iArr[0];
            bVar.f126794b = iArr[1];
            bVar.f126795c = iArr[2];
            bVar.f126796d = iArr[3];
            return bVar;
        }
        StringBuilder sb = new StringBuilder("getAudioFileInfo error with code=");
        sb.append(audioFileInfo);
        C50792y.m109914d("VEUtils", sb.toString());
        return null;
    }

    public static List<C50571b> getAudioFileInfoForAllTracks(String str) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{32, 4});
        int audioFileInfoForAllTracks = TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
        if (audioFileInfoForAllTracks >= 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < audioFileInfoForAllTracks; i++) {
                C50571b bVar = new C50571b();
                bVar.f126793a = iArr[i][0];
                bVar.f126794b = iArr[i][1];
                bVar.f126795c = iArr[i][2];
                bVar.f126796d = iArr[i][3];
                arrayList.add(bVar);
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("getAudioFileInfoForAllTracks error with code=");
        sb.append(audioFileInfoForAllTracks);
        C50792y.m109914d("VEUtils", sb.toString());
        return new ArrayList(0);
    }

    public static C50574e getVideoFileInfo(String str) {
        int[] iArr = new int[16];
        int videoFileInfo = TEVideoUtils.getVideoFileInfo(str, iArr);
        if (videoFileInfo == 0) {
            C50574e eVar = new C50574e();
            eVar.f126801a = iArr[0];
            eVar.f126802b = iArr[1];
            eVar.f126803c = iArr[2];
            eVar.f126804d = iArr[3];
            eVar.f126805e = iArr[4];
            eVar.f126806f = iArr[5];
            eVar.f126807g = iArr[6];
            eVar.f126808h = iArr[7];
            eVar.f126809i = iArr[8];
            eVar.f126810j = iArr[9];
            eVar.f126811k = iArr[10];
            return eVar;
        }
        StringBuilder sb = new StringBuilder("getVideoFileInfo error with code=");
        sb.append(videoFileInfo);
        C50792y.m109914d("VEUtils", sb.toString());
        return null;
    }

    private static String ms2TimeFormat(int i) {
        long j = (long) i;
        return C2240a.m6773a(Locale.ENGLISH, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)))});
    }

    public static C50570a getAVFileInfoFromXml(String str) {
        int[] iArr = new int[32];
        int aVFileInfoFromXml = TEVideoUtils.getAVFileInfoFromXml(str, iArr);
        if (aVFileInfoFromXml == 0) {
            C50570a aVar = new C50570a();
            aVar.f126786a = iArr[0];
            aVar.f126787b = iArr[1];
            aVar.f126788c.f126812a = iArr[2];
            aVar.f126788c.f126813b = iArr[3];
            aVar.f126788c.f126814c = iArr[4];
            aVar.f126788c.f126815d = iArr[5];
            aVar.f126788c.f126816e = ((float) iArr[6]) / ((float) iArr[7]);
            aVar.f126788c.f126817f = ((float) iArr[8]) / ((float) iArr[9]);
            aVar.f126788c.f126818g = iArr[10];
            aVar.f126788c.f126819h = iArr[11];
            aVar.f126788c.f126820i = iArr[12];
            int i = 14;
            aVar.f126789d = iArr[13];
            for (int i2 = 0; i2 < 4; i2++) {
                aVar.f126790e[i2] = new C50572c();
                int i3 = i + 1;
                aVar.f126790e[i2].f126797a = iArr[i];
                int i4 = i3 + 1;
                aVar.f126790e[i2].f126798b = iArr[i3];
                int i5 = i4 + 1;
                aVar.f126790e[i2].f126799c = iArr[i4];
                i = i5 + 1;
                aVar.f126790e[i2].f126800d = iArr[i5];
            }
            aVar.f126791f = iArr[30];
            aVar.f126792g = iArr[31];
            return aVar;
        }
        StringBuilder sb = new StringBuilder("getAVFileInfoFromXml error with code=");
        sb.append(aVFileInfoFromXml);
        C50792y.m109914d("VEUtils", sb.toString());
        return null;
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
    }

    public static int execFFmpegCommand(String str, final C50573d dVar) {
        return TEVideoUtils.executeFFmpegCommand(str, new ExecuteCommandListener() {
            public final void onProgressChanged(int i) {
                if (dVar != null) {
                    dVar.mo59657a(i);
                }
            }
        });
    }

    public static int getQREncodedData(String str, final C50554r rVar) {
        return TEEffectUtils.getQREncodedData(str, null, new ImageListener() {
            public final void onData(int[] iArr, int i, int i2, int i3) {
            }
        });
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        C20110e.m49637a("iesve_veutils_get_video_info", 1, (C50660a) null);
        return TEVideoUtils.getVideoFileInfo(str, iArr);
    }

    public static VEMVAlgorithmConfig getMVAlgorithmConfigs(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return null;
        }
        return (VEMVAlgorithmConfig) TEVideoUtils.getMVAlgorithmConfigs(str, list);
    }

    public static int extractVideo(String str, String str2) {
        StringBuilder sb = new StringBuilder("extractVideo... inFile:");
        sb.append(str);
        sb.append(", outFile:");
        sb.append(str2);
        C50792y.m109909a("VEUtils", sb.toString());
        int isCanImport = isCanImport(str);
        if (isCanImport == 0) {
            return TEVideoUtils.extractVideo(str, str2);
        }
        C50792y.m109913c("VEUtils", "input file is not supported!");
        return isCanImport;
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        if (str == null || str2 == null) {
            C50792y.m109914d("VEUtils", "getMusicDefaultAlgorithm failed path is wrong");
            return -100;
        }
        StringBuilder sb = new StringBuilder("getMusicDefaultAlgorithm musicPath: ");
        sb.append(str);
        sb.append(" algorithmPath: ");
        sb.append(str2);
        C50792y.m109909a("VEUtils", sb.toString());
        return TEVideoUtils.getMusicDefaultAlgorithm(str, str2);
    }

    public static int reverseAudio(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        sb.append(str);
        sb.append(" -af areverse ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int extractVideoByCommand(String str, String str2) {
        StringBuilder sb = new StringBuilder("extractVideoByCommand... inFile:");
        sb.append(str);
        sb.append(", outFile:");
        sb.append(str2);
        C50792y.m109909a("VEUtils", sb.toString());
        int isCanImport = isCanImport(str);
        if (isCanImport != 0) {
            C50792y.m109913c("VEUtils", "input file is not supported!");
            return isCanImport;
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        StringBuilder sb2 = new StringBuilder("ffmpeg -i ");
        sb2.append(str);
        sb2.append(" -vcodec copy -an ");
        sb2.append(str2);
        return execFFmpegCommand(sb2.toString(), null);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        C20110e.m49637a("iesve_veutils_get_audio_info", 1, (C50660a) null);
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (str.endsWith(".aac")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
            if (extractMetadata != null && extractMetadata.startsWith("audio/aac")) {
                C50792y.m109913c("VEUtils", "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                iArr[3] = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            }
            mediaMetadataRetriever.release();
        }
        return audioFileInfo;
    }

    public static String getFileBestStreamAudio(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int fileAudio = TEVideoUtils.getFileAudio(str, str2, arrayList, true);
        if (fileAudio != 0) {
            StringBuilder sb = new StringBuilder("getFileBestStreamAudio error ");
            sb.append(fileAudio);
            C50792y.m109914d("VEUtils", sb.toString());
            return null;
        } else if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                C50792y.m109913c("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) arrayList.get(0);
        } else {
            C50792y.m109914d("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
            return null;
        }
    }

    public static int convertVideo2Webp(C50576g gVar, C50573d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (gVar.f126832l > 0 || gVar.f126833m > 0) {
            sb.append(" -accurate_seek");
            sb.append(" -ss ");
            sb.append(ms2TimeFormat(gVar.f126832l));
            sb.append(" -t ");
            sb.append(ms2TimeFormat(gVar.f126833m));
        }
        if (gVar.f126821a.contains(" ")) {
            gVar.f126821a = gVar.f126821a.replace(" ", "\\ ");
        }
        sb.append(" -y -i ");
        sb.append(gVar.f126821a);
        sb.append(" -vf scale=");
        sb.append(gVar.f126828h);
        sb.append(":");
        sb.append(gVar.f126829i);
        sb.append(" -r ");
        sb.append(gVar.f126827g);
        sb.append(" -loop 0 ");
        sb.append(gVar.f126822b);
        return execFFmpegCommand(sb.toString(), dVar);
    }

    public static int convertVideo2Gif(C50576g gVar, C50573d dVar) {
        int i;
        String str;
        if (gVar.f126821a.contains(" ")) {
            gVar.f126821a = gVar.f126821a.replace(" ", "\\ ");
        }
        int execFFmpegCommand = execFFmpegCommand(C2240a.m6773a(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{gVar.f126821a, Integer.valueOf(gVar.f126827g), Integer.valueOf(gVar.f126828h), gVar.f126823c}), null);
        if (execFFmpegCommand != 0) {
            return execFFmpegCommand;
        }
        int[] iArr = new int[10];
        int videoFileInfo = getVideoFileInfo(gVar.f126821a, iArr);
        if (videoFileInfo != 0) {
            return videoFileInfo;
        }
        int i2 = iArr[0];
        if (gVar.f126825e < 0) {
            ImageInfo imageInfo = TEImageFactory.getImageInfo(null, gVar.f126824d);
            int i3 = 278;
            float f = ((float) i2) / 540.0f;
            if (imageInfo != null && imageInfo.getWidth() > 0) {
                i3 = imageInfo.getWidth();
            }
            i = (int) (((float) i3) * f);
        } else {
            i = gVar.f126825e;
        }
        if (TextUtils.isEmpty(gVar.f126824d)) {
            str = C2240a.m6773a(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{gVar.f126821a, gVar.f126823c, Float.valueOf(gVar.f126826f), Integer.valueOf(gVar.f126827g), Integer.valueOf(gVar.f126828h), gVar.f126822b});
        } else {
            str = C2240a.m6773a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{gVar.f126821a, gVar.f126824d, gVar.f126823c, Integer.valueOf(i), Float.valueOf(gVar.f126826f), Integer.valueOf(gVar.f126827g), Integer.valueOf(gVar.f126830j), Integer.valueOf(gVar.f126831k), Integer.valueOf(gVar.f126828h), gVar.f126822b});
        }
        int execFFmpegCommand2 = execFFmpegCommand(str, dVar);
        new File(gVar.f126823c).delete();
        return execFFmpegCommand2;
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList) {
        return TEVideoUtils.getFileAudio(str, str2, arrayList, false);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        return TEVideoUtils.isCanTransCode(str, i, i2);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2) {
        return getMusicWaveData(str, i, i2, 10, 0, 0);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.getResampleMusicWaveData(fArr, i, i2);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, C50591aa aaVar) {
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(aaVar);
        return TEVideoUtils.mixAudio(arrayList, str, tEAudioUtilsCallback);
    }

    public static int getVideoFrames(String str, int[] iArr, C50753r rVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(rVar);
        C20110e.m49637a("iesve_veutils_extract_video_frames", 1, (C50660a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, 0, 0, false, tEVideoUtilsCallback);
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return -100;
        }
        C20110e.m49637a("iesve_veutils_combine_audio_and_video_start", 1, (C50660a) null);
        int mux = TEVideoUtils.mux(str, str2, str3);
        C50660a aVar = new C50660a();
        String str5 = "iesve_veutils_combine_audio_and_video_finish_result";
        if (mux == 0) {
            str4 = "succ";
        } else {
            str4 = "fail";
        }
        aVar.mo99062a(str5, str4);
        aVar.mo99062a("iesve_veutils_combine_audio_and_video_finish_reason", "");
        C20110e.m49637a("iesve_veutils_combine_audio_and_video_finish", 1, aVar);
        return mux;
    }

    private static int concatRecordData(VERecordData vERecordData, String str, String str2) {
        int size = vERecordData.f126770b.size();
        if (size <= 0) {
            C50792y.m109914d("VEUtils", "frag count is 0");
            return -100;
        }
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((VERecordSegmentData) vERecordData.f126770b.get(i)).f126774a;
            jArr2[i] = ((VERecordSegmentData) vERecordData.f126770b.get(i)).f126776c;
            strArr2[i] = ((VERecordSegmentData) vERecordData.f126770b.get(i)).f126775b;
            jArr[i] = ((VERecordSegmentData) vERecordData.f126770b.get(i)).f126777d;
            fArr[i] = ((VERecordSegmentData) vERecordData.f126770b.get(i)).f126778e;
        }
        vERecordData.f126772d = str;
        vERecordData.f126773e = str2;
        return TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordData.f126771c, 0, null, null, vERecordData.f126772d, vERecordData.f126773e);
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.trimVideoFile(str, iArr, str2, iArr2);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i, i2, -1);
    }

    public static VESize calcTargetRes(int[] iArr, int[] iArr2, C50657c[] cVarArr, int i) {
        int i2;
        int i3;
        VESize vESize = new VESize(-1, -1);
        if (iArr2 == null || iArr == null || cVarArr == null) {
            return vESize;
        }
        int length = iArr.length;
        if (length <= 0) {
            return vESize;
        }
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[i6];
            if (cVarArr[i6] == C50657c.ROTATE_90 || cVarArr[i6] == C50657c.ROTATE_270) {
                i8 = iArr2[i6];
                i7 = iArr[i6];
            }
            f = Math.max(f, ((float) i7) / ((float) i8));
            i4 = Math.max(i4, i8);
            i5 = Math.max(i5, i7);
        }
        if (length != 1) {
            f = Math.min(f, 1.7777778f);
        }
        if (f >= 1.0f) {
            i3 = Math.min(i4, i);
            i2 = (int) (((float) i3) * f);
        } else {
            i2 = Math.min(i5, i);
            i3 = (int) (((float) i2) / f);
        }
        int i9 = ((i2 + 16) - 1) & -16;
        vESize.width = ((i3 + 16) - 1) & -16;
        vESize.height = i9;
        return vESize;
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ");
        sb.append(str);
        sb.append(" -ss ");
        sb.append(str3);
        sb.append(" -t ");
        sb.append(str4);
        sb.append(" -acodec copy -vcodec copy ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int curVideo(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        if (arrayList.size() != arrayList2.size() || arrayList.size() != arrayList3.size() || arrayList2.size() != arrayList3.size()) {
            return -100;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ");
        sb.append(str);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(" -ss ");
            sb.append((String) arrayList2.get(i));
            sb.append(" -t ");
            sb.append((String) arrayList3.get(i));
            sb.append(" -acodec copy -vcodec copy ");
            sb.append((String) arrayList.get(i));
        }
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return TEVideoUtils.findAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static C50598ae createRTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        C50598ae aeVar = new C50598ae(i, i2, i3, f, i4);
        return aeVar;
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4) {
        return getMusicWaveData(str, i, i2, 10, i3, i4);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ");
        sb.append(str);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(str2);
        sb.append(sb2.toString());
        C50792y.m109909a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3) {
        VERecordData vERecordData2 = vERecordData;
        if (vERecordData2 == null || vERecordData2.f126770b.size() <= 0) {
            C50792y.m109914d("VEUtils", "getAudioFromRecordData 参数错误");
            return -100;
        }
        int size = vERecordData2.f126770b.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        long[] jArr4 = new long[size];
        float[] fArr = new float[size];
        int i4 = 0;
        long j = 0;
        for (VERecordSegmentData vERecordSegmentData : vERecordData2.f126770b) {
            if (vERecordSegmentData.f126781h) {
                strArr[i4] = vERecordSegmentData.f126775b;
                jArr[i4] = (long) ((int) (vERecordSegmentData.f126782i / 1000));
                jArr2[i4] = (long) ((int) (vERecordSegmentData.f126783j / 1000));
                fArr[i4] = vERecordSegmentData.f126778e;
                jArr3[i4] = (long) ((int) (((float) jArr[i4]) * fArr[i4]));
                jArr4[i4] = (long) ((int) (((float) jArr2[i4]) * fArr[i4]));
                j += jArr4[i4] - jArr3[i4];
                i4++;
            }
        }
        if (i4 == 0) {
            C50792y.m109914d("VEUtils", "getAudioFromRecordData 没有有效片段");
            return -100;
        }
        return detachAudioFromVideos(str, (String[]) Arrays.copyOf(strArr, i4), Arrays.copyOf(jArr3, i4), Arrays.copyOf(jArr4, i4), 0, j, Arrays.copyOf(fArr, i4), i, i2, i3);
    }

    public static int transCodeAudio(String str, int i, int i2, String str2, int i3, int i4) {
        return TEVideoUtils.transCodeAudioFile(str, i, i2, str2, i3, i4, -1);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, C50753r rVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(rVar);
        C20110e.m49637a("iesve_veutils_extract_video_frames", 1, (C50660a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, C50753r rVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(rVar);
        C20110e.m49637a("iesve_veutils_extract_video_frames", 1, (C50660a) null);
        return TEVideoUtils.getVideoFrames2(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            i = C20100g.f55273f;
        }
        VEMusicWaveBean audioWaveData = TEVideoUtils.getAudioWaveData(str, i, i2, i3, i4, i5);
        if (audioWaveData == null || audioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return audioWaveData;
    }

    public static int getVideoThumb(VERecordData vERecordData, int i, int i2, int i3, boolean z, C50753r rVar) {
        Iterator it = vERecordData.f126770b.iterator();
        String str = "";
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VERecordSegmentData vERecordSegmentData = (VERecordSegmentData) it.next();
            if (vERecordSegmentData.f126781h) {
                str = vERecordSegmentData.f126774a;
                int i6 = (int) ((vERecordSegmentData.f126783j - vERecordSegmentData.f126782i) / 1000);
                int min = Math.min(i6, ((int) (vERecordSegmentData.f126782i / 1000)) + (i - i4));
                if (i >= i4 && i <= i4 + i6) {
                    i5 = min;
                    break;
                }
                i4 += i6;
                i5 = min;
            }
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2) || i5 < 0) {
            C50792y.m109914d("VEUtils", "timestamp 不在有效时间范围内");
            return -100;
        }
        return getVideoFrames(str2, new int[]{i5}, i2, i3, z, rVar);
    }

    public static int concatRecordFrag(String[] strArr, String[] strArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        String[] strArr3 = strArr;
        long[] jArr = new long[strArr3.length];
        Arrays.fill(jArr, -1);
        long[] jArr2 = new long[strArr2.length];
        Arrays.fill(jArr2, -1);
        return concatRecordFrag(strArr3, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int getVideoThumb(String str, int i, C50753r rVar, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        C50753r rVar2 = rVar;
        tEVideoUtilsCallback.setListener(rVar);
        C20110e.m49637a("iesve_veutils_extract_video_thumb", 1, (C50660a) null);
        return TEVideoUtils.getVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3) {
        StringBuilder sb = new StringBuilder();
        String str4 = str2;
        sb.append(str2);
        String str5 = str3;
        sb.append(str3);
        return TEVideoUtils.saveVideoFrames(str, iArr, i, i2, z, sb.toString(), i3, 70);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, C50753r rVar) {
        return TEVideoUtils.getVideoFramesMore(str, iArr, i, i2, z, z2, i3, z3, rVar);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        String str4 = str2;
        sb.append(str2);
        String str5 = str3;
        sb.append(str3);
        return TEVideoUtils.saveVideoFrames(str, iArr, i, i2, z, sb.toString(), i3, i4);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        return TEVideoUtils.concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return TEVideoUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3);
    }
}
