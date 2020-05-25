package androidx.work.impl;

import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p014b.p015a.C0128a;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.utils.C1652c;

/* renamed from: androidx.work.impl.e */
public final class C1622e {

    /* renamed from: a */
    public static C0128a f5696a = new C0128a(1, 2) {
        /* renamed from: a */
        public final void mo213a(C0118b bVar) {
            bVar.mo180c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo180c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo180c("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo180c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };

    /* renamed from: b */
    public static C0128a f5697b = new C0128a(3, 4) {
        /* renamed from: a */
        public final void mo213a(C0118b bVar) {
            if (VERSION.SDK_INT >= 23) {
                bVar.mo180c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };

    /* renamed from: androidx.work.impl.e$a */
    public static class C1625a extends C0128a {

        /* renamed from: c */
        final Context f5698c;

        /* renamed from: a */
        public final void mo213a(C0118b bVar) {
            new C1652c(this.f5698c).mo6067a(true);
        }

        public C1625a(Context context, int i, int i2) {
            super(2, 3);
            this.f5698c = context;
        }
    }
}
