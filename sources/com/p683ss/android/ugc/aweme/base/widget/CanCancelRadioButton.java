package com.p683ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.RadioGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtRadioButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton */
public class CanCancelRadioButton extends DmtRadioButton {

    /* renamed from: a */
    public boolean f63268a = true;

    /* renamed from: b */
    public List<C23737a> f63269b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        boolean f63270a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            boolean z;
            super(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f63270a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f63270a ? 1 : 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$a */
    public interface C23737a {
        /* renamed from: a */
        boolean mo49171a(View view);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f63270a = this.f63268a;
        return savedState;
    }

    public void toggle() {
        for (C23737a a : this.f63269b) {
            if (!a.mo49171a(this)) {
                return;
            }
        }
        if (this.f63268a) {
            setChecked(!isChecked());
            if (!isChecked()) {
                ((RadioGroup) getParent()).clearCheck();
            }
        }
    }

    public void setCanChecked(boolean z) {
        this.f63268a = z;
    }

    public CanCancelRadioButton(Context context) {
        super(context);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCanChecked(savedState.f63270a);
    }

    public CanCancelRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CanCancelRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
