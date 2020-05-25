package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.EditText;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.db */
public abstract class C40317db extends C40303co {

    /* renamed from: k */
    public static final C40318a f102918k = new C40318a(null);

    /* renamed from: b */
    private HashMap f102919b;

    /* renamed from: j */
    public TextTitleBar f102920j;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.db$a */
    public static final class C40318a {
        private C40318a() {
        }

        public /* synthetic */ C40318a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.db$b */
    static final class C40319b implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C40317db f102921a;

        C40319b(C40317db dbVar) {
            this.f102921a = dbVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                C52711k.m112236a((Object) keyEvent, "e");
                if (keyEvent.getAction() == 1) {
                    this.f102921a.mo82269d();
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo82266a() {
        if (this.f102919b != null) {
            this.f102919b.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo82270e();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo82266a();
    }

    /* renamed from: d */
    public boolean mo82269d() {
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            C52711k.m112236a((Object) dialog, "dialog");
            if (dialog.isShowing() && isResumed()) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public void mo82337g() {
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(1.0f);
            }
        }
        TextTitleBar textTitleBar2 = this.f102920j;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setClickable(true);
            }
        }
    }

    /* renamed from: h */
    public void mo82338h() {
        TextTitleBar textTitleBar = this.f102920j;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(0.5f);
            }
        }
        TextTitleBar textTitleBar2 = this.f102920j;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setClickable(false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a7q);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnKeyListener(new C40319b(this));
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    protected static boolean m89662a(EditText editText, int i) {
        C52711k.m112240b(editText, "editText");
        Editable text = editText.getText();
        if (text.length() <= i) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String obj = text.toString();
        if (obj != null) {
            String substring = obj.substring(0, i);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            editText.setText(substring);
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}
