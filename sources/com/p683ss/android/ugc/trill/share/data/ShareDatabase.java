package com.p683ss.android.ugc.trill.share.data;

import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p014b.C0141e;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.p015a.C0128a;
import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;

/* renamed from: com.ss.android.ugc.trill.share.data.ShareDatabase */
public abstract class ShareDatabase extends C0142f {

    /* renamed from: g */
    private static volatile ShareDatabase f126495g;

    /* renamed from: h */
    private static final C0128a f126496h = new C0128a(1, 2) {
        /* renamed from: a */
        public final void mo213a(C0118b bVar) {
            bVar.mo180c("CREATE TABLE IF NOT EXISTS `quick_share_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mutual_follow_status` INTEGER NOT NULL, `friends_list` TEXT, `timestamp` INTEGER NOT NULL)");
            bVar.mo180c("CREATE TABLE IF NOT EXISTS `quick_share_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hashed_phone_number` TEXT NOT NULL, `created_time` INTEGER)");
            bVar.mo180c("CREATE UNIQUE INDEX `index_quick_share_history_hashed_phone_number` ON `quick_share_history` (`hashed_phone_number`)");
            bVar.mo180c("CREATE TRIGGER delete_oldest_record AFTER INSERT ON quick_share_history BEGIN DELETE FROM quick_share_history WHERE id NOT IN (SELECT id FROM quick_share_history ORDER BY created_time DESC LIMIT 10); END");
        }
    };

    /* renamed from: i */
    private static final C0128a f126497i = new C0128a(2, 3) {
        /* renamed from: a */
        public final void mo213a(C0118b bVar) {
            bVar.mo180c("DROP TABLE IF EXISTS `quick_share_data`");
            bVar.mo180c("DROP TABLE IF EXISTS `quick_share_history`");
        }
    };

    /* renamed from: g */
    public abstract C50449b mo98359g();

    /* renamed from: a */
    public static ShareDatabase m108764a(Context context) {
        boolean z;
        if (f126495g == null) {
            synchronized (ShareDatabase.class) {
                StringBuilder sb = new StringBuilder("Creating ShareDatabase instance, WRITE_EXTERNAL_STORAGE: ");
                if (C47946e.m103737c(context) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                C32458a.m75144a(sb.toString());
                try {
                    if (f126495g == null) {
                        f126495g = (ShareDatabase) C0141e.m302a(context.getApplicationContext(), ShareDatabase.class, "share.db").mo251a(f126496h, f126497i).mo250a().mo252b();
                    }
                } catch (Throwable th) {
                    StringBuilder sb2 = new StringBuilder("Error creating ShareDatabase: ");
                    sb2.append(th.toString());
                    C32458a.m75144a(sb2.toString());
                }
            }
        }
        return f126495g;
    }
}
