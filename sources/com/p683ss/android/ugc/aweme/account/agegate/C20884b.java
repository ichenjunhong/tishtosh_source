package com.p683ss.android.ugc.aweme.account.agegate;

import android.content.Intent;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.C21636a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.utils.p2388b.C47705a.C47706a;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b */
public final class C20884b implements C47706a {

    /* renamed from: c */
    public static boolean f56852c = false;

    /* renamed from: d */
    private static String f56853d = "";

    /* renamed from: a */
    final int f56854a = 998;

    /* renamed from: b */
    public C20885a f56855b;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b$a */
    public interface C20885a {
        /* renamed from: a */
        void mo44781a();

        /* renamed from: a */
        void mo44782a(Exception exc);

        /* renamed from: b */
        void mo44783b();

        /* renamed from: c */
        void mo44784c();
    }

    /* renamed from: a */
    public static void m53199a() {
        f56852c = false;
    }

    /* renamed from: c */
    public static boolean m53202c() {
        if (C22282t.m55147d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m53201b() {
        boolean z;
        if (C22282t.m55151f().getInt("disable_age_gate", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !m53202c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m53200a(DatePicker datePicker) {
        Calendar instance = Calendar.getInstance();
        instance.set(6, instance.getActualMaximum(6));
        instance.add(1, -1);
        Date b = C21636a.m54342b();
        if (instance.getTime().before(b)) {
            instance = Calendar.getInstance();
            instance.set(b.getYear() + 1900, 11, 31);
        }
        datePicker.setUpperBoundDate(instance);
        datePicker.setNonRecurrentForYear(true);
        datePicker.mo44937a(b);
    }

    /* renamed from: a */
    public final void mo44816a(int i, int i2, Intent intent) {
        if (i == 998 && this.f56855b != null) {
            if (i2 == -1) {
                this.f56855b.mo44784c();
            } else if (i2 == 0) {
                this.f56855b.mo44783b();
            } else {
                this.f56855b.mo44782a(new Exception());
            }
        }
    }
}
