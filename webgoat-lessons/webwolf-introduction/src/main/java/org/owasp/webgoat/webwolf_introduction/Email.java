// Generated by delombok at Sun Nov 21 11:47:34 UTC 2021
package org.owasp.webgoat.webwolf_introduction;

import java.io.Serializable;

public class Email implements Serializable {
    private String contents;
    private String sender;
    private String title;
    private String recipient;

    @java.lang.SuppressWarnings("all")
    Email(final String contents, final String sender, final String title, final String recipient) {
        this.contents = contents;
        this.sender = sender;
        this.title = title;
        this.recipient = recipient;
    }


    @java.lang.SuppressWarnings("all")
    public static class EmailBuilder {
        @java.lang.SuppressWarnings("all")
        private String contents;
        @java.lang.SuppressWarnings("all")
        private String sender;
        @java.lang.SuppressWarnings("all")
        private String title;
        @java.lang.SuppressWarnings("all")
        private String recipient;

        @java.lang.SuppressWarnings("all")
        EmailBuilder() {
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public Email.EmailBuilder contents(final String contents) {
            this.contents = contents;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public Email.EmailBuilder sender(final String sender) {
            this.sender = sender;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public Email.EmailBuilder title(final String title) {
            this.title = title;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        public Email.EmailBuilder recipient(final String recipient) {
            this.recipient = recipient;
            return this;
        }

        @java.lang.SuppressWarnings("all")
        public Email build() {
            return new Email(this.contents, this.sender, this.title, this.recipient);
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public java.lang.String toString() {
            return "Email.EmailBuilder(contents=" + this.contents + ", sender=" + this.sender + ", title=" + this.title + ", recipient=" + this.recipient + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    public static Email.EmailBuilder builder() {
        return new Email.EmailBuilder();
    }

    @java.lang.SuppressWarnings("all")
    public String getContents() {
        return this.contents;
    }

    @java.lang.SuppressWarnings("all")
    public String getSender() {
        return this.sender;
    }

    @java.lang.SuppressWarnings("all")
    public String getTitle() {
        return this.title;
    }

    @java.lang.SuppressWarnings("all")
    public String getRecipient() {
        return this.recipient;
    }

    @java.lang.SuppressWarnings("all")
    public void setContents(final String contents) {
        this.contents = contents;
    }

    @java.lang.SuppressWarnings("all")
    public void setSender(final String sender) {
        this.sender = sender;
    }

    @java.lang.SuppressWarnings("all")
    public void setTitle(final String title) {
        this.title = title;
    }

    @java.lang.SuppressWarnings("all")
    public void setRecipient(final String recipient) {
        this.recipient = recipient;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Email)) return false;
        final Email other = (Email) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$contents = this.getContents();
        final java.lang.Object other$contents = other.getContents();
        if (this$contents == null ? other$contents != null : !this$contents.equals(other$contents)) return false;
        final java.lang.Object this$sender = this.getSender();
        final java.lang.Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final java.lang.Object this$title = this.getTitle();
        final java.lang.Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final java.lang.Object this$recipient = this.getRecipient();
        final java.lang.Object other$recipient = other.getRecipient();
        if (this$recipient == null ? other$recipient != null : !this$recipient.equals(other$recipient)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Email;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $contents = this.getContents();
        result = result * PRIME + ($contents == null ? 43 : $contents.hashCode());
        final java.lang.Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final java.lang.Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final java.lang.Object $recipient = this.getRecipient();
        result = result * PRIME + ($recipient == null ? 43 : $recipient.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Email(contents=" + this.getContents() + ", sender=" + this.getSender() + ", title=" + this.getTitle() + ", recipient=" + this.getRecipient() + ")";
    }
}
