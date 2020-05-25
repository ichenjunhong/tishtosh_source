package com.p683ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.C20943b;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker */
public class DatePicker extends LinearLayout implements C20943b {

    /* renamed from: a */
    private NumberPicker f56973a;

    /* renamed from: b */
    private NumberPicker f56974b;

    /* renamed from: c */
    private NumberPicker f56975c;

    /* renamed from: d */
    private Calendar f56976d;

    /* renamed from: e */
    private Calendar f56977e;

    /* renamed from: f */
    private C20941a f56978f;

    /* renamed from: g */
    private LayoutInflater f56979g;

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker$a */
    public interface C20941a {
        /* renamed from: a */
        void mo44800a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar);
    }

    public int getDayOfMonth() {
        return this.f56976d.get(5);
    }

    public int getYear() {
        return this.f56976d.get(1);
    }

    public int getMonth() {
        return this.f56976d.get(2) + 1;
    }

    /* renamed from: a */
    public final DatePicker mo44936a(C20941a aVar) {
        this.f56978f = aVar;
        return this;
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    public void setNonRecurrentForYear(boolean z) {
        this.f56973a.setNonRecurrent(z);
    }

    public void setStartYear(int i) {
        this.f56973a.mo44946a(i);
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f56973a.setSoundEffectsEnabled(z);
        this.f56974b.setSoundEffectsEnabled(z);
        this.f56975c.setSoundEffectsEnabled(z);
    }

    /* renamed from: a */
    public final DatePicker mo44937a(Date date) {
        if (this.f56976d == null) {
            this.f56976d = Calendar.getInstance();
        }
        this.f56976d.setTime(date);
        this.f56975c.mo44949b(this.f56976d.getActualMaximum(5));
        this.f56973a.mo44950c(this.f56976d.get(1));
        this.f56974b.mo44950c(this.f56976d.get(2) + 1);
        this.f56975c.mo44950c(this.f56976d.get(5));
        return this;
    }

    public void setUpperBoundDate(Calendar calendar) {
        this.f56977e = calendar;
        if (calendar != null) {
            this.f56973a.mo44949b(this.f56977e.get(1));
            if (this.f56976d.get(1) == this.f56977e.get(1)) {
                this.f56974b.mo44949b(this.f56977e.get(2) + 1);
                if (this.f56976d.get(2) == this.f56977e.get(2)) {
                    this.f56975c.mo44949b(this.f56977e.get(5));
                }
            }
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56979g = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f56979g.inflate(R.layout.ayg, this, true);
        this.f56973a = (NumberPicker) findViewById(R.id.dw2);
        this.f56974b = (NumberPicker) findViewById(R.id.bmx);
        this.f56975c = (NumberPicker) findViewById(R.id.a3i);
        this.f56973a.mo44947a((C20943b) this);
        this.f56974b.mo44947a((C20943b) this);
        this.f56975c.mo44947a((C20943b) this);
        if (!getResources().getConfiguration().locale.getCountry().equals("CN") && !getResources().getConfiguration().locale.getCountry().equals("TW")) {
            this.f56974b.mo44948a(getResources().getStringArray(R.array.a0));
        }
        this.f56976d = Calendar.getInstance();
        mo44937a(this.f56976d.getTime());
    }

    /* renamed from: a */
    public final void mo44938a(NumberPicker numberPicker, int i, int i2) {
        int i3;
        if (numberPicker == this.f56973a) {
            int i4 = this.f56976d.get(5);
            int i5 = this.f56976d.get(2);
            if (this.f56977e == null || i2 != this.f56977e.get(1)) {
                this.f56974b.mo44949b(this.f56976d.getActualMaximum(2) + 1);
            } else {
                if (i5 > this.f56977e.get(2)) {
                    i5 = this.f56977e.get(2);
                }
                this.f56974b.mo44949b(this.f56977e.get(2) + 1);
            }
            this.f56976d.set(i2, i5, 1);
            int actualMaximum = this.f56976d.getActualMaximum(5);
            if (this.f56977e != null && i2 == this.f56977e.get(1) && i5 == this.f56977e.get(2)) {
                i3 = this.f56977e.get(5);
            } else {
                i3 = actualMaximum;
            }
            if (i4 > i3) {
                i4 = i3;
            }
            this.f56976d.set(5, i4);
            this.f56975c.mo44949b(i3);
        } else if (numberPicker == this.f56974b) {
            int i6 = this.f56976d.get(5);
            int i7 = i2 - 1;
            this.f56976d.set(this.f56976d.get(1), i7, 1);
            int actualMaximum2 = this.f56976d.getActualMaximum(5);
            if (this.f56977e != null && this.f56976d.get(1) == this.f56977e.get(1) && i7 == this.f56977e.get(2)) {
                actualMaximum2 = this.f56977e.get(5);
            }
            if (i6 > actualMaximum2) {
                i6 = actualMaximum2;
            }
            this.f56976d.set(5, i6);
            this.f56975c.mo44949b(actualMaximum2);
        } else if (numberPicker == this.f56975c) {
            this.f56976d.set(5, i2);
        }
        if (this.f56978f != null) {
            this.f56978f.mo44800a(this, getYear(), getMonth(), getDayOfMonth(), this.f56976d);
        }
    }
}
