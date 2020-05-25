package com.p683ss.android.ugc.aweme.music.p1977e;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import com.C2240a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.e.c */
public class C37378c {

    /* renamed from: a */
    public static String f95366a = null;

    /* renamed from: b */
    private static final String f95367b = "c";

    /* renamed from: c */
    private static final Uri f95368c = Uri.parse("content://media/external/audio/albumart");

    /* renamed from: d */
    private static final boolean f95369d = false;

    /* renamed from: a */
    public static String m83693a() {
        return f95366a;
    }

    /* renamed from: a */
    public static boolean m83701a(MusicModel musicModel, Context context, boolean z, boolean z2) {
        if (musicModel == null) {
            return false;
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return true;
        }
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !C9376b.m18558a((Collection<T>) musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.ce6);
        }
        if (z) {
            C10691a.m21545b(context, offlineDesc).mo19066a();
        }
        return false;
    }

    /* renamed from: a */
    public static void m83699a(String str, Fragment fragment, int i, String str2, int i2, MusicModel musicModel, boolean z, Bundle bundle, String str3, String str4) {
        SmartRoute withParam = SmartRouter.buildRoute(fragment.getContext(), str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        AVChallenge curChallenge = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getCurChallenge();
        if (curChallenge != null) {
            withParam.withParam("challenge", curChallenge.cid);
        }
        withParam.withParam("title", str2).withParam("music_model", (Serializable) musicModel).withParam("music_allow_clear", z).withParam("creation_id", str4).withParam("shoot_way", str3);
        if (bundle != null) {
            withParam.withParam("arguments", bundle);
        }
        fragment.startActivityForResult(withParam.buildIntent(), i);
    }

    /* renamed from: a */
    public static void m83698a(MusicModel musicModel) {
        if (musicModel.getMusic() != null && musicModel.getMusic().getChallenge() != null) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
    }

    /* renamed from: b */
    public static void m83703b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            jSONObject.put("error_stack", stackTraceString);
        } catch (Exception unused) {
        }
        C23569o.m57779a("music_id_empty", jSONObject);
    }

    /* renamed from: b */
    public static String m83702b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception unused) {
            C47625i.m103103a("music url illegal");
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m83691a(java.lang.String r3) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            r3 = 9
            java.lang.String r3 = r0.extractMetadata(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            float r3 = r3.floatValue()     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            long r1 = (long) r3
            r0.release()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r1
        L_0x001b:
            r3 = move-exception
            r0.release()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            throw r3
        L_0x0020:
            r0.release()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1977e.C37378c.m83691a(java.lang.String):long");
    }

    /* renamed from: c */
    private static String m83704c(String str) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m83694a(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C2240a.m6773a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public static Music m83692a(List<Music> list, String str) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        for (Music music : list) {
            if (music != null && C9431p.m18665a(music.getMid(), str)) {
                return music;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<C37283j> m83695a(List<Music> list, List<C37283j> list2) {
        if (C23715d.m58202a((Collection<T>) list)) {
            return list2;
        }
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setDataType(1);
                list2.add(convertToMusicModel);
            }
        }
        return list2;
    }

    /* renamed from: a */
    public static boolean m83700a(MusicModel musicModel, Context context, boolean z) {
        return m83701a(musicModel, context, z, false);
    }

    /* renamed from: a */
    public static void m83696a(Activity activity, int i, int i2) {
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) activity, "//assmusic/category");
        if (i2 == 0) {
            buildRoute.withParam("music_type", 6);
        } else if (i2 == 2) {
            buildRoute.withParam("music_type", 5);
        }
        activity.startActivityForResult(buildRoute.buildIntent(), 10086);
    }

    /* renamed from: a */
    public static void m83697a(Context context, List<MusicModel> list, IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        boolean z;
        String str;
        List<MusicModel> list2 = list;
        IGetInfoCallback<List<MusicModel>> iGetInfoCallback2 = iGetInfoCallback;
        if (context == null) {
            iGetInfoCallback2.finish(new ArrayList());
        }
        list.clear();
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_data", "_display_name", "_size", "duration"}, null, null, "title_key");
        if (query == null) {
            iGetInfoCallback2.finish(list2);
        }
        while (query.moveToNext()) {
            int i = query.getInt(query.getColumnIndex("is_music"));
            String c = m83704c("ro.build.display.id");
            if (TextUtils.isEmpty(c) || !c.toLowerCase().contains("flyme")) {
                z = false;
            } else {
                z = true;
            }
            if (z || i != 0) {
                query.getLong(query.getColumnIndex("_id"));
                String string = query.getString(query.getColumnIndex("title"));
                String string2 = query.getString(query.getColumnIndex("artist"));
                String string3 = query.getString(query.getColumnIndex("album"));
                query.getLong(query.getColumnIndex("album_id"));
                long j = query.getLong(query.getColumnIndex("duration"));
                String string4 = query.getString(query.getColumnIndex("_data"));
                query.getString(query.getColumnIndex("_display_name"));
                query.getLong(query.getColumnIndex("_size"));
                MusicModel musicModel = new MusicModel();
                musicModel.setName(string);
                musicModel.setMusicStatus(1);
                musicModel.setAlbum(string3);
                if (TextUtils.equals("<unknown>", string2)) {
                    string2 = "未知";
                }
                musicModel.setSinger(string2);
                musicModel.setLocalPath(string4);
                musicModel.setCollectionType(CollectionType.NOT_COLLECTED);
                musicModel.setMusicType(MusicType.LOCAL);
                if (j <= 0) {
                    str = "";
                } else {
                    long j2 = j / 1000;
                    long j3 = j2 % 60;
                    long j4 = j2 / 60;
                    long j5 = j4 / 60;
                    long j6 = j4 % 60;
                    if (0 == j5) {
                        str = C2240a.m6773a(Locale.CHINA, "%02d:%02d", new Object[]{Long.valueOf(j6), Long.valueOf(j3)});
                    } else {
                        str = C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j3)});
                    }
                }
                musicModel.setLocalMusicDuration(str);
                musicModel.setDataType(1);
                list2.add(musicModel);
                arrayList.add(Long.valueOf(j));
            }
        }
        query.close();
        AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().infoService().audioLegal(list2, new C37379d(arrayList), new C37380e(iGetInfoCallback2, list2));
    }
}
