package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVAbstractLoadingLayout */
public class AVAbstractLoadingLayout extends FrameLayout {

    /* renamed from: a */
    private C50240a f125851a;

    /* renamed from: f */
    protected View f125852f;

    /* renamed from: g */
    protected View f125853g;

    /* renamed from: h */
    protected View f125854h;

    /* renamed from: i */
    protected View f125855i;

    /* renamed from: j */
    protected int f125856j;

    /* renamed from: com.ss.android.ugc.tools.view.widget.AVAbstractLoadingLayout$SavedState */
    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f125857a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f125857a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f125857a);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.AVAbstractLoadingLayout$a */
    public interface C50240a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo64547a(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* renamed from: a */
    public void mo64548a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo64550b(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo64551c(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f125857a = this.f125856j;
        return savedState;
    }

    public final void setListener(C50240a aVar) {
        this.f125851a = aVar;
    }

    public AVAbstractLoadingLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f125857a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f125856j;
            if (i2 != i) {
                this.f125856j = i;
                mo64548a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AVAbstractLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AVAbstractLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f125853g = mo64547a(context, attributeSet, i);
        this.f125854h = mo64550b(context, attributeSet, i);
        this.f125855i = mo64551c(context, attributeSet, i);
        if (this.f125853g != null) {
            addView(this.f125853g);
        }
        if (this.f125854h != null) {
            addView(this.f125854h);
        }
        if (this.f125855i != null) {
            addView(this.f125855i);
        }
        setState(0);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view == this.f125853g || view == this.f125854h || view == this.f125855i) {
            super.addView(view, i, layoutParams);
        } else if (getChildCount() <= 4) {
            super.addView(view, i, layoutParams);
            this.f125852f = view;
        } else {
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
    }
}
