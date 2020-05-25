package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a.C29407a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.Range;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText */
public class MentionEditText extends DmtEditText {

    /* renamed from: b */
    public static final C33723a f87480b = new C33723a(null);

    /* renamed from: a */
    public OnKeyListener f87481a;

    /* renamed from: c */
    private C33727e f87482c;

    /* renamed from: d */
    private final C29406a f87483d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$a */
    public static final class C33723a {
        private C33723a() {
        }

        public /* synthetic */ C33723a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$b */
    final class C33724b extends InputConnectionWrapper {

        /* renamed from: a */
        public final MentionEditText f87484a;

        /* renamed from: b */
        final /* synthetic */ MentionEditText f87485b;

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            boolean z;
            C52711k.m112240b(keyEvent, "event");
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                z = this.f87484a.mo71759a();
                if (z) {
                    OnKeyListener onKeyListener = this.f87485b.f87481a;
                    if (onKeyListener != null) {
                        onKeyListener.onKey(this.f87484a, keyEvent.getKeyCode(), keyEvent);
                    }
                }
            } else {
                z = false;
            }
            if (z || super.sendKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            boolean z;
            if (i == 1 && i2 == 0) {
                z = this.f87484a.mo71759a();
            } else {
                z = false;
            }
            if (z || super.deleteSurroundingText(i, i2)) {
                return true;
            }
            return false;
        }

        public C33724b(MentionEditText mentionEditText, InputConnection inputConnection, boolean z, MentionEditText mentionEditText2) {
            C52711k.m112240b(inputConnection, "target");
            C52711k.m112240b(mentionEditText2, "editText");
            this.f87485b = mentionEditText;
            super(inputConnection, true);
            this.f87484a = mentionEditText2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$c */
    public final class C33725c {

        /* renamed from: a */
        public int f87486a;

        /* renamed from: b */
        public String f87487b;

        /* renamed from: c */
        public String f87488c;

        /* renamed from: d */
        public Range f87489d;

        public final int hashCode() {
            int i;
            int i2;
            String str = this.f87487b;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.f87488c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f87486a) * 31;
            Range range = this.f87489d;
            if (range != null) {
                i3 = range.hashCode();
            }
            return i5 + i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33725c)) {
                return false;
            }
            C33725c cVar = (C33725c) obj;
            if (this.f87486a != cVar.f87486a || !C52711k.m112239a((Object) this.f87488c, (Object) cVar.f87488c) || !C52711k.m112239a((Object) this.f87487b, (Object) cVar.f87487b) || !C52711k.m112239a((Object) this.f87489d, (Object) cVar.f87489d)) {
                return false;
            }
            return true;
        }

        public C33725c(String str, String str2, int i) {
            this.f87487b = str2;
            this.f87488c = str;
            this.f87486a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$d */
    final class C33726d implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
            C52711k.m112240b(editable, "editable");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "charSequence");
        }

        public C33726d() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "charSequence");
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i)) {
                C33727e mOnMentionInputListener = MentionEditText.this.getMOnMentionInputListener();
                if (mOnMentionInputListener != null) {
                    mOnMentionInputListener.mo70665a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$e */
    public interface C33727e {
        /* renamed from: a */
        void mo70665a();
    }

    public MentionEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C33727e getMOnMentionInputListener() {
        return this.f87482c;
    }

    private final List<C33725c> getMentionSpans() {
        Editable text = getText();
        List<C33725c> list = null;
        if (text != null) {
            C33725c[] cVarArr = (C33725c[]) text.getSpans(0, text.length(), C33725c.class);
            if (cVarArr != null) {
                list = C52568f.m112084e(cVarArr);
            }
            if (list != null) {
                for (C33725c cVar : list) {
                    cVar.f87489d = new Range(text.getSpanStart(cVar), text.getSpanEnd(cVar));
                }
            }
        }
        return list;
    }

    public final List<String> getMentionIds() {
        List mentionSpans = getMentionSpans();
        if (mentionSpans == null) {
            return null;
        }
        Iterable<C33725c> iterable = mentionSpans;
        Collection arrayList = new ArrayList();
        for (C33725c cVar : iterable) {
            String str = cVar.f87487b;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public final boolean mo71759a() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionEnd != selectionStart) {
            return false;
        }
        C33725c a = m77231a(selectionStart, selectionEnd);
        if (a == null) {
            return false;
        }
        Range range = a.f87489d;
        if (range != null) {
            Editable text = getText();
            if (text != null) {
                text.delete(range.getFrom(), range.getTo());
            }
        }
        return true;
    }

    public final void setMOnMentionInputListener(C33727e eVar) {
        this.f87482c = eVar;
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f87481a = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C52711k.m112236a((Object) onCreateInputConnection, "super.onCreateInputConnection(outAttrs)");
        return new C33724b(this, onCreateInputConnection, true, this);
    }

    /* renamed from: a */
    public final boolean mo71760a(String str) {
        C52711k.m112240b(str, "emojiText");
        if (getEditableText() == null) {
            return false;
        }
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            StringBuilder sb = new StringBuilder("addEmojiText index invalid: ");
            sb.append(selectionStart);
            C35459a.m80151c("MentionEditText", sb.toString());
            return false;
        }
        SpannableString spannableString = new SpannableString(str);
        Drawable a = this.f87483d.mo59400a(getContext(), str);
        if (a != null) {
            int lineHeight = getLineHeight();
            a.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a.getIntrinsicWidth()) + 0.0f) / ((float) a.getIntrinsicHeight()))) + 0.5f), lineHeight);
            spannableString.setSpan(new C10674a(a), 0, spannableString.length(), 33);
        }
        Editable text = getText();
        if (text != null) {
            text.insert(selectionStart, spannableString);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo71761a(String str, String str2) {
        C52711k.m112240b(str, "nickname");
        C52711k.m112240b(str2, "uid");
        return m77232a(0, str, str2);
    }

    /* renamed from: a */
    private final C33725c m77231a(int i, int i2) {
        List<C33725c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            for (C33725c cVar : mentionSpans) {
                Range range = cVar.f87489d;
                if (range != null && range.contains(i, i2)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSelectionChanged(int r4, int r5) {
        /*
            r3 = this;
            super.onSelectionChanged(r4, r5)
            java.util.List r0 = r3.getMentionSpans()
            if (r0 == 0) goto L_0x0026
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$c r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.MentionEditText.C33725c) r1
            com.ss.android.ugc.aweme.im.sdk.chat.model.Range r2 = r1.f87489d
            if (r2 == 0) goto L_0x000f
            boolean r2 = r2.isWrappedBy(r4, r5)
            if (r2 == 0) goto L_0x000f
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            if (r1 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.im.sdk.chat.model.Range r0 = r1.f87489d
            if (r0 == 0) goto L_0x0053
            if (r4 != r5) goto L_0x0037
            int r4 = r0.getAnchorPosition(r4)     // Catch:{ Exception -> 0x0052 }
            r3.setSelection(r4)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0037:
            int r1 = r0.getTo()     // Catch:{ Exception -> 0x0052 }
            if (r5 >= r1) goto L_0x0044
            int r1 = r0.getTo()     // Catch:{ Exception -> 0x0052 }
            r3.setSelection(r4, r1)     // Catch:{ Exception -> 0x0052 }
        L_0x0044:
            int r1 = r0.getFrom()     // Catch:{ Exception -> 0x0052 }
            if (r4 <= r1) goto L_0x0058
            int r4 = r0.getFrom()     // Catch:{ Exception -> 0x0052 }
            r3.setSelection(r4, r5)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            return
        L_0x0053:
            if (r4 != r5) goto L_0x0058
            r3.setSelection(r4)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.MentionEditText.onSelectionChanged(int, int):void");
    }

    public MentionEditText(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f87483d = C29407a.m69339a(context);
        Context context2 = getContext();
        boolean z = false;
        if (context2 != null && VERSION.SDK_INT >= 17) {
            Resources resources = context2.getResources();
            C52711k.m112236a((Object) resources, "resources");
            Configuration configuration = resources.getConfiguration();
            C52711k.m112236a((Object) configuration, "configuration");
            if (configuration.getLayoutDirection() == 1) {
                z = true;
            }
        }
        if (z) {
            if (VERSION.SDK_INT >= 17) {
                setTextAlignment(5);
            }
            setGravity(getGravity() | 8388611);
        }
        addTextChangedListener(new C33726d());
    }

    /* renamed from: a */
    private final boolean m77232a(int i, String str, String str2) {
        boolean z = false;
        if (getEditableText() == null) {
            return false;
        }
        int selectionStart = getSelectionStart();
        String str3 = "@";
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(str);
        sb.append(' ');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new C33725c(spannableString.toString(), str2, 0), 0, spannableString.length(), 33);
        Editable editableText = getEditableText();
        C52711k.m112236a((Object) editableText, "editableText");
        if (editableText.length() > 0) {
            z = true;
        }
        if (z) {
            int length = getEditableText().length();
            if (selectionStart > 0 && length >= selectionStart) {
                int i2 = selectionStart - 1;
                if (TextUtils.equals(getEditableText().subSequence(i2, selectionStart), str3)) {
                    Editable text = getText();
                    if (text != null) {
                        text.delete(i2, selectionStart);
                    }
                    selectionStart--;
                }
            }
        }
        Editable text2 = getText();
        if (text2 != null) {
            text2.insert(selectionStart, spannableString);
        }
        return true;
    }

    public /* synthetic */ MentionEditText(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
