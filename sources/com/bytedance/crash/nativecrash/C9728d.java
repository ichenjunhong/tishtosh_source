package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C9577e;
import com.bytedance.crash.p555n.C9697i;
import com.bytedance.crash.p555n.C9705m;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.nativecrash.d */
public final class C9728d {

    /* renamed from: i */
    private static final Pattern f26467i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j */
    private static final Pattern f26468j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k */
    private static final Pattern f26469k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l */
    private static final Pattern f26470l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m */
    private static final Pattern f26471m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    public String f26472a;

    /* renamed from: b */
    public String f26473b;

    /* renamed from: c */
    public String f26474c;

    /* renamed from: d */
    public String f26475d;

    /* renamed from: e */
    public String f26476e;

    /* renamed from: f */
    public String f26477f;

    /* renamed from: g */
    public Map<String, String> f26478g = new HashMap();

    /* renamed from: h */
    private String f26479h;

    /* renamed from: a */
    public final String mo17557a() {
        StringBuilder sb = new StringBuilder();
        if (this.f26476e != null) {
            sb.append(this.f26476e);
        }
        if (this.f26479h != null) {
            sb.append(this.f26479h);
        }
        if (this.f26477f != null) {
            sb.append(this.f26477f);
        }
        return sb.toString();
    }

    public C9728d(File file) {
        mo17558a(C9705m.m19399d(file));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17558a(File file) {
        if (file.exists() && file.length() != 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null || i >= 64) {
                            break;
                        }
                        if (this.f26472a == null && readLine.startsWith("pid: ")) {
                            Matcher matcher = f26467i.matcher(readLine);
                            if (matcher.find() && matcher.groupCount() == 4) {
                                this.f26472a = matcher.group(1);
                                this.f26473b = matcher.group(2);
                                this.f26475d = matcher.group(3);
                                this.f26474c = matcher.group(4);
                            }
                        } else if (this.f26476e == null && readLine.startsWith("signal ")) {
                            Matcher matcher2 = f26468j.matcher(readLine);
                            if (matcher2.find() && matcher2.groupCount() == 3) {
                                String replace = matcher2.group(1).replace(" ", "");
                                String replace2 = matcher2.group(2).replace(" ", "");
                                int indexOf = replace2.indexOf("frompid");
                                if (indexOf > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(replace2.substring(0, indexOf));
                                    sb.append(")");
                                    replace2 = sb.toString();
                                }
                                StringBuilder sb2 = new StringBuilder("Signal ");
                                sb2.append(replace);
                                sb2.append(", Code ");
                                sb2.append(replace2);
                                sb2.append("\n");
                                this.f26476e = sb2.toString();
                            }
                        } else if (this.f26479h == null && readLine.startsWith("Abort ")) {
                            Matcher matcher3 = f26469k.matcher(readLine);
                            if (matcher3.find() && matcher3.groupCount() == 1) {
                                StringBuilder sb3 = new StringBuilder("abort message: ");
                                sb3.append(matcher3.group(1));
                                sb3.append("\n");
                                this.f26479h = sb3.toString();
                            }
                        } else if (this.f26479h == null && readLine.startsWith("Crash ")) {
                            Matcher matcher4 = f26470l.matcher(readLine);
                            if (matcher4.find() && matcher4.groupCount() == 1) {
                                StringBuilder sb4 = new StringBuilder("crash message: ");
                                sb4.append(matcher4.group(1));
                                sb4.append("\n");
                                this.f26479h = sb4.toString();
                            }
                        } else if (this.f26477f != null || !readLine.startsWith("backtrace:")) {
                            if (this.f26478g.isEmpty() && readLine.startsWith("build id:")) {
                                while (true) {
                                    String readLine2 = bufferedReader2.readLine();
                                    if (readLine2 == null || !readLine2.contains("BuildId:")) {
                                        break;
                                    }
                                    Matcher matcher5 = f26471m.matcher(readLine2);
                                    if (matcher5.find()) {
                                        String group = matcher5.group(1);
                                        String group2 = matcher5.group(2);
                                        String group3 = matcher5.group(3);
                                        if (group.equals("data")) {
                                            this.f26478g.put(group2, group3);
                                        }
                                    }
                                }
                            }
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            while (true) {
                                String readLine3 = bufferedReader2.readLine();
                                if (readLine3 == null || !readLine3.startsWith("    #")) {
                                    i++;
                                    this.f26477f = sb5.toString();
                                } else {
                                    sb5.append(readLine3.substring(4));
                                    sb5.append(10);
                                }
                            }
                            i++;
                            this.f26477f = sb5.toString();
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        C9697i.m19370a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
                C9697i.m19370a((Closeable) bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                C9697i.m19370a((Closeable) bufferedReader);
            }
        }
    }
}
