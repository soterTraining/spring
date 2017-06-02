package teach.beandef;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailBox {

    private List<Envelope> envelopes;

    public List<Envelope> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(List<Envelope> envelopes) {
        this.envelopes = envelopes;
    }

    public void init() {
        System.out.println("Init instance");
    }

    public void destroy() {
        System.out.println("Destroy instance");
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("MailBox {\n");
        if (envelopes != null) {
            for (Envelope envelope : envelopes) {
                sb.append(envelope).append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
