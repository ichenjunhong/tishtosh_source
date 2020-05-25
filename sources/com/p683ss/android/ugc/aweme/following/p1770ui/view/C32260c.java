package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.text.Layout;
import android.text.NoCopySpan.Concrete;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.c */
public final class C32260c extends ScrollingMovementMethod {

    /* renamed from: b */
    static C32260c f84058b;

    /* renamed from: c */
    private static Object f84059c = new Concrete();

    /* renamed from: a */
    int f84060a;

    public final boolean canSelectArbitrarily() {
        return true;
    }

    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
    }

    public C32260c(int i) {
        this.f84060a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean down(TextView textView, Spannable spannable) {
        if (m74609a(3, textView, spannable)) {
            return true;
        }
        return super.down(textView, spannable);
    }

    public final void initialize(TextView textView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(f84059c);
    }

    /* access modifiers changed from: protected */
    public final boolean left(TextView textView, Spannable spannable) {
        if (m74609a(2, textView, spannable)) {
            return true;
        }
        return super.left(textView, spannable);
    }

    /* access modifiers changed from: protected */
    public final boolean right(TextView textView, Spannable spannable) {
        if (m74609a(3, textView, spannable)) {
            return true;
        }
        return super.right(textView, spannable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: up */
    public final boolean mo65386up(TextView textView, Spannable spannable) {
        if (m74609a(2, textView, spannable)) {
            return true;
        }
        return super.up(textView, spannable);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(y);
            if (lineForVertical == 0 && x < this.f84060a) {
                return false;
            }
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    /* renamed from: a */
    private static boolean m74609a(int i, TextView textView, Spannable spannable) {
        Layout layout = textView.getLayout();
        int totalPaddingTop = textView.getTotalPaddingTop() + textView.getTotalPaddingBottom();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(f84059c) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i2 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        switch (i) {
            case 1:
                if (min != max) {
                    ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(min, max, ClickableSpan.class);
                    if (clickableSpanArr2.length == 1) {
                        clickableSpanArr2[0].onClick(textView);
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                int i3 = -1;
                for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[i4]);
                    if ((spanEnd < max || min == max) && spanEnd > i3) {
                        i2 = spannable.getSpanStart(clickableSpanArr[i4]);
                        i3 = spanEnd;
                    }
                }
                if (i2 >= 0) {
                    Selection.setSelection(spannable, i3, i2);
                    return true;
                }
                break;
            case 3:
                int i5 = Integer.MAX_VALUE;
                int i6 = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < clickableSpanArr.length; i7++) {
                    int spanStart = spannable.getSpanStart(clickableSpanArr[i7]);
                    if ((spanStart > min || min == max) && spanStart < i6) {
                        i5 = spannable.getSpanEnd(clickableSpanArr[i7]);
                        i6 = spanStart;
                    }
                }
                if (i5 < Integer.MAX_VALUE) {
                    Selection.setSelection(spannable, i6, i5);
                    return true;
                }
                break;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean handleMovementKey(TextView textView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        if ((i == 23 || i == 66) && KeyEvent.metaStateHasNoModifiers(i2) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && m74609a(1, textView, spannable)) {
            return true;
        }
        return super.handleMovementKey(textView, spannable, i, i2, keyEvent);
    }
}
