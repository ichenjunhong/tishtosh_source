package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_account_login_InsRecoverSetting */
public final class com_ss_android_ugc_aweme_account_login_InsRecoverSetting extends Message<com_ss_android_ugc_aweme_account_login_InsRecoverSetting, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_account_login_InsRecoverSetting> ADAPTER = new C32823x10567213();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 266133273)
    public final Boolean forbid_ins_login;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 116079)
    public final String url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_account_login_InsRecoverSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_account_login_InsRecoverSetting, Builder> {
        public Boolean forbid_ins_login;
        public String url;

        public final com_ss_android_ugc_aweme_account_login_InsRecoverSetting build() {
            return new com_ss_android_ugc_aweme_account_login_InsRecoverSetting(this.url, this.forbid_ins_login, super.buildUnknownFields());
        }

        public final Builder forbid_ins_login(Boolean bool) {
            this.forbid_ins_login = bool;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_account_login_InsRecoverSetting$ProtoAdapter_com_ss_android_ugc_aweme_account_login_InsRecoverSetting */
    static final class C32823x10567213 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_account_login_InsRecoverSetting> {
        public final com_ss_android_ugc_aweme_account_login_InsRecoverSetting redact(com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting) {
            return com_ss_android_ugc_aweme_account_login_insrecoversetting;
        }

        public C32823x10567213() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_account_login_InsRecoverSetting.class);
        }

        public final com_ss_android_ugc_aweme_account_login_InsRecoverSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_account_login_InsRecoverSetting) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting) {
            return ProtoAdapter.STRING.encodedSizeWithTag(116079, com_ss_android_ugc_aweme_account_login_insrecoversetting.url) + ProtoAdapter.BOOL.encodedSizeWithTag(266133273, com_ss_android_ugc_aweme_account_login_insrecoversetting.forbid_ins_login) + com_ss_android_ugc_aweme_account_login_insrecoversetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 116079, com_ss_android_ugc_aweme_account_login_insrecoversetting.url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 266133273, com_ss_android_ugc_aweme_account_login_insrecoversetting.forbid_ins_login);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_account_login_insrecoversetting.unknownFields());
        }

        public final com_ss_android_ugc_aweme_account_login_InsRecoverSetting decode(ProtoReader protoReader, com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting2 = (com_ss_android_ugc_aweme_account_login_InsRecoverSetting) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_account_login_InsRecoverSetting.class, com_ss_android_ugc_aweme_account_login_insrecoversetting);
            if (com_ss_android_ugc_aweme_account_login_insrecoversetting2 != null) {
                builder = com_ss_android_ugc_aweme_account_login_insrecoversetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 116079) {
                    builder.url((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 266133273) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_account_login_insrecoversetting2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.forbid_ins_login((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final Boolean getForbidInsLogin() throws C10174a {
        if (this.forbid_ins_login != null) {
            return this.forbid_ins_login;
        }
        throw new C10174a();
    }

    public final String getUrl() throws C10174a {
        if (this.url != null) {
            return this.url;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.url = this.url;
        builder.forbid_ins_login = this.forbid_ins_login;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.url != null) {
            i = this.url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.forbid_ins_login != null) {
            i3 = this.forbid_ins_login.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.forbid_ins_login != null) {
            sb.append(", forbid_ins_login=");
            sb.append(this.forbid_ins_login);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_account_login_InsRecoverSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_account_login_InsRecoverSetting)) {
            return false;
        }
        com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting = (com_ss_android_ugc_aweme_account_login_InsRecoverSetting) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_account_login_insrecoversetting.unknownFields()) || !Internal.equals(this.url, com_ss_android_ugc_aweme_account_login_insrecoversetting.url) || !Internal.equals(this.forbid_ins_login, com_ss_android_ugc_aweme_account_login_insrecoversetting.forbid_ins_login)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_account_login_InsRecoverSetting(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_account_login_InsRecoverSetting(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.forbid_ins_login = bool;
    }
}
