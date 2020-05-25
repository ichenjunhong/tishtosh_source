package com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.views.C29489a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.b.b */
public final class C29408b {

    /* renamed from: a */
    static Pattern f77021a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    private static boolean f77022b = false;

    /* renamed from: a */
    public static int m69341a(String str) {
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            while (f77021a.matcher(str).find()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m69342a(TextView textView) {
        int i;
        boolean z;
        if (!f77022b) {
            f77022b = true;
            CharSequence text = textView.getText();
            List b = m69345b(textView.getContext(), text.toString());
            int size = b.size();
            if (TextUtils.isEmpty(text) || size <= 0) {
                f77022b = false;
                return;
            }
            SpannableString spannableString = new SpannableString(text);
            C29489a[] aVarArr = (C29489a[]) spannableString.getSpans(0, text.length(), C29489a.class);
            if (aVarArr != null && aVarArr.length > 0) {
                if (aVarArr.length != size) {
                    z = true;
                } else {
                    z = false;
                }
                int length = aVarArr.length;
                boolean z2 = z;
                for (int i2 = 0; i2 < length; i2++) {
                    C29489a aVar = aVarArr[i2];
                    spannableString.removeSpan(aVar);
                    if (i2 < size && !z2 && !TextUtils.equals(aVar.mo59592a(), (CharSequence) b.get(i2))) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    f77022b = false;
                    return;
                }
            }
            boolean z3 = textView instanceof EditText;
            if (z3) {
                i = textView.getSelectionStart();
            } else {
                i = 0;
            }
            C29406a b2 = C29406a.m69329b(textView.getContext());
            Matcher matcher = f77021a.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String group = matcher.group();
                Drawable a = b2.mo59400a(textView.getContext(), group);
                if (a != null) {
                    int lineHeight = textView.getLineHeight();
                    a.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a.getIntrinsicWidth()) + 0.0f) / ((float) a.getIntrinsicHeight()))) + 0.5f), lineHeight);
                    spannableString.setSpan(new C29489a(a, Integer.valueOf(end - start), group), start, end, 33);
                    if (i > start && i < end && z3) {
                        ((EditText) textView).setSelection(end);
                    }
                }
            }
            if (z3) {
                Editable editableText = textView.getEditableText();
                if (editableText != null) {
                    editableText.replace(0, text.length(), spannableString);
                }
            } else {
                textView.setText(spannableString);
            }
            f77022b = false;
        }
    }

    /* renamed from: a */
    public static void m69343a(RemoteImageView remoteImageView, C29285a aVar) {
        C29406a.m69329b(remoteImageView.getContext()).mo59403a(remoteImageView, aVar);
    }

    /* renamed from: a */
    public static int m69340a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> b = m69345b(context, str);
        if (C9376b.m18558a((Collection<T>) b)) {
            return 0;
        }
        int i = 0;
        for (String length : b) {
            i += length.length();
        }
        if (str.length() > i) {
            return 2;
        }
        if (str.length() == i) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private static List<String> m69345b(Context context, String str) {
        if (context == null) {
            context = C11016e.m22312g();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f77021a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (C29406a.m69329b(context).mo59400a((Context) C11016e.m22312g(), group) != null) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String[] m69344a(String str, String str2, int i) {
        return str.split(str2, 2);
    }
}
