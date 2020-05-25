package com.bytedance.p879t.p881b;

import com.bytedance.p879t.p882c.C13248c;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.t.b.b */
public final class C13234b implements Serializable, Cloneable {

    /* renamed from: a */
    private static final Pattern f34493a = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<C13239g> clickList;
    public String duration;
    public List<C13235c> iconList;

    /* renamed from: id */
    public String f34494id;
    public List<C13236d> mediaFileList;
    public List<C13237e> trackingEventList;

    public final long getDurationInMs() {
        if (C13248c.m26638a(this.duration)) {
            return 0;
        }
        Matcher matcher = f34493a.matcher(this.duration);
        if (!matcher.matches()) {
            return 0;
        }
        long millis = TimeUnit.HOURS.toMillis(Long.parseLong(matcher.group(1))) + 0 + TimeUnit.MINUTES.toMillis(Long.parseLong(matcher.group(2))) + TimeUnit.SECONDS.toMillis(Long.parseLong(matcher.group(3)));
        String group = matcher.group(5);
        if (!C13248c.m26638a(group)) {
            millis += Long.parseLong(group);
        }
        return millis;
    }
}
