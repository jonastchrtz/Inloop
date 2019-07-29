package Inloop.Exam.COOLIDEAS;

import java.util.List;

public class JIdea extends JContent {

    private List<JAttachment> attachments;

    private JState state;

    public JIdea(String title, String description) {
        super(title, description);
    }

    public void discuss(String text) {
    }

    public void evaluate(JValuation valuation) {
    }

    public void hold() {
    }

    public void release() {
    }

    public void decline() {
    }

    public boolean isDeclined() {
        return true;
    }

    public boolean isReleased() {
        return true;
    }

    public String getCurrentDiscussion() {
        return "Ja";
    }

    public JValuation getValuation() {
        return null;
    }

    public void addAttachements(JAttachment attachment) {
        attachments.add(attachment);
    }

    public List<JAttachment> getAttachments() {
        return attachments;
    }

    public boolean removeAttachements(JAttachment attachment) {
        return attachments.remove(attachment);
    }

    @Override
    public String toString() {
        return "Idea: " + getTitle() + "\n" + getDescription();
    }

    public abstract class JState {

        private String currentDiscussion;

        public String getCurrentDiscussion() {
            return currentDiscussion;
        }

        public void setCurrentDiscussion(String currentDiscussion) {
            this.currentDiscussion = currentDiscussion;
        }

        public void discuss(String text) {
        }

        public void evaluate(JValuation valuation) {
        }

        public void hold() {
        }

        public void release() {
        }

        public void decline() {
        }

        public JValuation getValuation() {
            return null;
        }

        public void setValuation(JValuation valuation) {
        }

    }

    public class Draft extends JState {

        public void hold() {
        }

    }

    public class OpenDraft extends JState {

        public void discuss(String text) {
        }

        public void evaluate(JValuation valuation) {
        }

        public void hold() {
        }

        public void release() {
        }

    }

    public class ApprovedIdea extends JState {

        public void release() {
        }

    }

    public class ReleasedIdea extends JState {
    }

    public class DeclinedIdea extends JState {
    }

}
