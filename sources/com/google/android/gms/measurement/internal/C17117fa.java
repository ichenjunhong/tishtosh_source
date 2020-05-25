package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.fa */
final class C17117fa extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C17113ex f48330a;

    C17117fa(C17113ex exVar, Context context, String str) {
        this.f48330a = exVar;
        super(context, str, null, 1);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        C17086dy a = this.f48330a.f48324i;
        boolean z = true;
        if (a.f48224b != 0 && a.f48223a.mo28524b() - a.f48224b < 3600000) {
            z = false;
        }
        if (z) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f48330a.f48324i.mo33082a();
                this.f48330a.mo32854q().f48445b.mo33376a("Opening the database failed, dropping and recreating it");
                String str = "google_app_measurement.db";
                if (!this.f48330a.mo32850m().getDatabasePath(str).delete()) {
                    this.f48330a.mo32854q().f48445b.mo33377a("Failed to delete corrupted db file", str);
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f48330a.f48324i.f48224b = 0;
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f48330a.mo32854q().f48445b.mo33377a("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C17113ex.f48317a);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C17113ex.f48318c);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C17113ex.f48319d);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C17113ex.f48321f);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C17113ex.f48320e);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C17113ex.f48322g);
        C17118fb.m41868a(this.f48330a.mo32854q(), sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C17118fb.m41867a(this.f48330a.mo32854q(), sQLiteDatabase);
    }
}
