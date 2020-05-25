package com.p683ss.android.ugc.aweme.utils;

import android.media.MediaMetadataRetriever;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.vesdk.VEUtils;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.de */
public final class C47807de {

    /* renamed from: a */
    public static final C47807de f120358a = new C47807de();

    private C47807de() {
    }

    /* renamed from: a */
    public static final boolean m103445a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        return false;
    }

    /* renamed from: a */
    public static int m103442a(String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i = (int) Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
        } catch (Exception unused) {
            i = -1;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception unused3) {
        }
        return i;
    }

    /* renamed from: a */
    public static final int m103443a(String str, boolean z) {
        int i;
        if (str == null) {
            return 0;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            i = iArr[3];
        } else {
            StringBuilder sb = new StringBuilder("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
            sb.append(audioFileInfo);
            C47625i.m103103a(sb.toString());
            i = C39630m.m88234a().mo58604b().mo80578b(str);
        }
        return i;
    }
}
