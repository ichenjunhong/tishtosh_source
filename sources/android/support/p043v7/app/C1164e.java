package android.support.p043v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.view.C1040f;
import android.support.p030v4.view.C1040f.C1041a;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.C1218b.C1219a;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.app.e */
public class C1164e extends Dialog implements C1162c {

    /* renamed from: a */
    private C1163d f3811a;

    /* renamed from: b */
    private final C1041a f3812b;

    public void onSupportActionModeFinished(C1218b bVar) {
    }

    public void onSupportActionModeStarted(C1218b bVar) {
    }

    public C1218b onWindowStartingSupportActionMode(C1219a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        mo42942b().mo3686f();
    }

    /* renamed from: b */
    private C1163d mo42942b() {
        if (this.f3811a == null) {
            this.f3811a = C1163d.m3463a((Dialog) this, (C1162c) this);
        }
        return this.f3811a;
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo42942b().mo3682d();
    }

    public C1164e(Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3776a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setContentView(int i) {
        mo42942b().mo3675b(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1040f.m2974a(this.f3812b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo42942b().mo3663a(i);
    }

    public void setContentView(View view) {
        mo42942b().mo3669a(view);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo42942b().mo3671a(charSequence);
    }

    /* renamed from: b */
    public final boolean mo3778b(int i) {
        return mo42942b().mo3681c(1);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo42942b().mo3691i();
        super.onCreate(bundle);
        mo42942b().mo3666a(bundle);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo42942b().mo3671a((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo42942b().mo3678b(view, layoutParams);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo42942b().mo3670a(view, layoutParams);
    }

    public C1164e(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.jp, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        this.f3812b = new C1041a() {
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return C1164e.this.mo3776a(keyEvent);
            }
        };
        mo42942b().mo3666a((Bundle) null);
        mo42942b().mo3692j();
    }
}
