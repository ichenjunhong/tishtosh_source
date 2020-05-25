package com.p683ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout */
public class AbstractLoadingLayout extends FrameLayout {

    /* renamed from: a */
    protected View f70800a;

    /* renamed from: b */
    protected View f70801b;

    /* renamed from: c */
    protected View f70802c;

    /* renamed from: d */
    protected View f70803d;

    /* renamed from: e */
    protected int f70804e;

    /* renamed from: f */
    private C26925a f70805f;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout$SavedState */
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
        int f70806a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f70806a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f70806a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout$a */
    public interface C26925a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo54878a(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* renamed from: a */
    public void mo54879a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo54881b(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo54882c(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f70806a = this.f70804e;
        return savedState;
    }

    public final void setListener(C26925a aVar) {
        this.f70805f = aVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f70806a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f70804e;
            if (i2 != i) {
                this.f70804e = i;
                mo54879a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70801b = mo54878a(context, attributeSet, i);
        this.f70802c = mo54881b(context, attributeSet, i);
        this.f70803d = mo54882c(context, attributeSet, i);
        if (this.f70801b != null) {
            addView(this.f70801b);
        }
        if (this.f70802c != null) {
            addView(this.f70802c);
        }
        if (this.f70803d != null) {
            addView(this.f70803d);
        }
        setState(0);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view == this.f70801b || view == this.f70802c || view == this.f70803d) {
            super.addView(view, i, layoutParams);
        } else if (getChildCount() <= 4) {
            super.addView(view, i, layoutParams);
            this.f70800a = view;
        } else {
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
    }
}
