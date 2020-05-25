package com.p683ss.android.ugc.aweme.draft;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.android.livesdk.chatroom.p325ui.C6072db;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.draft.model.C29058b;
import com.p683ss.android.ugc.aweme.p2345t.C46775f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.c */
public class C29052c extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C29052c f76007a;

    private C29052c() {
        super(C39629l.m88233b().getApplicationContext(), "aweme.db", null, 20);
    }

    /* renamed from: a */
    public static C29052c m68397a() {
        if (f76007a == null) {
            synchronized (C29052c.class) {
                if (f76007a == null) {
                    f76007a = new C29052c();
                }
            }
        }
        return f76007a;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT\n);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C39629l.m88232a().mo58567E().mo49424a(e);
            C9432q.m18672a(C39629l.m88233b().getApplicationContext(), (int) R.string.f7m);
            System.exit(0);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        int i4 = i2;
        C39629l.m88232a().mo58593x().mo74279a(true);
        if (i3 == 1 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN effect INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN origin INTEGER");
        }
        if (i3 <= 2 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN face_beauty INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN user_id TEXT");
        }
        if (i3 <= 3 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN segment_video TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN segment_sdk TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN hard_encode INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN special_points INTEGER");
        }
        if (i3 <= 4 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sticker_path TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sticker_id TEXT");
        }
        if (i3 <= 5 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN music_id TEXT");
        }
        if (i3 <= 6 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN effect_list TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN camera_poi INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN filter_label TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN beauty_label INTEGER");
        }
        if (i3 <= 7 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN reverse_path TEXT");
        }
        if (i3 <= 8 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN music_effect TEXT");
        }
        if (i3 <= 9 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN video_speed TEXT");
        }
        if (i3 <= 10 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN music_effect_segments TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN is_private INTEGER");
        }
        if (i3 <= 11 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN max_duration INTEGER");
            sQLiteDatabase2.execSQL("UPDATE local_draft SET max_duration = 15000");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN audio_track TEXT");
        }
        if (i3 <= 12 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN new_version INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN output_wav_path TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN custom_cover_start FLOAT");
        }
        if (i3 <= 13 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN video_width INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN video_height INTEGER");
        }
        if (i3 <= 14 && i3 != i4) {
            sQLiteDatabase2.execSQL(" UPDATE local_draft SET video_width = 540 ");
            sQLiteDatabase2.execSQL(" UPDATE local_draft SET video_height = 960 ");
        }
        if (i3 <= 15 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN duet_from TEXT");
            C52711k.m112240b(sQLiteDatabase2, C6072db.f16229a);
        }
        if (i3 <= 16 && i3 != i4) {
            C52711k.m112240b(sQLiteDatabase2, C6072db.f16229a);
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN sync_platforms TEXT");
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN photo_movie TEXT");
        }
        if (i3 <= 17 && i3 != i4) {
            sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
        }
        if (i3 <= 18 && i3 != i4) {
            sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN draft_extras TEXT");
            C29058b bVar = new C29058b();
            bVar.f76060a = 1;
            bVar.f76098b = 3;
            String b = C39629l.m88232a().mo58566D().mo34889b(bVar);
            StringBuilder sb = new StringBuilder(" UPDATE local_draft SET draft_extras = '");
            sb.append(b);
            sb.append("'");
            sQLiteDatabase2.execSQL(sb.toString());
        }
        C52711k.m112240b(sQLiteDatabase2, C6072db.f16229a);
        if (i3 <= 19 && i3 != i4) {
            sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
        }
        if (i3 <= 19 && i3 != i4) {
            C29058b bVar2 = new C29058b(0, 0, null, null, 0, false, false, 0, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, false, null, null, null, null, null, 0, 0, 0.0f, null, 0, false, null, false, null, false, null, null, null, null, null, false, 0, null, null, null, false, null, null, null, null, -1, -1, 33554431, null);
            bVar2.f76060a = 1;
            bVar2.f76098b = 3;
            String b2 = C39629l.m88232a().mo58566D().mo34889b(bVar2);
            C52711k.m112236a((Object) b2, "CameraClient.getAPI().getGson().toJson(extras)");
            if (!C46775f.m101580a(sQLiteDatabase2, "local_draft", "draft_extras")) {
                sQLiteDatabase2.execSQL("ALTER TABLE local_draft ADD COLUMN draft_extras TEXT");
                StringBuilder sb2 = new StringBuilder(" UPDATE local_draft SET draft_extras = '");
                sb2.append(b2);
                sb2.append("'");
                sQLiteDatabase2.execSQL(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder(" UPDATE local_draft SET draft_extras = '");
            sb3.append(b2);
            sb3.append("' WHERE draft_extras");
            sb3.append(" IS NULL");
            sQLiteDatabase2.execSQL(sb3.toString());
        }
    }
}
