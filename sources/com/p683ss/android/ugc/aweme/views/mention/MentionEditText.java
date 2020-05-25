package com.p683ss.android.ugc.aweme.views.mention;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.BaseSavedState;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText */
public class MentionEditText extends DmtEditText {

    /* renamed from: a */
    private Runnable f121316a;

    /* renamed from: e */
    protected int f121317e;

    /* renamed from: f */
    protected int f121318f;

    /* renamed from: g */
    public boolean f121319g;

    /* renamed from: h */
    public C48215b f121320h;

    /* renamed from: i */
    protected List<C48215b> f121321i;

    /* renamed from: j */
    public C48212c f121322j;

    /* renamed from: k */
    protected List<TextWatcher> f121323k = new ArrayList();

    /* renamed from: l */
    public Set<String> f121324l = new HashSet();

    /* renamed from: m */
    public OnKeyListener f121325m;

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState */
    public static class MentionSavedState extends BaseSavedState {
        public static final Creator<MentionSavedState> CREATOR = new Creator<MentionSavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MentionSavedState[i];
            }

            /* renamed from: a */
            private static MentionSavedState m104466a(Parcel parcel) {
                try {
                    return new MentionSavedState(parcel);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m104466a(parcel);
            }
        };

        /* renamed from: a */
        public String f121326a;

        /* renamed from: b */
        public int f121327b;

        /* renamed from: c */
        public List<TextExtraStruct> f121328c;

        public MentionSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private MentionSavedState(Parcel parcel) {
            super(parcel);
            this.f121326a = parcel.readString();
            this.f121327b = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f121328c = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f121326a);
            parcel.writeInt(this.f121327b);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f121328c);
            parcel.writeBundle(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan */
    public static class MentionSpan extends ForegroundColorSpan {
        public static final Creator<MentionSpan> CREATOR = new Creator<MentionSpan>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MentionSpan[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MentionSpan(parcel);
            }
        };

        /* renamed from: a */
        public String f121329a;

        /* renamed from: b */
        public String f121330b;

        /* renamed from: c */
        public int f121331c;

        /* renamed from: d */
        public TextExtraStruct f121332d;

        /* renamed from: e */
        public String f121333e = "";

        /* renamed from: f */
        public int f121334f;

        public int describeContents() {
            return 0;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (this.f121329a != null) {
                i = this.f121329a.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            if (this.f121330b != null) {
                i2 = this.f121330b.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f121331c + this.f121334f) * 31;
            if (this.f121332d != null) {
                i3 = this.f121332d.hashCode();
            }
            return i5 + i3;
        }

        /* renamed from: a */
        public final void mo95692a(boolean z) {
            this.f121332d.setStarAtlasTag(z);
        }

        protected MentionSpan(Parcel parcel) {
            super(parcel);
            this.f121329a = parcel.readString();
            this.f121330b = parcel.readString();
            this.f121331c = parcel.readInt();
            this.f121332d = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MentionSpan)) {
                return false;
            }
            MentionSpan mentionSpan = (MentionSpan) obj;
            if (this.f121331c != mentionSpan.f121331c || this.f121334f != mentionSpan.f121334f) {
                return false;
            }
            if (this.f121329a == null ? mentionSpan.f121329a != null : !this.f121329a.equals(mentionSpan.f121329a)) {
                return false;
            }
            if (this.f121330b == null ? mentionSpan.f121330b != null : !this.f121330b.equals(mentionSpan.f121330b)) {
                return false;
            }
            if (this.f121332d != null) {
                return this.f121332d.equals(mentionSpan.f121332d);
            }
            if (mentionSpan.f121332d == null) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f121329a);
            parcel.writeString(this.f121330b);
            parcel.writeInt(this.f121331c);
            parcel.writeParcelable(this.f121332d, i);
        }

        public MentionSpan(int i, String str, String str2, int i2, String str3) {
            super(i);
            this.f121329a = str2;
            this.f121330b = str;
            this.f121331c = i2;
            this.f121332d = new TextExtraStruct();
            this.f121332d.setUserId(str2);
            this.f121332d.setType(i2);
            this.f121332d.setAtUserType(str3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$a */
    class C48210a extends InputConnectionWrapper {

        /* renamed from: b */
        private EditText f121336b;

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (MentionEditText.this.f121325m != null) {
                return MentionEditText.this.f121325m.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            }
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f121336b.getSelectionStart();
            C48215b a = MentionEditText.this.mo95668a(selectionStart, this.f121336b.getSelectionEnd());
            if (a == null) {
                MentionEditText.this.f121319g = false;
                return super.sendKeyEvent(keyEvent);
            } else if (MentionEditText.this.f121319g || selectionStart == a.f121340a) {
                MentionEditText.this.f121319g = false;
                return super.sendKeyEvent(keyEvent);
            } else {
                MentionEditText.this.f121319g = true;
                MentionEditText.this.f121320h = a;
                if (VERSION.SDK_INT >= 25) {
                    setSelection(a.f121340a, a.f121341b);
                } else {
                    setSelection(a.f121341b, a.f121340a);
                }
                return true;
            }
        }

        public final boolean commitText(CharSequence charSequence, int i) {
            try {
                return super.commitText(charSequence, i);
            } catch (NullPointerException unused) {
                return true;
            }
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            CharacterStyle[] characterStyleArr;
            if (i == 1 && i2 == 0) {
                Editable text = MentionEditText.this.getText();
                if (text != null && text.length() > 0) {
                    MentionEditText mentionEditText = MentionEditText.this;
                    int length = text.length();
                    int max = Math.max(mentionEditText.getSelectionStart() - i, 0);
                    int min = Math.min(mentionEditText.getSelectionEnd() + i2, length);
                    int i3 = max;
                    int i4 = min;
                    boolean z = false;
                    boolean z2 = false;
                    for (CharacterStyle characterStyle : (CharacterStyle[]) text.getSpans(0, length, CharacterStyle.class)) {
                        if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).f121331c != 1) {
                            int spanStart = text.getSpanStart(characterStyle);
                            int spanEnd = text.getSpanEnd(characterStyle);
                            if (!z && spanStart <= max && spanEnd > max) {
                                i3 = spanStart;
                                z = true;
                            }
                            if (!z2 && spanStart < min && spanEnd >= min) {
                                i4 = spanEnd;
                                z2 = true;
                            }
                            if (z && z2) {
                                break;
                            }
                        }
                    }
                    int[] iArr = {i3, i4};
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    if (i5 <= i6) {
                        int i7 = i5;
                        i5 = i6;
                        i6 = i7;
                    }
                    text.delete(i6, i5);
                }
                return false;
            }
            if (i < 0) {
                int i8 = -i2;
                i2 = -i;
                i = i8;
            }
            return super.deleteSurroundingText(i, i2);
        }

        C48210a(InputConnection inputConnection, boolean z, MentionEditText mentionEditText) {
            super(inputConnection, true);
            this.f121336b = mentionEditText;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$b */
    class C48211b implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C48211b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i) && MentionEditText.this.f121322j != null) {
                MentionEditText.this.f121322j.mo51903a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$c */
    public interface C48212c {
        /* renamed from: a */
        void mo51903a();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$d */
    static class C48213d implements Runnable {

        /* renamed from: a */
        private WeakReference<MentionEditText> f121338a;

        public final void run() {
            MentionEditText mentionEditText = (MentionEditText) this.f121338a.get();
            if (mentionEditText != null) {
                mentionEditText.setSelection(mentionEditText.getText().length());
            }
        }

        public C48213d(MentionEditText mentionEditText) {
            this.f121338a = new WeakReference<>(mentionEditText);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91793a(MentionSpan mentionSpan, C48215b bVar) {
    }

    /* access modifiers changed from: protected */
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    public int getMentionTextCount() {
        MentionSpan[] mentionText = getMentionText();
        if (mentionText == null) {
            return 0;
        }
        return mentionText.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo95672c() {
        for (TextWatcher removeTextChangedListener : this.f121323k) {
            super.removeTextChangedListener(removeTextChangedListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95673d() {
        for (TextWatcher addTextChangedListener : this.f121323k) {
            super.addTextChangedListener(addTextChangedListener);
        }
    }

    /* renamed from: a */
    private void mo91791a() {
        this.f121321i = new ArrayList(5);
        this.f121317e = -65536;
        addTextChangedListener(new C48211b());
        if (m104457a(getContext())) {
            if (VERSION.SDK_INT >= 17) {
                setTextAlignment(5);
            }
            setGravity(getGravity() | 8388611);
        }
    }

    /* renamed from: f */
    public final void mo95675f() {
        Editable text = getText();
        String obj = text.toString();
        int length = obj.length();
        int i = 0;
        while (i < length && obj.charAt(i) <= ' ') {
            i++;
        }
        int i2 = length;
        while (i2 > i && obj.charAt(i2 - 1) <= ' ') {
            i2--;
        }
        if (i < i2) {
            int i3 = i2 + 1;
            if (i3 < length) {
                text.delete(i3, length);
            }
            text.delete(0, i);
            return;
        }
        setText("");
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, text.length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new C48214a(text));
        return mentionSpanArr;
    }

    public Parcelable onSaveInstanceState() {
        MentionSavedState mentionSavedState = new MentionSavedState(super.onSaveInstanceState());
        mentionSavedState.f121326a = getText().toString();
        mentionSavedState.f121327b = Math.max(getSelectionEnd(), 0);
        mentionSavedState.f121328c = getCompatTextExtraStructList();
        return mentionSavedState;
    }

    /* renamed from: e */
    public final void mo95674e() {
        if (getStarAtlasExtraList() != null && getText() != null) {
            Iterator it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                if (textExtraStruct.isStarAtlasTag()) {
                    if (getText().charAt(textExtraStruct.getEnd()) == ' ') {
                        setText(getText().replace(textExtraStruct.getStart(), textExtraStruct.getEnd() + 1, ""));
                    } else {
                        setText(getText().replace(textExtraStruct.getStart(), textExtraStruct.getEnd(), ""));
                    }
                }
            }
        }
    }

    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        MentionSpan[] mentionText;
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.f121332d.isStarAtlasTag()) {
                mentionSpan.f121332d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f121332d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f121332d);
            }
        }
        return arrayList;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        MentionSpan[] mentionText;
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.f121331c == 0) {
                mentionSpan.f121332d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f121332d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f121332d);
            }
        }
        return arrayList;
    }

    public void setMentionTextColor(int i) {
        this.f121317e = i;
    }

    public void setOnMentionInputListener(C48212c cVar) {
        this.f121322j = cVar;
    }

    public void setStarAtlasMentionTextColor(int i) {
        this.f121318f = i;
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f121325m = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    private void setClip(String str) {
        ((ClipboardManager) getContext().getSystemService("clipboard")).setText(str);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        if (this.f121323k != null && textWatcher != null) {
            this.f121323k.add(textWatcher);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C48210a(onCreateInputConnection, true, this);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        if (this.f121323k != null && textWatcher != null) {
            this.f121323k.remove(textWatcher);
        }
    }

    public MentionEditText(Context context) {
        super(context);
        mo91791a();
    }

    /* renamed from: a */
    private static boolean m104457a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionSavedState mentionSavedState = (MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionSavedState.getSuperState());
        setText(mentionSavedState.f121326a);
        int min = Math.min(mentionSavedState.f121327b, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionSavedState.f121328c);
    }

    public boolean onTextContextMenuItem(int i) {
        String str = "";
        if (i == 16908320 || i == 16908321) {
            int length = getText().length();
            int i2 = 0;
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                length = Math.max(0, Math.max(selectionStart, selectionEnd));
                i2 = max;
            }
            str = getText().subSequence(i2, length).toString();
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908320 || i == 16908321) {
            setClip(str);
        }
        return onTextContextMenuItem;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        int i;
        this.f121319g = false;
        if (this.f121321i != null) {
            this.f121321i.clear();
        }
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            if (text != null && !TextUtils.isEmpty(text.toString())) {
                int length = text.length();
                for (TextExtraStruct textExtraStruct : list) {
                    if (textExtraStruct.isStarAtlasTag()) {
                        i = this.f121318f;
                    } else {
                        i = this.f121317e;
                    }
                    int i2 = i;
                    if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        MentionSpan mentionSpan = new MentionSpan(i2, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType());
                        mentionSpan.mo95692a(textExtraStruct.isStarAtlasTag());
                        if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                            String awemeId = textExtraStruct.getAwemeId();
                            mentionSpan.f121333e = awemeId;
                            mentionSpan.f121332d.setAwemeId(awemeId);
                        }
                        int subtype = textExtraStruct.getSubtype();
                        mentionSpan.f121334f = subtype;
                        mentionSpan.f121332d.setSubType(subtype);
                        text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.f121321i.add(new C48215b(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                    }
                }
            }
        }
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f121316a == null) {
            this.f121316a = new C48213d(this);
        }
        post(this.f121316a);
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo91791a();
    }

    /* renamed from: a */
    public final C48215b mo95668a(int i, int i2) {
        if (this.f121321i == null) {
            return null;
        }
        for (C48215b bVar : this.f121321i) {
            if (bVar.mo95707a(i, i2)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        C48215b bVar;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        super.onSelectionChanged(i, i2);
        if (getStarAtlasExtraList() != null && !TextUtils.isEmpty(getText())) {
            Iterator it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                if (i < textExtraStruct.getEnd() + 1) {
                    i4 = textExtraStruct.getEnd() + 1;
                } else {
                    i4 = i;
                }
                if (i2 < textExtraStruct.getEnd() + 1) {
                    i5 = textExtraStruct.getEnd() + 1;
                } else {
                    i5 = i2;
                }
                if (i4 > getText().length()) {
                    i4 = getText().length();
                }
                if (i5 > getText().length()) {
                    i5 = getText().length();
                }
                setSelection(i4, i5);
            }
        }
        if (this.f121320h != null) {
            C48215b bVar2 = this.f121320h;
            if ((bVar2.f121340a == i && bVar2.f121341b == i2) || (bVar2.f121340a == i2 && bVar2.f121341b == i)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        C48215b a = mo95668a(i, i2);
        if (a != null && a.f121341b == i2) {
            this.f121319g = false;
        }
        if (this.f121321i != null) {
            Iterator it2 = this.f121321i.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                bVar = (C48215b) it2.next();
                if ((i <= bVar.f121340a || i >= bVar.f121341b) && (i2 <= bVar.f121340a || i2 >= bVar.f121341b)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        bVar = null;
        if (bVar != null) {
            if (i == i2) {
                try {
                    if ((i - bVar.f121340a) - (bVar.f121341b - i) >= 0) {
                        i3 = bVar.f121341b;
                    } else {
                        i3 = bVar.f121340a;
                    }
                    setSelection(i3);
                } catch (IndexOutOfBoundsException unused) {
                }
                return;
            }
            if (i2 < bVar.f121341b) {
                setSelection(i, bVar.f121341b);
            }
            if (i > bVar.f121340a) {
                setSelection(bVar.f121340a, i2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo95669a(int i, String str, String str2) {
        return m104456a(0, str, str2, "", false);
    }

    public MentionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo91791a();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionSpan[] mentionText;
        this.f121319g = false;
        if (this.f121321i != null) {
            this.f121321i.clear();
        }
        Editable text = getText();
        if (text != null && !TextUtils.isEmpty(text.toString())) {
            for (MentionSpan mentionSpan : getMentionText()) {
                C48215b bVar = new C48215b(text.getSpanStart(mentionSpan), text.getSpanEnd(mentionSpan));
                if (!TextUtils.equals(text.subSequence(bVar.f121340a, bVar.f121341b).toString(), mentionSpan.f121330b)) {
                    text.removeSpan(mentionSpan);
                } else {
                    if (mentionSpan.f121331c == 0) {
                        this.f121321i.add(bVar);
                    }
                    mo91793a(mentionSpan, bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo95670a(int i, String str, String str2, boolean z) {
        return m104456a(1, str, str2, "", true);
    }

    /* renamed from: a */
    private boolean m104456a(int i, String str, String str2, String str3, boolean z) {
        int i2;
        String str4;
        int i3;
        int i4;
        int i5 = i;
        boolean z2 = z;
        if (z2) {
            i2 = 0;
        } else {
            i2 = getSelectionStart();
        }
        Editable text = getText();
        if (text == null) {
            return false;
        }
        if (i5 == 0) {
            str4 = "@";
        } else if (i5 == 1) {
            str4 = "#";
        } else {
            str4 = "";
        }
        String str5 = str4;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(str);
        SpannableString spannableString = new SpannableString(sb.toString());
        if (z2) {
            i3 = this.f121318f;
        } else {
            i3 = this.f121317e;
        }
        MentionSpan mentionSpan = new MentionSpan(i3, spannableString.toString(), str2, i, str3);
        spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
        mentionSpan.mo95692a(z2);
        MentionSpan[] mentionText = getMentionText();
        if (!z2 && mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableString);
            text.append(" ");
            return true;
        }
        int length = text.length();
        if (z2) {
            if (text.length() + spannableString.length() + 1 > 100) {
                if (spannableString.length() + 1 > text.length()) {
                    i4 = text.length();
                } else {
                    i4 = spannableString.length() + 1;
                }
                text.delete(0, i4);
            }
            text.insert(i2, " ");
            text.insert(i2, spannableString);
        } else if (i2 <= length && i2 >= 0) {
            if (i2 > 0) {
                int i6 = i2 - 1;
                if (TextUtils.equals(text.subSequence(i6, i2), str5)) {
                    text.delete(i6, i2);
                    i2--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, i2));
            text.insert(min, spannableString);
            text.insert(Math.min(min + spannableString.length(), text.length()), " ");
        }
        return true;
    }
}
