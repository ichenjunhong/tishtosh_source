package org.eclipse.mat.util;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

public final class MessageUtil {
    private static final MessageUtil instance = new MessageUtil();
    private final Properties props = new Properties();

    private MessageUtil() {
        try {
            this.props.load(MessageUtil.class.getClassLoader().getResourceAsStream("messages.properties"));
        } catch (IOException e) {
            throw new RuntimeException("MessageUtil initialization failed.", e);
        }
    }

    public static String format(String str, Object... objArr) {
        String str2 = (String) instance.props.get(str);
        if (str2 != null) {
            return MessageFormat.format(str2, objArr);
        }
        return str;
    }
}
