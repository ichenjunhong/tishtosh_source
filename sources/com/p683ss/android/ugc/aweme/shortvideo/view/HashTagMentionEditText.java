package com.p683ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.imported.C35520b;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.p2261w.C45554a;
import com.p683ss.android.ugc.aweme.shortvideo.p2261w.C45555b;
import com.p683ss.android.ugc.aweme.shortvideo.p2261w.C45556c;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45633h;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45377ad.C45378a;
import com.p683ss.android.ugc.aweme.utils.C47761ce;
import com.p683ss.android.ugc.aweme.video.hashtag.C48024a;
import com.p683ss.android.ugc.aweme.video.hashtag.C48024a.C48025a;
import com.p683ss.android.ugc.aweme.views.mention.C48215b;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText */
public class HashTagMentionEditText extends MentionEditText implements C45555b {

    /* renamed from: a */
    int f115058a;

    /* renamed from: b */
    C45554a f115059b;

    /* renamed from: c */
    C45556c f115060c;

    /* renamed from: d */
    int f115061d;

    /* renamed from: n */
    private String f115062n = "";

    /* renamed from: o */
    private boolean f115063o;

    /* renamed from: p */
    private int f115064p;

    /* renamed from: q */
    private int f115065q;

    /* renamed from: r */
    private List<InputFilter> f115066r;

    /* renamed from: s */
    private C45539b f115067s;

    /* renamed from: t */
    private HashSet<String> f115068t = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText$a */
    class C45538a implements TextWatcher {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C45538a() {
        }

        public final void afterTextChanged(Editable editable) {
            HashTagMentionEditText.this.post(new C45552i(this));
            HashTagMentionEditText.this.post(new C45553j(this));
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
            int i5 = 0;
            if (!(hashTagMentionEditText.f115058a == 0 || hashTagMentionEditText.f115059b == null)) {
                Editable text = hashTagMentionEditText.getText();
                C45554a[] aVarArr = (C45554a[]) text.getSpans(0, text.length(), C45554a.class);
                if (aVarArr == null) {
                    i4 = 0;
                } else {
                    i4 = aVarArr.length;
                }
                if (hashTagMentionEditText.f115058a == 1 && i4 == 0) {
                    hashTagMentionEditText.mo91791a();
                }
                hashTagMentionEditText.f115058a = i4;
            }
            HashTagMentionEditText hashTagMentionEditText2 = HashTagMentionEditText.this;
            if (hashTagMentionEditText2.f115061d != 0 && hashTagMentionEditText2.f115060c != null) {
                Editable text2 = hashTagMentionEditText2.getText();
                C45556c[] cVarArr = (C45556c[]) text2.getSpans(0, text2.length(), C45556c.class);
                if (cVarArr != null) {
                    i5 = cVarArr.length;
                }
                if (hashTagMentionEditText2.f115061d == 1 && i5 == 0) {
                    hashTagMentionEditText2.mo91791a();
                }
                hashTagMentionEditText2.f115061d = i5;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText$b */
    interface C45539b {
        /* renamed from: a */
        void mo91809a(int i, int i2);
    }

    public String getCreationId() {
        return this.f115062n;
    }

    public int getHookAtMaxWidth() {
        return this.f115064p;
    }

    public int getVideoType() {
        return this.f115065q;
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructListWithHashTag();
    }

    /* renamed from: b */
    public final void mo91795b() {
        m99189c(getText().toString());
    }

    /* renamed from: g */
    private void m99190g() {
        if (!C39618d.f101183x.mo74280a()) {
            addTextChangedListener(new C45538a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo91791a() {
        if (!this.f115063o) {
            if (getVideoType() == 1) {
                C26890h.m65011a("caption_delete", C23089d.m56640a().mo47829a("creation_id", this.f115062n).mo47829a("caption_type", "duet").f61491a);
            } else if (getVideoType() == 2) {
                C26890h.m65011a("caption_delete", C23089d.m56640a().mo47829a("creation_id", this.f115062n).mo47829a("caption_type", "react").f61491a);
            } else if (getVideoType() == 3) {
                C26890h.m65011a("caption_delete", C23089d.m56640a().mo47829a("creation_id", this.f115062n).mo47829a("caption_type", "comment_reply").f61491a);
            }
            this.f115063o = true;
        }
    }

    public List<TextExtraStruct> getTextExtraStructListWithHashTag() {
        MentionSpan[] mentionText;
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.f121331c == 0) {
                mentionSpan.f121332d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f121332d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f121332d);
            }
        }
        List<C48024a> b = m99186b(getText().toString());
        for (C48024a aVar : b) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setStarAtlasTag(m99183a(b.indexOf(aVar)));
            textExtraStruct.setHashTagName(aVar.f120702c.toLowerCase().replaceAll("#", ""));
            textExtraStruct.setStart(aVar.f120700a);
            textExtraStruct.setEnd(aVar.f120701b);
            arrayList.add(textExtraStruct);
            C39618d.f101170k.mo74205a(System.currentTimeMillis(), textExtraStruct.getHashTagName());
        }
        return arrayList;
    }

    public void setCreationId(String str) {
        this.f115062n = str;
    }

    public void setVideoType(int i) {
        this.f115065q = i;
    }

    public void setAVTextExtraList(List<AVTextExtraStruct> list) {
        setTextExtraList(C45633h.m99372a(list));
    }

    public HashTagMentionEditText(Context context) {
        super(context);
        m99190g();
    }

    /* renamed from: a */
    private boolean m99183a(int i) {
        MentionSpan[] mentionText = getMentionText();
        if (i < 0 || i >= mentionText.length) {
            return false;
        }
        return mentionText[i].f121332d.isStarAtlasTag();
    }

    public void setFixLengthInFront(final int i) {
        if (length() >= i) {
            mo91792a((InputFilter) new C35520b(i, C45551h.f115104a));
            this.f115067s = new C45539b() {

                /* renamed from: a */
                int f115069a = i;

                /* renamed from: a */
                public final void mo91809a(int i, int i2) {
                    if (!(i == 0 && i2 == HashTagMentionEditText.this.length())) {
                        if (i < i) {
                            HashTagMentionEditText.this.setSelection(this.f115069a);
                            return;
                        }
                        this.f115069a = i;
                    }
                }
            };
        }
    }

    /* renamed from: a */
    private boolean m99184a(Editable editable) {
        if (this.f115059b == null) {
            return false;
        }
        for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
            if (!TextUtils.isEmpty(mentionSpan.f121333e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m99185a(String str) {
        C43804f fVar = C43214dh.m94817a().f109289d;
        if (fVar == null) {
            return false;
        }
        String replaceAll = str.replaceAll("[@#]", "");
        List<String> list = fVar.f110932i;
        if (!C9376b.m18558a((Collection<T>) list) && list.contains(replaceAll)) {
            return true;
        }
        List<TaskMentionedUser> list2 = fVar.f110934k;
        if (!C9376b.m18558a((Collection<T>) list2)) {
            for (TaskMentionedUser nickname : list2) {
                if (Objects.equals(nickname.getNickname(), replaceAll)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m99188b(Editable editable) {
        if (this.f115060c == null) {
            return false;
        }
        for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
            if (mentionSpan.f121334f == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m99189c(String str) {
        C43804f fVar = C43214dh.m94817a().f109289d;
        if (fVar != null && !fVar.f110935l) {
            for (TaskMentionedUser nickname : fVar.f110934k) {
                if (!str.contains(nickname.getNickname())) {
                    C10691a.m21548c(C11010c.m22280a(), (int) R.string.gtv).mo19066a();
                    C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "10").mo47829a("task_id", fVar.f110924a).f61491a);
                    fVar.f110935l = true;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private List<C48024a> m99186b(String str) {
        boolean z;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (String str2 : C47761ce.m103387a(str, C45378a.m98927a())) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf >= 0) {
                Iterator it = this.f121324l.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (indexOf == str.indexOf((String) it.next(), i)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                int length = str2.length() + indexOf;
                if (!z) {
                    hashSet.add(new C48024a(str2, indexOf, length));
                }
                i = length;
            }
        }
        for (String str3 : this.f121324l) {
            int i2 = 0;
            while (i2 < str.length()) {
                int indexOf2 = str.indexOf(str3, i2);
                if (indexOf2 < 0) {
                    break;
                }
                int length2 = str3.length() + indexOf2;
                hashSet.add(new C48024a(str3, indexOf2, length2));
                i2 = length2;
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new C48025a());
        return arrayList;
    }

    /* renamed from: a */
    public final void mo91792a(InputFilter inputFilter) {
        if (this.f115066r == null) {
            this.f115066r = new ArrayList();
        }
        this.f115066r.add(inputFilter);
        setFilters((InputFilter[]) this.f115066r.toArray(new InputFilter[0]));
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        int i;
        super.setTextExtraList(list);
        Editable text = getText();
        if (text != null && !TextUtils.isEmpty(text.toString())) {
            int length = text.length();
            if (!C9376b.m18558a((Collection<T>) list)) {
                for (TextExtraStruct textExtraStruct : list) {
                    if (textExtraStruct != null) {
                        if (textExtraStruct.getType() == 1) {
                            if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                                if (textExtraStruct.isStarAtlasTag()) {
                                    i = this.f121318f;
                                } else {
                                    i = this.f121317e;
                                }
                                MentionSpan mentionSpan = new MentionSpan(i, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType());
                                mentionSpan.mo95692a(textExtraStruct.isStarAtlasTag());
                                text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                            }
                        }
                        if (textExtraStruct.getType() == 0 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()) && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                            if (textExtraStruct.getEnd() < length && text.charAt(textExtraStruct.getEnd()) == 160) {
                                text.replace(textExtraStruct.getEnd(), textExtraStruct.getEnd() + 1, " ");
                            }
                            if (textExtraStruct.getSubtype() == 1) {
                                this.f115059b = new C45554a(getContext(), this);
                                text.setSpan(this.f115059b, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                                this.f115058a = 1;
                            }
                            if (textExtraStruct.getSubtype() == 2) {
                                this.f115060c = new C45556c(getContext(), this);
                                this.f115060c.f115117b = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.dy5);
                                text.setSpan(this.f115060c, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                                this.f115061d = 1;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91794a(boolean z) {
        int i;
        if (getText() != null) {
            System.currentTimeMillis();
            mo95672c();
            ArrayList<C48215b> arrayList = new ArrayList<>();
            String obj = getText().toString();
            for (C48024a aVar : m99186b(obj)) {
                arrayList.add(new C48215b(aVar.f120700a, aVar.f120701b));
            }
            ArrayList<C48215b> arrayList2 = new ArrayList<>(arrayList);
            if (this.f121321i != null && !this.f121321i.isEmpty()) {
                arrayList2.addAll(this.f121321i);
            }
            Collections.sort(arrayList2, C45550g.f115103a);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C48215b bVar : arrayList) {
                if (z || bVar.mo95707a(getSelectionStart() - 1, getSelectionEnd() - 1) || bVar.mo95707a(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append(obj.substring(bVar.f121340a, bVar.f121341b));
                    boolean a = m99183a(arrayList.indexOf(bVar));
                    if (a) {
                        i = this.f121318f;
                    } else {
                        i = this.f121317e;
                    }
                    MentionSpan mentionSpan = new MentionSpan(i, spannableStringBuilder.toString(), "", 1, "");
                    mentionSpan.mo95692a(a);
                    m99187b(bVar.f121340a, bVar.f121341b);
                    getText().setSpan(mentionSpan, bVar.f121340a, bVar.f121341b, 33);
                    spannableStringBuilder.clear();
                    if (m99185a(mentionSpan.f121330b) && !this.f115068t.contains(mentionSpan.f121330b)) {
                        this.f121321i.add(bVar);
                    }
                }
            }
            int i2 = 0;
            int length = obj.length();
            for (C48215b bVar2 : arrayList2) {
                if (i2 >= 0 && bVar2.f121340a <= length && i2 <= bVar2.f121340a) {
                    m99187b(i2, bVar2.f121340a);
                    i2 = bVar2.f121341b;
                }
            }
            if (i2 <= length) {
                m99187b(i2, length);
            }
            Editable text = getText();
            if (text.length() != 0) {
                if (!m99184a(text)) {
                    text.removeSpan(this.f115059b);
                    this.f115059b = null;
                    mo91791a();
                }
                if (!m99188b(text)) {
                    text.removeSpan(this.f115060c);
                    this.f115060c = null;
                    mo91791a();
                }
            }
            mo95673d();
            StringBuilder sb = new StringBuilder("full: ");
            sb.append(z);
            sb.append("\n  text: ");
            sb.append(getText().toString());
            sb.append(" and se: ");
            sb.append(getSelectionEnd());
            C32458a.m75150b("MentionEditText", sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f115064p = MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99190g();
    }

    /* renamed from: b */
    private void m99187b(int i, int i2) {
        if (i < i2 && getText() != null) {
            for (MentionSpan removeSpan : (MentionSpan[]) getText().getSpans(i, i2, MentionSpan.class)) {
                getText().removeSpan(removeSpan);
            }
        }
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f115067s != null) {
            this.f115067s.mo91809a(i, i2);
        }
        if (getText() != null && i >= 0 && i2 >= 0 && i < i2) {
            String charSequence = getText().subSequence(i, i2).toString();
            C43804f fVar = C43214dh.m94817a().f109289d;
            if (fVar != null) {
                if (!C9376b.m18558a((Collection<T>) fVar.f110932i) && !fVar.f110933j) {
                    for (String contains : fVar.f110932i) {
                        if (charSequence.contains(contains)) {
                            C10691a.m21548c(C11010c.m22280a(), (int) R.string.gto).mo19066a();
                            C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "9").mo47829a("task_id", fVar.f110924a).f61491a);
                            fVar.f110933j = true;
                            return;
                        }
                    }
                }
                if (!C9376b.m18558a((Collection<T>) fVar.f110934k) && !fVar.f110935l) {
                    for (TaskMentionedUser nickname : fVar.f110934k) {
                        if (charSequence.contains(nickname.getNickname())) {
                            C10691a.m21548c(C11010c.m22280a(), (int) R.string.gtv).mo19066a();
                            C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "10").mo47829a("task_id", fVar.f110924a).f61491a);
                            fVar.f110935l = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91793a(MentionSpan mentionSpan, C48215b bVar) {
        if (!TextUtils.isEmpty(mentionSpan.f121330b) && !this.f115068t.contains(mentionSpan.f121330b)) {
            if (this.f121324l.contains(mentionSpan.f121330b) || m99185a(mentionSpan.f121330b)) {
                this.f121321i.add(bVar);
            }
        }
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99190g();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        super.onTextChanged(charSequence, i, i2, i3);
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        for (String str2 : this.f121324l) {
            if (!str.contains(str2)) {
                this.f115068t.add(str2);
            }
        }
        C43804f fVar = C43214dh.m94817a().f109289d;
        if (fVar != null) {
            if (!C9376b.m18558a((Collection<T>) fVar.f110932i)) {
                for (String str3 : fVar.f110932i) {
                    if (!str.contains(str3)) {
                        HashSet<String> hashSet = this.f115068t;
                        StringBuilder sb = new StringBuilder("#");
                        sb.append(str3);
                        hashSet.add(sb.toString());
                    }
                }
            }
            if (!C9376b.m18558a((Collection<T>) fVar.f110934k)) {
                for (TaskMentionedUser taskMentionedUser : fVar.f110934k) {
                    if (!str.contains(taskMentionedUser.getNickname())) {
                        HashSet<String> hashSet2 = this.f115068t;
                        StringBuilder sb2 = new StringBuilder("@");
                        sb2.append(taskMentionedUser.getNickname());
                        hashSet2.add(sb2.toString());
                    }
                }
            }
        }
    }
}
