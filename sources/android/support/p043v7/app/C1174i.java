package android.support.p043v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p030v4.content.C0745i;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.util.Calendar;

/* renamed from: android.support.v7.app.i */
final class C1174i {

    /* renamed from: a */
    private static C1174i f3832a;

    /* renamed from: b */
    private final Context f3833b;

    /* renamed from: c */
    private final LocationManager f3834c;

    /* renamed from: d */
    private final C1175a f3835d = new C1175a();

    /* renamed from: android.support.v7.app.i$a */
    static class C1175a {

        /* renamed from: a */
        boolean f3836a;

        /* renamed from: b */
        long f3837b;

        /* renamed from: c */
        long f3838c;

        /* renamed from: d */
        long f3839d;

        /* renamed from: e */
        long f3840e;

        /* renamed from: f */
        long f3841f;

        C1175a() {
        }
    }

    /* renamed from: c */
    private boolean m3521c() {
        if (this.f3835d.f3841f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Location m3520b() {
        Location location;
        Location location2 = null;
        if (C0745i.m2143a(this.f3833b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m3517a("network");
        } else {
            location = null;
        }
        if (C0745i.m2143a(this.f3833b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m3517a("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3789a() {
        C1175a aVar = this.f3835d;
        if (m3521c()) {
            return aVar.f3836a;
        }
        Location b = m3520b();
        if (b != null) {
            m3519a(b);
            return aVar.f3836a;
        }
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Location m3517a(String str) {
        try {
            if (this.f3834c.isProviderEnabled(str)) {
                return this.f3834c.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    static C1174i m3518a(Context context) {
        if (f3832a == null) {
            Context applicationContext = context.getApplicationContext();
            f3832a = new C1174i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f3832a;
    }

    /* renamed from: a */
    private void m3519a(Location location) {
        boolean z;
        long j;
        long j2;
        C1175a aVar = this.f3835d;
        long currentTimeMillis = System.currentTimeMillis();
        C1173h a = C1173h.m3515a();
        C1173h hVar = a;
        hVar.mo3788a(currentTimeMillis - FbUploadTokenTime.group0, location.getLatitude(), location.getLongitude());
        long j3 = a.f3829a;
        hVar.mo3788a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (a.f3831c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j4 = a.f3830b;
        long j5 = a.f3829a;
        long j6 = FbUploadTokenTime.group0 + currentTimeMillis;
        long j7 = j3;
        long j8 = j5;
        long j9 = j6;
        long j10 = j4;
        boolean z2 = z;
        a.mo3788a(j9, location.getLatitude(), location.getLongitude());
        long j11 = a.f3830b;
        if (j10 == -1 || j8 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j8) {
                j2 = 0 + j11;
            } else if (currentTimeMillis > j10) {
                j2 = 0 + j8;
            } else {
                j2 = 0 + j10;
            }
            j = j2 + 60000;
        }
        aVar.f3836a = z2;
        aVar.f3837b = j7;
        aVar.f3838c = j10;
        aVar.f3839d = j8;
        aVar.f3840e = j11;
        aVar.f3841f = j;
    }

    private C1174i(Context context, LocationManager locationManager) {
        this.f3833b = context;
        this.f3834c = locationManager;
    }
}
