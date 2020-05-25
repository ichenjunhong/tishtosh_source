package android.support.design.widget;

import android.content.Context;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p043v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import com.ss.android.ugc.trill.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f1664a = {16842912};

    /* renamed from: b */
    private boolean f1665b;

    public boolean isChecked() {
        return this.f1665b;
    }

    public void toggle() {
        setChecked(!this.f1665b);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public void setChecked(boolean z) {
        if (this.f1665b != z) {
            this.f1665b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f1665b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f1664a.length), f1664a);
        }
        return super.onCreateDrawableState(i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.oa);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1056u.m3031a((View) this, (C1002a) new C1002a() {
            /* renamed from: a */
            public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
                super.mo1322a(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            /* renamed from: a */
            public final void mo1119a(View view, C1008c cVar) {
                super.mo1119a(view, cVar);
                cVar.mo3135a(true);
                cVar.f3230a.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }
}
