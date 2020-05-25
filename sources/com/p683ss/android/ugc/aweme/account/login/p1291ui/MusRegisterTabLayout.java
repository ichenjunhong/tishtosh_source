package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusRegisterTabLayout */
public class MusRegisterTabLayout extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private DmtButton f58404a;

    /* renamed from: b */
    private DmtButton f58405b;

    /* renamed from: c */
    private C21535a f58406c;

    /* renamed from: d */
    private int f58407d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusRegisterTabLayout$SavedState */
    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f58408a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f58408a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f58408a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58408a = parcel.readInt();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusRegisterTabLayout$a */
    public interface C21535a {
        /* renamed from: a */
        void mo45455a();

        /* renamed from: b */
        void mo45456b();
    }

    public int getCurrentPage() {
        return this.f58407d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f58408a = this.f58407d;
        return savedState;
    }

    /* renamed from: a */
    private void m54213a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b09, this, true);
        this.f58404a = (DmtButton) inflate.findViewById(R.id.oq);
        this.f58405b = (DmtButton) inflate.findViewById(R.id.nq);
        this.f58404a.setOnClickListener(this);
        this.f58405b.setOnClickListener(this);
        this.f58404a.setSelected(true);
        this.f58405b.setSelected(false);
        this.f58404a.setTextColor(getContext().getResources().getColor(R.color.a7x));
        this.f58405b.setTextColor(getContext().getResources().getColor(R.color.a82));
    }

    public void setListener(C21535a aVar) {
        this.f58406c = aVar;
    }

    public MusRegisterTabLayout(Context context) {
        super(context);
        m54213a();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.oq) {
            setCurrentPage(0);
            return;
        }
        if (id == R.id.nq) {
            setCurrentPage(1);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setCurrentPageWithoutClick(savedState.f58408a);
        if (this.f58406c != null) {
            switch (savedState.f58408a) {
                case 0:
                    this.f58406c.mo45455a();
                    break;
                case 1:
                    this.f58406c.mo45456b();
                    break;
            }
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public void setCurrentPage(int i) {
        this.f58407d = i;
        if (i == 0) {
            this.f58404a.setSelected(true);
            this.f58405b.setSelected(false);
            this.f58404a.setTextColor(getContext().getResources().getColor(R.color.a7x));
            this.f58405b.setTextColor(getContext().getResources().getColor(R.color.a82));
            if (this.f58406c != null) {
                this.f58406c.mo45455a();
            }
        } else if (i == 1) {
            this.f58404a.setSelected(false);
            this.f58405b.setSelected(true);
            this.f58404a.setTextColor(getContext().getResources().getColor(R.color.a82));
            this.f58405b.setTextColor(getContext().getResources().getColor(R.color.a7x));
            this.f58407d = 1;
            if (this.f58406c != null) {
                this.f58406c.mo45456b();
            }
        }
    }

    public void setCurrentPageWithoutClick(int i) {
        this.f58407d = i;
        if (i == 0) {
            this.f58404a.setSelected(true);
            this.f58405b.setSelected(false);
            this.f58404a.setTextColor(getContext().getResources().getColor(R.color.a7x));
            this.f58405b.setTextColor(getContext().getResources().getColor(R.color.a82));
            return;
        }
        if (i == 1) {
            this.f58404a.setSelected(false);
            this.f58405b.setSelected(true);
            this.f58404a.setTextColor(getContext().getResources().getColor(R.color.a82));
            this.f58405b.setTextColor(getContext().getResources().getColor(R.color.a7x));
            this.f58407d = 1;
        }
    }

    public MusRegisterTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54213a();
    }

    public MusRegisterTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m54213a();
    }
}
