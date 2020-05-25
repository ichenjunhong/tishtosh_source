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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry */
public final class com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry extends Message<com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry> ADAPTER = new C32851x4362ce33();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 104430)
    public final Boolean ins;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 111039888)
    public final Boolean twitter;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 186438880)
    public final Boolean youtube;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry, Builder> {
        public Boolean ins;
        public Boolean twitter;
        public Boolean youtube;

        public final com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry build() {
            return new com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry(this.twitter, this.ins, this.youtube, super.buildUnknownFields());
        }

        public final Builder ins(Boolean bool) {
            this.ins = bool;
            return this;
        }

        public final Builder twitter(Boolean bool) {
            this.twitter = bool;
            return this;
        }

        public final Builder youtube(Boolean bool) {
            this.youtube = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry$ProtoAdapter_com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry */
    static final class C32851x4362ce33 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry> {
        public final com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry redact(com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry) {
            return com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry;
        }

        public C32851x4362ce33() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry.class);
        }

        public final com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(111039888, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.twitter) + ProtoAdapter.BOOL.encodedSizeWithTag(104430, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.ins) + ProtoAdapter.BOOL.encodedSizeWithTag(186438880, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.youtube) + com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 111039888, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.twitter);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 104430, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.ins);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 186438880, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.youtube);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.unknownFields());
        }

        public final com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry decode(ProtoReader protoReader, com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry2 = (com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry.class, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry);
            if (com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry2 != null) {
                builder = com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 104430) {
                    builder.ins((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 111039888) {
                    builder.twitter((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 186438880) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.youtube((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final Boolean getIns() throws C10174a {
        if (this.ins != null) {
            return this.ins;
        }
        throw new C10174a();
    }

    public final Boolean getTwitter() throws C10174a {
        if (this.twitter != null) {
            return this.twitter;
        }
        throw new C10174a();
    }

    public final Boolean getYoutube() throws C10174a {
        if (this.youtube != null) {
            return this.youtube;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.twitter = this.twitter;
        builder.ins = this.ins;
        builder.youtube = this.youtube;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.twitter != null) {
            i = this.twitter.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.ins != null) {
            i2 = this.ins.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.youtube != null) {
            i4 = this.youtube.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.twitter != null) {
            sb.append(", twitter=");
            sb.append(this.twitter);
        }
        if (this.ins != null) {
            sb.append(", ins=");
            sb.append(this.ins);
        }
        if (this.youtube != null) {
            sb.append(", youtube=");
            sb.append(this.youtube);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry)) {
            return false;
        }
        com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry = (com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.unknownFields()) || !Internal.equals(this.twitter, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.twitter) || !Internal.equals(this.ins, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.ins) || !Internal.equals(this.youtube, com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry.youtube)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.twitter = bool;
        this.ins = bool2;
        this.youtube = bool3;
    }
}
