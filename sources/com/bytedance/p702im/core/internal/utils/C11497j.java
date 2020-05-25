package com.bytedance.p702im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.proto.Request;
import com.bytedance.p702im.core.proto.Response;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.Iterator;

/* renamed from: com.bytedance.im.core.internal.utils.j */
public final class C11497j {
    /* renamed from: a */
    private static String m23540a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("\t");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m23541a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i > 0 && 10 == sb.charAt(sb.length() - 1)) {
                sb.append(m23540a(i));
            }
            if (charAt != ',') {
                if (charAt != '[') {
                    if (charAt != ']') {
                        if (charAt != '{') {
                            if (charAt != '}') {
                                sb.append(charAt);
                            }
                        }
                    }
                    sb.append("\n");
                    i--;
                    sb.append(m23540a(i));
                    sb.append(charAt);
                }
                sb.append(charAt);
                sb.append("\n");
                i++;
            } else {
                sb.append(charAt);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m23542a(String str, Object obj) {
        try {
            if (C11165c.m22588a().mo20513b().f30139c) {
                if (obj != 0) {
                    String b = C11466d.f30773a.mo34889b(obj);
                    if (obj instanceof Request) {
                        Request request = (Request) obj;
                        if (!(request.body == null || request.body.send_message_body == null || TextUtils.isEmpty(request.body.send_message_body.content))) {
                            r8 = (C18085o) C11466d.f30773a.mo34884a(b, C18085o.class);
                            r8.mo35025e("body").mo35025e("send_message_body").mo35020a(C42311c.f106865i, "");
                            obj = r8;
                        }
                    }
                    if (obj instanceof Response) {
                        Response response = (Response) obj;
                        if (response.body != null) {
                            if (response.body.has_new_message_notify != null && response.body.has_new_message_notify.message != null && !TextUtils.isEmpty(response.body.has_new_message_notify.message.content)) {
                                r8 = (C18085o) C11466d.f30773a.mo34884a(b, C18085o.class);
                                r8.mo35025e("body").mo35025e("has_new_message_notify").mo35025e("message").mo35020a(C42311c.f106865i, "");
                                obj = r8;
                            } else if (response.body.messages_per_user_body != null && response.body.messages_per_user_body.messages != null && !response.body.messages_per_user_body.messages.isEmpty()) {
                                r8 = (C18085o) C11466d.f30773a.mo34884a(b, C18085o.class);
                                Iterator it = r8.mo35025e("body").mo35025e("messages_per_user_body").mo35024d("messages").iterator();
                                while (it.hasNext()) {
                                    ((C18085o) ((C18082l) it.next())).mo35020a(C42311c.f106865i, "");
                                }
                                obj = r8;
                            } else if (response.body.messages_per_user_init_v2_body != null && response.body.messages_per_user_init_v2_body.messages != null && !response.body.messages_per_user_init_v2_body.messages.isEmpty()) {
                                r8 = (C18085o) C11466d.f30773a.mo34884a(b, C18085o.class);
                                Iterator it2 = r8.mo35025e("body").mo35025e("messages_per_user_init_v2_body").mo35024d("messages").iterator();
                                while (it2.hasNext()) {
                                    ((C18085o) ((C18082l) it2.next())).mo35020a(C42311c.f106865i, "");
                                }
                                obj = r8;
                            } else if (!(response.body.messages_in_conversation_body == null || response.body.messages_in_conversation_body.messages == null || response.body.messages_in_conversation_body.messages.isEmpty())) {
                                r8 = (C18085o) C11466d.f30773a.mo34884a(b, C18085o.class);
                                Iterator it3 = r8.mo35025e("body").mo35025e("messages_in_conversation_body").mo35024d("messages").iterator();
                                while (it3.hasNext()) {
                                    ((C18085o) ((C18082l) it3.next())).mo35020a(C42311c.f106865i, "");
                                }
                                obj = r8;
                            }
                        }
                    }
                }
            }
            if (C11176d.f30167a != null) {
                C11176d.f30167a.mo20521a(obj);
            }
            if (C11467e.m23466a()) {
                if (!TextUtils.isEmpty(str)) {
                    C11467e.m23467b(str);
                }
                if (C11165c.m22588a().mo20513b().f30138b == 0) {
                    C11467e.m23467b(obj.toString());
                    return;
                }
                String b2 = C11466d.f30773a.mo34889b(obj);
                if (C11165c.m22588a().mo20513b().f30138b == 2) {
                    int length = b2.length();
                    StringBuilder sb = new StringBuilder(length);
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        char charAt = b2.charAt(i);
                        if (charAt == '\\') {
                            i = i2 + 1;
                            char charAt2 = b2.charAt(i2);
                            if (charAt2 == 'u') {
                                i2 = i;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < 4) {
                                    int i5 = i2 + 1;
                                    char charAt3 = b2.charAt(i2);
                                    switch (charAt3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = ((i4 << 4) + charAt3) - 48;
                                            break;
                                        default:
                                            switch (charAt3) {
                                                case 'A':
                                                case 'B':
                                                case 'C':
                                                case 'D':
                                                case BaseNotice.DONATION /*69*/:
                                                case 'F':
                                                    i4 = (((i4 << 4) + 10) + charAt3) - 65;
                                                    break;
                                                default:
                                                    switch (charAt3) {
                                                        case 'a':
                                                        case 'b':
                                                        case 'c':
                                                        case 'd':
                                                        case BaseNotice.HASHTAG /*101*/:
                                                        case 'f':
                                                            i4 = (((i4 << 4) + 10) + charAt3) - 97;
                                                            break;
                                                        default:
                                                            throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                                    }
                                            }
                                    }
                                    i3++;
                                    i2 = i5;
                                }
                                sb.append((char) i4);
                            } else {
                                if (charAt2 == 't') {
                                    charAt2 = 9;
                                } else if (charAt2 == 'r') {
                                    charAt2 = 13;
                                } else if (charAt2 == 'n') {
                                    charAt2 = 10;
                                } else if (charAt2 == 'f') {
                                    charAt2 = 12;
                                }
                                sb.append(charAt2);
                            }
                        } else {
                            sb.append(charAt);
                        }
                        i = i2;
                    }
                    b2 = m23541a(sb.toString());
                }
                while (b2.length() > 1996) {
                    C11467e.m23467b(b2.substring(0, 1996));
                    b2 = b2.substring(1996);
                }
                C11467e.m23467b(b2);
            }
        } catch (Throwable th) {
            C11467e.m23465a("PBLogUtils", th);
        }
    }
}
