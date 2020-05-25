package com.p683ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.graphics.Color;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.common.widget.datepicker.NumberPicker.C26969b;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker */
public class DatePicker extends LinearLayout implements C26969b {

    /* renamed from: a */
    private NumberPicker f71054a;

    /* renamed from: b */
    private NumberPicker f71055b;

    /* renamed from: c */
    private NumberPicker f71056c;

    /* renamed from: d */
    private Calendar f71057d;

    /* renamed from: e */
    private Calendar f71058e;

    /* renamed from: f */
    private C26967a f71059f;

    /* renamed from: g */
    private LayoutInflater f71060g;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker$a */
    public interface C26967a {
    }

    public int getDayOfMonth() {
        return this.f71057d.get(5);
    }

    public int getYear() {
        return this.f71057d.get(1);
    }

    public int getMonth() {
        return this.f71057d.get(2) + 1;
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    public void setStartYear(int i) {
        this.f71054a.mo55083a(i);
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f71054a.setSoundEffectsEnabled(z);
        this.f71055b.setSoundEffectsEnabled(z);
        this.f71056c.setSoundEffectsEnabled(z);
    }

    /* renamed from: a */
    public final DatePicker mo55074a(Date date) {
        if (this.f71057d == null) {
            this.f71057d = Calendar.getInstance();
        }
        this.f71057d.setTime(date);
        this.f71054a.mo55087c(this.f71057d.get(1));
        if (this.f71057d.get(1) == Calendar.getInstance().get(1)) {
            this.f71055b.mo55086b(Calendar.getInstance().get(2) + 1);
        } else {
            this.f71055b.mo55086b(this.f71057d.getActualMaximum(2) + 1);
        }
        this.f71055b.mo55087c(this.f71057d.get(2) + 1);
        this.f71056c.mo55086b(this.f71057d.getActualMaximum(5));
        this.f71056c.mo55087c(this.f71057d.get(5));
        return this;
    }

    public void setUpperBoundDate(Calendar calendar) {
        this.f71058e = calendar;
        if (calendar != null) {
            this.f71054a.mo55086b(this.f71058e.get(1));
            if (this.f71057d.get(1) == this.f71058e.get(1)) {
                this.f71055b.mo55086b(this.f71058e.get(2) + 1);
                if (this.f71057d.get(2) == this.f71058e.get(2)) {
                    this.f71056c.mo55086b(this.f71058e.get(5));
                }
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f71054a.setEnabled(z);
        this.f71055b.setEnabled(z);
        this.f71056c.setEnabled(z);
        int c = C0726c.m2098c(getContext(), R.color.ji);
        int c2 = C0726c.m2098c(getContext(), R.color.j4);
        if (!z) {
            c = Color.argb((int) (((float) Color.alpha(c)) * 0.34f), Color.red(c), Color.green(c), Color.blue(c));
            c2 = Color.argb((int) (((float) Color.alpha(c2)) * 0.34f), Color.red(c2), Color.green(c2), Color.blue(c2));
        }
        this.f71054a.mo55089d(c);
        this.f71055b.mo55089d(c);
        this.f71056c.mo55089d(c);
        this.f71054a.mo55090e(c);
        this.f71055b.mo55090e(c);
        this.f71056c.mo55090e(c);
        this.f71054a.mo55091f(c2);
        this.f71055b.mo55091f(c2);
        this.f71056c.mo55091f(c2);
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71060g = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f71060g.inflate(R.layout.iv, this, true);
        this.f71054a = (NumberPicker) findViewById(R.id.dw2);
        this.f71055b = (NumberPicker) findViewById(R.id.bmx);
        this.f71056c = (NumberPicker) findViewById(R.id.a3i);
        this.f71054a.mo55084a((C26969b) this);
        this.f71055b.mo55084a((C26969b) this);
        this.f71056c.mo55084a((C26969b) this);
        if (!getResources().getConfiguration().locale.getCountry().equals("CN") && !getResources().getConfiguration().locale.getCountry().equals("TW")) {
            this.f71055b.mo55085a(getResources().getStringArray(R.array.a0));
        }
        this.f71057d = Calendar.getInstance();
        mo55074a(this.f71057d.getTime());
    }

    /* renamed from: a */
    public final void mo55075a(NumberPicker numberPicker, int i, int i2) {
        int i3;
        if (numberPicker == this.f71054a) {
            int i4 = this.f71057d.get(5);
            int i5 = this.f71057d.get(2);
            if (this.f71058e == null || i2 != this.f71058e.get(1)) {
                this.f71055b.mo55086b(this.f71057d.getActualMaximum(2) + 1);
            } else {
                if (i5 > this.f71058e.get(2)) {
                    i5 = this.f71058e.get(2);
                }
                this.f71055b.mo55086b(this.f71058e.get(2) + 1);
            }
            this.f71057d.set(i2, i5, 1);
            int actualMaximum = this.f71057d.getActualMaximum(5);
            if (this.f71058e != null && i2 == this.f71058e.get(1) && i5 == this.f71058e.get(2)) {
                i3 = this.f71058e.get(5);
            } else {
                i3 = actualMaximum;
            }
            if (i4 > i3) {
                i4 = i3;
            }
            this.f71057d.set(5, i4);
            this.f71056c.mo55086b(i3);
        } else if (numberPicker == this.f71055b) {
            int i6 = this.f71057d.get(5);
            int i7 = i2 - 1;
            this.f71057d.set(this.f71057d.get(1), i7, 1);
            int actualMaximum2 = this.f71057d.getActualMaximum(5);
            if (this.f71058e != null && this.f71057d.get(1) == this.f71058e.get(1) && i7 == this.f71058e.get(2)) {
                actualMaximum2 = this.f71058e.get(5);
            }
            if (i6 > actualMaximum2) {
                i6 = actualMaximum2;
            }
            this.f71057d.set(5, i6);
            this.f71056c.mo55086b(actualMaximum2);
        } else if (numberPicker == this.f71056c) {
            this.f71057d.set(5, i2);
        }
        if (this.f71059f != null) {
            getYear();
            getMonth();
            getDayOfMonth();
        }
    }
}
