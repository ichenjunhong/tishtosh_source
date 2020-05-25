package androidx.work.impl;

import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0119c;
import android.arch.p011c.p012a.C0119c.C0120a;
import android.arch.p011c.p012a.C0119c.C0121b;
import android.arch.p011c.p014b.C0127a;
import android.arch.p011c.p014b.C0137d;
import android.arch.p011c.p014b.C0142f.C0144b;
import android.arch.p011c.p014b.C0148h;
import android.arch.p011c.p014b.C0148h.C0149a;
import android.arch.p011c.p014b.p016b.C0131b;
import android.arch.p011c.p014b.p016b.C0131b.C0132a;
import android.arch.p011c.p014b.p016b.C0131b.C0133b;
import android.arch.p011c.p014b.p016b.C0131b.C0135d;
import androidx.work.impl.p056b.C1575b;
import androidx.work.impl.p056b.C1576c;
import androidx.work.impl.p056b.C1579e;
import androidx.work.impl.p056b.C1580f;
import androidx.work.impl.p056b.C1585h;
import androidx.work.impl.p056b.C1586i;
import androidx.work.impl.p056b.C1597k;
import androidx.work.impl.p056b.C1598l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import leakcanary.internal.LeakCanaryFileProvider;

public class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: h */
    private volatile C1585h f5545h;

    /* renamed from: i */
    private volatile C1575b f5546i;

    /* renamed from: j */
    private volatile C1597k f5547j;

    /* renamed from: k */
    private volatile C1579e f5548k;

    /* renamed from: g */
    public final C1585h mo5929g() {
        C1585h hVar;
        if (this.f5545h != null) {
            return this.f5545h;
        }
        synchronized (this) {
            if (this.f5545h == null) {
                this.f5545h = new C1586i(this);
            }
            hVar = this.f5545h;
        }
        return hVar;
    }

    /* renamed from: h */
    public final C1575b mo5930h() {
        C1575b bVar;
        if (this.f5546i != null) {
            return this.f5546i;
        }
        synchronized (this) {
            if (this.f5546i == null) {
                this.f5546i = new C1576c(this);
            }
            bVar = this.f5546i;
        }
        return bVar;
    }

    /* renamed from: i */
    public final C1597k mo5931i() {
        C1597k kVar;
        if (this.f5547j != null) {
            return this.f5547j;
        }
        synchronized (this) {
            if (this.f5547j == null) {
                this.f5547j = new C1598l(this);
            }
            kVar = this.f5547j;
        }
        return kVar;
    }

    /* renamed from: j */
    public final C1579e mo5932j() {
        C1579e eVar;
        if (this.f5548k != null) {
            return this.f5548k;
        }
        synchronized (this) {
            if (this.f5548k == null) {
                this.f5548k = new C1580f(this);
            }
            eVar = this.f5548k;
        }
        return eVar;
    }

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(4) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `Dependency`");
                bVar.mo180c("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.mo180c("DROP TABLE IF EXISTS `WorkTag`");
                bVar.mo180c("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.mo180c("DROP TABLE IF EXISTS `WorkName`");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (WorkDatabase_Impl.this.f354e != null) {
                    int size = WorkDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo180c("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                bVar.mo180c("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                bVar.mo180c("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo180c("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo180c("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c45e5fcbdf3824dead9778f19e2fd8af\")");
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                WorkDatabase_Impl.this.f350a = bVar;
                bVar.mo180c("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.mo242a(bVar);
                if (WorkDatabase_Impl.this.f354e != null) {
                    int size = WorkDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) WorkDatabase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                C0118b bVar2 = bVar;
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new C0132a("work_spec_id", "TEXT", true, 1));
                hashMap.put("prerequisite_id", new C0132a("prerequisite_id", "TEXT", true, 2));
                HashSet hashSet = new HashSet(2);
                C0133b bVar3 = new C0133b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                hashSet.add(bVar3);
                C0133b bVar4 = new C0133b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"}));
                hashSet.add(bVar4);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C0135d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                hashSet2.add(new C0135d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
                C0131b bVar5 = new C0131b("Dependency", hashMap, hashSet, hashSet2);
                C0131b a = C0131b.m285a(bVar2, "Dependency");
                if (bVar5.equals(a)) {
                    HashMap hashMap2 = new HashMap(21);
                    hashMap2.put("id", new C0132a("id", "TEXT", true, 1));
                    hashMap2.put("state", new C0132a("state", "INTEGER", true, 0));
                    hashMap2.put("worker_class_name", new C0132a("worker_class_name", "TEXT", true, 0));
                    hashMap2.put("input_merger_class_name", new C0132a("input_merger_class_name", "TEXT", false, 0));
                    hashMap2.put("input", new C0132a("input", "BLOB", true, 0));
                    hashMap2.put("output", new C0132a("output", "BLOB", true, 0));
                    hashMap2.put("initial_delay", new C0132a("initial_delay", "INTEGER", true, 0));
                    hashMap2.put("interval_duration", new C0132a("interval_duration", "INTEGER", true, 0));
                    hashMap2.put("flex_duration", new C0132a("flex_duration", "INTEGER", true, 0));
                    hashMap2.put("run_attempt_count", new C0132a("run_attempt_count", "INTEGER", true, 0));
                    hashMap2.put("backoff_policy", new C0132a("backoff_policy", "INTEGER", true, 0));
                    hashMap2.put("backoff_delay_duration", new C0132a("backoff_delay_duration", "INTEGER", true, 0));
                    hashMap2.put("period_start_time", new C0132a("period_start_time", "INTEGER", true, 0));
                    hashMap2.put("minimum_retention_duration", new C0132a("minimum_retention_duration", "INTEGER", true, 0));
                    hashMap2.put("schedule_requested_at", new C0132a("schedule_requested_at", "INTEGER", true, 0));
                    hashMap2.put("required_network_type", new C0132a("required_network_type", "INTEGER", false, 0));
                    hashMap2.put("requires_charging", new C0132a("requires_charging", "INTEGER", true, 0));
                    hashMap2.put("requires_device_idle", new C0132a("requires_device_idle", "INTEGER", true, 0));
                    hashMap2.put("requires_battery_not_low", new C0132a("requires_battery_not_low", "INTEGER", true, 0));
                    hashMap2.put("requires_storage_not_low", new C0132a("requires_storage_not_low", "INTEGER", true, 0));
                    hashMap2.put("content_uri_triggers", new C0132a("content_uri_triggers", "BLOB", false, 0));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(new C0135d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
                    C0131b bVar6 = new C0131b("WorkSpec", hashMap2, hashSet3, hashSet4);
                    C0131b a2 = C0131b.m285a(bVar2, "WorkSpec");
                    if (bVar6.equals(a2)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new C0132a("tag", "TEXT", true, 1));
                        hashMap3.put("work_spec_id", new C0132a("work_spec_id", "TEXT", true, 2));
                        HashSet hashSet5 = new HashSet(1);
                        C0133b bVar7 = new C0133b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                        hashSet5.add(bVar7);
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new C0135d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                        C0131b bVar8 = new C0131b("WorkTag", hashMap3, hashSet5, hashSet6);
                        C0131b a3 = C0131b.m285a(bVar2, "WorkTag");
                        if (bVar8.equals(a3)) {
                            HashMap hashMap4 = new HashMap(2);
                            hashMap4.put("work_spec_id", new C0132a("work_spec_id", "TEXT", true, 1));
                            hashMap4.put("system_id", new C0132a("system_id", "INTEGER", true, 0));
                            HashSet hashSet7 = new HashSet(1);
                            C0133b bVar9 = new C0133b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                            hashSet7.add(bVar9);
                            C0131b bVar10 = new C0131b("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            C0131b a4 = C0131b.m285a(bVar2, "SystemIdInfo");
                            if (bVar10.equals(a4)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put(LeakCanaryFileProvider.f132049i, new C0132a(LeakCanaryFileProvider.f132049i, "TEXT", true, 1));
                                hashMap5.put("work_spec_id", new C0132a("work_spec_id", "TEXT", true, 2));
                                HashSet hashSet8 = new HashSet(1);
                                C0133b bVar11 = new C0133b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                                hashSet8.add(bVar11);
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new C0135d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                                C0131b bVar12 = new C0131b("WorkName", hashMap5, hashSet8, hashSet9);
                                C0131b a5 = C0131b.m285a(bVar2, "WorkName");
                                if (!bVar12.equals(a5)) {
                                    StringBuilder sb = new StringBuilder("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                                    sb.append(bVar12);
                                    sb.append("\n Found:\n");
                                    sb.append(a5);
                                    throw new IllegalStateException(sb.toString());
                                }
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                            sb2.append(bVar10);
                            sb2.append("\n Found:\n");
                            sb2.append(a4);
                            throw new IllegalStateException(sb2.toString());
                        }
                        StringBuilder sb3 = new StringBuilder("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                        sb3.append(bVar8);
                        sb3.append("\n Found:\n");
                        sb3.append(a3);
                        throw new IllegalStateException(sb3.toString());
                    }
                    StringBuilder sb4 = new StringBuilder("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sb4.append(bVar6);
                    sb4.append("\n Found:\n");
                    sb4.append(a2);
                    throw new IllegalStateException(sb4.toString());
                }
                StringBuilder sb5 = new StringBuilder("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                sb5.append(bVar5);
                sb5.append("\n Found:\n");
                sb5.append(a);
                throw new IllegalStateException(sb5.toString());
            }
        }, "c45e5fcbdf3824dead9778f19e2fd8af", "433431a854c108416da77d9b397eaeec")).mo212a());
    }
}
